package com.google.android.exoplayer2.trackselection;

import defpackage.aop;
import defpackage.ayf;
import defpackage.znp;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static boolean a(aop aopVar, int i) {
        for (int i2 = 0; i2 < aopVar.f3306a; i2++) {
            znp znpVarA = aopVar.a(i2);
            if (znpVarA != null) {
                for (int i3 = 0; i3 < znpVarA.length(); i3++) {
                    if (ayf.l(znpVarA.l(i3).l) == i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
