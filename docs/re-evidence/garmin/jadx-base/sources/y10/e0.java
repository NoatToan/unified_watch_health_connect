package y10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly10/e0;", "Lcom/garmin/android/apps/connectmobile/connectiq/b0$e;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 implements com.garmin.android.apps.connectmobile.connectiq.b0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f193819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o10.b f193820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f193821c;

    public e0(k kVar, o10.b bVar, boolean z14) {
        this.f193819a = kVar;
        this.f193820b = bVar;
        this.f193821c = z14;
    }

    @Override // com.garmin.android.apps.connectmobile.connectiq.b0.e
    public final void a() throws CloneNotSupportedException {
        k kVar = this.f193819a;
        LinkedHashMap<String, o10.b> linkedHashMap = kVar.f193915n;
        o10.b bVar = this.f193820b;
        linkedHashMap.remove(bVar.f());
        Object objClone = kVar.f193916o.clone();
        objClone.getClass();
        kVar.f193916o.clear();
        kVar.f193916o.put(bVar.f(), bVar);
        kVar.f193916o.putAll((HashMap) objClone);
        kVar.f193917p.m(new n0.b(kVar.E4(), kVar.G4(kVar.f193902a), false, null, 12, null));
    }

    @Override // com.garmin.android.apps.connectmobile.connectiq.b0.e
    public final void b() {
        this.f193819a.f193917p.m(new n0.a(this.f193821c));
    }
}
