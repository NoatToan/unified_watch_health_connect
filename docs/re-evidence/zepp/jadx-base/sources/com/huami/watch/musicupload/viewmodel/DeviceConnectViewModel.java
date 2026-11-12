package com.huami.watch.musicupload.viewmodel;

import android.app.Application;
import android.content.Context;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.musicupload.fragment.MusicConstantKt;
import com.huami.watch.wififtp.IWifiFtpListener;
import com.huami.watch.wififtp.WifiFtpModule;
import com.xiaomi.hm.health.bt.device.Status;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0002\t\u000fB\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00060\u000eR\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/DeviceConnectViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "setUp", "onCleared", "Landroidx/lifecycle/MutableLiveData;", "", "a", "Landroidx/lifecycle/MutableLiveData;", "getConnectLiveData", "()Landroidx/lifecycle/MutableLiveData;", "connectLiveData", "Lcom/huami/watch/musicupload/viewmodel/DeviceConnectViewModel$b;", "b", "Lcom/huami/watch/musicupload/viewmodel/DeviceConnectViewModel$b;", "connectListener", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", GoogleApiAvailabilityLight.a, "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class DeviceConnectViewModel extends AndroidViewModel {
    private static final String c = "DeviceConnectViewModel";

    @NotNull
    private static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> connectLiveData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b connectListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/watch/musicupload/viewmodel/DeviceConnectViewModel$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J$\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"com/huami/watch/musicupload/viewmodel/DeviceConnectViewModel$b", "Lcom/huami/watch/wififtp/IWifiFtpListener;", "", "state", "", "onWifiApStateChanged", "", "ipAddress", "userName", "onFtpServerStateChanged", "onDeviceConnected", "onDeviceDisconnected", "", "a", "Z", Status.PRE_CONNECT_STATE_CONNECTED, "<init>", "(Lcom/huami/watch/musicupload/viewmodel/DeviceConnectViewModel;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class b implements IWifiFtpListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private boolean connected;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onDeviceConnected";
            }
        }

        /* JADX INFO: renamed from: com.huami.watch.musicupload.viewmodel.DeviceConnectViewModel$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class C0668b extends Lambda implements Function0<String> {
            public static final C0668b a = new C0668b();

            public C0668b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onDeviceDisconnected";
            }
        }

        public b() {
        }

        @Override // com.huami.watch.wififtp.IWifiFtpListener
        public void onDeviceConnected() {
            a unused = DeviceConnectViewModel.d;
            HMLog.info(DeviceConnectViewModel.c, a.a);
            if (this.connected) {
                return;
            }
            this.connected = true;
            MusicConstantKt.put(DeviceConnectViewModel.this.getConnectLiveData(), Boolean.TRUE);
        }

        @Override // com.huami.watch.wififtp.IWifiFtpListener
        public void onDeviceDisconnected() {
            a unused = DeviceConnectViewModel.d;
            HMLog.info(DeviceConnectViewModel.c, C0668b.a);
            if (this.connected) {
                this.connected = false;
                MusicConstantKt.put(DeviceConnectViewModel.this.getConnectLiveData(), Boolean.FALSE);
            }
        }

        @Override // com.huami.watch.wififtp.IWifiFtpListener
        public void onFtpServerStateChanged(int state, @Nullable String ipAddress, @Nullable String userName) {
        }

        @Override // com.huami.watch.wififtp.IWifiFtpListener
        public void onWifiApStateChanged(int state) {
        }
    }

    public DeviceConnectViewModel(@NotNull Application application) {
        super(application);
        this.connectLiveData = new MutableLiveData<>();
        this.connectListener = new b();
    }

    @NotNull
    public final MutableLiveData<Boolean> getConnectLiveData() {
        return this.connectLiveData;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        WifiFtpModule.removeListener(this.connectListener);
    }

    public final void setUp(@NotNull Context context) {
        WifiFtpModule.addListener(this.connectListener);
        if (WifiFtpModule.isDeviceConnected(context)) {
            this.connectListener.onDeviceConnected();
        } else {
            this.connectListener.onDeviceDisconnected();
        }
    }
}
