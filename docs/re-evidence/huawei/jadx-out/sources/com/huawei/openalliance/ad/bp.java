package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes12.dex */
public abstract class bp {
    public static int a(int i) {
        if (i == -1) {
            return 1006;
        }
        if (i == 200) {
            return 1000;
        }
        if (i == 204) {
            return 1005;
        }
        if (i == 496) {
            return 1007;
        }
        if (i != 498 && i != 804) {
            if (i == 704) {
                return 1008;
            }
            if (i == 705) {
                return 1009;
            }
            if (i == 801) {
                return 1004;
            }
            if (i == 802) {
                return 1003;
            }
            if (i != 1000) {
                if (i == 1001) {
                    return 1002;
                }
                if (i == 1100) {
                    return 1005;
                }
                if (i == 1101) {
                    return 1004;
                }
                switch (i) {
                    case 700:
                        return 1005;
                    case 701:
                        return 1004;
                    case 702:
                        return 1003;
                    default:
                        switch (i) {
                            case 900:
                                return 1005;
                            case 901:
                                return 1004;
                            case 902:
                                return 1003;
                            default:
                                return 1010;
                        }
                }
            }
        }
        return 1001;
    }
}
