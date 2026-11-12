package com.garmin.device.sharing.management.dtos;

import am.j;
import an2.l;
import android.os.Parcel;
import android.os.Parcelable;
import fn2.a;
import i63.c;
import i63.h;
import l63.d;
import m63.k1;
import m63.u1;
import m63.y1;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p6.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ4\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b+\u0010&J \u0010/\u001a\u00020\u00122\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b/\u00100R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u001fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b6\u00104\u001a\u0004\b5\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b8\u00104\u001a\u0004\b7\u0010\u001f¨\u0006;"}, d2 = {"Lcom/garmin/device/sharing/management/dtos/GarminBondingInfo;", "Landroid/os/Parcelable;", "", "encryptionDiversifierBase64", "randBase64", "longTermKeyBase64", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "self", "Ll63/d;", "output", "Lk63/e;", "serialDesc", "", "write$Self$shared_device_management_release", "(Lcom/garmin/device/sharing/management/dtos/GarminBondingInfo;Ll63/d;Lk63/e;)V", "write$Self", "", "gbleEdiv", "()[B", "gbleRand", "gbleLongTermKey", "", "hasInfo", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/garmin/device/sharing/management/dtos/GarminBondingInfo;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getEncryptionDiversifierBase64", "getEncryptionDiversifierBase64$annotations", "()V", "getRandBase64", "getRandBase64$annotations", "getLongTermKeyBase64", "getLongTermKeyBase64$annotations", "Companion", "$serializer", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h
public final /* data */ class GarminBondingInfo implements Parcelable {
    private final String encryptionDiversifierBase64;
    private final String longTermKeyBase64;
    private final String randBase64;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<GarminBondingInfo> CREATOR = new Creator();

    @e
    public /* synthetic */ GarminBondingInfo(int i14, String str, String str2, String str3, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, GarminBondingInfo$$serializer.INSTANCE.getF158591b());
            throw null;
        }
        this.encryptionDiversifierBase64 = str;
        this.randBase64 = str2;
        this.longTermKeyBase64 = str3;
    }

    public static /* synthetic */ GarminBondingInfo copy$default(GarminBondingInfo garminBondingInfo, String str, String str2, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = garminBondingInfo.encryptionDiversifierBase64;
        }
        if ((i14 & 2) != 0) {
            str2 = garminBondingInfo.randBase64;
        }
        if ((i14 & 4) != 0) {
            str3 = garminBondingInfo.longTermKeyBase64;
        }
        return garminBondingInfo.copy(str, str2, str3);
    }

    public static /* synthetic */ void getEncryptionDiversifierBase64$annotations() {
    }

    public static /* synthetic */ void getLongTermKeyBase64$annotations() {
    }

    public static /* synthetic */ void getRandBase64$annotations() {
    }

    public static final /* synthetic */ void write$Self$shared_device_management_release(GarminBondingInfo self, d output, k63.e serialDesc) {
        y1 y1Var = y1.f117048a;
        output.d(serialDesc, 0, y1Var, self.encryptionDiversifierBase64);
        output.d(serialDesc, 1, y1Var, self.randBase64);
        output.d(serialDesc, 2, y1Var, self.longTermKeyBase64);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEncryptionDiversifierBase64() {
        return this.encryptionDiversifierBase64;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRandBase64() {
        return this.randBase64;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLongTermKeyBase64() {
        return this.longTermKeyBase64;
    }

    public final GarminBondingInfo copy(String encryptionDiversifierBase64, String randBase64, String longTermKeyBase64) {
        return new GarminBondingInfo(encryptionDiversifierBase64, randBase64, longTermKeyBase64);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GarminBondingInfo)) {
            return false;
        }
        GarminBondingInfo garminBondingInfo = (GarminBondingInfo) other;
        return s.g(this.encryptionDiversifierBase64, garminBondingInfo.encryptionDiversifierBase64) && s.g(this.randBase64, garminBondingInfo.randBase64) && s.g(this.longTermKeyBase64, garminBondingInfo.longTermKeyBase64);
    }

    public final byte[] gbleEdiv() {
        l lVar = l.f4589a;
        a aVar = a.f72254a;
        String str = this.encryptionDiversifierBase64;
        aVar.getClass();
        return a.a(str);
    }

    public final byte[] gbleLongTermKey() {
        a aVar = a.f72254a;
        String str = this.longTermKeyBase64;
        aVar.getClass();
        return a.a(str);
    }

    public final byte[] gbleRand() {
        a aVar = a.f72254a;
        String str = this.randBase64;
        aVar.getClass();
        return a.a(str);
    }

    public final String getEncryptionDiversifierBase64() {
        return this.encryptionDiversifierBase64;
    }

    public final String getLongTermKeyBase64() {
        return this.longTermKeyBase64;
    }

    public final String getRandBase64() {
        return this.randBase64;
    }

    public final boolean hasInfo() {
        return (this.encryptionDiversifierBase64 == null || this.randBase64 == null || this.longTermKeyBase64 == null) ? false : true;
    }

    public int hashCode() {
        String str = this.encryptionDiversifierBase64;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.randBase64;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.longTermKeyBase64;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return j.o(this.longTermKeyBase64, ")", b.i("GarminBondingInfo(encryptionDiversifierBase64=", this.encryptionDiversifierBase64, ", randBase64=", this.randBase64, ", longTermKeyBase64="));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.encryptionDiversifierBase64);
        parcel.writeString(this.randBase64);
        parcel.writeString(this.longTermKeyBase64);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/device/sharing/management/dtos/GarminBondingInfo$Companion;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/device/sharing/management/dtos/GarminBondingInfo;", "serializer", "()Li63/c;", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final c<GarminBondingInfo> serializer() {
            return GarminBondingInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GarminBondingInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GarminBondingInfo createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new GarminBondingInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GarminBondingInfo[] newArray(int i14) {
            return new GarminBondingInfo[i14];
        }
    }

    public GarminBondingInfo(String str, String str2, String str3) {
        this.encryptionDiversifierBase64 = str;
        this.randBase64 = str2;
        this.longTermKeyBase64 = str3;
    }
}
