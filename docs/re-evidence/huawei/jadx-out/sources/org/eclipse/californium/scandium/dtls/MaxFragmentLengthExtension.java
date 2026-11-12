package org.eclipse.californium.scandium.dtls;

import defpackage.aaay;
import defpackage.zzf;
import defpackage.zzl;
import defpackage.zzp;

/* JADX INFO: loaded from: classes20.dex */
public class MaxFragmentLengthExtension extends HelloExtension {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Length f44562a;

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    protected int getExtensionLength() {
        return 1;
    }

    public MaxFragmentLengthExtension(Length length) {
        super(HelloExtension.ExtensionType.MAX_FRAGMENT_LENGTH);
        if (length == null) {
            throw new NullPointerException("Length must not be null");
        }
        this.f44562a = length;
    }

    public Length d() {
        return this.f44562a;
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public String toString(int i) {
        return super.toString(i) + zzp.d(i + 1) + "Code: " + this.f44562a.code() + " (" + this.f44562a.length() + " bytes)" + zzp.c();
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    protected void writeExtensionTo(zzl zzlVar) {
        zzlVar.d(this.f44562a.code, 8);
    }

    public static MaxFragmentLengthExtension d(zzf zzfVar) throws aaay {
        int iA = zzfVar.a(8);
        Length lengthFromCode = Length.fromCode(iA);
        if (lengthFromCode != null) {
            return new MaxFragmentLengthExtension(lengthFromCode);
        }
        throw new aaay(String.format("Peer uses unknown code [%d] in %s extension", Integer.valueOf(iA), HelloExtension.ExtensionType.MAX_FRAGMENT_LENGTH.name()), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
    }

    public enum Length {
        BYTES_512(1, 512),
        BYTES_1024(2, 1024),
        BYTES_2048(3, 2048),
        BYTES_4096(4, 4096);

        private final int code;
        private final int length;

        Length(int i, int i2) {
            this.code = i;
            this.length = i2;
        }

        public int code() {
            return this.code;
        }

        public int length() {
            return this.length;
        }

        public static Length fromCode(int i) {
            if (i == 1) {
                return BYTES_512;
            }
            if (i == 2) {
                return BYTES_1024;
            }
            if (i == 3) {
                return BYTES_2048;
            }
            if (i != 4) {
                return null;
            }
            return BYTES_4096;
        }
    }
}
