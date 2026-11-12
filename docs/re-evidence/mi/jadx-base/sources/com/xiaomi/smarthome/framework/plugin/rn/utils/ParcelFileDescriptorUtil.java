package com.xiaomi.smarthome.framework.plugin.rn.utils;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes2.dex */
public class ParcelFileDescriptorUtil {
    public static ParcelFileDescriptor open(Context context, Uri uri, int i) throws FileNotFoundException {
        String str;
        if (!TextUtils.equals(MiuiCursorConstants.CONTENT, uri.getScheme()) && !TextUtils.equals("file", uri.getScheme())) {
            return ParcelFileDescriptor.open(new File(uri.toString()), i);
        }
        if (i != 536870912) {
            str = i != 805306368 ? "r" : "rw";
        } else {
            str = Constants.DEVICE_TYPE_WEAR;
        }
        return context.getContentResolver().openFileDescriptor(uri, str);
    }
}
