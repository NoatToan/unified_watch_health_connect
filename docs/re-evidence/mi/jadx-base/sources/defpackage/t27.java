package defpackage;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class t27 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f34225a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f34226b = null;
    public boolean[] c = null;
    public int d = 0;
    public int e = 0;
    public int f = 0;

    public int a(String str) {
        return b(str, 0, 0, 0);
    }

    public int b(String str, int i, int i2, int i3) {
        if (i2 <= 0) {
            i2 = str.length();
        }
        if (i3 <= 0) {
            i3 = 0;
        }
        int[] iArr = this.f34226b;
        if (iArr == null || this.f34225a == null || i3 >= iArr.length) {
            return -1;
        }
        char[] charArray = str.toCharArray();
        int i4 = this.f34226b[i3];
        while (i < i2) {
            int i5 = charArray[i] + i4 + 1;
            if (i5 >= this.d || i4 != this.f34225a[i5]) {
                return -1;
            }
            i4 = this.f34226b[i5];
            i++;
        }
        int i6 = this.f34226b[i4];
        if (i4 != this.f34225a[i4] || i6 >= 0) {
            return -1;
        }
        return (-i6) - 1;
    }

    public void c(InputStream inputStream) throws Throwable {
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new BufferedInputStream(inputStream, 16384));
            try {
                int iAvailable = dataInputStream2.available() / 8;
                this.d = iAvailable;
                this.f34225a = new int[iAvailable];
                this.f34226b = new int[iAvailable];
                for (int i = 0; i < this.d; i++) {
                    this.f34226b[i] = dataInputStream2.readInt();
                    this.f34225a[i] = dataInputStream2.readInt();
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
