package com.huawei.wearengine.repository;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.huawei.wearengine.repository.api.ScopeInfoRepository;
import com.huawei.wearengine.scope.ScopeInfo;
import defpackage.ykm;
import defpackage.yko;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class ScopeInfoRepositoryImpl implements ScopeInfoRepository {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ykm f30778c;

    public ScopeInfoRepositoryImpl(Context context) {
        this.f30778c = new ykm(context, "tb_wear_engine_scope_info", yko.b());
    }

    @Override // com.huawei.wearengine.repository.api.ScopeInfoRepository
    public boolean insertScope(ScopeInfo scopeInfo, String str) {
        return this.f30778c.b(a(scopeInfo, str)) > 0;
    }

    @Override // com.huawei.wearengine.repository.api.ScopeInfoRepository
    public boolean deleteScope(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f30778c.e("app_Id =? ", new String[]{str}) > 0;
    }

    @Override // com.huawei.wearengine.repository.api.ScopeInfoRepository
    public List<ScopeInfo> getScopes(String str) {
        return a(this.f30778c.d("app_Id =? ", new String[]{str}, null, null, null));
    }

    @Override // com.huawei.wearengine.repository.api.ScopeInfoRepository
    public boolean updateScope(ScopeInfo scopeInfo, String str) {
        if (TextUtils.isEmpty(str) || scopeInfo == null) {
            return false;
        }
        deleteScope(str);
        return insertScope(scopeInfo, str);
    }

    private ContentValues a(ScopeInfo scopeInfo, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_Id", str);
        contentValues.put("name", scopeInfo.getName());
        contentValues.put("scope_Id", Integer.valueOf(scopeInfo.getId()));
        contentValues.put("uri", scopeInfo.getUri());
        contentValues.put("permissions", scopeInfo.getPermissionsString());
        return contentValues;
    }

    private List<ScopeInfo> a(Cursor cursor) {
        if (cursor == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(10);
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

    private ScopeInfo b(Cursor cursor) {
        ScopeInfo scopeInfo = new ScopeInfo();
        scopeInfo.setId(cursor.getInt(cursor.getColumnIndex("scope_Id")));
        scopeInfo.setName(cursor.getString(cursor.getColumnIndex("name")));
        scopeInfo.setUri(cursor.getString(cursor.getColumnIndex("uri")));
        scopeInfo.setPermissions(scopeInfo.getPermissionList(cursor.getString(cursor.getColumnIndex("permissions"))));
        return scopeInfo;
    }
}
