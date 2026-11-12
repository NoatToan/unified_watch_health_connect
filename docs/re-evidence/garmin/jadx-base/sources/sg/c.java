package sg;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f159019d;

    public c(String str) {
        this.f159019d = str;
    }

    @Override // sg.b
    public final void a() throws UnsupportedEncodingException {
        this.f159016a = (byte) 1;
        byte[] bytes = this.f159019d.getBytes("UTF-8");
        this.f159018c = bytes;
        this.f159017b = (byte) bytes.length;
    }
}
