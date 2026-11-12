package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.OperationCanceledException;
import android.util.Base64;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes19.dex */
public class vwh {
    public static Drawable b(Context context, HiAppInfo hiAppInfo) {
        if (hiAppInfo.getAppName() != null && hiAppInfo.getAppName().startsWith("QuickApp_")) {
            return d(context, hiAppInfo.getPackageName());
        }
        return a(context, hiAppInfo.getPackageName());
    }

    public static Drawable a(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationIcon(str);
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.j("ThirdPartAuthUtil", "NameNotFoundException e = ", e.getMessage());
            return null;
        }
    }

    public static Drawable d(Context context, String str) throws Throwable {
        Bitmap bitmapE = e(context, str);
        if (bitmapE == null) {
            LogUtil.a("ThirdPartAuthUtil", "setQuickAppIcon, Icon not found");
            return a(context, Constants.FAST_APP_PKG);
        }
        return new BitmapDrawable(bitmapE);
    }

    public static void c(final Boolean bool) {
        LogUtil.a("ThirdPartAuthUtil", "save weight switch status ", bool);
        lsy.a(new Runnable() { // from class: vwi
            @Override // java.lang.Runnable
            public final void run() {
                vwh.a(bool);
            }
        });
    }

    static /* synthetic */ void a(Boolean bool) {
        String str = bool.booleanValue() ? "1" : "0";
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("custom.weight_auto_update_status");
        hiUserPreference.setValue(str);
        HiHealthManager.d(BaseApplication.getContext()).setUserPreference(hiUserPreference);
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(10026);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(com.huawei.haf.application.BaseApplication.b()).synCloud(hiSyncOption, null);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public static Bitmap e(Context context, String str) throws Throwable {
        Cursor cursorQuery;
        ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
        ?? r8 = 0;
        bitmapDecodeByteArray = null;
        bitmapDecodeByteArray = null;
        bitmapDecodeByteArray = null;
        Bitmap bitmapDecodeByteArray = null;
        try {
            try {
                cursorQuery = contentResolver.query(Uri.parse("content://com.huawei.fastapp.provider.open/packageRecordList"), null, null, null, null);
                try {
                    if (cursorQuery == null) {
                        LogUtil.e("ThirdPartAuthUtil", "getQuickAppIcon， null cursor");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    while (cursorQuery.moveToNext()) {
                        int columnIndex = cursorQuery.getColumnIndex("app_package_name");
                        int columnIndex2 = cursorQuery.getColumnIndex("app_icon_process");
                        String string = cursorQuery.getString(columnIndex);
                        if (string == null) {
                            break;
                        }
                        if (string.equals(str)) {
                            String string2 = cursorQuery.getString(columnIndex2);
                            if (string2 == null) {
                                LogUtil.e("ThirdPartAuthUtil", "getQuickAppIcon icon Content is null");
                                break;
                            }
                            byte[] bArrDecode = Base64.decode(string2, 0);
                            if (bArrDecode != null) {
                                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                                break;
                            }
                            break;
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return bitmapDecodeByteArray;
                } catch (OperationCanceledException unused) {
                    LogUtil.e("ThirdPartAuthUtil", "getQuickAppIcon, query exception");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                } catch (IllegalArgumentException unused2) {
                    LogUtil.e("ThirdPartAuthUtil", "getQuickAppIcon decode icon exception");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                } catch (Exception unused3) {
                    LogUtil.e("ThirdPartAuthUtil", "getQuickAppIcon unknown exception");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r8 = contentResolver;
                if (r8 != 0) {
                    r8.close();
                }
                throw th;
            }
        } catch (OperationCanceledException unused4) {
            cursorQuery = null;
        } catch (IllegalArgumentException unused5) {
            cursorQuery = null;
        } catch (Exception unused6) {
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r8 != 0) {
                r8.close();
            }
            throw th;
        }
    }
}
