package com.huami.applet.setting;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.applet.AppletConfig;
import com.huami.applet.ConstantKt;
import com.huami.applet.R;
import com.huami.applet.event.HMBleDeviceEvent;
import com.huami.applet.extension.BooleanExt;
import com.huami.applet.extension.ContextExtKt;
import com.huami.applet.extension.Otherwise;
import com.huami.applet.extension.WithData;
import com.huami.applet.jsengine.ContainerFactoryKt;
import com.huami.applet.jsengine.engine.AppletWebView;
import com.huami.applet.jsengine.plugin.OpenAuthWindow;
import com.huami.applet.setting.JsSettingActivity;
import com.huami.applet.utils.NetBroadcastReceiver;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.StatusBarUtil;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b9\u0010:J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\u0012\u0010\u0014\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0018\u001a\u00020\u0002H\u0014J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0014J\b\u0010\u001b\u001a\u00020\u0002H\u0014J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dR\u001d\u0010%\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010.\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010-R\u001d\u00102\u001a\u00020/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b0\u00101R\u001d\u00106\u001a\u0002038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\"\u001a\u0004\b4\u00105R\u001d\u00108\u001a\u00020/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b7\u00101¨\u0006<"}, d2 = {"Lcom/huami/applet/setting/JsSettingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", GoogleApiAvailabilityLight.a, z.j, "Lcom/huami/applet/event/HMBleDeviceEvent;", "event", "m", DTransferConstants.SEARCH_KEY, "Landroid/content/Intent;", "intent", "o", "initTitle", "l", "", "flag", "", "text", hl.k, com.google.android.exoplayer2.text.ttml.b.r, "onNewIntent", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "onAttachedToWindow", "onPause", "onDestroy", "onEventMainThread", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "refreshPage", "Lcom/huami/applet/jsengine/engine/AppletWebView;", "a", "Lkotlin/Lazy;", "g", "()Lcom/huami/applet/jsengine/engine/AppletWebView;", "settingWebView", "Lcom/huami/applet/setting/TipDialogFragment;", "b", "Lcom/huami/applet/setting/TipDialogFragment;", "tipDialogFragment", "Landroid/widget/ImageButton;", "c", "f", "()Landroid/widget/ImageButton;", "ivTitleBarBackArrow", "Landroid/widget/TextView;", "i", "()Landroid/widget/TextView;", "tvTitleBarTitle", "Landroidx/constraintlayout/widget/ConstraintLayout;", "e", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "clDefaultPage", "h", "tvErrorTip", "<init>", "()V", "Companion", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class JsSettingActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TITLE = "title";

    @NotNull
    public static final String WEB_URL = "webUrl";
    private static final long g;

    @NotNull
    private static String h;

    @NotNull
    private static String i;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private TipDialogFragment tipDialogFragment;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingWebView = LazyKt__LazyJVMKt.lazy(new h());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivTitleBarBackArrow = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvTitleBarTitle = LazyKt__LazyJVMKt.lazy(new k());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy clDefaultPage = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvErrorTip = LazyKt__LazyJVMKt.lazy(new j());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0016\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/huami/applet/setting/JsSettingActivity$Companion;", "", "", "timestamp", "J", "getTimestamp", "()J", "", "settingBootUrl", "Ljava/lang/String;", "getSettingBootUrl", "()Ljava/lang/String;", "setSettingBootUrl", "(Ljava/lang/String;)V", "stagingSettingBootUrl", "getStagingSettingBootUrl", "setStagingSettingBootUrl", ShareConstants.TITLE, "WEB_URL", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getSettingBootUrl() {
            return JsSettingActivity.h;
        }

        @NotNull
        public final String getStagingSettingBootUrl() {
            return JsSettingActivity.i;
        }

        public final long getTimestamp() {
            return JsSettingActivity.g;
        }

        public final void setSettingBootUrl(@NotNull String str) {
            JsSettingActivity.h = str;
        }

        public final void setStagingSettingBootUrl(@NotNull String str) {
            JsSettingActivity.i = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/constraintlayout/widget/ConstraintLayout;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ConstraintLayout> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConstraintLayout invoke() {
            return (ConstraintLayout) JsSettingActivity.this.findViewById(R.id.cl_default);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("in isConnected：", Boolean.valueOf(this.a));
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
            return Intrinsics.stringPlus("AppletConfig.hmBleDeviceEvent：", AppletConfig.INSTANCE.getHmBleDeviceEvent());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ImageButton;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<ImageButton> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageButton invoke() {
            return (ImageButton) JsSettingActivity.this.findViewById(R.id.iv_back_arrow);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("in onNewIntent：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBleDeviceEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HMBleDeviceEvent hMBleDeviceEvent) {
            super(0);
            this.a = hMBleDeviceEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("in onEventMainThread：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<Boolean, Unit> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            BooleanExt withData;
            JsSettingActivity jsSettingActivity = JsSettingActivity.this;
            if (z) {
                withData = Otherwise.INSTANCE;
            } else {
                ContextExtKt.toast(jsSettingActivity, jsSettingActivity.getString(R.string.applet_net_error));
                withData = new WithData(Unit.INSTANCE);
            }
            JsSettingActivity jsSettingActivity2 = JsSettingActivity.this;
            if (withData instanceof Otherwise) {
                if (jsSettingActivity2.g().getVisibility() != 0) {
                    jsSettingActivity2.p();
                }
            } else {
                if (!(withData instanceof WithData)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((WithData) withData).getData();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/applet/jsengine/engine/AppletWebView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<AppletWebView> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AppletWebView invoke() {
            return ContainerFactoryKt.settingContainer(JsSettingActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<View, Unit> {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            JsSettingActivity.this.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<TextView> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) JsSettingActivity.this.findViewById(R.id.tv_error_tip);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<TextView> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) JsSettingActivity.this.findViewById(R.id.tv_title);
        }
    }

    static {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        g = timeInMillis;
        h = Intrinsics.stringPlus("https://zepp-os.zepp.com/app-settings/v1.0.0/index.html?appId=%s&t=", Long.valueOf(timeInMillis));
        i = Intrinsics.stringPlus("https://zepp-os-staging.zepp.com/app-settings/v1.0.0/index.html?appId=%s&t=", Long.valueOf(timeInMillis));
    }

    private final void d() {
        String stringExtra = getIntent().getStringExtra(WEB_URL);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.setting);
        AppletWebView appletWebViewG = g();
        appletWebViewG.setDebug(true);
        linearLayout.addView(appletWebViewG);
        appletWebViewG.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        appletWebViewG.requestLayout();
        if (stringExtra == null) {
            return;
        }
        appletWebViewG.loadUrl(stringExtra);
    }

    private final ConstraintLayout e() {
        return (ConstraintLayout) this.clDefaultPage.getValue();
    }

    private final ImageButton f() {
        return (ImageButton) this.ivTitleBarBackArrow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppletWebView g() {
        return (AppletWebView) this.settingWebView.getValue();
    }

    private final TextView h() {
        return (TextView) this.tvErrorTip.getValue();
    }

    private final TextView i() {
        return (TextView) this.tvTitleBarTitle.getValue();
    }

    private final void initTitle() {
        i().setText(getIntent().getStringExtra("title"));
        StatusBarUtil.setStatusColor(this, false, true, -1);
        f().setOnClickListener(new View.OnClickListener() { // from class: gk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JsSettingActivity.n(this.a, view);
            }
        });
    }

    private final void j() {
        BooleanExt withData;
        HMBaseDevice hmBaseDevice = AppletConfig.INSTANCE.getHmBaseDevice();
        boolean zIsConnected = hmBaseDevice == null ? false : hmBaseDevice.isConnected();
        HMLog.info(ConstantKt.TAG_APPLET, new b(zIsConnected));
        HMLog.info(ConstantKt.TAG_APPLET, c.a);
        if (zIsConnected) {
            withData = Otherwise.INSTANCE;
        } else {
            q();
            withData = new WithData(Unit.INSTANCE);
        }
        if (!(withData instanceof Otherwise)) {
            if (!(withData instanceof WithData)) {
                throw new NoWhenBranchMatchedException();
            }
            ((WithData) withData).getData();
        } else {
            TipDialogFragment tipDialogFragment = this.tipDialogFragment;
            if (tipDialogFragment == null) {
                return;
            }
            tipDialogFragment.dismissAllowingStateLoss();
        }
    }

    private final void k(boolean flag, String text) {
        BooleanExt withData;
        if (flag) {
            g().setVisibility(0);
            e().setVisibility(8);
            withData = new WithData(Unit.INSTANCE);
        } else {
            withData = Otherwise.INSTANCE;
        }
        if (withData instanceof Otherwise) {
            g().setVisibility(8);
            e().setVisibility(0);
            h().setText(text);
        } else {
            if (!(withData instanceof WithData)) {
                throw new NoWhenBranchMatchedException();
            }
            ((WithData) withData).getData();
        }
    }

    private final void l() {
        k(ContextExtKt.isNetworkConnected(this), getString(R.string.applet_net_error));
    }

    private final void m(HMBleDeviceEvent event) {
        if (event != null) {
            if (event.isDisconnected() || event.isUnbound()) {
                q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(JsSettingActivity jsSettingActivity, View view) {
        jsSettingActivity.finish();
    }

    private final void o(Intent intent) throws JSONException {
        Uri data;
        Unit unit = null;
        String string = (intent == null || (data = intent.getData()) == null) ? null : data.toString();
        HMLog.info(ConstantKt.TAG_APPLET, new e(string));
        if (string != null) {
            OpenAuthWindow.Companion.packGetResult$default(OpenAuthWindow.INSTANCE, g(), string, null, 4, null);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            OpenAuthWindow.Companion.packGetResult$default(OpenAuthWindow.INSTANCE, g(), null, "未获取到授权数据", 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        l();
        g().loadUrl(getIntent().getStringExtra(WEB_URL));
    }

    private final void q() {
        TipDialogFragment tipDialogFragment = this.tipDialogFragment;
        if (tipDialogFragment != null) {
            if (tipDialogFragment != null && tipDialogFragment.isShowing()) {
                return;
            }
        }
        this.tipDialogFragment = TipDialogFragment.INSTANCE.create(getString(R.string.applet_device_dis_connect), getString(R.string.applet_confirm), new i()).showDialog(this).setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.applet_activity_setting);
        EventBus.getDefault().register(this);
        initTitle();
        j();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        g().destroy();
        TipDialogFragment tipDialogFragment = this.tipDialogFragment;
        if (tipDialogFragment != null) {
            tipDialogFragment.dismissAllowingStateLoss();
        }
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    public final void onEventMainThread(@NotNull HMBleDeviceEvent event) {
        HMLog.info(ConstantKt.TAG_APPLET, new f(event));
        AppletConfig.INSTANCE.setHmBleDeviceEvent(event);
        if (!event.isConnected()) {
            m(event);
            return;
        }
        TipDialogFragment tipDialogFragment = this.tipDialogFragment;
        if (tipDialogFragment == null) {
            return;
        }
        tipDialogFragment.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) throws JSONException {
        super.onNewIntent(intent);
        setIntent(intent);
        o(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        NetBroadcastReceiver.INSTANCE.unregister(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        l();
        NetBroadcastReceiver.INSTANCE.register(this, new g());
    }

    public final void refreshPage(@NotNull View view) {
        p();
    }
}
