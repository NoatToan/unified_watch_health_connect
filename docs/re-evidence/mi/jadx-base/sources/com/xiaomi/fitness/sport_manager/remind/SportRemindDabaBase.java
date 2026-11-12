package com.xiaomi.fitness.sport_manager.remind;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.sport_manager.db.SCMRepository;
import defpackage.lcn;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/remind/SportRemindDabaBase;", "", "", DailyRecordKey.sportType, "Llcn;", "getSportRemindTable", "(I)Llcn;", "<init>", "()V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportRemindDabaBase {

    @NotNull
    public static final SportRemindDabaBase INSTANCE = new SportRemindDabaBase();

    private SportRemindDabaBase() {
    }

    @Nullable
    public final lcn getSportRemindTable(int sportType) {
        return SCMRepository.INSTANCE.getInstanse().getSportRemindTable(sportType);
    }
}
