package u33;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends u33.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f168324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f168325h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f168326f;

    static {
        new a(null);
        c cVar = new c(2, 3, 0);
        f168324g = cVar;
        int i14 = cVar.f168292c;
        int i15 = cVar.f168291b;
        f168325h = (i15 == 1 && i14 == 9) ? new c(2, 0, 0) : new c(i15, i14 + 1, 0);
        new c(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int[] iArr, boolean z14) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.f168326f = z14;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(int... iArr) {
        this(iArr, false);
        iArr.getClass();
    }
}
