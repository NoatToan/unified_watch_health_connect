package com.miui.tsmclient.model;

import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.common.net.Response;
import com.miui.tsmclient.common.net.internal.okhttp.InternalIOException;
import com.miui.tsmclient.entity.BankCardInfo;
import com.miui.tsmclient.entity.CardGroupType;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoManager;
import com.miui.tsmclient.entity.EidCardInfo;
import com.miui.tsmclient.entity.MifareCardInfo;
import com.miui.tsmclient.entity.QrBankCardInfo;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.PrefUtils;
import com.miui.tsmclient.util.ResUtils;
import com.tsmclient.smartcard.exception.NfcEeIOException;
import defpackage.koo;
import defpackage.ozs;
import defpackage.p4h;
import defpackage.pfl;
import defpackage.va1;
import defpackage.xno;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public class d extends BaseModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f10348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseTransitCardModel f10349b;
    public koo c;

    public class a extends xno<BaseResponse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f10350a;

        public a(c cVar) {
            this.f10350a = cVar;
        }

        @Override // defpackage.a6h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(BaseResponse baseResponse) {
            String str;
            if (baseResponse.isSuccess()) {
                this.f10350a.a();
                str = "buildCache onLoadSuccess";
            } else {
                String errorText = ErrorCode.getErrorText(d.this.getContext(), baseResponse.mResultCode, baseResponse.mMsg);
                this.f10350a.a(baseResponse.mResultCode, errorText);
                str = "buildCache onLoadFailed:" + errorText;
            }
            LogUtils.d(str);
        }

        @Override // defpackage.a6h
        public void onCompleted() {
        }

        @Override // defpackage.a6h
        public void onError(Throwable th) {
            if (th instanceof AuthApiException) {
                AuthApiException authApiException = (AuthApiException) th;
                this.f10350a.a(authApiException.mErrorCode, authApiException.mErrorMsg);
            } else {
                this.f10350a.a(-2, ResUtils.getString(d.this.getContext(), "error_common"));
            }
            LogUtils.e("buildCache onError", th);
        }
    }

    public class b implements Callable<BaseResponse> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BaseResponse call() throws Exception {
            if (!d.this.h()) {
                BaseResponse baseResponseQ = d.this.q();
                if (!baseResponseQ.isSuccess()) {
                    return baseResponseQ;
                }
                d.this.e(true);
            }
            if (!EnvironmentConfig.isSupportNfc()) {
                d.this.b(true);
                return new BaseResponse(0, new Object[0]);
            }
            BaseResponse baseResponseU = d.this.u();
            LogUtils.d("syncEse result:" + baseResponseU.mResultCode + ", " + baseResponseU.mMsg);
            if (!baseResponseU.isSuccess()) {
                return baseResponseU;
            }
            if (!d.this.i()) {
                BaseResponse baseResponseS = d.this.s();
                if (!baseResponseS.isSuccess()) {
                    return baseResponseS;
                }
                d.this.f(true);
            }
            if (!d.this.g()) {
                BaseResponse baseResponseP = d.this.p();
                if (!baseResponseP.isSuccess()) {
                    return baseResponseP;
                }
                d.this.d(true);
            }
            if (!d.this.d()) {
                BaseResponse baseResponseK = d.this.k();
                if (!baseResponseK.isSuccess()) {
                    return baseResponseK;
                }
                d.this.a(true);
            }
            if (!d.this.f()) {
                BaseResponse baseResponseN = d.this.n();
                if (!baseResponseN.isSuccess()) {
                    return baseResponseN;
                }
                d.this.c(true);
            }
            BaseResponse baseResponseL = d.this.l();
            if (!baseResponseL.isSuccess()) {
                return baseResponseL;
            }
            BaseResponse baseResponseR = d.this.r();
            if (!baseResponseR.isSuccess()) {
                return baseResponseR;
            }
            BaseResponse baseResponseM = d.this.m();
            if (!baseResponseM.isSuccess()) {
                return baseResponseM;
            }
            BaseResponse baseResponseJ = d.this.j();
            if (!baseResponseJ.isSuccess()) {
                return baseResponseJ;
            }
            BaseResponse baseResponseO = d.this.o();
            if (!baseResponseO.isSuccess()) {
                return baseResponseO;
            }
            d.this.b(true);
            return new BaseResponse(0, new Object[0]);
        }
    }

    public interface c {
        void a();

        void a(int i, String str);
    }

    public final BaseResponse l() throws InterruptedException {
        a("loadDIGICCYCards");
        return CardInfoManager.getInstance(getContext()).updateCards(CardGroupType.DCEP);
    }

    public final BaseResponse m() throws InterruptedException {
        a("loadDigitalKeyCards");
        return CardInfoManager.getInstance(getContext()).updateCards(CardGroupType.CCC);
    }

    public final BaseResponse n() throws InterruptedException {
        a("loadEidCards");
        return CardInfoManager.getInstance(getContext()).updateCards(new EidCardInfo());
    }

    public final BaseResponse o() throws InterruptedException {
        a("loadICCOACarKeyCards");
        return CardInfoManager.getInstance(getContext()).updateCards(CardGroupType.ICCOACARKEY);
    }

    @Override // com.miui.tsmclient.model.BaseModel
    public void onInit() {
        this.f10348a = false;
        this.f10349b = (BaseTransitCardModel) BaseModel.create(getContext(), BaseTransitCardModel.class);
    }

    public final BaseResponse p() throws InterruptedException {
        a("loadMiFareCards");
        return CardInfoManager.getInstance(getContext()).updateCards(new MifareCardInfo());
    }

    public final BaseResponse q() throws InterruptedException {
        a("loadQrBankCards");
        return CardInfoManager.getInstance(getContext()).updateCards(new QrBankCardInfo());
    }

    public final BaseResponse r() throws InterruptedException {
        a("loadTraditionalCarKeyCards");
        return CardInfoManager.getInstance(getContext()).updateCards(CardGroupType.PROPRIETARYCARKEY);
    }

    @Override // com.miui.tsmclient.model.BaseModel, com.miui.tsmclient.common.mvp.IModel
    public void release() {
        this.f10348a = true;
        koo kooVar = this.c;
        if (kooVar != null) {
            kooVar.unsubscribe();
        }
    }

    public final BaseResponse s() throws InterruptedException {
        a("loadTransCards");
        BaseResponse baseResponseUpdateCards = CardInfoManager.getInstance(getContext()).updateCards(CardGroupType.TRANSCARD);
        if (baseResponseUpdateCards.mResultCode != 11) {
            return baseResponseUpdateCards;
        }
        throw new InterruptedException("loadTransCards");
    }

    public void t() {
        PrefUtils.removeAsync(getContext(), PrefUtils.PREF_KEY_CARDS_CACHED);
    }

    public final BaseResponse u() throws InterruptedException {
        int iA;
        String message;
        int i;
        com.miui.tsmclient.model.mitsm.f fVar = new com.miui.tsmclient.model.mitsm.f();
        try {
            CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
            a("syncEse");
            return fVar.syncEse(getContext(), cardInfo, fVar.getSession(getContext(), cardInfo, null), null);
        } catch (NfcEeIOException e) {
            LogUtils.e("sync Ese failed with NfcEeIOException.", e);
            i = 10;
            message = "";
            iA = i;
            return new BaseResponse(iA, message, new Object[0]);
        } catch (IOException e2) {
            LogUtils.e("sync Ese failed with an io exception.", e2);
            i = 2;
            message = "";
            iA = i;
            return new BaseResponse(iA, message, new Object[0]);
        } catch (r.a e3) {
            iA = e3.a();
            message = e3.getMessage();
            LogUtils.e("sync Ese failed with an tsm api exception.", e3);
            return new BaseResponse(iA, message, new Object[0]);
        }
    }

    public void a(c cVar) {
        this.c = p4h.g(new b()).y(pfl.c()).l(va1.b()).w(new a(cVar));
    }

    public int b() {
        if (!h()) {
            try {
                if (q().isSuccess()) {
                    e(true);
                }
            } catch (InterruptedException e) {
                LogUtils.e("CacheModel getQRBankCarsCount:", e);
            }
        }
        return CardInfoManager.getInstance(getContext()).getQRBankCardsCount();
    }

    public BaseResponse c() {
        BaseResponse baseResponse = new BaseResponse();
        int i = 2;
        try {
            ozs ozsVar = new ozs();
            Response responseExecute = HttpClient.getInstance(getContext()).execute(ozsVar);
            if (ozsVar.isSuccess()) {
                baseResponse.mResultCode = 0;
                baseResponse.mDatas = new Object[]{Boolean.valueOf(((ozs.b) responseExecute.getResult()).a().a())};
            } else {
                baseResponse.mResultCode = 2;
            }
        } catch (InternalIOException unused) {
            i = 14;
            baseResponse.mResultCode = i;
        } catch (NfcEeIOException unused2) {
            i = 10;
            baseResponse.mResultCode = i;
        } catch (IOException unused3) {
            baseResponse.mResultCode = i;
        }
        return baseResponse;
    }

    public boolean d() {
        return PrefUtils.getBoolean(getContext(), PrefUtils.PREF_KEY_BANK_CACHED, false);
    }

    public boolean e() {
        return PrefUtils.getBoolean(getContext(), PrefUtils.PREF_KEY_CARDS_CACHED, i() && g() && d() && h() && f());
    }

    public boolean f() {
        return PrefUtils.getBoolean(getContext(), PrefUtils.PREF_KEY_EID_CACHED, false);
    }

    public boolean g() {
        return PrefUtils.getBoolean(getContext(), PrefUtils.PREF_KEY_MIFARE_CACHED, false);
    }

    public boolean h() {
        return PrefUtils.getBoolean(getContext(), PrefUtils.PREF_KEY_QR_BANK_CACHED, false);
    }

    public boolean i() {
        return PrefUtils.getBoolean(getContext(), PrefUtils.PREF_KEY_TRANS_CACHED, false);
    }

    public final BaseResponse j() throws InterruptedException {
        a("loadBLECarKeyCards");
        return CardInfoManager.getInstance(getContext()).updateCards(CardGroupType.BLECARKEY);
    }

    public final BaseResponse k() throws InterruptedException {
        a("loadBankCards");
        return CardInfoManager.getInstance(getContext()).updateCards(new BankCardInfo());
    }

    public final void a(String str) throws InterruptedException {
        if (this.f10348a) {
            LogUtils.d("" + str + " throw InterruptedException");
            throw new InterruptedException(str);
        }
    }

    public void b(boolean z) {
        PrefUtils.putBoolean(getContext(), PrefUtils.PREF_KEY_CARDS_CACHED, z);
    }

    public void c(boolean z) {
        PrefUtils.putBoolean(getContext(), PrefUtils.PREF_KEY_EID_CACHED, z);
    }

    public void d(boolean z) {
        PrefUtils.putBoolean(getContext(), PrefUtils.PREF_KEY_MIFARE_CACHED, z);
    }

    public void e(boolean z) {
        PrefUtils.putBoolean(getContext(), PrefUtils.PREF_KEY_QR_BANK_CACHED, z);
    }

    public void f(boolean z) {
        PrefUtils.putBoolean(getContext(), PrefUtils.PREF_KEY_TRANS_CACHED, z);
    }

    public int a() {
        if (!d()) {
            try {
                if (k().isSuccess()) {
                    a(true);
                }
            } catch (InterruptedException e) {
                LogUtils.e("CacheModel getBankCarsCount:", e);
            }
        }
        return CardInfoManager.getInstance(getContext()).getBankCardsCount();
    }

    public void a(boolean z) {
        PrefUtils.putBoolean(getContext(), PrefUtils.PREF_KEY_BANK_CACHED, z);
    }
}
