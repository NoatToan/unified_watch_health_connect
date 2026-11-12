package me2;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lme2/f;", "Lqe2/a;", "Lcom/google/maps/android/clustering/ClusterItem;", "Lcom/garmin/android/library/mapsdkadapter/p;", "markerOptions", "", "clusterType", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/p;Ljava/lang/Integer;)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements qe2.a, ClusterItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.p f118168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f118169b;

    public /* synthetic */ f(com.garmin.android.library.mapsdkadapter.p pVar, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this(pVar, (i14 & 2) != 0 ? 0 : num);
    }

    @Override // qe2.a
    public final void a(float f14) {
        this.f118168a.f50327a.f50311c = f14;
    }

    @Override // qe2.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getF125697b() {
        return this.f118169b;
    }

    @Override // qe2.a
    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.garmin.android.library.mapsdkadapter.p getF125696a() {
        return this.f118168a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return p005kotlin.jvm.internal.s.g(this.f118168a, ((f) obj).f118168a);
    }

    @Override // qe2.a
    public final void f(Bitmap bitmap) {
        this.f118168a.c(bitmap);
    }

    @Override // com.google.maps.android.clustering.ClusterItem
    /* JADX INFO: renamed from: getPosition, reason: collision with other method in class */
    public final LatLng mo335getPosition() {
        return z.d(this.f118168a.f50327a.f50309a);
    }

    @Override // com.google.maps.android.clustering.ClusterItem
    public final String getSnippet() {
        return this.f118168a.f50327a.f50313e;
    }

    @Override // qe2.a
    public final Object getTag() {
        return this.f118168a.f50327a.f50322n;
    }

    @Override // com.google.maps.android.clustering.ClusterItem
    public final String getTitle() {
        return this.f118168a.f50327a.f50312d;
    }

    @Override // com.google.maps.android.clustering.ClusterItem
    /* JADX INFO: renamed from: getZIndex, reason: collision with other method in class */
    public final Float mo336getZIndex() {
        return Float.valueOf(this.f118168a.f50327a.f50311c);
    }

    public final int hashCode() {
        return this.f118168a.hashCode();
    }

    @Override // qe2.a
    public final com.garmin.android.library.mapsdkadapter.f getPosition() {
        return this.f118168a.f50327a.f50309a;
    }

    @Override // qe2.a
    public final float getZIndex() {
        return this.f118168a.f50327a.f50311c;
    }

    public f(com.garmin.android.library.mapsdkadapter.p pVar, Integer num) {
        pVar.getClass();
        this.f118168a = pVar;
        this.f118169b = num;
    }
}
