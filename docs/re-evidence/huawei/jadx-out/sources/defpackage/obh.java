package defpackage;

import com.huawei.multisimservice.model.MultiSimDeviceInfo;
import com.huawei.multisimservice.model.SimInfo;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class obh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MultiSimDeviceInfo f44042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<SimInfo> f44043b;
    private int d;
    private int e;

    public obh(int i, int i2) {
        this.f44042a = null;
        this.f44043b = null;
        this.e = i;
        this.d = i2;
    }

    public obh(int i, MultiSimDeviceInfo multiSimDeviceInfo) {
        this.d = 2;
        this.f44043b = null;
        this.e = i;
        this.f44042a = multiSimDeviceInfo;
        if (multiSimDeviceInfo == null) {
            ocq.c("AttachedDeviceMgrCommonResult", "multiSimDeviceInfo is null");
            this.d = -6;
        } else {
            this.d = multiSimDeviceInfo.getResultCode();
        }
    }

    public obh(int i, int i2, List<SimInfo> list) {
        this.f44042a = null;
        this.e = i;
        this.d = i2;
        this.f44043b = list;
    }
}
