package fe2;

import android.content.Context;
import com.garmin.proto.generated.GDILiveTrackMessagingExtension;
import com.garmin.proto.generated.GDILiveTrackMessagingProto;
import com.garmin.proto.generated.GDISmartProto;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.domain.GrouptrackManager$Companion$respond$2", f = "GrouptrackManager.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GDILiveTrackMessagingProto.LiveTrackMessagingService.Builder f70768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f70769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f70770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f70771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(GDILiveTrackMessagingProto.LiveTrackMessagingService.Builder builder, Context context, String str, int i14, t13.d<? super h1> dVar) {
        super(2, dVar);
        this.f70768a = builder;
        this.f70769b = context;
        this.f70770c = str;
        this.f70771d = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h1(this.f70768a, this.f70769b, this.f70770c, this.f70771d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
        builderNewBuilder.getClass();
        GDILiveTrackMessagingProto.LiveTrackMessagingService.Builder builder = this.f70768a;
        builder.getClass();
        builderNewBuilder.setExtension(GDILiveTrackMessagingExtension.liveTrackMessagingService, builder.build());
        GDISmartProto.Smart smartBuild = builderNewBuilder.build();
        da2.d dVarC = da2.d.c(this.f70769b);
        String str = this.f70770c;
        wm2.a aVar2 = (wm2.a) dVarC.getCapability(str, wm2.a.class);
        if (aVar2 == null) {
            return null;
        }
        smartBuild.getClass();
        aVar2.respondToRequest(this.f70771d, str, smartBuild);
        return Unit.INSTANCE;
    }
}
