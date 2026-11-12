package fv;

import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.bic.connectiontype.data.ConnectionManagementProtobufDataHandler", f = "ConnectionManagementProtobufDataHandler.kt", l = {55}, m = "updateBleConnectionType", v = 2)
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f73613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f73614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f73615c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, d<? super b> dVar) {
        super(dVar);
        this.f73614b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f73613a = obj;
        this.f73615c |= Integer.MIN_VALUE;
        return this.f73614b.c(null, this);
    }
}
