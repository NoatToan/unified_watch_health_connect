package com.huawei.wearengine.repository;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.LruCache;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.wearengine.auth.AuthInfo;
import com.huawei.wearengine.repository.api.AuthInfoRepository;
import defpackage.yit;
import defpackage.yiv;
import defpackage.ykk;
import defpackage.ykm;
import defpackage.yln;
import defpackage.ylu;
import defpackage.ylv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class AuthInfoRepositoryImpl implements AuthInfoRepository {
    private static final int APPID_INDEX = 2;
    private static final int APPUID_INDEX = 0;
    private static final int CACHE_SIZE = 5;
    private static final String TAG = "AuthInfoRepositoryImpl";
    private static final int THREE_LENGTH = 3;
    private static final int USERID_INDEX = 1;
    private LruCache<String, List<AuthInfo>> authInfoCache = new LruCache<>(5);
    private Context mContext;
    private ykm mDbCommon;

    public AuthInfoRepositoryImpl(Context context) {
        this.mContext = context;
        this.mDbCommon = new ykm(context, "tb_wear_engine_auth_info", ykk.c());
    }

    @Override // com.huawei.wearengine.repository.api.AuthInfoRepository
    public boolean insertAuth(AuthInfo authInfo) {
        ContentValues contentValuesBuildAuthInfoContentValues = buildAuthInfoContentValues(authInfo);
        if (contentValuesBuildAuthInfoContentValues == null) {
            return false;
        }
        yit.a(TAG, "insertAuth contentValues:" + contentValuesBuildAuthInfoContentValues.toString());
        return this.mDbCommon.b(contentValuesBuildAuthInfoContentValues) > 0;
    }

    @Override // com.huawei.wearengine.repository.api.AuthInfoRepository
    public boolean deleteAuth(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.mDbCommon.e("key =? ", new String[]{str}) > 0;
    }

    @Override // com.huawei.wearengine.repository.api.AuthInfoRepository
    public boolean deleteAuth(int i, String str, int i2) {
        yit.a(TAG, "deleteAuth userId: " + str);
        yit.a(TAG, "deleteAuth appId: " + i2);
        yit.a(TAG, "deleteAuth appUid: " + i);
        return this.mDbCommon.e(getAuthSqlSelection(), getAuthSqlSelectionArgs(i, str, i2)) > 0;
    }

    @Override // com.huawei.wearengine.repository.api.AuthInfoRepository
    public void deleteAuthFromCache(String str) {
        yit.a(TAG, "deleteAuthFromCache packageName: " + str);
        Context contextA = yiv.a();
        String keyByParams = getKeyByParams(yln.b(contextA, str), yln.c(contextA), yln.j(contextA, str));
        yit.a(TAG, "deleteAuthFromCache with key: " + keyByParams);
        this.authInfoCache.remove(keyByParams);
    }

    @Override // com.huawei.wearengine.repository.api.AuthInfoRepository
    public void updateCache(String str) {
        yit.a(TAG, "updateCache packageName: " + str);
        Context contextA = yiv.a();
        int iB = yln.b(contextA, str);
        String strC = yln.c(contextA);
        int iJ = yln.j(contextA, str);
        String keyByParams = getKeyByParams(iB, strC, iJ);
        yit.a(TAG, "updateCache with key: " + keyByParams);
        this.authInfoCache.put(keyByParams, getAuthFromDataBase(iB, strC, iJ));
    }

    @Override // com.huawei.wearengine.repository.api.AuthInfoRepository
    public List<AuthInfo> getAuth(int i, String str, int i2) {
        yit.a(TAG, "getAuth appUid: " + i);
        yit.a(TAG, "getAuth userId: " + str);
        yit.a(TAG, "getAuth appId: " + i2);
        List<AuthInfo> list = this.authInfoCache.get(getKeyByParams(i, str, i2));
        if (list != null && list.size() > 0) {
            return list;
        }
        List<AuthInfo> authFromDataBase = getAuthFromDataBase(i, str, i2);
        this.authInfoCache.put(getKeyByParams(i, str, i2), authFromDataBase);
        return authFromDataBase;
    }

    private String getKeyByParams(int i, String str, int i2) {
        return i + str + i2;
    }

    private List<AuthInfo> getAuthFromDataBase(int i, String str, int i2) {
        yit.a(TAG, "getAuthFromDataBase");
        return parseAuthInfo(this.mContext, this.mDbCommon.d(getAuthSqlSelection(), getAuthSqlSelectionArgs(i, str, i2), null, null, null));
    }

    private String getAuthSqlSelection() {
        yit.a(TAG, "sbSelector: app_uid =?  and user_id =?  and app_id =? ");
        return "app_uid =?  and user_id =?  and app_id =? ";
    }

    private String[] getAuthSqlSelectionArgs(int i, String str, int i2) {
        String[] strArr = {String.valueOf(i), str, String.valueOf(i2)};
        yit.a(TAG, "selectAgs: " + Arrays.toString(strArr));
        return strArr;
    }

    @Override // com.huawei.wearengine.repository.api.AuthInfoRepository
    public boolean updateAuth(AuthInfo authInfo) {
        if (authInfo == null) {
            return false;
        }
        yit.a(TAG, "updateAuth authInfo: " + authInfo.toString());
        String[] strArr = {authInfo.getKey()};
        List<AuthInfo> authInfo2 = parseAuthInfo(this.mContext, this.mDbCommon.d("key =? ", strArr, null, null, null));
        ContentValues contentValuesBuildAuthInfoContentValues = buildAuthInfoContentValues(authInfo);
        if (contentValuesBuildAuthInfoContentValues == null) {
            return false;
        }
        if (authInfo2.isEmpty()) {
            yit.a(TAG, "updateAuth insert contentValues:" + contentValuesBuildAuthInfoContentValues.toString());
            return this.mDbCommon.b(contentValuesBuildAuthInfoContentValues) > 0;
        }
        yit.a(TAG, "authInfoList:" + authInfo2.toString());
        yit.a(TAG, "updateAuth update contentValues:" + contentValuesBuildAuthInfoContentValues.toString());
        return this.mDbCommon.b(contentValuesBuildAuthInfoContentValues, "key =? ", strArr) > 0;
    }

    public static ContentValues buildAuthInfoContentValues(AuthInfo authInfo) {
        if (authInfo == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(MedalConstants.EVENT_KEY, authInfo.getKey());
        contentValues.put("app_uid", Integer.valueOf(authInfo.getAppUid()));
        contentValues.put("user_id", authInfo.getUserId());
        contentValues.put("app_id", Integer.valueOf(authInfo.getAppId()));
        contentValues.put("permission", authInfo.getPermission());
        contentValues.put("open_status", Integer.valueOf(authInfo.getOpenStatus()));
        contentValues.put("encrypted_string", ylv.e(authInfo.toString(), ylu.d()));
        return contentValues;
    }

    public static List<AuthInfo> parseAuthInfo(Context context, Cursor cursor) {
        if (cursor == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            try {
                yit.a(TAG, "parseAuthInfo cursor.moveToNext()");
                AuthInfo authInfo = new AuthInfo();
                authInfo.setKey(cursor.getString(cursor.getColumnIndex(MedalConstants.EVENT_KEY)));
                authInfo.setAppUid(cursor.getInt(cursor.getColumnIndex("app_uid")));
                authInfo.setUserId(cursor.getString(cursor.getColumnIndex("user_id")));
                authInfo.setAppId(cursor.getInt(cursor.getColumnIndex("app_id")));
                authInfo.setPermission(cursor.getString(cursor.getColumnIndex("permission")));
                authInfo.setOpenStatus(cursor.getInt(cursor.getColumnIndex("open_status")));
                if (isModified(context, authInfo.toString(), authInfo.getKey(), cursor.getString(cursor.getColumnIndex("encrypted_string")))) {
                    authInfo.setOpenStatus(0);
                }
                arrayList.add(authInfo);
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    private static boolean isModified(Context context, String str, String str2, String str3) {
        yit.a(TAG, "isModified currentString:" + str);
        return (str3.equals(ylv.e(str, ylu.d())) || str3.equals(ylv.b(str, str2)) || str.equals(ylu.e(context, str3, str2))) ? false : true;
    }
}
