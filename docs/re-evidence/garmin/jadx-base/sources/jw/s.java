package jw;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljw/s;", "Lew/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vo1.c f101303j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.biz.tasks.GetUserHasGroupRidesTask", f = "GetUserHasGroupRidesTask.kt", l = {18}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f101304a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f101306c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f101304a = obj;
            this.f101306c |= Integer.MIN_VALUE;
            return s.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar) {
        super(bVar);
        bVar.getClass();
        this.f101303j = vo1.c.a.a(vo1.c.f179028c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f101306c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f101306c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objJ = aVar.f101304a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f101306c;
        if (i15 == 0) {
            o13.r.b(objJ);
            aVar.f101306c = 1;
            vo1.c cVar = this.f101303j;
            cVar.getClass();
            objJ = f0.J(cVar, new vo1.n(cVar, null), aVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).Z1(((yo1.l) ((v2.b) v2Var).f47386a).a());
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if (v2Var instanceof v2.a) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        u0.r();
        return null;
    }
}
