package defpackage;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f9j extends k82 {
    public static final Set<JWEAlgorithm> d;
    public static final Set<EncryptionMethod> e = jh4.f22794a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWEAlgorithm.RSA1_5);
        linkedHashSet.add(JWEAlgorithm.RSA_OAEP);
        linkedHashSet.add(JWEAlgorithm.RSA_OAEP_256);
        d = Collections.unmodifiableSet(linkedHashSet);
    }

    public f9j() {
        super(d, jh4.f22794a);
    }

    @Override // defpackage.k82, defpackage.iqd
    public /* bridge */ /* synthetic */ Set a() {
        return super.a();
    }

    @Override // defpackage.k82, defpackage.iqd
    public /* bridge */ /* synthetic */ Set c() {
        return super.c();
    }

    @Override // defpackage.k82
    public /* bridge */ /* synthetic */ hqd e() {
        return super.e();
    }
}
