package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class nuh implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(HealthEngineRequestManager.PARAMS_DEVICE_SN)
    private String f43748b;

    public void e(String str) {
        this.f43748b = str;
    }
}
