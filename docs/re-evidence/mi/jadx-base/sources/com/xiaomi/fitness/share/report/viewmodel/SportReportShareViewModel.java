package com.xiaomi.fitness.share.report.viewmodel;

import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.LatLng;
import com.mi.health.map.data.GpsValues;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.SportReportKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.detail.data.BasicItemInfo;
import com.xiaomi.fitness.detail.model.SportsReportOperationalCourseData;
import com.xiaomi.fitness.detail.model.SportsReportOperationalCourseTrainSummary;
import com.xiaomi.fitness.detail.util.SportShareUtil;
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
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import com.xiaomi.fitness.share.report.viewmodel.SportReportShareViewModel;
import com.xiaomi.fitness.util.AMapPathUtils;
import defpackage.bmh;
import defpackage.bxa;
import defpackage.byi;
import defpackage.j1j;
import defpackage.lp5;
import defpackage.rz5;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\b¢\u0006\u0005\bÄ\u0001\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0004J\u001d\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R'\u0010.\u001a\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020,028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R2\u00108\u001a\u0012\u0012\u0004\u0012\u0002070+j\b\u0012\u0004\u0012\u000207`-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010/\u001a\u0004\b9\u00101\"\u0004\b:\u0010;R2\u0010<\u001a\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010/\u001a\u0004\b=\u00101\"\u0004\b>\u0010;R'\u0010@\u001a\u0012\u0012\u0004\u0012\u00020?0+j\b\u0012\u0004\u0012\u00020?`-8\u0006¢\u0006\f\n\u0004\b@\u0010/\u001a\u0004\bA\u00101R\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020C0B8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020C0B8\u0006¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\bI\u0010GR\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00180B8\u0006¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bK\u0010GR\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00180B8\u0006¢\u0006\f\n\u0004\bL\u0010E\u001a\u0004\bM\u0010GR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00180B8\u0006¢\u0006\f\n\u0004\bN\u0010E\u001a\u0004\bO\u0010GR\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0B8\u0006¢\u0006\f\n\u0004\bQ\u0010E\u001a\u0004\bR\u0010GR\"\u0010S\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010\u001a\u001a\u0004\bT\u0010\u001c\"\u0004\bU\u0010\u001eR\"\u0010V\u001a\u00020P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010\\\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010\u001a\u001a\u0004\b]\u0010\u001c\"\u0004\b^\u0010\u001eR\"\u0010_\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010\u001a\u001a\u0004\b`\u0010\u001c\"\u0004\ba\u0010\u001eR\"\u0010b\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010\u001a\u001a\u0004\bc\u0010\u001c\"\u0004\bd\u0010\u001eR$\u0010f\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010l\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010\u001a\u001a\u0004\bm\u0010\u001c\"\u0004\bn\u0010\u001eR$\u0010o\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010u\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010p\u001a\u0004\bv\u0010r\"\u0004\bw\u0010tR(\u0010y\u001a\b\u0012\u0004\u0012\u00020e0x8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010(\u001a\u0004\bz\u0010*\"\u0004\b{\u0010|R\"\u0010}\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010\u001a\u001a\u0004\b~\u0010\u001c\"\u0004\b\u007f\u0010\u001eR&\u0010\u0080\u0001\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010\u001a\u001a\u0005\b\u0081\u0001\u0010\u001c\"\u0005\b\u0082\u0001\u0010\u001eR6\u0010\u0084\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020,0\u0083\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R&\u0010\u008a\u0001\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010\u001a\u001a\u0005\b\u008b\u0001\u0010\u001c\"\u0005\b\u008c\u0001\u0010\u001eR&\u0010\u008d\u0001\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010\u001a\u001a\u0005\b\u008e\u0001\u0010\u001c\"\u0005\b\u008f\u0001\u0010\u001eR,\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R,\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R,\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R,\u0010¥\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010 \u0001\u001a\u0006\b¦\u0001\u0010¢\u0001\"\u0006\b§\u0001\u0010¤\u0001R,\u0010©\u0001\u001a\u0005\u0018\u00010¨\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R,\u0010°\u0001\u001a\u0005\u0018\u00010¯\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R,\u0010·\u0001\u001a\u0005\u0018\u00010¶\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R,\u0010¾\u0001\u001a\u0005\u0018\u00010½\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001¨\u0006Å\u0001"}, d2 = {"Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;", "Lcom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel;", "", "convertData", "()V", "getSportLabel", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initBundleParams", "(Landroid/os/Bundle;)V", "createDataList", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "basicReport", "Landroidx/lifecycle/LifecycleOwner;", "viewLifeCycle", "getSportName", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Landroidx/lifecycle/LifecycleOwner;)V", "Lcom/mi/health/map/data/GpsValues;", "gpsValues", "Lcom/mi/health/map/data/GpsValues;", "getGpsValues", "()Lcom/mi/health/map/data/GpsValues;", "setGpsValues", "(Lcom/mi/health/map/data/GpsValues;)V", "", "sportDataType", "I", "getSportDataType", "()I", "setSportDataType", "(I)V", "mBasicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getMBasicReport", "()Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "setMBasicReport", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "", "Lrz5;", "mDetailList", "Ljava/util/List;", "getMDetailList", "()Ljava/util/List;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "Lkotlin/collections/ArrayList;", "mLocationList", "Ljava/util/ArrayList;", "getMLocationList", "()Ljava/util/ArrayList;", "Ljava/util/LinkedList;", "mKilometerList", "Ljava/util/LinkedList;", "getMKilometerList", "()Ljava/util/LinkedList;", "Lcom/amap/api/maps/model/LatLng;", "mOriginalList", "getMOriginalList", "setMOriginalList", "(Ljava/util/ArrayList;)V", "mUniformOriginalList", "getMUniformOriginalList", "setMUniformOriginalList", "Lbmh;", "mPathRecordList", "getMPathRecordList", "Landroidx/lifecycle/MutableLiveData;", "", "editRatioTypeIsSquareLiveData", "Landroidx/lifecycle/MutableLiveData;", "getEditRatioTypeIsSquareLiveData", "()Landroidx/lifecycle/MutableLiveData;", "editPanelDataTabIsSelected", "getEditPanelDataTabIsSelected", "bgSelectedPositionLiveData", "getBgSelectedPositionLiveData", "squareBottomWindowPatternSelectedPosition", "getSquareBottomWindowPatternSelectedPosition", "editModeLiveData", "getEditModeLiveData", "", "sportNameString", "getSportNameString", "curtTabPosition", "getCurtTabPosition", "setCurtTabPosition", "slogValueTxt", "Ljava/lang/String;", "getSlogValueTxt", "()Ljava/lang/String;", "setSlogValueTxt", "(Ljava/lang/String;)V", "sloganTxtIndex", "getSloganTxtIndex", "setSloganTxtIndex", "sloganDataIndex", "getSloganDataIndex", "setSloganDataIndex", "currentStickerViewPosition", "getCurrentStickerViewPosition", "setCurrentStickerViewPosition", "Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "sloganDataModelInfo", "Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "getSloganDataModelInfo", "()Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "setSloganDataModelInfo", "(Lcom/xiaomi/fitness/detail/data/BasicItemInfo;)V", "chartDataPosition", "getChartDataPosition", "setChartDataPosition", "currentEditType", "Ljava/lang/Integer;", "getCurrentEditType", "()Ljava/lang/Integer;", "setCurrentEditType", "(Ljava/lang/Integer;)V", "currentEditBgPosition", "getCurrentEditBgPosition", "setCurrentEditBgPosition", "", "sportShowDataList", "getSportShowDataList", "setSportShowDataList", "(Ljava/util/List;)V", "mCustomizeSelectedTabPosition", "getMCustomizeSelectedTabPosition", "setMCustomizeSelectedTabPosition", "mJustDanceSongsSelectedTabPosition", "getMJustDanceSongsSelectedTabPosition", "setMJustDanceSongsSelectedTabPosition", "Ljava/util/TreeMap;", "disLatLngMap", "Ljava/util/TreeMap;", "getDisLatLngMap", "()Ljava/util/TreeMap;", "setDisLatLngMap", "(Ljava/util/TreeMap;)V", "locationDis", "getLocationDis", "setLocationDis", "locationTotalDis", "getLocationTotalDis", "setLocationTotalDis", "Lcom/xiaomi/fitness/share/amap/ext/MaxSpeedData;", "maxSpeed", "Lcom/xiaomi/fitness/share/amap/ext/MaxSpeedData;", "getMaxSpeed", "()Lcom/xiaomi/fitness/share/amap/ext/MaxSpeedData;", "setMaxSpeed", "(Lcom/xiaomi/fitness/share/amap/ext/MaxSpeedData;)V", "Lcom/xiaomi/fitness/share/amap/ext/MaxPaceData;", FitnessReportKey.maxPace, "Lcom/xiaomi/fitness/share/amap/ext/MaxPaceData;", "getMaxPace", "()Lcom/xiaomi/fitness/share/amap/ext/MaxPaceData;", "setMaxPace", "(Lcom/xiaomi/fitness/share/amap/ext/MaxPaceData;)V", "Lcom/xiaomi/fitness/share/amap/utils/ChangeItem;", "changeItemA", "Lcom/xiaomi/fitness/share/amap/utils/ChangeItem;", "getChangeItemA", "()Lcom/xiaomi/fitness/share/amap/utils/ChangeItem;", "setChangeItemA", "(Lcom/xiaomi/fitness/share/amap/utils/ChangeItem;)V", "changeItemB", "getChangeItemB", "setChangeItemB", "Lcom/xiaomi/fitness/share/amap/utils/MaxPaceMarker;", "maxPaceMarker", "Lcom/xiaomi/fitness/share/amap/utils/MaxPaceMarker;", "getMaxPaceMarker", "()Lcom/xiaomi/fitness/share/amap/utils/MaxPaceMarker;", "setMaxPaceMarker", "(Lcom/xiaomi/fitness/share/amap/utils/MaxPaceMarker;)V", "Lcom/xiaomi/fitness/share/amap/utils/MaxSpeedMarker;", "maxSpeedMarker", "Lcom/xiaomi/fitness/share/amap/utils/MaxSpeedMarker;", "getMaxSpeedMarker", "()Lcom/xiaomi/fitness/share/amap/utils/MaxSpeedMarker;", "setMaxSpeedMarker", "(Lcom/xiaomi/fitness/share/amap/utils/MaxSpeedMarker;)V", "Lcom/xiaomi/fitness/share/amap/utils/MaxRateMarker;", "maxRateMarker", "Lcom/xiaomi/fitness/share/amap/utils/MaxRateMarker;", "getMaxRateMarker", "()Lcom/xiaomi/fitness/share/amap/utils/MaxRateMarker;", "setMaxRateMarker", "(Lcom/xiaomi/fitness/share/amap/utils/MaxRateMarker;)V", "Lcom/xiaomi/fitness/share/amap/utils/MaxHeightMarker;", "maxHeightMarker", "Lcom/xiaomi/fitness/share/amap/utils/MaxHeightMarker;", "getMaxHeightMarker", "()Lcom/xiaomi/fitness/share/amap/utils/MaxHeightMarker;", "setMaxHeightMarker", "(Lcom/xiaomi/fitness/share/amap/utils/MaxHeightMarker;)V", "<init>", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportReportShareViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportReportShareViewModel.kt\ncom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,248:1\n1863#2,2:249\n1557#2:251\n1628#2,3:252\n*S KotlinDebug\n*F\n+ 1 SportReportShareViewModel.kt\ncom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel\n*L\n113#1:249,2\n119#1:251\n119#1:252,3\n*E\n"})
public final class SportReportShareViewModel extends SportRecordDetailViewModel {

    @Nullable
    private ChangeItem changeItemA;

    @Nullable
    private ChangeItem changeItemB;
    private int chartDataPosition;

    @Nullable
    private Integer currentEditBgPosition;

    @Nullable
    private Integer currentEditType;
    private int currentStickerViewPosition;

    @Nullable
    private GpsValues gpsValues;
    private int locationDis;
    private int locationTotalDis;

    @Nullable
    private SportBasicReport mBasicReport;
    private int mJustDanceSongsSelectedTabPosition;

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
    private int sloganDataIndex;

    @Nullable
    private BasicItemInfo sloganDataModelInfo;
    private int sloganTxtIndex;
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
    private final ArrayList<bmh> mPathRecordList = new ArrayList<>();

    @NotNull
    private final MutableLiveData<Boolean> editRatioTypeIsSquareLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> editPanelDataTabIsSelected = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Integer> bgSelectedPositionLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Integer> squareBottomWindowPatternSelectedPosition = new MutableLiveData<>(0);

    @NotNull
    private final MutableLiveData<Integer> editModeLiveData = new MutableLiveData<>(0);

    @NotNull
    private final MutableLiveData<String> sportNameString = new MutableLiveData<>("");
    private int curtTabPosition = -1;

    @NotNull
    private String slogValueTxt = SportReportShareExtKt.getSloganList().get(0);

    @NotNull
    private List<BasicItemInfo> sportShowDataList = new ArrayList();
    private int mCustomizeSelectedTabPosition = 2;

    @NotNull
    private TreeMap<Integer, Location> disLatLngMap = new TreeMap<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.report.viewmodel.SportReportShareViewModel$createDataList$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.share.report.viewmodel.SportReportShareViewModel$createDataList$3", f = "SportReportShareViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportReportShareViewModel.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<Location> list;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GpsValues gpsValues = SportReportShareViewModel.this.getGpsValues();
            if (gpsValues != null && (list = gpsValues.locationList) != null) {
                SportReportShareViewModel sportReportShareViewModel = SportReportShareViewModel.this;
                List<Location> listEvenlyDistributeLatLngs = LatLngsEvenlyDistributeUtilsKt.evenlyDistributeLatLngs(list);
                Intrinsics.checkNotNull(listEvenlyDistributeLatLngs, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fit.data.common.data.sport.Location>");
                sportReportShareViewModel.setMUniformOriginalList((ArrayList) listEvenlyDistributeLatLngs);
                Logger.d(SportRecordDetailViewModel.TAG, "mUniformOriginalList:" + sportReportShareViewModel.getMUniformOriginalList().size() + "  , mOriginalList:" + sportReportShareViewModel.getMOriginalList().size());
                sportReportShareViewModel.convertData();
                sportReportShareViewModel.getSportLabel();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void convertData() {
        ArrayList<Location> arrayList = this.mUniformOriginalList;
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
            this.disLatLngMap.put(Integer.valueOf(this.locationDis), arrayList.get(i2));
            this.locationDis += iCalculateLineDistance;
            i = i2;
        }
        this.locationTotalDis = this.locationDis;
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
            maxPaceData.setMaxPace((sportBasicReport2 == null || (maxPace = sportBasicReport2.getMaxPace()) == null) ? 0 : maxPace.intValue());
        }
        MaxSpeedData maxSpeedData = this.maxSpeed;
        if (maxSpeedData != null) {
            this.maxSpeedMarker = WonderfulMomentsHelperKt.getMaxSpeedMarker(this.mUniformOriginalList, maxSpeedData, this.locationTotalDis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSportName$lambda$6(SportReportShareViewModel this$0, SportBasicReport basicReport, SportsReportOperationalCourseData sportsReportOperationalCourseData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(basicReport, "$basicReport");
        if (sportsReportOperationalCourseData != null) {
            SportsReportOperationalCourseTrainSummary trainSummary = sportsReportOperationalCourseData.getTrainSummary();
            Integer numValueOf = trainSummary != null ? Integer.valueOf(trainSummary.getTrainTimes()) : null;
            String name = sportsReportOperationalCourseData.getCourseInfo().getName();
            if (!TextUtils.isEmpty(name)) {
                if (numValueOf == null || numValueOf.intValue() <= 0) {
                    this$0.sportNameString.postValue(lp5.c(lp5.a(basicReport)));
                } else {
                    this$0.sportNameString.postValue(ResourceExtKt.getString(j1j.course_record_summary, name, ResourceExtKt.getQuantityString(AppUtil.getApp(), byi.course_record_times, numValueOf.intValue(), numValueOf)));
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final void createDataList() {
        List<Location> list;
        Unit unit;
        if (this.gpsValues != null) {
            if (this.mLocationList.size() > 0) {
                this.mLocationList.clear();
            }
            ArrayList<Location> arrayList = this.mLocationList;
            GpsValues gpsValues = this.gpsValues;
            Intrinsics.checkNotNull(gpsValues);
            arrayList.addAll(gpsValues.locationList);
            for (Location location : this.mLocationList) {
                Logger.i(SportRecordDetailViewModel.TAG, location.latitude + "," + location.longitude);
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
                            Logger.i(SportRecordDetailViewModel.TAG, "kilo location:" + location3);
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
        }
    }

    @NotNull
    public final MutableLiveData<Integer> getBgSelectedPositionLiveData() {
        return this.bgSelectedPositionLiveData;
    }

    @Nullable
    public final ChangeItem getChangeItemA() {
        return this.changeItemA;
    }

    @Nullable
    public final ChangeItem getChangeItemB() {
        return this.changeItemB;
    }

    public final int getChartDataPosition() {
        return this.chartDataPosition;
    }

    @Nullable
    public final Integer getCurrentEditBgPosition() {
        return this.currentEditBgPosition;
    }

    @Nullable
    public final Integer getCurrentEditType() {
        return this.currentEditType;
    }

    public final int getCurrentStickerViewPosition() {
        return this.currentStickerViewPosition;
    }

    public final int getCurtTabPosition() {
        return this.curtTabPosition;
    }

    @NotNull
    public final TreeMap<Integer, Location> getDisLatLngMap() {
        return this.disLatLngMap;
    }

    @NotNull
    public final MutableLiveData<Integer> getEditModeLiveData() {
        return this.editModeLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getEditPanelDataTabIsSelected() {
        return this.editPanelDataTabIsSelected;
    }

    @NotNull
    public final MutableLiveData<Boolean> getEditRatioTypeIsSquareLiveData() {
        return this.editRatioTypeIsSquareLiveData;
    }

    @Nullable
    public final GpsValues getGpsValues() {
        return this.gpsValues;
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

    public final int getMCustomizeSelectedTabPosition() {
        return this.mCustomizeSelectedTabPosition;
    }

    @NotNull
    public final List<rz5> getMDetailList() {
        return this.mDetailList;
    }

    public final int getMJustDanceSongsSelectedTabPosition() {
        return this.mJustDanceSongsSelectedTabPosition;
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

    @NotNull
    public final String getSlogValueTxt() {
        return this.slogValueTxt;
    }

    public final int getSloganDataIndex() {
        return this.sloganDataIndex;
    }

    @Nullable
    public final BasicItemInfo getSloganDataModelInfo() {
        return this.sloganDataModelInfo;
    }

    public final int getSloganTxtIndex() {
        return this.sloganTxtIndex;
    }

    public final int getSportDataType() {
        return this.sportDataType;
    }

    public final void getSportName(@NotNull final SportBasicReport basicReport, @NotNull LifecycleOwner viewLifeCycle) {
        Intrinsics.checkNotNullParameter(basicReport, "basicReport");
        Intrinsics.checkNotNullParameter(viewLifeCycle, "viewLifeCycle");
        SportReportKey sportReportKey = FitnessPersistKey.INSTANCE.getSportReportKey(basicReport.getSportType());
        if (sportReportKey != null) {
            String sid = basicReport.getSid();
            if (sid == null) {
                sid = "";
            }
            String str = sid;
            String key = sportReportKey.getKey();
            long startTime = basicReport.getStartTime();
            long endTime = basicReport.getEndTime();
            Long cloudCourseId = basicReport.getCloudCourseId();
            getReportInfoFromNet(str, key, startTime, endTime, cloudCourseId != null ? cloudCourseId.toString() : null, basicReport.getCloudCourseSource());
        }
        getSportsReportOperationalCourseInfo().observe(viewLifeCycle, new SportReportShareViewModel$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jzn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportReportShareViewModel.getSportName$lambda$6(this.f23270a, basicReport, (SportsReportOperationalCourseData) obj);
            }
        }));
    }

    @NotNull
    public final MutableLiveData<String> getSportNameString() {
        return this.sportNameString;
    }

    @NotNull
    public final List<BasicItemInfo> getSportShowDataList() {
        return this.sportShowDataList;
    }

    @NotNull
    public final MutableLiveData<Integer> getSquareBottomWindowPatternSelectedPosition() {
        return this.squareBottomWindowPatternSelectedPosition;
    }

    public final void initBundleParams(@Nullable Bundle bundle) {
        if (bundle != null) {
            SportBasicReport sportBasicReport = this.mBasicReport;
            bundle.getLong("time_stamp", sportBasicReport != null ? sportBasicReport.getTimeStamp() : 0L);
            this.sportDataType = bundle.getInt("sport_type", 22);
            this.mBasicReport = (SportBasicReport) bundle.getSerializable("sport_report");
            List<rz5> list = this.mDetailList;
            Application app = AppUtil.getApp();
            SportBasicReport sportBasicReport2 = this.mBasicReport;
            Intrinsics.checkNotNull(sportBasicReport2);
            SportShareUtil.createShareDataList(list, app, sportBasicReport2, SportShareUtil.getShareSportTypeInt2(this.sportDataType));
        }
    }

    public final void setChangeItemA(@Nullable ChangeItem changeItem) {
        this.changeItemA = changeItem;
    }

    public final void setChangeItemB(@Nullable ChangeItem changeItem) {
        this.changeItemB = changeItem;
    }

    public final void setChartDataPosition(int i) {
        this.chartDataPosition = i;
    }

    public final void setCurrentEditBgPosition(@Nullable Integer num) {
        this.currentEditBgPosition = num;
    }

    public final void setCurrentEditType(@Nullable Integer num) {
        this.currentEditType = num;
    }

    public final void setCurrentStickerViewPosition(int i) {
        this.currentStickerViewPosition = i;
    }

    public final void setCurtTabPosition(int i) {
        this.curtTabPosition = i;
    }

    public final void setDisLatLngMap(@NotNull TreeMap<Integer, Location> treeMap) {
        Intrinsics.checkNotNullParameter(treeMap, "<set-?>");
        this.disLatLngMap = treeMap;
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

    public final void setMCustomizeSelectedTabPosition(int i) {
        this.mCustomizeSelectedTabPosition = i;
    }

    public final void setMJustDanceSongsSelectedTabPosition(int i) {
        this.mJustDanceSongsSelectedTabPosition = i;
    }

    public final void setMOriginalList(@NotNull ArrayList<LatLng> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mOriginalList = arrayList;
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

    public final void setSlogValueTxt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.slogValueTxt = str;
    }

    public final void setSloganDataIndex(int i) {
        this.sloganDataIndex = i;
    }

    public final void setSloganDataModelInfo(@Nullable BasicItemInfo basicItemInfo) {
        this.sloganDataModelInfo = basicItemInfo;
    }

    public final void setSloganTxtIndex(int i) {
        this.sloganTxtIndex = i;
    }

    public final void setSportDataType(int i) {
        this.sportDataType = i;
    }

    public final void setSportShowDataList(@NotNull List<BasicItemInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sportShowDataList = list;
    }
}
