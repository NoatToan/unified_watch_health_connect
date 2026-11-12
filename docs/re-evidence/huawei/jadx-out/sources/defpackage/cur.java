package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.featuregroup.constants.DeviceInfo;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.ble.BleConstants;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cur extends CloudCommonReponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("aveSpace")
    private int f31326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("status")
    private int f31327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("onlineDevices")
    private List<DeviceInfo> f31328c;

    @SerializedName(JsbMapKeyNames.H5_LOC_LON)
    private double d;

    @SerializedName(JsbMapKeyNames.H5_LOC_LAT)
    private double e;

    @SerializedName("syncDevice")
    private DeviceInfo f;

    @SerializedName("totalTime")
    private int h;

    @SerializedName(BleConstants.TOTAL_DISTANCE)
    private int i;
}
