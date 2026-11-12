package io.flutter.plugins.pathprovider;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.util.PathUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes22.dex */
public class PathProviderPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {
    private MethodChannel channel;
    private Context context;
    private final Executor uiThreadExecutor = new UiThreadExecutor();
    private final Executor executor = Executors.newSingleThreadExecutor(new ThreadFactoryBuilder().setNameFormat("path-provider-background-%d").setPriority(5).build());

    public static class UiThreadExecutor implements Executor {
        private final Handler handler;

        private UiThreadExecutor() {
            this.handler = new Handler(Looper.getMainLooper());
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.handler.post(runnable);
        }
    }

    private <T> void executeInBackground(final Callable<T> callable, final MethodChannel.Result result) {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        Futures.addCallback(settableFutureCreate, new FutureCallback<T>() { // from class: io.flutter.plugins.pathprovider.PathProviderPlugin.1
            @Override // com.google.common.util.concurrent.FutureCallback
            public void onFailure(Throwable th) {
                result.error(th.getClass().getName(), th.getMessage(), null);
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public void onSuccess(T t) {
                result.success(t);
            }
        }, this.uiThreadExecutor);
        this.executor.execute(new Runnable() { // from class: ds5
            @Override // java.lang.Runnable
            public final void run() {
                PathProviderPlugin.lambda$executeInBackground$0(settableFutureCreate, callable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getApplicationSupportDirectory, reason: merged with bridge method [inline-methods] */
    public String lambda$onMethodCall$6() {
        return PathUtils.getFilesDir(this.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPathProviderApplicationDocumentsDirectory, reason: merged with bridge method [inline-methods] */
    public String lambda$onMethodCall$2() {
        return PathUtils.getDataDirectory(this.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPathProviderExternalCacheDirectories, reason: merged with bridge method [inline-methods] */
    public List<String> lambda$onMethodCall$4() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.context.getExternalCacheDirs()) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalCacheDir = this.context.getExternalCacheDir();
            if (externalCacheDir != null) {
                arrayList.add(externalCacheDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPathProviderExternalStorageDirectories, reason: merged with bridge method [inline-methods] */
    public List<String> lambda$onMethodCall$5(String str) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.context.getExternalFilesDirs(str)) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalFilesDir = this.context.getExternalFilesDir(str);
            if (externalFilesDir != null) {
                arrayList.add(externalFilesDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPathProviderStorageDirectory, reason: merged with bridge method [inline-methods] */
    public String lambda$onMethodCall$3() {
        File externalFilesDir = this.context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPathProviderTemporaryDirectory, reason: merged with bridge method [inline-methods] */
    public String lambda$onMethodCall$1() {
        return this.context.getCacheDir().getPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$executeInBackground$0(SettableFuture settableFuture, Callable callable) {
        try {
            settableFuture.set(callable.call());
        } catch (Throwable th) {
            settableFuture.setException(th);
        }
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        PathProviderPlugin pathProviderPlugin = new PathProviderPlugin();
        pathProviderPlugin.channel = new MethodChannel(registrar.messenger(), "plugins.flutter.io/path_provider");
        pathProviderPlugin.context = registrar.context();
        pathProviderPlugin.channel.setMethodCallHandler(pathProviderPlugin);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "plugins.flutter.io/path_provider");
        this.context = flutterPluginBinding.getApplicationContext();
        this.channel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel.setMethodCallHandler(null);
        this.channel = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, @NonNull MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        switch (str) {
            case "getApplicationSupportDirectory":
                executeInBackground(new Callable() { // from class: gs5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.a.lambda$onMethodCall$6();
                    }
                }, result);
                break;
            case "getExternalCacheDirectories":
                executeInBackground(new Callable() { // from class: fs5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.a.lambda$onMethodCall$4();
                    }
                }, result);
                break;
            case "getExternalStorageDirectories":
                final String strAndroidType = StorageDirectoryMapper.androidType((Integer) methodCall.argument("type"));
                executeInBackground(new Callable() { // from class: js5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.a.lambda$onMethodCall$5(strAndroidType);
                    }
                }, result);
                break;
            case "getApplicationDocumentsDirectory":
                executeInBackground(new Callable() { // from class: es5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.a.lambda$onMethodCall$2();
                    }
                }, result);
                break;
            case "getStorageDirectory":
                executeInBackground(new Callable() { // from class: is5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.a.lambda$onMethodCall$3();
                    }
                }, result);
                break;
            case "getTemporaryDirectory":
                executeInBackground(new Callable() { // from class: hs5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.a.lambda$onMethodCall$1();
                    }
                }, result);
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
