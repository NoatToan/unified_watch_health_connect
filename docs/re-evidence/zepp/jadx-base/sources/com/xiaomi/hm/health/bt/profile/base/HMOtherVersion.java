package com.xiaomi.hm.health.bt.profile.base;

import androidx.annotation.Nullable;
import com.xiaomi.hm.health.bt.model.HMLanguage;

/* JADX INFO: loaded from: classes11.dex */
public class HMOtherVersion {
    public static final int FT_FLAG_CHINESE = 1;
    public static final int FT_FLAG_ENGLISH_PRO = 0;
    public static final int FT_FLAG_KJ = 4;
    public static final int FT_FLAG_LATIN = 2;
    public static final int FT_FLAG_SIMPLIFIED_CHINESE_PRO = 255;
    public static final int FT_FLAG_UNKNOWN = -1;
    public int a;
    private int b = 0;
    private int c = 0;
    private int d = -1;
    private int e = -1;
    private int f = -1;
    private BaseResourceInfo g = null;
    private ExternalResourceInfo h = null;
    private SystemImageStatus i = SystemImageStatus.NoInformation.INSTANCE;
    private HMLanguage j = new HMLanguage(0);
    private int k = -1;
    private String l = null;
    private Integer m = null;
    private Long n = null;
    private Long o = null;
    private Boolean p = null;

    @Nullable
    private Boolean q = null;

    public Long getAGpsExpirationTime() {
        return this.o;
    }

    public Integer getAGpsType() {
        return this.m;
    }

    public Long getAGpsUpgradeTime() {
        return this.n;
    }

    public BaseResourceInfo getBaseResourceInfo() {
        return this.g;
    }

    public Boolean getDifferentialPackageOtaMark() {
        return this.p;
    }

    public int getEmojiVersion() {
        return this.f;
    }

    public ExternalResourceInfo getExternalResourceInfo() {
        return this.h;
    }

    public int getFontFlag() {
        return this.b;
    }

    public int getFontVersion() {
        return this.c;
    }

    public int getFwFlag() {
        return this.k;
    }

    public String getGpsVersion() {
        return this.l;
    }

    public HMLanguage getLanguage() {
        return this.j;
    }

    public int getResourceFlag() {
        return this.e;
    }

    public int getResourceVersion() {
        return this.d;
    }

    public SystemImageStatus getSystemImageStatus() {
        return this.i;
    }

    public int getVersion() {
        return this.a;
    }

    @Nullable
    public Boolean isDomesticProduct() {
        return this.q;
    }

    public void setAGpsExpirationTime(Long aGpsExpirationTime) {
        this.o = aGpsExpirationTime;
    }

    public void setAGpsType(Integer aGpsType) {
        this.m = aGpsType;
    }

    public void setAGpsUpgradeTime(Long aGpsUpgradeTime) {
        this.n = aGpsUpgradeTime;
    }

    public void setBaseResourceInfo(BaseResourceInfo baseResourceInfo) {
        this.g = baseResourceInfo;
    }

    public void setDifferentialPackageOtaMark(Boolean differentialPackageOtaMark) {
        this.p = differentialPackageOtaMark;
    }

    public void setDomesticProduct(@Nullable Boolean domesticProduct) {
        this.q = domesticProduct;
    }

    public void setEmojiVersion(int emojiVersion) {
        this.f = emojiVersion;
    }

    public void setExternalResourceInfo(ExternalResourceInfo externalResourceInfo) {
        this.h = externalResourceInfo;
    }

    public void setFontFlag(int fontFlag) {
        this.b = fontFlag;
    }

    public void setFontVersion(int fontVersion) {
        this.c = fontVersion;
    }

    public void setFwFlag(int fwFlag) {
        this.k = fwFlag;
    }

    public void setGpsVersion(String gpsVersion) {
        this.l = gpsVersion;
    }

    public void setLanguage(HMLanguage language) {
        this.j = language;
    }

    public void setResourceFlag(int resourceFlag) {
        this.e = resourceFlag;
    }

    public void setResourceVersion(int resourceVersion) {
        this.d = resourceVersion;
    }

    public void setSystemImageStatus(SystemImageStatus systemImageStatus) {
        this.i = systemImageStatus;
    }

    public void setVersion(int version) {
        this.a = version;
    }

    public String toString() {
        return "HMOtherVersion{version=" + this.a + ", fontFlag=" + this.b + ", fontVersion=" + this.c + ", resourceVersion=" + this.d + ", resourceFlag=" + this.e + ", emojiVersion=" + this.f + ", baseResourceInfo=" + this.g + ", language=" + this.j + ", fwFlag=" + this.k + ", differentialPackageOtaMark: " + this.p + ", systemImageStatus: " + this.i + ", domesticProduct: " + this.q + '}';
    }
}
