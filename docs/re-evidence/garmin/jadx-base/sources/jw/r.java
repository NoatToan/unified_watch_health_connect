package jw;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljw/r;", "Lew/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "Ljw/q;", "getSocialProfileFromGCCallback", "Lqo1/c;", "socialProfileRepo", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;Ljw/q;Lqo1/c;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q f101298j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qo1.c f101299k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.biz.tasks.GetSocialProfileFromGCTask", f = "GetSocialProfileFromGCTask.kt", l = {18}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f101300a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f101302c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f101300a = obj;
            this.f101302c |= Integer.MIN_VALUE;
            return r.this.d(this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r(com.garmin.android.library.backgroundtaskmanagement.b bVar, q qVar, qo1.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        qVar = (i14 & 2) != 0 ? null : qVar;
        if ((i14 & 4) != 0) {
            qo1.c.f145960d.getClass();
            cVar = qo1.c.a.a();
        }
        this(bVar, qVar, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f101302c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f101302c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objB = aVar.f101300a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f101302c;
        if (i15 == 0) {
            o13.r.b(objB);
            aVar.f101302c = 1;
            objB = qo1.c.b(this.f101299k, aVar);
            if (objB == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        v2 v2Var = (v2) objB;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            }
            u0.r();
            return null;
        }
        q qVar = this.f101298j;
        if (qVar != null) {
            ((gw.i) ((en0.n) qVar).f64713b).i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, (com.garmin.android.apps.connectmobile.userprofile.model.m) ((v2.b) v2Var).f47386a);
        }
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, q qVar) {
        this(bVar, qVar, null, 4, null);
        bVar.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, q qVar, qo1.c cVar) {
        super(bVar);
        bVar.getClass();
        cVar.getClass();
        this.f101298j = qVar;
        this.f101299k = cVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar) {
        this(bVar, null, null, 6, null);
        bVar.getClass();
    }
}
