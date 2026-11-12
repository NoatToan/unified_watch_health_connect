package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.user.DallyGoalItem;
import com.xiaomi.fitness.account.user.StringListCoverter;
import com.xiaomi.fitness.account.user.UserDao;
import com.xiaomi.fitness.account.user.UserInfoProfile;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class gfq implements UserDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f18934a;
    public final StringListCoverter c = new StringListCoverter();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<UserInfoProfile> f18935b = new a();
    public final EntityDeleteOrUpdateAdapter<UserInfoProfile> d = new b();

    public class a extends EntityInsertAdapter<UserInfoProfile> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, UserInfoProfile userInfoProfile) {
            if (userInfoProfile.getName() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, userInfoProfile.getName());
            }
            if (userInfoProfile.getIcon() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, userInfoProfile.getIcon());
            }
            if (userInfoProfile.getSex() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, userInfoProfile.getSex());
            }
            if (userInfoProfile.getBirth() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, userInfoProfile.getBirth());
            }
            sQLiteStatement.mo49bindDouble(5, userInfoProfile.getHeight());
            sQLiteStatement.mo49bindDouble(6, userInfoProfile.getWeight());
            if (userInfoProfile.getRegion() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, userInfoProfile.getRegion());
            }
            sQLiteStatement.mo50bindLong(8, userInfoProfile.getVo2Max());
            sQLiteStatement.mo50bindLong(9, userInfoProfile.getMaxHrm());
            sQLiteStatement.mo50bindLong(10, userInfoProfile.getMinHrm());
            String strRecordMaxHrmToString = gfq.this.c.recordMaxHrmToString(userInfoProfile.getRecordMaxHrm());
            if (strRecordMaxHrmToString == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, strRecordMaxHrmToString);
            }
            if (userInfoProfile.getSource() == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, userInfoProfile.getSource());
            }
            sQLiteStatement.mo50bindLong(13, userInfoProfile.getDailyCalGoal());
            sQLiteStatement.mo50bindLong(14, userInfoProfile.getDailyStepGoal());
            sQLiteStatement.mo50bindLong(15, userInfoProfile.getDailySleepGoal());
            String strArrayToString = gfq.this.c.arrayToString(userInfoProfile.getRegularGoalList());
            if (strArrayToString == null) {
                sQLiteStatement.mo51bindNull(16);
            } else {
                sQLiteStatement.mo52bindText(16, strArrayToString);
            }
            sQLiteStatement.mo50bindLong(17, userInfoProfile.getSpecialMark());
            sQLiteStatement.mo49bindDouble(18, userInfoProfile.getInitialWeight());
            sQLiteStatement.mo50bindLong(19, userInfoProfile.getInitialTimestamp());
            sQLiteStatement.mo49bindDouble(20, userInfoProfile.getMaximalMet());
            String strMedalString = gfq.this.c.medalString(userInfoProfile.getWear_medal());
            if (strMedalString == null) {
                sQLiteStatement.mo51bindNull(21);
            } else {
                sQLiteStatement.mo52bindText(21, strMedalString);
            }
            String strListToString = gfq.this.c.listToString(userInfoProfile.getDids());
            if (strListToString == null) {
                sQLiteStatement.mo51bindNull(22);
            } else {
                sQLiteStatement.mo52bindText(22, strListToString);
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `user_info_profile` (`name`,`icon`,`sex`,`birth`,`height`,`weight`,`region`,`vo2_max`,`max_hrm`,`min_hrm`,`record_max_hrm`,`source`,`daily_cal_goal`,`daily_step_goal`,`daily_sleep_goal`,`regular_goal_list`,`special_mark`,`initial_weight`,`initial_timestamp`,`maximal_met`,`wear_medal`,`dids`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<UserInfoProfile> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, UserInfoProfile userInfoProfile) {
            if (userInfoProfile.getName() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, userInfoProfile.getName());
            }
            if (userInfoProfile.getIcon() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, userInfoProfile.getIcon());
            }
            if (userInfoProfile.getSex() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, userInfoProfile.getSex());
            }
            if (userInfoProfile.getBirth() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, userInfoProfile.getBirth());
            }
            sQLiteStatement.mo49bindDouble(5, userInfoProfile.getHeight());
            sQLiteStatement.mo49bindDouble(6, userInfoProfile.getWeight());
            if (userInfoProfile.getRegion() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, userInfoProfile.getRegion());
            }
            sQLiteStatement.mo50bindLong(8, userInfoProfile.getVo2Max());
            sQLiteStatement.mo50bindLong(9, userInfoProfile.getMaxHrm());
            sQLiteStatement.mo50bindLong(10, userInfoProfile.getMinHrm());
            String strRecordMaxHrmToString = gfq.this.c.recordMaxHrmToString(userInfoProfile.getRecordMaxHrm());
            if (strRecordMaxHrmToString == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, strRecordMaxHrmToString);
            }
            if (userInfoProfile.getSource() == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, userInfoProfile.getSource());
            }
            sQLiteStatement.mo50bindLong(13, userInfoProfile.getDailyCalGoal());
            sQLiteStatement.mo50bindLong(14, userInfoProfile.getDailyStepGoal());
            sQLiteStatement.mo50bindLong(15, userInfoProfile.getDailySleepGoal());
            String strArrayToString = gfq.this.c.arrayToString(userInfoProfile.getRegularGoalList());
            if (strArrayToString == null) {
                sQLiteStatement.mo51bindNull(16);
            } else {
                sQLiteStatement.mo52bindText(16, strArrayToString);
            }
            sQLiteStatement.mo50bindLong(17, userInfoProfile.getSpecialMark());
            sQLiteStatement.mo49bindDouble(18, userInfoProfile.getInitialWeight());
            sQLiteStatement.mo50bindLong(19, userInfoProfile.getInitialTimestamp());
            sQLiteStatement.mo49bindDouble(20, userInfoProfile.getMaximalMet());
            String strMedalString = gfq.this.c.medalString(userInfoProfile.getWear_medal());
            if (strMedalString == null) {
                sQLiteStatement.mo51bindNull(21);
            } else {
                sQLiteStatement.mo52bindText(21, strMedalString);
            }
            String strListToString = gfq.this.c.listToString(userInfoProfile.getDids());
            if (strListToString == null) {
                sQLiteStatement.mo51bindNull(22);
            } else {
                sQLiteStatement.mo52bindText(22, strListToString);
            }
            if (userInfoProfile.getName() == null) {
                sQLiteStatement.mo51bindNull(23);
            } else {
                sQLiteStatement.mo52bindText(23, userInfoProfile.getName());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `user_info_profile` SET `name` = ?,`icon` = ?,`sex` = ?,`birth` = ?,`height` = ?,`weight` = ?,`region` = ?,`vo2_max` = ?,`max_hrm` = ?,`min_hrm` = ?,`record_max_hrm` = ?,`source` = ?,`daily_cal_goal` = ?,`daily_step_goal` = ?,`daily_sleep_goal` = ?,`regular_goal_list` = ?,`special_mark` = ?,`initial_weight` = ?,`initial_timestamp` = ?,`maximal_met` = ?,`wear_medal` = ?,`dids` = ? WHERE `name` = ?";
        }
    }

    public gfq(RoomDatabase roomDatabase) {
        this.f18934a = roomDatabase;
    }

    public static List<Class<?>> h() {
        return Collections.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.xiaomi.fitness.account.user.StringListCoverter] */
    /* JADX WARN: Type inference failed for: r49v0, types: [java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final UserInfoProfile g(SQLiteStatement sQLiteStatement) {
        UserProfile.RecordMaxHrm recordMaxHrmStringToRecordMaxHrm;
        List<DallyGoalItem> listStringToArray;
        UserProfile.UserWearMedal userWearMedalStringToMedal;
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "name");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "icon");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "sex");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, MedicalIdSPContract.PREF_BIRTHDAY);
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "height");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "weight");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "region");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, FitnessPersistKey.Vo2Max);
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "max_hrm");
        int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "min_hrm");
        int columnIndex11 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "record_max_hrm");
        int columnIndex12 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "source");
        int columnIndex13 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "daily_cal_goal");
        int columnIndex14 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "daily_step_goal");
        int columnIndex15 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "daily_sleep_goal");
        int columnIndex16 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "regular_goal_list");
        int columnIndex17 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "special_mark");
        int columnIndex18 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "initial_weight");
        int columnIndex19 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "initial_timestamp");
        int columnIndex20 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "maximal_met");
        int columnIndex21 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "wear_medal");
        int columnIndex22 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "dids");
        Object objStringToList = null;
        String text = (columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex);
        String text2 = (columnIndex2 == -1 || sQLiteStatement.isNull(columnIndex2)) ? null : sQLiteStatement.getText(columnIndex2);
        String text3 = (columnIndex3 == -1 || sQLiteStatement.isNull(columnIndex3)) ? null : sQLiteStatement.getText(columnIndex3);
        String text4 = (columnIndex4 == -1 || sQLiteStatement.isNull(columnIndex4)) ? null : sQLiteStatement.getText(columnIndex4);
        float f = columnIndex5 == -1 ? 0.0f : (float) sQLiteStatement.getDouble(columnIndex5);
        float f2 = columnIndex6 == -1 ? 0.0f : (float) sQLiteStatement.getDouble(columnIndex6);
        String text5 = (columnIndex7 == -1 || sQLiteStatement.isNull(columnIndex7)) ? null : sQLiteStatement.getText(columnIndex7);
        int i = columnIndex8 == -1 ? 0 : (int) sQLiteStatement.getLong(columnIndex8);
        int i2 = columnIndex9 == -1 ? 0 : (int) sQLiteStatement.getLong(columnIndex9);
        int i3 = columnIndex10 == -1 ? 0 : (int) sQLiteStatement.getLong(columnIndex10);
        if (columnIndex11 == -1) {
            recordMaxHrmStringToRecordMaxHrm = null;
        } else {
            recordMaxHrmStringToRecordMaxHrm = this.c.stringToRecordMaxHrm(sQLiteStatement.isNull(columnIndex11) ? null : sQLiteStatement.getText(columnIndex11));
        }
        String text6 = (columnIndex12 == -1 || sQLiteStatement.isNull(columnIndex12)) ? null : sQLiteStatement.getText(columnIndex12);
        int i4 = columnIndex13 == -1 ? 0 : (int) sQLiteStatement.getLong(columnIndex13);
        int i5 = columnIndex14 == -1 ? 0 : (int) sQLiteStatement.getLong(columnIndex14);
        int i6 = columnIndex15 == -1 ? 0 : (int) sQLiteStatement.getLong(columnIndex15);
        if (columnIndex16 == -1) {
            listStringToArray = null;
        } else {
            listStringToArray = this.c.stringToArray(sQLiteStatement.isNull(columnIndex16) ? null : sQLiteStatement.getText(columnIndex16));
        }
        int i7 = r19 != -1 ? (int) sQLiteStatement.getLong(columnIndex17) : 0;
        float f3 = columnIndex18 == -1 ? 0.0f : (float) sQLiteStatement.getDouble(columnIndex18);
        long j = columnIndex19 == -1 ? 0L : sQLiteStatement.getLong(columnIndex19);
        float f4 = columnIndex20 != -1 ? (float) sQLiteStatement.getDouble(columnIndex20) : 0.0f;
        if (columnIndex21 == -1) {
            userWearMedalStringToMedal = null;
        } else {
            userWearMedalStringToMedal = this.c.stringToMedal(sQLiteStatement.isNull(columnIndex21) ? null : sQLiteStatement.getText(columnIndex21));
        }
        if (columnIndex22 != -1) {
            objStringToList = this.c.stringToList(sQLiteStatement.isNull(columnIndex22) ? null : sQLiteStatement.getText(columnIndex22));
        }
        return new UserInfoProfile(text, text2, text3, text4, f, f2, text5, i, i2, i3, recordMaxHrmStringToRecordMaxHrm, text6, i4, i5, i6, listStringToArray, i7, f3, j, f4, userWearMedalStringToMedal, objStringToList);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super UserInfoProfile> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f18934a, true, false, new Function1() { // from class: ffq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f17746a.j(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.account.user.UserDao
    public UserInfoProfile getUserInfoProfileByName(final String str) {
        return (UserInfoProfile) DBUtil.performBlocking(this.f18934a, true, false, new Function1() { // from class: dfq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f15493a.k(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Object insert(final UserInfoProfile[] userInfoProfileArr, Continuation<? super Unit> continuation) {
        userInfoProfileArr.getClass();
        return DBUtil.performSuspending(this.f18934a, false, true, new Function1() { // from class: efq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f16608a.l(userInfoProfileArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ UserInfoProfile j(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? g(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final /* synthetic */ UserInfoProfile k(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM USER_INFO_PROFILE WHERE name = ? limit 1");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sex");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, MedicalIdSPContract.PREF_BIRTHDAY);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "height");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "weight");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "region");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessPersistKey.Vo2Max);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "max_hrm");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "min_hrm");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "record_max_hrm");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "source");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "daily_cal_goal");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "daily_step_goal");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "daily_sleep_goal");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "regular_goal_list");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "special_mark");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_weight");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_timestamp");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "maximal_met");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wear_medal");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dids");
            UserInfoProfile userInfoProfile = null;
            if (sQLiteStatementPrepare.step()) {
                userInfoProfile = new UserInfoProfile(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow5), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), this.c.stringToRecordMaxHrm(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11)), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow15), this.c.stringToArray(sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16)), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow17), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow18), sQLiteStatementPrepare.getLong(columnIndexOrThrow19), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow20), this.c.stringToMedal(sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21)), this.c.stringToList(sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22)));
            }
            sQLiteStatementPrepare.close();
            return userInfoProfile;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public final /* synthetic */ Unit l(UserInfoProfile[] userInfoProfileArr, SQLiteConnection sQLiteConnection) {
        this.f18935b.insert(sQLiteConnection, userInfoProfileArr);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<UserInfoProfile>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f18934a, true, false, new Function1() { // from class: cfq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f5291a.m(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ List m(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(g(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public final /* synthetic */ Integer n(UserInfoProfile userInfoProfile, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.d.handle(sQLiteConnection, userInfoProfile));
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Object update(final UserInfoProfile userInfoProfile, Continuation<? super Integer> continuation) {
        userInfoProfile.getClass();
        return DBUtil.performSuspending(this.f18934a, false, true, new Function1() { // from class: afq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f959a.n(userInfoProfile, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
