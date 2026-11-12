package org.acra.attachment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import org.acra.ACRA;
import org.acra.file.Directory;

/* JADX INFO: loaded from: classes23.dex */
public class AcraContentProvider extends ContentProvider {
    private static final String[] b = {"_display_name", "_size"};
    private static final String c = "application/octet-stream";
    private String a;

    @NonNull
    private static String a(@NonNull Context context) {
        return context.getPackageName() + ".acra";
    }

    @Nullable
    private File b(@NonNull Uri uri) {
        if ("content".equals(uri.getScheme()) && this.a.equals(uri.getAuthority())) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (arrayList.size() < 2) {
                return null;
            }
            try {
                return Directory.valueOf(((String) arrayList.remove(0)).toUpperCase()).getFile(getContext(), TextUtils.join(File.separator, arrayList));
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @NonNull
    public static Uri getUriForFile(@NonNull Context context, @NonNull File file) {
        return getUriForFile(context, Directory.ROOT, file.getPath());
    }

    @NonNull
    public static String guessMimeType(@NonNull Uri uri) {
        String mimeTypeFromExtension;
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        if (fileExtensionFromUrl != null) {
            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase());
            if (mimeTypeFromExtension == null && "json".equals(fileExtensionFromUrl)) {
                mimeTypeFromExtension = "application/json";
            }
        } else {
            mimeTypeFromExtension = null;
        }
        return mimeTypeFromExtension == null ? "application/octet-stream" : mimeTypeFromExtension;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("No delete supported");
    }

    @Override // android.content.ContentProvider
    @NonNull
    public String getType(@NonNull Uri uri) {
        return guessMimeType(uri);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        throw new UnsupportedOperationException("No insert supported");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.a = a(getContext());
        if (!ACRA.DEV_LOGGING) {
            return true;
        }
        ACRA.log.d(ACRA.LOG_TAG, "Registered content provider for authority " + this.a);
        return true;
    }

    @Override // android.content.ContentProvider
    @NonNull
    public ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        File fileB = b(uri);
        if (fileB == null || !fileB.exists()) {
            throw new FileNotFoundException("File represented by uri " + uri + " could not be found");
        }
        if (ACRA.DEV_LOGGING) {
            if (Build.VERSION.SDK_INT >= 19) {
                ACRA.log.d(ACRA.LOG_TAG, getCallingPackage() + " opened " + fileB.getPath());
            } else {
                ACRA.log.d(ACRA.LOG_TAG, fileB.getPath() + " was opened by an application");
            }
        }
        return ParcelFileDescriptor.open(fileB, 268435456);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "Query: " + uri);
        }
        File fileB = b(uri);
        if (fileB == null) {
            return null;
        }
        if (strArr == null) {
            strArr = b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str3 : strArr) {
            if (str3.equals("_display_name")) {
                linkedHashMap.put("_display_name", fileB.getName());
            } else if (str3.equals("_size")) {
                linkedHashMap.put("_size", Long.valueOf(fileB.length()));
            }
        }
        MatrixCursor matrixCursor = new MatrixCursor((String[]) linkedHashMap.keySet().toArray(new String[0]), 1);
        matrixCursor.addRow(linkedHashMap.values());
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("No update supported");
    }

    @NonNull
    public static Uri getUriForFile(@NonNull Context context, @NonNull Directory directory, @NonNull String str) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("content").authority(a(context)).appendPath(directory.name().toLowerCase());
        for (String str2 : str.split(Pattern.quote(File.separator))) {
            if (str2.length() > 0) {
                builderAppendPath.appendPath(str2);
            }
        }
        return builderAppendPath.build();
    }
}
