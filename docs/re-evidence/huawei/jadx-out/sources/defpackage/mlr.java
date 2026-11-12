package defpackage;

import android.os.Bundle;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes10.dex */
public class mlr {

    @SerializedName("value")
    private int d;

    @SerializedName("interval")
    private long e;

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.e = ((Long) lst.d(Long.valueOf(bundle.getLong("interval", -1L)))).longValue();
        this.d = ((Integer) lst.d(Integer.valueOf(bundle.getInt("value", -1)))).intValue();
    }
}
