package i42;

import androidx.room.i0;
import com.garmin.android.apps.connectmobile.webtranslation.WebTranslationDatabase_Impl;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.HeaderParameterNames;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import md.n;
import p005kotlin.Metadata;
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li42/m;", "Landroidx/room/i0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WebTranslationDatabase_Impl f91021d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(WebTranslationDatabase_Impl webTranslationDatabase_Impl) {
        super(1, "1d5b43bfb11db35dd74cfb706c4312c5", "c7c2198240a03830ea4668f2751d34e6");
        this.f91021d = webTranslationDatabase_Impl;
    }

    @Override // androidx.room.i0
    public final void a(ud.a aVar) {
        vb.h.v(aVar, aVar, "CREATE TABLE IF NOT EXISTS `translation` (`record_id` INTEGER NOT NULL, `handle` TEXT NOT NULL, `text` TEXT NOT NULL, `hash` TEXT NOT NULL, PRIMARY KEY(`record_id`, `handle`), FOREIGN KEY(`record_id`) REFERENCES `installation_record`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )", aVar, "CREATE TABLE IF NOT EXISTS `installation_record` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `locale` TEXT NOT NULL, `version_name` TEXT NOT NULL, `tag` TEXT NOT NULL)");
        oe2.f.o(aVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_installation_record_locale_version_name_tag` ON `installation_record` (`locale`, `version_name`, `tag`)");
        oe2.f.o(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        oe2.f.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1d5b43bfb11db35dd74cfb706c4312c5')");
    }

    @Override // androidx.room.i0
    public final void b(ud.a aVar) {
        vb.h.v(aVar, aVar, "DROP TABLE IF EXISTS `translation`", aVar, "DROP TABLE IF EXISTS `installation_record`");
    }

    @Override // androidx.room.i0
    public final void c(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void d(ud.a aVar) {
        aVar.getClass();
        oe2.f.o(aVar, "PRAGMA foreign_keys = ON");
        int i14 = WebTranslationDatabase_Impl.f47966d;
        this.f91021d.internalInitInvalidationTracker(aVar);
    }

    @Override // androidx.room.i0
    public final void e(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void f(ud.a aVar) {
        aVar.getClass();
        gl1.d.s(aVar);
    }

    @Override // androidx.room.i0
    public final i0.a g(ud.a aVar) {
        aVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("record_id", new n.a("record_id", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("handle", new n.a("handle", "TEXT", true, 2, null, 1));
        linkedHashMap.put("text", new n.a("text", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSetJ = vb.h.j(linkedHashMap, "hash", new n.a("hash", "TEXT", true, 0, null, 1));
        linkedHashSetJ.add(new n.c("installation_record", "CASCADE", "NO ACTION", w.c("record_id"), w.c(TtmlNode.ATTR_ID)));
        n nVar = new n("translation", linkedHashMap, linkedHashSetJ, new LinkedHashSet());
        n.f117868e.getClass();
        n nVarA = n.b.a(aVar, "translation");
        if (!nVar.equals(nVarA)) {
            return new i0.a(false, vb.h.i("translation(com.garmin.android.apps.connectmobile.webtranslation.Translation).\n Expected:\n", nVar, "\n Found:\n", nVarA));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(TtmlNode.ATTR_ID, new n.a(TtmlNode.ATTR_ID, "INTEGER", true, 1, null, 1));
        linkedHashMap2.put("locale", new n.a("locale", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("version_name", new n.a("version_name", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSetJ2 = vb.h.j(linkedHashMap2, HeaderParameterNames.AUTHENTICATION_TAG, new n.a(HeaderParameterNames.AUTHENTICATION_TAG, "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new n.d("index_installation_record_locale_version_name_tag", true, x.k("locale", "version_name", HeaderParameterNames.AUTHENTICATION_TAG), x.k("ASC", "ASC", "ASC")));
        n nVar2 = new n("installation_record", linkedHashMap2, linkedHashSetJ2, linkedHashSet);
        n nVarA2 = n.b.a(aVar, "installation_record");
        return !nVar2.equals(nVarA2) ? new i0.a(false, vb.h.i("installation_record(com.garmin.android.apps.connectmobile.webtranslation.InstallationRecord).\n Expected:\n", nVar2, "\n Found:\n", nVarA2)) : new i0.a(true, null);
    }
}
