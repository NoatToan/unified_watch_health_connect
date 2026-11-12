package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.electronic.scale.dao.dao.VirtualAccountDao;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class mzq implements VirtualAccountDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f27387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<VirtualAccount> f27388b = new a();
    public final EntityInsertAdapter<VirtualAccount> c = new b();
    public final EntityDeleteOrUpdateAdapter<VirtualAccount> d = new c();

    public class a extends EntityInsertAdapter<VirtualAccount> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, VirtualAccount virtualAccount) {
            if (virtualAccount.getDid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, virtualAccount.getDid());
            }
            if (virtualAccount.getModel() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, virtualAccount.getModel());
            }
            sQLiteStatement.mo50bindLong(3, virtualAccount.getUid());
            sQLiteStatement.mo50bindLong(4, virtualAccount.getAccountId());
            if (virtualAccount.getName() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, virtualAccount.getName());
            }
            if (virtualAccount.getIcon() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, virtualAccount.getIcon());
            }
            sQLiteStatement.mo50bindLong(7, virtualAccount.isDel() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(8, virtualAccount.isSyn() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(9, virtualAccount.getType());
            if (virtualAccount.getBodyComposition() == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, virtualAccount.getBodyComposition());
            }
            if (virtualAccount.getCreateDate() == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, virtualAccount.getCreateDate());
            }
            sQLiteStatement.mo50bindLong(12, virtualAccount.getCreateTime());
            if (virtualAccount.getSn() == null) {
                sQLiteStatement.mo51bindNull(13);
            } else {
                sQLiteStatement.mo52bindText(13, virtualAccount.getSn());
            }
            sQLiteStatement.mo50bindLong(14, virtualAccount.getDataVersion());
            sQLiteStatement.mo50bindLong(15, virtualAccount.getSex());
            sQLiteStatement.mo50bindLong(16, virtualAccount.getBirth());
            sQLiteStatement.mo50bindLong(17, virtualAccount.getHeight());
            sQLiteStatement.mo49bindDouble(18, virtualAccount.getWeightTarget());
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `virtual_account` (`did`,`model`,`uid`,`accountId`,`name`,`icon`,`isDel`,`isSyn`,`type`,`bodyComposition`,`createDate`,`createTime`,`sn`,`dataVersion`,`sex`,`birth`,`height`,`weightTarget`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityInsertAdapter<VirtualAccount> {
        public b() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, VirtualAccount virtualAccount) {
            if (virtualAccount.getDid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, virtualAccount.getDid());
            }
            if (virtualAccount.getModel() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, virtualAccount.getModel());
            }
            sQLiteStatement.mo50bindLong(3, virtualAccount.getUid());
            sQLiteStatement.mo50bindLong(4, virtualAccount.getAccountId());
            if (virtualAccount.getName() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, virtualAccount.getName());
            }
            if (virtualAccount.getIcon() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, virtualAccount.getIcon());
            }
            sQLiteStatement.mo50bindLong(7, virtualAccount.isDel() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(8, virtualAccount.isSyn() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(9, virtualAccount.getType());
            if (virtualAccount.getBodyComposition() == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, virtualAccount.getBodyComposition());
            }
            if (virtualAccount.getCreateDate() == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, virtualAccount.getCreateDate());
            }
            sQLiteStatement.mo50bindLong(12, virtualAccount.getCreateTime());
            if (virtualAccount.getSn() == null) {
                sQLiteStatement.mo51bindNull(13);
            } else {
                sQLiteStatement.mo52bindText(13, virtualAccount.getSn());
            }
            sQLiteStatement.mo50bindLong(14, virtualAccount.getDataVersion());
            sQLiteStatement.mo50bindLong(15, virtualAccount.getSex());
            sQLiteStatement.mo50bindLong(16, virtualAccount.getBirth());
            sQLiteStatement.mo50bindLong(17, virtualAccount.getHeight());
            sQLiteStatement.mo49bindDouble(18, virtualAccount.getWeightTarget());
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR IGNORE INTO `virtual_account` (`did`,`model`,`uid`,`accountId`,`name`,`icon`,`isDel`,`isSyn`,`type`,`bodyComposition`,`createDate`,`createTime`,`sn`,`dataVersion`,`sex`,`birth`,`height`,`weightTarget`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<VirtualAccount> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, VirtualAccount virtualAccount) {
            if (virtualAccount.getDid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, virtualAccount.getDid());
            }
            if (virtualAccount.getModel() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, virtualAccount.getModel());
            }
            sQLiteStatement.mo50bindLong(3, virtualAccount.getUid());
            sQLiteStatement.mo50bindLong(4, virtualAccount.getAccountId());
            if (virtualAccount.getName() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, virtualAccount.getName());
            }
            if (virtualAccount.getIcon() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, virtualAccount.getIcon());
            }
            sQLiteStatement.mo50bindLong(7, virtualAccount.isDel() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(8, virtualAccount.isSyn() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(9, virtualAccount.getType());
            if (virtualAccount.getBodyComposition() == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, virtualAccount.getBodyComposition());
            }
            if (virtualAccount.getCreateDate() == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, virtualAccount.getCreateDate());
            }
            sQLiteStatement.mo50bindLong(12, virtualAccount.getCreateTime());
            if (virtualAccount.getSn() == null) {
                sQLiteStatement.mo51bindNull(13);
            } else {
                sQLiteStatement.mo52bindText(13, virtualAccount.getSn());
            }
            sQLiteStatement.mo50bindLong(14, virtualAccount.getDataVersion());
            sQLiteStatement.mo50bindLong(15, virtualAccount.getSex());
            sQLiteStatement.mo50bindLong(16, virtualAccount.getBirth());
            sQLiteStatement.mo50bindLong(17, virtualAccount.getHeight());
            sQLiteStatement.mo49bindDouble(18, virtualAccount.getWeightTarget());
            sQLiteStatement.mo50bindLong(19, virtualAccount.getCreateTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `virtual_account` SET `did` = ?,`model` = ?,`uid` = ?,`accountId` = ?,`name` = ?,`icon` = ?,`isDel` = ?,`isSyn` = ?,`type` = ?,`bodyComposition` = ?,`createDate` = ?,`createTime` = ?,`sn` = ?,`dataVersion` = ?,`sex` = ?,`birth` = ?,`height` = ?,`weightTarget` = ? WHERE `createTime` = ?";
        }
    }

    public mzq(RoomDatabase roomDatabase) {
        this.f27387a = roomDatabase;
    }

    public static /* synthetic */ List A(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM virtual_account WHERE accountId =? order by createTime desc");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, Column.ACCOUNT_ID);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDel");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSyn");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bodyComposition");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createDate");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sn");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataVersion");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sex");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, MedicalIdSPContract.PREF_BIRTHDAY);
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "height");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "weightTarget");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                VirtualAccount virtualAccount = new VirtualAccount();
                virtualAccount.setDid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                virtualAccount.setModel(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                int i = columnIndexOrThrow2;
                virtualAccount.setUid(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                virtualAccount.setAccountId(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                virtualAccount.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                virtualAccount.setIcon(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                virtualAccount.setDel(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                int i2 = columnIndexOrThrow3;
                virtualAccount.setSyn(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                virtualAccount.setType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                virtualAccount.setBodyComposition(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                virtualAccount.setCreateDate(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                virtualAccount.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                virtualAccount.setSn(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                virtualAccount.setDataVersion((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14));
                int i3 = columnIndexOrThrow15;
                int i4 = columnIndexOrThrow4;
                virtualAccount.setSex((int) sQLiteStatementPrepare.getLong(i3));
                int i5 = columnIndexOrThrow16;
                virtualAccount.setBirth(sQLiteStatementPrepare.getLong(i5));
                int i6 = columnIndexOrThrow17;
                virtualAccount.setHeight((int) sQLiteStatementPrepare.getLong(i6));
                int i7 = columnIndexOrThrow18;
                virtualAccount.setWeightTarget((float) sQLiteStatementPrepare.getDouble(i7));
                arrayList2.add(virtualAccount);
                columnIndexOrThrow4 = i4;
                arrayList = arrayList2;
                columnIndexOrThrow15 = i3;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow18 = i7;
                columnIndexOrThrow16 = i5;
                columnIndexOrThrow2 = i;
                columnIndexOrThrow17 = i6;
                columnIndexOrThrow = columnIndexOrThrow;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List B(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM virtual_account WHERE uid =? order by createTime desc");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, Column.ACCOUNT_ID);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDel");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSyn");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bodyComposition");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createDate");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sn");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataVersion");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sex");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, MedicalIdSPContract.PREF_BIRTHDAY);
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "height");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "weightTarget");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                VirtualAccount virtualAccount = new VirtualAccount();
                virtualAccount.setDid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                virtualAccount.setModel(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                int i = columnIndexOrThrow2;
                virtualAccount.setUid(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                virtualAccount.setAccountId(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                virtualAccount.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                virtualAccount.setIcon(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                virtualAccount.setDel(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                int i2 = columnIndexOrThrow3;
                virtualAccount.setSyn(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                virtualAccount.setType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                virtualAccount.setBodyComposition(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                virtualAccount.setCreateDate(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                virtualAccount.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                virtualAccount.setSn(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                virtualAccount.setDataVersion((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14));
                int i3 = columnIndexOrThrow15;
                int i4 = columnIndexOrThrow4;
                virtualAccount.setSex((int) sQLiteStatementPrepare.getLong(i3));
                int i5 = columnIndexOrThrow16;
                virtualAccount.setBirth(sQLiteStatementPrepare.getLong(i5));
                int i6 = columnIndexOrThrow17;
                virtualAccount.setHeight((int) sQLiteStatementPrepare.getLong(i6));
                int i7 = columnIndexOrThrow18;
                virtualAccount.setWeightTarget((float) sQLiteStatementPrepare.getDouble(i7));
                arrayList2.add(virtualAccount);
                columnIndexOrThrow4 = i4;
                arrayList = arrayList2;
                columnIndexOrThrow15 = i3;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow18 = i7;
                columnIndexOrThrow16 = i5;
                columnIndexOrThrow2 = i;
                columnIndexOrThrow17 = i6;
                columnIndexOrThrow = columnIndexOrThrow;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List C(long j, String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM virtual_account WHERE uid =? and did = ? order by createTime desc");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo52bindText(2, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, Column.ACCOUNT_ID);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDel");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSyn");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bodyComposition");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createDate");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sn");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataVersion");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sex");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, MedicalIdSPContract.PREF_BIRTHDAY);
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "height");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "weightTarget");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                VirtualAccount virtualAccount = new VirtualAccount();
                virtualAccount.setDid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                virtualAccount.setModel(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                int i = columnIndexOrThrow13;
                int i2 = columnIndexOrThrow14;
                virtualAccount.setUid(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                virtualAccount.setAccountId(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                virtualAccount.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                virtualAccount.setIcon(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                virtualAccount.setDel(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                int i3 = columnIndexOrThrow2;
                int i4 = columnIndexOrThrow3;
                virtualAccount.setSyn(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                virtualAccount.setType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                virtualAccount.setBodyComposition(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                virtualAccount.setCreateDate(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                virtualAccount.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                virtualAccount.setSn(sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i));
                int i5 = columnIndexOrThrow4;
                virtualAccount.setDataVersion((int) sQLiteStatementPrepare.getLong(i2));
                int i6 = columnIndexOrThrow15;
                int i7 = columnIndexOrThrow5;
                virtualAccount.setSex((int) sQLiteStatementPrepare.getLong(i6));
                int i8 = columnIndexOrThrow16;
                virtualAccount.setBirth(sQLiteStatementPrepare.getLong(i8));
                int i9 = columnIndexOrThrow17;
                columnIndexOrThrow16 = i8;
                virtualAccount.setHeight((int) sQLiteStatementPrepare.getLong(i9));
                int i10 = columnIndexOrThrow18;
                virtualAccount.setWeightTarget((float) sQLiteStatementPrepare.getDouble(i10));
                arrayList2.add(virtualAccount);
                columnIndexOrThrow5 = i7;
                columnIndexOrThrow15 = i6;
                columnIndexOrThrow17 = i9;
                columnIndexOrThrow18 = i10;
                arrayList = arrayList2;
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow4 = i5;
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow3 = i4;
                columnIndexOrThrow13 = i;
                columnIndexOrThrow = columnIndexOrThrow;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List D(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM virtual_account WHERE accountId =? AND createTime < ? order by createTime desc");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, Column.ACCOUNT_ID);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDel");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSyn");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bodyComposition");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createDate");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sn");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataVersion");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sex");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, MedicalIdSPContract.PREF_BIRTHDAY);
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "height");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "weightTarget");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                VirtualAccount virtualAccount = new VirtualAccount();
                virtualAccount.setDid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                virtualAccount.setModel(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                int i = columnIndexOrThrow2;
                virtualAccount.setUid(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                virtualAccount.setAccountId(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                virtualAccount.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                virtualAccount.setIcon(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                virtualAccount.setDel(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                int i2 = columnIndexOrThrow3;
                virtualAccount.setSyn(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                virtualAccount.setType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                virtualAccount.setBodyComposition(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                virtualAccount.setCreateDate(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                virtualAccount.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                virtualAccount.setSn(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                virtualAccount.setDataVersion((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14));
                int i3 = columnIndexOrThrow15;
                int i4 = columnIndexOrThrow4;
                virtualAccount.setSex((int) sQLiteStatementPrepare.getLong(i3));
                int i5 = columnIndexOrThrow16;
                virtualAccount.setBirth(sQLiteStatementPrepare.getLong(i5));
                int i6 = columnIndexOrThrow17;
                virtualAccount.setHeight((int) sQLiteStatementPrepare.getLong(i6));
                int i7 = columnIndexOrThrow18;
                virtualAccount.setWeightTarget((float) sQLiteStatementPrepare.getDouble(i7));
                arrayList2.add(virtualAccount);
                columnIndexOrThrow4 = i4;
                columnIndexOrThrow15 = i3;
                columnIndexOrThrow17 = i6;
                columnIndexOrThrow18 = i7;
                arrayList = arrayList2;
                columnIndexOrThrow2 = i;
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow16 = i5;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List E(long j, long j2, long j3, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM virtual_account WHERE accountId =? AND createTime BETWEEN ? AND ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            sQLiteStatementPrepare.mo50bindLong(3, j3);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, Column.ACCOUNT_ID);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDel");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSyn");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bodyComposition");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createDate");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sn");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataVersion");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sex");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, MedicalIdSPContract.PREF_BIRTHDAY);
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "height");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "weightTarget");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                VirtualAccount virtualAccount = new VirtualAccount();
                virtualAccount.setDid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                virtualAccount.setModel(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                int i = columnIndexOrThrow2;
                virtualAccount.setUid(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                virtualAccount.setAccountId(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                virtualAccount.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                virtualAccount.setIcon(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                virtualAccount.setDel(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                int i2 = columnIndexOrThrow3;
                virtualAccount.setSyn(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                virtualAccount.setType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                virtualAccount.setBodyComposition(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                virtualAccount.setCreateDate(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                virtualAccount.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                virtualAccount.setSn(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                virtualAccount.setDataVersion((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14));
                int i3 = columnIndexOrThrow15;
                int i4 = columnIndexOrThrow4;
                virtualAccount.setSex((int) sQLiteStatementPrepare.getLong(i3));
                int i5 = columnIndexOrThrow16;
                virtualAccount.setBirth(sQLiteStatementPrepare.getLong(i5));
                int i6 = columnIndexOrThrow17;
                virtualAccount.setHeight((int) sQLiteStatementPrepare.getLong(i6));
                int i7 = columnIndexOrThrow18;
                virtualAccount.setWeightTarget((float) sQLiteStatementPrepare.getDouble(i7));
                arrayList2.add(virtualAccount);
                columnIndexOrThrow4 = i4;
                columnIndexOrThrow15 = i3;
                columnIndexOrThrow17 = i6;
                columnIndexOrThrow18 = i7;
                arrayList = arrayList2;
                columnIndexOrThrow2 = i;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow16 = i5;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List F(long j, long j2, long j3, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM virtual_account WHERE accountId =? AND createTime BETWEEN ? AND ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            sQLiteStatementPrepare.mo50bindLong(3, j3);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, Column.ACCOUNT_ID);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDel");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSyn");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bodyComposition");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createDate");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sn");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataVersion");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sex");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, MedicalIdSPContract.PREF_BIRTHDAY);
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "height");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "weightTarget");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                VirtualAccount virtualAccount = new VirtualAccount();
                virtualAccount.setDid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                virtualAccount.setModel(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                int i = columnIndexOrThrow2;
                virtualAccount.setUid(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                virtualAccount.setAccountId(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                virtualAccount.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                virtualAccount.setIcon(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                virtualAccount.setDel(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                int i2 = columnIndexOrThrow3;
                virtualAccount.setSyn(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                virtualAccount.setType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                virtualAccount.setBodyComposition(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                virtualAccount.setCreateDate(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                virtualAccount.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                virtualAccount.setSn(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                virtualAccount.setDataVersion((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14));
                int i3 = columnIndexOrThrow15;
                int i4 = columnIndexOrThrow4;
                virtualAccount.setSex((int) sQLiteStatementPrepare.getLong(i3));
                int i5 = columnIndexOrThrow16;
                virtualAccount.setBirth(sQLiteStatementPrepare.getLong(i5));
                int i6 = columnIndexOrThrow17;
                virtualAccount.setHeight((int) sQLiteStatementPrepare.getLong(i6));
                int i7 = columnIndexOrThrow18;
                virtualAccount.setWeightTarget((float) sQLiteStatementPrepare.getDouble(i7));
                arrayList2.add(virtualAccount);
                columnIndexOrThrow4 = i4;
                columnIndexOrThrow15 = i3;
                columnIndexOrThrow17 = i6;
                columnIndexOrThrow18 = i7;
                arrayList = arrayList2;
                columnIndexOrThrow2 = i;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow16 = i5;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static List<Class<?>> r() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Integer t(long j, String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM virtual_account WHERE uid =? AND did =?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo52bindText(2, str);
            }
            sQLiteStatementPrepare.step();
            return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List z(long j, String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM virtual_account WHERE accountId =? and did = ? order by createTime desc");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo52bindText(2, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, Column.ACCOUNT_ID);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDel");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSyn");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bodyComposition");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createDate");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sn");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataVersion");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sex");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, MedicalIdSPContract.PREF_BIRTHDAY);
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "height");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "weightTarget");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                VirtualAccount virtualAccount = new VirtualAccount();
                virtualAccount.setDid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                virtualAccount.setModel(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                int i = columnIndexOrThrow13;
                int i2 = columnIndexOrThrow14;
                virtualAccount.setUid(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                virtualAccount.setAccountId(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                virtualAccount.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                virtualAccount.setIcon(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                virtualAccount.setDel(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                int i3 = columnIndexOrThrow2;
                int i4 = columnIndexOrThrow3;
                virtualAccount.setSyn(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                virtualAccount.setType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                virtualAccount.setBodyComposition(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                virtualAccount.setCreateDate(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                virtualAccount.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                virtualAccount.setSn(sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i));
                int i5 = columnIndexOrThrow4;
                virtualAccount.setDataVersion((int) sQLiteStatementPrepare.getLong(i2));
                int i6 = columnIndexOrThrow15;
                int i7 = columnIndexOrThrow5;
                virtualAccount.setSex((int) sQLiteStatementPrepare.getLong(i6));
                int i8 = columnIndexOrThrow16;
                virtualAccount.setBirth(sQLiteStatementPrepare.getLong(i8));
                int i9 = columnIndexOrThrow17;
                columnIndexOrThrow16 = i8;
                virtualAccount.setHeight((int) sQLiteStatementPrepare.getLong(i9));
                int i10 = columnIndexOrThrow18;
                virtualAccount.setWeightTarget((float) sQLiteStatementPrepare.getDouble(i10));
                arrayList2.add(virtualAccount);
                columnIndexOrThrow5 = i7;
                columnIndexOrThrow15 = i6;
                columnIndexOrThrow17 = i9;
                columnIndexOrThrow18 = i10;
                arrayList = arrayList2;
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow4 = i5;
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow3 = i4;
                columnIndexOrThrow13 = i;
                columnIndexOrThrow = columnIndexOrThrow;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Integer G(VirtualAccount virtualAccount, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.d.handle(sQLiteConnection, virtualAccount));
    }

    public final /* synthetic */ Integer H(VirtualAccount virtualAccount, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.d.handle(sQLiteConnection, virtualAccount));
    }

    public final /* synthetic */ Integer I(List list, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.d.handleMultiple(sQLiteConnection, list));
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public Object update(final VirtualAccount virtualAccount, Continuation<? super Integer> continuation) {
        virtualAccount.getClass();
        return DBUtil.performSuspending(this.f27387a, false, true, new Function1() { // from class: bzq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f4758a.G(virtualAccount, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.dao.VirtualAccountDao
    public Object deleteVirtualAccount(final long j, final String str, Continuation<? super Integer> continuation) {
        return DBUtil.performSuspending(this.f27387a, false, true, new Function1() { // from class: zyq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return mzq.t(j, str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super VirtualAccount> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f27387a, true, false, new Function1() { // from class: fzq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f18405a.u(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.dao.VirtualAccountDao
    public Object insertVirtualAccount(final VirtualAccount virtualAccount, Continuation<? super Long> continuation) {
        virtualAccount.getClass();
        return DBUtil.performSuspending(this.f27387a, false, true, new Function1() { // from class: azq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f3620a.w(virtualAccount, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.dao.VirtualAccountDao
    public Object insertVirtualAccountI(final VirtualAccount virtualAccount, Continuation<? super Long> continuation) {
        virtualAccount.getClass();
        return DBUtil.performSuspending(this.f27387a, false, true, new Function1() { // from class: czq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f14896a.x(virtualAccount, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<VirtualAccount>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f27387a, true, false, new Function1() { // from class: dzq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f16097a.y(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final VirtualAccount q(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "did");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "model");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "uid");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, Column.ACCOUNT_ID);
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "name");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "icon");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isDel");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isSyn");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "type");
        int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "bodyComposition");
        int columnIndex11 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "createDate");
        int columnIndex12 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "createTime");
        int columnIndex13 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "sn");
        int columnIndex14 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "dataVersion");
        int columnIndex15 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "sex");
        int columnIndex16 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, MedicalIdSPContract.PREF_BIRTHDAY);
        int columnIndex17 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "height");
        int columnIndex18 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "weightTarget");
        VirtualAccount virtualAccount = new VirtualAccount();
        if (columnIndex != -1) {
            virtualAccount.setDid(sQLiteStatement.isNull(columnIndex) ? null : sQLiteStatement.getText(columnIndex));
        }
        if (columnIndex2 != -1) {
            virtualAccount.setModel(sQLiteStatement.isNull(columnIndex2) ? null : sQLiteStatement.getText(columnIndex2));
        }
        if (columnIndex3 != -1) {
            virtualAccount.setUid(sQLiteStatement.getLong(columnIndex3));
        }
        if (columnIndex4 != -1) {
            virtualAccount.setAccountId(sQLiteStatement.getLong(columnIndex4));
        }
        if (columnIndex5 != -1) {
            virtualAccount.setName(sQLiteStatement.isNull(columnIndex5) ? null : sQLiteStatement.getText(columnIndex5));
        }
        if (columnIndex6 != -1) {
            virtualAccount.setIcon(sQLiteStatement.isNull(columnIndex6) ? null : sQLiteStatement.getText(columnIndex6));
        }
        if (columnIndex7 != -1) {
            virtualAccount.setDel(((int) sQLiteStatement.getLong(columnIndex7)) != 0);
        }
        if (columnIndex8 != -1) {
            virtualAccount.setSyn(((int) sQLiteStatement.getLong(columnIndex8)) != 0);
        }
        if (columnIndex9 != -1) {
            virtualAccount.setType((int) sQLiteStatement.getLong(columnIndex9));
        }
        if (columnIndex10 != -1) {
            virtualAccount.setBodyComposition(sQLiteStatement.isNull(columnIndex10) ? null : sQLiteStatement.getText(columnIndex10));
        }
        if (columnIndex11 != -1) {
            virtualAccount.setCreateDate(sQLiteStatement.isNull(columnIndex11) ? null : sQLiteStatement.getText(columnIndex11));
        }
        if (columnIndex12 != -1) {
            virtualAccount.setCreateTime(sQLiteStatement.getLong(columnIndex12));
        }
        if (columnIndex13 != -1) {
            virtualAccount.setSn(sQLiteStatement.isNull(columnIndex13) ? null : sQLiteStatement.getText(columnIndex13));
        }
        if (columnIndex14 != -1) {
            virtualAccount.setDataVersion((int) sQLiteStatement.getLong(columnIndex14));
        }
        if (columnIndex15 != -1) {
            virtualAccount.setSex((int) sQLiteStatement.getLong(columnIndex15));
        }
        if (columnIndex16 != -1) {
            virtualAccount.setBirth(sQLiteStatement.getLong(columnIndex16));
        }
        if (columnIndex17 != -1) {
            virtualAccount.setHeight((int) sQLiteStatement.getLong(columnIndex17));
        }
        if (columnIndex18 != -1) {
            virtualAccount.setWeightTarget((float) sQLiteStatement.getDouble(columnIndex18));
        }
        return virtualAccount;
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.dao.VirtualAccountDao
    public Object queryByAccountIdAndDid(final long j, final String str, Continuation<? super List<VirtualAccount>> continuation) {
        return DBUtil.performSuspending(this.f27387a, true, false, new Function1() { // from class: wyq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return mzq.z(j, str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.dao.VirtualAccountDao
    public Object queryByAid(final long j, Continuation<? super List<VirtualAccount>> continuation) {
        return DBUtil.performSuspending(this.f27387a, true, false, new Function1() { // from class: yyq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return mzq.A(j, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.dao.VirtualAccountDao
    public Object queryByUid(final long j, Continuation<? super List<VirtualAccount>> continuation) {
        return DBUtil.performSuspending(this.f27387a, true, false, new Function1() { // from class: lzq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return mzq.B(j, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.dao.VirtualAccountDao
    public Object queryByUidAndDid(final long j, final String str, Continuation<? super List<VirtualAccount>> continuation) {
        return DBUtil.performSuspending(this.f27387a, true, false, new Function1() { // from class: kzq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return mzq.C(j, str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.dao.VirtualAccountDao
    public Object queryLastWeightRecordByCreateTime(final long j, final long j2, Continuation<? super List<VirtualAccount>> continuation) {
        return DBUtil.performSuspending(this.f27387a, true, false, new Function1() { // from class: xyq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return mzq.D(j, j2, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.dao.VirtualAccountDao
    public Object queryVirtualDayData(final long j, final long j2, final long j3, Continuation<? super List<VirtualAccount>> continuation) {
        return DBUtil.performSuspending(this.f27387a, true, false, new Function1() { // from class: izq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return mzq.E(j, j2, j3, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.dao.VirtualAccountDao
    public Object queryVirtualStatisticsData(final long j, final long j2, final long j3, Continuation<? super List<VirtualAccount>> continuation) {
        return DBUtil.performSuspending(this.f27387a, true, false, new Function1() { // from class: hzq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return mzq.F(j, j2, j3, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Object insert(final VirtualAccount[] virtualAccountArr, Continuation<? super Unit> continuation) {
        virtualAccountArr.getClass();
        return DBUtil.performSuspending(this.f27387a, false, true, new Function1() { // from class: ezq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f17235a.v(virtualAccountArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ VirtualAccount u(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? q(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.dao.VirtualAccountDao
    public Object updateVirtualAccount(final VirtualAccount virtualAccount, Continuation<? super Integer> continuation) {
        virtualAccount.getClass();
        return DBUtil.performSuspending(this.f27387a, false, true, new Function1() { // from class: gzq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f19509a.H(virtualAccount, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit v(VirtualAccount[] virtualAccountArr, SQLiteConnection sQLiteConnection) {
        this.f27388b.insert(sQLiteConnection, virtualAccountArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Long w(VirtualAccount virtualAccount, SQLiteConnection sQLiteConnection) {
        return Long.valueOf(this.f27388b.insertAndReturnId(sQLiteConnection, virtualAccount));
    }

    public final /* synthetic */ Long x(VirtualAccount virtualAccount, SQLiteConnection sQLiteConnection) {
        return Long.valueOf(this.c.insertAndReturnId(sQLiteConnection, virtualAccount));
    }

    public final /* synthetic */ List y(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(q(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.dao.VirtualAccountDao
    public Object updateVirtualAccount(final List<VirtualAccount> list, Continuation<? super Integer> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.f27387a, false, true, new Function1() { // from class: jzq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f23274a.I(list, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
