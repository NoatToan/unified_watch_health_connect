package com.xiaomi.push;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes22.dex */
public class ew extends ey {
    public InputStream a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public OutputStream f177a;

    public ew() {
        this.a = null;
        this.f177a = null;
    }

    public ew(OutputStream outputStream) {
        this.a = null;
        this.f177a = null;
        this.f177a = outputStream;
    }

    @Override // com.xiaomi.push.ey
    public int a(byte[] bArr, int i, int i2) throws ez {
        InputStream inputStream = this.a;
        if (inputStream == null) {
            throw new ez(1, "Cannot read from null inputStream");
        }
        try {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 >= 0) {
                return i3;
            }
            throw new ez(4);
        } catch (IOException e) {
            throw new ez(0, e);
        }
    }

    @Override // com.xiaomi.push.ey
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo3784a(byte[] bArr, int i, int i2) throws ez {
        OutputStream outputStream = this.f177a;
        if (outputStream == null) {
            throw new ez(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i, i2);
        } catch (IOException e) {
            throw new ez(0, e);
        }
    }
}
