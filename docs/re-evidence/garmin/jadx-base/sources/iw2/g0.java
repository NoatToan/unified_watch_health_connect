package iw2;

import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RealTimeSettingsDeviceCommunicationBuilder$setIntegerPickerSettingsDataValue$2", f = "RealTimeSettingsDeviceCommunicationBuilder.kt", l = {278}, m = "invokeSuspend", v = 1)
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lw2.b f95423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GDIRealtimeSettingsProto.RealtimeSettingsService.Builder f95424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f95425d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(lw2.b bVar, GDIRealtimeSettingsProto.RealtimeSettingsService.Builder builder, p0 p0Var, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f95423b = bVar;
        this.f95424c = builder;
        this.f95425d = p0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g0(this.f95423b, this.f95424c, this.f95425d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super String> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f95422a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                lw2.b bVar = this.f95423b;
                GDIRealtimeSettingsProto.RealtimeSettingsService.Builder builder = this.f95424c;
                builder.getClass();
                this.f95422a = 1;
                obj = bVar.d(builder, this);
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
            cx2.h hVar = this.f95425d.f95499a;
            String strN = fb1.c.n("setIntegerPickerSettingsDataValue: Timeout ", e4.getMessage());
            Logger logger = cx2.h.f56678c;
            hVar.d(null, strN);
            return null;
        }
    }
}
