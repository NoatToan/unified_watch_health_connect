package com.huawei.hihealth.data.type;

import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import health.compact.a.HuaweiHealth;

/* JADX INFO: loaded from: classes2.dex */
public class HealthSyncCategory {

    public enum SyncCategory {
        UNKNOWN(-1),
        POINT(1),
        SEQUENCE(2),
        STAT(3),
        SESSION(4),
        CONFIG(5),
        BUSINESS(6);

        private int value;

        SyncCategory(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 7) {
                        if (i != 9) {
                            if (i != 21) {
                                if (i != 10007) {
                                    if (i != 10020 && i != 10022) {
                                        if (i != 10027) {
                                            if (i != 30001) {
                                                if (i == 900000000) {
                                                    return SyncCategory.CONFIG.getValue();
                                                }
                                                if (i != 18 && i != 19) {
                                                    if (i != 5000 && i != 5001) {
                                                        if (i != 10003 && i != 10004 && i != 10009 && i != 10010) {
                                                            if (i != 10024) {
                                                                if (i != 10025) {
                                                                    switch (i) {
                                                                        case 11:
                                                                        case 12:
                                                                        case 13:
                                                                        case 14:
                                                                        case 16:
                                                                            break;
                                                                        case 15:
                                                                            break;
                                                                        default:
                                                                            switch (i) {
                                                                                case PrebakedEffectId.RT_CALENDAR_DATE /* 10014 */:
                                                                                case 10017:
                                                                                    break;
                                                                                case 10015:
                                                                                case 10016:
                                                                                    break;
                                                                                default:
                                                                                    HiHealthDictType hiHealthDictTypeA = HiHealthDictManager.a(HuaweiHealth.a()).a(i);
                                                                                    if (hiHealthDictTypeA == null) {
                                                                                        return SyncCategory.UNKNOWN.getValue();
                                                                                    }
                                                                                    if (hiHealthDictTypeA.c() == 1) {
                                                                                        return SyncCategory.SEQUENCE.getValue();
                                                                                    }
                                                                                    if (hiHealthDictTypeA.c() == 0) {
                                                                                        return SyncCategory.POINT.getValue();
                                                                                    }
                                                                                    return SyncCategory.UNKNOWN.getValue();
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        return SyncCategory.BUSINESS.getValue();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return SyncCategory.STAT.getValue();
                            }
                        }
                    }
                }
                return SyncCategory.SESSION.getValue();
            }
            return SyncCategory.SEQUENCE.getValue();
        }
        return SyncCategory.POINT.getValue();
    }
}
