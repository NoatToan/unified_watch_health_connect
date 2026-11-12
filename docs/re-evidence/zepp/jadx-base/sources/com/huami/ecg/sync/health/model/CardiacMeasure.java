package com.huami.ecg.sync.health.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0013\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0019\u0010\u001c\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006¨\u0006!"}, d2 = {"Lcom/huami/ecg/sync/health/model/CardiacMeasure;", "", "", "a", LogUtil.D, "getCardiacStrength", "()D", "cardiacStrength", "b", "getCardiacAge", "cardiacAge", "", "c", LogUtil.I, "getCardiacRisk", "()I", "cardiacRisk", GoogleApiAvailabilityLight.a, "getAnsType", "ansType", "e", "getLF", "LF", "f", "getHF", "HF", "g", "getTP", "TP", "", "param", "<init>", "([D)V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class CardiacMeasure {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double cardiacStrength;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double cardiacAge;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int cardiacRisk;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int ansType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final double LF;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final double HF;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final double TP;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ double[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(double[] dArr) {
            super(0);
            this.a = dArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return " strength:" + this.a[0] + ",age:" + this.a[1] + ",risk:" + this.a[2] + ",type:" + this.a[3] + ",LF:" + this.a[4] + ",HF:" + this.a[5] + ",TP:" + this.a[6];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "ECGHealth CardiacMeasure bad length";
        }
    }

    public CardiacMeasure(@Nullable double[] dArr) {
        if (dArr == null || dArr.length != 7) {
            HMLog.info("CardiacMeasure", b.a);
            throw new IllegalArgumentException("CardiacMeasure bad length");
        }
        HMLog.info("CardiacMeasure", new a(dArr));
        this.cardiacStrength = dArr[0];
        this.cardiacAge = dArr[1];
        this.cardiacRisk = (int) dArr[2];
        this.ansType = (int) dArr[3];
        this.LF = dArr[4];
        this.HF = dArr[5];
        this.TP = dArr[6];
    }

    public final int getAnsType() {
        return this.ansType;
    }

    public final double getCardiacAge() {
        return this.cardiacAge;
    }

    public final int getCardiacRisk() {
        return this.cardiacRisk;
    }

    public final double getCardiacStrength() {
        return this.cardiacStrength;
    }

    public final double getHF() {
        return this.HF;
    }

    public final double getLF() {
        return this.LF;
    }

    public final double getTP() {
        return this.TP;
    }
}
