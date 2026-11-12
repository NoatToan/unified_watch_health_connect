package com.huami.phn.core.source.impl.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.phn.coach.koin.PHNProjectModuleKt;
import com.huami.phn.core.model.PHNDailyAnalysisResult;
import com.huami.phn.core.model.PHNProjectRecord;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.MD5Util;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@TypeConverters({DailyAnaResultInfoConverter.class, PHNProjectSettingConverter.class, TimeAndZoneConverter.class, JsonObjectConverter.class})
@Database(entities = {PHNProjectRecord.class, PHNDailyAnalysisResult.class}, exportSchema = false, version = 1)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/huami/phn/core/source/impl/db/PHNDataBase;", "Landroidx/room/RoomDatabase;", "Lcom/huami/phn/core/source/impl/db/PHNProjectRecordDao;", "phnProjectRecordDao", "Lcom/huami/phn/core/source/impl/db/PHNDailyAnaResultDao;", "phnDailyAnaResultDao", "<init>", "()V", "Companion", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public abstract class PHNDataBase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final HashMap<String, PHNDataBase> a = new HashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R2\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004`\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/phn/core/source/impl/db/PHNDataBase$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/phn/core/source/impl/db/PHNDataBase;", "getInstance", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", SportAnalytics.ParamValue.MapButtonType.MAP, "Ljava/util/HashMap;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "getInstance userId is empty";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PHNDataBase getInstance(@NotNull Context context) {
            String strInvoke = PHNProjectModuleKt.getPhnUserId().invoke();
            if (strInvoke == null || strInvoke.length() == 0) {
                HMLog.info("PHNDataBase", a.a);
                strInvoke = "default";
            }
            if (PHNDataBase.a.get(strInvoke) == null) {
                PHNDataBase.a.put(strInvoke, Room.databaseBuilder(context.getApplicationContext(), PHNDataBase.class, "phndata-" + MD5Util.getMD5String(strInvoke) + ".db").allowMainThreadQueries().build());
            }
            return (PHNDataBase) PHNDataBase.a.get(strInvoke);
        }
    }

    @NotNull
    public abstract PHNDailyAnaResultDao phnDailyAnaResultDao();

    @NotNull
    public abstract PHNProjectRecordDao phnProjectRecordDao();
}
