package com.huami.assistant.ui.v2.usecase;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.ui.v2.datasource.imp.ScheduleRemoteDataSourceImp;
import com.huami.assistant.ui.v2.db.ScheduleDataBase;
import com.huami.assistant.ui.v2.db.dao.ScheduleDao;
import com.huami.assistant.ui.v2.model.ScheduleModel;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J \u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u001d\u0010\u0013\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001d\u0010\u0017\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001b\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/assistant/ui/v2/usecase/CorrectUseScheduleData;", "", "", "Lcom/huami/assistant/ui/v2/model/ScheduleModel;", "device", "locale", "", "a", "", "isBind", "allSchedule", "correctData", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "b", "Lkotlin/Lazy;", "()Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "mScheduleDao", "Lcom/huami/assistant/ui/v2/datasource/imp/ScheduleRemoteDataSourceImp;", "c", "()Lcom/huami/assistant/ui/v2/datasource/imp/ScheduleRemoteDataSourceImp;", "remoteDataSource", "", GoogleApiAvailabilityLight.a, "()I", "source", "<init>", "(Landroid/content/Context;)V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class CorrectUseScheduleData {

    @NotNull
    private static final String e = "CorrectUseScheduleData";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mScheduleDao = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy remoteDataSource = LazyKt__LazyJVMKt.lazy(e.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy source = LazyKt__LazyJVMKt.lazy(new f());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "compareDeviceAndLocale -> correct schedule action: delete";
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
            return "compareDeviceAndLocale -> correct schedule action: push";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "bind device not correct use Schedule Data";
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
            return ScheduleDataBase.INSTANCE.getInstance(CorrectUseScheduleData.this.context).scheduleDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/datasource/imp/ScheduleRemoteDataSourceImp;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<ScheduleRemoteDataSourceImp> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleRemoteDataSourceImp invoke() {
            return new ScheduleRemoteDataSourceImp();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Integer> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(AssistantModule.getCurrentSource(CorrectUseScheduleData.this.context));
        }
    }

    public CorrectUseScheduleData(@NotNull Context context) {
        this.context = context;
    }

    private final void a(List<ScheduleModel> device, List<ScheduleModel> locale) {
        if ((device.size() == locale.size() && device.containsAll(locale)) ? false : true) {
            Iterator<T> it2 = locale.iterator();
            while (it2.hasNext()) {
                b().delete((ScheduleModel) it2.next());
            }
            ScheduleRemoteDataSourceImp scheduleRemoteDataSourceImpC = c();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(locale, 10));
            Iterator<T> it3 = locale.iterator();
            while (it3.hasNext()) {
                arrayList.add(Long.valueOf(((ScheduleModel) it3.next()).getId()));
            }
            scheduleRemoteDataSourceImpC.delete(arrayList);
            HMLog.info(e, a.a);
            b().insertOrUpdate(device);
            c().push(device, d());
            HMLog.info(e, b.a);
        }
    }

    private final ScheduleDao b() {
        return (ScheduleDao) this.mScheduleDao.getValue();
    }

    private final ScheduleRemoteDataSourceImp c() {
        return (ScheduleRemoteDataSourceImp) this.remoteDataSource.getValue();
    }

    public static /* synthetic */ void correctData$default(CorrectUseScheduleData correctUseScheduleData, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        correctUseScheduleData.correctData(z, list);
    }

    private final int d() {
        return ((Number) this.source.getValue()).intValue();
    }

    @WorkerThread
    public final void correctData(boolean isBind, @NotNull List<ScheduleModel> allSchedule) {
        if (isBind) {
            HMLog.info(e, c.a);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : allSchedule) {
            if (((ScheduleModel) obj).getSource().getIsUserSchedule()) {
                arrayList.add(obj);
            }
        }
        List<ScheduleModel> all = b().getAll();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : all) {
            if (((ScheduleModel) obj2).getSource().getIsUserSchedule()) {
                arrayList2.add(obj2);
            }
        }
        a(arrayList, arrayList2);
    }
}
