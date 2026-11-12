package gn2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.wifi.WifiDataHandler", f = "WifiDataHandler.kt", l = {358, 360}, m = "storeNetworks")
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f78138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f78139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f78140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78141d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(c cVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f78140c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f78139b = obj;
        this.f78141d |= Integer.MIN_VALUE;
        return this.f78140c.s(null, this);
    }
}
