package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import ch.qos.logback.core.net.SyslogConstants;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.LottieCompositionCache;
import com.airbnb.lottie.network.NetworkCache;
import com.airbnb.lottie.parser.LottieCompositionMoshiParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.google.common.base.Ascii;
import com.google.mlkit.common.sdkinternal.Constants;
import j20.x;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;
import w5.r;
import w63.b0;
import w63.b0.a;
import w63.g0;

/* JADX INFO: loaded from: classes7.dex */
public class LottieCompositionFactory {
    private static final Map<String, LottieTask<LottieComposition>> taskCache = new HashMap();
    private static final Set<LottieTaskIdleListener> taskIdleListeners = new HashSet();
    private static final byte[] ZIP_MAGIC = {80, 75, 3, 4};
    private static final byte[] GZIP_MAGIC = {Ascii.US, -117, 8};

    private LottieCompositionFactory() {
    }

    private static LottieTask<LottieComposition> cache(final String str, Callable<LottieResult<LottieComposition>> callable, Runnable runnable) {
        LottieComposition lottieComposition = str == null ? null : LottieCompositionCache.getInstance().get(str);
        LottieTask<LottieComposition> lottieTask = lottieComposition != null ? new LottieTask<>(lottieComposition) : null;
        if (str != null) {
            Map<String, LottieTask<LottieComposition>> map = taskCache;
            if (map.containsKey(str)) {
                lottieTask = map.get(str);
            }
        }
        if (lottieTask != null) {
            if (runnable != null) {
                runnable.run();
            }
            return lottieTask;
        }
        LottieTask<LottieComposition> lottieTask2 = new LottieTask<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i14 = 0;
            lottieTask2.addListener(new LottieListener() { // from class: com.airbnb.lottie.i
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    switch (i14) {
                        case 0:
                            LottieCompositionFactory.lambda$cache$18(str, atomicBoolean, (LottieComposition) obj);
                            break;
                        default:
                            LottieCompositionFactory.lambda$cache$19(str, atomicBoolean, (Throwable) obj);
                            break;
                    }
                }
            });
            final int i15 = 1;
            lottieTask2.addFailureListener(new LottieListener() { // from class: com.airbnb.lottie.i
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    switch (i15) {
                        case 0:
                            LottieCompositionFactory.lambda$cache$18(str, atomicBoolean, (LottieComposition) obj);
                            break;
                        default:
                            LottieCompositionFactory.lambda$cache$19(str, atomicBoolean, (Throwable) obj);
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, LottieTask<LottieComposition>> map2 = taskCache;
                map2.put(str, lottieTask2);
                if (map2.size() == 1) {
                    notifyTaskCacheIdleListeners(false);
                }
            }
        }
        return lottieTask2;
    }

    public static void clearCache(Context context, boolean z14) {
        NetworkCache networkCache;
        taskCache.clear();
        LottieCompositionCache.getInstance().clear();
        if (!z14 || (networkCache = L.networkCache(context)) == null) {
            return;
        }
        networkCache.clear();
    }

    private static LottieImageAsset findImageAssetForFileName(LottieComposition lottieComposition, String str) {
        for (LottieImageAsset lottieImageAsset : lottieComposition.getImages().values()) {
            if (lottieImageAsset.getFileName().equals(str)) {
                return lottieImageAsset;
            }
        }
        return null;
    }

    public static LottieTask<LottieComposition> fromAsset(Context context, String str) {
        return fromAsset(context, str, "asset_" + str);
    }

    public static LottieResult<LottieComposition> fromAssetSync(Context context, String str, String str2) {
        LottieComposition lottieComposition = str2 == null ? null : LottieCompositionCache.getInstance().get(str2);
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        try {
            return fromInputStreamSync(context, context.getAssets().open(str), str2);
        } catch (IOException e4) {
            return new LottieResult<>((Throwable) e4);
        }
    }

    public static LottieTask<LottieComposition> fromInputStream(Context context, InputStream inputStream, String str) {
        return cache(str, new k(context == null ? null : context.getApplicationContext(), 0, inputStream, str), null);
    }

    public static LottieResult<LottieComposition> fromInputStreamSync(Context context, InputStream inputStream, String str) {
        LottieComposition lottieComposition = str == null ? null : LottieCompositionCache.getInstance().get(str);
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        try {
            b0 b0Var = new b0(r.y(inputStream));
            if (isZipCompressed(b0Var).booleanValue()) {
                return fromZipStreamSync(context, new ZipInputStream(b0Var.new a()), str);
            }
            return isGzipCompressed(b0Var).booleanValue() ? fromJsonInputStreamSync(new GZIPInputStream(b0Var.new a()), str) : fromJsonReaderSync(JsonReader.of(b0Var), str);
        } catch (IOException e4) {
            return new LottieResult<>((Throwable) e4);
        }
    }

    @Deprecated
    public static LottieTask<LottieComposition> fromJson(JSONObject jSONObject, String str) {
        return cache(str, new b(5, str, jSONObject), null);
    }

    public static LottieTask<LottieComposition> fromJsonInputStream(InputStream inputStream, String str) {
        return cache(str, new b(4, str, inputStream), new e(inputStream, 2));
    }

    public static LottieResult<LottieComposition> fromJsonInputStreamSync(InputStream inputStream, String str, boolean z14) {
        return fromJsonSourceSync(r.y(inputStream), str, z14);
    }

    public static LottieTask<LottieComposition> fromJsonReader(JsonReader jsonReader, String str) {
        return cache(str, new b(3, str, jsonReader), new e(jsonReader, 0));
    }

    public static LottieResult<LottieComposition> fromJsonReaderSync(JsonReader jsonReader, String str) {
        return fromJsonReaderSync(jsonReader, str, true);
    }

    private static LottieResult<LottieComposition> fromJsonReaderSyncInternal(JsonReader jsonReader, String str, boolean z14) {
        try {
            LottieComposition lottieComposition = str == null ? null : LottieCompositionCache.getInstance().get(str);
            if (lottieComposition != null) {
                return new LottieResult<>(lottieComposition);
            }
            LottieComposition lottieComposition2 = LottieCompositionMoshiParser.parse(jsonReader);
            if (str != null) {
                LottieCompositionCache.getInstance().put(str, lottieComposition2);
            }
            return new LottieResult<>(lottieComposition2);
        } catch (Exception e4) {
            return new LottieResult<>((Throwable) e4);
        } finally {
            if (z14) {
                Utils.closeQuietly(jsonReader);
            }
        }
    }

    public static LottieTask<LottieComposition> fromJsonSource(g0 g0Var, String str) {
        return cache(str, new b(1, str, g0Var), new e(g0Var, 1));
    }

    public static LottieResult<LottieComposition> fromJsonSourceSync(g0 g0Var, String str, boolean z14) {
        return fromJsonReaderSyncInternal(JsonReader.of(r.d(g0Var)), str, z14);
    }

    public static LottieTask<LottieComposition> fromJsonString(String str, String str2) {
        return cache(str2, new b(str, str2), null);
    }

    public static LottieResult<LottieComposition> fromJsonStringSync(String str, String str2) {
        return fromJsonSourceSync(r.y(new ByteArrayInputStream(str.getBytes())), str2);
    }

    @Deprecated
    public static LottieResult<LottieComposition> fromJsonSync(JSONObject jSONObject, String str) {
        return fromJsonStringSync(jSONObject.toString(), str);
    }

    public static LottieTask<LottieComposition> fromRawRes(Context context, final int i14, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return cache(str, new Callable() { // from class: com.airbnb.lottie.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.lambda$fromRawRes$3(weakReference, applicationContext, i14, str);
            }
        }, null);
    }

    public static LottieResult<LottieComposition> fromRawResSync(Context context, int i14, String str) {
        LottieComposition lottieComposition = str == null ? null : LottieCompositionCache.getInstance().get(str);
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        try {
            b0 b0Var = new b0(r.y(context.getResources().openRawResource(i14)));
            if (isZipCompressed(b0Var).booleanValue()) {
                return fromZipStreamSync(context, new ZipInputStream(b0Var.new a()), str);
            }
            if (!isGzipCompressed(b0Var).booleanValue()) {
                return fromJsonReaderSync(JsonReader.of(b0Var), str);
            }
            try {
                return fromJsonInputStreamSync(new GZIPInputStream(b0Var.new a()), str);
            } catch (IOException e4) {
                return new LottieResult<>((Throwable) e4);
            }
        } catch (Resources.NotFoundException e14) {
            return new LottieResult<>((Throwable) e14);
        }
    }

    public static LottieTask<LottieComposition> fromUrl(Context context, String str) {
        return fromUrl(context, str, "url_" + str);
    }

    public static LottieResult<LottieComposition> fromUrlSync(Context context, String str, String str2) {
        LottieComposition lottieComposition = str2 == null ? null : LottieCompositionCache.getInstance().get(str2);
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        LottieResult<LottieComposition> lottieResultFetchSync = L.networkFetcher(context).fetchSync(context, str, str2);
        if (str2 != null && lottieResultFetchSync.getValue() != null) {
            LottieCompositionCache.getInstance().put(str2, lottieResultFetchSync.getValue());
        }
        return lottieResultFetchSync;
    }

    public static LottieTask<LottieComposition> fromZipStream(Context context, ZipInputStream zipInputStream, String str, boolean z14) {
        return cache(str, new g(context, zipInputStream, str, 1), z14 ? new h(zipInputStream, 1) : null);
    }

    public static LottieResult<LottieComposition> fromZipStreamSync(Context context, ZipInputStream zipInputStream, String str, boolean z14) {
        try {
            return fromZipStreamSyncInternal(context, zipInputStream, str);
        } finally {
            if (z14) {
                Utils.closeQuietly(zipInputStream);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x014c A[Catch: IOException -> 0x02ae, TryCatch #4 {IOException -> 0x02ae, blocks: (B:7:0x0019, B:9:0x001f, B:12:0x0028, B:14:0x0034, B:75:0x017c, B:15:0x0039, B:17:0x0045, B:18:0x004a, B:20:0x0056, B:21:0x0070, B:24:0x007a, B:26:0x0082, B:28:0x008a, B:31:0x0094, B:33:0x009c, B:36:0x00a5, B:37:0x00aa, B:39:0x00bc, B:41:0x00dd, B:70:0x0142, B:72:0x014c, B:73:0x0169, B:69:0x0121, B:74:0x016d, B:5:0x000f, B:42:0x00e6, B:53:0x0107, B:68:0x0120, B:67:0x011d, B:64:0x0118, B:43:0x00eb, B:52:0x0104, B:63:0x0117, B:62:0x0114), top: B:131:0x000f, inners: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x014c, please report this as an issue */
    private static LottieResult<LottieComposition> fromZipStreamSyncInternal(Context context, ZipInputStream zipInputStream, String str) {
        LottieComposition lottieComposition;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            lottieComposition = null;
        } else {
            try {
                lottieComposition = LottieCompositionCache.getInstance().get(str);
            } catch (IOException e4) {
                return new LottieResult<>((Throwable) e4);
            }
        }
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        LottieComposition value = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase(Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME)) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                value = fromJsonReaderSyncInternal(JsonReader.of(new b0(r.y(zipInputStream))), null, false).getValue();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new LottieResult<>((Throwable) new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i14 = zipInputStream.read(bArr);
                                if (i14 == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i14);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    Logger.warning("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th7);
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        Logger.warning("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    map2.put(str3, typefaceCreateFromFile);
                    nextEntry = zipInputStream.getNextEntry();
                }
                Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                if (!file.delete()) {
                    Logger.warning("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile2);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (value == null) {
            return new LottieResult<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            LottieImageAsset lottieImageAssetFindImageAssetForFileName = findImageAssetForFileName(value, (String) entry.getKey());
            if (lottieImageAssetFindImageAssetForFileName != null) {
                lottieImageAssetFindImageAssetForFileName.setBitmap(Utils.resizeBitmapIfNeeded((Bitmap) entry.getValue(), lottieImageAssetFindImageAssetForFileName.getWidth(), lottieImageAssetFindImageAssetForFileName.getHeight()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z14 = false;
            for (Font font : value.getFonts().values()) {
                if (font.getFamily().equals(entry2.getKey())) {
                    font.setTypeface((Typeface) entry2.getValue());
                    z14 = true;
                }
            }
            if (!z14) {
                Logger.warning("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator<Map.Entry<String, LottieImageAsset>> it = value.getImages().entrySet().iterator();
            while (it.hasNext()) {
                LottieImageAsset value2 = it.next().getValue();
                if (value2 == null) {
                    return null;
                }
                String fileName = value2.getFileName();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = SyslogConstants.LOG_LOCAL4;
                if (fileName.startsWith("data:") && fileName.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(fileName.substring(fileName.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            value2.setBitmap(Utils.resizeBitmapIfNeeded(bitmapDecodeByteArray, value2.getWidth(), value2.getHeight()));
                        }
                    } catch (IllegalArgumentException e14) {
                        Logger.warning("data URL did not have correct base64 format.", e14);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            LottieCompositionCache.getInstance().put(str, value);
        }
        return new LottieResult<>(value);
    }

    private static Boolean isGzipCompressed(w63.g gVar) {
        return matchesMagicBytes(gVar, GZIP_MAGIC);
    }

    private static boolean isNightMode(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean isZipCompressed(w63.g gVar) {
        return matchesMagicBytes(gVar, ZIP_MAGIC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cache$18(String str, AtomicBoolean atomicBoolean, LottieComposition lottieComposition) {
        Map<String, LottieTask<LottieComposition>> map = taskCache;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            notifyTaskCacheIdleListeners(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cache$19(String str, AtomicBoolean atomicBoolean, Throwable th3) {
        Map<String, LottieTask<LottieComposition>> map = taskCache;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            notifyTaskCacheIdleListeners(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fromJsonInputStream$7(boolean z14, InputStream inputStream) {
        if (z14) {
            Utils.closeQuietly(inputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ LottieResult lambda$fromRawRes$3(WeakReference weakReference, Context context, int i14, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return fromRawResSync(context, i14, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ LottieResult lambda$fromUrl$0(Context context, String str, String str2) {
        LottieResult<LottieComposition> lottieResultFetchSync = L.networkFetcher(context).fetchSync(context, str, str2);
        if (str2 != null && lottieResultFetchSync.getValue() != null) {
            LottieCompositionCache.getInstance().put(str2, lottieResultFetchSync.getValue());
        }
        return lottieResultFetchSync;
    }

    private static Boolean matchesMagicBytes(w63.g gVar, byte[] bArr) {
        try {
            b0 b0VarPeek = gVar.peek();
            for (byte b14 : bArr) {
                if (b0VarPeek.readByte() != b14) {
                    return Boolean.FALSE;
                }
            }
            b0VarPeek.close();
            return Boolean.TRUE;
        } catch (Exception e4) {
            Logger.error("Failed to check zip file header", e4);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    private static void notifyTaskCacheIdleListeners(boolean z14) {
        ArrayList arrayList = new ArrayList(taskIdleListeners);
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((LottieTaskIdleListener) arrayList.get(i14)).onIdleChanged(z14);
        }
    }

    private static String rawResCacheKey(Context context, int i14) {
        return x.e(new StringBuilder("rawRes"), i14, isNightMode(context) ? "_night_" : "_day_");
    }

    public static void registerLottieTaskIdleListener(LottieTaskIdleListener lottieTaskIdleListener) {
        taskIdleListeners.add(lottieTaskIdleListener);
        lottieTaskIdleListener.onIdleChanged(taskCache.size() == 0);
    }

    public static void setMaxCacheSize(int i14) {
        LottieCompositionCache.getInstance().resize(i14);
    }

    public static void unregisterLottieTaskIdleListener(LottieTaskIdleListener lottieTaskIdleListener) {
        taskIdleListeners.remove(lottieTaskIdleListener);
    }

    public static LottieResult<LottieComposition> fromJsonReaderSync(JsonReader jsonReader, String str, boolean z14) {
        return fromJsonReaderSyncInternal(jsonReader, str, z14);
    }

    public static LottieResult<LottieComposition> fromJsonInputStreamSync(InputStream inputStream, String str) {
        return fromJsonInputStreamSync(inputStream, str, true);
    }

    public static LottieResult<LottieComposition> fromJsonSourceSync(g0 g0Var, String str) {
        return fromJsonSourceSync(g0Var, str, true);
    }

    public static LottieTask<LottieComposition> fromJsonInputStream(InputStream inputStream, String str, boolean z14) {
        return cache(str, new as2.e(z14, str, 1, inputStream), new a0.a(z14, inputStream, 5));
    }

    public static LottieResult<LottieComposition> fromZipStreamSync(ZipInputStream zipInputStream, String str, boolean z14) {
        return fromZipStreamSync(null, zipInputStream, str, z14);
    }

    public static LottieResult<LottieComposition> fromZipStreamSync(Context context, ZipInputStream zipInputStream, String str) {
        return fromZipStreamSync(context, zipInputStream, str, true);
    }

    public static LottieTask<LottieComposition> fromAsset(Context context, String str, String str2) {
        return cache(str2, new f(context.getApplicationContext(), 0, str, str2), null);
    }

    public static LottieTask<LottieComposition> fromUrl(Context context, String str, String str2) {
        return cache(str2, new f(context, 1, str, str2), null);
    }

    public static LottieResult<LottieComposition> fromZipStreamSync(ZipInputStream zipInputStream, String str) {
        return fromZipStreamSync(zipInputStream, str, true);
    }

    public static LottieTask<LottieComposition> fromRawRes(Context context, int i14) {
        return fromRawRes(context, i14, rawResCacheKey(context, i14));
    }

    public static LottieTask<LottieComposition> fromZipStream(ZipInputStream zipInputStream, String str, boolean z14) {
        return fromZipStream(null, zipInputStream, str, z14);
    }

    public static LottieTask<LottieComposition> fromZipStream(Context context, ZipInputStream zipInputStream, String str) {
        int i14 = 0;
        return cache(str, new g(context, zipInputStream, str, i14), new h(zipInputStream, i14));
    }

    public static LottieTask<LottieComposition> fromZipStream(ZipInputStream zipInputStream, String str) {
        return fromZipStream((Context) null, zipInputStream, str);
    }

    public static void clearCache(Context context) {
        clearCache(context, true);
    }

    public static LottieResult<LottieComposition> fromAssetSync(Context context, String str) {
        return fromAssetSync(context, str, "asset_" + str);
    }

    public static LottieResult<LottieComposition> fromUrlSync(Context context, String str) {
        return fromUrlSync(context, str, str);
    }

    public static LottieResult<LottieComposition> fromRawResSync(Context context, int i14) {
        return fromRawResSync(context, i14, rawResCacheKey(context, i14));
    }
}
