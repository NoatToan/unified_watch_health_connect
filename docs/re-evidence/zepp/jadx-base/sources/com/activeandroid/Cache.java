package com.activeandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.collection.LruCache;
import com.activeandroid.serializer.TypeSerializer;
import com.activeandroid.util.Log;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class Cache {
    public static final int DEFAULT_CACHE_SIZE = 1024;
    private static Context sContext = null;
    private static DatabaseHelper sDatabaseHelper = null;
    private static LruCache<String, Model> sEntities = null;
    private static boolean sIsInitialized = false;
    private static ModelInfo sModelInfo;

    private Cache() {
    }

    public static synchronized void addEntity(Model model) {
        sEntities.put(getIdentifier(model), model);
    }

    public static synchronized void clear() {
        sEntities.evictAll();
        Log.v("Cache cleared.");
    }

    public static synchronized void closeDatabase() {
        sDatabaseHelper.close();
    }

    public static synchronized void dispose() {
        closeDatabase();
        sEntities = null;
        sModelInfo = null;
        sDatabaseHelper = null;
        sIsInitialized = false;
        Log.v("ActiveAndroid disposed. Call initialize to use library.");
    }

    public static Context getContext() {
        return sContext;
    }

    public static synchronized Model getEntity(Class<? extends Model> cls, long j) {
        return sEntities.get(getIdentifier(cls, Long.valueOf(j)));
    }

    public static String getIdentifier(Class<? extends Model> cls, Long l) {
        return getTableName(cls) + "@" + l;
    }

    public static synchronized TypeSerializer getParserForType(Class<?> cls) {
        return sModelInfo.getTypeSerializer(cls);
    }

    public static synchronized TableInfo getTableInfo(Class<? extends Model> cls) {
        return sModelInfo.getTableInfo(cls);
    }

    public static synchronized Collection<TableInfo> getTableInfos() {
        return sModelInfo.getTableInfos();
    }

    public static synchronized String getTableName(Class<? extends Model> cls) {
        return sModelInfo.getTableInfo(cls).getTableName();
    }

    public static synchronized void initialize(Configuration configuration) {
        if (sIsInitialized) {
            Log.v("ActiveAndroid already initialized.");
            return;
        }
        sContext = configuration.getContext();
        sModelInfo = new ModelInfo(configuration);
        sDatabaseHelper = new DatabaseHelper(configuration);
        sEntities = new LruCache<>(configuration.getCacheSize());
        openDatabase();
        sIsInitialized = true;
        Log.v("ActiveAndroid initialized successfully.");
    }

    public static boolean isInitialized() {
        return sIsInitialized;
    }

    public static synchronized SQLiteDatabase openDatabase() {
        return sDatabaseHelper.getWritableDatabase();
    }

    public static synchronized void removeEntity(Model model) {
        sEntities.remove(getIdentifier(model));
    }

    public static String getIdentifier(Model model) {
        return getIdentifier(model.getClass(), model.getId());
    }
}
