package iw2;

import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RealTimeSettingsDeviceCommunicationBuilder$fetchDeviceCompositions$2", f = "RealTimeSettingsDeviceCommunicationBuilder.kt", l = {76}, m = "invokeSuspend", v = 1)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f95554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f95555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mw2.c f95556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GDIRealtimeSettingsProto.RealtimeSettingsService.Builder f95557e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p0 p0Var, int i14, mw2.c cVar, GDIRealtimeSettingsProto.RealtimeSettingsService.Builder builder, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f95554b = p0Var;
        this.f95555c = i14;
        this.f95556d = cVar;
        this.f95557e = builder;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f95554b, this.f95555c, this.f95556d, this.f95557e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f95553a;
        p0 p0Var = this.f95554b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                p0Var.f95499a.getClass();
                mw2.c cVar = this.f95556d;
                int i15 = this.f95555c;
                GDIRealtimeSettingsProto.RealtimeSettingsService.Builder builder = this.f95557e;
                builder.getClass();
                this.f95553a = 1;
                obj = cVar.d(i15, builder, this);
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
            zBooleanValue = ((Boolean) obj).booleanValue();
        } catch (ProtobufException e4) {
            p0Var.f95499a.d(e4, "fetchDeviceCompositions: Caught exception");
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
