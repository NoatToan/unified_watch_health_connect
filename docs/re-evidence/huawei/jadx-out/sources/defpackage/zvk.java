package defpackage;

import org.eclipse.californium.core.coap.OptionNumberRegistry;
import org.eclipse.californium.core.coap.option.BaseOptionDefinition;

/* JADX INFO: loaded from: classes20.dex */
public class zvk extends BaseOptionDefinition {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f54612c = {0, 8};

    public zvk(int i, String str, boolean z, int... iArr) {
        super(i, str, OptionNumberRegistry.OptionFormat.INTEGER, z, iArr);
    }

    @Override // org.eclipse.californium.core.coap.option.BaseOptionDefinition, org.eclipse.californium.core.coap.option.OptionDefinition
    public zvc create(long j) {
        return new zvc(this, j);
    }

    public static int a(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i += (bArr[(bArr.length - i2) - 1] & 255) << (i2 * 8);
        }
        return i;
    }

    public static long e(byte[] bArr) {
        long j = 0;
        for (int i = 0; i < bArr.length; i++) {
            j += ((long) (bArr[(bArr.length - i) - 1] & 255)) << (i * 8);
        }
        return j;
    }

    public static byte[] b(long j) {
        int iNumberOfLeadingZeros = (71 - Long.numberOfLeadingZeros(j)) / 8;
        byte[] bArr = new byte[iNumberOfLeadingZeros];
        for (int i = 0; i < iNumberOfLeadingZeros; i++) {
            bArr[(iNumberOfLeadingZeros - i) - 1] = (byte) (j >> (i * 8));
        }
        return bArr;
    }
}
