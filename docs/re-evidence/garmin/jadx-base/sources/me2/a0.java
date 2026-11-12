package me2;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lme2/a0;", "Lie2/j;", "Lcom/garmin/android/library/mapsdkadapter/p;", "markerOptions", "Lcom/google/android/gms/maps/model/Marker;", "googleMarker", "Lme2/l;", "mapAdapter", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/p;Lcom/google/android/gms/maps/model/Marker;Lme2/l;)V", "marker", "(Lme2/a0;)V", "(Lcom/google/android/gms/maps/model/Marker;Lme2/l;)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a0 implements ie2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.p f118120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Marker f118121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f118122c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(Marker marker, l lVar) {
        this(new com.garmin.android.library.mapsdkadapter.p(), marker, lVar);
        marker.getClass();
        lVar.getClass();
        LatLng position = marker.getPosition();
        position.getClass();
        g(new com.garmin.android.library.mapsdkadapter.f(position, com.garmin.android.library.mapsdkadapter.m.f(position) ? com.garmin.android.library.mapsdkadapter.i.b.GCJ02 : com.garmin.android.library.mapsdkadapter.i.b.WGS84));
        b(marker.getTag());
        e(marker.getTitle());
        i(marker.getSnippet());
        setRotation(marker.getRotation());
        c(marker.getAlpha());
        l(marker.isDraggable());
    }

    @Override // ie2.j
    public final void a(float f14) {
        this.f118120a.f50327a.f50311c = f14;
        this.f118121b.setZIndex(f14);
    }

    @Override // ie2.j
    public final void b(Object obj) {
        this.f118120a.f50327a.f50322n = obj;
        this.f118121b.setTag(obj);
    }

    @Override // ie2.j
    public final void c(float f14) {
        this.f118120a.f50327a.f50317i = f14;
        this.f118121b.setAlpha(f14);
    }

    @Override // ie2.j
    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.garmin.android.library.mapsdkadapter.p getF118120a() {
        return this.f118120a;
    }

    @Override // ie2.j
    public final void e(String str) {
        this.f118120a.f50327a.f50312d = str;
        this.f118121b.setTitle(str);
    }

    public final boolean equals(Object obj) {
        boolean z14 = obj instanceof a0;
        Marker marker = this.f118121b;
        if (z14) {
            return p005kotlin.jvm.internal.s.g(marker, ((a0) obj).f118121b);
        }
        if (obj instanceof Marker) {
            return p005kotlin.jvm.internal.s.g(marker, obj);
        }
        return false;
    }

    @Override // ie2.j
    public final void f(Bitmap bitmap) {
        this.f118120a.c(bitmap);
        this.f118121b.setIcon(bitmap != null ? BitmapDescriptorFactory.fromBitmap(bitmap) : null);
    }

    @Override // ie2.j
    public final void g(com.garmin.android.library.mapsdkadapter.f fVar) {
        fVar.getClass();
        this.f118120a.d(fVar);
        this.f118121b.setPosition(z.d(fVar));
    }

    @Override // ie2.j
    public final com.garmin.android.library.mapsdkadapter.f getPosition() {
        return this.f118120a.f50327a.f50309a;
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
        return this.f118120a.f50327a.f50312d;
    }

    @Override // ie2.j
    public final float getZIndex() {
        return this.f118120a.f50327a.f50311c;
    }

    @Override // ie2.j
    public final void h(float f14, float f15) {
        com.garmin.android.library.mapsdkadapter.o oVar = this.f118120a.f50327a;
        oVar.f50325q = f14;
        oVar.f50326r = f15;
        this.f118121b.setInfoWindowAnchor(f14, f15);
    }

    public final int hashCode() {
        String id3 = this.f118121b.getId();
        id3.getClass();
        return getPosition().hashCode() + (id3.hashCode() * 31);
    }

    @Override // ie2.j
    public final void i(String str) {
        this.f118120a.f50327a.f50313e = str;
        this.f118121b.setSnippet(str);
    }

    @Override // ie2.j
    public final void j(float f14, float f15) {
        this.f118120a.a(f14, f15);
        this.f118121b.setAnchor(f14, f15);
    }

    @Override // ie2.j
    public final void k() {
        this.f118121b.hideInfoWindow();
    }

    @Override // ie2.j
    public final void l(boolean z14) {
        this.f118120a.f50327a.f50315g = z14;
        this.f118121b.setDraggable(z14);
    }

    @Override // ie2.j
    public final void m() {
        this.f118121b.showInfoWindow();
    }

    @Override // ie2.j
    public final void n(boolean z14) {
        this.f118120a.f50327a.f50316h = z14;
        this.f118121b.setFlat(z14);
    }

    @Override // ie2.j
    public final void remove() {
        this.f118121b.remove();
        this.f118122c.B.remove(this);
    }

    @Override // ie2.j
    public final void setIcon(int i14) {
        this.f118120a.b(i14);
        this.f118121b.setIcon(BitmapDescriptorFactory.fromResource(i14));
    }

    @Override // ie2.j
    public final void setRotation(float f14) {
        this.f118120a.f50327a.f50310b = f14;
        this.f118121b.setRotation(f14);
    }

    @Override // ie2.j
    public final void setVisible(boolean z14) {
        this.f118120a.f50327a.f50314f = z14;
        this.f118121b.setVisible(z14);
    }

    public final String toString() {
        return getPosition().toString();
    }

    @Override // ie2.j
    /* JADX INFO: renamed from: getTag */
    public final Object mo329getTag() {
        return this.f118120a.f50327a.f50322n;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(a0 a0Var) {
        this(new com.garmin.android.library.mapsdkadapter.p(a0Var.f118120a), a0Var.f118121b, a0Var.f118122c);
        a0Var.getClass();
    }

    public a0(com.garmin.android.library.mapsdkadapter.p pVar, Marker marker, l lVar) {
        pVar.getClass();
        marker.getClass();
        lVar.getClass();
        this.f118120a = pVar;
        this.f118121b = marker;
        this.f118122c = lVar;
    }
}
