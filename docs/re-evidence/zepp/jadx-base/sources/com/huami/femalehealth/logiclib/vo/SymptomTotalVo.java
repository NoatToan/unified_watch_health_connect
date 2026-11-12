package com.huami.femalehealth.logiclib.vo;

import com.huami.femalehealth.logiclib.dto.SymptomType;
import com.huami.moving.ui.utils.SportAnalytics;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000b¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R+\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/femalehealth/logiclib/vo/SymptomTotalVo;", "", "Ljava/util/Date;", "a", "Ljava/util/Date;", "getStart", "()Ljava/util/Date;", "start", "b", "getEnd", "end", "", "Lcom/huami/femalehealth/logiclib/dto/SymptomType;", "", "Lcom/huami/femalehealth/logiclib/vo/SymptomVo;", "c", "Ljava/util/Map;", "getMap", "()Ljava/util/Map;", SportAnalytics.ParamValue.MapButtonType.MAP, "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class SymptomTotalVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Date start;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Date end;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Map<SymptomType, List<SymptomVo>> map;

    /* JADX WARN: Multi-variable type inference failed */
    public SymptomTotalVo(@NotNull Date date, @NotNull Date date2, @NotNull Map<SymptomType, ? extends List<SymptomVo>> map) {
        this.start = date;
        this.end = date2;
        this.map = map;
    }

    @NotNull
    public final Date getEnd() {
        return this.end;
    }

    @NotNull
    public final Map<SymptomType, List<SymptomVo>> getMap() {
        return this.map;
    }

    @NotNull
    public final Date getStart() {
        return this.start;
    }
}
