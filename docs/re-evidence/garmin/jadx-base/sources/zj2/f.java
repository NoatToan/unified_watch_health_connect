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
@v13.e(c = "com.garmin.device.datatransfer.DataTransferService$handleDataDownload$1", f = "DataTransferService.kt", l = {253}, m = "invokeSuspend")
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f204986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GDIDataTransferProto.DataDownloadRequest f204987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.k f204988d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "com.garmin.device.datatransfer.DataTransferService$handleDataDownload$1$1", f = "DataTransferService.kt", l = {266, 273}, m = "invokeSuspend")
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f204989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f204990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDIDataTransferProto.DataDownloadRequest f204991c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ dt2.k f204992d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, GDIDataTransferProto.DataDownloadRequest dataDownloadRequest, dt2.k kVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f204990b = eVar;
            this.f204991c = dataDownloadRequest;
            this.f204992d = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f204990b, this.f204991c, this.f204992d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
        
            if (r1.a(r8, r7) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
        
            if (r8.d(r1, r2, r7) == r0) goto L35;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            d dVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f204989a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    e eVar = this.f204990b;
                    LinkedHashMap linkedHashMap = eVar.f204968e;
                    GDIDataTransferProto.DataDownloadRequest dataDownloadRequest = this.f204991c;
                    synchronized (linkedHashMap) {
                        dVar = (d) eVar.f204968e.get(new Integer(dataDownloadRequest.getId()));
                    }
                    if (dVar == null) {
                        Logger logger = this.f204990b.f204972i;
                        if (logger == null) {
                            s.m("logger");
                            throw null;
                        }
                        logger.warn("Received data download request with unexpected ID " + this.f204991c.getId());
                        GDISmartProto.Smart smartA = qu2.a.a(GDIDataTransferProto.DataTransferService.newBuilder().setDataDownloadResponse(GDIDataTransferProto.DataDownloadResponse.newBuilder().setId(this.f204991c.getId()).setOffset(0).setStatus(GDIDataTransferProto.DataDownloadResponse.Status.INVALID_ID)));
                        smartA.getClass();
                        dt2.k kVar = this.f204992d;
                        this.f204989a = 1;
                    } else {
                        GDIDataTransferProto.DataDownloadRequest dataDownloadRequest2 = this.f204991c;
                        dt2.k kVar2 = this.f204992d;
                        this.f204989a = 2;
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
                Logger logger2 = this.f204990b.f204972i;
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
    public f(e eVar, GDIDataTransferProto.DataDownloadRequest dataDownloadRequest, dt2.k kVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f204986b = eVar;
        this.f204987c = dataDownloadRequest;
        this.f204988d = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f204986b, this.f204987c, this.f204988d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204985a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(this.f204986b, this.f204987c, this.f204988d, null);
            this.f204985a = 1;
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
