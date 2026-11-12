package defpackage;

import com.huawei.hms.network.embedded.r1;
import org.eclipse.californium.core.coap.OptionNumberRegistry;
import org.eclipse.californium.core.coap.option.OptionRegistry;

/* JADX INFO: loaded from: classes20.dex */
public class zvo extends zvm {
    private static volatile OptionRegistry ab;
    public static final zvl i = new zvl(1, "If-Match", false, 0, 8);
    public static final zvs w = new zvs(3, "Uri-Host", true, 1, 255);
    public static final zvl f = new zvl(4, "ETag", false, 1, 8);
    public static final zvj g = new zvj(5, r1.b.n);
    public static final zvk aa = new zvk(7, "Uri-Port", true, 0, 2);
    public static final zvs j = new zvs(8, "Location-Path", false, 0, 255);
    public static final zvs u = new zvs(11, "Uri-Path", false, 0, 255);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zvk f54623c = new zvk(12, "Content-Format", true, 0, 2);
    public static final zvk o = new zvk(14, "Max-Age", true, 0, 4);
    public static final zvs z = new zvs(15, "Uri-Query", false, 0, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zvk f54622b = new zvk(17, "Accept", true, 0, 2);
    public static final zvk s = new zvk(19, "Q-Block-1", true, 0, 3);
    public static final zvs n = new zvs(20, "Location-Query", false, 0, 255);
    public static final zvs r = new zvs(35, "Proxy-Uri", true, 1, 1034);
    public static final zvs t = new zvs(39, "Proxy-Scheme", true, 1, 255);
    public static final zvk v = new zvk(60, "Size1", true, 0, 4);
    public static final zvk m = new zvk(6, "Observe", true, 0, 3);
    public static final zvk d = new zvk(27, "Block1", true, 0, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zvk f54621a = new zvk(23, "Block2", true, 0, 3);
    public static final zvk y = new zvk(28, "Size2", true, 0, 4);
    public static final zvk q = new zvk(31, "Q-Block-2", false, 0, 3);
    public static final zvl l = new zvl(9, "Object-Security", true, 0, 255);
    public static final zvl h = new zvl(252, "Echo", true, 1, 40);
    public static final zvk k = new zvk(258, "No-Response", true, 0, 1);
    public static final zvl p = new zvl(292, "Request-Tag", false, 0, 8);
    public static final OptionRegistry x = new zvo();

    static {
        c(null);
    }

    private zvo() {
        super(i, w, f, g, aa, j, u, f54623c, o, z, f54622b, s, n, r, t, v, m, d, f54621a, y, q, l, h, k, p);
    }

    public static OptionRegistry a() {
        return ab;
    }

    public static OptionRegistry c(OptionRegistry optionRegistry) {
        OptionRegistry optionRegistry2 = ab;
        if (optionRegistry == null) {
            ab = new zvn(true, OptionNumberRegistry.a(), x);
            return optionRegistry2;
        }
        ab = optionRegistry;
        return optionRegistry2;
    }
}
