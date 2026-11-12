package com.huawei.alarm;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ayx;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class AlarmManager<T extends ayx> {
    private static final String TAG = "AlarmManager";
    private static final Object WRITE_LOCK = new Object();
    private HiHealthNativeApi hiHealthNativeApi = HiHealthNativeApi.a(BaseApplication.b());

    public abstract String getAlarmKey();

    /* JADX INFO: loaded from: classes22.dex */
    static class a implements ParameterizedType {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class f5066c;

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return null;
        }

        a(Class cls) {
            this.f5066c = cls;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return new Type[]{this.f5066c};
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return Set.class;
        }
    }

    public boolean addOrUpdateAlarm(T t) {
        boolean zSave;
        synchronized (WRITE_LOCK) {
            Set<T> alarms = getAlarms();
            alarms.remove(t);
            alarms.add(t);
            zSave = save(alarms);
        }
        return zSave;
    }

    public boolean addOrUpdateAlarms(Set<T> set) {
        boolean zSave;
        synchronized (WRITE_LOCK) {
            Set<T> alarms = getAlarms();
            alarms.removeAll(set);
            alarms.addAll(set);
            zSave = save(alarms);
        }
        return zSave;
    }

    public boolean deleteAlarm(T t) {
        boolean z;
        synchronized (WRITE_LOCK) {
            Set<T> alarms = getAlarms();
            z = alarms.remove(t) && save(alarms);
        }
        return z;
    }

    public boolean deleteAlarms(Set<T> set) {
        boolean z;
        synchronized (WRITE_LOCK) {
            Set<T> alarms = getAlarms();
            z = alarms.removeAll(set) && save(alarms);
        }
        return z;
    }

    public Set<T> getAlarms() {
        Set<T> set;
        HiUserPreference userPreference = this.hiHealthNativeApi.getUserPreference(getAlarmKey());
        HashSet hashSet = new HashSet();
        if (userPreference == null) {
            LogUtil.j(TAG, "empty alarmsInfo for:", getAlarmKey());
            return hashSet;
        }
        try {
            Class cls = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
            if (TextUtils.isEmpty(userPreference.getValue())) {
                LogUtil.j(TAG, "value from database is null");
                set = null;
            } else {
                set = (Set) new Gson().fromJson(userPreference.getValue(), new a(cls));
            }
            return set != null ? set : hashSet;
        } catch (JsonParseException e) {
            LogUtil.e(TAG, "parse alarm json error:", e.getMessage());
        } catch (NullPointerException e2) {
            LogUtil.e(TAG, "NullPointerException: ", e2.getMessage());
        }
    }

    public boolean save(Set<T> set) {
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey(getAlarmKey());
        hiUserPreference.setValue(new Gson().toJson(set));
        return this.hiHealthNativeApi.setUserPreference(hiUserPreference);
    }
}
