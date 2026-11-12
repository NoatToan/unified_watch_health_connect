package defpackage;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ynp {
    public List<xnp> a(InputStream inputStream) throws Throwable {
        ArrayList arrayList = new ArrayList();
        if (inputStream == null) {
            return arrayList;
        }
        DataInputStream dataInputStream = null;
        try {
            try {
                DataInputStream dataInputStream2 = new DataInputStream(inputStream);
                while (dataInputStream2.available() != 0) {
                    try {
                        if (dataInputStream2.readShort() != Short.MAX_VALUE) {
                            FitnessLogUtils.e("TrackSegmentCoder", "Parsing error , magic string not found ");
                            bvc.a(dataInputStream2);
                            return arrayList;
                        }
                        byte b2 = dataInputStream2.readByte();
                        if (b2 != 1) {
                            FitnessLogUtils.e("TrackSegmentCoder", "Wrong version number : " + ((int) b2));
                            bvc.a(dataInputStream2);
                            return arrayList;
                        }
                        arrayList.add(b(dataInputStream2));
                    } catch (IOException e) {
                        e = e;
                        dataInputStream = dataInputStream2;
                        FitnessLogUtils.e("TrackSegmentCoder", "fromWire exception", e);
                        bvc.a(dataInputStream);
                    } catch (Throwable th) {
                        th = th;
                        dataInputStream = dataInputStream2;
                        bvc.a(dataInputStream);
                        throw th;
                    }
                }
                bvc.a(dataInputStream2);
            } catch (IOException e2) {
                e = e2;
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final xnp b(DataInputStream dataInputStream) throws IOException {
        xnp xnpVar = new xnp();
        xnpVar.d(dataInputStream.readLong());
        xnpVar.c(dataInputStream.readLong());
        int i = dataInputStream.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            tnp tnpVar = new tnp();
            tnpVar.g(dataInputStream.readDouble());
            tnpVar.f(dataInputStream.readDouble());
            tnpVar.d(dataInputStream.readDouble());
            tnpVar.h(dataInputStream.readFloat());
            tnpVar.e(dataInputStream.readFloat());
            tnpVar.i(dataInputStream.readInt());
            arrayList.add(tnpVar);
        }
        xnpVar.e(arrayList);
        return xnpVar;
    }
}
