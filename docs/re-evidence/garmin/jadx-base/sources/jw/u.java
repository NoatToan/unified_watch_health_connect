package jw;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljw/u;", "Lew/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "Ljw/t;", "getUserSettingsFromGCCallback", "Loj1/a;", "settingsRepo", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;Ljw/t;Loj1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f101307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final oj1.a f101308k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.biz.tasks.GetUserSettingsFromGCTask", f = "GetUserSettingsFromGCTask.kt", l = {18}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f101309a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f101311c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f101309a = obj;
            this.f101311c |= Integer.MIN_VALUE;
            return u.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, t tVar, oj1.a aVar) {
        super(bVar);
        bVar.getClass();
        tVar.getClass();
        aVar.getClass();
        this.f101307j = tVar;
        this.f101308k = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f101311c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f101311c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objC = aVar.f101309a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f101311c;
        if (i15 == 0) {
            o13.r.b(objC);
            aVar.f101311c = 1;
            objC = this.f101308k.c(aVar);
            if (objC == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            this.f101307j.d((String) ((v2.b) v2Var).f47386a);
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if (v2Var instanceof v2.a) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, t tVar) {
        this(bVar, tVar, null, 4, null);
        bVar.getClass();
        tVar.getClass();
    }

    public /* synthetic */ u(com.garmin.android.library.backgroundtaskmanagement.b bVar, t tVar, oj1.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, tVar, (i14 & 4) != 0 ? oj1.c.a.a(oj1.c.f132368d) : aVar);
    }
}
