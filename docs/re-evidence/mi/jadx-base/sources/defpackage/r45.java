package defpackage;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public final class r45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f32167a = new byte[0];

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32168a;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f32168a = iArr;
            try {
                iArr[OutputPrefixType.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32168a[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32168a[OutputPrefixType.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32168a[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(com.google.crypto.tink.proto.a.c cVar) throws GeneralSecurityException {
        int i = a.f32168a[cVar.J().ordinal()];
        if (i == 1 || i == 2) {
            return ByteBuffer.allocate(5).put((byte) 0).putInt(cVar.I()).array();
        }
        if (i == 3) {
            return ByteBuffer.allocate(5).put((byte) 1).putInt(cVar.I()).array();
        }
        if (i == 4) {
            return f32167a;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
