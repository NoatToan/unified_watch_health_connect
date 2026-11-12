package x8;

import android.content.Context;
import android.content.Intent;
import g.f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx8/a;", "Lg/a;", "", "", "<init>", "()V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends g.a<Set<? extends String>, Set<? extends String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f189492a = new f();

    @Override // g.a
    public final Intent a(Context context, Set<? extends String> set) {
        Set<? extends String> set2 = set;
        context.getClass();
        set2.getClass();
        String[] strArr = (String[]) set2.toArray(new String[0]);
        this.f189492a.getClass();
        strArr.getClass();
        f.f74076a.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // g.a
    public final g.a.C1502a<Set<? extends String>> b(Context context, Set<? extends String> set) {
        Set<? extends String> set2 = set;
        context.getClass();
        set2.getClass();
        String[] strArr = (String[]) set2.toArray(new String[0]);
        this.f189492a.getClass();
        g.a.C1502a c1502aD = f.d(context, strArr);
        if (c1502aD == null) {
            return null;
        }
        T t7 = c1502aD.f74066a;
        t7.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) t7).entrySet()) {
            Boolean bool = (Boolean) entry.getValue();
            bool.getClass();
            if (bool.booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new g.a.C1502a<>(linkedHashMap.keySet());
    }

    @Override // g.a
    public final Set<? extends String> c(int i14, Intent intent) {
        this.f189492a.getClass();
        Map mapE = f.e(i14, intent);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapE.entrySet()) {
            Boolean bool = (Boolean) entry.getValue();
            bool.getClass();
            if (bool.booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }
}
