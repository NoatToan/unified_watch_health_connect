package tv;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.gcsprotos.generated.FitnessDeviceProto;
import com.garmin.gcsprotos.generated.RequestTypesProto;
import com.garmin.gcsprotos.generated.ResponseTypesProto;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ltv/m;", "Lgk0/a;", "Lcom/garmin/gcsprotos/generated/FitnessDeviceProto$FitnessDeviceServiceResponse;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lf12/b;", "userAccount", "<init>", "(Landroid/content/Context;Lf12/b;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends gk0.a<FitnessDeviceProto.FitnessDeviceServiceResponse> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f12.b f166528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ib2.a<RequestTypesProto.ServiceRequest> f166529d;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltv/m$a;", "Lib2/a;", "Lcom/garmin/gcsprotos/generated/RequestTypesProto$ServiceRequest;", "Lf12/b;", "userAccount", "", "deviceId", "<init>", "(Lf12/b;J)V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements ib2.a<RequestTypesProto.ServiceRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f12.b f166530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f166531b;

        public a(f12.b bVar, long j8) {
            bVar.getClass();
            this.f166530a = bVar;
            this.f166531b = j8;
        }

        @Override // ib2.a
        public final RequestTypesProto.ServiceRequest b() {
            sc2.j jVarD = this.f166530a.d();
            String str = jVarD.f158514a;
            RequestTypesProto.ServiceRequest serviceRequestBuild = RequestTypesProto.ServiceRequest.newBuilder().setFitnessDeviceServiceRequest(FitnessDeviceProto.FitnessDeviceServiceRequest.newBuilder().setMessageListRequest(FitnessDeviceProto.MessageListRequest.newBuilder().setUserToken(str).setTokenSecret(jVarD.f158515b).addDeviceId(this.f166531b))).build();
            serviceRequestBuild.getClass();
            return serviceRequestBuild;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, f12.b bVar) {
        super(context);
        context.getClass();
        bVar.getClass();
        this.f166528c = bVar;
        this.f166529d = new com.garmin.android.ancs.a(1);
    }

    @Override // gk0.f
    public final Object a(List list) {
        Object next;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((ResponseTypesProto.ServiceResponse) next).hasFitnessDeviceServiceResponse());
            ResponseTypesProto.ServiceResponse serviceResponse = (ResponseTypesProto.ServiceResponse) next;
            if (serviceResponse != null) {
                return serviceResponse.getFitnessDeviceServiceResponse();
            }
        }
        return null;
    }

    @Override // gk0.f
    public final List<RequestTypesProto.ServiceRequest> prepare() {
        return w.c(this.f166529d.b());
    }
}
