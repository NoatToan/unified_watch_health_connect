package com.huami.sleepassistant.lib.ui.temperament.lock;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LifecycleRegistry;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.huami.sleepassistant.apilib.db.po.Music;
import com.huami.sleepassistant.apilib.utils.ext.SleepBeanToPoExKt;
import com.huami.sleepassistant.apilib.vo.MusicControlVo;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.ui.base.ext.ImageViewExKt;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.huami.sleepassistant.lib.ui.music.MediaPlayService;
import com.huami.sleepassistant.lib.ui.music.mediautils.MediaMusicPlayUtils1;
import com.huami.sleepassistant.lib.ui.temperament.lock.LockActivity;
import com.huami.sleepassistant.lib.ui.temperament.media.MediaControlModel;
import com.huami.sleepassistant.lib.utils.handler.HandlerUtil;
import com.huami.sleepassistant.lib.widget.SlidingFinishLayout;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.web.container.utils.UtilsKt;
import com.xiaomi.hm.health.bt.model.HMDeviceState;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u00015\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b=\u0010>J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0003H\u0014J\u0012\u0010\u0015\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0014J\b\u0010\u0019\u001a\u00020\u0003H\u0014J\b\u0010\u001a\u001a\u00020\u0003H\u0014J\b\u0010\u001b\u001a\u00020\u0003H\u0014R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00106R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010\f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010;¨\u0006?"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/temperament/lock/LockActivity;", "Landroid/app/Activity;", "Landroidx/lifecycle/LifecycleOwner;", "", "m", "i", com.google.android.exoplayer2.text.ttml.b.r, "h", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "g", "", "playMusicAction", "o", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "onStart", "onStop", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "hasFocus", "onWindowFocusChanged", "onResume", "onUserLeaveHint", "onDestroy", "onPause", "Landroidx/lifecycle/LifecycleRegistry;", "a", "Landroidx/lifecycle/LifecycleRegistry;", "mLifecycleRegistry", "Lcom/huami/sleepassistant/lib/ui/temperament/media/MediaControlModel;", "b", "Lkotlin/Lazy;", "f", "()Lcom/huami/sleepassistant/lib/ui/temperament/media/MediaControlModel;", "viewModel", "Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService$MediaBinder;", "c", "Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService$MediaBinder;", "binder", "", "Lcom/huami/sleepassistant/apilib/vo/MusicControlVo;", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "currentDataList", "e", "Z", "isPlay", "Lcom/huami/sleepassistant/lib/utils/handler/HandlerUtil;", "Lcom/huami/sleepassistant/lib/utils/handler/HandlerUtil;", "mHandler", "com/huami/sleepassistant/lib/ui/temperament/lock/LockActivity$connect$1", "Lcom/huami/sleepassistant/lib/ui/temperament/lock/LockActivity$connect$1;", WifiSetActivity.KEY_CONNECT, "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "updateRunnable", "()Ljava/lang/String;", "navBarOverride", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class LockActivity extends Activity implements LifecycleOwner {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private LifecycleRegistry mLifecycleRegistry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private MediaPlayService.MediaBinder binder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private List<MusicControlVo> currentDataList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isPlay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private HandlerUtil mHandler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private LockActivity$connect$1 connect;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private Runnable updateRunnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "锁屏栏数据库更新通知===" + this.a + ", " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            String str;
            MediaPlayService.MediaBinder mediaBinder = LockActivity.this.binder;
            boolean z = false;
            if (mediaBinder != null && mediaBinder.isPlaying()) {
                MediaPlayService.MediaBinder mediaBinder2 = LockActivity.this.binder;
                if (mediaBinder2 != null) {
                    mediaBinder2.allPause();
                }
            } else {
                MediaPlayService.MediaBinder mediaBinder3 = LockActivity.this.binder;
                if (mediaBinder3 != null) {
                    mediaBinder3.allRestart();
                }
            }
            LockActivity lockActivity = LockActivity.this;
            MediaPlayService.MediaBinder mediaBinder4 = lockActivity.binder;
            if (mediaBinder4 != null && mediaBinder4.isPlaying()) {
                z = true;
            }
            if (z) {
                MediaPlayService.MediaBinder mediaBinder5 = LockActivity.this.binder;
                str = (mediaBinder5 != null ? mediaBinder5.getPlayType() : null) == MediaMusicPlayUtils1.PlayType.SINGLE_AUDIO ? "0" : "7";
            } else {
                MediaPlayService.MediaBinder mediaBinder6 = LockActivity.this.binder;
                str = (mediaBinder6 != null ? mediaBinder6.getPlayType() : null) == MediaMusicPlayUtils1.PlayType.SINGLE_AUDIO ? "1" : "8";
            }
            lockActivity.o(str);
            LockActivity.this.p();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<String, Unit> {
        public c() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(LockActivity lockActivity) {
            lockActivity.p();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            final LockActivity lockActivity = LockActivity.this;
            lockActivity.runOnUiThread(new Runnable() { // from class: com.huami.sleepassistant.lib.ui.temperament.lock.a
                @Override // java.lang.Runnable
                public final void run() {
                    LockActivity.c.b(lockActivity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.sleepassistant.lib.ui.temperament.lock.LockActivity$connect$1] */
    public LockActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MediaControlModel>() { // from class: com.huami.sleepassistant.lib.ui.temperament.lock.LockActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sleepassistant.lib.ui.temperament.media.MediaControlModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MediaControlModel invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(MediaControlModel.class), qualifier, objArr);
            }
        });
        this.currentDataList = new ArrayList();
        this.connect = new ServiceConnection() { // from class: com.huami.sleepassistant.lib.ui.temperament.lock.LockActivity$connect$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
                MutableLiveData<MediaPlayService.MediaBinder> binderLiveData = this.a.f().getBinderLiveData();
                Objects.requireNonNull(service, "null cannot be cast to non-null type com.huami.sleepassistant.lib.ui.music.MediaPlayService.MediaBinder");
                binderLiveData.setValue((MediaPlayService.MediaBinder) service);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@Nullable ComponentName name) {
            }
        };
        this.updateRunnable = new Runnable() { // from class: com.huami.sleepassistant.lib.ui.temperament.lock.LockActivity$updateRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.a.getString(R.string.sls_time_mm_dd));
                ((TextView) this.a.findViewById(R.id.sls_lock_time)).setText(new SimpleDateFormat(this.a.getString(R.string.sls_time_hh_mm)).format(new Date()));
                ((TextView) this.a.findViewById(R.id.sls_lock_date)).setText(simpleDateFormat.format(new Date()));
                HandlerUtil handlerUtil = this.a.mHandler;
                if (handlerUtil == null) {
                    return;
                }
                handlerUtil.postDelayed(this, 300L);
            }
        };
    }

    private final String e() {
        if (Build.VERSION.SDK_INT < 19) {
            return null;
        }
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, "qemu.hw.mainkeys");
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaControlModel f() {
        return (MediaControlModel) this.viewModel.getValue();
    }

    private final boolean g(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier != 0) {
            boolean z = resources.getBoolean(identifier);
            String strE = e();
            if (!Intrinsics.areEqual("1", strE)) {
                if (Intrinsics.areEqual("0", strE)) {
                    return true;
                }
                return z;
            }
        } else if (!ViewConfiguration.get(context).hasPermanentMenuKey()) {
            return true;
        }
        return false;
    }

    private final void h() {
        int i = Build.VERSION.SDK_INT;
        if (i > 11 && i < 19) {
            getWindow().getDecorView().setSystemUiVisibility(8);
        } else if (i >= 19) {
            getWindow().getDecorView().setSystemUiVisibility(3842);
            getWindow().addFlags(AMapEngineUtils.HALF_MAX_P20_WIDTH);
        }
    }

    private final void i() {
        f().queryAllMusic().observe(this, new Observer() { // from class: pr4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LockActivity.j(this.a, (List) obj);
            }
        });
        f().getBinderLiveData().observe(this, new Observer() { // from class: nr4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LockActivity.k(this.a, (MediaPlayService.MediaBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(LockActivity lockActivity, List list) {
        lockActivity.currentDataList.clear();
        if (!list.isEmpty()) {
            MediaPlayService.MediaBinder mediaBinder = lockActivity.binder;
            int listLoopMediaPosition = mediaBinder == null ? -1 : mediaBinder.getListLoopMediaPosition();
            int size = list.size();
            HMLog.info(UtilsKt.TAG, new a(listLoopMediaPosition, size));
            boolean z = false;
            if (listLoopMediaPosition >= 0 && listLoopMediaPosition < size) {
                z = true;
            }
            if (z) {
                List<MusicControlVo> list2 = lockActivity.currentDataList;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(SleepBeanToPoExKt.toMusicControlVo2((Music) it2.next()));
                }
                list2.add((MusicControlVo) arrayList.get(listLoopMediaPosition));
            } else {
                List<MusicControlVo> list3 = lockActivity.currentDataList;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(SleepBeanToPoExKt.toMusicControlVo2((Music) it3.next()));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (!TextUtils.isEmpty(((MusicControlVo) obj).getId())) {
                        arrayList3.add(obj);
                    }
                }
                list3.addAll(arrayList3);
            }
            lockActivity.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(final LockActivity lockActivity, MediaPlayService.MediaBinder mediaBinder) {
        MediatorLiveData<String> changeStatus;
        lockActivity.binder = mediaBinder;
        lockActivity.p();
        MediaPlayService.MediaBinder mediaBinder2 = lockActivity.binder;
        if (mediaBinder2 == null || (changeStatus = mediaBinder2.getChangeStatus()) == null) {
            return;
        }
        changeStatus.observe(lockActivity, new Observer() { // from class: or4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LockActivity.l(this.a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(LockActivity lockActivity, String str) {
        lockActivity.p();
    }

    private final void m() {
        Intent intent = new Intent(this, (Class<?>) MediaPlayService.class);
        startService(intent);
        bindService(intent, this.connect, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(LockActivity lockActivity, View view) {
        MediaPlayService.MediaBinder mediaBinder = lockActivity.binder;
        if (mediaBinder == null) {
            return;
        }
        mediaBinder.collectionMusic(lockActivity.new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(String playMusicAction) {
        Intent intent = new Intent();
        intent.setAction(MediaPlayService.LOCK_SCREEN_ACTION);
        intent.putExtra(MediaPlayService.LOCK_SCREEN_ACTION_KEY, playMusicAction);
        sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        try {
            MediaPlayService.MediaBinder mediaBinder = this.binder;
            int i = 0;
            this.isPlay = mediaBinder != null && mediaBinder.isPlaying();
            StringBuffer stringBuffer = new StringBuffer();
            int size = this.currentDataList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = i + 1;
                    if (i == 0) {
                        stringBuffer.append(this.currentDataList.get(i).getSimpleChinese());
                    } else {
                        stringBuffer.append(Intrinsics.stringPlus("+", this.currentDataList.get(i).getSimpleChinese()));
                    }
                    if (i2 > size) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            MediaPlayService.MediaBinder mediaBinder2 = this.binder;
            String collectionId = null;
            if (TextUtils.isEmpty(mediaBinder2 == null ? null : mediaBinder2.getCollectionName())) {
                ((TextView) findViewById(R.id.sls_lock_music_artist)).setText(stringBuffer.toString());
            } else {
                TextView textView = (TextView) findViewById(R.id.sls_lock_music_artist);
                MediaPlayService.MediaBinder mediaBinder3 = this.binder;
                textView.setText(mediaBinder3 == null ? null : mediaBinder3.getCollectionName());
            }
            if (this.isPlay) {
                ((ImageView) findViewById(R.id.sls_lock_music_play)).setImageResource(R.drawable.sls_lock_btn_pause);
            } else {
                ((ImageView) findViewById(R.id.sls_lock_music_play)).setImageResource(R.drawable.sls_lock_btn_play);
            }
            if (this.currentDataList.size() > 0) {
                ImageView imageView = (ImageView) findViewById(R.id.sls_lock_background);
                List<MusicControlVo> list = this.currentDataList;
                ImageViewExKt.loadUrl(imageView, list.get(list.size() - 1).getBigImgUrl());
            }
            MediaPlayService.MediaBinder mediaBinder4 = this.binder;
            if (mediaBinder4 != null) {
                collectionId = mediaBinder4.getCollectionId();
            }
            if (TextUtils.isEmpty(collectionId)) {
                ((ImageView) findViewById(R.id.sls_lock_music_fav)).setImageResource(R.drawable.sls_lock_btn_love);
            } else {
                ((ImageView) findViewById(R.id.sls_lock_music_fav)).setImageResource(R.drawable.sls_lock_btn_love_chose);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.p008lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Objects.requireNonNull(lifecycleRegistry);
        return lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        this.mLifecycleRegistry = lifecycleRegistry;
        Objects.requireNonNull(lifecycleRegistry);
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        Intent intent = new Intent();
        intent.setAction(MediaPlayService.LOCK_SCREEN);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        int i = Build.VERSION.SDK_INT;
        if (i != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(savedInstanceState);
        getWindow().addFlags(HMDeviceState.DEVICE_STATE_SELFTEST);
        getWindow().addFlags(4718592);
        getWindow().getDecorView().setSystemUiVisibility(2);
        getWindow().getDecorView().setSystemUiVisibility(3846);
        setContentView(R.layout.sls_acitivty_lock);
        HandlerUtil companion = HandlerUtil.INSTANCE.getInstance(this);
        this.mHandler = companion;
        if (companion != null) {
            companion.post(this.updateRunnable);
        }
        int i2 = R.id.sls_lock_root;
        ((SlidingFinishLayout) findViewById(i2)).setOnSlidingFinishListener(new SlidingFinishLayout.OnSlidingFinishListener() { // from class: com.huami.sleepassistant.lib.ui.temperament.lock.LockActivity.onCreate.1
            @Override // com.huami.sleepassistant.lib.widget.SlidingFinishLayout.OnSlidingFinishListener
            public void onSlidingFinish() {
                LockActivity.this.finish();
            }
        });
        ((SlidingFinishLayout) findViewById(i2)).setTouchView(getWindow().getDecorView());
        ViewExKt.smartClick$default((ImageView) findViewById(R.id.sls_lock_music_play), 0L, new b(), 1, null);
        ((ImageView) findViewById(R.id.sls_lock_music_fav)).setOnClickListener(new View.OnClickListener() { // from class: mr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LockActivity.n(this.a, view);
            }
        });
        m();
        i();
        if (i >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Objects.requireNonNull(lifecycleRegistry);
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        Intent intent = new Intent();
        intent.setAction(MediaPlayService.LOCK_SCREEN);
        intent.putExtra("islock", false);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        HandlerUtil handlerUtil = this.mHandler;
        if (handlerUtil != null) {
            handlerUtil.removeCallbacks(this.updateRunnable);
        }
        unbindService(this.connect);
    }

    @Override // android.app.Activity
    public void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Objects.requireNonNull(lifecycleRegistry);
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Objects.requireNonNull(lifecycleRegistry);
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        p();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Objects.requireNonNull(lifecycleRegistry);
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        if (g(this)) {
            h();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Objects.requireNonNull(lifecycleRegistry);
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Intent intent = new Intent();
        intent.setAction(MediaPlayService.LOCK_SCREEN);
        intent.putExtra("islock", false);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            getWindow().getDecorView().setSystemUiVisibility(5890);
        }
    }
}
