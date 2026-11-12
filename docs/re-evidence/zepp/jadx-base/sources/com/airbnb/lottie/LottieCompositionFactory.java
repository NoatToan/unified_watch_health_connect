package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import androidx.multidex.MultiDexExtractor;
import com.airbnb.lottie.model.LottieCompositionCache;
import com.airbnb.lottie.parser.LottieCompositionMoshiParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.network.hmnetwork.server.HMServerDef;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.BufferedSource;
import okio.Okio;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LottieCompositionFactory {
    private static final Map<String, LottieTask<LottieComposition>> a = new HashMap();
    private static final byte[] b = {SettingsModule.VALUE_TYPE_FLAG, 75, 3, 4};

    public class a implements LottieListener<LottieComposition> {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.LottieListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(LottieComposition lottieComposition) {
            LottieCompositionFactory.a.remove(this.a);
        }
    }

    public class b implements LottieListener<Throwable> {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.LottieListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            LottieCompositionFactory.a.remove(this.a);
        }
    }

    public class c implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public c(Context context, String str, String str2) {
            this.a = context;
            this.b = str;
            this.c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LottieResult<LottieComposition> call() {
            LottieResult<LottieComposition> lottieResultFetchSync = L.networkFetcher(this.a).fetchSync(this.b, this.c);
            if (this.c != null && lottieResultFetchSync.getValue() != null) {
                LottieCompositionCache.getInstance().put(this.c, lottieResultFetchSync.getValue());
            }
            return lottieResultFetchSync;
        }
    }

    public class d implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public d(Context context, String str, String str2) {
            this.a = context;
            this.b = str;
            this.c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LottieResult<LottieComposition> call() {
            return LottieCompositionFactory.fromAssetSync(this.a, this.b, this.c);
        }
    }

    public class e implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ WeakReference a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;

        public e(WeakReference weakReference, Context context, int i, String str) {
            this.a = weakReference;
            this.b = context;
            this.c = i;
            this.d = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LottieResult<LottieComposition> call() {
            Context context = (Context) this.a.get();
            if (context == null) {
                context = this.b;
            }
            return LottieCompositionFactory.fromRawResSync(context, this.c, this.d);
        }
    }

    public class f implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ InputStream a;
        public final /* synthetic */ String b;

        public f(InputStream inputStream, String str) {
            this.a = inputStream;
            this.b = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LottieResult<LottieComposition> call() {
            return LottieCompositionFactory.fromJsonInputStreamSync(this.a, this.b);
        }
    }

    public class g implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ JSONObject a;
        public final /* synthetic */ String b;

        public g(JSONObject jSONObject, String str) {
            this.a = jSONObject;
            this.b = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LottieResult<LottieComposition> call() {
            return LottieCompositionFactory.fromJsonSync(this.a, this.b);
        }
    }

    public class h implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public h(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LottieResult<LottieComposition> call() {
            return LottieCompositionFactory.fromJsonStringSync(this.a, this.b);
        }
    }

    public class i implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ JsonReader a;
        public final /* synthetic */ String b;

        public i(JsonReader jsonReader, String str) {
            this.a = jsonReader;
            this.b = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LottieResult<LottieComposition> call() {
            return LottieCompositionFactory.fromJsonReaderSync(this.a, this.b);
        }
    }

    public class j implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ ZipInputStream a;
        public final /* synthetic */ String b;

        public j(ZipInputStream zipInputStream, String str) {
            this.a = zipInputStream;
            this.b = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LottieResult<LottieComposition> call() {
            return LottieCompositionFactory.fromZipStreamSync(this.a, this.b);
        }
    }

    public class k implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ LottieComposition a;

        public k(LottieComposition lottieComposition) {
            this.a = lottieComposition;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LottieResult<LottieComposition> call() {
            return new LottieResult<>(this.a);
        }
    }

    private LottieCompositionFactory() {
    }

    private static LottieTask<LottieComposition> b(@Nullable String str, Callable<LottieResult<LottieComposition>> callable) {
        LottieComposition lottieComposition = str == null ? null : LottieCompositionCache.getInstance().get(str);
        if (lottieComposition != null) {
            return new LottieTask<>(new k(lottieComposition));
        }
        if (str != null) {
            Map<String, LottieTask<LottieComposition>> map = a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        LottieTask<LottieComposition> lottieTask = new LottieTask<>(callable);
        if (str != null) {
            lottieTask.addListener(new a(str));
            lottieTask.addFailureListener(new b(str));
            a.put(str, lottieTask);
        }
        return lottieTask;
    }

    @Nullable
    private static LottieImageAsset c(LottieComposition lottieComposition, String str) {
        for (LottieImageAsset lottieImageAsset : lottieComposition.getImages().values()) {
            if (lottieImageAsset.getFileName().equals(str)) {
                return lottieImageAsset;
            }
        }
        return null;
    }

    public static void clearCache(Context context) {
        a.clear();
        LottieCompositionCache.getInstance().clear();
        L.networkCache(context).clear();
    }

    @WorkerThread
    private static LottieResult<LottieComposition> d(InputStream inputStream, @Nullable String str, boolean z) {
        try {
            return fromJsonReaderSync(JsonReader.of(Okio.buffer(Okio.source(inputStream))), str);
        } finally {
            if (z) {
                Utils.closeQuietly(inputStream);
            }
        }
    }

    private static LottieResult<LottieComposition> e(JsonReader jsonReader, @Nullable String str, boolean z) {
        try {
            LottieComposition lottieComposition = LottieCompositionMoshiParser.parse(jsonReader);
            if (str != null) {
                LottieCompositionCache.getInstance().put(str, lottieComposition);
            }
            return new LottieResult<>(lottieComposition);
        } catch (Exception e2) {
            return new LottieResult<>((Throwable) e2);
        } finally {
            if (z) {
                Utils.closeQuietly(jsonReader);
            }
        }
    }

    @WorkerThread
    private static LottieResult<LottieComposition> f(ZipInputStream zipInputStream, @Nullable String str) {
        HashMap map = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            LottieComposition value = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(HMServerDef.RESPONSE_FORMAT)) {
                    value = e(JsonReader.of(Okio.buffer(Okio.source(zipInputStream))), null, false).getValue();
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                    String[] strArrSplit = name.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
                    map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (value == null) {
                return new LottieResult<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                LottieImageAsset lottieImageAssetC = c(value, (String) entry.getKey());
                if (lottieImageAssetC != null) {
                    lottieImageAssetC.setBitmap(Utils.resizeBitmapIfNeeded((Bitmap) entry.getValue(), lottieImageAssetC.getWidth(), lottieImageAssetC.getHeight()));
                }
            }
            for (Map.Entry<String, LottieImageAsset> entry2 : value.getImages().entrySet()) {
                if (entry2.getValue().getBitmap() == null) {
                    return new LottieResult<>((Throwable) new IllegalStateException("There is no image for " + entry2.getValue().getFileName()));
                }
            }
            if (str != null) {
                LottieCompositionCache.getInstance().put(str, value);
            }
            return new LottieResult<>(value);
        } catch (IOException e2) {
            return new LottieResult<>((Throwable) e2);
        }
    }

    public static LottieTask<LottieComposition> fromAsset(Context context, String str) {
        return fromAsset(context, str, "asset_" + str);
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromAssetSync(Context context, String str) {
        return fromAssetSync(context, str, "asset_" + str);
    }

    @Deprecated
    public static LottieTask<LottieComposition> fromJson(JSONObject jSONObject, @Nullable String str) {
        return b(str, new g(jSONObject, str));
    }

    public static LottieTask<LottieComposition> fromJsonInputStream(InputStream inputStream, @Nullable String str) {
        return b(str, new f(inputStream, str));
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonInputStreamSync(InputStream inputStream, @Nullable String str) {
        return d(inputStream, str, true);
    }

    public static LottieTask<LottieComposition> fromJsonReader(JsonReader jsonReader, @Nullable String str) {
        return b(str, new i(jsonReader, str));
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonReaderSync(JsonReader jsonReader, @Nullable String str) {
        return e(jsonReader, str, true);
    }

    public static LottieTask<LottieComposition> fromJsonString(String str, @Nullable String str2) {
        return b(str2, new h(str, str2));
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonStringSync(String str, @Nullable String str2) {
        return fromJsonReaderSync(JsonReader.of(Okio.buffer(Okio.source(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    @WorkerThread
    @Deprecated
    public static LottieResult<LottieComposition> fromJsonSync(JSONObject jSONObject, @Nullable String str) {
        return fromJsonStringSync(jSONObject.toString(), str);
    }

    public static LottieTask<LottieComposition> fromRawRes(Context context, @RawRes int i2) {
        return fromRawRes(context, i2, i(context, i2));
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromRawResSync(Context context, @RawRes int i2) {
        return fromRawResSync(context, i2, i(context, i2));
    }

    public static LottieTask<LottieComposition> fromUrl(Context context, String str) {
        return fromUrl(context, str, "url_" + str);
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromUrlSync(Context context, String str) {
        return fromUrlSync(context, str, str);
    }

    public static LottieTask<LottieComposition> fromZipStream(ZipInputStream zipInputStream, @Nullable String str) {
        return b(str, new j(zipInputStream, str));
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromZipStreamSync(ZipInputStream zipInputStream, @Nullable String str) {
        try {
            return f(zipInputStream, str);
        } finally {
            Utils.closeQuietly(zipInputStream);
        }
    }

    private static boolean g(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean h(BufferedSource bufferedSource) {
        try {
            BufferedSource bufferedSourcePeek = bufferedSource.peek();
            for (byte b2 : b) {
                if (bufferedSourcePeek.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            bufferedSourcePeek.close();
            return Boolean.TRUE;
        } catch (Exception e2) {
            Logger.error("Failed to check zip file header", e2);
            return Boolean.FALSE;
        }
    }

    private static String i(Context context, @RawRes int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(g(context) ? "_night_" : "_day_");
        sb.append(i2);
        return sb.toString();
    }

    public static void setMaxCacheSize(int i2) {
        LottieCompositionCache.getInstance().resize(i2);
    }

    public static LottieTask<LottieComposition> fromRawRes(Context context, @RawRes int i2, @Nullable String str) {
        return b(str, new e(new WeakReference(context), context.getApplicationContext(), i2, str));
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromRawResSync(Context context, @RawRes int i2, @Nullable String str) {
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(context.getResources().openRawResource(i2)));
            return h(bufferedSourceBuffer).booleanValue() ? fromZipStreamSync(new ZipInputStream(bufferedSourceBuffer.inputStream()), str) : fromJsonInputStreamSync(bufferedSourceBuffer.inputStream(), str);
        } catch (Resources.NotFoundException e2) {
            return new LottieResult<>((Throwable) e2);
        }
    }

    public static LottieTask<LottieComposition> fromUrl(Context context, String str, @Nullable String str2) {
        return b(str2, new c(context, str, str2));
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromUrlSync(Context context, String str, @Nullable String str2) {
        LottieResult<LottieComposition> lottieResultFetchSync = L.networkFetcher(context).fetchSync(str, str2);
        if (str2 != null && lottieResultFetchSync.getValue() != null) {
            LottieCompositionCache.getInstance().put(str2, lottieResultFetchSync.getValue());
        }
        return lottieResultFetchSync;
    }

    public static LottieTask<LottieComposition> fromAsset(Context context, String str, @Nullable String str2) {
        return b(str2, new d(context.getApplicationContext(), str, str2));
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromAssetSync(Context context, String str, @Nullable String str2) {
        try {
            if (!str.endsWith(MultiDexExtractor.EXTRACTED_SUFFIX) && !str.endsWith(".lottie")) {
                return fromJsonInputStreamSync(context.getAssets().open(str), str2);
            }
            return fromZipStreamSync(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e2) {
            return new LottieResult<>((Throwable) e2);
        }
    }
}
