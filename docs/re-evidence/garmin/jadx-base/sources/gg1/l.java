package gg1;

import android.database.Cursor;
import android.database.SQLException;
import com.garmin.android.apps.connectmobile.settings.DeviceSyncAuditViewer;

/* JADX INFO: loaded from: classes10.dex */
public class l extends g22.c<Void, wb2.m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DeviceSyncAuditViewer f77257c;

    public l(DeviceSyncAuditViewer deviceSyncAuditViewer) {
        this.f77257c = deviceSyncAuditViewer;
    }

    @Override // g22.c
    public final wb2.m b(Void[] voidArr) throws Throwable {
        Cursor cursorRawQuery;
        Thread.currentThread().setName("DeviceSyncAuditViewer");
        wb2.l lVar = this.f77257c.f41529o.f184059a;
        lVar.getClass();
        Cursor cursor = null;
        try {
            cursorRawQuery = lVar.f184057b.rawQuery("select * from device_sync_audit order by _id desc limit 1", null);
            if (cursorRawQuery != null) {
                try {
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            wb2.m mVarB = wb2.l.b(cursorRawQuery);
                            cursorRawQuery.close();
                            return mVarB;
                        }
                    } catch (SQLException e4) {
                        e = e4;
                        lVar.f184056a.error(".retrieveMostRecent()", (Throwable) e);
                        wb2.l.a(cursorRawQuery);
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursorRawQuery;
                    wb2.l.a(cursor);
                    throw th;
                }
            }
            wb2.l.a(cursorRawQuery);
            return null;
        } catch (SQLException e14) {
            e = e14;
            cursorRawQuery = null;
        } catch (Throwable th4) {
            th = th4;
            wb2.l.a(cursor);
            throw th;
        }
    }

    @Override // g22.c
    public final void d(wb2.m mVar) {
        DeviceSyncAuditViewer.ca(this.f77257c, mVar);
    }
}
