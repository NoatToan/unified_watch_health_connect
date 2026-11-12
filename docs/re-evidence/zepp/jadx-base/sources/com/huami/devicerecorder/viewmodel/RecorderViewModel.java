package com.huami.devicerecorder.viewmodel;

import android.app.Application;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicerecorder.IRecorderDevice;
import com.huami.devicerecorder.model.LiveDataExKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0002\t\u000eB\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00060\u0011R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/devicerecorder/viewmodel/RecorderViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/huami/devicerecorder/IRecorderDevice;", "device", "", "setUp", "onCleared", "Landroidx/lifecycle/MutableLiveData;", "", "a", "Landroidx/lifecycle/MutableLiveData;", "getDeviceStatusLiveData", "()Landroidx/lifecycle/MutableLiveData;", "deviceStatusLiveData", "b", "Lcom/huami/devicerecorder/IRecorderDevice;", "recordDevice", "Lcom/huami/devicerecorder/viewmodel/RecorderViewModel$b;", "c", "Lcom/huami/devicerecorder/viewmodel/RecorderViewModel$b;", "deviceStatusListener", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", GoogleApiAvailabilityLight.a, "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class RecorderViewModel extends AndroidViewModel {

    @NotNull
    private static final a d = new a(null);

    @Deprecated
    @NotNull
    private static final String e = "RecorderViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> deviceStatusLiveData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private IRecorderDevice recordDevice;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final b deviceStatusListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/devicerecorder/viewmodel/RecorderViewModel$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/huami/devicerecorder/viewmodel/RecorderViewModel$b", "Lcom/huami/devicerecorder/IRecorderDevice$IDeviceStatusListener;", "", "onDeviceConnected", "onDeviceDisconnected", "<init>", "(Lcom/huami/devicerecorder/viewmodel/RecorderViewModel;)V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
    public final class b implements IRecorderDevice.IDeviceStatusListener {
        public b() {
        }

        @Override // com.huami.devicerecorder.IRecorderDevice.IDeviceStatusListener
        public void onDeviceConnected() {
            LiveDataExKt.put(RecorderViewModel.this.getDeviceStatusLiveData(), Boolean.TRUE);
        }

        @Override // com.huami.devicerecorder.IRecorderDevice.IDeviceStatusListener
        public void onDeviceDisconnected() {
            LiveDataExKt.put(RecorderViewModel.this.getDeviceStatusLiveData(), Boolean.FALSE);
        }
    }

    public RecorderViewModel(@NotNull Application application) {
        super(application);
        this.deviceStatusLiveData = new MutableLiveData<>();
        this.deviceStatusListener = new b();
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeviceStatusLiveData() {
        return this.deviceStatusLiveData;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        IRecorderDevice iRecorderDevice = this.recordDevice;
        if (iRecorderDevice == null) {
            return;
        }
        iRecorderDevice.unregisterStatusListener(this.deviceStatusListener);
    }

    public final void setUp(@NotNull IRecorderDevice device) {
        this.recordDevice = device;
        if (device == null) {
            return;
        }
        device.registerStatusListener(this.deviceStatusListener);
    }
}
