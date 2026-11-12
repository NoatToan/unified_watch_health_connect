package com.huami.account.userinfo.goal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/huami/account/userinfo/goal/GoalEvent;", "", "<init>", "()V", "CalorieUpdate", "GoalsUpdated", "SleepUpdate", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class GoalEvent {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/account/userinfo/goal/GoalEvent$CalorieUpdate;", "", "", "a", "Z", "getFromDevice", "()Z", "fromDevice", "<init>", "(Z)V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
    public static final class CalorieUpdate {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean fromDevice;

        public CalorieUpdate() {
            this(false, 1, null);
        }

        public CalorieUpdate(boolean z) {
            this.fromDevice = z;
        }

        public final boolean getFromDevice() {
            return this.fromDevice;
        }

        public /* synthetic */ CalorieUpdate(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/account/userinfo/goal/GoalEvent$GoalsUpdated;", "", "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
    public static final class GoalsUpdated {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/account/userinfo/goal/GoalEvent$SleepUpdate;", "", "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
    public static final class SleepUpdate {
    }
}
