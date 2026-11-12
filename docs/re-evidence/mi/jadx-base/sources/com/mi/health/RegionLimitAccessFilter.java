package com.mi.health;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import defpackage.t40;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/mi/health/RegionLimitAccessFilter;", "Lt40;", "", "context", SportRecordBundleKey.BUNDLE_PARAM_URI, "", "opt", "", "callPkg", "onAcceptAccess", "(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/String;)I", "<init>", "()V", "Companion", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RegionLimitAccessFilter implements t40 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "RegionLimitAccessFilter";

    @NotNull
    private static final String[] sAcceptRegions = {ServerConstants.NEW_CN_COUNTRY_CODE};

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\f"}, d2 = {"Lcom/mi/health/RegionLimitAccessFilter$Companion;", "", "<init>", "()V", "TAG", "", "sAcceptRegions", "", "[Ljava/lang/String;", "providerAccess", "", "context", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int providerAccess(@NotNull Object context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if ((!(context instanceof Context) || TextUtils.equals(((Context) context).getPackageName(), "com.mi.health")) && RomUtils.isXiaomi()) {
                SystemProperties systemProperties = SystemProperties.INSTANCE;
                String miuiRegion = systemProperties.getMiuiRegion(null);
                FitnessLogUtils.i(RegionLimitAccessFilter.TAG, "the miui.region is " + miuiRegion);
                if (miuiRegion == null) {
                    miuiRegion = systemProperties.getString("ro.product.locale.region", null);
                    FitnessLogUtils.i(RegionLimitAccessFilter.TAG, "the locale.region is " + miuiRegion);
                }
                if (miuiRegion == null && !systemProperties.isGlobalMiuiRom()) {
                    FitnessLogUtils.i(RegionLimitAccessFilter.TAG, "find internal rom,set region CN");
                    miuiRegion = ServerConstants.NEW_CN_COUNTRY_CODE;
                }
                if (miuiRegion != null && miuiRegion.length() != 0) {
                    String[] strArr = RegionLimitAccessFilter.sAcceptRegions;
                    String upperCase = miuiRegion.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    if (Arrays.binarySearch(strArr, upperCase) >= 0) {
                        return a.C0299a.f9965a;
                    }
                }
                return a.C0299a.d;
            }
            return a.C0299a.d;
        }
    }

    @Override // defpackage.t40
    public int onAcceptAccess(@NotNull Object context, @NotNull Object uri, int opt, @NotNull String callPkg) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(callPkg, "callPkg");
        return INSTANCE.providerAccess(context);
    }
}
