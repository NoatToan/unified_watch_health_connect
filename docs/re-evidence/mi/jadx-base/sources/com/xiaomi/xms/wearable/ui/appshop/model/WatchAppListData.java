package com.xiaomi.xms.wearable.ui.appshop.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class WatchAppListData {

    public static class MultiWatchAppParam {
        public String country;
        public String model;
        public String package_names;

        public MultiWatchAppParam(String str, String str2) {
            this(str, str2, RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion());
        }

        public MultiWatchAppParam(String str, String str2, String str3) {
            this.model = str;
            this.package_names = str2;
            this.country = str3.toUpperCase();
        }
    }

    public static class WatchAppBean {
        public long app_id;
        public String app_name;
        public int app_version_code;
        public String change_log;
        public String description;
        public String developer_name;
        public String download_url;
        public String icon;
        public String introduction;
        public String package_name;
        public String record_number;
        public int size;
        public String support_client_v;
        public String support_firmware_v;
        public String type_name;
        public int u_time;

        @SerializedName("update_time")
        public String updateTime;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            WatchAppBean watchAppBean = (WatchAppBean) obj;
            return this.app_id == watchAppBean.app_id && this.app_version_code == watchAppBean.app_version_code && this.size == watchAppBean.size && this.u_time == watchAppBean.u_time && Objects.equals(this.icon, watchAppBean.icon) && Objects.equals(this.app_name, watchAppBean.app_name) && Objects.equals(this.package_name, watchAppBean.package_name) && Objects.equals(this.type_name, watchAppBean.type_name) && Objects.equals(this.support_client_v, watchAppBean.support_client_v) && Objects.equals(this.support_firmware_v, watchAppBean.support_firmware_v) && Objects.equals(this.download_url, watchAppBean.download_url) && Objects.equals(this.description, watchAppBean.description) && Objects.equals(this.introduction, watchAppBean.introduction) && Objects.equals(this.change_log, watchAppBean.change_log) && Objects.equals(this.updateTime, watchAppBean.updateTime);
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.app_id), this.icon, this.app_name, this.package_name, this.type_name, Integer.valueOf(this.app_version_code), this.support_client_v, this.support_firmware_v, this.download_url, Integer.valueOf(this.size), this.description, this.introduction, this.change_log, this.updateTime, Integer.valueOf(this.u_time));
        }

        public String toString() {
            return "WatchAppBean{app_id=" + this.app_id + ", icon='" + this.icon + "', app_name='" + this.app_name + "', package_name='" + this.package_name + "', type_name='" + this.type_name + "', app_version_code=" + this.app_version_code + ", support_client_v='" + this.support_client_v + "', support_firmware_v='" + this.support_firmware_v + "', download_url='" + this.download_url + "', size=" + this.size + ", description='" + this.description + "', introduction='" + this.introduction + "', change_log='" + this.change_log + "', updateTime='" + this.updateTime + "', u_time=" + this.u_time + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class WatchAppListBean {

        @SerializedName(RouteRequest.KEY_NEXT_KEY)
        public String nextKey;

        @SerializedName("watch_app_list")
        public List<WatchAppBean> watchAppList;

        public String toString() {
            return "WatchAppListBean{watchAppList=" + this.watchAppList + ", nextKey='" + this.nextKey + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class WatchAppListParam {
        public int count;
        public String country;
        public String model;
        public String next_key;

        public WatchAppListParam(String str, String str2, int i) {
            this(str, str2, i, RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry());
        }

        public WatchAppListParam(String str, String str2, int i, String str3) {
            this.model = str;
            this.next_key = str2;
            this.count = i;
            this.country = str3.toUpperCase();
        }
    }
}
