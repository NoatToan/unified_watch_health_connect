package defpackage;

import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ObjectUtils;
import com.tsmclient.smartcard.Coder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h2s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<g2s> f19634a = new ArrayList();

    public List<g2s> a() {
        return this.f19634a;
    }

    public byte[] b(byte[] bArr) {
        if (ObjectUtils.isCollectionEmpty(this.f19634a)) {
            return null;
        }
        for (g2s g2sVar : this.f19634a) {
            if (g2sVar.a()[0] == bArr[0] && g2sVar.a()[1] == bArr[1]) {
                return g2sVar.b();
            }
        }
        return null;
    }

    public void c(byte[] bArr) {
        g2s g2sVar;
        int i = 1;
        if (bArr == null || bArr.length < 2) {
            LogUtils.e("DigitalKey-TLVParser", "Wrong tlv\n ");
            return;
        }
        int i2 = (bArr[0] & 31) == 31 ? 2 : 1;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        int iIntValue = bArr[i2];
        int i3 = iIntValue & 255;
        if (i3 == 129) {
            iIntValue = bArr[1 + i2] & 255;
            i = 2;
        } else if (i3 == 130) {
            iIntValue = Integer.valueOf(Coder.bytesToHexString(new byte[]{bArr[i2 + 1], bArr[i2 + 2]}), 16).intValue();
            i = 3;
        }
        int i4 = i2 + i;
        int i5 = i4 + iIntValue;
        if (bArr.length < i5) {
            LogUtils.e("DigitalKey-TLVParser", "Wrong tlv\n ");
            return;
        }
        if (iIntValue > 0) {
            byte[] bArr3 = new byte[iIntValue];
            System.arraycopy(bArr, i4, bArr3, 0, iIntValue);
            g2sVar = new g2s(bArr2, iIntValue, bArr3);
        } else {
            g2sVar = new g2s(bArr2, 0, null);
        }
        this.f19634a.add(g2sVar);
        int length = ((bArr.length - i2) - i) - iIntValue;
        if (length > 2) {
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr, i5, bArr4, 0, length);
            c(bArr4);
        }
    }
}
