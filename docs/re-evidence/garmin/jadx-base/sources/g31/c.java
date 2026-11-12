package g31;

import b71.i;
import i63.h;
import java.util.List;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lg31/c;", "", "", "deviceId", "deviceName", "partNumber", "", "allItemsCompleted", "", "Lg31/b;", "onboardingItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f75691f = {null, null, null, null, m.a(n.PUBLICATION, new g12.m(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f75695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b> f75696e;

    public /* synthetic */ c(int i14, String str, String str2, String str3, Boolean bool, List list, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f75692a = null;
        } else {
            this.f75692a = str;
        }
        if ((i14 & 2) == 0) {
            this.f75693b = null;
        } else {
            this.f75693b = str2;
        }
        if ((i14 & 4) == 0) {
            this.f75694c = null;
        } else {
            this.f75694c = str3;
        }
        if ((i14 & 8) == 0) {
            this.f75695d = null;
        } else {
            this.f75695d = bool;
        }
        if ((i14 & 16) == 0) {
            this.f75696e = null;
        } else {
            this.f75696e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f75692a, cVar.f75692a) && s.g(this.f75693b, cVar.f75693b) && s.g(this.f75694c, cVar.f75694c) && s.g(this.f75695d, cVar.f75695d) && s.g(this.f75696e, cVar.f75696e);
    }

    public final int hashCode() {
        String str = this.f75692a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f75693b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f75694c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f75695d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<b> list = this.f75696e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("OnboardingItemListDTO(deviceId=", this.f75692a, ", deviceName=", this.f75693b, ", partNumber=");
        i.w(sbI, this.f75694c, ", allItemsCompleted=", this.f75695d, ", onboardingItems=");
        return z.c(sbI, this.f75696e, ")");
    }

    /* JADX INFO: renamed from: g31.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg31/c$b;", "", "<init>", "()V", "Li63/c;", "Lg31/c;", "serializer", "()Li63/c;", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<c> serializer() {
            return a.f75697a;
        }

        private Companion() {
        }
    }

    public c() {
        this((String) null, (String) null, (String) null, (Boolean) null, (List) null, 31, (j) null);
    }

    public c(String str, String str2, String str3, Boolean bool, List<b> list) {
        this.f75692a = str;
        this.f75693b = str2;
        this.f75694c = str3;
        this.f75695d = bool;
        this.f75696e = list;
    }

    public /* synthetic */ c(String str, String str2, String str3, Boolean bool, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : bool, (i14 & 16) != 0 ? null : list);
    }
}
