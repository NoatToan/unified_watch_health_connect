package zj2;

import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIDataTransferProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
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
@v13.e(c = "com.garmin.device.datatransfer.DataTransferService$handleFileAccessItem$1", f = "DataTransferService.kt", l = {222}, m = "invokeSuspend")
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f205001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f205002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GDIDataTransferProto.FileAccessItemRequest f205003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.k f205004d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "com.garmin.device.datatransfer.DataTransferService$handleFileAccessItem$1$1", f = "DataTransferService.kt", l = {PsExtractor.VIDEO_STREAM_MASK, 246}, m = "invokeSuspend")
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f205005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f205006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDIDataTransferProto.FileAccessItemRequest f205007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ dt2.k f205008d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, GDIDataTransferProto.FileAccessItemRequest fileAccessItemRequest, dt2.k kVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f205006b = eVar;
            this.f205007c = fileAccessItemRequest;
            this.f205008d = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f205006b, this.f205007c, this.f205008d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        
            if (r8.e(r2, r1, r4, r7) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
        
            if (r1.a(r8, r7) == r0) goto L39;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            d dVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f205005a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    e eVar = this.f205006b;
                    LinkedHashMap linkedHashMap = eVar.f204968e;
                    GDIDataTransferProto.FileAccessItemRequest fileAccessItemRequest = this.f205007c;
                    synchronized (linkedHashMap) {
                        dVar = (d) eVar.f204968e.get(new Integer(fileAccessItemRequest.getDataXferId()));
                    }
                    mk2.d dVar2 = this.f205006b.f204967d;
                    if (dVar2 == null || dVar == null) {
                        GDIDataTransferProto.FileAccessItemResponse.Builder dataXferId = GDIDataTransferProto.FileAccessItemResponse.newBuilder().setDataXferId(this.f205007c.getDataXferId());
                        e eVar2 = this.f205006b;
                        if (dVar == null) {
                            Logger logger = eVar2.f204972i;
                            if (logger == null) {
                                s.m("logger");
                                throw null;
                            }
                            logger.warn("Received file access request with unexpected ID " + this.f205007c.getDataXferId());
                            dataXferId.setStatus(GDIDataTransferProto.FileAccessItemResponse.Status.INVALID_ID);
                        } else {
                            Logger logger2 = eVar2.f204972i;
                            if (logger2 == null) {
                                s.m("logger");
                                throw null;
                            }
                            logger2.warn("Received file access request with no Sync 2 service available");
                            dataXferId.setStatus(GDIDataTransferProto.FileAccessItemResponse.Status.UNKNOWN);
                        }
                        GDISmartProto.Smart smartA = qu2.a.a(GDIDataTransferProto.DataTransferService.newBuilder().setFileAccessItemResponse(dataXferId));
                        smartA.getClass();
                        dt2.k kVar = this.f205008d;
                        this.f205005a = 1;
                    } else {
                        GDIDataTransferProto.FileAccessItemRequest fileAccessItemRequest2 = this.f205007c;
                        dt2.k kVar2 = this.f205008d;
                        this.f205005a = 2;
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
                Logger logger3 = this.f205006b.f204972i;
                if (logger3 == null) {
                    s.m("logger");
                    throw null;
                }
                logger3.error("Failed to send protobuf response", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, GDIDataTransferProto.FileAccessItemRequest fileAccessItemRequest, dt2.k kVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f205002b = eVar;
        this.f205003c = fileAccessItemRequest;
        this.f205004d = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f205002b, this.f205003c, this.f205004d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f205001a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(this.f205002b, this.f205003c, this.f205004d, null);
            this.f205001a = 1;
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
