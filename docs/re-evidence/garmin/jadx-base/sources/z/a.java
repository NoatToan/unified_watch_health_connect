package z;

import a0.e;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.q;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraUpdateException;
import b0.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import v.j0;
import v.s0;

/* JADX INFO: loaded from: classes.dex */
public class a implements c0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f200494b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f200493a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f200496d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashSet f200497e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f200498f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f200499g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f200495c = new ArrayList();

    public a(q qVar) {
        this.f200494b = qVar;
        try {
            a(Arrays.asList(qVar.c()));
        } catch (CameraAccessExceptionCompat | CameraUpdateException unused) {
        }
    }

    @Override // androidx.camera.core.impl.q1
    public final void a(List<String> list) throws CameraUpdateException {
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        try {
            for (Set<String> set : this.f200494b.f5368a.d()) {
                if (list.containsAll(set)) {
                    ArrayList arrayList = new ArrayList(set);
                    if (arrayList.size() >= 2) {
                        String str = (String) arrayList.get(0);
                        String str2 = (String) arrayList.get(1);
                        try {
                            if (s0.a(str, this.f200494b) && s0.a(str2, this.f200494b)) {
                                hashSet.add(new HashSet(Arrays.asList(str, str2)));
                                if (!map.containsKey(str)) {
                                    map.put(str, new ArrayList());
                                }
                                ((List) map.get(str)).add(str2);
                                if (!map.containsKey(str2)) {
                                    map.put(str2, new ArrayList());
                                }
                                ((List) map.get(str2)).add(str);
                            }
                        } catch (InitializationException unused) {
                        }
                    }
                }
            }
            synchronized (this.f200493a) {
                this.f200496d = map;
                this.f200497e = hashSet;
                Objects.toString(map);
            }
        } catch (CameraAccessExceptionCompat e4) {
            throw new CameraUpdateException("Failed to retrieve concurrent camera id info.", e4);
        }
    }

    public final int b() {
        int i14;
        synchronized (this.f200493a) {
            i14 = this.f200499g;
        }
        return i14;
    }

    public final String c(String str) {
        synchronized (this.f200493a) {
            try {
                if (!this.f200496d.containsKey(str)) {
                    return null;
                }
                List<String> list = (List) this.f200496d.get(str);
                if (list == null) {
                    return null;
                }
                for (String str2 : list) {
                    Iterator it = this.f200498f.iterator();
                    while (it.hasNext()) {
                        e eVarA = e.a((r) it.next());
                        j0 j0Var = eVarA.f30b;
                        if (str2.equals(j0Var != null ? j0Var.f173850a : eVarA.f29a.f174094a)) {
                            return str2;
                        }
                    }
                }
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
