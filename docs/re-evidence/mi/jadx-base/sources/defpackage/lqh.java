package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public class lqh extends BufferedWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public char[] f25353b;

    public lqh(Writer writer) {
        super(writer);
        this.f25353b = new char[64];
        String strD = olo.d();
        this.f25352a = strD != null ? strD.length() : 2;
    }

    public final void a(byte[] bArr) throws IOException {
        char[] cArr;
        int i;
        byte[] bArrB = m12.b(bArr);
        int length = 0;
        while (length < bArrB.length) {
            int i2 = 0;
            while (true) {
                cArr = this.f25353b;
                if (i2 == cArr.length || (i = length + i2) >= bArrB.length) {
                    break;
                }
                cArr[i2] = (char) bArrB[i];
                i2++;
            }
            write(cArr, 0, i2);
            newLine();
            length += this.f25353b.length;
        }
    }

    public void b(jqh jqhVar) throws IOException {
        hqh hqhVarA = jqhVar.a();
        d(hqhVarA.d());
        if (!hqhVarA.c().isEmpty()) {
            for (fqh fqhVar : hqhVarA.c()) {
                write(fqhVar.b());
                write(": ");
                write(fqhVar.c());
                newLine();
            }
            newLine();
        }
        a(hqhVarA.b());
        c(hqhVarA.d());
    }

    public final void c(String str) throws IOException {
        write("-----END " + str + "-----");
        newLine();
    }

    public final void d(String str) throws IOException {
        write(PluginPackageConstant.RN_CERT_FLAG + str + "-----");
        newLine();
    }
}
