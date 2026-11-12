package com.huami.femalehealth.logiclib.db.po;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.sleepassistant.apilib.utils.WebConst;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Entity
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b(\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012B?\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b0\u00101J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003JO\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0010\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\u0011\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u0013\u0010/¨\u00063"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/po/MenstruationHistory;", "", "", "component1", "", "component2", "Ljava/util/Date;", "component3", "component4", "component5", "component6", "", "component7", "id", "cycle", "menstrualPeriod", "menstrualEndTime", "month", "userId", "isEnd", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", WebConst.QueryParam.SET_ID, "(Ljava/lang/String;)V", "b", LogUtil.I, "getCycle", "()I", "c", "Ljava/util/Date;", "getMenstrualPeriod", "()Ljava/util/Date;", GoogleApiAvailabilityLight.a, "getMenstrualEndTime", "e", "getMonth", "f", "getUserId", "g", "Z", "()Z", "<init>", "(Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Z)V", "Companion", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MenstruationHistory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<Long> h = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    @NotNull
    private String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int cycle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date menstrualPeriod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date menstrualEndTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date month;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final boolean isEnd;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/po/MenstruationHistory$Companion;", "", "", "offsetDateTime$delegate", "Lkotlin/Lazy;", "getOffsetDateTime", "()J", "offsetDateTime", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "offsetDateTime", "getOffsetDateTime()J"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getOffsetDateTime() {
            return ((Number) MenstruationHistory.h.getValue()).longValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Long> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        public final long a() {
            long value = AidKt.toMilli(DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null)).getValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            String str = simpleDateFormat.format(Long.valueOf(value));
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime() - value;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(a());
        }
    }

    public MenstruationHistory(@NotNull String str, int i, @NotNull Date date, @NotNull Date date2, @NotNull Date date3, @NotNull String str2, boolean z) {
        this.id = str;
        this.cycle = i;
        this.menstrualPeriod = date;
        this.menstrualEndTime = date2;
        this.month = date3;
        this.userId = str2;
        this.isEnd = z;
    }

    public static /* synthetic */ MenstruationHistory copy$default(MenstruationHistory menstruationHistory, String str, int i, Date date, Date date2, Date date3, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = menstruationHistory.id;
        }
        if ((i2 & 2) != 0) {
            i = menstruationHistory.cycle;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            date = menstruationHistory.menstrualPeriod;
        }
        Date date4 = date;
        if ((i2 & 8) != 0) {
            date2 = menstruationHistory.menstrualEndTime;
        }
        Date date5 = date2;
        if ((i2 & 16) != 0) {
            date3 = menstruationHistory.month;
        }
        Date date6 = date3;
        if ((i2 & 32) != 0) {
            str2 = menstruationHistory.userId;
        }
        String str3 = str2;
        if ((i2 & 64) != 0) {
            z = menstruationHistory.isEnd;
        }
        return menstruationHistory.copy(str, i3, date4, date5, date6, str3, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCycle() {
        return this.cycle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getMenstrualPeriod() {
        return this.menstrualPeriod;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getMenstrualEndTime() {
        return this.menstrualEndTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getMonth() {
        return this.month;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsEnd() {
        return this.isEnd;
    }

    @NotNull
    public final MenstruationHistory copy(@NotNull String id, int cycle, @NotNull Date menstrualPeriod, @NotNull Date menstrualEndTime, @NotNull Date month, @NotNull String userId, boolean isEnd) {
        return new MenstruationHistory(id, cycle, menstrualPeriod, menstrualEndTime, month, userId, isEnd);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstruationHistory)) {
            return false;
        }
        MenstruationHistory menstruationHistory = (MenstruationHistory) other;
        return Intrinsics.areEqual(this.id, menstruationHistory.id) && this.cycle == menstruationHistory.cycle && Intrinsics.areEqual(this.menstrualPeriod, menstruationHistory.menstrualPeriod) && Intrinsics.areEqual(this.menstrualEndTime, menstruationHistory.menstrualEndTime) && Intrinsics.areEqual(this.month, menstruationHistory.month) && Intrinsics.areEqual(this.userId, menstruationHistory.userId) && this.isEnd == menstruationHistory.isEnd;
    }

    public final int getCycle() {
        return this.cycle;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Date getMenstrualEndTime() {
        return this.menstrualEndTime;
    }

    @NotNull
    public final Date getMenstrualPeriod() {
        return this.menstrualPeriod;
    }

    @NotNull
    public final Date getMonth() {
        return this.month;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    public int hashCode() {
        int iHashCode = ((((((((((this.id.hashCode() * 31) + this.cycle) * 31) + this.menstrualPeriod.hashCode()) * 31) + this.menstrualEndTime.hashCode()) * 31) + this.month.hashCode()) * 31) + this.userId.hashCode()) * 31;
        boolean z = this.isEnd;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isEnd() {
        return this.isEnd;
    }

    public final void setId(@NotNull String str) {
        this.id = str;
    }

    @NotNull
    public String toString() {
        return "MenstruationHistory(id=" + this.id + ", cycle=" + this.cycle + ", menstrualPeriod=" + this.menstrualPeriod + ", menstrualEndTime=" + this.menstrualEndTime + ", month=" + this.month + ", userId=" + this.userId + ", isEnd=" + this.isEnd + ')';
    }
}
