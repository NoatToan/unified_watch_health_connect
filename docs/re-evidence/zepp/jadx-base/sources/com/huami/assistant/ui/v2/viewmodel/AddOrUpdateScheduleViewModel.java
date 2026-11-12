package com.huami.assistant.ui.v2.viewmodel;

import android.app.Application;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.ui.v2.model.ScheduleEditType;
import com.huami.assistant.ui.v2.model.ScheduleModel;
import com.huami.assistant.ui.v2.model.ScheduleRepeatMode;
import com.huami.assistant.ui.v2.model.ScheduleResult;
import com.huami.assistant.ui.v2.repo.ScheduleRepo;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.watch.util.DateDay;
import com.huami.widget.share.ShareAnalytics;
import java.util.Calendar;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 F2\u00020\u0001:\u0001FB\u000f\u0012\u0006\u0010,\u001a\u00020(¢\u0006\u0004\bD\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0012J\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0012J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0006J\u0006\u0010 \u001a\u00020\u0004J\u0006\u0010!\u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0004J\u001a\u0010&\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020$J\u001a\u0010'\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020$R\u0019\u0010,\u001a\u00020(8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u001d\u00101\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0002058\u0006@\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001f\u0010@\u001a\b\u0012\u0004\u0012\u00020<0;8\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010=\u001a\u0004\b>\u0010?R\u001f\u0010C\u001a\b\u0012\u0004\u0012\u00020\f0;8\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\bB\u0010?¨\u0006G"}, d2 = {"Lcom/huami/assistant/ui/v2/viewmodel/AddOrUpdateScheduleViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/huami/assistant/ui/v2/model/ScheduleModel;", "a", "", "isAllDay", "", "startTime", "b", "schedule", "", "setSchedule", "", "status", "setEditStatus", "setStartTime", "endTime", "setEndTime", "", "titleStr", "saveTitle", "descStr", "saveDesc", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "saveAddress", "allDay", "setAllDay", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "mode", "setRepeatMode", "time", "setAlertTime", "hasChange", "needSplit", "isScheduleOverCount", "position", "Lcom/huami/assistant/ui/v2/model/ScheduleEditType;", "editType", ShareAnalytics.ParamValue.SAVE, "delete", "Landroid/app/Application;", "Landroid/app/Application;", "getApp", "()Landroid/app/Application;", "app", "Lcom/huami/assistant/ui/v2/repo/ScheduleRepo;", "Lkotlin/Lazy;", "e", "()Lcom/huami/assistant/ui/v2/repo/ScheduleRepo;", "mScheduleRepo", "c", "Lcom/huami/assistant/ui/v2/model/ScheduleModel;", "mOriginSchedule", "Landroidx/lifecycle/MediatorLiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MediatorLiveData;", "getScheduleLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "scheduleLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/assistant/ui/v2/model/ScheduleResult;", "Landroidx/lifecycle/MutableLiveData;", "getProgressData", "()Landroidx/lifecycle/MutableLiveData;", "progressData", "f", "getEditStatusLiveData", "editStatusLiveData", "<init>", "(Landroid/app/Application;)V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class AddOrUpdateScheduleViewModel extends AndroidViewModel {
    public static final int STATUS_EDITING = 0;
    public static final int STATUS_ONLY_SHOW = 2;
    public static final int STATUS_SHOW = 1;
    private static final long g = 0;
    private static final long h = -480;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Application app;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mScheduleRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private ScheduleModel mOriginSchedule;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<ScheduleModel> scheduleLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ScheduleResult> progressData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> editStatusLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.assistant.ui.v2.viewmodel.AddOrUpdateScheduleViewModel$delete$1", f = "AddOrUpdateScheduleViewModel.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_MODERN_DANCE}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ ScheduleEditType d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, ScheduleEditType scheduleEditType, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = scheduleEditType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AddOrUpdateScheduleViewModel.this.new a(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleRepo scheduleRepoE = AddOrUpdateScheduleViewModel.this.e();
                ScheduleModel scheduleModel = AddOrUpdateScheduleViewModel.this.mOriginSchedule;
                long j = this.c;
                ScheduleEditType scheduleEditType = this.d;
                this.a = 1;
                obj = scheduleRepoE.delete(scheduleModel, j, scheduleEditType, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                AddOrUpdateScheduleViewModel.this.getProgressData().postValue(ScheduleResult.INSTANCE.success());
            } else {
                AddOrUpdateScheduleViewModel.this.getProgressData().postValue(ScheduleResult.INSTANCE.fail());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/repo/ScheduleRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ScheduleRepo> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleRepo invoke() {
            return new ScheduleRepo(AddOrUpdateScheduleViewModel.this.getApp());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.assistant.ui.v2.viewmodel.AddOrUpdateScheduleViewModel$save$1", f = "AddOrUpdateScheduleViewModel.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_CHESS}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ ScheduleEditType d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, ScheduleEditType scheduleEditType, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = scheduleEditType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AddOrUpdateScheduleViewModel.this.new c(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleRepo scheduleRepoE = AddOrUpdateScheduleViewModel.this.e();
                ScheduleModel scheduleModel = AddOrUpdateScheduleViewModel.this.mOriginSchedule;
                ScheduleModel value = AddOrUpdateScheduleViewModel.this.getScheduleLiveData().getValue();
                long j = this.c;
                ScheduleEditType scheduleEditType = this.d;
                this.a = 1;
                obj = scheduleRepoE.save(scheduleModel, value, j, scheduleEditType, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                AddOrUpdateScheduleViewModel.this.getProgressData().postValue(ScheduleResult.INSTANCE.success());
            } else {
                AddOrUpdateScheduleViewModel.this.getProgressData().postValue(ScheduleResult.INSTANCE.fail());
            }
            return Unit.INSTANCE;
        }
    }

    public AddOrUpdateScheduleViewModel(@NotNull Application application) {
        super(application);
        this.app = application;
        this.mScheduleRepo = LazyKt__LazyJVMKt.lazy(new b());
        this.scheduleLiveData = new MediatorLiveData<>();
        this.progressData = new MutableLiveData<>();
        this.editStatusLiveData = new MutableLiveData<>(0);
        ScheduleModel scheduleModelA = a();
        this.mOriginSchedule = scheduleModelA;
        getScheduleLiveData().postValue(scheduleModelA.copy((8191 & 1) != 0 ? scheduleModelA.id : 0L, (8191 & 2) != 0 ? scheduleModelA.title : null, (8191 & 4) != 0 ? scheduleModelA.description : null, (8191 & 8) != 0 ? scheduleModelA.startTime : 0L, (8191 & 16) != 0 ? scheduleModelA.stopTime : 0L, (8191 & 32) != 0 ? scheduleModelA.alertTime : 0L, (8191 & 64) != 0 ? scheduleModelA.repeatMode : null, (8191 & 128) != 0 ? scheduleModelA.repeatStopTime : 0L, (8191 & 256) != 0 ? scheduleModelA.isAllDay : false, (8191 & 512) != 0 ? scheduleModelA.imageUrl : null, (8191 & 1024) != 0 ? scheduleModelA.source : null, (8191 & 2048) != 0 ? scheduleModelA.updateVersion : 0L, (8191 & 4096) != 0 ? scheduleModelA.address : null));
    }

    private final ScheduleModel a() {
        long jC = c(this, false, 0L, 2, null);
        return new ScheduleModel(System.currentTimeMillis() / ((long) 1000), null, null, jC, jC + ((long) 3600), 0L, null, 0L, false, null, null, 0L, null, 8166, null);
    }

    private final long b(boolean isAllDay, long startTime) {
        Calendar calendar = Calendar.getInstance();
        if (startTime > 0) {
            calendar.setTimeInMillis(startTime * ((long) 1000));
        }
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (isAllDay) {
            calendar.set(11, 8);
            calendar.set(12, 0);
        } else {
            int i = calendar.get(12);
            if (i <= 29) {
                i = 30;
            } else if (i <= 59) {
                i = 60;
            }
            calendar.set(12, i);
        }
        return calendar.getTimeInMillis() / ((long) 1000);
    }

    public static /* synthetic */ long c(AddOrUpdateScheduleViewModel addOrUpdateScheduleViewModel, boolean z, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = -1;
        }
        return addOrUpdateScheduleViewModel.b(z, j);
    }

    public static /* synthetic */ void delete$default(AddOrUpdateScheduleViewModel addOrUpdateScheduleViewModel, long j, ScheduleEditType scheduleEditType, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            scheduleEditType = ScheduleEditType.ALL.INSTANCE;
        }
        addOrUpdateScheduleViewModel.delete(j, scheduleEditType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduleRepo e() {
        return (ScheduleRepo) this.mScheduleRepo.getValue();
    }

    public static /* synthetic */ void save$default(AddOrUpdateScheduleViewModel addOrUpdateScheduleViewModel, long j, ScheduleEditType scheduleEditType, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            scheduleEditType = ScheduleEditType.ALL.INSTANCE;
        }
        addOrUpdateScheduleViewModel.save(j, scheduleEditType);
    }

    public final void delete(long position, @NotNull ScheduleEditType editType) {
        this.progressData.setValue(ScheduleResult.INSTANCE.loading());
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(position, editType, null), 2, null);
    }

    @NotNull
    public final Application getApp() {
        return this.app;
    }

    @NotNull
    public final MutableLiveData<Integer> getEditStatusLiveData() {
        return this.editStatusLiveData;
    }

    @NotNull
    public final MutableLiveData<ScheduleResult> getProgressData() {
        return this.progressData;
    }

    @NotNull
    public final MediatorLiveData<ScheduleModel> getScheduleLiveData() {
        return this.scheduleLiveData;
    }

    public final boolean hasChange() {
        return !Intrinsics.areEqual(this.mOriginSchedule, this.scheduleLiveData.getValue());
    }

    public final boolean isScheduleOverCount() {
        long j = 1000;
        long jDayStartMills = DateDay.today().add(0).dayStartMills() / j;
        long jDayEndMills = DateDay.today().add(30).dayEndMills() / j;
        ScheduleModel value = this.scheduleLiveData.getValue();
        return e().getTotalScheduleCount() + (value == null ? 0 : value.getRepeatMode().expand(value.getStartTime(), value.getStopTime() - value.getStartTime(), jDayStartMills, Math.min(jDayEndMills, value.getRepeatStopTime()), getApp()).size()) > 200;
    }

    public final boolean needSplit() {
        return !Intrinsics.areEqual(this.mOriginSchedule.getRepeatMode(), ScheduleRepeatMode.Once.INSTANCE);
    }

    public final void save(long position, @NotNull ScheduleEditType editType) {
        this.progressData.setValue(ScheduleResult.INSTANCE.loading());
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(position, editType, null), 2, null);
    }

    public final void saveAddress(@NotNull String address) {
        ScheduleModel value = this.scheduleLiveData.getValue();
        if (value == null || Intrinsics.areEqual(address, value.getAddress())) {
            return;
        }
        MediatorLiveData<ScheduleModel> scheduleLiveData = getScheduleLiveData();
        value.setAddress(address);
        Unit unit = Unit.INSTANCE;
        scheduleLiveData.postValue(value);
    }

    public final void saveDesc(@NotNull String descStr) {
        ScheduleModel value = this.scheduleLiveData.getValue();
        if (value == null || Intrinsics.areEqual(descStr, value.getDesc())) {
            return;
        }
        MediatorLiveData<ScheduleModel> scheduleLiveData = getScheduleLiveData();
        value.setDesc(descStr);
        Unit unit = Unit.INSTANCE;
        scheduleLiveData.postValue(value);
    }

    public final void saveTitle(@NotNull String titleStr) {
        ScheduleModel value = this.scheduleLiveData.getValue();
        if (value == null || Intrinsics.areEqual(titleStr, value.getTitle())) {
            return;
        }
        MediatorLiveData<ScheduleModel> scheduleLiveData = getScheduleLiveData();
        value.setTitle(titleStr);
        Unit unit = Unit.INSTANCE;
        scheduleLiveData.postValue(value);
    }

    public final void setAlertTime(long time) {
        ScheduleModel value = this.scheduleLiveData.getValue();
        if (value == null) {
            return;
        }
        MediatorLiveData<ScheduleModel> mediatorLiveData = this.scheduleLiveData;
        value.setAlertTime(time);
        Unit unit = Unit.INSTANCE;
        mediatorLiveData.postValue(value);
    }

    public final void setAllDay(boolean allDay) {
        ScheduleModel value = this.scheduleLiveData.getValue();
        if (value == null || value.isAllDayEvent() == allDay) {
            return;
        }
        long jB = b(allDay, value.getStartTime());
        if (!DateDay.from(value.getStartTime()).equals(jB)) {
            value.setRepeatMode(ScheduleRepeatMode.Once.INSTANCE);
        }
        value.setAlertTime(0L);
        value.setStartTime(jB);
        value.setStopTime(jB + ((allDay ? 86400000L : 3600000L) / ((long) 1000)));
        value.setAllDayEvent(allDay);
        this.scheduleLiveData.postValue(value);
    }

    public final void setEditStatus(int status) {
        this.editStatusLiveData.postValue(Integer.valueOf(status));
    }

    public final void setEndTime(long endTime) {
        ScheduleModel value = this.scheduleLiveData.getValue();
        if (value == null) {
            return;
        }
        long startTime = endTime / ((long) 1000);
        if (startTime < value.getStartTime()) {
            startTime = value.getStartTime();
        }
        if (value.isAllDayEvent()) {
            startTime += 86400;
        }
        value.setStopTime(startTime);
        this.scheduleLiveData.postValue(value);
    }

    public final void setRepeatMode(@NotNull ScheduleRepeatMode mode) {
        ScheduleModel value = this.scheduleLiveData.getValue();
        if (value == null) {
            return;
        }
        MediatorLiveData<ScheduleModel> mediatorLiveData = this.scheduleLiveData;
        value.setRepeatMode(mode);
        Unit unit = Unit.INSTANCE;
        mediatorLiveData.postValue(value);
    }

    public final void setSchedule(@Nullable ScheduleModel schedule) {
        if (schedule == null) {
            return;
        }
        this.mOriginSchedule = schedule.copy((8191 & 1) != 0 ? schedule.id : 0L, (8191 & 2) != 0 ? schedule.title : null, (8191 & 4) != 0 ? schedule.description : null, (8191 & 8) != 0 ? schedule.startTime : 0L, (8191 & 16) != 0 ? schedule.stopTime : 0L, (8191 & 32) != 0 ? schedule.alertTime : 0L, (8191 & 64) != 0 ? schedule.repeatMode : null, (8191 & 128) != 0 ? schedule.repeatStopTime : 0L, (8191 & 256) != 0 ? schedule.isAllDay : false, (8191 & 512) != 0 ? schedule.imageUrl : null, (8191 & 1024) != 0 ? schedule.source : null, (8191 & 2048) != 0 ? schedule.updateVersion : 0L, (8191 & 4096) != 0 ? schedule.address : null);
        getScheduleLiveData().postValue(schedule.copy((8191 & 1) != 0 ? schedule.id : 0L, (8191 & 2) != 0 ? schedule.title : null, (8191 & 4) != 0 ? schedule.description : null, (8191 & 8) != 0 ? schedule.startTime : 0L, (8191 & 16) != 0 ? schedule.stopTime : 0L, (8191 & 32) != 0 ? schedule.alertTime : 0L, (8191 & 64) != 0 ? schedule.repeatMode : null, (8191 & 128) != 0 ? schedule.repeatStopTime : 0L, (8191 & 256) != 0 ? schedule.isAllDay : false, (8191 & 512) != 0 ? schedule.imageUrl : null, (8191 & 1024) != 0 ? schedule.source : null, (8191 & 2048) != 0 ? schedule.updateVersion : 0L, (8191 & 4096) != 0 ? schedule.address : null));
        getEditStatusLiveData().postValue(Integer.valueOf(schedule.getSource().getIsUserSchedule() ? 1 : 2));
    }

    public final void setStartTime(long startTime) {
        ScheduleModel value = this.scheduleLiveData.getValue();
        if (value == null) {
            return;
        }
        long j = 1000;
        if (!DateDay.from(value.getStartTime() * j).equals(startTime)) {
            value.setRepeatMode(ScheduleRepeatMode.Once.INSTANCE);
        }
        long j2 = startTime / j;
        value.setStartTime(j2);
        long j3 = (value.isAllDayEvent() ? 86400000L : 3600000L) / j;
        if (value.getStopTime() - j2 < j3 || j2 > value.getStopTime()) {
            value.setStopTime(j2 + j3);
        }
        this.scheduleLiveData.postValue(value);
    }
}
