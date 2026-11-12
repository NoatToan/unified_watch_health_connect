package com.huami.devicerecorder;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p010navigation.Navigation;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicerecorder.DeviceRecorderActivity;
import com.huami.devicerecorder.model.RecordFile;
import com.huami.devicerecorder.model.RecorderStatistics;
import com.huami.devicerecorder.repository.RecordRepo;
import com.huami.devicerecorder.viewmodel.RecorderFileListViewModel;
import com.huami.devicerecorder.viewmodel.RecorderSyncViewModel;
import com.huami.devicerecorder.viewmodel.RecorderViewModel;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.view.basetitle.SystemBarTintManager;
import com.huami.watch.musicupload.ConnectStatus;
import com.huami.watch.musicupload.viewmodel.IWifiFtpDevice;
import com.huami.watch.musicupload.viewmodel.MusicTransmitter;
import com.huami.watch.musicupload.viewmodel.WifiFtpViewModel;
import com.loc.z;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002/\u0012B\u0007¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J \u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0014R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#R\u001d\u0010(\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b&\u0010'R\u001d\u0010,\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/huami/devicerecorder/DeviceRecorderActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", hl.k, "l", GoogleApiAvailabilityLight.b, "Landroid/app/Activity;", "activity", "", "dark", "", "color", z.j, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice;", "a", "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice;", "wifiDevice", "Lcom/huami/devicerecorder/viewmodel/RecorderSyncViewModel;", "b", "Lkotlin/Lazy;", "h", "()Lcom/huami/devicerecorder/viewmodel/RecorderSyncViewModel;", "syncViewModel", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;", "c", "i", "()Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;", "wifiFtpViewModel", "Lcom/huami/devicerecorder/viewmodel/RecorderFileListViewModel;", GoogleApiAvailabilityLight.a, "e", "()Lcom/huami/devicerecorder/viewmodel/RecorderFileListViewModel;", "fileListViewModel", "Lcom/huami/devicerecorder/viewmodel/RecorderViewModel;", "g", "()Lcom/huami/devicerecorder/viewmodel/RecorderViewModel;", "recordViewModel", "Lcom/huami/devicerecorder/IContentProvider;", "f", "()Lcom/huami/devicerecorder/IContentProvider;", "provider", "<init>", "()V", "Companion", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceRecorderActivity extends AppCompatActivity {

    @NotNull
    private static final String g = "DeviceRecorderActivity";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private IWifiFtpDevice wifiDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy wifiFtpViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy fileListViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy recordViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy provider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/huami/devicerecorder/DeviceRecorderActivity$a", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$ITransformCompleteListener;", "", "onComplete", "onStart", "<init>", "(Lcom/huami/devicerecorder/DeviceRecorderActivity;)V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
    public final class a implements MusicTransmitter.ITransformCompleteListener {
        public a() {
        }

        @Override // com.huami.watch.musicupload.viewmodel.MusicTransmitter.ITransformCompleteListener
        public void onComplete() {
            int size = DeviceRecorderActivity.this.h().getSyncItems().size();
            if (size == 0) {
                RecorderStatistics.INSTANCE.recordDownloadSuccess();
            } else {
                RecorderStatistics.INSTANCE.recordDownloadFailed(DeviceRecorderActivity.this.i().getLastErrorMsg(), size);
            }
        }

        @Override // com.huami.watch.musicupload.viewmodel.MusicTransmitter.ITransformCompleteListener
        public void onStart() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ ConnectStatus a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ConnectStatus connectStatus) {
            super(0);
            this.a = connectStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "receive establish status: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "receive retry establish " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "device on connected: " + this.a;
        }
    }

    public DeviceRecorderActivity() {
        super(R.layout.activity_device_record);
        this.syncViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(RecorderSyncViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.devicerecorder.DeviceRecorderActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.devicerecorder.DeviceRecorderActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelProvider.Factory getA() {
                return this.getDefaultViewModelProviderFactory();
            }
        });
        this.wifiFtpViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(WifiFtpViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.devicerecorder.DeviceRecorderActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.devicerecorder.DeviceRecorderActivity$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelProvider.Factory getA() {
                return this.getDefaultViewModelProviderFactory();
            }
        });
        this.fileListViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(RecorderFileListViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.devicerecorder.DeviceRecorderActivity$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.devicerecorder.DeviceRecorderActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelProvider.Factory getA() {
                return this.getDefaultViewModelProviderFactory();
            }
        });
        this.recordViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(RecorderViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.devicerecorder.DeviceRecorderActivity$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.devicerecorder.DeviceRecorderActivity$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelProvider.Factory getA() {
                return this.getDefaultViewModelProviderFactory();
            }
        });
        this.provider = KoinJavaComponent.inject$default(IContentProvider.class, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecorderFileListViewModel e() {
        return (RecorderFileListViewModel) this.fileListViewModel.getValue();
    }

    private final IContentProvider f() {
        return (IContentProvider) this.provider.getValue();
    }

    private final RecorderViewModel g() {
        return (RecorderViewModel) this.recordViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecorderSyncViewModel h() {
        return (RecorderSyncViewModel) this.syncViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WifiFtpViewModel i() {
        return (WifiFtpViewModel) this.wifiFtpViewModel.getValue();
    }

    private final void j(Activity activity, boolean dark, int color) {
        SystemBarTintManager systemBarTintManager = new SystemBarTintManager(activity);
        StatusBarUtil.setStatusColor(activity, false, dark, color);
        systemBarTintManager.setStatusBarTintEnabled(true);
        systemBarTintManager.setStatusBarTintColor(color);
    }

    private final void k() {
        f().init();
        IRecorderDecoder recorderDecoder = f().getRecorderDecoder();
        String localRecorderSaveFolder = f().getLocalRecorderSaveFolder();
        IWifiFtpDevice wifiFtpDevice = f().getWifiFtpDevice();
        i().getMusicTransform().setTransformCompleteListener(new a());
        h().setTransmitter(recorderDecoder, i().getMusicTransform(), localRecorderSaveFolder);
        e().setup(new RecordRepo(f().getRecorderDB(), f().getRecorderDevice()));
        this.wifiDevice = wifiFtpDevice;
        WifiFtpViewModel wifiFtpViewModelI = i();
        IWifiFtpDevice iWifiFtpDevice = this.wifiDevice;
        if (iWifiFtpDevice == null) {
            iWifiFtpDevice = null;
        }
        wifiFtpViewModelI.setup(this, iWifiFtpDevice);
        g().setUp(f().getRecorderDevice());
        h().setFileDownloadListener(new RecorderSyncViewModel.IDownloadFinish() { // from class: com.huami.devicerecorder.DeviceRecorderActivity$setUpViewModel$1
            @Override // com.huami.devicerecorder.viewmodel.RecorderSyncViewModel.IDownloadFinish
            public void onFinish(@NotNull RecordFile recordFile) {
                this.a.e().addLocalRecorderFile(recordFile);
            }
        });
        RecorderStatistics recorderStatistics = RecorderStatistics.INSTANCE;
        recorderStatistics.setDeviceSource(wifiFtpDevice.getDeviceSourceValue(this));
        recorderStatistics.recordComing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.file_manager_dialog_open_wifi_error_title).setMessage(R.string.go_to_wifi_setting_alert_content).setNeutralButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: q81
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeviceRecorderActivity.m(this.a, dialogInterface, i);
            }
        }).setCancelable(true).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(DeviceRecorderActivity deviceRecorderActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Navigation.findNavController(deviceRecorderActivity, R.id.device_record).navigate(R.id.to_guide_fragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(this);
        builder.setTitle(R.string.file_manager_dialog_disconnect_wifi_error_title);
        builder.setMessage(R.string.file_manager_dialog_disconnect_wifi_error_content);
        builder.setNeutralButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: r81
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeviceRecorderActivity.o(dialogInterface, i);
            }
        });
        builder.show(getSupportFragmentManager(), "DisConnectDeviceWifi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        j(this, !RainbowUtils.isDarkMode(this), ContextCompat.getColor(this, R.color.s38));
        k();
        i().getEstablishResultLiveData().observe(this, new Observer<T>() { // from class: com.huami.devicerecorder.DeviceRecorderActivity$onCreate$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                ConnectStatus connectStatus = (ConnectStatus) t;
                HMLog.info("DeviceRecorderActivity", new DeviceRecorderActivity.b(connectStatus));
                if (connectStatus == null) {
                    return;
                }
                if (connectStatus == ConnectStatus.ConnectWatchWifiFailed || connectStatus == ConnectStatus.EnablePhoneWifiFailed) {
                    this.a.l();
                } else {
                    ConnectStatus connectStatus2 = ConnectStatus.Connected;
                    if (connectStatus != connectStatus2) {
                        this.a.n();
                    } else if (connectStatus == connectStatus2) {
                        this.a.h().startTransfer();
                    }
                }
                if (connectStatus != ConnectStatus.Connected) {
                    RecorderStatistics.INSTANCE.recordDownloadFailed(connectStatus.getValue(), this.a.h().getSyncItems().size());
                }
            }
        });
        i().getRetryEstablishLiveData().observe(this, new Observer<T>() { // from class: com.huami.devicerecorder.DeviceRecorderActivity$onCreate$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Boolean bool = (Boolean) t;
                HMLog.info("DeviceRecorderActivity", new DeviceRecorderActivity.c(bool));
                if (bool.booleanValue()) {
                    WifiFtpViewModel.establishConnection$default(this.a.i(), this.a, null, 2, null);
                }
            }
        });
        g().getDeviceStatusLiveData().observe(this, new Observer<T>() { // from class: com.huami.devicerecorder.DeviceRecorderActivity$onCreate$$inlined$observe$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Boolean bool = (Boolean) t;
                HMLog.info("DeviceRecorderActivity", new DeviceRecorderActivity.d(bool));
                if (bool == null) {
                    return;
                }
                bool.booleanValue();
                this.a.e().onDeviceConnect(bool.booleanValue());
                this.a.h().onDeviceConnect(bool.booleanValue());
            }
        });
        getWindow().addFlags(128);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        IContentProvider iContentProviderF = f();
        if (iContentProviderF == null) {
            return;
        }
        iContentProviderF.deInit();
    }
}
