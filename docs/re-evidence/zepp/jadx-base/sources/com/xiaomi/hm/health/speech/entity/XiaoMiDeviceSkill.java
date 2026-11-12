package com.xiaomi.hm.health.speech.entity;

import com.xiaomi.hm.health.speech.constant.AiEnginePlatform;

/* JADX INFO: loaded from: classes21.dex */
public class XiaoMiDeviceSkill extends BaseSkill {
    private boolean a;
    private String b;
    private int c;

    public XiaoMiDeviceSkill() {
        this.aiEnginePlatform = AiEnginePlatform.XIAOMI;
    }

    public String getToSpeak() {
        return this.b;
    }

    public int getUnknownDomainAction() {
        return this.c;
    }

    public boolean isOpenMic() {
        return this.a;
    }

    public void setOpenMic(boolean openMic) {
        this.a = openMic;
    }

    public void setToSpeak(String toSpeak) {
        this.b = toSpeak;
    }

    public void setUnknownDomainAction(int unknownDomainAction) {
        this.c = unknownDomainAction;
    }
}
