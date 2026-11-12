package defpackage;

import com.auth0.jwt.algorithms.Algorithm;

/* JADX INFO: loaded from: classes21.dex */
public class rc extends rd {
    public rc(Algorithm algorithm) {
        this(algorithm, null);
    }

    public rc(Algorithm algorithm, Throwable th) {
        super("The Token's Signature resulted invalid when verified using the Algorithm: " + algorithm, th);
    }
}
