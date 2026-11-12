package uq;

import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Luq/f;", "", "Luq/i;", "columnMetric", "", "isEditable", "", "formattedValue", "", "startDrawable", "endDrawable", "<init>", "(Luq/i;ZLjava/lang/String;II)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f172195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f172196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f172197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f172198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f172199e;

    public f(i iVar, boolean z14, String str, int i14, int i15) {
        iVar.getClass();
        str.getClass();
        this.f172195a = iVar;
        this.f172196b = z14;
        this.f172197c = str;
        this.f172198d = i14;
        this.f172199e = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f172195a == fVar.f172195a && this.f172196b == fVar.f172196b && this.f172197c.equals(fVar.f172197c) && this.f172198d == fVar.f172198d && this.f172199e == fVar.f172199e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f172199e) + q2.d(this.f172198d, wr.g.j(q6.f.g(this.f172195a.hashCode() * 31, 31, this.f172196b), 31, this.f172197c), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ColumnItem(columnMetric=");
        sb3.append(this.f172195a);
        sb3.append(", isEditable=");
        sb3.append(this.f172196b);
        sb3.append(", formattedValue=");
        q6.f.q(this.f172198d, this.f172197c, ", startDrawable=", ", endDrawable=", sb3);
        return am.j.q(sb3, this.f172199e, ")");
    }
}
