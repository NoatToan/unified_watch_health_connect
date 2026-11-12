package com.huawei.watchface.mvp.model.datatype;

import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public class WatchFaceColorFilterBean {
    private int type;
    private List<WatchFaceBackgroundBean> watchFaceBgArr;

    public class WatchFaceBackgroundBean {
        private String base64;
        private String colorStr;
        private String fileName;
        private String filePath;
        private int key;
        private String resultPath;
        private String sourceUrl;

        public WatchFaceBackgroundBean(WatchFaceColorFilterBean watchFaceColorFilterBean) {
        }

        public String getBase64() {
            return this.base64;
        }

        public String getColorStr() {
            return this.colorStr;
        }

        public String getFileName() {
            return this.fileName;
        }

        public String getFilePath() {
            return this.filePath;
        }

        public int getKey() {
            return this.key;
        }

        public String getResultPath() {
            return this.resultPath;
        }

        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public void setBase64(String str) {
            this.base64 = str;
        }

        public void setColorStr(String str) {
            this.colorStr = str;
        }

        public void setFileName(String str) {
            this.fileName = str;
        }

        public void setFilePath(String str) {
            this.filePath = str;
        }

        public void setKey(int i) {
            this.key = i;
        }

        public void setResultPath(String str) {
            this.resultPath = str;
        }

        public void setSourceUrl(String str) {
            this.sourceUrl = str;
        }
    }

    public int getType() {
        return this.type;
    }

    public List<WatchFaceBackgroundBean> getWatchFaceBgArr() {
        return this.watchFaceBgArr;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setWatchFaceBgArr(List<WatchFaceBackgroundBean> list) {
        this.watchFaceBgArr = list;
    }
}
