package defpackage;

import com.google.android.gms.security.ProviderInstaller;
import defpackage.vb8;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes5.dex */
public final class pb8<T_WRAPPER extends vb8<T_ENGINE>, T_ENGINE> {
    public static final Logger d = Logger.getLogger(pb8.class.getName());
    public static final List<Provider> e;
    public static final pb8<vb8.a, Cipher> f;
    public static final pb8<vb8.e, Mac> g;
    public static final pb8<vb8.g, Signature> h;
    public static final pb8<vb8.f, MessageDigest> i;
    public static final pb8<vb8.b, KeyAgreement> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final pb8<vb8.d, KeyPairGenerator> f30196k;
    public static final pb8<vb8.c, KeyFactory> l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T_WRAPPER f30197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<Provider> f30198b = e;
    public boolean c = true;

    static {
        if (zoo.b()) {
            e = b(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL");
        } else {
            e = new ArrayList();
        }
        f = new pb8<>(new vb8.a());
        g = new pb8<>(new vb8.e());
        h = new pb8<>(new vb8.g());
        i = new pb8<>(new vb8.f());
        j = new pb8<>(new vb8.b());
        f30196k = new pb8<>(new vb8.d());
        l = new pb8<>(new vb8.c());
    }

    public pb8(T_WRAPPER t_wrapper) {
        this.f30197a = t_wrapper;
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                d.info(String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public T_ENGINE a(String str) throws GeneralSecurityException {
        Iterator<Provider> it = this.f30198b.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return (T_ENGINE) this.f30197a.a(str, it.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (this.c) {
            return (T_ENGINE) this.f30197a.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
