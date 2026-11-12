package com.huawei.ui.commonui.muscleview.data;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.operation.ble.BleConstants;
import defpackage.qoq;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HealthMusclePath {

    @SerializedName(HwPayConstant.KEY_SIGN)
    private int d;

    @SerializedName(BleConstants.KEY_PATH)
    private List<qoq> e;

    public static class MuscleType extends TypeToken<ArrayList<HealthMusclePath>> {
    }

    public List<qoq> e() {
        return this.e;
    }

    public int c() {
        return this.d;
    }
}
