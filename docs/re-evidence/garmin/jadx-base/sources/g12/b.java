package g12;

import com.garmin.android.apps.connectmobile.R;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zb0.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.ProfileAboutViewModel$processDeviceData$2", f = "ProfileAboutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j12.c f74878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f74879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k22.a f74880c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j12.c cVar, String str, k22.a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f74878a = cVar;
        this.f74879b = str;
        this.f74880c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f74878a, this.f74879b, this.f74880c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        j12.c cVar = this.f74878a;
        if (cVar == null) {
            return null;
        }
        boolean zG = p005kotlin.jvm.internal.s.g(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName(), this.f74879b);
        if (!cVar.getIsReleased() && !zG) {
            cVar.i(this.f74880c.getString(R.string.incomplete_device_default_device_name));
            cVar.h("");
            return Unit.INSTANCE;
        }
        rd2.j jVar = rd2.f.a().f152045a;
        long userDeviceId = cVar.getUserDeviceId();
        jVar.getClass();
        sd2.f fVarI = rd2.j.i(userDeviceId, null);
        if (fVarI == null) {
            return null;
        }
        String strD = t.d(fVarI);
        if (strD != null && strD.length() > 0) {
            cVar.h(strD);
        }
        return Unit.INSTANCE;
    }
}
