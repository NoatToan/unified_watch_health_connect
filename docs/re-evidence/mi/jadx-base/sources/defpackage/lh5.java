package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class lh5 extends pe implements cf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f25066b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f25067a;

    public lh5(byte[] bArr) {
        this.f25067a = bArr;
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (peVar instanceof lh5) {
            return wj1.a(this.f25067a, ((lh5) peVar).f25067a);
        }
        return false;
    }

    @Override // defpackage.cf
    public String getString() {
        StringBuffer stringBuffer = new StringBuffer(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new oe(byteArrayOutputStream).j(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                char[] cArr = f25066b;
                stringBuffer.append(cArr[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new RuntimeException("internal error encoding BitString");
        }
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.g(28, o());
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return wj1.k(this.f25067a);
    }

    @Override // defpackage.pe
    public int i() {
        return zio.a(this.f25067a.length) + 1 + this.f25067a.length;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }

    public byte[] o() {
        return this.f25067a;
    }

    public String toString() {
        return getString();
    }
}
