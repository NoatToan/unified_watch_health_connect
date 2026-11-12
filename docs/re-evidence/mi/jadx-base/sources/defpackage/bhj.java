package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class bhj {
    public static String a(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Cursor cursor = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data", "_display_name"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int columnIndex = cursorQuery.getColumnIndex("_data");
                        if ((columnIndex > -1 ? cursorQuery.getString(columnIndex) : null) != null) {
                            String string = cursorQuery.getString(columnIndex);
                            cursorQuery.close();
                            return string;
                        }
                        String absolutePath = d(context, cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name")), uri).getAbsolutePath();
                        cursorQuery.close();
                        return absolutePath;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @TargetApi(19)
    public static String b(Context context, Uri uri) throws IOException {
        if (MiuiCursorConstants.CONTENT.equalsIgnoreCase(uri.getScheme())) {
            return c(uri) ? uri.getLastPathSegment() : a(context, uri, null, null);
        }
        if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }

    public static boolean c(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static File d(Context context, String str, Uri uri) {
        String str2 = context.getCacheDir() + "/react-native-image-crop-picker";
        new File(str2).mkdir();
        File file = new File(new File(str2), str.substring(str.lastIndexOf(47) + 1));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[8192];
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            while (true) {
                int i = inputStreamOpenInputStream.read(bArr, 0, 8192);
                if (i <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i);
                fileOutputStream.flush();
            }
            fileOutputStream.close();
            inputStreamOpenInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }
}
