package com.xiaomi.fitness.detail.video.share.holder;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.maps.AMap;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.detail.video.share.adapter.MusicItem;
import com.xiaomi.fitness.detail.video.share.adapter.MusicStyleAdapter;
import com.xiaomi.fitness.detail.video.share.holder.MusicStyleHolder;
import com.xiaomi.fitness.detail.video.share.util.DownloadMusicUtil;
import com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.utils.AidongApkDownloadUtil;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.okp;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 U2\u00020\u0001:\u0002UVB=\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010+\u001a\u00020*\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-¢\u0006\u0004\bS\u0010TJ\u0017\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J2\u0010\u0019\u001a\u00020\u000f2#\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u0013J\r\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u0013R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010<\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010B\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010H\u001a\u0004\bI\u0010\u0005\"\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010O\u001a\u00060NR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006W"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/holder/MusicStyleHolder;", "", "", "Lcom/xiaomi/fitness/detail/video/share/adapter/MusicItem;", "refreshMusitItemList", "()Ljava/util/List;", "buildStyleItemList", "", "musicId", "", "getMusicUri", "(I)Ljava/lang/String;", "getMusicName", "Lcom/xiaomi/fitness/detail/video/share/holder/SwitchMusicPanelHolder;", "holder", "", "initHolder", "(Lcom/xiaomi/fitness/detail/video/share/holder/SwitchMusicPanelHolder;)V", "defaultDownload", "()V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "typeId", "callback", "initAdapterOnClickCallback", "(Lkotlin/jvm/functions/Function1;)V", "refreshMusicList", "reset", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/amap/api/maps/AMap;", "aMap", "Lcom/amap/api/maps/AMap;", "getAMap", "()Lcom/amap/api/maps/AMap;", "Landroid/widget/ImageView;", "doneBtn", "Landroid/widget/ImageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "editPanel", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;", "traceStyleResModeLiveData", "Landroidx/lifecycle/MutableLiveData;", "getTraceStyleResModeLiveData", "()Landroidx/lifecycle/MutableLiveData;", "Landroidx/recyclerview/widget/RecyclerView;", "traceStyleRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/widget/TextView;", "titleTv", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/detail/video/share/adapter/MusicStyleAdapter;", "styleAdapter", "Lcom/xiaomi/fitness/detail/video/share/adapter/MusicStyleAdapter;", "selectMusic", "Ljava/lang/String;", "getSelectMusic", "()Ljava/lang/String;", "setSelectMusic", "(Ljava/lang/String;)V", "selectMusicId", "I", "getSelectMusicId", "()I", "setSelectMusicId", "(I)V", "Ljava/util/List;", "getBuildStyleItemList", "setBuildStyleItemList", "(Ljava/util/List;)V", "musicHolder", "Lcom/xiaomi/fitness/detail/video/share/holder/SwitchMusicPanelHolder;", "Lcom/xiaomi/fitness/detail/video/share/holder/MusicStyleHolder$DownloadBroadcastReceiver;", "mReceiver", "Lcom/xiaomi/fitness/detail/video/share/holder/MusicStyleHolder$DownloadBroadcastReceiver;", "Lokp;", "styleBinding", "<init>", "(Landroid/content/Context;Lcom/amap/api/maps/AMap;Lokp;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/lifecycle/MutableLiveData;)V", "Companion", AidongApkDownloadUtil.DownloadBroadcastReceiver.TAG, "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMusicStyleHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicStyleHolder.kt\ncom/xiaomi/fitness/detail/video/share/holder/MusicStyleHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,359:1\n1557#2:360\n1628#2,3:361\n*S KotlinDebug\n*F\n+ 1 MusicStyleHolder.kt\ncom/xiaomi/fitness/detail/video/share/holder/MusicStyleHolder\n*L\n124#1:360\n124#1:361,3\n*E\n"})
public final class MusicStyleHolder {

    @NotNull
    public static final String BUFA = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/bufa.m4a?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=JRA3Ii5mhs9CtDtZgHrZ9OrpN2I=";

    @NotNull
    public static final String BUFA_ICON = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/icon/bufa.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=Pmurtouov2siATD8+Qvoydq60PI=";

    @NotNull
    public static final String DIANZI = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/dianzi.m4a?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=ZfoYInWMwKShahBqXHq8MBSf6j0=";

    @NotNull
    public static final String DIANZI_ICON = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/icon/dianzi.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=UxnQyYAPL7I3/VrV8RlzQghWtRk=";

    @NotNull
    public static final String LVDONG = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/lvdong.m4a?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=9m289DFXYMCnD81TPj3wn3wq3y8=";

    @NotNull
    public static final String LVDONG_ICON = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/icon/lvdong.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=0L3NMY57C3/4LFNynELQFzeZki4=";
    public static final int MUSIC_BUFA = 9;
    public static final int MUSIC_DIANZI = 8;
    public static final int MUSIC_LVDONG = 7;
    public static final int MUSIC_NO = 0;
    public static final int MUSIC_REWU = 6;
    public static final int MUSIC_SUIYI = 5;
    public static final int MUSIC_XIANGSHANG = 4;
    public static final int MUSIC_XIELI = 3;
    public static final int MUSIC_YOUYANG = 2;
    public static final int MUSIC_YUEDONG = 1;

    @NotNull
    public static final String REWU = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/rewu.m4a?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=9iXtIqo9qOLbRuCOFD5ypWlkmAI=";

    @NotNull
    public static final String REWU_ICON = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/icon/rewu.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=rcsxRGB8zszgUIRaf5UFpO1voaA=";

    @NotNull
    public static final String SUIYI = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/suiyi.m4a?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=isNQCNC9OVUnLG5Fr7BEAXb8dFc=";

    @NotNull
    public static final String SUIYI_ICON = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/icon/suiyi.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=A3hfdlV+HmnbLy+OdUuLwSj31l8=";

    @NotNull
    public static final String TAG = "SwitchMapHolder";

    @NotNull
    public static final String XIANGSHANG = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/xiangshang.m4a?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=YsVti+x0WeVHeKJ0jGQJ2yZn+BY=";

    @NotNull
    public static final String XIANGSHANG_ICON = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/icon/xiangshang.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=59+97x8N3SJizsf+Gz6ZFXup4yE=";

    @NotNull
    public static final String XIELI = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/xieli.m4a?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=UwlGZNPi9fLRKUwK14D1S3aW04Y=";

    @NotNull
    public static final String XIELI_ICON = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/icon/xieli.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=mPPFd6yvOBU8IDIP+zWSWbagDc0=";

    @NotNull
    public static final String YOUYANG = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/youyang.m4a?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=PHaMDxwiBh1T7Tru87tphz1mDew=";

    @NotNull
    public static final String YOUYANG_ICON = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/icon/youyang.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=7Re7OczZUxxUNVNeh5/R6uSvMCQ=";

    @NotNull
    public static final String YUEDONG = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/yuedong.m4a?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=ul0WNGXgiWkeP2WvfLbmm8iMDMQ=";

    @NotNull
    public static final String YUEDONG_ICON = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/music/icon/yuedong.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=sC4byCIETNb4IkhB2IRQOcHtob8=";

    @NotNull
    private final AMap aMap;

    @Nullable
    private List<MusicItem> buildStyleItemList;

    @NotNull
    private final Context context;

    @NotNull
    private final ImageView doneBtn;

    @NotNull
    private final ConstraintLayout editPanel;

    @NotNull
    private DownloadBroadcastReceiver mReceiver;

    @Nullable
    private SwitchMusicPanelHolder musicHolder;

    @NotNull
    private String selectMusic;
    private int selectMusicId;

    @Nullable
    private MusicStyleAdapter styleAdapter;

    @NotNull
    private final TextView titleTv;

    @NotNull
    private final RecyclerView traceStyleRecycler;

    @NotNull
    private final MutableLiveData<TraceStyleResModel> traceStyleResModeLiveData;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/holder/MusicStyleHolder$DownloadBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/xiaomi/fitness/detail/video/share/holder/MusicStyleHolder;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class DownloadBroadcastReceiver extends BroadcastReceiver {
        public DownloadBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            long longExtra = intent.getLongExtra("extra_download_id", -1L);
            FitnessLogUtils.d("SwitchMapHolder", "onReceive completeId=" + longExtra + " ");
            DownloadMusicUtil downloadMusicUtil = DownloadMusicUtil.INSTANCE;
            if (downloadMusicUtil.getDownloadIdMap().containsKey(Long.valueOf(longExtra))) {
                try {
                    DownloadManager.Query query = new DownloadManager.Query();
                    query.setFilterById(longExtra);
                    Cursor cursorQuery = downloadMusicUtil.getMDownloadManager().query(query);
                    if (cursorQuery.moveToFirst()) {
                        int columnIndex = cursorQuery.getColumnIndex("status");
                        if (8 == cursorQuery.getInt(columnIndex)) {
                            FitnessLogUtils.i("SwitchMapHolder", "success , completeId=" + longExtra);
                            MusicStyleAdapter musicStyleAdapter = MusicStyleHolder.this.styleAdapter;
                            if (musicStyleAdapter != null) {
                                musicStyleAdapter.bindListData(MusicStyleHolder.this.refreshMusitItemList());
                            }
                            SwitchMusicPanelHolder switchMusicPanelHolder = MusicStyleHolder.this.musicHolder;
                            if (switchMusicPanelHolder != null) {
                                SwitchMusicPanelHolder.playMusic$default(switchMusicPanelHolder, false, 0L, 2, null);
                            }
                        } else {
                            FitnessLogUtils.i("SwitchMapHolder", "fail , completeId=" + longExtra);
                            if (cursorQuery.getInt(columnIndex) == 16) {
                                downloadMusicUtil.getDownloadIdMap().remove(Long.valueOf(longExtra));
                            }
                        }
                    }
                    ApplicationExtKt.getApplication().unregisterReceiver(MusicStyleHolder.this.mReceiver);
                } catch (Exception e) {
                    Logger.e("SwitchMapHolder", e, "install process occurred error");
                }
            }
        }
    }

    public MusicStyleHolder(@NotNull Context context, @NotNull AMap aMap, @NotNull okp styleBinding, @NotNull ImageView doneBtn, @NotNull ConstraintLayout editPanel, @NotNull MutableLiveData<TraceStyleResModel> traceStyleResModeLiveData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aMap, "aMap");
        Intrinsics.checkNotNullParameter(styleBinding, "styleBinding");
        Intrinsics.checkNotNullParameter(doneBtn, "doneBtn");
        Intrinsics.checkNotNullParameter(editPanel, "editPanel");
        Intrinsics.checkNotNullParameter(traceStyleResModeLiveData, "traceStyleResModeLiveData");
        this.context = context;
        this.aMap = aMap;
        this.doneBtn = doneBtn;
        this.editPanel = editPanel;
        this.traceStyleResModeLiveData = traceStyleResModeLiveData;
        RecyclerView traceStyleRecyclerView = styleBinding.B;
        Intrinsics.checkNotNullExpressionValue(traceStyleRecyclerView, "traceStyleRecyclerView");
        this.traceStyleRecycler = traceStyleRecyclerView;
        TextView titleTv = styleBinding.A;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        this.titleTv = titleTv;
        this.selectMusic = "";
        this.mReceiver = new DownloadBroadcastReceiver();
    }

    private final List<MusicItem> buildStyleItemList() {
        ArrayList arrayList = new ArrayList();
        MusicItem musicItem = new MusicItem(ResourceExtKt.getString(j1j.M5), "", hoi.P, "", 0, 1, true);
        String string = ResourceExtKt.getString(j1j.S5);
        DownloadMusicUtil downloadMusicUtil = DownloadMusicUtil.INSTANCE;
        MusicItem musicItem2 = new MusicItem(string, "", 0, YUEDONG_ICON, 1, downloadMusicUtil.hasDownload(getMusicName(1)) ? 1 : 0, false, 68, null);
        MusicItem musicItem3 = new MusicItem(ResourceExtKt.getString(j1j.R5), "", 0, YOUYANG_ICON, 2, downloadMusicUtil.hasDownload(getMusicName(2)) ? 1 : 0, false, 68, null);
        MusicItem musicItem4 = new MusicItem(ResourceExtKt.getString(j1j.Q5), "", 0, XIELI_ICON, 3, downloadMusicUtil.hasDownload(getMusicName(3)) ? 1 : 0, false, 68, null);
        MusicItem musicItem5 = new MusicItem(ResourceExtKt.getString(j1j.P5), "", 0, XIANGSHANG_ICON, 4, downloadMusicUtil.hasDownload(getMusicName(4)) ? 1 : 0, false, 68, null);
        MusicItem musicItem6 = new MusicItem(ResourceExtKt.getString(j1j.O5), "", 0, SUIYI_ICON, 5, downloadMusicUtil.hasDownload(getMusicName(5)) ? 1 : 0, false, 68, null);
        MusicItem musicItem7 = new MusicItem(ResourceExtKt.getString(j1j.N5), "", 0, REWU_ICON, 6, downloadMusicUtil.hasDownload(getMusicName(6)) ? 1 : 0, false, 68, null);
        MusicItem musicItem8 = new MusicItem(ResourceExtKt.getString(j1j.L5), "", 0, LVDONG_ICON, 7, downloadMusicUtil.hasDownload(getMusicName(7)) ? 1 : 0, false, 68, null);
        MusicItem musicItem9 = new MusicItem(ResourceExtKt.getString(j1j.K5), "", 0, DIANZI_ICON, 8, downloadMusicUtil.hasDownload(getMusicName(8)) ? 1 : 0, false, 68, null);
        MusicItem musicItem10 = new MusicItem(ResourceExtKt.getString(j1j.J5), "", 0, BUFA_ICON, 9, downloadMusicUtil.hasDownload(getMusicName(9)) ? 1 : 0, false, 68, null);
        arrayList.add(musicItem);
        arrayList.add(musicItem2);
        arrayList.add(musicItem3);
        arrayList.add(musicItem4);
        arrayList.add(musicItem5);
        arrayList.add(musicItem6);
        arrayList.add(musicItem7);
        arrayList.add(musicItem8);
        arrayList.add(musicItem9);
        arrayList.add(musicItem10);
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void defaultDownload$lambda$2(MusicStyleHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshMusitItemList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMusicName(int musicId) {
        switch (musicId) {
            case 1:
            default:
                return "yuedong.m4a";
            case 2:
                return "youyang.m4a";
            case 3:
                return "xieli.m4a";
            case 4:
                return "xiangshang.m4a";
            case 5:
                return "suiyi.m4a";
            case 6:
                return "rewu.m4a";
            case 7:
                return "lvdong.m4a";
            case 8:
                return "dianzi.m4a";
            case 9:
                return "bufa.m4a";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMusicUri(int musicId) {
        switch (musicId) {
            case 1:
            default:
                return YUEDONG;
            case 2:
                return YOUYANG;
            case 3:
                return XIELI;
            case 4:
                return XIANGSHANG;
            case 5:
                return SUIYI;
            case 6:
                return REWU;
            case 7:
                return LVDONG;
            case 8:
                return DIANZI;
            case 9:
                return BUFA;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$0(MusicStyleHolder this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ViewExtKt.gone(this$0.editPanel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<MusicItem> refreshMusitItemList() {
        MusicItem musicItem;
        MusicItem musicItem2;
        MusicItem musicItem3;
        MusicItem musicItem4;
        MusicItem musicItem5;
        MusicItem musicItem6;
        MusicItem musicItem7;
        MusicItem musicItem8;
        MusicItem musicItem9;
        List<MusicItem> list = this.buildStyleItemList;
        if (list != null && (musicItem9 = list.get(1)) != null) {
            musicItem9.setState(DownloadMusicUtil.INSTANCE.hasDownload(getMusicName(1)) ? 1 : 0);
        }
        List<MusicItem> list2 = this.buildStyleItemList;
        if (list2 != null && (musicItem8 = list2.get(2)) != null) {
            musicItem8.setState(DownloadMusicUtil.INSTANCE.hasDownload(getMusicName(2)) ? 1 : 0);
        }
        List<MusicItem> list3 = this.buildStyleItemList;
        if (list3 != null && (musicItem7 = list3.get(3)) != null) {
            musicItem7.setState(DownloadMusicUtil.INSTANCE.hasDownload(getMusicName(3)) ? 1 : 0);
        }
        List<MusicItem> list4 = this.buildStyleItemList;
        if (list4 != null && (musicItem6 = list4.get(4)) != null) {
            musicItem6.setState(DownloadMusicUtil.INSTANCE.hasDownload(getMusicName(4)) ? 1 : 0);
        }
        List<MusicItem> list5 = this.buildStyleItemList;
        if (list5 != null && (musicItem5 = list5.get(5)) != null) {
            musicItem5.setState(DownloadMusicUtil.INSTANCE.hasDownload(getMusicName(5)) ? 1 : 0);
        }
        List<MusicItem> list6 = this.buildStyleItemList;
        if (list6 != null && (musicItem4 = list6.get(6)) != null) {
            musicItem4.setState(DownloadMusicUtil.INSTANCE.hasDownload(getMusicName(6)) ? 1 : 0);
        }
        List<MusicItem> list7 = this.buildStyleItemList;
        if (list7 != null && (musicItem3 = list7.get(7)) != null) {
            musicItem3.setState(DownloadMusicUtil.INSTANCE.hasDownload(getMusicName(7)) ? 1 : 0);
        }
        List<MusicItem> list8 = this.buildStyleItemList;
        if (list8 != null && (musicItem2 = list8.get(8)) != null) {
            musicItem2.setState(DownloadMusicUtil.INSTANCE.hasDownload(getMusicName(8)) ? 1 : 0);
        }
        List<MusicItem> list9 = this.buildStyleItemList;
        if (list9 != null && (musicItem = list9.get(9)) != null) {
            musicItem.setState(DownloadMusicUtil.INSTANCE.hasDownload(getMusicName(9)) ? 1 : 0);
        }
        return this.buildStyleItemList;
    }

    public final void defaultDownload() {
        List<MusicItem> listSubList;
        List<MusicItem> list = this.buildStyleItemList;
        if (list != null && (listSubList = list.subList(1, 4)) != null) {
            List<MusicItem> list2 = listSubList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (MusicItem musicItem : list2) {
                DownloadMusicUtil.INSTANCE.startDownload(getMusicUri(musicItem.getTypeId()), getMusicName(musicItem.getTypeId()), this.mReceiver, musicItem);
                arrayList.add(Unit.INSTANCE);
            }
        }
        this.titleTv.postDelayed(new Runnable() { // from class: jdg
            @Override // java.lang.Runnable
            public final void run() {
                MusicStyleHolder.defaultDownload$lambda$2(this.f22671a);
            }
        }, VibrateModeProgressBar.sLongToLong);
    }

    @NotNull
    public final AMap getAMap() {
        return this.aMap;
    }

    @Nullable
    public final List<MusicItem> getBuildStyleItemList() {
        return this.buildStyleItemList;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final String getSelectMusic() {
        return this.selectMusic;
    }

    public final int getSelectMusicId() {
        return this.selectMusicId;
    }

    @NotNull
    public final MutableLiveData<TraceStyleResModel> getTraceStyleResModeLiveData() {
        return this.traceStyleResModeLiveData;
    }

    public final void initAdapterOnClickCallback(@Nullable Function1<? super Integer, Unit> callback) {
        MusicStyleAdapter musicStyleAdapter = this.styleAdapter;
        if (musicStyleAdapter != null) {
            musicStyleAdapter.setOnItemClickListener(new MusicStyleAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.detail.video.share.holder.MusicStyleHolder.initAdapterOnClickCallback.1
                @Override // com.xiaomi.fitness.detail.video.share.adapter.MusicStyleAdapter.OnItemClickListener
                public void onItemClick(MusicItem styleItem) throws IOException {
                    String str;
                    Intrinsics.checkNotNullParameter(styleItem, "styleItem");
                    FitnessLogUtils.i("SwitchMapHolder", "musicId:" + styleItem.getTypeId() + ",selectMusic:" + MusicStyleHolder.this.getSelectMusic());
                    if (styleItem.getTypeId() == 0 || styleItem.getTypeId() != MusicStyleHolder.this.getSelectMusicId()) {
                        MusicStyleHolder.this.setSelectMusicId(styleItem.getTypeId());
                        MusicStyleHolder musicStyleHolder = MusicStyleHolder.this;
                        if (styleItem.getTypeId() == 0) {
                            str = "";
                        } else {
                            File externalFilesDir = AppUtil.getApp().getExternalFilesDir(DownloadMusicUtil.appUpgradeDirectory);
                            String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
                            str = absolutePath + File.separator + MusicStyleHolder.this.getMusicName(styleItem.getTypeId());
                        }
                        musicStyleHolder.setSelectMusic(str);
                        DownloadMusicUtil downloadMusicUtil = DownloadMusicUtil.INSTANCE;
                        if (!downloadMusicUtil.hasDownload(MusicStyleHolder.this.getMusicName(styleItem.getTypeId()))) {
                            downloadMusicUtil.startDownload(MusicStyleHolder.this.getMusicUri(styleItem.getTypeId()), MusicStyleHolder.this.getMusicName(styleItem.getTypeId()), MusicStyleHolder.this.mReceiver, styleItem);
                        } else if (MusicStyleHolder.this.getSelectMusic().length() == 0) {
                            SwitchMusicPanelHolder switchMusicPanelHolder = MusicStyleHolder.this.musicHolder;
                            if (switchMusicPanelHolder != null) {
                                switchMusicPanelHolder.stopMusic();
                            }
                        } else {
                            SwitchMusicPanelHolder switchMusicPanelHolder2 = MusicStyleHolder.this.musicHolder;
                            if (switchMusicPanelHolder2 != null) {
                                SwitchMusicPanelHolder.playMusic$default(switchMusicPanelHolder2, false, 0L, 2, null);
                            }
                        }
                        MusicStyleAdapter musicStyleAdapter2 = MusicStyleHolder.this.styleAdapter;
                        if (musicStyleAdapter2 != null) {
                            musicStyleAdapter2.notifyDataSetChanged();
                        }
                    }
                }
            });
        }
        this.traceStyleRecycler.setAdapter(this.styleAdapter);
    }

    public final void initHolder(@NotNull SwitchMusicPanelHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        int i = j1j.I5;
        this.musicHolder = holder;
        this.titleTv.setText(i);
        MusicStyleAdapter musicStyleAdapter = new MusicStyleAdapter();
        this.styleAdapter = musicStyleAdapter;
        musicStyleAdapter.setRecyclerView(this.traceStyleRecycler);
        List<MusicItem> listBuildStyleItemList = buildStyleItemList();
        this.buildStyleItemList = listBuildStyleItemList;
        MusicStyleAdapter musicStyleAdapter2 = this.styleAdapter;
        if (musicStyleAdapter2 != null) {
            musicStyleAdapter2.bindListData(listBuildStyleItemList);
        }
        ViewExtKt.clickWithTrigger$default(this.doneBtn, 0L, new Function1() { // from class: idg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MusicStyleHolder.initHolder$lambda$0(this.f21025a, (ImageView) obj);
            }
        }, 1, null);
    }

    public final void refreshMusicList() {
        MusicStyleAdapter musicStyleAdapter = this.styleAdapter;
        if (musicStyleAdapter != null) {
            musicStyleAdapter.bindListData(refreshMusitItemList());
        }
    }

    public final void reset() {
        DownloadMusicUtil.INSTANCE.getDownloadIdMap().clear();
    }

    public final void setBuildStyleItemList(@Nullable List<MusicItem> list) {
        this.buildStyleItemList = list;
    }

    public final void setSelectMusic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectMusic = str;
    }

    public final void setSelectMusicId(int i) {
        this.selectMusicId = i;
    }
}
