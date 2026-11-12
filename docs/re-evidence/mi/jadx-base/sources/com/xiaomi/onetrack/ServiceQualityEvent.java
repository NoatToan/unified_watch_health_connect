package com.xiaomi.onetrack;

import android.text.TextUtils;
import com.xiaomi.passport.ui.internal.SNSAuthProvider;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ServiceQualityEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13684b;
    private Integer c;
    private String d;
    private String e;
    private Integer f;
    private Integer g;
    private String h;
    private String i;
    private Integer j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Long f13685k;
    private Long l;
    private Long m;
    private Long n;
    private Long o;
    private Long p;
    private Long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Long f13686r;
    private String s;
    private String t;
    private Map<String, Object> u;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f13687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f13688b;
        private Integer c;
        private String d;
        private String e;
        private Integer f;
        private Integer g;
        private String h;
        private ResultType i;
        private Integer j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Long f13689k;
        private Long l;
        private Long m;
        private Long n;
        private Long o;
        private Long p;
        private Long q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Long f13690r;
        private OneTrack.NetType s;
        private String t;
        private Map<String, Object> u;

        public ServiceQualityEvent build() {
            return new ServiceQualityEvent(this);
        }

        public Builder setDnsLookupTime(Long l) {
            this.f13689k = l;
            return this;
        }

        public Builder setDuration(Long l) {
            this.q = l;
            return this;
        }

        public Builder setExceptionTag(String str) {
            this.h = str;
            return this;
        }

        public Builder setExtraParams(Map<String, Object> map) {
            this.u = map;
            return this;
        }

        public Builder setHandshakeTime(Long l) {
            this.m = l;
            return this;
        }

        public Builder setHost(String str) {
            this.f13688b = str;
            return this;
        }

        public Builder setIps(String... strArr) {
            if (strArr != null) {
                this.e = TextUtils.join(",", strArr);
            }
            return this;
        }

        public Builder setNetSdkVersion(String str) {
            this.t = str;
            return this;
        }

        public Builder setPath(String str) {
            this.d = str;
            return this;
        }

        public Builder setPort(Integer num) {
            this.c = num;
            return this;
        }

        public Builder setReceiveAllByteTime(Long l) {
            this.p = l;
            return this;
        }

        public Builder setReceiveFirstByteTime(Long l) {
            this.o = l;
            return this;
        }

        public Builder setRequestDataSendTime(Long l) {
            this.n = l;
            return this;
        }

        public Builder setRequestNetType(OneTrack.NetType netType) {
            this.s = netType;
            return this;
        }

        public Builder setRequestTimestamp(Long l) {
            this.f13690r = l;
            return this;
        }

        public Builder setResponseCode(Integer num) {
            this.f = num;
            return this;
        }

        public Builder setResultType(ResultType resultType) {
            this.i = resultType;
            return this;
        }

        public Builder setRetryCount(Integer num) {
            this.j = num;
            return this;
        }

        public Builder setScheme(String str) {
            this.f13687a = str;
            return this;
        }

        public Builder setStatusCode(Integer num) {
            this.g = num;
            return this;
        }

        public Builder setTcpConnectTime(Long l) {
            this.l = l;
            return this;
        }
    }

    public enum ResultType {
        SUCCESS(SNSAuthProvider.VALUE_SNS_OK),
        FAILED("failed"),
        TIMEOUT("timeout");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f13692a;

        ResultType(String str) {
            this.f13692a = str;
        }

        public String getResultType() {
            return this.f13692a;
        }
    }

    public Long getDnsLookupTime() {
        return this.f13685k;
    }

    public Long getDuration() {
        return this.q;
    }

    public String getExceptionTag() {
        return this.h;
    }

    public Map<String, Object> getExtraParams() {
        return this.u;
    }

    public Long getHandshakeTime() {
        return this.m;
    }

    public String getHost() {
        return this.f13684b;
    }

    public String getIps() {
        return this.e;
    }

    public String getNetSdkVersion() {
        return this.t;
    }

    public String getPath() {
        return this.d;
    }

    public Integer getPort() {
        return this.c;
    }

    public Long getReceiveAllByteTime() {
        return this.p;
    }

    public Long getReceiveFirstByteTime() {
        return this.o;
    }

    public Long getRequestDataSendTime() {
        return this.n;
    }

    public String getRequestNetType() {
        return this.s;
    }

    public Long getRequestTimestamp() {
        return this.f13686r;
    }

    public Integer getResponseCode() {
        return this.f;
    }

    public String getResultType() {
        return this.i;
    }

    public Integer getRetryCount() {
        return this.j;
    }

    public String getScheme() {
        return this.f13683a;
    }

    public Integer getStatusCode() {
        return this.g;
    }

    public Long getTcpConnectTime() {
        return this.l;
    }

    private ServiceQualityEvent(Builder builder) {
        this.f13683a = builder.f13687a;
        this.f13684b = builder.f13688b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i != null ? builder.i.getResultType() : null;
        this.j = builder.j;
        this.f13685k = builder.f13689k;
        this.l = builder.l;
        this.m = builder.m;
        this.o = builder.o;
        this.p = builder.p;
        this.f13686r = builder.f13690r;
        this.s = builder.s != null ? builder.s.toString() : null;
        this.n = builder.n;
        this.q = builder.q;
        this.t = builder.t;
        this.u = builder.u;
    }
}
