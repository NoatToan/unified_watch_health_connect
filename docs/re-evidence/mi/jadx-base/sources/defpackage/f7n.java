package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.zzo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes5.dex */
public class f7n {
    public static final AtomicReference e = new AtomicReference(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bjt f17506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pit f17507b;

    @GuardedBy("emulatedSplits")
    public final Set c = new HashSet();
    public final tht d;

    public f7n(Context context) {
        try {
            bjt bjtVar = new bjt(context);
            this.f17506a = bjtVar;
            this.d = new tht(bjtVar);
            this.f17507b = new pit(context);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new zzbh("Failed to initialize FileStorage", e2);
        }
    }

    public static boolean a(Context context) {
        return h(context, false);
    }

    public static boolean d(Context context) {
        return h(context, true);
    }

    public static boolean e() {
        return e.get() != null;
    }

    public static boolean h(final Context context, boolean z) {
        boolean z2;
        if (i()) {
            return false;
        }
        AtomicReference atomicReference = e;
        f7n f7nVar = new f7n(context);
        while (true) {
            if (d8i.a(atomicReference, null, f7nVar)) {
                z2 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z2 = false;
                break;
            }
        }
        f7n f7nVar2 = (f7n) e.get();
        if (z2) {
            zzo.INSTANCE.zzb(new xht(context, zit.a(), new ait(context, f7nVar2.f17506a, new uht()), f7nVar2.f17506a, new ekt()));
            zjt.a(new vjt(f7nVar2));
            zit.a().execute(new Runnable() { // from class: tjt
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    AtomicReference atomicReference2 = f7n.e;
                    try {
                        jkt.f(context2).b(true);
                    } catch (SecurityException unused) {
                    }
                }
            });
        }
        try {
            f7nVar2.g(context, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean i() {
        return false;
    }

    public final void f(Set set) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bjt.l(this.f17506a.g((String) it.next()));
        }
        this.f17507b.b();
    }

    @RequiresApi(21)
    public final synchronized void g(Context context, boolean z) throws IOException {
        ZipFile zipFile;
        try {
            if (z) {
                this.f17506a.k();
            } else {
                zit.a().execute(new yjt(this));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                Set<fkt> setJ = this.f17506a.j();
                Set setA = this.f17507b.a();
                HashSet hashSet = new HashSet();
                Iterator it = setJ.iterator();
                while (it.hasNext()) {
                    String strB = ((fkt) it.next()).b();
                    if (arrayList.contains(strB) || setA.contains(ckt.a(strB))) {
                        hashSet.add(strB);
                        it.remove();
                    }
                }
                if (z) {
                    f(hashSet);
                } else if (!hashSet.isEmpty()) {
                    zit.a().execute(new bkt(this, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = setJ.iterator();
                while (it2.hasNext()) {
                    String strB2 = ((fkt) it2.next()).b();
                    if (!ckt.b(strB2)) {
                        hashSet2.add(strB2);
                    }
                }
                for (String str : arrayList) {
                    if (!ckt.b(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet<fkt> hashSet3 = new HashSet(setJ.size());
                for (fkt fktVar : setJ) {
                    String strB3 = fktVar.b();
                    gkt gktVar = ckt.f5440a;
                    if (strB3.startsWith("config.") || hashSet2.contains(ckt.a(fktVar.b()))) {
                        hashSet3.add(fktVar);
                    }
                }
                sjt sjtVar = new sjt(this.f17506a);
                bit bitVarA = cit.a();
                ClassLoader classLoader = context.getClassLoader();
                if (z) {
                    bitVarA.a(classLoader, sjtVar.c());
                } else {
                    Iterator it3 = hashSet3.iterator();
                    while (it3.hasNext()) {
                        Set setB = sjtVar.b((fkt) it3.next());
                        if (setB == null) {
                            it3.remove();
                        } else {
                            bitVarA.a(classLoader, setB);
                        }
                    }
                }
                HashSet hashSet4 = new HashSet();
                for (fkt fktVar2 : hashSet3) {
                    try {
                        zipFile = new ZipFile(fktVar2.a());
                        try {
                            ZipEntry entry = zipFile.getEntry("classes.dex");
                            zipFile.close();
                            if (entry == null || bitVarA.b(classLoader, this.f17506a.a(fktVar2.b()), fktVar2.a(), z)) {
                                hashSet4.add(fktVar2.a());
                            } else {
                                "split was not installed ".concat(fktVar2.a().toString());
                            }
                        } catch (IOException e2) {
                            e = e2;
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (IOException e3) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e3);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            throw e;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        zipFile = null;
                    }
                }
                this.d.a(context, hashSet4);
                HashSet hashSet5 = new HashSet();
                for (fkt fktVar3 : hashSet3) {
                    if (hashSet4.contains(fktVar3.a())) {
                        String strB4 = fktVar3.b();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Split '");
                        sb.append(strB4);
                        sb.append("' installation emulated");
                        hashSet5.add(fktVar3.b());
                    } else {
                        String strB5 = fktVar3.b();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Split '");
                        sb2.append(strB5);
                        sb2.append("' installation not emulated.");
                    }
                }
                synchronized (this.c) {
                    this.c.addAll(hashSet5);
                }
            } catch (PackageManager.NameNotFoundException e5) {
                throw new IOException(String.format("Cannot load data for application '%s'", packageName), e5);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
