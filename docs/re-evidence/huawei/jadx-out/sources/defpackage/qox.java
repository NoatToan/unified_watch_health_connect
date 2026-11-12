package defpackage;

import android.graphics.drawable.Drawable;
import com.huawei.ui.commonui.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f46586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f46587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f46588c;
    private final boolean d;
    private int e;
    private final List<String> f = new ArrayList();
    private final List<Integer> g = new ArrayList();
    private int h;
    private int i;
    private int j;
    private float l;
    private float m;
    private String n;
    private float o;

    public qox(boolean z) {
        this.d = z;
        if (z) {
            this.e = R.color.circle_scale_mini_cursor;
        }
        this.j = R.color.circle_scale_ring_start;
        this.h = R.color.circle_scale_ring_center;
        this.i = R.color.circle_scale_ring_end;
    }

    public boolean m() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public int j() {
        return this.j;
    }

    public int d() {
        return this.h;
    }

    public int g() {
        return this.i;
    }

    public void d(int i) {
        this.j = i;
        this.h = i;
        this.i = i;
    }

    public void c(int i, int i2, int i3) {
        this.j = i;
        this.h = i2;
        this.i = i3;
    }

    public float b() {
        return this.f46587b;
    }

    public void b(float f) {
        this.f46587b = f;
    }

    public float k() {
        return this.m;
    }

    public float h() {
        return this.l;
    }

    public void d(float f, float f2) {
        this.m = f;
        this.l = f2;
    }

    public String o() {
        return this.n;
    }

    public void c(String str) {
        this.n = str;
    }

    public List<String> f() {
        return this.f;
    }

    public void d(List<String> list) {
        this.f.clear();
        this.f.addAll(list);
    }

    public List<Integer> i() {
        return this.g;
    }

    public void e(List<Integer> list) {
        this.g.clear();
        this.g.addAll(list);
    }

    public float l() {
        return this.o;
    }

    public void e(float f) {
        this.o = f;
    }

    public Drawable c() {
        return this.f46588c;
    }

    public void e(Drawable drawable) {
        this.f46588c = drawable;
    }

    public Drawable a() {
        return this.f46586a;
    }

    public void c(Drawable drawable) {
        this.f46586a = drawable;
    }

    public String toString() {
        return "CircleScaleRulerData{mIsMini=" + this.d + ", mMiniCursorColor=" + this.e + ", mRingStartColor=" + this.j + ", mRingCentreColor=" + this.h + ", mRingEndColor=" + this.i + ", mCursorAngle=" + this.f46587b + ", mScopeStartAngle=" + this.m + ", mScopeEndAngle=" + this.l + ", mScopeText=" + this.n + ", mRulerTextList=" + this.f + ", mRulerHighlightIndexList=" + this.g + ", mZoomScale=" + this.o + ", mBackground=" + this.f46588c + ", mCursor=" + this.f46586a + '}';
    }
}
