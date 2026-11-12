package com.xiaomi.ai.domain.phonecall.common;

import com.xiaomi.ai.domain.phonecall.util.NameTypeUtils;

/* JADX INFO: loaded from: classes7.dex */
public class SlotRet {
    private Boolean isQrw;
    private NameType nameType;
    private boolean offlineAsr;
    private String prefix;
    private String slot;
    private String suffix;

    public SlotRet(String str, String str2, String str3, Boolean bool) {
        this.slot = str;
        this.prefix = str2;
        this.suffix = str3;
        this.isQrw = bool;
        NameType nameType = NameTypeUtils.getNameType(str);
        this.nameType = nameType;
        this.offlineAsr = isOfflineAsr(nameType);
    }

    private boolean isOfflineAsr(NameType nameType) {
        return nameType.equals(NameType.NORMAL);
    }

    public NameType getNameType() {
        return this.nameType;
    }

    public boolean getOfflineAsr() {
        return this.offlineAsr;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public Boolean getQrw() {
        return this.isQrw;
    }

    public String getSlot() {
        return this.slot;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public void setNameType(NameType nameType) {
        this.nameType = nameType;
    }

    public void setOfflineAsr(boolean z) {
        this.offlineAsr = z;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public void setQrw(Boolean bool) {
        this.isQrw = bool;
    }

    public void setSlot(String str) {
        this.slot = str;
        NameType nameType = NameTypeUtils.getNameType(str);
        this.nameType = nameType;
        this.offlineAsr = isOfflineAsr(nameType);
    }

    public SlotRet setSlot2(String str) {
        this.slot = str;
        return this;
    }

    public void setSuffix(String str) {
        this.suffix = str;
    }

    public SlotRet(String str, String str2, String str3, Boolean bool, Boolean bool2) {
        this.slot = str;
        this.prefix = str2;
        this.suffix = str3;
        this.isQrw = bool;
        this.nameType = NameTypeUtils.getNameType(str);
        this.offlineAsr = bool2.booleanValue();
    }

    public SlotRet(SlotRet slotRet) {
        this.slot = slotRet.slot;
        this.prefix = slotRet.prefix;
        this.suffix = slotRet.suffix;
        this.isQrw = slotRet.isQrw;
        this.nameType = slotRet.nameType;
        this.offlineAsr = slotRet.offlineAsr;
    }

    public SlotRet() {
    }
}
