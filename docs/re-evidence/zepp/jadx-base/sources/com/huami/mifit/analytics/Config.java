package com.huami.mifit.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.mifit.analytics.Config;
import com.huami.mifit.analytics.function.BooleanSupplier;
import com.huami.mifit.analytics.function.Function;

/* JADX INFO: loaded from: classes11.dex */
public class Config {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private Context i;
    private boolean j;
    private String k;

    @Deprecated
    private BooleanSupplier l;
    private Function<String, String> m;
    private Function<String, String> n;
    private Function<String, String> o;

    public static class Builder {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private final Context i;
        private String k;
        private Function<String, String> m;
        private Function<String, String> n;
        private Function<String, String> o;
        private boolean j = false;
        private BooleanSupplier l = new BooleanSupplier() { // from class: fy0
            @Override // com.huami.mifit.analytics.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return Config.Builder.c();
            }
        };

        public Builder(@NonNull Context context) {
            this.i = context;
        }

        private static <T> T b(T t, String str) {
            if (t != null) {
                return t;
            }
            throw new IllegalArgumentException(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean c() {
            return false;
        }

        public Config build() {
            Config config = new Config();
            config.i = ((Context) b(this.i, "未提供Context对象")).getApplicationContext();
            config.k = (String) b(this.k, "未设置渠道");
            config.j = this.j;
            config.l = (BooleanSupplier) b(this.l, "未设置海外的判断逻辑");
            config.a = this.a;
            config.b = this.b;
            config.c = this.c;
            config.d = this.d;
            config.e = this.e;
            config.f = this.f;
            config.g = this.g;
            config.h = this.h;
            config.m = (Function) b(this.m, "未设置华米统计匿名追踪器数据上传域名映射器");
            config.n = (Function) b(this.n, "未设置华米统计实名追踪器数据上传域名映射器");
            config.o = (Function) b(this.o, "未设置华米统计实名实时追踪器数据上传域名映射器");
            return config;
        }

        public Builder setChannel(@NonNull String str) {
            this.k = str;
            return this;
        }

        public Builder setDebug(boolean z) {
            this.j = z;
            return this;
        }

        public Builder setHmStatAnonymousTrackerUploadHostMapper(Function<String, String> function) {
            this.m = function;
            return this;
        }

        public Builder setHmStatIdentifiedTrackerUploadHostMapper(Function<String, String> function) {
            this.n = function;
            return this;
        }

        public Builder setHmStatRealTimeTrackUploadHostMapper(Function<String, String> function) {
            this.o = function;
            return this;
        }

        public Builder setHuamiAnonymousAppIdForProduction(@Nullable String str) {
            this.d = str;
            return this;
        }

        public Builder setHuamiAnonymousAppIdForStaging(@Nullable String str) {
            this.c = str;
            return this;
        }

        public Builder setHuamiIdentifiedAppIdForProduction(@Nullable String str) {
            this.f = str;
            return this;
        }

        public Builder setHuamiIdentifiedAppIdForStaging(@Nullable String str) {
            this.e = str;
            return this;
        }

        public Builder setHuamiRealTimeAppIdForProduction(@Nullable String str) {
            this.h = str;
            return this;
        }

        public Builder setHuamiRealTimeAppIdForStaging(@Nullable String str) {
            this.g = str;
            return this;
        }

        @Deprecated
        public Builder setIsOverseaSupplier(@NonNull BooleanSupplier booleanSupplier) {
            this.l = booleanSupplier;
            return this;
        }

        public Builder setXiaomiAppId(@Nullable String str) {
            this.a = str;
            return this;
        }

        public Builder setXiaomiAppKey(@Nullable String str) {
            this.b = str;
            return this;
        }
    }

    public String getChannel() {
        return this.k;
    }

    public Context getContext() {
        return this.i;
    }

    public Function<String, String> getHmStatAnonymousTrackerUploadHostMapper() {
        return this.m;
    }

    public Function<String, String> getHmStatIdentifiedTrackerUploadHostMapper() {
        return this.n;
    }

    public Function<String, String> getHmStatRealTimeTrackerUploadHostMapper() {
        return this.o;
    }

    public String getHuamiAnonymousAppIdForProduction() {
        return this.d;
    }

    public String getHuamiAnonymousAppIdForStaging() {
        return this.c;
    }

    public String getHuamiIdentifiedAppIdForProduction() {
        return this.f;
    }

    public String getHuamiIdentifiedAppIdForStaging() {
        return this.e;
    }

    public String getHuamiRealTimeAppIdForProduction() {
        return this.h;
    }

    public String getHuamiRealTimeAppIdForStaging() {
        return this.g;
    }

    @Deprecated
    public BooleanSupplier getIsOverseaSupplier() {
        return this.l;
    }

    public String getXiaomiAppId() {
        return this.a;
    }

    public String getXiaomiAppKey() {
        return this.b;
    }

    public boolean isDebug() {
        return this.j;
    }
}
