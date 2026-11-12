package defpackage;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import androidx.fragment.app.Fragment;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class qpm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f46606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f46608c;
    private Fragment d;
    private Object e;
    private String f;
    private String g;
    private String j;

    public qpm(Fragment fragment, String str, int i) {
        this.d = fragment;
        this.j = str;
        this.f46607b = i;
    }

    public void d(String str) {
        this.j = str;
    }

    public Drawable e() {
        return this.f46608c;
    }

    public void c(Drawable drawable) {
        this.f46608c = drawable;
    }

    public Fragment d() {
        return this.d;
    }

    public void b(Fragment fragment) {
        this.d = fragment;
    }

    public String g() {
        return this.j;
    }

    public int c() {
        return this.f46607b;
    }

    public String f() {
        return this.f;
    }

    public void e(String str) {
        this.f = str;
    }

    public Object b() {
        return this.e;
    }

    public qpm a(Object obj) {
        this.e = obj;
        return this;
    }

    public String i() {
        return this.g;
    }

    public void c(String str) {
        this.g = str;
    }

    public Drawable a() {
        return this.f46606a;
    }

    public void d(Drawable drawable) {
        this.f46606a = drawable;
    }

    public void d(qpm qpmVar) {
        if (qpmVar == null) {
            return;
        }
        Drawable drawable = qpmVar.f46608c;
        if (drawable != null) {
            this.f46608c = drawable;
        }
        Drawable drawable2 = qpmVar.f46606a;
        if (drawable2 != null) {
            this.f46606a = drawable2;
        }
        if (qpmVar.f != null) {
            this.f = qpmVar.f();
        }
        if (qpmVar.g != null) {
            this.g = qpmVar.i();
        }
        if (qpmVar.j != null) {
            this.j = qpmVar.g();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f46607b == ((qpm) obj).f46607b;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public static List<qpm> e(List<qpm> list) {
        if (list.size() <= 1) {
            return list;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList = new ArrayList(list.size());
        for (qpm qpmVar : list) {
            if (qpmVar != null && !hashSet.contains(qpmVar.d()) && !hashSet2.contains(Integer.valueOf(qpmVar.c()))) {
                hashSet.add(qpmVar.d());
                hashSet2.add(Integer.valueOf(qpmVar.c()));
                arrayList.add(qpmVar);
            }
        }
        return arrayList;
    }

    public static void e(List<qpm> list, List<qpm> list2) {
        b(list, list2, true);
    }

    public static void b(List<qpm> list, List<qpm> list2, boolean z) {
        if (list == null || list2 == null) {
            LogUtil.a("FragmentSubTabPagerBean", "is fromList null: ", Boolean.valueOf(list == null), ", is toList null: ", Boolean.valueOf(list2 == null));
            return;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i = 0; i < list2.size(); i++) {
            qpm qpmVar = list2.get(i);
            if (qpmVar != null) {
                sparseIntArray.put(qpmVar.c(), i);
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            qpm qpmVar2 = list.get(i2);
            if (qpmVar2 != null) {
                int i3 = sparseIntArray.get(qpmVar2.c(), -1);
                if (i3 < 0) {
                    list2.add(qpmVar2);
                } else if (z) {
                    list2.get(i3).d(qpmVar2);
                } else {
                    list2.set(i3, qpmVar2);
                }
            }
        }
    }

    public static void b(List<qpm> list, List<qpm> list2) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            qpm qpmVar = list.get(i2);
            if (qpmVar != null) {
                sparseIntArray.put(qpmVar.c(), i2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list2.size(); i3++) {
            qpm qpmVar2 = list2.get(i3);
            if (qpmVar2 != null && sparseIntArray.get(qpmVar2.c(), -1) >= 0) {
                arrayList.add(qpmVar2);
            }
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            qpm qpmVar3 = (qpm) arrayList.get(i4);
            if (qpmVar3 != null) {
                int i5 = sparseIntArray.get(qpmVar3.c(), -1);
                if (!njy.e(arrayList, i5)) {
                    if (i5 != i4) {
                        Collections.swap(arrayList, i4, i5);
                    } else {
                        i4++;
                    }
                }
            }
        }
        int i6 = 0;
        while (i < list2.size() && i6 < arrayList.size()) {
            qpm qpmVar4 = list2.get(i);
            if (qpmVar4 == null || sparseIntArray.get(qpmVar4.c(), -1) < 0) {
                i++;
            } else {
                list2.set(i, (qpm) arrayList.get(i6));
                i++;
                i6++;
            }
        }
    }
}
