package com.miui.tsmclient.sesdk;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.entity.CarKeyCardInfo;
import com.miui.tsmclient.entity.ICommonKeyPrivilege;
import com.miui.tsmclient.entity.Product;
import com.miui.tsmclient.entity.UIConfig;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.LogUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class DigitalKeyCardDetail implements IJsonSerializer, IJsonDeserializer<DigitalKeyCardDetail>, SeCard.IOnlineProperties {

    @SerializedName(CommonConstants.KEY_BRAND)
    private String mBrand;
    protected transient CarKeyCardInfo mCardInfo;

    @SerializedName("entitlement")
    private CarKeyCardInfo.Entitlement mEntitlement;

    @SerializedName(TSMAuthContants.PARAM_KEY_TYPE)
    private String mKeyType;

    @SerializedName("model")
    private String mModel;

    @SerializedName("product")
    private Product mProduct;

    @SerializedName("status")
    private String mStatus;

    @SerializedName("statusDesc")
    private String mStatusDesc;

    @SerializedName("validFrom")
    private String mValidFrom;

    @SerializedName("validTo")
    private String mValidTo;

    @SerializedName("vehicleBrandId")
    private String mVehicleBrandId;

    @SerializedName("vehicleId")
    private String mVehicleId;

    @SerializedName("vehicleOEMId")
    private String mVehicleOEMId;

    public DigitalKeyCardDetail(SeCard seCard) {
        CarKeyCardInfo carKeyCardInfo = (CarKeyCardInfo) seCard.mCardInfo;
        this.mCardInfo = carKeyCardInfo;
        this.mKeyType = carKeyCardInfo.getKeyType();
        this.mValidFrom = this.mCardInfo.getValidFrom();
        this.mValidTo = this.mCardInfo.getValidTo();
        this.mVehicleId = this.mCardInfo.getVehicleId();
        this.mVehicleOEMId = this.mCardInfo.getVehicleOEMId();
        this.mModel = this.mCardInfo.getModel();
        this.mProduct = this.mCardInfo.getProduct();
        this.mBrand = this.mCardInfo.getBrand();
        this.mVehicleBrandId = this.mCardInfo.getVehicleBrandId();
        String strName = getStatus(this.mCardInfo.getStatus()).name();
        this.mStatus = strName;
        SeCardStatus seCardStatus = SeCardStatus.START_DATE_INVALID;
        this.mStatusDesc = (TextUtils.equals(strName, seCardStatus.name()) || TextUtils.equals(this.mStatus, SeCardStatus.END_DATE_INVALID.name())) ? TextUtils.equals(this.mStatus, seCardStatus.name()) ? "钥匙未启用" : "钥匙已过期" : TextUtils.equals(this.mStatus, SeCardStatus.DELETING.name()) ? "钥匙待删除" : this.mCardInfo.getStatusDesc();
        parseKeyOtherData();
    }

    public static DigitalKeyCardDetail fromJson(String str) {
        return (DigitalKeyCardDetail) new Gson().fromJson(str, DigitalKeyCardDetail.class);
    }

    public SeCardStatus checkPeriodOfKeyValidity() {
        long time;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        try {
            UIConfig uIConfig = this.mCardInfo.getUIConfig();
            if (uIConfig == null) {
                time = System.currentTimeMillis();
            } else {
                try {
                    time = simpleDateFormat.parse(uIConfig.getCurrentTime()).getTime();
                } catch (Exception e) {
                    LogUtils.e("current data format error", e);
                    time = System.currentTimeMillis();
                }
            }
            long time2 = simpleDateFormat.parse(getValidFrom()).getTime();
            long time3 = simpleDateFormat.parse(getValidTo()).getTime();
            if (time < time2) {
                return SeCardStatus.START_DATE_INVALID;
            }
            if (time > time3) {
                return SeCardStatus.END_DATE_INVALID;
            }
            return SeCardStatus.ACTIVE;
        } catch (Exception e2) {
            LogUtils.e("start or end data format error", e2);
        }
    }

    public String getBrand() {
        return this.mBrand;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getDescription() {
        return null;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getDescriptions() {
        return null;
    }

    public CarKeyCardInfo.Entitlement getEntitlement() {
        return this.mEntitlement;
    }

    public String getKeyType() {
        return this.mKeyType;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getLabel() {
        return null;
    }

    public String getModel() {
        return this.mModel;
    }

    public ICommonKeyPrivilege getPrivilege() {
        return this.mEntitlement;
    }

    public Product getProduct() {
        return this.mProduct;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getServiceStatus() {
        return null;
    }

    public SeCardStatus getStatus() {
        return SeCardStatus.valueOf(this.mStatus);
    }

    public String getStatusDesc() {
        return this.mStatusDesc;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getTips() {
        return null;
    }

    public String getValidFrom() {
        return this.mValidFrom;
    }

    public String getValidTo() {
        return this.mValidTo;
    }

    public String getVehicleBrandId() {
        return this.mVehicleBrandId;
    }

    public String getVehicleId() {
        return this.mVehicleId;
    }

    public String getVehicleOEMId() {
        return this.mVehicleOEMId;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public boolean isServiceAvailable() {
        return true;
    }

    public void parseKeyOtherData() {
        this.mEntitlement = this.mCardInfo.getEntitlement();
    }

    @Override // com.miui.tsmclient.sesdk.IJsonSerializer
    public String toJson() {
        return new Gson().toJson(this);
    }

    public SeCardStatus getStatus(int i) {
        if (TextUtils.equals(this.mCardInfo.getPendingAction(), CarKeyCardInfo.PENDING_ACTION_TERMINATE)) {
            return SeCardStatus.DELETING;
        }
        if (i == 1) {
            return checkPeriodOfKeyValidity();
        }
        if (i == 2) {
            return SeCardStatus.PERSONALIZING;
        }
        if (i != 6 && i != 7) {
            if (i != 10) {
                if (i != 101) {
                    if (i != 105) {
                        if (i != 14) {
                            return i != 15 ? SeCardStatus.ACTIVE : SeCardStatus.DELETING;
                        }
                        return SeCardStatus.WAIT_TO_ACTIVE;
                    }
                }
            }
            return SeCardStatus.DELETE;
        }
        return SeCardStatus.NEGATIVE;
    }
}
