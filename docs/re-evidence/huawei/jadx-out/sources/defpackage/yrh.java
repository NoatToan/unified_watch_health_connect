package defpackage;

import android.content.Context;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;
import com.huawei.wisesecurity.ucs_credential.o;

/* JADX INFO: loaded from: classes20.dex */
public class yrh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yru f53773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f53774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NetworkCapability f53775c;
    public o d;
    public String e;
    public String i;
    public CredentialClient j;

    public final Credential b(int i, String str, String str2) throws yqj {
        yqv.b bVar = new yqv.b();
        bVar.f53770b = this.j;
        bVar.d = this.f53774b;
        bVar.e = this.f53773a;
        bVar.f53771c = this.f53775c;
        yqv yqvVar = new yqv(bVar);
        try {
            return yqvVar.d(i, this.d.a(), this.e, str, str2, yqvVar);
        } finally {
            this.i = yqvVar.e();
        }
    }

    public yrh(CredentialClient credentialClient, Context context, NetworkCapability networkCapability, o oVar, String str) {
        this.j = credentialClient;
        this.f53774b = context;
        this.f53775c = networkCapability;
        this.e = str;
        this.d = oVar;
        this.f53773a = new yru(context, oVar, networkCapability);
    }
}
