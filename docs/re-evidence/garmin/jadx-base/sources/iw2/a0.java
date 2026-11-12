package iw2;

import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RealTimeSettingsDeviceCommunicationBuilder$sendWatchFaceGridValueChangeRequest$2", f = "RealTimeSettingsDeviceCommunicationBuilder.kt", l = {662}, m = "invokeSuspend", v = 1)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f95349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lw2.b f95350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GDIRealtimeSettingsProto.RealtimeSettingsService.Builder f95351d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "com.garmin.realtimesettings.app.datahandler.RealTimeSettingsDeviceCommunicationBuilder$sendWatchFaceGridValueChangeRequest$2$1", f = "RealTimeSettingsDeviceCommunicationBuilder.kt", l = {663}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f95352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lw2.b f95353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDIRealtimeSettingsProto.RealtimeSettingsService.Builder f95354c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lw2.b bVar, GDIRealtimeSettingsProto.RealtimeSettingsService.Builder builder, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f95353b = bVar;
            this.f95354c = builder;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f95353b, this.f95354c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super String> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f95352a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            GDIRealtimeSettingsProto.RealtimeSettingsService.Builder builder = this.f95354c;
            builder.getClass();
            this.f95352a = 1;
            Object objD = this.f95353b.d(builder, this);
            return objD == aVar ? aVar : objD;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p0 p0Var, lw2.b bVar, GDIRealtimeSettingsProto.RealtimeSettingsService.Builder builder, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f95349b = p0Var;
        this.f95350c = bVar;
        this.f95351d = builder;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f95349b, this.f95350c, this.f95351d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super String> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f95348a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(this.f95350c, this.f95351d, null);
                this.f95348a = 1;
                obj = ge1.b.e0(bVar, aVar2, this);
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
            return (String) obj;
        } catch (ProtobufException e4) {
            cx2.h hVar = this.f95349b.f95499a;
            String strN = fb1.c.n("sendWatchFaceGridValueChangeRequest: exception ", e4.getMessage());
            Logger logger = cx2.h.f56678c;
            hVar.d(null, strN);
            return null;
        }
    }
}
