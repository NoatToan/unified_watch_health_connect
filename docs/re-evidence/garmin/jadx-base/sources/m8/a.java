package m8;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import d53.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;
import w8.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm8/a;", "Lg/a;", "", "", "providerPackageName", "<init>", "(Ljava/lang/String;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends g.a<Set<? extends String>, Set<? extends String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a<Set<String>, Set<String>> f117131a;

    public a(String str) {
        str.getClass();
        this.f117131a = Build.VERSION.SDK_INT >= 34 ? new x8.a() : new d(str);
    }

    @Override // g.a
    public final Intent a(Context context, Set<? extends String> set) {
        Set<? extends String> set2 = set;
        context.getClass();
        set2.getClass();
        Set<? extends String> set3 = set2;
        if (!(set3 instanceof Collection) || !set3.isEmpty()) {
            Iterator<T> it = set3.iterator();
            while (it.hasNext()) {
                if (!u.y((String) it.next(), "android.permission.health.", false)) {
                    h.s("Unsupported health connect permission");
                    return null;
                }
            }
        }
        if (set2.isEmpty()) {
            h.s("At least one permission is required!");
            return null;
        }
        Intent intentA = this.f117131a.a(context, (Set<String>) set2);
        intentA.getClass();
        return intentA;
    }

    @Override // g.a
    public final Set<? extends String> c(int i14, Intent intent) {
        Set<String> setC = this.f117131a.c(i14, intent);
        setC.getClass();
        return setC;
    }

    public /* synthetic */ a(String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? "com.google.android.apps.healthdata" : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
