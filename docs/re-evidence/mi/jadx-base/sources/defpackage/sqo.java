package defpackage;

import android.os.Build;
import androidx.annotation.RequiresApi;
import com.miui.tsmclient.util.DoorCardConstants;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class sqo implements kgi {
    public static boolean a() {
        return DoorCardConstants.PARTNER_ID.equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL);
    }
}
