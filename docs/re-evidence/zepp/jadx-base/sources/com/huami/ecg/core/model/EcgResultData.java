package com.huami.ecg.core.model;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/huami/ecg/core/model/EcgResultData;", "", "", "toString", "Lcom/huami/ecg/core/model/EcgHealthRecord;", "a", "Lcom/huami/ecg/core/model/EcgHealthRecord;", "getHealthRecord", "()Lcom/huami/ecg/core/model/EcgHealthRecord;", "setHealthRecord", "(Lcom/huami/ecg/core/model/EcgHealthRecord;)V", "healthRecord", "Lcom/huami/ecg/core/model/EcgDiseaseRecord;", "b", "Lcom/huami/ecg/core/model/EcgDiseaseRecord;", "getDiseaseRecord", "()Lcom/huami/ecg/core/model/EcgDiseaseRecord;", "setDiseaseRecord", "(Lcom/huami/ecg/core/model/EcgDiseaseRecord;)V", "diseaseRecord", "Lcom/huami/ecg/core/model/BioIdRecord;", "c", "Lcom/huami/ecg/core/model/BioIdRecord;", "getBioIdRecord", "()Lcom/huami/ecg/core/model/BioIdRecord;", "setBioIdRecord", "(Lcom/huami/ecg/core/model/BioIdRecord;)V", "bioIdRecord", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getAlgoVersion", "()Ljava/lang/String;", "setAlgoVersion", "(Ljava/lang/String;)V", "algoVersion", "Lcom/huami/ecg/core/model/AdditionalInfo;", "e", "Lcom/huami/ecg/core/model/AdditionalInfo;", "getAdditionalInfo", "()Lcom/huami/ecg/core/model/AdditionalInfo;", "setAdditionalInfo", "(Lcom/huami/ecg/core/model/AdditionalInfo;)V", EcgResultData.j, "<init>", "()V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgResultData {
    private static final String f = "health";
    private static final String g = "disease";
    private static final String h = "bioId";
    private static final String i = "algoVersion";
    private static final String j = "additionalInfo";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName(h)
    @Nullable
    private BioIdRecord bioIdRecord;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName(j)
    @Nullable
    private AdditionalInfo additionalInfo;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("health")
    @NotNull
    private EcgHealthRecord healthRecord = new EcgHealthRecord();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName(g)
    @NotNull
    private EcgDiseaseRecord diseaseRecord = new EcgDiseaseRecord();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("algoVersion")
    @NotNull
    private String algoVersion = "";

    @Nullable
    public final AdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    @NotNull
    public final String getAlgoVersion() {
        return this.algoVersion;
    }

    @Nullable
    public final BioIdRecord getBioIdRecord() {
        return this.bioIdRecord;
    }

    @NotNull
    public final EcgDiseaseRecord getDiseaseRecord() {
        return this.diseaseRecord;
    }

    @NotNull
    public final EcgHealthRecord getHealthRecord() {
        return this.healthRecord;
    }

    public final void setAdditionalInfo(@Nullable AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public final void setAlgoVersion(@NotNull String str) {
        this.algoVersion = str;
    }

    public final void setBioIdRecord(@Nullable BioIdRecord bioIdRecord) {
        this.bioIdRecord = bioIdRecord;
    }

    public final void setDiseaseRecord(@NotNull EcgDiseaseRecord ecgDiseaseRecord) {
        this.diseaseRecord = ecgDiseaseRecord;
    }

    public final void setHealthRecord(@NotNull EcgHealthRecord ecgHealthRecord) {
        this.healthRecord = ecgHealthRecord;
    }

    @NotNull
    public String toString() {
        return "EcgResultData[" + new Gson().toJson(this) + "]";
    }
}
