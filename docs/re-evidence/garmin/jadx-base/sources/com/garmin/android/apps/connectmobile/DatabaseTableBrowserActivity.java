package com.garmin.android.apps.connectmobile;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import com.garmin.android.gncs.persistence.GNCSNotificationDatabase;
import com.garmin.android.library.connectdatabase.ConnectDatabase;
import java.nio.charset.StandardCharsets;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class DatabaseTableBrowserActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StringBuilder f28654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f28655e;

    public class a {
        public a() {
        }

        @JavascriptInterface
        public void performClickDevicesColumn_ediv(String str) {
            long j8 = Long.parseLong(str);
            DatabaseTableBrowserActivity databaseTableBrowserActivity = DatabaseTableBrowserActivity.this;
            databaseTableBrowserActivity.getClass();
            rd2.f.a().f152047c.getClass();
            String[] strArr = {String.valueOf(j8)};
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("gble_ediv", new byte[]{-1, -1});
            int iUpdate = rd2.a.b().update("devices", contentValues, "unit_id=?", strArr);
            rd2.i.e(iUpdate);
            Toast.makeText(databaseTableBrowserActivity, com.nimbusds.jose.shaded.gson.internal.a.g(j8, "ediv value for unit ID [", "].", new StringBuilder(iUpdate > 0 ? "Successfully invalidated " : "Failed to invalidate ")), 1).show();
        }

        @JavascriptInterface
        public void performClickRemoveDevice(String str) {
            long j8 = Long.parseLong(str);
            DatabaseTableBrowserActivity databaseTableBrowserActivity = DatabaseTableBrowserActivity.this;
            databaseTableBrowserActivity.getClass();
            if (c22.u1.a(j8) == null) {
                c22.u1.b(j8);
            }
            String str2 = j8 + "";
            new androidx.appcompat.app.e.a(databaseTableBrowserActivity).setTitle(R.string.device_action_remove_device).setMessage(databaseTableBrowserActivity.getResources().getString(R.string.device_action_remove_device_confirm, str2)).setPositiveButton(databaseTableBrowserActivity.getResources().getText(android.R.string.yes), new z0(databaseTableBrowserActivity, j8, str2)).setNegativeButton(databaseTableBrowserActivity.getResources().getText(android.R.string.no), new x0(databaseTableBrowserActivity)).show();
        }
    }

    public final void ca(Cursor cursor) {
        this.f28654d.append("<tr class='tbl_header'>");
        if (this.f28652b.equals("devices")) {
            StringBuilder sb3 = this.f28654d;
            sb3.append("<td>");
            sb3.append(getResources().getString(R.string.device_action_remove_device));
            sb3.append("&#63;</td>");
        }
        for (String str : cursor.getColumnNames()) {
            StringBuilder sb4 = this.f28654d;
            sb4.append("<td>");
            sb4.append(str);
            sb4.append("</td>");
        }
        this.f28654d.append("</tr>");
    }

    public final void da(Cursor cursor) {
        String string;
        this.f28651a = !this.f28651a;
        StringBuilder sb3 = this.f28654d;
        sb3.append("<tr class='");
        sb3.append(this.f28651a ? "tbl_row_even" : "tbl_row_odd");
        sb3.append("'>");
        if (this.f28652b.equals("devices")) {
            string = cursor.getString(cursor.getColumnIndex("unit_id"));
            am.j.y(this.f28654d, "<td onclick=\"myJSInterface.performClickRemoveDevice('", string, "');\">");
            StringBuilder sb4 = this.f28654d;
            sb4.append("<u>");
            sb4.append(getResources().getString(R.string.lbl_remove));
            sb4.append("</u>");
            this.f28654d.append("</td>");
        } else {
            string = null;
        }
        for (int i14 = 0; i14 < cursor.getColumnCount(); i14++) {
            if (cursor.isNull(i14)) {
                this.f28654d.append("<td>[null]</td>");
            } else {
                String columnName = cursor.getColumnName(i14);
                if (this.f28652b.equals("devices") && "gble_ediv".equals(columnName)) {
                    am.j.y(this.f28654d, "<td onclick=\"myJSInterface.performClickDevicesColumn_ediv('", string, "');\">");
                    this.f28654d.append("not null (BLOB) press me");
                    this.f28654d.append("</td>");
                } else {
                    this.f28654d.append("<td>");
                    columnName.getClass();
                    switch (columnName) {
                        case "last_connected_timestamp":
                        case "saved_timestamp":
                            this.f28654d.append(c22.f3.f23055b.format(new Date(cursor.getLong(i14))) + "");
                            break;
                        case "image_data":
                        case "binary":
                        case "garmin_device_xml":
                        case "gble_ltk":
                        case "unl_data":
                        case "gma_data":
                        case "gble_rand":
                            byte[] blob = cursor.getBlob(cursor.getColumnIndex(columnName));
                            StringBuilder sb5 = this.f28654d;
                            sb5.append("BLOB: ");
                            sb5.append(blob.length);
                            sb5.append(" bytes");
                            break;
                        default:
                            this.f28654d.append(cursor.getString(i14));
                            break;
                    }
                    this.f28654d.append("</td>");
                }
            }
        }
        this.f28654d.append("</tr>");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0113  */
    /* JADX WARN: Code duplicated, block: B:39:0x011a  */
    public final void ea() throws Throwable {
        boolean z14;
        Cursor cursorQuery;
        StringBuilder sb3 = new StringBuilder(4800);
        this.f28654d = sb3;
        sb3.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
        this.f28654d.append("<html><head>\n");
        this.f28654d.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
        this.f28654d.append("<style type='text/css'>\n");
        this.f28654d.append("  body {font-weight:normal;font-style:normal;margin:2px;}\n");
        this.f28654d.append("  .tbl_header {font-weight:normal;background-color:#D8D8D8;}\n");
        this.f28654d.append("  .tbl_row_even {background-color:#FFFFFF;}\n");
        this.f28654d.append("  .tbl_row_odd {background-color:#E8E8E8;}\n");
        this.f28654d.append("</style>\n");
        this.f28654d.append("</head><body>\n");
        Cursor cursor = null;
        boolean z15 = false;
        try {
            if (this.f28653c.equals("connect")) {
                cursorQuery = ConnectDatabase.g().query("select * from " + this.f28652b, (Object[]) null);
            } else if (this.f28653c.equals(GNCSNotificationDatabase.DATABASE_NAME)) {
                cursorQuery = GNCSNotificationDatabase.getInstance().query("select * from " + this.f28652b, (Object[]) null);
            } else {
                cursorQuery = qd2.a.b().f144484a.query(this.f28652b, null, null, null, null, null, null);
            }
            cursor = cursorQuery;
            z14 = true;
            if (cursor.moveToFirst()) {
                try {
                    try {
                        this.f28654d.append("<table bgcolor='#000000' border='0' cellpadding='3' cellspacing='1' width='100%'>");
                        ca(cursor);
                        do {
                            da(cursor);
                        } while (cursor.moveToNext());
                        this.f28654d.append("</table>");
                    } catch (SQLException e4) {
                        e = e4;
                        i2.g(e, "DatabaseTableBrowserActivity");
                        if (z14) {
                            this.f28654d.append("</table>");
                        }
                        if (cursor != null) {
                        }
                        this.f28654d.append("\n</body></html>");
                        this.f28655e.loadData(Base64.encodeToString(this.f28654d.toString().getBytes(StandardCharsets.UTF_8), 0), "text/html; charset=utf-8", "base64");
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z15 = z14;
                    if (z15) {
                        this.f28654d.append("</table>");
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } else {
                Toast.makeText(this, "No database records.", 1).show();
            }
        } catch (SQLException e14) {
            e = e14;
            z14 = false;
        } catch (Throwable th4) {
            th = th4;
            if (z15) {
                this.f28654d.append("</table>");
            }
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        cursor.close();
        this.f28654d.append("\n</body></html>");
        this.f28655e.loadData(Base64.encodeToString(this.f28654d.toString().getBytes(StandardCharsets.UTF_8), 0), "text/html; charset=utf-8", "base64");
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f28653c = getIntent().getStringExtra("databaseName");
        this.f28652b = getIntent().getStringExtra("tableName");
        setContentView(R.layout.gcm_database_table_browser);
        super.initActionBar(true, this.f28653c);
        setSubtitle(this.f28652b);
        WebView webView = (WebView) findViewById(R.id.browser_view);
        this.f28655e = webView;
        webView.setBackgroundColor(0);
        this.f28655e.clearHistory();
        this.f28655e.clearCache(true);
        WebSettings settings = this.f28655e.getSettings();
        if (settings != null) {
            settings.setDefaultFontSize(10);
            settings.setDefaultFixedFontSize(10);
            settings.setFixedFontFamily("monospace");
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            settings.setJavaScriptEnabled(true);
        }
        this.f28655e.addJavascriptInterface(new a(), "myJSInterface");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.database_viewer_menu, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) throws Throwable {
        if (menuItem.getItemId() != 16908332) {
            ea();
            return true;
        }
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() throws Throwable {
        super.onResume();
        ea();
    }
}
