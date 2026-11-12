package com.tencent.mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.gncs.NotificationConstants;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
class MMSharedPreferences implements SharedPreferences {
    private static final String TAG = "MicroMsg.SDK.SharedPreferences";

    /* JADX INFO: renamed from: cr, reason: collision with root package name */
    private final ContentResolver f54841cr;
    private final String[] columns = {"_id", Action.KEY_ATTRIBUTE, NotificationConstants.KEY_DATA_MIME_TYPE, "value"};
    private final HashMap<String, Object> values = new HashMap<>();
    private REditor editor = null;

    public static class REditor implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: cr, reason: collision with root package name */
        private ContentResolver f54842cr;
        private Map<String, Object> values = new HashMap();
        private Set<String> remove = new HashSet();
        private boolean clear = false;

        public REditor(ContentResolver contentResolver) {
            this.f54842cr = contentResolver;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.clear = true;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0097 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:43:0x003e A[SYNTHETIC] */
        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            String str;
            ContentValues contentValues = new ContentValues();
            if (this.clear) {
                this.f54842cr.delete(a.f54843a, null, null);
                this.clear = false;
            }
            Iterator<String> it = this.remove.iterator();
            while (it.hasNext()) {
                this.f54842cr.delete(a.f54843a, "key = ?", new String[]{it.next()});
            }
            Iterator<Map.Entry<String, Object>> it3 = this.values.entrySet().iterator();
            while (true) {
                int i14 = 1;
                if (!it3.hasNext()) {
                    return true;
                }
                Map.Entry<String, Object> next = it3.next();
                Object value = next.getValue();
                if (value == null) {
                    str = "unresolve failed, null value";
                } else {
                    if (!(value instanceof Integer)) {
                        if (value instanceof Long) {
                            i14 = 2;
                        } else if (value instanceof String) {
                            i14 = 3;
                        } else if (value instanceof Boolean) {
                            i14 = 4;
                        } else if (value instanceof Float) {
                            i14 = 5;
                        } else if (value instanceof Double) {
                            i14 = 6;
                        } else {
                            str = "unresolve failed, unknown type=" + value.getClass().toString();
                        }
                    }
                    if (i14 == 0) {
                        contentValues.put(NotificationConstants.KEY_DATA_MIME_TYPE, Integer.valueOf(i14));
                        contentValues.put("value", value.toString());
                        this.f54842cr.update(a.f54843a, contentValues, "key = ?", new String[]{next.getKey()});
                    }
                }
                Log.e("MicroMsg.SDK.PluginProvider.Resolver", str);
                i14 = 0;
                if (i14 == 0) {
                    contentValues.put(NotificationConstants.KEY_DATA_MIME_TYPE, Integer.valueOf(i14));
                    contentValues.put("value", value.toString());
                    this.f54842cr.update(a.f54843a, contentValues, "key = ?", new String[]{next.getKey()});
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z14) {
            this.values.put(str, Boolean.valueOf(z14));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f14) {
            this.values.put(str, Float.valueOf(f14));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i14) {
            this.values.put(str, Integer.valueOf(i14));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j8) {
            this.values.put(str, Long.valueOf(j8));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            this.values.put(str, str2);
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            return null;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.remove.add(str);
            return this;
        }
    }

    public MMSharedPreferences(Context context) {
        this.f54841cr = context.getContentResolver();
    }

    private Object getValue(String str) {
        try {
            Cursor cursorQuery = this.f54841cr.query(a.f54843a, this.columns, "key = ?", new String[]{str}, null);
            if (cursorQuery == null) {
                return null;
            }
            Object objA = cursorQuery.moveToFirst() ? com.tencent.mm.opensdk.channel.a.a.a(cursorQuery.getInt(cursorQuery.getColumnIndex(NotificationConstants.KEY_DATA_MIME_TYPE)), cursorQuery.getString(cursorQuery.getColumnIndex("value"))) : null;
            cursorQuery.close();
            return objA;
        } catch (Exception e4) {
            com.nimbusds.jose.shaded.gson.internal.a.q(e4, new StringBuilder("getValue exception:"), TAG);
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return getValue(str) != null;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        if (this.editor == null) {
            this.editor = new REditor(this.f54841cr);
        }
        return this.editor;
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        try {
            Cursor cursorQuery = this.f54841cr.query(a.f54843a, this.columns, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex(Action.KEY_ATTRIBUTE);
            int columnIndex2 = cursorQuery.getColumnIndex(NotificationConstants.KEY_DATA_MIME_TYPE);
            int columnIndex3 = cursorQuery.getColumnIndex("value");
            while (cursorQuery.moveToNext()) {
                this.values.put(cursorQuery.getString(columnIndex), com.tencent.mm.opensdk.channel.a.a.a(cursorQuery.getInt(columnIndex2), cursorQuery.getString(columnIndex3)));
            }
            cursorQuery.close();
            return this.values;
        } catch (Exception e4) {
            com.nimbusds.jose.shaded.gson.internal.a.q(e4, new StringBuilder("getAll exception:"), TAG);
            return this.values;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z14) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Boolean)) ? z14 : ((Boolean) value).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f14) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Float)) ? f14 : ((Float) value).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i14) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Integer)) ? i14 : ((Integer) value).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j8) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Long)) ? j8 : ((Long) value).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object value = getValue(str);
        return (value == null || !(value instanceof String)) ? str2 : (String) value;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        return null;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
}
