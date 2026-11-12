package com.ximalaya.ting.android.opensdk.util;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;

/* JADX INFO: loaded from: classes22.dex */
public class SPContentProvider extends ContentProvider {
    private static String EXTRA_KEY = "key";
    private static String EXTRA_TYPE = "type";
    private static String EXTRA_VALUE = "value";
    private static int LENGTH_CONTENT_URI = 0;
    public static Uri MY_CONTENT_PROVIDER_URI = null;
    private static final int TYPE_BOOLEAN = 2;
    private static final int TYPE_FLOAT = 4;
    private static final int TYPE_INT = 5;
    private static final int TYPE_LONG = 3;
    private static final int TYPE_REMOVE = 6;
    private static final int TYPE_STRING = 1;

    public static Boolean getBooleanValue(String str, Boolean bool) {
        initUri();
        ContentValues contentValues = new ContentValues();
        contentValues.put(EXTRA_TYPE, (Integer) 2);
        contentValues.put(EXTRA_KEY, str);
        contentValues.put(EXTRA_VALUE, bool);
        try {
            Uri uriInsert = Utils.getContext().getContentResolver().insert(MY_CONTENT_PROVIDER_URI, contentValues);
            return uriInsert == null ? bool : Boolean.valueOf(uriInsert.toString().substring(LENGTH_CONTENT_URI));
        } catch (Exception unused) {
            return bool;
        }
    }

    public static Float getFloatValue(String str, Float f) {
        initUri();
        ContentValues contentValues = new ContentValues();
        contentValues.put(EXTRA_TYPE, (Integer) 4);
        contentValues.put(EXTRA_KEY, str);
        contentValues.put(EXTRA_VALUE, f);
        try {
            Uri uriInsert = Utils.getContext().getContentResolver().insert(MY_CONTENT_PROVIDER_URI, contentValues);
            return uriInsert == null ? f : Float.valueOf(uriInsert.toString().substring(LENGTH_CONTENT_URI));
        } catch (Exception unused) {
            return f;
        }
    }

    public static int getIntValue(String str, int i) {
        initUri();
        ContentValues contentValues = new ContentValues();
        contentValues.put(EXTRA_TYPE, (Integer) 5);
        contentValues.put(EXTRA_KEY, str);
        contentValues.put(EXTRA_VALUE, Integer.valueOf(i));
        try {
            Uri uriInsert = Utils.getContext().getContentResolver().insert(MY_CONTENT_PROVIDER_URI, contentValues);
            return uriInsert == null ? i : Integer.parseInt(uriInsert.toString().substring(LENGTH_CONTENT_URI));
        } catch (Exception unused) {
            return i;
        }
    }

    public static Long getLongValue(String str, Long l) {
        initUri();
        ContentValues contentValues = new ContentValues();
        contentValues.put(EXTRA_TYPE, (Integer) 3);
        contentValues.put(EXTRA_KEY, str);
        contentValues.put(EXTRA_VALUE, l);
        try {
            Uri uriInsert = Utils.getContext().getContentResolver().insert(MY_CONTENT_PROVIDER_URI, contentValues);
            return uriInsert == null ? l : Long.valueOf(uriInsert.toString().substring(LENGTH_CONTENT_URI));
        } catch (Exception unused) {
            return l;
        }
    }

    public static String getStringValue(String str, String str2) {
        initUri();
        ContentValues contentValues = new ContentValues();
        contentValues.put(EXTRA_TYPE, (Integer) 1);
        contentValues.put(EXTRA_KEY, str);
        contentValues.put(EXTRA_VALUE, str2);
        try {
            Uri uriInsert = Utils.getContext().getContentResolver().insert(MY_CONTENT_PROVIDER_URI, contentValues);
            return uriInsert == null ? str2 : uriInsert.toString().substring(LENGTH_CONTENT_URI);
        } catch (Exception unused) {
            return str2;
        }
    }

    private static void initUri() {
        if (MY_CONTENT_PROVIDER_URI != null || Utils.getContext() == null) {
            return;
        }
        Uri uri = Uri.parse("content://" + MeteDataUtil.getMetaDataByKey(Utils.getContext(), "MAIN_APP_ID") + ".sPContentProvider");
        MY_CONTENT_PROVIDER_URI = uri;
        LENGTH_CONTENT_URI = uri.toString().length() + 1;
    }

    public static void remove(String str) {
        initUri();
        ContentValues contentValues = new ContentValues();
        contentValues.put(EXTRA_TYPE, (Integer) 6);
        contentValues.put(EXTRA_KEY, str);
        try {
            Utils.getContext().getContentResolver().update(MY_CONTENT_PROVIDER_URI, contentValues, null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setBooleanValue(String str, Boolean bool) {
        initUri();
        ContentValues contentValues = new ContentValues();
        contentValues.put(EXTRA_TYPE, (Integer) 2);
        contentValues.put(EXTRA_KEY, str);
        contentValues.put(EXTRA_VALUE, bool);
        try {
            Utils.getContext().getContentResolver().update(MY_CONTENT_PROVIDER_URI, contentValues, null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setFloatValue(String str, float f) {
        initUri();
        ContentValues contentValues = new ContentValues();
        contentValues.put(EXTRA_TYPE, (Integer) 4);
        contentValues.put(EXTRA_KEY, str);
        contentValues.put(EXTRA_VALUE, Float.valueOf(f));
        try {
            Utils.getContext().getContentResolver().update(MY_CONTENT_PROVIDER_URI, contentValues, null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setIntValue(String str, int i) {
        initUri();
        ContentValues contentValues = new ContentValues();
        contentValues.put(EXTRA_TYPE, (Integer) 5);
        contentValues.put(EXTRA_KEY, str);
        contentValues.put(EXTRA_VALUE, Integer.valueOf(i));
        try {
            Utils.getContext().getContentResolver().update(MY_CONTENT_PROVIDER_URI, contentValues, null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setLongValue(String str, Long l) {
        initUri();
        ContentValues contentValues = new ContentValues();
        contentValues.put(EXTRA_TYPE, (Integer) 3);
        contentValues.put(EXTRA_KEY, str);
        contentValues.put(EXTRA_VALUE, l);
        try {
            Utils.getContext().getContentResolver().update(MY_CONTENT_PROVIDER_URI, contentValues, null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setStringValue(String str, String str2) {
        initUri();
        ContentValues contentValues = new ContentValues();
        contentValues.put(EXTRA_TYPE, (Integer) 1);
        contentValues.put(EXTRA_KEY, str);
        contentValues.put(EXTRA_VALUE, str2);
        try {
            Utils.getContext().getContentResolver().update(MY_CONTENT_PROVIDER_URI, contentValues, null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        initUri();
        String str = "";
        int iIntValue = contentValues.getAsInteger(EXTRA_TYPE).intValue();
        if (iIntValue == 1) {
            str = "" + SharedPreferencesUtil.getInstance(getContext()).getString(contentValues.getAsString(EXTRA_KEY), contentValues.getAsString(EXTRA_VALUE));
        } else if (iIntValue == 2) {
            str = "" + SharedPreferencesUtil.getInstance(getContext()).getBoolean(contentValues.getAsString(EXTRA_KEY), contentValues.getAsBoolean(EXTRA_VALUE).booleanValue());
        } else if (iIntValue == 3) {
            str = "" + SharedPreferencesUtil.getInstance(getContext()).getLong(contentValues.getAsString(EXTRA_KEY), contentValues.getAsLong(EXTRA_VALUE).longValue());
        } else if (iIntValue == 4) {
            str = "" + SharedPreferencesUtil.getInstance(getContext()).getFloat(contentValues.getAsString(EXTRA_KEY), contentValues.getAsLong(EXTRA_VALUE).longValue());
        } else if (iIntValue == 5) {
            str = "" + SharedPreferencesUtil.getInstance(getContext()).getInt(contentValues.getAsString(EXTRA_KEY), contentValues.getAsInteger(EXTRA_VALUE).intValue());
        }
        if (MY_CONTENT_PROVIDER_URI != null) {
            return Uri.parse(MY_CONTENT_PROVIDER_URI.toString() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str);
        }
        if (uri == null) {
            return null;
        }
        return Uri.parse(uri.toString() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        initUri();
        switch (contentValues.getAsInteger(EXTRA_TYPE).intValue()) {
            case 1:
                SharedPreferencesUtil.getInstance(getContext()).saveString(contentValues.getAsString(EXTRA_KEY), contentValues.getAsString(EXTRA_VALUE));
                return 1;
            case 2:
                SharedPreferencesUtil.getInstance(getContext()).saveBoolean(contentValues.getAsString(EXTRA_KEY), contentValues.getAsBoolean(EXTRA_VALUE).booleanValue());
                return 1;
            case 3:
                SharedPreferencesUtil.getInstance(getContext()).saveLong(contentValues.getAsString(EXTRA_KEY), contentValues.getAsLong(EXTRA_VALUE).longValue());
                return 1;
            case 4:
                SharedPreferencesUtil.getInstance(getContext()).saveFloat(contentValues.getAsString(EXTRA_KEY), contentValues.getAsInteger(EXTRA_VALUE).intValue());
                return 1;
            case 5:
                SharedPreferencesUtil.getInstance(getContext()).saveInt(contentValues.getAsString(EXTRA_KEY), contentValues.getAsInteger(EXTRA_VALUE).intValue());
                return 1;
            case 6:
                SharedPreferencesUtil.getInstance(getContext()).removeByKey(contentValues.getAsString(EXTRA_KEY));
                return 1;
            default:
                return 1;
        }
    }
}
