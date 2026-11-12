package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class mh5 extends re implements df {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f26175b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f26176a;

    public mh5(byte[] bArr) {
        this.f26176a = vj1.e(bArr);
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (reVar instanceof mh5) {
            return vj1.a(this.f26176a, ((mh5) reVar).f26176a);
        }
        return false;
    }

    @Override // defpackage.df
    public String getString() {
        StringBuffer stringBuffer = new StringBuffer(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ke(byteArrayOutputStream).j(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                char[] cArr = f26175b;
                stringBuffer.append(cArr[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new ASN1ParsingException("internal error encoding BitString");
        }
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.g(28, o());
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return vj1.q(this.f26176a);
    }

    @Override // defpackage.re
    public int i() {
        return yio.a(this.f26176a.length) + 1 + this.f26176a.length;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }

    public byte[] o() {
        return vj1.e(this.f26176a);
    }

    public String toString() {
        return getString();
    }
}
