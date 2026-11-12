package com.huami.sleepassistant.lib.ui.music.mediautils;

import android.content.Context;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.widget.Toast;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.sleepassistant.apilib.bean.CollectionMusic;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.huami.sleepassistant.apilib.vo.MusicControlVo;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.ui.music.mediautils.MediaMusicPlayUtils1;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.bean.Topic;
import com.loc.z;
import com.xiaomi.hm.health.Constant;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.e;
import org.cybergarage.upnp.std.av.server.ContentDirectory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\b\t\u0018\u0000 \u0089\u00012\u00020\u0001:\u0006\u0089\u0001\u008a\u0001\u008b\u0001B\u0013\b\u0002\u0012\u0006\u0010A\u001a\u00020>¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0014\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010J\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013J\u0012\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u0006\u0010\u0019\u001a\u00020\u0004J\u0006\u0010\u001a\u001a\u00020\u0004J\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0002J\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020 J\u0006\u0010#\u001a\u00020\"J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010%\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010&\u001a\u00020\u0013JB\u0010,\u001a\u00020\u00042:\u0010+\u001a6\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\"¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00040'j\u0002`*J\u0018\u0010/\u001a\u00020\u00042\u0010\u0010+\u001a\f\u0012\u0004\u0012\u00020\u00040-j\u0002`.JB\u00103\u001a\u00020\u00042:\u0010+\u001a6\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00040'j\u0002`2J\u0018\u00105\u001a\u00020\u00042\u0010\u0010+\u001a\f\u0012\u0004\u0012\u00020\u00040-j\u0002`4J\u0018\u00106\u001a\u00020\u00042\u0010\u0010+\u001a\f\u0012\u0004\u0012\u00020\u00040-j\u0002`4JY\u0010=\u001a\u00020\u00042Q\u0010+\u001aM\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(8\u0012\u0015\u0012\u0013\u0018\u000109¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(:\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020\u000407j\u0002`<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010K\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010N\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010F\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JR\"\u0010T\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010[\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\\R\"\u0010d\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010j\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010m\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010e\u001a\u0004\bk\u0010g\"\u0004\bl\u0010iR\"\u0010p\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010e\u001a\u0004\bn\u0010g\"\u0004\bo\u0010iR*\u0010x\u001a\n\u0012\u0004\u0012\u00020r\u0018\u00010q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wRN\u0010{\u001a:\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\"¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0004\u0018\u00010'j\u0004\u0018\u0001`*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR$\u0010~\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010-j\u0004\u0018\u0001`.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R'\u0010\u0080\u0001\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040-j\u0002`40q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010sRP\u0010\u0082\u0001\u001a:\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u0004\u0018\u00010'j\u0004\u0018\u0001`28\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010zR&\u0010\u0086\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0083\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u008c\u0001"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1;", "Landroid/media/MediaPlayer$OnCompletionListener;", "", "url", "", "g", "musicUrls", "e", "i", z.j, hl.k, "", "time", "l", GoogleApiAvailabilityLight.a, "c", "", "urls", "playH5Music", "", "position", "playListMusic", "Landroid/media/MediaPlayer;", Constant.PAI_KEY_MEDIUM_ZONE_PAI, "onCompletion", "allPause", "allRestart", "allStop", "clearData", "getMusicTitle", "Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1$PlayStatus;", "getPlayStatus", "Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1$PlayType;", "getPlayType", "", "isPlaying", "changeTotalTime", "changeCurrentTime", "getListLoopMediaPosition", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lcom/huami/sleepassistant/lib/ui/music/OnPlayStopCallBack;", "callback", "setPlayStopCallBack", "Lkotlin/Function0;", "Lcom/huami/sleepassistant/lib/ui/music/OnPlayCallBack;", "setOnPlayCallBack", DTransferConstants.ALBUMID, "audioUrl", "Lcom/huami/sleepassistant/lib/ui/music/OnAlbumCompletion;", "setOnAlbumCompletion", "Lcom/huami/sleepassistant/servicelib/service/OnPlayStatusChange;", "addPlayStatusChange", "removePlayStatusChange", "Lkotlin/Function3;", "type", "Lcom/huami/sleepassistant/apilib/bean/CollectionMusic;", Topic.COOL_SPECIAL, "collectionId", "Lcom/huami/sleepassistant/lib/ui/music/CollectionOrDelCallBack;", "collectionMusic", "Landroid/content/Context;", "a", "Landroid/content/Context;", "mContext", "Lkotlinx/coroutines/Job;", "b", "Lkotlinx/coroutines/Job;", "mJob", "J", "getMCurrentTime", "()J", "setMCurrentTime", "(J)V", "mCurrentTime", "getMTotalTime", "setMTotalTime", "mTotalTime", "Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1$PlayStatus;", "getMPlayStatus", "()Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1$PlayStatus;", "setMPlayStatus", "(Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1$PlayStatus;)V", "mPlayStatus", "f", "Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1$PlayType;", "getMPlayType", "()Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1$PlayType;", "setMPlayType", "(Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1$PlayType;)V", "mPlayType", "Landroid/media/MediaPlayer;", "mListLoopMediaPlayer", "h", LogUtil.I, "getMListLoopMediaPosition", "()I", "setMListLoopMediaPosition", "(I)V", "mListLoopMediaPosition", "Ljava/lang/String;", "getMListLoopMediaUrl", "()Ljava/lang/String;", "setMListLoopMediaUrl", "(Ljava/lang/String;)V", "mListLoopMediaUrl", "getMCollectionId", "setMCollectionId", "mCollectionId", "getMCollectionName", "setMCollectionName", "mCollectionName", "", "Lcom/huami/sleepassistant/apilib/vo/MusicControlVo;", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "dataList", "m", "Lkotlin/jvm/functions/Function2;", "playStopCallback", GoogleApiAvailabilityLight.b, "Lkotlin/jvm/functions/Function0;", "playCallback", "o", "mOnPlayStatusChangeList", com.google.android.exoplayer2.text.ttml.b.r, "mOnAlbumCompletion", "", DTransferConstants.SEARCH_KEY, "Ljava/util/Map;", "mPlayerMap", "<init>", "(Landroid/content/Context;)V", "Companion", "PlayStatus", "PlayType", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class MediaMusicPlayUtils1 implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int TYPE_COLLECTION = 1;
    public static final int TYPE_DEL = 2;

    @NotNull
    private static final String r = "MediaMusicPlayUtils1";

    @Nullable
    private static MediaMusicPlayUtils1 s;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context mContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Job mJob;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private volatile long mCurrentTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private volatile long mTotalTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private PlayStatus mPlayStatus;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private PlayType mPlayType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private MediaPlayer mListLoopMediaPlayer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int mListLoopMediaPosition;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private String mListLoopMediaUrl;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private String mCollectionId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private String mCollectionName;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private List<MusicControlVo> dataList;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private Function2<? super Long, ? super Boolean, Unit> playStopCallback;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> playCallback;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private List<Function0<Unit>> mOnPlayStatusChangeList;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private Function2<? super String, ? super String, Unit> mOnAlbumCompletion;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Map<String, MediaPlayer> mPlayerMap;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1;", "getInstance", "", "TAG", "Ljava/lang/String;", "", "TYPE_COLLECTION", LogUtil.I, "TYPE_DEL", DefaultSettingsSpiCall.n, "Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final synchronized MediaMusicPlayUtils1 getInstance(@NotNull Context context) {
            if (MediaMusicPlayUtils1.s == null) {
                MediaMusicPlayUtils1.s = new MediaMusicPlayUtils1(context, null);
            }
            return MediaMusicPlayUtils1.s;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1$PlayStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_PLAY", "PLAY", "ALL_PAUSE", "ALL_STOP", ContentDirectory.ERROR, "lib_release"}, k = 1, mv = {1, 5, 1})
    public enum PlayStatus {
        NOT_PLAY,
        PLAY,
        ALL_PAUSE,
        ALL_STOP,
        ERROR
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1$PlayType;", "", "<init>", "(Ljava/lang/String;I)V", WebConst.CollectionType.SINGLE_AUDIO, "LIST_LOOP_AUDIO", "lib_release"}, k = 1, mv = {1, 5, 1})
    public enum PlayType {
        SINGLE_AUDIO,
        LIST_LOOP_AUDIO
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayType.values().length];
            iArr[PlayType.SINGLE_AUDIO.ordinal()] = 1;
            iArr[PlayType.LIST_LOOP_AUDIO.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
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
            return "startCountdown...  ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleepassistant.lib.ui.music.mediautils.MediaMusicPlayUtils1$startCountdown$2", f = "MediaMusicPlayUtils1.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public long a;
        public int b;
        public final /* synthetic */ long c;
        public final /* synthetic */ MediaMusicPlayUtils1 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, MediaMusicPlayUtils1 mediaMusicPlayUtils1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = mediaMusicPlayUtils1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        
            if (0 > r5) goto L23;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0056 -> B:19:0x0057). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            long j;
            b bVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                j = this.c;
                if (0 <= j) {
                    bVar = this;
                    long j2 = (-1) + j;
                    Function2 function2 = bVar.d.playStopCallback;
                    if (function2 != null) {
                        function2.invoke(Boxing.boxLong(bVar.d.getMCurrentTime()), Boxing.boxBoolean(false));
                    }
                    bVar.d.setMCurrentTime(j);
                    bVar.a = j2;
                    bVar.b = 1;
                    if (DelayKt.delay(1000L, bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = j2;
                } else {
                    bVar = this;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.a;
                ResultKt.throwOnFailure(obj);
                bVar = this;
            }
            bVar.d.allStop();
            MediaMusicPlayUtils1 mediaMusicPlayUtils1 = bVar.d;
            mediaMusicPlayUtils1.setMCurrentTime(mediaMusicPlayUtils1.getMTotalTime());
            Function2 function3 = bVar.d.playStopCallback;
            if (function3 != null) {
                function3.invoke(Boxing.boxLong(bVar.d.getMCurrentTime()), Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }
    }

    private MediaMusicPlayUtils1(Context context) {
        this.mContext = context;
        this.mCurrentTime = TimeUtils.TIME_30_MINUTE;
        this.mTotalTime = TimeUtils.TIME_30_MINUTE;
        this.mPlayStatus = PlayStatus.NOT_PLAY;
        this.mPlayType = PlayType.SINGLE_AUDIO;
        this.mListLoopMediaPosition = -1;
        this.mListLoopMediaUrl = "";
        this.mCollectionId = "";
        this.mCollectionName = "";
        this.mOnPlayStatusChangeList = new ArrayList();
        this.mPlayerMap = new LinkedHashMap();
    }

    public /* synthetic */ MediaMusicPlayUtils1(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final void c() {
        Iterator<T> it2 = this.mOnPlayStatusChangeList.iterator();
        while (it2.hasNext()) {
            ((Function0) it2.next()).invoke();
        }
    }

    private final void d() {
        Job job = this.mJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.mJob = null;
    }

    private final void e(String musicUrls) {
        try {
            MediaPlayer mediaPlayer = this.mListLoopMediaPlayer;
            if (mediaPlayer == null) {
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                mediaPlayer2.reset();
                Unit unit = Unit.INSTANCE;
                this.mListLoopMediaPlayer = mediaPlayer2;
            } else if (mediaPlayer != null) {
                mediaPlayer.reset();
            }
            MediaPlayer mediaPlayer3 = this.mListLoopMediaPlayer;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setDataSource(musicUrls);
            }
            Function0<Unit> function0 = this.playCallback;
            if (function0 != null) {
                function0.invoke();
            }
            MediaPlayer mediaPlayer4 = this.mListLoopMediaPlayer;
            if (mediaPlayer4 != null) {
                mediaPlayer4.prepareAsync();
            }
            MediaPlayer mediaPlayer5 = this.mListLoopMediaPlayer;
            if (mediaPlayer5 != null) {
                mediaPlayer5.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: ax4
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer6) {
                        MediaMusicPlayUtils1.f(mediaPlayer6);
                    }
                });
            }
            MediaPlayer mediaPlayer6 = this.mListLoopMediaPlayer;
            if (mediaPlayer6 != null) {
                mediaPlayer6.setOnCompletionListener(this);
            }
            this.mPlayStatus = PlayStatus.PLAY;
        } catch (Exception e) {
            e.printStackTrace();
            Context context = this.mContext;
            Toast.makeText(context, context.getString(R.string.sls_play_fail), 0).show();
            this.mPlayStatus = PlayStatus.ERROR;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
    }

    private final void g(String url) {
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setLooping(true);
            mediaPlayer.reset();
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setDataSource(url);
            Function0<Unit> function0 = this.playCallback;
            if (function0 != null) {
                function0.invoke();
            }
            mediaPlayer.prepareAsync();
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: zw4
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    MediaMusicPlayUtils1.h(mediaPlayer2);
                }
            });
            this.mPlayerMap.put(url, mediaPlayer);
            this.mPlayStatus = PlayStatus.PLAY;
            c();
        } catch (Exception e) {
            e.printStackTrace();
            Context context = this.mContext;
            Toast.makeText(context, context.getString(R.string.sls_play_fail), 0).show();
            this.mPlayStatus = PlayStatus.ERROR;
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
    }

    private final void i() {
        this.mListLoopMediaPosition = -1;
        this.mListLoopMediaUrl = "";
        MediaPlayer mediaPlayer = this.mListLoopMediaPlayer;
        if (mediaPlayer != null) {
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = this.mListLoopMediaPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            this.mListLoopMediaPlayer = null;
        }
    }

    private final void j() {
        if (!this.mPlayerMap.isEmpty()) {
            Function0<Unit> function0 = this.playCallback;
            if (function0 != null) {
                function0.invoke();
            }
            Iterator<Map.Entry<String, MediaPlayer>> it2 = this.mPlayerMap.entrySet().iterator();
            while (it2.hasNext()) {
                MediaPlayer mediaPlayer = this.mPlayerMap.get(it2.next().getKey());
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                }
                if (mediaPlayer != null) {
                    mediaPlayer.release();
                }
            }
            this.mPlayerMap.clear();
        }
    }

    private final void k() {
        String playAddress;
        int i = WhenMappings.$EnumSwitchMapping$0[this.mPlayType.ordinal()];
        if (i != 1) {
            if (i == 2 && !TextUtils.isEmpty(this.mListLoopMediaUrl)) {
                e(this.mListLoopMediaUrl);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<MusicControlVo> list = this.dataList;
        if (list != null) {
            for (MusicControlVo musicControlVo : list) {
                if (!TextUtils.isEmpty(musicControlVo.getPlayAddress()) && (playAddress = musicControlVo.getPlayAddress()) != null) {
                    arrayList.add(playAddress);
                }
            }
        }
        playH5Music(arrayList);
    }

    private final void l(long time) {
        HMLog.info(r, a.a);
        Job job = this.mJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.mJob = e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new b(time, this, null), 2, null);
    }

    public final void addPlayStatusChange(@NotNull Function0<Unit> callback) {
        this.mOnPlayStatusChangeList.add(callback);
    }

    public final void allPause() {
        MediaPlayer mediaPlayer;
        if (!this.mPlayerMap.isEmpty()) {
            Iterator<Map.Entry<String, MediaPlayer>> it2 = this.mPlayerMap.entrySet().iterator();
            while (it2.hasNext()) {
                MediaPlayer mediaPlayer2 = this.mPlayerMap.get(it2.next().getKey());
                if (mediaPlayer2 != null) {
                    mediaPlayer2.pause();
                }
            }
            this.mPlayStatus = PlayStatus.ALL_PAUSE;
        }
        if (this.mPlayType == PlayType.LIST_LOOP_AUDIO && (mediaPlayer = this.mListLoopMediaPlayer) != null) {
            if (mediaPlayer != null) {
                mediaPlayer.pause();
            }
            this.mPlayStatus = PlayStatus.ALL_PAUSE;
        }
        c();
        d();
    }

    public final void allRestart() {
        if (this.mPlayStatus == PlayStatus.ALL_STOP) {
            k();
        } else {
            if (!this.mPlayerMap.isEmpty()) {
                Function0<Unit> function0 = this.playCallback;
                if (function0 != null) {
                    function0.invoke();
                }
                Iterator<Map.Entry<String, MediaPlayer>> it2 = this.mPlayerMap.entrySet().iterator();
                while (it2.hasNext()) {
                    MediaPlayer mediaPlayer = this.mPlayerMap.get(it2.next().getKey());
                    if (mediaPlayer != null) {
                        mediaPlayer.start();
                    }
                }
            }
            if (this.mPlayType == PlayType.LIST_LOOP_AUDIO) {
                Function0<Unit> function1 = this.playCallback;
                if (function1 != null) {
                    function1.invoke();
                }
                MediaPlayer mediaPlayer2 = this.mListLoopMediaPlayer;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.start();
                }
            }
        }
        this.mPlayStatus = PlayStatus.PLAY;
        c();
        l(this.mCurrentTime);
    }

    public final void allStop() {
        if (!this.mPlayerMap.isEmpty()) {
            Iterator<Map.Entry<String, MediaPlayer>> it2 = this.mPlayerMap.entrySet().iterator();
            while (it2.hasNext()) {
                MediaPlayer mediaPlayer = this.mPlayerMap.get(it2.next().getKey());
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                }
                if (mediaPlayer != null) {
                    mediaPlayer.release();
                }
            }
            this.mPlayerMap.clear();
        }
        if (this.mPlayType == PlayType.LIST_LOOP_AUDIO) {
            MediaPlayer mediaPlayer2 = this.mListLoopMediaPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.stop();
            }
            MediaPlayer mediaPlayer3 = this.mListLoopMediaPlayer;
            if (mediaPlayer3 != null) {
                mediaPlayer3.release();
            }
            this.mListLoopMediaPlayer = null;
        }
        this.mPlayStatus = PlayStatus.ALL_STOP;
        c();
    }

    public final void changeCurrentTime(long time) {
        this.mCurrentTime = time;
        if (this.mPlayStatus == PlayStatus.PLAY) {
            l(this.mCurrentTime);
        }
    }

    public final void changeTotalTime(long time) {
        this.mTotalTime = time;
    }

    public final void clearData() {
        List<MusicControlVo> list = this.dataList;
        if (list == null) {
            return;
        }
        list.clear();
    }

    public final void collectionMusic(@NotNull Function3<? super Integer, ? super CollectionMusic, ? super String, Unit> callback) {
        int size;
        if (!TextUtils.isEmpty(this.mCollectionId)) {
            callback.invoke(2, null, this.mCollectionId);
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<MusicControlVo> list = this.dataList;
        int i = 0;
        int size2 = list == null ? 0 : list.size();
        int i2 = this.mListLoopMediaPosition;
        if (i2 >= 0 && i2 < size2) {
            List<MusicControlVo> list2 = this.dataList;
            if (list2 != null) {
                arrayList.add(list2.get(getMListLoopMediaPosition()));
            }
        } else {
            List<MusicControlVo> list3 = this.dataList;
            if (list3 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list3) {
                    if (!TextUtils.isEmpty(((MusicControlVo) obj).getId())) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add((MusicControlVo) it2.next());
                }
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (arrayList.size() > 0 && (size = arrayList.size() - 1) >= 0) {
            while (true) {
                int i3 = i + 1;
                if (i == 0) {
                    stringBuffer.append(((MusicControlVo) arrayList.get(i)).getSimpleChinese());
                } else {
                    stringBuffer.append(Intrinsics.stringPlus("+", ((MusicControlVo) arrayList.get(i)).getSimpleChinese()));
                }
                if (i3 > size) {
                    break;
                } else {
                    i = i3;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Long.valueOf(Long.parseLong(((MusicControlVo) it3.next()).getId())));
        }
        callback.invoke(1, new CollectionMusic(arrayList3, TextUtils.isEmpty(stringBuffer.toString()) ? this.mContext.getString(R.string.sls_group_name) : stringBuffer.toString(), TextUtils.isEmpty(stringBuffer.toString()) ? this.mContext.getString(R.string.sls_group_name) : stringBuffer.toString(), ((int) this.mTotalTime) / 60, HMWebUtil.getUserId(), arrayList.size() > 0 ? ((MusicControlVo) arrayList.get(arrayList.size() - 1)).getItemImageUrl() : ""), this.mCollectionId);
    }

    @Nullable
    public final List<MusicControlVo> getDataList() {
        return this.dataList;
    }

    /* JADX INFO: renamed from: getListLoopMediaPosition, reason: from getter */
    public final int getMListLoopMediaPosition() {
        return this.mListLoopMediaPosition;
    }

    @NotNull
    public final String getMCollectionId() {
        return this.mCollectionId;
    }

    @NotNull
    public final String getMCollectionName() {
        return this.mCollectionName;
    }

    public final long getMCurrentTime() {
        return this.mCurrentTime;
    }

    public final int getMListLoopMediaPosition() {
        return this.mListLoopMediaPosition;
    }

    @NotNull
    public final String getMListLoopMediaUrl() {
        return this.mListLoopMediaUrl;
    }

    @NotNull
    public final PlayStatus getMPlayStatus() {
        return this.mPlayStatus;
    }

    @NotNull
    public final PlayType getMPlayType() {
        return this.mPlayType;
    }

    public final long getMTotalTime() {
        return this.mTotalTime;
    }

    @NotNull
    public final String getMusicTitle() {
        ArrayList arrayList;
        int size;
        if (!TextUtils.isEmpty(this.mCollectionName)) {
            return this.mCollectionName;
        }
        StringBuffer stringBuffer = new StringBuffer();
        List<MusicControlVo> list = this.dataList;
        int i = 0;
        int size2 = list == null ? 0 : list.size();
        int i2 = this.mListLoopMediaPosition;
        if (i2 >= 0 && i2 < size2) {
            List<MusicControlVo> list2 = this.dataList;
            if (list2 != null) {
                stringBuffer.append(list2.get(getMListLoopMediaPosition()).getSimpleChinese());
            }
        } else {
            List<MusicControlVo> list3 = this.dataList;
            if (list3 == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list3) {
                    if (!TextUtils.isEmpty(((MusicControlVo) obj).getId())) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i3 = i + 1;
                    if (i == 0) {
                        stringBuffer.append(((MusicControlVo) arrayList.get(i)).getSimpleChinese());
                    } else {
                        stringBuffer.append(Intrinsics.stringPlus("+", ((MusicControlVo) arrayList.get(i)).getSimpleChinese()));
                    }
                    if (i3 > size) {
                        break;
                    }
                    i = i3;
                }
            }
        }
        return stringBuffer.toString();
    }

    @NotNull
    public final PlayStatus getPlayStatus() {
        return this.mPlayStatus;
    }

    @NotNull
    public final PlayType getPlayType() {
        return this.mPlayType;
    }

    public final boolean isPlaying() {
        return this.mPlayStatus == PlayStatus.PLAY;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(@Nullable MediaPlayer mp) {
        MusicControlVo musicControlVo;
        String playAddress;
        MusicControlVo musicControlVo2;
        String id;
        PlayStatus playStatus = this.mPlayStatus;
        PlayStatus playStatus2 = PlayStatus.PLAY;
        if (playStatus != playStatus2 || this.mPlayType != PlayType.LIST_LOOP_AUDIO) {
            if (playStatus == playStatus2 && this.mPlayType == PlayType.SINGLE_AUDIO && mp != null) {
                mp.start();
                return;
            }
            return;
        }
        List<MusicControlVo> list = this.dataList;
        int size = list == null ? 0 : list.size();
        int i = this.mListLoopMediaPosition + 1;
        this.mListLoopMediaPosition = i;
        if (i >= size) {
            this.mListLoopMediaPosition = 0;
        }
        List<MusicControlVo> list2 = this.dataList;
        if (list2 == null || (musicControlVo = list2.get(this.mListLoopMediaPosition)) == null || (playAddress = musicControlVo.getPlayAddress()) == null) {
            playAddress = "";
        }
        if (!TextUtils.isEmpty(playAddress)) {
            Function2<? super String, ? super String, Unit> function2 = this.mOnAlbumCompletion;
            if (function2 == null) {
                return;
            }
            function2.invoke("", playAddress);
            return;
        }
        List<MusicControlVo> list3 = this.dataList;
        if (list3 == null || (musicControlVo2 = list3.get(this.mListLoopMediaPosition)) == null || (id = musicControlVo2.getId()) == null) {
            id = "";
        }
        Function2<? super String, ? super String, Unit> function3 = this.mOnAlbumCompletion;
        if (function3 == null) {
            return;
        }
        function3.invoke(id, "");
    }

    public final void playH5Music(@NotNull List<String> urls) {
        this.mPlayType = PlayType.SINGLE_AUDIO;
        i();
        ArrayList<String> arrayList = new ArrayList();
        Iterator<T> it2 = this.mPlayerMap.keySet().iterator();
        while (it2.hasNext()) {
            arrayList.add((String) it2.next());
        }
        for (String str : arrayList) {
            if (!urls.contains(str)) {
                MediaPlayer mediaPlayer = this.mPlayerMap.get(str);
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                }
                if (mediaPlayer != null) {
                    mediaPlayer.release();
                }
                this.mPlayerMap.remove(str);
            }
        }
        for (String str2 : urls) {
            if (this.mPlayerMap.keySet().contains(str2)) {
                MediaPlayer mediaPlayer2 = this.mPlayerMap.get(str2);
                boolean z = false;
                if (mediaPlayer2 != null && mediaPlayer2.isPlaying()) {
                    z = true;
                }
                if (!z) {
                    Function0<Unit> function0 = this.playCallback;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.start();
                    }
                    setMPlayStatus(PlayStatus.PLAY);
                    c();
                }
            } else {
                g(str2);
            }
        }
    }

    public final void playListMusic(@NotNull String musicUrls, int position) {
        this.mPlayType = PlayType.LIST_LOOP_AUDIO;
        j();
        if (this.mListLoopMediaPosition != position || TextUtils.isEmpty(this.mListLoopMediaUrl) || !Intrinsics.areEqual(this.mListLoopMediaUrl, musicUrls)) {
            this.mListLoopMediaPosition = position;
            this.mListLoopMediaUrl = musicUrls;
            e(musicUrls);
        } else {
            if (this.mPlayStatus == PlayStatus.ALL_PAUSE) {
                allRestart();
                return;
            }
            MediaPlayer mediaPlayer = this.mListLoopMediaPlayer;
            boolean z = false;
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                z = true;
            }
            if (z) {
                return;
            }
            e(musicUrls);
        }
    }

    public final void removePlayStatusChange(@NotNull Function0<Unit> callback) {
        int iIndexOf = this.mOnPlayStatusChangeList.indexOf(callback);
        if (iIndexOf >= 0) {
            this.mOnPlayStatusChangeList.remove(iIndexOf);
        }
    }

    public final void setDataList(@Nullable List<MusicControlVo> list) {
        this.dataList = list;
    }

    public final void setMCollectionId(@NotNull String str) {
        this.mCollectionId = str;
    }

    public final void setMCollectionName(@NotNull String str) {
        this.mCollectionName = str;
    }

    public final void setMCurrentTime(long j) {
        this.mCurrentTime = j;
    }

    public final void setMListLoopMediaPosition(int i) {
        this.mListLoopMediaPosition = i;
    }

    public final void setMListLoopMediaUrl(@NotNull String str) {
        this.mListLoopMediaUrl = str;
    }

    public final void setMPlayStatus(@NotNull PlayStatus playStatus) {
        this.mPlayStatus = playStatus;
    }

    public final void setMPlayType(@NotNull PlayType playType) {
        this.mPlayType = playType;
    }

    public final void setMTotalTime(long j) {
        this.mTotalTime = j;
    }

    public final void setOnAlbumCompletion(@NotNull Function2<? super String, ? super String, Unit> callback) {
        this.mOnAlbumCompletion = callback;
    }

    public final void setOnPlayCallBack(@NotNull Function0<Unit> callback) {
        this.playCallback = callback;
    }

    public final void setPlayStopCallBack(@NotNull Function2<? super Long, ? super Boolean, Unit> callback) {
        this.playStopCallback = callback;
    }
}
