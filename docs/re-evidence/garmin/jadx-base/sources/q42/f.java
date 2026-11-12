package q42;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq42/f;", "", "", "isLoading", "isApiCallSuccessful", "<init>", "(ZLjava/lang/Boolean;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f142633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f142634b;

    public /* synthetic */ f(boolean z14, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? null : bool);
    }

    public static f a(f fVar, boolean z14, int i14) {
        if ((i14 & 1) != 0) {
            z14 = fVar.f142633a;
        }
        Boolean bool = (i14 & 2) != 0 ? fVar.f142634b : null;
        fVar.getClass();
        return new f(z14, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f142633a == fVar.f142633a && p005kotlin.jvm.internal.s.g(this.f142634b, fVar.f142634b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f142633a) * 31;
        Boolean bool = this.f142634b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "UiState(isLoading=" + this.f142633a + ", isApiCallSuccessful=" + this.f142634b + ")";
    }

    public f(boolean z14, Boolean bool) {
        this.f142633a = z14;
        this.f142634b = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
