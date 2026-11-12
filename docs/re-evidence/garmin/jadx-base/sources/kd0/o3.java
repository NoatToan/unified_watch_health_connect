package kd0;

import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.proto.generated.GDISmartProto;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/o3;", "Ler0/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o3 implements er0.a {
    @Override // er0.a
    public final void a(int i14, long j8, GDISmartProto.Smart smart) {
        ProtobufRequestManager.getInstance().respondToRequest(i14, j8, smart);
    }

    @Override // er0.a
    public final void c(GDISmartProto.Smart smart, long j8, wm2.b bVar) {
        ProtobufRequestManager.getInstance().initiateRequest(smart, j8, bVar);
    }
}
