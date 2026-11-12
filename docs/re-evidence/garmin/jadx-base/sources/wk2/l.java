package wk2;

import com.garmin.device.filetransfer.core.util.CoreTransferException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import o13.r;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import p13.s;
import ug2.b0;

/* JADX INFO: loaded from: classes11.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(dz2.b bVar, v13.c cVar) {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f185858b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f185858b = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(cVar);
            }
        } else {
            jVar = new j(cVar);
        }
        Object objK = jVar.f185857a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f185858b;
        if (i15 == 0) {
            r.b(objK);
            if (bVar != null) {
                jVar.f185858b = 1;
                if (bVar.getF61810d() > 0) {
                    byte[] bArrDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5).digest(bVar.e((int) bVar.getF61810d()));
                    bArrDigest.getClass();
                    objK = s.k(0, 8, bArrDigest);
                } else {
                    objK = null;
                }
                if (objK == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objK);
        byte[] bArr = (byte[]) objK;
        if (bArr != null) {
            if (bArr.length != 8) {
                vb.h.s("Byte array must be exactly 8 bytes long to convert to a Long.");
                return null;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            return new Long(byteBufferWrap.getLong());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(i iVar, Long l14, v13.c cVar) {
        k kVar;
        d dVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f185861c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f185861c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(cVar);
            }
        } else {
            kVar = new k(cVar);
        }
        Object obj = kVar.f185860b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f185861c;
        if (i15 == 0) {
            r.b(obj);
            if (l14 != null) {
                kVar.f185859a = l14;
                kVar.f185861c = 1;
                if ((iVar instanceof zk2.k ? (zk2.k) iVar : null) == null || (dVar = ((zk2.k) iVar).f205154d) == null) {
                    obj = null;
                } else {
                    Object objA = a(dVar.b(), kVar);
                    if (objA != aVar) {
                        objA = (Long) objA;
                    }
                    obj = objA;
                }
                if (obj == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        l14 = kVar.f185859a;
        r.b(obj);
        Long l15 = (Long) obj;
        if (l15 != null) {
            return Boolean.valueOf(l14 != null && l15.longValue() == l14.longValue());
        }
        return null;
    }

    public static final void c(i iVar, f fVar, CoreTransferException coreTransferException) {
        iVar.getClass();
        fVar.getClass();
        xk2.d f205163m = iVar.getF205163m();
        if (f205163m != null) {
            al2.f.a aVar = al2.f.f3791c;
            b0 b0Var = new b0(f205163m, 21, fVar, coreTransferException);
            aVar.getClass();
            al2.f.a.a(b0Var);
            zk2.k kVar = iVar instanceof zk2.k ? (zk2.k) iVar : null;
            if (kVar != null) {
                kVar.f205163m = null;
            }
        }
    }
}
