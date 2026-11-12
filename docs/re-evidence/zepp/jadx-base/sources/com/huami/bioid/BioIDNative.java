package com.huami.bioid;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.algo.healthcare.HealthCare;
import com.huami.ecg.core.util.AssetsUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J*\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ3\u0010\r\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/huami/bioid/BioIDNative;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/Pair;", "", "a", "Lcom/huami/algo/healthcare/HealthCare;", "healthcare", "", "srcUvData", "matchedUvData", "", "authenticate", "srcRawPath", "matchedRawPath", "", "authenticate$ecg_core_release", "(Landroid/content/Context;Lcom/huami/algo/healthcare/HealthCare;Ljava/lang/String;Ljava/lang/String;)Z", "Ljava/lang/String;", "TAG", "b", "BAYESIAN_MODEL_ASSETS_FILE", "c", "BAYESIAN_MODEL_INTERNAL_FILE", GoogleApiAvailabilityLight.a, "CART_MODEL_ASSETS_FILE", "e", "CART_MODEL_INTERNAL_FILE", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class BioIDNative {
    public static final BioIDNative INSTANCE = new BioIDNative();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = "BioIDNative";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String BAYESIAN_MODEL_ASSETS_FILE = "health/BayesianModel_v1.model";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String BAYESIAN_MODEL_INTERNAL_FILE = "BayesianModel_v1.bio";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String CART_MODEL_ASSETS_FILE = "health/CARTModel_v2.md";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final String CART_MODEL_INTERNAL_FILE = "CARTModel_v2.bio";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ HealthCare b;
        public final /* synthetic */ double[] c;
        public final /* synthetic */ double[] d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, HealthCare healthCare, double[] dArr, double[] dArr2) {
            super(0);
            this.a = z;
            this.b = healthCare;
            this.c = dArr;
            this.d = dArr2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "BioIDNative verified:" + this.a + ",BIOID_SIGNAL_QUALITY:" + this.b.ecg_flag.BIOID_SIGNAL_QUALITY + ",1:" + this.c.length + ",2:" + this.d.length;
        }
    }

    private BioIDNative() {
    }

    private final Pair<String, String> a(Context context) {
        AssetsUtils assetsUtils = AssetsUtils.INSTANCE;
        String strCopyAsset2Internal = assetsUtils.copyAsset2Internal(context, BAYESIAN_MODEL_ASSETS_FILE, BAYESIAN_MODEL_INTERNAL_FILE);
        String strCopyAsset2Internal2 = assetsUtils.copyAsset2Internal(context, CART_MODEL_ASSETS_FILE, CART_MODEL_INTERNAL_FILE);
        if (TextUtils.isEmpty(strCopyAsset2Internal) || TextUtils.isEmpty(strCopyAsset2Internal2)) {
            return null;
        }
        return new Pair<>(strCopyAsset2Internal, strCopyAsset2Internal2);
    }

    @NotNull
    public final boolean[] authenticate(@NotNull Context context, @NotNull HealthCare healthcare, @Nullable double[] srcUvData, @Nullable double[] matchedUvData) {
        Pair<String, String> pairA = a(context);
        if (pairA == null || srcUvData == null || matchedUvData == null) {
            return new boolean[]{false, false};
        }
        boolean zBioID_DataAPI = healthcare.BioID_DataAPI(srcUvData, matchedUvData, (String) pairA.first, (String) pairA.second, healthcare.ecg_flag);
        HMLog.info(TAG, new a(zBioID_DataAPI, healthcare, srcUvData, matchedUvData));
        return new boolean[]{zBioID_DataAPI, healthcare.ecg_flag.BIOID_SIGNAL_QUALITY};
    }

    @Deprecated(message = "")
    public final boolean authenticate$ecg_core_release(@NotNull Context context, @Nullable HealthCare healthcare, @NotNull String srcRawPath, @Nullable String matchedRawPath) {
        a(context);
        return false;
    }
}
