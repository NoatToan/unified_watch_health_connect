package defpackage;

import android.text.SpannableString;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class fsv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f34506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f34507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f34508c;
    private View.OnClickListener d;
    private float e;
    private boolean f;
    private c g;
    private final b[] h = new b[3];
    private int i;
    private View.OnClickListener j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View.OnClickListener f34509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f34511c;
        public String d;
        public String e;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View.OnClickListener f34512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f34513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f34514c;
        public SpannableString d;
        public int[] e;
        public int g;
        public int h;
        public int i;
        public int j;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f34515a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f34516c;
        public String d;
        public boolean e;
    }

    public float d() {
        return this.e;
    }

    public void d(float f) {
        this.e = f;
    }

    public float c() {
        return this.f34507b;
    }

    public a e() {
        return this.f34508c;
    }

    public void e(a aVar) {
        this.f34508c = aVar;
    }

    public a b() {
        return this.f34506a;
    }

    public void c(a aVar) {
        this.f34506a = aVar;
    }

    public b e(int i) {
        if (i > 2) {
            return new b();
        }
        return this.h[i];
    }

    public void e(int i, b bVar) {
        this.h[i] = bVar;
    }

    public void a(float f) {
        this.f34507b = f;
    }

    public void c(boolean z) {
        this.f = z;
    }

    public boolean j() {
        return this.f;
    }

    public View.OnClickListener a() {
        return this.d;
    }

    public void a(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public c i() {
        return this.g;
    }

    public void d(c cVar) {
        this.g = cVar;
    }

    public int g() {
        return this.i;
    }

    public void d(int i) {
        this.i = i;
    }

    public View.OnClickListener f() {
        return this.j;
    }

    public void d(View.OnClickListener onClickListener) {
        this.j = onClickListener;
    }

    public String toString() {
        return "SectionActiveThreeCircleBean{, mDistance=" + this.e + ", mClimbs=" + this.f34507b + ", mIsSupportFloor=" + this.f + ", mPushesVal=" + this.i + '}';
    }
}
