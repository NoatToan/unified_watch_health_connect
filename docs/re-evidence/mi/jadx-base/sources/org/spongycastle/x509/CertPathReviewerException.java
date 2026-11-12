package org.spongycastle.x509;

import defpackage.cd8;
import java.security.cert.CertPath;
import org.spongycastle.i18n.LocalizedException;

/* JADX INFO: loaded from: classes3.dex */
public class CertPathReviewerException extends LocalizedException {
    private CertPath certPath;
    private int index;

    public CertPathReviewerException(cd8 cd8Var, Throwable th) {
        super(cd8Var, th);
        this.index = -1;
        this.certPath = null;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getIndex() {
        return this.index;
    }

    public CertPathReviewerException(cd8 cd8Var) {
        super(cd8Var);
        this.index = -1;
        this.certPath = null;
    }

    public CertPathReviewerException(cd8 cd8Var, Throwable th, CertPath certPath, int i) {
        super(cd8Var, th);
        this.index = -1;
        this.certPath = null;
        if (certPath != null && i != -1) {
            if (i >= -1 && i < certPath.getCertificates().size()) {
                this.certPath = certPath;
                this.index = i;
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public CertPathReviewerException(cd8 cd8Var, CertPath certPath, int i) {
        super(cd8Var);
        this.index = -1;
        this.certPath = null;
        if (certPath != null && i != -1) {
            if (i >= -1 && i < certPath.getCertificates().size()) {
                this.certPath = certPath;
                this.index = i;
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }
}
