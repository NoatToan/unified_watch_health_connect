package com.xiaomi.onetrack;

import android.text.TextUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes11.dex */
public class Configuration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13657b;
    private String c;
    private boolean d;
    private String e;
    private OneTrack.Mode f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f13658k;
    private boolean l;
    private String m;
    private boolean n;
    private String o;
    private OneTrack.IEventHook p;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f13659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f13660b;
        private String c;
        private boolean d;
        private String e;
        private String m;
        private String o;
        private OneTrack.Mode f = OneTrack.Mode.APP;
        private boolean g = true;
        private boolean h = true;
        private boolean i = true;
        private boolean j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f13661k = true;
        private boolean l = false;
        private boolean n = false;

        public Configuration build() {
            return new Configuration(this);
        }

        public Builder setAdEventAppId(String str) {
            this.o = str;
            return this;
        }

        public Builder setAppId(String str) {
            this.f13659a = str;
            return this;
        }

        public Builder setAutoTrackActivityAction(boolean z) {
            this.f13661k = z;
            return this;
        }

        public Builder setChannel(String str) {
            this.c = str;
            return this;
        }

        public Builder setExceptionCatcherEnable(boolean z) {
            this.j = z;
            return this;
        }

        @Deprecated
        public Builder setGAIDEnable(boolean z) {
            this.g = z;
            return this;
        }

        public Builder setImeiEnable(boolean z) {
            this.i = z;
            return this;
        }

        public Builder setImsiEnable(boolean z) {
            this.h = z;
            return this;
        }

        public Builder setInstanceId(String str) {
            this.m = str;
            return this;
        }

        public Builder setInternational(boolean z) {
            this.d = z;
            return this;
        }

        public Builder setMode(OneTrack.Mode mode) {
            this.f = mode;
            return this;
        }

        public Builder setOverrideMiuiRegionSetting(boolean z) {
            this.l = z;
            return this;
        }

        public Builder setPluginId(String str) {
            this.f13660b = str;
            return this;
        }

        public Builder setRegion(String str) {
            this.e = str;
            return this;
        }

        public Builder setUseCustomPrivacyPolicy(boolean z) {
            this.n = z;
            return this;
        }
    }

    private String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str) || str.length() <= 4) {
            sb.append(str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (i == 0 || i == 1 || i == str.length() - 2 || i == str.length() - 1) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append(Marker.ANY_MARKER);
                }
            }
        }
        return sb.toString();
    }

    public String getAdEventAppId() {
        return this.o;
    }

    public String getAppId() {
        return this.f13656a;
    }

    public String getChannel() {
        return this.c;
    }

    public String getInstanceId() {
        return this.m;
    }

    public OneTrack.Mode getMode() {
        return this.f;
    }

    public String getPluginId() {
        return this.f13657b;
    }

    public String getRegion() {
        return this.e;
    }

    public boolean isAutoTrackActivityAction() {
        return this.f13658k;
    }

    public boolean isExceptionCatcherEnable() {
        return this.j;
    }

    @Deprecated
    public boolean isGAIDEnable() {
        return this.g;
    }

    public boolean isIMEIEnable() {
        return this.i;
    }

    public boolean isIMSIEnable() {
        return this.h;
    }

    public boolean isInternational() {
        return this.d;
    }

    public boolean isOverrideMiuiRegionSetting() {
        return this.l;
    }

    public boolean isUseCustomPrivacyPolicy() {
        return this.n;
    }

    public String toString() {
        try {
            return "Configuration{appId='" + a(this.f13656a) + "', pluginId='" + a(this.f13657b) + "', channel='" + this.c + "', international=" + this.d + ", region='" + this.e + "', overrideMiuiRegionSetting=" + this.l + ", mode=" + this.f + ", GAIDEnable=" + this.g + ", IMSIEnable=" + this.h + ", IMEIEnable=" + this.i + ", ExceptionCatcherEnable=" + this.j + ", instanceId=" + a(this.m) + AbstractJsonLexerKt.END_OBJ;
        } catch (Exception unused) {
            return "";
        }
    }

    private Configuration(Builder builder) {
        this.f = OneTrack.Mode.APP;
        this.g = true;
        this.h = true;
        this.i = true;
        this.f13658k = true;
        this.l = false;
        this.n = false;
        this.f13656a = builder.f13659a;
        this.f13657b = builder.f13660b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.i = builder.i;
        this.h = builder.h;
        this.j = builder.j;
        this.f13658k = builder.f13661k;
        this.l = builder.l;
        this.m = builder.m;
        this.n = builder.n;
        this.o = builder.o;
    }
}
