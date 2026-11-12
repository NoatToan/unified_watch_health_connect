package com.huami.femalehealth.uilib.adapter;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.logiclib.dto.SymptomType;
import com.huami.femalehealth.logiclib.vo.SymptomVo;
import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J7\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\r\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"¨\u0006'"}, d2 = {"Lcom/huami/femalehealth/uilib/adapter/DetailSymptomVo;", "Lcom/huami/femalehealth/uilib/adapter/HistoryDetailVo;", "Lcom/huami/femalehealth/logiclib/dto/SymptomType;", "component1", "", "Lcom/huami/femalehealth/logiclib/vo/SymptomVo;", "component2", "", "component3", "component4", "type", "symptoms", "start", "end", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/huami/femalehealth/logiclib/dto/SymptomType;", "getType", "()Lcom/huami/femalehealth/logiclib/dto/SymptomType;", "b", "Ljava/util/List;", "getSymptoms", "()Ljava/util/List;", "c", "J", "getStart", "()J", GoogleApiAvailabilityLight.a, "getEnd", "<init>", "(Lcom/huami/femalehealth/logiclib/dto/SymptomType;Ljava/util/List;JJ)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DetailSymptomVo extends HistoryDetailVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final SymptomType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<SymptomVo> symptoms;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long start;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long end;

    public DetailSymptomVo(@NotNull SymptomType symptomType, @NotNull List<SymptomVo> list, long j, long j2) {
        super(null);
        this.type = symptomType;
        this.symptoms = list;
        this.start = j;
        this.end = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DetailSymptomVo copy$default(DetailSymptomVo detailSymptomVo, SymptomType symptomType, List list, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            symptomType = detailSymptomVo.type;
        }
        if ((i & 2) != 0) {
            list = detailSymptomVo.symptoms;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            j = detailSymptomVo.start;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = detailSymptomVo.end;
        }
        return detailSymptomVo.copy(symptomType, list2, j3, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SymptomType getType() {
        return this.type;
    }

    @NotNull
    public final List<SymptomVo> component2() {
        return this.symptoms;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEnd() {
        return this.end;
    }

    @NotNull
    public final DetailSymptomVo copy(@NotNull SymptomType type, @NotNull List<SymptomVo> symptoms, long start, long end) {
        return new DetailSymptomVo(type, symptoms, start, end);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailSymptomVo)) {
            return false;
        }
        DetailSymptomVo detailSymptomVo = (DetailSymptomVo) other;
        return this.type == detailSymptomVo.type && Intrinsics.areEqual(this.symptoms, detailSymptomVo.symptoms) && this.start == detailSymptomVo.start && this.end == detailSymptomVo.end;
    }

    public final long getEnd() {
        return this.end;
    }

    public final long getStart() {
        return this.start;
    }

    @NotNull
    public final List<SymptomVo> getSymptoms() {
        return this.symptoms;
    }

    @NotNull
    public final SymptomType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.symptoms.hashCode()) * 31) + b.a(this.start)) * 31) + b.a(this.end);
    }

    @NotNull
    public String toString() {
        return "DetailSymptomVo(type=" + this.type + ", symptoms=" + this.symptoms + ", start=" + this.start + ", end=" + this.end + ')';
    }
}
