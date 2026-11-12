package defpackage;

import androidx.appcompat.app.AppCompatDelegate;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class fdm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static fdm f33898c;
    private String d;
    private int e;
    private ArrayList<fde> i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<fde> f33900b = new ArrayList<>();
    private ArrayList<fde> g = new ArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<fdg> f33899a = new ArrayList<>();

    private fdm() {
    }

    public static fdm d() {
        fdm fdmVar;
        synchronized (fdm.class) {
            if (f33898c == null) {
                f33898c = new fdm();
            }
            fdmVar = f33898c;
        }
        return fdmVar;
    }

    public int c() {
        return this.e;
    }

    public void d(int i) {
        this.e = i;
    }

    public ArrayList<fde> b() {
        return f();
    }

    public ArrayList<fde> h() {
        return i();
    }

    public ArrayList<fde> j() {
        return this.i;
    }

    public void b(ArrayList<fde> arrayList) {
        this.i = arrayList;
    }

    public ArrayList<fdg> e() {
        return this.f33899a;
    }

    public void a(ArrayList<fdg> arrayList) {
        this.f33899a = arrayList;
    }

    public String a() {
        return this.d;
    }

    public void c(String str) {
        this.d = str;
    }

    private ArrayList<fde> f() {
        fde fdeVarA = a(0, 90, 0, 60, 0, 0);
        fdeVarA.d(0);
        fde fdeVarA2 = a(91, Constants.MAX_PRO_BOTTOM_MARGIN_PAD, 61, 79, 1, 0);
        fdeVarA2.d(1);
        fde fdeVarA3 = a(120, 139, 80, 89, 2, 1);
        fdeVarA3.d(2);
        fde fdeVarG = g();
        fdeVarG.d(3);
        this.f33900b.clear();
        this.f33900b.add(fdeVarA);
        this.f33900b.add(fdeVarA2);
        this.f33900b.add(fdeVarA3);
        this.f33900b.add(fdeVarG);
        return this.f33900b;
    }

    private fde g() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        fde.b bVar = new fde.b();
        fde.b bVar2 = new fde.b();
        fde.b bVar3 = new fde.b();
        fde fdeVar = new fde();
        arrayList7.clear();
        arrayList.add(140);
        arrayList.add(159);
        arrayList2.add(90);
        arrayList2.add(99);
        bVar.c(0);
        bVar.d(3);
        bVar.a(1);
        bVar.e(arrayList);
        bVar.c(arrayList2);
        arrayList7.add(0, bVar);
        arrayList3.add(160);
        arrayList3.add(179);
        arrayList4.add(100);
        arrayList4.add(Integer.valueOf(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY));
        bVar2.c(1);
        bVar2.d(4);
        bVar2.a(1);
        bVar2.e(arrayList3);
        bVar2.c(arrayList4);
        arrayList7.add(1, bVar2);
        arrayList5.add(180);
        arrayList5.add(999);
        arrayList6.add(110);
        arrayList6.add(999);
        bVar3.c(2);
        bVar3.d(5);
        bVar3.a(1);
        bVar3.e(arrayList5);
        bVar3.c(arrayList6);
        arrayList7.add(2, bVar3);
        fdeVar.a(arrayList7);
        return fdeVar;
    }

    private fde a(int i, int i2, int i3, int i4, int i5, int i6) {
        ArrayList arrayList = new ArrayList();
        fde.b bVar = new fde.b();
        fde fdeVar = new fde();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
        arrayList2.add(Integer.valueOf(i));
        arrayList2.add(Integer.valueOf(i2));
        arrayList3.add(Integer.valueOf(i3));
        arrayList3.add(Integer.valueOf(i4));
        bVar.c(0);
        bVar.d(i5);
        bVar.a(i6);
        bVar.c(arrayList3);
        bVar.e(arrayList2);
        arrayList.add(bVar);
        fdeVar.a(arrayList);
        return fdeVar;
    }

    private ArrayList<fde> i() {
        fde fdeVarA = a(0, 90, 0, 60, 0, 0);
        fdeVarA.d(0);
        fde fdeVarA2 = a(91, 129, 61, 84, 1, 2);
        fdeVarA2.d(1);
        fde fdeVarA3 = a(130, 139, 85, 89, 2, 2);
        fdeVarA3.d(2);
        fde fdeVarG = g();
        fdeVarG.d(3);
        this.g.clear();
        this.g.add(fdeVarA);
        this.g.add(fdeVarA2);
        this.g.add(fdeVarA3);
        this.g.add(fdeVarG);
        return this.g;
    }
}
