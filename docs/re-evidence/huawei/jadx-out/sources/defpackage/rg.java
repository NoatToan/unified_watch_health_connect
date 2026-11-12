package defpackage;

import com.auth0.jwt.algorithms.Algorithm;

/* JADX INFO: loaded from: classes21.dex */
public class rg extends ra {
    public rg(Algorithm algorithm, Throwable th) {
        super("The Token's Signature couldn't be generated when signing using the Algorithm: " + algorithm, th);
    }
}
