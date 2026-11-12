package com.huami.watch.musicupload;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p010navigation.Navigation;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.view.basetitle.SystemBarTintManager;
import com.huami.watch.musicupload.logic.MusicUploadStatistics;
import com.huami.watch.musicupload.viewmodel.DeviceConnectViewModel;
import com.huami.watch.musicupload.viewmodel.DeviceStatusViewModel;
import com.huami.watch.musicupload.viewmodel.MusicUploadViewModel;
import com.huami.watch.musicupload.viewmodel.WifiFtpDevice;
import com.huami.watch.musicupload.viewmodel.WifiFtpViewModel;
import com.huami.watch.util.Event;
import com.huami.watch.wififtp.R;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.Status;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\"\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0014R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010%¨\u0006)"}, d2 = {"Lcom/huami/watch/musicupload/DeviceMusicActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "i", "h", z.j, "Landroid/app/Activity;", "activity", "", "dark", "", "color", "g", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "Lcom/huami/watch/musicupload/viewmodel/MusicUploadViewModel;", "a", "Lkotlin/Lazy;", "e", "()Lcom/huami/watch/musicupload/viewmodel/MusicUploadViewModel;", "uploadViewModel", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;", "b", "f", "()Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;", "wifiFtpViewModel", "Lcom/huami/watch/musicupload/viewmodel/DeviceConnectViewModel;", "c", "()Lcom/huami/watch/musicupload/viewmodel/DeviceConnectViewModel;", "deviceConnectViewModel", "Lcom/huami/watch/musicupload/viewmodel/DeviceStatusViewModel;", GoogleApiAvailabilityLight.a, "()Lcom/huami/watch/musicupload/viewmodel/DeviceStatusViewModel;", "deviceStatusViewModel", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpDevice;", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpDevice;", "wifiDevice", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class DeviceMusicActivity extends AppCompatActivity {
    private static final String g = "DeviceMusicActivity";

    @NotNull
    private static final a h = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy uploadViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy wifiFtpViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy deviceConnectViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy deviceStatusViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private WifiFtpDevice wifiDevice;
    private HashMap f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/watch/musicupload/DeviceMusicActivity$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/huami/watch/musicupload/ConnectStatus;", "connectStatus", "", "a", "(Lcom/huami/watch/musicupload/ConnectStatus;)V"}, k = 3, mv = {1, 4, 1})
    public static final class b<T> implements Observer<ConnectStatus> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ ConnectStatus a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ConnectStatus connectStatus) {
                super(0);
                this.a = connectStatus;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "receive establish status: " + this.a;
            }
        }

        public b() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@Nullable ConnectStatus connectStatus) {
            a unused = DeviceMusicActivity.h;
            HMLog.info(DeviceMusicActivity.g, new a(connectStatus));
            if (connectStatus == null) {
                return;
            }
            if (connectStatus == ConnectStatus.ConnectWatchWifiFailed || connectStatus == ConnectStatus.EnablePhoneWifiFailed) {
                DeviceMusicActivity.this.i();
                DeviceMusicActivity.this.e().allDownloadError();
            } else {
                ConnectStatus connectStatus2 = ConnectStatus.Connected;
                if (connectStatus != connectStatus2) {
                    DeviceMusicActivity.this.h();
                    DeviceMusicActivity.this.e().allDownloadError();
                } else if (connectStatus == connectStatus2) {
                    DeviceMusicActivity.this.e().startUpload();
                }
            }
            if (connectStatus != ConnectStatus.Connected) {
                MusicUploadStatistics.INSTANCE.recordUploadFailed(connectStatus.getValue(), DeviceMusicActivity.this.e().getFailedTaskCount());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "retry", "", "a", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 1})
    public static final class c<T> implements Observer<Boolean> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Boolean bool) {
                super(0);
                this.a = bool;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "receive retry establish " + this.a;
            }
        }

        public c() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(Boolean bool) {
            a unused = DeviceMusicActivity.h;
            HMLog.info(DeviceMusicActivity.g, new a(bool));
            if (bool.booleanValue()) {
                WifiFtpViewModel.establishConnection$default(DeviceMusicActivity.this.f(), DeviceMusicActivity.this, null, 2, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/huami/watch/util/Event;", "Lcom/huami/watch/musicupload/TransError;", "kotlin.jvm.PlatformType", "event", "", "a", "(Lcom/huami/watch/util/Event;)V"}, k = 3, mv = {1, 4, 1})
    public static final class d<T> implements Observer<Event<? extends TransError>> {
        public d() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(Event<? extends TransError> event) {
            if (event.getContentIfNotHandled() == TransError.WatchStorageNotEnough) {
                DeviceMusicActivity.this.e().stopUpload();
                MusicUploadStatistics.INSTANCE.recordUploadFailed("Watch storage not enough", DeviceMusicActivity.this.e().getFailedTaskCount());
                DeviceMusicActivity.this.f().disconnect();
                DeviceMusicActivity.this.j();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "finish", "", "a", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 1})
    public static final class e<T> implements Observer<Boolean> {
        public e() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                DeviceMusicActivity.this.e().stopUpload();
                DeviceMusicActivity.this.f().disconnect();
                int lastFailedTaskCount = DeviceMusicActivity.this.f().getLastFailedTaskCount();
                if (lastFailedTaskCount == 0) {
                    MusicUploadStatistics.INSTANCE.recordUploadSuccess();
                } else {
                    MusicUploadStatistics.INSTANCE.recordUploadFailed(DeviceMusicActivity.this.f().getLastErrorMsg(), lastFailedTaskCount);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "needRetry", "", "a", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 1})
    public static final class f<T> implements Observer<Boolean> {
        public f() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(Boolean bool) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                DeviceMusicActivity.this.f().disconnect();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", Status.PRE_CONNECT_STATE_CONNECTED, "", "a", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 1})
    public static final class g<T> implements Observer<Boolean> {
        public g() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                bool.booleanValue();
                DeviceMusicActivity.this.f().setDeviceConnected(bool.booleanValue());
                DeviceMusicActivity.this.e().setDeviceConnected(bool.booleanValue());
                DeviceMusicActivity.this.d().setDeviceConnected(bool.booleanValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "dialog", "", "which", "", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class h implements DialogInterface.OnClickListener {
        public static final h a = new h();

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "dialog", "", "which", "", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            Navigation.findNavController(DeviceMusicActivity.this, R.id.music_sync).navigate(R.id.to_guide_fragment);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "dialog", "", "which", "", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class j implements DialogInterface.OnClickListener {
        public static final j a = new j();

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public DeviceMusicActivity() {
        super(R.layout.activity_device_music);
        this.uploadViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MusicUploadViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.watch.musicupload.DeviceMusicActivity$$special$$inlined$viewModels$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.watch.musicupload.DeviceMusicActivity$$special$$inlined$viewModels$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        });
        this.wifiFtpViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(WifiFtpViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.watch.musicupload.DeviceMusicActivity$$special$$inlined$viewModels$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.watch.musicupload.DeviceMusicActivity$$special$$inlined$viewModels$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        });
        this.deviceConnectViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(DeviceConnectViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.watch.musicupload.DeviceMusicActivity$$special$$inlined$viewModels$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.watch.musicupload.DeviceMusicActivity$$special$$inlined$viewModels$5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        });
        this.deviceStatusViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(DeviceStatusViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.watch.musicupload.DeviceMusicActivity$$special$$inlined$viewModels$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.watch.musicupload.DeviceMusicActivity$$special$$inlined$viewModels$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        });
    }

    private final DeviceConnectViewModel c() {
        return (DeviceConnectViewModel) this.deviceConnectViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceStatusViewModel d() {
        return (DeviceStatusViewModel) this.deviceStatusViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MusicUploadViewModel e() {
        return (MusicUploadViewModel) this.uploadViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WifiFtpViewModel f() {
        return (WifiFtpViewModel) this.wifiFtpViewModel.getValue();
    }

    private final void g(Activity activity, boolean dark, @ColorInt int color) {
        SystemBarTintManager systemBarTintManager = new SystemBarTintManager(activity);
        StatusBarUtil.setStatusColor(activity, false, !dark, color);
        systemBarTintManager.setStatusBarTintEnabled(true);
        systemBarTintManager.setStatusBarTintColor(color);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.file_manager_dialog_disconnect_wifi_error_title).setMessage(R.string.file_manager_dialog_open_wifi_error_title).setNeutralButton(R.string.btn_enter, h.a).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.file_manager_dialog_open_wifi_error_title).setMessage(R.string.go_to_wifi_setting_alert_content).setNeutralButton(R.string.btn_enter, new i()).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.file_manager_dialog_disconnect_wifi_error_title).setMessage(R.string.watch_storage_not_enough).setNeutralButton(R.string.btn_enter, j.a).show(getSupportFragmentManager());
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.f;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i2) {
        if (this.f == null) {
            this.f = new HashMap();
        }
        View view = (View) this.f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i2);
        this.f.put(Integer.valueOf(i2), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        c().setUp(this);
        g(this, RainbowUtils.isDarkMode(this), ContextCompat.getColor(this, R.color.s38));
        WifiFtpDevice wifiFtpDevice = new WifiFtpDevice(this);
        this.wifiDevice = wifiFtpDevice;
        wifiFtpDevice.init();
        f().setup(this, this.wifiDevice);
        MusicUploadStatistics musicUploadStatistics = MusicUploadStatistics.INSTANCE;
        musicUploadStatistics.setDeviceSource(this.wifiDevice.getDeviceSourceValue(getApplicationContext()));
        musicUploadStatistics.recordComing();
        f().getEstablishResultLiveData().observe(this, new b());
        f().getRetryEstablishLiveData().observe(this, new c());
        f().getTransferErrorLiveData().observe(this, new d());
        e().setUploader(f().getMusicTransform());
        d().setMusicTransform(f().getMusicTransform());
        d().getFinishLiveData().observe(this, new e());
        d().getRetryCloseLiveData().observe(this, new f());
        c().getConnectLiveData().observe(this, new g());
        getWindow().addFlags(128);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.wifiDevice.deInit();
    }
}
