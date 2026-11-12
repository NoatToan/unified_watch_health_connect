package com.xiaomi.fitness.sport_eco.ftp;

import defpackage.tr9;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\bJ*\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u0018R\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/FtpActivityState;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "Ltr9;", "component1", "()[Ltr9;", "component2", "mFtpTarget", "minute", "copy", "([Ltr9;I)Lcom/xiaomi/fitness/sport_eco/ftp/FtpActivityState;", "", "toString", "()Ljava/lang/String;", "[Ltr9;", "getMFtpTarget", "setMFtpTarget", "([Ltr9;)V", "I", "getMinute", "setMinute", "(I)V", "<init>", "([Ltr9;I)V", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final /* data */ class FtpActivityState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static FtpActivityState initial = new FtpActivityState(new tr9[0], 0);

    @NotNull
    private tr9[] mFtpTarget;
    private int minute;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/FtpActivityState$Companion;", "", "<init>", "()V", "initial", "Lcom/xiaomi/fitness/sport_eco/ftp/FtpActivityState;", "getInitial", "()Lcom/xiaomi/fitness/sport_eco/ftp/FtpActivityState;", "setInitial", "(Lcom/xiaomi/fitness/sport_eco/ftp/FtpActivityState;)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FtpActivityState getInitial() {
            return FtpActivityState.initial;
        }

        public final void setInitial(@NotNull FtpActivityState ftpActivityState) {
            Intrinsics.checkNotNullParameter(ftpActivityState, "<set-?>");
            FtpActivityState.initial = ftpActivityState;
        }
    }

    public FtpActivityState(@NotNull tr9[] mFtpTarget, int i) {
        Intrinsics.checkNotNullParameter(mFtpTarget, "mFtpTarget");
        this.mFtpTarget = mFtpTarget;
        this.minute = i;
    }

    public static /* synthetic */ FtpActivityState copy$default(FtpActivityState ftpActivityState, tr9[] tr9VarArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            tr9VarArr = ftpActivityState.mFtpTarget;
        }
        if ((i2 & 2) != 0) {
            i = ftpActivityState.minute;
        }
        return ftpActivityState.copy(tr9VarArr, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final tr9[] getMFtpTarget() {
        return this.mFtpTarget;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    @NotNull
    public final FtpActivityState copy(@NotNull tr9[] mFtpTarget, int minute) {
        Intrinsics.checkNotNullParameter(mFtpTarget, "mFtpTarget");
        return new FtpActivityState(mFtpTarget, minute);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(FtpActivityState.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.xiaomi.fitness.sport_eco.ftp.FtpActivityState");
        return Arrays.equals(this.mFtpTarget, ((FtpActivityState) other).mFtpTarget);
    }

    @NotNull
    public final tr9[] getMFtpTarget() {
        return this.mFtpTarget;
    }

    public final int getMinute() {
        return this.minute;
    }

    public int hashCode() {
        return Arrays.hashCode(this.mFtpTarget);
    }

    public final void setMFtpTarget(@NotNull tr9[] tr9VarArr) {
        Intrinsics.checkNotNullParameter(tr9VarArr, "<set-?>");
        this.mFtpTarget = tr9VarArr;
    }

    public final void setMinute(int i) {
        this.minute = i;
    }

    @NotNull
    public String toString() {
        return "FtpActivityState(mFtpTarget=" + Arrays.toString(this.mFtpTarget) + ", minute=" + this.minute + ")";
    }
}
