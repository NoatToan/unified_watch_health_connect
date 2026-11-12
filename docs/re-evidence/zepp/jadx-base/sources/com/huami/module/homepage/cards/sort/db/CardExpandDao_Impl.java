package com.huami.module.homepage.cards.sort.db;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class CardExpandDao_Impl implements CardExpandDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<CardExpand> b;

    public class a extends EntityInsertionAdapter<CardExpand> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, CardExpand cardExpand) {
            if (cardExpand.getCardName() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, cardExpand.getCardName());
            }
            supportSQLiteStatement.bindLong(2, cardExpand.getShowExpand() ? 1L : 0L);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `card_expand` (`cardName`,`showExpand`) VALUES (?,?)";
        }
    }

    public CardExpandDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    @Override // com.huami.module.homepage.cards.sort.db.CardExpandDao
    public void insertCard(final List<CardExpand> cards) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(cards);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.module.homepage.cards.sort.db.CardExpandDao
    public List<CardExpand> queryCard() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from card_expand", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cardName");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "showExpand");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new CardExpand(cursorQuery.getString(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2) != 0));
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th;
        }
    }

    @Override // com.huami.module.homepage.cards.sort.db.CardExpandDao
    public void insertCard(final CardExpand card) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(card);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
