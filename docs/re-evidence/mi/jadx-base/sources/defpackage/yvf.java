package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.fm;
import com.xiaomi.push.jc;
import com.xiaomi.push.ji;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class yvf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, bas.a> f40611a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map<String, Long> f40612b = new HashMap();

    public static void a(Context context, jc jcVar) {
        ArrayList arrayList;
        bas.a aVar;
        String strC = jcVar.c();
        if (jcVar.a() == 0 && (aVar = f40611a.get(strC)) != null) {
            aVar.e(jcVar.f320e, jcVar.f321f);
            bas.c(context).h(strC, aVar);
        }
        if (TextUtils.isEmpty(jcVar.f320e)) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.add(jcVar.f320e);
        }
        zei.a(fm.COMMAND_REGISTER.f62a, arrayList, jcVar.f308a, jcVar.f319d, null, null);
    }

    public static void b(Context context, ji jiVar) {
        zei.a(fm.COMMAND_UNREGISTER.f62a, null, jiVar.f386a, jiVar.f394d, null, null);
        jiVar.a();
    }
}
