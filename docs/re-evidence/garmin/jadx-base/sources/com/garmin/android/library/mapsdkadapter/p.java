package com.garmin.android.library.mapsdkadapter;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/p;", "", "<init>", "()V", "src", "(Lcom/garmin/android/library/mapsdkadapter/p;)V", "Lcom/garmin/android/library/mapsdkadapter/o;", "markerData", "(Lcom/garmin/android/library/mapsdkadapter/o;)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f50327a;

    public p() {
        this.f50327a = new o(null, 0.0f, 0.0f, null, null, false, false, false, 0.0f, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
    }

    public final void a(float f14, float f15) {
        o oVar = this.f50327a;
        oVar.f50323o = f14;
        oVar.f50324p = f15;
    }

    public final void b(int i14) {
        Integer numValueOf = Integer.valueOf(i14);
        o oVar = this.f50327a;
        oVar.f50319k = numValueOf;
        Bitmap bitmap = oVar.f50318j;
        if (bitmap != null) {
            bitmap.recycle();
        }
        oVar.f50318j = null;
    }

    public final void c(Bitmap bitmap) {
        o oVar = this.f50327a;
        oVar.f50318j = bitmap;
        oVar.f50319k = null;
    }

    public final void d(f fVar) {
        fVar.getClass();
        o oVar = this.f50327a;
        oVar.getClass();
        oVar.f50309a = fVar;
    }

    public final void e(String str, Parcelable parcelable) {
        o oVar = this.f50327a;
        if (!(oVar.f50322n instanceof Bundle)) {
            oVar.f50322n = new Bundle();
        }
        Object obj = oVar.f50322n;
        obj.getClass();
        ((Bundle) obj).putParcelable(str, parcelable);
    }

    public final String toString() {
        return "{ " + this.f50327a + " }";
    }

    public p(p pVar) {
        pVar.getClass();
        this.f50327a = pVar.f50327a.a();
    }

    public p(o oVar) {
        oVar.getClass();
        this.f50327a = oVar.a();
    }
}
