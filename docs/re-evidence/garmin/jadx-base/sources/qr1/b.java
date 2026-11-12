package qr1;

import android.content.Context;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import o13.p;
import oi0.h;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final b92.a a(Context context, p pVar) {
        String str;
        String strE = a0.e(R.string.txt_empty_page_no_data, context);
        h hVar = new h(context);
        Integer num = (Integer) pVar.f128594a;
        Object obj = pVar.f128595b;
        if (num != null) {
            str = obj + StringUtils.SPACE + hVar.c(num.intValue(), false);
        } else {
            str = obj + StringUtils.SPACE + strE;
        }
        return wz1.a.a(str);
    }
}
