package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum c {
    WithPushingWorkoutEdit,
    WithSendingWorkoutToDevice,
    SetResultOnCreate,
    ForScheduledWorkout,
    None;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48511a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/c$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(Integer num) {
            if ((num != null && num.intValue() == 212) || (num != null && num.intValue() == 211)) {
                return c.WithPushingWorkoutEdit;
            }
            if (num != null && num.intValue() == 213) {
                return c.WithSendingWorkoutToDevice;
            }
            if (num != null && num.intValue() == 202) {
                return c.SetResultOnCreate;
            }
            return (num != null && num.intValue() == 206) ? c.ForScheduledWorkout : c.None;
        }

        private a() {
        }
    }
}
