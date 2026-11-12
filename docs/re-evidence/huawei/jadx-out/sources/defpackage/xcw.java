package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class xcw {
    private List<xcp> devices;

    @SerializedName("resultCode")
    private int resultCode;

    public List<xcp> getDevices() {
        if (njy.e(this.devices)) {
            return new ArrayList(16);
        }
        return this.devices;
    }

    public List<xcp> getBindDevices() {
        if (njy.e(this.devices)) {
            return new ArrayList(16);
        }
        ArrayList arrayList = new ArrayList();
        for (xcp xcpVar : this.devices) {
            if (xcpVar.getBindStatus() == 1) {
                arrayList.add(xcpVar);
            }
        }
        return arrayList;
    }

    public int getResultCode() {
        return this.resultCode;
    }
}
