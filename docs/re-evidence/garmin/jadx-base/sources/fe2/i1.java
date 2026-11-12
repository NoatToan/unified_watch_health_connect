package fe2;

import android.content.Context;
import com.garmin.proto.generated.GDIGroupLiveTrack;
import com.garmin.proto.generated.GDIGroupLiveTrackExtension;
import com.garmin.proto.generated.GDISmartProto;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.domain.GrouptrackManager$Companion$respondWithGroupLiveTrackService$2", f = "GrouptrackManager.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GDIGroupLiveTrack.GroupLiveTrackService.Builder f70780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f70781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f70782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f70783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(GDIGroupLiveTrack.GroupLiveTrackService.Builder builder, Context context, String str, int i14, t13.d<? super i1> dVar) {
        super(2, dVar);
        this.f70780a = builder;
        this.f70781b = context;
        this.f70782c = str;
        this.f70783d = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i1(this.f70780a, this.f70781b, this.f70782c, this.f70783d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
        builderNewBuilder.getClass();
        GDIGroupLiveTrack.GroupLiveTrackService.Builder builder = this.f70780a;
        builder.getClass();
        builderNewBuilder.setExtension(GDIGroupLiveTrackExtension.groupLiveTrackService, builder.build());
        GDISmartProto.Smart smartBuild = builderNewBuilder.build();
        da2.d dVarC = da2.d.c(this.f70781b);
        String str = this.f70782c;
        wm2.a aVar2 = (wm2.a) dVarC.getCapability(str, wm2.a.class);
        if (aVar2 == null) {
            return null;
        }
        smartBuild.getClass();
        aVar2.respondToRequest(this.f70783d, str, smartBuild);
        return Unit.INSTANCE;
    }
}
