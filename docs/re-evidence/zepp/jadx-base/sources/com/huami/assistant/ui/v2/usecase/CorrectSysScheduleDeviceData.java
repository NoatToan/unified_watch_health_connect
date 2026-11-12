package com.huami.assistant.ui.v2.usecase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.ui.v2.db.ScheduleDataBase;
import com.huami.assistant.ui.v2.db.dao.ScheduleDao;
import com.huami.assistant.ui.v2.db.dao.ScheduleEventDao;
import com.huami.assistant.ui.v2.model.ScheduleEventModel;
import com.huami.assistant.ui.v2.model.ScheduleModel;
import com.huami.assistant.ui.v2.model.ScheduleSource;
import com.huami.assistant.ui.v2.repo.ScheduleRpcApi;
import com.huami.tools.log.HMLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b#\u0010$J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u0006\u0010\u0007\u001a\u00020\u0005R\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0010\u0010\u0016R\u001f\u0010\u001b\u001a\u0004\u0018\u00010\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010 8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010!¨\u0006&"}, d2 = {"Lcom/huami/assistant/ui/v2/usecase/CorrectSysScheduleDeviceData;", "", "", "Lcom/huami/assistant/ui/v2/model/ScheduleModel;", "allSchedule", "", "correct", "setInterrupt", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "a", "Ljava/lang/ref/WeakReference;", "getContextRef", "()Ljava/lang/ref/WeakReference;", "contextRef", "Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "b", "Lkotlin/Lazy;", "()Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "mScheduleDao", "Lcom/huami/assistant/ui/v2/db/dao/ScheduleEventDao;", "c", "()Lcom/huami/assistant/ui/v2/db/dao/ScheduleEventDao;", "mScheduleEventDao", "", GoogleApiAvailabilityLight.a, "()Ljava/lang/Integer;", "source", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "interrupt", "Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "()Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "scheduleRpcApi", "<init>", "(Ljava/lang/ref/WeakReference;)V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class CorrectSysScheduleDeviceData {

    @NotNull
    private static final String f = "Schedule-->CorrectSysScheduleDeviceData";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WeakReference<Context> contextRef;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mScheduleDao = LazyKt__LazyJVMKt.lazy(new f());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mScheduleEventDao = LazyKt__LazyJVMKt.lazy(new g());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy source = LazyKt__LazyJVMKt.lazy(new h());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean interrupt = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<List<ScheduleEventModel>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ObjectRef<List<ScheduleEventModel>> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            List<ScheduleEventModel> list = this.a.element;
            if (list == null) {
                return "null";
            }
            return "local system schedule:" + TextUtils.join(",", list);
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
            return "Interrupt to add system schedules that do not exist in the watch";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ScheduleModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ScheduleModel scheduleModel) {
            super(0);
            this.a = scheduleModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "add system schedule to device:" + this.a;
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
        public final /* synthetic */ ScheduleModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ScheduleModel scheduleModel) {
            super(0);
            this.a = scheduleModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete device system schedule:" + this.a;
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
            Context context = CorrectSysScheduleDeviceData.this.getContextRef().get();
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
            Context context = CorrectSysScheduleDeviceData.this.getContextRef().get();
            if (context == null) {
                return null;
            }
            return ScheduleDataBase.INSTANCE.getInstance(context).scheduleEventDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Integer> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            Context context = CorrectSysScheduleDeviceData.this.getContextRef().get();
            if (context == null) {
                return null;
            }
            return Integer.valueOf(AssistantModule.getCurrentSource(context));
        }
    }

    public CorrectSysScheduleDeviceData(@NotNull WeakReference<Context> weakReference) {
        this.contextRef = weakReference;
    }

    private final ScheduleDao a() {
        return (ScheduleDao) this.mScheduleDao.getValue();
    }

    private final ScheduleEventDao b() {
        return (ScheduleEventDao) this.mScheduleEventDao.getValue();
    }

    private final ScheduleRpcApi c() {
        return AssistantModule.getScheduleApi();
    }

    private final Integer d() {
        return (Integer) this.source.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final void correct(@NotNull List<ScheduleModel> allSchedule) {
        List<ScheduleEventModel> all;
        Object next;
        ScheduleEventModel scheduleEventModel;
        Object next2;
        ScheduleDao scheduleDaoA;
        ScheduleModel byId;
        this.interrupt.compareAndSet(true, false);
        ArrayList arrayList = new ArrayList();
        for (Object obj : allSchedule) {
            if (!((ScheduleModel) obj).getSource().getIsUserSchedule()) {
                arrayList.add(obj);
            }
        }
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ScheduleEventDao scheduleEventDaoB = b();
        objectRef.element = scheduleEventDaoB == null ? 0 : scheduleEventDaoB.getAll();
        HMLog.info(f, new a(objectRef));
        List<ScheduleEventModel> list = (List) objectRef.element;
        if (list != null) {
            for (ScheduleEventModel scheduleEventModel2 : list) {
                if (this.interrupt.get()) {
                    HMLog.info(f, b.a);
                    return;
                }
                Iterator it2 = mutableList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!(((ScheduleModel) next2).getId() == scheduleEventModel2.getScheduleId()));
                if ((next2 == null) && (scheduleDaoA = a()) != null && (byId = scheduleDaoA.getById(scheduleEventModel2.getScheduleId())) != null) {
                    HMLog.info(f, new c(byId));
                    ScheduleRpcApi scheduleRpcApiC = c();
                    if (scheduleRpcApiC != null && Boolean.valueOf(scheduleRpcApiC.add(byId.toWatchSchedule())).booleanValue()) {
                        mutableList.add(byId);
                    }
                }
            }
        }
        ScheduleEventDao scheduleEventDaoB2 = b();
        objectRef.element = (scheduleEventDaoB2 == null || (all = scheduleEventDaoB2.getAll()) == null) ? 0 : CollectionsKt___CollectionsKt.toMutableList((Collection) all);
        ArrayList<ScheduleModel> arrayList2 = new ArrayList();
        for (Object obj2 : mutableList) {
            if (!Intrinsics.areEqual(((ScheduleModel) obj2).getSource(), ScheduleSource.LUNAR.INSTANCE)) {
                arrayList2.add(obj2);
            }
        }
        for (ScheduleModel scheduleModel : arrayList2) {
            if (this.interrupt.get()) {
                HMLog.info(f, d.a);
                return;
            }
            List list2 = (List) objectRef.element;
            if (list2 == null) {
                scheduleEventModel = null;
            } else {
                Iterator it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!(((ScheduleEventModel) next).getScheduleId() == scheduleModel.getId()));
                scheduleEventModel = (ScheduleEventModel) next;
            }
            if (scheduleEventModel == null) {
                HMLog.info(f, new e(scheduleModel));
                ScheduleRpcApi scheduleRpcApiC2 = c();
                if (scheduleRpcApiC2 != null) {
                    scheduleRpcApiC2.deleteById(scheduleModel.getId());
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
