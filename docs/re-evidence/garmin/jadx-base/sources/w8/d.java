package w8;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import c53.c0;
import c53.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.g0;
import p13.l0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw8/d;", "Lg/a;", "", "", "providerPackageName", "<init>", "(Ljava/lang/String;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends g.a<Set<? extends String>, Set<? extends String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183541a;

    public /* synthetic */ d(String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? "com.google.android.apps.healthdata" : str);
    }

    @Override // g.a
    public final Intent a(Context context, Set<? extends String> set) {
        Set<? extends String> set2 = set;
        context.getClass();
        set2.getClass();
        h0 h0VarO = c0.o(new g0(set2), b.f183539a);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = h0VarO.iterator();
        while (true) {
            h0.a aVar = (h0.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            arrayList.add(aVar.next());
        }
        set2.size();
        int i14 = l9.a.f111509a;
        Intent intent = new Intent("androidx.health.ACTION_REQUEST_PERMISSIONS");
        intent.putParcelableArrayListExtra("requested_permissions_string", arrayList);
        String str = this.f183541a;
        if (str.length() > 0) {
            intent.setPackage(str);
        }
        return intent;
    }

    @Override // g.a
    public final g.a.C1502a<Set<? extends String>> b(Context context, Set<? extends String> set) {
        context.getClass();
        set.getClass();
        return null;
    }

    @Override // g.a
    public final Set<? extends String> c(int i14, Intent intent) {
        Set<? extends String> setU;
        ArrayList parcelableArrayListExtra;
        if (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("granted_permissions_string")) == null || (setU = c0.u(c0.o(new g0(parcelableArrayListExtra), c.f183540a))) == null) {
            setU = l0.f134950a;
        }
        setU.size();
        int i15 = l9.a.f111509a;
        return setU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public d(String str) {
        str.getClass();
        this.f183541a = str;
    }
}
