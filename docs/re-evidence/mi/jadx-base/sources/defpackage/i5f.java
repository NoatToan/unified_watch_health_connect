package defpackage;

import com.xiaomi.fitness.common.utils.DisplayUtil;

/* JADX INFO: loaded from: classes5.dex */
public class i5f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20802b;
    public int c;
    public int d;
    public String e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f20803k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20805b;
        public int c;
        public String d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public boolean j;

        public a() {
            int iDip2px = DisplayUtil.dip2px(20.0f);
            this.f20804a = iDip2px;
            this.f20805b = iDip2px / 2;
            this.c = 13;
            this.d = "";
            this.e = DisplayUtil.dip2px(50.0f);
            this.f = DisplayUtil.dip2px(55.0f);
            this.g = vii.x;
            this.h = vii.f36927a;
            this.i = vii.f;
        }

        public i5f a() {
            i5f i5fVar = new i5f();
            i5fVar.e = this.d;
            i5fVar.i = this.h;
            i5fVar.j = this.i;
            i5fVar.h = this.g;
            i5fVar.f20803k = this.j;
            i5fVar.f20801a = this.f20804a;
            i5fVar.f20802b = this.f20805b;
            i5fVar.c = this.c;
            i5fVar.g = this.f;
            i5fVar.f = this.e;
            return i5fVar;
        }

        public a b(int i) {
            this.h = i;
            return this;
        }

        public a c(int i) {
            this.i = i;
            return this;
        }

        public a d(int i) {
            this.f20805b = i;
            return this;
        }

        public a e(int i) {
            this.f = i;
            return this;
        }

        public a f(int i) {
            this.e = i;
            return this;
        }

        public a g(boolean z) {
            this.j = z;
            return this;
        }

        public a h(String str) {
            this.d = str;
            return this;
        }

        public a i(int i) {
            this.f20804a = i;
            return this;
        }

        public a j(int i) {
            this.c = i;
            return this;
        }

        public a k(int i) {
            this.g = i;
            return this;
        }
    }

    public i5f() {
        int iDip2px = DisplayUtil.dip2px(20.0f);
        this.f20801a = iDip2px;
        this.f20802b = iDip2px / 2;
        this.c = 13;
        this.d = 0;
        this.e = "";
        this.f = DisplayUtil.dip2px(50.0f);
        this.g = DisplayUtil.dip2px(58.0f);
        this.h = vii.x;
        this.i = vii.f36927a;
        this.j = vii.f;
    }
}
