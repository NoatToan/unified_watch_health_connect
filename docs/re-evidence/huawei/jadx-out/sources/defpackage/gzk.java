package defpackage;

import android.graphics.PointF;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes8.dex */
public class gzk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f36279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f36281c;
    private float d;
    private float e;
    private PointF f;
    private float g;
    private String h;
    private String i;
    private float j;
    private String o;

    public gzk(float f, String str) {
        this(f, "", str);
    }

    private gzk(float f, String str, String str2) {
        this(0.0f, f, str, str2, -7829368);
    }

    private gzk(float f, float f2, String str, String str2, int i) {
        PointF pointF = new PointF();
        this.f = pointF;
        this.j = f2;
        this.f36281c = f;
        float f3 = f2 - f;
        this.f36279a = f3;
        this.d = f3;
        this.o = str2;
        pointF.y = f;
        this.i = str;
        this.f36280b = i;
        this.h = new DecimalFormat("##").format(this.d);
    }

    public PointF c() {
        return new PointF(f(), this.f.y - this.d);
    }

    public void e(float f) {
        this.g = f;
    }

    public float d() {
        return this.d;
    }

    public void d(float f) {
        this.d = f;
    }

    public PointF j() {
        return this.f;
    }

    private float f() {
        PointF pointF = this.f;
        if (pointF != null) {
            float f = pointF.x + (this.g / 2.0f);
            this.e = f;
            return f;
        }
        return this.g / 2.0f;
    }

    public int e() {
        return this.f36280b;
    }

    public float a() {
        return this.f36281c;
    }

    public String b() {
        return this.h;
    }

    public void b(String str) {
        this.h = str;
    }

    public String toString() {
        return "height: " + this.d;
    }
}
