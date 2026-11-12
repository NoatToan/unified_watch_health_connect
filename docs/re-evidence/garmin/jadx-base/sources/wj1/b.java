package wj1;

import l20.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lwj1/b;", "", "", "contactId", "firstName", "lastName", "Ll20/c;", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll20/c;)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f185786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f185787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f185788e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwj1/b$a;", "", "", "contactId", "", "phoneId", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f185789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f185790b;

        public a(String str, Long l14) {
            this.f185789a = str;
            this.f185790b = l14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f185789a, aVar.f185789a) && s.g(this.f185790b, aVar.f185790b);
        }

        public final int hashCode() {
            String str = this.f185789a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l14 = this.f185790b;
            return iHashCode + (l14 != null ? l14.hashCode() : 0);
        }

        public final String toString() {
            return "Id(contactId=" + this.f185789a + ", phoneId=" + this.f185790b + ")";
        }
    }

    public b(String str, String str2, String str3, c cVar) {
        str2.getClass();
        str3.getClass();
        cVar.getClass();
        this.f185784a = str;
        this.f185785b = str2;
        this.f185786c = str3;
        this.f185787d = cVar;
        this.f185788e = new a(str, cVar.getContactInfoPk());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f185784a, bVar.f185784a) && this.f185785b.equals(bVar.f185785b) && this.f185786c.equals(bVar.f185786c) && this.f185787d.equals(bVar.f185787d);
    }

    public final int hashCode() {
        String str = this.f185784a;
        return this.f185787d.hashCode() + g.j(g.j((str == null ? 0 : str.hashCode()) * 31, 31, this.f185785b), 31, this.f185786c);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("PhoneContact(contactId=", this.f185784a, ", firstName=", this.f185785b, ", lastName=");
        sbI.append(this.f185786c);
        sbI.append(", phone=");
        sbI.append(this.f185787d);
        sbI.append(")");
        return sbI.toString();
    }
}
