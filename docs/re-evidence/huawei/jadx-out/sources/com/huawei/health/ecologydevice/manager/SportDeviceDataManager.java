package com.huawei.health.ecologydevice.manager;

import android.util.SparseArray;
import androidx.core.util.Pair;
import com.google.gson.Gson;
import com.google.json.JsonSanitizer;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.device.open.HealthDevice;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import defpackage.elh;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SportDeviceDataManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f6565c = {"distance", "duration"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f6566a;
    private SportDataListener d;

    public interface SportDataListener {
        void onNewLastData(long j, int i, int i2);
    }

    public String e() {
        return null;
    }

    public SportDeviceDataManager(String str, String str2, SportDataListener sportDataListener) {
        this.d = sportDataListener;
        d dVar = new d(str, str2);
        this.f6566a = dVar;
        LogUtil.d("PDSPORT_SportDeviceDataMgr", "Sport device product info:", dVar.f6569b ? this.f6566a.h.h() : "setup failed");
    }

    public void h() {
        d(System.currentTimeMillis());
    }

    private void d(long j) {
        if (this.f6566a.f6568a == -1) {
            LogUtil.d("PDSPORT_SportDeviceDataMgr", "Unkown device type, skip history data query");
            return;
        }
        LogUtil.a("PDSPORT_SportDeviceDataMgr", "queryLastHistoryData");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(new int[]{this.f6566a.e});
        hiDataReadOption.setConstantsKey(f6565c);
        hiDataReadOption.setTimeInterval(0L, j);
        hiDataReadOption.setCount(10);
        hiDataReadOption.setSortOrder(1);
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.health.ecologydevice.manager.SportDeviceDataManager.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("PDSPORT_SportDeviceDataMgr", "queryLastHistoryData onResult errorCode:", Integer.valueOf(i));
                if (obj instanceof SparseArray) {
                    Object obj2 = ((SparseArray) obj).get(SportDeviceDataManager.this.f6566a.e);
                    if (obj2 instanceof List) {
                        SportDeviceDataManager.this.c((List) obj2);
                        return;
                    } else {
                        LogUtil.j("PDSPORT_SportDeviceDataMgr", "error result list.");
                        return;
                    }
                }
                LogUtil.j("PDSPORT_SportDeviceDataMgr", "error data format");
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.a("PDSPORT_SportDeviceDataMgr", "queryLastHistoryData onResultIntent errorCode = ", Integer.valueOf(i2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List list) {
        if (list.isEmpty() || !(list.get(0) instanceof HiHealthData)) {
            LogUtil.d("PDSPORT_SportDeviceDataMgr", "error result data: empty list or unrecognized data type.");
            return;
        }
        long startTime = 0;
        for (Object obj : list) {
            if (obj instanceof HiHealthData) {
                HiHealthData hiHealthData = (HiHealthData) obj;
                LogUtil.d("PDSPORT_SportDeviceDataMgr", "queryLastHistoryData resultData:", hiHealthData);
                HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) new Gson().fromJson(JsonSanitizer.sanitize(hiHealthData.getMetaData()), HiTrackMetaData.class);
                if (hiTrackMetaData != null && hiTrackMetaData.getSportType() == this.f6566a.f6568a) {
                    Pair<Integer, Integer> pairC = c(hiTrackMetaData);
                    LogUtil.d("PDSPORT_SportDeviceDataMgr", "query lastTime:", Long.valueOf(hiHealthData.getStartTime()), ", lastValue:", pairC);
                    SportDataListener sportDataListener = this.d;
                    if (sportDataListener != null) {
                        sportDataListener.onNewLastData(hiHealthData.getStartTime(), pairC.first.intValue(), pairC.second.intValue());
                        return;
                    }
                    return;
                }
                startTime = hiHealthData.getStartTime();
            }
        }
        if (list.size() != 10 || startTime <= 0) {
            return;
        }
        LogUtil.a("PDSPORT_SportDeviceDataMgr", "continue, query startTime:", Long.valueOf(startTime));
        d(startTime);
    }

    private Pair<Integer, Integer> c(HiTrackMetaData hiTrackMetaData) {
        int i;
        int totalDistance = hiTrackMetaData.getTotalDistance();
        if (totalDistance <= 0) {
            totalDistance = (int) hiTrackMetaData.getTotalTime();
            i = 0;
        } else {
            i = 1;
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(totalDistance));
    }

    public elh b() {
        return this.f6566a.h;
    }

    public int i() {
        return this.f6566a.f6568a;
    }

    public String c() {
        return this.f6566a.f6569b ? this.f6566a.h.l().d() : "";
    }

    public String a() {
        return this.f6566a.d;
    }

    public String d() {
        HealthDeviceEntryApi healthDeviceEntryApi = (HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class);
        if (healthDeviceEntryApi.isDeviceKitUniversal(this.f6566a.f6570c)) {
            HealthDevice bondedDeviceUniversal = healthDeviceEntryApi.getBondedDeviceUniversal(this.f6566a.f6570c, this.f6566a.f);
            if (bondedDeviceUniversal != null) {
                LogUtil.d("PDSPORT_SportDeviceDataMgr", "isBondedDevice: device = ", BTDeviceMgrUtil.c().e(bondedDeviceUniversal.getAddress()));
                return bondedDeviceUniversal.getAddress();
            }
            return "";
        }
        com.huawei.health.device.model.HealthDevice bondedDeviceByUniqueId = healthDeviceEntryApi.getBondedDeviceByUniqueId(this.f6566a.f);
        if (bondedDeviceByUniqueId != null) {
            LogUtil.d("PDSPORT_SportDeviceDataMgr", "isBondedDevice: device = ", BTDeviceMgrUtil.c().e(bondedDeviceByUniqueId.getAddress()));
            return bondedDeviceByUniqueId.getAddress();
        }
        return "";
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f6569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f6570c;
        String f;
        elh h = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6568a = -1;
        String d = null;
        int e = -1;

        d(String str, String str2) {
            this.f6570c = str;
            this.f = str2;
            this.f6569b = a(str);
        }

        private boolean a(String str) {
            elh elhVarD = ResourceManager.c().d(str);
            this.h = elhVarD;
            if (elhVarD == null) {
                LogUtil.j("PDSPORT_SportDeviceDataMgr", "Unrecognized productId");
                return false;
            }
            int i = AnonymousClass1.e[elhVarD.m().ordinal()];
            if (i == 1) {
                this.f6568a = 264;
                this.d = "31";
                this.e = 30006;
            } else if (i == 2) {
                this.f6568a = OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE;
                this.d = BleConstants.SPORT_TYPE_BIKE;
                this.e = 30002;
            } else if (i == 3) {
                this.f6568a = OldToNewMotionPath.SPORT_TYPE_ROW_MACHINE;
                this.d = "261";
                this.e = 30002;
            } else if (i == 4) {
                this.f6568a = OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER;
                this.d = "260";
                this.e = 30002;
            } else {
                if (i != 5) {
                    return false;
                }
                this.f6568a = 281;
                this.d = BleConstants.SPORT_TYPE_TREADMILL;
                this.e = 30005;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.ecologydevice.manager.SportDeviceDataManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[com.huawei.health.device.model.HealthDevice.HealthDeviceKind.values().length];
            e = iArr;
            try {
                iArr[com.huawei.health.device.model.HealthDevice.HealthDeviceKind.HDK_TREADMILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[com.huawei.health.device.model.HealthDevice.HealthDeviceKind.HDK_EXERCISE_BIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[com.huawei.health.device.model.HealthDevice.HealthDeviceKind.HDK_ROWING_MACHINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[com.huawei.health.device.model.HealthDevice.HealthDeviceKind.HDK_ELLIPTICAL_MACHINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[com.huawei.health.device.model.HealthDevice.HealthDeviceKind.HDK_WALKING_MACHINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }
}
