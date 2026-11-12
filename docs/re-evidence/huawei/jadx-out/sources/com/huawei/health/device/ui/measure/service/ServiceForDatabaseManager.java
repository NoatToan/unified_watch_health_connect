package com.huawei.health.device.ui.measure.service;

import android.content.Context;
import android.database.Cursor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.openservice.OpenServiceConstant;
import com.huawei.ui.openservice.db.model.ServiceTable;
import defpackage.dwg;
import defpackage.dwk;
import defpackage.dwm;
import defpackage.dxl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ServiceForDatabaseManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dwg f6410c;

    public ServiceForDatabaseManager(Context context) {
        this.f6410c = new dwg(context.getApplicationContext(), "service", dwm.a());
    }

    public List<dwk> c() {
        StringBuffer stringBuffer = new StringBuffer();
        int iD = dxl.d(System.currentTimeMillis());
        LogUtil.a("ServiceForDatabaseManager", "queryUserLegalService today is: ", Integer.valueOf(iD));
        stringBuffer.append("start_date <=? and end_date >=? and is_service_card =? ");
        String[] strArr = {Integer.toString(iD), Integer.toString(iD), Integer.toString(1)};
        LogUtil.a("ServiceForDatabaseManager", "queryUserLegalService sbSelector is: ", stringBuffer);
        return a(this.f6410c.d(stringBuffer.toString(), strArr, null, null, null));
    }

    private List<dwk> a(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor == null) {
            return arrayList;
        }
        while (cursor.moveToNext()) {
            try {
                arrayList.add(b(cursor));
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    private dwk b(Cursor cursor) {
        dwk dwkVar = new dwk();
        dwkVar.n(cursor.getString(cursor.getColumnIndex("service_id")));
        dwkVar.s(cursor.getString(cursor.getColumnIndex("service_type")));
        dwkVar.f(cursor.getString(cursor.getColumnIndex(ServiceTable.COLUMN_SERVICE_PRODUCT_NAME)));
        dwkVar.c(cursor.getString(cursor.getColumnIndex(ServiceTable.COLUMN_SERVICE_DESCRIPTION)));
        dwkVar.k(cursor.getString(cursor.getColumnIndex(ServiceTable.COLUMN_SERVICE_ICON)));
        dwkVar.d(cursor.getString(cursor.getColumnIndex(ServiceTable.COLUMN_HOME_PAGE_ICON)));
        dwkVar.m(cursor.getString(cursor.getColumnIndex(ServiceTable.COLUMN_SERVICE_PROVIDER)));
        dwkVar.r(cursor.getString(cursor.getColumnIndex(ServiceTable.COLUMN_SERVICE_URL)));
        dwkVar.j(cursor.getString(cursor.getColumnIndex(ServiceTable.COLUMN_SERVICE_REQUIRED_VERSION)));
        dwkVar.a(cursor.getInt(cursor.getColumnIndex(ServiceTable.COLUMN_SERVICE_HMS_AUTH)));
        dwkVar.a(cursor.getString(cursor.getColumnIndex(ServiceTable.COLUMN_SERVICE_AUTH_TYPE)));
        dwkVar.g(cursor.getInt(cursor.getColumnIndex("start_date")));
        dwkVar.c(cursor.getInt(cursor.getColumnIndex("end_date")));
        dwkVar.i(cursor.getInt(cursor.getColumnIndex(ServiceTable.COLUMN_SUB_POSITION)));
        dwkVar.e(cursor.getString(cursor.getColumnIndex(ServiceTable.COLUMN_SERVICE_APP_ID)));
        dwkVar.h(cursor.getString(cursor.getColumnIndex("label")));
        dwkVar.b(cursor.getInt(cursor.getColumnIndex(ServiceTable.COLUMN_IS_SERVICE_CARD)));
        dwkVar.e(cursor.getInt(cursor.getColumnIndex(ServiceTable.COLUMN_NEED_RECOMMEND)));
        dwkVar.d(cursor.getInt(cursor.getColumnIndex(ServiceTable.COLUMN_IS_PLUGIN)));
        dwkVar.g(cursor.getString(cursor.getColumnIndex(ServiceTable.COLUMN_PLUGIN_URL)));
        dwkVar.t(cursor.getString(cursor.getColumnIndex(ServiceTable.COLUMN_SERVICE_SOURCE)));
        dwkVar.o(cursor.getString(cursor.getColumnIndex(ServiceTable.COLUMN_SERVICE_DETAIL)));
        dwkVar.l(cursor.getString(cursor.getColumnIndex(ServiceTable.COLUMN_SERVICE_MID_ICON)));
        String string = cursor.getString(cursor.getColumnIndex(ServiceTable.COLUMN_SERVICE_KEEP_1));
        dwkVar.q(dxl.e(string, OpenServiceConstant.MAP_KEY_SERVICE_VERSION));
        dwkVar.b(dxl.e(string, OpenServiceConstant.MAP_KEY_DOWNLOAD_WEB_URL));
        dwkVar.i(dxl.e(string, "packageName"));
        return dwkVar;
    }
}
