package defpackage;

import com.xiaomi.push.ki;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes11.dex */
public class b4t extends h4t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputStream f3802a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OutputStream f3803b;

    public b4t(OutputStream outputStream) {
        this.f3803b = outputStream;
    }

    @Override // defpackage.h4t
    public int b(byte[] bArr, int i, int i2) throws ki {
        InputStream inputStream = this.f3802a;
        if (inputStream == null) {
            throw new ki(1, "Cannot read from null inputStream");
        }
        try {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 >= 0) {
                return i3;
            }
            throw new ki(4);
        } catch (IOException e) {
            throw new ki(0, e);
        }
    }

    @Override // defpackage.h4t
    public void d(byte[] bArr, int i, int i2) throws ki {
        OutputStream outputStream = this.f3803b;
        if (outputStream == null) {
            throw new ki(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i, i2);
        } catch (IOException e) {
            throw new ki(0, e);
        }
    }
}
