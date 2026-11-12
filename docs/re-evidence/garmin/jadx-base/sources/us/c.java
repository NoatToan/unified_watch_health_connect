package us;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIEventSharingProto;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.activityrecording.data.device.ActivityRecordingProtobufDataHandler$unsubscribeEventSharing$1", f = "ActivityRecordingProtobufDataHandler.kt", l = {139}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f172357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f172358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f172359c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, d<? super c> dVar) {
        super(2, dVar);
        this.f172359c = aVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        c cVar = new c(this.f172359c, dVar);
        cVar.f172358b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f172358b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f172357a;
        try {
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = this.f172359c;
                kk2.a aVar3 = aVar2.f172334b;
                GDIEventSharingProto.AlertType alertType = GDIEventSharingProto.AlertType.LIVE_SESSION;
                this.f172358b = b0Var;
                this.f172357a = 1;
                Object objL = aVar3.l(w.c(alertType), aVar2, this);
                if (objL != aVar) {
                    objL = Unit.INSTANCE;
                }
                if (objL == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            a2 a2Var = a2.ACTIVITY_RECORDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "ActivityRecordingProtobufDataHandler", "unsubscribeEventSharing status success");
        } catch (Exception e4) {
            a2 a2Var2 = a2.ACTIVITY_RECORDING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "unsubscribeEventSharing error ");
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "ActivityRecordingProtobufDataHandler", strD);
        }
        return Unit.INSTANCE;
    }
}
