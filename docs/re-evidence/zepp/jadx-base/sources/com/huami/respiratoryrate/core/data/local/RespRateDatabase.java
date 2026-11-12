package com.huami.respiratoryrate.core.data.local;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.respiratoryrate.core.data.local.dao.RespRateDao;
import com.huami.respiratoryrate.core.data.local.entity.RespRateEntity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.MD5Util;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Database(entities = {RespRateEntity.class}, version = 1)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/respiratoryrate/core/data/local/RespRateDatabase;", "Landroidx/room/RoomDatabase;", "Lcom/huami/respiratoryrate/core/data/local/dao/RespRateDao;", "respRateDao", "<init>", "()V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public abstract class RespRateDatabase extends RoomDatabase {

    @NotNull
    private static final String a = "RespiratoryRateDatabase";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final HashMap<String, RespRateDatabase> b = new HashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR2\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\nj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006`\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/respiratoryrate/core/data/local/RespRateDatabase$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "userId", "Lcom/huami/respiratoryrate/core/data/local/RespRateDatabase;", "getInstance", "TAG", "Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", SportAnalytics.ParamValue.MapButtonType.MAP, "Ljava/util/HashMap;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
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
        public final RespRateDatabase getInstance(@NotNull Context context, @NotNull String userId) {
            if (userId.length() == 0) {
                HMLog.info(RespRateDatabase.a, a.a);
                userId = "default";
            }
            String mD5String = MD5Util.getMD5String(userId);
            if (RespRateDatabase.b.get(userId) == null) {
                synchronized (RespRateDatabase.class) {
                    if (RespRateDatabase.b.get(userId) == null) {
                        RespRateDatabase.b.put(userId, Room.databaseBuilder(context.getApplicationContext(), RespRateDatabase.class, Intrinsics.stringPlus("respiratory_rate_db_", mD5String)).allowMainThreadQueries().build());
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return (RespRateDatabase) RespRateDatabase.b.get(userId);
        }
    }

    @NotNull
    public abstract RespRateDao respRateDao();
}
