package com.huami.bloodoxygen.core.koin;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Date;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b0\u00101J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003JW\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u0010\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0010\u0010#R\u0019\u0010\u0011\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u0013\u0010.R\u0019\u0010\u0014\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b\u0014\u0010#¨\u00062"}, d2 = {"Lcom/huami/bloodoxygen/core/koin/BloodOxygenConfig;", "", "", "component1", "component2", "", "component3", "Lcom/huami/bloodoxygen/core/koin/ISleepQuery;", "component4", "Ljava/util/Date;", "component5", "Lkotlin/Function0;", "component6", "component7", "userId", "appName", "isDevOrInnerChannel", "sleepQuery", "registerDate", "isSyncDataEnable", "isPathExtension", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "getAppName", "c", "Z", "()Z", GoogleApiAvailabilityLight.a, "Lcom/huami/bloodoxygen/core/koin/ISleepQuery;", "getSleepQuery", "()Lcom/huami/bloodoxygen/core/koin/ISleepQuery;", "e", "Ljava/util/Date;", "getRegisterDate", "()Ljava/util/Date;", "f", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "g", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/huami/bloodoxygen/core/koin/ISleepQuery;Ljava/util/Date;Lkotlin/jvm/functions/Function0;Z)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodOxygenConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean isDevOrInnerChannel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final ISleepQuery sleepQuery;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Date registerDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function0<Boolean> isSyncDataEnable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final boolean isPathExtension;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return true;
        }
    }

    public BloodOxygenConfig(@NotNull String str, @NotNull String str2, boolean z, @NotNull ISleepQuery iSleepQuery, @Nullable Date date, @NotNull Function0<Boolean> function0, boolean z2) {
        this.userId = str;
        this.appName = str2;
        this.isDevOrInnerChannel = z;
        this.sleepQuery = iSleepQuery;
        this.registerDate = date;
        this.isSyncDataEnable = function0;
        this.isPathExtension = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BloodOxygenConfig copy$default(BloodOxygenConfig bloodOxygenConfig, String str, String str2, boolean z, ISleepQuery iSleepQuery, Date date, Function0 function0, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bloodOxygenConfig.userId;
        }
        if ((i & 2) != 0) {
            str2 = bloodOxygenConfig.appName;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = bloodOxygenConfig.isDevOrInnerChannel;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            iSleepQuery = bloodOxygenConfig.sleepQuery;
        }
        ISleepQuery iSleepQuery2 = iSleepQuery;
        if ((i & 16) != 0) {
            date = bloodOxygenConfig.registerDate;
        }
        Date date2 = date;
        if ((i & 32) != 0) {
            function0 = bloodOxygenConfig.isSyncDataEnable;
        }
        Function0 function1 = function0;
        if ((i & 64) != 0) {
            z2 = bloodOxygenConfig.isPathExtension;
        }
        return bloodOxygenConfig.copy(str, str3, z3, iSleepQuery2, date2, function1, z2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsDevOrInnerChannel() {
        return this.isDevOrInnerChannel;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ISleepQuery getSleepQuery() {
        return this.sleepQuery;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getRegisterDate() {
        return this.registerDate;
    }

    @NotNull
    public final Function0<Boolean> component6() {
        return this.isSyncDataEnable;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsPathExtension() {
        return this.isPathExtension;
    }

    @NotNull
    public final BloodOxygenConfig copy(@NotNull String userId, @NotNull String appName, boolean isDevOrInnerChannel, @NotNull ISleepQuery sleepQuery, @Nullable Date registerDate, @NotNull Function0<Boolean> isSyncDataEnable, boolean isPathExtension) {
        return new BloodOxygenConfig(userId, appName, isDevOrInnerChannel, sleepQuery, registerDate, isSyncDataEnable, isPathExtension);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodOxygenConfig)) {
            return false;
        }
        BloodOxygenConfig bloodOxygenConfig = (BloodOxygenConfig) other;
        return Intrinsics.areEqual(this.userId, bloodOxygenConfig.userId) && Intrinsics.areEqual(this.appName, bloodOxygenConfig.appName) && this.isDevOrInnerChannel == bloodOxygenConfig.isDevOrInnerChannel && Intrinsics.areEqual(this.sleepQuery, bloodOxygenConfig.sleepQuery) && Intrinsics.areEqual(this.registerDate, bloodOxygenConfig.registerDate) && Intrinsics.areEqual(this.isSyncDataEnable, bloodOxygenConfig.isSyncDataEnable) && this.isPathExtension == bloodOxygenConfig.isPathExtension;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final Date getRegisterDate() {
        return this.registerDate;
    }

    @NotNull
    public final ISleepQuery getSleepQuery() {
        return this.sleepQuery;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.userId.hashCode() * 31) + this.appName.hashCode()) * 31;
        boolean z = this.isDevOrInnerChannel;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((iHashCode + r1) * 31) + this.sleepQuery.hashCode()) * 31;
        Date date = this.registerDate;
        int iHashCode3 = (((iHashCode2 + (date == null ? 0 : date.hashCode())) * 31) + this.isSyncDataEnable.hashCode()) * 31;
        boolean z2 = this.isPathExtension;
        return iHashCode3 + (z2 ? 1 : z2);
    }

    public final boolean isDevOrInnerChannel() {
        return this.isDevOrInnerChannel;
    }

    public final boolean isPathExtension() {
        return this.isPathExtension;
    }

    @NotNull
    public final Function0<Boolean> isSyncDataEnable() {
        return this.isSyncDataEnable;
    }

    @NotNull
    public String toString() {
        return "BloodOxygenConfig(userId=" + this.userId + ", appName=" + this.appName + ", isDevOrInnerChannel=" + this.isDevOrInnerChannel + ", sleepQuery=" + this.sleepQuery + ", registerDate=" + this.registerDate + ", isSyncDataEnable=" + this.isSyncDataEnable + ", isPathExtension=" + this.isPathExtension + ")";
    }

    public /* synthetic */ BloodOxygenConfig(String str, String str2, boolean z, ISleepQuery iSleepQuery, Date date, Function0 function0, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? new ISleepQuery() { // from class: com.huami.bloodoxygen.core.koin.BloodOxygenConfig.1
            @Override // com.huami.bloodoxygen.core.koin.ISleepQuery
            @Nullable
            public Object invoke(@NotNull String str3, @NotNull Continuation<? super BoSleepInfo> continuation) {
                return null;
            }
        } : iSleepQuery, (i & 16) != 0 ? null : date, (i & 32) != 0 ? a.a : function0, (i & 64) != 0 ? false : z2);
    }
}
