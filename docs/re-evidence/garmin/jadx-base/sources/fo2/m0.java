package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b \u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b!\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b\"\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006%"}, d2 = {"Lfo2/m0;", "Landroid/os/Parcelable;", "Lfo2/p;", "selfLink", "eventStream", "creditCards", "credentials", "paymentCards", "devices", "paymentDevices", "webAppWallet", "webAppAddCard", "purchases", "userStatistics", "refunds", "consent", "<init>", "(Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;)V", "a", "Lfo2/p;", "m", "()Lfo2/p;", "b", "h", "c", "f", "d", JWKParameterNames.RSA_EXPONENT, IntegerTokenConverter.CONVERTER_KEY, "g", "getPaymentDevices", "getWebAppWallet", "getWebAppAddCard", "j", JWKParameterNames.OCT_KEY_VALUE, "o", "l", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m0 implements Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("self")
    private final p selfLink;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventStream")
    private final p eventStream;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("creditCards")
    private final p creditCards;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("credentials")
    private final p credentials;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("paymentCards")
    private final p paymentCards;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("devices")
    private final p devices;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("paymentDevices")
    private final p paymentDevices;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("webapp.wallet")
    private final p webAppWallet;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("webapp.addCard")
    private final p webAppAddCard;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("purchases")
    private final p purchases;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userStatistics")
    private final p userStatistics;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("refunds")
    private final p refunds;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consent")
    private final p consent;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m0> {
        @Override // android.os.Parcelable.Creator
        public final m0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<p> creator = p.CREATOR;
            return new m0(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final m0[] newArray(int i14) {
            return new m0[i14];
        }
    }

    public m0(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, p pVar8, p pVar9, p pVar10, p pVar11, p pVar12, p pVar13) {
        pVar.getClass();
        pVar2.getClass();
        pVar6.getClass();
        pVar7.getClass();
        pVar8.getClass();
        pVar9.getClass();
        this.selfLink = pVar;
        this.eventStream = pVar2;
        this.creditCards = pVar3;
        this.credentials = pVar4;
        this.paymentCards = pVar5;
        this.devices = pVar6;
        this.paymentDevices = pVar7;
        this.webAppWallet = pVar8;
        this.webAppAddCard = pVar9;
        this.purchases = pVar10;
        this.userStatistics = pVar11;
        this.refunds = pVar12;
        this.consent = pVar13;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final p getConsent() {
        return this.consent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final p getCredentials() {
        return this.credentials;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return p005kotlin.jvm.internal.s.g(this.selfLink, m0Var.selfLink) && p005kotlin.jvm.internal.s.g(this.eventStream, m0Var.eventStream) && p005kotlin.jvm.internal.s.g(this.creditCards, m0Var.creditCards) && p005kotlin.jvm.internal.s.g(this.credentials, m0Var.credentials) && p005kotlin.jvm.internal.s.g(this.paymentCards, m0Var.paymentCards) && p005kotlin.jvm.internal.s.g(this.devices, m0Var.devices) && p005kotlin.jvm.internal.s.g(this.paymentDevices, m0Var.paymentDevices) && p005kotlin.jvm.internal.s.g(this.webAppWallet, m0Var.webAppWallet) && p005kotlin.jvm.internal.s.g(this.webAppAddCard, m0Var.webAppAddCard) && p005kotlin.jvm.internal.s.g(this.purchases, m0Var.purchases) && p005kotlin.jvm.internal.s.g(this.userStatistics, m0Var.userStatistics) && p005kotlin.jvm.internal.s.g(this.refunds, m0Var.refunds) && p005kotlin.jvm.internal.s.g(this.consent, m0Var.consent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final p getCreditCards() {
        return this.creditCards;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final p getDevices() {
        return this.devices;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final p getEventStream() {
        return this.eventStream;
    }

    public final int hashCode() {
        int iE = fb1.c.e(this.eventStream, this.selfLink.hashCode() * 31, 31);
        p pVar = this.creditCards;
        int iHashCode = (iE + (pVar == null ? 0 : pVar.hashCode())) * 31;
        p pVar2 = this.credentials;
        int iHashCode2 = (iHashCode + (pVar2 == null ? 0 : pVar2.hashCode())) * 31;
        p pVar3 = this.paymentCards;
        int iE2 = fb1.c.e(this.webAppAddCard, fb1.c.e(this.webAppWallet, fb1.c.e(this.paymentDevices, fb1.c.e(this.devices, (iHashCode2 + (pVar3 == null ? 0 : pVar3.hashCode())) * 31, 31), 31), 31), 31);
        p pVar4 = this.purchases;
        int iHashCode3 = (iE2 + (pVar4 == null ? 0 : pVar4.hashCode())) * 31;
        p pVar5 = this.userStatistics;
        int iHashCode4 = (iHashCode3 + (pVar5 == null ? 0 : pVar5.hashCode())) * 31;
        p pVar6 = this.refunds;
        int iHashCode5 = (iHashCode4 + (pVar6 == null ? 0 : pVar6.hashCode())) * 31;
        p pVar7 = this.consent;
        return iHashCode5 + (pVar7 != null ? pVar7.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final p getPaymentCards() {
        return this.paymentCards;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final p getPurchases() {
        return this.purchases;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final p getRefunds() {
        return this.refunds;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final p getSelfLink() {
        return this.selfLink;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final p getUserStatistics() {
        return this.userStatistics;
    }

    public final String toString() {
        return "UserLinks(selfLink=" + this.selfLink + ", eventStream=" + this.eventStream + ", creditCards=" + this.creditCards + ", credentials=" + this.credentials + ", paymentCards=" + this.paymentCards + ", devices=" + this.devices + ", paymentDevices=" + this.paymentDevices + ", webAppWallet=" + this.webAppWallet + ", webAppAddCard=" + this.webAppAddCard + ", purchases=" + this.purchases + ", userStatistics=" + this.userStatistics + ", refunds=" + this.refunds + ", consent=" + this.consent + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.selfLink.writeToParcel(parcel, i14);
        this.eventStream.writeToParcel(parcel, i14);
        p pVar = this.creditCards;
        if (pVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar.writeToParcel(parcel, i14);
        }
        p pVar2 = this.credentials;
        if (pVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar2.writeToParcel(parcel, i14);
        }
        p pVar3 = this.paymentCards;
        if (pVar3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar3.writeToParcel(parcel, i14);
        }
        this.devices.writeToParcel(parcel, i14);
        this.paymentDevices.writeToParcel(parcel, i14);
        this.webAppWallet.writeToParcel(parcel, i14);
        this.webAppAddCard.writeToParcel(parcel, i14);
        p pVar4 = this.purchases;
        if (pVar4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar4.writeToParcel(parcel, i14);
        }
        p pVar5 = this.userStatistics;
        if (pVar5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar5.writeToParcel(parcel, i14);
        }
        p pVar6 = this.refunds;
        if (pVar6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar6.writeToParcel(parcel, i14);
        }
        p pVar7 = this.consent;
        if (pVar7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar7.writeToParcel(parcel, i14);
        }
    }
}
