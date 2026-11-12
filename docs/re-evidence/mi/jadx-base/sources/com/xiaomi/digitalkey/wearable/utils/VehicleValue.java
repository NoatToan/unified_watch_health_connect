package com.xiaomi.digitalkey.wearable.utils;

/* JADX INFO: loaded from: classes7.dex */
public class VehicleValue {
    String AppPairingLink;
    String CardArt;
    String VehicleAppPackage;
    String VehicleBrandId;
    String Vehicle_OEM_Identifier;
    Boolean isSupportedVehicleRKE;
    String vehicleBrandName;

    public VehicleValue(String str, String str2, String str3) {
        this.Vehicle_OEM_Identifier = str;
        this.vehicleBrandName = str2;
        this.VehicleBrandId = str3;
    }

    public String getAppPackageName() {
        return this.VehicleAppPackage;
    }

    public String getAppPairingLink() {
        return this.AppPairingLink;
    }

    public String getCardArt() {
        return this.CardArt;
    }

    public boolean getIsSupportedVehicleRKE() {
        Boolean bool = this.isSupportedVehicleRKE;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public String getVehicleBrandId() {
        return this.VehicleBrandId;
    }

    public String getVehicleBrandName() {
        return this.vehicleBrandName;
    }

    public String getVehicleOEMIdentifier() {
        return this.Vehicle_OEM_Identifier;
    }

    public String getVehiclePackageName() {
        return this.VehicleAppPackage;
    }

    public void setAppPairingLink(String str) {
        this.AppPairingLink = str;
    }

    public void setCardArt(String str) {
        this.CardArt = str;
    }

    public void setIsSupportedVehicleRKE(String str) {
        this.isSupportedVehicleRKE = Boolean.valueOf("true".equals(str));
    }

    public void setVehicleAppPackage(String str) {
        this.VehicleAppPackage = str;
    }

    public void setVehicleBrandId(String str) {
        this.VehicleBrandId = str;
    }

    public void setVehicleOEMBrandName(String str) {
        this.vehicleBrandName = str;
    }

    public void setVehicleOEMIdentifier(String str) {
        this.Vehicle_OEM_Identifier = str;
    }

    public String toString() {
        return this.Vehicle_OEM_Identifier + " : " + this.vehicleBrandName + " : " + this.VehicleBrandId + " : " + this.VehicleAppPackage + " : " + this.AppPairingLink + " :  cardArt: " + this.CardArt + ", IsSupportedVehicleRKE: " + this.isSupportedVehicleRKE;
    }
}
