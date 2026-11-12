package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public class kqh extends BufferedWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public char[] f24193b;

    public kqh(Writer writer) {
        super(writer);
        this.f24193b = new char[64];
        String strD = plo.d();
        if (strD != null) {
            this.f24192a = strD.length();
        } else {
            this.f24192a = 2;
        }
    }

    public final void a(byte[] bArr) throws IOException {
        char[] cArr;
        int i;
        byte[] bArrA = n12.a(bArr);
        int length = 0;
        while (length < bArrA.length) {
            int i2 = 0;
            while (true) {
                cArr = this.f24193b;
                if (i2 == cArr.length || (i = length + i2) >= bArrA.length) {
                    break;
                }
                cArr[i2] = (char) bArrA[i];
                i2++;
            }
            write(cArr, 0, i2);
            newLine();
            length += this.f24193b.length;
        }
    }

    public void b(iqh iqhVar) throws IOException {
        gqh gqhVarA = iqhVar.a();
        d(gqhVarA.d());
        if (!gqhVarA.c().isEmpty()) {
            for (eqh eqhVar : gqhVarA.c()) {
                write(eqhVar.b());
                write(": ");
                write(eqhVar.c());
                newLine();
            }
            newLine();
        }
        a(gqhVarA.b());
        c(gqhVarA.d());
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
