package com.xiaomi.fitness.repo.healthconnect.biz.sport;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/biz/sport/TypeConvert;", "", "<init>", "()V", "convertMiToHealthConnectType", "", "type", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TypeConvert {

    @NotNull
    public static final TypeConvert INSTANCE = new TypeConvert();

    private TypeConvert() {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d A[PHI: r1
      0x007d: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:13:0x0019, B:15:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x007f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0085 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9 A[RETURN, SYNTHETIC] */
    public final int convertMiToHealthConnectType(int type) {
        if (type == 300) {
            return 69;
        }
        if (type == 301) {
            return 68;
        }
        if (type == 305) {
            return 48;
        }
        if (type == 306) {
            return 34;
        }
        switch (type) {
            case 1:
            case 3:
                return 56;
            case 2:
                return 79;
            case 4:
            case 5:
                return 37;
            case 6:
                return 8;
            case 7:
                return 9;
            default:
                int i = 36;
                switch (type) {
                    case 9:
                        return 74;
                    case 10:
                        return 73;
                    case 11:
                        return 25;
                    case 12:
                        return 83;
                    case 13:
                        return 54;
                    case 14:
                    case 16:
                        return i;
                    case 15:
                        return 37;
                    default:
                        i = 5;
                        switch (type) {
                            case 19:
                            case 601:
                                return i;
                            case 21:
                                return 61;
                            case 104:
                            case 114:
                                return 72;
                            case 107:
                                return 53;
                            case 200:
                            case 1000:
                            case 1001:
                                return 51;
                            case 303:
                            case 308:
                                return 70;
                            case 315:
                                return 81;
                            case 333:
                                return 79;
                            case 400:
                            case 401:
                            case 402:
                            case 403:
                            case 404:
                            case 405:
                            case 406:
                            case 407:
                            case 408:
                            case 409:
                            case 410:
                            case 411:
                            case 412:
                                return 16;
                            case 602:
                                return 78;
                            case 603:
                                return 4;
                            case 604:
                                return 65;
                            case 605:
                                return 55;
                            case 606:
                                return 38;
                            case 607:
                                return 75;
                            case 608:
                                return 2;
                            case 609:
                                return 76;
                            case 610:
                                return 14;
                            case 611:
                                return 35;
                            case 613:
                                return 66;
                            case 700:
                            case 708:
                            case 709:
                                return 60;
                            case 702:
                                return 63;
                            case 10001:
                                return 56;
                            default:
                                switch (type) {
                                    case 100:
                                    case 101:
                                        return 58;
                                    case 102:
                                        return 80;
                                    default:
                                        switch (type) {
                                            case 109:
                                            case 111:
                                                return 74;
                                            case 110:
                                            case 112:
                                                return 59;
                                            default:
                                                switch (type) {
                                                    case 205:
                                                        return 47;
                                                    case 206:
                                                        return 8;
                                                    case 207:
                                                        return 79;
                                                    default:
                                                        switch (type) {
                                                            case 320:
                                                            case 321:
                                                            case 322:
                                                            case 323:
                                                                return 70;
                                                            default:
                                                                switch (type) {
                                                                    case 499:
                                                                        return 16;
                                                                    case 500:
                                                                        return 11;
                                                                    case 501:
                                                                    case 502:
                                                                    case 503:
                                                                    case 504:
                                                                    case 505:
                                                                    case 506:
                                                                    case 507:
                                                                    case 508:
                                                                    case 509:
                                                                    case 511:
                                                                        return 44;
                                                                    case 510:
                                                                        return 27;
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
