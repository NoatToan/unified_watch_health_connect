package com.xiaomi.fitness.watch.face.data;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class FaceIconZipRes extends FaceResp {
    public DataBean data;

    public static class DataBean {
        public String config;
        public String config_hash;
        public int version;
    }

    public boolean valid() {
        DataBean dataBean = this.data;
        return (dataBean == null || TextUtils.isEmpty(dataBean.config) || TextUtils.isEmpty(this.data.config_hash)) ? false : true;
    }
}
