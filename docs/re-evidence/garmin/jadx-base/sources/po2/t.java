package po2;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpo2/t;", "", "", "cardName", "cardImageUrl", "cardNumber", "faqUrl", "callCenterPhoneNumber", "Lorg/joda/time/LocalDate;", "expirationDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDate;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f139381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f139382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LocalDate f139383f;

    public t(String str, String str2, String str3, String str4, String str5, LocalDate localDate) {
        hb.a.p(str, str2, str3, str4, str5);
        localDate.getClass();
        this.f139378a = str;
        this.f139379b = str2;
        this.f139380c = str3;
        this.f139381d = str4;
        this.f139382e = str5;
        this.f139383f = localDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f139378a.equals(tVar.f139378a) && this.f139379b.equals(tVar.f139379b) && this.f139380c.equals(tVar.f139380c) && this.f139381d.equals(tVar.f139381d) && this.f139382e.equals(tVar.f139382e) && this.f139383f.equals(tVar.f139383f);
    }

    public final int hashCode() {
        return this.f139383f.hashCode() + wr.g.j(wr.g.j(wr.g.j(wr.g.j(this.f139378a.hashCode() * 31, 31, this.f139379b), 31, this.f139380c), 31, this.f139381d), 31, this.f139382e);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("SnowballCardDetail(cardName=", this.f139378a, ", cardImageUrl=", this.f139379b, ", cardNumber=");
        sn.a.t(sbI, this.f139380c, ", faqUrl=", this.f139381d, ", callCenterPhoneNumber=");
        sbI.append(this.f139382e);
        sbI.append(", expirationDate=");
        sbI.append(this.f139383f);
        sbI.append(")");
        return sbI.toString();
    }
}
