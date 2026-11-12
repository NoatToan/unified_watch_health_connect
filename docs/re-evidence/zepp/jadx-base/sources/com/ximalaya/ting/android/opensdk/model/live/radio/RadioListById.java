package com.ximalaya.ting.android.opensdk.model.live.radio;

import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class RadioListById extends XimalayaResponse {
    private List<Radio> radios;

    public List<Radio> getRadios() {
        return this.radios;
    }

    public void setRadios(List<Radio> list) {
        this.radios = list;
    }

    public String toString() {
        return "RadioListById [radios=" + this.radios + "]";
    }
}
