package kg;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
public class d implements ig.a {
    @Override // ig.a
    public final String a(Context context) throws Throwable {
        Context context2;
        Throwable th3;
        Exception exc;
        String str;
        Cursor cursorQuery;
        boolean zC;
        String str2;
        Cursor cursor = null;
        str = null;
        str = null;
        String str3 = null;
        cursor = null;
        if (context != null) {
            try {
                if (tg.b.f164477a == null) {
                    Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", null);
                    tg.b.f164477a = method;
                    method.setAccessible(true);
                }
                context2 = (Context) tg.b.f164477a.invoke(null, null);
            } catch (Exception e4) {
                e4.toString();
                context2 = null;
            }
            if (context2 == null ? false : tg.f.b().c(context2, false)) {
                tg.f fVarB = tg.f.b();
                Context applicationContext = context.getApplicationContext();
                tg.a aVar = fVarB.f164485b;
                if (aVar == null) {
                    return null;
                }
                if (aVar.f164474a > System.currentTimeMillis()) {
                    return aVar.f164475b;
                }
                if (!fVarB.c(applicationContext, true)) {
                    return null;
                }
                try {
                    try {
                        cursorQuery = applicationContext.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{aVar.f164476c}, null);
                        try {
                            if (cursorQuery != null) {
                                tg.d dVarA = tg.f.a(cursorQuery);
                                str3 = dVarA.f164480a;
                                aVar.f164475b = str3;
                                aVar.f164474a = dVarA.f164482c;
                                if (dVarA.f164481b != 1000) {
                                    fVarB.d(applicationContext);
                                    if (!fVarB.c(applicationContext, false)) {
                                        zC = fVarB.c(applicationContext, true);
                                        str2 = "not support, forceQuery isSupported: ";
                                        str2.concat(String.valueOf(zC));
                                    }
                                }
                            } else if (fVarB.c(applicationContext, false)) {
                                zC = fVarB.c(applicationContext, true);
                                str2 = "forceQuery isSupported : ";
                                str2.concat(String.valueOf(zC));
                            }
                            if (cursorQuery == null) {
                                return str3;
                            }
                        } catch (Exception e14) {
                            exc = e14;
                            str = str3;
                            cursor = cursorQuery;
                            exc.getMessage();
                            if (cursor == null) {
                                return str;
                            }
                            cursorQuery = cursor;
                            str3 = str;
                        } catch (Throwable th4) {
                            th3 = th4;
                            cursor = cursorQuery;
                            if (cursor == null) {
                                throw th3;
                            }
                            cursor.close();
                            throw th3;
                        }
                    } catch (Exception e15) {
                        exc = e15;
                        str = null;
                    }
                    cursorQuery.close();
                    return str3;
                } catch (Throwable th5) {
                    th3 = th5;
                }
            }
        }
        return null;
    }
}
