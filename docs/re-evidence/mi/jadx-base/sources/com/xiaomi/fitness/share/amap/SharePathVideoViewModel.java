package com.xiaomi.fitness.share.amap;

import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.LatLng;
import com.mi.health.map.data.GpsValues;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.detail.util.SportShareUtil;
import com.xiaomi.fitness.detail.video.share.model.SportTracePointDataModel;
import com.xiaomi.fitness.detail.video.share.util.SportTraceVideoShareUtilKt;
import com.xiaomi.fitness.detail.video.share.util.TraceStyleModelClassic;
import com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.share.amap.ext.LatLngsEvenlyDistributeUtilsKt;
import com.xiaomi.fitness.share.amap.ext.MapPathDataHelperKt;
import com.xiaomi.fitness.share.amap.ext.MaxPaceData;
import com.xiaomi.fitness.share.amap.ext.MaxSpeedData;
import com.xiaomi.fitness.share.amap.utils.ChangeItem;
import com.xiaomi.fitness.share.amap.utils.MaxHeightMarker;
import com.xiaomi.fitness.share.amap.utils.MaxPaceMarker;
import com.xiaomi.fitness.share.amap.utils.MaxRateMarker;
import com.xiaomi.fitness.share.amap.utils.MaxSpeedMarker;
import com.xiaomi.fitness.share.amap.utils.WonderfulMomentsHelperKt;
import com.xiaomi.fitness.sport.view.route.CreateRouteLoadingFragment;
import com.xiaomi.fitness.util.AMapPathUtils;
import com.xiaomi.wearable.gpsalgorithm.FitnessSportAlgo;
import com.xiaomi.wearable.gpsalgorithm.data.MapRotationData;
import defpackage.bmh;
import defpackage.bxa;
import defpackage.emh;
import defpackage.l5;
import defpackage.o5o;
import defpackage.rz5;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 Ä\u00012\u00020\u0001:\u0004Ä\u0001Å\u0001B\b¢\u0006\u0005\bÃ\u0001\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001d\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u0015\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0007¢\u0006\u0004\b \u0010\u0014J\u000f\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00118\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u0014R'\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0015j\b\u0012\u0004\u0012\u00020\b`\u00178\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\u0019R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020\b0B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR2\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010@\u001a\u0004\bH\u0010\u0019\"\u0004\bI\u0010JR2\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0015j\b\u0012\u0004\u0012\u00020\b`\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010@\u001a\u0004\bL\u0010\u0019\"\u0004\bM\u0010JR(\u0010N\u001a\b\u0012\u0004\u0012\u00020$0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010=\u001a\u0004\bO\u0010\u0014\"\u0004\bP\u0010\u000bR\"\u0010R\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR'\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020X0\u0015j\b\u0012\u0004\u0012\u00020X`\u00178\u0006¢\u0006\f\n\u0004\bY\u0010@\u001a\u0004\bZ\u0010\u0019R\u001f\u0010]\u001a\n \\*\u0004\u0018\u00010[0[8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R*\u0010b\u001a\n\u0012\u0004\u0012\u00020a\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010@\u001a\u0004\bc\u0010\u0019\"\u0004\bd\u0010JR(\u0010f\u001a\b\u0012\u0004\u0012\u00020\u001a0e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bf\u0010h\"\u0004\bi\u0010jR$\u0010l\u001a\u0004\u0018\u00010k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010s\u001a\u0004\u0018\u00010r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010z\u001a\u0004\u0018\u00010y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR(\u0010\u0080\u0001\u001a\u0004\u0018\u00010y8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010{\u001a\u0005\b\u0081\u0001\u0010}\"\u0005\b\u0082\u0001\u0010\u007fR,\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R,\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R,\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R,\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R&\u0010\u009f\u0001\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009f\u0001\u0010/\u001a\u0005\b \u0001\u00101\"\u0005\b¡\u0001\u00103R6\u0010£\u0001\u001a\u000f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0¢\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R6\u0010©\u0001\u001a\u000f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0¢\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010¤\u0001\u001a\u0006\bª\u0001\u0010¦\u0001\"\u0006\b«\u0001\u0010¨\u0001R&\u0010¬\u0001\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¬\u0001\u0010/\u001a\u0005\b\u00ad\u0001\u00101\"\u0005\b®\u0001\u00103R&\u0010¯\u0001\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¯\u0001\u0010/\u001a\u0005\b°\u0001\u00101\"\u0005\b±\u0001\u00103R&\u0010²\u0001\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b²\u0001\u0010/\u001a\u0005\b³\u0001\u00101\"\u0005\b´\u0001\u00103R!\u0010¶\u0001\u001a\t\u0012\u0005\u0012\u00030µ\u00010e8\u0006¢\u0006\u000e\n\u0005\b¶\u0001\u0010g\u001a\u0005\b·\u0001\u0010hR,\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¸\u0001\u0010g\u001a\u0005\b¹\u0001\u0010h\"\u0005\bº\u0001\u0010jR-\u0010¼\u0001\u001a\t\u0012\u0005\u0012\u00030»\u00010e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¼\u0001\u0010g\u001a\u0005\b½\u0001\u0010h\"\u0005\b¾\u0001\u0010jR1\u0010Á\u0001\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030»\u0001\u0012\u0005\u0012\u00030À\u0001\u0018\u00010¿\u00010e8\u0006¢\u0006\u000e\n\u0005\bÁ\u0001\u0010g\u001a\u0005\bÂ\u0001\u0010h¨\u0006Æ\u0001"}, d2 = {"Lcom/xiaomi/fitness/share/amap/SharePathVideoViewModel;", "Lcom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel;", "", "getSportLabel", "()V", "dynamicLocation", "convertData", "", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "list", "computeMapDis", "(Ljava/util/List;)V", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initBundleParams", "(Landroid/os/Bundle;)V", "createDataList", "", "Lcom/xiaomi/fitness/share/amap/SharePathVideoViewModel$ColorPoint;", "getColorPoints", "()Ljava/util/List;", "Ljava/util/ArrayList;", "Lcom/amap/api/maps/model/LatLng;", "Lkotlin/collections/ArrayList;", "getLatLngList", "()Ljava/util/ArrayList;", "", "selected", "updateSelectedStatus", "(Z)V", "unselectAllIndicators", "Landroid/net/Uri;", "getImgUriList", "", "getRecordFeeling", "()Ljava/lang/String;", "", "sportDataType", "convertSportType", "(I)I", "Lcom/mi/health/map/data/GpsValues;", "gpsValues", "Lcom/mi/health/map/data/GpsValues;", "getGpsValues", "()Lcom/mi/health/map/data/GpsValues;", "setGpsValues", "(Lcom/mi/health/map/data/GpsValues;)V", "I", "getSportDataType", "()I", "setSportDataType", "(I)V", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "mBasicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getMBasicReport", "()Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "setMBasicReport", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "Lrz5;", "mDetailList", "Ljava/util/List;", "getMDetailList", "mLocationList", "Ljava/util/ArrayList;", "getMLocationList", "Ljava/util/LinkedList;", "mKilometerList", "Ljava/util/LinkedList;", "getMKilometerList", "()Ljava/util/LinkedList;", "mOriginalList", "getMOriginalList", "setMOriginalList", "(Ljava/util/ArrayList;)V", "mUniformOriginalList", "getMUniformOriginalList", "setMUniformOriginalList", "mUniformOriginalColorList", "getMUniformOriginalColorList", "setMUniformOriginalColorList", "", "mTraceDuration", "J", "getMTraceDuration", "()J", "setMTraceDuration", "(J)V", "Lbmh;", "mPathRecordList", "getMPathRecordList", "Lcom/xiaomi/wearable/gpsalgorithm/FitnessSportAlgo;", "kotlin.jvm.PlatformType", "mSportAlgo", "Lcom/xiaomi/wearable/gpsalgorithm/FitnessSportAlgo;", "getMSportAlgo", "()Lcom/xiaomi/wearable/gpsalgorithm/FitnessSportAlgo;", "Lcom/xiaomi/wearable/gpsalgorithm/data/MapRotationData;", "dynamicRotationList", "getDynamicRotationList", "setDynamicRotationList", "Landroidx/lifecycle/MutableLiveData;", "isTrackDataLoad", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "setTrackDataLoad", "(Landroidx/lifecycle/MutableLiveData;)V", "Lcom/xiaomi/fitness/share/amap/ext/MaxSpeedData;", "maxSpeed", "Lcom/xiaomi/fitness/share/amap/ext/MaxSpeedData;", "getMaxSpeed", "()Lcom/xiaomi/fitness/share/amap/ext/MaxSpeedData;", "setMaxSpeed", "(Lcom/xiaomi/fitness/share/amap/ext/MaxSpeedData;)V", "Lcom/xiaomi/fitness/share/amap/ext/MaxPaceData;", FitnessReportKey.maxPace, "Lcom/xiaomi/fitness/share/amap/ext/MaxPaceData;", "getMaxPace", "()Lcom/xiaomi/fitness/share/amap/ext/MaxPaceData;", "setMaxPace", "(Lcom/xiaomi/fitness/share/amap/ext/MaxPaceData;)V", "Lcom/xiaomi/fitness/share/amap/utils/ChangeItem;", "changeItemA", "Lcom/xiaomi/fitness/share/amap/utils/ChangeItem;", "getChangeItemA", "()Lcom/xiaomi/fitness/share/amap/utils/ChangeItem;", "setChangeItemA", "(Lcom/xiaomi/fitness/share/amap/utils/ChangeItem;)V", "changeItemB", "getChangeItemB", "setChangeItemB", "Lcom/xiaomi/fitness/share/amap/utils/MaxPaceMarker;", "maxPaceMarker", "Lcom/xiaomi/fitness/share/amap/utils/MaxPaceMarker;", "getMaxPaceMarker", "()Lcom/xiaomi/fitness/share/amap/utils/MaxPaceMarker;", "setMaxPaceMarker", "(Lcom/xiaomi/fitness/share/amap/utils/MaxPaceMarker;)V", "Lcom/xiaomi/fitness/share/amap/utils/MaxSpeedMarker;", "maxSpeedMarker", "Lcom/xiaomi/fitness/share/amap/utils/MaxSpeedMarker;", "getMaxSpeedMarker", "()Lcom/xiaomi/fitness/share/amap/utils/MaxSpeedMarker;", "setMaxSpeedMarker", "(Lcom/xiaomi/fitness/share/amap/utils/MaxSpeedMarker;)V", "Lcom/xiaomi/fitness/share/amap/utils/MaxRateMarker;", "maxRateMarker", "Lcom/xiaomi/fitness/share/amap/utils/MaxRateMarker;", "getMaxRateMarker", "()Lcom/xiaomi/fitness/share/amap/utils/MaxRateMarker;", "setMaxRateMarker", "(Lcom/xiaomi/fitness/share/amap/utils/MaxRateMarker;)V", "Lcom/xiaomi/fitness/share/amap/utils/MaxHeightMarker;", "maxHeightMarker", "Lcom/xiaomi/fitness/share/amap/utils/MaxHeightMarker;", "getMaxHeightMarker", "()Lcom/xiaomi/fitness/share/amap/utils/MaxHeightMarker;", "setMaxHeightMarker", "(Lcom/xiaomi/fitness/share/amap/utils/MaxHeightMarker;)V", "colorStarIndex", "getColorStarIndex", "setColorStarIndex", "Ljava/util/TreeMap;", "disLatLngMap", "Ljava/util/TreeMap;", "getDisLatLngMap", "()Ljava/util/TreeMap;", "setDisLatLngMap", "(Ljava/util/TreeMap;)V", "disColorMap", "getDisColorMap", "setDisColorMap", "locationDis", "getLocationDis", "setLocationDis", "locationTotalDis", "getLocationTotalDis", "setLocationTotalDis", "colorIndex", "getColorIndex", "setColorIndex", "Lcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;", "traceStyleResModeLiveData", "getTraceStyleResModeLiveData", "recordedVideoUriLiveData", "getRecordedVideoUriLiveData", "setRecordedVideoUriLiveData", "", "curtProgressLiveData", "getCurtProgressLiveData", "setCurtProgressLiveData", "", "Lcom/xiaomi/fitness/detail/video/share/model/SportTracePointDataModel;", "traceDataMapLiveData", "getTraceDataMapLiveData", "<init>", "Companion", "ColorPoint", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSharePathVideoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharePathVideoViewModel.kt\ncom/xiaomi/fitness/share/amap/SharePathVideoViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,370:1\n1863#2,2:371\n1557#2:373\n1628#2,3:374\n1872#2,2:377\n1863#2,2:379\n1863#2,2:381\n1872#2,3:383\n1874#2:386\n1863#2,2:387\n1557#2:389\n1628#2,3:390\n*S KotlinDebug\n*F\n+ 1 SharePathVideoViewModel.kt\ncom/xiaomi/fitness/share/amap/SharePathVideoViewModel\n*L\n137#1:371,2\n143#1:373\n143#1:374,3\n207#1:377,2\n212#1:379,2\n217#1:381,2\n227#1:383,3\n207#1:386\n246#1:387,2\n256#1:389\n256#1:390,3\n*E\n"})
public final class SharePathVideoViewModel extends SportRecordDetailViewModel {

    @NotNull
    public static final String TAG = "SharePathVideoViewModel";

    @Nullable
    private ChangeItem changeItemA;

    @Nullable
    private ChangeItem changeItemB;
    private int colorIndex;
    private int colorStarIndex;

    @Nullable
    private ArrayList<MapRotationData> dynamicRotationList;

    @Nullable
    private GpsValues gpsValues;
    private int locationDis;
    private int locationTotalDis;

    @Nullable
    private SportBasicReport mBasicReport;
    private long mTraceDuration;

    @Nullable
    private MaxHeightMarker maxHeightMarker;

    @Nullable
    private MaxPaceData maxPace;

    @Nullable
    private MaxPaceMarker maxPaceMarker;

    @Nullable
    private MaxRateMarker maxRateMarker;

    @Nullable
    private MaxSpeedData maxSpeed;

    @Nullable
    private MaxSpeedMarker maxSpeedMarker;
    private int sportDataType;

    @NotNull
    private final List<rz5> mDetailList = new ArrayList();

    @NotNull
    private final ArrayList<Location> mLocationList = new ArrayList<>();

    @NotNull
    private final LinkedList<Location> mKilometerList = new LinkedList<>();

    @NotNull
    private ArrayList<LatLng> mOriginalList = new ArrayList<>();

    @NotNull
    private ArrayList<Location> mUniformOriginalList = new ArrayList<>();

    @NotNull
    private List<Integer> mUniformOriginalColorList = new ArrayList();

    @NotNull
    private final ArrayList<bmh> mPathRecordList = new ArrayList<>();
    private final FitnessSportAlgo mSportAlgo = FitnessSportAlgo.getInstance(UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null));

    @NotNull
    private MutableLiveData<Boolean> isTrackDataLoad = new MutableLiveData<>();

    @NotNull
    private TreeMap<Integer, Location> disLatLngMap = new TreeMap<>();

    @NotNull
    private TreeMap<Integer, Integer> disColorMap = new TreeMap<>();

    @NotNull
    private final MutableLiveData<TraceStyleResModel> traceStyleResModeLiveData = new MutableLiveData<>(TraceStyleModelClassic.INSTANCE);

    @NotNull
    private MutableLiveData<Uri> recordedVideoUriLiveData = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Float> curtProgressLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData = new MutableLiveData<>();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/share/amap/SharePathVideoViewModel$ColorPoint;", "", "color", "", "point", "Lcom/amap/api/maps/model/LatLng;", "type", "", "<init>", "(ILcom/amap/api/maps/model/LatLng;Z)V", "getColor", "()I", "getPoint", "()Lcom/amap/api/maps/model/LatLng;", "getType", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ColorPoint {
        private final int color;

        @NotNull
        private final LatLng point;
        private final boolean type;

        public ColorPoint(int i, @NotNull LatLng point, boolean z) {
            Intrinsics.checkNotNullParameter(point, "point");
            this.color = i;
            this.point = point;
            this.type = z;
        }

        public static /* synthetic */ ColorPoint copy$default(ColorPoint colorPoint, int i, LatLng latLng, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = colorPoint.color;
            }
            if ((i2 & 2) != 0) {
                latLng = colorPoint.point;
            }
            if ((i2 & 4) != 0) {
                z = colorPoint.type;
            }
            return colorPoint.copy(i, latLng, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final LatLng getPoint() {
            return this.point;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getType() {
            return this.type;
        }

        @NotNull
        public final ColorPoint copy(int color, @NotNull LatLng point, boolean type) {
            Intrinsics.checkNotNullParameter(point, "point");
            return new ColorPoint(color, point, type);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ColorPoint)) {
                return false;
            }
            ColorPoint colorPoint = (ColorPoint) other;
            return this.color == colorPoint.color && Intrinsics.areEqual(this.point, colorPoint.point) && this.type == colorPoint.type;
        }

        public final int getColor() {
            return this.color;
        }

        @NotNull
        public final LatLng getPoint() {
            return this.point;
        }

        public final boolean getType() {
            return this.type;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.color) * 31) + this.point.hashCode()) * 31) + Boolean.hashCode(this.type);
        }

        @NotNull
        public String toString() {
            return "ColorPoint(color=" + this.color + ", point=" + this.point + ", type=" + this.type + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.amap.SharePathVideoViewModel$createDataList$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.share.amap.SharePathVideoViewModel$createDataList$3", f = "SharePathVideoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharePathVideoViewModel.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<Location> list;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GpsValues gpsValues = SharePathVideoViewModel.this.getGpsValues();
            if (gpsValues != null && (list = gpsValues.locationList) != null) {
                SharePathVideoViewModel sharePathVideoViewModel = SharePathVideoViewModel.this;
                List<Location> listEvenlyDistributeLatLngs = LatLngsEvenlyDistributeUtilsKt.evenlyDistributeLatLngs(list, sharePathVideoViewModel.getMUniformOriginalColorList(), sharePathVideoViewModel.convertSportType(sharePathVideoViewModel.getSportDataType()));
                Intrinsics.checkNotNull(listEvenlyDistributeLatLngs, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fit.data.common.data.sport.Location>");
                sharePathVideoViewModel.setMUniformOriginalList((ArrayList) listEvenlyDistributeLatLngs);
                Logger.i(SharePathVideoViewModel.TAG, "mUniformOriginalList:" + sharePathVideoViewModel.getMUniformOriginalList().size() + "  , mOriginalList:" + sharePathVideoViewModel.getMOriginalList().size() + ",mUniformOriginalColorList:" + sharePathVideoViewModel.getMUniformOriginalColorList().size());
                sharePathVideoViewModel.dynamicLocation();
                sharePathVideoViewModel.isTrackDataLoad().postValue(Boxing.boxBoolean(true));
            }
            GpsValues gpsValues2 = SharePathVideoViewModel.this.getGpsValues();
            GpsValues gpsValues3 = SharePathVideoViewModel.this.getGpsValues();
            List<Location> list2 = gpsValues3 != null ? gpsValues3.locationList : null;
            Logger.i(SharePathVideoViewModel.TAG, "gpsValue:" + gpsValues2 + ",gpsValue locationList:" + list2 + ",mUniformOriginalList size:" + SharePathVideoViewModel.this.getMUniformOriginalList().size() + ",mUniformOriginalColorList size:" + SharePathVideoViewModel.this.getMUniformOriginalColorList().size());
            SharePathVideoViewModel.this.convertData();
            SharePathVideoViewModel.this.getSportLabel();
            SharePathVideoViewModel sharePathVideoViewModel2 = SharePathVideoViewModel.this;
            sharePathVideoViewModel2.setMTraceDuration((long) ((((float) sharePathVideoViewModel2.getMUniformOriginalList().size()) / ((float) 500)) * ((float) 1000)));
            SharePathVideoViewModel sharePathVideoViewModel3 = SharePathVideoViewModel.this;
            long mTraceDuration = sharePathVideoViewModel3.getMTraceDuration();
            long mTraceDuration2 = 3000;
            if (0 > mTraceDuration || mTraceDuration >= 3001) {
                mTraceDuration2 = (3000 > mTraceDuration || mTraceDuration >= 25001) ? CreateRouteLoadingFragment.ROUTE_LOADING_DURATION : SharePathVideoViewModel.this.getMTraceDuration();
            }
            sharePathVideoViewModel3.setMTraceDuration(mTraceDuration2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void computeMapDis(List<? extends Location> list) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AMapPathUtils aMapPathUtils = AMapPathUtils.INSTANCE;
            this.locationTotalDis += (int) AMapUtils.calculateLineDistance(aMapPathUtils.createLatLng(list.get(i2)), aMapPathUtils.createLatLng(list.get(i)));
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void convertData() {
        ArrayList<Location> arrayList = this.mUniformOriginalList;
        computeMapDis(arrayList);
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AMapPathUtils aMapPathUtils = AMapPathUtils.INSTANCE;
            Location location = arrayList.get(i2);
            Intrinsics.checkNotNullExpressionValue(location, "get(...)");
            LatLng latLngCreateLatLng = aMapPathUtils.createLatLng(location);
            Location location2 = arrayList.get(i);
            Intrinsics.checkNotNullExpressionValue(location2, "get(...)");
            int iCalculateLineDistance = (int) AMapUtils.calculateLineDistance(latLngCreateLatLng, aMapPathUtils.createLatLng(location2));
            if (this.locationTotalDis > 0) {
                this.disLatLngMap.put(Integer.valueOf(this.locationDis), arrayList.get(i2));
                int size2 = this.locationTotalDis / this.mUniformOriginalColorList.size();
                TreeMap<Integer, Integer> treeMap = this.disColorMap;
                Integer numValueOf = Integer.valueOf(this.locationDis);
                List<Integer> list = this.mUniformOriginalColorList;
                treeMap.put(numValueOf, list.get(this.colorIndex >= list.size() + (-1) ? 0 : this.colorIndex));
                int i3 = this.locationDis;
                int i4 = this.colorIndex;
                if (i3 >= size2 * i4) {
                    this.colorIndex = i4 + 1;
                }
            }
            this.locationDis += iCalculateLineDistance;
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dynamicLocation() {
        this.mSportAlgo.dynamicInit(this.mUniformOriginalList.get(0).longitude, this.mUniformOriginalList.get(0).latitude, this.mUniformOriginalList.size());
        for (Location location : this.mUniformOriginalList) {
            this.mSportAlgo.dynamicFeedLocation(location.longitude, location.latitude);
        }
        ArrayList<MapRotationData> dynamicRotationList = this.mSportAlgo.getDynamicRotationList();
        this.dynamicRotationList = dynamicRotationList;
        FitnessLogUtils.i(TAG, "dynamicRotationList.size = " + (dynamicRotationList != null ? dynamicRotationList.size() : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getSportLabel() {
        Integer maxPace;
        this.maxRateMarker = WonderfulMomentsHelperKt.getMaxRateMarker(this.mUniformOriginalList, this.locationTotalDis, this.sportDataType);
        this.maxHeightMarker = WonderfulMomentsHelperKt.getMaxHeightMarker(this.mUniformOriginalList, this.locationTotalDis);
        SportBasicReport sportBasicReport = this.mBasicReport;
        this.maxSpeed = MapPathDataHelperKt.getMaxSpeed(sportBasicReport != null ? sportBasicReport.getMaxSpeed() : null);
        this.maxPace = MapPathDataHelperKt.getMaxPace();
        if (this.sportDataType == 36) {
            this.changeItemA = WonderfulMomentsHelperKt.getChangeItemA(this.mUniformOriginalList, this.gpsValues);
            this.changeItemB = WonderfulMomentsHelperKt.getChangeItemB(this.mUniformOriginalList, this.gpsValues);
        }
        MaxPaceData maxPaceData = this.maxPace;
        if (maxPaceData != null) {
            this.maxPaceMarker = WonderfulMomentsHelperKt.getMaxPaceMarker(this.mUniformOriginalList, maxPaceData, this.locationTotalDis);
            SportBasicReport sportBasicReport2 = this.mBasicReport;
            int iIntValue = (sportBasicReport2 == null || (maxPace = sportBasicReport2.getMaxPace()) == null) ? 0 : maxPace.intValue();
            if (iIntValue == 0) {
                iIntValue = maxPaceData.getMaxPace();
            }
            maxPaceData.setMaxPace(iIntValue);
        }
        MaxSpeedData maxSpeedData = this.maxSpeed;
        if (maxSpeedData != null) {
            this.maxSpeedMarker = WonderfulMomentsHelperKt.getMaxSpeedMarker(this.mUniformOriginalList, maxSpeedData, this.locationTotalDis);
        }
    }

    public final int convertSportType(int sportDataType) {
        if (sportDataType == 20) {
            return 5;
        }
        if (sportDataType == 22) {
            return 1;
        }
        if (sportDataType == 34) {
            return 15;
        }
        if (sportDataType == 27) {
            return 4;
        }
        if (sportDataType == 28) {
            return 2;
        }
        switch (sportDataType) {
            case 144:
                return 708;
            case 145:
                return 709;
            case 146:
                return 710;
            default:
                return 6;
        }
    }

    public final void createDataList() {
        List<Location> list;
        Unit unit;
        if (this.gpsValues == null || this.mUniformOriginalList.size() != 0) {
            return;
        }
        if (this.mLocationList.size() > 0) {
            this.mLocationList.clear();
        }
        ArrayList<Location> arrayList = this.mLocationList;
        GpsValues gpsValues = this.gpsValues;
        Intrinsics.checkNotNull(gpsValues);
        arrayList.addAll(gpsValues.locationList);
        for (Location location : this.mLocationList) {
            Logger.i(TAG, location.latitude + "," + location.longitude);
        }
        if (this.mKilometerList.size() > 0) {
            this.mKilometerList.clear();
        }
        GpsValues gpsValues2 = this.gpsValues;
        if (gpsValues2 != null && (list = gpsValues2.integerKilometerList) != null) {
            List<Location> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (Location location2 : list2) {
                if (location2 != null) {
                    Location location3 = new Location();
                    double d = bxa.c(location2.latitude, location2.longitude)[0];
                    location3.latitude = d;
                    location3.longitude = d;
                    location3.timeStamp = location2.timeStamp;
                    location3.kilometer = location2.kilometer;
                    if (this.mKilometerList.isEmpty() || location3.kilometer != ((Location) CollectionsKt___CollectionsKt.last((List) this.mKilometerList)).kilometer) {
                        this.mKilometerList.add(location2);
                        Logger.i(TAG, "kilo location:" + location3);
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                arrayList2.add(unit);
            }
        }
        ArrayList<LatLng> arrayList3 = new ArrayList<>();
        this.mOriginalList = arrayList3;
        if (arrayList3.size() > 0) {
            this.mOriginalList.clear();
        }
        ArrayList<LatLng> arrayList4 = this.mOriginalList;
        AMapPathUtils aMapPathUtils = AMapPathUtils.INSTANCE;
        GpsValues gpsValues3 = this.gpsValues;
        arrayList4.addAll(aMapPathUtils.createLatLngList(gpsValues3 != null ? gpsValues3.locationList : null));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass3(null), 3, null);
        if (this.mPathRecordList.size() > 0) {
            this.mPathRecordList.clear();
        }
        this.mPathRecordList.addAll(emh.c(this.mBasicReport, this.gpsValues, true));
    }

    @Nullable
    public final ChangeItem getChangeItemA() {
        return this.changeItemA;
    }

    @Nullable
    public final ChangeItem getChangeItemB() {
        return this.changeItemB;
    }

    public final int getColorIndex() {
        return this.colorIndex;
    }

    @NotNull
    public final List<ColorPoint> getColorPoints() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : this.mPathRecordList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            bmh bmhVar = (bmh) obj;
            List<LatLng> listM = l5.m(bmhVar.f4369b);
            if (bmhVar.f4368a == 1) {
                this.colorStarIndex -= 2;
                Intrinsics.checkNotNull(listM);
                for (LatLng latLng : listM) {
                    int iIntValue = this.mUniformOriginalColorList.get(0).intValue();
                    Intrinsics.checkNotNull(latLng);
                    arrayList.add(new ColorPoint(iIntValue, latLng, false));
                }
            } else if (this.mUniformOriginalColorList.size() == 0) {
                Intrinsics.checkNotNull(listM);
                for (LatLng latLng2 : listM) {
                    int i3 = bmhVar.e;
                    Intrinsics.checkNotNull(latLng2);
                    arrayList.add(new ColorPoint(i3, latLng2, false));
                }
            } else {
                Intrinsics.checkNotNull(listM);
                int i4 = 0;
                for (Object obj2 : listM) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    LatLng latLng3 = (LatLng) obj2;
                    int iIntValue2 = this.mUniformOriginalColorList.get(i4).intValue();
                    Intrinsics.checkNotNull(latLng3);
                    arrayList.add(new ColorPoint(iIntValue2, latLng3, true));
                    i4 = i5;
                }
            }
            i = i2;
        }
        return arrayList;
    }

    public final int getColorStarIndex() {
        return this.colorStarIndex;
    }

    @NotNull
    public final MutableLiveData<Float> getCurtProgressLiveData() {
        return this.curtProgressLiveData;
    }

    @NotNull
    public final TreeMap<Integer, Integer> getDisColorMap() {
        return this.disColorMap;
    }

    @NotNull
    public final TreeMap<Integer, Location> getDisLatLngMap() {
        return this.disLatLngMap;
    }

    @Nullable
    public final ArrayList<MapRotationData> getDynamicRotationList() {
        return this.dynamicRotationList;
    }

    @Nullable
    public final GpsValues getGpsValues() {
        return this.gpsValues;
    }

    @Nullable
    public final List<Uri> getImgUriList() {
        MutableLiveData<Map<Float, SportTracePointDataModel>> mutableLiveData = this.traceDataMapLiveData;
        Intrinsics.checkNotNull(mutableLiveData);
        SportTracePointDataModel tracePointDataModelByProgressValue = SportTraceVideoShareUtilKt.getTracePointDataModelByProgressValue(mutableLiveData, this.curtProgressLiveData);
        if (tracePointDataModelByProgressValue != null) {
            return tracePointDataModelByProgressValue.getImgUriList();
        }
        return null;
    }

    @NotNull
    public final ArrayList<LatLng> getLatLngList() {
        ArrayList<LatLng> arrayList = new ArrayList<>();
        ArrayList<Location> arrayList2 = this.mLocationList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        for (Location location : arrayList2) {
            double[] dArrC = bxa.c(location.latitude, location.longitude);
            arrayList3.add(Boolean.valueOf(arrayList.add(new LatLng(dArrC[0], dArrC[1]))));
        }
        return arrayList;
    }

    public final int getLocationDis() {
        return this.locationDis;
    }

    public final int getLocationTotalDis() {
        return this.locationTotalDis;
    }

    @Nullable
    public final SportBasicReport getMBasicReport() {
        return this.mBasicReport;
    }

    @NotNull
    public final List<rz5> getMDetailList() {
        return this.mDetailList;
    }

    @NotNull
    public final LinkedList<Location> getMKilometerList() {
        return this.mKilometerList;
    }

    @NotNull
    public final ArrayList<Location> getMLocationList() {
        return this.mLocationList;
    }

    @NotNull
    public final ArrayList<LatLng> getMOriginalList() {
        return this.mOriginalList;
    }

    @NotNull
    public final ArrayList<bmh> getMPathRecordList() {
        return this.mPathRecordList;
    }

    public final FitnessSportAlgo getMSportAlgo() {
        return this.mSportAlgo;
    }

    public final long getMTraceDuration() {
        return this.mTraceDuration;
    }

    @NotNull
    public final List<Integer> getMUniformOriginalColorList() {
        return this.mUniformOriginalColorList;
    }

    @NotNull
    public final ArrayList<Location> getMUniformOriginalList() {
        return this.mUniformOriginalList;
    }

    @Nullable
    public final MaxHeightMarker getMaxHeightMarker() {
        return this.maxHeightMarker;
    }

    @Nullable
    public final MaxPaceData getMaxPace() {
        return this.maxPace;
    }

    @Nullable
    public final MaxPaceMarker getMaxPaceMarker() {
        return this.maxPaceMarker;
    }

    @Nullable
    public final MaxRateMarker getMaxRateMarker() {
        return this.maxRateMarker;
    }

    @Nullable
    public final MaxSpeedData getMaxSpeed() {
        return this.maxSpeed;
    }

    @Nullable
    public final MaxSpeedMarker getMaxSpeedMarker() {
        return this.maxSpeedMarker;
    }

    @Nullable
    public final String getRecordFeeling() {
        MutableLiveData<Map<Float, SportTracePointDataModel>> mutableLiveData = this.traceDataMapLiveData;
        Intrinsics.checkNotNull(mutableLiveData);
        SportTracePointDataModel tracePointDataModelByProgressValue = SportTraceVideoShareUtilKt.getTracePointDataModelByProgressValue(mutableLiveData, this.curtProgressLiveData);
        String feelings = tracePointDataModelByProgressValue != null ? tracePointDataModelByProgressValue.getFeelings() : null;
        if (feelings == null || feelings.length() == 0) {
            return null;
        }
        return feelings;
    }

    @NotNull
    public final MutableLiveData<Uri> getRecordedVideoUriLiveData() {
        return this.recordedVideoUriLiveData;
    }

    public final int getSportDataType() {
        return this.sportDataType;
    }

    @NotNull
    public final MutableLiveData<Map<Float, SportTracePointDataModel>> getTraceDataMapLiveData() {
        return this.traceDataMapLiveData;
    }

    @NotNull
    public final MutableLiveData<TraceStyleResModel> getTraceStyleResModeLiveData() {
        return this.traceStyleResModeLiveData;
    }

    public final void initBundleParams(@Nullable Bundle bundle) {
        if (bundle != null) {
            SportBasicReport sportBasicReport = this.mBasicReport;
            this.gpsValues = o5o.e().c(bundle.getLong("time_stamp", sportBasicReport != null ? sportBasicReport.getTimeStamp() : 0L));
            this.sportDataType = bundle.getInt("sport_type", 22);
            this.mBasicReport = (SportBasicReport) bundle.getSerializable("sport_report");
            List<rz5> list = this.mDetailList;
            Application app = AppUtil.getApp();
            SportBasicReport sportBasicReport2 = this.mBasicReport;
            Intrinsics.checkNotNull(sportBasicReport2);
            SportShareUtil.createShareDataList(list, app, sportBasicReport2, SportShareUtil.getShareSportTypeInt2(this.sportDataType));
        }
    }

    @NotNull
    public final MutableLiveData<Boolean> isTrackDataLoad() {
        return this.isTrackDataLoad;
    }

    public final void setChangeItemA(@Nullable ChangeItem changeItem) {
        this.changeItemA = changeItem;
    }

    public final void setChangeItemB(@Nullable ChangeItem changeItem) {
        this.changeItemB = changeItem;
    }

    public final void setColorIndex(int i) {
        this.colorIndex = i;
    }

    public final void setColorStarIndex(int i) {
        this.colorStarIndex = i;
    }

    public final void setCurtProgressLiveData(@NotNull MutableLiveData<Float> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.curtProgressLiveData = mutableLiveData;
    }

    public final void setDisColorMap(@NotNull TreeMap<Integer, Integer> treeMap) {
        Intrinsics.checkNotNullParameter(treeMap, "<set-?>");
        this.disColorMap = treeMap;
    }

    public final void setDisLatLngMap(@NotNull TreeMap<Integer, Location> treeMap) {
        Intrinsics.checkNotNullParameter(treeMap, "<set-?>");
        this.disLatLngMap = treeMap;
    }

    public final void setDynamicRotationList(@Nullable ArrayList<MapRotationData> arrayList) {
        this.dynamicRotationList = arrayList;
    }

    public final void setGpsValues(@Nullable GpsValues gpsValues) {
        this.gpsValues = gpsValues;
    }

    public final void setLocationDis(int i) {
        this.locationDis = i;
    }

    public final void setLocationTotalDis(int i) {
        this.locationTotalDis = i;
    }

    public final void setMBasicReport(@Nullable SportBasicReport sportBasicReport) {
        this.mBasicReport = sportBasicReport;
    }

    public final void setMOriginalList(@NotNull ArrayList<LatLng> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mOriginalList = arrayList;
    }

    public final void setMTraceDuration(long j) {
        this.mTraceDuration = j;
    }

    public final void setMUniformOriginalColorList(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mUniformOriginalColorList = list;
    }

    public final void setMUniformOriginalList(@NotNull ArrayList<Location> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mUniformOriginalList = arrayList;
    }

    public final void setMaxHeightMarker(@Nullable MaxHeightMarker maxHeightMarker) {
        this.maxHeightMarker = maxHeightMarker;
    }

    public final void setMaxPace(@Nullable MaxPaceData maxPaceData) {
        this.maxPace = maxPaceData;
    }

    public final void setMaxPaceMarker(@Nullable MaxPaceMarker maxPaceMarker) {
        this.maxPaceMarker = maxPaceMarker;
    }

    public final void setMaxRateMarker(@Nullable MaxRateMarker maxRateMarker) {
        this.maxRateMarker = maxRateMarker;
    }

    public final void setMaxSpeed(@Nullable MaxSpeedData maxSpeedData) {
        this.maxSpeed = maxSpeedData;
    }

    public final void setMaxSpeedMarker(@Nullable MaxSpeedMarker maxSpeedMarker) {
        this.maxSpeedMarker = maxSpeedMarker;
    }

    public final void setRecordedVideoUriLiveData(@NotNull MutableLiveData<Uri> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.recordedVideoUriLiveData = mutableLiveData;
    }

    public final void setSportDataType(int i) {
        this.sportDataType = i;
    }

    public final void setTrackDataLoad(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.isTrackDataLoad = mutableLiveData;
    }

    public final void unselectAllIndicators() {
        MutableLiveData<Map<Float, SportTracePointDataModel>> mutableLiveData = this.traceDataMapLiveData;
        Intrinsics.checkNotNull(mutableLiveData);
        SportTraceVideoShareUtilKt.unselectAllIndicators(mutableLiveData, this.curtProgressLiveData);
    }

    public final void updateSelectedStatus(boolean selected) {
        MutableLiveData<Map<Float, SportTracePointDataModel>> mutableLiveData = this.traceDataMapLiveData;
        Intrinsics.checkNotNull(mutableLiveData);
        SportTraceVideoShareUtilKt.updateSelectStatus(mutableLiveData, this.curtProgressLiveData, selected);
    }
}
