package com.google.firebase.util;

import am.j;
import h23.c;
import j23.k;
import j23.l;
import j23.t;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p13.h0;
import p13.p0;
import p13.y;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\u00020\u00038\u0002X\u0082T¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lh23/c;", "", "length", "", "nextAlphanumericString", "(Lh23/c;I)Ljava/lang/String;", "ALPHANUMERIC_ALPHABET", "Ljava/lang/String;", "getALPHANUMERIC_ALPHABET$annotations", "()V", "com.google.firebase-firebase-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RandomUtilKt {
    private static final String ALPHANUMERIC_ALPHABET = "23456789abcdefghjkmnpqrstvwxyz";

    private static /* synthetic */ void getALPHANUMERIC_ALPHABET$annotations() {
    }

    public static final String nextAlphanumericString(c cVar, int i14) {
        cVar.getClass();
        if (i14 < 0) {
            h.x(j.h(i14, "invalid length: "));
            return null;
        }
        l lVarO = t.o(0, i14);
        ArrayList arrayList = new ArrayList(y.r(lVarO, 10));
        Iterator<Integer> it = lVarO.iterator();
        while (((k) it).f96801c) {
            ((p0) it).nextInt();
            arrayList.add(Character.valueOf(ALPHANUMERIC_ALPHABET.charAt(cVar.c(30))));
        }
        return h0.k0(arrayList, "", null, null, null, 62);
    }
}
