package jo;

import l72.j0;
import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljo/b;", "", "", "itemKey", "filterTypeKey", "Ll72/j0;", "chipData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ll72/j0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f99696c;

    public b(String str, String str2, j0 j0Var) {
        str.getClass();
        str2.getClass();
        j0Var.getClass();
        this.f99694a = str;
        this.f99695b = str2;
        this.f99696c = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f99694a.equals(bVar.f99694a) && this.f99695b.equals(bVar.f99695b) && this.f99696c.equals(bVar.f99696c);
    }

    public final int hashCode() {
        return this.f99696c.hashCode() + g.j(this.f99694a.hashCode() * 31, 31, this.f99695b);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("FilterChipData(itemKey=", this.f99694a, ", filterTypeKey=", this.f99695b, ", chipData=");
        sbI.append(this.f99696c);
        sbI.append(")");
        return sbI.toString();
    }
}
