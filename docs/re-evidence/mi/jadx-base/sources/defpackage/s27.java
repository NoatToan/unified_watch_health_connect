package defpackage;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class s27 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f33200a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f33201b = null;
    public boolean[] c = null;
    public int d = 0;
    public int e = 0;
    public int f = 0;

    public List<Integer> a(String str, int i, int i2, int i3) {
        if (i2 <= 0) {
            i2 = str.length();
        }
        if (i3 <= 0) {
            i3 = 0;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int i4 = this.f33201b[i3];
        while (i < i2) {
            int i5 = this.f33201b[i4];
            if (i4 == this.f33200a[i4] && i5 < 0) {
                arrayList.add(Integer.valueOf((-i5) - 1));
            }
            int i6 = charArray[i] + i4 + 1;
            if (i6 >= this.d || i4 != this.f33200a[i6]) {
                return arrayList;
            }
            i4 = this.f33201b[i6];
            i++;
        }
        int i7 = this.f33201b[i4];
        if (i4 == this.f33200a[i4] && i7 < 0) {
            arrayList.add(Integer.valueOf((-i7) - 1));
        }
        return arrayList;
    }

    public void b(InputStream inputStream) throws Throwable {
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new BufferedInputStream(inputStream, 16384));
            try {
                int iAvailable = dataInputStream2.available() / 8;
                this.d = iAvailable;
                this.f33200a = new int[iAvailable];
                this.f33201b = new int[iAvailable];
                for (int i = 0; i < this.d; i++) {
                    this.f33201b[i] = dataInputStream2.readInt();
                    this.f33200a[i] = dataInputStream2.readInt();
                }
                dataInputStream2.close();
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
