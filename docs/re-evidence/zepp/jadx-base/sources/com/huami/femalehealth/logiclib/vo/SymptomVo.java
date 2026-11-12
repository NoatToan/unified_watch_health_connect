package com.huami.femalehealth.logiclib.vo;

import com.huami.femalehealth.logiclib.dto.Degree;
import com.huami.femalehealth.logiclib.dto.SymptomType;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/huami/femalehealth/logiclib/vo/SymptomVo;", "", "", "toString", "Lcom/huami/femalehealth/logiclib/dto/Degree;", "component1", "Lcom/huami/femalehealth/logiclib/dto/SymptomType;", "component2", "", "component3", "degree", "type", "date", "copy", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/femalehealth/logiclib/dto/Degree;", "getDegree", "()Lcom/huami/femalehealth/logiclib/dto/Degree;", "b", "Lcom/huami/femalehealth/logiclib/dto/SymptomType;", "getType", "()Lcom/huami/femalehealth/logiclib/dto/SymptomType;", "c", "J", "getDate", "()J", "<init>", "(Lcom/huami/femalehealth/logiclib/dto/Degree;Lcom/huami/femalehealth/logiclib/dto/SymptomType;J)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SymptomVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Degree degree;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SymptomType type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long date;

    public SymptomVo(@NotNull Degree degree, @NotNull SymptomType symptomType, long j) {
        this.degree = degree;
        this.type = symptomType;
        this.date = j;
    }

    public static /* synthetic */ SymptomVo copy$default(SymptomVo symptomVo, Degree degree, SymptomType symptomType, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            degree = symptomVo.degree;
        }
        if ((i & 2) != 0) {
            symptomType = symptomVo.type;
        }
        if ((i & 4) != 0) {
            j = symptomVo.date;
        }
        return symptomVo.copy(degree, symptomType, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Degree getDegree() {
        return this.degree;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SymptomType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @NotNull
    public final SymptomVo copy(@NotNull Degree degree, @NotNull SymptomType type, long date) {
        return new SymptomVo(degree, type, date);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SymptomVo)) {
            return false;
        }
        SymptomVo symptomVo = (SymptomVo) other;
        return this.degree == symptomVo.degree && this.type == symptomVo.type && this.date == symptomVo.date;
    }

    public final long getDate() {
        return this.date;
    }

    @NotNull
    public final Degree getDegree() {
        return this.degree;
    }

    @NotNull
    public final SymptomType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.degree.hashCode() * 31) + this.type.hashCode()) * 31) + b.a(this.date);
    }

    @NotNull
    public String toString() {
        return "date:" + DateHelper.convertUTCDate$default(DateHelper.INSTANCE, this.date, false, 2, null) + " type:" + this.type + " degree:" + this.degree;
    }
}
