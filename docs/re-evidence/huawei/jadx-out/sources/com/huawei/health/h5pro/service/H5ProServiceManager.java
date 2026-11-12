package com.huawei.health.h5pro.service;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProJsCbkInvoker;
import defpackage.exs;
import defpackage.ext;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class H5ProServiceManager {
    private static volatile H5ProServiceManager e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f6977c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Gson f6976a = new GsonBuilder().create();
    private final ConcurrentHashMap<String, exs> g = new ConcurrentHashMap<>();
    private ReentrantReadWriteLock d = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private H5ProScopeChecker f6978b = new H5ProScopeChecker() { // from class: com.huawei.health.h5pro.service.H5ProServiceManager.4
        @Override // com.huawei.health.h5pro.service.H5ProScopeChecker
        public boolean checkScope(H5ProAppInfo h5ProAppInfo, String str) {
            return true;
        }
    };

    private H5ProServiceManager() {
    }

    private Object[] a(ext extVar, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return strArr;
        }
        Class<?>[] parameterTypes = extVar.c().getParameterTypes();
        if (parameterTypes.length != strArr.length && (parameterTypes.length != strArr.length + 1 || !extVar.a())) {
            throw new RuntimeException("method prototype mismatch");
        }
        Object[] objArr = new Object[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (parameterTypes[i].equals(String.class)) {
                objArr[i] = strArr[i];
            } else {
                objArr[i] = f6976a.fromJson(strArr[i], (Class) parameterTypes[i]);
            }
        }
        return objArr;
    }

    private Constructor<?> b(Class<?> cls) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            if (constructor.getParameterTypes() == null || constructor.getParameterTypes().length == 0) {
                return constructor;
            }
        }
        return null;
    }

    private boolean c(H5ProAppInfo h5ProAppInfo, String str) {
        return this.f6978b.checkScope(h5ProAppInfo, str);
    }

    private exs d(String str) {
        this.d.readLock().lock();
        exs exsVar = this.g.get(str);
        if (exsVar == null) {
            this.d.readLock().unlock();
            return null;
        }
        this.d.readLock().unlock();
        return exsVar;
    }

    private void d(String str, String str2) {
        try {
            LogUtil.i("H5PRO_H5ProServiceManager", "registerServiceByClassName: " + str + ": " + str2);
            Class<?> cls = Class.forName(str);
            if (!"1".equals(str2)) {
                if ("0".equals(str2)) {
                    registerService(cls);
                }
            } else {
                Constructor<?> constructorB = b(cls);
                if (constructorB != null) {
                    registerService(constructorB.newInstance(null));
                }
            }
        } catch (ClassNotFoundException e2) {
            LogUtil.e("H5PRO_H5ProServiceManager", "registerService by className: ClassNotFoundException, " + e2.getMessage());
        } catch (Exception e3) {
            LogUtil.e("H5PRO_H5ProServiceManager", "registerService by className: " + e3.getMessage());
        }
    }

    private String e(Object obj) {
        return f6976a.toJson(new H5ProInvokeResult(obj), H5ProInvokeResult.class);
    }

    private boolean e(H5ProAppInfo h5ProAppInfo, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return true;
        }
        for (String str : strArr) {
            if (str.equals(str.startsWith("http") ? h5ProAppInfo.getBaseUrl() : str.contains(".") ? h5ProAppInfo.getPkgName() : h5ProAppInfo.getCertPrint())) {
                return true;
            }
        }
        return false;
    }

    public static H5ProServiceManager getInstance() {
        if (e == null) {
            synchronized (f6977c) {
                if (e == null) {
                    e = new H5ProServiceManager();
                }
            }
        }
        return e;
    }

    public void asyncInvoke(H5ProAppInfo h5ProAppInfo, H5ProJsCbkInvoker<Object> h5ProJsCbkInvoker, long j, String str, String str2, String... strArr) throws IllegalAccessException, InvocationTargetException {
        exs exsVarD = d(str);
        if (exsVarD == null) {
            throw new RuntimeException("service " + str + " not found");
        }
        ext extVarC = exsVarD.c(str2);
        if (extVarC == null) {
            throw new RuntimeException(str + "." + str2 + " not found");
        }
        if (e(h5ProAppInfo, exsVarD.a())) {
            if (!c(h5ProAppInfo, extVarC.d())) {
                throw new RuntimeException("check scope failed");
            }
            extVarC.d(exsVarD.c(), h5ProJsCbkInvoker, j, a(extVarC, strArr));
        } else {
            throw new RuntimeException("it's not allowed to access service " + str + ", caller is " + h5ProAppInfo.toString());
        }
    }

    public void autoUnregisterService(H5ProServiceLiveTerm h5ProServiceLiveTerm) {
        try {
            this.d.writeLock().lock();
            if (this.g.isEmpty()) {
                this.d.writeLock().unlock();
                return;
            }
            for (Map.Entry<String, exs> entry : this.g.entrySet()) {
                exs value = entry.getValue();
                if (value != null && value.b() == h5ProServiceLiveTerm) {
                    LogUtil.i("H5PRO_H5ProServiceManager", String.format(Locale.ROOT, "autoUnregisterService: %s", entry.getKey()));
                    this.g.remove(entry.getKey());
                }
            }
            this.d.writeLock().unlock();
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public String[] getAllRegisteredServices() {
        ConcurrentHashMap<String, exs> concurrentHashMap = this.g;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (exs exsVar : this.g.values()) {
            String strD = exsVar.d();
            String str = exsVar.c() == null ? "0" : "1";
            if (!TextUtils.isEmpty(strD)) {
                arrayList.add(strD + "," + str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public String invoke(H5ProAppInfo h5ProAppInfo, String str, String str2, String... strArr) {
        exs exsVarD = d(str);
        if (exsVarD == null) {
            throw new RuntimeException("service " + str + " not found");
        }
        ext extVarC = exsVarD.c(str2);
        if (extVarC == null) {
            throw new RuntimeException(str + "." + str2 + " not found");
        }
        if (e(h5ProAppInfo, exsVarD.a())) {
            if (!c(h5ProAppInfo, extVarC.d())) {
                throw new RuntimeException("check scope failed");
            }
            Object objA = extVarC.a(exsVarD.c(), a(extVarC, strArr));
            if (extVarC.c().getReturnType().equals(Void.TYPE)) {
                return null;
            }
            return e(objA);
        }
        throw new RuntimeException("it's not allowed to access service " + str + ", caller is " + h5ProAppInfo.toString());
    }

    public boolean registerService(Class<?> cls) {
        try {
            this.d.writeLock().lock();
            if (cls == null) {
                LogUtil.e("H5PRO_H5ProServiceManager", "registerService: failed, serviceClass is null");
                return false;
            }
            H5ProService h5ProService = (H5ProService) cls.getAnnotation(H5ProService.class);
            if (h5ProService == null) {
                LogUtil.e("H5PRO_H5ProServiceManager", "registerService: failed, the class has no H5ProService annotation.");
                return false;
            }
            String strName = h5ProService.name();
            if (TextUtils.isEmpty(strName)) {
                strName = cls.getName();
            }
            if (this.g.get(strName) != null) {
                return false;
            }
            this.g.put(strName, new exs(cls));
            return true;
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public void restoreRegisteredServices(String[] strArr) {
        if (strArr == null || strArr.length == 0 || !this.g.isEmpty()) {
            return;
        }
        try {
            LogUtil.i("H5PRO_H5ProServiceManager", "restoreRegisteredServices");
            this.d.writeLock().lock();
            for (int i = 0; i < strArr.length; i++) {
                if (!TextUtils.isEmpty(strArr[i])) {
                    String[] strArrSplit = strArr[i].split(",");
                    if (strArrSplit.length == 2) {
                        d(strArrSplit[0], strArrSplit[1]);
                    } else {
                        continue;
                    }
                }
            }
            this.d.writeLock().unlock();
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public void setScopeChecker(H5ProScopeChecker h5ProScopeChecker) {
        this.f6978b = h5ProScopeChecker;
    }

    public boolean unregisterService(Class<?> cls) {
        try {
            this.d.writeLock().lock();
            H5ProService h5ProService = (H5ProService) cls.getAnnotation(H5ProService.class);
            if (h5ProService == null) {
                LogUtil.e("H5PRO_H5ProServiceManager", "unregisterService: failed, the class has no H5ProService annotation.");
                return false;
            }
            String strName = h5ProService.name();
            if (TextUtils.isEmpty(strName)) {
                strName = cls.getName();
            }
            if (this.g.get(strName) == null) {
                return false;
            }
            this.g.remove(strName);
            LogUtil.i("H5PRO_H5ProServiceManager", "unregisterService: " + strName);
            return true;
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public boolean unregisterService(Object obj) {
        try {
            Class<?> cls = obj.getClass();
            this.d.writeLock().lock();
            H5ProService h5ProService = (H5ProService) cls.getAnnotation(H5ProService.class);
            if (h5ProService == null) {
                LogUtil.e("H5PRO_H5ProServiceManager", "unregisterService: failed, the class has no H5ProService annotation.");
                return false;
            }
            String strName = h5ProService.name();
            if (TextUtils.isEmpty(strName)) {
                strName = cls.getName();
            }
            if (this.g.get(strName) == null) {
                return false;
            }
            this.g.remove(strName);
            LogUtil.i("H5PRO_H5ProServiceManager", "unregisterService: " + strName);
            return true;
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public boolean registerService(Object obj) {
        try {
            Class<?> cls = obj.getClass();
            this.d.writeLock().lock();
            H5ProService h5ProService = (H5ProService) cls.getAnnotation(H5ProService.class);
            if (h5ProService == null) {
                LogUtil.e("H5PRO_H5ProServiceManager", "registerService: failed, the class has no H5ProService annotation.");
                return false;
            }
            String strName = h5ProService.name();
            if (TextUtils.isEmpty(strName)) {
                strName = cls.getName();
            }
            if (this.g.get(strName) != null) {
                return false;
            }
            this.g.put(strName, new exs(obj));
            LogUtil.i("H5PRO_H5ProServiceManager", "registerService: " + strName);
            return true;
        } finally {
            this.d.writeLock().unlock();
        }
    }
}
