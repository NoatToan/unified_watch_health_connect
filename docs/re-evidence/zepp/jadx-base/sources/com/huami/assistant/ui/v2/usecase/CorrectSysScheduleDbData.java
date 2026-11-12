package com.huami.assistant.ui.v2.usecase;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.calendar.EventDao;
import com.huami.assistant.ui.v2.db.ScheduleDataBase;
import com.huami.assistant.ui.v2.db.dao.ScheduleDao;
import com.huami.assistant.ui.v2.db.dao.ScheduleEventDao;
import com.huami.assistant.ui.v2.model.ScheduleEventModel;
import com.huami.assistant.ui.v2.model.ScheduleModel;
import com.huami.assistant.ui.v2.model.ScheduleSource;
import com.huami.assistant.ui.v2.parse.EventScheduleParser;
import com.huami.assistant.ui.v2.repo.SettingRepo;
import com.huami.assistant.ui.v2.util.ScheduleEventIdUtil;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.TimeUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0007J\u0006\u0010\n\u001a\u00020\bR\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/huami/assistant/ui/v2/usecase/CorrectSysScheduleDbData;", "", "Lcom/huami/assistant/calendar/Event;", "event", "Lcom/huami/assistant/ui/v2/model/ScheduleModel;", "schedule", "Lcom/huami/assistant/ui/v2/model/ScheduleEventModel;", "a", "", "correct", "setInterrupt", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "Ljava/lang/ref/WeakReference;", "getContextRef", "()Ljava/lang/ref/WeakReference;", "contextRef", "Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "b", "Lkotlin/Lazy;", "()Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "scheduleDao", "Lcom/huami/assistant/ui/v2/db/dao/ScheduleEventDao;", "c", "()Lcom/huami/assistant/ui/v2/db/dao/ScheduleEventDao;", "scheduleEventDao", "Ljava/util/concurrent/atomic/AtomicBoolean;", GoogleApiAvailabilityLight.a, "Ljava/util/concurrent/atomic/AtomicBoolean;", "interrupt", "<init>", "(Ljava/lang/ref/WeakReference;)V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class CorrectSysScheduleDbData {

    @NotNull
    private static final String e = "Schedule-->CorrectScheduleDbData";
    private static final int f = -3;
    private static final int g = 30;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WeakReference<Context> contextRef;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy scheduleDao = LazyKt__LazyJVMKt.lazy(new f());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy scheduleEventDao = LazyKt__LazyJVMKt.lazy(new g());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean interrupt = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "syncCalendar switch is off";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Interrupt the storage of newly generated system schedules to the local";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ScheduleEventModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ScheduleEventModel scheduleEventModel) {
            super(0);
            this.a = scheduleEventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "add system schedule to local:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Delete system schedules you no longer need from your watch";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ ScheduleEventModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ScheduleEventModel scheduleEventModel) {
            super(0);
            this.a = scheduleEventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete unUse local system schedule:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<ScheduleDao> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleDao invoke() {
            Context context = CorrectSysScheduleDbData.this.getContextRef().get();
            if (context == null) {
                return null;
            }
            return ScheduleDataBase.INSTANCE.getInstance(context).scheduleDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/db/dao/ScheduleEventDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<ScheduleEventDao> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleEventDao invoke() {
            Context context = CorrectSysScheduleDbData.this.getContextRef().get();
            if (context == null) {
                return null;
            }
            return ScheduleDataBase.INSTANCE.getInstance(context).scheduleEventDao();
        }
    }

    public CorrectSysScheduleDbData(@NotNull WeakReference<Context> weakReference) {
        this.contextRef = weakReference;
    }

    private final ScheduleEventModel a(Event event, ScheduleModel schedule) {
        return new ScheduleEventModel(ScheduleEventIdUtil.INSTANCE.generateId(), String.valueOf(event.id), schedule.getId(), schedule.getTitle(), schedule.getDesc(), schedule.getStartTime(), schedule.getStopTime(), schedule.getRepeatMode().getMode(), schedule.getRepeatStopTime(), schedule.getAlertTime(), schedule.isAllDayEvent());
    }

    private final ScheduleDao b() {
        return (ScheduleDao) this.scheduleDao.getValue();
    }

    private final ScheduleEventDao c() {
        return (ScheduleEventDao) this.scheduleEventDao.getValue();
    }

    @WorkerThread
    public final void correct() {
        List<ScheduleEventModel> all;
        List<ScheduleEventModel> all2;
        Object next;
        Object next2;
        ScheduleEventModel scheduleEventModel;
        List<Event> listQueryPhoneEventByInstances;
        if (!SettingRepo.INSTANCE.loadSyncCalendar()) {
            HMLog.info(e, a.a);
            return;
        }
        this.interrupt.compareAndSet(true, false);
        ArrayList<Pair> arrayList = new ArrayList();
        Context context = this.contextRef.get();
        if (context != null && (listQueryPhoneEventByInstances = EventDao.queryPhoneEventByInstances(context, TimeUtil.getJulianDay(DateDay.today().add(-3).timeInMillis()), 30)) != null) {
            for (Event event : listQueryPhoneEventByInstances) {
                event.source = ScheduleSource.ANDROID_SYSTEM.INSTANCE.getSource();
                Iterator<T> it2 = EventScheduleParser.INSTANCE.parse(event).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new Pair(event, (ScheduleModel) it2.next()));
                }
            }
        }
        ScheduleEventDao scheduleEventDaoC = c();
        List mutableList = (scheduleEventDaoC == null || (all = scheduleEventDaoC.getAll()) == null) ? null : CollectionsKt___CollectionsKt.toMutableList((Collection) all);
        for (Pair pair : arrayList) {
            if (this.interrupt.get()) {
                HMLog.info(e, b.a);
                return;
            }
            ScheduleEventModel scheduleEventModelA = a((Event) pair.getFirst(), (ScheduleModel) pair.getSecond());
            if (mutableList == null) {
                scheduleEventModel = null;
            } else {
                Iterator it3 = mutableList.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!((ScheduleEventModel) next2).systemEquals(scheduleEventModelA));
                scheduleEventModel = (ScheduleEventModel) next2;
            }
            if (scheduleEventModel == null) {
                HMLog.info(e, new c(scheduleEventModelA));
                ScheduleDao scheduleDaoB = b();
                if (scheduleDaoB != null) {
                    scheduleDaoB.insertOrUpdate((ScheduleModel) pair.getSecond());
                }
                ScheduleEventDao scheduleEventDaoC2 = c();
                if (scheduleEventDaoC2 != null) {
                    scheduleEventDaoC2.save(scheduleEventModelA);
                }
                if (mutableList != null) {
                    mutableList.add(scheduleEventModelA);
                }
            }
        }
        ScheduleEventDao scheduleEventDaoC3 = c();
        List<ScheduleEventModel> mutableList2 = (scheduleEventDaoC3 == null || (all2 = scheduleEventDaoC3.getAll()) == null) ? null : CollectionsKt___CollectionsKt.toMutableList((Collection) all2);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (Pair pair2 : arrayList) {
            arrayList2.add(a((Event) pair2.getFirst(), (ScheduleModel) pair2.getSecond()));
        }
        if (mutableList2 == null) {
            return;
        }
        for (ScheduleEventModel scheduleEventModel2 : mutableList2) {
            if (this.interrupt.get()) {
                HMLog.info(e, d.a);
                return;
            }
            Iterator it4 = arrayList2.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!((ScheduleEventModel) next).systemEquals(scheduleEventModel2));
            if (next == null) {
                HMLog.info(e, new e(scheduleEventModel2));
                ScheduleDao scheduleDaoB2 = b();
                if (scheduleDaoB2 != null) {
                    scheduleDaoB2.deleteById(scheduleEventModel2.getScheduleId());
                }
                ScheduleEventDao scheduleEventDaoC4 = c();
                if (scheduleEventDaoC4 != null) {
                    scheduleEventDaoC4.delete(scheduleEventModel2);
                }
            }
        }
    }

    @NotNull
    public final WeakReference<Context> getContextRef() {
        return this.contextRef;
    }

    public final void setInterrupt() {
        this.interrupt.compareAndSet(false, true);
    }
}
