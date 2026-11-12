package com.xiaomi.fitness.devicesettings.utils;

import android.app.Application;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/utils/SportInfoUtil;", "", "<init>", "()V", "isCommonSport", "", "type", "", "getName", "", "subType", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportInfoUtil {

    @NotNull
    public static final SportInfoUtil INSTANCE = new SportInfoUtil();

    private SportInfoUtil() {
    }

    @JvmStatic
    @NotNull
    public static final String getName(int type) {
        Application app = AppUtil.getApp();
        switch (type) {
            case 1:
                String string = app.getString(wzi.id);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            case 2:
                String string2 = app.getString(wzi.Zd);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 3:
                String string3 = app.getString(wzi.hd);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 4:
                String string4 = app.getString(wzi.Kc);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 5:
                String string5 = app.getString(wzi.yb);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 6:
                String string6 = app.getString(wzi.Cb);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 7:
                String string7 = app.getString(wzi.Bb);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case 8:
                String string8 = app.getString(wzi.Vb);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            case 9:
                String string9 = app.getString(wzi.Kd);
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                return string9;
            case 10:
                String string10 = app.getString(wzi.Ld);
                Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                return string10;
            case 11:
                String string11 = app.getString(wzi.Lb);
                Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                return string11;
            case 12:
                String string12 = app.getString(wzi.fe);
                Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                return string12;
            case 13:
                String string13 = app.getString(wzi.fd);
                Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                return string13;
            case 14:
                String string14 = app.getString(wzi.dd);
                Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                return string14;
            case 15:
                String string15 = app.getString(wzi.Nc);
                Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
                return string15;
            case 16:
                String string16 = app.getString(wzi.ic);
                Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
                return string16;
            case 17:
                String string17 = app.getString(wzi.Td);
                Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
                return string17;
            default:
                switch (type) {
                    case 25:
                        String string18 = app.getString(wzi.Ta);
                        Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
                        return string18;
                    case 300:
                        String string19 = app.getString(wzi.ub);
                        Intrinsics.checkNotNullExpressionValue(string19, "getString(...)");
                        return string19;
                    case 301:
                        String string20 = app.getString(wzi.tb);
                        Intrinsics.checkNotNullExpressionValue(string20, "getString(...)");
                        return string20;
                    case 302:
                        String string21 = app.getString(wzi.Ed);
                        Intrinsics.checkNotNullExpressionValue(string21, "getString(...)");
                        return string21;
                    case 303:
                        String string22 = app.getString(wzi.vb);
                        Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
                        return string22;
                    case 304:
                        String string23 = app.getString(wzi.Sb);
                        Intrinsics.checkNotNullExpressionValue(string23, "getString(...)");
                        return string23;
                    case 305:
                        String string24 = app.getString(wzi.Vc);
                        Intrinsics.checkNotNullExpressionValue(string24, "getString(...)");
                        return string24;
                    case 306:
                        String string25 = app.getString(wzi.dc);
                        Intrinsics.checkNotNullExpressionValue(string25, "getString(...)");
                        return string25;
                    case 307:
                        String string26 = app.getString(wzi.Hd);
                        Intrinsics.checkNotNullExpressionValue(string26, "getString(...)");
                        return string26;
                    case 308:
                        String string27 = app.getString(wzi.Gd);
                        Intrinsics.checkNotNullExpressionValue(string27, "getString(...)");
                        return string27;
                    case 309:
                        String string28 = app.getString(wzi.zb);
                        Intrinsics.checkNotNullExpressionValue(string28, "getString(...)");
                        return string28;
                    case 310:
                        String string29 = app.getString(wzi.Sa);
                        Intrinsics.checkNotNullExpressionValue(string29, "getString(...)");
                        return string29;
                    case 311:
                        String string30 = app.getString(wzi.Uc);
                        Intrinsics.checkNotNullExpressionValue(string30, "getString(...)");
                        return string30;
                    case 312:
                        String string31 = app.getString(wzi.ae);
                        Intrinsics.checkNotNullExpressionValue(string31, "getString(...)");
                        return string31;
                    case 313:
                        String string32 = app.getString(wzi.Kb);
                        Intrinsics.checkNotNullExpressionValue(string32, "getString(...)");
                        return string32;
                    case 314:
                        String string33 = app.getString(wzi.bb);
                        Intrinsics.checkNotNullExpressionValue(string33, "getString(...)");
                        return string33;
                    case 315:
                        String string34 = app.getString(wzi.f38515de);
                        Intrinsics.checkNotNullExpressionValue(string34, "getString(...)");
                        return string34;
                    case 316:
                        String string35 = app.getString(wzi.Fb);
                        Intrinsics.checkNotNullExpressionValue(string35, "getString(...)");
                        return string35;
                    case 317:
                        String string36 = app.getString(wzi.lb);
                        Intrinsics.checkNotNullExpressionValue(string36, "getString(...)");
                        return string36;
                    case 318:
                        String string37 = app.getString(wzi.od);
                        Intrinsics.checkNotNullExpressionValue(string37, "getString(...)");
                        return string37;
                    case 319:
                        String string38 = app.getString(wzi.Zb);
                        Intrinsics.checkNotNullExpressionValue(string38, "getString(...)");
                        return string38;
                    case 320:
                        String string39 = app.getString(wzi.Vd);
                        Intrinsics.checkNotNullExpressionValue(string39, "getString(...)");
                        return string39;
                    case 321:
                        String string40 = app.getString(wzi.Fc);
                        Intrinsics.checkNotNullExpressionValue(string40, "getString(...)");
                        return string40;
                    case 322:
                        String string41 = app.getString(wzi.Xd);
                        Intrinsics.checkNotNullExpressionValue(string41, "getString(...)");
                        return string41;
                    case 323:
                        String string42 = app.getString(wzi.Xa);
                        Intrinsics.checkNotNullExpressionValue(string42, "getString(...)");
                        return string42;
                    case 324:
                        String string43 = app.getString(wzi.Ad);
                        Intrinsics.checkNotNullExpressionValue(string43, "getString(...)");
                        return string43;
                    case 325:
                        String string44 = app.getString(wzi.Id);
                        Intrinsics.checkNotNullExpressionValue(string44, "getString(...)");
                        return string44;
                    case 326:
                        String string45 = app.getString(wzi.Dd);
                        Intrinsics.checkNotNullExpressionValue(string45, "getString(...)");
                        return string45;
                    case 327:
                        String string46 = app.getString(wzi.hc);
                        Intrinsics.checkNotNullExpressionValue(string46, "getString(...)");
                        return string46;
                    case 328:
                        String string47 = app.getString(wzi.Sc);
                        Intrinsics.checkNotNullExpressionValue(string47, "getString(...)");
                        return string47;
                    case 329:
                        String string48 = app.getString(wzi.cc);
                        Intrinsics.checkNotNullExpressionValue(string48, "getString(...)");
                        return string48;
                    case 330:
                        String string49 = app.getString(wzi.Bc);
                        Intrinsics.checkNotNullExpressionValue(string49, "getString(...)");
                        return string49;
                    case 331:
                        String string50 = app.getString(wzi.eb);
                        Intrinsics.checkNotNullExpressionValue(string50, "getString(...)");
                        return string50;
                    case 332:
                        String string51 = app.getString(wzi.Hc);
                        Intrinsics.checkNotNullExpressionValue(string51, "getString(...)");
                        return string51;
                    case 333:
                        String string52 = app.getString(wzi.Yd);
                        Intrinsics.checkNotNullExpressionValue(string52, "getString(...)");
                        return string52;
                    case 1000:
                        String string53 = app.getString(wzi.pc);
                        Intrinsics.checkNotNullExpressionValue(string53, "getString(...)");
                        return string53;
                    case 1001:
                        String string54 = app.getString(wzi.Oc);
                        Intrinsics.checkNotNullExpressionValue(string54, "getString(...)");
                        return string54;
                    case 10000:
                        String string55 = app.getString(wzi.Mb);
                        Intrinsics.checkNotNullExpressionValue(string55, "getString(...)");
                        return string55;
                    case 10001:
                        String string56 = app.getString(wzi.Sd);
                        Intrinsics.checkNotNullExpressionValue(string56, "getString(...)");
                        return string56;
                    case 10002:
                        String string57 = app.getString(wzi.Zc);
                        Intrinsics.checkNotNullExpressionValue(string57, "getString(...)");
                        return string57;
                    default:
                        switch (type) {
                            case 100:
                                String string58 = app.getString(wzi.jd);
                                Intrinsics.checkNotNullExpressionValue(string58, "getString(...)");
                                return string58;
                            case 101:
                                String string59 = app.getString(wzi.Qc);
                                Intrinsics.checkNotNullExpressionValue(string59, "getString(...)");
                                return string59;
                            case 102:
                                String string60 = app.getString(wzi.be);
                                Intrinsics.checkNotNullExpressionValue(string60, "getString(...)");
                                return string60;
                            case 103:
                                String string61 = app.getString(wzi.Ua);
                                Intrinsics.checkNotNullExpressionValue(string61, "getString(...)");
                                return string61;
                            case 104:
                                String string62 = app.getString(wzi.Jd);
                                Intrinsics.checkNotNullExpressionValue(string62, "getString(...)");
                                return string62;
                            case 105:
                                String string63 = app.getString(wzi.rb);
                                Intrinsics.checkNotNullExpressionValue(string63, "getString(...)");
                                return string63;
                            case 106:
                                String string64 = app.getString(wzi.Ac);
                                Intrinsics.checkNotNullExpressionValue(string64, "getString(...)");
                                return string64;
                            case 107:
                                String string65 = app.getString(wzi.ed);
                                Intrinsics.checkNotNullExpressionValue(string65, "getString(...)");
                                return string65;
                            case 108:
                                String string66 = app.getString(wzi.Jc);
                                Intrinsics.checkNotNullExpressionValue(string66, "getString(...)");
                                return string66;
                            case 109:
                                String string67 = app.getString(wzi.ce);
                                Intrinsics.checkNotNullExpressionValue(string67, "getString(...)");
                                return string67;
                            case 110:
                                String string68 = app.getString(wzi.Jb);
                                Intrinsics.checkNotNullExpressionValue(string68, "getString(...)");
                                return string68;
                            case 111:
                                String string69 = app.getString(wzi.Ob);
                                Intrinsics.checkNotNullExpressionValue(string69, "getString(...)");
                                return string69;
                            case 112:
                                String string70 = app.getString(wzi.td);
                                Intrinsics.checkNotNullExpressionValue(string70, "getString(...)");
                                return string70;
                            case 113:
                                String string71 = app.getString(wzi.Dc);
                                Intrinsics.checkNotNullExpressionValue(string71, "getString(...)");
                                return string71;
                            case 114:
                                String string72 = app.getString(wzi.sc);
                                Intrinsics.checkNotNullExpressionValue(string72, "getString(...)");
                                return string72;
                            case 115:
                                String string73 = app.getString(wzi.Ib);
                                Intrinsics.checkNotNullExpressionValue(string73, "getString(...)");
                                return string73;
                            case 116:
                                String string74 = app.getString(wzi.Wb);
                                Intrinsics.checkNotNullExpressionValue(string74, "getString(...)");
                                return string74;
                            case 117:
                                String string75 = app.getString(wzi.ad);
                                Intrinsics.checkNotNullExpressionValue(string75, "getString(...)");
                                return string75;
                            case 118:
                                String string76 = app.getString(wzi.tc);
                                Intrinsics.checkNotNullExpressionValue(string76, "getString(...)");
                                return string76;
                            default:
                                switch (type) {
                                    case 200:
                                        String string77 = app.getString(wzi.bd);
                                        Intrinsics.checkNotNullExpressionValue(string77, "getString(...)");
                                        return string77;
                                    case 201:
                                        String string78 = app.getString(wzi.pd);
                                        Intrinsics.checkNotNullExpressionValue(string78, "getString(...)");
                                        return string78;
                                    case 202:
                                        String string79 = app.getString(wzi.cd);
                                        Intrinsics.checkNotNullExpressionValue(string79, "getString(...)");
                                        return string79;
                                    case 203:
                                        String string80 = app.getString(wzi.Tc);
                                        Intrinsics.checkNotNullExpressionValue(string80, "getString(...)");
                                        return string80;
                                    case 204:
                                        String string81 = app.getString(wzi.Wa);
                                        Intrinsics.checkNotNullExpressionValue(string81, "getString(...)");
                                        return string81;
                                    case 205:
                                        String string82 = app.getString(wzi.Rc);
                                        Intrinsics.checkNotNullExpressionValue(string82, "getString(...)");
                                        return string82;
                                    case 206:
                                        String string83 = app.getString(wzi.ib);
                                        Intrinsics.checkNotNullExpressionValue(string83, "getString(...)");
                                        return string83;
                                    case 207:
                                        String string84 = app.getString(wzi.gc);
                                        Intrinsics.checkNotNullExpressionValue(string84, "getString(...)");
                                        return string84;
                                    default:
                                        switch (type) {
                                            case 399:
                                                String string85 = app.getString(wzi.oc);
                                                Intrinsics.checkNotNullExpressionValue(string85, "getString(...)");
                                                return string85;
                                            case 400:
                                                String string86 = app.getString(wzi.Bd);
                                                Intrinsics.checkNotNullExpressionValue(string86, "getString(...)");
                                                return string86;
                                            case 401:
                                                String string87 = app.getString(wzi.hb);
                                                Intrinsics.checkNotNullExpressionValue(string87, "getString(...)");
                                                return string87;
                                            case 402:
                                                String string88 = app.getString(wzi.Za);
                                                Intrinsics.checkNotNullExpressionValue(string88, "getString(...)");
                                                return string88;
                                            case 403:
                                                String string89 = app.getString(wzi.Fd);
                                                Intrinsics.checkNotNullExpressionValue(string89, "getString(...)");
                                                return string89;
                                            case 404:
                                                String string90 = app.getString(wzi.ge);
                                                Intrinsics.checkNotNullExpressionValue(string90, "getString(...)");
                                                return string90;
                                            case 405:
                                                String string91 = app.getString(wzi.Mc);
                                                Intrinsics.checkNotNullExpressionValue(string91, "getString(...)");
                                                return string91;
                                            case 406:
                                                String string92 = app.getString(wzi.wc);
                                                Intrinsics.checkNotNullExpressionValue(string92, "getString(...)");
                                                return string92;
                                            case 407:
                                                String string93 = app.getString(wzi.Ec);
                                                Intrinsics.checkNotNullExpressionValue(string93, "getString(...)");
                                                return string93;
                                            case 408:
                                                String string94 = app.getString(wzi.kc);
                                                Intrinsics.checkNotNullExpressionValue(string94, "getString(...)");
                                                return string94;
                                            case 409:
                                                String string95 = app.getString(wzi.Xc);
                                                Intrinsics.checkNotNullExpressionValue(string95, "getString(...)");
                                                return string95;
                                            case 410:
                                                String string96 = app.getString(wzi.pb);
                                                Intrinsics.checkNotNullExpressionValue(string96, "getString(...)");
                                                return string96;
                                            case 411:
                                                String string97 = app.getString(wzi.ab);
                                                Intrinsics.checkNotNullExpressionValue(string97, "getString(...)");
                                                return string97;
                                            case 412:
                                                String string98 = app.getString(wzi.Ic);
                                                Intrinsics.checkNotNullExpressionValue(string98, "getString(...)");
                                                return string98;
                                            default:
                                                switch (type) {
                                                    case 499:
                                                        String string99 = app.getString(wzi.Db);
                                                        Intrinsics.checkNotNullExpressionValue(string99, "getString(...)");
                                                        return string99;
                                                    case 500:
                                                        String string100 = app.getString(wzi.ob);
                                                        Intrinsics.checkNotNullExpressionValue(string100, "getString(...)");
                                                        return string100;
                                                    case 501:
                                                        String string101 = app.getString(wzi.ee);
                                                        Intrinsics.checkNotNullExpressionValue(string101, "getString(...)");
                                                        return string101;
                                                    case 502:
                                                        String string102 = app.getString(wzi.Gc);
                                                        Intrinsics.checkNotNullExpressionValue(string102, "getString(...)");
                                                        return string102;
                                                    case 503:
                                                        String string103 = app.getString(wzi.Qd);
                                                        Intrinsics.checkNotNullExpressionValue(string103, "getString(...)");
                                                        return string103;
                                                    case 504:
                                                        String string104 = app.getString(wzi.Lc);
                                                        Intrinsics.checkNotNullExpressionValue(string104, "getString(...)");
                                                        return string104;
                                                    case 505:
                                                        String string105 = app.getString(wzi.xc);
                                                        Intrinsics.checkNotNullExpressionValue(string105, "getString(...)");
                                                        return string105;
                                                    case 506:
                                                        String string106 = app.getString(wzi.Pd);
                                                        Intrinsics.checkNotNullExpressionValue(string106, "getString(...)");
                                                        return string106;
                                                    case 507:
                                                        String string107 = app.getString(wzi.zc);
                                                        Intrinsics.checkNotNullExpressionValue(string107, "getString(...)");
                                                        return string107;
                                                    case 508:
                                                        String string108 = app.getString(wzi.Xb);
                                                        Intrinsics.checkNotNullExpressionValue(string108, "getString(...)");
                                                        return string108;
                                                    case 509:
                                                        String string109 = app.getString(wzi.Nd);
                                                        Intrinsics.checkNotNullExpressionValue(string109, "getString(...)");
                                                        return string109;
                                                    case 510:
                                                        String string110 = app.getString(wzi.Pb);
                                                        Intrinsics.checkNotNullExpressionValue(string110, "getString(...)");
                                                        return string110;
                                                    case 511:
                                                        String string111 = app.getString(wzi.yc);
                                                        Intrinsics.checkNotNullExpressionValue(string111, "getString(...)");
                                                        return string111;
                                                    default:
                                                        switch (type) {
                                                            case 600:
                                                                String string112 = app.getString(wzi.Ub);
                                                                Intrinsics.checkNotNullExpressionValue(string112, "getString(...)");
                                                                return string112;
                                                            case 601:
                                                                String string113 = app.getString(wzi.db);
                                                                Intrinsics.checkNotNullExpressionValue(string113, "getString(...)");
                                                                return string113;
                                                            case 602:
                                                                String string114 = app.getString(wzi.Wd);
                                                                Intrinsics.checkNotNullExpressionValue(string114, "getString(...)");
                                                                return string114;
                                                            case 603:
                                                                String string115 = app.getString(wzi.cb);
                                                                Intrinsics.checkNotNullExpressionValue(string115, "getString(...)");
                                                                return string115;
                                                            case 604:
                                                                String string116 = app.getString(wzi.yd);
                                                                Intrinsics.checkNotNullExpressionValue(string116, "getString(...)");
                                                                return string116;
                                                            case 605:
                                                                String string117 = app.getString(wzi.gd);
                                                                Intrinsics.checkNotNullExpressionValue(string117, "getString(...)");
                                                                return string117;
                                                            case 606:
                                                                String string118 = app.getString(wzi.lc);
                                                                Intrinsics.checkNotNullExpressionValue(string118, "getString(...)");
                                                                return string118;
                                                            case 607:
                                                                String string119 = app.getString(wzi.Wc);
                                                                Intrinsics.checkNotNullExpressionValue(string119, "getString(...)");
                                                                return string119;
                                                            case 608:
                                                                String string120 = app.getString(wzi.Ya);
                                                                Intrinsics.checkNotNullExpressionValue(string120, "getString(...)");
                                                                return string120;
                                                            case 609:
                                                                String string121 = app.getString(wzi.Rd);
                                                                Intrinsics.checkNotNullExpressionValue(string121, "getString(...)");
                                                                return string121;
                                                            case 610:
                                                                String string122 = app.getString(wzi.xb);
                                                                Intrinsics.checkNotNullExpressionValue(string122, "getString(...)");
                                                                return string122;
                                                            case 611:
                                                                String string123 = app.getString(wzi.ec);
                                                                Intrinsics.checkNotNullExpressionValue(string123, "getString(...)");
                                                                return string123;
                                                            case 612:
                                                                String string124 = app.getString(wzi.nb);
                                                                Intrinsics.checkNotNullExpressionValue(string124, "getString(...)");
                                                                return string124;
                                                            case 613:
                                                                String string125 = app.getString(wzi.Cd);
                                                                Intrinsics.checkNotNullExpressionValue(string125, "getString(...)");
                                                                return string125;
                                                            case 614:
                                                                String string126 = app.getString(wzi.jb);
                                                                Intrinsics.checkNotNullExpressionValue(string126, "getString(...)");
                                                                return string126;
                                                            case 615:
                                                                String string127 = app.getString(wzi.nd);
                                                                Intrinsics.checkNotNullExpressionValue(string127, "getString(...)");
                                                                return string127;
                                                            case 616:
                                                                String string128 = app.getString(wzi.fb);
                                                                Intrinsics.checkNotNullExpressionValue(string128, "getString(...)");
                                                                return string128;
                                                            case 617:
                                                                String string129 = app.getString(wzi.gb);
                                                                Intrinsics.checkNotNullExpressionValue(string129, "getString(...)");
                                                                return string129;
                                                            case 618:
                                                                String string130 = app.getString(wzi.ld);
                                                                Intrinsics.checkNotNullExpressionValue(string130, "getString(...)");
                                                                return string130;
                                                            case 619:
                                                                String string131 = app.getString(wzi.bc);
                                                                Intrinsics.checkNotNullExpressionValue(string131, "getString(...)");
                                                                return string131;
                                                            case 620:
                                                                String string132 = app.getString(wzi.Od);
                                                                Intrinsics.checkNotNullExpressionValue(string132, "getString(...)");
                                                                return string132;
                                                            case 621:
                                                                String string133 = app.getString(wzi.rc);
                                                                Intrinsics.checkNotNullExpressionValue(string133, "getString(...)");
                                                                return string133;
                                                            case 622:
                                                                String string134 = app.getString(wzi.kd);
                                                                Intrinsics.checkNotNullExpressionValue(string134, "getString(...)");
                                                                return string134;
                                                            case 623:
                                                                String string135 = app.getString(wzi.mb);
                                                                Intrinsics.checkNotNullExpressionValue(string135, "getString(...)");
                                                                return string135;
                                                            case 624:
                                                                String string136 = app.getString(wzi.vc);
                                                                Intrinsics.checkNotNullExpressionValue(string136, "getString(...)");
                                                                return string136;
                                                            case 625:
                                                                String string137 = app.getString(wzi.Hb);
                                                                Intrinsics.checkNotNullExpressionValue(string137, "getString(...)");
                                                                return string137;
                                                            case 626:
                                                                String string138 = app.getString(wzi.Gb);
                                                                Intrinsics.checkNotNullExpressionValue(string138, "getString(...)");
                                                                return string138;
                                                            case 627:
                                                                String string139 = app.getString(wzi.md);
                                                                Intrinsics.checkNotNullExpressionValue(string139, "getString(...)");
                                                                return string139;
                                                            default:
                                                                switch (type) {
                                                                    case 700:
                                                                        String string140 = app.getString(wzi.Pc);
                                                                        Intrinsics.checkNotNullExpressionValue(string140, "getString(...)");
                                                                        return string140;
                                                                    case 701:
                                                                        String string141 = app.getString(wzi.Ab);
                                                                        Intrinsics.checkNotNullExpressionValue(string141, "getString(...)");
                                                                        return string141;
                                                                    case 702:
                                                                        String string142 = app.getString(wzi.wd);
                                                                        Intrinsics.checkNotNullExpressionValue(string142, "getString(...)");
                                                                        return string142;
                                                                    case 703:
                                                                        String string143 = app.getString(wzi.xd);
                                                                        Intrinsics.checkNotNullExpressionValue(string143, "getString(...)");
                                                                        return string143;
                                                                    case 704:
                                                                        String string144 = app.getString(wzi.Yc);
                                                                        Intrinsics.checkNotNullExpressionValue(string144, "getString(...)");
                                                                        return string144;
                                                                    case 705:
                                                                        String string145 = app.getString(wzi.vd);
                                                                        Intrinsics.checkNotNullExpressionValue(string145, "getString(...)");
                                                                        return string145;
                                                                    case 706:
                                                                        String string146 = app.getString(wzi.sd);
                                                                        Intrinsics.checkNotNullExpressionValue(string146, "getString(...)");
                                                                        return string146;
                                                                    case 707:
                                                                        String string147 = app.getString(wzi.qc);
                                                                        Intrinsics.checkNotNullExpressionValue(string147, "getString(...)");
                                                                        return string147;
                                                                    case 708:
                                                                        String string148 = app.getString(wzi.ud);
                                                                        Intrinsics.checkNotNullExpressionValue(string148, "getString(...)");
                                                                        return string148;
                                                                    case 709:
                                                                        String string149 = app.getString(wzi.rd);
                                                                        Intrinsics.checkNotNullExpressionValue(string149, "getString(...)");
                                                                        return string149;
                                                                    case 710:
                                                                        String string150 = app.getString(wzi.wb);
                                                                        Intrinsics.checkNotNullExpressionValue(string150, "getString(...)");
                                                                        return string150;
                                                                    default:
                                                                        switch (type) {
                                                                            case 800:
                                                                                String string151 = app.getString(wzi.Va);
                                                                                Intrinsics.checkNotNullExpressionValue(string151, "getString(...)");
                                                                                return string151;
                                                                            case 801:
                                                                                String string152 = app.getString(wzi.Eb);
                                                                                Intrinsics.checkNotNullExpressionValue(string152, "getString(...)");
                                                                                return string152;
                                                                            case 802:
                                                                                String string153 = app.getString(wzi.mc);
                                                                                Intrinsics.checkNotNullExpressionValue(string153, "getString(...)");
                                                                                return string153;
                                                                            case 803:
                                                                                String string154 = app.getString(wzi.Ud);
                                                                                Intrinsics.checkNotNullExpressionValue(string154, "getString(...)");
                                                                                return string154;
                                                                            case 804:
                                                                                String string155 = app.getString(wzi.nc);
                                                                                Intrinsics.checkNotNullExpressionValue(string155, "getString(...)");
                                                                                return string155;
                                                                            case 805:
                                                                                String string156 = app.getString(wzi.Tb);
                                                                                Intrinsics.checkNotNullExpressionValue(string156, "getString(...)");
                                                                                return string156;
                                                                            case 806:
                                                                                String string157 = app.getString(wzi.Qb);
                                                                                Intrinsics.checkNotNullExpressionValue(string157, "getString(...)");
                                                                                return string157;
                                                                            case 807:
                                                                                String string158 = app.getString(wzi.Yb);
                                                                                Intrinsics.checkNotNullExpressionValue(string158, "getString(...)");
                                                                                return string158;
                                                                            case 808:
                                                                                String string159 = app.getString(wzi.Cc);
                                                                                Intrinsics.checkNotNullExpressionValue(string159, "getString(...)");
                                                                                return string159;
                                                                            case 809:
                                                                                String string160 = app.getString(wzi.Md);
                                                                                Intrinsics.checkNotNullExpressionValue(string160, "getString(...)");
                                                                                return string160;
                                                                            case 810:
                                                                                String string161 = app.getString(wzi.zd);
                                                                                Intrinsics.checkNotNullExpressionValue(string161, "getString(...)");
                                                                                return string161;
                                                                            case 811:
                                                                                String string162 = app.getString(wzi.Nb);
                                                                                Intrinsics.checkNotNullExpressionValue(string162, "getString(...)");
                                                                                return string162;
                                                                            case 812:
                                                                                String string163 = app.getString(wzi.Nb);
                                                                                Intrinsics.checkNotNullExpressionValue(string163, "getString(...)");
                                                                                return string163;
                                                                            default:
                                                                                switch (type) {
                                                                                    case 900:
                                                                                        String string164 = app.getString(wzi.uc);
                                                                                        Intrinsics.checkNotNullExpressionValue(string164, "getString(...)");
                                                                                        return string164;
                                                                                    case 901:
                                                                                        String string165 = app.getString(wzi.sb);
                                                                                        Intrinsics.checkNotNullExpressionValue(string165, "getString(...)");
                                                                                        return string165;
                                                                                    case 902:
                                                                                        String string166 = app.getString(wzi.ac);
                                                                                        Intrinsics.checkNotNullExpressionValue(string166, "getString(...)");
                                                                                        return string166;
                                                                                    case 903:
                                                                                        String string167 = app.getString(wzi.qb);
                                                                                        Intrinsics.checkNotNullExpressionValue(string167, "getString(...)");
                                                                                        return string167;
                                                                                    case 904:
                                                                                        String string168 = app.getString(wzi.kb);
                                                                                        Intrinsics.checkNotNullExpressionValue(string168, "getString(...)");
                                                                                        return string168;
                                                                                    default:
                                                                                        return "";
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public final boolean isCommonSport(int type) {
        switch (type) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                return false;
        }
    }

    @NotNull
    public final String getName(int type, int subType) {
        if (type == 1) {
            return ResourceExtKt.getString(wzi.u1);
        }
        if (type == 2) {
            if (subType == 1) {
                return ResourceExtKt.getString(wzi.p1);
            }
            if (subType == 3) {
                return ResourceExtKt.getString(wzi.l1);
            }
            if (subType == 4) {
                return ResourceExtKt.getString(wzi.o1);
            }
            if (subType == 5) {
                return ResourceExtKt.getString(wzi.k1);
            }
            if (subType == 6) {
                return ResourceExtKt.getString(wzi.q1);
            }
            if (subType == 7) {
                return ResourceExtKt.getString(wzi.h1);
            }
            if (subType == 15) {
                return ResourceExtKt.getString(wzi.g1);
            }
            if (subType == 16) {
                return ResourceExtKt.getString(wzi.r1);
            }
            if (subType == 18) {
                return ResourceExtKt.getString(wzi.m1);
            }
            if (subType == 19) {
                return ResourceExtKt.getString(wzi.u1);
            }
            if (subType == 32) {
                return ResourceExtKt.getString(wzi.n1);
            }
            if (subType != 33) {
                switch (subType) {
                    case 9:
                        return ResourceExtKt.getString(wzi.i1);
                    case 10:
                        return ResourceExtKt.getString(wzi.f1);
                    case 11:
                        return ResourceExtKt.getString(wzi.s1);
                    case 12:
                        return ResourceExtKt.getString(wzi.t1);
                    case 13:
                        return ResourceExtKt.getString(wzi.v1);
                    default:
                        return "";
                }
            }
            return ResourceExtKt.getString(wzi.j1);
        }
        if (type == 3) {
            switch (subType) {
                case 1:
                    return ResourceExtKt.getString(wzi.id);
                case 2:
                    return ResourceExtKt.getString(wzi.Zd);
                case 3:
                    return ResourceExtKt.getString(wzi.hd);
                case 4:
                    return ResourceExtKt.getString(wzi.Kc);
                case 5:
                    return ResourceExtKt.getString(wzi.yb);
                case 6:
                    return ResourceExtKt.getString(wzi.Cb);
                case 7:
                    return ResourceExtKt.getString(wzi.Bb);
                case 8:
                    return ResourceExtKt.getString(wzi.Vb);
                case 9:
                    return ResourceExtKt.getString(wzi.Kd);
                case 10:
                    return ResourceExtKt.getString(wzi.Ld);
                case 11:
                    return ResourceExtKt.getString(wzi.Lb);
                case 12:
                    return ResourceExtKt.getString(wzi.fe);
                case 13:
                    return ResourceExtKt.getString(wzi.fd);
                case 14:
                    return ResourceExtKt.getString(wzi.dd);
                case 15:
                    return ResourceExtKt.getString(wzi.Nc);
                case 16:
                    return ResourceExtKt.getString(wzi.ic);
                case 17:
                    return ResourceExtKt.getString(wzi.Td);
                default:
                    switch (subType) {
                        case 100:
                            return ResourceExtKt.getString(wzi.jd);
                        case 101:
                            return ResourceExtKt.getString(wzi.Qc);
                        case 102:
                            return ResourceExtKt.getString(wzi.be);
                        case 103:
                            return ResourceExtKt.getString(wzi.Ua);
                        case 104:
                            return ResourceExtKt.getString(wzi.Jd);
                        case 105:
                            return ResourceExtKt.getString(wzi.rb);
                        case 106:
                            return ResourceExtKt.getString(wzi.Ac);
                        case 107:
                            return ResourceExtKt.getString(wzi.ed);
                        case 108:
                            return ResourceExtKt.getString(wzi.Jc);
                        case 109:
                            return ResourceExtKt.getString(wzi.ce);
                        case 110:
                            return ResourceExtKt.getString(wzi.Jb);
                        case 111:
                            return ResourceExtKt.getString(wzi.Ob);
                        case 112:
                            return ResourceExtKt.getString(wzi.td);
                        case 113:
                            return ResourceExtKt.getString(wzi.Dc);
                        default:
                            switch (subType) {
                                case 200:
                                    return ResourceExtKt.getString(wzi.bd);
                                case 201:
                                    return ResourceExtKt.getString(wzi.pd);
                                case 202:
                                    return ResourceExtKt.getString(wzi.cd);
                                case 203:
                                    return ResourceExtKt.getString(wzi.Tc);
                                case 204:
                                    return ResourceExtKt.getString(wzi.Wa);
                                case 205:
                                    return ResourceExtKt.getString(wzi.Rc);
                                default:
                                    switch (subType) {
                                        case 300:
                                            return ResourceExtKt.getString(wzi.ub);
                                        case 301:
                                            return ResourceExtKt.getString(wzi.tb);
                                        case 302:
                                            return ResourceExtKt.getString(wzi.Ed);
                                        case 303:
                                            return ResourceExtKt.getString(wzi.vb);
                                        case 304:
                                            return ResourceExtKt.getString(wzi.Sb);
                                        case 305:
                                            return ResourceExtKt.getString(wzi.Vc);
                                        case 306:
                                            return ResourceExtKt.getString(wzi.dc);
                                        case 307:
                                            return ResourceExtKt.getString(wzi.Hd);
                                        case 308:
                                            return ResourceExtKt.getString(wzi.Gd);
                                        case 309:
                                            return ResourceExtKt.getString(wzi.zb);
                                        case 310:
                                            return ResourceExtKt.getString(wzi.Sa);
                                        case 311:
                                            return ResourceExtKt.getString(wzi.Uc);
                                        case 312:
                                            return ResourceExtKt.getString(wzi.ae);
                                        case 313:
                                            return ResourceExtKt.getString(wzi.Kb);
                                        case 314:
                                            return ResourceExtKt.getString(wzi.bb);
                                        case 315:
                                            return ResourceExtKt.getString(wzi.f38515de);
                                        case 316:
                                            return ResourceExtKt.getString(wzi.Fb);
                                        case 317:
                                            return ResourceExtKt.getString(wzi.lb);
                                        case 318:
                                            return ResourceExtKt.getString(wzi.od);
                                        case 319:
                                            return ResourceExtKt.getString(wzi.Zb);
                                        case 320:
                                            return ResourceExtKt.getString(wzi.Vd);
                                        case 321:
                                            return ResourceExtKt.getString(wzi.Fc);
                                        case 322:
                                            return ResourceExtKt.getString(wzi.Xd);
                                        case 323:
                                            return ResourceExtKt.getString(wzi.Xa);
                                        case 10000:
                                            return ResourceExtKt.getString(wzi.Mb);
                                        case 10001:
                                            return ResourceExtKt.getString(wzi.Sd);
                                        case 10002:
                                            return ResourceExtKt.getString(wzi.Zc);
                                        default:
                                            switch (subType) {
                                                case 400:
                                                    return ResourceExtKt.getString(wzi.Bd);
                                                case 401:
                                                    return ResourceExtKt.getString(wzi.hb);
                                                case 402:
                                                    return ResourceExtKt.getString(wzi.Za);
                                                case 403:
                                                    return ResourceExtKt.getString(wzi.Fd);
                                                case 404:
                                                    return ResourceExtKt.getString(wzi.ge);
                                                case 405:
                                                    return ResourceExtKt.getString(wzi.Mc);
                                                case 406:
                                                    return ResourceExtKt.getString(wzi.wc);
                                                case 407:
                                                    return ResourceExtKt.getString(wzi.Ec);
                                                default:
                                                    switch (subType) {
                                                        case 500:
                                                            return ResourceExtKt.getString(wzi.ob);
                                                        case 501:
                                                            return ResourceExtKt.getString(wzi.ee);
                                                        case 502:
                                                            return ResourceExtKt.getString(wzi.Gc);
                                                        case 503:
                                                            return ResourceExtKt.getString(wzi.Qd);
                                                        case 504:
                                                            return ResourceExtKt.getString(wzi.Lc);
                                                        case 505:
                                                            return ResourceExtKt.getString(wzi.xc);
                                                        case 506:
                                                            return ResourceExtKt.getString(wzi.Pd);
                                                        case 507:
                                                            return ResourceExtKt.getString(wzi.zc);
                                                        case 508:
                                                            return ResourceExtKt.getString(wzi.Xb);
                                                        case 509:
                                                            return ResourceExtKt.getString(wzi.Nd);
                                                        case 510:
                                                            return ResourceExtKt.getString(wzi.Pb);
                                                        default:
                                                            switch (subType) {
                                                                case 600:
                                                                    return ResourceExtKt.getString(wzi.Ub);
                                                                case 601:
                                                                    return ResourceExtKt.getString(wzi.db);
                                                                case 602:
                                                                    return ResourceExtKt.getString(wzi.Wd);
                                                                case 603:
                                                                    return ResourceExtKt.getString(wzi.cb);
                                                                case 604:
                                                                    return ResourceExtKt.getString(wzi.yd);
                                                                case 605:
                                                                    return ResourceExtKt.getString(wzi.gd);
                                                                case 606:
                                                                    return ResourceExtKt.getString(wzi.lc);
                                                                case 607:
                                                                    return ResourceExtKt.getString(wzi.Wc);
                                                                case 608:
                                                                    return ResourceExtKt.getString(wzi.Ya);
                                                                case 609:
                                                                    return ResourceExtKt.getString(wzi.Rd);
                                                                case 610:
                                                                    return ResourceExtKt.getString(wzi.xb);
                                                                case 611:
                                                                    return ResourceExtKt.getString(wzi.ec);
                                                                case 612:
                                                                    return ResourceExtKt.getString(wzi.nb);
                                                                case 613:
                                                                    return ResourceExtKt.getString(wzi.Cd);
                                                                case 614:
                                                                    return ResourceExtKt.getString(wzi.jb);
                                                                case 615:
                                                                    return ResourceExtKt.getString(wzi.nd);
                                                                case 616:
                                                                    return ResourceExtKt.getString(wzi.fb);
                                                                case 617:
                                                                    return ResourceExtKt.getString(wzi.gb);
                                                                case 618:
                                                                    return ResourceExtKt.getString(wzi.ld);
                                                                case 619:
                                                                    return ResourceExtKt.getString(wzi.bc);
                                                                default:
                                                                    switch (subType) {
                                                                        case 700:
                                                                            return ResourceExtKt.getString(wzi.Pc);
                                                                        case 701:
                                                                            return ResourceExtKt.getString(wzi.Ab);
                                                                        case 702:
                                                                            return ResourceExtKt.getString(wzi.wd);
                                                                        case 703:
                                                                            return ResourceExtKt.getString(wzi.xd);
                                                                        case 704:
                                                                            return ResourceExtKt.getString(wzi.Yc);
                                                                        case 705:
                                                                            return ResourceExtKt.getString(wzi.vd);
                                                                        case 706:
                                                                            return ResourceExtKt.getString(wzi.sd);
                                                                        default:
                                                                            switch (subType) {
                                                                                case 708:
                                                                                    return ResourceExtKt.getString(wzi.ud);
                                                                                case 709:
                                                                                    return ResourceExtKt.getString(wzi.rd);
                                                                                case 710:
                                                                                    return ResourceExtKt.getString(wzi.wb);
                                                                                default:
                                                                                    switch (subType) {
                                                                                        case 800:
                                                                                            return ResourceExtKt.getString(wzi.Va);
                                                                                        case 801:
                                                                                            return ResourceExtKt.getString(wzi.Eb);
                                                                                        case 802:
                                                                                            return ResourceExtKt.getString(wzi.mc);
                                                                                        case 803:
                                                                                            return ResourceExtKt.getString(wzi.Ud);
                                                                                        case 804:
                                                                                            return ResourceExtKt.getString(wzi.nc);
                                                                                        case 805:
                                                                                            return ResourceExtKt.getString(wzi.Tb);
                                                                                        case 806:
                                                                                            return ResourceExtKt.getString(wzi.Qb);
                                                                                        case 807:
                                                                                            return ResourceExtKt.getString(wzi.Yb);
                                                                                        default:
                                                                                            return "";
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return "";
    }
}
