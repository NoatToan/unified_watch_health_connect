package com.huami.sleepassistant.lib.ui.music;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.p008lifecycle.MediatorLiveData;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.sleepassistant.apilib.bean.CollectionMusic;
import com.huami.sleepassistant.apilib.bean.IsCollectionResult;
import com.huami.sleepassistant.apilib.bean.PlayBean;
import com.huami.sleepassistant.apilib.repo.MediaPlayerRepo;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.huami.sleepassistant.apilib.vo.MusicControlVo;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.ui.music.mediautils.MediaMusicPlayUtils1;
import com.huami.sleepassistant.lib.ui.music.mediautils.MyOnAudioFocusChangeListener;
import com.huami.sleepassistant.lib.ui.notification.NotificationManagers;
import com.huami.sleepassistant.lib.ui.notification.NotificationManagersKt;
import com.huami.sleepassistant.lib.ui.temperament.lock.LockActivity;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.bean.Topic;
import com.loc.z;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ß\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u007f\u0018\u0000 \u008b\u00012\u00020\u00012\u00020\u0002:\u0004\u008b\u0001\u008c\u0001B\t¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0016\u0010\u0018\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0016H\u0002J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0016H\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001aH\u0002J\b\u0010\"\u001a\u00020\u0011H\u0002J\b\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020\u0003H\u0002J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\fH\u0002J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\fH\u0002J\b\u0010)\u001a\u00020\u0003H\u0002J\u0010\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0016J\b\u0010.\u001a\u00020\u0003H\u0016J\u0006\u0010/\u001a\u00020\u0003J\u0006\u00100\u001a\u00020\fJ\u000e\u00102\u001a\u00020\u00032\u0006\u00101\u001a\u00020\fJ\u000e\u00104\u001a\u00020\u00032\u0006\u00103\u001a\u00020\fJ\u0006\u00105\u001a\u00020\fJ \u00109\u001a\u00020\u00032\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\u001aH\u0007J\u000e\u0010:\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*J\u0006\u0010;\u001a\u00020\u0003J\u0006\u0010<\u001a\u00020\u0003J\u0006\u0010=\u001a\u00020\u0003J\u0006\u0010>\u001a\u00020\u0003J\u0006\u0010?\u001a\u00020\u001fJ\u0006\u0010A\u001a\u00020@J\b\u0010B\u001a\u00020\u0003H\u0016J\u000e\u0010E\u001a\u00020\u00032\u0006\u0010D\u001a\u00020CR\u0016\u0010H\u001a\u00020F8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010SR\u0016\u0010V\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010UR\u001d\u0010[\u001a\u00020W8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010X\u001a\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020\u001a8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010\\R$\u0010d\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001f\u0010h\u001a\u0004\u0018\u00010e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010X\u001a\u0004\bf\u0010gR9\u0010m\u001a%\u0012\u0013\u0012\u00110\f¢\u0006\f\bj\u0012\b\b3\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u0003\u0018\u00010ij\u0004\u0018\u0001`k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010lR(\u0010t\u001a\b\u0012\u0004\u0012\u00020\f0n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010{\u001a\u0004\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u0018\u0010~\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010}R\u0018\u0010\u0081\u0001\u001a\u00020\u007f8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010\u0080\u0001R)\u0010\u0088\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0005\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008d\u0001"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService;", "Landroid/app/Service;", "Lorg/koin/core/component/KoinComponent;", "", "o", com.google.android.exoplayer2.text.ttml.b.r, "c", "Lcom/huami/sleepassistant/apilib/bean/CollectionMusic;", "audioIds", "r", Topic.COOL_SPECIAL, GoogleApiAvailabilityLight.a, "", hl.k, "l", "collectionId", "e", "", "time", "a", "totalTime", "b", "", "url", "t", "musicUrls", "", "position", "v", "Lcom/huami/sleepassistant/apilib/vo/MusicControlVo;", "g", "", DTransferConstants.SEARCH_KEY, "i", "h", "m", "w", WebConst.QueryParam.AUDIO_ID, "f", "audioUrl", "u", SOAP.XMLNS, "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "onCreate", "abandonAudioFocus", "getCollectionId", "id", "setCollectionId", "name", "setCollectionName", "getCollectionName", "channelId", "channelName", "importance", "createNotificationChannel", "handleCommandIntent", "collectionMusic", "allStop", "allPause", "allRestart", "isPlaying", "Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1$PlayType;", "getPlayType", "onDestroy", "Lcom/huami/sleepassistant/apilib/bean/PlayBean;", "playBean", "onEventMainThread", "Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService$MediaBinder;", "Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService$MediaBinder;", "mBinder", "Landroid/media/AudioManager;", "Landroid/media/AudioManager;", "audioManager", "Lcom/huami/sleepassistant/lib/ui/music/mediautils/MyOnAudioFocusChangeListener;", "Lcom/huami/sleepassistant/lib/ui/music/mediautils/MyOnAudioFocusChangeListener;", "mListener", "Landroid/media/AudioFocusRequest;", "Landroid/media/AudioFocusRequest;", "mAudioFocusRequest", "Landroid/app/NotificationManager;", "Landroid/app/NotificationManager;", "mNotificationManager", "Z", "mIsLocked", "Lcom/huami/sleepassistant/apilib/repo/MediaPlayerRepo;", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.b, "()Lcom/huami/sleepassistant/apilib/repo/MediaPlayerRepo;", CommonLanguageSettingFragment.KEY_REPO, LogUtil.I, "mNotificationId", "Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1;", "Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1;", "getMediaPlay", "()Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1;", "setMediaPlay", "(Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1;)V", "mediaPlay", "Lcom/huami/sleepassistant/lib/ui/notification/NotificationManagers;", z.j, "()Lcom/huami/sleepassistant/lib/ui/notification/NotificationManagers;", "mMyNotificationManager", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "Lcom/huami/sleepassistant/lib/ui/music/CollectionCallBack;", "Lkotlin/jvm/functions/Function1;", "mCollectionCallBack", "Landroidx/lifecycle/MediatorLiveData;", "Landroidx/lifecycle/MediatorLiveData;", "getChangeStatus", "()Landroidx/lifecycle/MediatorLiveData;", "setChangeStatus", "(Landroidx/lifecycle/MediatorLiveData;)V", "changeStatus", "Lcom/huami/sleepassistant/lib/ui/music/MusicWebCallback;", "Lcom/huami/sleepassistant/lib/ui/music/MusicWebCallback;", "getMusicWebCallback", "()Lcom/huami/sleepassistant/lib/ui/music/MusicWebCallback;", "setMusicWebCallback", "(Lcom/huami/sleepassistant/lib/ui/music/MusicWebCallback;)V", "musicWebCallback", "Landroid/content/BroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "mHeadsetReceiver", "com/huami/sleepassistant/lib/ui/music/MediaPlayService$mIntentReceiver$1", "Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService$mIntentReceiver$1;", "mIntentReceiver", "Landroid/os/Handler;", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "mHandler", "<init>", "()V", "Companion", "MediaBinder", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class MediaPlayService extends Service implements KoinComponent {

    @NotNull
    public static final String BREATHE_PAUSE_ACTION = "com.huami.sleep.breathonpause";

    @NotNull
    public static final String LOCK_SCREEN = "COM.HUAMI.LOCK.SCREEN";

    @NotNull
    public static final String LOCK_SCREEN_ACTION = "COM.HUAMI.ACTION";

    @NotNull
    public static final String LOCK_SCREEN_ACTION_KEY = "play.music.action.key";

    @NotNull
    private static final String q = "MediaPlayService";
    private static final int r = 1;
    private static final int s = 2;
    private static final int t = 3;
    private static final int u = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MediaBinder mBinder = new MediaBinder(this);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private AudioManager audioManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private MyOnAudioFocusChangeListener mListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private AudioFocusRequest mAudioFocusRequest;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private NotificationManager mNotificationManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean mIsLocked;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy repo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int mNotificationId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private MediaMusicPlayUtils1 mediaPlay;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMyNotificationManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private Function1<? super String, Unit> mCollectionCallBack;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private MediatorLiveData<String> changeStatus;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private MusicWebCallback musicWebCallback;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private BroadcastReceiver mHeadsetReceiver;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final MediaPlayService$mIntentReceiver$1 mIntentReceiver;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private Handler mHandler;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00102\u001a\u00020/¢\u0006\u0004\b3\u00104J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000bJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010J\u0010\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0006\u0010\u0015\u001a\u00020\u0005J\u0006\u0010\u0016\u001a\u00020\u0005J\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0002J\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0003J\u0006\u0010\u001e\u001a\u00020\u0003J\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0003J\u0006\u0010!\u001a\u00020\u0003J\u0006\u0010\"\u001a\u00020\u001aJ\u0006\u0010$\u001a\u00020#J-\u0010+\u001a\u00020\u00052%\u0010*\u001a!\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00050%j\u0002`)J\u0006\u0010,\u001a\u00020\u000bJ\u0006\u0010-\u001a\u00020\u000bJ\u0006\u0010.\u001a\u00020\bR\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService$MediaBinder;", "Landroid/os/Binder;", "", "", "url", "", "playH5Music", "musicUrls", "", "position", "playListMusic", "", "time", "changeCurrentTime", "totalTime", "changePlayTotalTime", "Landroidx/lifecycle/MediatorLiveData;", "getChangeStatus", "Lcom/huami/sleepassistant/lib/ui/music/MusicWebCallback;", "callback", "setMusicWebCallback", "allStop", "allPause", "allRestart", "Lcom/huami/sleepassistant/apilib/vo/MusicControlVo;", "getCurrentMusicList", "", "isPlayAllStop", "collectionId", "setCollectionId", "getCollectionId", "collectionName", "setCollectionName", "getCollectionName", "isPlaying", "Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1$PlayType;", "getPlayType", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "id", "Lcom/huami/sleepassistant/lib/ui/music/CollectionCallBack;", "mCollectionCallBack", "collectionMusic", "getCurrentTime", "getPlayTotalTime", "getListLoopMediaPosition", "Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService;", "a", "Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService;", "mediaServer", "<init>", "(Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class MediaBinder extends Binder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private MediaPlayService mediaServer;

        public MediaBinder(@NotNull MediaPlayService mediaPlayService) {
            this.mediaServer = mediaPlayService;
        }

        public final void allPause() {
            this.mediaServer.allPause();
        }

        public final void allRestart() {
            this.mediaServer.allRestart();
        }

        public final void allStop() {
            this.mediaServer.allStop();
        }

        public final void changeCurrentTime(long time) {
            this.mediaServer.a(time);
        }

        public final void changePlayTotalTime(long totalTime) {
            this.mediaServer.b(totalTime);
        }

        public final void collectionMusic(@NotNull Function1<? super String, Unit> mCollectionCallBack) {
            this.mediaServer.collectionMusic();
            this.mediaServer.mCollectionCallBack = mCollectionCallBack;
        }

        @NotNull
        public final MediatorLiveData<String> getChangeStatus() {
            return this.mediaServer.getChangeStatus();
        }

        @NotNull
        public final String getCollectionId() {
            return this.mediaServer.getCollectionId();
        }

        @NotNull
        public final String getCollectionName() {
            return this.mediaServer.getCollectionName();
        }

        @Nullable
        public final List<MusicControlVo> getCurrentMusicList() {
            return this.mediaServer.g();
        }

        public final long getCurrentTime() {
            return this.mediaServer.h();
        }

        public final int getListLoopMediaPosition() {
            return this.mediaServer.i();
        }

        public final long getPlayTotalTime() {
            return this.mediaServer.m();
        }

        @NotNull
        public final MediaMusicPlayUtils1.PlayType getPlayType() {
            return this.mediaServer.getPlayType();
        }

        public final boolean isPlayAllStop() {
            return this.mediaServer.q();
        }

        public final boolean isPlaying() {
            return this.mediaServer.isPlaying();
        }

        public final void playH5Music(@NotNull List<String> url) {
            this.mediaServer.t(url);
        }

        public final void playListMusic(@NotNull String musicUrls, int position) {
            this.mediaServer.v(musicUrls, position);
        }

        public final void setCollectionId(@NotNull String collectionId) {
            this.mediaServer.setCollectionId(collectionId);
        }

        public final void setCollectionName(@NotNull String collectionName) {
            this.mediaServer.setCollectionName(collectionName);
        }

        public final void setMusicWebCallback(@Nullable MusicWebCallback callback) {
            this.mediaServer.setMusicWebCallback(callback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "allPause";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "allRestart";
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
            return "allStop";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"", "type", "Lcom/huami/sleepassistant/apilib/bean/CollectionMusic;", Topic.COOL_SPECIAL, "", "collectionId", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function3<Integer, CollectionMusic, String, Unit> {
        public d() {
            super(3);
        }

        public final void a(int i, @Nullable CollectionMusic collectionMusic, @NotNull String str) {
            if (i != 1 || collectionMusic == null) {
                return;
            }
            MediaPlayService.this.r(collectionMusic);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, CollectionMusic collectionMusic, String str) {
            a(num.intValue(), collectionMusic, str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"", "type", "Lcom/huami/sleepassistant/apilib/bean/CollectionMusic;", Topic.COOL_SPECIAL, "", "collectionId", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function3<Integer, CollectionMusic, String, Unit> {
        public e() {
            super(3);
        }

        public final void a(int i, @Nullable CollectionMusic collectionMusic, @NotNull String str) {
            if (i != 1) {
                MediaPlayService.this.e(str);
            } else if (collectionMusic != null) {
                MediaPlayService.this.d(collectionMusic);
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, CollectionMusic collectionMusic, String str) {
            a(num.intValue(), collectionMusic, str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<Boolean, Unit> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                Function1 function1 = MediaPlayService.this.mCollectionCallBack;
                if (function1 != null) {
                    function1.invoke("");
                }
                MediaMusicPlayUtils1 mediaPlay = MediaPlayService.this.getMediaPlay();
                if (mediaPlay != null) {
                    mediaPlay.setMCollectionId("");
                }
                MediaPlayService.this.getMHandler().sendEmptyMessage(2);
                MediaPlayService.this.getMHandler().sendEmptyMessage(3);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            MediaMusicPlayUtils1 mediaPlay = MediaPlayService.this.getMediaPlay();
            return Intrinsics.stringPlus(" getCollectionId ", mediaPlay == null ? null : mediaPlay.getMCollectionId());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("handleCommandIntent ：：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"", "type", "Lcom/huami/sleepassistant/apilib/bean/CollectionMusic;", Topic.COOL_SPECIAL, "", "collectionId", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function3<Integer, CollectionMusic, String, Unit> {
        public i() {
            super(3);
        }

        public final void a(int i, @Nullable CollectionMusic collectionMusic, @NotNull String str) {
            if (i != 1) {
                MediaPlayService.this.e(str);
            } else if (collectionMusic != null) {
                MediaPlayService.this.d(collectionMusic);
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, CollectionMusic collectionMusic, String str) {
            a(num.intValue(), collectionMusic, str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "  Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT <= 26.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "requestAudioFocus successfully.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "requestAudioFocus failed.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<Unit> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MediaPlayService.this.getMHandler().sendEmptyMessage(2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"", DTransferConstants.ALBUMID, "audioUrl", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function2<String, String, Unit> {
        public n() {
            super(2);
        }

        public final void a(@NotNull String str, @NotNull String str2) {
            if (TextUtils.isEmpty(str2)) {
                MediaPlayService.this.f(str);
            } else {
                MediaPlayService.this.u(str2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
            a(str, str2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "释放发生异常";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "playMusic ：：list：";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            MediaMusicPlayUtils1 mediaPlay = MediaPlayService.this.getMediaPlay();
            return Intrinsics.stringPlus(" setCollectionId ", mediaPlay == null ? null : mediaPlay.getMCollectionId());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus(" setCollectionName ", this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.huami.sleepassistant.lib.ui.music.MediaPlayService$mIntentReceiver$1] */
    public MediaPlayService() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.repo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MediaPlayerRepo>() { // from class: com.huami.sleepassistant.lib.ui.music.MediaPlayService$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sleepassistant.apilib.repo.MediaPlayerRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MediaPlayerRepo invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(MediaPlayerRepo.class), qualifier, objArr);
            }
        });
        this.mNotificationId = 1000;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.mMyNotificationManager = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NotificationManagers>() { // from class: com.huami.sleepassistant.lib.ui.music.MediaPlayService$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sleepassistant.lib.ui.notification.NotificationManagers, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NotificationManagers invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NotificationManagers.class), objArr2, objArr3);
            }
        });
        this.changeStatus = new MediatorLiveData<>();
        this.mIntentReceiver = new BroadcastReceiver() { // from class: com.huami.sleepassistant.lib.ui.music.MediaPlayService$mIntentReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@Nullable Context context, @Nullable Intent intent) {
                Message message = new Message();
                message.what = 4;
                message.obj = intent;
                this.a.getMHandler().sendMessage(message);
            }
        };
        final Looper mainLooper = Looper.getMainLooper();
        this.mHandler = new Handler(mainLooper) { // from class: com.huami.sleepassistant.lib.ui.music.MediaPlayService$mHandler$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "handleMessage ：：TYPE_UPDATE_NOTIFICATION";
                }
            }

            @Override // android.os.Handler
            public void handleMessage(@NotNull Message msg) {
                super.handleMessage(msg);
                int i2 = msg.what;
                if (i2 == 1) {
                    Toast.makeText(this.a, R.string.sls_collection_fail, 0).show();
                    return;
                }
                if (i2 == 2) {
                    NotificationManagers notificationManagersJ = this.a.j();
                    if (notificationManagersJ != null) {
                        notificationManagersJ.updateNotification(this.a.getMediaPlay(), this.a.mNotificationManager, this.a.mNotificationId, this.a);
                    }
                    this.a.getChangeStatus().setValue(Intrinsics.stringPlus("change", Double.valueOf(Math.random())));
                    HMLog.info("MediaPlayService", a.a);
                    return;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    }
                    MediaPlayService mediaPlayService = this.a;
                    Object obj = msg.obj;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type android.content.Intent");
                    mediaPlayService.handleCommandIntent((Intent) obj);
                    return;
                }
                this.a.getChangeStatus().setValue(Intrinsics.stringPlus("change", Double.valueOf(Math.random())));
                NotificationManagers notificationManagersJ2 = this.a.j();
                if (notificationManagersJ2 != null) {
                    notificationManagersJ2.updateNotification(this.a.getMediaPlay(), this.a.mNotificationManager, this.a.mNotificationId, this.a);
                }
                if (TextUtils.isEmpty(this.a.getCollectionId())) {
                    MusicWebCallback musicWebCallback = this.a.getMusicWebCallback();
                    if (musicWebCallback == null) {
                        return;
                    }
                    musicWebCallback.onResult("3");
                    return;
                }
                MusicWebCallback musicWebCallback2 = this.a.getMusicWebCallback();
                if (musicWebCallback2 == null) {
                    return;
                }
                musicWebCallback2.onResult("2");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long time) {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        if (mediaMusicPlayUtils1 == null) {
            return;
        }
        mediaMusicPlayUtils1.changeCurrentTime(time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(long totalTime) {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        if (mediaMusicPlayUtils1 == null) {
            return;
        }
        mediaMusicPlayUtils1.changeTotalTime(totalTime);
    }

    private final void c() {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        if (mediaMusicPlayUtils1 == null) {
            return;
        }
        mediaMusicPlayUtils1.collectionMusic(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(CollectionMusic collection) {
        n().collectionMusic(collection, new Function1<Resource<? extends String>, Unit>() { // from class: com.huami.sleepassistant.lib.ui.music.MediaPlayService.collectionMusic.1

            /* JADX INFO: renamed from: com.huami.sleepassistant.lib.ui.music.MediaPlayService$collectionMusic$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "collectionMusic ：：TYPE_UPDATE_NOTIFICATION";
                }
            }

            /* JADX INFO: renamed from: com.huami.sleepassistant.lib.ui.music.MediaPlayService$collectionMusic$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "collectionMusic ：：TYPE_COLLECTION_FALSE";
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends String> resource) {
                invoke2((Resource<String>) resource);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(@NotNull Resource<String> vo) {
                String data = vo.getData();
                if (data != null) {
                    MediaMusicPlayUtils1 mediaPlay = MediaPlayService.this.getMediaPlay();
                    if (mediaPlay != null) {
                        mediaPlay.setMCollectionId(data);
                    }
                    Function1 function1 = MediaPlayService.this.mCollectionCallBack;
                    if (function1 != null) {
                        function1.invoke(data);
                    }
                    MediaPlayService.this.getMHandler().sendEmptyMessage(2);
                    MediaPlayService.this.getMHandler().sendEmptyMessage(3);
                    HMLog.info(MediaPlayService.q, a.a);
                    if (TextUtils.isEmpty(data)) {
                        MediaPlayService.this.getMHandler().sendEmptyMessage(1);
                        HMLog.info(MediaPlayService.q, b.a);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(String collectionId) {
        n().delCollection(collectionId, new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(String audioId) {
        n().getAudioDetail(audioId, new Function1<String, Unit>() { // from class: com.huami.sleepassistant.lib.ui.music.MediaPlayService$getAudioDetail$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(@NotNull String audioUrl) {
                if (TextUtils.isEmpty(audioUrl)) {
                    return;
                }
                this.a.u(audioUrl);
            }
        });
        n().uploadListLoopMusicHistory(audioId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<MusicControlVo> g() {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        if (mediaMusicPlayUtils1 == null) {
            return null;
        }
        return mediaMusicPlayUtils1.getDataList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long h() {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        return mediaMusicPlayUtils1 == null ? TimeUtils.TIME_30_MINUTE : mediaMusicPlayUtils1.getMCurrentTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int i() {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        if (mediaMusicPlayUtils1 == null) {
            return -1;
        }
        return mediaMusicPlayUtils1.getMListLoopMediaPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationManagers j() {
        return (NotificationManagers) this.mMyNotificationManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String k() {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        return (mediaMusicPlayUtils1 == null ? null : mediaMusicPlayUtils1.getPlayType()) == MediaMusicPlayUtils1.PlayType.SINGLE_AUDIO ? "1" : "8";
    }

    private final String l() {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        return (mediaMusicPlayUtils1 == null ? null : mediaMusicPlayUtils1.getPlayType()) == MediaMusicPlayUtils1.PlayType.SINGLE_AUDIO ? "0" : "7";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long m() {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        return mediaMusicPlayUtils1 == null ? TimeUtils.TIME_30_MINUTE : mediaMusicPlayUtils1.getMTotalTime();
    }

    private final MediaPlayerRepo n() {
        return (MediaPlayerRepo) this.repo.getValue();
    }

    private final void o() {
        this.mHeadsetReceiver = new HeadsetReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        registerReceiver(this.mHeadsetReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        int iRequestAudioFocus;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (19 <= i2 && i2 <= 26) {
            HMLog.info(q, j.a);
            AudioManager audioManager = this.audioManager;
            if (audioManager != null) {
                iRequestAudioFocus = audioManager.requestAudioFocus(this.mListener, 3, 1);
                i3 = iRequestAudioFocus;
            }
        } else if (i2 > 26) {
            AudioFocusRequest.Builder acceptsDelayedFocusGain = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build()).setAcceptsDelayedFocusGain(true);
            MyOnAudioFocusChangeListener myOnAudioFocusChangeListener = this.mListener;
            Objects.requireNonNull(myOnAudioFocusChangeListener, "null cannot be cast to non-null type android.media.AudioManager.OnAudioFocusChangeListener");
            AudioFocusRequest audioFocusRequestBuild = acceptsDelayedFocusGain.setOnAudioFocusChangeListener(myOnAudioFocusChangeListener).build();
            this.mAudioFocusRequest = audioFocusRequestBuild;
            AudioManager audioManager2 = this.audioManager;
            if (audioManager2 != null) {
                Objects.requireNonNull(audioFocusRequestBuild, "null cannot be cast to non-null type android.media.AudioFocusRequest");
                iRequestAudioFocus = audioManager2.requestAudioFocus(audioFocusRequestBuild);
                i3 = iRequestAudioFocus;
            }
        }
        if (i3 == 1) {
            HMLog.info(q, k.a);
        } else {
            HMLog.info(q, l.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q() {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        return (mediaMusicPlayUtils1 == null ? null : mediaMusicPlayUtils1.getPlayStatus()) == MediaMusicPlayUtils1.PlayStatus.ALL_STOP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(CollectionMusic audioIds) {
        n().isCollectionMusic(audioIds, new Function1<Resource<? extends IsCollectionResult>, Unit>() { // from class: com.huami.sleepassistant.lib.ui.music.MediaPlayService$isCollectionMusic$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends IsCollectionResult> resource) {
                invoke2((Resource<IsCollectionResult>) resource);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(@NotNull Resource<IsCollectionResult> vo) {
                String name;
                IsCollectionResult data = vo.getData();
                String sid = data == null ? null : data.getSid();
                MediaMusicPlayUtils1 mediaPlay = this.a.getMediaPlay();
                String str = "";
                if (mediaPlay != null) {
                    if (sid == null) {
                        sid = "";
                    }
                    mediaPlay.setMCollectionId(sid);
                }
                MediaMusicPlayUtils1 mediaPlay2 = this.a.getMediaPlay();
                if (mediaPlay2 != null) {
                    IsCollectionResult data2 = vo.getData();
                    if (data2 != null && (name = data2.getName()) != null) {
                        str = name;
                    }
                    mediaPlay2.setMCollectionName(str);
                }
                this.a.getMHandler().sendEmptyMessage(2);
            }
        });
    }

    private final void s() {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        boolean z = false;
        if (mediaMusicPlayUtils1 != null && mediaMusicPlayUtils1.isPlaying()) {
            allPause();
        } else {
            allRestart();
        }
        MusicWebCallback musicWebCallback = this.musicWebCallback;
        if (musicWebCallback == null) {
            return;
        }
        MediaMusicPlayUtils1 mediaMusicPlayUtils2 = this.mediaPlay;
        if (mediaMusicPlayUtils2 != null && mediaMusicPlayUtils2.isPlaying()) {
            z = true;
        }
        musicWebCallback.onResult(z ? l() : k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(List<String> url) {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        if (mediaMusicPlayUtils1 != null) {
            mediaMusicPlayUtils1.playH5Music(url);
        }
        this.mHandler.sendEmptyMessage(2);
        this.changeStatus.setValue(Intrinsics.stringPlus("change", Double.valueOf(Math.random())));
        HMLog.info(q, p.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(String audioUrl) {
        List<MusicControlVo> dataList;
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        int mListLoopMediaPosition = mediaMusicPlayUtils1 == null ? 0 : mediaMusicPlayUtils1.getMListLoopMediaPosition();
        MediaMusicPlayUtils1 mediaMusicPlayUtils2 = this.mediaPlay;
        MusicControlVo musicControlVo = null;
        if (mediaMusicPlayUtils2 != null && (dataList = mediaMusicPlayUtils2.getDataList()) != null) {
            musicControlVo = dataList.get(mListLoopMediaPosition);
        }
        if (musicControlVo != null) {
            musicControlVo.setPlayAddress(audioUrl);
        }
        MediaMusicPlayUtils1 mediaMusicPlayUtils3 = this.mediaPlay;
        if (mediaMusicPlayUtils3 != null) {
            mediaMusicPlayUtils3.playListMusic(audioUrl, mListLoopMediaPosition);
        }
        MediaMusicPlayUtils1 mediaMusicPlayUtils4 = this.mediaPlay;
        if (mediaMusicPlayUtils4 != null) {
            mediaMusicPlayUtils4.setMCollectionId("");
        }
        MediaMusicPlayUtils1 mediaMusicPlayUtils5 = this.mediaPlay;
        if (mediaMusicPlayUtils5 != null) {
            mediaMusicPlayUtils5.setMCollectionName("");
        }
        c();
        this.mHandler.sendEmptyMessage(2);
        MusicWebCallback musicWebCallback = this.musicWebCallback;
        if (musicWebCallback == null) {
            return;
        }
        musicWebCallback.onResult("7");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(String musicUrls, int position) {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        if (mediaMusicPlayUtils1 != null) {
            mediaMusicPlayUtils1.playListMusic(musicUrls, position);
        }
        this.mHandler.sendEmptyMessage(2);
        this.changeStatus.setValue(Intrinsics.stringPlus("change", Double.valueOf(Math.random())));
    }

    private final void w() {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        if (mediaMusicPlayUtils1 == null) {
            return;
        }
        mediaMusicPlayUtils1.allStop();
    }

    public final void abandonAudioFocus() {
        AudioManager audioManager;
        int i2 = Build.VERSION.SDK_INT;
        boolean z = false;
        if (19 <= i2 && i2 <= 26) {
            z = true;
        }
        if (z) {
            AudioManager audioManager2 = this.audioManager;
            if (audioManager2 == null) {
                return;
            }
            audioManager2.abandonAudioFocus(this.mListener);
            return;
        }
        if (i2 <= 26 || (audioManager = this.audioManager) == null) {
            return;
        }
        AudioFocusRequest audioFocusRequest = this.mAudioFocusRequest;
        Objects.requireNonNull(audioFocusRequest, "null cannot be cast to non-null type android.media.AudioFocusRequest");
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public final void allPause() {
        HMLog.info(q, a.a);
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        if (mediaMusicPlayUtils1 != null) {
            mediaMusicPlayUtils1.allPause();
        }
        this.mHandler.sendEmptyMessage(2);
        this.changeStatus.setValue(Intrinsics.stringPlus("change", Double.valueOf(Math.random())));
    }

    public final void allRestart() {
        HMLog.info(q, b.a);
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        if (mediaMusicPlayUtils1 != null) {
            mediaMusicPlayUtils1.allRestart();
        }
        this.mHandler.sendEmptyMessage(2);
        this.changeStatus.setValue(Intrinsics.stringPlus("change", Double.valueOf(Math.random())));
    }

    public final void allStop() {
        HMLog.info(q, c.a);
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        if (mediaMusicPlayUtils1 != null) {
            mediaMusicPlayUtils1.allStop();
        }
        NotificationManagers notificationManagersJ = j();
        if (notificationManagersJ != null) {
            notificationManagersJ.cancelNotification(this.mNotificationManager, this.mNotificationId, this);
        }
        this.changeStatus.setValue(Intrinsics.stringPlus("change", Double.valueOf(Math.random())));
    }

    public final void collectionMusic() {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        if (mediaMusicPlayUtils1 == null) {
            return;
        }
        mediaMusicPlayUtils1.collectionMusic(new e());
    }

    @RequiresApi(26)
    public final void createNotificationChannel(@NotNull String channelId, @NotNull String channelName, int importance) {
        NotificationChannel notificationChannel = new NotificationChannel(channelId, channelName, importance);
        NotificationManager notificationManager = this.mNotificationManager;
        if (notificationManager == null) {
            return;
        }
        notificationManager.createNotificationChannel(notificationChannel);
    }

    @NotNull
    public final MediatorLiveData<String> getChangeStatus() {
        return this.changeStatus;
    }

    @NotNull
    public final String getCollectionId() {
        String mCollectionId;
        HMLog.info(q, new g());
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        return (mediaMusicPlayUtils1 == null || (mCollectionId = mediaMusicPlayUtils1.getMCollectionId()) == null) ? "" : mCollectionId;
    }

    @NotNull
    public final String getCollectionName() {
        String mCollectionName;
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        return (mediaMusicPlayUtils1 == null || (mCollectionName = mediaMusicPlayUtils1.getMCollectionName()) == null) ? "" : mCollectionName;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final Handler getMHandler() {
        return this.mHandler;
    }

    @Nullable
    public final MediaMusicPlayUtils1 getMediaPlay() {
        return this.mediaPlay;
    }

    @Nullable
    public final MusicWebCallback getMusicWebCallback() {
        return this.musicWebCallback;
    }

    @NotNull
    public final MediaMusicPlayUtils1.PlayType getPlayType() {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        MediaMusicPlayUtils1.PlayType playType = mediaMusicPlayUtils1 == null ? null : mediaMusicPlayUtils1.getPlayType();
        return playType == null ? MediaMusicPlayUtils1.PlayType.SINGLE_AUDIO : playType;
    }

    public final void handleCommandIntent(@NotNull Intent intent) {
        MusicWebCallback musicWebCallback;
        String action = intent.getAction();
        HMLog.info(q, new h(action));
        if (Intrinsics.areEqual("android.intent.action.SCREEN_OFF", action)) {
            if (!this.mediaPlay.isPlaying() || this.mIsLocked) {
                return;
            }
            Intent intent2 = new Intent(this, (Class<?>) LockActivity.class);
            intent2.addFlags(268435456);
            startActivity(intent2);
            return;
        }
        if (Intrinsics.areEqual(LOCK_SCREEN, action)) {
            this.mIsLocked = intent.getBooleanExtra("islock", true);
            return;
        }
        if (Intrinsics.areEqual(LOCK_SCREEN_ACTION, action)) {
            String stringExtra = intent.getStringExtra(LOCK_SCREEN_ACTION_KEY);
            if (stringExtra == null || TextUtils.isEmpty(stringExtra) || (musicWebCallback = this.musicWebCallback) == null) {
                return;
            }
            musicWebCallback.onResult(stringExtra);
            return;
        }
        if (Intrinsics.areEqual(NotificationManagersKt.TOGGLE_PAUSE_ACTION, action)) {
            s();
            return;
        }
        if (Intrinsics.areEqual(NotificationManagersKt.TOGGLE_COLLECTION_ACTION, action)) {
            MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
            if (mediaMusicPlayUtils1 == null) {
                return;
            }
            mediaMusicPlayUtils1.collectionMusic(new i());
            return;
        }
        if (Intrinsics.areEqual("com.huami.sleep.breathonpause", action)) {
            allStop();
            MediaMusicPlayUtils1 mediaMusicPlayUtils2 = this.mediaPlay;
            if (mediaMusicPlayUtils2 == null) {
                return;
            }
            mediaMusicPlayUtils2.clearData();
        }
    }

    public final boolean isPlaying() {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        if (mediaMusicPlayUtils1 == null) {
            return false;
        }
        return mediaMusicPlayUtils1.isPlaying();
    }

    @Override // android.app.Service
    @NotNull
    public IBinder onBind(@NotNull Intent intent) {
        return this.mBinder;
    }

    @Override // android.app.Service
    public void onCreate() {
        String channel;
        super.onCreate();
        Object systemService = getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.mNotificationManager = (NotificationManager) systemService;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction(LOCK_SCREEN);
        intentFilter.addAction(LOCK_SCREEN_ACTION);
        intentFilter.addAction(NotificationManagersKt.TOGGLE_PAUSE_ACTION);
        intentFilter.addAction(NotificationManagersKt.TOGGLE_COLLECTION_ACTION);
        registerReceiver(this.mIntentReceiver, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.huami.sleep.breathonpause");
        LocalBroadcastManager.getInstance(this).registerReceiver(this.mIntentReceiver, intentFilter2);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManagers notificationManagersJ = j();
            String str = "";
            if (notificationManagersJ != null && (channel = notificationManagersJ.getChannel()) != null) {
                str = channel;
            }
            createNotificationChannel(str, "音乐控制", 0);
        }
        NotificationManagers notificationManagersJ2 = j();
        if (notificationManagersJ2 != null) {
            notificationManagersJ2.setOnBitmapCallBack(new m());
        }
        MediaMusicPlayUtils1 companion = MediaMusicPlayUtils1.INSTANCE.getInstance(getApplicationContext());
        this.mediaPlay = companion;
        if (companion != null) {
            companion.setPlayStopCallBack(new Function2<Long, Boolean, Unit>() { // from class: com.huami.sleepassistant.lib.ui.music.MediaPlayService.onCreate.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Long l2, Boolean bool) {
                    invoke(l2.longValue(), bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public void invoke(long time, boolean allStop) {
                    if (allStop) {
                        MediaPlayService.this.getMHandler().sendEmptyMessage(2);
                        MusicWebCallback musicWebCallback = MediaPlayService.this.getMusicWebCallback();
                        if (musicWebCallback != null) {
                            musicWebCallback.onResult(MediaPlayService.this.k());
                        }
                        MediaPlayService.this.getChangeStatus().setValue(Intrinsics.stringPlus("change", Double.valueOf(Math.random())));
                    }
                }
            });
        }
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        if (mediaMusicPlayUtils1 != null) {
            mediaMusicPlayUtils1.setOnAlbumCompletion(new n());
        }
        MediaMusicPlayUtils1 mediaMusicPlayUtils2 = this.mediaPlay;
        if (mediaMusicPlayUtils2 != null) {
            mediaMusicPlayUtils2.setOnPlayCallBack(new Function0<Unit>() { // from class: com.huami.sleepassistant.lib.ui.music.MediaPlayService.onCreate.4
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public void invoke2() {
                    MediaPlayService.this.p();
                }
            });
        }
        Object systemService2 = getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService2;
        this.mListener = new MyOnAudioFocusChangeListener(this);
        EventBus.getDefault().register(this);
        o();
    }

    @Override // android.app.Service
    public void onDestroy() {
        AudioManager audioManager;
        super.onDestroy();
        try {
            w();
            unregisterReceiver(this.mIntentReceiver);
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.mIntentReceiver);
            NotificationManagers notificationManagersJ = j();
            if (notificationManagersJ != null) {
                notificationManagersJ.cancelNotification(this.mNotificationManager, this.mNotificationId, this);
            }
            NotificationManagers notificationManagersJ2 = j();
            if (notificationManagersJ2 != null) {
                notificationManagersJ2.removeBitmapCallback();
            }
            int i2 = Build.VERSION.SDK_INT;
            boolean z = false;
            if (19 <= i2 && i2 <= 26) {
                z = true;
            }
            if (z) {
                AudioManager audioManager2 = this.audioManager;
                if (audioManager2 != null) {
                    audioManager2.abandonAudioFocus(this.mListener);
                }
            } else if (i2 > 26 && (audioManager = this.audioManager) != null) {
                AudioFocusRequest audioFocusRequest = this.mAudioFocusRequest;
                if (audioFocusRequest == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.media.AudioFocusRequest");
                }
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            HMLog.error$default(q, null, e2, o.a, 2, null);
        }
        EventBus.getDefault().unregister(this);
        unregisterReceiver(this.mHeadsetReceiver);
    }

    public final void onEventMainThread(@NotNull PlayBean playBean) {
        s();
    }

    public final void setChangeStatus(@NotNull MediatorLiveData<String> mediatorLiveData) {
        this.changeStatus = mediatorLiveData;
    }

    public final void setCollectionId(@NotNull String id) {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1;
        MediaMusicPlayUtils1 mediaMusicPlayUtils2 = this.mediaPlay;
        if (mediaMusicPlayUtils2 != null) {
            mediaMusicPlayUtils2.setMCollectionId(id);
        }
        MediaMusicPlayUtils1 mediaMusicPlayUtils3 = this.mediaPlay;
        if (TextUtils.isEmpty(mediaMusicPlayUtils3 == null ? null : mediaMusicPlayUtils3.getMCollectionId()) && (mediaMusicPlayUtils1 = this.mediaPlay) != null) {
            mediaMusicPlayUtils1.setMCollectionName("");
        }
        HMLog.info(q, new q());
        this.mHandler.sendEmptyMessage(2);
    }

    public final void setCollectionName(@NotNull String name) {
        MediaMusicPlayUtils1 mediaMusicPlayUtils1 = this.mediaPlay;
        if (mediaMusicPlayUtils1 != null) {
            mediaMusicPlayUtils1.setMCollectionName(name);
        }
        this.mHandler.sendEmptyMessage(2);
        HMLog.info(q, new r(name));
    }

    public final void setMHandler(@NotNull Handler handler) {
        this.mHandler = handler;
    }

    public final void setMediaPlay(@Nullable MediaMusicPlayUtils1 mediaMusicPlayUtils1) {
        this.mediaPlay = mediaMusicPlayUtils1;
    }

    public final void setMusicWebCallback(@Nullable MusicWebCallback musicWebCallback) {
        this.musicWebCallback = musicWebCallback;
    }
}
