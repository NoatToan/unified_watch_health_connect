package org.bouncycastle.x509;

import defpackage.dd8;
import java.security.cert.CertPath;
import org.bouncycastle.i18n.LocalizedException;

/* JADX INFO: loaded from: classes3.dex */
public class CertPathReviewerException extends LocalizedException {
    private CertPath certPath;
    private int index;

    public CertPathReviewerException(dd8 dd8Var) {
        super(dd8Var);
        this.index = -1;
        this.certPath = null;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getIndex() {
        return this.index;
    }

    public CertPathReviewerException(dd8 dd8Var, Throwable th) {
        super(dd8Var, th);
        this.index = -1;
        this.certPath = null;
    }

    public CertPathReviewerException(dd8 dd8Var, Throwable th, CertPath certPath, int i) {
        super(dd8Var, th);
        this.index = -1;
        this.certPath = null;
        if (certPath == null || i == -1) {
            throw new IllegalArgumentException();
        }
        if (i < -1 || i >= certPath.getCertificates().size()) {
            throw new IndexOutOfBoundsException();
        }
        this.certPath = certPath;
        this.index = i;
    }

    public CertPathReviewerException(dd8 dd8Var, CertPath certPath, int i) {
        super(dd8Var);
        this.index = -1;
        this.certPath = null;
        if (certPath == null || i == -1) {
            throw new IllegalArgumentException();
        }
        if (i < -1 || i >= certPath.getCertificates().size()) {
            throw new IndexOutOfBoundsException();
        }
        this.certPath = certPath;
        this.index = i;
    }
}
