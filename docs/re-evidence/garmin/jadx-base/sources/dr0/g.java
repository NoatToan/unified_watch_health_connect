package dr0;

import com.garmin.proto.generated.GDIInstantInput;
import com.garmin.proto.generated.GDIInstantInputExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldr0/g;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Ljava/lang/Void;", "", "mDeviceId", "", "requestId", "Lcom/garmin/proto/generated/GDIInstantInput$CommandResult;", "result", "Lcom/garmin/android/library/backgroundtaskmanagement/b$d;", "priority", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JILcom/garmin/proto/generated/GDIInstantInput$CommandResult;Lcom/garmin/android/library/backgroundtaskmanagement/b$d;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends com.garmin.android.library.backgroundtaskmanagement.b<Void> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f60833l;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"dr0/g$a", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends com.garmin.android.library.backgroundtaskmanagement.d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ GDIInstantInput.CommandResult f60835j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f60836k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GDIInstantInput.CommandResult commandResult, int i14) {
            super(g.this);
            this.f60835j = commandResult;
            this.f60836k = i14;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.f
        public final void a() {
            GDIInstantInput.InstantInputService.Builder builderNewBuilder = GDIInstantInput.InstantInputService.newBuilder();
            GDIInstantInput.InstantInputStartResponse.Builder builderNewBuilder2 = GDIInstantInput.InstantInputStartResponse.newBuilder();
            builderNewBuilder2.setResult(this.f60835j);
            GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIInstantInputExtension.instantInputService, builderNewBuilder.setStartResponse(builderNewBuilder2).build()).build();
            smartBuild.getClass();
            ((er0.a) KoinJavaComponent.get$default(er0.a.class, null, null, 6, null)).a(this.f60836k, g.this.f60833l, smartBuild);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.d
        public final void b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j8, int i14, GDIInstantInput.CommandResult commandResult, com.garmin.android.library.backgroundtaskmanagement.b.d dVar, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(dVar, aVar);
        dVar.getClass();
        this.f60833l = j8;
        b(new a(commandResult, i14));
    }
}
