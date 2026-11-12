package com.huami.assistant.ui.v2.usecase;

import android.content.Context;
import android.text.TextUtils;
import com.huami.assistant.ui.v2.datasource.RemoteResult;
import com.huami.assistant.ui.v2.datasource.imp.ScheduleRemoteDataSourceImp;
import com.huami.assistant.ui.v2.db.ScheduleDataBase;
import com.huami.assistant.ui.v2.db.dao.ScheduleDao;
import com.huami.assistant.ui.v2.model.ScheduleModel;
import com.huami.assistant.ui.v2.model.ScheduleSource;
import com.huami.http.HttpError;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.DateDay;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001d\u0010\u0010\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/assistant/ui/v2/usecase/FetchRemoteScheduleUseCase;", "", "", Constant.METHOD_EXECUTE, "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/assistant/ui/v2/datasource/imp/ScheduleRemoteDataSourceImp;", "b", "Lkotlin/Lazy;", "()Lcom/huami/assistant/ui/v2/datasource/imp/ScheduleRemoteDataSourceImp;", "remoteDataSource", "Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "c", "()Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "scheduleDao", "<init>", "(Landroid/content/Context;)V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class FetchRemoteScheduleUseCase {

    @NotNull
    private static final String d = "Schedule-->FetchRemoteScheduleUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy remoteDataSource = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy scheduleDao = LazyKt__LazyJVMKt.lazy(new c());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.assistant.ui.v2.usecase.FetchRemoteScheduleUseCase$execute$1", f = "FetchRemoteScheduleUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.assistant.ui.v2.usecase.FetchRemoteScheduleUseCase$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0289a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<ScheduleModel> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0289a(List<ScheduleModel> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return TextUtils.join("\n", this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ RemoteResult<List<ScheduleModel>> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(RemoteResult<List<ScheduleModel>> remoteResult) {
                super(0);
                this.a = remoteResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Fetch remote todo failed! - " + ((RemoteResult.Failed) this.a).getCode();
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FetchRemoteScheduleUseCase.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws HttpError {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            long j = 1000;
            RemoteResult<List<ScheduleModel>> remoteResultFetch = FetchRemoteScheduleUseCase.this.a().fetch(DateDay.today().add(0).dayStartMills() / j, DateDay.today().add(30).dayEndMills() / j);
            if (remoteResultFetch instanceof RemoteResult.Success) {
                FetchRemoteScheduleUseCase.this.b().deleteLunar();
                FetchRemoteScheduleUseCase.this.b().deleteModelBySource(ScheduleSource.IOS_ZEPP.INSTANCE.getSource());
                FetchRemoteScheduleUseCase.this.b().deleteModelBySource(ScheduleSource.IOS_XIAOAI.INSTANCE.getSource());
                FetchRemoteScheduleUseCase.this.b().deleteModelBySource(ScheduleSource.ANDROID_ZEPP.INSTANCE.getSource());
                FetchRemoteScheduleUseCase.this.b().deleteModelBySource(ScheduleSource.ANDROID_XIAOAI.INSTANCE.getSource());
                List list = (List) ((RemoteResult.Success) remoteResultFetch).getData();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((ScheduleModel) obj2).getSource().getIsUserSchedule()) {
                        arrayList.add(obj2);
                    }
                }
                FetchRemoteScheduleUseCase.this.b().insertOrUpdate(arrayList);
                HMLog.debug(FetchRemoteScheduleUseCase.d, new C0289a(arrayList));
            } else if (remoteResultFetch instanceof RemoteResult.Failed) {
                HMLog.error$default(FetchRemoteScheduleUseCase.d, null, null, new b(remoteResultFetch), 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/datasource/imp/ScheduleRemoteDataSourceImp;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ScheduleRemoteDataSourceImp> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleRemoteDataSourceImp invoke() {
            return new ScheduleRemoteDataSourceImp();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<ScheduleDao> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleDao invoke() {
            return ScheduleDataBase.INSTANCE.getInstance(FetchRemoteScheduleUseCase.this.context).scheduleDao();
        }
    }

    public FetchRemoteScheduleUseCase(@NotNull Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduleRemoteDataSourceImp a() {
        return (ScheduleRemoteDataSourceImp) this.remoteDataSource.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduleDao b() {
        return (ScheduleDao) this.scheduleDao.getValue();
    }

    public final void execute() {
        e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(null), 3, null);
    }
}
