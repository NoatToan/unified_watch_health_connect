package com.huawei.hihealth.data.type;

import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import health.compact.a.HuaweiHealth;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HiSyncType {

    public static class HiSyncAction {
    }

    public static class HiSyncDataType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f12263a = DicDataTypeUtil.DataType.WEIGHT_BODYFAT_BROAD.value();
    }

    public static class HiSyncLevel {
    }

    public static class HiSyncManual {
    }

    public static class HiSyncMethod {
    }

    public static class HiSyncModel {
    }

    public static class HiSyncScope {
    }

    public static class PushAction {
    }

    private HiSyncType() {
    }

    public static class HiSyncDataArea {
        private HiSyncDataArea() {
        }
    }

    public static List<Integer> d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(10);
        arrayList.add(16);
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.WEIGHT_BODYFAT_BROAD.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.EMOTION_SET.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.BODY_TEMPERATURE_SET.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.SKIN_TEMPERATURE_SET.value()));
        return arrayList;
    }

    public static boolean c(int i) {
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 7 && i != 15 && i != 10001 && i != 10021 && i != 10023 && i != 10026 && i != 10028 && i != 20000 && i != 900000000 && i != 9 && i != 10 && i != 10007 && i != 10008 && i != 10018 && i != 10019) {
            switch (i) {
                default:
                    switch (i) {
                        case 10010:
                        case 10011:
                        case 10012:
                        case 10013:
                            break;
                        default:
                            return HiHealthDictManager.a(HuaweiHealth.a()).a(i) != null;
                    }
                case 10003:
                case 10004:
                case 10005:
                    return true;
            }
        }
        return true;
    }
}
