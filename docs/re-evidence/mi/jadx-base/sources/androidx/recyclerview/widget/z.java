package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f2978b = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2979a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2980b;
        public int c;
        public int d;
        public int e;

        public void a(int i) {
            this.f2979a = i | this.f2979a;
        }

        public boolean b() {
            int i = this.f2979a;
            if ((i & 7) != 0 && (i & c(this.d, this.f2980b)) == 0) {
                return false;
            }
            int i2 = this.f2979a;
            if ((i2 & 112) != 0 && (i2 & (c(this.d, this.c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f2979a;
            if ((i3 & 1792) != 0 && (i3 & (c(this.e, this.f2980b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f2979a;
            return (i4 & 28672) == 0 || (i4 & (c(this.e, this.c) << 12)) != 0;
        }

        public int c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        public void d() {
            this.f2979a = 0;
        }

        public void e(int i, int i2, int i3, int i4) {
            this.f2980b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    public interface b {
        int a();

        int b();

        int c(View view);

        int d(View view);

        View getChildAt(int i);
    }

    public z(b bVar) {
        this.f2977a = bVar;
    }

    public View a(int i, int i2, int i3, int i4) {
        int iA = this.f2977a.a();
        int iB = this.f2977a.b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View childAt = this.f2977a.getChildAt(i);
            this.f2978b.e(iA, iB, this.f2977a.c(childAt), this.f2977a.d(childAt));
            if (i3 != 0) {
                this.f2978b.d();
                this.f2978b.a(i3);
                if (this.f2978b.b()) {
                    return childAt;
                }
            }
            if (i4 != 0) {
                this.f2978b.d();
                this.f2978b.a(i4);
                if (this.f2978b.b()) {
                    view = childAt;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean b(View view, int i) {
        this.f2978b.e(this.f2977a.a(), this.f2977a.b(), this.f2977a.c(view), this.f2977a.d(view));
        if (i == 0) {
            return false;
        }
        this.f2978b.d();
        this.f2978b.a(i);
        return this.f2978b.b();
    }
}
