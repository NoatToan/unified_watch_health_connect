package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.huawei.ui.commonui.linechart.anchor.Layout;

/* JADX INFO: loaded from: classes16.dex */
public class qln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f46454a;
    private Layout e;

    public qln(Context context, Layout layout) {
        this.f46454a = context;
        this.e = layout;
    }

    public float a() {
        float f;
        int i;
        if ((!this.e.h && !qmh.e(this.f46454a)) || (this.e.h && qmh.e(this.f46454a))) {
            f = this.e.f23589c + this.e.d;
            i = this.e.l;
        } else {
            f = this.e.o + this.e.m;
            i = this.e.l;
        }
        return f + i;
    }

    public float j() {
        return this.e.p + this.e.k + this.e.f + this.e.f23587a;
    }

    public float b() {
        float f;
        int i;
        if ((!this.e.h && !qmh.e(this.f46454a)) || (this.e.h && qmh.e(this.f46454a))) {
            f = this.e.o + this.e.m;
            i = this.e.q;
        } else {
            f = this.e.f23589c + this.e.d;
            i = this.e.q;
        }
        return f + i;
    }

    public float c() {
        float f = this.e.u + this.e.y + this.e.g + this.e.w + this.e.x + this.e.s + this.e.n;
        float f2 = this.e.r + this.e.t + this.e.n;
        return f2 > f ? f2 : f;
    }

    public float f() {
        return this.e.l + this.e.j;
    }

    public float g() {
        return (i() - this.e.i) - this.e.q;
    }

    private float i() {
        return this.e.l + this.e.m + this.e.o + this.e.f23588b + this.e.d + this.e.f23589c + this.e.q;
    }

    public Rect d() {
        return new Rect(this.e.l, (int) (this.e.p + this.e.k), (int) (this.e.l + this.e.f23589c + this.e.d + this.e.f23588b + this.e.o + this.e.m), (int) (this.e.p + this.e.k + this.e.f));
    }

    public Rect e() {
        return new Rect(this.e.l, (int) (this.e.p + this.e.k + this.e.f + this.e.f23587a + this.e.e + this.e.r), (int) (this.e.l + this.e.f23589c + this.e.d + this.e.f23588b + this.e.o + this.e.m), (int) (this.e.p + this.e.k + this.e.f + this.e.f23587a + this.e.e + this.e.r + this.e.t));
    }

    public float h() {
        return this.e.e;
    }
}
