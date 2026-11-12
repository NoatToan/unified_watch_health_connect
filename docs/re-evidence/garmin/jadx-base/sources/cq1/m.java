package cq1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zd0.p0;
import zd0.q0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcq1/m;", "Lcq1/o;", "Lzd0/q0;", "promosInternalProvider", "<init>", "(Lzd0/q0;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f55204a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.startup.background.task.PromosStartupTask", f = "PromosStartupTask.kt", l = {13, 14}, m = "execute", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f55205a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f55207c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f55205a = obj;
            this.f55207c |= Integer.MIN_VALUE;
            return m.this.a(this);
        }
    }

    public m(q0 q0Var) {
        q0Var.getClass();
        this.f55204a = q0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r6.f55204a.i(r0) == r1) goto L21;
     */
    @Override // cq1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(t13.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f55207c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f55207c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f55205a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f55207c;
        if (i15 != 0) {
            if (i15 == 1) {
                r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        a2 a2Var = a2.PROMOTIONS;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "PromosStartupTask", "Start up task.");
        p0 p0Var = p0.f204108a;
        aVar.f55207c = 1;
        if (p0Var.a(aVar) != aVar2) {
        }
        return aVar2;
        aVar.f55207c = 2;
    }
}
