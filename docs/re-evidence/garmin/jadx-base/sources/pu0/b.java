package pu0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d53.y;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import v.e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dBÕ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lpu0/b;", "", "", TtmlNode.ATTR_ID, "firstName", "lastName", "", "Lpu0/f;", "emails", "", "hasSharingError", "Lpu0/d;", "contactType", "isSosDefault", "isLiveEventSharingDefault", "Lpu0/i;", "phones", "Lpu0/h;", "messengerPhones", "Lpu0/c;", "contactSocialProfiles", "", "contactInfoLimit", "localId", "isEmsContact", "unusedEmails", "unusedPhones", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLpu0/d;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)V", "a", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Comparable<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f141185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<f> f141186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f141187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f141188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f141189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f141190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<i> f141191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<h> f141192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<c> f141193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f141194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f141195m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f141196n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<f> f141197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<i> f141198p;

    static {
        new a(null);
    }

    public b(String str, String str2, String str3, List list, boolean z14, d dVar, Boolean bool, Boolean bool2, List list2, List list3, List list4, Integer num, String str4, Boolean bool3, List list5, List list6, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? "" : str3, (i14 & 8) != 0 ? j0.f134944a : list, (i14 & 16) != 0 ? false : z14, dVar, (i14 & 64) != 0 ? Boolean.FALSE : bool, (i14 & 128) != 0 ? Boolean.FALSE : bool2, (i14 & 256) != 0 ? j0.f134944a : list2, (i14 & 512) != 0 ? j0.f134944a : list3, (i14 & 1024) != 0 ? j0.f134944a : list4, (i14 & 2048) != 0 ? null : num, (i14 & 4096) != 0 ? null : str4, (i14 & 8192) != 0 ? Boolean.FALSE : bool3, (i14 & 16384) != 0 ? j0.f134944a : list5, (i14 & 32768) != 0 ? j0.f134944a : list6);
    }

    public static b a(b bVar, List list, d dVar, List list2, List list3, ArrayList arrayList, ArrayList arrayList2, int i14) {
        String str = (i14 & 1) != 0 ? bVar.f141183a : null;
        String str2 = bVar.f141184b;
        String str3 = bVar.f141185c;
        boolean z14 = bVar.f141187e;
        d dVar2 = (i14 & 32) != 0 ? bVar.f141188f : dVar;
        Boolean bool = bVar.f141189g;
        Boolean bool2 = bVar.f141190h;
        List list4 = (i14 & 256) != 0 ? bVar.f141191i : list2;
        List list5 = (i14 & 512) != 0 ? bVar.f141192j : list3;
        List<c> list6 = bVar.f141193k;
        Integer num = bVar.f141194l;
        String str4 = bVar.f141195m;
        Boolean bool3 = bVar.f141196n;
        List<f> list7 = (i14 & 16384) != 0 ? bVar.f141197o : arrayList;
        List<i> list8 = (i14 & 32768) != 0 ? bVar.f141198p : arrayList2;
        bVar.getClass();
        str2.getClass();
        list.getClass();
        dVar2.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        return new b(str, str2, str3, list, z14, dVar2, bool, bool2, list4, list5, list6, num, str4, bool3, list7, list8);
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        b bVar2 = bVar;
        bVar2.getClass();
        boolean z14 = false;
        if (this == bVar2) {
            return 0;
        }
        Character chQ0 = y.q0(og.a.A(this));
        boolean z15 = chQ0 != null && Character.isLetter(chQ0.charValue());
        Character chQ1 = y.q0(og.a.A(bVar2));
        if (chQ1 != null && Character.isLetter(chQ1.charValue())) {
            z14 = true;
        }
        if (z15 && !z14) {
            return -1;
        }
        if (z15 || !z14) {
            return og.a.A(this).compareToIgnoreCase(og.a.A(bVar2));
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f141183a, bVar.f141183a) && s.g(this.f141184b, bVar.f141184b) && s.g(this.f141185c, bVar.f141185c) && s.g(this.f141186d, bVar.f141186d) && this.f141187e == bVar.f141187e && s.g(this.f141188f, bVar.f141188f) && s.g(this.f141189g, bVar.f141189g) && s.g(this.f141190h, bVar.f141190h) && s.g(this.f141191i, bVar.f141191i) && s.g(this.f141192j, bVar.f141192j) && s.g(this.f141193k, bVar.f141193k) && s.g(this.f141194l, bVar.f141194l) && s.g(this.f141195m, bVar.f141195m) && s.g(this.f141196n, bVar.f141196n) && s.g(this.f141197o, bVar.f141197o) && s.g(this.f141198p, bVar.f141198p);
    }

    public final int hashCode() {
        String str = this.f141183a;
        int iJ = wr.g.j((str == null ? 0 : str.hashCode()) * 31, 31, this.f141184b);
        String str2 = this.f141185c;
        int iHashCode = (this.f141188f.hashCode() + q6.f.g(u0.b((iJ + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f141186d), 31, this.f141187e)) * 31;
        Boolean bool = this.f141189g;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f141190h;
        int iB = u0.b(u0.b(u0.b((iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.f141191i), 31, this.f141192j), 31, this.f141193k);
        Integer num = this.f141194l;
        int iHashCode3 = (iB + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f141195m;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.f141196n;
        return this.f141198p.hashCode() + u0.b((iHashCode4 + (bool3 != null ? bool3.hashCode() : 0)) * 31, 31, this.f141197o);
    }

    public final String toString() {
        List<f> list = this.f141186d;
        boolean z14 = this.f141187e;
        d dVar = this.f141188f;
        List<i> list2 = this.f141191i;
        List<h> list3 = this.f141192j;
        StringBuilder sbI = p6.b.i("Contact(id=", this.f141183a, ", firstName=", this.f141184b, ", lastName=");
        e0.o(this.f141185c, ", emails=", ", hasSharingError=", sbI, list);
        sbI.append(z14);
        sbI.append(", contactType=");
        sbI.append(dVar);
        sbI.append(", isSosDefault=");
        b71.i.o(this.f141189g, this.f141190h, ", isLiveEventSharingDefault=", ", phones=", sbI);
        n23.j.z(sbI, list2, ", messengerPhones=", list3, ", contactSocialProfiles=");
        sbI.append(this.f141193k);
        sbI.append(", contactInfoLimit=");
        sbI.append(this.f141194l);
        sbI.append(", localId=");
        b71.i.w(sbI, this.f141195m, ", isEmsContact=", this.f141196n, ", unusedEmails=");
        return n23.j.j(sbI, this.f141197o, ", unusedPhones=", this.f141198p, ")");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lpu0/b$a;", "", "<init>", "()V", "", "COMPARATOR_LESS_THAN", "I", "COMPARATOR_GREATER_THAN", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(String str, String str2, String str3, List<f> list, boolean z14, d dVar, Boolean bool, Boolean bool2, List<i> list2, List<h> list3, List<c> list4, Integer num, String str4, Boolean bool3, List<f> list5, List<i> list6) {
        str2.getClass();
        list.getClass();
        dVar.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        this.f141183a = str;
        this.f141184b = str2;
        this.f141185c = str3;
        this.f141186d = list;
        this.f141187e = z14;
        this.f141188f = dVar;
        this.f141189g = bool;
        this.f141190h = bool2;
        this.f141191i = list2;
        this.f141192j = list3;
        this.f141193k = list4;
        this.f141194l = num;
        this.f141195m = str4;
        this.f141196n = bool3;
        this.f141197o = list5;
        this.f141198p = list6;
    }
}
