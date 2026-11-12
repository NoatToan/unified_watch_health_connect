package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.miui.tsmclient.account.IMiOAuth;
import com.miui.tsmclient.util.IDeviceInfo;
import com.miui.tsmclient.util.ILogger;
import com.service.mi.BankCard;
import com.service.mi.entity.BaseResponse;
import com.service.mi.entity.CardType;
import com.service.mi.sei.entity.ApduNotifyResp;
import com.service.mi.visa.VisaBizManager;
import com.service.mi.wallet.entity.resp.BaseWalletResponse;
import com.service.mi.wallet.entity.resp.CardListResp;
import com.tsmclient.smartcard.terminal.external.IChannel;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class rvf {

    public class a implements bg4<String> {
        @Override // defpackage.bg4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(String str) throws Exception {
            xac.c(str);
        }
    }

    public class b implements bg4<Throwable> {
        @Override // defpackage.bg4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) throws Exception {
            fpe.f(th.getMessage());
        }
    }

    public class c implements j5h<String> {
        @Override // defpackage.j5h
        public void subscribe(v4h<String> v4hVar) throws Exception {
            String strB = zgc.c().b(qvf.c);
            if (TextUtils.isEmpty(strB)) {
                v4hVar.onError(new Throwable("host url cannot be null"));
            } else {
                v4hVar.onNext(strB);
            }
            v4hVar.onComplete();
        }
    }

    public static void a() {
        if (qvf.g == null) {
            o4h.f(new c()).O(new a(), new b());
        }
    }

    public static void c() {
        v3r.m().d();
        t3q.i().d();
        VisaBizManager.getInstance().cleaeCplc();
        qvf.y = null;
        qvf.n = null;
        qvf.x = null;
        j7i.d(com.service.mi.common.util.a.a().getApplicationContext(), qvf.i);
        j7i.d(com.service.mi.common.util.a.a().getApplicationContext(), qvf.h);
        j7i.d(com.service.mi.common.util.a.a().getApplicationContext(), qvf.j);
    }

    public static BankCard e(String str) throws Exception {
        z5i.b(str, "cardNum cannot be null");
        int iH = h(str);
        BankCard bankCard = new BankCard();
        bankCard.setCardType(iH);
        return bankCard;
    }

    public static void g(Context context, String str, String str2, String str3) {
        z5i.b(context, "Context cannot be null");
        z5i.b(str2, "pushTargetId cannot be null");
        com.service.mi.common.util.a.c(context);
        qvf.v = context.getPackageName();
        zgc.c().d(new com.service.mi.common.http.a());
        qvf.z = !TextUtils.isEmpty(str);
        qvf.f31886r = str;
        qvf.s = str2;
        if (!str3.equals(qvf.A)) {
            qvf.e = null;
            qvf.f = null;
            qvf.d = null;
        }
        qvf.A = str3;
    }

    public static int h(String str) throws Exception {
        try {
            a();
            z5i.b(qvf.g, "CARD_TYPE_PARSE_OBJ cannot be null");
            int type = 0;
            for (CardType cardType : qvf.g) {
                Iterator<CardType.Regexes> it = cardType.getRegexes().iterator();
                while (it.hasNext()) {
                    if (Pattern.compile(it.next().getRegex()).matcher(str).matches()) {
                        type = cardType.getType();
                    }
                }
            }
            z5i.c(type == 1 || type == 2, "卡号没有正确匹配");
            return type;
        } catch (Exception e) {
            fpe.g("MiPayService", "createCard Exception:" + e.getMessage());
            throw e;
        }
    }

    public static BaseResponse i() {
        z5i.a();
        ApduNotifyResp apduNotifyRespL = t3q.i().l();
        return new BaseResponse(apduNotifyRespL.getResultCode(), apduNotifyRespL.getMsg(), apduNotifyRespL.getRequestId());
    }

    public static void j(IChannel iChannel) {
        z5i.b(iChannel, "IChannel cannot be null");
        qvf.f31885k = iChannel;
    }

    public static void k(IChannel iChannel) {
        z5i.b(iChannel, "customApduChannel cannot be null");
        qvf.l = iChannel;
    }

    public static void l(IDeviceInfo iDeviceInfo) {
        z5i.b(iDeviceInfo, "IDeviceInfo cannot be null");
        qvf.n = iDeviceInfo;
    }

    public static void m(ILogger iLogger) {
        fpe.m(iLogger);
    }

    public static void n(IMiOAuth iMiOAuth) {
        z5i.b(iMiOAuth, "IMiOAuth cannot be null");
        qvf.m = iMiOAuth;
    }

    public static void o(boolean z) {
        qvf.c = z ? qvf.f31884b : qvf.f31883a;
    }

    public BaseResponse b() {
        z5i.a();
        BaseWalletResponse baseWalletResponseC = v3r.m().c();
        return new BaseResponse(baseWalletResponseC.getResultCode(), baseWalletResponseC.getMsg(), baseWalletResponseC.getRequestId(), baseWalletResponseC.getSpErrors());
    }

    public BaseResponse d() {
        z5i.a();
        ApduNotifyResp apduNotifyRespF = t3q.i().f();
        return new BaseResponse(apduNotifyRespF.getResultCode(), apduNotifyRespF.getMsg(), apduNotifyRespF.getRequestId());
    }

    public BaseResponse f() {
        z5i.a();
        CardListResp cardListRespL = v3r.m().l();
        return new BaseResponse(cardListRespL.getResultCode(), cardListRespL.getMsg(), cardListRespL, cardListRespL.getRequestId(), cardListRespL.getSpErrors());
    }

    public BaseResponse p() {
        z5i.a();
        ApduNotifyResp apduNotifyRespP = t3q.i().p();
        return new BaseResponse(apduNotifyRespP.getResultCode(), apduNotifyRespP.getMsg(), apduNotifyRespP.getRequestId());
    }
}
