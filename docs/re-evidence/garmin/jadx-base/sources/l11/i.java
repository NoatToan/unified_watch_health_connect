package l11;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll11/i;", "", "", "Lj11/a;", "chips", "", "selectedChipKey", "additionalFeedbackText", "", "sendButtonEnabled", "isEdited", "logIssueSuccess", "logIssuesError", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<j11.a> f108164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f108166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f108167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f108168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f108169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f108170g;

    public i(List list, String str, String str2, boolean z14, boolean z15, boolean z16, boolean z17, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j11.a.f96409g : list, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? false : z15, (i14 & 32) != 0 ? false : z16, (i14 & 64) != 0 ? false : z17);
    }

    public static i a(i iVar, String str, String str2, boolean z14, boolean z15, boolean z16, boolean z17, int i14) {
        String str3 = str;
        List<j11.a> list = iVar.f108164a;
        if ((i14 & 2) != 0) {
            str3 = iVar.f108165b;
        }
        if ((i14 & 4) != 0) {
            str2 = iVar.f108166c;
        }
        if ((i14 & 8) != 0) {
            z14 = iVar.f108167d;
        }
        if ((i14 & 16) != 0) {
            z15 = iVar.f108168e;
        }
        if ((i14 & 32) != 0) {
            z16 = iVar.f108169f;
        }
        if ((i14 & 64) != 0) {
            z17 = iVar.f108170g;
        }
        boolean z18 = z17;
        iVar.getClass();
        list.getClass();
        str3.getClass();
        str2.getClass();
        boolean z19 = z16;
        boolean z24 = z15;
        boolean z25 = z14;
        return new i(list, str3, str2, z25, z24, z19, z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.f108164a, iVar.f108164a) && p005kotlin.jvm.internal.s.g(this.f108165b, iVar.f108165b) && p005kotlin.jvm.internal.s.g(this.f108166c, iVar.f108166c) && this.f108167d == iVar.f108167d && this.f108168e == iVar.f108168e && this.f108169f == iVar.f108169f && this.f108170g == iVar.f108170g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f108170g) + q6.f.g(q6.f.g(q6.f.g(wr.g.j(wr.g.j(this.f108164a.hashCode() * 31, 31, this.f108165b), 31, this.f108166c), 31, this.f108167d), 31, this.f108168e), 31, this.f108169f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FoodReportIssueUiState(chips=");
        sb3.append(this.f108164a);
        sb3.append(", selectedChipKey=");
        sb3.append(this.f108165b);
        sb3.append(", additionalFeedbackText=");
        v.h.C(this.f108166c, ", sendButtonEnabled=", ", isEdited=", sb3, this.f108167d);
        kg.f.q(", logIssueSuccess=", ", logIssuesError=", sb3, this.f108168e, this.f108169f);
        return hb.a.k(sb3, this.f108170g, ")");
    }

    public i() {
        this(null, null, null, false, false, false, false, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends j11.a> list, String str, String str2, boolean z14, boolean z15, boolean z16, boolean z17) {
        list.getClass();
        str.getClass();
        str2.getClass();
        this.f108164a = list;
        this.f108165b = str;
        this.f108166c = str2;
        this.f108167d = z14;
        this.f108168e = z15;
        this.f108169f = z16;
        this.f108170g = z17;
    }
}
