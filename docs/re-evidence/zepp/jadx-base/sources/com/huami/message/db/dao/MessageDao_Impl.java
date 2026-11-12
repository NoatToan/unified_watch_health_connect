package com.huami.message.db.dao;

import android.database.Cursor;
import androidx.p008lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.message.api.WebConst;
import com.huami.message.db.po.MessageCount;
import com.huami.message.db.po.NotificationPo;
import com.huami.message.db.po.PrivateMessagePo;
import com.huami.message.db.po.SubMessagePo;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public final class MessageDao_Impl extends MessageDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<PrivateMessagePo> b;
    private final EntityInsertionAdapter<SubMessagePo> c;
    private final EntityInsertionAdapter<NotificationPo> d;
    private final EntityInsertionAdapter<MessageCount> e;
    private final SharedSQLiteStatement f;
    private final SharedSQLiteStatement g;
    private final SharedSQLiteStatement h;
    private final SharedSQLiteStatement i;
    private final SharedSQLiteStatement j;
    private final SharedSQLiteStatement k;
    private final SharedSQLiteStatement l;
    private final SharedSQLiteStatement m;
    private final SharedSQLiteStatement n;
    private final SharedSQLiteStatement o;

    public class a extends SharedSQLiteStatement {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM NotificationPo";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE SubMessagePo SET status = ? WHERE messageId = ?";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE SubMessagePo SET followStatus = ? WHERE followeeId = ?";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE MessageCount SET count = ?";
        }
    }

    public class e extends SharedSQLiteStatement {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE MessageCount SET count = ? WHERE noticeType = ?";
        }
    }

    public class f extends DataSource.Factory<Integer, PrivateMessagePo> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public class a extends LimitOffsetDataSource<PrivateMessagePo> {
            public a(RoomDatabase roomDatabase, RoomSQLiteQuery roomSQLiteQuery, boolean z, String... strArr) {
                super(roomDatabase, roomSQLiteQuery, z, strArr);
            }

            @Override // androidx.room.paging.LimitOffsetDataSource
            public List<PrivateMessagePo> convertRows(Cursor cursor) {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor, WebConst.QueryParam.MESSAGE_ID);
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor, "userId");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor, WebAPI.PARAM_SHARE_INVITE_AVATAR);
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor, "nickName");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor, "count");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor, "messageStatus");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursor, "content");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursor, "generateTime");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursor, "nextIndex");
                ArrayList arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    arrayList.add(new PrivateMessagePo(cursor.getLong(columnIndexOrThrow), cursor.getLong(columnIndexOrThrow2), cursor.getString(columnIndexOrThrow3), cursor.getString(columnIndexOrThrow4), cursor.getString(columnIndexOrThrow5), cursor.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow6)), cursor.getString(columnIndexOrThrow7), cursor.getString(columnIndexOrThrow8), cursor.isNull(columnIndexOrThrow9) ? null : Long.valueOf(cursor.getLong(columnIndexOrThrow9)), cursor.getString(columnIndexOrThrow10)));
                }
                return arrayList;
            }
        }

        public f(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // androidx.paging.DataSource.Factory
        public DataSource<Integer, PrivateMessagePo> create() {
            return new a(MessageDao_Impl.this.a, this.a, false, "PrivateMessagePo");
        }
    }

    public class g extends DataSource.Factory<Integer, SubMessagePo> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public class a extends LimitOffsetDataSource<SubMessagePo> {
            public a(RoomDatabase roomDatabase, RoomSQLiteQuery roomSQLiteQuery, boolean z, String... strArr) {
                super(roomDatabase, roomSQLiteQuery, z, strArr);
            }

            @Override // androidx.room.paging.LimitOffsetDataSource
            public List<SubMessagePo> convertRows(Cursor cursor) {
                Cursor cursor2 = cursor;
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor2, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor2, WebConst.QueryParam.MESSAGE_ID);
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor2, "count");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor2, "dataType");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor2, "day");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor2, "description");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor2, "followeeId");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursor2, "from");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursor2, "fromFirstCommentId");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursor2, "fromPostId");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursor2, "fromSecondCommentId");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursor2, "fromTopicId");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursor2, "generateTime");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursor2, "generatedTime");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursor2, "hrvType");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursor2, "iconUrl");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursor2, ParamKey.memberId);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursor2, WebConst.QueryParam.MESSAGE_SUB_TYPE);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursor2, "nickName");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursor2, WebConst.QueryParam.NOTICE_TYPE);
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursor2, "status");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursor2, "subType");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursor2, "text");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursor2, "subText");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursor2, "title");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursor2, "type");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursor2, "resource");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursor2, "resourceType");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursor2, "followStatus");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    int i2 = columnIndexOrThrow15;
                    arrayList.add(new SubMessagePo(cursor2.getInt(columnIndexOrThrow), cursor2.getLong(columnIndexOrThrow2), cursor2.isNull(columnIndexOrThrow3) ? null : Integer.valueOf(cursor2.getInt(columnIndexOrThrow3)), cursor2.getString(columnIndexOrThrow4), cursor2.getString(columnIndexOrThrow5), cursor2.getString(columnIndexOrThrow6), cursor2.getString(columnIndexOrThrow7), cursor2.getString(columnIndexOrThrow8), cursor2.getString(columnIndexOrThrow9), cursor2.getString(columnIndexOrThrow10), cursor2.getString(columnIndexOrThrow11), cursor2.getString(columnIndexOrThrow12), cursor2.isNull(columnIndexOrThrow13) ? null : Long.valueOf(cursor2.getLong(columnIndexOrThrow13)), cursor2.isNull(i) ? null : Long.valueOf(cursor2.getLong(i)), cursor2.getString(i2), cursor2.getString(columnIndexOrThrow16), cursor2.getString(columnIndexOrThrow17), cursor2.getString(columnIndexOrThrow18), cursor2.getString(columnIndexOrThrow19), cursor2.getString(columnIndexOrThrow20), cursor2.getString(columnIndexOrThrow21), cursor2.getString(columnIndexOrThrow22), cursor2.getString(columnIndexOrThrow23), cursor2.getString(columnIndexOrThrow24), cursor2.getString(columnIndexOrThrow25), cursor2.getString(columnIndexOrThrow26), cursor2.getString(columnIndexOrThrow27), cursor2.getString(columnIndexOrThrow28), cursor2.getString(columnIndexOrThrow29)));
                    cursor2 = cursor;
                    columnIndexOrThrow = columnIndexOrThrow;
                    columnIndexOrThrow15 = i2;
                    i = i;
                }
                return arrayList;
            }
        }

        public g(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // androidx.paging.DataSource.Factory
        public DataSource<Integer, SubMessagePo> create() {
            return new a(MessageDao_Impl.this.a, this.a, false, "SubMessagePo");
        }
    }

    public class h extends DataSource.Factory<Integer, NotificationPo> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public class a extends LimitOffsetDataSource<NotificationPo> {
            public a(RoomDatabase roomDatabase, RoomSQLiteQuery roomSQLiteQuery, boolean z, String... strArr) {
                super(roomDatabase, roomSQLiteQuery, z, strArr);
            }

            @Override // androidx.room.paging.LimitOffsetDataSource
            public List<NotificationPo> convertRows(Cursor cursor) {
                Cursor cursor2 = cursor;
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor2, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor2, WebConst.QueryParam.MESSAGE_ID);
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor2, "generateTime");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor2, "iconUrl");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor2, "groupExType");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor2, "status");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor2, "text");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursor2, "title");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursor2, "subTypeName");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursor2, "typeName");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursor2, "jumpType");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursor2, "url");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursor2, "pushUrl");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursor2, WebConst.QueryParam.NOTICE_TYPE);
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursor2, "subType");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    int i2 = i;
                    arrayList.add(new NotificationPo(cursor2.getInt(columnIndexOrThrow), cursor2.getLong(columnIndexOrThrow2), cursor2.isNull(columnIndexOrThrow3) ? null : Long.valueOf(cursor2.getLong(columnIndexOrThrow3)), cursor2.getString(columnIndexOrThrow4), cursor2.getString(columnIndexOrThrow5), cursor2.getString(columnIndexOrThrow6), cursor2.getString(columnIndexOrThrow7), cursor2.getString(columnIndexOrThrow8), cursor2.getString(columnIndexOrThrow9), cursor2.getString(columnIndexOrThrow10), cursor2.getString(columnIndexOrThrow11), cursor2.getString(columnIndexOrThrow12), cursor2.getString(columnIndexOrThrow13), cursor2.getString(i2), cursor2.getString(columnIndexOrThrow15)));
                    cursor2 = cursor;
                    columnIndexOrThrow = columnIndexOrThrow;
                    i = i2;
                }
                return arrayList;
            }
        }

        public h(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // androidx.paging.DataSource.Factory
        public DataSource<Integer, NotificationPo> create() {
            return new a(MessageDao_Impl.this.a, this.a, false, "NotificationPo");
        }
    }

    public class i implements Callable<Integer> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public i(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() throws Exception {
            Integer numValueOf = null;
            Cursor cursorQuery = DBUtil.query(MessageDao_Impl.this.a, this.a, false, null);
            try {
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    numValueOf = Integer.valueOf(cursorQuery.getInt(0));
                }
                return numValueOf;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class j implements Callable<Integer> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public j(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() throws Exception {
            Integer numValueOf = null;
            Cursor cursorQuery = DBUtil.query(MessageDao_Impl.this.a, this.a, false, null);
            try {
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    numValueOf = Integer.valueOf(cursorQuery.getInt(0));
                }
                return numValueOf;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class k extends EntityInsertionAdapter<PrivateMessagePo> {
        public k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, PrivateMessagePo privateMessagePo) {
            supportSQLiteStatement.bindLong(1, privateMessagePo.getId());
            supportSQLiteStatement.bindLong(2, privateMessagePo.getMessageId());
            if (privateMessagePo.getUserId() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, privateMessagePo.getUserId());
            }
            if (privateMessagePo.getAvatar() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, privateMessagePo.getAvatar());
            }
            if (privateMessagePo.getNickName() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, privateMessagePo.getNickName());
            }
            if (privateMessagePo.getCount() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindLong(6, privateMessagePo.getCount().intValue());
            }
            if (privateMessagePo.getMessageStatus() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, privateMessagePo.getMessageStatus());
            }
            if (privateMessagePo.getContent() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, privateMessagePo.getContent());
            }
            if (privateMessagePo.getGenerateTime() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindLong(9, privateMessagePo.getGenerateTime().longValue());
            }
            if (privateMessagePo.getNextIndex() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, privateMessagePo.getNextIndex());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `PrivateMessagePo` (`id`,`messageId`,`userId`,`avatar`,`nickName`,`count`,`messageStatus`,`content`,`generateTime`,`nextIndex`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
        }
    }

    public class l implements Callable<Integer> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public l(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() throws Exception {
            Integer numValueOf = null;
            Cursor cursorQuery = DBUtil.query(MessageDao_Impl.this.a, this.a, false, null);
            try {
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    numValueOf = Integer.valueOf(cursorQuery.getInt(0));
                }
                return numValueOf;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class m implements Callable<List<MessageCount>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public m(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<MessageCount> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(MessageDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, WebConst.QueryParam.NOTICE_TYPE);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mainType");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "count");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "status");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new MessageCount(cursorQuery.getString(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5)));
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

    public class n extends EntityInsertionAdapter<SubMessagePo> {
        public n(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, SubMessagePo subMessagePo) {
            supportSQLiteStatement.bindLong(1, subMessagePo.getId());
            supportSQLiteStatement.bindLong(2, subMessagePo.getMessageId());
            if (subMessagePo.getCount() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindLong(3, subMessagePo.getCount().intValue());
            }
            if (subMessagePo.getDataType() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, subMessagePo.getDataType());
            }
            if (subMessagePo.getDay() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, subMessagePo.getDay());
            }
            if (subMessagePo.getDescription() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, subMessagePo.getDescription());
            }
            if (subMessagePo.getFolloweeId() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, subMessagePo.getFolloweeId());
            }
            if (subMessagePo.getFrom() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, subMessagePo.getFrom());
            }
            if (subMessagePo.getFromFirstCommentId() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, subMessagePo.getFromFirstCommentId());
            }
            if (subMessagePo.getFromPostId() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, subMessagePo.getFromPostId());
            }
            if (subMessagePo.getFromSecondCommentId() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, subMessagePo.getFromSecondCommentId());
            }
            if (subMessagePo.getFromTopicId() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, subMessagePo.getFromTopicId());
            }
            if (subMessagePo.getGenerateTime() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindLong(13, subMessagePo.getGenerateTime().longValue());
            }
            if (subMessagePo.getGeneratedTime() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindLong(14, subMessagePo.getGeneratedTime().longValue());
            }
            if (subMessagePo.getHrvType() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, subMessagePo.getHrvType());
            }
            if (subMessagePo.getIconUrl() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, subMessagePo.getIconUrl());
            }
            if (subMessagePo.getMemberId() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindString(17, subMessagePo.getMemberId());
            }
            if (subMessagePo.getMessageSubType() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindString(18, subMessagePo.getMessageSubType());
            }
            if (subMessagePo.getNickName() == null) {
                supportSQLiteStatement.bindNull(19);
            } else {
                supportSQLiteStatement.bindString(19, subMessagePo.getNickName());
            }
            if (subMessagePo.getNoticeType() == null) {
                supportSQLiteStatement.bindNull(20);
            } else {
                supportSQLiteStatement.bindString(20, subMessagePo.getNoticeType());
            }
            if (subMessagePo.getStatus() == null) {
                supportSQLiteStatement.bindNull(21);
            } else {
                supportSQLiteStatement.bindString(21, subMessagePo.getStatus());
            }
            if (subMessagePo.getSubType() == null) {
                supportSQLiteStatement.bindNull(22);
            } else {
                supportSQLiteStatement.bindString(22, subMessagePo.getSubType());
            }
            if (subMessagePo.getText() == null) {
                supportSQLiteStatement.bindNull(23);
            } else {
                supportSQLiteStatement.bindString(23, subMessagePo.getText());
            }
            if (subMessagePo.getSubText() == null) {
                supportSQLiteStatement.bindNull(24);
            } else {
                supportSQLiteStatement.bindString(24, subMessagePo.getSubText());
            }
            if (subMessagePo.getTitle() == null) {
                supportSQLiteStatement.bindNull(25);
            } else {
                supportSQLiteStatement.bindString(25, subMessagePo.getTitle());
            }
            if (subMessagePo.getType() == null) {
                supportSQLiteStatement.bindNull(26);
            } else {
                supportSQLiteStatement.bindString(26, subMessagePo.getType());
            }
            if (subMessagePo.getResource() == null) {
                supportSQLiteStatement.bindNull(27);
            } else {
                supportSQLiteStatement.bindString(27, subMessagePo.getResource());
            }
            if (subMessagePo.getResourceType() == null) {
                supportSQLiteStatement.bindNull(28);
            } else {
                supportSQLiteStatement.bindString(28, subMessagePo.getResourceType());
            }
            if (subMessagePo.getFollowStatus() == null) {
                supportSQLiteStatement.bindNull(29);
            } else {
                supportSQLiteStatement.bindString(29, subMessagePo.getFollowStatus());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `SubMessagePo` (`id`,`messageId`,`count`,`dataType`,`day`,`description`,`followeeId`,`from`,`fromFirstCommentId`,`fromPostId`,`fromSecondCommentId`,`fromTopicId`,`generateTime`,`generatedTime`,`hrvType`,`iconUrl`,`memberId`,`messageSubType`,`nickName`,`noticeType`,`status`,`subType`,`text`,`subText`,`title`,`type`,`resource`,`resourceType`,`followStatus`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class o extends EntityInsertionAdapter<NotificationPo> {
        public o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, NotificationPo notificationPo) {
            supportSQLiteStatement.bindLong(1, notificationPo.getId());
            supportSQLiteStatement.bindLong(2, notificationPo.getMessageId());
            if (notificationPo.getGenerateTime() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindLong(3, notificationPo.getGenerateTime().longValue());
            }
            if (notificationPo.getIconUrl() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, notificationPo.getIconUrl());
            }
            if (notificationPo.getGroupExType() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, notificationPo.getGroupExType());
            }
            if (notificationPo.getStatus() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, notificationPo.getStatus());
            }
            if (notificationPo.getText() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, notificationPo.getText());
            }
            if (notificationPo.getTitle() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, notificationPo.getTitle());
            }
            if (notificationPo.getSubTypeName() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, notificationPo.getSubTypeName());
            }
            if (notificationPo.getTypeName() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, notificationPo.getTypeName());
            }
            if (notificationPo.getJumpType() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, notificationPo.getJumpType());
            }
            if (notificationPo.getUrl() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, notificationPo.getUrl());
            }
            if (notificationPo.getPushUrl() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, notificationPo.getPushUrl());
            }
            if (notificationPo.getNoticeType() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, notificationPo.getNoticeType());
            }
            if (notificationPo.getSubType() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, notificationPo.getSubType());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `NotificationPo` (`id`,`messageId`,`generateTime`,`iconUrl`,`groupExType`,`status`,`text`,`title`,`subTypeName`,`typeName`,`jumpType`,`url`,`pushUrl`,`noticeType`,`subType`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class p extends EntityInsertionAdapter<MessageCount> {
        public p(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, MessageCount messageCount) {
            if (messageCount.getNoticeType() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, messageCount.getNoticeType());
            }
            if (messageCount.getMainType() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, messageCount.getMainType());
            }
            if (messageCount.getSubType() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, messageCount.getSubType());
            }
            supportSQLiteStatement.bindLong(4, messageCount.getCount());
            if (messageCount.getStatus() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, messageCount.getStatus());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `MessageCount` (`noticeType`,`mainType`,`subType`,`count`,`status`) VALUES (?,?,?,?,?)";
        }
    }

    public class q extends SharedSQLiteStatement {
        public q(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE PrivateMessagePo SET messageStatus = ? WHERE messageId = ?";
        }
    }

    public class r extends SharedSQLiteStatement {
        public r(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE PrivateMessagePo SET messageStatus = ?";
        }
    }

    public class s extends SharedSQLiteStatement {
        public s(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM PrivateMessagePo WHERE messageId = ?";
        }
    }

    public class t extends SharedSQLiteStatement {
        public t(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM PrivateMessagePo";
        }
    }

    public class u extends SharedSQLiteStatement {
        public u(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM SubMessagePo";
        }
    }

    public MessageDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new k(roomDatabase);
        this.c = new n(roomDatabase);
        this.d = new o(roomDatabase);
        this.e = new p(roomDatabase);
        this.f = new q(roomDatabase);
        this.g = new r(roomDatabase);
        this.h = new s(roomDatabase);
        this.i = new t(roomDatabase);
        this.j = new u(roomDatabase);
        this.k = new a(roomDatabase);
        this.l = new b(roomDatabase);
        this.m = new c(roomDatabase);
        this.n = new d(roomDatabase);
        this.o = new e(roomDatabase);
    }

    @Override // com.huami.message.db.dao.MessageDao
    public void decreaseMessageCount(String str, String str2, List<String> list, int i2) {
        this.a.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("UPDATE MessageCount SET count = count - ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" WHERE noticeType = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" AND mainType = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" AND subType IN (");
        StringUtil.appendPlaceholders(sbNewStringBuilder, list.size());
        sbNewStringBuilder.append(")");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = this.a.compileStatement(sbNewStringBuilder.toString());
        supportSQLiteStatementCompileStatement.bindLong(1, i2);
        if (str == null) {
            supportSQLiteStatementCompileStatement.bindNull(2);
        } else {
            supportSQLiteStatementCompileStatement.bindString(2, str);
        }
        if (str2 == null) {
            supportSQLiteStatementCompileStatement.bindNull(3);
        } else {
            supportSQLiteStatementCompileStatement.bindString(3, str2);
        }
        int i3 = 4;
        for (String str3 : list) {
            if (str3 == null) {
                supportSQLiteStatementCompileStatement.bindNull(i3);
            } else {
                supportSQLiteStatementCompileStatement.bindString(i3, str3);
            }
            i3++;
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementCompileStatement.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public void deleteFullPrivateMessagePo() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.i.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.i.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public void deleteNotificationPo() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.k.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.k.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public void deletePrivateMessagePo(long j2) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.h.acquire();
        supportSQLiteStatementAcquire.bindLong(1, j2);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.h.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public void deleteSubMessagePo() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.j.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.j.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public void insertMessageCount(List<MessageCount> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.e.insert(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public List<Long> insertNotificationList(List<NotificationPo> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            List<Long> listInsertAndReturnIdsList = this.d.insertAndReturnIdsList(list);
            this.a.setTransactionSuccessful();
            return listInsertAndReturnIdsList;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public long insertPrivateMessage(PrivateMessagePo privateMessagePo) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long jInsertAndReturnId = this.b.insertAndReturnId(privateMessagePo);
            this.a.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public List<Long> insertPrivateMessageList(List<PrivateMessagePo> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            List<Long> listInsertAndReturnIdsList = this.b.insertAndReturnIdsList(list);
            this.a.setTransactionSuccessful();
            return listInsertAndReturnIdsList;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public List<Long> insertSubMessageList(List<SubMessagePo> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            List<Long> listInsertAndReturnIdsList = this.c.insertAndReturnIdsList(list);
            this.a.setTransactionSuccessful();
            return listInsertAndReturnIdsList;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public long notificationPoCount() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) FROM NotificationPo", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getLong(0) : 0L;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public long privateMessagePoCount() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) FROM PrivateMessagePo", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getLong(0) : 0L;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public LiveData<Integer> queryAllMessageCount() {
        return this.a.getInvalidationTracker().createLiveData(new String[]{"MessageCount"}, false, new i(RoomSQLiteQuery.acquire("SELECT SUM(MessageCount.count) FROM MessageCount", 0)));
    }

    @Override // com.huami.message.db.dao.MessageDao
    public LiveData<List<MessageCount>> queryAllMessageCountPo() {
        return this.a.getInvalidationTracker().createLiveData(new String[]{"MessageCount"}, false, new m(RoomSQLiteQuery.acquire("SELECT * FROM MessageCount", 0)));
    }

    @Override // com.huami.message.db.dao.MessageDao
    public DataSource.Factory<Integer, PrivateMessagePo> queryFullPrivateMessageByPaging() {
        return new f(RoomSQLiteQuery.acquire("SELECT * FROM PrivateMessagePo", 0));
    }

    @Override // com.huami.message.db.dao.MessageDao
    public LiveData<Integer> queryMessageCount(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT SUM(MessageCount.count) FROM MessageCount WHERE noticeType = ?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        return this.a.getInvalidationTracker().createLiveData(new String[]{"MessageCount"}, false, new j(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.message.db.dao.MessageDao
    public DataSource.Factory<Integer, NotificationPo> queryNotificationByPaging() {
        return new h(RoomSQLiteQuery.acquire("SELECT * FROM NotificationPo", 0));
    }

    @Override // com.huami.message.db.dao.MessageDao
    public DataSource.Factory<Integer, SubMessagePo> querySubMessageByPaging(String str, List<String> list) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT ");
        sbNewStringBuilder.append("*");
        sbNewStringBuilder.append(" FROM SubMessagePo WHERE noticeType = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" AND messageSubType IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size + 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        int i2 = 2;
        for (String str2 : list) {
            if (str2 == null) {
                roomSQLiteQueryAcquire.bindNull(i2);
            } else {
                roomSQLiteQueryAcquire.bindString(i2, str2);
            }
            i2++;
        }
        return new g(roomSQLiteQueryAcquire);
    }

    @Override // com.huami.message.db.dao.MessageDao
    public SubMessagePo querySubMessagePoByType(String str, String str2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        SubMessagePo subMessagePo;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM SubMessagePo WHERE noticeType = ? AND messageSubType = ?", 2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        if (str2 == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str2);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, WebConst.QueryParam.MESSAGE_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "count");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dataType");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "day");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "description");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "followeeId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "from");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fromFirstCommentId");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fromPostId");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fromSecondCommentId");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fromTopicId");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generateTime");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hrvType");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "iconUrl");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.memberId);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, WebConst.QueryParam.MESSAGE_SUB_TYPE);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nickName");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, WebConst.QueryParam.NOTICE_TYPE);
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "status");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "text");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subText");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "title");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "resource");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "resourceType");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "followStatus");
                if (cursorQuery.moveToFirst()) {
                    subMessagePo = new SubMessagePo(cursorQuery.getInt(columnIndexOrThrow), cursorQuery.getLong(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow3)), cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getString(columnIndexOrThrow9), cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getString(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow13)), cursorQuery.isNull(columnIndexOrThrow14) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow14)), cursorQuery.getString(columnIndexOrThrow15), cursorQuery.getString(columnIndexOrThrow16), cursorQuery.getString(columnIndexOrThrow17), cursorQuery.getString(columnIndexOrThrow18), cursorQuery.getString(columnIndexOrThrow19), cursorQuery.getString(columnIndexOrThrow20), cursorQuery.getString(columnIndexOrThrow21), cursorQuery.getString(columnIndexOrThrow22), cursorQuery.getString(columnIndexOrThrow23), cursorQuery.getString(columnIndexOrThrow24), cursorQuery.getString(columnIndexOrThrow25), cursorQuery.getString(columnIndexOrThrow26), cursorQuery.getString(columnIndexOrThrow27), cursorQuery.getString(columnIndexOrThrow28), cursorQuery.getString(columnIndexOrThrow29));
                } else {
                    subMessagePo = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return subMessagePo;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public long subMessagePoCount(String str, List<String> list) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT COUNT(*) FROM SubMessagePo WHERE noticeType = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" AND messageSubType IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size + 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        int i2 = 2;
        for (String str2 : list) {
            if (str2 == null) {
                roomSQLiteQueryAcquire.bindNull(i2);
            } else {
                roomSQLiteQueryAcquire.bindString(i2, str2);
            }
            i2++;
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getLong(0) : 0L;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public void updateAllMessageStatus(String str) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.g.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.g.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public void updateFullMessageStatus(String str) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.g.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.g.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public void updateMessageCount(int i2) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.n.acquire();
        supportSQLiteStatementAcquire.bindLong(1, i2);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.n.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public void updateMessageStatus(long j2, String str) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        supportSQLiteStatementAcquire.bindLong(2, j2);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.f.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public void updateSubMessage(long j2, String str) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.l.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        supportSQLiteStatementAcquire.bindLong(2, j2);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.l.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public void updateSubMessageForFollowStatus(String str, String str2) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.m.acquire();
        if (str2 == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str2);
        }
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(2);
        } else {
            supportSQLiteStatementAcquire.bindString(2, str);
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.m.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public LiveData<Integer> queryMessageCount(String str, String str2, List<String> list) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT SUM(MessageCount.count) FROM MessageCount WHERE noticeType = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" AND mainType = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" AND subType IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size + 2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        if (str2 == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str2);
        }
        int i2 = 3;
        for (String str3 : list) {
            if (str3 == null) {
                roomSQLiteQueryAcquire.bindNull(i2);
            } else {
                roomSQLiteQueryAcquire.bindString(i2, str3);
            }
            i2++;
        }
        return this.a.getInvalidationTracker().createLiveData(new String[]{"MessageCount"}, false, new l(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.message.db.dao.MessageDao
    public void deleteSubMessagePo(String str, List<String> list) {
        this.a.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("DELETE FROM SubMessagePo WHERE noticeType = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" AND messageSubType IN (");
        StringUtil.appendPlaceholders(sbNewStringBuilder, list.size());
        sbNewStringBuilder.append(")");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = this.a.compileStatement(sbNewStringBuilder.toString());
        if (str == null) {
            supportSQLiteStatementCompileStatement.bindNull(1);
        } else {
            supportSQLiteStatementCompileStatement.bindString(1, str);
        }
        int i2 = 2;
        for (String str2 : list) {
            if (str2 == null) {
                supportSQLiteStatementCompileStatement.bindNull(i2);
            } else {
                supportSQLiteStatementCompileStatement.bindString(i2, str2);
            }
            i2++;
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementCompileStatement.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public void updateMessageCount(String str, int i2) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.o.acquire();
        supportSQLiteStatementAcquire.bindLong(1, i2);
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(2);
        } else {
            supportSQLiteStatementAcquire.bindString(2, str);
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.o.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.message.db.dao.MessageDao
    public void updateMessageCount(String str, String str2, List<String> list, int i2) {
        this.a.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("UPDATE MessageCount SET count = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" WHERE noticeType = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" AND mainType = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" AND subType IN (");
        StringUtil.appendPlaceholders(sbNewStringBuilder, list.size());
        sbNewStringBuilder.append(")");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = this.a.compileStatement(sbNewStringBuilder.toString());
        supportSQLiteStatementCompileStatement.bindLong(1, i2);
        if (str == null) {
            supportSQLiteStatementCompileStatement.bindNull(2);
        } else {
            supportSQLiteStatementCompileStatement.bindString(2, str);
        }
        if (str2 == null) {
            supportSQLiteStatementCompileStatement.bindNull(3);
        } else {
            supportSQLiteStatementCompileStatement.bindString(3, str2);
        }
        int i3 = 4;
        for (String str3 : list) {
            if (str3 == null) {
                supportSQLiteStatementCompileStatement.bindNull(i3);
            } else {
                supportSQLiteStatementCompileStatement.bindString(i3, str3);
            }
            i3++;
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
