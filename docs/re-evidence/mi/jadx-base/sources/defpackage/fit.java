package defpackage;

import com.google.android.play.core.splitinstall.internal.zzbh;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class fit implements bit {
    public static Object c(ClassLoader classLoader) {
        return uit.b(classLoader, "pathList", Object.class).a();
    }

    public static boolean d(ClassLoader classLoader, File file, File file2, boolean z, eit eitVar, String str, dit ditVar) {
        ArrayList arrayList = new ArrayList();
        Object objC = c(classLoader);
        sit sitVarA = uit.a(objC, "dexElements", Object.class);
        List listAsList = Arrays.asList((Object[]) sitVarA.a());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList2.add((File) uit.b(it.next(), str, File.class).a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z && !ditVar.a(objC, file2, file)) {
            "Should be optimized ".concat(String.valueOf(file2.getPath()));
            return false;
        }
        sitVarA.d(Arrays.asList(eitVar.a(objC, new ArrayList(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        zzbh zzbhVar = new zzbh("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList.get(i));
            } catch (Exception unused) {
            }
        }
        uit.a(objC, "dexElementsSuppressedExceptions", IOException.class).d(arrayList);
        throw zzbhVar;
    }
}
