package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyc/l1;", "", "<init>", "()V", "a", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1 f196136a = new l1();

    private l1() {
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\tB+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lyc/l1$a;", "T", "Landroidx/recyclerview/widget/y;", "Lyc/k3;", "oldList", "newList", "callback", "<init>", "(Lyc/k3;Lyc/k3;Landroidx/recyclerview/widget/y;)V", "a", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> implements androidx.recyclerview.widget.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k3<T> f196137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k3<T> f196138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.recyclerview.widget.y f196139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f196140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f196141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f196142f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f196143g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f196144h;

        static {
            new C3662a(null);
        }

        public a(k3<T> k3Var, k3<T> k3Var2, androidx.recyclerview.widget.y yVar) {
            k3Var.getClass();
            k3Var2.getClass();
            yVar.getClass();
            this.f196137a = k3Var;
            this.f196138b = k3Var2;
            this.f196139c = yVar;
            this.f196140d = k3Var.a();
            this.f196141e = k3Var.b();
            this.f196142f = k3Var.e();
            this.f196143g = 1;
            this.f196144h = 1;
        }

        @Override // androidx.recyclerview.widget.y
        public final void a(int i14, int i15) {
            int i16;
            int i17 = i14 + i15;
            int i18 = this.f196142f;
            k3<T> k3Var = this.f196138b;
            androidx.recyclerview.widget.y yVar = this.f196139c;
            if (i17 >= i18 && this.f196144h != 3) {
                int iMin = Math.min(k3Var.b() - this.f196141e, i15);
                i16 = iMin >= 0 ? iMin : 0;
                int i19 = i15 - i16;
                if (i16 > 0) {
                    this.f196144h = 2;
                    yVar.b(this.f196140d + i14, i16, z.ITEM_TO_PLACEHOLDER);
                    this.f196141e += i16;
                }
                if (i19 > 0) {
                    yVar.a(i14 + i16 + this.f196140d, i19);
                }
            } else if (i14 <= 0 && this.f196143g != 3) {
                int iMin2 = Math.min(k3Var.a() - this.f196140d, i15);
                i16 = iMin2 >= 0 ? iMin2 : 0;
                int i24 = i15 - i16;
                if (i24 > 0) {
                    yVar.a(this.f196140d, i24);
                }
                if (i16 > 0) {
                    this.f196143g = 2;
                    yVar.b(this.f196140d, i16, z.ITEM_TO_PLACEHOLDER);
                    this.f196140d += i16;
                }
            } else {
                yVar.a(i14 + this.f196140d, i15);
            }
            this.f196142f -= i15;
        }

        @Override // androidx.recyclerview.widget.y
        public final void b(int i14, int i15, Object obj) {
            this.f196139c.b(i14 + this.f196140d, i15, obj);
        }

        @Override // androidx.recyclerview.widget.y
        public final void c(int i14, int i15) {
            int i16 = this.f196142f;
            androidx.recyclerview.widget.y yVar = this.f196139c;
            if (i14 >= i16 && this.f196144h != 2) {
                int iMin = Math.min(i15, this.f196141e);
                if (iMin > 0) {
                    this.f196144h = 3;
                    yVar.b(this.f196140d + i14, iMin, z.PLACEHOLDER_TO_ITEM);
                    this.f196141e -= iMin;
                }
                int i17 = i15 - iMin;
                if (i17 > 0) {
                    yVar.c(i14 + iMin + this.f196140d, i17);
                }
            } else if (i14 <= 0 && this.f196143g != 2) {
                int iMin2 = Math.min(i15, this.f196140d);
                if (iMin2 > 0) {
                    this.f196143g = 3;
                    yVar.b((0 - iMin2) + this.f196140d, iMin2, z.PLACEHOLDER_TO_ITEM);
                    this.f196140d -= iMin2;
                }
                int i18 = i15 - iMin2;
                if (i18 > 0) {
                    yVar.c(this.f196140d, i18);
                }
            } else {
                yVar.c(i14 + this.f196140d, i15);
            }
            this.f196142f += i15;
        }

        @Override // androidx.recyclerview.widget.y
        public final void d(int i14, int i15) {
            int i16 = this.f196140d;
            this.f196139c.d(i14 + i16, i15 + i16);
        }

        /* JADX INFO: renamed from: yc.l1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lyc/l1$a$a;", "", "<init>", "()V", "", "UNUSED", "I", "USED_FOR_ADDITION", "USED_FOR_REMOVAL", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C3662a {
            public /* synthetic */ C3662a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C3662a() {
            }
        }
    }
}
