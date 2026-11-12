package com.garmin.android.apps.connectmobile.settings.safetyfeatures.model;

import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p6.b;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/model/MccItem;", "", "countryName", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "mcc", "", "mnc", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getCountryName", "()Ljava/lang/String;", "getCountryCode", "getMcc", "()I", "getMnc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class MccItem {
    public static final int $stable = 0;
    private final String countryCode;
    private final String countryName;
    private final int mcc;
    private final String mnc;

    public MccItem(String str, String str2, int i14, String str3) {
        this.countryName = str;
        this.countryCode = str2;
        this.mcc = i14;
        this.mnc = str3;
    }

    public static /* synthetic */ MccItem copy$default(MccItem mccItem, String str, String str2, int i14, String str3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = mccItem.countryName;
        }
        if ((i15 & 2) != 0) {
            str2 = mccItem.countryCode;
        }
        if ((i15 & 4) != 0) {
            i14 = mccItem.mcc;
        }
        if ((i15 & 8) != 0) {
            str3 = mccItem.mnc;
        }
        return mccItem.copy(str, str2, i14, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMcc() {
        return this.mcc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMnc() {
        return this.mnc;
    }

    public final MccItem copy(String countryName, String countryCode, int mcc, String mnc) {
        return new MccItem(countryName, countryCode, mcc, mnc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MccItem)) {
            return false;
        }
        MccItem mccItem = (MccItem) other;
        return s.g(this.countryName, mccItem.countryName) && s.g(this.countryCode, mccItem.countryCode) && this.mcc == mccItem.mcc && s.g(this.mnc, mccItem.mnc);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    public final int getMcc() {
        return this.mcc;
    }

    public final String getMnc() {
        return this.mnc;
    }

    public int hashCode() {
        String str = this.countryName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryCode;
        int iD = q2.d(this.mcc, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.mnc;
        return iD + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.countryName;
        String str2 = this.countryCode;
        int i14 = this.mcc;
        String str3 = this.mnc;
        StringBuilder sbI = b.i("MccItem(countryName=", str, ", countryCode=", str2, ", mcc=");
        sbI.append(i14);
        sbI.append(", mnc=");
        sbI.append(str3);
        sbI.append(")");
        return sbI.toString();
    }
}
