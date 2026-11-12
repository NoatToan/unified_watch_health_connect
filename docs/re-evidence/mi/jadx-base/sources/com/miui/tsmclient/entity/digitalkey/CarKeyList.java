package com.miui.tsmclient.entity.digitalkey;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.entity.CarKeyCardInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class CarKeyList {

    @SerializedName("keys")
    private List<CarKeyCardInfo> mCarKeyList;

    public List<CarKeyCardInfo> getCarKeyList() {
        return this.mCarKeyList;
    }

    public void setCarKeyList(List<CarKeyCardInfo> list) {
        if (this.mCarKeyList == null) {
            this.mCarKeyList = new ArrayList();
        }
        this.mCarKeyList.addAll(list);
    }
}
