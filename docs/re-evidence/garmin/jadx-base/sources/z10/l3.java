package z10;

import ch.qos.logback.core.net.SyslogConstants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.UploadConsentEnforceViewModel$updateAccountDeviceUpload$1", f = "UploadConsentEnforceViewModel.kt", l = {SyslogConstants.LOG_LOCAL7}, m = "invokeSuspend", v = 2)
public final class l3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3 f201127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f201128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f201129d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(i3 i3Var, boolean z14, boolean z15, t13.d<? super l3> dVar) {
        super(2, dVar);
        this.f201127b = i3Var;
        this.f201128c = z14;
        this.f201129d = z15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l3(this.f201127b, this.f201128c, this.f201129d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201126a;
        boolean z14 = this.f201128c;
        i3 i3Var = this.f201127b;
        if (i14 == 0) {
            o13.r.b(obj);
            i3Var.f201049b.m(m0.CONSENT_IN_PROGRESS);
            p92.o oVar = p92.o.f136619a;
            this.f201126a = 1;
            obj = oVar.A(z14, this.f201129d, this);
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
        if (((Boolean) obj) != null) {
            if (z14) {
                i3Var.f201049b.m(m0.DEVICE_UPLOAD_CONSENT_GRANTED);
                e23.a<Unit> aVar2 = i3Var.f201050c;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } else {
                i3Var.f201049b.m(m0.DEVICE_UPLOAD_CONSENT_REVOKED);
            }
            ((bv.a) KoinJavaComponent.get$default(bv.a.class, null, null, 6, null)).a(z14);
        } else {
            i3Var.f201049b.m(m0.DEVICE_UPLOAD_CONSENT_UPDATE_ERROR);
        }
        return Unit.INSTANCE;
    }
}
