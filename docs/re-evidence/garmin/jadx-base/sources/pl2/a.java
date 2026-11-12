package pl2;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p13.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpl2/a;", "Lul2/b;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements ul2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f138546a;

    public a(b bVar) {
        this.f138546a = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    @Override // ul2.b
    public final void a(ul2.a aVar, byte[] bArr) {
        Integer numValueOf;
        aVar.getClass();
        b bVar = this.f138546a;
        int i14 = bVar.f138551e;
        int i15 = bVar.f138550d;
        bVar.f138547a.trace("handleGettingAvailableSpaceResponse");
        aVar.e();
        if (bArr != null) {
            int length = bArr.length;
            int i16 = bVar.f138552f;
            if (length > i15 + i14 + i16) {
                StringBuilder sb3 = new StringBuilder();
                Iterator it = u.b0(i16, bArr).iterator();
                while (it.hasNext()) {
                    byte bByteValue = ((Number) it.next()).byteValue();
                    x0 x0Var = x0.f105818a;
                    sb3.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(bByteValue)}, 1)));
                }
                if (sb3.toString().equals(bVar.f138553g) && bArr[2] == ((byte) 223) && bArr[3] == ((byte) 37)) {
                    numValueOf = Integer.valueOf(ByteBuffer.wrap(bArr, i15, i14).getInt());
                } else {
                    numValueOf = null;
                }
            } else {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        cs2.a<Integer> andSet = bVar.f138554h.getAndSet(null);
        if (andSet != null) {
            andSet.accept(numValueOf);
        }
    }
}
