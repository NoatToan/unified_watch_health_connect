package le2;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lle2/c;", "", "Lke2/b;", ModelSourceWrapper.POSITION, "Landroid/graphics/Bitmap;", "iconBitmap", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "iconBitmapDescriptor", "", "zIndex", "<init>", "(Lke2/b;Landroid/graphics/Bitmap;Lcom/google/android/gms/maps/model/BitmapDescriptor;F)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ke2.b f112058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f112059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BitmapDescriptor f112060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f112061d;

    public c(ke2.b bVar, Bitmap bitmap, BitmapDescriptor bitmapDescriptor, float f14) {
        bVar.getClass();
        this.f112058a = bVar;
        this.f112059b = bitmap;
        this.f112060c = bitmapDescriptor;
        this.f112061d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f112058a.equals(cVar.f112058a) && s.g(this.f112059b, cVar.f112059b) && s.g(this.f112060c, cVar.f112060c) && Float.compare(this.f112061d, cVar.f112061d) == 0;
    }

    public final int hashCode() {
        int iHashCode = this.f112058a.hashCode() * 31;
        Bitmap bitmap = this.f112059b;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        BitmapDescriptor bitmapDescriptor = this.f112060c;
        return Float.hashCode(this.f112061d) + ((iHashCode2 + (bitmapDescriptor != null ? bitmapDescriptor.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MarkerState(position=" + this.f112058a + ", iconBitmap=" + this.f112059b + ", iconBitmapDescriptor=" + this.f112060c + ", zIndex=" + this.f112061d + ")";
    }
}
