package defpackage;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public class eze implements x8i<aze, aze> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f17218a = Logger.getLogger(eze.class.getName());

    public static class b implements aze {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v8i<aze> f17219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f17220b;

        @Override // defpackage.aze
        public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                throw new GeneralSecurityException("tag too short");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (v8i.b<aze> bVar : this.f17219a.c(bArrCopyOf)) {
                try {
                    if (bVar.b().equals(OutputPrefixType.LEGACY)) {
                        bVar.c().a(bArrCopyOfRange, b83.a(bArr2, this.f17220b));
                        return;
                    } else {
                        bVar.c().a(bArrCopyOfRange, bArr2);
                        return;
                    }
                } catch (GeneralSecurityException e) {
                    eze.f17218a.info("tag prefix matches a key, but cannot verify: " + e);
                }
            }
            Iterator<v8i.b<aze>> it = this.f17219a.e().iterator();
            while (it.hasNext()) {
                try {
                    it.next().c().a(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // defpackage.aze
        public byte[] b(byte[] bArr) throws GeneralSecurityException {
            return this.f17219a.b().b().equals(OutputPrefixType.LEGACY) ? b83.a(this.f17219a.b().a(), this.f17219a.b().c().b(b83.a(bArr, this.f17220b))) : b83.a(this.f17219a.b().a(), this.f17219a.b().c().b(bArr));
        }

        public b(v8i<aze> v8iVar) {
            this.f17220b = new byte[]{0};
            this.f17219a = v8iVar;
        }
    }

    public static void e() throws GeneralSecurityException {
        cdk.r(new eze());
    }

    @Override // defpackage.x8i
    public Class<aze> a() {
        return aze.class;
    }

    @Override // defpackage.x8i
    public Class<aze> b() {
        return aze.class;
    }

    @Override // defpackage.x8i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public aze c(v8i<aze> v8iVar) throws GeneralSecurityException {
        return new b(v8iVar);
    }
}
