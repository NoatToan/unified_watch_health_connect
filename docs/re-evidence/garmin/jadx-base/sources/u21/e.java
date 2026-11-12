package u21;

import c22.c3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu21/e;", "", "Lc22/c3;", "titleResId", "messageResId", "", "limitValue", "<init>", "(Lc22/c3;Lc22/c3;I)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f167935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f167936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f167937c;

    public e(c3 c3Var, c3 c3Var2, int i14) {
        c3Var.getClass();
        c3Var2.getClass();
        this.f167935a = c3Var;
        this.f167936b = c3Var2;
        this.f167937c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f167935a.equals(eVar.f167935a) && this.f167936b.equals(eVar.f167936b) && this.f167937c == eVar.f167937c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f167937c) + ((this.f167936b.hashCode() + (this.f167935a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AlertDialogData(titleResId=");
        sb3.append(this.f167935a);
        sb3.append(", messageResId=");
        sb3.append(this.f167936b);
        sb3.append(", limitValue=");
        return am.j.q(sb3, this.f167937c, ")");
    }
}
