package iq;

import androidx.room.i0;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.activities.stats.exercises.database.RecentSelectedExercisesDatabase_Impl;
import gl1.d;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import md.n;
import oe2.f;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liq/b;", "Landroidx/room/i0;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RecentSelectedExercisesDatabase_Impl f94725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RecentSelectedExercisesDatabase_Impl recentSelectedExercisesDatabase_Impl) {
        super(1, "40e6f886cea909bdc602e5bd12bf2a15", "e342e71b1d838b87889c1e7b967ca90b");
        this.f94725d = recentSelectedExercisesDatabase_Impl;
    }

    @Override // androidx.room.i0
    public final void a(ud.a aVar) {
        h.v(aVar, aVar, "CREATE TABLE IF NOT EXISTS `recent_selected_exercises` (`key` TEXT NOT NULL, `category` TEXT NOT NULL, `categoryTranslation` TEXT NOT NULL, `counterPart` TEXT NOT NULL, `isBodyWeight` INTEGER NOT NULL, `exerciseTypeKey` TEXT NOT NULL, `exerciseTranslation` TEXT NOT NULL, `selectTimestamp` INTEGER NOT NULL, PRIMARY KEY(`key`))", aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        f.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '40e6f886cea909bdc602e5bd12bf2a15')");
    }

    @Override // androidx.room.i0
    public final void b(ud.a aVar) {
        aVar.getClass();
        f.o(aVar, "DROP TABLE IF EXISTS `recent_selected_exercises`");
    }

    @Override // androidx.room.i0
    public final void c(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void d(ud.a aVar) {
        aVar.getClass();
        int i14 = RecentSelectedExercisesDatabase_Impl.f29921d;
        this.f94725d.internalInitInvalidationTracker(aVar);
    }

    @Override // androidx.room.i0
    public final void e(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void f(ud.a aVar) {
        aVar.getClass();
        d.s(aVar);
    }

    @Override // androidx.room.i0
    public final i0.a g(ud.a aVar) {
        aVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Action.KEY_ATTRIBUTE, new n.a(Action.KEY_ATTRIBUTE, "TEXT", true, 1, null, 1));
        linkedHashMap.put("category", new n.a("category", "TEXT", true, 0, null, 1));
        linkedHashMap.put("categoryTranslation", new n.a("categoryTranslation", "TEXT", true, 0, null, 1));
        linkedHashMap.put("counterPart", new n.a("counterPart", "TEXT", true, 0, null, 1));
        linkedHashMap.put("isBodyWeight", new n.a("isBodyWeight", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("exerciseTypeKey", new n.a("exerciseTypeKey", "TEXT", true, 0, null, 1));
        linkedHashMap.put("exerciseTranslation", new n.a("exerciseTranslation", "TEXT", true, 0, null, 1));
        n nVar = new n("recent_selected_exercises", linkedHashMap, h.j(linkedHashMap, "selectTimestamp", new n.a("selectTimestamp", "INTEGER", true, 0, null, 1)), new LinkedHashSet());
        n.f117868e.getClass();
        n nVarA = n.b.a(aVar, "recent_selected_exercises");
        return !nVar.equals(nVarA) ? new i0.a(false, h.i("recent_selected_exercises(com.garmin.android.apps.connectmobile.activities.stats.exercises.database.RecentSelectedExercisesEntity).\n Expected:\n", nVar, "\n Found:\n", nVarA)) : new i0.a(true, null);
    }
}
