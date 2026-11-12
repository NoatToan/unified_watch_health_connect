package ts2;

import com.garmin.proto.generated.GDIConnectedDevicesReporting;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.connecteddevices.ConnectedDevicesHandler", f = "ConnectedDevicesHandler.kt", l = {279, 291}, m = "notifyAboutConnection")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f166214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f166215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f166216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f166217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f166216c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f166215b = obj;
        this.f166217d |= Integer.MIN_VALUE;
        az2.a<Long, Set<GDIConnectedDevicesReporting.ConnectedDevice>> aVar = b.f166194i;
        return this.f166216c.m(null, this);
    }
}
