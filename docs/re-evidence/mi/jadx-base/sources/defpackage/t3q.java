package defpackage;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.service.mi.common.MiPayStatus;
import com.service.mi.common.apdu.ApduResp;
import com.service.mi.common.apdu.BaseApduManager;
import com.service.mi.common.apdu.Capdu;
import com.service.mi.common.apdu.Rapdu;
import com.service.mi.common.entity.SpsdInfo;
import com.service.mi.sei.entity.ApduNotifyResp;
import com.service.mi.sei.entity.Extra;
import com.service.mi.visa.entity.SsdData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public final class t3q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static t3q f34274k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34276b;
    public SpsdInfo c;
    public SsdData d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34275a = t3q.class.getSimpleName();
    public String e = "";
    public String f = "";
    public String j = null;
    public Gson g = new GsonBuilder().disableHtmlEscaping().create();
    public BaseApduManager h = new BaseApduManager("MiChannel", qvf.f31885k);
    public BaseApduManager i = new BaseApduManager("MiCustomChannel", qvf.l);

    public class a implements bg4<String> {
        public a() {
        }

        @Override // defpackage.bg4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(String str) throws Exception {
            xac.c(str);
        }
    }

    public class b implements bg4<Throwable> {
        public b() {
        }

        @Override // defpackage.bg4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) throws Exception {
            fpe.f(th.getMessage());
        }
    }

    public class c implements j5h<String> {
        public c() {
        }

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

    public t3q() {
        qvf.a();
    }

    public static t3q i() {
        if (f34274k == null) {
            synchronized (t3q.class) {
                try {
                    if (f34274k == null) {
                        f34274k = new t3q();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f34274k;
    }

    public boolean a(String str) {
        return this.h.activateApplet(str, "1");
    }

    public final ApduNotifyResp b(String str, String str2, int i, String str3, String str4, String str5) {
        c();
        try {
            o(zgc.c().e(new u3q.b().c(qvf.f).e("/app/manage").d(this.h.getCplc(), this.h.getMiSeid()).a("appletInstanceAid", str).a("sdAid", str2).a("operType", Integer.valueOf(i)).a("seqNum", str3).a("vEphemeralVisaPublicKeyID", str4).a("ephemeralVisaPublicKey", str5).b()));
            ApduNotifyResp apduNotifyResp = new ApduNotifyResp();
            apduNotifyResp.setResultCode(this.e);
            apduNotifyResp.setMsg(this.f);
            return apduNotifyResp;
        } catch (Exception e) {
            fpe.g(this.f34275a, e.getMessage());
            MiPayStatus miPayStatus = MiPayStatus.STATUS_BIZ_ERROR;
            return new ApduNotifyResp(miPayStatus.getStatus(), miPayStatus.getMsg());
        } finally {
            e();
        }
    }

    @SuppressLint({"CheckResult"})
    public void c() {
        if (TextUtils.isEmpty(qvf.f)) {
            o4h.f(new c()).O(new a(), new b());
        }
    }

    public void d() {
        BaseApduManager baseApduManager = this.h;
        if (baseApduManager != null) {
            baseApduManager.clearCplc();
        }
        f34274k = null;
    }

    public void e() {
        this.f34276b = "";
        this.f = "";
        this.e = "";
    }

    public ApduNotifyResp f() {
        c();
        try {
            o(zgc.c().e(new u3q.b().c(qvf.f).e("/se/remove").d(this.h.getCplc(), this.h.getMiSeid()).b()));
            return new ApduNotifyResp(this.e, this.f);
        } catch (Exception e) {
            fpe.g(this.f34275a, "clearSE Exception:" + e.getMessage());
            MiPayStatus miPayStatus = MiPayStatus.STATUS_BIZ_ERROR;
            return new ApduNotifyResp(miPayStatus.getStatus(), miPayStatus.getMsg());
        } finally {
            e();
        }
    }

    public boolean g(String str) {
        return this.h.deactivateApplet(str, "1");
    }

    public ApduNotifyResp h(String str, String str2) {
        return b(str, str2, 2, null, null, null);
    }

    public ApduNotifyResp j(String str, String str2, String str3) {
        ApduNotifyResp apduNotifyRespB = b(str, str2, 1, str3, null, null);
        Extra extra = new Extra();
        extra.setSpsdInfo(this.c);
        apduNotifyRespB.setExtra(extra);
        this.c = null;
        return apduNotifyRespB;
    }

    public ApduNotifyResp k(String str, String str2, String str3, String str4, String str5) {
        ApduNotifyResp apduNotifyRespB = b(str, str2, 1, str3, str4, str5);
        Extra extra = new Extra();
        extra.setSsdData(this.d);
        apduNotifyRespB.setExtra(extra);
        this.d = null;
        return apduNotifyRespB;
    }

    public ApduNotifyResp l() {
        c();
        try {
            o(zgc.c().e(new u3q.b().c(qvf.f).e("/se/prepare").d(this.h.getCplc(), this.h.getMiSeid()).b()));
            return new ApduNotifyResp(this.e, this.f);
        } catch (Exception e) {
            fpe.g(this.f34275a, "prepare Exception:" + e.getMessage());
            MiPayStatus miPayStatus = MiPayStatus.STATUS_BIZ_ERROR;
            return new ApduNotifyResp(miPayStatus.getStatus(), miPayStatus.getMsg());
        } finally {
            e();
        }
    }

    public final void m(String str) throws ExecutionException, InterruptedException {
        ApduResp apduRespExecuteApdus;
        if (TextUtils.isEmpty(str)) {
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            this.e = miPayStatus.getStatus();
            this.f = miPayStatus.getMsg();
            return;
        }
        ApduNotifyResp apduNotifyResp = (ApduNotifyResp) this.g.fromJson(str, ApduNotifyResp.class);
        if (apduNotifyResp == null) {
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_REQUEST_FAILURE;
            this.e = miPayStatus2.getStatus();
            this.f = miPayStatus2.getMsg();
            return;
        }
        if (!apduNotifyResp.isStatusOK()) {
            this.e = apduNotifyResp.getResultCode();
            this.f = apduNotifyResp.getMsg();
            return;
        }
        if (apduNotifyResp.isApduCommandsNull()) {
            this.e = apduNotifyResp.getResultCode();
            this.f = apduNotifyResp.getMsg();
            if (apduNotifyResp.getExtra() != null) {
                this.c = apduNotifyResp.getExtra().getSpsdInfo();
                this.d = apduNotifyResp.getExtra().getSsdData();
                return;
            }
            return;
        }
        List<Capdu> apduCommands = apduNotifyResp.getApduCommands();
        this.f34276b = apduNotifyResp.getTaskId();
        if (apduNotifyResp.getApduType().equals("1")) {
            apduRespExecuteApdus = this.h.executeApdus(apduCommands);
        } else {
            if (!apduNotifyResp.getApduType().equals("2")) {
                MiPayStatus miPayStatus3 = MiPayStatus.APDU_TYPE_UNKNOWN;
                this.e = miPayStatus3.getStatus();
                this.f = miPayStatus3.getMsg();
                return;
            }
            apduRespExecuteApdus = this.i.executeApdus(apduCommands);
        }
        if (apduRespExecuteApdus.isExecuteError()) {
            return;
        }
        n(apduRespExecuteApdus.getRapduList());
    }

    public final void n(List<Rapdu> list) throws ExecutionException, InterruptedException {
        c();
        if (list == null) {
            list = new ArrayList<>();
        }
        m(zgc.c().e(new u3q.b().c(qvf.f).e("/apdu/report").d(this.h.getCplc(), this.h.getMiSeid()).a("apduResponses", list).a("taskId", this.f34276b).b()));
    }

    public final void o(String str) throws ExecutionException, InterruptedException {
        try {
            try {
                this.h.open();
                m(str);
                this.h.close();
            } catch (IOException e) {
                throw new ExecutionException(e);
            }
        } catch (Throwable th) {
            this.h.close();
            throw th;
        }
    }

    public ApduNotifyResp p() {
        c();
        try {
            o(zgc.c().e(new u3q.b().c(qvf.f).e("/app/sync").d(this.h.getCplc(), this.h.getMiSeid()).b()));
            return new ApduNotifyResp(this.e, this.f);
        } catch (Exception e) {
            fpe.g(this.f34275a, "SyncSe Exception:" + e.getMessage());
            MiPayStatus miPayStatus = MiPayStatus.STATUS_BIZ_ERROR;
            return new ApduNotifyResp(miPayStatus.getStatus(), miPayStatus.getMsg());
        } finally {
            e();
        }
    }
}
