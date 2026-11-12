package et;

import android.content.Context;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDILiveSessionProto;
import com.garmin.proto.generated.GDISmartProto;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activityrecording.presentation.screens.ActivityRecordingScreenKt$ActivityRecordingScreen$9$1", f = "ActivityRecordingScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f65256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zs.c f65257b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, zs.c cVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f65256a = context;
        this.f65257b = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f65256a, this.f65257b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        GDISmartProto.Smart smartC;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        Toast.makeText(this.f65256a, R.string.txt_error_occurred, 0).show();
        us.a aVar2 = this.f65257b.f206789e.f192034b;
        if (aVar2 != null && (smartC = us.a.c(aVar2, GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command.PAUSE, null, 2)) != null) {
            aVar2.d(smartC);
        }
        return Unit.INSTANCE;
    }
}
