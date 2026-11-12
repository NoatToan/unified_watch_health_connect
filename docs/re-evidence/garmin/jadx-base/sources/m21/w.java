package m21;

import com.google.android.gms.actions.SearchIntents;
import p005kotlin.Metadata;
import yc.v2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lm21/w;", "", "", SearchIntents.EXTRA_QUERY, "Lr53/i;", "Lyc/v2;", "Lg01/n;", "flow", "Ln01/n;", "", "factory", "<init>", "(Ljava/lang/String;Lr53/i;Ln01/n;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r53.i<v2<g01.n>> f116198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n01.n<Integer, g01.n> f116199c;

    public w(String str, r53.i<v2<g01.n>> iVar, n01.n<Integer, g01.n> nVar) {
        str.getClass();
        iVar.getClass();
        nVar.getClass();
        this.f116197a = str;
        this.f116198b = iVar;
        this.f116199c = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f116197a.equals(wVar.f116197a) && this.f116198b.equals(wVar.f116198b) && this.f116199c.equals(wVar.f116199c);
    }

    public final int hashCode() {
        return this.f116199c.hashCode() + ((this.f116198b.hashCode() + (this.f116197a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "QueryCache(query=" + this.f116197a + ", flow=" + this.f116198b + ", factory=" + this.f116199c + ")";
    }
}
