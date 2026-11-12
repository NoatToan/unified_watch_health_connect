package px2;

import com.garmin.proto.generated.GDIGarminHealth;
import com.garmin.proto.generated.GDISaMD;
import com.garmin.proto.generated.GDISmartProto;
import d53.w;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.protoimpl.GarminHealthServiceHandler$sendUpdateSaMDId$2", f = "GarminHealthServiceHandler.kt", l = {88}, m = "invokeSuspend")
public final class n extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m0 f141830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f141831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f141832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f141833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f fVar, String str, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f141832c = fVar;
        this.f141833d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f141832c, this.f141833d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        m0 m0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141831b;
        f fVar = this.f141832c;
        if (i14 == 0) {
            r.b(obj);
            Logger logger = fVar.f141794b;
            StringBuilder sb3 = new StringBuilder("sendUpdateSaMDId -> ");
            String str = this.f141833d;
            sb3.append(str);
            logger.debug(sb3.toString());
            m0 m0Var2 = new m0();
            GDIGarminHealth.Service.Builder builderNewBuilder = GDIGarminHealth.Service.newBuilder();
            GDIGarminHealth.UpdateSaMDIdRequest.Builder builderNewBuilder2 = GDIGarminHealth.UpdateSaMDIdRequest.newBuilder();
            if (str != null && !w.J(str)) {
                builderNewBuilder2.setSamdId(str);
            }
            Unit unit = Unit.INSTANCE;
            GDIGarminHealth.Service.Builder updateSamdidRequest = builderNewBuilder.setUpdateSamdidRequest(builderNewBuilder2);
            updateSamdidRequest.getClass();
            this.f141830a = m0Var2;
            this.f141831b = 1;
            dt2.g gVar = fVar.f141780a;
            GDISmartProto.Smart smartA = tu2.a.a(updateSamdidRequest);
            smartA.getClass();
            Object objB = gVar.b(smartA, this);
            if (objB == aVar) {
                return aVar;
            }
            m0Var = m0Var2;
            obj = objB;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m0Var = this.f141830a;
            r.b(obj);
        }
        GDISaMD.Service serviceB = tu2.a.b((GDISmartProto.Smart) obj);
        if (serviceB != null && serviceB.hasGarminHealthService() && !serviceB.getGarminHealthService().isEmpty()) {
            GDIGarminHealth.Service from = GDIGarminHealth.Service.parseFrom(serviceB.getGarminHealthService());
            if (from.hasUpdateSamdidResponse()) {
                m0Var.f105804a = from.getUpdateSamdidResponse().getSuccess();
            }
        }
        if (m0Var.f105804a) {
            fVar.f141794b.debug("sendUpdateSaMDId: response -> success");
        } else {
            fVar.f141794b.error("sendUpdateSaMDId: response -> fail");
        }
        return Boolean.valueOf(m0Var.f105804a);
    }
}
