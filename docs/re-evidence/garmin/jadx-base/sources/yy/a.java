package yy;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.util.Pair;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.i2;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private a() {
    }

    public static Pair<Uri, Intent> a(Context context, File file) {
        Uri uriD;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.addFlags(3);
        if ("mounted".equals(Environment.getExternalStorageState())) {
            uriD = FileProvider.d(context, "GarminConnectMobileApp.provider", file);
        } else {
            i2.n("CameraUtil", "No media is mounted!");
            uriD = null;
        }
        intent.putExtra("output", uriD);
        intent.putExtra("return-data", true);
        return new Pair<>(uriD, intent);
    }

    public static Uri b(Fragment fragment, File file) {
        try {
            Pair<Uri, Intent> pairA = a(fragment.requireContext().getApplicationContext(), file);
            fragment.startActivityForResult((Intent) pairA.second, 3);
            return (Uri) pairA.first;
        } catch (ActivityNotFoundException e4) {
            i2.d("CameraUtil", "cannot take picture: " + e4.getMessage());
            return null;
        }
    }

    public static Uri c(c cVar, File file) {
        try {
            Pair<Uri, Intent> pairA = a(cVar.getApplicationContext(), file);
            cVar.startActivityForResult((Intent) pairA.second, 3);
            return (Uri) pairA.first;
        } catch (ActivityNotFoundException e4) {
            i2.d("CameraUtil", "cannot take picture: " + e4.getMessage());
            return null;
        }
    }
}
