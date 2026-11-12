package g20;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lg20/n;", "", "", "Lcom/garmin/android/apps/connectmobile/contacts/a;", "contactDetailsListItems", "", "maxEmailReached", "maxPhonesReached", "contentModified", "closeDetailsScreen", "openEditContact", "", "editSpecificContactInfo", "openConnectProfile", "Ll20/a;", "contactDto", "<init>", "(Ljava/util/List;ZZZZZLjava/lang/String;ZLl20/a;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.contacts.a> f75360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f75362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f75363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f75364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f75365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f75366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f75367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l20.a f75368i;

    public /* synthetic */ n(List list, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String str, boolean z19, l20.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? false : z16, (i14 & 16) != 0 ? false : z17, (i14 & 32) != 0 ? false : z18, (i14 & 64) != 0 ? null : str, (i14 & 128) != 0 ? false : z19, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return s.g(this.f75360a, nVar.f75360a) && this.f75361b == nVar.f75361b && this.f75362c == nVar.f75362c && this.f75363d == nVar.f75363d && this.f75364e == nVar.f75364e && this.f75365f == nVar.f75365f && s.g(this.f75366g, nVar.f75366g) && this.f75367h == nVar.f75367h && s.g(this.f75368i, nVar.f75368i);
    }

    public final int hashCode() {
        List<com.garmin.android.apps.connectmobile.contacts.a> list = this.f75360a;
        int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g((list == null ? 0 : list.hashCode()) * 31, 31, this.f75361b), 31, this.f75362c), 31, this.f75363d), 31, this.f75364e), 31, this.f75365f);
        String str = this.f75366g;
        return this.f75368i.hashCode() + q6.f.g((iG + (str != null ? str.hashCode() : 0)) * 31, 31, this.f75367h);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UIState(contactDetailsListItems=");
        sb3.append(this.f75360a);
        sb3.append(", maxEmailReached=");
        sb3.append(this.f75361b);
        sb3.append(", maxPhonesReached=");
        kg.f.q(", contentModified=", ", closeDetailsScreen=", sb3, this.f75362c, this.f75363d);
        kg.f.q(", openEditContact=", ", editSpecificContactInfo=", sb3, this.f75364e, this.f75365f);
        v.h.C(this.f75366g, ", openConnectProfile=", ", contactDto=", sb3, this.f75367h);
        sb3.append(this.f75368i);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(List<? extends com.garmin.android.apps.connectmobile.contacts.a> list, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String str, boolean z19, l20.a aVar) {
        aVar.getClass();
        this.f75360a = list;
        this.f75361b = z14;
        this.f75362c = z15;
        this.f75363d = z16;
        this.f75364e = z17;
        this.f75365f = z18;
        this.f75366g = str;
        this.f75367h = z19;
        this.f75368i = aVar;
    }
}
