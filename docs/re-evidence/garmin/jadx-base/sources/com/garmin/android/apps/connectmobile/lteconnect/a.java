package com.garmin.android.apps.connectmobile.lteconnect;

import android.os.Handler;
import android.os.Looper;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.proto.generated.GDILTEExtension;
import com.garmin.proto.generated.GDILTEProto;
import com.garmin.proto.generated.GDISmartProto;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import po.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/lteconnect/a;", "", "<init>", "()V", "a", "c", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0686a f38717b = new C0686a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f38718c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f38719a;

    public interface b {
        void a();

        void b(String str, String str2, boolean z14);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/lteconnect/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN,
        OK,
        /* JADX INFO: Fake field, exist only in values array */
        NOT_AN_LTE_DEVICE,
        /* JADX INFO: Fake field, exist only in values array */
        ERROR
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/lteconnect/a$d", "Lwm2/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements wm2.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f38723b;

        public d(b bVar) {
            this.f38723b = bVar;
        }

        @Override // wm2.b
        public final void onResponseFailed(int i14) {
            new Handler(Looper.getMainLooper()).post(new g(this.f38723b, 1));
        }

        @Override // wm2.b
        public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
            smart.getClass();
            new Handler(Looper.getMainLooper()).post(new fh2.a(smart, 21, a.this, this.f38723b));
        }
    }

    public /* synthetic */ a(j jVar) {
        this();
    }

    public final void a(long j8, b bVar) {
        this.f38719a = Long.valueOf(j8);
        GDILTEProto.LTEDeviceInfoRequest.Builder builderNewBuilder = GDILTEProto.LTEDeviceInfoRequest.newBuilder();
        builderNewBuilder.getClass();
        GDILTEProto.LTEService.Builder builderNewBuilder2 = GDILTEProto.LTEService.newBuilder();
        builderNewBuilder2.getClass();
        builderNewBuilder2.setLteDeviceInfoRequest(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.getClass();
        builderNewBuilder3.setExtension(GDILTEExtension.lteService, builderNewBuilder2.build());
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        GDISmartProto.Smart smartBuild = builderNewBuilder3.build();
        smartBuild.getClass();
        Long l14 = this.f38719a;
        l14.getClass();
        protobufRequestManager.initiateRequest(smartBuild, l14.longValue(), new d(bVar));
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.lteconnect.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/lteconnect/a$a;", "", "<init>", "()V", "Lcom/garmin/android/apps/connectmobile/lteconnect/a;", "newInstance", "Lcom/garmin/android/apps/connectmobile/lteconnect/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0686a {
        public /* synthetic */ C0686a(j jVar) {
            this();
        }

        private C0686a() {
        }
    }

    private a() {
    }
}
