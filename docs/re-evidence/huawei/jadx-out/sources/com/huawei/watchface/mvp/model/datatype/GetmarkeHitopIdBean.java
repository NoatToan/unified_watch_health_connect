package com.huawei.watchface.mvp.model.datatype;

import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public class GetmarkeHitopIdBean {
    private List<ListBean> list;
    private String resultCode;
    private String resultInfo;

    public static class ListBean {
        private String author;
        private String description;
        private String designer;
        private String downloadCount;
        private String hitopId;
        private String id;
        private String label;
        private String price;
        private String productId;
        private String recommendKeyword;
        private String type;
        private String version;

        public String getAuthor() {
            return this.author;
        }

        public String getDescription() {
            return this.description;
        }

        public String getDesigner() {
            return this.designer;
        }

        public String getDownloadCount() {
            return this.downloadCount;
        }

        public String getHitopId() {
            return this.hitopId;
        }

        public String getId() {
            return this.id;
        }

        public String getLabel() {
            return this.label;
        }

        public String getPrice() {
            return this.price;
        }

        public String getProductId() {
            return this.productId;
        }

        public String getRecommendKeyword() {
            return this.recommendKeyword;
        }

        public String getType() {
            return this.type;
        }

        public String getVersion() {
            return this.version;
        }

        public void setAuthor(String str) {
            this.author = str;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setDesigner(String str) {
            this.designer = str;
        }

        public void setDownloadCount(String str) {
            this.downloadCount = str;
        }

        public void setHitopId(String str) {
            this.hitopId = str;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setLabel(String str) {
            this.label = str;
        }

        public void setPrice(String str) {
            this.price = str;
        }

        public void setProductId(String str) {
            this.productId = str;
        }

        public void setRecommendKeyword(String str) {
            this.recommendKeyword = str;
        }

        public void setType(String str) {
            this.type = str;
        }

        public void setVersion(String str) {
            this.version = str;
        }
    }

    public List<ListBean> getList() {
        return this.list;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public String getResultInfo() {
        return this.resultInfo;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public void setResultInfo(String str) {
        this.resultInfo = str;
    }
}
