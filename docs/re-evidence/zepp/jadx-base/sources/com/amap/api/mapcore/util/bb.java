package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import androidx.multidex.MultiDexExtractor;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class bb extends Thread {
    private Context a;
    private bn b;

    public bb(Context context) {
        this.a = context;
        this.b = bn.a(context);
    }

    private bi a(String str) throws Throwable {
        if (str.equals("quanguo")) {
            str = "quanguogaiyaotu";
        }
        ay ayVarA = ay.a(this.a);
        bi biVar = null;
        if (ayVarA != null) {
            String strF = ayVarA.f(str);
            File[] fileArrListFiles = new File(er.c(this.a)).listFiles();
            if (fileArrListFiles == null) {
                return null;
            }
            for (File file : fileArrListFiles) {
                if ((file.getName().contains(strF) || file.getName().contains(str)) && file.getName().endsWith(".zip.tmp.dt")) {
                    String strA = er.a(file);
                    bi biVar2 = new bi();
                    biVar2.b(strA);
                    if (biVar2.c() != null) {
                        return biVar2;
                    }
                    biVar = biVar2;
                }
            }
        }
        return biVar;
    }

    private void b(ArrayList<String> arrayList, String str) {
        File[] fileArrListFiles;
        String[] list;
        File file = new File(er.a(this.a) + str);
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    String name = file2.getName();
                    if (!TextUtils.isEmpty(name) && (list = file2.list()) != null && list.length > 0 && !arrayList.contains(name)) {
                        boolean z = true;
                        if (!name.equals("a0")) {
                            boolean z2 = false;
                            boolean z3 = false;
                            for (String str2 : list) {
                                if ("m1.ans".equals(str2)) {
                                    z2 = true;
                                }
                                if ("m3.ans".equals(str2)) {
                                    z3 = true;
                                }
                            }
                            if (!z2 || !z3) {
                                z = false;
                                break;
                            }
                        } else {
                            int length = list.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    z = false;
                                    break;
                                } else if ("m1.ans".equals(list[i])) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        if (z) {
                            arrayList.add(name);
                        }
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        bi biVarA;
        String strB;
        int iIndexOf;
        boolean z;
        String strB2;
        int iIndexOf2;
        String strB3;
        int iIndexOf3;
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<bi> arrayListA = this.b.a();
            a(arrayList, "vmap/");
            a(arrayList, "map/");
            b(arrayList, "map/");
            ArrayList<String> arrayListA2 = a();
            for (bi biVar : arrayListA) {
                if (biVar != null && biVar.c() != null) {
                    int i = biVar.l;
                    boolean z2 = true;
                    if (i == 4 || i == 7) {
                        boolean zContains = arrayList.contains(biVar.m);
                        if (zContains || (strB = bv.b(biVar.f())) == null || (iIndexOf = arrayList.indexOf(strB)) == -1) {
                            z2 = zContains;
                        } else {
                            arrayList.set(iIndexOf, biVar.m);
                        }
                        if (!z2) {
                            this.b.b(biVar);
                        }
                    } else if (i == 0 || i == 1) {
                        z = arrayListA2.contains(biVar.e()) || arrayListA2.contains(biVar.m);
                        if (z || (strB2 = bv.b(biVar.f())) == null || (iIndexOf2 = arrayListA2.indexOf(strB2)) == -1) {
                            z2 = z;
                        } else {
                            arrayListA2.set(iIndexOf2, biVar.m);
                        }
                        if (!z2) {
                            this.b.b(biVar);
                        }
                    } else if (i == 3 && biVar.g() != 0) {
                        z = arrayListA2.contains(biVar.e()) || arrayListA2.contains(biVar.m);
                        if (z || (strB3 = bv.b(biVar.f())) == null || (iIndexOf3 = arrayListA2.indexOf(strB3)) == -1) {
                            z2 = z;
                        } else {
                            arrayListA2.set(iIndexOf3, biVar.m);
                        }
                        if (!z2) {
                            this.b.b(biVar);
                        }
                    }
                }
            }
            for (String str : arrayList) {
                if (!a(str, arrayListA) && (biVarA = a(str)) != null) {
                    this.b.a(biVarA);
                }
            }
            ay ayVarA = ay.a(this.a);
            if (ayVarA != null) {
                ayVarA.b();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static boolean a(String str, ArrayList<bi> arrayList) {
        Iterator<bi> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (str.equals(it2.next().m)) {
                return true;
            }
        }
        return false;
    }

    private void a(ArrayList<String> arrayList, String str) {
        File[] fileArrListFiles;
        String name;
        int iLastIndexOf;
        File file = new File(er.b(this.a) + str);
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

    private ArrayList<String> a() {
        File[] fileArrListFiles;
        String name;
        int iLastIndexOf;
        ArrayList<String> arrayList = new ArrayList<>();
        File file = new File(er.c(this.a));
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
            return arrayList;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(MultiDexExtractor.EXTRACTED_SUFFIX) && (iLastIndexOf = (name = file2.getName()).lastIndexOf(46)) >= 0 && iLastIndexOf < name.length()) {
                arrayList.add(name.substring(0, iLastIndexOf));
            }
        }
        return arrayList;
    }
}
