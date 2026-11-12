package com.garmin.android.library.mapsdkadapter;

import android.graphics.Bitmap;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.HeaderParameterNames;
import j20.x;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/o;", "", "Lcom/garmin/android/library/mapsdkadapter/f;", ModelSourceWrapper.POSITION, "", "rotation", "zIndex", "", "title", "snippet", "", "isVisible", "isDraggable", "isFlat", "alpha", "Landroid/graphics/Bitmap;", "icon", "", "iconRes", "clusterIconRes", "clusterWideIconRes", HeaderParameterNames.AUTHENTICATION_TAG, "anchorU", "anchorV", "infoWindowAnchorU", "infoWindowAnchorV", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/f;FFLjava/lang/String;Ljava/lang/String;ZZZFLandroid/graphics/Bitmap;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;FFFF)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f50309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f50310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f50311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f50312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f50313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f50314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f50315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f50316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f50317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Bitmap f50318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f50319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f50320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f50321m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f50322n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f50323o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f50324p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f50325q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f50326r;

    /* JADX WARN: Illegal instructions before constructor call */
    public o(f fVar, float f14, float f15, String str, String str2, boolean z14, boolean z15, boolean z16, float f16, Bitmap bitmap, Integer num, Integer num2, Integer num3, Object obj, float f17, float f18, float f19, float f22, int i14, p005kotlin.jvm.internal.j jVar) {
        f fVar2;
        if ((i14 & 1) != 0) {
            f.f50281c.getClass();
            fVar2 = f.f50282d;
        } else {
            fVar2 = fVar;
        }
        this(fVar2, (i14 & 2) != 0 ? 0.0f : f14, (i14 & 4) != 0 ? 0.0f : f15, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? true : z14, (i14 & 64) != 0 ? false : z15, (i14 & 128) == 0 ? z16 : false, (i14 & 256) != 0 ? 1.0f : f16, (i14 & 512) != 0 ? null : bitmap, (i14 & 1024) != 0 ? null : num, (i14 & 2048) != 0 ? null : num2, (i14 & 4096) != 0 ? null : num3, (i14 & 8192) != 0 ? null : obj, (i14 & 16384) != 0 ? 0.5f : f17, (i14 & 32768) != 0 ? 1.0f : f18, (i14 & 65536) == 0 ? f19 : 0.5f, (i14 & 131072) != 0 ? 0.0f : f22);
    }

    public final o a() {
        f fVar = this.f50309a;
        float f14 = this.f50310b;
        float f15 = this.f50311c;
        String str = this.f50312d;
        String str2 = this.f50313e;
        boolean z14 = this.f50314f;
        boolean z15 = this.f50315g;
        boolean z16 = this.f50316h;
        float f16 = this.f50317i;
        Bitmap bitmap = this.f50318j;
        Integer num = this.f50319k;
        Integer num2 = this.f50320l;
        Integer num3 = this.f50321m;
        Object obj = this.f50322n;
        float f17 = this.f50323o;
        float f18 = this.f50324p;
        float f19 = this.f50325q;
        float f22 = this.f50326r;
        fVar.getClass();
        return new o(fVar, f14, f15, str, str2, z14, z15, z16, f16, bitmap, num, num2, num3, obj, f17, f18, f19, f22);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.f50309a, oVar.f50309a) && Float.compare(this.f50310b, oVar.f50310b) == 0 && Float.compare(this.f50311c, oVar.f50311c) == 0 && p005kotlin.jvm.internal.s.g(this.f50312d, oVar.f50312d) && p005kotlin.jvm.internal.s.g(this.f50313e, oVar.f50313e) && this.f50314f == oVar.f50314f && this.f50315g == oVar.f50315g && this.f50316h == oVar.f50316h && Float.compare(this.f50317i, oVar.f50317i) == 0 && p005kotlin.jvm.internal.s.g(this.f50318j, oVar.f50318j) && p005kotlin.jvm.internal.s.g(this.f50319k, oVar.f50319k) && p005kotlin.jvm.internal.s.g(this.f50320l, oVar.f50320l) && p005kotlin.jvm.internal.s.g(this.f50321m, oVar.f50321m) && p005kotlin.jvm.internal.s.g(this.f50322n, oVar.f50322n) && Float.compare(this.f50323o, oVar.f50323o) == 0 && Float.compare(this.f50324p, oVar.f50324p) == 0 && Float.compare(this.f50325q, oVar.f50325q) == 0 && Float.compare(this.f50326r, oVar.f50326r) == 0;
    }

    public final int hashCode() {
        int iD = q6.f.d(this.f50311c, q6.f.d(this.f50310b, this.f50309a.hashCode() * 31, 31), 31);
        String str = this.f50312d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50313e;
        int iD2 = q6.f.d(this.f50317i, q6.f.g(q6.f.g(q6.f.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f50314f), 31, this.f50315g), 31, this.f50316h), 31);
        Bitmap bitmap = this.f50318j;
        int iHashCode2 = (iD2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Integer num = this.f50319k;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f50320l;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f50321m;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Object obj = this.f50322n;
        return Float.hashCode(this.f50326r) + q6.f.d(this.f50325q, q6.f.d(this.f50324p, q6.f.d(this.f50323o, (iHashCode5 + (obj != null ? obj.hashCode() : 0)) * 31, 31), 31), 31);
    }

    public final String toString() {
        f fVar = this.f50309a;
        float f14 = this.f50310b;
        float f15 = this.f50311c;
        String str = this.f50312d;
        String str2 = this.f50313e;
        boolean z14 = this.f50314f;
        boolean z15 = this.f50315g;
        boolean z16 = this.f50316h;
        float f16 = this.f50317i;
        Bitmap bitmap = this.f50318j;
        Integer num = this.f50319k;
        Integer num2 = this.f50320l;
        Integer num3 = this.f50321m;
        Object obj = this.f50322n;
        float f17 = this.f50323o;
        float f18 = this.f50324p;
        float f19 = this.f50325q;
        float f22 = this.f50326r;
        StringBuilder sb3 = new StringBuilder("MarkerData(position=");
        sb3.append(fVar);
        sb3.append(", rotation=");
        sb3.append(f14);
        sb3.append(", zIndex=");
        sb3.append(f15);
        sb3.append(", title=");
        sb3.append(str);
        sb3.append(", snippet=");
        v.h.C(str2, ", isVisible=", ", isDraggable=", sb3, z14);
        kg.f.q(", isFlat=", ", alpha=", sb3, z15, z16);
        sb3.append(f16);
        sb3.append(", icon=");
        sb3.append(bitmap);
        sb3.append(", iconRes=");
        x.m(sb3, num, ", clusterIconRes=", num2, ", clusterWideIconRes=");
        sb3.append(num3);
        sb3.append(", tag=");
        sb3.append(obj);
        sb3.append(", anchorU=");
        l2.n(sb3, f17, ", anchorV=", f18, ", infoWindowAnchorU=");
        sb3.append(f19);
        sb3.append(", infoWindowAnchorV=");
        sb3.append(f22);
        sb3.append(")");
        return sb3.toString();
    }

    public o(f fVar, float f14, float f15, String str, String str2, boolean z14, boolean z15, boolean z16, float f16, Bitmap bitmap, Integer num, Integer num2, Integer num3, Object obj, float f17, float f18, float f19, float f22) {
        fVar.getClass();
        this.f50309a = fVar;
        this.f50310b = f14;
        this.f50311c = f15;
        this.f50312d = str;
        this.f50313e = str2;
        this.f50314f = z14;
        this.f50315g = z15;
        this.f50316h = z16;
        this.f50317i = f16;
        this.f50318j = bitmap;
        this.f50319k = num;
        this.f50320l = num2;
        this.f50321m = num3;
        this.f50322n = obj;
        this.f50323o = f17;
        this.f50324p = f18;
        this.f50325q = f19;
        this.f50326r = f22;
    }

    public o() {
        this(null, 0.0f, 0.0f, null, null, false, false, false, 0.0f, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
    }
}
