package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hmf.tasks.TaskCompletionSource;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class bhx {
    private static boolean d(Context context, Uri uri, String str) {
        if (uri != null && !TextUtils.isEmpty(str)) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(uri.getAuthority(), 0);
            if (providerInfoResolveContentProvider != null) {
                ApplicationInfo applicationInfo = providerInfoResolveContentProvider.applicationInfo;
                if (applicationInfo == null || !TextUtils.equals(str, applicationInfo.packageName)) {
                    return false;
                }
                Log.i("MarketHomeCountryByProvider", "valid provider uri = " + uri);
                return true;
            }
            Log.w("MarketHomeCountryByProvider", "isProviderValid, invalid provider: " + uri);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0080 A[Catch: all -> 0x007e, Exception -> 0x00ab, TRY_LEAVE, TryCatch #9 {Exception -> 0x00ab, all -> 0x007e, blocks: (B:5:0x001c, B:7:0x0022, B:9:0x002e, B:17:0x0056, B:19:0x006b, B:20:0x007a, B:23:0x0080), top: B:64:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:58:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[SYNTHETIC] */
    private static void b(TaskCompletionSource<String> taskCompletionSource, Context context, String str, String str2) throws Throwable {
        Throwable th;
        Uri uri = Uri.parse(str);
        Cursor cursor = null;
        CharSequence charSequence = null;
        String string = null;
        cursor = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, null, str2, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        string = cursorQuery.getString(cursorQuery.getColumnIndex("homecountry"));
                        if (string == null) {
                            Log.w("MarketHomeCountryByProvider", "by provider get homeCountry is null");
                            taskCompletionSource.setException(new Exception("get homeCountry by provider is null"));
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (Exception unused) {
                                    Log.e("MarketHomeCountryByProvider", "close cursor exception");
                                    taskCompletionSource.setException(new Exception("close cursor exception"));
                                }
                            }
                            if (!TextUtils.isEmpty(string)) {
                                return;
                            }
                        } else {
                            bib.b(context).e(string);
                            bib.b(context).c(string);
                            if (cursorQuery.getColumnIndex("effectiveduration") == 1) {
                                bib.b(context).d(cursorQuery.getLong(cursorQuery.getColumnIndex("effectiveduration")));
                            }
                            taskCompletionSource.setResult(string);
                        }
                    } else {
                        Log.e("MarketHomeCountryByProvider", "cursor = null");
                        taskCompletionSource.setException(new Exception("cursor is null"));
                    }
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Exception unused2) {
                            Log.e("MarketHomeCountryByProvider", "close cursor exception");
                            taskCompletionSource.setException(new Exception("close cursor exception"));
                        }
                    }
                    if (!TextUtils.isEmpty(string)) {
                        return;
                    }
                } catch (Exception unused3) {
                    cursor = cursorQuery;
                    try {
                        Log.e("MarketHomeCountryByProvider", "query cursor exception");
                        taskCompletionSource.setException(new Exception("query cursor exception"));
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused4) {
                                Log.e("MarketHomeCountryByProvider", "close cursor exception");
                                taskCompletionSource.setException(new Exception("close cursor exception"));
                            }
                        }
                        if (!TextUtils.isEmpty(0)) {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused5) {
                                Log.e("MarketHomeCountryByProvider", "close cursor exception");
                                taskCompletionSource.setException(new Exception("close cursor exception"));
                            }
                        }
                        if (TextUtils.isEmpty(charSequence)) {
                            throw th;
                        }
                        c(context);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    charSequence = null;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (TextUtils.isEmpty(charSequence)) {
                        throw th;
                    }
                    c(context);
                    throw th;
                }
            } else {
                Log.e("MarketHomeCountryByProvider", "cursor = null");
                taskCompletionSource.setException(new Exception("cursor is null"));
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!TextUtils.isEmpty(string)) {
                    return;
                }
            }
        } catch (Exception unused6) {
        } catch (Throwable th4) {
            th = th4;
            charSequence = null;
        }
        c(context);
    }

    public static void a(TaskCompletionSource<String> taskCompletionSource, Context context, String str) throws Throwable {
        Exception exc;
        String strB = bia.b(context);
        if (strB == null) {
            Log.w("MarketHomeCountryByProvider", "get verify market package name is null");
            c(context);
            exc = new Exception("get verify market package name is null");
        } else {
            String str2 = String.format(Locale.ROOT, "content://%s.commondata/item/1", strB);
            if (d(context, Uri.parse(str2), strB)) {
                b(taskCompletionSource, context, str2, str);
                return;
            } else {
                Log.w("MarketHomeCountryByProvider", "homeCountry uri is invalid");
                c(context);
                exc = new Exception("homeCountry uri is invalid");
            }
        }
        taskCompletionSource.setException(exc);
    }

    private static void c(Context context) {
        bib.b(context).e(null);
        bib.b(context).c();
    }
}
