package jz0;

import androidx.room.i0;
import com.garmin.android.apps.connectmobile.newsfeed.db.NewsFeedDatabase_Impl;
import gl1.d;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import md.n;
import oe2.f;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljz0/b;", "Landroidx/room/i0;", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NewsFeedDatabase_Impl f101901d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NewsFeedDatabase_Impl newsFeedDatabase_Impl) {
        super(3, "3598db812e0d2fa91972ee0f53a278b8", "90d9baff9db90a6375fdf1e4ed6ffd1f");
        this.f101901d = newsFeedDatabase_Impl;
    }

    @Override // androidx.room.i0
    public final void a(ud.a aVar) {
        h.v(aVar, aVar, "CREATE TABLE IF NOT EXISTS `edited_posts` (`activityId` INTEGER NOT NULL, `local_timestamp` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, PRIMARY KEY(`activityId`))", aVar, "CREATE TABLE IF NOT EXISTS `edited_connections` (`profilePk` INTEGER NOT NULL, `disconnected` INTEGER NOT NULL, PRIMARY KEY(`profilePk`))");
        f.o(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        f.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3598db812e0d2fa91972ee0f53a278b8')");
    }

    @Override // androidx.room.i0
    public final void b(ud.a aVar) {
        h.v(aVar, aVar, "DROP TABLE IF EXISTS `edited_posts`", aVar, "DROP TABLE IF EXISTS `edited_connections`");
    }

    @Override // androidx.room.i0
    public final void c(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void d(ud.a aVar) {
        aVar.getClass();
        int i14 = NewsFeedDatabase_Impl.f39519e;
        this.f101901d.internalInitInvalidationTracker(aVar);
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
        linkedHashMap.put("activityId", new n.a("activityId", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("local_timestamp", new n.a("local_timestamp", "INTEGER", true, 0, null, 1));
        n nVar = new n("edited_posts", linkedHashMap, h.j(linkedHashMap, "deleted", new n.a("deleted", "INTEGER", true, 0, null, 1)), new LinkedHashSet());
        n.f117868e.getClass();
        n nVarA = n.b.a(aVar, "edited_posts");
        if (!nVar.equals(nVarA)) {
            return new i0.a(false, h.i("edited_posts(com.garmin.android.apps.connectmobile.newsfeed.db.entity.NewsFeedEditedPost).\n Expected:\n", nVar, "\n Found:\n", nVarA));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("profilePk", new n.a("profilePk", "INTEGER", true, 1, null, 1));
        n nVar2 = new n("edited_connections", linkedHashMap2, h.j(linkedHashMap2, "disconnected", new n.a("disconnected", "INTEGER", true, 0, null, 1)), new LinkedHashSet());
        n nVarA2 = n.b.a(aVar, "edited_connections");
        return !nVar2.equals(nVarA2) ? new i0.a(false, h.i("edited_connections(com.garmin.android.apps.connectmobile.newsfeed.db.entity.NewsFeedEditedConnection).\n Expected:\n", nVar2, "\n Found:\n", nVarA2)) : new i0.a(true, null);
    }
}
