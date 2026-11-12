package com.huami.assistant.ui.v2.usecase;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.ui.v2.db.ScheduleDataBase;
import com.huami.assistant.ui.v2.db.dao.ScheduleDao;
import com.huami.assistant.ui.v2.model.ScheduleModel;
import com.huami.assistant.ui.v2.model.ScheduleSource;
import com.huami.assistant.ui.v2.repo.LunarRepo;
import com.huami.assistant.ui.v2.repo.ScheduleRpcApi;
import com.huami.assistant.ui.v2.repo.SettingRepo;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001d\u0010\u0013\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\b\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/huami/assistant/ui/v2/usecase/LunarDataUseCase;", "", "", "isReset", "", "correct", "checkLunarDataExpired", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "b", "Lkotlin/Lazy;", "()Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "scheduleDao", "Lcom/huami/assistant/ui/v2/repo/LunarRepo;", "c", "()Lcom/huami/assistant/ui/v2/repo/LunarRepo;", "lunarRepo", "Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "()Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "scheduleRpcApi", "<init>", "(Landroid/content/Context;)V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class LunarDataUseCase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String d = "Schedule-->LunarDataUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy scheduleDao = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy lunarRepo = LazyKt__LazyJVMKt.lazy(new c());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/assistant/ui/v2/usecase/LunarDataUseCase$Companion;", "", "", "isSupportLunar", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isSupportLunar() {
            SettingRepo settingRepo = SettingRepo.INSTANCE;
            return settingRepo.loadScheduleVersion().getSupportPerpetualCalendarWorkday() && settingRepo.loadSyncChineseCal();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "locale lunar data expired,fetch new data to update";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ ScheduleModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ScheduleModel scheduleModel) {
            super(0);
            this.a = scheduleModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "add lunar schedule to device:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/repo/LunarRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<LunarRepo> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LunarRepo invoke() {
            return new LunarRepo(LunarDataUseCase.this.context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<ScheduleDao> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleDao invoke() {
            return ScheduleDataBase.INSTANCE.getInstance(LunarDataUseCase.this.context).scheduleDao();
        }
    }

    public LunarDataUseCase(@NotNull Context context) {
        this.context = context;
    }

    private final LunarRepo a() {
        return (LunarRepo) this.lunarRepo.getValue();
    }

    private final ScheduleDao b() {
        return (ScheduleDao) this.scheduleDao.getValue();
    }

    private final ScheduleRpcApi c() {
        return AssistantModule.getScheduleApi();
    }

    public static /* synthetic */ void correct$default(LunarDataUseCase lunarDataUseCase, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        lunarDataUseCase.correct(z);
    }

    @WorkerThread
    public final void checkLunarDataExpired() {
        if (a().isUpdateDeviceLunarData()) {
            HMLog.info(d, a.a);
            a().initYearLunar();
            correct(true);
        }
    }

    @WorkerThread
    public final void correct(boolean isReset) {
        List<com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel> listFindAll;
        ArrayList arrayList;
        Object next;
        com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel scheduleModel;
        if (INSTANCE.isSupportLunar()) {
            List<ScheduleModel> listQueryLunar = b().queryLunar();
            if (isReset) {
                ScheduleRpcApi scheduleRpcApiC = c();
                if (scheduleRpcApiC != null) {
                    scheduleRpcApiC.deleteBySource(CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(ScheduleSource.LUNAR.INSTANCE.getSource())));
                }
                for (ScheduleModel scheduleModel2 : listQueryLunar) {
                    ScheduleRpcApi scheduleRpcApiC2 = c();
                    if (scheduleRpcApiC2 != null) {
                        scheduleRpcApiC2.add(scheduleModel2.toWatchSchedule());
                    }
                }
                return;
            }
            ScheduleRpcApi scheduleRpcApiC3 = c();
            if (scheduleRpcApiC3 == null || (listFindAll = scheduleRpcApiC3.findAll()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Object obj : listFindAll) {
                    if (((com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel) obj).getSource() == ScheduleSource.LUNAR.INSTANCE.getSource()) {
                        arrayList.add(obj);
                    }
                }
            }
            for (ScheduleModel scheduleModel3 : listQueryLunar) {
                if (arrayList == null) {
                    scheduleModel = null;
                } else {
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!(scheduleModel3.getId() == ((com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel) next).getId()));
                    scheduleModel = (com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel) next;
                }
                if (scheduleModel == null) {
                    HMLog.info(d, new b(scheduleModel3));
                    ScheduleRpcApi scheduleRpcApiC4 = c();
                    if (scheduleRpcApiC4 != null) {
                        scheduleRpcApiC4.add(scheduleModel3.toWatchSchedule());
                    }
                }
            }
        }
    }
}
