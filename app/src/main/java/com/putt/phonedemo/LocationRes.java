package com.putt.phonedemo;

public class LocationRes {

    /**
     * status : 0
     * msg : ok
     * result : {"province":"浙江","city":"杭州","company":"中国移动","cardtype":"GSM"}
     */

    private int status;
    private String msg;
    private ResultBean result;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        @Override
        public String toString() {
            return "province='" + province + '\'' +
                    ", city='" + city + '\'' +
                    ", company='" + company + '\'' +
                    ", cardtype='" + cardtype + '\'';
        }

        /**
         * province : 浙江
         * city : 杭州
         * company : 中国移动
         * cardtype : GSM
         */

        private String province;
        private String city;
        private String company;
        private String cardtype;

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getCardtype() {
            return cardtype;
        }

        public void setCardtype(String cardtype) {
            this.cardtype = cardtype;
        }
    }
}
