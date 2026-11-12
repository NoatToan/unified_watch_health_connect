package com.huami.ecg.core.model;

import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.model.constant.MeasureStateValue;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000f\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/huami/ecg/core/model/MeasureState;", "", "", "toString", "a", "Ljava/lang/String;", "getMeasureScene", "()Ljava/lang/String;", "setMeasureScene", "(Ljava/lang/String;)V", MeasureState.d, "", "b", "[Ljava/lang/String;", "getBodyState", "()[Ljava/lang/String;", "setBodyState", "([Ljava/lang/String;)V", "bodyState", "c", "getMentalState", "setMentalState", MeasureState.f, "<init>", "()V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class MeasureState {
    private static final String d = "measureScene";
    private static final String e = "bodyState";
    private static final String f = "mentalState";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(d)
    @Nullable
    private String measureScene;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("bodyState")
    @Nullable
    private String[] bodyState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName(f)
    @Nullable
    private String[] mentalState;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String[] g = {MeasureStateValue.AFTER_GETTING_UP, MeasureStateValue.BEFORE_SLEEP, MeasureStateValue.BEFORE_EXERCISE, MeasureStateValue.AFTER_EXERCISE, MeasureStateValue.IN_WORK, MeasureStateValue.AFTER_WORK, MeasureStateValue.BUSY, MeasureStateValue.LEISURE, MeasureStateValue.BEFORE_MEAL, MeasureStateValue.AFTER_MEAL};

    @NotNull
    private static final String[] h = {MeasureStateValue.POOR_SLEEP, MeasureStateValue.HEAD_COLD, "FATIGUE", MeasureStateValue.CHEST_PAIN, MeasureStateValue.FLUSTERED, MeasureStateValue.CHEST_TIGHTNESS, MeasureStateValue.PHYSIOLOGICAL_PERIOD, MeasureStateValue.SUFFOCATION, MeasureStateValue.COUGH, MeasureStateValue.DIZZINESS, MeasureStateValue.FAINTS, MeasureStateValue.HEADACHE, MeasureStateValue.OTHER, MeasureStateValue.FINE};

    @NotNull
    private static final String[] i = {"FATIGUE", MeasureStateValue.TENSION, MeasureStateValue.HIGH_PRESSURE, MeasureStateValue.DEPRESSED, MeasureStateValue.ANGER, MeasureStateValue.CALM, MeasureStateValue.HAPPY};

    @NotNull
    private static final String[] j = {"FATIGUE", MeasureStateValue.POOR_SLEEP, MeasureStateValue.OTHER, MeasureStateValue.FINE};

    @NotNull
    private static final String[] k = {MeasureStateValue.HAPPY, MeasureStateValue.CALM, MeasureStateValue.DEPRESSED, MeasureStateValue.EXCITEMENT, MeasureStateValue.ANXIETY, MeasureStateValue.ANGER};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007R\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/ecg/core/model/MeasureState$Companion;", "", "", "", "sMeasureScene", "[Ljava/lang/String;", "getSMeasureScene", "()[Ljava/lang/String;", "sBodyState", "getSBodyState", "sMentalState", "getSMentalState", "sBodyStateShow", "getSBodyStateShow", "sMentalStateShow", "getSMentalStateShow", "BODY_STATE", "Ljava/lang/String;", "MEASURE_SCENE", "MENTAL_STATE", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final String[] getSBodyState() {
            return MeasureState.h;
        }

        @NotNull
        public final String[] getSBodyStateShow() {
            return MeasureState.j;
        }

        @NotNull
        public final String[] getSMeasureScene() {
            return MeasureState.g;
        }

        @NotNull
        public final String[] getSMentalState() {
            return MeasureState.i;
        }

        @NotNull
        public final String[] getSMentalStateShow() {
            return MeasureState.k;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Nullable
    public final String[] getBodyState() {
        return this.bodyState;
    }

    @Nullable
    public final String getMeasureScene() {
        return this.measureScene;
    }

    @Nullable
    public final String[] getMentalState() {
        return this.mentalState;
    }

    public final void setBodyState(@Nullable String[] strArr) {
        this.bodyState = strArr;
    }

    public final void setMeasureScene(@Nullable String str) {
        this.measureScene = str;
    }

    public final void setMentalState(@Nullable String[] strArr) {
        this.mentalState = strArr;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<MeasureScene: ");
        sb.append(this.measureScene);
        sb.append(", bodyState: ' ");
        String[] strArr = this.bodyState;
        sb.append(strArr != null ? Arrays.toString(strArr) : null);
        sb.append(", mentalState:");
        String[] strArr2 = this.mentalState;
        sb.append(strArr2 != null ? Arrays.toString(strArr2) : null);
        sb.append(Typography.greater);
        return sb.toString();
    }
}
