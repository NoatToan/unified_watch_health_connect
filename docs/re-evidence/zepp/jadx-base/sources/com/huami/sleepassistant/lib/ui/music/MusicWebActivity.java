package com.huami.sleepassistant.lib.ui.music;

import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.discovery.bridge.jsbridge.JsBridgeWebView;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sleepassistant.apilib.bean.AlarmClockBean;
import com.huami.sleepassistant.apilib.bean.SleepMusicBean;
import com.huami.sleepassistant.apilib.bean.SleepServiceBean;
import com.huami.sleepassistant.apilib.helper.AppExecutors;
import com.huami.sleepassistant.apilib.utils.ext.SleepBeanToPoExKt;
import com.huami.sleepassistant.apilib.vo.MusicControlVo;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.ui.base.Navigator;
import com.huami.sleepassistant.lib.ui.music.MusicWebActivity;
import com.huami.sleepassistant.lib.ui.music.mediautils.MediaMusicPlayUtils1;
import com.huami.sleepassistant.lib.utils.DeviceManagerUtils;
import com.huami.sleepassistant.lib.utils.NotificationsUtils;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.huami.tools.log.HMLog;
import com.huami.web.container.WebActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b*\u00012\b\u0000\u0018\u0000 72\u00020\u00012\u00020\u0002:\u000278B\u0007¢\u0006\u0004\b5\u00106J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\u0007H\u0002J \u0010\u0011\u001a\u001a\u0012\b\u0012\u00060\u000fR\u00020\u00000\u000ej\f\u0012\b\u0012\u00060\u000fR\u00020\u0000`\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0012\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u001a\u001a\u00020\u0007H\u0014J\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0005R\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u001d\u0010&\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R \u00101\u001a\f\u0012\u0004\u0012\u00020\u00070.j\u0002`/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00103¨\u00069"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/music/MusicWebActivity;", "Lcom/huami/web/container/WebActivity;", "Lorg/koin/core/component/KoinComponent;", "", "action", "Lcom/huami/sleepassistant/apilib/bean/SleepServiceBean;", "sleepServiceBean", "", "L", "data", "F", LogUtil.I, ExifInterface.LATITUDE_SOUTH, "Q", "Ljava/util/ArrayList;", "Lcom/huami/sleepassistant/lib/ui/music/MusicWebActivity$PInfo;", "Lkotlin/collections/ArrayList;", "J", "Landroid/content/pm/PackageInfo;", "pInfo", "", "N", "O", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "Lcom/huami/sleepassistant/apilib/bean/AlarmClockBean;", "serviceBean", "onEventMainThread", "Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService$MediaBinder;", "Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService$MediaBinder;", "binder", "Lcom/huami/sleepassistant/lib/ui/music/MusicWebViewModel;", "G", "Lkotlin/Lazy;", "K", "()Lcom/huami/sleepassistant/lib/ui/music/MusicWebViewModel;", "viewModel", "Landroid/content/SharedPreferences;", "H", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Lkotlin/Function0;", "Lcom/huami/sleepassistant/servicelib/service/OnPlayStatusChange;", "Lkotlin/jvm/functions/Function0;", "mOnPlayStatusChange", "com/huami/sleepassistant/lib/ui/music/MusicWebActivity$mServiceConnection$1", "Lcom/huami/sleepassistant/lib/ui/music/MusicWebActivity$mServiceConnection$1;", "mServiceConnection", "<init>", "()V", "Companion", "PInfo", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class MusicWebActivity extends WebActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String L = "MusicWebActivity";
    private static final int M = 11;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    private MediaPlayService.MediaBinder binder;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    private final Handler handler;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> mOnPlayStatusChange;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    private final MusicWebActivity$mServiceConnection$1 mServiceConnection;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/music/MusicWebActivity$Companion;", "", "Landroid/content/Context;", "activity", "Lcom/huami/discovery/bridge/model/WebItem;", "webItem", "", WebConstant.QueryParam.LAUNCH, "", "MIN_PACKAGE_LENGTH", LogUtil.I, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context activity, @NotNull WebItem webItem) {
            Intent intent = new Intent(activity, (Class<?>) MusicWebActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(WebActivity.KEY_WEB_ITEM, webItem);
            activity.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/music/MusicWebActivity$PInfo;", "", "", "a", "Ljava/lang/String;", "getAppname", "()Ljava/lang/String;", "setAppname", "(Ljava/lang/String;)V", "appname", "b", "getPname", "setPname", "pname", "c", "getVersionName", "setVersionName", "versionName", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getVersionCode", "()I", "setVersionCode", "(I)V", "versionCode", "Landroid/graphics/drawable/Drawable;", "e", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "icon", "<init>", "(Lcom/huami/sleepassistant/lib/ui/music/MusicWebActivity;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public final class PInfo {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private String appname = "";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private String pname = "";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private String versionName = "";

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private int versionCode;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        private Drawable icon;

        public PInfo() {
        }

        @NotNull
        public final String getAppname() {
            return this.appname;
        }

        @Nullable
        public final Drawable getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getPname() {
            return this.pname;
        }

        public final int getVersionCode() {
            return this.versionCode;
        }

        @NotNull
        public final String getVersionName() {
            return this.versionName;
        }

        public final void setAppname(@NotNull String str) {
            this.appname = str;
        }

        public final void setIcon(@Nullable Drawable drawable) {
            this.icon = drawable;
        }

        public final void setPname(@NotNull String str) {
            this.pname = str;
        }

        public final void setVersionCode(int i) {
            this.versionCode = i;
        }

        public final void setVersionName(@NotNull String str) {
            this.versionName = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.huami.sleepassistant.lib.ui.music.MusicWebActivity$mServiceConnection$1] */
    public MusicWebActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleepassistant.lib.ui.music.MusicWebActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MusicWebViewModel>() { // from class: com.huami.sleepassistant.lib.ui.music.MusicWebActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleepassistant.lib.ui.music.MusicWebViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final MusicWebViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(MusicWebViewModel.class), function0, objArr);
            }
        });
        this.handler = new Handler(Looper.getMainLooper());
        this.mOnPlayStatusChange = new Function0<Unit>() { // from class: com.huami.sleepassistant.lib.ui.music.MusicWebActivity$mOnPlayStatusChange$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2() {
                if (MediaMusicPlayUtils1.INSTANCE.getInstance(this.a).isPlaying()) {
                    this.a.S();
                }
            }
        };
        this.mServiceConnection = new ServiceConnection() { // from class: com.huami.sleepassistant.lib.ui.music.MusicWebActivity$mServiceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(@Nullable ComponentName p0, @Nullable IBinder service) {
                MusicWebActivity musicWebActivity = this.a;
                Objects.requireNonNull(service, "null cannot be cast to non-null type com.huami.sleepassistant.lib.ui.music.MediaPlayService.MediaBinder");
                musicWebActivity.binder = (MediaPlayService.MediaBinder) service;
                MediaPlayService.MediaBinder mediaBinder = this.a.binder;
                if (mediaBinder != null) {
                    final MusicWebActivity musicWebActivity2 = this.a;
                    mediaBinder.setMusicWebCallback(new MusicWebCallback() { // from class: com.huami.sleepassistant.lib.ui.music.MusicWebActivity$mServiceConnection$1$onServiceConnected$1
                        @Override // com.huami.sleepassistant.lib.ui.music.MusicWebCallback
                        public void onResult(@NotNull String data) {
                            MusicWebActivity.M(musicWebActivity2, data, null, 2, null);
                        }
                    });
                }
                MediaMusicPlayUtils1.INSTANCE.getInstance(this.a).addPlayStatusChange(this.a.mOnPlayStatusChange);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@Nullable ComponentName p0) {
            }
        };
    }

    private final void F(final String data) {
        this.handler.post(new Runnable() { // from class: pa5
            @Override // java.lang.Runnable
            public final void run() {
                MusicWebActivity.G(this.a, data);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(MusicWebActivity musicWebActivity, String str) {
        WebView webView = musicWebActivity.mWebFragment.getWebView();
        JsBridgeWebView jsBridgeWebView = webView instanceof JsBridgeWebView ? (JsBridgeWebView) webView : null;
        if (jsBridgeWebView == null) {
            return;
        }
        jsBridgeWebView.callHandler("sleepAudioStatus", str, new JsCallBackFunction() { // from class: na5
            @Override // com.huami.discovery.bridge.jsbridge.JsCallBackFunction
            public final void onCallBack(String str2) {
                MusicWebActivity.H(str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(String str) {
    }

    private final String I() {
        MediaPlayService.MediaBinder mediaBinder = this.binder;
        boolean z = false;
        if (mediaBinder != null && mediaBinder.isPlaying()) {
            z = true;
        }
        if (z) {
            MediaPlayService.MediaBinder mediaBinder2 = this.binder;
            return (mediaBinder2 != null ? mediaBinder2.getPlayType() : null) == MediaMusicPlayUtils1.PlayType.SINGLE_AUDIO ? "0" : "7";
        }
        MediaPlayService.MediaBinder mediaBinder3 = this.binder;
        return (mediaBinder3 != null ? mediaBinder3.getPlayType() : null) == MediaMusicPlayUtils1.PlayType.SINGLE_AUDIO ? "1" : "8";
    }

    private final ArrayList<PInfo> J() {
        ArrayList<PInfo> arrayList = new ArrayList<>();
        int i = 0;
        List<PackageInfo> installedPackages = getPackageManager().getInstalledPackages(0);
        int size = installedPackages.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                PackageInfo packageInfo = installedPackages.get(i);
                if (packageInfo.versionName != null) {
                    PInfo pInfo = new PInfo();
                    pInfo.setAppname(packageInfo.applicationInfo.loadLabel(getPackageManager()).toString());
                    pInfo.setPname(packageInfo.packageName);
                    pInfo.setVersionName(packageInfo.versionName);
                    pInfo.setVersionCode(packageInfo.versionCode);
                    pInfo.setIcon(packageInfo.applicationInfo.loadIcon(getPackageManager()));
                    arrayList.add(pInfo);
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    private final MusicWebViewModel K() {
        return (MusicWebViewModel) this.viewModel.getValue();
    }

    private final void L(String action, SleepServiceBean sleepServiceBean) {
        String collectionId;
        String str;
        MediaPlayService.MediaBinder mediaBinder = this.binder;
        List<MusicControlVo> currentMusicList = mediaBinder == null ? null : mediaBinder.getCurrentMusicList();
        boolean z = false;
        if (currentMusicList == null || currentMusicList.isEmpty()) {
            if (sleepServiceBean == null) {
                return;
            }
            F(new Gson().toJson(new SleepServiceBean(sleepServiceBean.getType(), action, sleepServiceBean.getTotalTime(), sleepServiceBean.getAlbumNo(), sleepServiceBean.getData(), 0, 32, null)));
            return;
        }
        ArrayList arrayList = new ArrayList();
        MediaPlayService.MediaBinder mediaBinder2 = this.binder;
        boolean z2 = !TextUtils.isEmpty(mediaBinder2 != null ? mediaBinder2.getCollectionId() : null);
        MediaPlayService.MediaBinder mediaBinder3 = this.binder;
        String str2 = (mediaBinder3 == null || (collectionId = mediaBinder3.getCollectionId()) == null) ? "" : collectionId;
        MediaPlayService.MediaBinder mediaBinder4 = this.binder;
        long playTotalTime = TimeUtils.TIME_30_MINUTE;
        long currentTime = mediaBinder4 == null ? 1800L : mediaBinder4.getCurrentTime();
        MediaPlayService.MediaBinder mediaBinder5 = this.binder;
        if (mediaBinder5 != null) {
            playTotalTime = mediaBinder5.getPlayTotalTime();
        }
        long j = playTotalTime;
        MediaPlayService.MediaBinder mediaBinder6 = this.binder;
        int listLoopMediaPosition = mediaBinder6 == null ? -1 : mediaBinder6.getListLoopMediaPosition();
        MediaPlayService.MediaBinder mediaBinder7 = this.binder;
        boolean zIsPlayAllStop = mediaBinder7 == null ? false : mediaBinder7.isPlayAllStop();
        MediaPlayService.MediaBinder mediaBinder8 = this.binder;
        if (mediaBinder8 != null && mediaBinder8.isPlaying()) {
            z = true;
        }
        if (z) {
            str = "0";
        } else {
            str = zIsPlayAllStop ? "2" : "1";
        }
        Iterator<T> it2 = currentMusicList.iterator();
        while (it2.hasNext()) {
            arrayList.add(SleepBeanToPoExKt.toSleepMusicBean((MusicControlVo) it2.next(), str, currentTime, z2, str2));
        }
        String json = new Gson().toJson(new SleepServiceBean("sleepAudioSetting", action, j, listLoopMediaPosition, CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList), 0, 32, null));
        HMLog.info("data111==send==", new a(json));
        F(json);
    }

    public static /* synthetic */ void M(MusicWebActivity musicWebActivity, String str, SleepServiceBean sleepServiceBean, int i, Object obj) {
        if ((i & 2) != 0) {
            sleepServiceBean = null;
        }
        musicWebActivity.L(str, sleepServiceBean);
    }

    private final boolean N(PackageInfo pInfo) {
        return (pInfo.applicationInfo.flags & 1) != 0;
    }

    private final boolean O(PackageInfo pInfo) {
        return (pInfo.applicationInfo.flags & 128) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(MusicWebActivity musicWebActivity) {
        musicWebActivity.Q();
    }

    private final void Q() {
        ArrayList<PInfo> arrayListJ = J();
        int size = arrayListJ.size();
        final ArrayList arrayList = new ArrayList();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (arrayListJ.get(i).getPname().length() > 11 && StringsKt__StringsKt.indexOf$default((CharSequence) arrayListJ.get(i).getPname(), "clock", 0, false, 6, (Object) null) != -1 && StringsKt__StringsKt.indexOf$default((CharSequence) arrayListJ.get(i).getPname(), "widget", 0, false, 6, (Object) null) == -1) {
                try {
                    PackageInfo packageInfo = getPackageManager().getPackageInfo(arrayListJ.get(i).getPname(), 0);
                    if (N(packageInfo) || O(packageInfo)) {
                        arrayList.add(arrayListJ.get(i).getPname());
                    }
                    runOnUiThread(new Runnable() { // from class: qa5
                        @Override // java.lang.Runnable
                        public final void run() {
                            MusicWebActivity.R(this.a, arrayList);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (i2 >= size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(MusicWebActivity musicWebActivity, List list) {
        Intent launchIntentForPackage = musicWebActivity.getPackageManager().getLaunchIntentForPackage(list.isEmpty() ^ true ? (String) list.get(0) : "");
        if (launchIntentForPackage != null) {
            musicWebActivity.startActivity(launchIntentForPackage);
        } else {
            Navigator.INSTANCE.startSetAlarm(musicWebActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        Objects.requireNonNull(sharedPreferences);
        boolean z = sharedPreferences.getBoolean("isFirst", true);
        if (NotificationsUtils.INSTANCE.isNotificationEnabled(getApplicationContext()) || !z) {
            return;
        }
        SharedPreferences sharedPreferences2 = this.sharedPreferences;
        Objects.requireNonNull(sharedPreferences2);
        sharedPreferences2.edit().putBoolean("isFirst", false).apply();
        AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(this).setCancelable(true).setTitle(R.string.sls_enable_app_alert).setNegativeButton(R.string.sls_no_set, new DialogInterface.OnClickListener() { // from class: ma5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MusicWebActivity.U(dialogInterface, i);
            }
        }).setPositiveButton(R.string.sls_go_setting, new DialogInterface.OnClickListener() { // from class: la5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MusicWebActivity.T(this.a, dialogInterface, i);
            }
        }).create();
        if (alertDialogFragmentCreate == null) {
            return;
        }
        alertDialogFragmentCreate.show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(MusicWebActivity musicWebActivity, DialogInterface dialogInterface, int i) {
        NotificationsUtils.INSTANCE.requestNotify(musicWebActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.web.container.WebActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, (Class<?>) MediaPlayService.class);
        startService(intent);
        bindService(intent, this.mServiceConnection, 1);
        this.sharedPreferences = getSharedPreferences(L, 0);
    }

    @Override // com.huami.web.container.WebActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        MediaPlayService.MediaBinder mediaBinder = this.binder;
        if (mediaBinder != null) {
            mediaBinder.setMusicWebCallback(null);
        }
        unbindService(this.mServiceConnection);
        MediaMusicPlayUtils1.INSTANCE.getInstance(this).removePlayStatusChange(this.mOnPlayStatusChange);
    }

    public final void onEventMainThread(@NotNull AlarmClockBean serviceBean) {
        DeviceManagerUtils.Companion companion = DeviceManagerUtils.INSTANCE;
        if (companion.get().getStatus()) {
            companion.get().goJump();
        } else {
            new AppExecutors().getDiskIO().execute(new Runnable() { // from class: oa5
                @Override // java.lang.Runnable
                public final void run() {
                    MusicWebActivity.P(this.a);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:69:0x0153  */
    /* JADX WARN: Code duplicated, block: B:71:0x0159  */
    /* JADX WARN: Code duplicated, block: B:74:0x015f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0172  */
    /* JADX WARN: Code duplicated, block: B:78:0x0178  */
    public final void onEventMainThread(@NotNull SleepServiceBean serviceBean) {
        MediaPlayService.MediaBinder mediaBinder;
        MediaPlayService.MediaBinder mediaBinder2;
        MediaPlayService.MediaBinder mediaBinder3;
        MediaPlayService.MediaBinder mediaBinder4;
        MediaPlayService.MediaBinder mediaBinder5;
        List<SleepMusicBean> data = serviceBean.getData();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = data.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (true ^ TextUtils.isEmpty(((SleepMusicBean) next).getId())) {
                arrayList.add(next);
            }
        }
        List<SleepMusicBean> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        String action = serviceBean.getAction();
        switch (action.hashCode()) {
            case 48:
                if (action.equals("0")) {
                    K().updateLocalMusicList(serviceBean.getData());
                    MediaMusicPlayUtils1 companion = MediaMusicPlayUtils1.INSTANCE.getInstance(getApplicationContext());
                    List<SleepMusicBean> data2 = serviceBean.getData();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data2, 10));
                    Iterator<T> it3 = data2.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(SleepBeanToPoExKt.toMusicControlVo((SleepMusicBean) it3.next()));
                    }
                    companion.setDataList(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2));
                    ArrayList arrayList3 = new ArrayList();
                    for (SleepMusicBean sleepMusicBean : mutableList) {
                        if (!TextUtils.isEmpty(sleepMusicBean.getUrl())) {
                            arrayList3.add(sleepMusicBean.getUrl());
                        }
                    }
                    MediaPlayService.MediaBinder mediaBinder6 = this.binder;
                    if (mediaBinder6 != null) {
                        mediaBinder6.playH5Music(arrayList3);
                    }
                    MediaPlayService.MediaBinder mediaBinder7 = this.binder;
                    if (mediaBinder7 != null) {
                        mediaBinder7.changePlayTotalTime(serviceBean.getTotalTime());
                    }
                    if (!mutableList.isEmpty()) {
                        MediaPlayService.MediaBinder mediaBinder8 = this.binder;
                        if (mediaBinder8 != null) {
                            mediaBinder8.changeCurrentTime(((SleepMusicBean) mutableList.get(0)).getTime());
                        }
                        MediaPlayService.MediaBinder mediaBinder9 = this.binder;
                        if (mediaBinder9 != null) {
                            mediaBinder9.setCollectionId(((SleepMusicBean) mutableList.get(0)).getCollectionId());
                            break;
                        }
                    }
                }
                break;
            case 49:
                if (!action.equals("1")) {
                }
                if (!(!mutableList.isEmpty()) && Intrinsics.areEqual(((SleepMusicBean) mutableList.get(0)).getStatus(), "2")) {
                    MediaPlayService.MediaBinder mediaBinder10 = this.binder;
                    long currentTime = mediaBinder10 == null ? -1L : mediaBinder10.getCurrentTime();
                    if (1 <= currentTime && currentTime <= 19) {
                        MediaPlayService.MediaBinder mediaBinder11 = this.binder;
                        if (mediaBinder11 != null) {
                            mediaBinder11.allStop();
                        }
                        MediaPlayService.MediaBinder mediaBinder12 = this.binder;
                        if (mediaBinder12 != null) {
                            mediaBinder12.changeCurrentTime(((SleepMusicBean) mutableList.get(0)).getTime());
                            break;
                        }
                    } else {
                        M(this, I(), null, 2, null);
                        break;
                    }
                } else {
                    mediaBinder4 = this.binder;
                    if (mediaBinder4 != null) {
                        mediaBinder4.allPause();
                    }
                    mediaBinder5 = this.binder;
                    if (mediaBinder5 == null) {
                        mediaBinder5.changeCurrentTime(((SleepMusicBean) mutableList.get(0)).getTime());
                        break;
                    }
                }
                break;
            case 50:
                if (!action.equals("2")) {
                }
                if (!mutableList.isEmpty()) {
                    if (serviceBean.getAlbumNo() >= 0) {
                        mediaBinder2 = this.binder;
                        if (mediaBinder2 == null) {
                            mediaBinder2.setCollectionId(((SleepMusicBean) mutableList.get(serviceBean.getAlbumNo())).getCollectionId());
                            break;
                        }
                    } else {
                        mediaBinder = this.binder;
                        if (mediaBinder == null) {
                            mediaBinder.setCollectionId(((SleepMusicBean) mutableList.get(0)).getCollectionId());
                            break;
                        }
                    }
                }
                break;
            case 51:
                if (!action.equals("3")) {
                }
                if (!mutableList.isEmpty()) {
                    if (serviceBean.getAlbumNo() >= 0) {
                        mediaBinder2 = this.binder;
                        if (mediaBinder2 == null) {
                            mediaBinder2.setCollectionId(((SleepMusicBean) mutableList.get(serviceBean.getAlbumNo())).getCollectionId());
                            break;
                        }
                    } else {
                        mediaBinder = this.binder;
                        if (mediaBinder == null) {
                            mediaBinder.setCollectionId(((SleepMusicBean) mutableList.get(0)).getCollectionId());
                            break;
                        }
                    }
                }
                break;
            case 52:
                if (action.equals("4") && (!mutableList.isEmpty())) {
                    MediaPlayService.MediaBinder mediaBinder13 = this.binder;
                    if (mediaBinder13 != null) {
                        mediaBinder13.changePlayTotalTime(serviceBean.getTotalTime());
                    }
                    MediaPlayService.MediaBinder mediaBinder14 = this.binder;
                    if (mediaBinder14 != null) {
                        mediaBinder14.changeCurrentTime(((SleepMusicBean) mutableList.get(0)).getTime());
                        break;
                    }
                }
                break;
            case 53:
                if (action.equals("5")) {
                    L("6", serviceBean);
                    break;
                }
                break;
            case 55:
                if (action.equals("7")) {
                    K().updateLocalMusicList(serviceBean.getData());
                    List<SleepMusicBean> data3 = serviceBean.getData();
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data3, 10));
                    Iterator<T> it4 = data3.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(SleepBeanToPoExKt.toMusicControlVo((SleepMusicBean) it4.next()));
                    }
                    List<MusicControlVo> mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList4);
                    MediaMusicPlayUtils1.INSTANCE.getInstance(getApplicationContext()).setDataList(mutableList2);
                    if (serviceBean.getAlbumNo() >= 0) {
                        MediaPlayService.MediaBinder mediaBinder15 = this.binder;
                        if (mediaBinder15 != null) {
                            String playAddress = mutableList2.get(serviceBean.getAlbumNo()).getPlayAddress();
                            if (playAddress == null) {
                                playAddress = "";
                            }
                            mediaBinder15.playListMusic(playAddress, serviceBean.getAlbumNo());
                        }
                        MediaPlayService.MediaBinder mediaBinder16 = this.binder;
                        if (mediaBinder16 != null) {
                            mediaBinder16.setCollectionId(((SleepMusicBean) mutableList.get(serviceBean.getAlbumNo())).getCollectionId());
                        }
                    }
                    MediaPlayService.MediaBinder mediaBinder17 = this.binder;
                    if (mediaBinder17 != null) {
                        mediaBinder17.changePlayTotalTime(serviceBean.getTotalTime());
                    }
                    if ((!mutableList.isEmpty()) && (mediaBinder3 = this.binder) != null) {
                        mediaBinder3.changeCurrentTime(((SleepMusicBean) mutableList.get(0)).getTime());
                        break;
                    }
                }
                break;
            case 56:
                if (!action.equals("8")) {
                }
                if (!(!mutableList.isEmpty())) {
                }
                mediaBinder4 = this.binder;
                if (mediaBinder4 != null) {
                    mediaBinder4.allPause();
                }
                mediaBinder5 = this.binder;
                if (mediaBinder5 == null) {
                    mediaBinder5.changeCurrentTime(((SleepMusicBean) mutableList.get(0)).getTime());
                    break;
                }
                break;
        }
    }
}
