package defpackage;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class yd implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected byte[] f53325a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected CharSequence f53326c;
    protected String e;

    public yd(byte[] bArr, String str) {
        if (bArr == null) {
            throw new IllegalArgumentException();
        }
        this.f53325a = bArr;
        this.e = (str == null || str.isEmpty()) ? "UTF-8" : str;
    }

    public yd(CharSequence charSequence) {
        if (charSequence == null) {
            throw new IllegalArgumentException();
        }
        this.f53326c = charSequence;
    }

    public String toString() {
        byte[] bArr = this.f53325a;
        if (bArr != null) {
            try {
                return new String(bArr, this.e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return this.f53326c.toString();
    }
}
