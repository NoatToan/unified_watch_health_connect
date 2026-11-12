package l20;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d53.w;
import java.util.LinkedHashSet;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll20/n;", "", "", TtmlNode.ATTR_ID, "", "lookupKey", "_firstName", "_lastName", "", "Ll20/o;", "phoneNumbers", "Ll20/j;", "emailAddresses", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f109027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f109029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f109030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<o> f109031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<j> f109032f;

    public /* synthetic */ n(long j8, String str, String str2, String str3, Set set, Set set2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, str, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? "" : str3, (i14 & 16) != 0 ? new LinkedHashSet() : set, (i14 & 32) != 0 ? new LinkedHashSet() : set2);
    }

    public final String a() {
        return w.i0(this.f109029c).toString();
    }

    public final String b() {
        return w.i0(this.f109030d).toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!n.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        n nVar = (n) obj;
        if (s.g(a(), nVar.a()) && s.g(b(), nVar.b()) && s.g(this.f109031e, nVar.f109031e)) {
            return s.g(this.f109032f, nVar.f109032f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f109032f.hashCode() + ((this.f109031e.hashCode() + ((b().hashCode() + (a().hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str = this.f109029c;
        String str2 = this.f109030d;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f109027a, "PhoneContact(id=", ", lookupKey=", this.f109028b);
        sn.a.t(sbK, ", _firstName=", str, ", _lastName=", str2);
        sbK.append(", phoneNumbers=");
        sbK.append(this.f109031e);
        sbK.append(", emailAddresses=");
        sbK.append(this.f109032f);
        sbK.append(")");
        return sbK.toString();
    }

    public n(long j8, String str, String str2, String str3, Set<o> set, Set<j> set2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        set.getClass();
        set2.getClass();
        this.f109027a = j8;
        this.f109028b = str;
        this.f109029c = str2;
        this.f109030d = str3;
        this.f109031e = set;
        this.f109032f = set2;
    }
}
