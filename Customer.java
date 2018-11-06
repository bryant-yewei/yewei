package com.itheima.domain;

import javax.persistence.*;

/**
 * 客户实体类
 * 编写ORM注解映射： 导包都是：javax.persistence下的
 */
@Entity //标注一个类是实体类
@Table(name = "cst_customer")//映射表名
public class Customer {

    @Id//标注字段是主键
    @Column(name = "cust_id")//映射字段
    @GeneratedValue(strategy = GenerationType.IDENTITY)//编写主键的生成策略 :mysql
    /*@GeneratedValue(strategy = GenerationType.SEQUENCE ,
            //引用生成器名称
            generator = "customer_id")//Oracle
    @SequenceGenerator(
            //生成器名称
            name="customer_id",
            //指定数据库的序列的名称
            sequenceName = "seq_customer_id",
            //指定初始值
            initialValue = 1,
            //步长：每次增长量
            allocationSize = 1
    )*/
    //适用于没有主键生成策略的数据库： 例如 access数据库
    //@GeneratedValue(strategy = GenerationType.TABLE)
    //官方：根据环境选择最优的策略，
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long custId;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_source")
    private String custSource;

    @Column(name = "cust_industry")
    private String custIndustry;

    @Column(name = "cust_level")
    private String custLevel;

    @Column(name = "cust_phone")
    private String custPhone;

    @Column(name = "cust_address")
    private String custAddress;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custSource='" + custSource + '\'' +
                ", custIndustry='" + custIndustry + '\'' +
                ", custLevel='" + custLevel + '\'' +
                ", custPhone='" + custPhone + '\'' +
                ", custAddress='" + custAddress + '\'' +
                '}';
    }
}
