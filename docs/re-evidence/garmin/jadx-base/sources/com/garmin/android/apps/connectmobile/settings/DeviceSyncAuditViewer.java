package com.garmin.android.apps.connectmobile.settings;

import am.j;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import c22.h;
import com.garmin.android.apps.connectmobile.R;
import gg1.l;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import wb2.l0;
import wb2.m;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceSyncAuditViewer extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f41515a = new SimpleDateFormat("EEE, MMM d yyyy @ h:mm aa", Locale.US);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f41516b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f41517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f41518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f41519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f41520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f41521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageButton f41522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageButton f41523i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MenuItem f41524j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f41525k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f41526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f41527m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f41528n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l0 f41529o;

    public class a extends g22.c<Long, m> {
        public a() {
        }

        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0046: MOVE (r12 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:11:0x0045 */
        @Override // g22.c
        public final m b(Long[] lArr) throws Throwable {
            Throwable th3;
            Cursor cursorQuery;
            Cursor cursor;
            Thread.currentThread().setName("DeviceSyncAuditViewer");
            l0 l0Var = DeviceSyncAuditViewer.this.f41529o;
            long jLongValue = lArr[0].longValue();
            wb2.l lVar = l0Var.f184059a;
            lVar.getClass();
            Cursor cursor2 = null;
            try {
                try {
                    cursorQuery = lVar.f184057b.query("device_sync_audit", null, "_id=?", new String[]{String.valueOf(jLongValue)}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                m mVarB = wb2.l.b(cursorQuery);
                                cursorQuery.close();
                                return mVarB;
                            }
                        } catch (SQLException e4) {
                            e = e4;
                            lVar.f184056a.error(".retrieveByRowID(" + jLongValue + ")", (Throwable) e);
                            wb2.l.a(cursorQuery);
                            return null;
                        }
                    }
                    wb2.l.a(cursorQuery);
                    return null;
                } catch (Throwable th4) {
                    th3 = th4;
                    cursor2 = cursor;
                    wb2.l.a(cursor2);
                    throw th3;
                }
            } catch (SQLException e14) {
                e = e14;
                cursorQuery = null;
            } catch (Throwable th5) {
                th3 = th5;
                wb2.l.a(cursor2);
                throw th3;
            }
        }

        @Override // g22.c
        public final void d(m mVar) {
            DeviceSyncAuditViewer.ca(DeviceSyncAuditViewer.this, mVar);
        }
    }

    public static void ca(DeviceSyncAuditViewer deviceSyncAuditViewer, m mVar) {
        deviceSyncAuditViewer.getClass();
        boolean z14 = (mVar == null || TextUtils.isEmpty(mVar.f184062c)) ? false : true;
        boolean z15 = (mVar == null || TextUtils.isEmpty(mVar.f184060a)) ? false : true;
        if (mVar != null) {
            deviceSyncAuditViewer.f41516b = mVar;
            deviceSyncAuditViewer.f41517c.setText(String.format(deviceSyncAuditViewer.getString(R.string.square_bracket_pattern), String.valueOf(deviceSyncAuditViewer.f41516b.f184063d)));
            deviceSyncAuditViewer.f41518d.setText(DateUtils.formatDateTime(deviceSyncAuditViewer, deviceSyncAuditViewer.f41516b.f184064e, 524311));
            deviceSyncAuditViewer.f41519e.setText(deviceSyncAuditViewer.f41516b.f184062c);
            deviceSyncAuditViewer.f41520f.setText(deviceSyncAuditViewer.f41516b.f184060a);
            deviceSyncAuditViewer.f41521g.setText(deviceSyncAuditViewer.f41516b.f184061b);
        } else {
            Toast.makeText(deviceSyncAuditViewer, deviceSyncAuditViewer.getString(R.string.txt_empty_page_no_data), 0).show();
        }
        deviceSyncAuditViewer.f41525k.setVisibility(z14 ? 0 : 8);
        deviceSyncAuditViewer.f41526l.setVisibility(z15 ? 0 : 8);
        deviceSyncAuditViewer.f41522h.setEnabled(true);
        deviceSyncAuditViewer.f41523i.setEnabled(true);
        MenuItem menuItem = deviceSyncAuditViewer.f41524j;
        if (menuItem != null) {
            menuItem.setVisible(deviceSyncAuditViewer.f41516b != null);
        }
    }

    public static String da() {
        StringBuilder sb3 = new StringBuilder();
        f12.l.f68084a.getClass();
        sb3.append(f12.l.a.a().getUserName());
        sb3.append(" / ");
        sb3.append(((f12.b) KoinJavaComponent.get(f12.b.class)).getUserDisplayName());
        return sb3.toString();
    }

    public static void ea(String str, StringBuilder sb3) {
        sn.a.t(sb3, "---", str, "---", "\n");
    }

    public final void fa(boolean z14) {
        if (this.f41516b == null) {
            Toast.makeText(this, getString(R.string.txt_empty_page_no_data), 0).show();
            return;
        }
        this.f41522h.setEnabled(false);
        this.f41523i.setEnabled(false);
        m mVar = this.f41516b;
        long j8 = z14 ? mVar.f184063d + 1 : mVar.f184063d - 1;
        a aVar = new a();
        this.f41528n = aVar;
        aVar.c(Long.valueOf(j8));
    }

    public void onClickNext(View view2) {
        fa(true);
    }

    public void onClickPrevious(View view2) {
        fa(false);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_device_sync_audit);
        super.initActionBar(true, R.string.pref_device_sync_audit_title);
        ((TextView) findViewById(R.id.device_sync_audit_username_displayname)).setText(da());
        this.f41517c = (TextView) findViewById(R.id.device_sync_audit_row_id);
        this.f41518d = (TextView) findViewById(R.id.device_sync_audit_created_timestamp);
        this.f41519e = (TextView) findViewById(R.id.device_sync_audit_app_version);
        this.f41520f = (TextView) findViewById(R.id.device_sync_audit_device_info);
        this.f41521g = (TextView) findViewById(R.id.device_sync_audit_audit_text);
        this.f41522h = (ImageButton) findViewById(R.id.device_sync_audit_bttn_previous);
        this.f41523i = (ImageButton) findViewById(R.id.device_sync_audit_bttn_next);
        this.f41525k = findViewById(R.id.device_sync_audit_app_version_container);
        this.f41526l = findViewById(R.id.device_sync_audit_device_container);
        this.f41529o = new l0(getApplicationContext());
        l lVar = new l(this);
        this.f41527m = lVar;
        lVar.c(new Void[0]);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.device_sync_audit_viewer, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_share);
        this.f41524j = menuItemFindItem;
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(this.f41516b != null);
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_item_refresh) {
            l lVar = new l(this);
            this.f41527m = lVar;
            lVar.c(new Void[0]);
            return true;
        }
        if (menuItem.getItemId() != R.id.menu_item_share) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f41516b != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addFlags(1);
            intent.setType("message/rfc822");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
            StringBuilder sb3 = new StringBuilder(getString(R.string.pref_device_sync_audit_title));
            sb3.append(" [");
            f12.l.f68084a.getClass();
            sb3.append(f12.l.a.a().getUserName());
            sb3.append("]");
            intent.putExtra("android.intent.extra.SUBJECT", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            ea("Username / User Displayname", sb4);
            sb4.append(da());
            sb4.append("\n");
            sb4.append("\n");
            ea("GCM App Version", sb4);
            j.y(sb4, this.f41516b.f184062c, "\n", "\n");
            ea("Timestamp", sb4);
            sb4.append(this.f41515a.format(Long.valueOf(this.f41516b.f184064e)));
            sb4.append("\n");
            sb4.append("\n");
            ea("Garmin Device Info", sb4);
            j.y(sb4, this.f41516b.f184060a, "\n", "\n");
            ea("Android Device Info", sb4);
            for (String[] strArr : h.b()) {
                sb4.append(strArr[0]);
                sb4.append(": ");
                sb4.append(strArr[1]);
                sb4.append("\n");
            }
            sb4.append("\n");
            ea("Sync Info", sb4);
            sb4.append(this.f41516b.f184061b);
            intent.putExtra("android.intent.extra.TEXT", sb4.toString());
            startActivity(Intent.createChooser(intent, getText(R.string.pref_device_sync_audit_title)));
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        l lVar = this.f41527m;
        if (lVar != null) {
            lVar.a();
        }
        a aVar = this.f41528n;
        if (aVar != null) {
            aVar.a();
        }
    }
}
