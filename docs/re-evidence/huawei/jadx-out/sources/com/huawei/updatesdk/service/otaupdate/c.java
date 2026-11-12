package com.huawei.updatesdk.service.otaupdate;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public class c {

    public interface a {
        void a(Boolean bool);
    }

    static class b extends AsyncTask<Void, Void, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f29993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f29994b;

        public void a(String str) {
            this.f29994b = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            a aVar = this.f29993a;
            if (aVar != null) {
                aVar.a(bool);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            boolean z;
            String str = "AutoUpdateUtil";
            Cursor cursorQuery = null;
            boolean z2 = false;
            try {
                try {
                    cursorQuery = com.huawei.updatesdk.sdk.service.app.a.c().a().getContentResolver().query(Uri.parse(this.f29994b), null, null, null, null);
                    if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                        com.huawei.updatesdk.sdk.foundation.a.a("AutoUpdateUtil", "cursor = null");
                        str = str;
                    } else {
                        boolean z3 = Boolean.parseBoolean(cursorQuery.getString(cursorQuery.getColumnIndex("isagree")));
                        boolean z4 = Boolean.parseBoolean(cursorQuery.getString(cursorQuery.getColumnIndex("isopenautoupdate")));
                        z = Boolean.parseBoolean(cursorQuery.getString(cursorQuery.getColumnIndex("isneverreminder")));
                        if (z3 && !z4 && !z) {
                            z2 = true;
                            str = z;
                        }
                    }
                    str = z;
                    str = z;
                    str = z;
                } catch (Exception e) {
                    com.huawei.updatesdk.sdk.foundation.a.a(str, "query cursor error: " + e.getMessage());
                }
                return Boolean.valueOf(z2);
            } finally {
                com.huawei.updatesdk.service.util.d.a(cursorQuery);
            }
        }

        public b(a aVar) {
            this.f29993a = aVar;
        }
    }

    public void a(Context context, String str, a aVar, boolean z) {
        if (com.huawei.updatesdk.service.global.e.a(z).e(context) && f.c().e()) {
            String str2 = String.format(Locale.ROOT, "content://%s.commondata/item/4", str);
            if (com.huawei.updatesdk.service.util.d.a(context, Uri.parse(str2), str)) {
                b bVar = new b(aVar);
                try {
                    bVar.a(str2);
                    bVar.executeOnExecutor(com.huawei.updatesdk.service.store.c.f30005a, new Void[0]);
                    bVar.get(500L, TimeUnit.MILLISECONDS);
                    return;
                } catch (Exception e) {
                    bVar.cancel(true);
                    com.huawei.updatesdk.sdk.foundation.a.a("AutoUpdateUtil", "init AutoUpdateInfo error: " + e.getMessage());
                }
            }
        }
        aVar.a(Boolean.FALSE);
    }
}
