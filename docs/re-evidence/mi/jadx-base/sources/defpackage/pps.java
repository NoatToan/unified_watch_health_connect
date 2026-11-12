package defpackage;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes5.dex */
public final class pps {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pbt f30625b = new pbt("VerifySliceTaskHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tbs f30626a;

    public pps(tbs tbsVar) {
        this.f30626a = tbsVar;
    }

    public final void a(nps npsVar) {
        File fileB = this.f30626a.B(npsVar.f26969b, npsVar.c, npsVar.d, npsVar.e);
        if (!fileB.exists()) {
            throw new ugs(String.format("Cannot find unverified files for slice %s.", npsVar.e), npsVar.f26968a);
        }
        b(npsVar, fileB);
        File fileC = this.f30626a.C(npsVar.f26969b, npsVar.c, npsVar.d, npsVar.e);
        if (!fileC.exists()) {
            fileC.mkdirs();
        }
        if (!fileB.renameTo(fileC)) {
            throw new ugs(String.format("Failed to move slice %s after verification.", npsVar.e), npsVar.f26968a);
        }
    }

    public final void b(nps npsVar, File file) {
        try {
            File fileA = this.f30626a.A(npsVar.f26969b, npsVar.c, npsVar.d, npsVar.e);
            if (!fileA.exists()) {
                throw new ugs(String.format("Cannot find metadata files for slice %s.", npsVar.e), npsVar.f26968a);
            }
            try {
                if (!lls.a(lps.a(file, fileA)).equals(npsVar.f)) {
                    throw new ugs(String.format("Verification failed for slice %s.", npsVar.e), npsVar.f26968a);
                }
                f30625b.d("Verification of slice %s of pack %s successful.", npsVar.e, npsVar.f26969b);
            } catch (IOException e) {
                throw new ugs(String.format("Could not digest file during verification for slice %s.", npsVar.e), e, npsVar.f26968a);
            } catch (NoSuchAlgorithmException e2) {
                throw new ugs("SHA256 algorithm not supported.", e2, npsVar.f26968a);
            }
        } catch (IOException e3) {
            throw new ugs(String.format("Could not reconstruct slice archive during verification for slice %s.", npsVar.e), e3, npsVar.f26968a);
        }
    }
}
