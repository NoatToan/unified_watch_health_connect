package com.garmin.device.sharing.management.dtos;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import d53.t;
import d53.w;
import hb.a;
import java.util.Arrays;
import java.util.Collection;
import kg.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import tn.k;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b2\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001ZB\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010/J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÀ\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010BJ\t\u0010C\u001a\u00020\u000eHÖ\u0001J\u0010\u0010D\u001a\u00020\u00172\b\u0010E\u001a\u0004\u0018\u00010\u0000J\u0015\u0010F\u001a\u00020\u00172\b\u0010G\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00172\b\u0010E\u001a\u0004\u0018\u00010JH\u0096\u0002J\u0006\u0010K\u001a\u00020\u0017J\b\u0010L\u001a\u00020\u000eH\u0016J\u001b\u0010M\u001a\u00020\u00172\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00050OH\u0000¢\u0006\u0002\bPJ\u0006\u0010Q\u001a\u00020\u0017J\u0014\u0010R\u001a\u00020\u00172\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u000e0OJ\b\u0010T\u001a\u00020\u0005H\u0016J\u0019\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/¨\u0006["}, d2 = {"Lcom/garmin/device/sharing/management/dtos/SharedDeviceInfo;", "Landroid/os/Parcelable;", "unitID", "", "displayName", "", "partNumber", "productDisplayName", "productNumber", "softwareVersion", "imageURL", "applicationKey", "macAddress", "connectionType", "", "gbleEdiv", "", "gbleRand", "gbleLongTermKey", "capabilities", "deviceDto", "Lcom/garmin/device/sharing/management/dtos/IRegisteredDeviceDto;", "wasSavedLocally", "", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;[B[B[B[BLcom/garmin/device/sharing/management/dtos/IRegisteredDeviceDto;Ljava/lang/Boolean;)V", "getApplicationKey", "()Ljava/lang/String;", "getCapabilities", "()[B", "getConnectionType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDeviceDto", "()Lcom/garmin/device/sharing/management/dtos/IRegisteredDeviceDto;", "getDisplayName", "getGbleEdiv", "getGbleLongTermKey", "getGbleRand", "getImageURL", "getMacAddress", "getPartNumber", "getProductDisplayName", "getProductNumber", "getSoftwareVersion", "getUnitID", "()J", "getWasSavedLocally", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;[B[B[B[BLcom/garmin/device/sharing/management/dtos/IRegisteredDeviceDto;Ljava/lang/Boolean;)Lcom/garmin/device/sharing/management/dtos/SharedDeviceInfo;", "describeContents", "deviceDataEquals", "other", "doesConnectionTypeMatch", "otherConnectionType", "(Ljava/lang/Integer;)Z", "equals", "", "hasGarminAuth", "hashCode", "isBonded", "bondedDevices", "", "isBonded$shared_device_management_release", "isPaired", "isSupportedConnectionType", "supportedConnectionTypes", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SharedDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<SharedDeviceInfo> CREATOR = new Creator();
    private final String applicationKey;
    private final byte[] capabilities;
    private final Integer connectionType;
    private final IRegisteredDeviceDto deviceDto;
    private final String displayName;
    private final byte[] gbleEdiv;
    private final byte[] gbleLongTermKey;
    private final byte[] gbleRand;
    private final String imageURL;
    private final String macAddress;
    private final String partNumber;
    private final String productDisplayName;
    private final String productNumber;
    private final String softwareVersion;
    private final long unitID;
    private final Boolean wasSavedLocally;

    public /* synthetic */ SharedDeviceInfo(long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, IRegisteredDeviceDto iRegisteredDeviceDto, Boolean bool, int i14, j jVar) {
        this(j8, str, str2, str3, str4, str5, str6, str7, str8, num, bArr, bArr2, bArr3, bArr4, (i14 & 16384) != 0 ? null : iRegisteredDeviceDto, (i14 & 32768) != 0 ? null : bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUnitID() {
        return this.unitID;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getConnectionType() {
        return this.connectionType;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final byte[] getGbleEdiv() {
        return this.gbleEdiv;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final byte[] getGbleRand() {
        return this.gbleRand;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final byte[] getGbleLongTermKey() {
        return this.gbleLongTermKey;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final byte[] getCapabilities() {
        return this.capabilities;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final IRegisteredDeviceDto getDeviceDto() {
        return this.deviceDto;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getWasSavedLocally() {
        return this.wasSavedLocally;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPartNumber() {
        return this.partNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProductDisplayName() {
        return this.productDisplayName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProductNumber() {
        return this.productNumber;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSoftwareVersion() {
        return this.softwareVersion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getApplicationKey() {
        return this.applicationKey;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMacAddress() {
        return this.macAddress;
    }

    public final SharedDeviceInfo copy(long unitID, String displayName, String partNumber, String productDisplayName, String productNumber, String softwareVersion, String imageURL, String applicationKey, String macAddress, Integer connectionType, byte[] gbleEdiv, byte[] gbleRand, byte[] gbleLongTermKey, byte[] capabilities, IRegisteredDeviceDto deviceDto, Boolean wasSavedLocally) {
        a.p(displayName, partNumber, productDisplayName, productNumber, imageURL);
        applicationKey.getClass();
        return new SharedDeviceInfo(unitID, displayName, partNumber, productDisplayName, productNumber, softwareVersion, imageURL, applicationKey, macAddress, connectionType, gbleEdiv, gbleRand, gbleLongTermKey, capabilities, deviceDto, wasSavedLocally);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean deviceDataEquals(SharedDeviceInfo other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return this.unitID == other.unitID && s.g(this.displayName, other.displayName) && s.g(this.partNumber, other.partNumber) && s.g(this.productDisplayName, other.productDisplayName) && s.g(this.productNumber, other.productNumber) && s.g(this.imageURL, other.imageURL) && s.g(this.applicationKey, other.applicationKey) && s.g(this.deviceDto, other.deviceDto);
    }

    public final boolean doesConnectionTypeMatch(Integer otherConnectionType) {
        Integer num = this.connectionType;
        if (num == null || ((num != null && num.intValue() == 0) || otherConnectionType == null || otherConnectionType.intValue() == 0)) {
            return true;
        }
        return s.g(this.connectionType, otherConnectionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!SharedDeviceInfo.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        SharedDeviceInfo sharedDeviceInfo = (SharedDeviceInfo) other;
        if (this.unitID != sharedDeviceInfo.unitID || !s.g(this.displayName, sharedDeviceInfo.displayName) || !s.g(this.partNumber, sharedDeviceInfo.partNumber) || !s.g(this.productDisplayName, sharedDeviceInfo.productDisplayName) || !s.g(this.productNumber, sharedDeviceInfo.productNumber) || !s.g(this.softwareVersion, sharedDeviceInfo.softwareVersion) || !s.g(this.imageURL, sharedDeviceInfo.imageURL) || !s.g(this.applicationKey, sharedDeviceInfo.applicationKey) || !s.g(this.macAddress, sharedDeviceInfo.macAddress) || !s.g(this.connectionType, sharedDeviceInfo.connectionType)) {
            return false;
        }
        byte[] bArr = this.gbleEdiv;
        byte[] bArr2 = sharedDeviceInfo.gbleEdiv;
        if (bArr != null) {
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (bArr2 != null) {
            return false;
        }
        byte[] bArr3 = this.gbleRand;
        byte[] bArr4 = sharedDeviceInfo.gbleRand;
        if (bArr3 != null) {
            if (bArr4 == null || !Arrays.equals(bArr3, bArr4)) {
                return false;
            }
        } else if (bArr4 != null) {
            return false;
        }
        byte[] bArr5 = this.gbleLongTermKey;
        byte[] bArr6 = sharedDeviceInfo.gbleLongTermKey;
        if (bArr5 != null) {
            if (bArr6 == null || !Arrays.equals(bArr5, bArr6)) {
                return false;
            }
        } else if (bArr6 != null) {
            return false;
        }
        byte[] bArr7 = this.capabilities;
        byte[] bArr8 = sharedDeviceInfo.capabilities;
        if (bArr7 != null) {
            if (bArr8 == null || !Arrays.equals(bArr7, bArr8)) {
                return false;
            }
        } else if (bArr8 != null) {
            return false;
        }
        return s.g(this.deviceDto, sharedDeviceInfo.deviceDto);
    }

    public final String getApplicationKey() {
        return this.applicationKey;
    }

    public final byte[] getCapabilities() {
        return this.capabilities;
    }

    public final Integer getConnectionType() {
        return this.connectionType;
    }

    public final IRegisteredDeviceDto getDeviceDto() {
        return this.deviceDto;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final byte[] getGbleEdiv() {
        return this.gbleEdiv;
    }

    public final byte[] getGbleLongTermKey() {
        return this.gbleLongTermKey;
    }

    public final byte[] getGbleRand() {
        return this.gbleRand;
    }

    public final String getImageURL() {
        return this.imageURL;
    }

    public final String getMacAddress() {
        return this.macAddress;
    }

    public final String getPartNumber() {
        return this.partNumber;
    }

    public final String getProductDisplayName() {
        return this.productDisplayName;
    }

    public final String getProductNumber() {
        return this.productNumber;
    }

    public final String getSoftwareVersion() {
        return this.softwareVersion;
    }

    public final long getUnitID() {
        return this.unitID;
    }

    public final Boolean getWasSavedLocally() {
        return this.wasSavedLocally;
    }

    public final boolean hasGarminAuth() {
        return (this.gbleEdiv == null || this.gbleRand == null || this.gbleLongTermKey == null) ? false : true;
    }

    public int hashCode() {
        int iJ = g.j(g.j(g.j(g.j(Long.hashCode(this.unitID) * 31, 31, this.displayName), 31, this.partNumber), 31, this.productDisplayName), 31, this.productNumber);
        String str = this.softwareVersion;
        int iJ2 = g.j(g.j((iJ + (str != null ? str.hashCode() : 0)) * 31, 31, this.imageURL), 31, this.applicationKey);
        String str2 = this.macAddress;
        int iHashCode = (iJ2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.connectionType;
        int iIntValue = (iHashCode + (num != null ? num.intValue() : 0)) * 31;
        byte[] bArr = this.gbleEdiv;
        int iHashCode2 = (iIntValue + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        byte[] bArr2 = this.gbleRand;
        int iHashCode3 = (iHashCode2 + (bArr2 != null ? Arrays.hashCode(bArr2) : 0)) * 31;
        byte[] bArr3 = this.gbleLongTermKey;
        int iHashCode4 = (iHashCode3 + (bArr3 != null ? Arrays.hashCode(bArr3) : 0)) * 31;
        byte[] bArr4 = this.capabilities;
        int iHashCode5 = (iHashCode4 + (bArr4 != null ? Arrays.hashCode(bArr4) : 0)) * 31;
        IRegisteredDeviceDto iRegisteredDeviceDto = this.deviceDto;
        return iHashCode5 + (iRegisteredDeviceDto != null ? iRegisteredDeviceDto.hashCode() : 0);
    }

    public final boolean isBonded$shared_device_management_release(Collection<String> bondedDevices) {
        bondedDevices.getClass();
        if (isPaired()) {
            return hasGarminAuth() || h0.R(bondedDevices, this.macAddress);
        }
        return false;
    }

    public final boolean isPaired() {
        String str = this.macAddress;
        return str != null && str.length() > 0;
    }

    public final boolean isSupportedConnectionType(Collection<Integer> supportedConnectionTypes) {
        supportedConnectionTypes.getClass();
        Integer num = this.connectionType;
        if (num == null) {
            return true;
        }
        if (num != null && num.intValue() == 0) {
            return true;
        }
        return supportedConnectionTypes.contains(this.connectionType);
    }

    public String toString() {
        Integer num = this.connectionType;
        long j8 = this.unitID;
        String str = this.displayName;
        String str2 = this.partNumber;
        String str3 = this.productDisplayName;
        String str4 = this.productNumber;
        String str5 = this.softwareVersion;
        String str6 = this.imageURL;
        String str7 = this.macAddress;
        String str8 = this.gbleEdiv == null ? "" : "not null";
        String str9 = this.gbleRand == null ? "" : "not null";
        String str10 = this.gbleLongTermKey == null ? "" : "not null";
        StringBuilder sb3 = new StringBuilder("SharedDeviceInfo{connectionType='");
        sb3.append(num);
        sb3.append("', unitID=");
        sb3.append(j8);
        sn.a.t(sb3, ", displayName='", str, "', partNumber='", str2);
        sn.a.t(sb3, "', productDisplayName='", str3, "', productNumber='", str4);
        sn.a.t(sb3, "', softwareVersion='", str5, "', imageURL='", str6);
        sn.a.t(sb3, "', macAddress='", str7, "', gbleEdiv=[", str8);
        sn.a.t(sb3, "], gbleRand=[", str9, "], gbleLongTermKey=[", str10);
        sb3.append("]}");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeLong(this.unitID);
        parcel.writeString(this.displayName);
        parcel.writeString(this.partNumber);
        parcel.writeString(this.productDisplayName);
        parcel.writeString(this.productNumber);
        parcel.writeString(this.softwareVersion);
        parcel.writeString(this.imageURL);
        parcel.writeString(this.applicationKey);
        parcel.writeString(this.macAddress);
        Integer num = this.connectionType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num);
        }
        parcel.writeByteArray(this.gbleEdiv);
        parcel.writeByteArray(this.gbleRand);
        parcel.writeByteArray(this.gbleLongTermKey);
        parcel.writeByteArray(this.capabilities);
        parcel.writeParcelable(this.deviceDto, flags);
        Boolean bool = this.wasSavedLocally;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SharedDeviceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 1, list:
              (r0v0 ?? I:??[OBJECT, ARRAY]) from 0x0089: RETURN (r0v0 ?? I:??[OBJECT, ARRAY])
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        @Override // android.os.Parcelable.Creator
        public final com.garmin.device.sharing.management.dtos.SharedDeviceInfo createFromParcel(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 1, list:
              (r0v0 ?? I:??[OBJECT, ARRAY]) from 0x0089: RETURN (r0v0 ?? I:??[OBJECT, ARRAY])
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:320)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:297)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            */

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SharedDeviceInfo[] newArray(int i14) {
            return new SharedDeviceInfo[i14];
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nB\u0005¢\u0006\u0002\u0010\u000bJ\u0014\u0010#\u001a\u0004\u0018\u00010\u000f2\b\u0010$\u001a\u0004\u0018\u00010\rH\u0002J\u0006\u0010%\u001a\u00020\bJ\u0006\u0010&\u001a\u00020\u0000J\u0010\u0010'\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010'\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\rJ\u000e\u0010*\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ$\u0010,\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010\u000f2\b\u0010.\u001a\u0004\u0018\u00010\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u000fJ$\u0010,\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010\r2\b\u00101\u001a\u0004\u0018\u00010\r2\b\u00102\u001a\u0004\u0018\u00010\rJ\u001c\u00103\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\rJ\u000e\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020!R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\"¨\u00068"}, d2 = {"Lcom/garmin/device/sharing/management/dtos/SharedDeviceInfo$Builder;", "", "deviceDTO", "Lcom/garmin/device/sharing/management/dtos/IRegisteredDeviceDto;", "connectionInfoDto", "Lcom/garmin/device/sharing/management/dtos/ConnectionInfoDto;", "(Lcom/garmin/device/sharing/management/dtos/IRegisteredDeviceDto;Lcom/garmin/device/sharing/management/dtos/ConnectionInfoDto;)V", "other", "Lcom/garmin/device/sharing/management/dtos/SharedDeviceInfo;", "(Lcom/garmin/device/sharing/management/dtos/SharedDeviceInfo;)V", "(Lcom/garmin/device/sharing/management/dtos/SharedDeviceInfo;Lcom/garmin/device/sharing/management/dtos/ConnectionInfoDto;)V", "()V", "applicationKey", "", "capabilities", "", "connectionType", "", "Ljava/lang/Integer;", "deviceDto", "displayName", "gbleEdiv", "gbleLongTermKey", "gbleRand", "imageURL", "macAddress", "partNumber", "productDisplayName", "productNumber", "softwareVersion", "unitID", "", "wasSavedLocally", "", "Ljava/lang/Boolean;", "base64Decode", "s", "build", "clearGarminAuth", "configureCapabilities", "capabilitiesArray", "capabilitiesBase64", "configureConnectionInfo", "configureDeviceInfo", "configureGarminAuth", "encryptionDiversifier", "rand", "longTermKey", "encryptionDiversifierBase64", "randBase64", "longTermKeyBase64", "configureSWVersion", "swVersion", "otherSwVersion", "configureWasSavedLocally", "wasSaved", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        public String applicationKey;
        public byte[] capabilities;
        public Integer connectionType;
        public IRegisteredDeviceDto deviceDto;
        public String displayName;
        public byte[] gbleEdiv;
        public byte[] gbleLongTermKey;
        public byte[] gbleRand;
        public String imageURL;
        public String macAddress;
        public String partNumber;
        public String productDisplayName;
        public String productNumber;
        public String softwareVersion;
        public long unitID;
        public Boolean wasSavedLocally;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(IRegisteredDeviceDto iRegisteredDeviceDto, ConnectionInfoDto connectionInfoDto) {
            this();
            iRegisteredDeviceDto.getClass();
            this.unitID = iRegisteredDeviceDto.getDeviceUnitId();
            String partNumberPartial = iRegisteredDeviceDto.getPartNumberPartial();
            this.productNumber = partNumberPartial == null ? "" : partNumberPartial;
            String partNumber = iRegisteredDeviceDto.getPartNumber();
            this.partNumber = partNumber == null ? "" : partNumber;
            this.softwareVersion = null;
            String imageUrl = iRegisteredDeviceDto.getImageUrl();
            this.imageURL = imageUrl == null ? "" : imageUrl;
            String displayName = iRegisteredDeviceDto.getDisplayName();
            this.displayName = displayName == null ? "" : displayName;
            String productDisplayName = iRegisteredDeviceDto.getProductDisplayName();
            this.productDisplayName = productDisplayName == null ? "" : productDisplayName;
            String applicationKey = iRegisteredDeviceDto.getApplicationKey();
            this.applicationKey = applicationKey != null ? applicationKey : "";
            if (connectionInfoDto != null) {
                configureConnectionInfo(connectionInfoDto);
            }
            this.deviceDto = iRegisteredDeviceDto;
        }

        private final byte[] base64Decode(String s8) {
            if (s8 == null || w.J(s8)) {
                return null;
            }
            return Base64.decode(s8, 0);
        }

        public static /* synthetic */ Builder configureSWVersion$default(Builder builder, String str, String str2, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                str2 = null;
            }
            return builder.configureSWVersion(str, str2);
        }

        public final SharedDeviceInfo build() {
            return new SharedDeviceInfo(this.unitID, this.displayName, this.partNumber, this.productDisplayName, this.productNumber, this.softwareVersion, this.imageURL, this.applicationKey, this.macAddress, this.connectionType, this.gbleEdiv, this.gbleRand, this.gbleLongTermKey, this.capabilities, this.deviceDto, this.wasSavedLocally);
        }

        public final Builder clearGarminAuth() {
            this.gbleEdiv = null;
            this.gbleRand = null;
            this.gbleLongTermKey = null;
            return this;
        }

        public final Builder configureCapabilities(String capabilitiesBase64) {
            this.capabilities = base64Decode(capabilitiesBase64);
            return this;
        }

        public final Builder configureConnectionInfo(ConnectionInfoDto connectionInfoDto) {
            connectionInfoDto.getClass();
            this.macAddress = connectionInfoDto.getMacAddress();
            this.connectionType = Integer.valueOf(connectionInfoDto.getConnectionType() != null ? connectionInfoDto.getConnectionType().getConnectionType() : 2);
            if (connectionInfoDto.getBondingInfo() != null) {
                configureGarminAuth(connectionInfoDto.getBondingInfo().getEncryptionDiversifierBase64(), connectionInfoDto.getBondingInfo().getRandBase64(), connectionInfoDto.getBondingInfo().getLongTermKeyBase64());
            }
            return configureCapabilities(connectionInfoDto.getCapabilitiesBase64());
        }

        public final Builder configureDeviceInfo(SharedDeviceInfo other) {
            other.getClass();
            this.softwareVersion = other.getSoftwareVersion();
            this.macAddress = other.getMacAddress();
            this.connectionType = other.getConnectionType();
            this.capabilities = other.getCapabilities();
            this.gbleEdiv = other.getGbleEdiv();
            this.gbleRand = other.getGbleRand();
            this.gbleLongTermKey = other.getGbleLongTermKey();
            return this;
        }

        public final Builder configureGarminAuth(String encryptionDiversifierBase64, String randBase64, String longTermKeyBase64) {
            this.gbleEdiv = base64Decode(encryptionDiversifierBase64);
            this.gbleRand = base64Decode(randBase64);
            this.gbleLongTermKey = base64Decode(longTermKeyBase64);
            return this;
        }

        public final Builder configureSWVersion(String swVersion, String otherSwVersion) {
            Integer numI = swVersion != null ? t.i(swVersion) : null;
            Integer numI2 = otherSwVersion != null ? t.i(otherSwVersion) : null;
            if (numI != null && numI2 != null) {
                this.softwareVersion = String.valueOf(Math.max(numI.intValue(), numI2.intValue()));
                return this;
            }
            if (swVersion == null) {
                swVersion = otherSwVersion;
            }
            this.softwareVersion = swVersion;
            return this;
        }

        public final Builder configureWasSavedLocally(boolean wasSaved) {
            this.wasSavedLocally = Boolean.valueOf(wasSaved);
            return this;
        }

        public final Builder configureCapabilities(byte[] capabilitiesArray) {
            this.capabilities = capabilitiesArray;
            return this;
        }

        public final Builder configureGarminAuth(byte[] encryptionDiversifier, byte[] rand, byte[] longTermKey) {
            this.gbleEdiv = encryptionDiversifier;
            this.gbleRand = rand;
            this.gbleLongTermKey = longTermKey;
            return this;
        }

        public Builder() {
            this.displayName = "";
            this.partNumber = "";
            this.productDisplayName = "";
            this.productNumber = "";
            this.imageURL = "";
            this.applicationKey = "";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(SharedDeviceInfo sharedDeviceInfo) {
            this(sharedDeviceInfo, (ConnectionInfoDto) null);
            sharedDeviceInfo.getClass();
            configureDeviceInfo(sharedDeviceInfo);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(SharedDeviceInfo sharedDeviceInfo, ConnectionInfoDto connectionInfoDto) {
            this();
            sharedDeviceInfo.getClass();
            this.unitID = sharedDeviceInfo.getUnitID();
            this.partNumber = sharedDeviceInfo.getPartNumber();
            this.productNumber = sharedDeviceInfo.getProductNumber();
            this.softwareVersion = sharedDeviceInfo.getSoftwareVersion();
            this.imageURL = sharedDeviceInfo.getImageURL();
            this.displayName = sharedDeviceInfo.getDisplayName();
            this.productDisplayName = sharedDeviceInfo.getProductDisplayName();
            this.applicationKey = sharedDeviceInfo.getApplicationKey();
            if (connectionInfoDto != null) {
                configureConnectionInfo(connectionInfoDto);
            }
            this.deviceDto = sharedDeviceInfo.getDeviceDto();
        }
    }

    public SharedDeviceInfo(long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, IRegisteredDeviceDto iRegisteredDeviceDto, Boolean bool) {
        a.p(str, str2, str3, str4, str6);
        str7.getClass();
        this.unitID = j8;
        this.displayName = str;
        this.partNumber = str2;
        this.productDisplayName = str3;
        this.productNumber = str4;
        this.softwareVersion = str5;
        this.imageURL = str6;
        this.applicationKey = str7;
        this.macAddress = str8;
        this.connectionType = num;
        this.gbleEdiv = bArr;
        this.gbleRand = bArr2;
        this.gbleLongTermKey = bArr3;
        this.capabilities = bArr4;
        this.deviceDto = iRegisteredDeviceDto;
        this.wasSavedLocally = bool;
    }
}
