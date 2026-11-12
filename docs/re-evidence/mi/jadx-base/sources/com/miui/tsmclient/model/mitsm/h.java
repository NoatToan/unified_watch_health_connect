package com.miui.tsmclient.model.mitsm;

import com.miui.tsmclient.model.ErrorCode;

/* JADX INFO: loaded from: classes6.dex */
public class h {
    public static final int A = 10074;
    public static final int B = 10076;
    public static final int C = 10080;
    public static final int D = 4009;
    public static final int E = 4014;
    public static final int F = 1002001;
    public static final int G = 10003;
    public static final int H = 1126;
    public static final int I = 1130;
    public static final int J = 1133;
    public static final int K = 1134;
    public static final int L = 1135;
    public static final int M = 1136;
    public static final int N = 1137;
    public static final int O = 1138;
    public static final int P = 1139;
    public static final int Q = 1140;
    public static final int R = 1141;
    public static final int S = 90020;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f10381a = 1000000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10382b = 0;
    public static final int c = 3317;
    public static final int d = 3601;
    public static final int e = 3602;
    public static final int f = 3603;
    public static final int g = 3604;
    public static final int h = 3605;
    public static final int i = 3608;
    public static final int j = 3609;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f10383k = 3610;
    public static final int l = 3611;
    public static final int m = 3612;
    public static final int n = 3613;
    public static final int o = 3614;
    public static final int p = 3617;
    public static final int q = 3619;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f10384r = 3106;
    public static final int s = 3606;
    public static final int t = 3616;
    public static final int u = 3618;
    public static final int v = 10014;
    public static final int w = 10048;
    public static final int x = 10049;
    public static final int y = 10050;
    public static final int z = 10073;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(int i2) {
        if (i2 != 10073 && i2 != 10074) {
            switch (i2) {
                case 0:
                    return 0;
                case H /* 1126 */:
                    return 205;
                case I /* 1130 */:
                    return 1004;
                case J /* 1133 */:
                    return 1012;
                case f10384r /* 3106 */:
                    return ErrorCode.NULL_KEY_INFOMATION;
                case c /* 3317 */:
                case D /* 4009 */:
                    return ErrorCode.FPAN_DUPLICATED_APPLY;
                case E /* 4014 */:
                case v /* 10014 */:
                    return ErrorCode.BANK_CARD_NOT_SUPPORTED;
                case 10003:
                    return ErrorCode.BANK_SYSTEM_BUSYING;
                case B /* 10076 */:
                case C /* 10080 */:
                    break;
                case 90020:
                    return 90020;
                case F /* 1002001 */:
                    return ErrorCode.BIND_CARD_APPLET_UPDATE;
                default:
                    switch (i2) {
                        case L /* 1135 */:
                            return 0;
                        case 1136:
                            return 1136;
                        case 1137:
                            return 1137;
                        case 1138:
                            return 1138;
                        case 1139:
                            return 1139;
                        case 1140:
                            return 1140;
                        case 1141:
                            return 1141;
                        default:
                            switch (i2) {
                                case d /* 3601 */:
                                    return ErrorCode.USER_IDENTITY_VERIFY_FAILED;
                                case e /* 3602 */:
                                    return 3001;
                                case f /* 3603 */:
                                    return ErrorCode.APPLY_TIMES_EXCEED_LIMIT;
                                case g /* 3604 */:
                                    return ErrorCode.USER_ACCOUNT_NOT_EXIST;
                                case h /* 3605 */:
                                    return ErrorCode.FAILED_TIME_EXCEED_LIMIT;
                                case s /* 3606 */:
                                    return ErrorCode.USER_ACCOUNT_NO_APPLY_PRIVILEGE;
                                default:
                                    switch (i2) {
                                        case i /* 3608 */:
                                            return ErrorCode.CARD_TYPE_ERROR;
                                        case j /* 3609 */:
                                            return 3002;
                                        case f10383k /* 3610 */:
                                            return 3003;
                                        case l /* 3611 */:
                                            return ErrorCode.USER_ACCOUNT_IN_BLANK_LIST;
                                        case m /* 3612 */:
                                            return 3004;
                                        case n /* 3613 */:
                                            return ErrorCode.OTP_INFO_REVERIFY;
                                        case o /* 3614 */:
                                            return 3005;
                                        default:
                                            switch (i2) {
                                                case t /* 3616 */:
                                                    return ErrorCode.USER_NO_APPLY_PRIVILEGE;
                                                case p /* 3617 */:
                                                    return ErrorCode.CARD_STATUS_ERROR;
                                                case u /* 3618 */:
                                                    return ErrorCode.RETRY_OR_CONTACT_CUSTOMER_SERVICE;
                                                case q /* 3619 */:
                                                    return ErrorCode.CONTACT_CUSTOMER_SERVICE;
                                                default:
                                                    switch (i2) {
                                                        case w /* 10048 */:
                                                            return ErrorCode.DATA_NOT_READY;
                                                        case x /* 10049 */:
                                                            return ErrorCode.TOTAL_APPLY_NUM_EXCEED_LIMIT;
                                                        case 10050:
                                                            break;
                                                        default:
                                                            return i2 + 1000000;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        return ErrorCode.DATA_NOT_READY;
    }
}
