package defpackage;

import android.util.Pair;
import com.xiaomi.smarthome.localcontrol.common.util.NetUtil;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes7.dex */
public class ixl {
    public static Pair<Long, Boolean> a() {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(NetUtil.MIOT_API_HOST).openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(10000);
            try {
                uRLConnectionOpenConnection.connect();
                return new Pair<>(Long.valueOf(uRLConnectionOpenConnection.getDate() - System.currentTimeMillis()), Boolean.TRUE);
            } catch (Exception e) {
                e.printStackTrace();
                return new Pair<>(0L, Boolean.FALSE);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return new Pair<>(0L, Boolean.FALSE);
        }
    }
}
