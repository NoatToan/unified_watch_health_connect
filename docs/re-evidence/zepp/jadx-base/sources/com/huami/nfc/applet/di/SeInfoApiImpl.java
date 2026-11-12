package com.huami.nfc.applet.di;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.applet.Hex;
import com.huami.nfc.applet.api.SeAppletApi;
import com.huami.nfc.applet.api.SeInfoApi;
import com.huami.nfc.base.PayResponse;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/nfc/applet/di/SeInfoApiImpl;", "Lcom/huami/nfc/applet/api/SeInfoApi;", "Lorg/koin/core/component/KoinComponent;", "", ParamKey.deviceSn, "Lcom/huami/nfc/base/PayResponse;", "c", "cplc", GoogleApiAvailabilityLight.a, "", HTTP.CONTENT_RANGE_BYTES, "e", "getClpcFromCache", "getCplc", "getSeId", "Lcom/huami/nfc/applet/di/CplcCache;", "a", "Lkotlin/Lazy;", "b", "()Lcom/huami/nfc/applet/di/CplcCache;", "cplcCached", "Lcom/huami/nfc/applet/api/SeAppletApi;", "()Lcom/huami/nfc/applet/api/SeAppletApi;", "api", "<init>", "()V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class SeInfoApiImpl implements SeInfoApi, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy cplcCached;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy api;

    /* JADX WARN: Multi-variable type inference failed */
    public SeInfoApiImpl() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.cplcCached = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<CplcCache>() { // from class: com.huami.nfc.applet.di.SeInfoApiImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.nfc.applet.di.CplcCache, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CplcCache invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(CplcCache.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.api = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<SeAppletApi>() { // from class: com.huami.nfc.applet.di.SeInfoApiImpl$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.nfc.applet.api.SeAppletApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SeAppletApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SeAppletApi.class), objArr2, objArr3);
            }
        });
    }

    private final SeAppletApi a() {
        return (SeAppletApi) this.api.getValue();
    }

    private final CplcCache b() {
        return (CplcCache) this.cplcCached.getValue();
    }

    private final PayResponse<String> c(String deviceSn) {
        String cplc = b().getCplc(deviceSn);
        if (!(cplc == null || cplc.length() == 0)) {
            return PayResponse.INSTANCE.success("从缓存中获取CPLC信息成功", cplc);
        }
        PayResponse<String> cplc2 = a().getCplc();
        if (!cplc2.isSuccessful()) {
            return cplc2;
        }
        b().putCplc(deviceSn, cplc2.getData());
        return cplc2;
    }

    private final String d(String cplc) {
        byte[] bArrHexStringToBytes = Hex.hexStringToBytes(cplc);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(e(bArrHexStringToBytes));
        Objects.requireNonNull(cplc, "null cannot be cast to non-null type java.lang.String");
        stringBuffer.append(cplc.substring(24, 36));
        return stringBuffer.toString().toUpperCase(Locale.ROOT);
    }

    private final String e(byte[] bytes) {
        try {
            return Hex.bytesToHexString(MessageDigest.getInstance("MD5").digest(bytes));
        } catch (Exception e) {
            throw new IllegalStateException("failed to calculate md5", e);
        }
    }

    @Override // com.huami.nfc.applet.api.SeInfoApi
    @NotNull
    public PayResponse<String> getClpcFromCache(@NotNull String deviceSn) {
        String cplc = b().getCplc(deviceSn);
        return cplc == null || cplc.length() == 0 ? PayResponse.INSTANCE.error(PayResponse.CODE_UNDEFINED, Intrinsics.stringPlus("从缓存中未找到CPLC信息，sn: ", deviceSn)) : PayResponse.INSTANCE.success("从缓存中获取CPLC信息成功", cplc);
    }

    @Override // com.huami.nfc.applet.api.SeInfoApi
    @NotNull
    public PayResponse<String> getCplc(@NotNull String deviceSn) {
        return c(deviceSn);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.nfc.applet.api.SeInfoApi
    @NotNull
    public PayResponse<String> getSeId(@NotNull String cplc) {
        if (!(cplc.length() == 0) && cplc.length() >= 84) {
            return PayResponse.INSTANCE.success("success", d(cplc));
        }
        return PayResponse.INSTANCE.success("cplc格式不合法。cplc不可为空且字符长度不应小于84，传入cplc为：" + cplc + (char) 12290, null);
    }
}
