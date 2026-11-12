package zj2;

import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIDataTransferProto;
import com.garmin.proto.generated.GDISmartProto;
import e23.p;
import java.util.LinkedHashMap;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.device.datatransfer.DataTransferService$handleDataUpload$1", f = "DataTransferService.kt", l = {280}, m = "invokeSuspend")
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f204994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GDIDataTransferProto.DataUploadRequest f204995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.k f204996d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "com.garmin.device.datatransfer.DataTransferService$handleDataUpload$1$1", f = "DataTransferService.kt", l = {292, 299}, m = "invokeSuspend")
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f204997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f204998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDIDataTransferProto.DataUploadRequest f204999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ dt2.k f205000d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, GDIDataTransferProto.DataUploadRequest dataUploadRequest, dt2.k kVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f204998b = eVar;
            this.f204999c = dataUploadRequest;
            this.f205000d = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f204998b, this.f204999c, this.f205000d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        
            if (r1.a(r8, r7) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
        
            if (r8.a(r1, r2, r7) == r0) goto L35;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            l lVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f204997a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    e eVar = this.f204998b;
                    LinkedHashMap linkedHashMap = eVar.f204969f;
                    GDIDataTransferProto.DataUploadRequest dataUploadRequest = this.f204999c;
                    synchronized (linkedHashMap) {
                        lVar = (l) eVar.f204969f.get(new Integer(dataUploadRequest.getId()));
                    }
                    if (lVar == null) {
                        Logger logger = this.f204998b.f204972i;
                        if (logger == null) {
                            s.m("logger");
                            throw null;
                        }
                        logger.warn("Received data upload request with unexpected ID " + this.f204999c.getId());
                        GDISmartProto.Smart smartA = qu2.a.a(GDIDataTransferProto.DataTransferService.newBuilder().setDataUploadResponse(GDIDataTransferProto.DataUploadResponse.newBuilder().setId(this.f204999c.getId()).setStatus(GDIDataTransferProto.DataUploadResponse.Status.INVALID_ID)));
                        smartA.getClass();
                        dt2.k kVar = this.f205000d;
                        this.f204997a = 1;
                    } else {
                        GDIDataTransferProto.DataUploadRequest dataUploadRequest2 = this.f204999c;
                        dt2.k kVar2 = this.f205000d;
                        this.f204997a = 2;
                    }
                    return aVar;
                }
                if (i14 != 1) {
                    if (i14 == 2) {
                        r.b(obj);
                        return Unit.INSTANCE;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            } catch (ProtobufException e4) {
                Logger logger2 = this.f204998b.f204972i;
                if (logger2 == null) {
                    s.m("logger");
                    throw null;
                }
                logger2.error("Failed to send protobuf response", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, GDIDataTransferProto.DataUploadRequest dataUploadRequest, dt2.k kVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f204994b = eVar;
        this.f204995c = dataUploadRequest;
        this.f204996d = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f204994b, this.f204995c, this.f204996d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204993a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(this.f204994b, this.f204995c, this.f204996d, null);
            this.f204993a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
