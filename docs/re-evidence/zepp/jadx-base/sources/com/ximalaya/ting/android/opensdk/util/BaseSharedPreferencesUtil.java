package com.ximalaya.ting.android.opensdk.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.gson.Gson;
import java.util.ArrayList;
import org.json.JSONArray;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes22.dex */
public class BaseSharedPreferencesUtil {
    private Context context;
    private SharedPreferences sp;

    public BaseSharedPreferencesUtil(Context context, String str) {
        this.context = context;
        this.sp = context.getSharedPreferences(str, 0);
    }

    @SuppressLint({"NewApi"})
    public void apply(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            editor.commit();
        }
    }

    public void clear() {
        apply(this.sp.edit().clear());
    }

    public boolean contains(String str) {
        if (BaseUtil.isMainProcess(this.context)) {
            return this.sp.contains(str);
        }
        return false;
    }

    public ArrayList<String> getArrayList(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(BaseUtil.isMainProcess(this.context) ? this.sp.getString(str, MessageFormatter.c) : SPContentProvider.getStringValue(str, MessageFormatter.c));
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.optString(i));
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public boolean getBoolean(String str) {
        return BaseUtil.isMainProcess(this.context) ? this.sp.getBoolean(str, false) : SPContentProvider.getBooleanValue(str, Boolean.FALSE).booleanValue();
    }

    public float getFloat(String str, float f) {
        return BaseUtil.isMainProcess(this.context) ? this.sp.getFloat(str, f) : SPContentProvider.getFloatValue(str, Float.valueOf(f)).floatValue();
    }

    public int getInt(String str, int i) {
        return BaseUtil.isMainProcess(this.context) ? this.sp.getInt(str, i) : SPContentProvider.getIntValue(str, i);
    }

    public long getLong(String str) {
        return BaseUtil.isMainProcess(this.context) ? this.sp.getLong(str, -1L) : SPContentProvider.getLongValue(str, -1L).longValue();
    }

    public Boolean getOptBoolean(String str) {
        try {
            return Boolean.valueOf(Boolean.parseBoolean(BaseUtil.isMainProcess(this.context) ? this.sp.getString(str, null) : SPContentProvider.getStringValue(str, null)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Double getOptDouble(String str) {
        try {
            return Double.valueOf(Double.parseDouble(BaseUtil.isMainProcess(this.context) ? this.sp.getString(str, null) : SPContentProvider.getStringValue(str, null)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public SharedPreferences getSp() {
        return this.sp;
    }

    public String getString(String str) {
        return BaseUtil.isMainProcess(this.context) ? this.sp.getString(str, "") : SPContentProvider.getStringValue(str, "");
    }

    public void removeByKey(String str) {
        if (BaseUtil.isMainProcess(this.context)) {
            apply(this.sp.edit().remove(str));
        } else {
            SPContentProvider.remove(str);
        }
    }

    public void saveArrayList(String str, ArrayList<String> arrayList) {
        if (BaseUtil.isMainProcess(this.context)) {
            apply(this.sp.edit().putString(str, new Gson().toJson(arrayList)));
        } else {
            SPContentProvider.setStringValue(str, new Gson().toJson(arrayList));
        }
    }

    public void saveBoolean(String str, boolean z) {
        if (BaseUtil.isMainProcess(this.context)) {
            apply(this.sp.edit().putBoolean(str, z));
        } else {
            SPContentProvider.setBooleanValue(str, Boolean.valueOf(z));
        }
    }

    public void saveFloat(String str, float f) {
        if (BaseUtil.isMainProcess(this.context)) {
            apply(this.sp.edit().putFloat(str, f));
        } else {
            SPContentProvider.setFloatValue(str, f);
        }
    }

    public void saveInt(String str, int i) {
        if (BaseUtil.isMainProcess(this.context)) {
            apply(this.sp.edit().putInt(str, i));
        } else {
            SPContentProvider.setIntValue(str, i);
        }
    }

    public void saveLong(String str, long j) {
        if (BaseUtil.isMainProcess(this.context)) {
            apply(this.sp.edit().putLong(str, j));
        } else {
            SPContentProvider.setLongValue(str, Long.valueOf(j));
        }
    }

    public void saveString(String str, String str2) {
        if (BaseUtil.isMainProcess(this.context)) {
            apply(this.sp.edit().putString(str, str2));
        } else {
            SPContentProvider.setStringValue(str, str2);
        }
    }

    public BaseSharedPreferencesUtil(Context context, String str, int i) {
        this.context = context;
        this.sp = context.getSharedPreferences(str, i);
    }

    public boolean getBoolean(String str, boolean z) {
        if (BaseUtil.isMainProcess(this.context)) {
            return this.sp.getBoolean(str, z);
        }
        return SPContentProvider.getBooleanValue(str, Boolean.valueOf(z)).booleanValue();
    }

    public float getFloat(String str) {
        if (BaseUtil.isMainProcess(this.context)) {
            return this.sp.getFloat(str, -1.0f);
        }
        return SPContentProvider.getFloatValue(str, Float.valueOf(-1.0f)).floatValue();
    }

    public long getLong(String str, long j) {
        if (BaseUtil.isMainProcess(this.context)) {
            return this.sp.getLong(str, j);
        }
        return SPContentProvider.getLongValue(str, Long.valueOf(j)).longValue();
    }

    public String getString(String str, String str2) {
        if (BaseUtil.isMainProcess(this.context)) {
            return this.sp.getString(str, str2);
        }
        return SPContentProvider.getStringValue(str, str2);
    }
}
