package zb0;

import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.DeviceImageLoader$Companion", f = "DeviceImageLoader.kt", l = {110, 116}, m = "solveRegisteredDevicesImages", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f203684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f203685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f203686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f203687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f203688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f203689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x.a f203690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f203691h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x.a aVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f203690g = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f203689f = obj;
        this.f203691h |= Integer.MIN_VALUE;
        return this.f203690g.a(null, this);
    }
}
