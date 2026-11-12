package g9;

import android.os.Parcel;
import android.os.SharedMemory;
import e23.l;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg9/c;", "", "<init>", "()V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f76457a = new c();

    private c() {
    }

    public static Object a(Parcel parcel, l lVar) {
        parcel.getClass();
        Closeable closeable = (Closeable) SharedMemory.CREATOR.createFromParcel(parcel);
        try {
            ByteBuffer byteBufferMapReadOnly = ((SharedMemory) closeable).mapReadOnly();
            byteBufferMapReadOnly.getClass();
            byte[] bArr = new byte[byteBufferMapReadOnly.remaining()];
            byteBufferMapReadOnly.get(bArr);
            Object objInvoke = lVar.invoke(bArr);
            jg.b.l(closeable, null);
            return objInvoke;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(closeable, th3);
                throw th4;
            }
        }
    }
}
