package defpackage;

import android.net.Uri;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes31.dex */
public class gyr {
    public static String b(Object obj) {
        LogUtil.a("Track_SportSoundDataParser", "getEventType enter");
        if (!(obj instanceof Uri)) {
            return null;
        }
        String string = ((Uri) obj).toString();
        LogUtil.a("Track_SportSoundDataParser", "getEventType uri = ", string);
        StringBuilder sb = new StringBuilder(string);
        return sb.substring(sb.lastIndexOf("/") + 1);
    }
}
