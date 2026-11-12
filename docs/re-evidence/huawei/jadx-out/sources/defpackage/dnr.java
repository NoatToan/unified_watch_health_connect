package defpackage;

import com.huawei.health.device.kit.wsp.task.BleTaskQueueUtil;

/* JADX INFO: loaded from: classes7.dex */
public class dnr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dnp f32086c = new dnp();
    private BleTaskQueueUtil e;

    public dnr(BleTaskQueueUtil bleTaskQueueUtil) {
        this.e = bleTaskQueueUtil;
    }

    public void e(String str, String str2) {
        if (this.e != null) {
            this.e.c(new dro(BleTaskQueueUtil.TaskType.WRITE_BLE_FILE, this.f32086c.a(str, str2), false));
            this.e.b();
        }
    }

    public void b(int i, int i2) {
        if (this.e != null) {
            this.e.c(new dro(BleTaskQueueUtil.TaskType.WRITE_BLE_FILE, this.f32086c.c(i, i2), false));
            this.e.b();
        }
    }

    public void d(int i) {
        if (this.e != null) {
            this.e.c(new dro(BleTaskQueueUtil.TaskType.WRITE_BLE_FILE, this.f32086c.a(i), false));
            this.e.b();
        }
    }

    public void a(int i, int i2, int i3) {
        if (this.e != null) {
            this.e.c(new dro(BleTaskQueueUtil.TaskType.WRITE_BLE_FILE, this.f32086c.b(i, i2, i3), false));
            this.e.b();
        }
    }

    public void e(int i, int i2) {
        if (this.e != null) {
            this.e.c(new dro(BleTaskQueueUtil.TaskType.WRITE_BLE_FILE, this.f32086c.d(i, i2), false));
            this.e.b();
        }
    }
}
