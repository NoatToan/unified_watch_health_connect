package com.huawei.ui.homehealth.backlog;

import com.huawei.operation.constants.PendingSettingTag;
import defpackage.rjw;
import defpackage.rkb;
import defpackage.rkd;
import defpackage.rke;
import defpackage.rkh;
import defpackage.rki;
import defpackage.rkk;
import defpackage.rkm;
import defpackage.rkn;
import defpackage.rko;
import defpackage.rkp;
import defpackage.rkq;
import defpackage.rkt;
import defpackage.rkv;
import defpackage.rkw;
import defpackage.rla;
import defpackage.rlc;

/* JADX INFO: loaded from: classes17.dex */
public enum BacklogType {
    NEAR_DEVICE_PERMISSION(PendingSettingTag.NERAR_DEVICE_PERMISSION, 0, rkp.class),
    LOCATION_PERMISSION(PendingSettingTag.LOCATION_PERMISSION, 1, rkn.class),
    MESSAGE_NOTIFICATION(PendingSettingTag.MESSAGE_NOTIFICATION, 2, rkq.class),
    SECRET_MESSAGE_PERMISSION(PendingSettingTag.SECRET_MESSAGE_PERMISSION, 3, rkw.class),
    ENABLE_NOTIFICATION(PendingSettingTag.ENABLE_NOTIFICATION, 4, rki.class),
    SOS_HELP_SETTINGS(PendingSettingTag.SOS_HELP_SET, 5, rkv.class),
    FIND_NETWORK("findNetwork", 6, rkm.class),
    CONNECT_PROTECT(PendingSettingTag.CONNECT_PROTECT, 7, rkh.class),
    BEIDOU_MESSAGE(PendingSettingTag.BEIDOU_MESSAGE, 8, rkd.class),
    EARPHONE_MATCHING(PendingSettingTag.ERAR_PHONE_MATCHING, 9, rke.class),
    AUTO_UPGRADE_ON_WLAN(PendingSettingTag.AUTO_UPGRADE_ON_WLAN, 10, rkb.class),
    ACCOUNT_SYNC(PendingSettingTag.ACCOUNT_SYNC, 11, rjw.class),
    VERSION_UPGRADE(PendingSettingTag.VERSION_UPGRADE, 12, rla.class),
    OFFLINE_MAP_AUTO_SWITCH("mapAutoSwitch", 13, rko.class),
    OFFLINE_MAP_UPDATE("mapUpdate", 14, rkt.class),
    FALL_DETECTION(PendingSettingTag.FALL_DETECTION, 15, rkk.class),
    WECHAT_BINDING(PendingSettingTag.WECHAT_BINDING, 16, rlc.class);

    private final Class<?> className;
    private final String id;
    private final int order;

    BacklogType(String str, int i, Class cls) {
        this.id = str;
        this.order = i;
        this.className = cls;
    }

    public String getId() {
        return this.id;
    }

    public int getOrder() {
        return this.order;
    }

    public String getClassName() {
        return this.className.getName();
    }
}
