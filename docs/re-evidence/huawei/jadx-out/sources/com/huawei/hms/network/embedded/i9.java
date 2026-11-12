package com.huawei.hms.network.embedded;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes34.dex */
public final class i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eb f14922a = eb.d("\"\\");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final eb f14923b = eb.d("\t ,=");

    public static j7 e(v7 v7Var) {
        return a(v7Var.C().H().e(), v7Var.y());
    }

    public static Set<String> d(v7 v7Var) {
        return c(v7Var.y());
    }

    public static boolean c(v7 v7Var) {
        return b(v7Var.y());
    }

    public static boolean c(bb bbVar) {
        boolean z = false;
        while (!bbVar.i()) {
            byte bJ = bbVar.j(0L);
            if (bJ != 44) {
                if (bJ != 32 && bJ != 9) {
                    break;
                }
                bbVar.readByte();
            } else {
                try {
                    bbVar.readByte();
                    z = true;
                } catch (EOFException e) {
                    throw new AssertionError(e);
                }
            }
        }
        return z;
    }

    public static Set<String> c(j7 j7Var) {
        Set<String> treeSet = Collections.EMPTY_SET;
        int iD = j7Var.d();
        for (int i = 0; i < iD; i++) {
            if ("Vary".equalsIgnoreCase(j7Var.a(i))) {
                String strB = j7Var.b(i);
                if (treeSet.isEmpty()) {
                    treeSet = new TreeSet<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : strB.split(",")) {
                    treeSet.add(str.trim());
                }
            }
        }
        return treeSet;
    }

    public static boolean b(v7 v7Var) {
        if (v7Var.H().h().equals("HEAD")) {
            return false;
        }
        int iW = v7Var.w();
        return (((iW >= 100 && iW < 200) || iW == 204 || iW == 304) && a(v7Var) == -1 && !"chunked".equalsIgnoreCase(v7Var.b("Transfer-Encoding"))) ? false : true;
    }

    public static boolean b(j7 j7Var) {
        return c(j7Var).contains("*");
    }

    public static String b(bb bbVar) {
        try {
            long jC = bbVar.c(f14923b);
            if (jC == -1) {
                jC = bbVar.B();
            }
            if (jC != 0) {
                return bbVar.f(jC);
            }
            return null;
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public static int b(String str, int i) {
        char cCharAt;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\t')) {
            i++;
        }
        return i;
    }

    public static boolean a(v7 v7Var, j7 j7Var, t7 t7Var) {
        for (String str : d(v7Var)) {
            if (!Objects.equals(j7Var.d(str), t7Var.b(str))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8 A[Catch: EOFException -> 0x00c7, TRY_LEAVE, TryCatch #0 {EOFException -> 0x00c7, blocks: (B:34:0x0093, B:36:0x0099, B:38:0x00a3, B:39:0x00a8), top: B:54:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x007d A[EDGE_INSN: B:65:0x007d->B:27:0x007d BREAK  A[LOOP:2: B:21:0x006a->B:50:0x00c5], SYNTHETIC] */
    public static void a(List<w6> list, bb bbVar) {
        String strB;
        while (true) {
            String strB2 = null;
            while (true) {
                if (strB2 == null) {
                    c(bbVar);
                    strB2 = b(bbVar);
                    if (strB2 == null) {
                        return;
                    }
                }
                boolean zC = c(bbVar);
                String strB3 = b(bbVar);
                if (strB3 == null) {
                    if (bbVar.i()) {
                        list.add(new w6(strB2, (Map<String, String>) Collections.EMPTY_MAP));
                        return;
                    }
                    return;
                }
                int iA = a(bbVar, (byte) 61);
                boolean zC2 = c(bbVar);
                if (zC || !(zC2 || bbVar.i())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iA2 = iA + a(bbVar, (byte) 61);
                    while (true) {
                        if (strB3 == null) {
                            strB3 = b(bbVar);
                            if (c(bbVar)) {
                                break;
                            }
                            iA2 = a(bbVar, (byte) 61);
                            if (iA2 == 0) {
                                break;
                            }
                            if (iA2 <= 1 || c(bbVar)) {
                                return;
                            }
                            try {
                                if (bbVar.i() && bbVar.j(0L) == 34) {
                                    strB = a(bbVar);
                                } else {
                                    strB = b(bbVar);
                                }
                                if (strB != null || ((String) linkedHashMap.put(strB3, strB)) != null) {
                                    return;
                                }
                                if (c(bbVar) && !bbVar.i()) {
                                    return;
                                } else {
                                    strB3 = null;
                                }
                            } catch (EOFException e) {
                                throw new AssertionError(e);
                            }
                        } else {
                            if (iA2 == 0) {
                                break;
                                break;
                            }
                            if (iA2 <= 1) {
                                return;
                            }
                            if (bbVar.i()) {
                                strB = b(bbVar);
                            } else {
                                strB = b(bbVar);
                            }
                            if (strB != null) {
                                return;
                            }
                            if (c(bbVar)) {
                            }
                            strB3 = null;
                        }
                    }
                    list.add(new w6(strB2, linkedHashMap));
                    strB2 = strB3;
                } else {
                    list.add(new w6(strB2, (Map<String, String>) Collections.singletonMap(null, strB3 + a('=', iA))));
                }
            }
        }
    }

    public static void a(c7 c7Var, m7 m7Var, j7 j7Var) {
        if (c7Var == c7.f14675a) {
            return;
        }
        List<b7> listA = b7.a(m7Var, j7Var);
        if (listA.isEmpty()) {
            return;
        }
        c7Var.a(m7Var, listA);
    }

    public static List<w6> a(j7 j7Var, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < j7Var.d(); i++) {
            if (str.equalsIgnoreCase(j7Var.a(i))) {
                a(arrayList, new bb().a(j7Var.b(i)));
            }
        }
        return arrayList;
    }

    public static String a(bb bbVar) throws EOFException {
        if (bbVar.readByte() != 34) {
            throw new IllegalArgumentException();
        }
        bb bbVar2 = new bb();
        while (true) {
            long jC = bbVar.c(f14922a);
            if (jC == -1) {
                return null;
            }
            if (bbVar.j(jC) == 34) {
                bbVar2.write(bbVar, jC);
                bbVar.readByte();
                return bbVar2.o();
            }
            if (bbVar.B() == jC + 1) {
                return null;
            }
            bbVar2.write(bbVar, jC);
            bbVar.readByte();
            bbVar2.write(bbVar, 1L);
        }
    }

    public static String a(char c2, int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, c2);
        return new String(cArr);
    }

    public static j7 a(j7 j7Var, j7 j7Var2) {
        Set<String> setC = c(j7Var2);
        if (setC.isEmpty()) {
            return f8.f14778c;
        }
        j7.a aVar = new j7.a();
        int iD = j7Var.d();
        for (int i = 0; i < iD; i++) {
            String strA = j7Var.a(i);
            if (setC.contains(strA)) {
                aVar.a(strA, j7Var.b(i));
            }
        }
        return aVar.a();
    }

    public static long a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static long a(v7 v7Var) {
        return a(v7Var.y());
    }

    public static long a(j7 j7Var) {
        return a(j7Var.a("Content-Length"));
    }

    public static int a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int a(String str, int i) {
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static int a(bb bbVar, byte b2) {
        int i = 0;
        while (!bbVar.i() && bbVar.j(0L) == b2) {
            i++;
            try {
                bbVar.readByte();
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        }
        return i;
    }
}
