package defpackage;

import com.google.android.exoplayer2.Format;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class fch extends xio {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, APDUConstants.TAG_MORE_DATA, 100};
    public boolean n;

    public static boolean o(okh okhVar) {
        int iA = okhVar.a();
        byte[] bArr = o;
        if (iA < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        okhVar.j(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.xio
    public long f(okh okhVar) {
        return c(n(okhVar.d()));
    }

    @Override // defpackage.xio
    public boolean i(okh okhVar, long j, xio.b bVar) {
        if (this.n) {
            rk1.e(bVar.f39170a);
            boolean z = okhVar.n() == 1332770163;
            okhVar.P(0);
            return z;
        }
        byte[] bArrCopyOf = Arrays.copyOf(okhVar.d(), okhVar.f());
        bVar.f39170a = new Format.b().e0("audio/opus").H(gch.c(bArrCopyOf)).f0(MIOTAudioModuleCore.SAMPLING_RATE).T(gch.a(bArrCopyOf)).E();
        this.n = true;
        return true;
    }

    @Override // defpackage.xio
    public void l(boolean z) {
        super.l(z);
        if (z) {
            this.n = false;
        }
    }

    public final long n(byte[] bArr) {
        int i;
        int i2;
        byte b2 = bArr[0];
        int i3 = b2 & 255;
        int i4 = b2 & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = bArr[1] & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i5 & 1);
        } else {
            i2 = i6 == 3 ? 60000 : 10000 << i6;
        }
        return ((long) i) * ((long) i2);
    }
}
