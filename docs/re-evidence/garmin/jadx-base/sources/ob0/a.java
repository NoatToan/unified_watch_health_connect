package ob0;

import p005kotlin.Metadata;
import x5.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lob0/a;", "", "Lx5/l0;", "rawInput", "", "isInputValid", "showValidationError", "<init>", "(Lx5/l0;ZZ)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f131100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f131101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f131102c;

    public a(l0 l0Var, boolean z14, boolean z15) {
        l0Var.getClass();
        this.f131100a = l0Var;
        this.f131101b = z14;
        this.f131102c = z15;
    }

    public static a a(a aVar, l0 l0Var, boolean z14, boolean z15, int i14) {
        if ((i14 & 1) != 0) {
            l0Var = aVar.f131100a;
        }
        if ((i14 & 2) != 0) {
            z14 = aVar.f131101b;
        }
        if ((i14 & 4) != 0) {
            z15 = aVar.f131102c;
        }
        aVar.getClass();
        return new a(l0Var, z14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f131100a.equals(aVar.f131100a) && this.f131101b == aVar.f131101b && this.f131102c == aVar.f131102c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131102c) + q6.f.g(this.f131100a.hashCode() * 31, 31, this.f131101b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InputUiState(rawInput=");
        sb3.append(this.f131100a);
        sb3.append(", isInputValid=");
        sb3.append(this.f131101b);
        sb3.append(", showValidationError=");
        return hb.a.k(sb3, this.f131102c, ")");
    }
}
