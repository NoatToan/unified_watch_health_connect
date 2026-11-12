package cq1;

import c22.s3;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcq1/n;", "Lcq1/o;", "Lqo1/c;", "socialProfileRepository", "Lte0/d;", "fetchViewableAccountsUseCase", "<init>", "(Lqo1/c;Lte0/d;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qo1.c f55208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.d f55209b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.startup.background.task.SocialProfileStartupTask", f = "SocialProfileStartupTask.kt", l = {13, 15}, m = "execute", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f55210a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f55212c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f55210a = obj;
            this.f55212c |= Integer.MIN_VALUE;
            return n.this.a(this);
        }
    }

    static {
        qo1.c.a aVar = qo1.c.f145960d;
    }

    public n(qo1.c cVar, te0.d dVar) {
        cVar.getClass();
        dVar.getClass();
        this.f55208a = cVar;
        this.f55209b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r5.f55209b.a(r0) == r1) goto L23;
     */
    @Override // cq1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(t13.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f55212c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f55212c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f55210a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f55212c;
        if (i15 == 0) {
            r.b(obj);
            aVar.f55212c = 1;
            if (qo1.c.b(this.f55208a, aVar) != aVar2) {
            }
            return aVar2;
        }
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
        s3.f23252a.getClass();
        if (!s3.a("ROLE_USER_MANAGED_ACCOUNTS_ADMIN")) {
            return Unit.INSTANCE;
        }
        aVar.f55212c = 2;
    }
}
