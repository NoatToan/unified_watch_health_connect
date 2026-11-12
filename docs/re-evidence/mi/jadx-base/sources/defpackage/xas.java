package defpackage;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes11.dex */
public class xas implements j7s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f38929b = "content://com.vivo.vms.IdProvider/IdentifierId/";
    public static String c = f38929b + "OAID";
    public static String d = f38929b + "VAID_";
    public static String e = f38929b + "AAID_";
    public static String f = f38929b + "OAIDSTATUS";
    public static String g = "persist.sys.identifierid.supported";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f38930a;

    public xas(Context context) {
        this.f38930a = context;
    }

    private String b(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        String string = null;
        try {
            cursorQuery = this.f38930a.getContentResolver().query(Uri.parse(str), null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToNext()) {
                        string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                    }
                    return string;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused2) {
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
        return string;
    }

    public static boolean c(Context context) {
        try {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(Uri.parse(f38929b).getAuthority(), 128);
            return (providerInfoResolveContentProvider == null || (providerInfoResolveContentProvider.applicationInfo.flags & 1) == 0) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.j7s
    /* JADX INFO: renamed from: a */
    public boolean mo66a() {
        return "1".equals(bdt.a(g, "0"));
    }

    @Override // defpackage.j7s
    public String a() {
        return b(c);
    }
}
