package dz2;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.slf4j.Logger;
import wk2.o;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f61812b;

    public /* synthetic */ g(File file, int i14) {
        this.f61811a = i14;
        this.f61812b = file;
    }

    @Override // e23.a
    public final Object invoke() throws IOException {
        int i14 = this.f61811a;
        File file = this.f61812b;
        switch (i14) {
            case 0:
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(randomAccessFile.length());
                return randomAccessFile;
            case 1:
                return new RandomAccessFile(file, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
            case 2:
                return new h(file);
            default:
                Logger logger = o.f185870i;
                return new i(file);
        }
    }
}
