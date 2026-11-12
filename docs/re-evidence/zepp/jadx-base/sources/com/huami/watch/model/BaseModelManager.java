package com.huami.watch.model;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.Model;
import com.activeandroid.query.Delete;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseModelManager<T extends Model> {
    private static final String a = Class.class.getSimpleName();
    private static final Map<Class<? extends BaseModelManager>, Object> b = new HashMap();

    public static Object getManager(Class<? extends BaseModelManager> cls) {
        Object objNewInstance;
        Map<Class<? extends BaseModelManager>, Object> map = b;
        synchronized (map) {
            objNewInstance = map.containsKey(cls) ? map.get(cls) : null;
        }
        if (objNewInstance == null) {
            try {
                objNewInstance = cls.newInstance();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e2) {
                e2.printStackTrace();
            }
            if (objNewInstance == null) {
                throw new IllegalArgumentException(cls.getSimpleName() + " BaseModelManager Not Found!!");
            }
            Map<Class<? extends BaseModelManager>, Object> map2 = b;
            synchronized (map2) {
                map2.put(cls, objNewInstance);
            }
        }
        return objNewInstance;
    }

    public void delete(T t) {
        Log.d(tag(), "Delete: " + t, new Object[0]);
        if (t == null) {
            return;
        }
        t.delete();
    }

    public void deleteAll(Class<T> cls) {
        new Delete().from(cls).execute();
        Log.d(tag(), "Delete All!!", new Object[0]);
    }

    public T get(Class<T> cls, long j) {
        T t = (T) Model.load(cls, j);
        Log.d(tag(), "Get <Id: " + j + "> : " + t, new Object[0]);
        return t;
    }

    public boolean save(T t) {
        if (t == null) {
            Log.d(tag(), "Add: null", new Object[0]);
            return false;
        }
        String str = t.getId() == null ? "Insert: " : "Update: ";
        boolean z = t.save().longValue() > 0;
        Log.d(tag(), str + t + ", Success: " + z, new Object[0]);
        return z;
    }

    public String tag() {
        return a;
    }

    public void delete(Class<T> cls, long j) {
        Log.d(tag(), "Delete: " + j, new Object[0]);
        Model.delete(cls, j);
    }

    public boolean save(List<T> list) {
        boolean z = true;
        if (ArraysUtil.isEmpty(list)) {
            Log.d(tag(), "Add: " + list, new Object[0]);
            return true;
        }
        ActiveAndroid.beginTransaction();
        try {
            try {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().save();
                }
                ActiveAndroid.setTransactionSuccessful();
                ActiveAndroid.endTransaction();
            } catch (Exception e) {
                e.printStackTrace();
                ActiveAndroid.endTransaction();
                z = false;
            }
            Log.d(a, "Save All: " + ArraysUtil.toString((List<?>) list) + ", Success: " + z, new Object[0]);
            return z;
        } catch (Throwable th) {
            ActiveAndroid.endTransaction();
            throw th;
        }
    }
}
