package com.xiaomi.hm.health.bt.profile.base;

import androidx.annotation.Nullable;
import com.huami.watch.companion.transport.CompanionModule;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.LanguageComBination;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.utils.HMHealthDeviceConstant;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.market.sdk.Constants;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class DeviceInfo {
    private String a;
    private byte[] b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private GeneralDeviceInfo i;
    private HMOtherVersion j;
    private String k;
    private MedicalRegisterVersion l;
    private HMDeviceSource m;
    private Feature n;
    private LanguageComBination o;

    public DeviceInfo(GeneralDeviceInfo info) {
        this(info, false);
    }

    private int a() {
        return this.h & 255;
    }

    private int b() {
        return (this.h >> 24) & 255;
    }

    private int c() {
        return (this.h >> 16) & 255;
    }

    private int d() {
        return (this.h >> 8) & 255;
    }

    private int e() {
        return this.g & 255;
    }

    private int f() {
        return (this.g >> 24) & 255;
    }

    private int g() {
        return (this.g >> 16) & 255;
    }

    private int h() {
        return (this.g >> 8) & 255;
    }

    private int i() {
        return this.f & 255;
    }

    private int j() {
        return (this.f >> 24) & 255;
    }

    private int k() {
        return (this.f >> 16) & 255;
    }

    private int l() {
        return (this.f >> 8) & 255;
    }

    private String m() {
        return j() + "." + k() + "." + l() + "." + i();
    }

    private HMDeviceSource n(boolean thirdDevice) {
        HMDeviceSource hMDeviceSourceFromPnP;
        if (thirdDevice && !t() && HMHealthDeviceConstant.OMRON_MANUFACTURER.equals(this.i.manufacturerName) && HMHealthDeviceConstant.OMRON_J750L_MODEL_NUMBER.equals(this.i.modelNumberString)) {
            return HMDeviceSource.OMRON_J750L;
        }
        if (t()) {
            if (thirdDevice) {
                PnP pnP = this.i.pnp;
                int i = pnP.productId;
                int i2 = pnP.productVersion;
                hMDeviceSourceFromPnP = HMDeviceSource.thirdSourceFromPnp(i, i2);
                Debug.fi(CompanionModule.KEY_DEVICE_INFO, "third pnp id = " + i + "; pnp version = " + i2 + "; and source = " + hMDeviceSourceFromPnP);
            } else {
                PnP pnP2 = this.i.pnp;
                hMDeviceSourceFromPnP = HMDeviceSource.fromPnP(pnP2.productId, pnP2.productVersion);
            }
            if (hMDeviceSourceFromPnP != null) {
                return hMDeviceSourceFromPnP;
            }
        }
        if (isMiLi1S()) {
            return HMDeviceSource.MILI_1S;
        }
        if (isMiLi1A()) {
            return HMDeviceSource.MILI_1A;
        }
        if (isMiLiPro()) {
            return isMiLiProI() ? HMDeviceSource.MILI_PRO_I : HMDeviceSource.MILI_PRO;
        }
        if (isMiLiNfc()) {
            return HMDeviceSource.MILI_NFC;
        }
        if (isMiLiRocky()) {
            return HMDeviceSource.MILI_ROCKY;
        }
        if (isMiLiQinLing()) {
            return HMDeviceSource.MILI_QINLING;
        }
        if (isMiQinS()) {
            return HMDeviceSource.MILI_QINLING_1S;
        }
        if (isMiLiPeyto()) {
            return HMDeviceSource.MILI_PEYTO;
        }
        if (r()) {
            return HMDeviceSource.MILI_PEYTO_L;
        }
        if (s()) {
            return HMDeviceSource.MILI_PEYTO_WL;
        }
        if (isMiLiDthW()) {
            return HMDeviceSource.MILI_DTH_W;
        }
        if (isMiLiTempo()) {
            return HMDeviceSource.MILI_TEMPO;
        }
        if (isMiLiWuhan()) {
            return HMDeviceSource.MILI_WUHAN;
        }
        if (isMiLiChongqing()) {
            return HMDeviceSource.MILI_CHONGQING;
        }
        if (isMiLiBeats()) {
            return HMDeviceSource.MILI_BEATS;
        }
        if (isMiLiBeatsP()) {
            return HMDeviceSource.MILI_BEATS_P;
        }
        if (isMiLiBeatsW()) {
            return HMDeviceSource.MILI_BEATS_W;
        }
        if (isBlueMonkey()) {
            return HMDeviceSource.OTHER_BM;
        }
        if (isShoes()) {
            return HMDeviceSource.SHOES;
        }
        if (isShoesChild()) {
            return HMDeviceSource.SHOES_CHILD;
        }
        if (isShoesLight()) {
            return HMDeviceSource.SHOES_LIGHT;
        }
        if (isShoesSprandi()) {
            return HMDeviceSource.SHOES_SPRANDI;
        }
        if (isWeight()) {
            return HMDeviceSource.WEIGHT;
        }
        if (isWeightBodyFat()) {
            return HMDeviceSource.WEIGHT_BODYFAT;
        }
        if (isWeightScale2()) {
            return HMDeviceSource.WEIGHT_SCALE2;
        }
        if (isWeightBfs()) {
            return HMDeviceSource.WEIGHT_BFS;
        }
        if (isShoesMars()) {
            return HMDeviceSource.SHOES_MARS;
        }
        if (isAmazfit()) {
            return HMDeviceSource.MILI_AMAZFIT;
        }
        if (isMiLiCinco()) {
            return HMDeviceSource.MILI_CINCO;
        }
        if (isMiLiTonlesap()) {
            return HMDeviceSource.MILI_TONLESAP;
        }
        if (isMiLiCincoL()) {
            return HMDeviceSource.MILI_CINCO_L;
        }
        if (isMiLiTonlesapL()) {
            return HMDeviceSource.MILI_TONLESAP_L;
        }
        if (p()) {
            return HMDeviceSource.MILI_PYH;
        }
        if (q()) {
            return HMDeviceSource.MILI_PYH_W;
        }
        if (isMiLiRio()) {
            return HMDeviceSource.MILI_RIO;
        }
        if (isBoltSecond()) {
            return HMDeviceSource.OTHER_BOLT_SECOND;
        }
        if (isOtherBolt()) {
            return HMDeviceSource.OTHER_BOLT;
        }
        if (isMiLiJiuhuashan()) {
            return HMDeviceSource.MILI_JIUHUASHAN;
        }
        if (isMiLiJiuhuashanPro()) {
            return HMDeviceSource.MILI_JIUHUASHAN_PRO;
        }
        if (isMiLiQinlingS2()) {
            return HMDeviceSource.MILI_QINLING_S2;
        }
        if (isAthens()) {
            return HMDeviceSource.MILI_ATHENS;
        }
        if (isMiLi()) {
            return HMDeviceSource.MILI;
        }
        return isSmartWatchEverest2() ? HMDeviceSource.SMART_WATCH_EVEREST_2 : HMDeviceSource.VDEVICE;
    }

    private boolean o() {
        return (this.c & 255) == 4 && (this.e & 255) == 8;
    }

    private boolean p() {
        return t() && this.i.pnp.productId == 32;
    }

    private boolean q() {
        return t() && this.i.pnp.productId == 39;
    }

    private boolean r() {
        if (t()) {
            PnP pnP = this.i.pnp;
            if (pnP.productId == 44 && pnP.productVersion == 256) {
                return true;
            }
        }
        return false;
    }

    private boolean s() {
        if (t()) {
            PnP pnP = this.i.pnp;
            if (pnP.productId == 44 && pnP.productVersion == 257) {
                return true;
            }
        }
        return false;
    }

    private boolean t() {
        GeneralDeviceInfo generalDeviceInfo = this.i;
        return (generalDeviceInfo == null || generalDeviceInfo.pnp == null) ? false : true;
    }

    public int getAppearance() {
        return this.d;
    }

    public byte[] getBytesOfDeviceID() {
        return this.b;
    }

    public Feature getDeviceFeature() {
        Feature feature = this.n;
        return feature != null ? feature : new Feature();
    }

    public String getDeviceID() {
        return this.a;
    }

    public HMDeviceSource getDeviceSource() {
        return this.m;
    }

    public int getFeature() {
        return this.c;
    }

    public int getFirmware2Version() {
        return this.h;
    }

    public String getFirmware2VersionStr() {
        return b() + "." + c() + "." + d() + "." + a();
    }

    public int getFirmwareVersion() {
        return this.g;
    }

    public String getFirmwareVersionStr() {
        GeneralDeviceInfo generalDeviceInfo = this.i;
        if (generalDeviceInfo != null) {
            return generalDeviceInfo.firmwareRevision;
        }
        return f() + "." + g() + "." + h() + "." + e();
    }

    @Nullable
    public String getFirmwareVersionStrFill() {
        GeneralDeviceInfo generalDeviceInfo = this.i;
        return generalDeviceInfo != null ? generalDeviceInfo.firmwareRevision : String.format(Locale.getDefault(), "%1$d.%2$d.%3$d.%4$02d", Integer.valueOf(f()), Integer.valueOf(g()), Integer.valueOf(h()), Integer.valueOf(e()));
    }

    public String getGpsVersionStr() {
        return this.k;
    }

    public String getHardwareVersionStr() {
        String str;
        GeneralDeviceInfo generalDeviceInfo = this.i;
        return (generalDeviceInfo == null || (str = generalDeviceInfo.hardwareRevision) == null) ? String.valueOf(this.e) : str;
    }

    public LanguageComBination getLanguageComBination() {
        return this.o;
    }

    public MedicalRegisterVersion getMedicalRegVersion() {
        return this.l;
    }

    public HMOtherVersion getOtherVersion() {
        return this.j;
    }

    public PnP getPnp() {
        if (t()) {
            return this.i.pnp;
        }
        return null;
    }

    public int getProductId() {
        if (t()) {
            return this.i.pnp.productId;
        }
        return -1;
    }

    public int getProductVersion() {
        if (t()) {
            return this.i.pnp.productVersion;
        }
        return -1;
    }

    public int getProfileVersion() {
        return this.f;
    }

    public String getSerialNumber() {
        String str;
        GeneralDeviceInfo generalDeviceInfo = this.i;
        return (generalDeviceInfo == null || (str = generalDeviceInfo.serialNumber) == null) ? "" : str;
    }

    public int getVendorId() {
        if (t()) {
            return this.i.pnp.vendorId;
        }
        return -1;
    }

    public int getVendorSource() {
        if (t()) {
            return this.i.pnp.vendorSource;
        }
        return -1;
    }

    public int getVersion() {
        GeneralDeviceInfo generalDeviceInfo = this.i;
        if (generalDeviceInfo != null) {
            return generalDeviceInfo.version;
        }
        return -1;
    }

    public boolean isAmazfit() {
        int i = this.c;
        return (i & 255) == 6 || (i & 255) == 9;
    }

    public boolean isAmazfitKx() {
        return (this.c & 255) == 9;
    }

    public boolean isAthens() {
        if (t()) {
            PnP pnP = this.i.pnp;
            if (pnP.productId == 47 && pnP.productVersion == 256) {
                return true;
            }
        }
        return false;
    }

    public boolean isBlueMonkey() {
        return t() && this.i.pnp.productId == 18;
    }

    public boolean isBoltSecond() {
        if (t()) {
            PnP pnP = this.i.pnp;
            if (pnP.productId == 101 && pnP.productVersion == 31) {
                return true;
            }
        }
        return false;
    }

    public boolean isMiLi() {
        if ((this.c & 255) == 0 && (this.d & 255) == 0) {
            int i = this.e;
            if ((i & 255) == 2 || (i & 255) == 1 || (i & 255) == 49) {
                return true;
            }
        }
        return false;
    }

    public boolean isMiLi1A() {
        int i = this.c;
        return ((i & 255) == 5 && (this.d & 255) == 0) || ((i & 255) == 0 && (this.e & 255) == 208) || (((i & 255) == 0 && (this.e & 255) == 8) || o());
    }

    public boolean isMiLi1S() {
        return (this.h == -1 || (this.e & 255) == 8) ? false : true;
    }

    public boolean isMiLiBeats() {
        return t() && this.i.pnp.productId == 20;
    }

    public boolean isMiLiBeatsP() {
        return t() && this.i.pnp.productId == 22;
    }

    public boolean isMiLiBeatsW() {
        return t() && this.i.pnp.productId == 26;
    }

    public boolean isMiLiChongqing() {
        return t() && this.i.pnp.productId == 21;
    }

    public boolean isMiLiCinco() {
        PnP pnP;
        int i;
        return t() && (((i = (pnP = this.i.pnp).productId) == 31 && pnP.productVersion == 256) || (i == 36 && pnP.productVersion == 256));
    }

    public boolean isMiLiCincoL() {
        if (t()) {
            PnP pnP = this.i.pnp;
            if (pnP.productId == 36 && pnP.productVersion == 257) {
                return true;
            }
        }
        return false;
    }

    public boolean isMiLiDTH() {
        if (t()) {
            PnP pnP = this.i.pnp;
            if (pnP.productId == 58 && pnP.productVersion == 256) {
                return true;
            }
        }
        return false;
    }

    public boolean isMiLiDthW() {
        return t() && this.i.pnp.productId == 27;
    }

    public boolean isMiLiHankou() {
        return isMiLiWuhan() && this.i.pnp.productVersion == 257;
    }

    public boolean isMiLiJiuhuashan() {
        return t() && this.i.pnp.productId == 38;
    }

    public boolean isMiLiJiuhuashanPro() {
        if (t()) {
            PnP pnP = this.i.pnp;
            if (pnP.productId == 54 && pnP.productVersion == 256) {
                return true;
            }
        }
        return false;
    }

    public boolean isMiLiNfc() {
        return t() && this.i.pnp.productId == 11;
    }

    public boolean isMiLiPeyto() {
        return t() && this.i.pnp.productId == 15;
    }

    public boolean isMiLiPro() {
        int i;
        return t() && ((i = this.i.pnp.productId) == 4 || i == 260);
    }

    public boolean isMiLiProI() {
        return isMiLiPro() && this.i.pnp.productVersion == 259;
    }

    public boolean isMiLiProNormal() {
        return isMiLiPro() && this.i.pnp.productVersion == 256;
    }

    public boolean isMiLiProTPH() {
        return isMiLiPro() && this.i.pnp.productVersion == 258;
    }

    public boolean isMiLiProTPHAs7000() {
        return isMiLiPro() && this.i.pnp.productVersion == 261;
    }

    public boolean isMiLiProTPHIndian() {
        return isMiLiPro() && this.i.pnp.productVersion == 260;
    }

    public boolean isMiLiProTPHIndianNew() {
        return isMiLiPro() && this.i.pnp.productVersion == 262;
    }

    public boolean isMiLiProYLW() {
        return isMiLiPro() && this.i.pnp.productVersion == 257;
    }

    public boolean isMiLiQinLing() {
        return t() && this.i.pnp.productId == 9;
    }

    public boolean isMiLiQinlingS2() {
        return t() && this.i.pnp.productId == 45;
    }

    public boolean isMiLiRio() {
        return t() && this.i.pnp.productId == 34;
    }

    public boolean isMiLiRocky() {
        return t() && this.i.pnp.productId == 10;
    }

    public boolean isMiLiTempo() {
        return t() && this.i.pnp.productId == 16;
    }

    public boolean isMiLiTonlesap() {
        PnP pnP;
        int i;
        return t() && (((i = (pnP = this.i.pnp).productId) == 31 && pnP.productVersion == 257) || (i == 35 && pnP.productVersion == 256));
    }

    public boolean isMiLiTonlesapL() {
        if (t()) {
            PnP pnP = this.i.pnp;
            if (pnP.productId == 35 && pnP.productVersion == 257) {
                return true;
            }
        }
        return false;
    }

    public boolean isMiLiTonlesapO() {
        if (t()) {
            PnP pnP = this.i.pnp;
            if (pnP.productId == 35 && pnP.productVersion == 258) {
                return true;
            }
        }
        return false;
    }

    public boolean isMiLiTonlesapOL() {
        if (t()) {
            PnP pnP = this.i.pnp;
            if (pnP.productId == 35 && pnP.productVersion == 259) {
                return true;
            }
        }
        return false;
    }

    public boolean isMiLiWuhan() {
        return t() && this.i.pnp.productId == 19;
    }

    public boolean isMiQinS() {
        return t() && this.i.pnp.productId == 24;
    }

    public boolean isOtherBolt() {
        return t() && this.i.pnp.productId == 37;
    }

    public boolean isProbe() {
        return t() && this.i.pnp.productId == 17;
    }

    public boolean isShoes() {
        return t() && this.i.pnp.productId == 3;
    }

    public boolean isShoesChild() {
        return t() && this.i.pnp.productId == 5;
    }

    public boolean isShoesLight() {
        return t() && this.i.pnp.productId == 7;
    }

    public boolean isShoesMars() {
        return t() && this.i.pnp.productId == 13;
    }

    public boolean isShoesSprandi() {
        return t() && this.i.pnp.productId == 8;
    }

    public boolean isSmartWatchEverest2() {
        return t() && this.i.pnp.productId == 23;
    }

    public boolean isWeight() {
        return t() && this.i.pnp.productId == 36897;
    }

    public boolean isWeightBfs() {
        return t() && this.i.pnp.productId == 25;
    }

    public boolean isWeightBodyFat() {
        return t() && this.i.pnp.productId == 6;
    }

    public boolean isWeightScale2() {
        return t() && this.i.pnp.productId == 30;
    }

    public void setDeviceFeature(Feature deviceFeature) {
        this.n = deviceFeature;
    }

    public void setGpsVersionStr(String version) {
        this.k = version;
    }

    public void setLanguageComBination(LanguageComBination languageComBination) {
        this.o = languageComBination;
    }

    public void setMedicalRegVersion(MedicalRegisterVersion medicalRegVersion) {
        this.l = medicalRegVersion;
    }

    public void setOtherVersion(HMOtherVersion version) {
        this.j = version;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceID", this.a);
            jSONObject.put("deviceType", getDeviceSource().getType().getValue());
            jSONObject.put("deviceSource", getDeviceSource().getValue());
            jSONObject.put(Constants.JSON_FEATURE, this.c);
            jSONObject.put("appearance", this.d);
            jSONObject.put("profileVersion", m());
            jSONObject.put("firmware2Version", getFirmware2VersionStr());
            jSONObject.put(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_HARDWARE_VERSION, getHardwareVersionStr());
            jSONObject.put("firmwareVersion", getFirmwareVersionStr());
            HMOtherVersion hMOtherVersion = this.j;
            jSONObject.put("resourceVersion", hMOtherVersion != null ? hMOtherVersion.getResourceVersion() : -1);
            jSONObject.put("serialNumber", getSerialNumber());
            jSONObject.put("vendorId", getVendorId());
            jSONObject.put("vendorSource", getVendorSource());
            jSONObject.put("productId", getProductId());
            jSONObject.put("productVersion", getProductVersion());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toJsonString() {
        return toJson().toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("[[[ ");
        sb.append(DeviceInfo.class.getSimpleName());
        sb.append(" ]]]");
        sb.append("\n         deviceID: ");
        sb.append(this.a);
        sb.append("\n          feature: ");
        sb.append(Integer.toHexString(this.c));
        sb.append("\n       appearance: ");
        sb.append(Integer.toHexString(this.d));
        sb.append("\n  hardwareVersion: ");
        sb.append(Integer.toHexString(this.e));
        sb.append("\n   profileVersion: ");
        sb.append(m());
        sb.append("\n  firmwareVersion: ");
        sb.append(getFirmwareVersionStr());
        sb.append("\n firmware2Version: ");
        sb.append(getFirmware2VersionStr());
        sb.append("\n     deviceSource: ");
        sb.append(getDeviceSource());
        sb.append("\n     otherVersion: ");
        sb.append(this.j);
        if (this.i != null) {
            sb.append("\n generalInfo:");
            sb.append(this.i);
        }
        if (this.k != null) {
            sb.append("\n gpsVersion:");
            sb.append(this.k);
        }
        sb.append("\n deviceFeature:");
        sb.append(this.n);
        if (this.l != null) {
            sb.append("\n medicalRegVersion:");
            sb.append(this.l);
        }
        return sb.toString();
    }

    public DeviceInfo(GeneralDeviceInfo info, boolean thirdPartDevice) {
        this.a = null;
        this.b = null;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = null;
        this.j = new HMOtherVersion();
        this.k = null;
        this.m = HMDeviceSource.VDEVICE;
        this.n = null;
        this.o = new LanguageComBination();
        this.i = info;
        this.a = info.deviceID;
        this.b = info.bytesOfDeviceID;
        this.g = ProfileUtils.getVersionCodeFromVersionName(info.firmwareRevision);
        this.m = n(thirdPartDevice);
        this.n = info.getDeviceFeature();
    }

    public DeviceInfo(byte[] bytesOfDeviceID, int profileVersion, int firmwareVersion) {
        this(bytesOfDeviceID, profileVersion, firmwareVersion, -1);
    }

    public DeviceInfo(byte[] bytesOfDeviceID, int profileVersion, int firmwareVersion, boolean isThirdPartDevice) {
        this(bytesOfDeviceID, profileVersion, firmwareVersion, -1, isThirdPartDevice);
    }

    public DeviceInfo(byte[] bytesOfDeviceID, int profileVersion, int firmwareVersion, int firmware2Version) {
        this(bytesOfDeviceID, profileVersion, firmwareVersion, firmware2Version, false);
    }

    public DeviceInfo(byte[] bytesOfDeviceID, int profileVersion, int firmwareVersion, int firmware2Version, boolean isThirdPartDevice) {
        this.a = null;
        this.b = null;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = null;
        this.j = new HMOtherVersion();
        this.k = null;
        this.m = HMDeviceSource.VDEVICE;
        this.n = null;
        this.o = new LanguageComBination();
        this.b = bytesOfDeviceID;
        this.a = String.format("%02X%02X%02X%02X%02X%02X%02X%02X", Byte.valueOf(bytesOfDeviceID[0]), Byte.valueOf(bytesOfDeviceID[1]), Byte.valueOf(bytesOfDeviceID[2]), Byte.valueOf(bytesOfDeviceID[3]), Byte.valueOf(bytesOfDeviceID[4]), Byte.valueOf(bytesOfDeviceID[5]), Byte.valueOf(bytesOfDeviceID[6]), Byte.valueOf(bytesOfDeviceID[7]));
        this.c = bytesOfDeviceID[4] & 255;
        this.d = bytesOfDeviceID[5] & 255;
        this.e = bytesOfDeviceID[6] & 255;
        this.f = profileVersion;
        this.g = firmwareVersion;
        this.h = firmware2Version;
        this.m = n(isThirdPartDevice);
    }
}
