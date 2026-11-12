package com.huami.module.homepage.cards.sort.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes11.dex */
public final class CardSequenceDao_Impl implements CardSequenceDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<CardSequence> b;
    private final SharedSQLiteStatement c;

    public class a extends EntityInsertionAdapter<CardSequence> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, CardSequence cardSequence) {
            if (cardSequence.getCardName() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, cardSequence.getCardName());
            }
            supportSQLiteStatement.bindLong(2, cardSequence.getShowCard() ? 1L : 0L);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `card_sequence` (`cardName`,`showCard`) VALUES (?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from card_sequence";
        }
    }

    public class c implements Callable<List<CardSequence>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public c(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<CardSequence> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(CardSequenceDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cardName");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "showCard");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new CardSequence(cursorQuery.getString(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2) != 0));
                }
                cursorQuery.close();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public CardSequenceDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
    }

    @Override // com.huami.module.homepage.cards.sort.db.CardSequenceDao
    public void clearCards() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.c.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.c.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.module.homepage.cards.sort.db.CardSequenceDao
    public void insertCard(final List<CardSequence> cards) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(cards);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.module.homepage.cards.sort.db.CardSequenceDao
    public List<CardSequence> queryCard() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from card_sequence", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cardName");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "showCard");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new CardSequence(cursorQuery.getString(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2) != 0));
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

    @Override // com.huami.module.homepage.cards.sort.db.CardSequenceDao
    public Flow<List<CardSequence>> queryCardFlow() {
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"card_sequence"}, new c(RoomSQLiteQuery.acquire("select * from card_sequence", 0)));
    }

    @Override // com.huami.module.homepage.cards.sort.db.CardSequenceDao
    public void removeCards(final List<String> list) {
        this.a.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("delete from card_sequence where cardName in(");
        StringUtil.appendPlaceholders(sbNewStringBuilder, list.size());
        sbNewStringBuilder.append(")");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = this.a.compileStatement(sbNewStringBuilder.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                supportSQLiteStatementCompileStatement.bindNull(i);
            } else {
                supportSQLiteStatementCompileStatement.bindString(i, str);
            }
            i++;
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementCompileStatement.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
