package com.miui.tsmclient.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoManager;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclientsdk.MiTsmCallback;
import com.tsmclient.smartcard.exception.NfcEeIOException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f10355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10356b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CardInfo f10357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f10358b;
        public final /* synthetic */ Bundle c;
        public final /* synthetic */ MiTsmCallback d;

        public a(CardInfo cardInfo, Context context, Bundle bundle, MiTsmCallback miTsmCallback) {
            this.f10357a = cardInfo;
            this.f10358b = context;
            this.c = bundle;
            this.d = miTsmCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.miui.tsmclient.model.e.a().a(com.miui.tsmclient.model.e.a().a(f.this.f10356b, this.f10357a.mCardType).c(this.f10358b, this.f10357a, this.c), this.d);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f10359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CardInfo f10360b;
        public final /* synthetic */ Bundle c;
        public final /* synthetic */ MiTsmCallback d;

        public b(Context context, CardInfo cardInfo, Bundle bundle, MiTsmCallback miTsmCallback) {
            this.f10359a = context;
            this.f10360b = cardInfo;
            this.c = bundle;
            this.d = miTsmCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.miui.tsmclient.model.e.a().a(CardInfoManager.getInstance(this.f10359a).deleteCard(this.f10360b, this.c), this.d);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CardInfo f10361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f10362b;
        public final /* synthetic */ MiTsmCallback c;

        public c(CardInfo cardInfo, Context context, MiTsmCallback miTsmCallback) {
            this.f10361a = cardInfo;
            this.f10362b = context;
            this.c = miTsmCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.miui.tsmclient.model.e.a().a(com.miui.tsmclient.model.e.a().a(f.this.f10356b, this.f10361a.mCardType).c(this.f10362b, this.f10361a), this.c);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f10363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MiTsmCallback f10364b;

        public d(Context context, MiTsmCallback miTsmCallback) {
            this.f10363a = context;
            this.f10364b = miTsmCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.miui.tsmclient.model.e.a().a(f.this.a(this.f10363a), this.f10364b);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f10365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f10366b;
        public final /* synthetic */ MiTsmCallback c;

        public e(Context context, int i, MiTsmCallback miTsmCallback) {
            this.f10365a = context;
            this.f10366b = i;
            this.c = miTsmCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.miui.tsmclient.model.e.a().a(new com.miui.tsmclient.model.mitsm.f().upgradeApplet(this.f10365a, this.f10366b), this.c);
        }
    }

    /* JADX INFO: renamed from: com.miui.tsmclient.model.f$f, reason: collision with other inner class name */
    public class RunnableC0329f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f10367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f10368b;
        public final /* synthetic */ MiTsmCallback c;

        public RunnableC0329f(Context context, int i, MiTsmCallback miTsmCallback) {
            this.f10367a = context;
            this.f10368b = i;
            this.c = miTsmCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.miui.tsmclient.model.e.a().a(new com.miui.tsmclient.model.mitsm.f().checkSeUpgrade(this.f10367a, this.f10368b), this.c);
        }
    }

    public f(Context context) {
        this.f10355a = context;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace != null) {
            for (int i = 0; i < stackTrace.length; i++) {
                if (TextUtils.equals(getClass().getName(), stackTrace[i].getClassName()) && i < stackTrace.length - 1) {
                    this.f10356b = stackTrace[i + 1].getClassName();
                    break;
                }
            }
        }
        if (this.f10356b == null) {
            this.f10356b = toString();
        }
    }

    public void a(Context context, int i, MiTsmCallback miTsmCallback) {
        com.miui.tsmclient.model.e.a().a(new RunnableC0329f(context, i, miTsmCallback));
    }

    public void b(Context context, CardInfo cardInfo, Bundle bundle, MiTsmCallback miTsmCallback) {
        if (cardInfo != null) {
            com.miui.tsmclient.model.e.a().a(this.f10356b, new a(cardInfo, context, bundle, miTsmCallback));
            return;
        }
        LogUtils.d(f.class.getSimpleName() + "#queryCardInfo() called, but param cardInfo is null!");
        if (miTsmCallback != null) {
            miTsmCallback.onFail(1, "", new Object[0]);
        }
    }

    public f(String str, Context context) {
        this.f10356b = str;
        this.f10355a = context;
    }

    public void a(Context context, CardInfo cardInfo, Bundle bundle, MiTsmCallback miTsmCallback) {
        com.miui.tsmclient.model.e.a().a(this.f10356b, new b(context, cardInfo, bundle, miTsmCallback));
    }

    public void b(Context context, int i, MiTsmCallback miTsmCallback) {
        com.miui.tsmclient.model.e.a().a(new e(context, i, miTsmCallback));
    }

    public BaseResponse a(Context context, CardInfo cardInfo, Bundle bundle) {
        if (cardInfo == null) {
            return new BaseResponse(1, new Object[0]);
        }
        BaseResponse baseResponseD = com.miui.tsmclient.model.e.a().a(this.f10356b, cardInfo.mCardType).d(context, cardInfo, bundle);
        return baseResponseD == null ? new BaseResponse(-2, new Object[0]) : baseResponseD;
    }

    public void a(Context context, CardInfo cardInfo, MiTsmCallback miTsmCallback) {
        if (cardInfo != null) {
            com.miui.tsmclient.model.e.a().a(this.f10356b, new c(cardInfo, context, miTsmCallback));
            return;
        }
        LogUtils.d(f.class.getSimpleName() + "#queryPurchaseRecord() called, but param info is null!");
        if (miTsmCallback != null) {
            miTsmCallback.onFail(1, "", new Object[0]);
        }
    }

    public void a() {
        com.miui.tsmclient.model.e.a().a(this.f10356b);
    }

    public BaseResponse a(Context context) {
        String str;
        Throwable th;
        BaseResponse baseResponse = new BaseResponse();
        try {
            return new com.miui.tsmclient.model.mitsm.f().unrestrictEse(context, null);
        } catch (NfcEeIOException e2) {
            baseResponse.mResultCode = 10;
            str = "unrestrictESE failed with NfcEeIOException.";
            th = e2;
            LogUtils.e(str, th);
            return baseResponse;
        } catch (IOException e3) {
            baseResponse.mResultCode = 2;
            str = "unrestrictESE failed with an io exception.";
            th = e3;
            LogUtils.e(str, th);
            return baseResponse;
        } catch (InterruptedException e4) {
            baseResponse.mResultCode = 11;
            str = "unrestrictESE is interrupted.";
            th = e4;
            LogUtils.e(str, th);
            return baseResponse;
        } catch (r.a e5) {
            baseResponse.mResultCode = e5.a();
            baseResponse.mMsg = e5.getMessage();
            str = "unrestrictESE failed with an tsmapi exception.";
            th = e5;
            LogUtils.e(str, th);
            return baseResponse;
        }
    }

    public void a(Context context, MiTsmCallback miTsmCallback) {
        com.miui.tsmclient.model.e.a().a(new d(context, miTsmCallback));
    }
}
