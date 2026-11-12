package bm;

import java.util.Map;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbm/l;", "Liu1/l;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements iu1.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f18826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f18827b;

    public l(long j8, k kVar) {
        this.f18826a = j8;
        this.f18827b = kVar;
    }

    @Override // iu1.l
    public final void a(String str, Map map) {
        if (str == null || map == null) {
            return;
        }
        ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).e0(this.f18826a);
        this.f18827b.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, p13.x.m(str, map));
    }
}
