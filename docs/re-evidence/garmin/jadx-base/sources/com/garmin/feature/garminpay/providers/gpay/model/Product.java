package com.garmin.feature.garminpay.providers.gpay.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.MaintenanceException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fo2.d;
import fo2.i;
import fo2.q;
import fo2.x;
import fo2.y;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kg.f;
import lc.u0;
import org.apache.commons.lang3.e;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.l0;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001:\u0001UB·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u000e¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010+R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010+R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b4\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u00107\u001a\u0004\b8\u00109R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b6\u0010@R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b:\u0010CR\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b>\u0010FR\u001a\u0010\u0016\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010E\u001a\u0004\b(\u0010FR\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010\u001f\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010R\u001a\u0004\b0\u0010SR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010;\u001a\u0004\bA\u0010=¨\u0006V"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/model/Product;", "Landroid/os/Parcelable;", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "links", "", "productId", "Lfo2/y;", "productType", "productName", "providerId", "providerName", "cardType", "Ljava/util/Currency;", "currencyCode", "", "Lfo2/i;", "topUpFees", "issueFee", "", "maxBalance", "", "maxOccurrencesPerDevice", "ageBeforeDeletableDays", "", "Lfo2/q;", "maintenanceActions", "Lorg/joda/time/DateTime;", "createdTs", "", "createdTsEpoch", "Lfo2/d;", "cardMetaData", "Lfo2/x;", "paymentChannels", "<init>", "(Lcom/garmin/feature/garminpay/providers/gpay/model/Links;Ljava/lang/String;Lfo2/y;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Currency;Ljava/util/List;Lfo2/i;DIILjava/util/Set;Lorg/joda/time/DateTime;Ljava/lang/Long;Lfo2/d;Ljava/util/List;)V", "a", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "h", "()Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "b", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "c", "Lfo2/y;", "getProductType", "()Lfo2/y;", "d", "o", JWKParameterNames.RSA_EXPONENT, "getProviderId", "f", "getProviderName", "g", "Ljava/util/Currency;", "getCurrencyCode", "()Ljava/util/Currency;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/List;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Ljava/util/List;", "j", "Lfo2/i;", "()Lfo2/i;", JWKParameterNames.OCT_KEY_VALUE, "D", "()D", "l", "I", "()I", JWKParameterNames.RSA_MODULUS, "Ljava/util/Set;", "getMaintenanceActions", "()Ljava/util/Set;", "Lorg/joda/time/DateTime;", "getCreatedTs", "()Lorg/joda/time/DateTime;", "p", "Ljava/lang/Long;", "getCreatedTsEpoch", "()Ljava/lang/Long;", "Lfo2/d;", "()Lfo2/d;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "CurrencyTypeAdapter", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Product implements Parcelable {
    public static final Parcelable.Creator<Product> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("_links")
    private final Links links;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productId")
    private final String productId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productType")
    private final y productType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productName")
    private final String productName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("providerId")
    private final String providerId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("providerName")
    private final String providerName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardType")
    private final String cardType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("currencyCode")
    @JsonAdapter(CurrencyTypeAdapter.class)
    private final Currency currencyCode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("topUpFees")
    private final List<i> topUpFees;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("issueFee")
    private final i issueFee;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxBalance")
    private final double maxBalance;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxOccurrencesPerDevice")
    private final int maxOccurrencesPerDevice;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ageBeforeDeletableDays")
    private final int ageBeforeDeletableDays;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maintenanceActions")
    private final Set<q> maintenanceActions;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTs")
    private final DateTime createdTs;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTsEpoch")
    private final Long createdTsEpoch;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardMetaData")
    private final d cardMetaData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("paymentChannels")
    private final List<x> paymentChannels;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/model/Product$CurrencyTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Ljava/util/Currency;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CurrencyTypeAdapter extends TypeAdapter<Currency> {
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final Currency read2(JsonReader jsonReader) {
            String strNextString;
            if (jsonReader == null || (strNextString = jsonReader.nextString()) == null) {
                return null;
            }
            return Currency.getInstance(strNextString);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Currency currency) {
            Currency currency2 = currency;
            if (jsonWriter != null) {
                jsonWriter.value(currency2 != null ? currency2.getCurrencyCode() : null);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Product> {
        @Override // android.os.Parcelable.Creator
        public final Product createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LinkedHashSet linkedHashSet;
            ArrayList arrayList2;
            parcel.getClass();
            Links links = (Links) parcel.readSerializable();
            String string = parcel.readString();
            y yVarValueOf = y.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Currency currency = (Currency) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = f.a(i.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            i iVarCreateFromParcel = parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel);
            double d14 = parcel.readDouble();
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i17 = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    linkedHashSet.add(q.valueOf(parcel.readString()));
                }
            }
            DateTime dateTime = (DateTime) parcel.readSerializable();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            d dVarCreateFromParcel = d.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i19 = parcel.readInt();
                arrayList2 = new ArrayList(i19);
                int i24 = 0;
                while (i24 != i19) {
                    arrayList2.add(x.valueOf(parcel.readString()));
                    i24++;
                    i19 = i19;
                }
            }
            return new Product(links, string, yVarValueOf, string2, string3, string4, string5, currency, arrayList, iVarCreateFromParcel, d14, i15, i16, linkedHashSet, dateTime, lValueOf, dVarCreateFromParcel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Product[] newArray(int i14) {
            return new Product[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Product(Links links, String str, y yVar, String str2, String str3, String str4, String str5, Currency currency, List<i> list, i iVar, double d14, int i14, int i15, Set<? extends q> set, DateTime dateTime, Long l14, d dVar, List<? extends x> list2) {
        links.getClass();
        str.getClass();
        yVar.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        dVar.getClass();
        this.links = links;
        this.productId = str;
        this.productType = yVar;
        this.productName = str2;
        this.providerId = str3;
        this.providerName = str4;
        this.cardType = str5;
        this.currencyCode = currency;
        this.topUpFees = list;
        this.issueFee = iVar;
        this.maxBalance = d14;
        this.maxOccurrencesPerDevice = i14;
        this.ageBeforeDeletableDays = i15;
        this.maintenanceActions = set;
        this.createdTs = dateTime;
        this.createdTsEpoch = l14;
        this.cardMetaData = dVar;
        this.paymentChannels = list2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAgeBeforeDeletableDays() {
        return this.ageBeforeDeletableDays;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getCardMetaData() {
        return this.cardMetaData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        return s.g(this.links, product.links) && s.g(this.productId, product.productId) && this.productType == product.productType && s.g(this.productName, product.productName) && s.g(this.providerId, product.providerId) && s.g(this.providerName, product.providerName) && s.g(this.cardType, product.cardType) && s.g(this.currencyCode, product.currencyCode) && s.g(this.topUpFees, product.topUpFees) && s.g(this.issueFee, product.issueFee) && Double.compare(this.maxBalance, product.maxBalance) == 0 && this.maxOccurrencesPerDevice == product.maxOccurrencesPerDevice && this.ageBeforeDeletableDays == product.ageBeforeDeletableDays && s.g(this.maintenanceActions, product.maintenanceActions) && s.g(this.createdTs, product.createdTs) && s.g(this.createdTsEpoch, product.createdTsEpoch) && s.g(this.cardMetaData, product.cardMetaData) && s.g(this.paymentChannels, product.paymentChannels);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final i getIssueFee() {
        return this.issueFee;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Links getLinks() {
        return this.links;
    }

    public final int hashCode() {
        int iJ = g.j(g.j(g.j(g.j((this.productType.hashCode() + g.j(this.links.f51142a.hashCode() * 31, 31, this.productId)) * 31, 31, this.productName), 31, this.providerId), 31, this.providerName), 31, this.cardType);
        Currency currency = this.currencyCode;
        int iHashCode = (iJ + (currency == null ? 0 : currency.hashCode())) * 31;
        List<i> list = this.topUpFees;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        i iVar = this.issueFee;
        int iD = q2.d(this.ageBeforeDeletableDays, q2.d(this.maxOccurrencesPerDevice, e.b((iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31, 31, this.maxBalance), 31), 31);
        Set<q> set = this.maintenanceActions;
        int iHashCode3 = (iD + (set == null ? 0 : set.hashCode())) * 31;
        DateTime dateTime = this.createdTs;
        int iHashCode4 = (iHashCode3 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Long l14 = this.createdTsEpoch;
        int iHashCode5 = (this.cardMetaData.hashCode() + ((iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31)) * 31;
        List<x> list2 = this.paymentChannels;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final double getMaxBalance() {
        return this.maxBalance;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getMaxOccurrencesPerDevice() {
        return this.maxOccurrencesPerDevice;
    }

    public final List<x> k() {
        return this.paymentChannels;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    public final List<i> q() {
        return this.topUpFees;
    }

    public final void r(q qVar) {
        qVar.getClass();
        Set set = this.maintenanceActions;
        if (set == null) {
            set = l0.f134950a;
        }
        if (p13.x.k(q.ISSUE, q.TOPUP).contains(qVar) && set.contains(q.TEMPORARILY_UNAVAILABLE)) {
            throw new IllegalStateException(qVar + " is temporarily unavailable");
        }
        if (set.contains(qVar)) {
            throw new MaintenanceException(qVar + " is in maintenance");
        }
    }

    public final String toString() {
        Links links = this.links;
        String str = this.productId;
        y yVar = this.productType;
        String str2 = this.productName;
        String str3 = this.providerId;
        String str4 = this.providerName;
        String str5 = this.cardType;
        Currency currency = this.currencyCode;
        List<i> list = this.topUpFees;
        i iVar = this.issueFee;
        double d14 = this.maxBalance;
        int i14 = this.maxOccurrencesPerDevice;
        int i15 = this.ageBeforeDeletableDays;
        Set<q> set = this.maintenanceActions;
        DateTime dateTime = this.createdTs;
        Long l14 = this.createdTsEpoch;
        d dVar = this.cardMetaData;
        List<x> list2 = this.paymentChannels;
        StringBuilder sb3 = new StringBuilder("Product(links=");
        sb3.append(links);
        sb3.append(", productId=");
        sb3.append(str);
        sb3.append(", productType=");
        sb3.append(yVar);
        sb3.append(", productName=");
        sb3.append(str2);
        sb3.append(", providerId=");
        sn.a.t(sb3, str3, ", providerName=", str4, ", cardType=");
        sb3.append(str5);
        sb3.append(", currencyCode=");
        sb3.append(currency);
        sb3.append(", topUpFees=");
        sb3.append(list);
        sb3.append(", issueFee=");
        sb3.append(iVar);
        sb3.append(", maxBalance=");
        sb3.append(d14);
        sb3.append(", maxOccurrencesPerDevice=");
        sb3.append(i14);
        sb3.append(", ageBeforeDeletableDays=");
        sb3.append(i15);
        sb3.append(", maintenanceActions=");
        sb3.append(set);
        sb3.append(", createdTs=");
        sb3.append(dateTime);
        sb3.append(", createdTsEpoch=");
        sb3.append(l14);
        sb3.append(", cardMetaData=");
        sb3.append(dVar);
        sb3.append(", paymentChannels=");
        sb3.append(list2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.links);
        parcel.writeString(this.productId);
        parcel.writeString(this.productType.name());
        parcel.writeString(this.productName);
        parcel.writeString(this.providerId);
        parcel.writeString(this.providerName);
        parcel.writeString(this.cardType);
        parcel.writeSerializable(this.currencyCode);
        List<i> list = this.topUpFees;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((i) itO.next()).writeToParcel(parcel, i14);
            }
        }
        i iVar = this.issueFee;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, i14);
        }
        parcel.writeDouble(this.maxBalance);
        parcel.writeInt(this.maxOccurrencesPerDevice);
        parcel.writeInt(this.ageBeforeDeletableDays);
        Set<q> set = this.maintenanceActions;
        if (set == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(set.size());
            Iterator<q> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().name());
            }
        }
        parcel.writeSerializable(this.createdTs);
        Long l14 = this.createdTsEpoch;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        this.cardMetaData.writeToParcel(parcel, i14);
        List<x> list2 = this.paymentChannels;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO2 = u0.o(parcel, list2, 1);
        while (itO2.hasNext()) {
            parcel.writeString(((x) itO2.next()).name());
        }
    }
}
