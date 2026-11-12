package com.huami.assistant.ui.v2.usecase;

import android.content.Context;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.ui.v2.db.ScheduleDataBase;
import com.huami.assistant.ui.v2.db.dao.ScheduleDao;
import com.huami.assistant.ui.v2.model.ScheduleModel;
import com.huami.assistant.ui.v2.model.ScheduleSource;
import com.huami.assistant.ui.v2.repo.ScheduleRpcApi;
import com.huami.assistant.ui.v2.repo.SettingRepo;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleVersion;
import com.huami.tools.analytics.DbUtils;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/huami/assistant/ui/v2/usecase/RestoreDataUseCase;", "", "", Constant.METHOD_EXECUTE, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "b", "Lkotlin/Lazy;", "()Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "scheduleDao", "Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "()Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "scheduleRpcApi", "<init>", "(Landroid/content/Context;)V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class RestoreDataUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy scheduleDao = LazyKt__LazyJVMKt.lazy(new b());

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.assistant.ui.v2.usecase.RestoreDataUseCase", f = "RestoreDataUseCase.kt", i = {0, 0}, l = {37}, m = Constant.METHOD_EXECUTE, n = {"this", "$this$execute_u24lambda_u2d2"}, s = {"L$0", "L$2"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return RestoreDataUseCase.this.execute(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ScheduleDao> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleDao invoke() {
            return ScheduleDataBase.INSTANCE.getInstance(RestoreDataUseCase.this.context).scheduleDao();
        }
    }

    public RestoreDataUseCase(@NotNull Context context) {
        this.context = context;
    }

    private final ScheduleDao a() {
        return (ScheduleDao) this.scheduleDao.getValue();
    }

    private final ScheduleRpcApi b() {
        return AssistantModule.getScheduleApi();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object execute(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        RestoreDataUseCase restoreDataUseCase;
        ScheduleRpcApi scheduleRpcApi;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ScheduleRpcApi scheduleRpcApiB = b();
            if (scheduleRpcApiB != null) {
                scheduleRpcApiB.deleteBySource(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(ScheduleSource.IOS_ZEPP.INSTANCE.getSource()), Boxing.boxInt(ScheduleSource.IOS_XIAOAI.INSTANCE.getSource()), Boxing.boxInt(ScheduleSource.IOS_SYSTEM.INSTANCE.getSource()), Boxing.boxInt(ScheduleSource.ANDROID_ZEPP.INSTANCE.getSource()), Boxing.boxInt(ScheduleSource.ANDROID_GOOGLE_SYSTEM.INSTANCE.getSource()), Boxing.boxInt(ScheduleSource.ANDROID_SYSTEM.INSTANCE.getSource()), Boxing.boxInt(ScheduleSource.ANDROID_XIAOAI.INSTANCE.getSource()), Boxing.boxInt(ScheduleSource.LUNAR.INSTANCE.getSource())}));
                ScheduleVersion scheduleVersionQueryVersion = scheduleRpcApiB.queryVersion();
                SettingRepo settingRepo = SettingRepo.INSTANCE;
                aVar.a = this;
                aVar.b = scheduleRpcApiB;
                aVar.c = scheduleRpcApiB;
                aVar.f = 1;
                if (settingRepo.updateScheduleVersion(scheduleVersionQueryVersion, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                restoreDataUseCase = this;
                scheduleRpcApi = scheduleRpcApiB;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        scheduleRpcApi = (ScheduleRpcApi) aVar.c;
        restoreDataUseCase = (RestoreDataUseCase) aVar.a;
        ResultKt.throwOnFailure(obj);
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) restoreDataUseCase.a().getAll());
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : mutableList) {
            if (Intrinsics.areEqual(((ScheduleModel) obj2).getSource(), ScheduleSource.LUNAR.INSTANCE)) {
                arrayList.add(obj2);
            }
        }
        if (!LunarDataUseCase.INSTANCE.isSupportLunar()) {
            mutableList.removeAll(arrayList);
        }
        Iterator it2 = mutableList.iterator();
        while (it2.hasNext()) {
            scheduleRpcApi.add(((ScheduleModel) it2.next()).toWatchSchedule());
        }
        return Unit.INSTANCE;
    }
}
