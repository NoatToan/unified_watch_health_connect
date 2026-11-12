package com.garmin.android.apps.connectmobile.activities.stats.exercises.database;

import android.content.Context;
import androidx.room.b0;
import androidx.room.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/database/RecentSelectedExercisesDatabase;", "Landroidx/room/b0;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class RecentSelectedExercisesDatabase extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29919a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static RecentSelectedExercisesDatabase f29920b;

    public abstract iq.a e();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/database/RecentSelectedExercisesDatabase$a;", "", "<init>", "()V", "", "DATABASE_NAME", "Ljava/lang/String;", "", "EXPIRE_DAY_COUNT", "I", "Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/database/RecentSelectedExercisesDatabase;", "instance", "Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/database/RecentSelectedExercisesDatabase;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static RecentSelectedExercisesDatabase a(Context context) {
            context.getClass();
            RecentSelectedExercisesDatabase recentSelectedExercisesDatabase = RecentSelectedExercisesDatabase.f29920b;
            if (recentSelectedExercisesDatabase != null) {
                return recentSelectedExercisesDatabase;
            }
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            b0.a aVarA = x.a(applicationContext, RecentSelectedExercisesDatabase.class, "recentSelectedExercises_database");
            aVarA.c();
            RecentSelectedExercisesDatabase recentSelectedExercisesDatabase2 = (RecentSelectedExercisesDatabase) aVarA.b();
            RecentSelectedExercisesDatabase.f29920b = recentSelectedExercisesDatabase2;
            return recentSelectedExercisesDatabase2;
        }

        private a() {
        }
    }
}
