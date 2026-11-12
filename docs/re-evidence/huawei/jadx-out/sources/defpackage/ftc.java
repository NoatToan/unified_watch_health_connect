package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class ftc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View.OnClickListener f34535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34537c;
    private int e;

    public int d() {
        return this.f34536b;
    }

    public int e() {
        return this.e;
    }

    public int b() {
        return this.f34537c;
    }

    public View.OnClickListener a() {
        return this.f34535a;
    }

    private ftc(b bVar) {
        this.f34536b = bVar.e;
        this.e = bVar.f34538a;
        this.f34537c = bVar.f34539c;
        this.f34535a = bVar.d;
    }

    /* JADX INFO: loaded from: classes29.dex */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f34538a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f34539c;
        private View.OnClickListener d;
        private int e;

        public b b(int i) {
            this.e = i;
            return this;
        }

        public b e(int i) {
            this.f34538a = i;
            return this;
        }

        public b c(int i) {
            this.f34539c = i;
            return this;
        }

        public b c(View.OnClickListener onClickListener) {
            this.d = onClickListener;
            return this;
        }

        public ftc b() {
            return new ftc(this);
        }
    }
}
