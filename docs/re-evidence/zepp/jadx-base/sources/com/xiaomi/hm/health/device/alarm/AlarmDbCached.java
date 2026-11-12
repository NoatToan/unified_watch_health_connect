package com.xiaomi.hm.health.device.alarm;

import com.huami.tools.log.HMLog;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.databases.model.AlarmDao;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0016\u0010\f\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\r\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/alarm/AlarmDbCached;", "Lcom/xiaomi/hm/health/device/alarm/AlarmCached;", "", "Lcom/xiaomi/hm/health/databases/model/Alarm;", "getAll", "", "index", "get", "alarm", "", DataItem.HTTP_METHOD_PUT, "alarms", "putAll", "replaceAll", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AlarmDbCached implements AlarmCached {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/alarm/AlarmDbCached$Companion;", "", "Lcom/xiaomi/hm/health/databases/model/Alarm;", "alarm", "", "putAlarmDb", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Alarm a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Alarm alarm) {
                super(0);
                this.a = alarm;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "has same index alarm (index = " + this.a.getIndex() + ")";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void putAlarmDb(@NotNull Alarm alarm) {
            List<Alarm> list = HMDaoManager.getInstance().getAlarmDao().queryBuilder().where(AlarmDao.Properties.Index.eq(alarm.getIndex()), new WhereCondition[0]).list();
            if (list.size() == 0) {
                HMDaoManager.getInstance().getAlarmDao().insertOrReplace(alarm);
                return;
            }
            if (list.size() == 1) {
                alarm.setId(list.get(0).getId());
                HMDaoManager.getInstance().getAlarmDao().insertOrReplace(alarm);
            } else {
                HMLog.info("AlarmDbCached", new a(alarm));
                HMDaoManager.getInstance().getAlarmDao().deleteInTx(list);
                HMDaoManager.getInstance().getAlarmDao().insertOrReplace(alarm);
            }
        }
    }

    @JvmStatic
    public static final void putAlarmDb(@NotNull Alarm alarm) {
        INSTANCE.putAlarmDb(alarm);
    }

    @Override // com.xiaomi.hm.health.device.alarm.AlarmCached
    @Nullable
    public Alarm get(int index) {
        List<Alarm> list = HMDaoManager.getInstance().getAlarmDao().queryBuilder().where(AlarmDao.Properties.Index.eq(Integer.valueOf(index)), new WhereCondition[0]).list();
        if (list.size() == 0) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        Alarm alarm = list.get(list.size() - 1);
        HMDaoManager.getInstance().getAlarmDao().deleteInTx(list);
        HMDaoManager.getInstance().getAlarmDao().insertOrReplace(alarm);
        return alarm;
    }

    @Override // com.xiaomi.hm.health.device.alarm.AlarmCached
    @NotNull
    public List<Alarm> getAll() {
        return HMDaoManager.getInstance().getAlarmDao().loadAll();
    }

    @Override // com.xiaomi.hm.health.device.alarm.AlarmCached
    public void put(@NotNull Alarm alarm) {
        INSTANCE.putAlarmDb(alarm);
    }

    @Override // com.xiaomi.hm.health.device.alarm.AlarmCached
    public void putAll(@NotNull List<? extends Alarm> alarms) {
        Iterator<T> it2 = alarms.iterator();
        while (it2.hasNext()) {
            put((Alarm) it2.next());
        }
    }

    @Override // com.xiaomi.hm.health.device.alarm.AlarmCached
    public void replaceAll(@NotNull List<? extends Alarm> alarms) {
        HMDaoManager.getInstance().getAlarmDao().deleteAll();
        putAll(alarms);
    }
}
