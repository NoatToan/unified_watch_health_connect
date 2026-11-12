package com.xiaomi.hm.health.opensdk;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.collections.x;
import kotlin.collections.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010$\n\u0002\b\u0004\u001a\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\u0016\u0010\b\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0016\u0010\r\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007\"\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\n\"\u0016\u0010\u0011\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007\"\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\n\"\u0016\u0010\u0015\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007\"\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\n\"\u0016\u0010\u0019\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007\"\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\n\"\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\n\"\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\n\"(\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00020 8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010!\"(\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020 8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010!¨\u0006$"}, d2 = {"", "key", "", "getSignatureListByKey", "", "getPermissionGroupByKey", "a", "Ljava/lang/String;", "KEY_LNT", "b", "Ljava/util/Set;", "SIGNATURE_LNT", "c", "KEY_SHANGHAI", GoogleApiAvailabilityLight.a, "SIGNATURE_SHANGHAI", "e", "KEY_HUAMIPAY", "f", "SIGNATURE_HUAMIPAY", "g", "KEY_WALLET_DOOR", "h", "SIGNATURE_WALLET_DOOR", "i", "KEY_WALLET_BUS", z.j, "SIGNATURE_WALLET_BUS", hl.k, "PERMISSION_GROUP_OPEN_NFC", "l", "PERMISSION_GROUP_OPEN_ALL", "", "()Ljava/util/Map;", "SIGNATURE_GROUP", "PERMISSION_GROUP", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class ServicePermissionKt {

    @NotNull
    private static final String a = "com.lingnanpass";

    @NotNull
    private static final String c = "com.jiuyu.sptcc.cordova";

    @NotNull
    private static final String e = "com.huami.android.huamipay";

    @NotNull
    private static final String g = "com.example.accessdoordemo";

    @NotNull
    private static final String i = "com.huami.wallet.app";

    @NotNull
    private static final Set<String> b = x.setOf("4E:0F:B4:EE:CD:E0:0D:02:8D:BF:EC:CE:DE:FC:8F:98:69:80:B9:9D");

    @NotNull
    private static final Set<String> d = x.setOf("8B:0D:A2:81:EB:C8:AA:E7:1F:B0:7C:97:DA:FB:25:F0:42:AF:8C:22");

    @NotNull
    private static final Set<String> f = x.setOf("AB:AA:55:F9:3A:AE:16:5C:54:86:15:27:5B:3A:6E:28:78:93:F3:9A");

    @NotNull
    private static final Set<String> h = x.setOf("AB:AA:55:F9:3A:AE:16:5C:54:86:15:27:5B:3A:6E:28:78:93:F3:9A");

    @NotNull
    private static final Set<String> j = x.setOf("AB:AA:55:F9:3A:AE:16:5C:54:86:15:27:5B:3A:6E:28:78:93:F3:9A");

    @NotNull
    private static final Set<Integer> k = y.setOf((Object[]) new Integer[]{11, 13, 12});

    @NotNull
    private static final Set<Integer> l = y.setOf((Object[]) new Integer[]{1, 2, 4, 3, 5, 6, 7, 8, 9, 10, 11, 13, 12});

    private static final Map<String, Set<Integer>> a() {
        Set<Integer> set = k;
        Set<Integer> set2 = l;
        return r.mapOf(TuplesKt.to(a, set), TuplesKt.to(c, set), TuplesKt.to(e, set2), TuplesKt.to(g, set2), TuplesKt.to(i, set2));
    }

    private static final Map<String, Set<String>> b() {
        return r.mapOf(TuplesKt.to(c, d), TuplesKt.to(e, f), TuplesKt.to(g, h), TuplesKt.to(i, j), TuplesKt.to(a, b));
    }

    @NotNull
    public static final Set<Integer> getPermissionGroupByKey(@NotNull String str) {
        Set<Integer> set = a().get(str);
        return set == null ? y.emptySet() : set;
    }

    @NotNull
    public static final Set<String> getSignatureListByKey(@NotNull String str) {
        Set<String> set = b().get(str);
        return set == null ? y.emptySet() : set;
    }
}
