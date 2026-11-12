package com.xiaomi.fitness.share.amap.ext;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.animation.ScaleAnimation;
import com.amap.api.maps.utils.overlay.MovingPointOverlay;
import com.mi.health.utils.MapUtilsKt;
import com.miui.tsmclient.util.ServiceUtils;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.commonbase.data.sportmodel.util.MarkerParamsUtilKt;
import com.xiaomi.fitness.detail.video.share.holder.EditDetailPanelHolder;
import com.xiaomi.fitness.detail.video.share.model.MomentsModel;
import com.xiaomi.fitness.detail.video.share.model.SportTracePointDataModel;
import com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel;
import com.xiaomi.fitness.electronic.scale.widget.banner.EcoBanner;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity;
import com.xiaomi.fitness.share.amap.data.ImgTextBean;
import com.xiaomi.fitness.share.amap.data.ImgTextData;
import com.xiaomi.fitness.share.amap.ext.SharePathViewAmapActivityExtKt;
import com.xiaomi.fitness.share.amap.moments.MomentData;
import com.xiaomi.fitness.share.amap.utils.ChangeItem;
import com.xiaomi.fitness.share.amap.utils.MaxHeightMarker;
import com.xiaomi.fitness.share.amap.utils.MaxPaceMarker;
import com.xiaomi.fitness.share.amap.utils.MaxRateMarker;
import com.xiaomi.fitness.share.amap.utils.MaxSpeedMarker;
import com.xiaomi.fitness.share.amap.utils.WonderfulMomentsHelperKt;
import com.xiaomi.fitness.share.view.DataTitleShareVideo;
import com.xiaomi.fitness.util.AMapPathUtils;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.bhl;
import defpackage.bsi;
import defpackage.byi;
import defpackage.hoi;
import defpackage.i5f;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.xr5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u000b\u0010\n\u001a!\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0017\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001d\u001a\u00020\u0005*\u00020\u00002\"\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0\u0019j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a`\u001b¢\u0006\u0004\b\u001d\u0010\u001e\u001a5\u0010\u001f\u001a\u00020\u0005*\u00020\u00002\"\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0\u0019j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a`\u001b¢\u0006\u0004\b\u001f\u0010\u001e\u001a5\u0010 \u001a\u00020\u0005*\u00020\u00002\"\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0\u0019j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a`\u001b¢\u0006\u0004\b \u0010\u001e\u001a5\u0010!\u001a\u00020\u0005*\u00020\u00002\"\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0\u0019j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a`\u001b¢\u0006\u0004\b!\u0010\u001e\u001a\u0011\u0010\"\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001e\u0010$\u001a\u00020\u0005*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b$\u0010\n\u001a(\u0010(\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b(\u0010)\u001a\u001e\u0010*\u001a\u00020\u0005*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b*\u0010\n\u001a\u001e\u0010+\u001a\u00020\u0005*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b+\u0010\n\u001a\u001e\u0010,\u001a\u00020\u0005*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b,\u0010\n\u001a\u001b\u0010-\u001a\u00020\u0005*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b-\u0010.\u001a)\u00101\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u00100\u001a\b\u0012\u0004\u0012\u00020\f0/¢\u0006\u0004\b1\u00102\u001a\u001c\u00103\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b3\u00104\u001a\u0011\u00105\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b5\u0010#\u001a\u0011\u00106\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b6\u0010#\u001a\u0011\u00107\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b7\u0010#\u001a\u0011\u00109\u001a\u000208*\u00020\u0000¢\u0006\u0004\b9\u0010:\u001a\u0011\u0010;\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b;\u0010<\"\u0014\u0010>\u001a\u00020=8\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010?\"\u0014\u0010@\u001a\u00020&8\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010A\"\u0014\u0010B\u001a\u00020&8\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010A\"\"\u0010C\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bC\u0010E\"\u0004\bF\u0010G\"\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J\"*\u0010N\u001a\u0016\u0012\u0004\u0012\u00020L\u0018\u00010Kj\n\u0012\u0004\u0012\u00020L\u0018\u0001`M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010O\"\u0016\u0010P\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010Q\"\u0018\u0010R\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010S\"\u0018\u0010T\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010J\"\"\u0010U\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010D\u001a\u0004\bV\u0010E\"\u0004\bW\u0010G\"\u001b\u0010Y\u001a\u0006\u0012\u0002\b\u00030X8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0015\u0010`\u001a\u00020]*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006a"}, d2 = {"Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "location", "", "realIndex", "", "showMarker", "(Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;Lcom/xiaomi/fit/data/common/data/sport/Location;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "latLng", "showChangeItemB", "(Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;Lcom/xiaomi/fit/data/common/data/sport/Location;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showChangeItemA", "", "rato", "Lcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;", "traceStyleResModel", "drawLinesWithProgressBar", "(Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;FLcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;)V", "Lcom/xiaomi/fitness/detail/video/share/model/SportTracePointDataModel;", "data", BroadcastsKt.SILENT_PUSHING_PROGRESS, "addPicMarker", "(Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;Lcom/xiaomi/fitness/detail/video/share/model/SportTracePointDataModel;Ljava/lang/Float;)V", "setEditBasicTrace", "(Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;Lcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;)V", "Ljava/util/HashMap;", "Lcom/xiaomi/fitness/detail/video/share/model/MomentsModel;", "Lkotlin/collections/HashMap;", "map", "editRate", "(Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;Ljava/util/HashMap;)V", "editPace", "editSpeed", "editHeight", "editImgTextMarker", "(Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;)V", "showMaxRateMarker", "countDuration", "", "delayDuration", "blockTrace", "(Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showMaxPaceMarker", "showMaxSpeedMarker", "showMaxHeightMarker", "showKiloPoint", "(Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;Lcom/xiaomi/fit/data/common/data/sport/Location;)V", "Landroidx/lifecycle/MutableLiveData;", ServiceUtils.EXTRA_PROCESS, "removeImgItextMarker", "(Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;Lcom/xiaomi/fitness/detail/video/share/model/SportTracePointDataModel;Landroidx/lifecycle/MutableLiveData;)V", "showImgTextMarker", "(Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "backChangeTilt", "backStartBounds", "endTrace", "", "isHasEdit", "(Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;)Z", "calculateImgTextDuration", "(Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;)I", "", "TAG", "Ljava/lang/String;", "hideDelayDuration", "J", "traceDelayDuration", "isBlockTrack", "Z", "()Z", "setBlockTrack", "(Z)V", "Lcom/amap/api/maps/model/Polyline;", "basePolyline", "Lcom/amap/api/maps/model/Polyline;", "Ljava/util/ArrayList;", "Lcom/amap/api/maps/model/LatLng;", "Lkotlin/collections/ArrayList;", "locationList", "Ljava/util/ArrayList;", "curProgressBarLocationIndex", "I", "curImgTextLocation", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "editPolyline", "maxPaceInFirst", "getMaxPaceInFirst", "setMaxPaceInFirst", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "loadingDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getLoadingDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lbhl$e;", "getOnSaveVideoListener", "(Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;)Lbhl$e;", "onSaveVideoListener", "sport-record_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSharePathViewAmapActivityExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharePathViewAmapActivityExt.kt\ncom/xiaomi/fitness/share/amap/ext/SharePathViewAmapActivityExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,994:1\n1863#2,2:995\n1863#2,2:997\n1557#2:999\n1628#2,3:1000\n*S KotlinDebug\n*F\n+ 1 SharePathViewAmapActivityExt.kt\ncom/xiaomi/fitness/share/amap/ext/SharePathViewAmapActivityExtKt\n*L\n471#1:995,2\n974#1:997,2\n399#1:999\n399#1:1000,3\n*E\n"})
public final class SharePathViewAmapActivityExtKt {

    @NotNull
    public static final String TAG = "SharePathVideoAmapActivityExt";

    @Nullable
    private static Polyline basePolyline = null;

    @Nullable
    private static Location curImgTextLocation = null;
    private static int curProgressBarLocationIndex = 0;

    @Nullable
    private static Polyline editPolyline = null;
    public static final long hideDelayDuration = 1600;
    private static boolean isBlockTrack = false;

    @NotNull
    private static final CommonDialog<?> loadingDialog;

    @Nullable
    private static ArrayList<LatLng> locationList = null;
    private static boolean maxPaceInFirst = true;
    public static final long traceDelayDuration = 700;

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.amap.ext.SharePathViewAmapActivityExtKt$blockTrace$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.share.amap.ext.SharePathViewAmapActivityExtKt", f = "SharePathViewAmapActivityExt.kt", i = {}, l = {551}, m = "blockTrace", n = {}, s = {})
    public static final class C29311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29311(Continuation<? super C29311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharePathViewAmapActivityExtKt.blockTrace(null, 0, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.amap.ext.SharePathViewAmapActivityExtKt$endTrace$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/xiaomi/fitness/share/amap/ext/SharePathViewAmapActivityExtKt$endTrace$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C29321 extends AnimatorListenerAdapter {
        final /* synthetic */ bhl $screenRecorderAMapManager;
        final /* synthetic */ SharePathVideoAmapActivity $this_endTrace;

        public C29321(bhl bhlVar, SharePathVideoAmapActivity sharePathVideoAmapActivity) {
            this.$screenRecorderAMapManager = bhlVar;
            this.$this_endTrace = sharePathVideoAmapActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onAnimationEnd$lambda$0(SharePathVideoAmapActivity this_endTrace) {
            Intrinsics.checkNotNullParameter(this_endTrace, "$this_endTrace");
            DataTitleShareVideo titleBarShareVideo = this_endTrace.getBinding().P;
            Intrinsics.checkNotNullExpressionValue(titleBarShareVideo, "titleBarShareVideo");
            ViewExtKt.visible(titleBarShareVideo);
            this_endTrace.getBinding().G.setVisibility(0);
            this_endTrace.getBinding().L.showEditLayout();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            Logger.d("sportTrackDataView", "onAnimationEnd running");
            this.$screenRecorderAMapManager.H();
            View root = this.$this_endTrace.getBinding().getRoot();
            final SharePathVideoAmapActivity sharePathVideoAmapActivity = this.$this_endTrace;
            root.postDelayed(new Runnable() { // from class: h7m
                @Override // java.lang.Runnable
                public final void run() {
                    SharePathViewAmapActivityExtKt.C29321.onAnimationEnd$lambda$0(sharePathVideoAmapActivity);
                }
            }, this.$screenRecorderAMapManager.n ? EcoBanner.BANNER_CHANGE_TIME : 0L);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.amap.ext.SharePathViewAmapActivityExtKt$showImgTextMarker$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.share.amap.ext.SharePathViewAmapActivityExtKt", f = "SharePathViewAmapActivityExt.kt", i = {0, 0}, l = {841}, m = "showImgTextMarker", n = {"imgSize", "imgTextMarker"}, s = {"L$0", "L$1"})
    public static final class C29331 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C29331(Continuation<? super C29331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharePathViewAmapActivityExtKt.showImgTextMarker(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.amap.ext.SharePathViewAmapActivityExtKt$showMarker$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.share.amap.ext.SharePathViewAmapActivityExtKt", f = "SharePathViewAmapActivityExt.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12}, l = {52, 53, 57, 58, 65, 66, 67, 71, 72, 76, 77, 80, 85}, m = "showMarker", n = {"$this$showMarker", "location", "realIndex", "$this$showMarker", "location", "realIndex", "$this$showMarker", "location", "realIndex", "$this$showMarker", "location", "realIndex", "$this$showMarker", "location", "realIndex", "$this$showMarker", "location", "realIndex", "$this$showMarker", "location", "realIndex", "$this$showMarker", "location", "realIndex", "$this$showMarker", "location", "realIndex", "$this$showMarker", "location", "realIndex", "$this$showMarker", "location", "realIndex", "$this$showMarker", "location", "realIndex", "$this$showMarker", "location"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1"})
    public static final class C29341 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C29341(Continuation<? super C29341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharePathViewAmapActivityExtKt.showMarker(null, null, 0, this);
        }
    }

    static {
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("do_not_leave").setCustomLayoutId(ivi.j2).setCancelable(false).setCanceledOnTouchOutside(false).setCanceledOnBackPressed(false).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        loadingDialog = commonDialogCreate;
    }

    public static final void addPicMarker(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity, @Nullable SportTracePointDataModel sportTracePointDataModel, @Nullable Float f) {
        Location location;
        ArrayList<LatLng> arrayList;
        LatLng latLng;
        List<Uri> imgUriList;
        Intrinsics.checkNotNullParameter(sharePathVideoAmapActivity, "<this>");
        if (f != null) {
            ArrayList<LatLng> arrayList2 = locationList;
            if ((arrayList2 == null || arrayList2.isEmpty()) && (location = sharePathVideoAmapActivity.getVm().getDisLatLngMap().get(0)) != null && (arrayList = locationList) != null) {
                arrayList.add(AMapPathUtils.INSTANCE.createLatLng(location));
            }
            ArrayList<LatLng> arrayList3 = locationList;
            if (arrayList3 == null || (latLng = (LatLng) CollectionsKt___CollectionsKt.last((List) arrayList3)) == null) {
                return;
            }
            int i = (sportTracePointDataModel == null || (imgUriList = sportTracePointDataModel.getImgUriList()) == null || !(imgUriList.isEmpty() ^ true)) ? hoi.s1 : hoi.y;
            ImgTextData imgTextData = ImgTextData.INSTANCE;
            ImgTextBean imgTextBean = imgTextData.getImgTextBean(f.floatValue());
            Location location2 = sharePathVideoAmapActivity.getVm().getDisLatLngMap().get(Integer.valueOf(curProgressBarLocationIndex));
            Intrinsics.checkNotNull(location2);
            ImgTextBean imgTextBean2 = new ImgTextBean(location2, f.floatValue(), sportTracePointDataModel != null ? sportTracePointDataModel.getFeelings() : null, sportTracePointDataModel != null ? sportTracePointDataModel.getImgUriList() : null, true, i, null, curProgressBarLocationIndex);
            if (imgTextBean == null) {
                AMap aMap = sharePathVideoAmapActivity.getAMap();
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(sharePathVideoAmapActivity.getResources(), i);
                Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
                imgTextBean2.setMarker(MapPathExtKt.addCusMarker(aMap, latLng, bitmapDecodeResource, false));
                imgTextData.add(imgTextBean2);
                return;
            }
            imgTextBean.setBgResource(i);
            Marker marker = imgTextBean.getMarker();
            if (marker != null) {
                marker.remove();
            }
            imgTextBean.setMarker(null);
            imgTextBean.setFeelings(sportTracePointDataModel != null ? sportTracePointDataModel.getFeelings() : null);
            imgTextBean.setImgUriList(sportTracePointDataModel != null ? sportTracePointDataModel.getImgUriList() : null);
            AMap aMap2 = sharePathVideoAmapActivity.getAMap();
            Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(sharePathVideoAmapActivity.getResources(), i);
            Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource2, "decodeResource(...)");
            imgTextBean.setMarker(MapPathExtKt.addCusMarker(aMap2, latLng, bitmapDecodeResource2, false));
        }
    }

    public static final void backChangeTilt(@NotNull final SharePathVideoAmapActivity sharePathVideoAmapActivity) {
        Intrinsics.checkNotNullParameter(sharePathVideoAmapActivity, "<this>");
        sharePathVideoAmapActivity.getAMap().animateCamera(CameraUpdateFactory.changeTilt(0.0f), 1000L, new AMap.CancelableCallback() { // from class: com.xiaomi.fitness.share.amap.ext.SharePathViewAmapActivityExtKt.backChangeTilt.1
            @Override // com.amap.api.maps.AMap.CancelableCallback
            public void onCancel() {
            }

            @Override // com.amap.api.maps.AMap.CancelableCallback
            public void onFinish() {
                SharePathViewAmapActivityExtKt.backStartBounds(sharePathVideoAmapActivity);
            }
        });
    }

    public static final void backStartBounds(@NotNull final SharePathVideoAmapActivity sharePathVideoAmapActivity) {
        Intrinsics.checkNotNullParameter(sharePathVideoAmapActivity, "<this>");
        LatLngBounds.Builder builder = LatLngBounds.builder();
        ArrayList<LatLng> mOriginalList = sharePathVideoAmapActivity.getVm().getMOriginalList();
        int size = mOriginalList.size();
        for (int i = 0; i < size; i++) {
            builder.include(mOriginalList.get(i));
        }
        sharePathVideoAmapActivity.getAMap().animateCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), 150), 500L, new AMap.CancelableCallback() { // from class: com.xiaomi.fitness.share.amap.ext.SharePathViewAmapActivityExtKt.backStartBounds.1
            @Override // com.amap.api.maps.AMap.CancelableCallback
            public void onCancel() {
                Logger.d(SharePathVideoAmapActivity.TAG, "onCancel");
            }

            @Override // com.amap.api.maps.AMap.CancelableCallback
            public void onFinish() {
                Logger.d(SharePathVideoAmapActivity.TAG, "onfinish");
                SharePathViewAmapActivityExtKt.endTrace(sharePathVideoAmapActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object blockTrace(SharePathVideoAmapActivity sharePathVideoAmapActivity, int i, long j, Continuation<? super Unit> continuation) {
        C29311 c29311;
        if (continuation instanceof C29311) {
            c29311 = (C29311) continuation;
            int i2 = c29311.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29311.label = i2 - Integer.MIN_VALUE;
            } else {
                c29311 = new C29311(continuation);
            }
        } else {
            c29311 = new C29311(continuation);
        }
        Object obj = c29311.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c29311.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            isBlockTrack = false;
            long j2 = ((long) 2) * j * ((long) i);
            Logger.d(TAG, "isBlockTrack:false , pauseTime:" + j2);
            sharePathVideoAmapActivity.getBinding().L.pauseSport(j2);
            sharePathVideoAmapActivity.getDistanceChangeAnimator().pause();
            c29311.label = 1;
            if (DelayKt.delay(j2, c29311) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        isBlockTrack = true;
        Logger.d(TAG, "isBlockTrack:true");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object blockTrace$default(SharePathVideoAmapActivity sharePathVideoAmapActivity, int i, long j, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if ((i2 & 2) != 0) {
            j = 700;
        }
        return blockTrace(sharePathVideoAmapActivity, i, j, continuation);
    }

    public static final int calculateImgTextDuration(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity) {
        Intrinsics.checkNotNullParameter(sharePathVideoAmapActivity, "<this>");
        Iterator<T> it = ImgTextData.INSTANCE.getImgTextList().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            List<Uri> imgUriList = ((ImgTextBean) it.next()).getImgUriList();
            Integer numValueOf = imgUriList != null ? Integer.valueOf(imgUriList.size()) : null;
            iIntValue = numValueOf != null ? iIntValue + (numValueOf.intValue() * 1000) : iIntValue + 2000;
        }
        return iIntValue;
    }

    public static final void drawLinesWithProgressBar(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity, float f, @NotNull TraceStyleResModel traceStyleResModel) {
        Intrinsics.checkNotNullParameter(sharePathVideoAmapActivity, "<this>");
        Intrinsics.checkNotNullParameter(traceStyleResModel, "traceStyleResModel");
        if (sharePathVideoAmapActivity.getVm().getMUniformOriginalColorList().isEmpty()) {
            return;
        }
        int locationDis = (int) (sharePathVideoAmapActivity.getVm().getLocationDis() * f);
        Polyline polyline = editPolyline;
        if (polyline != null) {
            polyline.remove();
        }
        ArrayList arrayList = new ArrayList();
        locationList = new ArrayList<>();
        int locationDis2 = sharePathVideoAmapActivity.getVm().getLocationDis() / sharePathVideoAmapActivity.getVm().getMUniformOriginalColorList().size();
        if (locationDis >= 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i >= i2) {
                    Location location = sharePathVideoAmapActivity.getVm().getDisLatLngMap().get(Integer.valueOf(i));
                    if (location != null) {
                        curProgressBarLocationIndex = i;
                        ArrayList<LatLng> arrayList2 = locationList;
                        if (arrayList2 != null) {
                            arrayList2.add(AMapPathUtils.INSTANCE.createLatLng(location));
                        }
                    }
                    if (i3 < sharePathVideoAmapActivity.getVm().getMUniformOriginalColorList().size() - 1) {
                        i3++;
                    }
                    ListExtKt.add(arrayList, sharePathVideoAmapActivity.getVm().getMUniformOriginalColorList().get(i3));
                    i2 = i + locationDis2;
                }
                if (i == locationDis) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (traceStyleResModel.getIsDefault()) {
            AMap aMap = sharePathVideoAmapActivity.getAMap();
            ArrayList<LatLng> arrayList3 = locationList;
            Intrinsics.checkNotNull(arrayList3);
            editPolyline = MapPathExtKt.addPolyColorLine(aMap, arrayList3, arrayList);
            Polyline polyline2 = basePolyline;
            if (polyline2 != null) {
                polyline2.remove();
            }
            AMap aMap2 = sharePathVideoAmapActivity.getAMap();
            ArrayList<LatLng> arrayList4 = locationList;
            Intrinsics.checkNotNull(arrayList4);
            basePolyline = MapPathExtKt.addPolyColorLine(aMap2, arrayList4, arrayList);
            return;
        }
        int color = sharePathVideoAmapActivity.getApplication().getResources().getColor(traceStyleResModel.getTraceColor());
        AMap aMap3 = sharePathVideoAmapActivity.getAMap();
        ArrayList<LatLng> arrayList5 = locationList;
        Intrinsics.checkNotNull(arrayList5);
        editPolyline = MapPathExtKt.addPolylines(aMap3, arrayList5, color);
        Polyline polyline3 = basePolyline;
        if (polyline3 != null) {
            polyline3.remove();
        }
        AMap aMap4 = sharePathVideoAmapActivity.getAMap();
        ArrayList<LatLng> arrayList6 = locationList;
        Intrinsics.checkNotNull(arrayList6);
        basePolyline = MapPathExtKt.addPolylines(aMap4, arrayList6, color);
    }

    public static final void editHeight(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity, @NotNull HashMap<Float, MomentsModel> map) {
        MaxHeightMarker maxHeightMarker;
        LatLng maxHeightMarkerPosition;
        Intrinsics.checkNotNullParameter(sharePathVideoAmapActivity, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        MaxHeightMarker maxHeightMarker2 = sharePathVideoAmapActivity.getVm().getMaxHeightMarker();
        if ((maxHeightMarker2 != null && maxHeightMarker2.getMaxHeight() == 0) || (maxHeightMarker = sharePathVideoAmapActivity.getVm().getMaxHeightMarker()) == null || (maxHeightMarkerPosition = maxHeightMarker.getMaxHeightMarkerPosition()) == null) {
            return;
        }
        AMap aMap = sharePathVideoAmapActivity.getAMap();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(sharePathVideoAmapActivity.getResources(), hoi.o1);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
        MapPathExtKt.addCusMarker$default(aMap, maxHeightMarkerPosition, bitmapDecodeResource, false, 4, null);
        MaxHeightMarker maxHeightMarker3 = sharePathVideoAmapActivity.getVm().getMaxHeightMarker();
        Float maxHeightMarkerDisRatio = maxHeightMarker3 != null ? maxHeightMarker3.getMaxHeightMarkerDisRatio() : null;
        Intrinsics.checkNotNull(maxHeightMarkerDisRatio);
        map.put(Float.valueOf(maxHeightMarkerDisRatio.floatValue() * 100), new MomentsModel(1, 0.0f));
    }

    public static final void editImgTextMarker(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity) {
        Intrinsics.checkNotNullParameter(sharePathVideoAmapActivity, "<this>");
        for (ImgTextBean imgTextBean : ImgTextData.INSTANCE.getImgTextList()) {
            MarkerOptions markerOptionsIcon = new MarkerOptions().position(AMapPathUtils.INSTANCE.createLatLng(imgTextBean.getLatlng())).icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(sharePathVideoAmapActivity.getResources(), imgTextBean.getBgResource())));
            AMap aMap = sharePathVideoAmapActivity.getAMap();
            Intrinsics.checkNotNull(markerOptionsIcon);
            MapUtilsKt.addMarkerWithZIndex(aMap, markerOptionsIcon);
        }
    }

    public static final void editPace(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity, @NotNull HashMap<Float, MomentsModel> map) {
        MaxPaceMarker maxPaceMarker;
        LatLng maxPaceMarkerPosition;
        Intrinsics.checkNotNullParameter(sharePathVideoAmapActivity, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        MaxPaceMarker maxPaceMarker2 = sharePathVideoAmapActivity.getVm().getMaxPaceMarker();
        if ((maxPaceMarker2 != null && maxPaceMarker2.getMaxPace() == 0) || (maxPaceMarker = sharePathVideoAmapActivity.getVm().getMaxPaceMarker()) == null || (maxPaceMarkerPosition = maxPaceMarker.getMaxPaceMarkerPosition()) == null) {
            return;
        }
        AMap aMap = sharePathVideoAmapActivity.getAMap();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(sharePathVideoAmapActivity.getResources(), hoi.q1);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
        MapPathExtKt.addCusMarker$default(aMap, maxPaceMarkerPosition, bitmapDecodeResource, false, 4, null);
        MaxPaceMarker maxPaceMarker3 = sharePathVideoAmapActivity.getVm().getMaxPaceMarker();
        Float maxPaceMarkerDisRatio = maxPaceMarker3 != null ? maxPaceMarker3.getMaxPaceMarkerDisRatio() : null;
        Intrinsics.checkNotNull(maxPaceMarkerDisRatio);
        map.put(Float.valueOf(maxPaceMarkerDisRatio.floatValue() * 100), new MomentsModel(2, 0.0f));
    }

    public static final void editRate(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity, @NotNull HashMap<Float, MomentsModel> map) {
        MaxRateMarker maxRateMarker;
        LatLng maxRateMarkerPosition;
        Intrinsics.checkNotNullParameter(sharePathVideoAmapActivity, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        MaxRateMarker maxRateMarker2 = sharePathVideoAmapActivity.getVm().getMaxRateMarker();
        if ((maxRateMarker2 != null && maxRateMarker2.getMaxRate() == 0) || (maxRateMarker = sharePathVideoAmapActivity.getVm().getMaxRateMarker()) == null || (maxRateMarkerPosition = maxRateMarker.getMaxRateMarkerPosition()) == null) {
            return;
        }
        AMap aMap = sharePathVideoAmapActivity.getAMap();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(sharePathVideoAmapActivity.getResources(), hoi.p1);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
        MapPathExtKt.addCusMarker$default(aMap, maxRateMarkerPosition, bitmapDecodeResource, false, 4, null);
        MaxRateMarker maxRateMarker3 = sharePathVideoAmapActivity.getVm().getMaxRateMarker();
        Float maxRateMarkerRatioByDis = maxRateMarker3 != null ? maxRateMarker3.getMaxRateMarkerRatioByDis() : null;
        Intrinsics.checkNotNull(maxRateMarkerRatioByDis);
        map.put(Float.valueOf(maxRateMarkerRatioByDis.floatValue() * 100), new MomentsModel(0, 0.0f));
    }

    public static final void editSpeed(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity, @NotNull HashMap<Float, MomentsModel> map) {
        MaxSpeedMarker maxSpeedMarker;
        LatLng maxSpeedMarkerPosition;
        Intrinsics.checkNotNullParameter(sharePathVideoAmapActivity, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        MaxSpeedMarker maxSpeedMarker2 = sharePathVideoAmapActivity.getVm().getMaxSpeedMarker();
        if (Intrinsics.areEqual(maxSpeedMarker2 != null ? Float.valueOf(maxSpeedMarker2.getMaxSpeed()) : null, 0.0f) || (maxSpeedMarker = sharePathVideoAmapActivity.getVm().getMaxSpeedMarker()) == null || (maxSpeedMarkerPosition = maxSpeedMarker.getMaxSpeedMarkerPosition()) == null) {
            return;
        }
        AMap aMap = sharePathVideoAmapActivity.getAMap();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(sharePathVideoAmapActivity.getResources(), hoi.q1);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
        MapPathExtKt.addCusMarker$default(aMap, maxSpeedMarkerPosition, bitmapDecodeResource, false, 4, null);
        MaxSpeedMarker maxSpeedMarker3 = sharePathVideoAmapActivity.getVm().getMaxSpeedMarker();
        Float maxSpeedMarkerDisRatio = maxSpeedMarker3 != null ? maxSpeedMarker3.getMaxSpeedMarkerDisRatio() : null;
        Intrinsics.checkNotNull(maxSpeedMarkerDisRatio);
        map.put(Float.valueOf(maxSpeedMarkerDisRatio.floatValue() * 100), new MomentsModel(2, 0.0f));
    }

    public static final void endTrace(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity) {
        Intrinsics.checkNotNullParameter(sharePathVideoAmapActivity, "<this>");
        Intrinsics.checkNotNullExpressionValue(new CommonDialog.c("do_not_leave").setCustomLayoutId(ivi.j2).setCancelable(false).setCanceledOnTouchOutside(false).setCanceledOnBackPressed(false).create(), "create(...)");
        bhl bhlVarQ = bhl.q(sharePathVideoAmapActivity);
        bhlVarQ.setOnSaveVideoListener(getOnSaveVideoListener(sharePathVideoAmapActivity));
        sharePathVideoAmapActivity.getBinding().L.translateInt(new C29321(bhlVarQ, sharePathVideoAmapActivity));
        sharePathVideoAmapActivity.reset();
        isBlockTrack = false;
    }

    @NotNull
    public static final CommonDialog<?> getLoadingDialog() {
        return loadingDialog;
    }

    public static final boolean getMaxPaceInFirst() {
        return maxPaceInFirst;
    }

    @NotNull
    public static final bhl.e getOnSaveVideoListener(@NotNull final SharePathVideoAmapActivity sharePathVideoAmapActivity) {
        Intrinsics.checkNotNullParameter(sharePathVideoAmapActivity, "<this>");
        return new bhl.e() { // from class: com.xiaomi.fitness.share.amap.ext.SharePathViewAmapActivityExtKt$onSaveVideoListener$1
            @Override // bhl.e
            public void onStartSavingVideo() {
                SharePathViewAmapActivityExtKt.getLoadingDialog().showIfNeed(sharePathVideoAmapActivity.getSupportFragmentManager());
            }

            @Override // bhl.e
            public void onStopSavingVideo(boolean savedSuccessfully) {
                if (sharePathVideoAmapActivity.getIsPlaying()) {
                    return;
                }
                if (SharePathViewAmapActivityExtKt.getLoadingDialog().isShowing()) {
                    SharePathViewAmapActivityExtKt.getLoadingDialog().dismiss();
                }
                if (savedSuccessfully) {
                    sharePathVideoAmapActivity.getShareVideoHolder().showSportTraceShareFragment();
                }
            }

            @Override // bhl.e
            public void onVideoSaved(Uri uri) {
                sharePathVideoAmapActivity.getVm().getRecordedVideoUriLiveData().postValue(uri);
            }
        };
    }

    public static final boolean isBlockTrack() {
        return isBlockTrack;
    }

    public static final boolean isHasEdit(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity) {
        Intrinsics.checkNotNullParameter(sharePathVideoAmapActivity, "<this>");
        TraceStyleResModel value = sharePathVideoAmapActivity.getVm().getTraceStyleResModeLiveData().getValue();
        return ((value != null ? value.getIsDefault() : false) && ImgTextData.INSTANCE.getImgTextList().isEmpty() && !(sharePathVideoAmapActivity.getSwitchMusicPanelHolder().getTraceStyleHolder().getSelectMusic().length() > 0) && sharePathVideoAmapActivity.getSwitchMapPanelHolder().getIsDefaultMapStyle()) ? false : true;
    }

    public static final void removeImgItextMarker(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity, @Nullable SportTracePointDataModel sportTracePointDataModel, @NotNull MutableLiveData<Float> process) {
        Intrinsics.checkNotNullParameter(sharePathVideoAmapActivity, "<this>");
        Intrinsics.checkNotNullParameter(process, "process");
        ImgTextData.INSTANCE.remove(process);
    }

    public static final void setBlockTrack(boolean z) {
        isBlockTrack = z;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0076  */
    public static final void setEditBasicTrace(@NotNull final SharePathVideoAmapActivity sharePathVideoAmapActivity, @NotNull TraceStyleResModel traceStyleResModel) {
        Intrinsics.checkNotNullParameter(sharePathVideoAmapActivity, "<this>");
        Intrinsics.checkNotNullParameter(traceStyleResModel, "traceStyleResModel");
        sharePathVideoAmapActivity.getBinding().G.setVisibility(8);
        sharePathVideoAmapActivity.setShowEditDialog(true);
        sharePathVideoAmapActivity.getAMap().clear();
        MapPathExtKt.setPreTrace(sharePathVideoAmapActivity.getAMap(), sharePathVideoAmapActivity.getVm().getMOriginalList(), traceStyleResModel, sharePathVideoAmapActivity.getResources().getColor(traceStyleResModel.getTraceColor(), null));
        HashMap map = new HashMap();
        int sportDataType = sharePathVideoAmapActivity.getVm().getSportDataType();
        if (sportDataType == 20) {
            editRate(sharePathVideoAmapActivity, map);
            editHeight(sharePathVideoAmapActivity, map);
            editPace(sharePathVideoAmapActivity, map);
        } else if (sportDataType == 22 || sportDataType == 24) {
            editRate(sharePathVideoAmapActivity, map);
            editPace(sharePathVideoAmapActivity, map);
        } else if (sportDataType != 36) {
            switch (sportDataType) {
                case 26:
                    editRate(sharePathVideoAmapActivity, map);
                    editSpeed(sharePathVideoAmapActivity, map);
                    break;
                case 27:
                    editRate(sharePathVideoAmapActivity, map);
                    editHeight(sharePathVideoAmapActivity, map);
                    editPace(sharePathVideoAmapActivity, map);
                    break;
                case 28:
                    editRate(sharePathVideoAmapActivity, map);
                    editPace(sharePathVideoAmapActivity, map);
                    break;
            }
        } else {
            editRate(sharePathVideoAmapActivity, map);
        }
        editImgTextMarker(sharePathVideoAmapActivity);
        sharePathVideoAmapActivity.getEditDetailPanelHolder().addWonderfulMomentsToTimeline(map);
        sharePathVideoAmapActivity.getAMap().setOnMarkerClickListener(new AMap.OnMarkerClickListener() { // from class: f7m
            @Override // com.amap.api.maps.AMap.OnMarkerClickListener
            public final boolean onMarkerClick(Marker marker) {
                return SharePathViewAmapActivityExtKt.setEditBasicTrace$lambda$7(sharePathVideoAmapActivity, marker);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setEditBasicTrace$lambda$7(SharePathVideoAmapActivity this_setEditBasicTrace, Marker marker) {
        LatLng maxHeightMarkerPosition;
        LatLng maxHeightMarkerPosition2;
        LatLng maxRateMarkerPosition;
        LatLng maxRateMarkerPosition2;
        Intrinsics.checkNotNullParameter(this_setEditBasicTrace, "$this_setEditBasicTrace");
        double d = marker.getPosition().longitude;
        double d2 = marker.getPosition().latitude;
        MaxRateMarker maxRateMarker = this_setEditBasicTrace.getVm().getMaxRateMarker();
        if (Intrinsics.areEqual(d, (maxRateMarker == null || (maxRateMarkerPosition2 = maxRateMarker.getMaxRateMarkerPosition()) == null) ? null : Double.valueOf(maxRateMarkerPosition2.longitude))) {
            MaxRateMarker maxRateMarker2 = this_setEditBasicTrace.getVm().getMaxRateMarker();
            if (Intrinsics.areEqual(d2, (maxRateMarker2 == null || (maxRateMarkerPosition = maxRateMarker2.getMaxRateMarkerPosition()) == null) ? null : Double.valueOf(maxRateMarkerPosition.latitude))) {
                EditDetailPanelHolder editDetailPanelHolder = this_setEditBasicTrace.getEditDetailPanelHolder();
                MaxRateMarker maxRateMarker3 = this_setEditBasicTrace.getVm().getMaxRateMarker();
                Float maxRateMarkerRatioByDis = maxRateMarker3 != null ? maxRateMarker3.getMaxRateMarkerRatioByDis() : null;
                Intrinsics.checkNotNull(maxRateMarkerRatioByDis);
                editDetailPanelHolder.setTimelineScrollToProgressValue(maxRateMarkerRatioByDis.floatValue() * 100);
            }
        }
        MaxHeightMarker maxHeightMarker = this_setEditBasicTrace.getVm().getMaxHeightMarker();
        if (Intrinsics.areEqual(d, (maxHeightMarker == null || (maxHeightMarkerPosition2 = maxHeightMarker.getMaxHeightMarkerPosition()) == null) ? null : Double.valueOf(maxHeightMarkerPosition2.longitude))) {
            MaxHeightMarker maxHeightMarker2 = this_setEditBasicTrace.getVm().getMaxHeightMarker();
            if (Intrinsics.areEqual(d2, (maxHeightMarker2 == null || (maxHeightMarkerPosition = maxHeightMarker2.getMaxHeightMarkerPosition()) == null) ? null : Double.valueOf(maxHeightMarkerPosition.latitude))) {
                EditDetailPanelHolder editDetailPanelHolder2 = this_setEditBasicTrace.getEditDetailPanelHolder();
                MaxHeightMarker maxHeightMarker3 = this_setEditBasicTrace.getVm().getMaxHeightMarker();
                Float maxHeightMarkerDisRatio = maxHeightMarker3 != null ? maxHeightMarker3.getMaxHeightMarkerDisRatio() : null;
                Intrinsics.checkNotNull(maxHeightMarkerDisRatio);
                editDetailPanelHolder2.setTimelineScrollToProgressValue(maxHeightMarkerDisRatio.floatValue() * 100);
            }
        }
        List<ImgTextBean> imgTextList = ImgTextData.INSTANCE.getImgTextList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(imgTextList, 10));
        for (ImgTextBean imgTextBean : imgTextList) {
            LatLng latLngCreateLatLng = AMapPathUtils.INSTANCE.createLatLng(imgTextBean.getLatlng());
            if (d == latLngCreateLatLng.longitude && d2 == latLngCreateLatLng.latitude) {
                this_setEditBasicTrace.getEditDetailPanelHolder().setTimelineScrollToProgressValue(imgTextBean.getProgress());
            }
            arrayList.add(Unit.INSTANCE);
        }
        return true;
    }

    public static final void setMaxPaceInFirst(boolean z) {
        maxPaceInFirst = z;
    }

    @Nullable
    public static final Object showChangeItemA(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity, @Nullable Location location, @NotNull Continuation<? super Unit> continuation) {
        ChangeItem changeItemA;
        SportBasicReport openSwimmingReport;
        if (location != null && (changeItemA = sharePathVideoAmapActivity.getVm().getChangeItemA()) != null) {
            changeItemA.getStartTime();
            long j = location.timeStamp;
            ChangeItem changeItemA2 = sharePathVideoAmapActivity.getVm().getChangeItemA();
            Integer numBoxInt = null;
            Long lBoxLong = changeItemA2 != null ? Boxing.boxLong(changeItemA2.getStartTime()) : null;
            Intrinsics.checkNotNull(lBoxLong);
            if (j >= lBoxLong.longValue() && sharePathVideoAmapActivity.getIsShowChangeItemA()) {
                MovingPointOverlay moveMarker = sharePathVideoAmapActivity.getMoveMarker();
                if (moveMarker != null) {
                    moveMarker.stopMove();
                }
                sharePathVideoAmapActivity.setShowChangeItemA(false);
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(sharePathVideoAmapActivity.getResources(), hoi.s2);
                View viewInflate = LayoutInflater.from(sharePathVideoAmapActivity).inflate(ivi.V2, (ViewGroup) null);
                String string = sharePathVideoAmapActivity.getResources().getString(j1j.x9);
                SportBasicReport mBasicReport = sharePathVideoAmapActivity.getVm().getMBasicReport();
                Long lBoxLong2 = mBasicReport != null ? Boxing.boxLong(mBasicReport.getStartTime()) : null;
                Intrinsics.checkNotNull(lBoxLong2);
                long jLongValue = lBoxLong2.longValue();
                SportBasicReport mBasicReport2 = sharePathVideoAmapActivity.getVm().getMBasicReport();
                if (mBasicReport2 != null && (openSwimmingReport = mBasicReport2.getOpenSwimmingReport()) != null) {
                    numBoxInt = Boxing.boxInt(openSwimmingReport.getDuration());
                }
                Intrinsics.checkNotNull(numBoxInt);
                String str = string + TimeDateUtil.getDateHHmmssFormat(jLongValue + ((long) numBoxInt.intValue()));
                ((TextView) viewInflate.findViewById(bsi.k4)).setText(str);
                sharePathVideoAmapActivity.getBinding().E.showMoment(new MomentData(str, hoi.L, hoi.b0));
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.icon(BitmapDescriptorFactory.fromBitmap(bitmapDecodeResource)).position(AMapPathUtils.INSTANCE.createLatLng(location));
                Marker markerAddMarkerWithZIndex = MapUtilsKt.addMarkerWithZIndex(sharePathVideoAmapActivity.getAMap(), markerOptions);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f);
                scaleAnimation.setDuration(600L);
                scaleAnimation.setInterpolator(new LinearInterpolator());
                markerAddMarkerWithZIndex.setAnimation(scaleAnimation);
                markerAddMarkerWithZIndex.startAnimation();
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public static final Object showChangeItemB(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity, @Nullable Location location, @NotNull Continuation<? super Unit> continuation) {
        ChangeItem changeItemB;
        SportBasicReport outdoorRidingReport;
        SportBasicReport openSwimmingReport;
        if (location != null && (changeItemB = sharePathVideoAmapActivity.getVm().getChangeItemB()) != null) {
            changeItemB.getStartTime();
            long j = location.timeStamp;
            ChangeItem changeItemB2 = sharePathVideoAmapActivity.getVm().getChangeItemB();
            Integer numBoxInt = null;
            Long lBoxLong = changeItemB2 != null ? Boxing.boxLong(changeItemB2.getStartTime()) : null;
            Intrinsics.checkNotNull(lBoxLong);
            if (j >= lBoxLong.longValue() && sharePathVideoAmapActivity.getIsShowChangeItemB()) {
                MovingPointOverlay moveMarker = sharePathVideoAmapActivity.getMoveMarker();
                if (moveMarker != null) {
                    moveMarker.stopMove();
                }
                sharePathVideoAmapActivity.setShowChangeItemB(false);
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(sharePathVideoAmapActivity.getResources(), hoi.r2);
                View viewInflate = LayoutInflater.from(sharePathVideoAmapActivity).inflate(ivi.U2, (ViewGroup) null);
                String string = sharePathVideoAmapActivity.getResources().getString(j1j.y9);
                SportBasicReport mBasicReport = sharePathVideoAmapActivity.getVm().getMBasicReport();
                Long lBoxLong2 = mBasicReport != null ? Boxing.boxLong(mBasicReport.getStartTime()) : null;
                Intrinsics.checkNotNull(lBoxLong2);
                long jLongValue = lBoxLong2.longValue();
                SportBasicReport mBasicReport2 = sharePathVideoAmapActivity.getVm().getMBasicReport();
                Integer numBoxInt2 = (mBasicReport2 == null || (openSwimmingReport = mBasicReport2.getOpenSwimmingReport()) == null) ? null : Boxing.boxInt(openSwimmingReport.getDuration());
                Intrinsics.checkNotNull(numBoxInt2);
                long jIntValue = jLongValue + ((long) numBoxInt2.intValue());
                SportBasicReport mBasicReport3 = sharePathVideoAmapActivity.getVm().getMBasicReport();
                Integer changeItemADuration = mBasicReport3 != null ? mBasicReport3.getChangeItemADuration() : null;
                Intrinsics.checkNotNull(changeItemADuration);
                long jIntValue2 = jIntValue + ((long) changeItemADuration.intValue());
                SportBasicReport mBasicReport4 = sharePathVideoAmapActivity.getVm().getMBasicReport();
                if (mBasicReport4 != null && (outdoorRidingReport = mBasicReport4.getOutdoorRidingReport()) != null) {
                    numBoxInt = Boxing.boxInt(outdoorRidingReport.getDuration());
                }
                Intrinsics.checkNotNull(numBoxInt);
                String str = string + TimeDateUtil.getDateHHmmssFormat(jIntValue2 + ((long) numBoxInt.intValue()));
                ((TextView) viewInflate.findViewById(bsi.k4)).setText(str);
                sharePathVideoAmapActivity.getBinding().E.showMoment(new MomentData(str, hoi.K, hoi.b0));
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.icon(BitmapDescriptorFactory.fromBitmap(bitmapDecodeResource)).position(AMapPathUtils.INSTANCE.createLatLng(location));
                Marker markerAddMarkerWithZIndex = MapUtilsKt.addMarkerWithZIndex(sharePathVideoAmapActivity.getAMap(), markerOptions);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f);
                scaleAnimation.setDuration(600L);
                scaleAnimation.setInterpolator(new LinearInterpolator());
                markerAddMarkerWithZIndex.setAnimation(scaleAnimation);
                markerAddMarkerWithZIndex.startAnimation();
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public static final Object showImgTextMarker(@NotNull final SharePathVideoAmapActivity sharePathVideoAmapActivity, int i, @NotNull Continuation<? super Unit> continuation) {
        C29331 c29331;
        int iIntValue;
        Marker marker;
        Integer num;
        if (continuation instanceof C29331) {
            c29331 = (C29331) continuation;
            int i2 = c29331.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29331.label = i2 - Integer.MIN_VALUE;
            } else {
                c29331 = new C29331(continuation);
            }
        } else {
            c29331 = new C29331(continuation);
        }
        C29331 c29332 = c29331;
        Object obj = c29332.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c29332.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (sharePathVideoAmapActivity.getDistanceChangeAnimator().isRunning()) {
                int curImgTextBeanIndex = sharePathVideoAmapActivity.getCurImgTextBeanIndex();
                ImgTextData imgTextData = ImgTextData.INSTANCE;
                if (curImgTextBeanIndex < imgTextData.getImgTextList().size()) {
                    ImgTextBean imgTextBean = imgTextData.getImgTextList().get(sharePathVideoAmapActivity.getCurImgTextBeanIndex());
                    if (imgTextBean.isShowImgTextMarker() && i >= imgTextBean.getIndex()) {
                        Logger.d(TAG, "index:" + i + " , cur:" + imgTextBean.getLatlng());
                        imgTextBean.setShowImgTextMarker(false);
                        sharePathVideoAmapActivity.setCurImgTextBeanIndex(sharePathVideoAmapActivity.getCurImgTextBeanIndex() + 1);
                        MarkerOptions markerOptionsIcon = new MarkerOptions().position(AMapPathUtils.INSTANCE.createLatLng(imgTextBean.getLatlng())).icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(sharePathVideoAmapActivity.getResources(), imgTextBean.getBgResource())));
                        List<Uri> imgUriList = imgTextBean.getImgUriList();
                        Integer numBoxInt = imgUriList != null ? Boxing.boxInt(imgUriList.size()) : null;
                        if (numBoxInt != null) {
                            sharePathVideoAmapActivity.autoPlayPicCarousel(imgTextBean.getProgress());
                            iIntValue = numBoxInt.intValue();
                        } else {
                            final View viewInflate = LayoutInflater.from(sharePathVideoAmapActivity).inflate(ivi.W2, (ViewGroup) null);
                            ((TextView) viewInflate.findViewById(bsi.k4)).setText(imgTextBean.getFeelings());
                            Intrinsics.checkNotNull(viewInflate);
                            WonderfulMomentsHelperKt.showWonderfulAnimator(viewInflate, viewInflate.getWidth());
                            viewInflate.postDelayed(new Runnable() { // from class: g7m
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SharePathViewAmapActivityExtKt.showImgTextMarker$lambda$13(viewInflate);
                                }
                            }, hideDelayDuration);
                            sharePathVideoAmapActivity.getAMap().setInfoWindowAdapter(new AMap.InfoWindowAdapter() { // from class: com.xiaomi.fitness.share.amap.ext.SharePathViewAmapActivityExtKt.showImgTextMarker.3
                                @Override // com.amap.api.maps.AMap.InfoWindowAdapter
                                public View getInfoContents(Marker p0) {
                                    return null;
                                }

                                @Override // com.amap.api.maps.AMap.InfoWindowAdapter
                                public View getInfoWindow(Marker p0) {
                                    viewInflate.setBackground(sharePathVideoAmapActivity.getResources().getDrawable(hoi.i));
                                    View view = viewInflate;
                                    Intrinsics.checkNotNull(view);
                                    return view;
                                }
                            });
                            iIntValue = 2;
                        }
                        AMap aMap = sharePathVideoAmapActivity.getAMap();
                        Intrinsics.checkNotNull(markerOptionsIcon);
                        Marker markerAddMarkerWithZIndex = MapUtilsKt.addMarkerWithZIndex(aMap, markerOptionsIcon);
                        if (numBoxInt == null) {
                            markerAddMarkerWithZIndex.showInfoWindow();
                        }
                        c29332.L$0 = numBoxInt;
                        c29332.L$1 = markerAddMarkerWithZIndex;
                        c29332.label = 1;
                        if (blockTrace$default(sharePathVideoAmapActivity, iIntValue, 0L, c29332, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        marker = markerAddMarkerWithZIndex;
                        num = numBoxInt;
                    }
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        marker = (Marker) c29332.L$1;
        num = (Integer) c29332.L$0;
        ResultKt.throwOnFailure(obj);
        if (num == null) {
            marker.hideInfoWindow();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showImgTextMarker$lambda$13(View view) {
        Intrinsics.checkNotNull(view);
        WonderfulMomentsHelperKt.hideWonderfulAnimaotr(view, view.getWidth());
    }

    public static final void showKiloPoint(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity, @Nullable Location location) {
        Intrinsics.checkNotNullParameter(sharePathVideoAmapActivity, "<this>");
        if (location != null && sharePathVideoAmapActivity.getVm().getMKilometerList().size() - 1 >= sharePathVideoAmapActivity.getCurKilo()) {
            Location location2 = sharePathVideoAmapActivity.getVm().getMKilometerList().get(sharePathVideoAmapActivity.getCurKilo());
            Intrinsics.checkNotNullExpressionValue(location2, "get(...)");
            if (location.timeStamp >= location2.timeStamp) {
                MarkerParamsUtilKt markerParamsUtilKt = MarkerParamsUtilKt.INSTANCE;
                i5f i5fVarCreateShareVideoMarkerParams = markerParamsUtilKt.createShareVideoMarkerParams(sharePathVideoAmapActivity.getCurKilo() + 1);
                sharePathVideoAmapActivity.setCurKilo(sharePathVideoAmapActivity.getCurKilo() + 1);
                Intrinsics.checkNotNull(i5fVarCreateShareVideoMarkerParams);
                Bitmap bitmapCreateMarkerBitmap = markerParamsUtilKt.createMarkerBitmap(sharePathVideoAmapActivity, i5fVarCreateShareVideoMarkerParams);
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.icon(BitmapDescriptorFactory.fromBitmap(bitmapCreateMarkerBitmap)).position(AMapPathUtils.INSTANCE.createLatLng(location));
                Marker markerAddMarkerWithZIndex = MapUtilsKt.addMarkerWithZIndex(sharePathVideoAmapActivity.getAMap(), markerOptions);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f);
                scaleAnimation.setDuration(TimeUnit.SECONDS.toMillis(15L));
                scaleAnimation.setInterpolator(new LinearInterpolator());
                markerAddMarkerWithZIndex.setAnimation(scaleAnimation);
                markerAddMarkerWithZIndex.startAnimation();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x011d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0130 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0152 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x0172 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x0192 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0193  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x01b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x01eb  */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x01bf, please report this as an issue */
    @Nullable
    public static final Object showMarker(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity, @NotNull Location location, int i, @NotNull Continuation<? super Unit> continuation) {
        C29341 c29341;
        int i2;
        SharePathVideoAmapActivity sharePathVideoAmapActivity2;
        SharePathVideoAmapActivity sharePathVideoAmapActivity3;
        Location location2;
        boolean z;
        MovingPointOverlay moveMarker;
        if (continuation instanceof C29341) {
            c29341 = (C29341) continuation;
            int i3 = c29341.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c29341.label = i3 - Integer.MIN_VALUE;
            } else {
                c29341 = new C29341(continuation);
            }
        } else {
            c29341 = new C29341(continuation);
        }
        Object obj = c29341.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c29341.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                int sportDataType = sharePathVideoAmapActivity.getVm().getSportDataType();
                if (sportDataType != 20) {
                    if (sportDataType != 22) {
                        if (sportDataType != 24) {
                            if (sportDataType != 34) {
                                if (sportDataType != 36) {
                                    switch (sportDataType) {
                                        case 26:
                                            c29341.L$0 = sharePathVideoAmapActivity;
                                            c29341.L$1 = location;
                                            c29341.I$0 = i;
                                            c29341.label = 3;
                                            if (showMaxRateMarker(sharePathVideoAmapActivity, location, c29341) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            c29341.L$0 = sharePathVideoAmapActivity;
                                            c29341.L$1 = location;
                                            c29341.I$0 = i;
                                            c29341.label = 4;
                                            if (showMaxSpeedMarker(sharePathVideoAmapActivity, location, c29341) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                    }
                                } else {
                                    c29341.L$0 = sharePathVideoAmapActivity;
                                    c29341.L$1 = location;
                                    c29341.I$0 = i;
                                    c29341.label = 10;
                                    if (showMaxRateMarker(sharePathVideoAmapActivity, location, c29341) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    c29341.L$0 = sharePathVideoAmapActivity;
                                    c29341.L$1 = location;
                                    c29341.I$0 = i;
                                    c29341.label = 11;
                                    if (showChangeItemA(sharePathVideoAmapActivity, location, c29341) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    int i4 = i;
                                    sharePathVideoAmapActivity2 = sharePathVideoAmapActivity;
                                    i2 = i4;
                                    c29341.L$0 = sharePathVideoAmapActivity2;
                                    c29341.L$1 = location;
                                    c29341.I$0 = i2;
                                    c29341.label = 12;
                                    if (showChangeItemB(sharePathVideoAmapActivity2, location, c29341) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    SharePathVideoAmapActivity sharePathVideoAmapActivity4 = sharePathVideoAmapActivity2;
                                    i = i2;
                                    sharePathVideoAmapActivity = sharePathVideoAmapActivity4;
                                }
                            }
                            break;
                        } else {
                            c29341.L$0 = sharePathVideoAmapActivity;
                            c29341.L$1 = location;
                            c29341.I$0 = i;
                            c29341.label = 8;
                            if (showMaxRateMarker(sharePathVideoAmapActivity, location, c29341) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c29341.L$0 = sharePathVideoAmapActivity;
                            c29341.L$1 = location;
                            c29341.I$0 = i;
                            c29341.label = 9;
                            if (showMaxPaceMarker(sharePathVideoAmapActivity, location, c29341) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        c29341.L$0 = sharePathVideoAmapActivity;
                        c29341.L$1 = location;
                        c29341.label = 13;
                        if (showImgTextMarker(sharePathVideoAmapActivity, i, c29341) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Location location3 = location;
                        sharePathVideoAmapActivity3 = sharePathVideoAmapActivity;
                        location2 = location3;
                        showKiloPoint(sharePathVideoAmapActivity3, location2);
                        z = isBlockTrack;
                        if (z) {
                            Logger.d(TAG, "sport is running , isBlockTrack:" + z);
                            sharePathVideoAmapActivity3.getDistanceChangeAnimator().resume();
                            sharePathVideoAmapActivity3.getBinding().L.resumeSport();
                            moveMarker = sharePathVideoAmapActivity3.getMoveMarker();
                            if (moveMarker != null) {
                                moveMarker.startSmoothMove();
                            }
                            isBlockTrack = false;
                        }
                        return Unit.INSTANCE;
                    }
                    c29341.L$0 = sharePathVideoAmapActivity;
                    c29341.L$1 = location;
                    c29341.I$0 = i;
                    c29341.label = 1;
                    if (showMaxRateMarker(sharePathVideoAmapActivity, location, c29341) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c29341.L$0 = sharePathVideoAmapActivity;
                    c29341.L$1 = location;
                    c29341.I$0 = i;
                    c29341.label = 2;
                    if (showMaxPaceMarker(sharePathVideoAmapActivity, location, c29341) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c29341.L$0 = sharePathVideoAmapActivity;
                    c29341.L$1 = location;
                    c29341.label = 13;
                    if (showImgTextMarker(sharePathVideoAmapActivity, i, c29341) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Location location4 = location;
                    sharePathVideoAmapActivity3 = sharePathVideoAmapActivity;
                    location2 = location4;
                    showKiloPoint(sharePathVideoAmapActivity3, location2);
                    z = isBlockTrack;
                    if (z) {
                        Logger.d(TAG, "sport is running , isBlockTrack:" + z);
                        sharePathVideoAmapActivity3.getDistanceChangeAnimator().resume();
                        sharePathVideoAmapActivity3.getBinding().L.resumeSport();
                        moveMarker = sharePathVideoAmapActivity3.getMoveMarker();
                        if (moveMarker != null) {
                            moveMarker.startSmoothMove();
                        }
                        isBlockTrack = false;
                    }
                    return Unit.INSTANCE;
                }
                c29341.L$0 = sharePathVideoAmapActivity;
                c29341.L$1 = location;
                c29341.I$0 = i;
                c29341.label = 5;
                if (showMaxRateMarker(sharePathVideoAmapActivity, location, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c29341.L$0 = sharePathVideoAmapActivity;
                c29341.L$1 = location;
                c29341.I$0 = i;
                c29341.label = 6;
                if (showMaxHeightMarker(sharePathVideoAmapActivity, location, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i5 = i;
                sharePathVideoAmapActivity2 = sharePathVideoAmapActivity;
                i2 = i5;
                c29341.L$0 = sharePathVideoAmapActivity2;
                c29341.L$1 = location;
                c29341.I$0 = i2;
                c29341.label = 7;
                if (showMaxPaceMarker(sharePathVideoAmapActivity2, location, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                SharePathVideoAmapActivity sharePathVideoAmapActivity5 = sharePathVideoAmapActivity2;
                i = i2;
                sharePathVideoAmapActivity = sharePathVideoAmapActivity5;
                c29341.L$0 = sharePathVideoAmapActivity;
                c29341.L$1 = location;
                c29341.label = 13;
                if (showImgTextMarker(sharePathVideoAmapActivity, i, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Location location5 = location;
                sharePathVideoAmapActivity3 = sharePathVideoAmapActivity;
                location2 = location5;
                showKiloPoint(sharePathVideoAmapActivity3, location2);
                z = isBlockTrack;
                if (z) {
                    Logger.d(TAG, "sport is running , isBlockTrack:" + z);
                    sharePathVideoAmapActivity3.getDistanceChangeAnimator().resume();
                    sharePathVideoAmapActivity3.getBinding().L.resumeSport();
                    moveMarker = sharePathVideoAmapActivity3.getMoveMarker();
                    if (moveMarker != null) {
                        moveMarker.startSmoothMove();
                    }
                    isBlockTrack = false;
                }
                return Unit.INSTANCE;
            case 1:
                i = c29341.I$0;
                location = (Location) c29341.L$1;
                sharePathVideoAmapActivity = (SharePathVideoAmapActivity) c29341.L$0;
                ResultKt.throwOnFailure(obj);
                c29341.L$0 = sharePathVideoAmapActivity;
                c29341.L$1 = location;
                c29341.I$0 = i;
                c29341.label = 2;
                if (showMaxPaceMarker(sharePathVideoAmapActivity, location, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c29341.L$0 = sharePathVideoAmapActivity;
                c29341.L$1 = location;
                c29341.label = 13;
                if (showImgTextMarker(sharePathVideoAmapActivity, i, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Location location6 = location;
                sharePathVideoAmapActivity3 = sharePathVideoAmapActivity;
                location2 = location6;
                showKiloPoint(sharePathVideoAmapActivity3, location2);
                z = isBlockTrack;
                if (z) {
                    Logger.d(TAG, "sport is running , isBlockTrack:" + z);
                    sharePathVideoAmapActivity3.getDistanceChangeAnimator().resume();
                    sharePathVideoAmapActivity3.getBinding().L.resumeSport();
                    moveMarker = sharePathVideoAmapActivity3.getMoveMarker();
                    if (moveMarker != null) {
                        moveMarker.startSmoothMove();
                    }
                    isBlockTrack = false;
                }
                return Unit.INSTANCE;
            case 2:
            case 4:
            case 7:
            case 9:
            case 12:
                i2 = c29341.I$0;
                location = (Location) c29341.L$1;
                sharePathVideoAmapActivity2 = (SharePathVideoAmapActivity) c29341.L$0;
                ResultKt.throwOnFailure(obj);
                SharePathVideoAmapActivity sharePathVideoAmapActivity6 = sharePathVideoAmapActivity2;
                i = i2;
                sharePathVideoAmapActivity = sharePathVideoAmapActivity6;
                c29341.L$0 = sharePathVideoAmapActivity;
                c29341.L$1 = location;
                c29341.label = 13;
                if (showImgTextMarker(sharePathVideoAmapActivity, i, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Location location7 = location;
                sharePathVideoAmapActivity3 = sharePathVideoAmapActivity;
                location2 = location7;
                showKiloPoint(sharePathVideoAmapActivity3, location2);
                z = isBlockTrack;
                if (z) {
                    Logger.d(TAG, "sport is running , isBlockTrack:" + z);
                    sharePathVideoAmapActivity3.getDistanceChangeAnimator().resume();
                    sharePathVideoAmapActivity3.getBinding().L.resumeSport();
                    moveMarker = sharePathVideoAmapActivity3.getMoveMarker();
                    if (moveMarker != null) {
                        moveMarker.startSmoothMove();
                    }
                    isBlockTrack = false;
                }
                return Unit.INSTANCE;
            case 3:
                i = c29341.I$0;
                location = (Location) c29341.L$1;
                sharePathVideoAmapActivity = (SharePathVideoAmapActivity) c29341.L$0;
                ResultKt.throwOnFailure(obj);
                c29341.L$0 = sharePathVideoAmapActivity;
                c29341.L$1 = location;
                c29341.I$0 = i;
                c29341.label = 4;
                if (showMaxSpeedMarker(sharePathVideoAmapActivity, location, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c29341.L$0 = sharePathVideoAmapActivity;
                c29341.L$1 = location;
                c29341.label = 13;
                if (showImgTextMarker(sharePathVideoAmapActivity, i, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Location location8 = location;
                sharePathVideoAmapActivity3 = sharePathVideoAmapActivity;
                location2 = location8;
                showKiloPoint(sharePathVideoAmapActivity3, location2);
                z = isBlockTrack;
                if (z) {
                    Logger.d(TAG, "sport is running , isBlockTrack:" + z);
                    sharePathVideoAmapActivity3.getDistanceChangeAnimator().resume();
                    sharePathVideoAmapActivity3.getBinding().L.resumeSport();
                    moveMarker = sharePathVideoAmapActivity3.getMoveMarker();
                    if (moveMarker != null) {
                        moveMarker.startSmoothMove();
                    }
                    isBlockTrack = false;
                }
                return Unit.INSTANCE;
            case 5:
                i = c29341.I$0;
                location = (Location) c29341.L$1;
                sharePathVideoAmapActivity = (SharePathVideoAmapActivity) c29341.L$0;
                ResultKt.throwOnFailure(obj);
                c29341.L$0 = sharePathVideoAmapActivity;
                c29341.L$1 = location;
                c29341.I$0 = i;
                c29341.label = 6;
                if (showMaxHeightMarker(sharePathVideoAmapActivity, location, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i6 = i;
                sharePathVideoAmapActivity2 = sharePathVideoAmapActivity;
                i2 = i6;
                c29341.L$0 = sharePathVideoAmapActivity2;
                c29341.L$1 = location;
                c29341.I$0 = i2;
                c29341.label = 7;
                if (showMaxPaceMarker(sharePathVideoAmapActivity2, location, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                SharePathVideoAmapActivity sharePathVideoAmapActivity7 = sharePathVideoAmapActivity2;
                i = i2;
                sharePathVideoAmapActivity = sharePathVideoAmapActivity7;
                c29341.L$0 = sharePathVideoAmapActivity;
                c29341.L$1 = location;
                c29341.label = 13;
                if (showImgTextMarker(sharePathVideoAmapActivity, i, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Location location9 = location;
                sharePathVideoAmapActivity3 = sharePathVideoAmapActivity;
                location2 = location9;
                showKiloPoint(sharePathVideoAmapActivity3, location2);
                z = isBlockTrack;
                if (z) {
                    Logger.d(TAG, "sport is running , isBlockTrack:" + z);
                    sharePathVideoAmapActivity3.getDistanceChangeAnimator().resume();
                    sharePathVideoAmapActivity3.getBinding().L.resumeSport();
                    moveMarker = sharePathVideoAmapActivity3.getMoveMarker();
                    if (moveMarker != null) {
                        moveMarker.startSmoothMove();
                    }
                    isBlockTrack = false;
                }
                return Unit.INSTANCE;
            case 6:
                i2 = c29341.I$0;
                location = (Location) c29341.L$1;
                sharePathVideoAmapActivity2 = (SharePathVideoAmapActivity) c29341.L$0;
                ResultKt.throwOnFailure(obj);
                c29341.L$0 = sharePathVideoAmapActivity2;
                c29341.L$1 = location;
                c29341.I$0 = i2;
                c29341.label = 7;
                if (showMaxPaceMarker(sharePathVideoAmapActivity2, location, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                SharePathVideoAmapActivity sharePathVideoAmapActivity8 = sharePathVideoAmapActivity2;
                i = i2;
                sharePathVideoAmapActivity = sharePathVideoAmapActivity8;
                c29341.L$0 = sharePathVideoAmapActivity;
                c29341.L$1 = location;
                c29341.label = 13;
                if (showImgTextMarker(sharePathVideoAmapActivity, i, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Location location10 = location;
                sharePathVideoAmapActivity3 = sharePathVideoAmapActivity;
                location2 = location10;
                showKiloPoint(sharePathVideoAmapActivity3, location2);
                z = isBlockTrack;
                if (z) {
                    Logger.d(TAG, "sport is running , isBlockTrack:" + z);
                    sharePathVideoAmapActivity3.getDistanceChangeAnimator().resume();
                    sharePathVideoAmapActivity3.getBinding().L.resumeSport();
                    moveMarker = sharePathVideoAmapActivity3.getMoveMarker();
                    if (moveMarker != null) {
                        moveMarker.startSmoothMove();
                    }
                    isBlockTrack = false;
                }
                return Unit.INSTANCE;
            case 8:
                i = c29341.I$0;
                location = (Location) c29341.L$1;
                sharePathVideoAmapActivity = (SharePathVideoAmapActivity) c29341.L$0;
                ResultKt.throwOnFailure(obj);
                c29341.L$0 = sharePathVideoAmapActivity;
                c29341.L$1 = location;
                c29341.I$0 = i;
                c29341.label = 9;
                if (showMaxPaceMarker(sharePathVideoAmapActivity, location, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c29341.L$0 = sharePathVideoAmapActivity;
                c29341.L$1 = location;
                c29341.label = 13;
                if (showImgTextMarker(sharePathVideoAmapActivity, i, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Location location11 = location;
                sharePathVideoAmapActivity3 = sharePathVideoAmapActivity;
                location2 = location11;
                showKiloPoint(sharePathVideoAmapActivity3, location2);
                z = isBlockTrack;
                if (z) {
                    Logger.d(TAG, "sport is running , isBlockTrack:" + z);
                    sharePathVideoAmapActivity3.getDistanceChangeAnimator().resume();
                    sharePathVideoAmapActivity3.getBinding().L.resumeSport();
                    moveMarker = sharePathVideoAmapActivity3.getMoveMarker();
                    if (moveMarker != null) {
                        moveMarker.startSmoothMove();
                    }
                    isBlockTrack = false;
                }
                return Unit.INSTANCE;
            case 10:
                i = c29341.I$0;
                location = (Location) c29341.L$1;
                sharePathVideoAmapActivity = (SharePathVideoAmapActivity) c29341.L$0;
                ResultKt.throwOnFailure(obj);
                c29341.L$0 = sharePathVideoAmapActivity;
                c29341.L$1 = location;
                c29341.I$0 = i;
                c29341.label = 11;
                if (showChangeItemA(sharePathVideoAmapActivity, location, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i7 = i;
                sharePathVideoAmapActivity2 = sharePathVideoAmapActivity;
                i2 = i7;
                c29341.L$0 = sharePathVideoAmapActivity2;
                c29341.L$1 = location;
                c29341.I$0 = i2;
                c29341.label = 12;
                if (showChangeItemB(sharePathVideoAmapActivity2, location, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                SharePathVideoAmapActivity sharePathVideoAmapActivity9 = sharePathVideoAmapActivity2;
                i = i2;
                sharePathVideoAmapActivity = sharePathVideoAmapActivity9;
                c29341.L$0 = sharePathVideoAmapActivity;
                c29341.L$1 = location;
                c29341.label = 13;
                if (showImgTextMarker(sharePathVideoAmapActivity, i, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Location location12 = location;
                sharePathVideoAmapActivity3 = sharePathVideoAmapActivity;
                location2 = location12;
                showKiloPoint(sharePathVideoAmapActivity3, location2);
                z = isBlockTrack;
                if (z) {
                    Logger.d(TAG, "sport is running , isBlockTrack:" + z);
                    sharePathVideoAmapActivity3.getDistanceChangeAnimator().resume();
                    sharePathVideoAmapActivity3.getBinding().L.resumeSport();
                    moveMarker = sharePathVideoAmapActivity3.getMoveMarker();
                    if (moveMarker != null) {
                        moveMarker.startSmoothMove();
                    }
                    isBlockTrack = false;
                }
                return Unit.INSTANCE;
            case 11:
                i2 = c29341.I$0;
                location = (Location) c29341.L$1;
                sharePathVideoAmapActivity2 = (SharePathVideoAmapActivity) c29341.L$0;
                ResultKt.throwOnFailure(obj);
                c29341.L$0 = sharePathVideoAmapActivity2;
                c29341.L$1 = location;
                c29341.I$0 = i2;
                c29341.label = 12;
                if (showChangeItemB(sharePathVideoAmapActivity2, location, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                SharePathVideoAmapActivity sharePathVideoAmapActivity10 = sharePathVideoAmapActivity2;
                i = i2;
                sharePathVideoAmapActivity = sharePathVideoAmapActivity10;
                c29341.L$0 = sharePathVideoAmapActivity;
                c29341.L$1 = location;
                c29341.label = 13;
                if (showImgTextMarker(sharePathVideoAmapActivity, i, c29341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Location location13 = location;
                sharePathVideoAmapActivity3 = sharePathVideoAmapActivity;
                location2 = location13;
                showKiloPoint(sharePathVideoAmapActivity3, location2);
                z = isBlockTrack;
                if (z) {
                    Logger.d(TAG, "sport is running , isBlockTrack:" + z);
                    sharePathVideoAmapActivity3.getDistanceChangeAnimator().resume();
                    sharePathVideoAmapActivity3.getBinding().L.resumeSport();
                    moveMarker = sharePathVideoAmapActivity3.getMoveMarker();
                    if (moveMarker != null) {
                        moveMarker.startSmoothMove();
                    }
                    isBlockTrack = false;
                }
                return Unit.INSTANCE;
            case 13:
                location2 = (Location) c29341.L$1;
                sharePathVideoAmapActivity3 = (SharePathVideoAmapActivity) c29341.L$0;
                ResultKt.throwOnFailure(obj);
                showKiloPoint(sharePathVideoAmapActivity3, location2);
                z = isBlockTrack;
                if (z) {
                    Logger.d(TAG, "sport is running , isBlockTrack:" + z);
                    sharePathVideoAmapActivity3.getDistanceChangeAnimator().resume();
                    sharePathVideoAmapActivity3.getBinding().L.resumeSport();
                    moveMarker = sharePathVideoAmapActivity3.getMoveMarker();
                    if (moveMarker != null) {
                        moveMarker.startSmoothMove();
                    }
                    isBlockTrack = false;
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Nullable
    public static final Object showMaxHeightMarker(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity, @Nullable Location location, @NotNull Continuation<? super Unit> continuation) {
        MaxHeightMarker maxHeightMarker;
        if (location != null && (maxHeightMarker = sharePathVideoAmapActivity.getVm().getMaxHeightMarker()) != null) {
            maxHeightMarker.getStartTime();
            MaxHeightMarker maxHeightMarker2 = sharePathVideoAmapActivity.getVm().getMaxHeightMarker();
            if (maxHeightMarker2 != null && maxHeightMarker2.getMaxHeight() == 0) {
                return Unit.INSTANCE;
            }
            long j = location.timeStamp;
            MaxHeightMarker maxHeightMarker3 = sharePathVideoAmapActivity.getVm().getMaxHeightMarker();
            Long lBoxLong = maxHeightMarker3 != null ? Boxing.boxLong(maxHeightMarker3.getStartTime()) : null;
            Intrinsics.checkNotNull(lBoxLong);
            if (j >= lBoxLong.longValue() && sharePathVideoAmapActivity.getIsShowMaxHeightMarker()) {
                MovingPointOverlay moveMarker = sharePathVideoAmapActivity.getMoveMarker();
                if (moveMarker != null) {
                    moveMarker.stopMove();
                }
                sharePathVideoAmapActivity.setShowMaxHeightMarker(false);
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(sharePathVideoAmapActivity.getResources(), hoi.o1);
                View viewInflate = LayoutInflater.from(sharePathVideoAmapActivity).inflate(ivi.N2, (ViewGroup) null);
                Resources resources = sharePathVideoAmapActivity.getResources();
                int i = byi.I;
                MaxHeightMarker maxHeightMarker4 = sharePathVideoAmapActivity.getVm().getMaxHeightMarker();
                int maxHeight = maxHeightMarker4 != null ? maxHeightMarker4.getMaxHeight() : 0;
                Object[] objArr = new Object[1];
                MaxHeightMarker maxHeightMarker5 = sharePathVideoAmapActivity.getVm().getMaxHeightMarker();
                objArr[0] = Boxing.boxInt(maxHeightMarker5 != null ? maxHeightMarker5.getMaxHeight() : 0);
                String quantityString = resources.getQuantityString(i, maxHeight, objArr);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                ((TextView) viewInflate.findViewById(bsi.k4)).setText(quantityString);
                sharePathVideoAmapActivity.getBinding().E.showMoment(new MomentData(quantityString, hoi.M, hoi.d0));
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.icon(BitmapDescriptorFactory.fromBitmap(bitmapDecodeResource)).position(AMapPathUtils.INSTANCE.createLatLng(location));
                Marker markerAddMarker = sharePathVideoAmapActivity.getAMap().addMarker(markerOptions);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f);
                scaleAnimation.setDuration(600L);
                scaleAnimation.setInterpolator(new LinearInterpolator());
                markerAddMarker.setAnimation(scaleAnimation);
                markerAddMarker.startAnimation();
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public static final Object showMaxPaceMarker(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity, @Nullable Location location, @NotNull Continuation<? super Unit> continuation) {
        MaxPaceMarker maxPaceMarker;
        if (location != null && (maxPaceMarker = sharePathVideoAmapActivity.getVm().getMaxPaceMarker()) != null) {
            maxPaceMarker.getStartTime();
            MaxPaceMarker maxPaceMarker2 = sharePathVideoAmapActivity.getVm().getMaxPaceMarker();
            if (maxPaceMarker2 != null && maxPaceMarker2.getMaxPace() == 0) {
                return Unit.INSTANCE;
            }
            long j = location.timeStamp;
            MaxPaceMarker maxPaceMarker3 = sharePathVideoAmapActivity.getVm().getMaxPaceMarker();
            Long lBoxLong = maxPaceMarker3 != null ? Boxing.boxLong(maxPaceMarker3.getStartTime()) : null;
            Intrinsics.checkNotNull(lBoxLong);
            if (j >= lBoxLong.longValue() && sharePathVideoAmapActivity.getIsShowMaxPaceMarker() && !maxPaceInFirst) {
                MovingPointOverlay moveMarker = sharePathVideoAmapActivity.getMoveMarker();
                if (moveMarker != null) {
                    moveMarker.stopMove();
                }
                sharePathVideoAmapActivity.setShowMaxPaceMarker(false);
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(sharePathVideoAmapActivity.getResources(), hoi.q1);
                View viewInflate = LayoutInflater.from(sharePathVideoAmapActivity).inflate(ivi.P2, (ViewGroup) null);
                Resources resources = sharePathVideoAmapActivity.getResources();
                int i = byi.J;
                MaxPaceData maxPace = sharePathVideoAmapActivity.getVm().getMaxPace();
                int maxPace2 = maxPace != null ? maxPace.getMaxPace() : 0;
                Object[] objArr = new Object[1];
                MaxPaceData maxPace3 = sharePathVideoAmapActivity.getVm().getMaxPace();
                objArr[0] = TimeDateUtil.getSportPaceStrWithSecDef(maxPace3 != null ? maxPace3.getMaxPace() : 0);
                String quantityString = resources.getQuantityString(i, maxPace2, objArr);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                ((TextView) viewInflate.findViewById(bsi.k4)).setText(quantityString);
                sharePathVideoAmapActivity.getBinding().E.showMoment(new MomentData(quantityString, hoi.c, hoi.e0));
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.icon(BitmapDescriptorFactory.fromBitmap(bitmapDecodeResource)).position(AMapPathUtils.INSTANCE.createLatLng(location));
                Marker markerAddMarkerWithZIndex = MapUtilsKt.addMarkerWithZIndex(sharePathVideoAmapActivity.getAMap(), markerOptions);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f);
                scaleAnimation.setDuration(600L);
                scaleAnimation.setInterpolator(new LinearInterpolator());
                markerAddMarkerWithZIndex.setAnimation(scaleAnimation);
                markerAddMarkerWithZIndex.startAnimation();
            }
            maxPaceInFirst = false;
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public static final Object showMaxRateMarker(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity, @Nullable Location location, @NotNull Continuation<? super Unit> continuation) {
        MaxRateMarker maxRateMarker;
        if (location != null && (maxRateMarker = sharePathVideoAmapActivity.getVm().getMaxRateMarker()) != null) {
            maxRateMarker.getStartTime();
            MaxRateMarker maxRateMarker2 = sharePathVideoAmapActivity.getVm().getMaxRateMarker();
            if (maxRateMarker2 != null && maxRateMarker2.getMaxRate() == 0) {
                return Unit.INSTANCE;
            }
            long j = location.timeStamp;
            MaxRateMarker maxRateMarker3 = sharePathVideoAmapActivity.getVm().getMaxRateMarker();
            Long lBoxLong = maxRateMarker3 != null ? Boxing.boxLong(maxRateMarker3.getStartTime()) : null;
            Intrinsics.checkNotNull(lBoxLong);
            if (j >= lBoxLong.longValue() && sharePathVideoAmapActivity.getIsShowMaxRateMarker()) {
                MovingPointOverlay moveMarker = sharePathVideoAmapActivity.getMoveMarker();
                if (moveMarker != null) {
                    moveMarker.stopMove();
                }
                sharePathVideoAmapActivity.setShowMaxRateMarker(false);
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(sharePathVideoAmapActivity.getResources(), hoi.p1);
                View viewInflate = LayoutInflater.from(sharePathVideoAmapActivity).inflate(ivi.O2, (ViewGroup) null);
                Resources resources = sharePathVideoAmapActivity.getResources();
                int i = byi.O;
                MaxRateMarker maxRateMarker4 = sharePathVideoAmapActivity.getVm().getMaxRateMarker();
                int maxRate = maxRateMarker4 != null ? maxRateMarker4.getMaxRate() : 0;
                Object[] objArr = new Object[1];
                MaxRateMarker maxRateMarker5 = sharePathVideoAmapActivity.getVm().getMaxRateMarker();
                objArr[0] = Boxing.boxInt(maxRateMarker5 != null ? maxRateMarker5.getMaxRate() : 0);
                String quantityString = resources.getQuantityString(i, maxRate, objArr);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                ((TextView) viewInflate.findViewById(bsi.k4)).setText(quantityString);
                sharePathVideoAmapActivity.getBinding().E.showMoment(new MomentData(quantityString, hoi.f20293a, hoi.f0));
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.icon(BitmapDescriptorFactory.fromBitmap(bitmapDecodeResource)).position(AMapPathUtils.INSTANCE.createLatLng(location));
                Marker markerAddMarkerWithZIndex = MapUtilsKt.addMarkerWithZIndex(sharePathVideoAmapActivity.getAMap(), markerOptions);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f);
                scaleAnimation.setDuration(600L);
                scaleAnimation.setInterpolator(new LinearInterpolator());
                markerAddMarkerWithZIndex.setAnimation(scaleAnimation);
                markerAddMarkerWithZIndex.startAnimation();
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public static final Object showMaxSpeedMarker(@NotNull SharePathVideoAmapActivity sharePathVideoAmapActivity, @Nullable Location location, @NotNull Continuation<? super Unit> continuation) {
        MaxSpeedMarker maxSpeedMarker;
        if (location != null && (maxSpeedMarker = sharePathVideoAmapActivity.getVm().getMaxSpeedMarker()) != null) {
            maxSpeedMarker.getStartTime();
            MaxSpeedMarker maxSpeedMarker2 = sharePathVideoAmapActivity.getVm().getMaxSpeedMarker();
            if (Intrinsics.areEqual(maxSpeedMarker2 != null ? Boxing.boxFloat(maxSpeedMarker2.getMaxSpeed()) : null, 0.0f)) {
                return Unit.INSTANCE;
            }
            long j = location.timeStamp;
            MaxSpeedMarker maxSpeedMarker3 = sharePathVideoAmapActivity.getVm().getMaxSpeedMarker();
            Long lBoxLong = maxSpeedMarker3 != null ? Boxing.boxLong(maxSpeedMarker3.getStartTime()) : null;
            Intrinsics.checkNotNull(lBoxLong);
            if (j >= lBoxLong.longValue() && sharePathVideoAmapActivity.getIsShowMaxSpeedMarker()) {
                MovingPointOverlay moveMarker = sharePathVideoAmapActivity.getMoveMarker();
                if (moveMarker != null) {
                    moveMarker.stopMove();
                }
                sharePathVideoAmapActivity.setShowMaxSpeedMarker(false);
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(sharePathVideoAmapActivity.getResources(), hoi.q1);
                View viewInflate = LayoutInflater.from(sharePathVideoAmapActivity).inflate(ivi.P2, (ViewGroup) null);
                Resources resources = sharePathVideoAmapActivity.getResources();
                int i = byi.K;
                MaxSpeedData maxSpeed = sharePathVideoAmapActivity.getVm().getMaxSpeed();
                int maxSpeed2 = maxSpeed != null ? (int) maxSpeed.getMaxSpeed() : 0;
                Object[] objArr = new Object[1];
                MaxSpeedData maxSpeed3 = sharePathVideoAmapActivity.getVm().getMaxSpeed();
                Object objF = xr5.f(maxSpeed3 != null ? maxSpeed3.getMaxSpeed() : 0.0f);
                if (objF == null) {
                    objF = Boxing.boxInt(0);
                }
                objArr[0] = objF;
                String quantityString = resources.getQuantityString(i, maxSpeed2, objArr);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                ((TextView) viewInflate.findViewById(bsi.k4)).setText(quantityString);
                sharePathVideoAmapActivity.getBinding().E.showMoment(new MomentData(quantityString, hoi.c, hoi.e0));
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.icon(BitmapDescriptorFactory.fromBitmap(bitmapDecodeResource)).position(AMapPathUtils.INSTANCE.createLatLng(location));
                Marker markerAddMarkerWithZIndex = MapUtilsKt.addMarkerWithZIndex(sharePathVideoAmapActivity.getAMap(), markerOptions);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f);
                scaleAnimation.setDuration(600L);
                scaleAnimation.setInterpolator(new LinearInterpolator());
                markerAddMarkerWithZIndex.setAnimation(scaleAnimation);
                markerAddMarkerWithZIndex.startAnimation();
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
