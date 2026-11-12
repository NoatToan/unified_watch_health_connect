package com.auth0.jwt;

import defpackage.rf;

/* JADX INFO: loaded from: classes21.dex */
public abstract class TokenUtils {
    TokenUtils() {
    }

    public static String[] splitToken(String str) throws rf {
        if (str == null) {
            throw new rf("The token is null.");
        }
        int iIndexOf = str.indexOf(46);
        if (iIndexOf == -1) {
            throw wrongNumberOfParts(0);
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(46, i);
        if (iIndexOf2 == -1) {
            throw wrongNumberOfParts(2);
        }
        int i2 = iIndexOf2 + 1;
        if (str.indexOf(46, i2) != -1) {
            throw wrongNumberOfParts("> 3");
        }
        return new String[]{str.substring(0, iIndexOf), str.substring(i, iIndexOf2), str.substring(i2)};
    }

    private static rf wrongNumberOfParts(Object obj) {
        return new rf(String.format("The token was expected to have 3 parts, but got %s.", obj));
    }
}
