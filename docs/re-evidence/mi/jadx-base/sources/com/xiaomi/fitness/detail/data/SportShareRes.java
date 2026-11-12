package com.xiaomi.fitness.detail.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoBeanKt;
import com.xiaomi.smarthome.framework.api.UserConfig;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class SportShareRes {
    public List<ConfigInfo> calorie;
    public List<ConfigInfo> road;
    public List<ConfigInfo> roadDesign;
    public SportModelBean sportModel;

    public static class ConfigInfo {
        public String brief;
        public String pic;

        public String toString() {
            return "ConfigInfo{brief='" + this.brief + "', pic='" + this.pic + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class SportModelBean {

        @SerializedName(UserConfig.KEY_CAMERA_LIST_SORT_ORDER)
        public List<ConfigInfo> _20;

        @SerializedName("21")
        public List<ConfigInfo> _21;

        @SerializedName("22")
        public List<ConfigInfo> _22;

        @SerializedName("23")
        public List<ConfigInfo> _23;

        @SerializedName("24")
        public List<ConfigInfo> _24;

        @SerializedName("25")
        public List<ConfigInfo> _25;

        @SerializedName("26")
        public List<ConfigInfo> _26;

        @SerializedName("27")
        public List<ConfigInfo> _27;

        @SerializedName("28")
        public List<ConfigInfo> _28;

        @SerializedName("29")
        public List<ConfigInfo> _29;

        @SerializedName("30")
        public List<ConfigInfo> _30;

        @SerializedName(CardInfoBeanKt.sStatusDisableCard)
        public List<ConfigInfo> _31;

        @SerializedName("32")
        public List<ConfigInfo> _32;

        @SerializedName("33")
        public List<ConfigInfo> _33;

        @SerializedName("34")
        public List<ConfigInfo> _34;

        @SerializedName("35")
        public List<ConfigInfo> _35;

        @SerializedName("36")
        public List<ConfigInfo> _36;

        @SerializedName("37")
        public List<ConfigInfo> _37;
    }
}
