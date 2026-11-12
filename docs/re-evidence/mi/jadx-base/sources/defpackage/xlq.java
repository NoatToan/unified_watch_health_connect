package defpackage;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.proto.a;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class xlq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f39249a = Charset.forName("UTF-8");

    public static j1e.c a(a.c cVar) {
        return j1e.c.I().w(cVar.H().I()).v(cVar.K()).u(cVar.J()).t(cVar.I()).build();
    }

    public static j1e b(a aVar) {
        j1e.b bVarU = j1e.I().u(aVar.K());
        Iterator<a.c> it = aVar.J().iterator();
        while (it.hasNext()) {
            bVarU.t(a(it.next()));
        }
        return bVarU.build();
    }

    public static void c(a.c cVar) throws GeneralSecurityException {
        if (!cVar.L()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.I())));
        }
        if (cVar.J() == OutputPrefixType.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.I())));
        }
        if (cVar.K() == KeyStatusType.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.I())));
        }
    }

    public static void d(a aVar) throws GeneralSecurityException {
        int iK = aVar.K();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (a.c cVar : aVar.J()) {
            if (cVar.K() == KeyStatusType.ENABLED) {
                c(cVar);
                if (cVar.I() == iK) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (cVar.H().H() != KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
