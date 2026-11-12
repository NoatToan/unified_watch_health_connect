package com.huami.ai.speech.simplify.auth;

import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.IDeviceTokenConfig;
import com.huami.ai.speech.api.KoinHelperKt;
import com.huami.passport.entity.TpaConfig;
import com.huami.passport.utils.Utils;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010$\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000eR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000eR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000eR)\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\r\u0010$R\"\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/huami/ai/speech/simplify/auth/DeviceTokenManager;", "Lcom/huami/account/IDeviceTokenConfig;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "b", "", "", "isSupportDeviceToken", "deviceSource", "getTpacProvider", "getSecret", "getClientId", "a", "Ljava/lang/String;", "TOKEN_TYPE_OSPREY", "TOKEN_TYPE_LISBON", "c", "TOKEN_TYPE_LINCS", GoogleApiAvailabilityLight.a, "TOKEN_TYPE_NEWTON", "e", "TOKEN_TYPE_PRAGUE", "f", "TOKEN_TYPE_COMO", "g", "TOKEN_TYPE_NESS", "h", "TOKEN_TYPE_BONN", "i", "TOKEN_TYPE_HAMBURG", z.j, "TOKEN_TYPE_VOLGA", "", hl.k, "Lkotlin/Lazy;", "()Ljava/util/Map;", "clientIdCache", "l", "Ljava/util/Map;", "DEVICE_TOKEN_TPAC", "<init>", "()V", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceTokenManager implements IDeviceTokenConfig {

    @NotNull
    public static final DeviceTokenManager INSTANCE = new DeviceTokenManager();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private static final Lazy clientIdCache = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TOKEN_TYPE_OSPREY = "osprey";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String TOKEN_TYPE_LISBON = "lisbon";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String TOKEN_TYPE_LINCS = "lincs";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String TOKEN_TYPE_NEWTON = "newton";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String TOKEN_TYPE_PRAGUE = "prague";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String TOKEN_TYPE_COMO = "como";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String TOKEN_TYPE_NESS = "ness";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final String TOKEN_TYPE_BONN = "bonn";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final String TOKEN_TYPE_HAMBURG = "hamburg";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final String TOKEN_TYPE_VOLGA = "volga";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private static final Map<HMDeviceSource, String> DEVICE_TOKEN_TPAC = r.mapOf(TuplesKt.to(HMDeviceSource.MILI_OSPREY, TOKEN_TYPE_OSPREY), TuplesKt.to(HMDeviceSource.MILI_OSPREY_C, TOKEN_TYPE_OSPREY), TuplesKt.to(HMDeviceSource.MILI_LISBON, TOKEN_TYPE_LISBON), TuplesKt.to(HMDeviceSource.MILI_LINCS, TOKEN_TYPE_LINCS), TuplesKt.to(HMDeviceSource.MILI_NEWTON, TOKEN_TYPE_NEWTON), TuplesKt.to(HMDeviceSource.MILI_PRAGUE, TOKEN_TYPE_PRAGUE), TuplesKt.to(HMDeviceSource.MILI_COMO, TOKEN_TYPE_COMO), TuplesKt.to(HMDeviceSource.MILI_COMO_L, TOKEN_TYPE_COMO), TuplesKt.to(HMDeviceSource.MILI_NESS, TOKEN_TYPE_NESS), TuplesKt.to(HMDeviceSource.MILI_NESS_L, TOKEN_TYPE_NESS), TuplesKt.to(HMDeviceSource.MILI_BONN, TOKEN_TYPE_BONN), TuplesKt.to(HMDeviceSource.MILI_HAMBURG, TOKEN_TYPE_HAMBURG), TuplesKt.to(HMDeviceSource.MILI_VOLGA, TOKEN_TYPE_VOLGA));

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_KONGMING.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_KONGMING_PRO.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_OSPREY.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_OSPREY_C.ordinal()] = 4;
            iArr[HMDeviceSource.MILI_LISBON.ordinal()] = 5;
            iArr[HMDeviceSource.MILI_LINCS.ordinal()] = 6;
            iArr[HMDeviceSource.MILI_NEWTON.ordinal()] = 7;
            iArr[HMDeviceSource.MILI_PRAGUE.ordinal()] = 8;
            iArr[HMDeviceSource.MILI_COMO.ordinal()] = 9;
            iArr[HMDeviceSource.MILI_COMO_L.ordinal()] = 10;
            iArr[HMDeviceSource.MILI_NESS.ordinal()] = 11;
            iArr[HMDeviceSource.MILI_NESS_L.ordinal()] = 12;
            iArr[HMDeviceSource.MILI_BONN.ordinal()] = 13;
            iArr[HMDeviceSource.MILI_HAMBURG.ordinal()] = 14;
            iArr[HMDeviceSource.MILI_VOLGA.ordinal()] = 15;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Map<HMDeviceSource, ? extends String>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<HMDeviceSource, ? extends String> invoke() {
            Set<HMDeviceSource> setKeySet = DeviceTokenManager.DEVICE_TOKEN_TPAC.keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setKeySet, 10));
            for (HMDeviceSource hMDeviceSource : setKeySet) {
                arrayList.add(TuplesKt.to(hMDeviceSource, DeviceTokenManager.INSTANCE.b(hMDeviceSource)));
            }
            return r.toMap(arrayList);
        }
    }

    private DeviceTokenManager() {
    }

    private final Map<HMDeviceSource, String> a() {
        return (Map) clientIdCache.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b(HMDeviceSource source) {
        TpaConfig tpaConfig;
        String appId;
        return (source == null || (tpaConfig = Utils.getTpaConfigs((Context) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null)).get(getTpacProvider(source))) == null || (appId = tpaConfig.getAppId()) == null) ? "" : appId;
    }

    @Override // com.huami.account.IDeviceTokenConfig
    @NotNull
    public String getClientId(int source) {
        String str = a().get(HMDeviceSource.fromValue(source));
        return str == null ? "" : str;
    }

    @Override // com.huami.account.IDeviceTokenConfig
    @NotNull
    public String getSecret(int source) {
        return getSecret(HMDeviceSource.fromValue(source));
    }

    @Override // com.huami.account.IDeviceTokenConfig
    @Nullable
    public String getTpacProvider(int source) {
        return DEVICE_TOKEN_TPAC.get(HMDeviceSource.fromValue(source));
    }

    @Override // com.huami.account.IDeviceTokenConfig
    public boolean isSupportDeviceToken(int source) {
        return DEVICE_TOKEN_TPAC.keySet().contains(HMDeviceSource.fromValue(source));
    }

    @NotNull
    public final String getClientId(@Nullable HMDeviceSource source) {
        return source == null ? "" : getClientId(source.getValue());
    }

    @NotNull
    public final String getSecret(@Nullable HMDeviceSource source) {
        switch (source == null ? -1 : WhenMappings.$EnumSwitchMapping$0[source.ordinal()]) {
            case 1:
            case 2:
                return "ik34K2UkjyAh5DfeVn-4zcOsHDFiMZXwGmix1fec33AykCgrky3UPLbBCVUTCKe6F0O5N11zeBCUh5zyBTNZVA";
            case 3:
            case 4:
                return "mh0ZedHKxMN2EAgtV6MOK8KNv4oNXqSUnZcivJrsGOC5paaPEGh_sYKs7Z5LiCH3EJtjBEyzsiYGBIBEOCq5_Q";
            case 5:
                return "l-kJn4NVME60Qwd584xVnaCfXj09H0xiQPE2EJs_PF477jr7NXH7y3vqFnHdLw66urtyg3e9OljUO-Nx-eHT1w";
            case 6:
                return "oG8ui4eOPj0qYpmrGdGFsPWz5echhv-7IXne1XEeYtrq5PjqaPVaYbeo6Ixv8YcbJaxWK4SavOsyp-hndlV8kg";
            case 7:
                return "vhRQAY52r6Nktymu5RURWbHCoXl81qYfIC6DqyqMD3ClnkPJfnJkwLVvHrG_aaQl4xR38MDPDpbippJp0DfTkw";
            case 8:
                return "jXTORxmDSDNqfbbjGEV5oLH1zFY3h4e_46KLyedgbe_t4bNBNupDra1JWH3_4wwon8ZbDG__MR10qjnZv4X-nw";
            case 9:
            case 10:
                return "5-ofiL0oEswA0qUSX8o5h42_ZfDGZ6vH8aLSarIyYnh7IDH4nVly4I5tirXz4axznxIB9FtS_t7MuEifxy-W_Q";
            case 11:
            case 12:
                return "GH2dy2MV-rAH0gOSfICI4KO2BNLYgr7mmht_3wmZ3A90nc1EqPdtT4qQVdm7Ik4wyg3CtMmsVbzNGJ2Glwl-ag";
            case 13:
                return "AH43EgYm4z1arJJuFe41YQ_IFxAtWP4eFuA7nWCylvgsboaodYUBIFMd8IeaV6gDQF4tMVKvOSWBeS94kzFr8w";
            case 14:
                return "rxiXgObCuCIaTkIw4xfvxKdTKrWVjUXNORzxizjDmdB-YYLs6aCnLzOdooIdD3TZtxTSTO0kxPqdQaKu_bnjHw";
            case 15:
                return "bNqZsXEY9FIne1unNfTw7md08v8oht4MLWCS-iLDkzsxkfqXP56Q3eziHmDIkEJY_0mbwA-N2Ivas17iC24kYA";
            default:
                return "";
        }
    }

    @Nullable
    public final String getTpacProvider(@Nullable HMDeviceSource source) {
        if (source == null) {
            return null;
        }
        return DEVICE_TOKEN_TPAC.get(source);
    }

    public final boolean isSupportDeviceToken(@Nullable HMDeviceSource deviceSource) {
        if (deviceSource == null) {
            return false;
        }
        return isSupportDeviceToken(deviceSource.getValue());
    }
}
