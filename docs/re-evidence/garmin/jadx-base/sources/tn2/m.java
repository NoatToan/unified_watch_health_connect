package tn2;

import com.garmin.feature.garminpay.providers.felica.exception.HasBeenPunchedException;
import com.garmin.feature.garminpay.providers.felica.exception.server.FNValidateException;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.util.Map;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165598a;

    public /* synthetic */ m(int i14) {
        this.f165598a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        pn2.r spAdditionalInfo;
        pn2.e historyInfo;
        boolean z14 = false;
        switch (this.f165598a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                Logger logger = w.f165679d;
                bArr.getClass();
                return Boolean.valueOf((bArr[13] & UnsignedBytes.MAX_POWER_OF_TWO) == 128 || (bArr[14] & SignedBytes.MAX_POWER_OF_TWO) == 64);
            case 1:
                byte[] bArr2 = (byte[]) obj;
                Logger logger2 = w.f165679d;
                bArr2.getClass();
                if (bArr2.length >= 5 && bArr2[4] != 1) {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 2:
                byte[] bArr3 = (byte[]) obj;
                Logger logger3 = w.f165679d;
                bArr3.getClass();
                return (byte[]) p13.u0.c(new e1.a(-63), new a().b(bArr3));
            case 3:
                Boolean bool = (Boolean) obj;
                Logger logger4 = w.f165679d;
                bool.getClass();
                if (bool.booleanValue()) {
                    return z03.f.f200765a;
                }
                throw new Exception();
            case 4:
                byte[] bArr4 = (byte[]) obj;
                Logger logger5 = w.f165679d;
                bArr4.getClass();
                a aVar = new a();
                if (p13.u.D((byte[]) p13.u0.c(new e1.a(-97, 112), aVar.b((byte[]) p13.u0.c(new e1.a(-91), aVar.b((byte[]) p13.u0.c(new e1.a(111), aVar.b(bArr4))))))) != 15) {
                    return b13.e.f14433a;
                }
                byte[] bArr5 = (byte[]) p13.u0.c(new e1.a(-105), aVar.b((byte[]) p13.u0.c(new e1.a(-91), aVar.b((byte[]) p13.u0.c(new e1.a(111), aVar.b(bArr4))))));
                w03.b.a(bArr5, "item is null");
                return new b13.h(bArr5);
            case 5:
                byte[] bArr6 = (byte[]) obj;
                Logger logger6 = w.f165679d;
                bArr6.getClass();
                a aVar2 = new a();
                return Boolean.valueOf(((byte[]) p13.u0.c(new e1.a(-97, 112), aVar2.b((byte[]) p13.u0.c(new e1.a(-91), aVar2.b((byte[]) p13.u0.c(new e1.a(111), aVar2.b(bArr6)))))))[1] == 0);
            case 6:
                byte[] bArr7 = (byte[]) obj;
                Logger logger7 = w.f165679d;
                bArr7.getClass();
                a aVar3 = new a();
                return Byte.valueOf(((byte[]) p13.u0.c(new e1.a(UnsignedBytes.MAX_POWER_OF_TWO), aVar3.b((byte[]) p13.u0.c(new e1.a(115), aVar3.b((byte[]) p13.u0.c(new e1.a(102), aVar3.b(bArr7)))))))[0]);
            case 7:
                w.f fVar = (w.f) obj;
                Logger logger8 = w.f165679d;
                fVar.getClass();
                Integer num = fVar.f165726h;
                num.getClass();
                return num;
            case 8:
                byte[] bArr8 = (byte[]) obj;
                Logger logger9 = w.f165679d;
                bArr8.getClass();
                a aVar4 = new a();
                return (byte[]) p13.u0.c(new e1.a(-125), aVar4.b((byte[]) p13.u0.c(new e1.a(115), aVar4.b((byte[]) p13.u0.c(new e1.a(102), aVar4.b(bArr8))))));
            case 9:
                byte[] bArr9 = (byte[]) obj;
                Logger logger10 = w.f165679d;
                bArr9.getClass();
                return (byte[]) p13.u0.c(new e1.a(-63), new a().b(bArr9));
            case 10:
                Map map = (Map) obj;
                Logger logger11 = w.f165679d;
                map.getClass();
                return p13.h0.b1(map.values());
            case 11:
                byte[] bArr10 = (byte[]) obj;
                Logger logger12 = w.f165679d;
                bArr10.getClass();
                a aVar5 = new a();
                return p13.u.W((byte[]) p13.u0.c(new e1.a(-125), aVar5.b((byte[]) p13.u0.c(new e1.a(115), aVar5.b((byte[]) p13.u0.c(new e1.a(102), aVar5.b(bArr10)))))), new j23.l(2, 3));
            case 12:
                Boolean bool2 = (Boolean) obj;
                Logger logger13 = w.f165679d;
                bool2.getClass();
                return new o13.p(null, bool2);
            case 13:
                byte[] bArr11 = (byte[]) obj;
                Logger logger14 = w.f165679d;
                bArr11.getClass();
                a aVar6 = new a();
                return (byte[]) p13.u0.c(new e1.a(-127), aVar6.b((byte[]) p13.u0.c(new e1.a(-91), aVar6.b((byte[]) p13.u0.c(new e1.a(111), aVar6.b(bArr11))))));
            case 14:
                Throwable th3 = (Throwable) obj;
                Logger logger15 = r0.f165631n;
                th3.getClass();
                return r0.r("endAccessCard()", th3);
            case 15:
                c83.a0 a0Var = (c83.a0) obj;
                Logger logger16 = r0.f165631n;
                a0Var.getClass();
                T t7 = a0Var.f25746b;
                t7.getClass();
                pn2.p pVar = (pn2.p) t7;
                i iVar = new i(a0Var);
                if (!iVar.d()) {
                    throw iVar.c();
                }
                rn2.m mVar = (rn2.m) pVar.d();
                if (mVar == null || (spAdditionalInfo = mVar.getSpAdditionalInfo()) == null || (historyInfo = spAdditionalInfo.getHistoryInfo()) == null) {
                    throw new FNValidateException("no historyInfo");
                }
                return q03.r.f(historyInfo);
            case 16:
                ((Long) obj).longValue();
                Logger logger17 = r0.f165631n;
                return Unit.INSTANCE;
            case 17:
                Throwable th4 = (Throwable) obj;
                Logger logger18 = r0.f165631n;
                th4.getClass();
                return r0.r("EndInitializeChip()", th4);
            case 18:
                ((Long) obj).longValue();
                Logger logger19 = r0.f165631n;
                return Unit.INSTANCE;
            case 19:
                Throwable th5 = (Throwable) obj;
                Logger logger20 = r0.f165631n;
                th5.getClass();
                return r0.r("beginIssueCard()", th5);
            case 20:
                Throwable th6 = (Throwable) obj;
                Logger logger21 = r0.f165631n;
                th6.getClass();
                return r0.r("endIssueCard()", th6);
            case 21:
                w.f fVar2 = (w.f) obj;
                Logger logger22 = r0.f165631n;
                fVar2.getClass();
                byte[] bArr12 = fVar2.f165728j;
                if (bArr12 == null) {
                    return b13.e.f14433a;
                }
                String str = new String(bArr12, d53.c.f57666b);
                w03.b.a(str, "item is null");
                return new b13.h(str);
            case 22:
                w.f fVar3 = (w.f) obj;
                Logger logger23 = r0.f165631n;
                fVar3.getClass();
                Boolean bool3 = fVar3.f165727i;
                bool3.getClass();
                if (bool3.booleanValue()) {
                    throw new HasBeenPunchedException();
                }
                return z03.f.f200765a;
            case 23:
                c83.a0 a0Var2 = (c83.a0) obj;
                Logger logger24 = r0.f165631n;
                a0Var2.getClass();
                Response response = a0Var2.f25745a;
                if (!response.isSuccessful()) {
                    int iCode = response.code();
                    ResponseBody responseBody = a0Var2.f25747c;
                    throw new FNValidateException(o2.c.e(iCode, "GC Server response failed[", "][", responseBody != null ? responseBody.string() : null, "]"));
                }
                pn2.t tVar = (pn2.t) a0Var2.f25746b;
                if (tVar == null) {
                    return b13.e.f14433a;
                }
                w03.b.a(tVar, "item is null");
                return new b13.h(tVar);
            case 24:
                c83.a0 a0Var3 = (c83.a0) obj;
                Logger logger25 = r0.f165631n;
                a0Var3.getClass();
                Response response2 = a0Var3.f25745a;
                if (!response2.isSuccessful()) {
                    int iCode2 = response2.code();
                    ResponseBody responseBody2 = a0Var3.f25747c;
                    throw new FNValidateException(o2.c.e(iCode2, "GC Server response failed[", "][", responseBody2 != null ? responseBody2.string() : null, "]"));
                }
                rn2.v vVar = (rn2.v) a0Var3.f25746b;
                if (vVar != null) {
                    return vVar;
                }
                throw new FNValidateException("Response body null");
            case 25:
                c83.a0 a0Var4 = (c83.a0) obj;
                Logger logger26 = r0.f165631n;
                a0Var4.getClass();
                i iVar2 = new i(a0Var4);
                if (iVar2.d()) {
                    return z03.f.f200765a;
                }
                throw iVar2.c();
            case 26:
                Throwable th7 = (Throwable) obj;
                Logger logger27 = r0.f165631n;
                th7.getClass();
                return r0.r("beginRecoverCard()", th7);
            case 27:
                c83.a0 a0Var5 = (c83.a0) obj;
                Logger logger28 = r0.f165631n;
                a0Var5.getClass();
                Response response3 = a0Var5.f25745a;
                if (!response3.isSuccessful()) {
                    throw new FNValidateException(am.j.h(response3.code(), "Get Pdf failed, http result code: "));
                }
                String str2 = response3.headers().get("content-disposition");
                str2.getClass();
                String str3 = (String) d53.w.W(str2, new String[]{"="}).get(1);
                ResponseBody responseBody3 = (ResponseBody) a0Var5.f25746b;
                if (responseBody3 == null) {
                    throw new FNValidateException("Get Pdf failed, body is null");
                }
                l0.h hVar = new l0.h(str3, responseBody3.bytes(), responseBody3.getContentLength(), 1);
                int i14 = w03.b.f181178a;
                return new e13.m(hVar);
            case 28:
                ((Long) obj).longValue();
                Logger logger29 = r0.f165631n;
                return Unit.INSTANCE;
            default:
                ((Long) obj).longValue();
                Logger logger30 = r0.f165631n;
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ m(r0 r0Var, int i14) {
        this.f165598a = i14;
    }
}
