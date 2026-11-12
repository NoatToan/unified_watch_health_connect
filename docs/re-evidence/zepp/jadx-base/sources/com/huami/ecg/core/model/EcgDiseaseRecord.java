package com.huami.ecg.core.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.tools.log.HMLog;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 C2\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\bA\u0010BJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R.\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR.\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR*\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010&\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R*\u0010*\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R*\u00102\u001a\u00020+2\u0006\u0010\u0013\u001a\u00020+8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010@\u001a\u00020:2\u0006\u0010;\u001a\u00020:8F@BX\u0086\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lcom/huami/ecg/core/model/EcgDiseaseRecord;", "", "", "toString", "", "pACIndex", "a", "[I", "getPacIndex", "()[I", "setPacIndex", "([I)V", "pacIndex", "pVCIndex", "b", "getPvcIndex", "setPvcIndex", "pvcIndex", "", "value", "c", LogUtil.I, "getStc", "()I", "setStc", "(I)V", "stc", "", GoogleApiAvailabilityLight.a, "J", "getStlt", "()J", "setStlt", "(J)V", "stlt", "e", "getSbc", "setSbc", "sbc", "f", "getSblt", "setSblt", "sblt", "", "g", "F", "getAFibProb", "()F", "setAFibProb", "(F)V", "aFibProb", "h", "Ljava/lang/String;", "getMAlgoVersion", "()Ljava/lang/String;", "setMAlgoVersion", "(Ljava/lang/String;)V", "mAlgoVersion", "", "<set-?>", "i", "Z", "getHasAFib", "()Z", "hasAFib", "<init>", "()V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgDiseaseRecord {
    private static final String j = "pvc_indexes";
    private static final String k = "pac_indexes";
    private static final String l = "stc_count";
    private static final String m = "stc_time";
    private static final String n = "sbc_count";
    private static final String o = "sbc_time";
    private static final String p = "afib_prob";
    private static final String q = "algoVersion";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(k)
    @Nullable
    private int[] pacIndex = new int[0];

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName(j)
    @Nullable
    private int[] pvcIndex = new int[0];

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName(l)
    private int stc = -1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName(m)
    private long stlt = -1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName(n)
    private int sbc = -1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName(o)
    private long sblt = -1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName(p)
    private float aFibProb = -1.0f;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName("algoVersion")
    @NotNull
    private String mAlgoVersion = "";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean hasAFib;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f) {
            super(0);
            this.a = f;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "aFibProb is nan:" + this.a;
        }
    }

    public EcgDiseaseRecord() {
        this.hasAFib = ((double) (-1.0f)) > 0.55d;
    }

    public final float getAFibProb() {
        return this.aFibProb;
    }

    public final boolean getHasAFib() {
        return ((double) this.aFibProb) > 0.55d;
    }

    @NotNull
    public final String getMAlgoVersion() {
        return this.mAlgoVersion;
    }

    @Nullable
    public final int[] getPacIndex() {
        return this.pacIndex;
    }

    @Nullable
    public final int[] getPvcIndex() {
        return this.pvcIndex;
    }

    public final int getSbc() {
        return this.sbc;
    }

    public final long getSblt() {
        return this.sblt;
    }

    public final int getStc() {
        return this.stc;
    }

    public final long getStlt() {
        return this.stlt;
    }

    public final void setAFibProb(float f) {
        if (Float.isNaN(f)) {
            HMLog.warn$default("Disease", null, new a(f), 2, null);
            return;
        }
        double d = f;
        if (d < 0.0d || d > 1.0d) {
            f = -1.0f;
        }
        this.aFibProb = f;
    }

    public final void setMAlgoVersion(@NotNull String str) {
        this.mAlgoVersion = str;
    }

    public final void setPacIndex(@Nullable int[] iArr) {
        if (iArr == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.pacIndex = iArr;
    }

    public final void setPvcIndex(@Nullable int[] iArr) {
        if (iArr == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.pvcIndex = iArr;
    }

    public final void setSbc(int i) {
        if (i < 0) {
            i = -1;
        }
        this.sbc = i;
    }

    public final void setSblt(long j2) {
        if (j2 < 0) {
            j2 = -1;
        }
        this.sblt = j2;
    }

    public final void setStc(int i) {
        if (i < 0) {
            i = -1;
        }
        this.stc = i;
    }

    public final void setStlt(long j2) {
        if (j2 < 0) {
            j2 = -1;
        }
        this.stlt = j2;
    }

    @NotNull
    public String toString() {
        return "EcgDisease [PAC:" + Arrays.toString(this.pacIndex) + "] [PVC:" + Arrays.toString(this.pvcIndex) + "] [STC:" + this.stc + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.stlt + "sec] [SBC:" + this.sbc + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.sblt + "sec] [AFib:" + this.aFibProb + "]";
    }
}
