package com.huawei.route.utils;

import android.content.Context;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.xjl;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes15.dex */
public class RouteSourceUtils {
    private static final String DATE_FORMAT_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    public static final String MY_ROUTE_PATH = "route";
    public static final String RUNNING_ROUTE_ANALYSIS_1040087 = "1040087";
    public static final String RUNNING_ROUTE_ANALYSIS_1040088 = "1040088";
    public static final String RUNNING_ROUTE_ANALYSIS_1040120 = "1040120";
    private static final String TAG = "Track_RouteSourceUtils";
    public static final int TYPE_KOMOOT_ROUTE = 3;
    public static final int TYPE_LOCAL_ROUTE = 1;
    public static final int TYPE_MOTION_ROUTE = 2;
    private static final String UTC = "UTC";

    private RouteSourceUtils() {
    }

    public static String longTimeToString(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_PATTERN, Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date(j));
    }

    public static String getTrackFileName(Cursor cursor) {
        String string = "";
        if (cursor == null || cursor.getCount() == 0) {
            LogUtil.j(TAG, "file does not exist.");
            return "";
        }
        try {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex("_display_name");
            if (columnIndex == -1) {
                LogUtil.a(TAG, "display_name does not exist");
            } else {
                LogUtil.a(TAG, "display_name:", Integer.valueOf(columnIndex));
                string = cursor.getString(columnIndex);
            }
            if (TextUtils.isEmpty(string)) {
                LogUtil.a(TAG, "file name is empty,get from _data");
                int columnIndex2 = cursor.getColumnIndex("_data");
                if (columnIndex2 == -1) {
                    LogUtil.a(TAG, "_data column does not exist.");
                    return string;
                }
                String string2 = cursor.getString(columnIndex2);
                if (TextUtils.isEmpty(string2)) {
                    LogUtil.a(TAG, "path is empty");
                    return string;
                }
                string = string2.trim().substring(string2.lastIndexOf("/") + 1);
            }
            LogUtil.a(TAG, "fileName:", string);
            return string;
        } catch (CursorIndexOutOfBoundsException e) {
            ReleaseLogUtil.a(TAG, "cursorIndexOutOfBoundsException: ", e.getMessage());
            return "";
        } finally {
            cursor.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.os.ParcelFileDescriptor] */
    public static String parseFileCopyToRoutePath(Uri uri, String str) throws Throwable {
        Throwable th;
        ?? r8;
        Context contextB = BaseApplication.b();
        String str2 = (contextB.getFilesDir() + File.separator + MY_ROUTE_PATH + File.separator) + str;
        ?? A = 0;
        A = 0;
        A = 0;
        ?? r4 = 0;
        try {
            try {
                uri = contextB.getContentResolver().openFileDescriptor(uri, "r");
                try {
                    FileInputStream fileInputStream = new FileInputStream(uri.getFileDescriptor());
                    try {
                        File file = new File(str2);
                        A = xjl.a(file, file.getCanonicalPath());
                        if (A != 0) {
                            FileUtils.d(fileInputStream, file);
                        }
                        if (uri != 0) {
                            try {
                                uri.close();
                            } catch (IOException unused) {
                                uri = new Object[]{"parcelFileDescriptor IOException"};
                                LogUtil.e(TAG, (Object[]) uri);
                            }
                        }
                        try {
                            fileInputStream.close();
                        } catch (IOException unused2) {
                            uri = new Object[]{"fis IOException"};
                            LogUtil.e(TAG, (Object[]) uri);
                        }
                    } catch (IOException unused3) {
                        A = fileInputStream;
                        LogUtil.e(TAG, "IOException");
                        uri = uri;
                        if (uri != 0) {
                            try {
                                uri.close();
                                uri = uri;
                            } catch (IOException unused4) {
                                Object[] objArr = {"parcelFileDescriptor IOException"};
                                LogUtil.e(TAG, objArr);
                                uri = objArr;
                            }
                        }
                        if (A != 0) {
                            try {
                                A.close();
                            } catch (IOException unused5) {
                                uri = new Object[]{"fis IOException"};
                                LogUtil.e(TAG, (Object[]) uri);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        A = fileInputStream;
                        ?? r7 = A;
                        r4 = uri;
                        r8 = r7;
                        if (r4 != 0) {
                            try {
                                r4.close();
                            } catch (IOException unused6) {
                                LogUtil.e(TAG, "parcelFileDescriptor IOException");
                            }
                        }
                        if (r8 != 0) {
                            try {
                                r8.close();
                                throw th;
                            } catch (IOException unused7) {
                                LogUtil.e(TAG, "fis IOException");
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused8) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused9) {
            uri = 0;
        } catch (Throwable th4) {
            th = th4;
            r8 = 0;
            if (r4 != 0) {
                r4.close();
            }
            if (r8 != 0) {
                r8.close();
                throw th;
            }
            throw th;
        }
        return str2;
    }
}
