package defpackage;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ud8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f35653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f35654b;

    public ud8() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f35653a = byteArrayOutputStream;
        this.f35654b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public static void c(DataOutputStream dataOutputStream, long j) throws IOException {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }

    public byte[] a(EventMessage eventMessage) {
        this.f35653a.reset();
        try {
            b(this.f35654b, eventMessage.f7989a);
            String str = eventMessage.f7990b;
            if (str == null) {
                str = "";
            }
            b(this.f35654b, str);
            c(this.f35654b, eventMessage.c);
            c(this.f35654b, eventMessage.d);
            this.f35654b.write(eventMessage.e);
            this.f35654b.flush();
            return this.f35653a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
