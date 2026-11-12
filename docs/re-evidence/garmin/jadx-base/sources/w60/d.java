package w60;

import c83.h;
import com.garmin.android.apps.connectmobile.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw60/d;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lu60/a;", "crossSellingApi", "Lu60/b;", "productSearchApi", "<init>", "(Lu60/a;Lu60/b;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u60.a f183131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u60.b f183132b;

    public /* synthetic */ d(u60.a aVar, u60.b bVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? (u60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, u60.a.class, new h.a[0], null, null, null, 120) : aVar, (i14 & 2) != 0 ? (u60.b) ez0.b.a(ez0.b.f67468a, ez0.c.GCS_API_DI, u60.b.class, new h.a[0], null, null, null, 120) : bVar);
    }

    public d(u60.a aVar, u60.b bVar) {
        aVar.getClass();
        bVar.getClass();
        this.f183131a = aVar;
        this.f183132b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
