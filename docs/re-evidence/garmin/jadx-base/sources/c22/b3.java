package c22;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class b3 {
    public static String a() {
        String strB = ((bv.d) KoinJavaComponent.get(bv.d.class)).b();
        return strB.equals("en") ? "" : strB;
    }

    public static void b(Context context) {
        new androidx.appcompat.app.e.a(context).setTitle(R.string.lbl_comment_limit_reached_title).setMessage(R.string.lbl_comment_limit_reached_message).setPositiveButton(R.string.lbl_ok, new ag0.e(18)).show();
    }

    public static void c(Context context) {
        new androidx.appcompat.app.e.a(context).setTitle(R.string.lbl_like_limit_reached_title).setMessage(R.string.lbl_like_limit_reached_message).setPositiveButton(R.string.lbl_ok, new ag0.e(19)).show();
    }
}
