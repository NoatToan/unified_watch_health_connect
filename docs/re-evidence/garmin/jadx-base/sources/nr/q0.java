package nr;

import com.garmin.android.gncs.NotificationConstants;
import java.util.List;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnr/q0;", "", "", "Lnr/s;", "tableCells", "", "backgroundColorId", "Lnr/r0;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/util/List;ILnr/r0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<s> f127308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f127309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f127310c;

    public q0(List<s> list, int i14, r0 r0Var) {
        list.getClass();
        r0Var.getClass();
        this.f127308a = list;
        this.f127309b = i14;
        this.f127310c = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return p005kotlin.jvm.internal.s.g(this.f127308a, q0Var.f127308a) && this.f127309b == q0Var.f127309b && this.f127310c == q0Var.f127310c;
    }

    public final int hashCode() {
        return this.f127310c.hashCode() + q2.d(this.f127309b, this.f127308a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TableRowData(tableCells=" + this.f127308a + ", backgroundColorId=" + this.f127309b + ", type=" + this.f127310c + ")";
    }

    public /* synthetic */ q0(List list, int i14, r0 r0Var, int i15, p005kotlin.jvm.internal.j jVar) {
        this(list, i14, (i15 & 4) != 0 ? r0.BODY_ROW : r0Var);
    }
}
