package com.huawei.featureuserprofile.sos.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes23.dex */
public class EmergencyInfoProvider extends ContentProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f5714b = "EmergencyInfoProvider";
    private String d = BaseApplication.getAppPackage() + ".sos.provider";
    private UriMatcher e;

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    private void a() {
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.e = uriMatcher;
        uriMatcher.addURI(this.d, "getString", 1);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        LogUtil.d(f5714b, "EmergencyInfoProvider onCreate().");
        a();
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws Throwable {
        Bundle bundle = new Bundle();
        if (this.e.match(uri) == 1) {
            EmergencyInfoManager emergencyInfoManagerA = EmergencyInfoManager.a();
            if (emergencyInfoManagerA.j()) {
                emergencyInfoManagerA.c(false);
            } else {
                emergencyInfoManagerA.p();
            }
            bundle.putString("value", emergencyInfoManagerA.i());
            LogUtil.a(f5714b, "query getEmergencyInfo");
        } else {
            LogUtil.j(f5714b, "query getEmergencyInfo mUriMatcher not get string");
        }
        return new c(bundle);
    }

    static final class c extends MatrixCursor {
        private Bundle e;

        c(Bundle bundle) {
            super(new String[0], 0);
            this.e = bundle;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public Bundle getExtras() {
            return this.e;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public Bundle respond(Bundle bundle) {
            this.e = bundle;
            return bundle;
        }
    }
}
