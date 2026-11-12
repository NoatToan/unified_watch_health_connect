package com.miui.tsmclient.entity.digitalkey;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.entity.CardUIInfo;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.DeviceUtils;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ProductList {

    @SerializedName("products")
    private List<ProductInfo> mProducts;

    public static class ProductInfo {
        public static final String BLE_TYPE = "BLE";
        public static final String CCC_TYPE = "CCC";
        public static final String ICCOA_TYPE = "ICCOA_V2";
        private static final String TECH_NFC = "NFC";
        private static final String TECH_NFC_BLE = "NFC,BLE";

        @SerializedName("supportBLE")
        private boolean isBLETradeSupported;

        @SerializedName("getVehicleSupportedRke")
        private boolean isScanVehicleRKESupported;

        @SerializedName("appConfig")
        public AppConfigInfo mAppConfig;

        @SerializedName("appLowestVersion")
        private String mAppLowestVersion;

        @SerializedName(Constants.EXTRA_APP_PACKAGE_NAME)
        public String mAppPkgName;

        @SerializedName("bleLowestVersion")
        private String mBLELowestVersion;

        @SerializedName("cardArt")
        public String mCardArt;

        @SerializedName("darkLogo")
        public String mDarkLogo;

        @SerializedName(CardUIInfo.KEY_LOGO)
        public String mLogo;

        @SerializedName("pairingChannel")
        public PairingChannel mPairingChannel;

        @SerializedName(Constants.EXTRA_PAIRING_CONFIG)
        private PairingConfig mPairingConfig;

        @SerializedName("productDescription")
        public String mProductDescription;

        @SerializedName("productName")
        public String mProductName;

        @SerializedName("protocolType")
        private String mProtocolType;

        @SerializedName("seqNo")
        public String mSeqNo;

        @SerializedName("supportedRelayServerHost")
        private String[] mSupportedRelayServerHosts;

        @SerializedName("vehicleBrandId")
        public String mVehicleBrandId;

        @SerializedName("vehicleBrandName")
        public String mVehicleBrandName;

        @SerializedName("vehicleOEMId")
        public String mVehicleOEMId;

        public AppConfigInfo getAppConfig() {
            return this.mAppConfig;
        }

        public String getAppLowestVersion() {
            return this.mAppLowestVersion;
        }

        public String getAppPkgName() {
            return this.mAppPkgName;
        }

        public String getBLELowestVersion() {
            return this.mBLELowestVersion;
        }

        public String getCardArt() {
            return this.mCardArt;
        }

        public String getLogo(Context context) {
            return DeviceUtils.isNightMode(context) ? this.mDarkLogo : this.mLogo;
        }

        public PairingChannel getPairingChannel() {
            return this.mPairingChannel;
        }

        public PairingConfig getPairingConfig() {
            return this.mPairingConfig;
        }

        public String getProductDescription() {
            return this.mProductDescription;
        }

        public String getProductName() {
            return this.mProductName;
        }

        public String getProtocolType() {
            return this.mProtocolType;
        }

        public String getSeqNo() {
            return this.mSeqNo;
        }

        public String getVehicleBrandId() {
            return this.mVehicleBrandId;
        }

        public String getVehicleBrandName() {
            return this.mVehicleBrandName;
        }

        public String getVehicleOEMId() {
            return this.mVehicleOEMId;
        }

        public String getWirelessType() {
            PairingChannel pairingChannel = this.mPairingChannel;
            return (pairingChannel != null && pairingChannel.getUWB()) ? TECH_NFC_BLE : "NFC";
        }

        public boolean isBLEProtocolType() {
            return TextUtils.equals(this.mProtocolType, BLE_TYPE);
        }

        public boolean isBLETradeSupported() {
            return this.isBLETradeSupported;
        }

        public boolean isEnableNewTask() {
            return this.mAppConfig.isEnableNewTask();
        }

        public boolean isEnableUWB() {
            PairingChannel pairingChannel = this.mPairingChannel;
            return pairingChannel != null && pairingChannel.getUWB();
        }

        public boolean isScanVehicleRKESupported() {
            return this.isScanVehicleRKESupported;
        }

        public boolean isSupportedRelayServerHostWithCCC(String str) {
            String[] strArr = this.mSupportedRelayServerHosts;
            if (strArr == null) {
                return false;
            }
            return Arrays.asList(strArr).contains(str);
        }

        public void setBLETradeSupported(boolean z) {
            this.isBLETradeSupported = z;
        }
    }

    public List<ProductInfo> getProducts() {
        return this.mProducts;
    }

    public void setProducts(List<ProductInfo> list) {
        this.mProducts = list;
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}
