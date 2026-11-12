package aq1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.library.backgroundtaskmanagement.BizOperationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ljava/lang/Void;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksRepositoryImpl$saveSocialProfile$2", f = "StartupChecksRepositoryImpl.kt", l = {127}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends Void>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.model.m f12433c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.garmin.android.apps.connectmobile.userprofile.model.m mVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f12433c = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f12433c, dVar);
        tVar.f12432b = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends Void>> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f12432b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12431a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                o53.r<Void> rVarK = new gw.f0(this.f12433c, null).k();
                this.f12432b = b0Var;
                this.f12431a = 1;
                obj = ((o53.s) rVarK).C(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return new v2.b(obj, 200, null, null, 12, null);
        } catch (BizOperationException e4) {
            String str = "SAVE USER SOCIAL PROFILE -> server call failed with status=[" + e4.getStatus() + "]";
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "StartupChecksRepository", str);
            return new v2.a(e4, null, null, 6, null);
        }
    }
}
