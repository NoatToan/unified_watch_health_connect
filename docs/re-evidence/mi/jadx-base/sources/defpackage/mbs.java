package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class mbs extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f25983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zcs f25984b;

    public mbs(Context context) {
        this.f25983a = context;
        this.f25984b = zcs.b(context);
    }

    public static gcs a(File file) throws Throwable {
        String strW = zns.w(file);
        gcs gcsVar = new gcs();
        gcsVar.o(strW);
        return gcsVar;
    }

    public static boolean e(String str, ArrayList<gcs> arrayList) {
        Iterator<gcs> it = arrayList.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().j())) {
                return true;
            }
        }
        return false;
    }

    public final gcs b(String str) throws Throwable {
        if (str.equals("quanguo")) {
            str = "quanguogaiyaotu";
        }
        zas zasVarA = zas.a(this.f25983a);
        gcs gcsVarA = null;
        if (zasVarA != null) {
            String strE = zasVarA.E(str);
            File[] fileArrListFiles = new File(zns.h0(this.f25983a)).listFiles();
            if (fileArrListFiles == null) {
                return null;
            }
            for (File file : fileArrListFiles) {
                if ((file.getName().contains(strE) || file.getName().contains(str)) && file.getName().endsWith(".zip.tmp.dt")) {
                    gcsVarA = a(file);
                    if (gcsVarA.a() != null) {
                        return gcsVarA;
                    }
                }
            }
        }
        return gcsVarA;
    }

    public final void c() {
        gcs gcsVarB;
        String strI;
        int iIndexOf;
        boolean z;
        String strI2;
        int iIndexOf2;
        String strI3;
        int iIndexOf3;
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<gcs> arrayListC = this.f25984b.c();
        d(arrayList, "vmap/");
        d(arrayList, "map/");
        g(arrayList, "map/");
        ArrayList<String> arrayListF = f();
        for (gcs gcsVar : arrayListC) {
            if (gcsVar != null && gcsVar.a() != null) {
                int i = gcsVar.l;
                if (i == 4 || i == 7) {
                    boolean zContains = arrayList.contains(gcsVar.j());
                    if (!zContains && (strI = bes.i(gcsVar.g())) != null && (iIndexOf = arrayList.indexOf(strI)) != -1) {
                        arrayList.set(iIndexOf, gcsVar.j());
                    } else if (!zContains) {
                        this.f25984b.k(gcsVar);
                    }
                } else if (i == 0 || i == 1) {
                    z = arrayListF.contains(gcsVar.e()) || arrayListF.contains(gcsVar.j());
                    if (!z && (strI2 = bes.i(gcsVar.g())) != null && (iIndexOf2 = arrayListF.indexOf(strI2)) != -1) {
                        arrayListF.set(iIndexOf2, gcsVar.j());
                    } else if (!z) {
                        this.f25984b.k(gcsVar);
                    }
                } else if (i == 3 && gcsVar.i() != 0) {
                    z = arrayListF.contains(gcsVar.e()) || arrayListF.contains(gcsVar.j());
                    if (!z && (strI3 = bes.i(gcsVar.g())) != null && (iIndexOf3 = arrayListF.indexOf(strI3)) != -1) {
                        arrayListF.set(iIndexOf3, gcsVar.j());
                    } else if (!z) {
                        this.f25984b.k(gcsVar);
                    }
                }
            }
        }
        for (String str : arrayList) {
            if (!e(str, arrayListC) && (gcsVarB = b(str)) != null) {
                this.f25984b.e(gcsVarB);
            }
        }
        zas zasVarA = zas.a(this.f25983a);
        if (zasVarA != null) {
            zasVarA.j();
        }
    }

    public final void d(ArrayList<String> arrayList, String str) {
        File[] fileArrListFiles;
        String name;
        int iLastIndexOf;
        File file = new File(zns.Y(this.f25983a) + str);
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.getName().endsWith(".dat") && (iLastIndexOf = (name = file2.getName()).lastIndexOf(46)) >= 0 && iLastIndexOf < name.length()) {
                    String strSubstring = name.substring(0, iLastIndexOf);
                    if (!arrayList.contains(strSubstring)) {
                        arrayList.add(strSubstring);
                    }
                }
            }
        }
    }

    public final ArrayList<String> f() {
        File[] fileArrListFiles;
        String name;
        int iLastIndexOf;
        ArrayList<String> arrayList = new ArrayList<>();
        File file = new File(zns.h0(this.f25983a));
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
            return arrayList;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(".zip") && (iLastIndexOf = (name = file2.getName()).lastIndexOf(46)) >= 0 && iLastIndexOf < name.length()) {
                arrayList.add(name.substring(0, iLastIndexOf));
            }
        }
        return arrayList;
    }

    public final void g(ArrayList<String> arrayList, String str) {
        File[] fileArrListFiles;
        String[] list;
        File file = new File(zns.v(this.f25983a) + str);
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    String name = file2.getName();
                    if (!TextUtils.isEmpty(name) && (list = file2.list()) != null && list.length > 0 && !arrayList.contains(name)) {
                        if (!name.equals("a0")) {
                            boolean z = false;
                            boolean z2 = false;
                            for (String str2 : list) {
                                if ("m1.ans".equals(str2)) {
                                    z = true;
                                }
                                if ("m3.ans".equals(str2)) {
                                    z2 = true;
                                }
                            }
                            if (z && z2) {
                                arrayList.add(name);
                                break;
                                break;
                            }
                        } else {
                            for (String str3 : list) {
                                if ("m1.ans".equals(str3)) {
                                    arrayList.add(name);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            c();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
