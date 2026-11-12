package rs2;

import com.garmin.gfdi.GfdiException;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ByteString;
import java.io.Serializable;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrs2/t;", "", "Ldt2/g;", "messenger", "Lt13/d;", "Lcom/garmin/proto/generated/GDICore$GarminGuidOverwriteResponse;", "continuation", "<init>", "(Ldt2/g;Lt13/d;)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt2.g f154456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t13.d<GDICore.GarminGuidOverwriteResponse> f154457b;

    /* JADX WARN: Multi-variable type inference failed */
    public t(dt2.g gVar, t13.d<? super GDICore.GarminGuidOverwriteResponse> dVar) {
        gVar.getClass();
        this.f154456a = gVar;
        this.f154457b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(byte[] bArr, v13.c cVar) throws Exception {
        r rVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f154452c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f154452c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object objB = rVar.f154450a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f154452c;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                if (d53.w.J(new String(bArr, d53.c.f57666b))) {
                    throw new GfdiException("blank or empty customer GUID", null, 2, null);
                }
                try {
                    GDISmartProto.Smart smartA = pu2.a.a(GDICore.CoreService.newBuilder().setGarminGuidOverwriteRequest(GDICore.GarminGuidOverwriteRequest.newBuilder().setGarminGuid(ByteString.copyFrom(bArr))));
                    smartA.getClass();
                    dt2.g gVar = this.f154456a;
                    rVar.f154452c = 1;
                    objB = gVar.b(smartA, rVar);
                    if (objB == aVar) {
                        return aVar;
                    }
                } catch (Exception e4) {
                    String message = e4.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    throw new GfdiException("failed to create GarminGuidOverwriteRequest: ".concat(message), e4);
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objB);
            }
            GDICore.CoreService coreServiceB = pu2.a.b((GDISmartProto.Smart) objB);
            GDICore.GarminGuidOverwriteResponse garminGuidOverwriteResponse = (coreServiceB == null || !coreServiceB.hasGarminGuidOverwriteResponse()) ? null : coreServiceB.getGarminGuidOverwriteResponse();
            if (garminGuidOverwriteResponse != null) {
                return garminGuidOverwriteResponse;
            }
            throw new GfdiException("device failed to return GarminGuidOverwriteResponse", null, 2, null);
        } catch (Exception e14) {
            if (e14 instanceof GfdiException) {
                throw e14;
            }
            throw new GfdiException("failed to overwrite customer GUID ", e14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(byte[] bArr, v13.c cVar) throws Exception {
        s sVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f154455c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f154455c = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objA = sVar.f154453a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f154455c;
        t13.d<GDICore.GarminGuidOverwriteResponse> dVar = this.f154457b;
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                sVar.f154455c = 1;
                objA = a(bArr, sVar);
                if (objA == obj) {
                    return obj;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA);
            }
            GDICore.GarminGuidOverwriteResponse garminGuidOverwriteResponse = (GDICore.GarminGuidOverwriteResponse) objA;
            if (dVar != null) {
                int i16 = o13.q.f128596b;
                dVar.resumeWith(garminGuidOverwriteResponse);
            }
        } catch (GfdiException e4) {
            if (dVar != null) {
                int i17 = o13.q.f128596b;
                dVar.resumeWith(new o13.q.b(e4));
            }
        }
        return Unit.INSTANCE;
    }
}
