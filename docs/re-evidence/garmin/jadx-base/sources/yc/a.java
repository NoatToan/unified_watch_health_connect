package yc;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lyc/a;", "", "Key", "Value", "<init>", "()V", "a", "b", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC3643a[] f195710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0.a[] f195711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p13.k<b<Key, Value>> f195712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f195713d;

    /* JADX INFO: renamed from: yc.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum EnumC3643a {
        UNBLOCKED,
        COMPLETED,
        REQUIRES_REFRESH
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyc/a$b;", "", "Key", "Value", "Lyc/c1;", "loadType", "Lyc/i3;", "pagingState", "<init>", "(Lyc/c1;Lyc/i3;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c1 f195718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i3<Key, Value> f195719b;

        public b(c1 c1Var, i3<Key, Value> i3Var) {
            c1Var.getClass();
            i3Var.getClass();
            this.f195718a = c1Var;
            this.f195719b = i3Var;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f195720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f195721b;

        static {
            int[] iArr = new int[c1.values().length];
            try {
                iArr[c1.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f195720a = iArr;
            int[] iArr2 = new int[EnumC3643a.values().length];
            try {
                iArr2[EnumC3643a.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[EnumC3643a.REQUIRES_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC3643a.UNBLOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f195721b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lyc/a$b;", "it", "", "invoke", "(Lyc/a$b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.l<b<Key, Value>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c1 f195722a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c1 c1Var) {
            super(1);
            this.f195722a = c1Var;
        }

        @Override // e23.l
        public final Boolean invoke(Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            return Boolean.valueOf(bVar.f195718a == this.f195722a);
        }
    }

    public a() {
        int length = c1.values().length;
        EnumC3643a[] enumC3643aArr = new EnumC3643a[length];
        for (int i14 = 0; i14 < length; i14++) {
            enumC3643aArr[i14] = EnumC3643a.UNBLOCKED;
        }
        this.f195710a = enumC3643aArr;
        int length2 = c1.values().length;
        z0.a[] aVarArr = new z0.a[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            aVarArr[i15] = null;
        }
        this.f195711b = aVarArr;
        this.f195712c = new p13.k<>();
    }

    public final void a(c1 c1Var) {
        c1Var.getClass();
        p13.d0.B(new d(c1Var), this.f195712c);
    }

    public final z0 b(c1 c1Var) {
        EnumC3643a enumC3643a = this.f195710a[c1Var.ordinal()];
        p13.k<b<Key, Value>> kVar = this.f195712c;
        if (kVar == null || !kVar.isEmpty()) {
            Iterator<b<Key, Value>> it = kVar.iterator();
            while (it.hasNext()) {
                if (it.next().f195718a == c1Var) {
                    if (enumC3643a == EnumC3643a.REQUIRES_REFRESH) {
                        break;
                    }
                    return z0.b.f196664b;
                }
            }
        }
        z0.a aVar = this.f195711b[c1Var.ordinal()];
        if (aVar != null) {
            return aVar;
        }
        int i14 = c.f195721b[enumC3643a.ordinal()];
        if (i14 == 1) {
            if (c.f195720a[c1Var.ordinal()] == 1) {
                z0.c.f196665b.getClass();
                return z0.c.f196667d;
            }
            z0.c.f196665b.getClass();
            return z0.c.f196666c;
        }
        if (i14 == 2) {
            z0.c.f196665b.getClass();
            return z0.c.f196667d;
        }
        if (i14 == 3) {
            z0.c.f196665b.getClass();
            return z0.c.f196667d;
        }
        lc.u0.r();
        return null;
    }

    public final o13.p<c1, i3<Key, Value>> c() {
        b<Key, Value> next;
        Iterator<b<Key, Value>> it = this.f195712c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            c1 c1Var = next.f195718a;
            if (c1Var != c1.REFRESH && this.f195710a[c1Var.ordinal()] == EnumC3643a.UNBLOCKED) {
                break;
            }
        }
        b<Key, Value> bVar = next;
        if (bVar != null) {
            return new o13.p<>(bVar.f195718a, bVar.f195719b);
        }
        return null;
    }

    public final void d(c1 c1Var, EnumC3643a enumC3643a) {
        c1Var.getClass();
        enumC3643a.getClass();
        this.f195710a[c1Var.ordinal()] = enumC3643a;
    }

    public final void e(c1 c1Var, z0.a aVar) {
        c1Var.getClass();
        this.f195711b[c1Var.ordinal()] = aVar;
    }
}
