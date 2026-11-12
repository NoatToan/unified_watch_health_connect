package com.huami.applet.jslog;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.applet.AppletConfig;
import com.huami.applet.R;
import com.huami.applet.databinding.AppletFragmentLaumberjackBinding;
import com.huami.applet.jslog.DeviceLogFragment;
import com.huami.bluetooth.profile.channel.module.lumberjack.LogStream;
import com.huami.bluetooth.profile.channel.module.lumberjack.Version;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import io.netty.util.internal.StringUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 E2\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\bC\u0010DJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0007J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\"\u0010\n\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001d\u0010B\u001a\u00020>8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010A¨\u0006F"}, d2 = {"Lcom/huami/applet/jslog/DeviceLogFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "u", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/LogStream;", "logStream", "", hl.k, "l", "i", "", "date", z.j, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDetach", "initLife", "onDestroyView", "Lcom/huami/applet/jslog/LaumberjackViewModel;", "a", "Lcom/huami/applet/jslog/LaumberjackViewModel;", "viewModel", "Lcom/huami/applet/databinding/AppletFragmentLaumberjackBinding;", "b", "Lcom/huami/applet/databinding/AppletFragmentLaumberjackBinding;", "binding", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "c", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "hmDeviceSource", "Landroid/widget/ListView;", GoogleApiAvailabilityLight.a, "Landroid/widget/ListView;", "deviceLogListView", "Ljava/util/ArrayList;", "e", "Ljava/util/ArrayList;", "deviceLogList", "Landroid/widget/Button;", "f", "Landroid/widget/Button;", "closeButton", "", "g", "Z", "closeDeviceLog", "", "h", LogUtil.I, "getI", "()I", "setI", "(I)V", "Ljava/text/SimpleDateFormat;", "Lkotlin/Lazy;", "m", "()Ljava/text/SimpleDateFormat;", "simpleDateFormat", "<init>", "()V", "Companion", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceLogFragment extends Fragment {

    @NotNull
    private static final String j = "jsapp";

    @NotNull
    private static final String k = "DeviceLogFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private LaumberjackViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private AppletFragmentLaumberjackBinding binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource hmDeviceSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private ListView deviceLogListView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<String> deviceLogList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Button closeButton;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean closeDeviceLog;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int i;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy simpleDateFormat;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Version a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Version version) {
            super(0);
            this.a = version;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Get channel version result > ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("关闭设置失败，result > ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Pair<Boolean, Integer> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Pair<Boolean, Integer> pair) {
            super(0);
            this.a = pair;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("打开设置失败，result > ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Integer a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Integer num) {
            super(0);
            this.a = num;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("通道异常 > ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/text/SimpleDateFormat;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<SimpleDateFormat> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy.MM.dd HH:mm:ss.SSSSSS", Locale.getDefault());
        }
    }

    public DeviceLogFragment() {
        HMBaseDevice hmBaseDevice = AppletConfig.INSTANCE.getHmBaseDevice();
        HMDeviceSource mDeviceSource = hmBaseDevice == null ? null : hmBaseDevice.getMDeviceSource();
        this.hmDeviceSource = mDeviceSource == null ? HMDeviceSource.VDEVICE : mDeviceSource;
        this.deviceLogList = new ArrayList<>();
        this.simpleDateFormat = LazyKt__LazyJVMKt.lazy(e.a);
    }

    private final void i() {
        LaumberjackViewModel laumberjackViewModel = this.viewModel;
        Objects.requireNonNull(laumberjackViewModel);
        Integer streamId = laumberjackViewModel.getStreamId(j);
        if (streamId == null) {
            return;
        }
        laumberjackViewModel.closeLogStream(streamId.intValue());
    }

    private final void initView() {
        AppletFragmentLaumberjackBinding appletFragmentLaumberjackBinding = this.binding;
        Objects.requireNonNull(appletFragmentLaumberjackBinding);
        ListView listView = appletFragmentLaumberjackBinding.appletDeviceLogListView;
        this.deviceLogListView = listView;
        Objects.requireNonNull(listView);
        listView.setAdapter((ListAdapter) new ListViewAdapter(requireActivity(), this.deviceLogList));
        AppletFragmentLaumberjackBinding appletFragmentLaumberjackBinding2 = this.binding;
        Objects.requireNonNull(appletFragmentLaumberjackBinding2);
        this.closeButton = appletFragmentLaumberjackBinding2.appletDeviceLogClose;
        AppletFragmentLaumberjackBinding appletFragmentLaumberjackBinding3 = this.binding;
        Objects.requireNonNull(appletFragmentLaumberjackBinding3);
        appletFragmentLaumberjackBinding3.appletDeviceLogClear.setOnClickListener(new View.OnClickListener() { // from class: a81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceLogFragment.s(this.a, view);
            }
        });
        Button button = this.closeButton;
        Objects.requireNonNull(button);
        button.setOnClickListener(new View.OnClickListener() { // from class: b81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceLogFragment.t(this.a, view);
            }
        });
    }

    private final String j(long date) {
        return m().format(new Date(date));
    }

    private final String k(LogStream logStream) {
        String subDomainId = logStream.getSubDomainId();
        String strL = l();
        if (strL != null && !Intrinsics.areEqual(strL, subDomainId)) {
            return null;
        }
        LaumberjackViewModel laumberjackViewModel = this.viewModel;
        Objects.requireNonNull(laumberjackViewModel);
        String strStringPlus = Intrinsics.stringPlus(laumberjackViewModel.getDomain(logStream.getStreamId()), "log");
        StringBuilder sb = new StringBuilder();
        sb.append(strStringPlus);
        sb.append(" > ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(JsonLexerKt.BEGIN_LIST);
        LaumberjackViewModel laumberjackViewModel2 = this.viewModel;
        Objects.requireNonNull(laumberjackViewModel2);
        sb2.append((Object) laumberjackViewModel2.getTagStr(logStream.getLevel()));
        sb2.append("] ");
        String string = sb2.toString();
        if (logStream.getTag().length() > 0) {
            string = string + Typography.less + logStream.getTag() + Typography.greater;
        }
        sb.append(string + j(logStream.getTimestamp()) + StringUtil.SPACE + logStream.getContent());
        return sb.toString();
    }

    private final String l() {
        if (!(getActivity() instanceof JsLogConsoleActivity)) {
            return null;
        }
        FragmentActivity activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type com.huami.applet.jslog.JsLogConsoleActivity");
        return ((JsLogConsoleActivity) activity).getAppId();
    }

    private final SimpleDateFormat m() {
        return (SimpleDateFormat) this.simpleDateFormat.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Version version) {
        if (version == null) {
            return;
        }
        HMLog.error$default(k, null, null, new a(version), 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(DeviceLogFragment deviceLogFragment, Boolean bool) {
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        if (bool.booleanValue()) {
            return;
        }
        Toast.makeText(deviceLogFragment.requireContext(), R.string.applet_device_log_setting_error, 0).show();
        HMLog.error$default(k, null, null, new b(bool), 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(DeviceLogFragment deviceLogFragment, Pair pair) {
        if (pair == null || ((Boolean) pair.getFirst()).booleanValue()) {
            return;
        }
        Toast.makeText(deviceLogFragment.requireContext(), R.string.applet_device_log_setting_error, 0).show();
        HMLog.error$default(k, null, null, new c(pair), 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Integer num) {
        if (num == null) {
            return;
        }
        num.intValue();
        HMLog.error$default(k, null, null, new d(num), 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(DeviceLogFragment deviceLogFragment, LogStream logStream) {
        if (logStream == null) {
            return;
        }
        String strK = deviceLogFragment.k(logStream);
        if (strK != null) {
            deviceLogFragment.deviceLogList.add(strK);
        }
        deviceLogFragment.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(DeviceLogFragment deviceLogFragment, View view) {
        deviceLogFragment.deviceLogList.clear();
        deviceLogFragment.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(DeviceLogFragment deviceLogFragment, View view) {
        boolean z;
        if (deviceLogFragment.closeDeviceLog) {
            LaumberjackViewModel laumberjackViewModel = deviceLogFragment.viewModel;
            Objects.requireNonNull(laumberjackViewModel);
            laumberjackViewModel.openLogStream(j);
            z = false;
        } else {
            LaumberjackViewModel laumberjackViewModel2 = deviceLogFragment.viewModel;
            Objects.requireNonNull(laumberjackViewModel2);
            laumberjackViewModel2.closeAllLogStream();
            z = true;
        }
        deviceLogFragment.closeDeviceLog = z;
        Button button = deviceLogFragment.closeButton;
        Objects.requireNonNull(button);
        button.setText(deviceLogFragment.getString(z ? R.string.applet_device_log_open : R.string.applet_device_log_close));
    }

    private final void u() {
        ListView listView = this.deviceLogListView;
        Objects.requireNonNull(listView);
        ListAdapter adapter = listView.getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.huami.applet.jslog.ListViewAdapter");
        ((ListViewAdapter) adapter).notifyDataSetInvalidated();
        ListView listView2 = this.deviceLogListView;
        Objects.requireNonNull(listView2);
        ListAdapter adapter2 = listView2.getAdapter();
        Objects.requireNonNull(adapter2, "null cannot be cast to non-null type com.huami.applet.jslog.ListViewAdapter");
        ((ListViewAdapter) adapter2).notifyDataSetChanged();
        ListView listView3 = this.deviceLogListView;
        Objects.requireNonNull(listView3);
        listView3.post(new Runnable() { // from class: h81
            @Override // java.lang.Runnable
            public final void run() {
                DeviceLogFragment.v(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(DeviceLogFragment deviceLogFragment) {
        ListView listView = deviceLogFragment.deviceLogListView;
        Objects.requireNonNull(listView);
        listView.setSelection(deviceLogFragment.deviceLogList.size() - 1);
    }

    public final int getI() {
        return this.i;
    }

    @SuppressLint({"StringFormatInvalid"})
    public final void initLife() {
        LaumberjackViewModel laumberjackViewModel = (LaumberjackViewModel) new ViewModelProvider(this).get(LaumberjackViewModel.class);
        this.viewModel = laumberjackViewModel;
        Objects.requireNonNull(laumberjackViewModel);
        laumberjackViewModel.initViewModel(this.hmDeviceSource);
        LaumberjackViewModel laumberjackViewModel2 = this.viewModel;
        Objects.requireNonNull(laumberjackViewModel2);
        laumberjackViewModel2.registerLogCallback();
        LaumberjackViewModel laumberjackViewModel3 = this.viewModel;
        Objects.requireNonNull(laumberjackViewModel3);
        laumberjackViewModel3.getVersionLd().observe(getViewLifecycleOwner(), new Observer() { // from class: f81
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DeviceLogFragment.n((Version) obj);
            }
        });
        LaumberjackViewModel laumberjackViewModel4 = this.viewModel;
        Objects.requireNonNull(laumberjackViewModel4);
        laumberjackViewModel4.getRlCloseLog().observe(getViewLifecycleOwner(), new Observer() { // from class: d81
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DeviceLogFragment.o(this.a, (Boolean) obj);
            }
        });
        LaumberjackViewModel laumberjackViewModel5 = this.viewModel;
        Objects.requireNonNull(laumberjackViewModel5);
        laumberjackViewModel5.getRlOpenLog().observe(getViewLifecycleOwner(), new Observer() { // from class: e81
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DeviceLogFragment.p(this.a, (Pair) obj);
            }
        });
        LaumberjackViewModel laumberjackViewModel6 = this.viewModel;
        Objects.requireNonNull(laumberjackViewModel6);
        laumberjackViewModel6.getError().observe(getViewLifecycleOwner(), new Observer() { // from class: g81
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DeviceLogFragment.q((Integer) obj);
            }
        });
        LaumberjackViewModel laumberjackViewModel7 = this.viewModel;
        Objects.requireNonNull(laumberjackViewModel7);
        laumberjackViewModel7.getLogStream().observe(getViewLifecycleOwner(), new Observer() { // from class: c81
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DeviceLogFragment.r(this.a, (LogStream) obj);
            }
        });
        LaumberjackViewModel laumberjackViewModel8 = this.viewModel;
        Objects.requireNonNull(laumberjackViewModel8);
        laumberjackViewModel8.queryVersion(j);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AppletFragmentLaumberjackBinding appletFragmentLaumberjackBindingInflate = AppletFragmentLaumberjackBinding.inflate(inflater);
        this.binding = appletFragmentLaumberjackBindingInflate;
        Objects.requireNonNull(appletFragmentLaumberjackBindingInflate);
        return appletFragmentLaumberjackBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        LaumberjackViewModel laumberjackViewModel = this.viewModel;
        Objects.requireNonNull(laumberjackViewModel);
        laumberjackViewModel.closeAllLogStream();
        LaumberjackViewModel laumberjackViewModel2 = this.viewModel;
        Objects.requireNonNull(laumberjackViewModel2);
        laumberjackViewModel2.unRegisterLogCallback();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        i();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initLife();
    }

    public final void setI(int i) {
        this.i = i;
    }
}
