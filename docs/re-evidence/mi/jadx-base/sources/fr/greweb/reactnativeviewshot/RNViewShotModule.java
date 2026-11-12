package fr.greweb.reactnativeviewshot;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.xiaomi.smarthome.framework.plugin.rn.viewshot.ViewShot;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class RNViewShotModule extends ReactContextBaseJavaModule {
    public static final String RNVIEW_SHOT = "RNViewShot";
    private static final String TEMP_FILE_PREFIX = "ReactNative-snapshot-image";
    private final ReactApplicationContext reactContext;

    public static class a extends GuardedAsyncTask<Void, Void> implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f18104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f18105b;

        private void a(File file) {
            File[] fileArrListFiles = file.listFiles(this);
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.delete()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("deleted file: ");
                        sb.append(file2.getAbsolutePath());
                    }
                }
            }
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(RNViewShotModule.TEMP_FILE_PREFIX);
        }

        public a(ReactContext reactContext) {
            super(reactContext);
            this.f18104a = reactContext.getCacheDir();
            this.f18105b = reactContext.getExternalCacheDir();
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            File file = this.f18104a;
            if (file != null) {
                a(file);
            }
            File file2 = this.f18105b;
            if (file2 != null) {
                a(file2);
            }
        }
    }

    public RNViewShotModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private File createTempFile(Context context, String str, String str2) throws IOException {
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException("No cache directory available");
        }
        if (externalCacheDir == null || (cacheDir != null && externalCacheDir.getFreeSpace() <= cacheDir.getFreeSpace())) {
            externalCacheDir = cacheDir;
        }
        String str3 = "." + str;
        return str2 != null ? File.createTempFile(str2, str3, externalCacheDir) : File.createTempFile(TEMP_FILE_PREFIX, str3, externalCacheDir);
    }

    @ReactMethod
    public void captureRef(int i, ReadableMap readableMap, Promise promise) {
        int i2;
        DisplayMetrics displayMetrics = getReactApplicationContext().getResources().getDisplayMetrics();
        String string = readableMap.getString("format");
        if ("jpg".equals(string)) {
            i2 = 0;
        } else if ("webm".equals(string)) {
            i2 = 2;
        } else {
            i2 = "raw".equals(string) ? -1 : 1;
        }
        double d = readableMap.getDouble("quality");
        Integer numValueOf = readableMap.hasKey("width") ? Integer.valueOf((int) (((double) displayMetrics.density) * readableMap.getDouble("width"))) : null;
        Integer numValueOf2 = readableMap.hasKey("height") ? Integer.valueOf((int) (((double) displayMetrics.density) * readableMap.getDouble("height"))) : null;
        String string2 = readableMap.getString("result");
        String string3 = readableMap.hasKey("fileName") ? readableMap.getString("fileName") : null;
        try {
            ((UIManagerModule) this.reactContext.getNativeModule(UIManagerModule.class)).addUIBlock(new fr.greweb.reactnativeviewshot.a(i, string, i2, d, numValueOf, numValueOf2, ViewShot.Results.TEMP_FILE.equals(string2) ? createTempFile(getReactApplicationContext(), string, string3) : null, string2, Boolean.valueOf(readableMap.getBoolean("snapshotContentContainer")), this.reactContext, getCurrentActivity(), promise));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to snapshot view tag ");
            sb.append(i);
            promise.reject(ViewShot.ERROR_UNABLE_TO_SNAPSHOT, "Failed to snapshot view tag " + i);
        }
    }

    @ReactMethod
    public void captureScreen(ReadableMap readableMap, Promise promise) {
        captureRef(-1, readableMap, promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.emptyMap();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return RNVIEW_SHOT;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        new a(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void releaseCapture(String str) {
        String path = Uri.parse(str).getPath();
        if (path == null) {
            return;
        }
        File file = new File(path);
        if (file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile.equals(this.reactContext.getExternalCacheDir()) || parentFile.equals(this.reactContext.getCacheDir())) {
                file.delete();
            }
        }
    }
}
