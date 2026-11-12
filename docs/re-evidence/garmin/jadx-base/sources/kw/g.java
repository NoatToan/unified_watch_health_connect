package kw;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkw/g;", "", "", "name", "", TtmlNode.ATTR_TTS_COLOR, "Lkw/b;", "categoryNumber", "<init>", "(Ljava/lang/String;ILkw/b;)V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f106853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f106854c;

    public /* synthetic */ g(String str, int i14, b bVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? -1 : i14, (i15 & 4) != 0 ? b.ONE : bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.f106852a, gVar.f106852a) && this.f106853b == gVar.f106853b && this.f106854c == gVar.f106854c;
    }

    public final int hashCode() {
        return this.f106854c.hashCode() + q2.d(this.f106853b, this.f106852a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbK = androidx.core.view.j.k(this.f106853b, "BloodPressureLevelData(name=", this.f106852a, ", color=", ", categoryNumber=");
        sbK.append(this.f106854c);
        sbK.append(")");
        return sbK.toString();
    }

    public g(String str, int i14, b bVar) {
        str.getClass();
        bVar.getClass();
        this.f106852a = str;
        this.f106853b = i14;
        this.f106854c = bVar;
    }

    public g() {
        this(null, 0, null, 7, null);
    }
}
