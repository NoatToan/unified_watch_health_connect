package com.huawei.openalliance.ad.inter.data;

import android.text.TextUtils;
import com.huawei.openalliance.ad.hw;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes12.dex */
public class MaterialClickInfo {
    private static final String TAG = "MaterialClickInfo";
    private Integer adCardH;
    private Integer adCardW;
    private Integer adCardX;
    private Integer adCardY;
    private Integer btnClickX;
    private Integer btnClickY;
    private String clickComponent;
    private Long clickDTime;
    private Float clickDownPressure;
    private Integer clickDownScrollHeight;
    private Float clickDownSize;
    private Long clickUTime;
    private Float clickUpPressure;
    private Integer clickUpScrollHeight;
    private Float clickUpSize;
    private Integer clickX;
    private Integer clickY;
    private Integer compH;
    private Integer compW;
    private Integer compX;
    private Integer compY;
    private String creativeSize;
    private Float density;
    private Integer mark;
    private Integer screenH;
    private Integer screenW;
    private String shakeAngle;
    private Integer sld;
    private Integer upX;
    private Integer upY;

    public Integer z() {
        return this.adCardX;
    }

    public Integer y() {
        return this.compH;
    }

    public Integer x() {
        return this.compW;
    }

    public Integer w() {
        return this.compY;
    }

    public Integer v() {
        return this.compX;
    }

    public String u() {
        return this.clickComponent;
    }

    public String toString() {
        return "MaterialClickInfo{clickX=" + this.clickX + ", clickY=" + this.clickY + ", clickDTime=" + this.clickDTime + ", creativeSize='" + this.creativeSize + "', sld=" + this.sld + ", density=" + this.density + ", upX=" + this.upX + ", upY=" + this.upY + ", clickUTime=" + this.clickUTime + ", shakeAngle=" + this.shakeAngle + ", clickComponent= " + this.clickComponent + ", compX= " + this.compX + ", compY= " + this.compY + ", compW= " + this.compW + ", compH= " + this.compH + ", adCardX= " + this.adCardX + ", adCardY= " + this.adCardY + ", adCardW= " + this.adCardW + ", adCardH= " + this.adCardH + ", screenW= " + this.screenW + ", screenH= " + this.screenH + '}';
    }

    public Integer t() {
        return this.clickUpScrollHeight;
    }

    public Integer s() {
        return this.clickDownScrollHeight;
    }

    public void r(Integer num) {
        this.screenH = num;
    }

    public Float r() {
        return this.clickUpSize;
    }

    public void q(Integer num) {
        this.screenW = num;
    }

    public Float q() {
        return this.clickDownSize;
    }

    public void p(Integer num) {
        this.adCardH = num;
    }

    public Float p() {
        return this.clickUpPressure;
    }

    public void o(Integer num) {
        this.adCardW = num;
    }

    public Float o() {
        return this.clickDownPressure;
    }

    public void n(Integer num) {
        this.adCardY = num;
    }

    public String n() {
        return this.shakeAngle;
    }

    public void m(Integer num) {
        this.adCardX = num;
    }

    public Integer m() {
        return this.mark;
    }

    public void l(Integer num) {
        this.compH = num;
    }

    public Long l() {
        return this.clickDTime;
    }

    public void k(Integer num) {
        this.compW = num;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f19183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f19184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f19185c;
        private Integer d;
        private Integer e;
        private Integer f;
        private Float g;
        private Long h;
        private Long i;
        private String j;
        private String k;
        private Integer l;
        private Integer m;
        private Integer n;
        private Integer o;
        private Integer p;
        private Integer q;
        private Integer r;
        private Integer s;
        private Integer t;
        private Integer u;

        public a e(Integer num) {
            this.f = num;
            return this;
        }

        public a d(Integer num) {
            this.e = num;
            return this;
        }

        public a c(Integer num) {
            this.d = num;
            return this;
        }

        public a b(String str) {
            this.f19185c = str;
            return this;
        }

        public a b(Long l) {
            this.i = l;
            return this;
        }

        public a b(Integer num) {
            this.f19184b = num;
            return this;
        }

        public MaterialClickInfo a() {
            return new MaterialClickInfo(this);
        }

        public a a(String str) {
            this.j = str;
            return this;
        }

        public a a(Long l) {
            this.h = l;
            return this;
        }

        public a a(Integer num) {
            this.f19183a = num;
            return this;
        }

        public a a(Float f) {
            this.g = f;
            return this;
        }
    }

    public Long k() {
        return this.clickUTime;
    }

    public void j(Integer num) {
        this.compY = num;
    }

    public Float j() {
        return this.density;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f19186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f19187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f19188c;
        private Integer d;
        private Integer e;
        private Integer f;
        private Long g;
        private Long h;
        private Float i;
        private Float j;
        private Float k;
        private Float l;
        private Integer m;
        private Integer n;

        public b g(Integer num) {
            this.n = num;
            return this;
        }

        public b f(Integer num) {
            this.m = num;
            return this;
        }

        public b e(Integer num) {
            this.f = num;
            return this;
        }

        public b d(Integer num) {
            this.e = num;
            return this;
        }

        public b d(Float f) {
            this.l = f;
            return this;
        }

        public b c(Integer num) {
            this.d = num;
            return this;
        }

        public b c(Float f) {
            this.k = f;
            return this;
        }

        public b b(Long l) {
            this.h = l;
            return this;
        }

        public b b(Integer num) {
            this.f19187b = num;
            return this;
        }

        public b b(Float f) {
            this.j = f;
            return this;
        }

        public MaterialClickInfo a() {
            return new MaterialClickInfo(this);
        }

        public b a(String str) {
            this.f19188c = str;
            return this;
        }

        public b a(Long l) {
            this.g = l;
            return this;
        }

        public b a(Integer num) {
            this.f19186a = num;
            return this;
        }

        public b a(Float f) {
            this.i = f;
            return this;
        }
    }

    public void i(Integer num) {
        this.compX = num;
    }

    public Integer i() {
        return this.upY;
    }

    public void h(Integer num) {
        this.mark = num;
    }

    public Integer h() {
        return this.upX;
    }

    public void g(Integer num) {
        this.upY = num;
    }

    public Integer g() {
        return this.sld;
    }

    public void f(Integer num) {
        this.upX = num;
    }

    public String f() {
        return this.creativeSize;
    }

    public void e(Integer num) {
        this.sld = num;
    }

    public Integer e() {
        return this.btnClickY;
    }

    public void d(Integer num) {
        this.btnClickY = num;
    }

    public Integer d() {
        return this.btnClickX;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            hw.b(TAG, "clickComponent is invalid");
        } else {
            this.clickComponent = str;
        }
    }

    public void c(Integer num) {
        this.btnClickX = num;
    }

    public Integer c() {
        return this.clickY;
    }

    public void b(String str) {
        this.shakeAngle = str;
    }

    public void b(Integer num) {
        this.clickY = num;
    }

    public Integer b() {
        return this.clickX;
    }

    public void a(String str) {
        this.creativeSize = str;
    }

    public void a(Long l) {
        this.clickUTime = l;
    }

    public void a(Integer num) {
        this.clickX = num;
    }

    public void a(Float f) {
        this.density = f;
    }

    public String a() {
        return Constants.LEFT_BRACKET_ONLY + this.clickX + ", " + this.clickY + "), (" + this.upX + ", " + this.upY + "), dHeight: " + this.clickDownScrollHeight + ", uHeight: " + this.clickUpScrollHeight + ", dSize: " + this.clickDownSize + ", uSize: " + this.clickUpSize + ", dPressure: " + this.clickDownPressure + ", uPressure: " + this.clickUpPressure + ", dTime: " + this.clickDTime + ", uTime: " + this.clickUTime;
    }

    public Integer E() {
        return this.screenH;
    }

    public Integer D() {
        return this.screenW;
    }

    public Integer C() {
        return this.adCardH;
    }

    public Integer B() {
        return this.adCardW;
    }

    public Integer A() {
        return this.adCardY;
    }

    public MaterialClickInfo(b bVar) {
        this.clickX = bVar.f19186a;
        this.clickY = bVar.f19187b;
        this.creativeSize = bVar.f19188c;
        this.sld = bVar.d;
        this.upX = bVar.e;
        this.upY = bVar.f;
        this.clickDTime = bVar.h;
        this.clickUTime = bVar.g;
        this.clickDownPressure = bVar.i;
        this.clickUpPressure = bVar.j;
        this.clickDownSize = bVar.k;
        this.clickUpSize = bVar.l;
        this.clickDownScrollHeight = bVar.m;
        this.clickUpScrollHeight = bVar.n;
    }

    public MaterialClickInfo(a aVar) {
        this.clickX = aVar.f19183a;
        this.clickY = aVar.f19184b;
        this.creativeSize = aVar.f19185c;
        this.sld = aVar.d;
        this.density = aVar.g;
        this.upX = aVar.e;
        this.upY = aVar.f;
        this.clickDTime = aVar.i;
        this.clickUTime = aVar.h;
        this.shakeAngle = aVar.j;
        this.clickComponent = aVar.k;
        this.compX = aVar.l;
        this.compY = aVar.m;
        this.compW = aVar.n;
        this.compH = aVar.o;
        this.adCardX = aVar.p;
        this.adCardY = aVar.q;
        this.adCardW = aVar.r;
        this.adCardH = aVar.s;
        this.screenW = aVar.t;
        this.screenH = aVar.u;
    }

    public MaterialClickInfo() {
    }
}
