package dr0;

import com.garmin.proto.generated.GDIInstantInput;
import com.garmin.proto.generated.GDIInstantInputExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldr0/h;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Ljava/lang/Void;", "", "mDeviceId", "Lcom/garmin/proto/generated/GDIInstantInput$InstantInputEndRequest$Command;", "mCommand", "Lwm2/b;", "mResponseListener", "Lcom/garmin/android/library/backgroundtaskmanagement/b$d;", "priority", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JLcom/garmin/proto/generated/GDIInstantInput$InstantInputEndRequest$Command;Lwm2/b;Lcom/garmin/android/library/backgroundtaskmanagement/b$d;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends com.garmin.android.library.backgroundtaskmanagement.b<Void> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f60837l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final GDIInstantInput.InstantInputEndRequest.Command f60838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wm2.b f60839n;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"dr0/h$a", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends com.garmin.android.library.backgroundtaskmanagement.d {
        public a() {
            super(h.this);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.f
        public final void a() {
            GDIInstantInput.InstantInputService.Builder builderNewBuilder = GDIInstantInput.InstantInputService.newBuilder();
            GDIInstantInput.InstantInputEndRequest.Builder builderNewBuilder2 = GDIInstantInput.InstantInputEndRequest.newBuilder();
            h hVar = h.this;
            builderNewBuilder2.setCommand(hVar.f60838m);
            GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIInstantInputExtension.instantInputService, builderNewBuilder.setEndRequest(builderNewBuilder2).build()).build();
            smartBuild.getClass();
            ((er0.a) KoinJavaComponent.get$default(er0.a.class, null, null, 6, null)).c(smartBuild, hVar.f60837l, hVar.f60839n);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.d
        public final void b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j8, GDIInstantInput.InstantInputEndRequest.Command command, wm2.b bVar, com.garmin.android.library.backgroundtaskmanagement.b.d dVar, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(dVar, aVar);
        command.getClass();
        bVar.getClass();
        dVar.getClass();
        this.f60837l = j8;
        this.f60838m = command;
        this.f60839n = bVar;
        b(new a());
    }
}
