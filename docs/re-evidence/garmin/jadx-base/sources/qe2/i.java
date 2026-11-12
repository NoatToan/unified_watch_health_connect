package qe2;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.library.mapsdkadapter.o;
import com.garmin.android.library.mapsdkadapter.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqe2/i;", "Lie2/j;", "Lcom/garmin/android/library/mapsdkadapter/p;", "options", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/p;)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i implements ie2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f144586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f144587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f144588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ie2.j f144589d;

    public i(p pVar) {
        pVar.getClass();
        this.f144586a = new p(pVar);
    }

    @Override // ie2.j
    public final void a(float f14) {
        ie2.j jVar = this.f144589d;
        if (jVar != null) {
            jVar.a(f14);
        } else {
            this.f144586a.f50327a.f50311c = f14;
        }
    }

    @Override // ie2.j
    public final void b(Object obj) {
        ie2.j jVar = this.f144589d;
        if (jVar != null) {
            jVar.b(obj);
        } else {
            this.f144586a.f50327a.f50322n = obj;
        }
    }

    @Override // ie2.j
    public final void c(float f14) {
        ie2.j jVar = this.f144589d;
        if (jVar != null) {
            jVar.c(f14);
        } else {
            this.f144586a.f50327a.f50317i = f14;
        }
    }

    @Override // ie2.j
    /* JADX INFO: renamed from: d, reason: from getter */
    public final p getF144586a() {
        return this.f144586a;
    }

    @Override // ie2.j
    public final void e(String str) {
        ie2.j jVar = this.f144589d;
        if (jVar != null) {
            jVar.e(str);
        } else {
            this.f144586a.f50327a.f50312d = str;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this == obj;
        }
        return (obj instanceof ie2.j) && this.f144589d == obj;
    }

    @Override // ie2.j
    public final void f(Bitmap bitmap) {
        ie2.j jVar = this.f144589d;
        if (jVar != null) {
            jVar.f(bitmap);
        } else {
            this.f144586a.c(bitmap);
        }
    }

    @Override // ie2.j
    public final void g(com.garmin.android.library.mapsdkadapter.f fVar) {
        fVar.getClass();
        ie2.j jVar = this.f144589d;
        if (jVar != null) {
            jVar.g(fVar);
        } else {
            this.f144586a.d(fVar);
        }
    }

    @Override // ie2.j
    public final com.garmin.android.library.mapsdkadapter.f getPosition() {
        return this.f144586a.f50327a.f50309a;
    }

    @Override // ie2.j
    public final Parcelable getTag() {
        Parcelable tag;
        ie2.j jVar = this.f144589d;
        if (jVar != null && (tag = jVar.getTag()) != null) {
            return tag;
        }
        Bundle bundle = (Bundle) this.f144586a.f50327a.f50322n;
        if (bundle != null) {
            return bundle.getParcelable("extra_marker_tag");
        }
        return null;
    }

    @Override // ie2.j
    public final String getTitle() {
        return this.f144586a.f50327a.f50312d;
    }

    @Override // ie2.j
    public final float getZIndex() {
        return this.f144586a.f50327a.f50311c;
    }

    @Override // ie2.j
    public final void h(float f14, float f15) {
        ie2.j jVar = this.f144589d;
        if (jVar != null) {
            jVar.h(f14, f15);
            return;
        }
        o oVar = this.f144586a.f50327a;
        oVar.f50325q = f14;
        oVar.f50326r = f15;
    }

    public final int hashCode() {
        int iHashCode = this.f144586a.hashCode() * 31;
        ie2.j jVar = this.f144589d;
        return iHashCode + (jVar != null ? jVar.hashCode() : 0);
    }

    @Override // ie2.j
    public final void i(String str) {
        ie2.j jVar = this.f144589d;
        if (jVar != null) {
            jVar.i(str);
        } else {
            this.f144586a.f50327a.f50313e = str;
        }
    }

    @Override // ie2.j
    public final void j(float f14, float f15) {
        ie2.j jVar = this.f144589d;
        if (jVar != null) {
            jVar.j(f14, f15);
        } else {
            this.f144586a.a(f14, f15);
        }
    }

    @Override // ie2.j
    public final void k() {
        ie2.j jVar = this.f144589d;
        if (jVar != null) {
            jVar.k();
        }
        this.f144587b = false;
    }

    @Override // ie2.j
    public final void l(boolean z14) {
        ie2.j jVar = this.f144589d;
        if (jVar != null) {
            jVar.l(z14);
        } else {
            this.f144586a.f50327a.f50315g = z14;
        }
    }

    @Override // ie2.j
    public final void m() {
        ie2.j jVar = this.f144589d;
        if (jVar != null) {
            jVar.m();
        }
        this.f144587b = true;
    }

    @Override // ie2.j
    public final void n(boolean z14) {
        ie2.j jVar = this.f144589d;
        if (jVar != null) {
            jVar.n(z14);
        } else {
            this.f144586a.f50327a.f50316h = z14;
        }
    }

    @Override // ie2.j
    public final void remove() {
        ie2.j jVar = this.f144589d;
        if (jVar != null) {
            jVar.remove();
        }
        this.f144588c = true;
    }

    @Override // ie2.j
    public final void setIcon(int i14) {
        ie2.j jVar = this.f144589d;
        if (jVar != null) {
            jVar.setIcon(i14);
        } else {
            this.f144586a.b(i14);
        }
    }

    @Override // ie2.j
    public final void setRotation(float f14) {
        ie2.j jVar = this.f144589d;
        if (jVar != null) {
            jVar.setRotation(f14);
        } else {
            this.f144586a.f50327a.f50310b = f14;
        }
    }

    @Override // ie2.j
    public final void setVisible(boolean z14) {
        ie2.j jVar = this.f144589d;
        if (jVar != null) {
            jVar.setVisible(z14);
        } else {
            this.f144586a.f50327a.f50314f = z14;
        }
    }

    public final String toString() {
        return getPosition().toString();
    }

    @Override // ie2.j
    /* JADX INFO: renamed from: getTag */
    public final Object mo329getTag() {
        return this.f144586a.f50327a.f50322n;
    }
}
