package com.huawei.openalliance.ad.inter.data;

import com.huawei.openalliance.ad.utils.dg;

/* JADX INFO: loaded from: classes41.dex */
public class ShakeClickReportInfo {
    private Float acc;
    private boolean canReportClick;
    private Integer cannotReportReason;
    private MaterialClickInfo clickInfo;
    private String degreeDetail;
    private Integer interactiveLogic;
    private Integer limitAcc;
    private Integer limitDegree;
    private String shakeAngle;
    private Integer sld;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f19198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MaterialClickInfo f19199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f19200c;
        private String d;
        private Integer e;
        private Integer f;
        private String g;
        private Float h;
        private Integer i;

        public a d(Integer num) {
            this.f = num;
            return this;
        }

        public a c(Integer num) {
            this.e = num;
            return this;
        }

        public a b(String str) {
            this.g = str;
            return this;
        }

        public a b(Integer num) {
            this.f19200c = num;
            return this;
        }

        public ShakeClickReportInfo a() {
            return new ShakeClickReportInfo(this);
        }

        public a a(boolean z) {
            this.f19198a = z;
            return this;
        }

        public a a(String str) {
            this.d = str;
            return this;
        }

        public a a(Integer num) {
            this.i = num;
            return this;
        }

        public a a(Float f) {
            this.h = f;
            return this;
        }

        public a a(MaterialClickInfo materialClickInfo) {
            this.f19199b = materialClickInfo;
            return this;
        }
    }

    public Integer j() {
        return this.sld;
    }

    public Integer i() {
        return Integer.valueOf(k());
    }

    public MaterialClickInfo h() {
        return this.clickInfo;
    }

    public boolean g() {
        return this.canReportClick;
    }

    public Float f() {
        return this.acc;
    }

    public String e() {
        return this.degreeDetail;
    }

    public Integer d() {
        return this.limitDegree;
    }

    public Integer c() {
        return this.limitAcc;
    }

    public String b() {
        return this.shakeAngle;
    }

    public Integer a() {
        return this.interactiveLogic;
    }

    private boolean m() {
        return this.limitDegree != null && dg.b(this.shakeAngle);
    }

    private boolean l() {
        Integer num = this.limitAcc;
        return (num == null || this.acc == null || ((float) num.intValue()) <= this.acc.floatValue()) ? false : true;
    }

    private int k() {
        int i;
        Integer num = this.cannotReportReason;
        if (num != null) {
            return num.intValue();
        }
        if (this.canReportClick) {
            i = 0;
        } else if (l() && m()) {
            i = 6;
        } else {
            i = m() ? 5 : 3;
        }
        Integer numValueOf = Integer.valueOf(i);
        this.cannotReportReason = numValueOf;
        return numValueOf.intValue();
    }

    public ShakeClickReportInfo(a aVar) {
        this.canReportClick = aVar.f19198a;
        this.clickInfo = aVar.f19199b;
        this.sld = aVar.f19200c;
        this.shakeAngle = aVar.d;
        this.limitAcc = aVar.e;
        this.limitDegree = aVar.f;
        this.degreeDetail = aVar.g;
        this.acc = aVar.h;
        this.interactiveLogic = aVar.i;
    }
}
