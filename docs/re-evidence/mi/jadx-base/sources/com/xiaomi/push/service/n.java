package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.fs;
import com.xiaomi.smarthome.framework.api.UserConfig;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.dys;
import defpackage.fqs;
import defpackage.fys;
import defpackage.gvs;
import defpackage.hqs;
import defpackage.jws;
import defpackage.kqs;
import defpackage.lqs;
import defpackage.mis;
import defpackage.mqs;
import defpackage.mvs;
import defpackage.nqs;
import defpackage.oqs;
import defpackage.rds;
import defpackage.tos;
import defpackage.vxs;
import defpackage.wjs;
import defpackage.x9s;
import defpackage.xys;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XMPushService f14245a;

    public n(XMPushService xMPushService) {
        this.f14245a = xMPushService;
    }

    public void a(mvs mvsVar) {
        if (5 != mvsVar.a()) {
            f(mvsVar);
        }
        try {
            d(mvsVar);
        } catch (Exception e) {
            x9s.q("handle Blob chid = " + mvsVar.a() + " cmd = " + mvsVar.e() + " packetid = " + mvsVar.D() + " failure ", e);
        }
    }

    public final void b(vxs vxsVar) {
        String strK = vxsVar.k();
        if (TextUtils.isEmpty(strK)) {
            return;
        }
        String[] strArrSplit = strK.split(";");
        mis misVarB = wjs.c().b(jws.b(), false);
        if (misVarB == null || strArrSplit.length <= 0) {
            return;
        }
        misVarB.o(strArrSplit);
        this.f14245a.a(20, (Exception) null);
        this.f14245a.a(true);
    }

    public void c(fys fysVar) {
        if (!UserConfig.KEY_DEVICE_LITE_SORT_GROUP.equals(fysVar.m())) {
            e(fysVar);
        }
        String strM = fysVar.m();
        if (TextUtils.isEmpty(strM)) {
            strM = "1";
            fysVar.p("1");
        }
        if (strM.equals("0")) {
            x9s.o("Received wrong packet with chid = 0 : " + fysVar.f());
        }
        if (fysVar instanceof com.xiaomi.push.e) {
            vxs vxsVarC = fysVar.c("kick");
            if (vxsVarC != null) {
                String strO = fysVar.o();
                String strF = vxsVarC.f("type");
                String strF2 = vxsVarC.f("reason");
                x9s.o("kicked by server, chid=" + strM + " res=" + bg.b.e(strO) + " type=" + strF + " reason=" + strF2);
                if (!"wait".equals(strF)) {
                    this.f14245a.a(strM, strO, 3, strF2, strF);
                    bg.c().n(strM, strO);
                    return;
                }
                bg.b bVarB = bg.c().b(strM, strO);
                if (bVarB != null) {
                    this.f14245a.a(bVarB);
                    bVarB.k(bg.c.unbind, 3, 0, strF2, strF);
                    return;
                }
                return;
            }
        } else if (fysVar instanceof dys) {
            dys dysVar = (dys) fysVar;
            if ("redir".equals(dysVar.B())) {
                vxs vxsVarC2 = dysVar.c("hosts");
                if (vxsVarC2 != null) {
                    b(vxsVarC2);
                    return;
                }
                return;
            }
        }
        this.f14245a.m833b().j(this.f14245a, strM, fysVar);
    }

    public void d(mvs mvsVar) {
        String strE = mvsVar.e();
        if (mvsVar.a() == 0) {
            if ("PING".equals(strE)) {
                byte[] bArrP = mvsVar.p();
                if (bArrP != null && bArrP.length > 0) {
                    nqs nqsVarO = nqs.o(bArrP);
                    if (nqsVarO.q()) {
                        rds.c().l(nqsVarO.k());
                    }
                }
                if (!"com.xiaomi.xmsf".equals(this.f14245a.getPackageName())) {
                    this.f14245a.m830a();
                }
                if ("1".equals(mvsVar.D())) {
                    x9s.o("received a server ping");
                } else {
                    gvs.j();
                }
                this.f14245a.m834b();
                return;
            }
            if (!"SYNC".equals(strE)) {
                if ("NOTIFY".equals(mvsVar.e())) {
                    lqs lqsVarM = lqs.m(mvsVar.p());
                    x9s.o("notify by server err = " + lqsVarM.q() + " desc = " + lqsVarM.n());
                    return;
                }
                return;
            }
            if ("CONF".equals(mvsVar.t())) {
                rds.c().l(fqs.m(mvsVar.p()));
                return;
            }
            if (TextUtils.equals("U", mvsVar.t())) {
                oqs oqsVarP = oqs.p(mvsVar.p());
                tos.b(this.f14245a).h(oqsVarP.q(), oqsVarP.v(), new Date(oqsVarP.j()), new Date(oqsVarP.s()), oqsVarP.x() * 1024, oqsVarP.A());
                mvs mvsVar2 = new mvs();
                mvsVar2.h(0);
                mvsVar2.l(mvsVar.e(), "UCA");
                mvsVar2.k(mvsVar.D());
                XMPushService xMPushService = this.f14245a;
                xMPushService.a(new u(xMPushService, mvsVar2));
                return;
            }
            if (TextUtils.equals("P", mvsVar.t())) {
                mqs mqsVarM = mqs.m(mvsVar.p());
                mvs mvsVar3 = new mvs();
                mvsVar3.h(0);
                mvsVar3.l(mvsVar.e(), "PCA");
                mvsVar3.k(mvsVar.D());
                mqs mqsVar = new mqs();
                if (mqsVarM.n()) {
                    mqsVar.k(mqsVarM.j());
                }
                mvsVar3.n(mqsVar.h(), null);
                XMPushService xMPushService2 = this.f14245a;
                xMPushService2.a(new u(xMPushService2, mvsVar3));
                x9s.o("ACK msgP: id = " + mvsVar.D());
                return;
            }
            return;
        }
        String string = Integer.toString(mvsVar.a());
        if ("SECMSG".equals(mvsVar.e())) {
            if (!mvsVar.o()) {
                this.f14245a.m833b().i(this.f14245a, string, mvsVar);
                return;
            }
            x9s.o("Recv SECMSG errCode = " + mvsVar.r() + " errStr = " + mvsVar.z());
            return;
        }
        if (!"BIND".equals(strE)) {
            if ("KICK".equals(strE)) {
                kqs kqsVarL = kqs.l(mvsVar.p());
                String strF = mvsVar.F();
                String strM = kqsVarL.m();
                String strP = kqsVarL.p();
                x9s.o("kicked by server, chid=" + string + " res= " + bg.b.e(strF) + " type=" + strM + " reason=" + strP);
                if (!"wait".equals(strM)) {
                    this.f14245a.a(string, strF, 3, strP, strM);
                    bg.c().n(string, strF);
                    return;
                }
                bg.b bVarB = bg.c().b(string, strF);
                if (bVarB != null) {
                    this.f14245a.a(bVarB);
                    bVarB.k(bg.c.unbind, 3, 0, strP, strM);
                    return;
                }
                return;
            }
            return;
        }
        hqs hqsVarM = hqs.m(mvsVar.p());
        String strF2 = mvsVar.F();
        bg.b bVarB2 = bg.c().b(string, strF2);
        if (bVarB2 == null) {
            return;
        }
        if (hqsVarM.o()) {
            x9s.o("SMACK: channel bind succeeded, chid=" + mvsVar.a());
            bVarB2.k(bg.c.binded, 1, 0, null, null);
            return;
        }
        String strN = hqsVarM.n();
        if ("auth".equals(strN)) {
            if ("invalid-sig".equals(hqsVarM.q())) {
                x9s.o("SMACK: bind error invalid-sig token = " + bVarB2.c + " sec = " + bVarB2.i);
                gvs.d(0, fs.BIND_INVALID_SIG.a(), 1, null, 0);
            }
            bVarB2.k(bg.c.unbind, 1, 5, hqsVarM.q(), strN);
            bg.c().n(string, strF2);
        } else if (BroadcastsKt.SILENT_PUSHING_CANCEL.equals(strN)) {
            bVarB2.k(bg.c.unbind, 1, 7, hqsVarM.q(), strN);
            bg.c().n(string, strF2);
        } else if ("wait".equals(strN)) {
            this.f14245a.a(bVarB2);
            bVarB2.k(bg.c.unbind, 1, 7, hqsVarM.q(), strN);
        }
        x9s.o("SMACK: channel bind failed, chid=" + string + " reason=" + hqsVarM.q());
    }

    public final void e(fys fysVar) {
        bg.b bVarB;
        String strO = fysVar.o();
        String strM = fysVar.m();
        if (TextUtils.isEmpty(strO) || TextUtils.isEmpty(strM) || (bVarB = bg.c().b(strM, strO)) == null) {
            return;
        }
        xys.j(this.f14245a, bVarB.f14196a, xys.b(fysVar.f()), true, true, System.currentTimeMillis());
    }

    public final void f(mvs mvsVar) {
        bg.b bVarB;
        String strF = mvsVar.F();
        String string = Integer.toString(mvsVar.a());
        if (TextUtils.isEmpty(strF) || TextUtils.isEmpty(string) || (bVarB = bg.c().b(string, strF)) == null) {
            return;
        }
        xys.j(this.f14245a, bVarB.f14196a, mvsVar.x(), true, true, System.currentTimeMillis());
    }
}
