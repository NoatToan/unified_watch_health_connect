package com.huawei.openalliance.ad.inter.data;

import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class BiddingInfo implements Serializable {
    private static final long serialVersionUID = 30721000906L;
    private String cur;
    private String lurl;
    private String nurl;

    @com.huawei.openalliance.ad.annotations.a
    private Float price;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f19176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @com.huawei.openalliance.ad.annotations.a
        private Float f19177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f19178c;
        private String d;

        public String toString() {
            return "BiddingInfo{cur = " + this.f19176a + ", nurl = " + this.f19178c + ", lurl = " + this.d + '}';
        }

        public a setLurl(String str) {
            this.d = str;
            return this;
        }

        public a b(String str) {
            this.f19178c = str;
            return this;
        }

        public BiddingInfo a() {
            return new BiddingInfo(this);
        }

        public a a(String str) {
            this.f19176a = str;
            return this;
        }

        public a a(Float f) {
            this.f19177b = f;
            return this;
        }
    }

    public String toString() {
        return "BiddingInfo{cur = " + this.cur + ", nurl = " + this.nurl + ", lurl = " + this.lurl + '}';
    }

    public Float getPrice() {
        return this.price;
    }

    public String getNurl() {
        return this.nurl;
    }

    public String getLurl() {
        return this.lurl;
    }

    public String getCur() {
        return this.cur;
    }

    public boolean a() {
        return getPrice() == null && getCur() == null && getNurl() == null && getLurl() == null;
    }

    public BiddingInfo(a aVar) {
        if (aVar != null) {
            this.cur = aVar.f19176a;
            this.price = aVar.f19177b;
            this.nurl = aVar.f19178c;
            this.lurl = aVar.d;
        }
    }

    public BiddingInfo() {
    }
}
