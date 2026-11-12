package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.xiaomi.onetrack.util.z;
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
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public class use {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, vte<lse>> f36086a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<wte> f36087b = new HashSet();
    public static final byte[] c = {SettingsModule.VALUE_TYPE_FLAG, 75, 3, 4};

    public static boolean A(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static Boolean B(BufferedSource bufferedSource) {
        try {
            BufferedSource bufferedSourcePeek = bufferedSource.peek();
            for (byte b2 : c) {
                if (bufferedSourcePeek.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            bufferedSourcePeek.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            rpe.b("Failed to check zip file header", e);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static /* synthetic */ void C(String str, AtomicBoolean atomicBoolean, Throwable th) {
        Map<String, vte<lse>> map = f36086a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            J(true);
        }
    }

    public static /* synthetic */ tte D(lse lseVar) throws Exception {
        return new tte(lseVar);
    }

    public static /* synthetic */ void E(String str, AtomicBoolean atomicBoolean, lse lseVar) {
        Map<String, vte<lse>> map = f36086a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            J(true);
        }
    }

    public static /* synthetic */ tte H(WeakReference weakReference, Context context, int i, String str) throws Exception {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return v(context, i, str);
    }

    public static /* synthetic */ tte I(Context context, String str, String str2) throws Exception {
        tte<lse> tteVarC = w1e.e(context).c(context, str, str2);
        if (str2 != null && tteVarC.b() != null) {
            mse.b().c(str2, tteVarC.b());
        }
        return tteVarC;
    }

    public static void J(boolean z) {
        ArrayList arrayList = new ArrayList(f36087b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((wte) arrayList.get(i)).a(z);
        }
    }

    public static String K(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(A(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    public static vte<lse> h(final String str, Callable<tte<lse>> callable) {
        final lse lseVarA = str == null ? null : mse.b().a(str);
        if (lseVarA != null) {
            return new vte<>(new Callable() { // from class: qse
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return use.D(lseVarA);
                }
            });
        }
        if (str != null) {
            Map<String, vte<lse>> map = f36086a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        vte<lse> vteVar = new vte<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            vteVar.d(new nte() { // from class: rse
                @Override // defpackage.nte
                public final void onResult(Object obj) {
                    use.E(str, atomicBoolean, (lse) obj);
                }
            });
            vteVar.c(new nte() { // from class: sse
                @Override // defpackage.nte
                public final void onResult(Object obj) {
                    use.C(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, vte<lse>> map2 = f36086a;
                map2.put(str, vteVar);
                if (map2.size() == 1) {
                    J(false);
                }
            }
        }
        return vteVar;
    }

    public static mte i(lse lseVar, String str) {
        for (mte mteVar : lseVar.j().values()) {
            if (mteVar.b().equals(str)) {
                return mteVar;
            }
        }
        return null;
    }

    public static vte<lse> j(Context context, String str) {
        return k(context, str, "asset_" + str);
    }

    public static vte<lse> k(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return h(str2, new Callable() { // from class: pse
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return use.m(applicationContext, str, str2);
            }
        });
    }

    public static tte<lse> l(Context context, String str) {
        return m(context, str, "asset_" + str);
    }

    public static tte<lse> m(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return o(context.getAssets().open(str), str2);
            }
            return y(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new tte<>((Throwable) e);
        }
    }

    public static vte<lse> n(final InputStream inputStream, final String str) {
        return h(str, new Callable() { // from class: ose
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return use.o(inputStream, str);
            }
        });
    }

    public static tte<lse> o(InputStream inputStream, String str) {
        return p(inputStream, str, true);
    }

    public static tte<lse> p(InputStream inputStream, String str, boolean z) {
        try {
            return q(JsonReader.m(Okio.buffer(Okio.source(inputStream))), str);
        } finally {
            if (z) {
                emq.c(inputStream);
            }
        }
    }

    public static tte<lse> q(JsonReader jsonReader, String str) {
        return r(jsonReader, str, true);
    }

    public static tte<lse> r(JsonReader jsonReader, String str, boolean z) {
        try {
            lse lseVarA = vse.a(jsonReader);
            if (str != null) {
                mse.b().c(str, lseVarA);
            }
            return new tte<>(lseVarA);
        } catch (Exception e) {
            return new tte<>((Throwable) e);
        } finally {
            if (z) {
                emq.c(jsonReader);
            }
        }
    }

    public static vte<lse> s(Context context, int i) {
        return t(context, i, K(context, i));
    }

    public static vte<lse> t(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return h(str, new Callable() { // from class: tse
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return use.H(weakReference, applicationContext, i, str);
            }
        });
    }

    public static tte<lse> u(Context context, int i) {
        return v(context, i, K(context, i));
    }

    public static tte<lse> v(Context context, int i, String str) {
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(context.getResources().openRawResource(i)));
            return B(bufferedSourceBuffer).booleanValue() ? y(context, new ZipInputStream(bufferedSourceBuffer.inputStream()), str) : o(bufferedSourceBuffer.inputStream(), str);
        } catch (Resources.NotFoundException e) {
            return new tte<>((Throwable) e);
        }
    }

    public static vte<lse> w(Context context, String str) {
        return x(context, str, "url_" + str);
    }

    public static vte<lse> x(final Context context, final String str, final String str2) {
        return h(str2, new Callable() { // from class: nse
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return use.I(context, str, str2);
            }
        });
    }

    public static tte<lse> y(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return z(context, zipInputStream, str);
        } finally {
            emq.c(zipInputStream);
        }
    }

    public static tte<lse> z(Context context, ZipInputStream zipInputStream, String str) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            lse lseVarB = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    lseVarB = r(JsonReader.m(Okio.buffer(Okio.source(zipInputStream))), null, false).b();
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                    String[] strArrSplit = name.split("/");
                    map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else if (name.contains(".ttf") || name.contains(".otf")) {
                    String[] strArrSplit2 = name.split("/");
                    String str2 = strArrSplit2[strArrSplit2.length - 1];
                    String str3 = str2.split(z.f14007a)[0];
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
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                rpe.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                            }
                            map2.put(str3, typefaceCreateFromFile);
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        rpe.d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                    }
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (lseVarB == null) {
                return new tte<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                mte mteVarI = i(lseVarB, (String) entry.getKey());
                if (mteVarI != null) {
                    mteVarI.f(emq.l((Bitmap) entry.getValue(), mteVarI.e(), mteVarI.c()));
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z = false;
                for (sz9 sz9Var : lseVarB.g().values()) {
                    if (sz9Var.a().equals(entry2.getKey())) {
                        sz9Var.e((Typeface) entry2.getValue());
                        z = true;
                    }
                }
                if (!z) {
                    rpe.c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                }
            }
            if (map.isEmpty()) {
                Iterator<Map.Entry<String, mte>> it = lseVarB.j().entrySet().iterator();
                while (it.hasNext()) {
                    mte value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String strB = value.b();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (strB.startsWith("data:") && strB.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(strB.substring(strB.indexOf(44) + 1), 0);
                            value.f(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                        } catch (IllegalArgumentException e) {
                            rpe.d("data URL did not have correct base64 format.", e);
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, mte> entry3 : lseVarB.j().entrySet()) {
                if (entry3.getValue().a() == null) {
                    return new tte<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().b()));
                }
            }
            if (str != null) {
                mse.b().c(str, lseVarB);
            }
            return new tte<>(lseVarB);
        } catch (IOException e2) {
            return new tte<>((Throwable) e2);
        }
    }
}
