package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.LottieTaskIdleListener;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.common.base.Ascii;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
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
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public class da {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, ec<cx>> f31565b = new HashMap();
    private static final Set<LottieTaskIdleListener> e = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f31566c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f31564a = {Ascii.US, -117, 8};

    public static void d(Context context) {
        f31565b.clear();
        fp.d().e();
        hg hgVarA = cv.a(context);
        if (hgVarA != null) {
            hgVarA.e();
        }
    }

    public static ec<cx> c(Context context, String str) {
        return d(context, str, "url_" + str);
    }

    public static ec<cx> d(final Context context, final String str, final String str2) {
        return d(str2, (Callable<ee<cx>>) new Callable() { // from class: di
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return da.e(context, str, str2);
            }
        }, (Runnable) null);
    }

    static /* synthetic */ ee e(Context context, String str, String str2) throws Exception {
        ee<cx> eeVarA = cv.b(context).a(context, str, str2);
        if (str2 != null && eeVarA.c() != null) {
            fp.d().d(str2, eeVarA.c());
        }
        return eeVarA;
    }

    public static ec<cx> d(Context context, String str) {
        return a(context, str, "asset_" + str);
    }

    public static ec<cx> a(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return d(str2, (Callable<ee<cx>>) new Callable() { // from class: dd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return da.b(applicationContext, str, str2);
            }
        }, (Runnable) null);
    }

    public static ee<cx> b(Context context, String str) {
        return b(context, str, "asset_" + str);
    }

    public static ee<cx> b(Context context, String str, String str2) {
        cx cxVarE = str2 == null ? null : fp.d().e(str2);
        if (cxVarE != null) {
            return new ee<>(cxVarE);
        }
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(context.getAssets().open(str)));
            if (d(bufferedSourceBuffer).booleanValue()) {
                return a(context, new ZipInputStream(bufferedSourceBuffer.inputStream()), str2);
            }
            if (c(bufferedSourceBuffer).booleanValue()) {
                return e(new GZIPInputStream(bufferedSourceBuffer.inputStream()), str2);
            }
            return e(bufferedSourceBuffer.inputStream(), str2);
        } catch (IOException e2) {
            return new ee<>((Throwable) e2);
        }
    }

    public static ec<cx> b(Context context, int i) {
        return c(context, i, d(context, i));
    }

    public static ec<cx> c(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return d(str, (Callable<ee<cx>>) new Callable() { // from class: dk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return da.c(weakReference, applicationContext, i, str);
            }
        }, (Runnable) null);
    }

    static /* synthetic */ ee c(WeakReference weakReference, Context context, int i, String str) throws Exception {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return b(context, i, str);
    }

    public static ee<cx> e(Context context, int i) {
        return b(context, i, d(context, i));
    }

    public static ee<cx> b(Context context, int i, String str) {
        cx cxVarE = str == null ? null : fp.d().e(str);
        if (cxVarE != null) {
            return new ee<>(cxVarE);
        }
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(context.getResources().openRawResource(i)));
            if (d(bufferedSourceBuffer).booleanValue()) {
                return a(context, new ZipInputStream(bufferedSourceBuffer.inputStream()), str);
            }
            if (c(bufferedSourceBuffer).booleanValue()) {
                try {
                    return e(new GZIPInputStream(bufferedSourceBuffer.inputStream()), str);
                } catch (IOException e2) {
                    return new ee<>((Throwable) e2);
                }
            }
            return e(bufferedSourceBuffer.inputStream(), str);
        } catch (Resources.NotFoundException e3) {
            return new ee<>((Throwable) e3);
        }
    }

    private static String d(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append(c(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    private static boolean c(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static ec<cx> d(final InputStream inputStream, final String str) {
        return d(str, (Callable<ee<cx>>) new Callable() { // from class: dc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return da.e(inputStream, str);
            }
        }, new Runnable() { // from class: db
            @Override // java.lang.Runnable
            public final void run() {
                je.c(inputStream);
            }
        });
    }

    public static ee<cx> e(InputStream inputStream, String str) {
        return b(inputStream, str, true);
    }

    public static ee<cx> b(InputStream inputStream, String str, boolean z) {
        return b(JsonReader.of(Okio.buffer(Okio.source(inputStream))), str, z);
    }

    public static ee<cx> b(JsonReader jsonReader, String str, boolean z) {
        return e(jsonReader, str, z);
    }

    private static ee<cx> e(JsonReader jsonReader, String str, boolean z) {
        try {
            cx cxVarE = str == null ? null : fp.d().e(str);
            if (cxVarE != null) {
                return new ee<>(cxVarE);
            }
            cx cxVarC = hz.c(jsonReader);
            if (str != null) {
                fp.d().d(str, cxVarC);
            }
            return new ee<>(cxVarC);
        } catch (Exception e2) {
            return new ee<>((Throwable) e2);
        } finally {
            if (z) {
                je.c(jsonReader);
            }
        }
    }

    public static ec<cx> d(ZipInputStream zipInputStream, String str) {
        return c((Context) null, zipInputStream, str);
    }

    public static ec<cx> c(final Context context, final ZipInputStream zipInputStream, final String str) {
        return d(str, (Callable<ee<cx>>) new Callable() { // from class: de
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return da.a(context, zipInputStream, str);
            }
        }, new Runnable() { // from class: df
            @Override // java.lang.Runnable
            public final void run() {
                je.c(zipInputStream);
            }
        });
    }

    public static ee<cx> a(Context context, ZipInputStream zipInputStream, String str) {
        return c(context, zipInputStream, str, true);
    }

    public static ee<cx> c(Context context, ZipInputStream zipInputStream, String str, boolean z) {
        try {
            return e(context, zipInputStream, str);
        } finally {
            if (z) {
                je.c(zipInputStream);
            }
        }
    }

    private static ee<cx> e(Context context, ZipInputStream zipInputStream, String str) {
        cx cxVarE;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            cxVarE = null;
        } else {
            try {
                cxVarE = fp.d().e(str);
            } catch (IOException e2) {
                return new ee<>((Throwable) e2);
            }
        }
        if (cxVarE != null) {
            return new ee<>(cxVarE);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        cx cxVarC = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                cxVarC = e(JsonReader.of(Okio.buffer(Okio.source(zipInputStream))), (String) null, false).c();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(WatchFaceProvider.SVG_TTF) || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                File file = new File(context.getCacheDir(), str2);
                new FileOutputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = zipInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    iy.b("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    iy.d("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (cxVarC == null) {
            return new ee<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            ed edVarE = e(cxVarC, (String) entry.getKey());
            if (edVarE != null) {
                edVarE.c(je.d((Bitmap) entry.getValue(), edVarE.c(), edVarE.e()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (fs fsVar : cxVarC.i().values()) {
                if (fsVar.e().equals(entry2.getKey())) {
                    fsVar.b((Typeface) entry2.getValue());
                    z = true;
                }
            }
            if (!z) {
                iy.d("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator<Map.Entry<String, ed>> it = cxVarC.g().entrySet().iterator();
            while (it.hasNext()) {
                ed value = it.next().getValue();
                if (value == null) {
                    return null;
                }
                String strD = value.d();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strD.startsWith("data:") && strD.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strD.substring(strD.indexOf(44) + 1), 0);
                        value.c(je.d(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), value.c(), value.e()));
                    } catch (IllegalArgumentException e3) {
                        iy.b("data URL did not have correct base64 format.", e3);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            fp.d().d(str, cxVarC);
        }
        return new ee<>(cxVarC);
    }

    private static Boolean d(BufferedSource bufferedSource) {
        return a(bufferedSource, f31566c);
    }

    private static Boolean c(BufferedSource bufferedSource) {
        return a(bufferedSource, f31564a);
    }

    private static Boolean a(BufferedSource bufferedSource, byte[] bArr) {
        try {
            BufferedSource bufferedSourcePeek = bufferedSource.peek();
            for (byte b2 : bArr) {
                if (bufferedSourcePeek.readByte() != b2) {
                    return false;
                }
            }
            bufferedSourcePeek.close();
            return true;
        } catch (Exception e2) {
            iy.e("Failed to check zip file header", e2);
            return false;
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    private static ed e(cx cxVar, String str) {
        for (ed edVar : cxVar.g().values()) {
            if (edVar.d().equals(str)) {
                return edVar;
            }
        }
        return null;
    }

    private static ec<cx> d(final String str, Callable<ee<cx>> callable, Runnable runnable) {
        cx cxVarE = str == null ? null : fp.d().e(str);
        ec<cx> ecVar = cxVarE != null ? new ec<>(cxVarE) : null;
        if (str != null) {
            Map<String, ec<cx>> map = f31565b;
            if (map.containsKey(str)) {
                ecVar = map.get(str);
            }
        }
        if (ecVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return ecVar;
        }
        ec<cx> ecVar2 = new ec<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ecVar2.b(new LottieListener() { // from class: dj
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    da.b(str, atomicBoolean, (cx) obj);
                }
            });
            ecVar2.e(new LottieListener() { // from class: dh
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    da.d(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, ec<cx>> map2 = f31565b;
                map2.put(str, ecVar2);
                if (map2.size() == 1) {
                    a(false);
                }
            }
        }
        return ecVar2;
    }

    static /* synthetic */ void b(String str, AtomicBoolean atomicBoolean, cx cxVar) {
        Map<String, ec<cx>> map = f31565b;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            a(true);
        }
    }

    static /* synthetic */ void d(String str, AtomicBoolean atomicBoolean, Throwable th) {
        Map<String, ec<cx>> map = f31565b;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            a(true);
        }
    }

    private static void a(boolean z) {
        ArrayList arrayList = new ArrayList(e);
        for (int i = 0; i < arrayList.size(); i++) {
            ((LottieTaskIdleListener) arrayList.get(i)).onIdleChanged(z);
        }
    }
}
