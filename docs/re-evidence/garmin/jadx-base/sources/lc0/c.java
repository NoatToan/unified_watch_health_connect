package lc0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o13.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Llc0/c;", "Llm2/i$b;", "", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements lm2.i.b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f111928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f111929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o53.j<q<Boolean>> f111930c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(String str, long j8, o53.j<? super q<Boolean>> jVar) {
        this.f111928a = str;
        this.f111929b = j8;
        this.f111930c = jVar;
    }

    @Override // lm2.i.b
    public final void a(String str) {
        Object bVar;
        String str2 = str;
        long j8 = this.f111929b;
        String str3 = this.f111928a;
        String strO = am.j.o(": ", str2, com.nimbusds.jose.shaded.gson.internal.a.j(j8, "Successful check SW updates for ", str3, "/"));
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "CheckDeviceFirmwareUpdateUseCase", strO);
        try {
            int i14 = q.f128596b;
            if (str2 == null) {
                i2.a.f(a2Var, "CheckDeviceFirmwareUpdateUseCase", "Empty response from server for " + str3 + "/" + j8);
                throw new Exception("Empty response from server");
            }
            n63.b.a aVar2 = n63.b.f123892d;
            aVar2.getClass();
            mc0.a aVar3 = (mc0.a) aVar2.c(mc0.a.INSTANCE.serializer(), str2);
            Boolean bool = aVar3.f117766a;
            Boolean bool2 = Boolean.TRUE;
            bVar = Boolean.valueOf(s.g(bool, bool2) || s.g(aVar3.f117767b, bool2));
            this.f111930c.resumeWith(q.a(bVar));
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            bVar = new q.b(th3);
        }
    }

    @Override // lm2.i.b
    public final void onFailure(Throwable th3) {
        th3.getClass();
        String strO = am.j.o(": ", th3.getMessage(), com.nimbusds.jose.shaded.gson.internal.a.j(this.f111929b, "Failed check SW updates for ", this.f111928a, "/"));
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "CheckDeviceFirmwareUpdateUseCase", strO);
        int i14 = q.f128596b;
        this.f111930c.resumeWith(q.a(new q.b(th3)));
    }
}
