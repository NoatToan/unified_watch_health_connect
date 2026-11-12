package com.ximalaya.ting.android.opensdk.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.media.ThumbnailUtils;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.ximalaya.ting.android.opensdk.httputil.BaseBuilder;
import com.ximalaya.ting.android.opensdk.httputil.BaseCall;
import com.ximalaya.ting.android.opensdk.httputil.Config;
import com.ximalaya.ting.android.opensdk.httputil.XimalayaException;
import com.ximalaya.ting.android.opensdk.httputil.util.freeflow.FreeFlowServiceUtil;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.player.MD5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes22.dex */
public class FileUtilBase {
    private static final int MAX_DISK_CACHE_SIZE = 52428800;
    private static final int MIN_DISK_CACHE_SIZE = 5242880;
    private static String PERPETUAL_CACHE_PATH = null;
    private static final String PICASSO_CACHE = "picasso-cache";
    private static String PICASSO_CACHE_PATH;
    private static Config config;
    private static String lastImageUrl;
    private static Cache mCache;
    private static OkHttpClient mOkHttpClient;
    private static Bitmap tempBitmap;
    private static ExecutorService executorService = Executors.newCachedThreadPool();
    private static Map<String, Set<RequestCallBackModel>> callBackMaps = new ConcurrentHashMap();

    public interface IBitmapDownOkCallBack {
        void onSuccess(Bitmap bitmap);
    }

    public static class RequestCallBackModel {
        public IBitmapDownOkCallBack bitmapDownOkCallBack;
        public int height;
        public int width;

        public RequestCallBackModel(IBitmapDownOkCallBack iBitmapDownOkCallBack, int i, int i2) {
            this.bitmapDownOkCallBack = iBitmapDownOkCallBack;
            this.width = i;
            this.height = i2;
        }
    }

    public static long calculateDiskCacheSize(File file) {
        long blockCount;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCount = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            blockCount = 5242880;
        }
        return Math.max(Math.min(blockCount, 52428800L), CacheDataSink.DEFAULT_FRAGMENT_SIZE);
    }

    public static int calculateInSampleSize(@NonNull BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            while (true) {
                if (i3 / i5 <= i2 && i4 / i5 <= i) {
                    break;
                }
                i5 *= 2;
            }
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void callBackResult(Bitmap bitmap, String str) {
        int i;
        Set<RequestCallBackModel> set = callBackMaps.get(str);
        if (set != null) {
            for (RequestCallBackModel requestCallBackModel : set) {
                if (requestCallBackModel != null && requestCallBackModel.bitmapDownOkCallBack != null && (bitmap == null || !bitmap.isRecycled())) {
                    int i2 = requestCallBackModel.width;
                    if (i2 <= 0 || (i = requestCallBackModel.height) <= 0) {
                        handleBitmapCallBack(requestCallBackModel.bitmapDownOkCallBack, bitmap);
                    } else {
                        handleBitmapCallBack(requestCallBackModel.bitmapDownOkCallBack, ThumbnailUtils.extractThumbnail(bitmap, i2, i));
                    }
                } else if (requestCallBackModel != null) {
                    handleBitmapCallBack(requestCallBackModel.bitmapDownOkCallBack, null);
                }
            }
            callBackMaps.remove(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0068 A[Catch: IOException -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #11 {IOException -> 0x006c, blocks: (B:27:0x0046, B:48:0x0068), top: B:78:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.InputStream] */
    public static int copyAssetsToFile(AssetManager assetManager, String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    assetManager = assetManager.open(str);
                    try {
                        File file = new File(str2);
                        if (file.exists() && file.length() > 0) {
                            if (assetManager != 0) {
                                try {
                                    assetManager.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            return 0;
                        }
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i = assetManager.read(bArr);
                                if (i <= 0) {
                                    break;
                                }
                                if (i > 0) {
                                    fileOutputStream2.write(bArr, 0, i);
                                }
                            }
                            fileOutputStream2.flush();
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            assetManager.close();
                        } catch (Exception e3) {
                            e = e3;
                            fileOutputStream = fileOutputStream2;
                            e.printStackTrace();
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            if (assetManager != 0) {
                                assetManager.close();
                            }
                            return 0;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            if (assetManager == 0) {
                                throw th;
                            }
                            try {
                                assetManager.close();
                                throw th;
                            } catch (IOException e6) {
                                e6.printStackTrace();
                                throw th;
                            }
                        }
                        return 0;
                    } catch (Exception e7) {
                        e = e7;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e8) {
                e = e8;
                assetManager = 0;
            } catch (Throwable th3) {
                th = th3;
                assetManager = 0;
            }
            e.printStackTrace();
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (assetManager != 0) {
                assetManager.close();
            }
        } catch (IOException e9) {
            e9.printStackTrace();
        }
        return 0;
    }

    public static File createDefaultCacheDir(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), PICASSO_CACHE);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Nullable
    @WorkerThread
    public static Bitmap decode(@Nullable String str, int i, int i2) {
        Bitmap bitmapDecodeFile;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (i > 0 || i2 > 0) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                options.inSampleSize = calculateInSampleSize(options, i, i2);
                options.inJustDecodeBounds = false;
                bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
            } else {
                bitmapDecodeFile = BitmapFactory.decodeFile(str);
            }
            ExifInterface exif = getExif(str);
            return exif != null ? rotateBitmap(bitmapDecodeFile, exifToDegrees(exif.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1))) : bitmapDecodeFile;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap decodeStream(InputStream inputStream, int i, int i2) throws IOException {
        MarkableInputStream markableInputStream = new MarkableInputStream(inputStream);
        markableInputStream.allowMarksToExpire(false);
        long jSavePosition = markableInputStream.savePosition(1024);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        boolean zIsWebPFile = isWebPFile(markableInputStream);
        markableInputStream.reset(jSavePosition);
        if (zIsWebPFile) {
            byte[] byteArray = toByteArray(markableInputStream);
            BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
            options.inSampleSize = calculateInSampleSize(options, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        }
        BitmapFactory.decodeStream(markableInputStream, null, options);
        options.inSampleSize = calculateInSampleSize(options, i, i2);
        options.inJustDecodeBounds = false;
        markableInputStream.reset(jSavePosition);
        markableInputStream.allowMarksToExpire(true);
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(markableInputStream, null, options);
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    public static void deleFileNoCheckDownloadFile(File file) {
        if (file == null) {
            return;
        }
        if (!file.isDirectory()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                deleFileNoCheckDownloadFile(file2);
            }
        }
        file.delete();
    }

    private static int exifToDegrees(int i) {
        if (i == 6) {
            return 90;
        }
        if (i == 3) {
            return 180;
        }
        return i == 8 ? 270 : 0;
    }

    public static String getAdsCacheDir(Context context, String str) {
        String str2;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            str2 = Environment.getExternalStorageDirectory().getPath() + "/Android/data/" + context.getPackageName() + "/files/soundtiepian";
        } else {
            str2 = context.getFilesDir().getPath() + "/soundtiepian";
        }
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str2 + File.separator + str;
    }

    public static String getAssetsCacheDir(Context context, String str) {
        String str2;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            str2 = Environment.getExternalStorageDirectory().getPath() + "/Android/data/" + context.getPackageName() + "/files/assets";
        } else {
            str2 = context.getFilesDir().getPath() + "/assets";
        }
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str2 + File.separator + str;
    }

    public static void getBitmapByUrl(Context context, Track track, int i, int i2, IBitmapDownOkCallBack iBitmapDownOkCallBack) {
        getBitmapByUrl(context, track, getLargeImgUrl(track), i, i2, iBitmapDownOkCallBack, false);
    }

    public static void getBitmapByUrlAndNotConcurrence(Context context, Track track, int i, int i2, IBitmapDownOkCallBack iBitmapDownOkCallBack) {
        getBitmapByUrl(context, track, getLargeImgUrl(track), i, i2, iBitmapDownOkCallBack, true);
    }

    @WorkerThread
    public static Bitmap getBitmapThread(Context context, String str, int i, int i2) {
        Bitmap bitmapDecodeStream;
        if (context == null) {
            return null;
        }
        if (i2 <= 0) {
            i2 = getScreenHeight(context);
        }
        if (i <= 0) {
            i = getScreenWidth(context);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(PICASSO_CACHE);
        PICASSO_CACHE_PATH = sb.toString();
        File externalFilesDir = context.getExternalFilesDir("images");
        if (externalFilesDir == null || !externalFilesDir.exists()) {
            PERPETUAL_CACHE_PATH = PICASSO_CACHE_PATH;
        } else {
            PERPETUAL_CACHE_PATH = externalFilesDir.getAbsolutePath() + str2 + "images";
        }
        String str3 = PICASSO_CACHE_PATH + str2 + MD5.md5(str) + ".1";
        boolean zExists = new File(str3).exists();
        if (!zExists) {
            String str4 = PERPETUAL_CACHE_PATH + str2 + urlToOldFileName(str);
            zExists = new File(str4).exists();
            if (zExists) {
                str3 = str4;
            }
        }
        if (zExists) {
            return decode(str3, i, i2);
        }
        CacheControl cacheControlBuild = !NetworkType.isConnectTONetWork(context) ? CacheControl.FORCE_CACHE : new CacheControl.Builder().build();
        try {
            Request.Builder builderTag = BaseBuilder.urlGet(reduceHttpsToHttp(context, str)).tag(str);
            if (cacheControlBuild != null) {
                builderTag.cacheControl(cacheControlBuild);
            }
            try {
                Response responseExecute = FirebasePerfOkHttpClient.execute(getOkHttpClient(context).newCall(builderTag.build()));
                if (responseExecute != null && responseExecute.code() == 200) {
                    if (new File(str3).exists()) {
                        responseExecute.body().close();
                        return decode(str3, i, i2);
                    }
                    if (responseExecute.body().contentLength() > 31457280) {
                        return null;
                    }
                    InputStream inputStreamByteStream = responseExecute.body().byteStream();
                    try {
                        bitmapDecodeStream = decodeStream(inputStreamByteStream, i, i2);
                    } catch (Exception e) {
                        e.printStackTrace();
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamByteStream);
                    }
                    Util.closeQuietly(inputStreamByteStream);
                    return bitmapDecodeStream;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } catch (XimalayaException | Exception unused) {
        }
        return null;
    }

    public static Cache getCache(Context context) {
        if (mCache == null) {
            synchronized (FileUtilBase.class) {
                if (mCache == null) {
                    File fileCreateDefaultCacheDir = createDefaultCacheDir(context);
                    mCache = new Cache(fileCreateDefaultCacheDir, calculateDiskCacheSize(fileCreateDefaultCacheDir));
                }
            }
        }
        return mCache;
    }

    @Nullable
    private static ExifInterface getExif(@NonNull String str) {
        try {
            return new ExifInterface(str);
        } catch (IOException unused) {
            return null;
        }
    }

    private static String getLargeImgUrl(Track track) {
        return getNotifiAndRemoteImgUrl(track);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getNotifiAndRemoteImgUrl(Track track) {
        if (track != null) {
            if (!TextUtils.isEmpty(track.getCoverUrlMiddle())) {
                return track.getCoverUrlMiddle();
            }
            if (!TextUtils.isEmpty(track.getCoverUrlSmall())) {
                return track.getCoverUrlSmall();
            }
            if (!TextUtils.isEmpty(track.getCoverUrlLarge())) {
                return track.getCoverUrlLarge();
            }
        }
        return "";
    }

    private static OkHttpClient getOkHttpClient(Context context) {
        if (mOkHttpClient == null) {
            synchronized (FileUtilBase.class) {
                if (mOkHttpClient == null) {
                    OkHttpClient okHttpClient = BaseCall.getInstanse().getOkHttpClient((URL) null);
                    mOkHttpClient = okHttpClient;
                    OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
                    builderNewBuilder.cache(getCache(context));
                    mOkHttpClient = builderNewBuilder.build();
                }
            }
        }
        return mOkHttpClient;
    }

    public static int getScreenHeight(Context context) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 1;
        }
        int i = resources.getDisplayMetrics().widthPixels;
        int i2 = resources.getDisplayMetrics().heightPixels;
        return i > i2 ? i : i2;
    }

    public static int getScreenWidth(Context context) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 1;
        }
        int i = resources.getDisplayMetrics().widthPixels;
        int i2 = resources.getDisplayMetrics().heightPixels;
        return i < i2 ? i : i2;
    }

    public static void handleBitmapCallBack(final IBitmapDownOkCallBack iBitmapDownOkCallBack, final Bitmap bitmap) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.util.FileUtilBase.1
            @Override // java.lang.Runnable
            public void run() {
                if (iBitmapDownOkCallBack != null) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 == null || bitmap2.isRecycled()) {
                        iBitmapDownOkCallBack.onSuccess(null);
                        return;
                    }
                    try {
                        iBitmapDownOkCallBack.onSuccess(bitmap);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        });
    }

    public static boolean isWebPFile(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[12];
        return inputStream.read(bArr, 0, 12) == 12 && "RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) && "WEBP".equals(new String(bArr, 8, 4, "US-ASCII"));
    }

    public static String reduceHttpsToHttp(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            str.startsWith("http://");
        }
        return str;
    }

    public static void release() {
        lastImageUrl = null;
        PICASSO_CACHE_PATH = null;
        tempBitmap = null;
        callBackMaps.clear();
        mOkHttpClient = null;
        mCache = null;
    }

    public static Bitmap rotateBitmap(@Nullable Bitmap bitmap, int i) {
        if (bitmap == null || i == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        return bitmap != bitmapCreateBitmap ? bitmapCreateBitmap : bitmap;
    }

    public static void setProxy(Context context, Config config2) {
        OkHttpClient okHttpClient = mOkHttpClient;
        if (okHttpClient == null) {
            return;
        }
        mOkHttpClient = FreeFlowServiceUtil.updateProxyToBuilder(context, config2, okHttpClient.newBuilder(), false).build();
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static String urlToOldFileName(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return null;
        }
        return MD5.md5(str) + str.substring(iLastIndexOf + 1);
    }

    private static void getBitmapByUrl(Context context, Track track, String str, int i, int i2, IBitmapDownOkCallBack iBitmapDownOkCallBack, boolean z) {
        if (TextUtils.isEmpty(str) || "null".equals(str)) {
            if (iBitmapDownOkCallBack != null) {
                iBitmapDownOkCallBack.onSuccess(null);
                return;
            }
            return;
        }
        if (context == null) {
            if (iBitmapDownOkCallBack != null) {
                iBitmapDownOkCallBack.onSuccess(null);
                return;
            }
            return;
        }
        synchronized (FileUtilBase.class) {
            if (z) {
                ExecutorService executorService2 = executorService;
                if (executorService2 == null || executorService2.isShutdown()) {
                    executorService = Executors.newCachedThreadPool();
                }
                try {
                    executorService.execute(new GetBitmapRunnable(context, str, i, i2, iBitmapDownOkCallBack, track));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return;
            }
            boolean z2 = false;
            if (str.equals(lastImageUrl)) {
                Bitmap bitmap = tempBitmap;
                if (bitmap != null && !bitmap.isRecycled() && iBitmapDownOkCallBack != null) {
                    iBitmapDownOkCallBack.onSuccess(tempBitmap);
                    return;
                }
            } else {
                lastImageUrl = str;
                callBackMaps.clear();
                tempBitmap = null;
            }
            Set<RequestCallBackModel> copyOnWriteArraySet = callBackMaps.get(str);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                z2 = true;
            }
            copyOnWriteArraySet.add(new RequestCallBackModel(iBitmapDownOkCallBack, i, i2));
            callBackMaps.put(str, copyOnWriteArraySet);
            if (z2) {
                ExecutorService executorService3 = executorService;
                if (executorService3 == null || executorService3.isShutdown()) {
                    executorService = Executors.newCachedThreadPool();
                }
                try {
                    executorService.execute(new GetBitmapRunnable(context, str, track));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                return;
            }
            return;
            throw th;
        }
    }

    public static class GetBitmapRunnable implements Runnable {
        public IBitmapDownOkCallBack bitmapDownOkCallBack;
        private Context context;
        private String imgPath;
        public int requestHeight;
        public int requestWidth;
        private Track track;
        private long trackId;

        public GetBitmapRunnable(Context context, String str, int i, int i2, IBitmapDownOkCallBack iBitmapDownOkCallBack, Track track) {
            this(context, str, track);
            this.requestWidth = i;
            this.requestHeight = i2;
            this.bitmapDownOkCallBack = iBitmapDownOkCallBack;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0027  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
        
            if ((r7.trackId + "").equals(com.ximalaya.ting.android.opensdk.util.FileUtilBase.lastImageUrl) != false) goto L26;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            boolean z;
            String str = this.imgPath;
            if (str != null) {
                if (str.equals(this.trackId + "")) {
                    this.imgPath = FileUtilBase.getNotifiAndRemoteImgUrl(this.track);
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            Bitmap bitmapThread = null;
            try {
                if (!TextUtils.isEmpty(this.imgPath)) {
                    bitmapThread = FileUtilBase.getBitmapThread(this.context, this.imgPath, this.requestWidth, this.requestHeight);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            IBitmapDownOkCallBack iBitmapDownOkCallBack = this.bitmapDownOkCallBack;
            if (iBitmapDownOkCallBack != null) {
                FileUtilBase.handleBitmapCallBack(iBitmapDownOkCallBack, bitmapThread);
                return;
            }
            if (!this.imgPath.equals(FileUtilBase.lastImageUrl)) {
                if (z) {
                }
                FileUtilBase.callBackMaps.remove(this.imgPath);
                return;
            }
            Bitmap unused = FileUtilBase.tempBitmap = bitmapThread;
            FileUtilBase.callBackResult(FileUtilBase.tempBitmap, FileUtilBase.lastImageUrl);
        }

        public GetBitmapRunnable(Context context, String str, int i, int i2, Track track) {
            this(context, str, i, i2, null, track);
        }

        public GetBitmapRunnable(Context context, String str, Track track) {
            this.context = context;
            this.imgPath = str;
            this.track = track;
            if (track != null) {
                this.trackId = track.getDataId();
            }
        }
    }
}
