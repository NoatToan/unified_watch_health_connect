package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import com.garmin.proto.generated.GDILimitedUi;
import dt2.k;
import e23.l;
import o53.b0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35732c;

    public /* synthetic */ f(int i14, Object obj, Object obj2) {
        this.f35730a = i14;
        this.f35731b = obj;
        this.f35732c = obj2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f35730a) {
            case 0:
                return LimitedUiProtobufDataHandler.C38821.invokeSuspend$lambda$3$0((b0) this.f35731b, (GDILimitedUi.FavoriteSportsResponse) this.f35732c, (Exception) obj);
            case 1:
                return LimitedUiProtobufDataHandler.C38831.invokeSuspend$lambda$0((LimitedUiProtobufDataHandler) this.f35731b, (k) this.f35732c, ((Boolean) obj).booleanValue());
            default:
                return LimitedUiProtobufDataHandler.sendLogPermissionResponseToDevice$lambda$0((LimitedUiProtobufDataHandler) this.f35731b, (GDILimitedUi.LogPermissionResponse.Builder) this.f35732c, (Exception) obj);
        }
    }
}
