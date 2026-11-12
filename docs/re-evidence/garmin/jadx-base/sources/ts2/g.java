package ts2;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.connecteddevices.ConnectedDevicesHandler", f = "ConnectedDevicesHandler.kt", l = {201, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "onConnectionAlert$gfdi_release")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f166230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f166231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f166232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f166233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f166232c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f166231b = obj;
        this.f166233d |= Integer.MIN_VALUE;
        return this.f166232c.r(null, null, this);
    }
}
