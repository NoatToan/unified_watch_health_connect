package com.xiaomi.ai.domain.phonecall.common;

import com.xiaomi.ai.domain.phonecall.util.ABTestGroupType;
import com.xiaomi.ai.edge.common.model.FullEdgeRequestEnv;
import defpackage.aqe;
import defpackage.klo;
import defpackage.n08;
import defpackage.qpe;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class PhoneCallRequestEnv {
    private static final qpe LOGGER = aqe.f(PhoneCallRequestEnv.class);
    private DeviceApp deviceApp;
    private String deviceId;
    private ABTestGroupType groupType;
    private boolean hasWritePermission;
    private boolean isBlueTooth;
    private boolean isVoiceWakeUp;
    private boolean selectDefaultCard;
    private String userAgent;
    private String userId;

    public PhoneCallRequestEnv(DeviceApp deviceApp, String str, String str2, ABTestGroupType aBTestGroupType) {
        this.deviceApp = DeviceApp.Default();
        this.deviceId = "";
        this.userId = "";
        ABTestGroupType aBTestGroupType2 = ABTestGroupType.DEFAULT;
        this.groupType = aBTestGroupType2;
        this.hasWritePermission = true;
        this.selectDefaultCard = true;
        this.isBlueTooth = false;
        this.userAgent = "";
        this.isVoiceWakeUp = false;
        this.deviceApp = deviceApp == null ? DeviceApp.Default() : deviceApp;
        this.deviceId = str == null ? "" : str;
        this.userId = str2 == null ? "" : str2;
        this.groupType = aBTestGroupType == null ? aBTestGroupType2 : aBTestGroupType;
    }

    public String getAppId() {
        return this.deviceApp.getAppId();
    }

    public String getAppName() {
        return this.deviceApp.getAppName();
    }

    public DeviceApp getDeviceApp() {
        return this.deviceApp;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public ABTestGroupType getGroupType() {
        return this.groupType;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isBlueTooth() {
        return this.isBlueTooth;
    }

    public boolean isHasWritePermission() {
        return this.hasWritePermission;
    }

    public boolean isSelectDefaultCard() {
        return this.selectDefaultCard;
    }

    public boolean isVoiceWakeUp() {
        return this.isVoiceWakeUp;
    }

    public void setBlueTooth(boolean z) {
        this.isBlueTooth = z;
    }

    public void setDeviceApp(DeviceApp deviceApp) {
        this.deviceApp = deviceApp;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setGroupType(ABTestGroupType aBTestGroupType) {
        this.groupType = aBTestGroupType;
    }

    public void setSelectDefaultCard(boolean z) {
        this.selectDefaultCard = z;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setVoiceWakeUp(boolean z) {
        this.isVoiceWakeUp = z;
    }

    public String toString() {
        return "PhoneCallRequestEnv{deviceApp=" + this.deviceApp + ", deviceId='" + this.deviceId + "', userId='" + this.userId + "', groupType=" + this.groupType + ", hasWritePermission=" + this.hasWritePermission + ", selectDefaultCard=" + this.selectDefaultCard + ", isBlueTooth=" + this.isBlueTooth + ", isVoiceWakeUp" + this.isVoiceWakeUp + ", userAgent" + this.userAgent + AbstractJsonLexerKt.END_OBJ;
    }

    public PhoneCallRequestEnv(DeviceApp deviceApp) {
        this(deviceApp, "", "", ABTestGroupType.DEFAULT);
    }

    public PhoneCallRequestEnv(DeviceApp deviceApp, String str, String str2) {
        this(deviceApp, str, str2, ABTestGroupType.DEFAULT);
    }

    public PhoneCallRequestEnv() {
        this(DeviceApp.Default(), "", "", ABTestGroupType.DEFAULT);
    }

    public PhoneCallRequestEnv(n08 n08Var) {
        String strA;
        this.deviceApp = DeviceApp.Default();
        this.deviceId = "";
        this.userId = "";
        this.groupType = ABTestGroupType.DEFAULT;
        this.hasWritePermission = true;
        this.selectDefaultCard = true;
        this.isBlueTooth = false;
        this.userAgent = "";
        this.isVoiceWakeUp = false;
        if (n08Var != null) {
            if (klo.e(n08Var.getAppId())) {
                if (n08Var.getDevice() == null || n08Var.getDevice().a() == null) {
                    strA = "";
                } else {
                    strA = n08Var.getDevice().a();
                }
                this.deviceApp = new DeviceApp(n08Var.getAppId(), n08Var.getAppName() != null ? n08Var.getAppName() : "", strA);
            }
            if (n08Var instanceof FullEdgeRequestEnv) {
                FullEdgeRequestEnv fullEdgeRequestEnv = (FullEdgeRequestEnv) n08Var;
                String[] denyPermissions = fullEdgeRequestEnv.getDenyPermissions();
                String[] currentModels = fullEdgeRequestEnv.getCurrentModels();
                this.selectDefaultCard = fullEdgeRequestEnv.isSelectDefaultCard();
                if (denyPermissions != null && denyPermissions.length > 0) {
                    for (String str : denyPermissions) {
                        if ("NO_WRITE_CONTACTS".equalsIgnoreCase(str)) {
                            this.hasWritePermission = false;
                        }
                    }
                }
                if (currentModels != null && currentModels.length > 0) {
                    for (String str2 : currentModels) {
                        if ("BLUE_TOOTH".equalsIgnoreCase(str2)) {
                            this.isBlueTooth = true;
                        }
                    }
                }
            }
            this.deviceId = n08Var.getDeviceId() != null ? n08Var.getDeviceId() : "";
            this.userId = (n08Var.getUserInfo() == null || n08Var.getUserInfo().a() == null) ? "" : n08Var.getUserInfo().a();
            this.groupType = ABTestGroupType.DEFAULT;
            String userAgent = n08Var.getUserAgent() != null ? n08Var.getUserAgent() : "";
            this.userAgent = userAgent;
            this.isVoiceWakeUp = userAgent.contains("ACTION_VOICE_TRIGGER_START_VOICEASSIST");
            LOGGER.info("{},userAgent:{},isVoiceWakeUp:{}", n08Var.getRequestId(), n08Var.getUserAgent(), Boolean.valueOf(this.isVoiceWakeUp));
        }
    }
}
