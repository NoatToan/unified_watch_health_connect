package m2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import o2.e;
import s5.w0;
import u1.g0;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final void a(n2.a aVar, Context context, boolean z14, CharSequence charSequence, long j8) {
        if (!g0.f167496c || w0.e(j8) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        a.f115926a.getClass();
        List list = (List) a.f115927b.invoke(context);
        if (list.isEmpty()) {
            return;
        }
        aVar.a();
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            ResolveInfo resolveInfo = (ResolveInfo) list.get(i14);
            aVar.f122353a.g(new e(new o2.a(i14), resolveInfo.loadLabel(packageManager).toString(), 0, new b(context, resolveInfo, z14, charSequence, j8)));
        }
        aVar.a();
    }
}
