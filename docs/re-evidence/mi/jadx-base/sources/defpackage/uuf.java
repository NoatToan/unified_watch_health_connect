package defpackage;

import com.xiaomi.fit.data.common.data.mi.FitnessDataHeader;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fitness.common.utils.FileUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class uuf {
    public static void a(ByteBuffer byteBuffer, File file) throws Throwable {
        int iPosition;
        if (byteBuffer == null || (iPosition = byteBuffer.position()) == 0) {
            return;
        }
        byte[] bArr = new byte[iPosition];
        byteBuffer.clear();
        byteBuffer.get(bArr);
        byteBuffer.clear();
        FileUtils.writeFile(file, (InputStream) new ByteArrayInputStream(bArr), true);
    }

    public static byte[] b(int i) {
        if (i == 1) {
            return new byte[]{-32};
        }
        if (i != 2) {
            return null;
        }
        return new byte[]{-4};
    }

    public static void c(File file, FitnessDataId fitnessDataId, List<xnp> list) throws Throwable {
        byte[] bArrB;
        if (file == null || list == null || list.isEmpty() || (bArrB = b(fitnessDataId.getVersion())) == null) {
            return;
        }
        byte[] dataHeaderBytes = FitnessDataHeader.INSTANCE.toDataHeaderBytes(fitnessDataId, bArrB);
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(dataHeaderBytes);
        for (xnp xnpVar : list) {
            long jA = xnpVar.a();
            for (tnp tnpVar : xnpVar.b()) {
                s2b s2bVarA = t4i.a((float) tnpVar.a(), (float) tnpVar.b());
                float fB = (float) s2bVarA.b();
                float fA = (float) s2bVarA.a();
                jA += (long) tnpVar.c();
                if (byteBufferOrder.position() + 12 >= 1024) {
                    a(byteBufferOrder, file);
                }
                byteBufferOrder.putInt((int) TimeUnit.MILLISECONDS.toSeconds(jA));
                byteBufferOrder.putFloat(fB);
                byteBufferOrder.putFloat(fA);
            }
        }
        a(byteBufferOrder, file);
    }
}
