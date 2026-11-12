package com.activeandroid.content;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.util.SparseArray;
import com.activeandroid.ActiveAndroid;
import com.activeandroid.Cache;
import com.activeandroid.Configuration;
import com.activeandroid.Model;
import com.activeandroid.TableInfo;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class ContentProvider extends android.content.ContentProvider {
    private static String sAuthority;
    private static final UriMatcher URI_MATCHER = new UriMatcher(-1);
    private static final SparseArray<Class<? extends Model>> TYPE_CODES = new SparseArray<>();
    private static SparseArray<String> sMimeTypeCache = new SparseArray<>();

    public static Uri createUri(Class<? extends Model> cls, Long l) {
        StringBuilder sb = new StringBuilder();
        sb.append("content://");
        sb.append(sAuthority);
        sb.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        sb.append(Cache.getTableName(cls).toLowerCase());
        if (l != null) {
            sb.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
            sb.append(l.toString());
        }
        return Uri.parse(sb.toString());
    }

    private Class<? extends Model> getModelType(Uri uri) {
        int iMatch = URI_MATCHER.match(uri);
        if (iMatch != -1) {
            return TYPE_CODES.get(iMatch);
        }
        return null;
    }

    private void notifyChange(Uri uri) {
        getContext().getContentResolver().notifyChange(uri, null);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int iDelete = Cache.openDatabase().delete(Cache.getTableName(getModelType(uri)), str, strArr);
        notifyChange(uri);
        return iDelete;
    }

    public String getAuthority() {
        return getContext().getPackageName();
    }

    public Configuration getConfiguration() {
        return new Configuration.Builder(getContext()).create();
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int iMatch = URI_MATCHER.match(uri);
        String str = sMimeTypeCache.get(iMatch);
        if (str != null) {
            return str;
        }
        Class<? extends Model> modelType = getModelType(uri);
        boolean z = iMatch % 2 == 0;
        StringBuilder sb = new StringBuilder();
        sb.append("vnd");
        sb.append(".");
        sb.append(sAuthority);
        sb.append(".");
        sb.append(z ? "item" : "dir");
        sb.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        sb.append("vnd");
        sb.append(".");
        sb.append(sAuthority);
        sb.append(".");
        sb.append(Cache.getTableName(modelType));
        sMimeTypeCache.append(iMatch, sb.toString());
        return sb.toString();
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        Class<? extends Model> modelType = getModelType(uri);
        Long lValueOf = Long.valueOf(Cache.openDatabase().insert(Cache.getTableName(modelType), null, contentValues));
        if (lValueOf == null || lValueOf.longValue() <= 0) {
            return null;
        }
        Uri uriCreateUri = createUri(modelType, lValueOf);
        notifyChange(uriCreateUri);
        return uriCreateUri;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        ActiveAndroid.initialize(getConfiguration());
        sAuthority = getAuthority();
        ArrayList arrayList = new ArrayList(Cache.getTableInfos());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TableInfo tableInfo = (TableInfo) arrayList.get(i);
            int i2 = i * 2;
            int i3 = i2 + 1;
            int i4 = i2 + 2;
            UriMatcher uriMatcher = URI_MATCHER;
            uriMatcher.addURI(sAuthority, tableInfo.getTableName().toLowerCase(), i3);
            SparseArray<Class<? extends Model>> sparseArray = TYPE_CODES;
            sparseArray.put(i3, tableInfo.getType());
            uriMatcher.addURI(sAuthority, tableInfo.getTableName().toLowerCase() + "/#", i4);
            sparseArray.put(i4, tableInfo.getType());
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQuery = Cache.openDatabase().query(Cache.getTableName(getModelType(uri)), strArr, str, strArr2, null, null, str2);
        cursorQuery.setNotificationUri(getContext().getContentResolver(), uri);
        return cursorQuery;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int iUpdate = Cache.openDatabase().update(Cache.getTableName(getModelType(uri)), contentValues, str, strArr);
        notifyChange(uri);
        return iUpdate;
    }
}
