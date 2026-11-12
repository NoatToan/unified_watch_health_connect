package defpackage;

import android.content.Context;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* JADX INFO: loaded from: classes5.dex */
public final class ja1 {
    public static final String d = "ja1";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1e f22572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xu0 f22573b;
    public k1e c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l1e f22574a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public m1e f22575b = null;
        public String c = null;
        public xu0 d = null;
        public boolean e = true;
        public KeyTemplate f = null;
        public KeyStore g = null;
        public k1e h;

        public synchronized ja1 d() throws GeneralSecurityException, IOException {
            try {
                if (this.c != null) {
                    this.d = g();
                }
                this.h = f();
            } catch (Throwable th) {
                throw th;
            }
            return new ja1(this);
        }

        public final k1e e() throws GeneralSecurityException, IOException {
            xu0 xu0Var = this.d;
            if (xu0Var != null) {
                try {
                    return k1e.j(i1e.j(this.f22574a, xu0Var));
                } catch (InvalidProtocolBufferException | GeneralSecurityException unused) {
                    String unused2 = ja1.d;
                }
            }
            return k1e.j(s04.a(this.f22574a));
        }

        public final k1e f() throws GeneralSecurityException, IOException {
            try {
                return e();
            } catch (FileNotFoundException unused) {
                String unused2 = ja1.d;
                if (this.f == null) {
                    throw new GeneralSecurityException("cannot read or generate keyset");
                }
                k1e k1eVarA = k1e.i().a(this.f);
                k1e k1eVarH = k1eVarA.h(k1eVarA.c().g().H(0).H());
                if (this.d != null) {
                    k1eVarH.c().k(this.f22575b, this.d);
                } else {
                    s04.b(k1eVarH.c(), this.f22575b);
                }
                return k1eVarH;
            }
        }

        public final xu0 g() throws GeneralSecurityException {
            if (!ja1.d()) {
                String unused = ja1.d;
                return null;
            }
            la1 la1VarA = this.g != null ? new la1.b().b(this.g).a() : new la1();
            boolean zE = la1VarA.e(this.c);
            if (!zE) {
                try {
                    la1.d(this.c);
                } catch (GeneralSecurityException | ProviderException unused2) {
                    String unused3 = ja1.d;
                    return null;
                }
            }
            try {
                return la1VarA.b(this.c);
            } catch (GeneralSecurityException | ProviderException e) {
                if (zE) {
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.c), e);
                }
                String unused4 = ja1.d;
                return null;
            }
        }

        public b h(KeyTemplate keyTemplate) {
            this.f = keyTemplate;
            return this;
        }

        public b i(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.e) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.c = str;
            return this;
        }

        public b j(Context context, String str, String str2) throws IOException {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f22574a = new lam(context, str, str2);
            this.f22575b = new mam(context, str, str2);
            return this;
        }
    }

    public static boolean d() {
        return true;
    }

    public synchronized i1e c() throws GeneralSecurityException {
        return this.c.c();
    }

    public ja1(b bVar) throws GeneralSecurityException, IOException {
        this.f22572a = bVar.f22575b;
        this.f22573b = bVar.d;
        this.c = bVar.h;
    }
}
