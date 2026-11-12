package ne2;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import com.mapbox.geojson.Point;
import com.mapbox.maps.ViewAnnotationAnchorConfig;
import com.mapbox.maps.ViewAnnotationOptions;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotation;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager;
import com.mapbox.maps.viewannotation.ViewAnnotationManager;
import java.lang.annotation.Annotation;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lne2/w;", "Lie2/j;", "Lcom/garmin/android/library/mapsdkadapter/p;", "markerOptions", "Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotation;", "annotation", "Landroid/view/View;", "callout", "Lne2/s;", "mapAdapter", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/p;Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotation;Landroid/view/View;Lne2/s;)V", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w implements ie2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.p f125728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointAnnotation f125729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f125730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f125731d;

    public w(com.garmin.android.library.mapsdkadapter.p pVar, PointAnnotation pointAnnotation, View view2, s sVar) {
        pVar.getClass();
        pointAnnotation.getClass();
        sVar.getClass();
        this.f125728a = pVar;
        this.f125729b = pointAnnotation;
        this.f125730c = view2;
        this.f125731d = sVar;
    }

    @Override // ie2.j
    public final void a(float f14) {
        this.f125728a.f50327a.f50311c = f14;
        Double dValueOf = Double.valueOf(f14);
        PointAnnotation pointAnnotation = this.f125729b;
        pointAnnotation.setSymbolSortKey(dValueOf);
        PointAnnotationManager pointAnnotationManager = this.f125731d.f125706x;
        if (pointAnnotationManager != null) {
            pointAnnotationManager.update(pointAnnotation);
        }
    }

    @Override // ie2.j
    public final void b(Object obj) {
        this.f125728a.f50327a.f50322n = obj;
    }

    @Override // ie2.j
    public final void c(float f14) {
        this.f125728a.f50327a.f50317i = f14;
        Double dValueOf = Double.valueOf(f14);
        PointAnnotation pointAnnotation = this.f125729b;
        pointAnnotation.setIconOpacity(dValueOf);
        PointAnnotationManager pointAnnotationManager = this.f125731d.f125706x;
        if (pointAnnotationManager != null) {
            pointAnnotationManager.update(pointAnnotation);
        }
    }

    @Override // ie2.j
    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.garmin.android.library.mapsdkadapter.p getF118120a() {
        return this.f125728a;
    }

    @Override // ie2.j
    public final void e(String str) {
        this.f125728a.f50327a.f50312d = str;
        View view2 = this.f125730c;
        if (view2 != null) {
            pe2.a.a(view2).f137463b.setText(str);
        }
    }

    public final boolean equals(Object obj) {
        boolean z14 = obj instanceof w;
        PointAnnotation pointAnnotation = this.f125729b;
        if (z14) {
            return pointAnnotation.equals(((w) obj).f125729b);
        }
        if (obj instanceof PointAnnotation) {
            return pointAnnotation.equals(obj);
        }
        if (obj instanceof Annotation) {
            return p005kotlin.jvm.internal.s.g(pointAnnotation.toString(), obj.toString());
        }
        return false;
    }

    @Override // ie2.j
    public final void f(Bitmap bitmap) {
        this.f125728a.c(bitmap);
        PointAnnotation pointAnnotation = this.f125729b;
        pointAnnotation.setIconImageBitmap(bitmap);
        PointAnnotationManager pointAnnotationManager = this.f125731d.f125706x;
        if (pointAnnotationManager != null) {
            pointAnnotationManager.update(pointAnnotation);
        }
    }

    @Override // ie2.j
    public final void g(com.garmin.android.library.mapsdkadapter.f fVar) {
        fVar.getClass();
        this.f125728a.d(fVar);
        LatLng latLng = fVar.f50283a;
        Point pointFromLngLat = Point.fromLngLat(latLng.longitude, latLng.latitude);
        pointFromLngLat.getClass();
        PointAnnotation pointAnnotation = this.f125729b;
        pointAnnotation.setPoint(pointFromLngLat);
        PointAnnotationManager pointAnnotationManager = this.f125731d.f125706x;
        if (pointAnnotationManager != null) {
            pointAnnotationManager.update(pointAnnotation);
        }
    }

    @Override // ie2.j
    public final com.garmin.android.library.mapsdkadapter.f getPosition() {
        return this.f125728a.f50327a.f50309a;
    }

    @Override // ie2.j
    public final Parcelable getTag() {
        Bundle bundle = (Bundle) mo329getTag();
        if (bundle != null) {
            return bundle.getParcelable("extra_marker_tag");
        }
        return null;
    }

    @Override // ie2.j
    public final String getTitle() {
        return this.f125728a.f50327a.f50312d;
    }

    @Override // ie2.j
    public final float getZIndex() {
        return this.f125728a.f50327a.f50311c;
    }

    @Override // ie2.j
    public final void h(float f14, float f15) {
        ViewAnnotationManager viewAnnotationManager;
        com.garmin.android.library.mapsdkadapter.o oVar = this.f125728a.f50327a;
        oVar.f50325q = f14;
        oVar.f50326r = f15;
        View view2 = this.f125730c;
        if (view2 == null || (viewAnnotationManager = this.f125731d.f125708z) == null) {
            return;
        }
        ViewAnnotationOptions.Builder builder = new ViewAnnotationOptions.Builder();
        ViewAnnotationAnchorConfig.Builder builder2 = new ViewAnnotationAnchorConfig.Builder();
        builder2.offsetX(f14);
        builder2.offsetY(f15);
        Unit unit = Unit.INSTANCE;
        ViewAnnotationOptions.Builder builderVariableAnchors = builder.variableAnchors(p13.w.c(builder2.build()));
        builderVariableAnchors.getClass();
        ViewAnnotationOptions viewAnnotationOptionsBuild = builderVariableAnchors.build();
        viewAnnotationOptionsBuild.getClass();
        viewAnnotationManager.updateViewAnnotation(view2, viewAnnotationOptionsBuild);
    }

    public final int hashCode() {
        return getPosition().hashCode() + (this.f125729b.getId().hashCode() * 31);
    }

    @Override // ie2.j
    public final void i(String str) {
        this.f125728a.f50327a.f50313e = str;
        View view2 = this.f125730c;
        if (view2 != null) {
            pe2.a.a(view2).f137462a.setText(str);
        }
    }

    @Override // ie2.j
    public final void j(float f14, float f15) {
        this.f125728a.a(f14, f15);
    }

    @Override // ie2.j
    public final void k() {
        View view2 = this.f125730c;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    @Override // ie2.j
    public final void l(boolean z14) {
        this.f125728a.f50327a.f50315g = z14;
        PointAnnotation pointAnnotation = this.f125729b;
        pointAnnotation.setDraggable(z14);
        PointAnnotationManager pointAnnotationManager = this.f125731d.f125706x;
        if (pointAnnotationManager != null) {
            pointAnnotationManager.update(pointAnnotation);
        }
    }

    @Override // ie2.j
    public final void m() {
        View view2 = this.f125730c;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    @Override // ie2.j
    public final void n(boolean z14) {
        this.f125728a.f50327a.f50316h = z14;
    }

    @Override // ie2.j
    public final void remove() {
        ViewAnnotationManager viewAnnotationManager;
        s sVar = this.f125731d;
        PointAnnotationManager pointAnnotationManager = sVar.f125706x;
        if (pointAnnotationManager != null) {
            pointAnnotationManager.delete(this.f125729b);
        }
        sVar.D.remove(this);
        View view2 = this.f125730c;
        if (view2 == null || (viewAnnotationManager = sVar.f125708z) == null) {
            return;
        }
        viewAnnotationManager.removeViewAnnotation(view2);
    }

    @Override // ie2.j
    public final void setIcon(int i14) {
        com.garmin.android.library.mapsdkadapter.p pVar = this.f125728a;
        pVar.b(i14);
        s sVar = this.f125731d;
        Context context = sVar.f125702r;
        Integer num = pVar.f50327a.f50319k;
        num.getClass();
        Bitmap bitmapA = p.a(num.intValue(), context);
        PointAnnotation pointAnnotation = this.f125729b;
        pointAnnotation.setIconImageBitmap(bitmapA);
        PointAnnotationManager pointAnnotationManager = sVar.f125706x;
        if (pointAnnotationManager != null) {
            pointAnnotationManager.update(pointAnnotation);
        }
    }

    @Override // ie2.j
    public final void setRotation(float f14) {
        this.f125728a.f50327a.f50310b = f14;
        Double dValueOf = Double.valueOf(f14);
        PointAnnotation pointAnnotation = this.f125729b;
        pointAnnotation.setIconRotate(dValueOf);
        PointAnnotationManager pointAnnotationManager = this.f125731d.f125706x;
        if (pointAnnotationManager != null) {
            pointAnnotationManager.update(pointAnnotation);
        }
    }

    @Override // ie2.j
    public final void setVisible(boolean z14) {
        com.garmin.android.library.mapsdkadapter.o oVar = this.f125728a.f50327a;
        oVar.f50314f = z14;
        PointAnnotation pointAnnotation = this.f125729b;
        if (z14) {
            pointAnnotation.setIconOpacity(Double.valueOf(oVar.f50317i));
        } else {
            pointAnnotation.setIconOpacity(Double.valueOf(0.0d));
        }
        PointAnnotationManager pointAnnotationManager = this.f125731d.f125706x;
        if (pointAnnotationManager != null) {
            pointAnnotationManager.update(pointAnnotation);
        }
    }

    public final String toString() {
        return getPosition().toString();
    }

    @Override // ie2.j
    /* JADX INFO: renamed from: getTag */
    public final Object mo329getTag() {
        return this.f125728a.f50327a.f50322n;
    }
}
