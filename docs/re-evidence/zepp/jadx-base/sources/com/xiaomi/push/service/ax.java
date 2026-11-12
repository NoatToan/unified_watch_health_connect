package com.xiaomi.push.service;

import android.text.TextUtils;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.huami.nfc.applet.EntityKt;
import com.xiaomi.push.bi;
import com.xiaomi.push.bu;
import com.xiaomi.push.cg;
import com.xiaomi.push.ch;
import com.xiaomi.push.ci;
import com.xiaomi.push.cj;
import com.xiaomi.push.cx;
import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes22.dex */
public class ax {
    private XMPushService a;

    public ax(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    private void b(cg cgVar) {
        String strC = cgVar.c();
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        String[] strArrSplit = strC.split(";");
        com.xiaomi.push.ag agVarA = com.xiaomi.push.ak.a().a(bu.a(), false);
        if (agVarA == null || strArrSplit.length <= 0) {
            return;
        }
        agVarA.a(strArrSplit);
        this.a.a(20, (Exception) null);
        this.a.a(true);
    }

    private void c(cj cjVar) {
        az.b bVarA;
        String strL = cjVar.l();
        String strK = cjVar.k();
        if (TextUtils.isEmpty(strL) || TextUtils.isEmpty(strK) || (bVarA = az.a().a(strK, strL)) == null) {
            return;
        }
        cx.a(this.a, bVarA.f206a, cx.a(cjVar.mo3639a()), true, true, System.currentTimeMillis());
    }

    private void d(bi biVar) {
        az.b bVarA;
        String strG = biVar.g();
        String string = Integer.toString(biVar.a());
        if (TextUtils.isEmpty(strG) || TextUtils.isEmpty(string) || (bVarA = az.a().a(string, strG)) == null) {
            return;
        }
        cx.a(this.a, bVarA.f206a, biVar.c(), true, true, System.currentTimeMillis());
    }

    public void a(bi biVar) {
        if (5 != biVar.a()) {
            d(biVar);
        }
        try {
            b(biVar);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a("handle Blob chid = " + biVar.a() + " cmd = " + biVar.m3595a() + " packetid = " + biVar.e() + " failure ", e);
        }
    }

    public void a(cj cjVar) {
        if (!"5".equals(cjVar.k())) {
            c(cjVar);
        }
        String strK = cjVar.k();
        if (TextUtils.isEmpty(strK)) {
            strK = "1";
            cjVar.l("1");
        }
        if (strK.equals("0")) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("Received wrong packet with chid = 0 : " + cjVar.mo3639a());
        }
        if (cjVar instanceof ch) {
            cg cgVarA = cjVar.a("kick");
            if (cgVarA != null) {
                String strL = cjVar.l();
                String strA = cgVarA.a("type");
                String strA2 = cgVarA.a("reason");
                com.xiaomi.channel.commonutils.logger.b.m3434a("kicked by server, chid=" + strK + " res=" + az.b.a(strL) + " type=" + strA + " reason=" + strA2);
                if (!"wait".equals(strA)) {
                    this.a.a(strK, strL, 3, strA2, strA);
                    az.a().m3829a(strK, strL);
                    return;
                }
                az.b bVarA = az.a().a(strK, strL);
                if (bVarA != null) {
                    this.a.a(bVarA);
                    bVarA.a(az.c.unbind, 3, 0, strA2, strA);
                    return;
                }
                return;
            }
        } else if (cjVar instanceof ci) {
            ci ciVar = (ci) cjVar;
            if ("redir".equals(ciVar.b())) {
                cg cgVarA2 = ciVar.a("hosts");
                if (cgVarA2 != null) {
                    b(cgVarA2);
                    return;
                }
                return;
            }
        }
        this.a.m3807b().a(this.a, strK, cjVar);
    }

    public void b(bi biVar) {
        StringBuilder sb;
        String strM3565a;
        String string;
        az.c cVar;
        int i;
        int i2;
        String strM3595a = biVar.m3595a();
        if (biVar.a() != 0) {
            String string2 = Integer.toString(biVar.a());
            if ("SECMSG".equals(biVar.m3595a())) {
                if (!biVar.m3597a()) {
                    this.a.m3807b().a(this.a, string2, biVar);
                    return;
                }
                sb = new StringBuilder();
                sb.append("Recv SECMSG errCode = ");
                sb.append(biVar.b());
                sb.append(" errStr = ");
                strM3565a = biVar.m3601c();
            } else {
                if (!"BIND".equals(strM3595a)) {
                    if ("KICK".equals(strM3595a)) {
                        com.xiaomi.push.au.g gVarA = com.xiaomi.push.au.g.a(biVar.m3598a());
                        String strG = biVar.g();
                        String strM3560a = gVarA.m3560a();
                        String strM3562b = gVarA.m3562b();
                        com.xiaomi.channel.commonutils.logger.b.m3434a("kicked by server, chid=" + string2 + " res= " + az.b.a(strG) + " type=" + strM3560a + " reason=" + strM3562b);
                        if (!"wait".equals(strM3560a)) {
                            this.a.a(string2, strG, 3, strM3562b, strM3560a);
                            az.a().m3829a(string2, strG);
                            return;
                        }
                        az.b bVarA = az.a().a(string2, strG);
                        if (bVarA != null) {
                            this.a.a(bVarA);
                            bVarA.a(az.c.unbind, 3, 0, strM3562b, strM3560a);
                            return;
                        }
                        return;
                    }
                    return;
                }
                com.xiaomi.push.au.d dVarA = com.xiaomi.push.au.d.a(biVar.m3598a());
                String strG2 = biVar.g();
                az.b bVarA2 = az.a().a(string2, strG2);
                if (bVarA2 == null) {
                    return;
                }
                if (dVarA.m3539a()) {
                    com.xiaomi.channel.commonutils.logger.b.m3434a("SMACK: channel bind succeeded, chid=" + biVar.a());
                    bVarA2.a(az.c.binded, 1, 0, null, null);
                    return;
                }
                String strM3538a = dVarA.m3538a();
                if ("auth".equals(strM3538a)) {
                    if ("invalid-sig".equals(dVarA.m3540b())) {
                        com.xiaomi.channel.commonutils.logger.b.m3434a("SMACK: bind error invalid-sig token = " + bVarA2.c + " sec = " + bVarA2.h);
                    }
                    cVar = az.c.unbind;
                    i = 1;
                    i2 = 5;
                } else {
                    if (com.twitter.sdk.android.tweetcomposer.g.g.equals(strM3538a)) {
                        cVar = az.c.unbind;
                        i = 1;
                        i2 = 7;
                    } else if ("wait".equals(strM3538a)) {
                        this.a.a(bVarA2);
                        bVarA2.a(az.c.unbind, 1, 7, dVarA.m3540b(), strM3538a);
                    }
                    string = "SMACK: channel bind failed, chid=" + string2 + " reason=" + dVarA.m3540b();
                }
                bVarA2.a(cVar, i, i2, dVarA.m3540b(), strM3538a);
                az.a().m3829a(string2, strG2);
                string = "SMACK: channel bind failed, chid=" + string2 + " reason=" + dVarA.m3540b();
            }
            com.xiaomi.channel.commonutils.logger.b.m3434a(string);
        }
        if ("PING".equals(strM3595a)) {
            byte[] bArrM3598a = biVar.m3598a();
            if (bArrM3598a != null && bArrM3598a.length > 0) {
                com.xiaomi.push.au.j jVarA = com.xiaomi.push.au.j.a(bArrM3598a);
                if (jVarA.m3573b()) {
                    bn.a().h(jVarA.m3571a());
                }
            }
            if (!PkgNameConstants.XMSF.equals(this.a.getPackageName())) {
                this.a.m3804a();
            }
            if ("1".equals(biVar.e())) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("received a server ping");
            }
            this.a.m3808b();
            return;
        }
        if (EntityKt.FETCH_APDU_MODE_SYNC.equals(strM3595a)) {
            if ("CONF".equals(biVar.m3600b())) {
                bn.a().h(com.xiaomi.push.au.b.a(biVar.m3598a()));
                return;
            }
            if (TextUtils.equals("U", biVar.m3600b())) {
                bi biVar2 = new bi();
                biVar2.a(0);
                biVar2.a(biVar.m3595a(), "UCA");
                biVar2.a(biVar.e());
                XMPushService xMPushService = this.a;
                xMPushService.a(new e0(xMPushService, biVar2));
                return;
            }
            if (!TextUtils.equals("P", biVar.m3600b())) {
                return;
            }
            com.xiaomi.push.au.i iVarA = com.xiaomi.push.au.i.a(biVar.m3598a());
            bi biVar3 = new bi();
            biVar3.a(0);
            biVar3.a(biVar.m3595a(), "PCA");
            biVar3.a(biVar.e());
            com.xiaomi.push.au.i iVar = new com.xiaomi.push.au.i();
            if (iVarA.m3569a()) {
                iVar.a(iVarA.m3568a());
            }
            biVar3.a(iVar.m3755a(), (String) null);
            XMPushService xMPushService2 = this.a;
            xMPushService2.a(new e0(xMPushService2, biVar3));
            sb = new StringBuilder();
            sb.append("ACK msgP: id = ");
            strM3565a = biVar.e();
        } else {
            if (!HTTP.NOTIFY.equals(biVar.m3595a())) {
                return;
            }
            com.xiaomi.push.au.h hVarA = com.xiaomi.push.au.h.a(biVar.m3598a());
            sb = new StringBuilder();
            sb.append("notify by server err = ");
            sb.append(hVarA.c());
            sb.append(" desc = ");
            strM3565a = hVarA.m3565a();
        }
        sb.append(strM3565a);
        string = sb.toString();
        com.xiaomi.channel.commonutils.logger.b.m3434a(string);
    }
}
