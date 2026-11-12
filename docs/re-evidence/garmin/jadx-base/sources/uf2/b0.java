package uf2;

import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIDataTypes;
import com.garmin.proto.generated.GDILiveSessionExtension;
import com.garmin.proto.generated.GDILiveSessionProto;
import com.garmin.proto.generated.GDISmartProto;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityInteractorAppToDevice$sendConfirmFinalizeSetRequest$1$1$1", f = "LiveActivityInteractorAppToDevice.kt", l = {241}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f170300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f170301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Float f170302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GDIDataTypes.MeasurementUnit f170303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o13.p<Integer, Integer> f170304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dt2.g f170305g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(int i14, Integer num, Float f14, GDIDataTypes.MeasurementUnit measurementUnit, o13.p<Integer, Integer> pVar, dt2.g gVar, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f170300b = i14;
        this.f170301c = num;
        this.f170302d = f14;
        this.f170303e = measurementUnit;
        this.f170304f = pVar;
        this.f170305g = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b0(this.f170300b, this.f170301c, this.f170302d, this.f170303e, this.f170304f, this.f170305g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170299a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                GDILiveSessionProto.SetConfigurationRequest.Builder builderNewBuilder = GDILiveSessionProto.SetConfigurationRequest.newBuilder();
                builderNewBuilder.setStepIndex(this.f170300b);
                Integer num2 = this.f170301c;
                if (num2 != null) {
                    builderNewBuilder.setReps(num2.intValue());
                }
                Float f14 = this.f170302d;
                if (f14 != null) {
                    builderNewBuilder.setWeight(f14.floatValue());
                }
                GDIDataTypes.MeasurementUnit measurementUnit = this.f170303e;
                if (measurementUnit != null) {
                    builderNewBuilder.setWeightUnit(measurementUnit);
                }
                o13.p<Integer, Integer> pVar = this.f170304f;
                if (pVar != null) {
                    builderNewBuilder.setExerciseCategory(pVar.f128594a.intValue());
                }
                if (pVar != null && (num = pVar.f128595b) != null) {
                    builderNewBuilder.setExerciseSubcategory(num.intValue());
                }
                GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder2 = GDILiveSessionProto.LiveSessionService.newBuilder();
                builderNewBuilder2.setSetConfigurationRequest(builderNewBuilder.build());
                GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                builderNewBuilder3.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder2.build());
                dt2.g gVar = this.f170305g;
                GDISmartProto.Smart smartBuild = builderNewBuilder3.build();
                smartBuild.getClass();
                this.f170299a = 1;
                if (gVar.c(smartBuild, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (ProtobufException e4) {
            zg2.c.f204692a.getClass();
            zg2.c.b("LiveActivityInteractorAppToDevice", "sendConfirmFinalizeSetRequest error - " + e4);
        }
        return Unit.INSTANCE;
    }
}
