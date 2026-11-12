package g;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p13.h0;
import p13.k0;
import p13.t0;
import p13.u;
import p13.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00040\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lg/f;", "Lg/a;", "", "", "", "", "<init>", "()V", "a", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends g.a<String[], Map<String, Boolean>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f74076a = new a(null);

    public static g.a.C1502a d(Context context, String[] strArr) {
        context.getClass();
        strArr.getClass();
        if (strArr.length == 0) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            return new g.a.C1502a(k0Var);
        }
        for (String str : strArr) {
            if (a7.b.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        int iA = t0.a(strArr.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (String str2 : strArr) {
            p pVar = new p(str2, Boolean.TRUE);
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
        return new g.a.C1502a(linkedHashMap);
    }

    public static Map e(int i14, Intent intent) {
        if (i14 != -1) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            return k0Var;
        }
        if (intent == null) {
            k0 k0Var2 = k0.f134949a;
            k0Var2.getClass();
            return k0Var2;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            k0 k0Var3 = k0.f134949a;
            k0Var3.getClass();
            return k0Var3;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i15 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i15 == 0));
        }
        return u0.l(h0.k1(u.C(stringArrayExtra), arrayList));
    }

    @Override // g.a
    public final Intent a(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        context.getClass();
        strArr2.getClass();
        f74076a.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr2);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // g.a
    public final /* bridge */ /* synthetic */ g.a.C1502a<Map<String, Boolean>> b(Context context, String[] strArr) {
        return d(context, strArr);
    }

    @Override // g.a
    public final /* bridge */ /* synthetic */ Map<String, Boolean> c(int i14, Intent intent) {
        return e(i14, intent);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lg/f$a;", "", "<init>", "()V", "", "ACTION_REQUEST_PERMISSIONS", "Ljava/lang/String;", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
