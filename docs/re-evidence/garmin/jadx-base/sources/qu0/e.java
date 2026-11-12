package qu0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqu0/e;", "", "", "headerText", "", "Lqu0/a;", "recipients", "footerText", "footerLinkText", "Lqu0/f;", "footerLinkAction", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lqu0/f;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f147888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f147890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f147891e;

    public e(String str, List list, String str2, String str3, f fVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? j0.f134944a : list, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f147887a, eVar.f147887a) && s.g(this.f147888b, eVar.f147888b) && s.g(this.f147889c, eVar.f147889c) && s.g(this.f147890d, eVar.f147890d) && this.f147891e == eVar.f147891e;
    }

    public final int hashCode() {
        String str = this.f147887a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<a> list = this.f147888b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f147889c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f147890d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        f fVar = this.f147891e;
        return iHashCode4 + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbG = l2.g("RecipientsGroup(headerText=", this.f147887a, ", recipients=", this.f147888b, ", footerText=");
        sn.a.t(sbG, this.f147889c, ", footerLinkText=", this.f147890d, ", footerLinkAction=");
        sbG.append(this.f147891e);
        sbG.append(")");
        return sbG.toString();
    }

    public e(String str, List<a> list, String str2, String str3, f fVar) {
        this.f147887a = str;
        this.f147888b = list;
        this.f147889c = str2;
        this.f147890d = str3;
        this.f147891e = fVar;
    }

    public e() {
        this(null, null, null, null, null, 31, null);
    }
}
