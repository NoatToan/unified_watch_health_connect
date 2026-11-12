package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes4.dex */
public class cpd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f31235b = new HashMap();
    private static final String[] d;
    private static final String[] e;

    static {
        String[] strArr = {"PLAT-760", "HUME", "KANT", "THAL", "SOKR-790A", "DESC-250", "DESC-260", "DESC-270", "DESC-250S", "DESC-260S", "LOK-360", "GOET"};
        d = strArr;
        String[] strArr2 = {"OSCA-550", "OSCA-550A", "OSCA-550X", "OSCA-550AX", "HEGE-550", "HEGE-560", "HEGE-550B", "HEGE-560B"};
        e = strArr2;
        Arrays.stream(strArr).forEach(new Consumer() { // from class: cpa
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                cpd.f31235b.put("09C", (String) obj);
            }
        });
        Arrays.stream(strArr2).forEach(new Consumer() { // from class: coz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                cpd.f31235b.put("02E", (String) obj);
            }
        });
    }

    public static String d(String str) {
        String str2 = f31235b.get(str);
        return str2 == null ? "09C" : str2;
    }
}
