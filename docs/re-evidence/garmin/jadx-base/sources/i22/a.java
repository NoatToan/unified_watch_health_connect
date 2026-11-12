package i22;

import com.garmin.android.apps.connectmobile.util.location.ConnectedGPSService;
import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.util.location.ConnectedGPSService", f = "ConnectedGPSService.kt", l = {210}, m = "queryDeviceDisplayNames", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rd2.f f87376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f87377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f87378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f87379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f87380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f87381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f87382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConnectedGPSService f87383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f87384i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ConnectedGPSService connectedGPSService, t13.d<? super a> dVar) {
        super(dVar);
        this.f87383h = connectedGPSService;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f87382g = obj;
        this.f87384i |= Integer.MIN_VALUE;
        return ConnectedGPSService.a(this.f87383h, null, null, this);
    }
}
