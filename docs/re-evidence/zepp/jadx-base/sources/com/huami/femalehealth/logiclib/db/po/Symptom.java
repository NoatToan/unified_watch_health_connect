package com.huami.femalehealth.logiclib.db.po;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.logiclib.db.DateConverter;
import com.huami.femalehealth.logiclib.db.DegreeConverter;
import com.huami.femalehealth.logiclib.db.SymptomTypeConverter;
import com.huami.femalehealth.logiclib.dto.Degree;
import com.huami.femalehealth.logiclib.dto.SymptomType;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.sleepassistant.apilib.utils.WebConst;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@TypeConverters({DateConverter.class, DegreeConverter.class, SymptomTypeConverter.class})
@Entity(foreignKeys = {@ForeignKey(childColumns = {"date"}, entity = MenstruationRecord.class, onDelete = 5, onUpdate = 5, parentColumns = {"date"})}, indices = {@Index({"date"})}, tableName = "Symptom")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/po/Symptom;", "", "", "toString", "Ljava/util/Date;", "component1", "Lcom/huami/femalehealth/logiclib/dto/SymptomType;", "component2", "Lcom/huami/femalehealth/logiclib/dto/Degree;", "component3", "date", "type", "degree", "copy", "", "hashCode", "other", "", "equals", "a", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "b", "Lcom/huami/femalehealth/logiclib/dto/SymptomType;", "getType", "()Lcom/huami/femalehealth/logiclib/dto/SymptomType;", "setType", "(Lcom/huami/femalehealth/logiclib/dto/SymptomType;)V", "c", "Lcom/huami/femalehealth/logiclib/dto/Degree;", "getDegree", "()Lcom/huami/femalehealth/logiclib/dto/Degree;", "setDegree", "(Lcom/huami/femalehealth/logiclib/dto/Degree;)V", "", GoogleApiAvailabilityLight.a, "J", "getId", "()J", WebConst.QueryParam.SET_ID, "(J)V", "id", "<init>", "(Ljava/util/Date;Lcom/huami/femalehealth/logiclib/dto/SymptomType;Lcom/huami/femalehealth/logiclib/dto/Degree;)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Symptom {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Date date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private SymptomType type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private Degree degree;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @PrimaryKey(autoGenerate = true)
    private long id;

    public Symptom(@NotNull Date date, @NotNull SymptomType symptomType, @NotNull Degree degree) {
        this.date = date;
        this.type = symptomType;
        this.degree = degree;
    }

    public static /* synthetic */ Symptom copy$default(Symptom symptom, Date date, SymptomType symptomType, Degree degree, int i, Object obj) {
        if ((i & 1) != 0) {
            date = symptom.date;
        }
        if ((i & 2) != 0) {
            symptomType = symptom.type;
        }
        if ((i & 4) != 0) {
            degree = symptom.degree;
        }
        return symptom.copy(date, symptomType, degree);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SymptomType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Degree getDegree() {
        return this.degree;
    }

    @NotNull
    public final Symptom copy(@NotNull Date date, @NotNull SymptomType type, @NotNull Degree degree) {
        return new Symptom(date, type, degree);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Symptom)) {
            return false;
        }
        Symptom symptom = (Symptom) other;
        return Intrinsics.areEqual(this.date, symptom.date) && this.type == symptom.type && this.degree == symptom.degree;
    }

    @NotNull
    public final Date getDate() {
        return this.date;
    }

    @NotNull
    public final Degree getDegree() {
        return this.degree;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final SymptomType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.date.hashCode() * 31) + this.type.hashCode()) * 31) + this.degree.hashCode();
    }

    public final void setDegree(@NotNull Degree degree) {
        this.degree = degree;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setType(@NotNull SymptomType symptomType) {
        this.type = symptomType;
    }

    @NotNull
    public String toString() {
        return '\n' + DateHelper.convertUTCDate$default(DateHelper.INSTANCE, this.date.getTime(), false, 2, null) + ": " + this.type + "->" + this.degree + "  id:" + this.id;
    }
}
