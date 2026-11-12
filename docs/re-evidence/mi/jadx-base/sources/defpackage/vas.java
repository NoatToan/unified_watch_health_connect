package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.xiaomi.push.ig;
import com.xiaomi.push.ih;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class vas {
    public static volatile vas d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f36683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f36684b;
    public HashSet<a> c = new HashSet<>();

    public static abstract class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f36686b;

        public a(int i, String str) {
            this.f36685a = i;
            this.f36686b = str;
        }

        public abstract void a();

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.f36685a == ((a) obj).f36685a;
        }

        public int hashCode() {
            return this.f36685a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a();
        }
    }

    public vas(Context context) {
        this.f36683a = context.getSharedPreferences("mipush_oc_normal", 0);
        this.f36684b = context.getSharedPreferences("mipush_oc_custom", 0);
    }

    public static vas d(Context context) {
        if (d == null) {
            synchronized (vas.class) {
                try {
                    if (d == null) {
                        d = new vas(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public int a(int i, int i2) {
        try {
            String strE = e(i);
            if (this.f36684b.contains(strE)) {
                return this.f36684b.getInt(strE, 0);
            }
            return this.f36683a.contains(strE) ? this.f36683a.getInt(strE, 0) : i2;
        } catch (Exception e) {
            x9s.o(i + " oc int error " + e);
            return i2;
        }
    }

    public int b(ih ihVar, int i) {
        try {
            return this.f36683a.getInt(g(ihVar), i);
        } catch (Exception e) {
            x9s.o(ihVar + " version error " + e);
            return i;
        }
    }

    public long c(int i, long j) {
        try {
            String strE = e(i);
            if (this.f36684b.contains(strE)) {
                return this.f36684b.getLong(strE, 0L);
            }
            return this.f36683a.contains(strE) ? this.f36683a.getLong(strE, 0L) : j;
        } catch (Exception e) {
            x9s.o(i + " oc long error " + e);
            return j;
        }
    }

    public final String e(int i) {
        return "oc_" + i;
    }

    public String f(int i, String str) {
        try {
            String strE = e(i);
            if (this.f36684b.contains(strE)) {
                return this.f36684b.getString(strE, null);
            }
            return this.f36683a.contains(strE) ? this.f36683a.getString(strE, null) : str;
        } catch (Exception e) {
            x9s.o(i + " oc string error " + e);
            return str;
        }
    }

    public final String g(ih ihVar) {
        return "oc_version_" + ihVar.a();
    }

    public synchronized void h() {
        this.c.clear();
    }

    public final void i(SharedPreferences.Editor editor, Pair<Integer, Object> pair, String str) {
        Object obj = pair.second;
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
            }
        } else {
            String str2 = (String) obj;
            if (str.equals(e(ig.AppIsInstalledList.a()))) {
                editor.putString(str, ecs.a(str2));
            } else {
                editor.putString(str, str2);
            }
        }
    }

    public synchronized void j(a aVar) {
        if (!this.c.contains(aVar)) {
            this.c.add(aVar);
        }
    }

    public void k(List<Pair<Integer, Object>> list) {
        if (m4s.a(list)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f36684b.edit();
        for (Pair<Integer, Object> pair : list) {
            Object obj = pair.first;
            if (obj != null) {
                String strE = e(((Integer) obj).intValue());
                if (pair.second == null) {
                    editorEdit.remove(strE);
                } else {
                    i(editorEdit, pair, strE);
                }
            }
        }
        editorEdit.apply();
    }

    public void l(List<Pair<ih, Integer>> list, List<Pair<Integer, Object>> list2) {
        if (m4s.a(list) || m4s.a(list2)) {
            x9s.o("not update oc, because versions or configs are empty");
            return;
        }
        SharedPreferences.Editor editorEdit = this.f36683a.edit();
        editorEdit.clear();
        for (Pair<ih, Integer> pair : list) {
            Object obj = pair.first;
            if (obj != null && pair.second != null) {
                editorEdit.putInt(g((ih) obj), ((Integer) pair.second).intValue());
            }
        }
        for (Pair<Integer, Object> pair2 : list2) {
            Object obj2 = pair2.first;
            if (obj2 != null && pair2.second != null) {
                i(editorEdit, pair2, e(((Integer) obj2).intValue()));
            }
        }
        editorEdit.apply();
    }

    public boolean m(int i, boolean z) {
        try {
            String strE = e(i);
            if (this.f36684b.contains(strE)) {
                return this.f36684b.getBoolean(strE, false);
            }
            return this.f36683a.contains(strE) ? this.f36683a.getBoolean(strE, false) : z;
        } catch (Exception e) {
            x9s.o(i + " oc boolean error " + e);
            return z;
        }
    }

    public void n() {
        x9s.B("OC_Callback : receive new oc data");
        HashSet<a> hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.c);
        }
        for (a aVar : hashSet) {
            if (aVar != null) {
                aVar.run();
            }
        }
        hashSet.clear();
    }
}
