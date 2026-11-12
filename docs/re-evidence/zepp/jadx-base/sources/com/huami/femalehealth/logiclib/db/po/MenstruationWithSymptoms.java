package com.huami.femalehealth.logiclib.db.po;

import androidx.room.Embedded;
import androidx.room.Relation;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\t\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/po/MenstruationWithSymptoms;", "", "", "toString", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationRecord;", "a", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationRecord;", "getRecord", "()Lcom/huami/femalehealth/logiclib/db/po/MenstruationRecord;", "record", "", "Lcom/huami/femalehealth/logiclib/db/po/Symptom;", "b", "Ljava/util/List;", "getSymptoms", "()Ljava/util/List;", "symptoms", "<init>", "(Lcom/huami/femalehealth/logiclib/db/po/MenstruationRecord;Ljava/util/List;)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class MenstruationWithSymptoms {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Embedded
    @NotNull
    private final MenstruationRecord record;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Relation(entity = Symptom.class, entityColumn = "date", parentColumn = "date")
    @NotNull
    private final List<Symptom> symptoms;

    public MenstruationWithSymptoms(@NotNull MenstruationRecord menstruationRecord, @NotNull List<Symptom> list) {
        this.record = menstruationRecord;
        this.symptoms = list;
    }

    @NotNull
    public final MenstruationRecord getRecord() {
        return this.record;
    }

    @NotNull
    public final List<Symptom> getSymptoms() {
        return this.symptoms;
    }

    @NotNull
    public String toString() {
        return "MenstruationWithSymptoms(record=" + this.record + ", symptoms=" + this.symptoms + ')';
    }
}
