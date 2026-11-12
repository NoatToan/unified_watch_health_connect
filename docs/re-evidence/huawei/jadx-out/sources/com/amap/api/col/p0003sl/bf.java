package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class bf extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private br f2263b;

    public bf(Context context) {
        this.f2262a = context;
        this.f2263b = br.a(context);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static bm a(File file) throws Throwable {
        String strA = eb.a(file);
        bm bmVar = new bm();
        bmVar.b(strA);
        return bmVar;
    }

    private void a() {
        bm bmVarA;
        String strB;
        int iIndexOf;
        boolean z;
        String strB2;
        int iIndexOf2;
        String strB3;
        int iIndexOf3;
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<bm> arrayListA = this.f2263b.a();
        a(arrayList, "vmap/");
        a(arrayList, "map/");
        b(arrayList, "map/");
        ArrayList<String> arrayListB = b();
        for (bm bmVar : arrayListA) {
            if (bmVar != null && bmVar.c() != null) {
                if (bmVar.l == 4 || bmVar.l == 7) {
                    boolean zContains = arrayList.contains(bmVar.h());
                    if (!zContains && (strB = bz.b(bmVar.f())) != null && (iIndexOf = arrayList.indexOf(strB)) != -1) {
                        arrayList.set(iIndexOf, bmVar.h());
                    } else if (!zContains) {
                        this.f2263b.b(bmVar);
                    }
                } else if (bmVar.l == 0 || bmVar.l == 1) {
                    z = arrayListB.contains(bmVar.e()) || arrayListB.contains(bmVar.h());
                    if (!z && (strB2 = bz.b(bmVar.f())) != null && (iIndexOf2 = arrayListB.indexOf(strB2)) != -1) {
                        arrayListB.set(iIndexOf2, bmVar.h());
                    } else if (!z) {
                        this.f2263b.b(bmVar);
                    }
                } else if (bmVar.l == 3 && bmVar.g() != 0) {
                    z = arrayListB.contains(bmVar.e()) || arrayListB.contains(bmVar.h());
                    if (!z && (strB3 = bz.b(bmVar.f())) != null && (iIndexOf3 = arrayListB.indexOf(strB3)) != -1) {
                        arrayListB.set(iIndexOf3, bmVar.h());
                    } else if (!z) {
                        this.f2263b.b(bmVar);
                    }
                }
            }
        }
        for (String str : arrayList) {
            if (!a(str, arrayListA) && (bmVarA = a(str)) != null) {
                this.f2263b.a(bmVarA);
            }
        }
        bc bcVarA = bc.a(this.f2262a);
        if (bcVarA != null) {
            bcVarA.b();
        }
    }

    private bm a(String str) throws Throwable {
        if (str.equals("quanguo")) {
            str = "quanguogaiyaotu";
        }
        bc bcVarA = bc.a(this.f2262a);
        bm bmVarA = null;
        if (bcVarA != null) {
            String strG = bcVarA.g(str);
            File[] fileArrListFiles = new File(eb.c(this.f2262a)).listFiles();
            if (fileArrListFiles == null) {
                return null;
            }
            for (File file : fileArrListFiles) {
                if ((file.getName().contains(strG) || file.getName().contains(str)) && file.getName().endsWith(".zip.tmp.dt")) {
                    bmVarA = a(file);
                    if (bmVarA.c() != null) {
                        return bmVarA;
                    }
                }
            }
        }
        return bmVarA;
    }

    private static boolean a(String str, ArrayList<bm> arrayList) {
        Iterator<bm> it = arrayList.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().h())) {
                return true;
            }
        }
        return false;
    }

    private void a(ArrayList<String> arrayList, String str) {
        File[] fileArrListFiles;
        String name;
        int iLastIndexOf;
        File file = new File(eb.b(this.f2262a) + str);
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

    private void b(ArrayList<String> arrayList, String str) {
        File[] fileArrListFiles;
        String[] list;
        File file = new File(eb.a(this.f2262a) + str);
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

    private ArrayList<String> b() {
        File[] fileArrListFiles;
        String name;
        int iLastIndexOf;
        ArrayList<String> arrayList = new ArrayList<>();
        File file = new File(eb.c(this.f2262a));
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.getName().endsWith(".zip") && (iLastIndexOf = (name = file2.getName()).lastIndexOf(46)) >= 0 && iLastIndexOf < name.length()) {
                    arrayList.add(name.substring(0, iLastIndexOf));
                }
            }
        }
        return arrayList;
    }
}
