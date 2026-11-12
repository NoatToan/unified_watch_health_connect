package ml2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UUID f119394a = UUID.fromString("6A4E2800-667B-11E3-949A-0800200C9A66");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UUID f119395b = UUID.fromString("6A4E2803-667B-11E3-949A-0800200C9A66");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f119396c = new ArrayList(Arrays.asList(Integer.valueOf(q.GFDI.f119440a), Integer.valueOf(q.NFC.f119440a)));

    public static String a(String str, String str2, Object obj) {
        StringBuilder sb3 = new StringBuilder("ML#");
        sb3.append(str);
        if (obj != null) {
            sb3.append("@");
            sb3.append(Long.toHexString(obj.hashCode()));
        }
        if (str2 != null && !str2.isEmpty()) {
            am.j.y(sb3, " [", str2, "]");
        }
        return sb3.toString();
    }
}
