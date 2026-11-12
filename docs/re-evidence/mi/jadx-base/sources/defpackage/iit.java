package defpackage;

import com.google.android.play.core.splitinstall.internal.zzbh;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class iit implements bit {
    public static void c(ClassLoader classLoader, Set set, hit hitVar) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((File) it.next()).getParentFile());
        }
        Object objC = fit.c(classLoader);
        tit titVarB = uit.b(objC, "nativeLibraryDirectories", List.class);
        synchronized (rjt.class) {
            ArrayList arrayList = new ArrayList((Collection) titVarB.a());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            titVarB.c(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] objArrA = hitVar.a(objC, new ArrayList(hashSet), null, arrayList2);
        if (arrayList2.isEmpty()) {
            synchronized (rjt.class) {
                uit.a(objC, "nativeLibraryPathElements", Object.class).e(Arrays.asList(objArrA));
            }
            return;
        }
        zzbh zzbhVar = new zzbh("Error in makePathElements");
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList2.get(i));
            } catch (Exception unused) {
            }
        }
        throw zzbhVar;
    }
}
