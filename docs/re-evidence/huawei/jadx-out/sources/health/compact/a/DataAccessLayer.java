package health.compact.a;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.util.Log;
import com.huawei.pluginachievement.manager.model.MedalConstants;

/* JADX INFO: loaded from: classes2.dex */
public class DataAccessLayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f36529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f36530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f36531c = {MedalConstants.EVENT_KEY, "value"};
    private static Uri d;

    static {
        String strH = CommonUtils.h(".version.provider");
        f36530b = strH;
        f36529a = "content://" + strH + "/";
        b();
    }

    private DataAccessLayer() {
    }

    private static void b() {
        d = a("module_200007_keyvaldb");
    }

    public static boolean c(Context context) throws Throwable {
        if (context == null) {
            Log.w("LogUtil_DataAccessLayer", "context is null");
            return false;
        }
        String strA = a(context, "have_cloud_or_not");
        Log.i("LogUtil_DataAccessLayer", "getValue(KEY_UI_ID_IS_OVERSEA_OR_NOT): " + strA);
        if ("1".equalsIgnoreCase(strA)) {
            Log.i("LogUtil_DataAccessLayer", "getOverseaFlagFromDB false");
            return false;
        }
        Log.i("LogUtil_DataAccessLayer", "getOverseaFlagFromDB true");
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    private static String a(Context context, String str) throws Throwable {
        Cursor cursorQuery;
        ?? r1 = 0;
        if (str == null) {
            Log.w("LogUtil_DataAccessLayer", "getValue null");
            return null;
        }
        try {
            try {
                cursorQuery = context.getContentResolver().query(d, f36531c, "key = ?", new String[]{str}, null);
                try {
                    if (cursorQuery == null) {
                        Log.w("LogUtil_DataAccessLayer", "cursor == null, return null");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(1);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return string;
                    }
                    Log.w("LogUtil_DataAccessLayer", "cursor moveToFirst failed, return null");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                } catch (SQLException unused) {
                    Log.e("LogUtil_DataAccessLayer", "queryStorage error");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                } catch (Exception unused2) {
                    Log.e("LogUtil_DataAccessLayer", "catch CursorWindowAllocationException");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                r1 = context;
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLException unused3) {
            cursorQuery = null;
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    private static Uri a(String str) {
        return Uri.parse(new StringBuffer().append(f36529a).append(str).toString());
    }
}
