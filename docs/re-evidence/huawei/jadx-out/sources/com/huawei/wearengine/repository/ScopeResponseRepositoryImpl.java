package com.huawei.wearengine.repository;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.huawei.wearengine.repository.api.ScopeInfoRepository;
import com.huawei.wearengine.repository.api.ScopeResponseRepository;
import com.huawei.wearengine.scope.ScopeInfo;
import com.huawei.wearengine.scope.ScopeInfoResponse;
import defpackage.ykm;
import defpackage.ykp;
import java.util.Iterator;

/* JADX INFO: loaded from: classes20.dex */
public class ScopeResponseRepositoryImpl implements ScopeResponseRepository {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ScopeInfoRepository f30779b;
    private ykm e;

    public ScopeResponseRepositoryImpl(Context context) {
        this.e = new ykm(context, "tb_wear_engine_scope_response", ykp.c());
        this.f30779b = new ScopeInfoRepositoryImpl(context);
    }

    @Override // com.huawei.wearengine.repository.api.ScopeResponseRepository
    public boolean insertScopeResponse(ScopeInfoResponse scopeInfoResponse, String str) {
        if (scopeInfoResponse == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (getScopeResponse(str) != null) {
            deleteScopeResponse(str);
        }
        Iterator<ScopeInfo> it = scopeInfoResponse.getScopes().iterator();
        while (it.hasNext()) {
            this.f30779b.insertScope(it.next(), str);
        }
        return this.e.b(d(scopeInfoResponse, str)) > 0;
    }

    @Override // com.huawei.wearengine.repository.api.ScopeResponseRepository
    public boolean deleteScopeResponse(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.e.e("app_Id =? ", new String[]{str}) > 0 && this.f30779b.deleteScope(str);
    }

    @Override // com.huawei.wearengine.repository.api.ScopeResponseRepository
    public ScopeInfoResponse getScopeResponse(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ScopeInfoResponse scopeInfoResponseA = a(this.e.d("app_Id =? ", new String[]{str}, null, null, null));
        if (scopeInfoResponseA == null) {
            return null;
        }
        scopeInfoResponseA.setScopes(this.f30779b.getScopes(str));
        return scopeInfoResponseA;
    }

    @Override // com.huawei.wearengine.repository.api.ScopeResponseRepository
    public boolean updateScopeResponse(ScopeInfoResponse scopeInfoResponse, String str) {
        return this.e.b(d(scopeInfoResponse, str), "app_Id =? ", new String[]{str}) > 0;
    }

    private ContentValues d(ScopeInfoResponse scopeInfoResponse, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_Id", str);
        contentValues.put("cert_finger_print", scopeInfoResponse.getCertFingerprint());
        contentValues.put("cert_finger_print_extra", scopeInfoResponse.getCertFingerprintExtra());
        contentValues.put("expire_time", Long.valueOf(scopeInfoResponse.getExpireTime()));
        contentValues.put("failure_expire_time", Long.valueOf(scopeInfoResponse.getFailureExpireTime()));
        contentValues.put("vender_code", scopeInfoResponse.getVenderCode());
        contentValues.put("time_stamp", Long.valueOf(scopeInfoResponse.getTimeStamp()));
        return contentValues;
    }

    private ScopeInfoResponse a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            return cursor.moveToNext() ? c(cursor) : null;
        } finally {
            cursor.close();
        }
    }

    private ScopeInfoResponse c(Cursor cursor) {
        ScopeInfoResponse scopeInfoResponse = new ScopeInfoResponse();
        scopeInfoResponse.setCertFingerprint(cursor.getString(cursor.getColumnIndex("cert_finger_print")));
        scopeInfoResponse.setCertFingerprintExtra(cursor.getString(cursor.getColumnIndex("cert_finger_print_extra")));
        scopeInfoResponse.setExpireTime(cursor.getInt(cursor.getColumnIndex("expire_time")));
        scopeInfoResponse.setVenderCode(cursor.getString(cursor.getColumnIndex("vender_code")));
        scopeInfoResponse.setFailureExpireTime(cursor.getInt(cursor.getColumnIndex("failure_expire_time")));
        scopeInfoResponse.setTimeStamp(cursor.getLong(cursor.getColumnIndex("time_stamp")));
        return scopeInfoResponse;
    }
}
