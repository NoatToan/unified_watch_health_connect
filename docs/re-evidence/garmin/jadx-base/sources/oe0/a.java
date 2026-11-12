package oe0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Loe0/a;", "", "", "isSaving", "saveSuccess", "saveError", "<init>", "(ZZZ)V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f131247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f131248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f131249c;

    public /* synthetic */ a(boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16);
    }

    public static a a(a aVar, boolean z14, boolean z15, int i14) {
        if ((i14 & 1) != 0) {
            z14 = aVar.f131247a;
        }
        boolean z16 = (i14 & 2) != 0 ? aVar.f131248b : true;
        if ((i14 & 4) != 0) {
            z15 = aVar.f131249c;
        }
        aVar.getClass();
        return new a(z14, z16, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f131247a == aVar.f131247a && this.f131248b == aVar.f131248b && this.f131249c == aVar.f131249c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131249c) + q6.f.g(Boolean.hashCode(this.f131247a) * 31, 31, this.f131248b);
    }

    public final String toString() {
        return hb.a.k(com.airbnb.lottie.animation.keyframe.a.m("AddDogUiState(isSaving=", ", saveSuccess=", ", saveError=", this.f131247a, this.f131248b), this.f131249c, ")");
    }

    public a(boolean z14, boolean z15, boolean z16) {
        this.f131247a = z14;
        this.f131248b = z15;
        this.f131249c = z16;
    }

    public a() {
        this(false, false, false, 7, null);
    }
}
