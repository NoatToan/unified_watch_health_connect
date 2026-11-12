package com.xiaomi.fitness.health.curse.data;

import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationTotalRecord;
import defpackage.jv9;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/curse/data/CurseMixedRecord;", "", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;", "hmRecord", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;", "getHmRecord", "()Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;", "Ljv9;", "protoRecord", "Ljv9;", "getProtoRecord", "()Ljv9;", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;Ljv9;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CurseMixedRecord {

    @Nullable
    private final MenstruationTotalRecord hmRecord;

    @Nullable
    private final jv9 protoRecord;

    /* JADX WARN: Multi-variable type inference failed */
    public CurseMixedRecord() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final MenstruationTotalRecord getHmRecord() {
        return this.hmRecord;
    }

    @Nullable
    public final jv9 getProtoRecord() {
        return this.protoRecord;
    }

    public /* synthetic */ CurseMixedRecord(MenstruationTotalRecord menstruationTotalRecord, jv9 jv9Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : menstruationTotalRecord, (i & 2) != 0 ? null : jv9Var);
    }

    public CurseMixedRecord(@Nullable MenstruationTotalRecord menstruationTotalRecord, @Nullable jv9 jv9Var) {
        this.hmRecord = menstruationTotalRecord;
        this.protoRecord = jv9Var;
    }
}
