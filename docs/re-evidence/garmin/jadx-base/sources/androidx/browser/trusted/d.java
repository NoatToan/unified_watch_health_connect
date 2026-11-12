package androidx.browser.trusted;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f5320c;

    private d(byte[] bArr, String str, List<byte[]> list) {
        this.f5318a = bArr;
        this.f5319b = str;
        this.f5320c = new ArrayList(list.size());
        for (byte[] bArr2 : list) {
            this.f5320c.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    public static d a(String str, ArrayList arrayList) throws IOException {
        Collections.sort(arrayList, new c(0));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return new d(byteArrayOutputStream.toByteArray(), str, arrayList);
    }

    public static d b(byte[] bArr) {
        return new d(bArr);
    }

    public final void c() {
        if (this.f5319b != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.f5318a));
        this.f5319b = dataInputStream.readUTF();
        int i14 = dataInputStream.readInt();
        this.f5320c = new ArrayList(i14);
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = dataInputStream.readInt();
            byte[] bArr = new byte[i16];
            if (dataInputStream.read(bArr) != i16) {
                vb.h.z("Could not read fingerprint");
                return;
            }
            this.f5320c.add(bArr);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f5318a, ((d) obj).f5318a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5318a);
    }

    private d(byte[] bArr) {
        this.f5318a = bArr;
    }
}
