package vx2;

import com.garmin.proto.generated.GDIGarminHealth;
import com.garmin.samd.repository.UnexpectedResponseCodeException;
import java.util.List;
import java.util.Map;
import lc.u0;
import o13.p;
import o13.r;
import o72.t;
import p13.t0;
import p13.w;
import sx2.d;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f180667a;

        static {
            int[] iArr = new int[GDIGarminHealth.FileTransferRequest.ContentType.values().length];
            try {
                iArr[GDIGarminHealth.FileTransferRequest.ContentType.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDIGarminHealth.FileTransferRequest.ContentType.ZIP_FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f180667a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object a(String str, GDIGarminHealth.FileTransferRequest.FileType fileType, GDIGarminHealth.FileTransferRequest.ContentType contentType, byte[] bArr, gx2.a aVar, String str2, v13.c cVar) throws UnexpectedResponseCodeException {
        c cVar2;
        String str3;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f180669b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f180669b = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(cVar);
            }
        } else {
            cVar2 = new c(cVar);
        }
        c cVar3 = cVar2;
        Object objD = cVar3.f180668a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar3.f180669b;
        if (i15 == 0) {
            r.b(objD);
            str.getClass();
            contentType.getClass();
            bArr.getClass();
            int i16 = a.f180667a[contentType.ordinal()];
            if (i16 == 1) {
                str3 = "application/octet-stream";
            } else {
                if (i16 != 2) {
                    u0.r();
                    return null;
                }
                str3 = "application/zip";
            }
            List listC = w.c(new d(str, str3, bArr));
            Map mapB = t0.b(new p("SaMD-FileType", fileType.name()));
            cVar3.f180669b = 1;
            objD = sx2.b.d("/upload/v1/upload/fit", aVar, str2, null, listC, mapB, cVar3, 16);
            if (objD == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objD);
        }
        qx2.c cVar4 = (qx2.c) objD;
        int i17 = cVar4.f148454c;
        String str4 = cVar4.f148456e;
        Map<String, List<String>> map = cVar4.f148455d;
        if (i17 == 202) {
            sx2.b.c().debug(t.u(cVar4));
            return new ox2.a(new ox2.b(str4, map), map);
        }
        if (i17 != 409) {
            sx2.b.c().error(cVar4.toString());
            throw new UnexpectedResponseCodeException(cVar4.f148454c, str4, null, 4, null);
        }
        sx2.b.c().warn(t.u(cVar4));
        throw new UnexpectedResponseCodeException(cVar4.f148454c, str4, null, 4, null);
    }
}
