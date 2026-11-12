package mn2;

import c83.a0;
import com.garmin.feature.garminpay.providers.felica.exception.server.FNValidateException;
import com.garmin.feature.garminpay.providers.felica.exception.server.ReachRetryLimitationException;
import com.google.android.exoplayer2.text.cea.Cea608Decoder;
import e13.u;
import java.util.concurrent.Callable;
import okhttp3.Response;
import okhttp3.ResponseBody;
import tn2.d1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f119800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f119801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tn2.i f119802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f119803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f119804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f119805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l f119806g;

    public /* synthetic */ g(a0 a0Var, String str, tn2.i iVar, int i14, e23.l lVar, String str2, e23.l lVar2) {
        this.f119800a = a0Var;
        this.f119801b = str;
        this.f119802c = iVar;
        this.f119803d = i14;
        this.f119804e = lVar;
        this.f119805f = str2;
        this.f119806g = lVar2;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0198  */
    @Override // java.util.concurrent.Callable
    public final Object call() throws ReachRetryLimitationException, FNValidateException {
        int i14;
        long j8;
        int i15;
        long jF;
        long j14;
        a0 a0Var = this.f119800a;
        tn2.i iVar = new tn2.i(a0Var);
        a0<? extends pn2.p<?>> a0Var2 = iVar.f165572a;
        Response response = a0Var2.f25745a;
        if (!response.isSuccessful() && !tn2.i.b(a0Var2)) {
            int iCode = response.code();
            ResponseBody responseBody = a0Var2.f25747c;
            throw new FNValidateException(o2.c.e(iCode, "Server response failed[", "][", responseBody != null ? responseBody.string() : null, "]"));
        }
        String xMfiVersion = this.f119801b;
        if (xMfiVersion == null) {
            rn2.s sVarA = iVar.a();
            xMfiVersion = sVarA != null ? sVarA.getXMfiVersion() : null;
        }
        String str = xMfiVersion;
        boolean zB = tn2.i.b(a0Var2);
        tn2.i iVar2 = this.f119802c;
        int i16 = this.f119803d;
        e23.l lVar = this.f119804e;
        String str2 = this.f119805f;
        e23.l lVar2 = this.f119806g;
        if (zB) {
            int i17 = (iVar2 == null || tn2.i.b(iVar2.f165572a)) ? i16 + 1 : 1;
            new d1();
            if (1 <= i17 && i17 < 3) {
                j14 = 500;
            } else {
                if (i17 != 3) {
                    throw new ReachRetryLimitationException();
                }
                j14 = 1000;
            }
            u uVarK = q03.r.k(j14);
            e eVar = new e(new h(str2, i17, j14, iVar, lVar2, str, lVar, 0), 10);
            int i18 = w03.b.f181178a;
            return new e13.j(uVarK, eVar);
        }
        rn2.s sVarA2 = iVar.a();
        if (p005kotlin.jvm.internal.s.g(sVarA2 != null ? sVarA2.getResultCode() : null, "0999")) {
            if (iVar2 == null) {
                i15 = i16 + 1;
            } else {
                rn2.s sVarA3 = iVar2.a();
                if (p005kotlin.jvm.internal.s.g(sVarA3 != null ? sVarA3.getResultCode() : null, "1000")) {
                    i15 = i16 + 1;
                } else {
                    rn2.s sVarA4 = iVar2.a();
                    if (p005kotlin.jvm.internal.s.g(sVarA4 != null ? sVarA4.getResultCode() : null, "0999")) {
                        i15 = i16 + 1;
                    } else {
                        i15 = 1;
                    }
                }
            }
            new d1();
            if (i15 == 1) {
                jF = gl1.d.e(System.currentTimeMillis()).f(100L, 2000L);
            } else if (i15 == 2) {
                jF = gl1.d.e(System.currentTimeMillis()).f(2000L, 4000L);
            } else if (i15 == 3) {
                jF = gl1.d.e(System.currentTimeMillis()).f(4000L, 8000L);
            } else if (i15 == 4) {
                jF = gl1.d.e(System.currentTimeMillis()).f(8000L, Cea608Decoder.MIN_DATA_CHANNEL_TIMEOUT_MS);
            } else {
                if (i15 != 5) {
                    throw new ReachRetryLimitationException();
                }
                jF = gl1.d.e(System.currentTimeMillis()).f(Cea608Decoder.MIN_DATA_CHANNEL_TIMEOUT_MS, 32000L);
            }
            u uVarK2 = q03.r.k(jF);
            e eVar2 = new e(new h(str2, i15, jF, iVar, lVar2, str, lVar, 1), 11);
            int i19 = w03.b.f181178a;
            return new e13.j(uVarK2, eVar2);
        }
        rn2.s sVarA5 = iVar.a();
        if (!p005kotlin.jvm.internal.s.g(sVarA5 != null ? sVarA5.getResultCode() : null, "1000")) {
            rn2.s sVarA6 = iVar.a();
            if (!p005kotlin.jvm.internal.s.g(sVarA6 != null ? sVarA6.getResultCode() : null, "1001")) {
                return q03.r.f(a0Var);
            }
            new d1();
            rn2.s sVar = (rn2.s) iVar.f165575d.getValue();
            sVar.getClass();
            Integer retryAfter = sVar.getRetryAfter();
            long jIntValue = retryAfter != null ? retryAfter.intValue() * 1000 : 60000L;
            lVar.invoke(Long.valueOf(jIntValue));
            u uVarK3 = q03.r.k(jIntValue);
            e eVar3 = new e(new h(str2, jIntValue, iVar, lVar2, str, i16, lVar), 13);
            int i24 = w03.b.f181178a;
            return new e13.j(uVarK3, eVar3);
        }
        if (iVar2 == null) {
            i14 = i16 + 1;
        } else {
            rn2.s sVarA7 = iVar2.a();
            if (p005kotlin.jvm.internal.s.g(sVarA7 != null ? sVarA7.getResultCode() : null, "1000")) {
                i14 = i16 + 1;
            } else {
                rn2.s sVarA8 = iVar2.a();
                if (p005kotlin.jvm.internal.s.g(sVarA8 != null ? sVarA8.getResultCode() : null, "0999")) {
                    i14 = i16 + 1;
                } else {
                    i14 = 1;
                }
            }
        }
        new d1();
        if (1 <= i14 && i14 < 3) {
            j8 = 500;
        } else if (i14 == 3) {
            j8 = 1000;
        } else if (i14 == 4) {
            j8 = 2000;
        } else {
            if (i14 != 5) {
                throw new ReachRetryLimitationException();
            }
            j8 = 4000;
        }
        u uVarK4 = q03.r.k(j8);
        e eVar4 = new e(new h(str2, i14, j8, iVar, lVar2, str, lVar, 2), 12);
        int i25 = w03.b.f181178a;
        return new e13.j(uVarK4, eVar4);
    }
}
