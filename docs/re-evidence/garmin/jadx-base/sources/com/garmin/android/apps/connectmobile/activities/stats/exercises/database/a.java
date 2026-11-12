package com.garmin.android.apps.connectmobile.activities.stats.exercises.database;

import androidx.room.b0;
import androidx.room.g;
import gl1.d;
import hq.z0;
import hy.h;
import iq.c;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/database/a;", "Liq/a;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements iq.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f29923c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f29924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0461a f29925b;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.stats.exercises.database.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/activities/stats/exercises/database/a$a", "Landroidx/room/g;", "Liq/c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0461a extends g<c> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, c cVar2) {
            c cVar3 = cVar2;
            cVar.getClass();
            cVar3.getClass();
            cVar.q3(1, cVar3.f94726a);
            cVar.q3(2, cVar3.f94727b);
            cVar.q3(3, cVar3.f94728c);
            cVar.q3(4, cVar3.f94729d);
            cVar.h(5, cVar3.f94730e ? 1L : 0L);
            cVar.q3(6, cVar3.f94731f);
            cVar.q3(7, cVar3.f94732g);
            cVar.h(8, cVar3.f94733h);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `recent_selected_exercises` (`key`,`category`,`categoryTranslation`,`counterPart`,`isBodyWeight`,`exerciseTypeKey`,`exerciseTranslation`,`selectTimestamp`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    public a(b0 b0Var) {
        b0Var.getClass();
        this.f29924a = b0Var;
        this.f29925b = new C0461a();
    }

    @Override // iq.a
    public final Object a(z0 z0Var) {
        return d.Q(this.f29924a, true, false, new ig2.d(26), z0Var);
    }

    @Override // iq.a
    public final Object b(long j8, z0 z0Var) throws Throwable {
        Object objQ = d.Q(this.f29924a, false, true, new a02.a(j8, 23), z0Var);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // iq.a
    public final Object c(c cVar, v13.c cVar2) throws Throwable {
        Object objQ = d.Q(this.f29924a, false, true, new h(24, this, cVar), cVar2);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/database/a$b;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
