package w61;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lw61/r0;", "Landroidx/lifecycle/x1$c;", "Lx61/k;", "mapper", "Lcom/garmin/android/apps/connectmobile/performance/model/a;", "cachedLastUsedDevice", "", "cachedDevicesList", "", "overridePreferredDevice", "<init>", "(Lx61/k;Lcom/garmin/android/apps/connectmobile/performance/model/a;Ljava/util/Set;Z)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r0 implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x61.k f183246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.performance.model.a f183247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<com.garmin.android.apps.connectmobile.performance.model.a> f183248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f183249d;

    public /* synthetic */ r0(x61.k kVar, com.garmin.android.apps.connectmobile.performance.model.a aVar, Set set, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(kVar, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? null : set, (i14 & 8) != 0 ? false : z14);
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (!cls.isAssignableFrom(x.class)) {
            vb.h.s("Unknown ViewModel class");
            return null;
        }
        pc0.j jVar = (pc0.j) KoinJavaComponent.get$default(pc0.j.class, null, null, 6, null);
        iw.e eVar = (iw.e) KoinJavaComponent.get$default(iw.e.class, null, null, 6, null);
        eu1.b bVar = (eu1.b) KoinJavaComponent.get$default(eu1.b.class, null, null, 6, null);
        return new x(eVar, jVar, this.f183246a, this.f183247b, this.f183248c, this.f183249d, bVar);
    }

    public r0(x61.k kVar, com.garmin.android.apps.connectmobile.performance.model.a aVar, Set<com.garmin.android.apps.connectmobile.performance.model.a> set, boolean z14) {
        kVar.getClass();
        this.f183246a = kVar;
        this.f183247b = aVar;
        this.f183248c = set;
        this.f183249d = z14;
    }
}
