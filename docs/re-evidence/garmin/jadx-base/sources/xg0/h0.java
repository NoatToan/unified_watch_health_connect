package xg0;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lxg0/h0;", "", "Lwg0/d;", "Lrs/h;", "mapView", "Lrs/f;", "legendViewHolder", "Lrs/c;", "dataConfig", "Lrs/d;", "legendConfig", "", "activityType", "", "animateMapOnOpen", "<init>", "(Lrs/h;Lrs/f;Lrs/c;Lrs/d;Ljava/lang/String;Z)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rs.h f190769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rs.f f190770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rs.c<wg0.d> f190771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rs.d<wg0.d> f190772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f190773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f190774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qw0.s f190775g;

    public h0(rs.h hVar, rs.f fVar, rs.c<wg0.d> cVar, rs.d<wg0.d> dVar, String str, boolean z14) {
        hVar.getClass();
        cVar.getClass();
        this.f190769a = hVar;
        this.f190770b = fVar;
        this.f190771c = cVar;
        this.f190772d = dVar;
        this.f190773e = str;
        this.f190774f = z14;
        this.f190775g = (qw0.s) KoinJavaComponent.get$default(qw0.s.class, null, null, 6, null);
    }

    public /* synthetic */ h0(rs.h hVar, rs.f fVar, rs.c cVar, rs.d dVar, String str, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(hVar, (i14 & 2) != 0 ? null : fVar, cVar, (i14 & 8) != 0 ? null : dVar, str, (i14 & 32) != 0 ? true : z14);
    }
}
