package com.huami.sleepassistant.apilib.repo;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.sleepassistant.apilib.R;
import com.huami.sleepassistant.apilib.bean.AlbumBean;
import com.huami.sleepassistant.apilib.bean.AudioResources;
import com.huami.sleepassistant.apilib.bean.CollectionMusic;
import com.huami.sleepassistant.apilib.bean.CollectionResult;
import com.huami.sleepassistant.apilib.bean.IsCollectionResult;
import com.huami.sleepassistant.apilib.bean.Items;
import com.huami.sleepassistant.apilib.bean.MusicBean;
import com.huami.sleepassistant.apilib.db.SleepAssistantDb;
import com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao;
import com.huami.sleepassistant.apilib.db.po.LiveMusic;
import com.huami.sleepassistant.apilib.db.po.Music;
import com.huami.sleepassistant.apilib.helper.AppExecutors;
import com.huami.sleepassistant.apilib.repo.MediaPlayerRepo;
import com.huami.sleepassistant.apilib.utils.BuiltInMusicUtils;
import com.huami.sleepassistant.apilib.utils.MediaFileUtils;
import com.huami.sleepassistant.apilib.utils.OnDownLoadResourceStatusCallBack;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.huami.sleepassistant.apilib.utils.ext.PoToVoExKt;
import com.huami.sleepassistant.apilib.utils.ext.SleepBeanToPoExKt;
import com.huami.sleepassistant.apilib.utils.ext.WebBeanToPoExKt;
import com.huami.sleepassistant.apilib.vo.ApiEmptyResponse;
import com.huami.sleepassistant.apilib.vo.ApiErrorResponse;
import com.huami.sleepassistant.apilib.vo.ApiResponse;
import com.huami.sleepassistant.apilib.vo.ApiSuccessResponse;
import com.huami.sleepassistant.apilib.vo.MusicControlVo;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.wififtp.FileManagerFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 N2\u00020\u0001:\u0001NB\u001f\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?¢\u0006\u0004\bL\u0010MJ3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J3\u0010\u0019\u001a\u00020\n2+\u0010\u0018\u001a'\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0007¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\n0\u0012j\u0002`\u0017J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u001aJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\u001d\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0006\u0010\u001e\u001a\u00020\nJ\u000e\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0005J5\u0010$\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00052%\u0010\u0018\u001a!\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\n0\u0012j\u0002`#J;\u0010*\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2+\u0010)\u001a'\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050'¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\n0\u0012j\u0002`(J;\u0010.\u001a\u00020\n2\u0006\u0010+\u001a\u00020%2+\u0010)\u001a'\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020,0'¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\n0\u0012j\u0002`-JA\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000'0\u001a2\u0006\u0010/\u001a\u00020\u00052%\u0010\u0018\u001a!\u0012\u0013\u0012\u001100¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\n0\u0012j\u0002`2J5\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070'042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b5\u00106J\u0016\u00105\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER+\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070'048\u0006@\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J¨\u0006O"}, d2 = {"Lcom/huami/sleepassistant/apilib/repo/MediaPlayerRepo;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "", "arrayOf", "", "Lcom/huami/sleepassistant/apilib/db/po/Music;", "dbList", "", "x", "(Landroid/content/Context;[Ljava/lang/String;Ljava/util/List;)V", "dataList", "", "Lcom/huami/sleepassistant/apilib/bean/AudioResources;", "list", "w", "Lkotlin/Function1;", "Lcom/huami/sleepassistant/apilib/vo/MusicControlVo;", "Lkotlin/ParameterName;", "name", "vo", "Lcom/huami/sleepassistant/apilib/repo/OnMediaCallBack;", "callback", "queryAllMusic", "Landroidx/lifecycle/LiveData;", "queryAllMusicList", "musicList", "saveMusicList", "deleteMusicList", "resourceId", "uploadListLoopMusicHistory", WebConst.QueryParam.AUDIO_ID, "audioUrl", "Lcom/huami/sleepassistant/apilib/repo/OnAlbumDetailCallback;", "getAudioDetail", "Lcom/huami/sleepassistant/apilib/bean/CollectionMusic;", "postCommentParam", "Lcom/huami/android/vo/Resource;", "Lcom/huami/sleepassistant/apilib/repo/OnCollectionMusicCallBack;", "mCallback", "collectionMusic", "audioIds", "Lcom/huami/sleepassistant/apilib/bean/IsCollectionResult;", "Lcom/huami/sleepassistant/apilib/repo/OnIsCollectionMusicCallBack;", "isCollectionMusic", "id", "", TypedValues.Custom.S_BOOLEAN, "Lcom/huami/sleepassistant/apilib/repo/OnDelCallBack;", "delCollection", "Landroidx/lifecycle/MutableLiveData;", "playPushMusic", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleepassistant/apilib/helper/AppExecutors;", "a", "Lcom/huami/sleepassistant/apilib/helper/AppExecutors;", "appExecutors", "Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;", "b", "Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/sleepassistant/apilib/repo/SleepAssistantWebApi;", "c", "Lcom/huami/sleepassistant/apilib/repo/SleepAssistantWebApi;", "webApi", "Lcom/huami/sleepassistant/apilib/db/dao/SleepAssistantDao;", GoogleApiAvailabilityLight.a, "Lcom/huami/sleepassistant/apilib/db/dao/SleepAssistantDao;", "sleepAssistDao", "e", "Landroidx/lifecycle/MutableLiveData;", "getLiveData", "()Landroidx/lifecycle/MutableLiveData;", "liveData", "<init>", "(Lcom/huami/sleepassistant/apilib/helper/AppExecutors;Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;Lcom/huami/sleepassistant/apilib/repo/SleepAssistantWebApi;)V", "Companion", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final class MediaPlayerRepo {

    @NotNull
    private static final String f = "MediaPlayerRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SleepAssistantDb db;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final SleepAssistantWebApi webApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final SleepAssistantDao sleepAssistDao;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<List<Music>>> liveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "已经处理完音乐";
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
            return "查询数据库数据";
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
            return "数据库数据大于3，证明已经获取过音乐列表";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "数据库数据小于3，重新获取列表";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "piResponse.body 为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "piResponse.body 为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<Items<MusicBean>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ApiResponse<Items<MusicBean>> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("失败！！！", ((ApiErrorResponse) this.a).getErrorMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "通知liveData";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("查询所有music失败：", this.a.getMessage());
        }
    }

    public MediaPlayerRepo(@NotNull AppExecutors appExecutors, @NotNull SleepAssistantDb sleepAssistantDb, @NotNull SleepAssistantWebApi sleepAssistantWebApi) {
        this.appExecutors = appExecutors;
        this.db = sleepAssistantDb;
        this.webApi = sleepAssistantWebApi;
        this.sleepAssistDao = sleepAssistantDb.sleepAssistantDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(MediaPlayerRepo mediaPlayerRepo, String str) {
        mediaPlayerRepo.db.sleepAssistantDao().deleteLiveMusic(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(final MediaPlayerRepo mediaPlayerRepo, final String str, Function1 function1) {
        final ApiResponse<AlbumBean> audioDetail = mediaPlayerRepo.webApi.getAudioDetail(str);
        if (!(audioDetail instanceof ApiSuccessResponse)) {
            function1.invoke("");
        } else {
            mediaPlayerRepo.appExecutors.getDiskIO().execute(new Runnable() { // from class: yx4
                @Override // java.lang.Runnable
                public final void run() {
                    MediaPlayerRepo.D(this.a, str, audioDetail);
                }
            });
            function1.invoke(((AlbumBean) ((ApiSuccessResponse) audioDetail).getBody()).getAudioUrl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(final MediaPlayerRepo mediaPlayerRepo, final String str, final ApiResponse apiResponse) {
        mediaPlayerRepo.db.runInTransaction(new Runnable() { // from class: lx4
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayerRepo.E(str, mediaPlayerRepo, apiResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(String str, MediaPlayerRepo mediaPlayerRepo, ApiResponse apiResponse) {
        List<Music> listAsMutableList = TypeIntrinsics.asMutableList(mediaPlayerRepo.db.sleepAssistantDao().queryMusicIn(CollectionsKt__CollectionsKt.mutableListOf(str)));
        if (true ^ listAsMutableList.isEmpty()) {
            listAsMutableList.get(0).setAudioUrl(((AlbumBean) ((ApiSuccessResponse) apiResponse).getBody()).getAudioUrl());
            mediaPlayerRepo.db.sleepAssistantDao().insertOrUpdateMusic(listAsMutableList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(MediaPlayerRepo mediaPlayerRepo, CollectionMusic collectionMusic, Function1 function1) {
        ApiResponse<IsCollectionResult> apiResponsePostIsCollectionMusic = mediaPlayerRepo.webApi.postIsCollectionMusic(collectionMusic);
        Resource.Companion companion = Resource.INSTANCE;
        Resource resourceSuccess = companion.success(new IsCollectionResult("", "", ""));
        if (apiResponsePostIsCollectionMusic instanceof ApiSuccessResponse) {
            resourceSuccess = companion.success(((ApiSuccessResponse) apiResponsePostIsCollectionMusic).getBody());
        }
        function1.invoke(resourceSuccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(final MediaPlayerRepo mediaPlayerRepo, final Context context, final String[] strArr) {
        List<Music> listQueryMusicList = mediaPlayerRepo.db.sleepAssistantDao().queryMusicList();
        HMLog.info(f, b.a);
        if (listQueryMusicList.size() > 3) {
            HMLog.info(f, c.a);
            mediaPlayerRepo.x(context, strArr, listQueryMusicList);
            return;
        }
        HMLog.info(f, d.a);
        final ApiResponse apiResponseLoadMusic$default = SleepAssistantWebApi.DefaultImpls.loadMusic$default(mediaPlayerRepo.webApi, null, 1000, 1, null);
        if (apiResponseLoadMusic$default instanceof ApiSuccessResponse) {
            if (((ApiSuccessResponse) apiResponseLoadMusic$default).getBody() != null) {
                mediaPlayerRepo.appExecutors.getDiskIO().execute(new Runnable() { // from class: tx4
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaPlayerRepo.H(this.a, apiResponseLoadMusic$default, context, strArr);
                    }
                });
                return;
            } else {
                HMLog.info(f, e.a);
                return;
            }
        }
        if (apiResponseLoadMusic$default instanceof ApiEmptyResponse) {
            HMLog.info(f, f.a);
        } else if (apiResponseLoadMusic$default instanceof ApiErrorResponse) {
            HMLog.error$default(f, null, null, new g(apiResponseLoadMusic$default), 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(final MediaPlayerRepo mediaPlayerRepo, final ApiResponse apiResponse, final Context context, final String[] strArr) {
        mediaPlayerRepo.db.runInTransaction(new Runnable() { // from class: kx4
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayerRepo.I(apiResponse, mediaPlayerRepo, context, strArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(ApiResponse apiResponse, final MediaPlayerRepo mediaPlayerRepo, final Context context, final String[] strArr) {
        final List items = ((Items) ((ApiSuccessResponse) apiResponse).getBody()).getItems();
        mediaPlayerRepo.db.runInTransaction(new Runnable() { // from class: jx4
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayerRepo.J(this.a, items, context, strArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(MediaPlayerRepo mediaPlayerRepo, List list, Context context, String[] strArr) {
        List<Music> listQueryMusicList = mediaPlayerRepo.sleepAssistDao.queryMusicList();
        ArrayList arrayList = new ArrayList();
        if (listQueryMusicList.size() >= 3) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(listQueryMusicList.get(i2));
                if (i3 > 2) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        mediaPlayerRepo.sleepAssistDao.deleteMusicListItems();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(WebBeanToPoExKt.toMusic((MusicBean) it2.next()));
        }
        arrayList.addAll(arrayList2);
        mediaPlayerRepo.sleepAssistDao.insertOrUpdateMusic(arrayList);
        mediaPlayerRepo.x(context, strArr, listQueryMusicList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(MediaPlayerRepo mediaPlayerRepo, Subscriber subscriber) {
        List<Music> listQueryMusicList = mediaPlayerRepo.sleepAssistDao.queryMusicList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listQueryMusicList, 10));
        Iterator<T> it2 = listQueryMusicList.iterator();
        while (it2.hasNext()) {
            arrayList.add(SleepBeanToPoExKt.toMusicControlVo2((Music) it2.next()));
        }
        subscriber.onNext(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(Function1 function1, List list) {
        if (list != null) {
            function1.invoke(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(Throwable th) {
        HMLog.warn$default(null, th, new i(th), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(MediaPlayerRepo mediaPlayerRepo, String str) {
        mediaPlayerRepo.webApi.uploadMusicHistory(str, "XMLY_SINGLE_AUDIO");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final MediaPlayerRepo mediaPlayerRepo, final CollectionMusic collectionMusic, MediatorLiveData mediatorLiveData, Function1 function1) {
        final ApiResponse<CollectionResult> apiResponsePostCollectionMusic = mediaPlayerRepo.webApi.postCollectionMusic(collectionMusic);
        boolean z = apiResponsePostCollectionMusic instanceof ApiSuccessResponse;
        if (z) {
            mediaPlayerRepo.appExecutors.getDiskIO().execute(new Runnable() { // from class: vx4
                @Override // java.lang.Runnable
                public final void run() {
                    MediaPlayerRepo.u(this.a, apiResponsePostCollectionMusic, collectionMusic);
                }
            });
        }
        Resource.Companion companion = Resource.INSTANCE;
        Resource resourceSuccess = companion.success("");
        if (z) {
            resourceSuccess = companion.success(((CollectionResult) ((ApiSuccessResponse) apiResponsePostCollectionMusic).getBody()).getSid());
        }
        Resource resourceCopy$default = resourceSuccess;
        if (TextUtils.isEmpty((CharSequence) resourceCopy$default.getData())) {
            Status status = Status.ERROR;
            ApiErrorResponse apiErrorResponse = apiResponsePostCollectionMusic instanceof ApiErrorResponse ? (ApiErrorResponse) apiResponsePostCollectionMusic : null;
            resourceCopy$default = Resource.copy$default(resourceCopy$default, status, null, apiErrorResponse == null ? null : apiErrorResponse.getErrorMessage(), 2, null);
        }
        mediatorLiveData.postValue(resourceCopy$default);
        function1.invoke(resourceCopy$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(final MediaPlayerRepo mediaPlayerRepo, final ApiResponse apiResponse, final CollectionMusic collectionMusic) {
        mediaPlayerRepo.db.runInTransaction(new Runnable() { // from class: ux4
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayerRepo.v(this.a, apiResponse, collectionMusic);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(MediaPlayerRepo mediaPlayerRepo, ApiResponse apiResponse, CollectionMusic collectionMusic) {
        List<LiveMusic> listAsMutableList = TypeIntrinsics.asMutableList(mediaPlayerRepo.db.sleepAssistantDao().queryLiveMusic());
        ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponse;
        listAsMutableList.add(0, new LiveMusic(((CollectionResult) apiSuccessResponse.getBody()).getSid(), ((CollectionResult) apiSuccessResponse.getBody()).getUserId(), collectionMusic.getItemName(), collectionMusic.getItemDescription(), ((CollectionResult) apiSuccessResponse.getBody()).getPlayTime(), collectionMusic.getImageUrl(), false, 0, 192, null));
        mediaPlayerRepo.db.sleepAssistantDao().deleteLiveMusicListItems();
        mediaPlayerRepo.db.sleepAssistantDao().insertOrUpdateLiveMusic(listAsMutableList);
    }

    private final void w(final Context context, final List<Music> dataList, final List<AudioResources> list) {
        if (list.size() == 0) {
            playPushMusic(dataList);
        } else {
            final ArrayList arrayList = new ArrayList();
            MediaFileUtils.INSTANCE.newInstance().loadDownResourceMusic(context, list, new OnDownLoadResourceStatusCallBack() { // from class: com.huami.sleepassistant.apilib.repo.MediaPlayerRepo$dealLiveMusic$1
                @Override // com.huami.sleepassistant.apilib.utils.OnDownLoadResourceStatusCallBack
                public void callback(@Nullable String item) {
                    try {
                        arrayList.add(item);
                        if (arrayList.size() == list.size()) {
                            this.playPushMusic(dataList);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }

                @Override // com.huami.sleepassistant.apilib.utils.OnDownLoadResourceStatusCallBack
                public void downFail() {
                    Toast.makeText(context, R.string.sls_down_fail, 0).show();
                }

                @Override // com.huami.sleepassistant.apilib.utils.OnDownLoadResourceStatusCallBack
                public void downProgress(@NotNull Integer... progress) {
                }

                @Override // com.huami.sleepassistant.apilib.utils.OnDownLoadResourceStatusCallBack
                public void endDown() {
                }

                @Override // com.huami.sleepassistant.apilib.utils.OnDownLoadResourceStatusCallBack
                public void startDown() {
                }
            });
        }
    }

    private final void x(Context context, String[] arrayOf, List<Music> dbList) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj : dbList) {
                if (ArraysKt___ArraysKt.contains(arrayOf, ((Music) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            List<AudioResources> arrayList2 = new ArrayList<>();
            int i2 = 0;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i3 = i2 + 1;
                    if (!new File(MediaFileUtils.INSTANCE.getBaseDirSleepAssistantPath() + ((Music) arrayList.get(i2)).getId() + FileManagerFragment.FILE_TYPE_MUSIC).exists() && !Intrinsics.areEqual(BuiltInMusicUtils.MUSIC_ID_1, ((Music) arrayList.get(i2)).getId()) && !Intrinsics.areEqual(BuiltInMusicUtils.MUSIC_ID_2, ((Music) arrayList.get(i2)).getId()) && !Intrinsics.areEqual(BuiltInMusicUtils.MUSIC_ID_3, ((Music) arrayList.get(i2)).getId())) {
                        arrayList2.add(PoToVoExKt.toAudioResources((Music) arrayList.get(i2)));
                    }
                    if (i3 > size) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            HMLog.info(f, a.a);
            w(context, arrayList, arrayList2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(final MediaPlayerRepo mediaPlayerRepo, final String str, Function1 function1, final MediatorLiveData mediatorLiveData) {
        ApiResponse<String> delCollection = mediaPlayerRepo.webApi.getDelCollection(str);
        if (delCollection instanceof ApiSuccessResponse ? true : delCollection instanceof ApiEmptyResponse) {
            mediaPlayerRepo.appExecutors.getDiskIO().execute(new Runnable() { // from class: qx4
                @Override // java.lang.Runnable
                public final void run() {
                    MediaPlayerRepo.z(this.a, mediatorLiveData, str);
                }
            });
            function1.invoke(Boolean.TRUE);
        } else if (delCollection instanceof ApiErrorResponse) {
            mediatorLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, ((ApiErrorResponse) delCollection).getErrorMessage(), null, 2, null));
            function1.invoke(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(final MediaPlayerRepo mediaPlayerRepo, MediatorLiveData mediatorLiveData, final String str) {
        mediaPlayerRepo.db.runInTransaction(new Runnable() { // from class: xx4
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayerRepo.A(this.a, str);
            }
        });
        mediatorLiveData.postValue(Resource.INSTANCE.success(Boolean.TRUE));
        mediaPlayerRepo.appExecutors.getMainThread().execute(new Runnable() { // from class: mx4
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayerRepo.B();
            }
        });
    }

    public final void collectionMusic(@NotNull final CollectionMusic postCommentParam, @NotNull final Function1<? super Resource<String>, Unit> mCallback) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: rx4
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayerRepo.t(this.a, postCommentParam, mediatorLiveData, mCallback);
            }
        });
    }

    @NotNull
    public final LiveData<Resource<Boolean>> delCollection(@NotNull final String id, @NotNull final Function1<? super Boolean, Unit> callback) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: ix4
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayerRepo.y(this.a, id, callback, mediatorLiveData);
            }
        });
        return mediatorLiveData;
    }

    public final void deleteMusicList() {
        this.db.sleepAssistantDao().deleteMusicListItems();
    }

    public final void getAudioDetail(@NotNull final String audioId, @NotNull final Function1<? super String, Unit> callback) {
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: hx4
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayerRepo.C(this.a, audioId, callback);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Resource<List<Music>>> getLiveData() {
        return this.liveData;
    }

    public final void isCollectionMusic(@NotNull final CollectionMusic audioIds, @NotNull final Function1<? super Resource<IsCollectionResult>, Unit> mCallback) {
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: sx4
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayerRepo.F(this.a, audioIds, mCallback);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Resource<List<Music>>> playPushMusic(@NotNull final Context context, @NotNull final String[] arrayOf) {
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: gx4
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayerRepo.G(this.a, context, arrayOf);
            }
        });
        return this.liveData;
    }

    public final void queryAllMusic(@NotNull final Function1<? super List<MusicControlVo>, Unit> callback) {
        Observable.create(new Observable.OnSubscribe() { // from class: nx4
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                MediaPlayerRepo.K(this.a, (Subscriber) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: ox4
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                MediaPlayerRepo.L(callback, (List) obj);
            }
        }, new Action1() { // from class: px4
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                MediaPlayerRepo.M((Throwable) obj);
            }
        });
    }

    @NotNull
    public final List<Music> queryAllMusicList() {
        return this.db.sleepAssistantDao().queryMusicList();
    }

    public final void saveMusicList(@NotNull List<Music> musicList) {
        this.db.sleepAssistantDao().insertOrUpdateMusic(musicList);
    }

    public final void uploadListLoopMusicHistory(@NotNull final String resourceId) {
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: wx4
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayerRepo.N(this.a, resourceId);
            }
        });
    }

    public final void playPushMusic(@Nullable List<Music> dataList) {
        HMLog.info(f, h.a);
        this.liveData.postValue(Resource.INSTANCE.success(dataList));
    }

    @NotNull
    public final LiveData<List<Music>> queryAllMusic() {
        return this.db.sleepAssistantDao().queryMusicDataList();
    }
}
