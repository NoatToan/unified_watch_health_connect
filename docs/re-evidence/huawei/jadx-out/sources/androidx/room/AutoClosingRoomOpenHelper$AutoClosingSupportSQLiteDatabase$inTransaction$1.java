package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import defpackage.zcn;
import defpackage.zcp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 extends zcn implements Function1<SupportSQLiteDatabase, Boolean> {
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1();

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
        zcp.c(supportSQLiteDatabase, "");
        return Boolean.valueOf(supportSQLiteDatabase.inTransaction());
    }

    AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1() {
        super(1, SupportSQLiteDatabase.class, "inTransaction", "inTransaction()Z", 0);
    }
}
