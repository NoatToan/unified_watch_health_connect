package com.xiaomi.hm.health.device.setting.vo;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0006\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/DeviceLanguageVo;", "", "", "component1", "Ljava/util/Locale;", "component2", "isSupport", "locale", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "()Z", "b", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "<init>", "(ZLjava/util/Locale;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeviceLanguageVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isSupport;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Locale locale;

    public DeviceLanguageVo(boolean z, @NotNull Locale locale) {
        this.isSupport = z;
        this.locale = locale;
    }

    public static /* synthetic */ DeviceLanguageVo copy$default(DeviceLanguageVo deviceLanguageVo, boolean z, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            z = deviceLanguageVo.isSupport;
        }
        if ((i & 2) != 0) {
            locale = deviceLanguageVo.locale;
        }
        return deviceLanguageVo.copy(z, locale);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSupport() {
        return this.isSupport;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    @NotNull
    public final DeviceLanguageVo copy(boolean isSupport, @NotNull Locale locale) {
        return new DeviceLanguageVo(isSupport, locale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceLanguageVo)) {
            return false;
        }
        DeviceLanguageVo deviceLanguageVo = (DeviceLanguageVo) other;
        return this.isSupport == deviceLanguageVo.isSupport && Intrinsics.areEqual(this.locale, deviceLanguageVo.locale);
    }

    @NotNull
    public final Locale getLocale() {
        return this.locale;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isSupport;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.locale.hashCode();
    }

    public final boolean isSupport() {
        return this.isSupport;
    }

    @NotNull
    public String toString() {
        return "DeviceLanguageVo(isSupport=" + this.isSupport + ", locale=" + this.locale + ")";
    }
}
