package org.eclipse.californium.scandium.dtls;

import defpackage.aaay;
import defpackage.zzf;
import defpackage.zzl;
import defpackage.zzp;

/* JADX INFO: loaded from: classes20.dex */
public final class ChangeCipherSpecMessage implements DTLSMessage {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CCSType f44549c = CCSType.CHANGE_CIPHER_SPEC;

    @Override // org.eclipse.californium.scandium.dtls.DTLSMessage
    public int size() {
        return 1;
    }

    public enum CCSType {
        CHANGE_CIPHER_SPEC(1);

        private int code;

        CCSType(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSMessage
    public ContentType getContentType() {
        return ContentType.CHANGE_CIPHER_SPEC;
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        return zzp.d(i) + "Change Cipher Spec Message" + zzp.c();
    }

    public String toString() {
        return toString(0);
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSMessage
    public byte[] toByteArray() {
        zzl zzlVar = new zzl(1);
        zzlVar.d(this.f44549c.getCode(), 8);
        return zzlVar.d();
    }

    public static DTLSMessage e(byte[] bArr) throws aaay {
        zzf zzfVar = new zzf(bArr);
        int iA = zzfVar.a(8);
        if (iA == CCSType.CHANGE_CIPHER_SPEC.getCode()) {
            if (zzfVar.d()) {
                throw new aaay("Change Cipher Spec must be empty!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECODE_ERROR));
            }
            return new ChangeCipherSpecMessage();
        }
        throw new aaay("Unknown Change Cipher Spec code received: " + iA, new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
    }
}
