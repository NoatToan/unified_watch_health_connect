package com.loc;

import java.util.ArrayList;
import java.util.HashMap;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes18.dex */
public final class dt {
    private HashMap<Long, du> a = new HashMap<>();
    private long b = 0;

    private static long a(int i, int i2) {
        return (((long) i2) & WebSocketProtocol.s) | ((((long) i) & WebSocketProtocol.s) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0020  */
    public final long a(du duVar) {
        int i;
        int i2;
        long jA;
        if (duVar == null || !duVar.p) {
            return 0L;
        }
        HashMap<Long, du> map = this.a;
        int i3 = duVar.k;
        if (i3 == 1) {
            i = duVar.c;
            i2 = duVar.d;
            jA = a(i, i2);
        } else if (i3 == 2) {
            i = duVar.h;
            i2 = duVar.i;
            jA = a(i, i2);
        } else if (i3 == 3 || i3 == 4) {
            i = duVar.c;
            i2 = duVar.d;
            jA = a(i, i2);
        } else {
            jA = 0;
        }
        du duVar2 = map.get(Long.valueOf(jA));
        if (duVar2 == null) {
            duVar.m = eo.b();
            map.put(Long.valueOf(jA), duVar);
            return 0L;
        }
        if (duVar2.j != duVar.j) {
            duVar.m = eo.b();
            map.put(Long.valueOf(jA), duVar);
            return 0L;
        }
        duVar.m = duVar2.m;
        map.put(Long.valueOf(jA), duVar);
        return (eo.b() - duVar2.m) / 1000;
    }

    public final void a() {
        this.a.clear();
        this.b = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
    
        if (r12 != 4) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ArrayList<? extends du> arrayList) {
        int i;
        int i2;
        int i3;
        int i4;
        if (arrayList != null) {
            long jB = eo.b();
            long j = this.b;
            long jA = 0;
            if (j <= 0 || jB - j >= 60000) {
                HashMap<Long, du> map = this.a;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    du duVar = arrayList.get(i5);
                    if (duVar.p) {
                        int i6 = duVar.k;
                        if (i6 == 1) {
                            i3 = duVar.c;
                            i4 = duVar.d;
                            jA = a(i3, i4);
                        } else if (i6 == 2) {
                            i3 = duVar.h;
                            i4 = duVar.i;
                            jA = a(i3, i4);
                        } else if (i6 == 3 || i6 == 4) {
                            i3 = duVar.c;
                            i4 = duVar.d;
                            jA = a(i3, i4);
                        }
                        du duVar2 = map.get(Long.valueOf(jA));
                        if (duVar2 != null) {
                            if (duVar2.j == duVar.j) {
                                duVar.m = duVar2.m;
                            } else {
                                duVar.m = jB;
                            }
                        }
                    }
                }
                map.clear();
                int size2 = arrayList.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    du duVar3 = arrayList.get(i7);
                    if (duVar3.p) {
                        int i8 = duVar3.k;
                        if (i8 == 1) {
                            i = duVar3.c;
                            i2 = duVar3.d;
                            jA = a(i, i2);
                        } else if (i8 != 2) {
                            if (i8 != 3) {
                            }
                            i = duVar3.c;
                            i2 = duVar3.d;
                            jA = a(i, i2);
                        } else {
                            i = duVar3.h;
                            i2 = duVar3.i;
                            jA = a(i, i2);
                        }
                        map.put(Long.valueOf(jA), duVar3);
                    }
                }
                this.b = jB;
            }
        }
    }
}
