package com.huawei.healthcloud.plugintrack.sportmusic;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jaq;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes33.dex */
public class SportMusicProvider extends ContentProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final UriMatcher f10640c;

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f10640c = uriMatcher;
        uriMatcher.addURI("com.huawei.health.sport.musicprovider", null, 0);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        if (uri == null || contentValues == null) {
            LogUtil.e("Track_SportMusicProvider", "uri or values is null");
            return null;
        }
        if (f10640c.match(uri) == 0) {
            Integer asInteger = contentValues.getAsInteger("operatorType");
            String asString = contentValues.getAsString("contentId");
            String asString2 = contentValues.getAsString("contentElement");
            int iB = b();
            LogUtil.a("SportMusicProvider", "operatorType ", asInteger, " contentId ", asString, " contentElement ", asString2, " sportType ", Integer.valueOf(iB));
            c(contentValues, iB);
        }
        return null;
    }

    private void c(ContentValues contentValues, int i) {
        jaq jaqVar = new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002));
        if (contentValues.getAsInteger("operatorType") != null) {
            if (contentValues.getAsInteger("operatorType").intValue() == 1) {
                jaqVar.b(contentValues.getAsString("contentId"), i);
                jaqVar.d(contentValues.getAsString("contentElement"), i);
            } else {
                jaqVar.b("", i);
                jaqVar.d("", i);
            }
            jaqVar.b(contentValues.getAsInteger("operatorType").intValue(), i);
            return;
        }
        jaqVar.b("", i);
        jaqVar.d("", i);
    }

    private int b() {
        try {
            return Integer.parseInt(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "map_tracking_sport_type"));
        } catch (NumberFormatException e) {
            LogUtil.e("Track_SportMusicProvider", "getSportType NumberFormatException", LogAnonymous.b(e));
            return 0;
        }
    }
}
