package p008y1;

import g6.s;
import o13.r;
import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly1/w2;", "La5/a;", "Ly1/n2;", "scrollingLogic", "", "enabled", "<init>", "(Ly1/n2;Z)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w2 implements a5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2 f193694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f193695b;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", l = {977}, m = "onPostFling-RZ2iAVY", v = 1)
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f193696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f193697b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f193699d;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f193697b = obj;
            this.f193699d |= Integer.MIN_VALUE;
            return w2.this.mo1onPostFlingRZ2iAVY(0L, 0L, this);
        }
    }

    public w2(n2 n2Var, boolean z14) {
        this.f193694a = n2Var;
        this.f193695b = z14;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a5.a
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo1onPostFlingRZ2iAVY(long j8, long j14, d<? super s> dVar) {
        a aVar;
        long jE;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f193699d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f193699d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objA = aVar.f193697b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f193699d;
        if (i15 == 0) {
            r.b(objA);
            jE = 0;
            if (this.f193695b) {
                n2 n2Var = this.f193694a;
                if (n2Var.getF193262i()) {
                    s.f76026b.getClass();
                } else {
                    aVar.f193696a = j14;
                    aVar.f193699d = 1;
                    objA = n2Var.a(j14, aVar);
                    if (objA == aVar2) {
                        return aVar2;
                    }
                }
                jE = s.e(j14, jE);
            } else {
                s.f76026b.getClass();
            }
            return s.a(jE);
        }
        if (i15 != 1) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j14 = aVar.f193696a;
        r.b(objA);
        jE = ((s) objA).f76027a;
        jE = s.e(j14, jE);
        return s.a(jE);
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo2onPostScrollDzOQY0M(long j8, long j14, int i14) {
        if (this.f193695b) {
            return this.f193694a.c(j14);
        }
        n4.c.f123541b.getClass();
        return 0L;
    }
}
