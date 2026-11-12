package com.huami.watch.companion.util;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.speech.simplify.engine.XiaoAiConfigConstantsKt;
import com.huami.passport.entity.TpaConfig;
import com.huami.passport.utils.Utils;
import com.huami.tools.analytics.DbUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b)\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b9\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0007R\u0016\u0010\r\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R#\u0010\u001b\u001a\u00020\u00118F@\u0007X\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001f\u001a\u00020\u00118F@\u0007X\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\u0018R#\u0010$\u001a\u00020\u00078F@\u0007X\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b \u0010\u0016\u0012\u0004\b#\u0010\u001a\u001a\u0004\b!\u0010\"R#\u0010(\u001a\u00020\u00078F@\u0007X\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0016\u0012\u0004\b'\u0010\u001a\u001a\u0004\b&\u0010\"R\u0016\u0010*\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\fR\u0016\u0010,\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\fR\u001c\u0010/\u001a\u00020\u00078F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001a\u001a\u0004\b-\u0010\"R\u001c\u00102\u001a\u00020\u00078F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010\u001a\u001a\u0004\b0\u0010\"R\u001c\u00105\u001a\u00020\u00078F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010\u001a\u001a\u0004\b3\u0010\"R\u001c\u00108\u001a\u00020\u00078F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b7\u0010\u001a\u001a\u0004\b6\u0010\"¨\u0006:"}, d2 = {"Lcom/huami/watch/companion/util/ThirdPartUtil;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", PointCategory.INIT, "checkConfigs", "", "provider", "a", "productFlavor", "getQqAppId", "Ljava/lang/String;", "PROD_ZEPP", "b", "PROD_AMAZFIT", "", "Lcom/huami/passport/entity/TpaConfig;", "c", "Ljava/util/Map;", "tpaConfigs", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "getXiaomi", "()Lcom/huami/passport/entity/TpaConfig;", "getXiaomi$annotations", "()V", "xiaomi", "e", "getWeixin", "getWeixin$annotations", "weixin", "f", "getXiaomiId", "()Ljava/lang/String;", "getXiaomiId$annotations", "xiaomiId", "g", "getWeixinId", "getWeixinId$annotations", "weixinId", "h", "ZEPP_XIAOMI_APP_ID", "i", "NEW_AMAZFIT_APP_ID", "getXiaomiKey", "getXiaomiKey$annotations", "xiaomiKey", "getClientSecret", "getClientSecret$annotations", "clientSecret", "getSignSecret", "getSignSecret$annotations", "signSecret", "getNewApiKey", "getNewApiKey$annotations", "newApiKey", "<init>", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class ThirdPartUtil {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String PROD_ZEPP = "midong";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PROD_AMAZFIT = "amazfit";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static Map<String, TpaConfig> tpaConfigs = null;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final String ZEPP_XIAOMI_APP_ID = "2882303761517383915";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final String NEW_AMAZFIT_APP_ID = "2882303761518418516";

    @NotNull
    public static final ThirdPartUtil INSTANCE = new ThirdPartUtil();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy xiaomi = LazyKt__LazyJVMKt.lazy(d.a);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy weixin = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final Lazy xiaomiId = LazyKt__LazyJVMKt.lazy(e.a);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final Lazy weixinId = LazyKt__LazyJVMKt.lazy(c.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/huami/watch/companion/util/ThirdPartUtil$a", "Ljava/lang/RuntimeException;", "", "name", "<init>", "(Ljava/lang/String;)V", "companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends RuntimeException {
        public a(@NotNull String str) {
            super("三方配置缺失：" + str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/passport/entity/TpaConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<TpaConfig> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TpaConfig invoke() {
            Map map = ThirdPartUtil.tpaConfigs;
            if (map == null) {
                map = null;
            }
            return (TpaConfig) map.get("wechat");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return ThirdPartUtil.getWeixin().getAppId();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/passport/entity/TpaConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<TpaConfig> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TpaConfig invoke() {
            Map map = ThirdPartUtil.tpaConfigs;
            if (map == null) {
                map = null;
            }
            return (TpaConfig) map.get("xiaomi");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return ThirdPartUtil.getXiaomi().getAppId();
        }
    }

    private ThirdPartUtil() {
    }

    private final void a(String provider) {
        Map<String, TpaConfig> map = tpaConfigs;
        if (map == null) {
            map = null;
        }
        if (map.get(provider) == null) {
            throw new a(provider);
        }
    }

    @JvmStatic
    public static final void checkConfigs() {
    }

    @NotNull
    public static final String getClientSecret() {
        String xiaomiId2 = getXiaomiId();
        if (Intrinsics.areEqual(xiaomiId2, "2882303761517383915")) {
            return XiaoAiConfigConstantsKt.CLIENT_SECRET;
        }
        return Intrinsics.areEqual(xiaomiId2, NEW_AMAZFIT_APP_ID) ? "mqmikiPghM0cDLVcV2P8Vg==" : "";
    }

    @JvmStatic
    public static /* synthetic */ void getClientSecret$annotations() {
    }

    @NotNull
    public static final String getNewApiKey() {
        String xiaomiId2 = getXiaomiId();
        if (Intrinsics.areEqual(xiaomiId2, "2882303761517383915")) {
            return "GtvXmWckw90WsjnAXNucOkfe09g_xD1ac_nZ4xExqbY";
        }
        return Intrinsics.areEqual(xiaomiId2, NEW_AMAZFIT_APP_ID) ? "RBOurxar5Hmz9rdI_3jyip-Z7ys9Ye9AE2zw_PiGqCo" : "";
    }

    @JvmStatic
    public static /* synthetic */ void getNewApiKey$annotations() {
    }

    @JvmStatic
    @NotNull
    public static final String getQqAppId(@NotNull String productFlavor) {
        if (Intrinsics.areEqual(productFlavor, "midong")) {
            return "1105651418";
        }
        return Intrinsics.areEqual(productFlavor, "amazfit") ? "101884189" : "";
    }

    @NotNull
    public static final String getSignSecret() {
        String xiaomiId2 = getXiaomiId();
        if (Intrinsics.areEqual(xiaomiId2, "2882303761517383915")) {
            return "x4qKcSNuDayvUYNEwFjsHx9AYQdn6NDW_By6sKUFlHYTwvZ5L4j0bLiQjwnkHRvdY90He6Oha6XL3CdbWcaqlg";
        }
        return Intrinsics.areEqual(xiaomiId2, NEW_AMAZFIT_APP_ID) ? "Iix7i0OdLsBfrUog8Mp9AhyvXuMNjFYzq9kOql4f2Vx7sVnzo2-Ounwc8oBb59lO_QqKx-bzn0ejOzEzoCzroA" : "";
    }

    @JvmStatic
    public static /* synthetic */ void getSignSecret$annotations() {
    }

    @NotNull
    public static final TpaConfig getWeixin() {
        return (TpaConfig) weixin.getValue();
    }

    @JvmStatic
    public static /* synthetic */ void getWeixin$annotations() {
    }

    @NotNull
    public static final String getWeixinId() {
        return (String) weixinId.getValue();
    }

    @JvmStatic
    public static /* synthetic */ void getWeixinId$annotations() {
    }

    @NotNull
    public static final TpaConfig getXiaomi() {
        return (TpaConfig) xiaomi.getValue();
    }

    @JvmStatic
    public static /* synthetic */ void getXiaomi$annotations() {
    }

    @NotNull
    public static final String getXiaomiId() {
        return (String) xiaomiId.getValue();
    }

    @JvmStatic
    public static /* synthetic */ void getXiaomiId$annotations() {
    }

    @NotNull
    public static final String getXiaomiKey() {
        String xiaomiId2 = getXiaomiId();
        if (Intrinsics.areEqual(xiaomiId2, "2882303761517383915")) {
            return "5731738397915";
        }
        return Intrinsics.areEqual(xiaomiId2, NEW_AMAZFIT_APP_ID) ? "5751841837516" : "";
    }

    @JvmStatic
    public static /* synthetic */ void getXiaomiKey$annotations() {
    }

    @JvmStatic
    public static final void init(@NotNull Context context) {
        tpaConfigs = Utils.getTpaConfigs(context);
    }
}
