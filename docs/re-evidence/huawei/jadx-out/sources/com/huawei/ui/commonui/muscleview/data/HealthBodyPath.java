package com.huawei.ui.commonui.muscleview.data;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.operation.ble.BleConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class HealthBodyPath {

    @SerializedName(BleConstants.KEY_PATH)
    private String e;

    public static class BodyPathType extends TypeToken<ArrayList<HealthBodyPath>> {
    }

    public String e() {
        return this.e;
    }
}
