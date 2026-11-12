package com.huami.sync;

import android.app.Application;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.exoplayer2.util.MimeTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J)\u0010\t\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002J\u0014\u0010\u000b\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0003J)\u0010\u0014\u001a\u00020\u00072!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00070\u0002R(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006+"}, d2 = {"Lcom/huami/sync/TransmissionViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "", "callback", "startPoll", "Lkotlin/Function0;", "stopPoll", "toggle", "saveToggle", "", "time", "saveLastSendTime", "isOpen", "allow", "onFinish", "toggleCheck", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sync/Step;", "a", "Landroidx/lifecycle/MutableLiveData;", "getStepLiveData$realtime_transmission_release", "()Landroidx/lifecycle/MutableLiveData;", "setStepLiveData$realtime_transmission_release", "(Landroidx/lifecycle/MutableLiveData;)V", "stepLiveData", "Lcom/huami/sync/HeartRate;", "b", "getHeartRateLiveData$realtime_transmission_release", "setHeartRateLiveData$realtime_transmission_release", "heartRateLiveData", "Lcom/huami/sync/TransmissionSource;", "c", "Lcom/huami/sync/TransmissionSource;", "transmissionSource", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "<init>", "(Landroid/app/Application;)V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class TransmissionViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Step> stepLiveData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<HeartRate> heartRateLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TransmissionSource transmissionSource;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sync/Step;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Step, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Step step) {
            if (TransmissionViewModel.this.isOpen()) {
                TransmissionViewModel.this.getStepLiveData$realtime_transmission_release().postValue(step);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Step step) {
            a(step);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sync/HeartRate;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<HeartRate, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull HeartRate heartRate) {
            if (TransmissionViewModel.this.isOpen()) {
                TransmissionViewModel.this.getHeartRateLiveData$realtime_transmission_release().postValue(heartRate);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HeartRate heartRate) {
            a(heartRate);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "success", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Function1<Boolean, Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super Boolean, Unit> function1) {
            super(1);
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                TransmissionViewModel.this.saveLastSendTime(System.currentTimeMillis());
            }
            TransmissionViewModel.this.saveToggle(z);
            this.b.invoke(Boolean.valueOf(z));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0<Unit> function0) {
            super(0);
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TransmissionViewModel.this.saveToggle(false);
            this.b.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n"}, d2 = {"", "allow", "", "<anonymous parameter 1>", "Lcom/huami/sync/ToggleResult;", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function3<Boolean, String, ToggleResult, Unit> {
        public final /* synthetic */ Function1<Boolean, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function1<? super Boolean, Unit> function1) {
            super(3);
            this.a = function1;
        }

        public final void a(boolean z, @Nullable String str, @Nullable ToggleResult toggleResult) {
            this.a.invoke(Boolean.valueOf(z));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, String str, ToggleResult toggleResult) {
            a(bool.booleanValue(), str, toggleResult);
            return Unit.INSTANCE;
        }
    }

    public TransmissionViewModel(@NotNull Application application) {
        super(application);
        this.stepLiveData = new MutableLiveData<>();
        this.heartRateLiveData = new MutableLiveData<>();
        this.transmissionSource = new TransmissionSource(application, ViewModelKt.getViewModelScope(this));
        DataReceiver dataReceiver = DataReceiver.INSTANCE;
        dataReceiver.setOnStepUpdate$realtime_transmission_release(new a());
        dataReceiver.setOnHeartRateUpdate$realtime_transmission_release(new b());
    }

    @NotNull
    public final MutableLiveData<HeartRate> getHeartRateLiveData$realtime_transmission_release() {
        return this.heartRateLiveData;
    }

    @NotNull
    public final MutableLiveData<Step> getStepLiveData$realtime_transmission_release() {
        return this.stepLiveData;
    }

    public final boolean isOpen() {
        return this.transmissionSource.isOpen();
    }

    public final void saveLastSendTime(long time) {
        this.transmissionSource.saveLastSendTime(time);
    }

    public final void saveToggle(boolean toggle) {
        this.transmissionSource.saveToggle(toggle);
    }

    public final void setHeartRateLiveData$realtime_transmission_release(@NotNull MutableLiveData<HeartRate> mutableLiveData) {
        this.heartRateLiveData = mutableLiveData;
    }

    public final void setStepLiveData$realtime_transmission_release(@NotNull MutableLiveData<Step> mutableLiveData) {
        this.stepLiveData = mutableLiveData;
    }

    public final void startPoll(@NotNull Function1<? super Boolean, Unit> callback) {
        this.transmissionSource.startPoll(new c(callback));
    }

    public final void stopPoll(@NotNull Function0<Unit> callback) {
        this.transmissionSource.stopPoll(new d(callback));
    }

    public final void toggleCheck(@NotNull Function1<? super Boolean, Unit> onFinish) {
        this.transmissionSource.toggleCheck(new e(onFinish));
    }
}
