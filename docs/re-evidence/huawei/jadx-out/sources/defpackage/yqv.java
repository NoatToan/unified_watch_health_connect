package defpackage;

import android.content.Context;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;
import com.huawei.wisesecurity.ucs_credential.c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class yqv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yru f53767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NetworkCapability f53768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CredentialClient f53769c;
    public final Map<Integer, c> d = new HashMap();
    public Context e;
    public int h;

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CredentialClient f53770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public NetworkCapability f53771c;
        public Context d;
        public yru e;
    }

    public final void c() throws yqj {
        this.d.put(0, new yqu(this.f53769c, this.e, this.f53768b, this.f53767a));
        this.d.put(1, new yrw(this.f53769c, this.e, this.f53768b));
        this.d.put(2, new yrx(this.f53769c, this.e, this.f53768b));
        this.d.put(3, new yrl(this.f53769c, this.e, this.f53768b));
    }

    public String e() {
        int i = this.h;
        if (i == 0) {
            return "Kid";
        }
        if (i == 1) {
            return "AndroidKS";
        }
        if (i != 2) {
            return i != 3 ? "" : "Huks_EC";
        }
        return "AndroidKS_EC";
    }

    public Credential d(int i, String str, String str2, String str3, String str4, yqv yqvVar) throws yqj {
        this.h = i;
        c cVar = this.d.get(Integer.valueOf(i));
        if (cVar != null) {
            return cVar.a(str, str2, str3, str4, yqvVar);
        }
        throw new yqj(2001L, "applyCredential get inner error, apply flag not found.");
    }

    public yqv(b bVar) throws yqj {
        this.f53769c = bVar.f53770b;
        this.e = bVar.d;
        this.f53768b = bVar.f53771c;
        this.f53767a = bVar.e;
        c();
    }
}
