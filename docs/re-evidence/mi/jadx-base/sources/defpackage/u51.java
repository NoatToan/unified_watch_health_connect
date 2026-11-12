package defpackage;

import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

/* JADX INFO: loaded from: classes6.dex */
public class u51 {
    public static AlgorithmParameters a(String str, Provider provider) throws NoSuchAlgorithmException {
        return provider == null ? AlgorithmParameters.getInstance(str) : AlgorithmParameters.getInstance(str, provider);
    }
}
