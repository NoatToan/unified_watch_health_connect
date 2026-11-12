package nn1;

import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnn1/c;", "", "", "headerStringResId", "contentStringResId", "linkStringResId", "", "link", "<init>", "(IIILjava/lang/String;)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f126700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f126701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f126702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f126703d;

    public /* synthetic */ c(int i14, int i15, int i16, String str, int i17, j jVar) {
        this((i17 & 1) != 0 ? 0 : i14, i15, (i17 & 4) != 0 ? 0 : i16, (i17 & 8) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f126700a == cVar.f126700a && this.f126701b == cVar.f126701b && this.f126702c == cVar.f126702c && s.g(this.f126703d, cVar.f126703d);
    }

    public final int hashCode() {
        int iD = q2.d(this.f126702c, q2.d(this.f126701b, Integer.hashCode(this.f126700a) * 31, 31), 31);
        String str = this.f126703d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f126700a, this.f126701b, "SleepScoreDetailsParagraph(headerStringResId=", ", contentStringResId=", ", linkStringResId=");
        sbJ.append(this.f126702c);
        sbJ.append(", link=");
        sbJ.append(this.f126703d);
        sbJ.append(")");
        return sbJ.toString();
    }

    public c(int i14, int i15, int i16, String str) {
        this.f126700a = i14;
        this.f126701b = i15;
        this.f126702c = i16;
        this.f126703d = str;
    }
}
