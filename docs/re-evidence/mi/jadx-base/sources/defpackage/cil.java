package defpackage;

import android.content.Context;
import com.google.android.exoplayer2.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class cil {
    public static Context e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5379a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<Integer, String> f5380b = new HashMap<>();
    public HashMap<Integer, ArrayList<Integer>> c = new HashMap<>();
    public static final cil d = new cil();
    public static List<i> f = new ArrayList();

    public static cil d() {
        return d;
    }

    public void a(i iVar) {
        f.add(iVar);
    }

    public Context b() {
        return e;
    }

    public HashMap<Integer, ArrayList<Integer>> c() {
        return this.c;
    }

    public HashMap<Integer, String> e() {
        return this.f5380b;
    }

    public l0i f() {
        return null;
    }

    public void g(Context context) {
        e = context.getApplicationContext();
    }

    public boolean h() {
        return this.f5379a;
    }

    public void i(ArrayList<Integer> arrayList) {
        ArrayList<Integer> arrayList2 = this.c.get(1);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
        }
        arrayList2.addAll(arrayList);
        this.c.put(1, arrayList2);
    }
}
