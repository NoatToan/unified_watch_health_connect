package df0;

import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldf0/c;", "", "<init>", "()V", "gcm-domain-heartrate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f59441a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<Integer> f59442b = j0.f134944a;

    private c() {
    }

    public static int a(Integer num) {
        List<Integer> list = f59442b;
        if (num != null && list != null && !list.isEmpty()) {
            int iIntValue = num.intValue();
            Integer num2 = list.get(0);
            if (iIntValue <= (num2 != null ? num2.intValue() : -1)) {
                return 0;
            }
            if (list.size() > 1) {
                int iIntValue2 = num.intValue();
                Integer num3 = list.get(1);
                if (iIntValue2 <= (num3 != null ? num3.intValue() : -1)) {
                    return 1;
                }
            }
            if (list.size() > 2) {
                int iIntValue3 = num.intValue();
                Integer num4 = list.get(2);
                if (iIntValue3 <= (num4 != null ? num4.intValue() : -1)) {
                    return 2;
                }
            }
            if (list.size() > 3) {
                int iIntValue4 = num.intValue();
                Integer num5 = list.get(3);
                if (iIntValue4 <= (num5 != null ? num5.intValue() : -1)) {
                    return 3;
                }
            }
            if (list.size() > 4) {
                int iIntValue5 = num.intValue();
                Integer num6 = list.get(4);
                if (iIntValue5 <= (num6 != null ? num6.intValue() : -1)) {
                    return 4;
                }
            }
            if (list.size() > 5) {
                int iIntValue6 = num.intValue();
                Integer num7 = list.get(4);
                if (iIntValue6 > (num7 != null ? num7.intValue() : -1)) {
                    return 5;
                }
            }
        }
        return -1;
    }
}
