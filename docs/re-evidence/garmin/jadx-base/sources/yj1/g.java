package yj1;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lyj1/g;", "", "", "isAssistantPlusON", "", "Ll20/a;", "sosContacts", "Ltj1/e;", "eccContact", "contactRemoved", "Lyj1/f;", "formattedEmergencyList", "<init>", "(ZLjava/util/List;Ltj1/e;ZLjava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f197542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<l20.a> f197543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tj1.e f197544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f197545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<f> f197546e;

    public g(boolean z14, List list, tj1.e eVar, boolean z15, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? j0.f134944a : list, (i14 & 4) != 0 ? null : eVar, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? j0.f134944a : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f197542a == gVar.f197542a && s.g(this.f197543b, gVar.f197543b) && s.g(this.f197544c, gVar.f197544c) && this.f197545d == gVar.f197545d && s.g(this.f197546e, gVar.f197546e);
    }

    public final int hashCode() {
        int iB = u0.b(Boolean.hashCode(this.f197542a) * 31, 31, this.f197543b);
        tj1.e eVar = this.f197544c;
        return this.f197546e.hashCode() + q6.f.g((iB + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.f197545d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EmergencyContactsUIModel(isAssistantPlusON=");
        sb3.append(this.f197542a);
        sb3.append(", sosContacts=");
        sb3.append(this.f197543b);
        sb3.append(", eccContact=");
        sb3.append(this.f197544c);
        sb3.append(", contactRemoved=");
        sb3.append(this.f197545d);
        sb3.append(", formattedEmergencyList=");
        return z.c(sb3, this.f197546e, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(boolean z14, List<l20.a> list, tj1.e eVar, boolean z15, List<? extends f> list2) {
        list.getClass();
        list2.getClass();
        this.f197542a = z14;
        this.f197543b = list;
        this.f197544c = eVar;
        this.f197545d = z15;
        this.f197546e = list2;
    }

    public g() {
        this(false, null, null, false, null, 31, null);
    }
}
