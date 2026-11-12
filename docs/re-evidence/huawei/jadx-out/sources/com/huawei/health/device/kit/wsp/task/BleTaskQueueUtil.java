package com.huawei.health.device.kit.wsp.task;

import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dro;
import defpackage.drp;

/* JADX INFO: loaded from: classes7.dex */
public class BleTaskQueueUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6314c;
    private ITaskService f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private drp<dro> f6313b = new drp<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f6312a = new Object();
    private boolean d = false;
    private IAsynBleTaskCallback e = new IAsynBleTaskCallback() { // from class: com.huawei.health.device.kit.wsp.task.BleTaskQueueUtil.5
        @Override // com.huawei.health.device.kit.wsp.task.IAsynBleTaskCallback
        public void success(Object obj) {
            BleTaskQueueUtil.this.e();
        }

        @Override // com.huawei.health.device.kit.wsp.task.IAsynBleTaskCallback
        public void failed() {
            BleTaskQueueUtil.this.e();
        }
    };

    public enum TaskType {
        SET_AGE,
        SET_GENDER,
        SET_HEIGHT,
        SET_TIME,
        ENABLE_WEIGHT_SCALE,
        ENABLE_BODY_MEASUREMENT,
        ENABLE_GLUCOSE_MEASUREMENT,
        ENABLE_CLEAR_USER_INFO,
        CLEAR_USER_INFO,
        REQUEST_AUTH,
        AUTH_TOKEN,
        SEND_WORK_KEY,
        BIND_REQUEST,
        SET_USER_INFO,
        GET_MANAGER_INFO,
        SET_MANAGER_INFO,
        SEND_HILINK_CONFIG_INFO,
        SEND_HILINK_CONFIG_INFO_ENCRYPTED,
        GET_DEVICE_SSID,
        GET_ALLOW_RESET_WIFI,
        GET_WEIGHT_REAL_TIME_DATA,
        REQUEST_OTA_UPGRADE,
        OTA_UPGRADE_SHA_CHECK,
        SEND_OTA_PACKAGE_DATA,
        GET_OTA_UPGRADE_RESULT,
        GET_SCALE_VERSION,
        SET_WEIGHT_UNIT,
        GET_WEIGHT_UNIT,
        SET_SYNC_TIME,
        SET_SEND_CMD_PACKAGE,
        GET_WEIGHT_HISTORY_DATA,
        SEND_DEVICE_RESET,
        SEND_DELETE_USER_DATA,
        SEND_GET_USER_DATA,
        SEND_WAKE_UP,
        SEND_SSID,
        SEND_WIFI_PASSWORD,
        OPEN_STATUS,
        DISABLE_NOTIFICATION,
        WRITE_BLE_FILE,
        SEND_OTA_URL,
        NOTIFY_BLE_FILE
    }

    public BleTaskQueueUtil(ITaskService iTaskService) {
        this.f = iTaskService;
    }

    public void a() {
        LogUtil.a("BLETaskQueueUtil", "Enter clearTask and clear TaskFlag:");
        a(3);
        LogUtil.a("BLETaskQueueUtil", "FLAG_GET_MANAGER_INFO", 1, "FLAG_GET_MANAGER_AND_ACCOUNT_INFO = ", 2);
        synchronized (this.f6312a) {
            this.d = false;
            this.f6313b.e();
        }
    }

    public void c(dro droVar) {
        LogUtil.a("BLETaskQueueUtil", "addTask type:", droVar != null ? droVar.f() : "task null");
        synchronized (this.f6312a) {
            this.f6313b.d(droVar);
        }
    }

    public void b() {
        e(true);
    }

    private void e(boolean z) {
        synchronized (this.f6312a) {
            if (this.f6313b.a()) {
                this.d = false;
                return;
            }
            if (this.d && z) {
                return;
            }
            dro droVarC = this.f6313b.c();
            if (droVarC == null) {
                this.d = false;
                return;
            }
            this.d = true;
            TaskType taskTypeF = droVarC.f();
            int iOrdinal = taskTypeF.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 8 && iOrdinal != 23 && iOrdinal != 29) {
                if (iOrdinal == 38) {
                    b(droVarC);
                    return;
                } else if (iOrdinal != 39) {
                    c(droVarC, taskTypeF);
                    return;
                }
            }
            this.f.write(droVarC, this.e);
        }
    }

    private void c(dro droVar, TaskType taskType) {
        switch (taskType.ordinal()) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 24:
            case 37:
            case 41:
                a(droVar);
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 25:
            case 26:
            case 27:
            case 28:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 40:
                e(droVar);
                break;
        }
    }

    private void b(dro droVar) {
        if (droVar == null || droVar.c() == null) {
            LogUtil.j("BLETaskQueueUtil", "disableNotification illegal task data!");
        } else {
            this.f.disable(droVar, this.e);
        }
    }

    private void a(dro droVar) {
        this.f.enable(droVar, this.e);
    }

    private void e(dro droVar) {
        if (droVar == null || droVar.c() == null) {
            LogUtil.j("BLETaskQueueUtil", "executeEnableAndWriteTask illegal task data!");
            return;
        }
        this.f.enable(droVar, new IAsynBleTaskCallback() { // from class: com.huawei.health.device.kit.wsp.task.BleTaskQueueUtil.3
            @Override // com.huawei.health.device.kit.wsp.task.IAsynBleTaskCallback
            public void failed() {
            }

            @Override // com.huawei.health.device.kit.wsp.task.IAsynBleTaskCallback
            public void success(Object obj) {
            }
        });
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            LogUtil.e("BLETaskQueueUtil", "executeEnableAndWriteTask exception = ", e.getMessage());
        }
        this.f.write(droVar, this.e);
    }

    public void e() {
        synchronized (this.f6312a) {
            if (this.f6313b.a()) {
                LogUtil.j("BLETaskQueueUtil", "doNext mTaskQueue.size()==0");
                this.d = false;
            } else {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    LogUtil.e("BLETaskQueueUtil", "doNext e = ", e.getMessage());
                }
                e(false);
            }
        }
    }

    public int d() {
        int iD;
        synchronized (this.f6312a) {
            iD = this.f6313b.d();
        }
        return iD;
    }

    public void e(int i) {
        this.f6314c = i | this.f6314c;
    }

    public void a(int i) {
        this.f6314c = (~i) & this.f6314c;
    }

    public boolean b(int i) {
        return (i & this.f6314c) != 0;
    }
}
