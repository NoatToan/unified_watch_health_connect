package com.huawei.remoteLoader.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Log;
import com.huawei.arengine.remoteLoader.IDynamicLoader;
import com.huawei.arengine.remoteLoader.ILoaderProducer;
import dalvik.system.DexClassLoader;
import defpackage.pro;
import java.io.File;

/* JADX INFO: loaded from: classes42.dex */
public final class ARDynamiteClient {
    private static final String LIB32_DIR_NAME = "lib";
    private static final String LIB64_DIR_NAME = "lib64";
    private static final String TAG = "ARDynamiteClient";
    private static DexClassLoader cl;
    protected static Object syncObject = new Object();
    private static final ArrayMap<pro, ARRemoteLibraryLoader> TARGET_LIBRARIES = new ArrayMap<>();
    private static ARRemoteLibraryLoader remoteLibLoader = null;
    private static pro info = null;
    private static ILoaderProducer loaderProducer = null;
    private static IDynamicLoader loader = null;
    private static String fileName = null;
    private static Context loaderContext = null;

    public static boolean updateResourceFromRemote(String str, String str2) {
        synchronized (ARDynamiteClient.class) {
            IDynamicLoader iDynamicLoader = loader;
            if (iDynamicLoader != null) {
                try {
                    return iDynamicLoader.updateResourceFromRemote(str, str2);
                } catch (RemoteException unused) {
                    Log.e(TAG, "updateResourceFromRemote Exception");
                    return false;
                }
            }
            Log.e(TAG, "Failed to load native library " + info + " from remote package: no loader available.");
            return false;
        }
    }

    public static String unzipBaseApkGetDex(Context context, String str) {
        Log.i(TAG, "SDK version name is :[4.0.0.5],version code is :[158]");
        String absolutePath = context.getFilesDir().getAbsolutePath();
        deleteCachedFile(str, absolutePath);
        synchronized (syncObject) {
            fileName = str;
            loaderContext = context;
        }
        return absolutePath;
    }

    public static long loadNativeRemoteLibrary(Context context, String str, String str2) {
        String str3;
        String str4;
        synchronized (ARDynamiteClient.class) {
            if (loader != null) {
                return loader.openLibrary(str2);
            }
            pro proVar = new pro(str, str2);
            info = proVar;
            ARRemoteLibraryLoader remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(proVar);
            remoteLibLoader = remoteLibraryLoaderFromInfo;
            try {
                loaderProducer = remoteLibraryLoaderFromInfo.getRemoteCreator(context);
                loader = loaderProducer.newDynamicLoader(ARObjectWrapper.wrap(remoteLibLoader.getRemoteContext(context)), ARObjectWrapper.wrap(context));
                try {
                    return loader.openLibrary(str2);
                } catch (RemoteException unused) {
                    str3 = TAG;
                    str4 = "Exception";
                    Log.e(str3, str4);
                    return 0L;
                } catch (UnsatisfiedLinkError unused2) {
                    str3 = TAG;
                    str4 = "UnsatisfiedLinkError";
                    Log.e(str3, str4);
                    return 0L;
                }
            } catch (RemoteException | ARLoaderException | IllegalStateException unused3) {
                Log.e(TAG, "Failed to load native Remote library!");
                loader = null;
                info = null;
                remoteLibLoader = null;
                loaderProducer = null;
                return 0L;
            }
            throw th;
        }
    }

    private static void initDexLoader(Context context, String str) {
        cl = new DexClassLoader(context.getFilesDir().getAbsolutePath() + File.separator + str, context.getCacheDir().getAbsolutePath(), null, context.getClassLoader());
        Log.i(TAG, "initDexLoader");
    }

    private static ARRemoteLibraryLoader getRemoteLibraryLoaderFromInfo(pro proVar) {
        ARRemoteLibraryLoader aRRemoteLibraryLoader;
        synchronized (ARDynamiteClient.class) {
            ArrayMap<pro, ARRemoteLibraryLoader> arrayMap = TARGET_LIBRARIES;
            aRRemoteLibraryLoader = arrayMap.get(proVar);
            if (aRRemoteLibraryLoader == null) {
                aRRemoteLibraryLoader = new ARRemoteLibraryLoader(proVar);
                arrayMap.put(proVar, aRRemoteLibraryLoader);
            }
        }
        return aRRemoteLibraryLoader;
    }

    public static ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        synchronized (ARDynamiteClient.class) {
            ARRemoteLibraryLoader remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(new pro(str, str2));
            Log.d(TAG, "getRemoteClassLoader[" + str2 + "]");
            try {
                Context remoteContext = remoteLibraryLoaderFromInfo.getRemoteContext(context);
                if (remoteContext == null) {
                    return null;
                }
                return remoteContext.getClassLoader();
            } catch (ARLoaderException e) {
                Log.e(TAG, "getRemoteClassLoader error: ", e);
                return null;
            }
        }
    }

    public static Class<?> getLoadClass(String str) {
        String str2;
        if (str == null) {
            Log.e(TAG, "Input is null!");
            return null;
        }
        synchronized (syncObject) {
            if (cl == null) {
                String str3 = TAG;
                Log.i(str3, "Need to init Loader");
                if (fileName == null) {
                    str2 = "FileName is null,failed to init loader!";
                } else if (loaderContext == null) {
                    str2 = "LoaderContext is null,failed to init loader!";
                } else {
                    Log.i(str3, "Start init Loader");
                    initDexLoader(loaderContext, fileName);
                }
                Log.e(str3, str2);
                return null;
            }
            try {
                return cl.loadClass(str);
            } catch (ClassNotFoundException unused) {
                Log.w(TAG, "getLoadClass class not found: " + str);
                return null;
            }
        }
    }

    private static void deleteCachedFile(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        File file = new File(sb.toString());
        if (!file.exists()) {
            Log.i(TAG, "No cached jar file!");
        } else if (!file.isFile()) {
            Log.e(TAG, "Path is invalid!");
        } else if (file.delete()) {
            Log.w(TAG, "Cached jar file is deleted!");
        } else {
            Log.e(TAG, "Delete failed!");
        }
        File file2 = new File(str2 + str3 + "hmsrootcas.bks");
        if (!file2.exists()) {
            Log.i(TAG, "No cached ca file!");
            return;
        }
        if (!file2.isFile()) {
            Log.e(TAG, "Path is invalid!");
        } else if (file2.delete()) {
            Log.w(TAG, "Cached ca file is deleted!");
        } else {
            Log.e(TAG, "Delete failed!");
        }
    }

    public static boolean CheckUpdate(Context context, String str, String str2, boolean z) {
        synchronized (ARDynamiteClient.class) {
            if (info != null) {
                return false;
            }
            pro proVar = new pro(str, str2);
            info = proVar;
            ARRemoteLibraryLoader remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(proVar);
            remoteLibLoader = remoteLibraryLoaderFromInfo;
            try {
                loaderProducer = remoteLibraryLoaderFromInfo.getRemoteCreator(context);
                IDynamicLoader iDynamicLoaderNewDynamicLoader = loaderProducer.newDynamicLoader(ARObjectWrapper.wrap(remoteLibLoader.getRemoteContext(context)), ARObjectWrapper.wrap(context));
                loader = iDynamicLoaderNewDynamicLoader;
                return iDynamicLoaderNewDynamicLoader.checkUpdate(158L, z);
            } catch (RemoteException | ARLoaderException | IllegalStateException unused) {
                loader = null;
                info = null;
                remoteLibLoader = null;
                loaderProducer = null;
                return false;
            }
        }
    }

    private ARDynamiteClient() {
    }
}
