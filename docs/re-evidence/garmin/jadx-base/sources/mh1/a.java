package mh1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmh1/a;", "", "", "isAdminInvited", "isLoading", "<init>", "(ZZ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f118455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f118456b;

    public /* synthetic */ a(boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15);
    }

    public static a a(a aVar, boolean z14, boolean z15, int i14) {
        if ((i14 & 1) != 0) {
            z14 = aVar.f118455a;
        }
        if ((i14 & 2) != 0) {
            z15 = aVar.f118456b;
        }
        aVar.getClass();
        return new a(z14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f118455a == aVar.f118455a && this.f118456b == aVar.f118456b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f118456b) + (Boolean.hashCode(this.f118455a) * 31);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.e("AdminInviteUiState(isAdminInvited=", ", isLoading=", ")", this.f118455a, this.f118456b);
    }

    public a(boolean z14, boolean z15) {
        this.f118455a = z14;
        this.f118456b = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        boolean z14 = false;
        this(z14, z14, 3, null);
    }
}
