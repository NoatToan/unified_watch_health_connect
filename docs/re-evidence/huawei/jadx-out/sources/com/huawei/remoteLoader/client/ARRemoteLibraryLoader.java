package com.huawei.remoteLoader.client;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.util.Log;
import com.huawei.arengine.remoteLoader.ILoaderProducer;
import com.huawei.hiar.e;
import defpackage.pro;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes42.dex */
public class ARRemoteLibraryLoader {
    private static final String CREATOR_NAME = "com.huawei.arengine.service.LoaderProducer";
    private static final String TAG = "ARRemoteLibraryLoader";
    private ILoaderProducer loaderProducer;
    private Context remoteContext;
    private final pro targetLibrary;

    public ILoaderProducer getRemoteCreator(Context context) {
        ILoaderProducer iLoaderProducer;
        synchronized (this) {
            if (this.loaderProducer == null) {
                ClassLoader classLoader = getRemoteContext(context).getClassLoader();
                if (classLoader == null) {
                    throw new ARLoaderException(1);
                }
                this.loaderProducer = ILoaderProducer.a.a(newBinderInstance(classLoader, CREATOR_NAME));
            }
            iLoaderProducer = this.loaderProducer;
        }
        return iLoaderProducer;
    }

    public Context getRemoteContext(Context context) {
        Context context2;
        synchronized (this) {
            if (this.remoteContext == null) {
                try {
                    if (!e.a(context, this.targetLibrary.c())) {
                        Log.e(TAG, "getRemoteContext PackageName:" + this.targetLibrary.c() + " isValidServiceApk failed!");
                        throw new ARLoaderException(1);
                    }
                    this.remoteContext = context.createPackageContext(this.targetLibrary.c(), 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    throw new ARLoaderException(1);
                }
            }
            context2 = this.remoteContext;
        }
        return context2;
    }

    private static IBinder newBinderInstance(ClassLoader classLoader, String str) {
        try {
            Object objNewInstance = classLoader.loadClass(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof IBinder) {
                return (IBinder) objNewInstance;
            }
            Log.w(TAG, "Binder new instance fail!");
            return null;
        } catch (ClassNotFoundException unused) {
            throw new IllegalStateException(str.length() != 0 ? "Find dynamic class error".concat(str) : "Find dynamic class error");
        } catch (IllegalAccessException unused2) {
            throw new IllegalStateException(str.length() != 0 ? "Call the default constructor error".concat(str) : "Call the default constructor error");
        } catch (InstantiationException unused3) {
            throw new IllegalStateException(str.length() != 0 ? "Instantiate the remote class error".concat(str) : "Instantiate the remote class error");
        } catch (NoSuchMethodException unused4) {
            throw new IllegalStateException(str.length() != 0 ? "No constructor ".concat(str) : "No constructor");
        } catch (InvocationTargetException unused5) {
            throw new IllegalStateException(str.length() != 0 ? "Invoke constructor of dynamic class error".concat(str) : "Invoke constructor of dynamic class error");
        }
    }

    public static Context getRemoteContext(Context context, String str) throws ARLoaderException {
        try {
            return context.createPackageContext(str, 3);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new ARLoaderException(1);
        }
    }

    public ARRemoteLibraryLoader(pro proVar) {
        this.targetLibrary = proVar;
    }
}
