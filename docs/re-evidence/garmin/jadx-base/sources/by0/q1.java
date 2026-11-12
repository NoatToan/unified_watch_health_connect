package by0;

import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/userprofile/model/l;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore$getUserSocialProfile$2$1", f = "MultiDayActivityDataStore.kt", l = {415}, m = "invokeSuspend", v = 2)
public final class q1 extends v13.i implements e23.p<o53.b0, t13.d<? super com.garmin.android.apps.connectmobile.userprofile.model.l>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<o53.b0, t13.d<? super com.garmin.android.apps.connectmobile.userprofile.model.l>, Object> f22021c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/userprofile/model/l;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore$getUserSocialProfile$2$1$result$1", f = "MultiDayActivityDataStore.kt", l = {WalletConstants.ERROR_CODE_UNKNOWN}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super com.garmin.android.apps.connectmobile.userprofile.model.l>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<o53.b0, t13.d<? super com.garmin.android.apps.connectmobile.userprofile.model.l>, Object> f22024c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.p<? super o53.b0, ? super t13.d<? super com.garmin.android.apps.connectmobile.userprofile.model.l>, ? extends Object> pVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f22024c = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f22024c, dVar);
            aVar.f22023b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super com.garmin.android.apps.connectmobile.userprofile.model.l> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f22023b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f22022a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f22023b = null;
            this.f22022a = 1;
            Object objInvoke = this.f22024c.invoke(b0Var, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q1(e23.p<? super o53.b0, ? super t13.d<? super com.garmin.android.apps.connectmobile.userprofile.model.l>, ? extends Object> pVar, t13.d<? super q1> dVar) {
        super(2, dVar);
        this.f22021c = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q1 q1Var = new q1(this.f22021c, dVar);
        q1Var.f22020b = obj;
        return q1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super com.garmin.android.apps.connectmobile.userprofile.model.l> dVar) {
        return ((q1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f22020b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f22019a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        x53.c cVar = o53.s0.f129406a;
        o53.j0 j0VarJ = ge1.b.j(b0Var, x53.b.f189152a, null, new a(this.f22021c, null), 2);
        this.f22020b = null;
        this.f22019a = 1;
        Object objC = j0VarJ.C(this);
        return objC == aVar ? aVar : objC;
    }
}
