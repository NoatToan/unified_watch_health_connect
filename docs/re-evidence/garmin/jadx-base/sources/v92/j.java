package v92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv92/j;", "", "Lv92/i;", "consentParentAction", "", "consumed", "<init>", "(Lv92/i;Z)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f176410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f176411b;

    public j(i iVar, boolean z14) {
        iVar.getClass();
        this.f176410a = iVar;
        this.f176411b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.f176410a, jVar.f176410a) && this.f176411b == jVar.f176411b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f176411b) + (this.f176410a.hashCode() * 31);
    }

    public final String toString() {
        return "ConsentParentActionEvent(consentParentAction=" + this.f176410a + ", consumed=" + this.f176411b + ")";
    }

    public /* synthetic */ j(i iVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(iVar, (i14 & 2) != 0 ? false : z14);
    }
}
