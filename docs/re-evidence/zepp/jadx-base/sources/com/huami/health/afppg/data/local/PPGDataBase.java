package com.huami.health.afppg.data.local;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.huami.health.afppg.data.local.bean.AFibData;
import com.huami.health.afppg.data.local.bean.HREventData;
import com.huami.health.afppg.data.local.bean.RRPeak;
import com.huami.health.afppg.data.local.dao.AFibDao;
import com.huami.health.afppg.data.local.dao.HREventDao;
import com.huami.health.afppg.data.local.dao.RRPeakDao;
import com.huami.moving.ui.utils.SportAnalytics;
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

/* JADX INFO: loaded from: classes9.dex */
@Database(entities = {RRPeak.class, AFibData.class, HREventData.class}, exportSchema = true, version = 1)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/huami/health/afppg/data/local/PPGDataBase;", "Landroidx/room/RoomDatabase;", "Lcom/huami/health/afppg/data/local/dao/RRPeakDao;", "rrPeakDAO", "Lcom/huami/health/afppg/data/local/dao/AFibDao;", "afibDAO", "Lcom/huami/health/afppg/data/local/dao/HREventDao;", "hrEventDAO", "<init>", "()V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public abstract class PPGDataBase extends RoomDatabase {

    @NotNull
    private static final String a = "af_ppg_PPGDataBase";

    @Nullable
    private static String b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final HashMap<String, PPGDataBase> c = new HashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR2\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\nj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006`\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/huami/health/afppg/data/local/PPGDataBase$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "userId", "Lcom/huami/health/afppg/data/local/PPGDataBase;", "getInstance", "TAG", "Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", SportAnalytics.ParamValue.MapButtonType.MAP, "Ljava/util/HashMap;", "<init>", "()V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
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
        public final PPGDataBase getInstance(@NotNull Context context, @NotNull String userId) {
            String str;
            if (userId.length() == 0) {
                HMLog.info(PPGDataBase.a, a.a);
                str = "default";
            } else {
                str = userId;
            }
            if (PPGDataBase.c.get(str) == null) {
                synchronized (PPGDataBase.class) {
                    if (PPGDataBase.c.get(str) == null) {
                        PPGDataBase.c.put(str, Room.databaseBuilder(context.getApplicationContext(), PPGDataBase.class, Intrinsics.stringPlus("ppg_db_", MD5Util.getMD5String(userId))).allowMainThreadQueries().build());
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return (PPGDataBase) PPGDataBase.c.get(str);
        }
    }

    @NotNull
    public abstract AFibDao afibDAO();

    @NotNull
    public abstract HREventDao hrEventDAO();

    @NotNull
    public abstract RRPeakDao rrPeakDAO();
}
