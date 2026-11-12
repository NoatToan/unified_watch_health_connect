package defpackage;

import android.os.Build;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes5.dex */
public final class sjt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f33720b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bjt f33721a;

    public sjt(bjt bjtVar) throws IOException {
        this.f33721a = bjtVar;
    }

    public static /* bridge */ /* synthetic */ Set a(sjt sjtVar, Set set, fkt fktVar, ZipFile zipFile) throws IOException {
        HashSet hashSet = new HashSet();
        sjtVar.f(fktVar, set, new njt(sjtVar, hashSet, fktVar, zipFile));
        return hashSet;
    }

    @RequiresApi(21)
    public static void e(fkt fktVar, ojt ojtVar) throws IllegalAccessException, IOException, InvocationTargetException {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(fktVar.a());
            try {
                String strB = fktVar.b();
                HashMap map = new HashMap();
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    Matcher matcher = f33720b.matcher(zipEntryNextElement.getName());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", strB, strGroup2, strGroup);
                        Set hashSet = (Set) map.get(strGroup);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(strGroup, hashSet);
                        }
                        hashSet.add(new qjt(zipEntryNextElement, strGroup2));
                    }
                }
                HashMap map2 = new HashMap();
                for (String str : Build.SUPPORTED_ABIS) {
                    if (map.containsKey(str)) {
                        String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str);
                        for (qjt qjtVar : (Set) map.get(str)) {
                            if (map2.containsKey(qjtVar.f31582a)) {
                                String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", qjtVar.f31582a, str);
                            } else {
                                map2.put(qjtVar.f31582a, qjtVar);
                                String.format("NativeLibraryExtractor: using library %s for ABI %s", qjtVar.f31582a, str);
                            }
                        }
                    } else {
                        String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str);
                    }
                }
                ojtVar.a(zipFile, new HashSet(map2.values()));
                zipFile.close();
            } catch (IOException e) {
                e = e;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e2);
                    }
                }
                throw e;
            }
        } catch (IOException e3) {
            e = e3;
            zipFile = null;
        }
    }

    @RequiresApi(21)
    public final Set b(fkt fktVar) throws IllegalAccessException, IOException, InvocationTargetException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        e(fktVar, new jjt(this, fktVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    @RequiresApi(21)
    public final Set c() throws IllegalAccessException, IOException, InvocationTargetException {
        Set<fkt> setJ = this.f33721a.j();
        for (String str : this.f33721a.h()) {
            Iterator it = setJ.iterator();
            do {
                if (!it.hasNext()) {
                    String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str);
                    this.f33721a.n(str);
                    break;
                }
            } while (!((fkt) it.next()).b().equals(str));
        }
        HashSet hashSet = new HashSet();
        for (fkt fktVar : setJ) {
            HashSet hashSet2 = new HashSet();
            e(fktVar, new ljt(this, hashSet2, fktVar));
            for (File file : this.f33721a.i(fktVar.b())) {
                if (!hashSet2.contains(file)) {
                    String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file.getAbsolutePath(), fktVar.b(), fktVar.a().getAbsolutePath());
                    this.f33721a.o(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final void f(fkt fktVar, Set set, pjt pjtVar) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            qjt qjtVar = (qjt) it.next();
            File fileC = this.f33721a.c(fktVar.b(), qjtVar.f31582a);
            boolean z = false;
            if (fileC.exists() && fileC.length() == qjtVar.f31583b.getSize() && bjt.p(fileC)) {
                z = true;
            }
            pjtVar.a(qjtVar, fileC, z);
        }
    }
}
