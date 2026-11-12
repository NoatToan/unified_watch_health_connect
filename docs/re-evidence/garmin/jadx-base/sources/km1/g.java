package km1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkm1/g;", "", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f105523a = new g();

    private g() {
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -800008479:
                return str.equals("GENERAL_NEG_FAIR_OR_POOR_SLEEP");
            case 625842214:
                return str.equals("GENERAL_POS_EXCELLENT_OR_GOOD_SLEEP");
            case 921431965:
                return str.equals("GENERAL_POS_FAIR_OR_POOR_SLEEP");
            case 1844091746:
                return str.equals("GENERAL_NEG_EXCELLENT_OR_GOOD_SLEEP");
            default:
                return false;
        }
    }
}
