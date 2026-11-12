package com.garmin.android.apps.connectmobile.badges.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/g;", "Landroid/os/Parcelable;", "", "badgeTitleTranslation", "badgeLocationTranslation", "badgeRangeTranslation", "badgeDescriptionTranslation", "challengeRuleDescriptionTranslation", "challengeRuleSummaryTranslation", "challengeRuleRewardTranslation", "challengeRewardDetailsTranslation", "challengeRewardTermsTranslation", "challengeAdditionalRule1", "challengeAdditionalRule2", "challengeRulesSummaryAdditionalSubhead1", "challengeRulesSummaryAdditionalSection1", "challengeRedeemRewardHeader", "challengeRedeemRewardMessage", "challengeRedeemRewardFooter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f30571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f30572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f30573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f30574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f30575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f30576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f30577j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f30578k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f30579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f30580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f30581n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f30582o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f30583p;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public /* synthetic */ g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : str7, (i14 & 128) != 0 ? null : str8, (i14 & 256) != 0 ? null : str9, (i14 & 512) != 0 ? null : str10, (i14 & 1024) != 0 ? null : str11, (i14 & 2048) != 0 ? null : str12, (i14 & 4096) != 0 ? null : str13, (i14 & 8192) != 0 ? null : str14, (i14 & 16384) != 0 ? null : str15, (i14 & 32768) != 0 ? null : str16);
    }

    public final boolean b() {
        String str;
        String str2;
        String str3;
        String str4 = this.f30568a;
        return str4 == null || str4.length() == 0 || (str = this.f30571d) == null || str.length() == 0 || (str2 = this.f30572e) == null || str2.length() == 0 || (str3 = this.f30573f) == null || str3.length() == 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.f30568a, gVar.f30568a) && p005kotlin.jvm.internal.s.g(this.f30569b, gVar.f30569b) && p005kotlin.jvm.internal.s.g(this.f30570c, gVar.f30570c) && p005kotlin.jvm.internal.s.g(this.f30571d, gVar.f30571d) && p005kotlin.jvm.internal.s.g(this.f30572e, gVar.f30572e) && p005kotlin.jvm.internal.s.g(this.f30573f, gVar.f30573f) && p005kotlin.jvm.internal.s.g(this.f30574g, gVar.f30574g) && p005kotlin.jvm.internal.s.g(this.f30575h, gVar.f30575h) && p005kotlin.jvm.internal.s.g(this.f30576i, gVar.f30576i) && p005kotlin.jvm.internal.s.g(this.f30577j, gVar.f30577j) && p005kotlin.jvm.internal.s.g(this.f30578k, gVar.f30578k) && p005kotlin.jvm.internal.s.g(this.f30579l, gVar.f30579l) && p005kotlin.jvm.internal.s.g(this.f30580m, gVar.f30580m) && p005kotlin.jvm.internal.s.g(this.f30581n, gVar.f30581n) && p005kotlin.jvm.internal.s.g(this.f30582o, gVar.f30582o) && p005kotlin.jvm.internal.s.g(this.f30583p, gVar.f30583p);
    }

    public final int hashCode() {
        String str = this.f30568a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f30569b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30570c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f30571d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f30572e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f30573f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f30574g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f30575h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f30576i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f30577j;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f30578k;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f30579l;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f30580m;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f30581n;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f30582o;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f30583p;
        return iHashCode15 + (str16 != null ? str16.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f30568a;
        String str2 = this.f30569b;
        String str3 = this.f30570c;
        String str4 = this.f30571d;
        String str5 = this.f30572e;
        String str6 = this.f30573f;
        String str7 = this.f30574g;
        String str8 = this.f30575h;
        String str9 = this.f30576i;
        String str10 = this.f30577j;
        String str11 = this.f30578k;
        String str12 = this.f30579l;
        String str13 = this.f30580m;
        String str14 = this.f30581n;
        String str15 = this.f30582o;
        String str16 = this.f30583p;
        StringBuilder sbI = p6.b.i("BadgeTranslationDTO(badgeTitleTranslation=", str, ", badgeLocationTranslation=", str2, ", badgeRangeTranslation=");
        sn.a.t(sbI, str3, ", badgeDescriptionTranslation=", str4, ", challengeRuleDescriptionTranslation=");
        sn.a.t(sbI, str5, ", challengeRuleSummaryTranslation=", str6, ", challengeRuleRewardTranslation=");
        sn.a.t(sbI, str7, ", challengeRewardDetailsTranslation=", str8, ", challengeRewardTermsTranslation=");
        sn.a.t(sbI, str9, ", challengeAdditionalRule1=", str10, ", challengeAdditionalRule2=");
        sn.a.t(sbI, str11, ", challengeRulesSummaryAdditionalSubhead1=", str12, ", challengeRulesSummaryAdditionalSection1=");
        sn.a.t(sbI, str13, ", challengeRedeemRewardHeader=", str14, ", challengeRedeemRewardMessage=");
        return e5.h(sbI, str15, ", challengeRedeemRewardFooter=", str16, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f30568a);
        parcel.writeString(this.f30569b);
        parcel.writeString(this.f30570c);
        parcel.writeString(this.f30571d);
        parcel.writeString(this.f30572e);
        parcel.writeString(this.f30573f);
        parcel.writeString(this.f30574g);
        parcel.writeString(this.f30575h);
        parcel.writeString(this.f30576i);
        parcel.writeString(this.f30577j);
        parcel.writeString(this.f30578k);
        parcel.writeString(this.f30579l);
        parcel.writeString(this.f30580m);
        parcel.writeString(this.f30581n);
        parcel.writeString(this.f30582o);
        parcel.writeString(this.f30583p);
    }

    public g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.f30568a = str;
        this.f30569b = str2;
        this.f30570c = str3;
        this.f30571d = str4;
        this.f30572e = str5;
        this.f30573f = str6;
        this.f30574g = str7;
        this.f30575h = str8;
        this.f30576i = str9;
        this.f30577j = str10;
        this.f30578k = str11;
        this.f30579l = str12;
        this.f30580m = str13;
        this.f30581n = str14;
        this.f30582o = str15;
        this.f30583p = str16;
    }

    public g() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }
}
