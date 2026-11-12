package defpackage;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportBasicReportExKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;

/* JADX INFO: loaded from: classes7.dex */
public class lp5 {
    @SuppressLint({"SwitchIntDef"})
    public static int a(SportBasicReport sportBasicReport) {
        int sportType = sportBasicReport.getSportType();
        if (sportType == 1 && sportBasicReport.getSportCourseId() != null && SportBasicReportExKt.isRealSportCourseId(sportBasicReport)) {
            Long trainingPlanId = sportBasicReport.getTrainingPlanId();
            Long cloudCourseId = sportBasicReport.getCloudCourseId();
            if (trainingPlanId == null || cloudCourseId == null || trainingPlanId.longValue() <= 0 || cloudCourseId.longValue() <= 0) {
                return 20 - sportBasicReport.getSportCourseId().intValue();
            }
            return cloudCourseId.longValue() < 200000 ? 22 : 29;
        }
        if (sportType == 19) {
            return 141;
        }
        if (sportType == 20) {
            return 147;
        }
        switch (sportType) {
            case 1:
                return 22;
            case 2:
                return 28;
            case 3:
                return 21;
            case 4:
                return 27;
            case 5:
                return 20;
            case 6:
                return 26;
            case 7:
                return 25;
            case 8:
                return 29;
            case 9:
                return 23;
            case 10:
                return 24;
            case 11:
                return 32;
            case 12:
                return 30;
            case 13:
                return 33;
            case 14:
                return 31;
            case 15:
                return 34;
            case 16:
                return 35;
            case 17:
                return 36;
            default:
                switch (sportType) {
                    case 100:
                        return 38;
                    case 101:
                        return 39;
                    case 102:
                        return 40;
                    case 103:
                        return 41;
                    case 104:
                        return 42;
                    case 105:
                        return 43;
                    case 106:
                        return 44;
                    case 107:
                        return 45;
                    case 108:
                        return 46;
                    case 109:
                        return 47;
                    case 110:
                        return 48;
                    case 111:
                        return 49;
                    case 112:
                        return 50;
                    case 113:
                        return 51;
                    case 114:
                        return 148;
                    case 115:
                        return 149;
                    case 116:
                        return SportReportBaseParser.ReportType.avgDivingDepth;
                    case 117:
                        return SportReportBaseParser.ReportType.avgAscentRate;
                    case 118:
                        return SportReportBaseParser.ReportType.avgDescentRate;
                    default:
                        switch (sportType) {
                            case 200:
                                return 52;
                            case 201:
                                return 53;
                            case 202:
                                return 54;
                            case 203:
                                return 55;
                            case 204:
                                return 56;
                            case 205:
                                return 57;
                            case 206:
                                return 150;
                            case 207:
                                return 151;
                            default:
                                switch (sportType) {
                                    case 300:
                                        return 58;
                                    case 301:
                                        return 59;
                                    case 302:
                                        return 60;
                                    case 303:
                                        return 61;
                                    case 304:
                                        return 62;
                                    case 305:
                                        return 63;
                                    case 306:
                                        return 64;
                                    case 307:
                                        return 65;
                                    case 308:
                                        return 66;
                                    case 309:
                                        return 67;
                                    case 310:
                                        return 68;
                                    case 311:
                                        return 69;
                                    case 312:
                                        return 70;
                                    case 313:
                                        return 71;
                                    case 314:
                                        return 72;
                                    case 315:
                                        return 73;
                                    case 316:
                                        return 74;
                                    case 317:
                                        return 75;
                                    case 318:
                                        return 76;
                                    case 319:
                                        return 77;
                                    case 320:
                                        return 78;
                                    case 321:
                                        return 79;
                                    case 322:
                                        return 80;
                                    case 323:
                                        return 81;
                                    case 324:
                                        return 152;
                                    case 325:
                                        return 153;
                                    case 326:
                                        return 154;
                                    case 327:
                                        return 155;
                                    case 328:
                                        return 156;
                                    case 329:
                                        return 157;
                                    case 330:
                                        return 158;
                                    case 331:
                                        return 159;
                                    case 332:
                                        return 160;
                                    case 333:
                                        return 161;
                                    case 334:
                                        return 192;
                                    case 900:
                                        return 179;
                                    case 901:
                                        return 180;
                                    case 902:
                                        return 181;
                                    case 903:
                                        return 182;
                                    case 904:
                                        return SportReportBaseParser.ReportType.entryTime;
                                    case 1000:
                                        return SportReportBaseParser.ReportType.descentCount;
                                    case 1001:
                                        return SportReportBaseParser.ReportType.maxWaterTemperature;
                                    case 10000:
                                        return 135;
                                    case 10001:
                                        return 136;
                                    case 10002:
                                        return 137;
                                    default:
                                        switch (sportType) {
                                            case 399:
                                                return 139;
                                            case 400:
                                                return 82;
                                            case 401:
                                                return 83;
                                            case 402:
                                                return 84;
                                            case 403:
                                                return 85;
                                            case 404:
                                                return 86;
                                            case 405:
                                                return 87;
                                            case 406:
                                                return 88;
                                            case 407:
                                                return 89;
                                            case 408:
                                                return 162;
                                            case 409:
                                                return 163;
                                            case 410:
                                                return 164;
                                            case 411:
                                                return 165;
                                            case 412:
                                                return 185;
                                            default:
                                                switch (sportType) {
                                                    case 499:
                                                        return 138;
                                                    case 500:
                                                        return 90;
                                                    case 501:
                                                        return 91;
                                                    case 502:
                                                        return 92;
                                                    case 503:
                                                        return 93;
                                                    case 504:
                                                        return 94;
                                                    case 505:
                                                        return 95;
                                                    case 506:
                                                        return 96;
                                                    case 507:
                                                        return 97;
                                                    case 508:
                                                        return 98;
                                                    case 509:
                                                        return 99;
                                                    case 510:
                                                        return 100;
                                                    case 511:
                                                        return 166;
                                                    default:
                                                        switch (sportType) {
                                                            case 600:
                                                                return 101;
                                                            case 601:
                                                                return 102;
                                                            case 602:
                                                                return 103;
                                                            case 603:
                                                                return 104;
                                                            case 604:
                                                                return 105;
                                                            case 605:
                                                                return 106;
                                                            case 606:
                                                                return 107;
                                                            case 607:
                                                                return 108;
                                                            case 608:
                                                                return 109;
                                                            case 609:
                                                                return 110;
                                                            case 610:
                                                                return 111;
                                                            case 611:
                                                                return 112;
                                                            case 612:
                                                                return 113;
                                                            case 613:
                                                                return 114;
                                                            case 614:
                                                                return 115;
                                                            case 615:
                                                                return 116;
                                                            case 616:
                                                                return 117;
                                                            case 617:
                                                                return 118;
                                                            case 618:
                                                                return 119;
                                                            case 619:
                                                                return 143;
                                                            case 620:
                                                                return 167;
                                                            case 621:
                                                                return 168;
                                                            case 622:
                                                                return 169;
                                                            case 623:
                                                                return 170;
                                                            case 624:
                                                                return 171;
                                                            case 625:
                                                                return 172;
                                                            case 626:
                                                                return 173;
                                                            case 627:
                                                                return 174;
                                                            default:
                                                                switch (sportType) {
                                                                    case 700:
                                                                        return 120;
                                                                    case 701:
                                                                        return 121;
                                                                    case 702:
                                                                        return 122;
                                                                    case 703:
                                                                        return 123;
                                                                    case 704:
                                                                        return 124;
                                                                    case 705:
                                                                        return 125;
                                                                    case 706:
                                                                        return 126;
                                                                    case 707:
                                                                        return 140;
                                                                    case 708:
                                                                        return 144;
                                                                    case 709:
                                                                        return 145;
                                                                    case 710:
                                                                        return 146;
                                                                    default:
                                                                        switch (sportType) {
                                                                            case 800:
                                                                                return 127;
                                                                            case 801:
                                                                                return 128;
                                                                            case 802:
                                                                                return 129;
                                                                            case 803:
                                                                                return 130;
                                                                            case 804:
                                                                                return 131;
                                                                            case 805:
                                                                                return 132;
                                                                            case 806:
                                                                                return 133;
                                                                            case 807:
                                                                                return 134;
                                                                            case 808:
                                                                                return 175;
                                                                            case 809:
                                                                                return 176;
                                                                            case 810:
                                                                                return 177;
                                                                            case 811:
                                                                                return 178;
                                                                            case 812:
                                                                                return SportReportBaseParser.ReportType.minWaterTemperature;
                                                                            default:
                                                                                return 0;
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

    public static int b(int i) {
        if (i < 20 && i > 0) {
            return bni.p1;
        }
        kp5 kp5VarA = jp5.c().a(i);
        if (kp5VarA != null) {
            return kp5VarA.c;
        }
        return 0;
    }

    public static String c(int i) {
        Application app = AppUtil.getApp();
        if (i == 10) {
            return app.getString(kzi.d);
        }
        if (i == 11) {
            return app.getString(kzi.s);
        }
        if (i == 12) {
            return app.getString(kzi.f24450b);
        }
        if (i == 13) {
            return app.getString(kzi.q);
        }
        if (i == 14) {
            return app.getString(kzi.f1);
        }
        if (i == 15) {
            return app.getString(kzi.c);
        }
        if (i == 16) {
            return app.getString(kzi.f24452r);
        }
        if (i == 17) {
            return app.getString(kzi.u);
        }
        if (i == 18) {
            return app.getString(kzi.e);
        }
        if (i == 19) {
            return app.getString(kzi.t);
        }
        if (i == 9) {
            return app.getString(kzi.b1);
        }
        if (i == 26) {
            return app.getString(kzi.V);
        }
        if (i == 22) {
            return app.getString(kzi.I1);
        }
        if (i == 28) {
            return app.getString(kzi.D2);
        }
        if (i == 27) {
            return app.getString(kzi.j1);
        }
        if (i == 20) {
            return app.getString(kzi.R);
        }
        if (i == 24) {
            return app.getString(kzi.n2);
        }
        return i == 36 ? app.getString(kzi.w2) : d(app, i);
    }

    public static String d(Context context, int i) {
        try {
            return context.getString(e(i));
        } catch (Exception e) {
            Logger.e("DataSportType", "getSportTypeName exception:" + i, e);
            return "";
        }
    }

    public static int e(int i) {
        kp5 kp5VarA = jp5.c().a(i);
        if (kp5VarA != null) {
            return kp5VarA.f24128b;
        }
        return 0;
    }
}
