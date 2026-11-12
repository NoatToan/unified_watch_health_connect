package b21;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final void a(Context context) {
        context.getClass();
        if (b(context)) {
            return;
        }
        NutritionActivity.f39581f.getClass();
        Intent intent = new Intent(context, (Class<?>) NutritionActivity.class);
        intent.putExtra("CHECK_FOR_MFP", true);
        context.startActivity(intent);
    }

    public static final boolean b(Context context) {
        context.getClass();
        if (!hb2.j.b(context, "com.myfitnesspal.android")) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("mfp:///user/current/diary?date=" + new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(DateTime.now().toDate())));
        context.startActivity(intent);
        return true;
    }
}
