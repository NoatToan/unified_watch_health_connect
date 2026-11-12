package com.xiaomi.mipush.sdk;

import android.text.TextUtils;
import com.xiaomi.push.service.module.PushChannelRegion;

/* JADX INFO: loaded from: classes22.dex */
public class PushConfiguration {
    private PushChannelRegion a;
    private boolean b;
    private boolean c;
    private boolean d;
    private String e;
    private boolean f;
    private boolean g;

    public static class PushConfigurationBuilder {
        private PushChannelRegion a;
        private boolean b;
        private boolean c;
        private boolean d;
        private String e;
        private boolean f;
        private boolean g;

        public PushConfiguration build() {
            return new PushConfiguration(this);
        }

        public PushConfigurationBuilder openCOSPush(boolean z) {
            this.f = z;
            return this;
        }

        public PushConfigurationBuilder openFCMPush(boolean z, String str) {
            this.d = z;
            if (z && TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("senderId can`t be empty if you open fcm!");
            }
            this.e = str;
            return this;
        }

        public PushConfigurationBuilder openFTOSPush(boolean z) {
            this.g = z;
            return this;
        }

        public PushConfigurationBuilder openHmsPush(boolean z) {
            this.c = z;
            return this;
        }

        public PushConfigurationBuilder region(PushChannelRegion pushChannelRegion) {
            this.a = pushChannelRegion;
            return this;
        }
    }

    public PushConfiguration() {
        this.a = PushChannelRegion.Global;
        this.c = false;
        this.d = false;
        this.f = false;
        this.g = false;
    }

    private PushConfiguration(PushConfigurationBuilder pushConfigurationBuilder) {
        this.a = pushConfigurationBuilder.a == null ? PushChannelRegion.Global : pushConfigurationBuilder.a;
        this.c = pushConfigurationBuilder.c;
        this.d = pushConfigurationBuilder.d;
        this.e = pushConfigurationBuilder.e;
        this.f = pushConfigurationBuilder.f;
        this.g = pushConfigurationBuilder.g;
    }

    private void a(boolean z) {
        this.f = z;
    }

    private void b(boolean z) {
        this.d = z;
    }

    private void c(boolean z) {
        this.g = z;
    }

    private void d(boolean z) {
        this.c = z;
    }

    private void e(PushChannelRegion pushChannelRegion) {
        this.a = pushChannelRegion;
    }

    public String getFCMSenderId() {
        return this.e;
    }

    public boolean getOpenCOSPush() {
        return this.f;
    }

    public boolean getOpenFCMPush() {
        return this.d;
    }

    public boolean getOpenFTOSPush() {
        return this.g;
    }

    public boolean getOpenHmsPush() {
        return this.c;
    }

    public PushChannelRegion getRegion() {
        return this.a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("PushConfiguration{");
        stringBuffer.append("Region:");
        PushChannelRegion pushChannelRegion = this.a;
        stringBuffer.append(pushChannelRegion == null ? "null" : pushChannelRegion.name());
        stringBuffer.append(",mOpenHmsPush:" + this.c);
        stringBuffer.append(",mOpenFCMPush:" + this.d);
        stringBuffer.append(",mOpenCOSPush:" + this.f);
        stringBuffer.append(",mOpenFTOSPush:" + this.g);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
