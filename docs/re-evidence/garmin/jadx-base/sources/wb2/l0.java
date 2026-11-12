package wb2;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f184059a;

    public l0(Context context) {
        if (l.f184055c == null) {
            l.d(context);
        }
        this.f184059a = l.f184055c;
    }

    public final ArrayList a() throws Throwable {
        Cursor cursorQuery;
        l lVar = this.f184059a;
        lVar.getClass();
        Cursor cursor = null;
        try {
            cursorQuery = lVar.f184057b.query("device_sync_audit", null, null, null, null, null, null, Long.toString(100L));
            if (cursorQuery != null) {
                try {
                    try {
                        ArrayList arrayListC = l.c(cursorQuery);
                        cursorQuery.close();
                        return arrayListC;
                    } catch (SQLException e4) {
                        e = e4;
                        lVar.f184056a.error(".retrieveMostRecent()", (Throwable) e);
                        l.a(cursorQuery);
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursorQuery;
                    l.a(cursor);
                    throw th;
                }
            }
        } catch (SQLException e14) {
            e = e14;
            cursorQuery = null;
        } catch (Throwable th4) {
            th = th4;
            l.a(cursor);
            throw th;
        }
        l.a(cursorQuery);
        return null;
    }
}
