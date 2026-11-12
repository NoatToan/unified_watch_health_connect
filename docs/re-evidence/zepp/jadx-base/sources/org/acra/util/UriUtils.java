package org.acra.util;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.acra.attachment.AcraContentProvider;

/* JADX INFO: loaded from: classes23.dex */
public final class UriUtils {
    private UriUtils() {
    }

    public static void copyFromUri(@NonNull Context context, @NonNull OutputStream outputStream, @NonNull Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        try {
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Could not open " + uri.toString());
            }
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStreamOpenInputStream.read(bArr);
                if (i <= 0) {
                    inputStreamOpenInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @NonNull
    public static String getFileNameFromUri(@NonNull Context context, @NonNull Uri uri) throws FileNotFoundException {
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                    cursorQuery.close();
                    return string;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        throw new FileNotFoundException("Could not resolve filename of " + uri);
    }

    @NonNull
    public static String getMimeType(@NonNull Context context, @NonNull Uri uri) {
        String type;
        return (!uri.getScheme().equals("content") || (type = context.getContentResolver().getType(uri)) == null) ? AcraContentProvider.guessMimeType(uri) : type;
    }
}
