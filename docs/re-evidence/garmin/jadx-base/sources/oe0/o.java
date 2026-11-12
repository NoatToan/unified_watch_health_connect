package oe0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Loe0/o;", "", "", "isLoading", "isSaving", "saveSuccess", "saveError", "isLoadingPhysioFlag", "isUploadingPhoto", "uploadPhotoSuccess", "uploadPhotoError", "<init>", "(ZZZZZZZZ)V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f131389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f131390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f131391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f131392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f131393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f131394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f131395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f131396h;

    public /* synthetic */ o(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? false : z18, (i14 & 32) != 0 ? false : z19, (i14 & 64) != 0 ? false : z24, (i14 & 128) != 0 ? false : z25);
    }

    public static o a(o oVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i14) {
        if ((i14 & 1) != 0) {
            z14 = oVar.f131389a;
        }
        boolean z19 = z14;
        if ((i14 & 2) != 0) {
            z15 = oVar.f131390b;
        }
        boolean z24 = z15;
        if ((i14 & 4) != 0) {
            z16 = oVar.f131391c;
        }
        boolean z25 = z16;
        if ((i14 & 8) != 0) {
            z17 = oVar.f131392d;
        }
        boolean z26 = z17;
        if ((i14 & 16) != 0) {
            z18 = oVar.f131393e;
        }
        boolean z27 = z18;
        boolean z28 = oVar.f131394f;
        boolean z29 = (i14 & 64) != 0 ? oVar.f131395g : false;
        boolean z34 = (i14 & 128) != 0 ? oVar.f131396h : false;
        oVar.getClass();
        return new o(z19, z24, z25, z26, z27, z28, z29, z34);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f131389a == oVar.f131389a && this.f131390b == oVar.f131390b && this.f131391c == oVar.f131391c && this.f131392d == oVar.f131392d && this.f131393e == oVar.f131393e && this.f131394f == oVar.f131394f && this.f131395g == oVar.f131395g && this.f131396h == oVar.f131396h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131396h) + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f131389a) * 31, 31, this.f131390b), 31, this.f131391c), 31, this.f131392d), 31, this.f131393e), 31, this.f131394f), 31, this.f131395g);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("EditDogUiState(isLoading=", ", isSaving=", ", saveSuccess=", this.f131389a, this.f131390b);
        kg.f.q(", saveError=", ", isLoadingPhysioFlag=", sbM, this.f131391c, this.f131392d);
        kg.f.q(", isUploadingPhoto=", ", uploadPhotoSuccess=", sbM, this.f131393e, this.f131394f);
        return com.airbnb.lottie.animation.keyframe.a.f(", uploadPhotoError=", ")", sbM, this.f131395g, this.f131396h);
    }

    public o(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25) {
        this.f131389a = z14;
        this.f131390b = z15;
        this.f131391c = z16;
        this.f131392d = z17;
        this.f131393e = z18;
        this.f131394f = z19;
        this.f131395g = z24;
        this.f131396h = z25;
    }

    public o() {
        this(false, false, false, false, false, false, false, false, 255, null);
    }
}
