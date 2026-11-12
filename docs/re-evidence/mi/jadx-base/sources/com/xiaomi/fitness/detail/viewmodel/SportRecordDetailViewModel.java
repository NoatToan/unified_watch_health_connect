package com.xiaomi.fitness.detail.viewmodel;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import androidx.lifecycle.ViewModelKt;
import com.mi.health.course.export.data.CourseInfoItem;
import com.mi.health.course.export.data.CourseItem;
import com.mi.health.map.data.GpsValues;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.RecoverRateData;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.detail.GpsValuesExKt;
import com.xiaomi.fitness.detail.data.BasicItemInfo;
import com.xiaomi.fitness.detail.data.SportShareRes;
import com.xiaomi.fitness.detail.model.SportReportDivingInfo;
import com.xiaomi.fitness.detail.model.SportReportDivingPointItem;
import com.xiaomi.fitness.detail.model.SportsReportOperationalCourseData;
import com.xiaomi.fitness.detail.model.SportsReportOperationalInfo;
import com.xiaomi.fitness.detail.model.SportsReportOperationalRouteInfo;
import com.xiaomi.fitness.detail.util.SportDetailUtil;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.feedback.export.UploadFileManager;
import com.xiaomi.fitness.feedback.export.UploadFileManagerExtKt;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.fitness.feedback.export.data.UploadFileModel;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.SportRecordDivingPointRequest;
import com.xiaomi.fitness.net.SportRecordRouteRequest;
import com.xiaomi.fitness.net.SportRequest;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
import com.xiaomi.fitness.route.export.track.UploadUrl;
import com.xiaomi.fitness.route.export.track.UploadUserRoute;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.summary.recycler.SportBehaviorModel;
import com.xiaomi.fitness.util.SportRecordUtil;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.wearable.gpsalgorithm.data.GpsTrackData;
import defpackage.ben;
import defpackage.j1j;
import defpackage.o5o;
import defpackage.s2b;
import defpackage.t4i;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 «\u00012\u00020\u0001:\u0002«\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010E\u001a\u00020\u0005J\u0006\u0010H\u001a\u00020\u0005J\u0006\u0010O\u001a\u00020\u0005J\u001c\u0010O\u001a\u00020\u00052\u0014\u0010P\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010G\u0012\u0004\u0012\u00020\u00050QJ\u000e\u0010R\u001a\u00020\u00052\u0006\u0010S\u001a\u000207J\u0010\u0010T\u001a\u00020\u00052\b\u0010U\u001a\u0004\u0018\u00010VJ\u0010\u0010W\u001a\u00020\u00052\b\u0010U\u001a\u0004\u0018\u00010VJ\u0010\u0010X\u001a\u00020\u00052\b\u0010U\u001a\u0004\u0018\u00010VJ6\u0010Y\u001a\u00020\u00052$\u0010Z\u001a \u0012\u0004\u0012\u00020\u000b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\n0\n2\u0006\u0010U\u001a\u00020VH\u0002J\u0010\u0010[\u001a\u00020\u00052\b\u0010U\u001a\u0004\u0018\u00010VJ6\u0010\\\u001a\u00020\u00152\f\u0010]\u001a\b\u0012\u0004\u0012\u00020^0\r2\u0006\u0010U\u001a\u00020V2\u0010\b\u0002\u0010_\u001a\n\u0012\u0004\u0012\u00020`\u0018\u00010\rH\u0082@¢\u0006\u0002\u0010aJD\u0010\\\u001a\u00020\u00152\u0006\u0010U\u001a\u00020V2\u000e\u0010_\u001a\n\u0012\u0004\u0012\u00020`\u0018\u00010\r2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020c0\r2\u000e\u0010]\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010\rH\u0082@¢\u0006\u0002\u0010dJ,\u0010e\u001a\u00020\u00052\u0018\u0010Z\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\n2\b\u0010U\u001a\u0004\u0018\u00010VH\u0002J6\u0010f\u001a\u00020\u00052$\u0010Z\u001a \u0012\u0004\u0012\u00020\u000b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\n0\n2\u0006\u0010U\u001a\u00020VH\u0002J8\u0010g\u001a\u00020\u00052$\u0010Z\u001a \u0012\u0004\u0012\u00020\u000b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\n0\n2\b\u0010U\u001a\u0004\u0018\u00010VH\u0002J\u0010\u0010h\u001a\u00020;2\b\u0010U\u001a\u0004\u0018\u00010VJ\u0018\u0010i\u001a\u00020\u00052\u0006\u0010j\u001a\u00020V2\u0006\u0010k\u001a\u00020\u0015H\u0002J\u001f\u0010i\u001a\u00020\u00052\b\u0010l\u001a\u0004\u0018\u00010\u000b2\u0006\u0010k\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010mJ\u0012\u0010n\u001a\u00020\u00052\b\u0010o\u001a\u0004\u0018\u00010pH\u0016J&\u0010s\u001a\u00020\u00052\u0006\u0010t\u001a\u00020;2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020zJ\"\u0010}\u001a\u00020\u00052\u0006\u0010~\u001a\u00020;2\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020\u00050QJI\u0010\u0086\u0001\u001a\u00020\u00052\u0007\u0010\u0087\u0001\u001a\u00020x2\u0007\u0010\u0088\u0001\u001a\u00020x2\b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010x2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u000b¢\u0006\u0003\u0010\u008e\u0001J\u0010\u0010\u0092\u0001\u001a\u00020\u00052\u0007\u0010\u0093\u0001\u001a\u00020\u000bJ\u0018\u0010\u0094\u0001\u001a\u00020\u00052\u0006\u0010U\u001a\u00020V2\u0007\u0010\u0095\u0001\u001a\u00020\u000bJ\u0014\u0010\u0096\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u0097\u0001\u001a\u00020\u000bH\u0002J8\u0010\u0098\u0001\u001a\u00020\u00052\u0007\u0010\u0099\u0001\u001a\u00020x2\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u000b2\b\u0010\u009b\u0001\u001a\u00030\u009c\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0086@¢\u0006\u0003\u0010\u009f\u0001J\u0011\u0010£\u0001\u001a\u00020\u00052\b\u0010¤\u0001\u001a\u00030\u008a\u0001J\u0011\u0010¨\u0001\u001a\u00020\u00052\b\u0010©\u0001\u001a\u00030ª\u0001R5\u0010\b\u001a&\u0012\"\u0012 \u0012\u0004\u0012\u00020\u000b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\n0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R)\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00120\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001f\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\r0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\r0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\r0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0010R\u001f\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\r0\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0010R\u001f\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\r0\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0010R)\u0010$\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0010R)\u0010&\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0010R)\u0010(\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0010R\u001f\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\r0\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0010R\u001f\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\r0\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0010R\u001f\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\r0\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0010R \u00100\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R!\u00101\u001a\b\u0012\u0004\u0012\u0002020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b3\u0010\u0010R!\u00106\u001a\b\u0012\u0004\u0012\u0002070\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b8\u0010\u0010R \u0010:\u001a\b\u0012\u0004\u0012\u00020;0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0010\"\u0004\b=\u0010>R \u0010?\u001a\b\u0012\u0004\u0012\u00020;0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0010\"\u0004\bA\u0010>R\u0019\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C0\t¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0010R\"\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0010\"\u0004\bI\u0010>R\u001c\u0010J\u001a\u0004\u0018\u00010GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0017\u0010q\u001a\b\u0012\u0004\u0012\u00020;0\t¢\u0006\b\n\u0000\u001a\u0004\br\u0010\u0010R\u0010\u0010{\u001a\u0004\u0018\u00010|X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0080\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0081\u00010\t¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u0010R\u001c\u0010\u0083\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0084\u00010\t¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010\u0010R\u001c\u0010\u008f\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0090\u00010\t¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010\u0010R \u0010 \u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¡\u00010\r0\t¢\u0006\t\n\u0000\u001a\u0005\b¢\u0001\u0010\u0010R\u001a\u0010¥\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u00010\t¢\u0006\t\n\u0000\u001a\u0005\b§\u0001\u0010\u0010¨\u0006¬\u0001"}, d2 = {"Lcom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "unRegisterObserver", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "recordTriathlonDetailMaps", "Landroidx/lifecycle/MutableLiveData;", "", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "getRecordTriathlonDetailMaps", "()Landroidx/lifecycle/MutableLiveData;", "recordDetailMaps", "", "getRecordDetailMaps", "gpsValuesLiveData", "Lcom/mi/health/map/data/GpsValues;", "getGpsValuesLiveData", "behaviorListData", "Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;", "getBehaviorListData", "basicItemInfoLiveData", "Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "getBasicItemInfoLiveData", "extraBasicItemInfoLiveData", "getExtraBasicItemInfoLiveData", "divingOutGpsValues", "", "getDivingOutGpsValues", "divingInGpsValues", "getDivingInGpsValues", "triathlonSwimMaps", "getTriathlonSwimMaps", "triathlonRunMaps", "getTriathlonRunMaps", "triathlonRidMaps", "getTriathlonRidMaps", "triathlonSwimBehaviorLiveData", "getTriathlonSwimBehaviorLiveData", "triathlonRunBehaviorLiveData", "getTriathlonRunBehaviorLiveData", "triathlonRidBehaviorLiveData", "getTriathlonRidBehaviorLiveData", "mRecordDetailMap", "configLiveData", "Lcom/xiaomi/fitness/detail/data/SportShareRes;", "getConfigLiveData", "configLiveData$delegate", "Lkotlin/Lazy;", "pathLiveData", "Landroid/graphics/Path;", "getPathLiveData", "pathLiveData$delegate", "abnormalFlag", "", "getAbnormalFlag", "setAbnormalFlag", "(Landroidx/lifecycle/MutableLiveData;)V", "showExpandViewFlag", "getShowExpandViewFlag", "setShowExpandViewFlag", "recoverRateDataLiveData", "Lcom/xiaomi/fit/data/common/data/sport/RecoverRateData;", "getRecoverRateDataLiveData", "reqConfig", "userInfoLiveData", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getUserInfoLiveData", "setUserInfoLiveData", "profileInfo", "getProfileInfo", "()Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "setProfileInfo", "(Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;)V", "getUserInfo", "account", "Lkotlin/Function1;", "setGpsPath", "path", "getGPSAndRecordData", "report", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getCompactTraceBasicCardDataList", "getSportData", "getSportRecordData", "map", "requestRecoverRateData", "createGpsValue", "gpsList", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "pauseRecordList", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "(Ljava/util/List;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tgcData", "", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCommonGpsValue", "loadTSkiingGpsValue", "loadTriathlonGpsValue", "supportGpsSport", "addLocationList", "basicReport", "gpsValues", "sportNum", "(Ljava/lang/Integer;Lcom/mi/health/map/data/GpsValues;)V", "attach", "savedInstanceState", "Landroid/os/Bundle;", "feedbackLiveData", "getFeedbackLiveData", "uploadInfo", "isUploadFile", "feedBackModel", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData;", "logPath", "", "gpsLogFile", "Ljava/io/File;", "uploadFileResult", "Lcom/xiaomi/fitness/feedback/export/data/UploadFileModel$UploadFileResult;", "getUploadFileInfo", "showLoading", "success", "sportsReportOperationalRouteInfo", "Lcom/xiaomi/fitness/detail/model/SportsReportOperationalRouteInfo;", "getSportsReportOperationalRouteInfo", "sportsReportOperationalCourseInfo", "Lcom/xiaomi/fitness/detail/model/SportsReportOperationalCourseData;", "getSportsReportOperationalCourseInfo", "getReportInfoFromNet", "sid", "key", SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, "", SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, "course_id", "source_type", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/Integer;)V", "sportsReportDivingPointInfo", "Lcom/xiaomi/fitness/detail/model/SportReportDivingPointItem;", "getSportsReportDivingPointInfo", "getDivingPointNameFromNet", "pointId", "updateBasic", DailyRecordKey.sportType, "toastTrack", "msgRes", "uploadTrack", "filePath", "distance", "recorder", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "bitmap", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/xiaomi/fitness/route/export/track/Recorder;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "switchJustDanceList", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;", "getSwitchJustDanceList", "getSwitchDanceSongs", SportConstants.KEY_TIMESTAMP, "courseInfoResult", "Lcom/mi/health/course/export/data/CourseInfoItem;", "getCourseInfoResult", "getCourseInfo", "reqItem", "Lcom/mi/health/course/export/data/CourseItem;", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportRecordDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordDetailViewModel.kt\ncom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,806:1\n216#2,2:807\n216#2,2:816\n216#2,2:818\n487#3,7:809\n*S KotlinDebug\n*F\n+ 1 SportRecordDetailViewModel.kt\ncom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel\n*L\n297#1:807,2\n415#1:816,2\n446#1:818,2\n375#1:809,7\n*E\n"})
public class SportRecordDetailViewModel extends AbsViewModel {
    public static final int MODULE_ID = 239;
    public static final int MODULE_WEARABLE_ID = 273;

    @NotNull
    public static final String TAG = "SportRecordDetailViewModel";

    @Nullable
    private AccountCoreInfo profileInfo;

    @Nullable
    private UploadFileModel.UploadFileResult uploadFileResult;

    @NotNull
    private final MutableLiveData<Map<Integer, Map<SportRecordKey, List<Object>>>> recordTriathlonDetailMaps = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Map<SportRecordKey, List<Object>>> recordDetailMaps = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<GpsValues> gpsValuesLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<List<SportBehaviorModel>> behaviorListData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<List<BasicItemInfo>> basicItemInfoLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<List<BasicItemInfo>> extraBasicItemInfoLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<List<Double>> divingOutGpsValues = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<List<Double>> divingInGpsValues = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonSwimMaps = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonRunMaps = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonRidMaps = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<List<SportBehaviorModel>> triathlonSwimBehaviorLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<List<SportBehaviorModel>> triathlonRunBehaviorLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<List<SportBehaviorModel>> triathlonRidBehaviorLiveData = new MutableLiveData<>();

    @NotNull
    private final Map<SportRecordKey, List<Object>> mRecordDetailMap = new LinkedHashMap();

    /* JADX INFO: renamed from: configLiveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy configLiveData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qtn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportRecordDetailViewModel.configLiveData_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: pathLiveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy pathLiveData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rtn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportRecordDetailViewModel.pathLiveData_delegate$lambda$1();
        }
    });

    @NotNull
    private MutableLiveData<Boolean> abnormalFlag = new MutableLiveData<>(Boolean.FALSE);

    @NotNull
    private MutableLiveData<Boolean> showExpandViewFlag = new MutableLiveData<>(Boolean.TRUE);

    @NotNull
    private final MutableLiveData<RecoverRateData> recoverRateDataLiveData = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<AccountCoreInfo> userInfoLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> feedbackLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<SportsReportOperationalRouteInfo> sportsReportOperationalRouteInfo = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<SportsReportOperationalCourseData> sportsReportOperationalCourseInfo = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<SportReportDivingPointItem> sportsReportDivingPointInfo = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<List<SwitchSongItem>> switchJustDanceList = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<CourseInfoItem> courseInfoResult = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$createGpsValue$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel", f = "SportRecordDetailViewModel.kt", i = {0, 1}, l = {344, 345}, m = "createGpsValue", n = {"gpsValues", "gpsValues"}, s = {"L$0", "L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportRecordDetailViewModel.this.createGpsValue(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$createGpsValue$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel", f = "SportRecordDetailViewModel.kt", i = {0, 1}, l = {364, 365}, m = "createGpsValue", n = {"gpsValues", "gpsValues"}, s = {"L$0", "L$0"})
    public static final class AnonymousClass2 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportRecordDetailViewModel.this.createGpsValue(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$getCompactTraceBasicCardDataList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$getCompactTraceBasicCardDataList$1", f = "SportRecordDetailViewModel.kt", i = {}, l = {244}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSportRecordDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordDetailViewModel.kt\ncom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel$getCompactTraceBasicCardDataList$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,806:1\n216#2,2:807\n*S KotlinDebug\n*F\n+ 1 SportRecordDetailViewModel.kt\ncom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel$getCompactTraceBasicCardDataList$1\n*L\n249#1:807,2\n*E\n"})
    public static final class C18771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SportBasicReport $report;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ SportRecordDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18771(SportBasicReport sportBasicReport, SportRecordDetailViewModel sportRecordDetailViewModel, Continuation<? super C18771> continuation) {
            super(2, continuation);
            this.$report = sportBasicReport;
            this.this$0 = sportRecordDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C18771(this.$report, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SportBasicReport sportBasicReport;
            SportRecordDetailViewModel sportRecordDetailViewModel;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String sid = this.$report.getSid();
                if (sid != null) {
                    sportBasicReport = this.$report;
                    SportRecordDetailViewModel sportRecordDetailViewModel2 = this.this$0;
                    FitnessDataGetter fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
                    this.L$0 = sportBasicReport;
                    this.L$1 = sportRecordDetailViewModel2;
                    this.label = 1;
                    obj = fitnessDataExtKt.getSportRecordData(sid, sportBasicReport, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportRecordDetailViewModel = sportRecordDetailViewModel2;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sportRecordDetailViewModel = (SportRecordDetailViewModel) this.L$1;
            sportBasicReport = (SportBasicReport) this.L$0;
            ResultKt.throwOnFailure(obj);
            Map<Integer, Map<SportRecordKey, List<Object>>> map = (Map) obj;
            if (sportBasicReport.getSportType() != 17) {
                if (map.isEmpty()) {
                    sportRecordDetailViewModel.getRecordDetailMaps().postValue(sportRecordDetailViewModel.mRecordDetailMap);
                } else {
                    Iterator<Map.Entry<Integer, Map<SportRecordKey, List<Object>>>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map<SportRecordKey, List<Object>> value = it.next().getValue();
                        Map map2 = sportRecordDetailViewModel.mRecordDetailMap;
                        SportRecordKey sportRecordKey = SportRecordKey.Speed;
                        if (map2.containsKey(sportRecordKey)) {
                            sportRecordDetailViewModel.mRecordDetailMap.remove(sportRecordKey);
                        }
                        sportRecordDetailViewModel.mRecordDetailMap.putAll(value);
                    }
                    sportRecordDetailViewModel.getRecordDetailMaps().postValue(sportRecordDetailViewModel.mRecordDetailMap);
                }
                List<SportBehaviorModel> listB = ben.b(sportBasicReport);
                Intrinsics.checkNotNull(listB);
                if (!listB.isEmpty()) {
                    sportRecordDetailViewModel.getBehaviorListData().postValue(listB);
                }
            } else {
                sportRecordDetailViewModel.getRecordTriathlonDetailMaps().postValue(map);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$getCourseInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$getCourseInfo$1", f = "SportRecordDetailViewModel.kt", i = {}, l = {796, 798}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CourseItem $reqItem;
        int label;
        final /* synthetic */ SportRecordDetailViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$getCourseInfo$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$getCourseInfo$1$1", f = "SportRecordDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CourseInfoItem $result;
            int label;
            final /* synthetic */ SportRecordDetailViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04091(SportRecordDetailViewModel sportRecordDetailViewModel, CourseInfoItem courseInfoItem, Continuation<? super C04091> continuation) {
                super(2, continuation);
                this.this$0 = sportRecordDetailViewModel;
                this.$result = courseInfoItem;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04091(this.this$0, this.$result, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.getCourseInfoResult().postValue(this.$result);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18781(CourseItem courseItem, SportRecordDetailViewModel sportRecordDetailViewModel, Continuation<? super C18781> continuation) {
            super(2, continuation);
            this.$reqItem = courseItem;
            this.this$0 = sportRecordDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C18781(this.$reqItem, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                FitnessDataGetter fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
                CourseItem courseItem = this.$reqItem;
                this.label = 1;
                obj = fitnessDataExtKt.getCourseInfo(courseItem, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                CourseInfoItem courseInfoItem = (CourseInfoItem) obj;
                Logger.d(SportRecordDetailViewModel.TAG, "sport detail getCourseInfo params:" + this.$reqItem + " - result:" + courseInfoItem);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C04091 c04091 = new C04091(this.this$0, courseInfoItem, null);
                this.label = 2;
                if (BuildersKt.withContext(main, c04091, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e) {
                Logger.i(SportRecordDetailViewModel.TAG, "getCourseInfo fail" + e.getMessage());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$getGPSAndRecordData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$getGPSAndRecordData$1", f = "SportRecordDetailViewModel.kt", i = {0, 1}, l = {166, 169}, m = "invokeSuspend", n = {"it", "recordMap"}, s = {"L$2", "L$2"})
    @SourceDebugExtension({"SMAP\nSportRecordDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordDetailViewModel.kt\ncom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel$getGPSAndRecordData$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,806:1\n216#2,2:807\n*S KotlinDebug\n*F\n+ 1 SportRecordDetailViewModel.kt\ncom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel$getGPSAndRecordData$1\n*L\n211#1:807,2\n*E\n"})
    public static final class C18791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SportBasicReport $report;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ SportRecordDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18791(SportBasicReport sportBasicReport, SportRecordDetailViewModel sportRecordDetailViewModel, Continuation<? super C18791> continuation) {
            super(2, continuation);
            this.$report = sportBasicReport;
            this.this$0 = sportRecordDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C18791(this.$report, this.this$0, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x008b  */
        /* JADX WARN: Code duplicated, block: B:24:0x008f  */
        /* JADX WARN: Code duplicated, block: B:26:0x0094  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:34:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:40:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:43:0x0100  */
        /* JADX WARN: Code duplicated, block: B:46:0x0107  */
        /* JADX WARN: Code duplicated, block: B:47:0x010d  */
        /* JADX WARN: Code duplicated, block: B:50:0x0116  */
        /* JADX WARN: Code duplicated, block: B:51:0x0136  */
        /* JADX WARN: Code duplicated, block: B:54:0x0158  */
        /* JADX WARN: Code duplicated, block: B:55:0x015e  */
        /* JADX WARN: Code duplicated, block: B:58:0x0165  */
        /* JADX WARN: Code duplicated, block: B:61:0x0170  */
        /* JADX WARN: Code duplicated, block: B:62:0x0190  */
        /* JADX WARN: Code duplicated, block: B:68:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:69:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:74:0x00e7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:0x00e7 A[SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:40:0x00ef, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:51:0x0136, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:62:0x0190, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SportBasicReport sportBasicReport;
            String str;
            SportRecordDetailViewModel sportRecordDetailViewModel;
            Map map;
            SportBasicReport sportBasicReport2;
            Map map2;
            int protoType;
            Float waterOutletLatitude;
            double dFloatValue;
            Float waterOutletLongitude;
            double dFloatValue2;
            Float waterInletLatitude;
            double dFloatValue3;
            double dFloatValue4;
            Map map3;
            Map mutableMap;
            SportRecordKey sportRecordKey;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String sid = this.$report.getSid();
                if (sid != null) {
                    SportBasicReport sportBasicReport3 = this.$report;
                    SportRecordDetailViewModel sportRecordDetailViewModel2 = this.this$0;
                    FitnessDataGetter fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
                    this.L$0 = sportBasicReport3;
                    this.L$1 = sportRecordDetailViewModel2;
                    this.L$2 = sid;
                    this.label = 1;
                    Object sportRecordData = fitnessDataExtKt.getSportRecordData(sid, sportBasicReport3, this);
                    if (sportRecordData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportBasicReport = sportBasicReport3;
                    obj = sportRecordData;
                    str = sid;
                    sportRecordDetailViewModel = sportRecordDetailViewModel2;
                }
                return Unit.INSTANCE;
            }
            if (i == 1) {
                String str2 = (String) this.L$2;
                SportRecordDetailViewModel sportRecordDetailViewModel3 = (SportRecordDetailViewModel) this.L$1;
                sportBasicReport = (SportBasicReport) this.L$0;
                ResultKt.throwOnFailure(obj);
                str = str2;
                sportRecordDetailViewModel = sportRecordDetailViewModel3;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (Map) this.L$2;
                sportRecordDetailViewModel = (SportRecordDetailViewModel) this.L$1;
                sportBasicReport2 = (SportBasicReport) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            map2 = (Map) obj;
            protoType = sportBasicReport2.getProtoType();
            if (protoType != 17) {
                sportRecordDetailViewModel.loadTriathlonGpsValue(map2, sportBasicReport2);
            } else if (protoType != 21) {
                sportRecordDetailViewModel.loadTSkiingGpsValue(map2, sportBasicReport2);
            } else if (protoType != 25) {
                waterOutletLatitude = sportBasicReport2.getWaterOutletLatitude();
                if (waterOutletLatitude != null) {
                    dFloatValue = waterOutletLatitude.floatValue();
                } else {
                    dFloatValue = 10000.0d;
                }
                waterOutletLongitude = sportBasicReport2.getWaterOutletLongitude();
                if (waterOutletLongitude != null) {
                    dFloatValue2 = waterOutletLongitude.floatValue();
                } else {
                    dFloatValue2 = 10000.0d;
                }
                if (sportBasicReport2.divingOutPositionValid()) {
                    s2b s2bVarB = t4i.b(dFloatValue, dFloatValue2);
                    sportRecordDetailViewModel.getDivingOutGpsValues().postValue(CollectionsKt__CollectionsKt.listOf((Object[]) new Double[]{Boxing.boxDouble(s2bVarB.f33203a), Boxing.boxDouble(s2bVarB.f33204b)}));
                } else {
                    Logger.i("divingGpsValues", "outLatitude " + dFloatValue + " outLongitude " + dFloatValue2);
                }
                waterInletLatitude = sportBasicReport2.getWaterInletLatitude();
                if (waterInletLatitude != null) {
                    dFloatValue3 = waterInletLatitude.floatValue();
                } else {
                    dFloatValue3 = 10000.0d;
                }
                Float waterInletLongitude = sportBasicReport2.getWaterInletLongitude();
                dFloatValue4 = waterInletLongitude != null ? waterInletLongitude.floatValue() : 10000.0d;
                if (sportBasicReport2.divingInPositionValid()) {
                    s2b s2bVarB2 = t4i.b(dFloatValue3, dFloatValue4);
                    sportRecordDetailViewModel.getDivingInGpsValues().postValue(CollectionsKt__CollectionsKt.listOf((Object[]) new Double[]{Boxing.boxDouble(s2bVarB2.f33203a), Boxing.boxDouble(s2bVarB2.f33204b)}));
                } else {
                    Logger.i("divingGpsValues", "inLatitude " + dFloatValue3 + " inLongitude " + dFloatValue4);
                }
                if (!sportBasicReport2.divingInPositionValid() && !sportBasicReport2.divingOutPositionValid()) {
                    Logger.i("divingGpsValues null", new Object[0]);
                    sportRecordDetailViewModel.getDivingInGpsValues().postValue(null);
                    sportRecordDetailViewModel.getDivingOutGpsValues().postValue(null);
                }
            } else if (map2.isEmpty() || !FitnessSportTypeUtils.INSTANCE.supportGpsSport(sportBasicReport2)) {
                for (Map.Entry entry : map2.entrySet()) {
                    map3 = (Map) map.get(entry.getKey());
                    mutableMap = MapsKt__MapsKt.toMutableMap((Map) entry.getValue());
                    if (map3 != null) {
                        sportRecordKey = SportRecordKey.RecordPauseDetailInfo;
                        if (map3.containsKey(sportRecordKey)) {
                            Object obj2 = map3.get(sportRecordKey);
                            Intrinsics.checkNotNull(obj2);
                            mutableMap.put(sportRecordKey, obj2);
                        }
                    }
                    sportRecordDetailViewModel.loadCommonGpsValue(MapsKt__MapsKt.toMap(mutableMap), sportBasicReport2);
                }
            } else {
                sportRecordDetailViewModel.getGpsValuesLiveData().postValue(null);
            }
            return Unit.INSTANCE;
            Map map4 = (Map) obj;
            sportRecordDetailViewModel.getSportRecordData(map4, sportBasicReport);
            FitnessDataGetter fitnessDataExtKt2 = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
            this.L$0 = sportBasicReport;
            this.L$1 = sportRecordDetailViewModel;
            this.L$2 = map4;
            this.label = 2;
            Object sportGpsData = fitnessDataExtKt2.getSportGpsData(str, sportBasicReport, this);
            if (sportGpsData == coroutine_suspended) {
                return coroutine_suspended;
            }
            map = map4;
            obj = sportGpsData;
            sportBasicReport2 = sportBasicReport;
            map2 = (Map) obj;
            protoType = sportBasicReport2.getProtoType();
            if (protoType != 17) {
                sportRecordDetailViewModel.loadTriathlonGpsValue(map2, sportBasicReport2);
            } else if (protoType != 21) {
                sportRecordDetailViewModel.loadTSkiingGpsValue(map2, sportBasicReport2);
            } else if (protoType != 25) {
                waterOutletLatitude = sportBasicReport2.getWaterOutletLatitude();
                if (waterOutletLatitude != null) {
                    dFloatValue = waterOutletLatitude.floatValue();
                } else {
                    dFloatValue = 10000.0d;
                }
                waterOutletLongitude = sportBasicReport2.getWaterOutletLongitude();
                if (waterOutletLongitude != null) {
                    dFloatValue2 = waterOutletLongitude.floatValue();
                } else {
                    dFloatValue2 = 10000.0d;
                }
                if (sportBasicReport2.divingOutPositionValid()) {
                    s2b s2bVarB3 = t4i.b(dFloatValue, dFloatValue2);
                    sportRecordDetailViewModel.getDivingOutGpsValues().postValue(CollectionsKt__CollectionsKt.listOf((Object[]) new Double[]{Boxing.boxDouble(s2bVarB3.f33203a), Boxing.boxDouble(s2bVarB3.f33204b)}));
                } else {
                    Logger.i("divingGpsValues", "outLatitude " + dFloatValue + " outLongitude " + dFloatValue2);
                }
                waterInletLatitude = sportBasicReport2.getWaterInletLatitude();
                if (waterInletLatitude != null) {
                    dFloatValue3 = waterInletLatitude.floatValue();
                } else {
                    dFloatValue3 = 10000.0d;
                }
                Float waterInletLongitude2 = sportBasicReport2.getWaterInletLongitude();
                if (waterInletLongitude2 != null) {
                }
                if (sportBasicReport2.divingInPositionValid()) {
                    s2b s2bVarB4 = t4i.b(dFloatValue3, dFloatValue4);
                    sportRecordDetailViewModel.getDivingInGpsValues().postValue(CollectionsKt__CollectionsKt.listOf((Object[]) new Double[]{Boxing.boxDouble(s2bVarB4.f33203a), Boxing.boxDouble(s2bVarB4.f33204b)}));
                } else {
                    Logger.i("divingGpsValues", "inLatitude " + dFloatValue3 + " inLongitude " + dFloatValue4);
                }
                if (!sportBasicReport2.divingInPositionValid()) {
                    Logger.i("divingGpsValues null", new Object[0]);
                    sportRecordDetailViewModel.getDivingInGpsValues().postValue(null);
                    sportRecordDetailViewModel.getDivingOutGpsValues().postValue(null);
                }
            } else if (map2.isEmpty()) {
                while (r14.hasNext()) {
                    map3 = (Map) map.get(entry.getKey());
                    mutableMap = MapsKt__MapsKt.toMutableMap((Map) entry.getValue());
                    if (map3 != null) {
                        sportRecordKey = SportRecordKey.RecordPauseDetailInfo;
                        if (map3.containsKey(sportRecordKey)) {
                            Object obj3 = map3.get(sportRecordKey);
                            Intrinsics.checkNotNull(obj3);
                            mutableMap.put(sportRecordKey, obj3);
                        }
                    }
                    sportRecordDetailViewModel.loadCommonGpsValue(MapsKt__MapsKt.toMap(mutableMap), sportBasicReport2);
                }
            } else {
                while (r14.hasNext()) {
                    map3 = (Map) map.get(entry.getKey());
                    mutableMap = MapsKt__MapsKt.toMutableMap((Map) entry.getValue());
                    if (map3 != null) {
                        sportRecordKey = SportRecordKey.RecordPauseDetailInfo;
                        if (map3.containsKey(sportRecordKey)) {
                            Object obj4 = map3.get(sportRecordKey);
                            Intrinsics.checkNotNull(obj4);
                            mutableMap.put(sportRecordKey, obj4);
                        }
                    }
                    sportRecordDetailViewModel.loadCommonGpsValue(MapsKt__MapsKt.toMap(mutableMap), sportBasicReport2);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$getSportData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$getSportData$1", f = "SportRecordDetailViewModel.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SportBasicReport $report;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ SportRecordDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18801(SportBasicReport sportBasicReport, SportRecordDetailViewModel sportRecordDetailViewModel, Continuation<? super C18801> continuation) {
            super(2, continuation);
            this.$report = sportBasicReport;
            this.this$0 = sportRecordDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C18801(this.$report, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SportBasicReport sportBasicReport;
            SportRecordDetailViewModel sportRecordDetailViewModel;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String sid = this.$report.getSid();
                if (sid != null) {
                    sportBasicReport = this.$report;
                    SportRecordDetailViewModel sportRecordDetailViewModel2 = this.this$0;
                    FitnessDataGetter fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
                    this.L$0 = sportBasicReport;
                    this.L$1 = sportRecordDetailViewModel2;
                    this.label = 1;
                    obj = fitnessDataExtKt.getSportRecordData(sid, sportBasicReport, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportRecordDetailViewModel = sportRecordDetailViewModel2;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sportRecordDetailViewModel = (SportRecordDetailViewModel) this.L$1;
            sportBasicReport = (SportBasicReport) this.L$0;
            ResultKt.throwOnFailure(obj);
            sportRecordDetailViewModel.getSportRecordData((Map) obj, sportBasicReport);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$getSwitchDanceSongs$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$getSwitchDanceSongs$1", f = "SportRecordDetailViewModel.kt", i = {}, l = {780}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $timeStamp;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SportRecordDetailViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$getSwitchDanceSongs$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$getSwitchDanceSongs$1$1", f = "SportRecordDetailViewModel.kt", i = {}, l = {781}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nSportRecordDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordDetailViewModel.kt\ncom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel$getSwitchDanceSongs$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,806:1\n774#2:807\n865#2,2:808\n*S KotlinDebug\n*F\n+ 1 SportRecordDetailViewModel.kt\ncom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel$getSwitchDanceSongs$1$1\n*L\n783#1:807\n783#1:808,2\n*E\n"})
        public static final class C04101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Deferred<List<SwitchSongItem>> $itemList;
            int label;
            final /* synthetic */ SportRecordDetailViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04101(Deferred<? extends List<SwitchSongItem>> deferred, SportRecordDetailViewModel sportRecordDetailViewModel, Continuation<? super C04101> continuation) {
                super(2, continuation);
                this.$itemList = deferred;
                this.this$0 = sportRecordDetailViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04101(this.$itemList, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Integer score;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Deferred<List<SwitchSongItem>> deferred = this.$itemList;
                    this.label = 1;
                    obj = deferred.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                List list = (List) obj;
                Logger.i(SportRecordDetailViewModel.TAG, "getSwitchDanceSongs:" + list);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    SwitchSongItem switchSongItem = (SwitchSongItem) obj2;
                    if (switchSongItem.getScore() != null && ((score = switchSongItem.getScore()) == null || score.intValue() != 0)) {
                        arrayList.add(obj2);
                    }
                }
                CollectionsKt___CollectionsKt.reversed(arrayList);
                this.this$0.getSwitchJustDanceList().postValue(arrayList);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18811(long j, SportRecordDetailViewModel sportRecordDetailViewModel, Continuation<? super C18811> continuation) {
            super(2, continuation);
            this.$timeStamp = j;
            this.this$0 = sportRecordDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C18811 c18811 = new C18811(this.$timeStamp, this.this$0, continuation);
            c18811.L$0 = obj;
            return c18811;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, Dispatchers.getIO(), null, new SportRecordDetailViewModel$getSwitchDanceSongs$1$itemList$1(this.$timeStamp, null), 2, null);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C04101 c04101 = new C04101(deferredAsync$default, this.this$0, null);
                this.label = 1;
                if (BuildersKt.withContext(main, c04101, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$getUserInfoLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$getUserInfoLiveData$1", f = "SportRecordDetailViewModel.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C18821(Continuation<? super C18821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportRecordDetailViewModel.this.new C18821(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<AccountCoreInfo> userInfoLiveData = SportRecordDetailViewModel.this.getUserInfoLiveData();
                UserInfoManager accountManagerExtKt = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
                this.L$0 = userInfoLiveData;
                this.label = 1;
                Object miAccountCoreInfo$default = UserInfoManager.getMiAccountCoreInfo$default(accountManagerExtKt, false, this, 1, null);
                if (miAccountCoreInfo$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = userInfoLiveData;
                obj = miAccountCoreInfo$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$loadCommonGpsValue$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$loadCommonGpsValue$2", f = "SportRecordDetailViewModel.kt", i = {}, l = {388}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18832 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Object> $gpsObject;
        final /* synthetic */ List<Object> $pauseRecordList;
        final /* synthetic */ SportBasicReport $report;
        final /* synthetic */ List<Object> $tgcData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$loadCommonGpsValue$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$loadCommonGpsValue$2$1", f = "SportRecordDetailViewModel.kt", i = {}, l = {389}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Deferred<GpsValues> $gpsValuesTask;
            Object L$0;
            int label;
            final /* synthetic */ SportRecordDetailViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(SportRecordDetailViewModel sportRecordDetailViewModel, Deferred<? extends GpsValues> deferred, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = sportRecordDetailViewModel;
                this.$gpsValuesTask = deferred;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$gpsValuesTask, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutableLiveData mutableLiveData;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableLiveData<GpsValues> gpsValuesLiveData = this.this$0.getGpsValuesLiveData();
                    Deferred<GpsValues> deferred = this.$gpsValuesTask;
                    this.L$0 = gpsValuesLiveData;
                    this.label = 1;
                    Object objAwait = deferred.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData = gpsValuesLiveData;
                    obj = objAwait;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableLiveData = (MutableLiveData) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                mutableLiveData.postValue(obj);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18832(SportBasicReport sportBasicReport, List<? extends Object> list, List<? extends Object> list2, List<? extends Object> list3, Continuation<? super C18832> continuation) {
            super(2, continuation);
            this.$report = sportBasicReport;
            this.$pauseRecordList = list;
            this.$tgcData = list2;
            this.$gpsObject = list3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C18832 c18832 = SportRecordDetailViewModel.this.new C18832(this.$report, this.$pauseRecordList, this.$tgcData, this.$gpsObject, continuation);
            c18832.L$0 = obj;
            return c18832;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, Dispatchers.getIO(), null, new SportRecordDetailViewModel$loadCommonGpsValue$2$gpsValuesTask$1(SportRecordDetailViewModel.this, this.$report, this.$pauseRecordList, this.$tgcData, this.$gpsObject, null), 2, null);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SportRecordDetailViewModel.this, deferredAsync$default, null);
                this.label = 1;
                if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18832) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$loadCommonGpsValue$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$loadCommonGpsValue$3", f = "SportRecordDetailViewModel.kt", i = {}, l = {397}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Location> $gpsList;
        final /* synthetic */ List<Object> $pauseRecordList;
        final /* synthetic */ SportBasicReport $report;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$loadCommonGpsValue$3$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$loadCommonGpsValue$3$1", f = "SportRecordDetailViewModel.kt", i = {}, l = {398}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Deferred<GpsValues> $gpsValuesTask;
            Object L$0;
            int label;
            final /* synthetic */ SportRecordDetailViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(SportRecordDetailViewModel sportRecordDetailViewModel, Deferred<? extends GpsValues> deferred, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = sportRecordDetailViewModel;
                this.$gpsValuesTask = deferred;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$gpsValuesTask, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutableLiveData mutableLiveData;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableLiveData<GpsValues> gpsValuesLiveData = this.this$0.getGpsValuesLiveData();
                    Deferred<GpsValues> deferred = this.$gpsValuesTask;
                    this.L$0 = gpsValuesLiveData;
                    this.label = 1;
                    Object objAwait = deferred.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData = gpsValuesLiveData;
                    obj = objAwait;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableLiveData = (MutableLiveData) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                mutableLiveData.postValue(obj);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(List<? extends Location> list, SportBasicReport sportBasicReport, List<? extends Object> list2, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$gpsList = list;
            this.$report = sportBasicReport;
            this.$pauseRecordList = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = SportRecordDetailViewModel.this.new AnonymousClass3(this.$gpsList, this.$report, this.$pauseRecordList, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, Dispatchers.getIO(), null, new SportRecordDetailViewModel$loadCommonGpsValue$3$gpsValuesTask$1(SportRecordDetailViewModel.this, this.$gpsList, this.$report, this.$pauseRecordList, null), 2, null);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SportRecordDetailViewModel.this, deferredAsync$default, null);
                this.label = 1;
                if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$loadTSkiingGpsValue$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$loadTSkiingGpsValue$2", f = "SportRecordDetailViewModel.kt", i = {}, l = {431}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18842 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Location> $gpsList;
        final /* synthetic */ SportBasicReport $report;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$loadTSkiingGpsValue$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$loadTSkiingGpsValue$2$1", f = "SportRecordDetailViewModel.kt", i = {}, l = {432}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Deferred<GpsValues> $gpsValuesTask;
            Object L$0;
            int label;
            final /* synthetic */ SportRecordDetailViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(SportRecordDetailViewModel sportRecordDetailViewModel, Deferred<? extends GpsValues> deferred, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = sportRecordDetailViewModel;
                this.$gpsValuesTask = deferred;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$gpsValuesTask, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutableLiveData mutableLiveData;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableLiveData<GpsValues> gpsValuesLiveData = this.this$0.getGpsValuesLiveData();
                    Deferred<GpsValues> deferred = this.$gpsValuesTask;
                    this.L$0 = gpsValuesLiveData;
                    this.label = 1;
                    Object objAwait = deferred.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData = gpsValuesLiveData;
                    obj = objAwait;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableLiveData = (MutableLiveData) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                mutableLiveData.postValue(obj);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18842(List<Location> list, SportBasicReport sportBasicReport, Continuation<? super C18842> continuation) {
            super(2, continuation);
            this.$gpsList = list;
            this.$report = sportBasicReport;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C18842 c18842 = SportRecordDetailViewModel.this.new C18842(this.$gpsList, this.$report, continuation);
            c18842.L$0 = obj;
            return c18842;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, Dispatchers.getIO(), null, new SportRecordDetailViewModel$loadTSkiingGpsValue$2$gpsValuesTask$1(SportRecordDetailViewModel.this, this.$gpsList, this.$report, null), 2, null);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SportRecordDetailViewModel.this, deferredAsync$default, null);
                this.label = 1;
                if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18842) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$requestRecoverRateData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$requestRecoverRateData$1", f = "SportRecordDetailViewModel.kt", i = {}, l = {326}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SportBasicReport $report;
        int label;
        final /* synthetic */ SportRecordDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18851(SportBasicReport sportBasicReport, SportRecordDetailViewModel sportRecordDetailViewModel, Continuation<? super C18851> continuation) {
            super(2, continuation);
            this.$report = sportBasicReport;
            this.this$0 = sportRecordDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C18851(this.$report, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FitnessDataGetter fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
                String sid = this.$report.getSid();
                Intrinsics.checkNotNull(sid);
                SportBasicReport sportBasicReport = this.$report;
                this.label = 1;
                obj = fitnessDataExtKt.getRecoverRateData(sid, sportBasicReport, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            RecoverRateData recoverRateData = (RecoverRateData) obj;
            Logger.i(SportRecordDetailViewModel.TAG, "requestRecoverRateData result:" + recoverRateData);
            this.this$0.getRecoverRateDataLiveData().postValue(recoverRateData);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$uploadInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$uploadInfo$1", f = "SportRecordDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FeedBackModelData $feedBackModel;
        final /* synthetic */ File $gpsLogFile;
        final /* synthetic */ boolean $isUploadFile;
        final /* synthetic */ String $logPath;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18861(FeedBackModelData feedBackModelData, boolean z, String str, File file, Continuation<? super C18861> continuation) {
            super(2, continuation);
            this.$feedBackModel = feedBackModelData;
            this.$isUploadFile = z;
            this.$logPath = str;
            this.$gpsLogFile = file;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4(FeedBackModelData feedBackModelData, final boolean z, final SportRecordDetailViewModel sportRecordDetailViewModel, final String str, final File file, UploadFileModel.UploadFileResult uploadFileResult) {
            if (AppUtil.INSTANCE.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
                feedBackModelData.setModule_id(273);
            } else {
                feedBackModelData.setModule_id(239);
            }
            if (z && sportRecordDetailViewModel.uploadFileResult != null) {
                UploadFileModel.UploadFileResult uploadFileResult2 = sportRecordDetailViewModel.uploadFileResult;
                Intrinsics.checkNotNull(uploadFileResult2);
                feedBackModelData.setLogfile(uploadFileResult2.getObj_name());
            }
            Logger.d(SportRecordDetailViewModel.TAG, "FeedBackModelData.logfile it is " + feedBackModelData.getLogfile() + "logPath = " + str);
            Logger.d(SportRecordDetailViewModel.TAG, "feedBackModel it is " + feedBackModelData + ", model is " + feedBackModelData.getModel() + ", content is" + feedBackModelData.getContent() + ", did is" + feedBackModelData.getDid() + ", medal is" + feedBackModelData.getModel() + ", contact is" + feedBackModelData.getContact() + ", version_code is" + feedBackModelData.getVersion_code());
            UploadFileManagerExtKt.getInstance(UploadFileManager.INSTANCE).feedback(ViewModelKt.getViewModelScope(sportRecordDetailViewModel), feedBackModelData, new Function1() { // from class: com.xiaomi.fitness.detail.viewmodel.b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportRecordDetailViewModel.C18861.invokeSuspend$lambda$4$lambda$2(sportRecordDetailViewModel, z, str, file, (String) obj);
                }
            }, new Function1() { // from class: com.xiaomi.fitness.detail.viewmodel.c
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportRecordDetailViewModel.C18861.invokeSuspend$lambda$4$lambda$3(sportRecordDetailViewModel, (ApiException) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4$lambda$2(SportRecordDetailViewModel sportRecordDetailViewModel, boolean z, String str, File file, String str2) {
            if (str2.length() > 0) {
                sportRecordDetailViewModel.getFeedbackLiveData().setValue(Boolean.TRUE);
                if (z && sportRecordDetailViewModel.uploadFileResult != null) {
                    UploadFileModel.UploadFileResult uploadFileResult = sportRecordDetailViewModel.uploadFileResult;
                    Intrinsics.checkNotNull(uploadFileResult);
                    String obj_name = uploadFileResult.getObj_name();
                    if (obj_name != null) {
                        UploadFileModel.UploadFileResult uploadFileResult2 = sportRecordDetailViewModel.uploadFileResult;
                        Intrinsics.checkNotNull(uploadFileResult2);
                        String url = uploadFileResult2.getUrl();
                        if (url != null) {
                            UploadFileManagerExtKt.getInstance(UploadFileManager.INSTANCE).uploadLogFile(z, obj_name, url, str, file);
                        }
                    }
                }
            } else {
                sportRecordDetailViewModel.getFeedbackLiveData().setValue(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4$lambda$3(SportRecordDetailViewModel sportRecordDetailViewModel, ApiException apiException) {
            sportRecordDetailViewModel.getFeedbackLiveData().setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportRecordDetailViewModel.this.new C18861(this.$feedBackModel, this.$isUploadFile, this.$logPath, this.$gpsLogFile, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final SportRecordDetailViewModel sportRecordDetailViewModel = SportRecordDetailViewModel.this;
            final FeedBackModelData feedBackModelData = this.$feedBackModel;
            final boolean z = this.$isUploadFile;
            final String str = this.$logPath;
            final File file = this.$gpsLogFile;
            sportRecordDetailViewModel.getUploadFileInfo(false, new Function1() { // from class: com.xiaomi.fitness.detail.viewmodel.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return SportRecordDetailViewModel.C18861.invokeSuspend$lambda$4(feedBackModelData, z, sportRecordDetailViewModel, str, file, (UploadFileModel.UploadFileResult) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$uploadTrack$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$uploadTrack$2", f = "SportRecordDetailViewModel.kt", i = {}, l = {700}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18872 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ Integer $distance;
        final /* synthetic */ String $fail;
        final /* synthetic */ String $filePath;
        final /* synthetic */ Recorder $recorder;
        final /* synthetic */ String $success;
        final /* synthetic */ long $uploadTime;
        int label;
        final /* synthetic */ SportRecordDetailViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$uploadTrack$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$uploadTrack$2$1", f = "SportRecordDetailViewModel.kt", i = {}, l = {747}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nSportRecordDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordDetailViewModel.kt\ncom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel$uploadTrack$2$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,806:1\n39#2,6:807\n39#2,6:813\n*S KotlinDebug\n*F\n+ 1 SportRecordDetailViewModel.kt\ncom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel$uploadTrack$2$1\n*L\n721#1:807,6\n733#1:813,6\n*E\n"})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Bitmap $bitmap;
            final /* synthetic */ Integer $distance;
            final /* synthetic */ String $fail;
            final /* synthetic */ String $filePath;
            final /* synthetic */ Recorder $recorder;
            final /* synthetic */ String $success;
            final /* synthetic */ long $uploadTime;
            int label;
            final /* synthetic */ SportRecordDetailViewModel this$0;

            /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$uploadTrack$2$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/route/export/track/UploadUrl;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$uploadTrack$2$1$1", f = "SportRecordDetailViewModel.kt", i = {0}, l = {704, 710}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
            public static final class C04111 extends SuspendLambda implements Function2<FlowCollector<? super UploadUrl>, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $filePath;
                final /* synthetic */ Recorder $recorder;
                final /* synthetic */ long $uploadTime;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SportRecordDetailViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04111(long j, Recorder recorder, String str, SportRecordDetailViewModel sportRecordDetailViewModel, Continuation<? super C04111> continuation) {
                    super(2, continuation);
                    this.$uploadTime = j;
                    this.$recorder = recorder;
                    this.$filePath = str;
                    this.this$0 = sportRecordDetailViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C04111 c04111 = new C04111(this.$uploadTime, this.$recorder, this.$filePath, this.this$0, continuation);
                    c04111.L$0 = obj;
                    return c04111;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    FlowCollector flowCollector;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i == 1) {
                            flowCollector = (FlowCollector) this.L$0;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.L$0;
                    TrackNet trackNetManagerKt = TrackNetManagerKt.getInstance(TrackNet.INSTANCE);
                    long j = this.$uploadTime;
                    String md5Str = this.$recorder.getMd5Str();
                    this.L$0 = flowCollector;
                    this.label = 1;
                    obj = TrackNet.DefaultImpls.getRunningRouteUploadUrl$default(trackNetManagerKt, j, md5Str, 0, this, 4, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    UploadUrl uploadUrl = (UploadUrl) obj;
                    FitnessLogUtils.i(SportRecordDetailViewModel.TAG, "runningRouteUploadUrl code:" + (uploadUrl != null ? Boxing.boxInt(uploadUrl.getCode()) : null));
                    if (uploadUrl != null && uploadUrl.getCode() == 0) {
                        this.L$0 = null;
                        this.label = 2;
                        if (flowCollector.emit(uploadUrl, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    FileUtils.INSTANCE.deleteFile(this.$filePath);
                    if (uploadUrl == null || uploadUrl.getCode() != -1) {
                        this.this$0.toastTrack(j1j.T0);
                    } else {
                        this.this$0.toastTrack(j1j.S0);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FlowCollector<? super UploadUrl> flowCollector, Continuation<? super Unit> continuation) {
                    return ((C04111) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$uploadTrack$2$1$4, reason: invalid class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass4<T> implements FlowCollector {
                final /* synthetic */ Integer $distance;
                final /* synthetic */ Recorder $recorder;
                final /* synthetic */ long $uploadTime;
                final /* synthetic */ SportRecordDetailViewModel this$0;

                public AnonymousClass4(long j, Recorder recorder, SportRecordDetailViewModel sportRecordDetailViewModel, Integer num) {
                    this.$uploadTime = j;
                    this.$recorder = recorder;
                    this.this$0 = sportRecordDetailViewModel;
                    this.$distance = num;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((String) obj, (Continuation<? super Unit>) continuation);
                }

                /* JADX WARN: Code duplicated, block: B:8:0x0014  */
                public final Object emit(String str, Continuation<? super Unit> continuation) {
                    SportRecordDetailViewModel$uploadTrack$2$1$4$emit$1 sportRecordDetailViewModel$uploadTrack$2$1$4$emit$1;
                    AnonymousClass4<T> anonymousClass4;
                    if (continuation instanceof SportRecordDetailViewModel$uploadTrack$2$1$4$emit$1) {
                        sportRecordDetailViewModel$uploadTrack$2$1$4$emit$1 = (SportRecordDetailViewModel$uploadTrack$2$1$4$emit$1) continuation;
                        int i = sportRecordDetailViewModel$uploadTrack$2$1$4$emit$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            sportRecordDetailViewModel$uploadTrack$2$1$4$emit$1.label = i - Integer.MIN_VALUE;
                        } else {
                            sportRecordDetailViewModel$uploadTrack$2$1$4$emit$1 = new SportRecordDetailViewModel$uploadTrack$2$1$4$emit$1(this, continuation);
                        }
                    } else {
                        sportRecordDetailViewModel$uploadTrack$2$1$4$emit$1 = new SportRecordDetailViewModel$uploadTrack$2$1$4$emit$1(this, continuation);
                    }
                    SportRecordDetailViewModel$uploadTrack$2$1$4$emit$1 sportRecordDetailViewModel$uploadTrack$2$1$4$emit$2 = sportRecordDetailViewModel$uploadTrack$2$1$4$emit$1;
                    Object objUploadUserRoute$default = sportRecordDetailViewModel$uploadTrack$2$1$4$emit$2.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = sportRecordDetailViewModel$uploadTrack$2$1$4$emit$2.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(objUploadUserRoute$default);
                        if (str.length() > 0) {
                            TrackNet trackNetManagerKt = TrackNetManagerKt.getInstance(TrackNet.INSTANCE);
                            long j = this.$uploadTime;
                            String md5Str = this.$recorder.getMd5Str();
                            HashMap map = new HashMap();
                            Recorder recorder = this.$recorder;
                            Integer num = this.$distance;
                            long j2 = this.$uploadTime;
                            map.put("alias", recorder.getNameStr());
                            map.put("source", "2");
                            map.put("suffix", recorder.getFileExtension());
                            map.put(StepsInfo.KEY_DISTANCE, String.valueOf(num != null ? num.intValue() : 0));
                            map.put("uploadTime", String.valueOf(j2));
                            Unit unit = Unit.INSTANCE;
                            sportRecordDetailViewModel$uploadTrack$2$1$4$emit$2.L$0 = this;
                            sportRecordDetailViewModel$uploadTrack$2$1$4$emit$2.label = 1;
                            objUploadUserRoute$default = TrackNet.DefaultImpls.uploadUserRoute$default(trackNetManagerKt, j, md5Str, map, null, sportRecordDetailViewModel$uploadTrack$2$1$4$emit$2, 8, null);
                            if (objUploadUserRoute$default == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            anonymousClass4 = this;
                        } else {
                            FitnessLogUtils.i(SportRecordDetailViewModel.TAG, "not upload user route");
                            this.this$0.toastTrack(j1j.T0);
                        }
                        return Unit.INSTANCE;
                    }
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    anonymousClass4 = (AnonymousClass4) sportRecordDetailViewModel$uploadTrack$2$1$4$emit$2.L$0;
                    ResultKt.throwOnFailure(objUploadUserRoute$default);
                    FitnessLogUtils.i(SportRecordDetailViewModel.TAG, "uploadUserRoute :" + ((UploadUserRoute) objUploadUserRoute$default));
                    anonymousClass4.this$0.toastTrack(j1j.W0);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(long j, Recorder recorder, String str, SportRecordDetailViewModel sportRecordDetailViewModel, String str2, String str3, Bitmap bitmap, Integer num, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$uploadTime = j;
                this.$recorder = recorder;
                this.$filePath = str;
                this.this$0 = sportRecordDetailViewModel;
                this.$fail = str2;
                this.$success = str3;
                this.$bitmap = bitmap;
                this.$distance = num;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$uploadTime, this.$recorder, this.$filePath, this.this$0, this.$fail, this.$success, this.$bitmap, this.$distance, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flow = FlowKt.flow(new SportRecordDetailViewModel$uploadTrack$2$1$invokeSuspend$$inlined$transform$2(FlowKt.flow(new SportRecordDetailViewModel$uploadTrack$2$1$invokeSuspend$$inlined$transform$1(FlowKt.flow(new C04111(this.$uploadTime, this.$recorder, this.$filePath, this.this$0, null)), null, this.$recorder, this.$fail, this.this$0)), null, this.$success, this.$fail, this.this$0, this.$bitmap));
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$uploadTime, this.$recorder, this.this$0, this.$distance);
                    this.label = 1;
                    if (flow.collect(anonymousClass4, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18872(long j, Recorder recorder, String str, SportRecordDetailViewModel sportRecordDetailViewModel, String str2, String str3, Bitmap bitmap, Integer num, Continuation<? super C18872> continuation) {
            super(2, continuation);
            this.$uploadTime = j;
            this.$recorder = recorder;
            this.$filePath = str;
            this.this$0 = sportRecordDetailViewModel;
            this.$fail = str2;
            this.$success = str3;
            this.$bitmap = bitmap;
            this.$distance = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C18872(this.$uploadTime, this.$recorder, this.$filePath, this.this$0, this.$fail, this.$success, this.$bitmap, this.$distance, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$uploadTime, this.$recorder, this.$filePath, this.this$0, this.$fail, this.$success, this.$bitmap, this.$distance, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18872) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void addLocationList(SportBasicReport basicReport, GpsValues gpsValues) {
        addLocationList(basicReport.getFirstSport(), gpsValues);
        addLocationList(basicReport.getSecondSport(), gpsValues);
        addLocationList(basicReport.getThirdSport(), gpsValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData configLiveData_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object createGpsValue(List<? extends Location> list, SportBasicReport sportBasicReport, List<SportRecordItem> list2, Continuation<? super GpsValues> continuation) {
        AnonymousClass1 anonymousClass1;
        GpsValues gpsValues;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            GpsTrackData gpsTrackDataBuild = new GpsTrackData.Builder().sportReport(sportBasicReport).locationList(list).build();
            GpsValues gpsValues2 = new GpsValues(sportBasicReport.getSid(), gpsTrackDataBuild.timeStamp, gpsTrackDataBuild.sportType);
            Intrinsics.checkNotNull(gpsTrackDataBuild);
            anonymousClass1.L$0 = gpsValues2;
            anonymousClass1.label = 1;
            if (GpsValuesExKt.putGpsTrackData(gpsValues2, gpsTrackDataBuild, list2, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            gpsValues = gpsValues2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                GpsValues gpsValues3 = (GpsValues) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                return gpsValues3;
            }
            gpsValues = (GpsValues) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        anonymousClass1.L$0 = gpsValues;
        anonymousClass1.label = 2;
        return GpsValuesExKt.smooth(gpsValues, anonymousClass1) == coroutine_suspended ? coroutine_suspended : gpsValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object createGpsValue$default(SportRecordDetailViewModel sportRecordDetailViewModel, List list, SportBasicReport sportBasicReport, List list2, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createGpsValue");
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        return sportRecordDetailViewModel.createGpsValue(list, sportBasicReport, list2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDivingPointNameFromNet$lambda$15(SportRecordDetailViewModel this$0, SportReportDivingInfo it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "getDivingPointNameFromNet " + it.getDivingInfo());
        if (!it.getDivingInfo().getDivingList().isEmpty()) {
            Logger.i(TAG, "getDivingPointNameFromNet " + it.getDivingInfo().getDivingList());
            this$0.sportsReportDivingPointInfo.postValue(it.getDivingInfo().getDivingList().get(0));
        } else {
            Logger.i(TAG, "getDivingPointNameFromNet it.divingInfo.divingList size is Empty");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDivingPointNameFromNet$lambda$16(SportRecordDetailViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "getDivingPointNameFromNet fail" + it.getMessage());
        this$0.sportsReportDivingPointInfo.postValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getReportInfoFromNet$lambda$13(SportRecordDetailViewModel this$0, SportsReportOperationalInfo it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "getReportInfoFromNet suc");
        this$0.sportsReportOperationalRouteInfo.postValue(it.getRouteInfo());
        this$0.sportsReportOperationalCourseInfo.postValue(it.getCourseData());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getReportInfoFromNet$lambda$14(SportRecordDetailViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "getReportInfoFromNet fail" + it.getMessage());
        this$0.sportsReportOperationalRouteInfo.postValue(null);
        this$0.sportsReportOperationalCourseInfo.postValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getSportRecordData(Map<Integer, ? extends Map<SportRecordKey, ? extends List<? extends Object>>> map, SportBasicReport report) {
        if (report.getSid() != null) {
            if (report.getSportType() != 17) {
                if (map.isEmpty()) {
                    this.recordDetailMaps.postValue(this.mRecordDetailMap);
                } else {
                    Iterator<Map.Entry<Integer, ? extends Map<SportRecordKey, ? extends List<? extends Object>>>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map<SportRecordKey, ? extends List<? extends Object>> value = it.next().getValue();
                        Map<SportRecordKey, List<Object>> map2 = this.mRecordDetailMap;
                        SportRecordKey sportRecordKey = SportRecordKey.Speed;
                        if (map2.containsKey(sportRecordKey)) {
                            this.mRecordDetailMap.remove(sportRecordKey);
                        }
                        this.mRecordDetailMap.putAll(value);
                    }
                    this.recordDetailMaps.postValue(this.mRecordDetailMap);
                }
                List<SportBehaviorModel> listB = ben.b(report);
                Intrinsics.checkNotNull(listB);
                if (!listB.isEmpty()) {
                    this.behaviorListData.postValue(listB);
                }
            } else {
                this.recordTriathlonDetailMaps.postValue(map);
            }
        }
        if (report.getSportType() == 812) {
            getSwitchDanceSongs(report.getTimeStamp());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUploadFileInfo$lambda$11(SportRecordDetailViewModel this$0, Function1 success, UploadFileModel.UploadFileResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.uploadFileResult = it;
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUploadFileInfo$lambda$12(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(TAG, "getUploadFileInfo exception errorCode");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserInfo$lambda$4(SportRecordDetailViewModel this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new SportRecordDetailViewModel$getUserInfo$1$1(this$0, accountCoreInfo, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserInfo$lambda$5(SportRecordDetailViewModel this$0, Function1 account, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(account, "$account");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this$0), null, null, new SportRecordDetailViewModel$getUserInfo$2$1(account, accountCoreInfo, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadCommonGpsValue(Map<SportRecordKey, ? extends List<? extends Object>> map, SportBasicReport report) {
        if (report == null) {
            Logger.w("SportDetailFragment", "SportGPSData is null");
            return;
        }
        if (this.mRecordDetailMap.containsKey(SportRecordKey.Distance)) {
            Map<SportRecordKey, List<Object>> map2 = this.mRecordDetailMap;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<SportRecordKey, ? extends List<? extends Object>> entry : map.entrySet()) {
                if (entry.getKey() != SportRecordKey.Distance) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            map2.putAll(linkedHashMap);
        } else {
            this.mRecordDetailMap.putAll(SportRecordUtil.INSTANCE.computeDistanceList(report, map, true));
        }
        Map<SportRecordKey, List<Object>> value = this.recordDetailMaps.getValue();
        if (value != null && !value.containsKey(SportRecordKey.Distance)) {
            this.recordDetailMaps.postValue(this.mRecordDetailMap);
        }
        List<? extends Object> list = map.get(SportRecordKey.Gps);
        List<? extends Object> list2 = map.get(SportRecordKey.RecordPauseDetailInfo);
        List<? extends Object> list3 = map.get(SportRecordKey.TgcGps);
        if (list3 != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C18832(report, list2, list3, list, null), 3, null);
            Logger.i("SportDetailFragment", "sportRecordDataObjectMap has tgcData!");
        } else {
            if (list == null) {
                Logger.i("SportDetailFragment", "sportRecordDataObjectMap has no gps data!");
                this.gpsValuesLiveData.postValue(null);
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass3(list, report, list2, null), 3, null);
            Logger.i("SportDetailFragment", "sportRecordDataObjectMap has data!" + list.size());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadTSkiingGpsValue(Map<Integer, ? extends Map<SportRecordKey, ? extends List<? extends Object>>> map, SportBasicReport report) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, ? extends Map<SportRecordKey, ? extends List<? extends Object>>> entry : map.entrySet()) {
            List<? extends Object> list = entry.getValue().get(SportRecordKey.Gps);
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.data.common.data.sport.Location>");
            Logger.i("SportDetailFragment", "Skiing Key " + entry.getKey());
            int iIntValue = entry.getKey().intValue();
            if (iIntValue == 1 || iIntValue == 2 || iIntValue == 3) {
                arrayList.addAll(list);
            }
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C18842(arrayList, report, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadTriathlonGpsValue(Map<Integer, ? extends Map<SportRecordKey, ? extends List<? extends Object>>> map, SportBasicReport report) {
        Map<SportRecordKey, ? extends List<? extends Object>> value;
        List<? extends Object> list;
        Map<SportRecordKey, ? extends List<? extends Object>> value2;
        List<? extends Object> list2;
        Map<SportRecordKey, ? extends List<? extends Object>> value3;
        List<? extends Object> list3;
        if (map == null || report == null) {
            Logger.w("SportDetailFragment", "SportGPSData is null");
            return;
        }
        GpsValues gpsValues = new GpsValues(report.getSid(), report.getTimeStamp(), report.getSportType());
        for (Map.Entry<Integer, ? extends Map<SportRecordKey, ? extends List<? extends Object>>> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if (iIntValue == 10 && (value3 = entry.getValue()) != null && (list3 = value3.get(SportRecordKey.Gps)) != null) {
                List<? extends Object> list4 = list3;
                gpsValues.swimLocationList.addAll(list4);
                gpsValues.originalLocationList.addAll(list4);
            }
            if (iIntValue == 6 && (value2 = entry.getValue()) != null && (list2 = value2.get(SportRecordKey.Gps)) != null) {
                List<? extends Object> list5 = list2;
                gpsValues.cycleLocationList.addAll(list5);
                gpsValues.originalLocationList.addAll(list5);
            }
            if (iIntValue == 1 && (value = entry.getValue()) != null && (list = value.get(SportRecordKey.Gps)) != null) {
                List<? extends Object> list6 = list;
                gpsValues.runLocationList.addAll(list6);
                gpsValues.originalLocationList.addAll(list6);
            }
        }
        addLocationList(report, gpsValues);
        o5o.e().q(gpsValues.runLocationList, gpsValues.cycleLocationList, gpsValues.swimLocationList);
        this.gpsValuesLiveData.postValue(gpsValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData pathLiveData_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqConfig$lambda$2(SportRecordDetailViewModel this$0, SportShareRes it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getConfigLiveData().setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqConfig$lambda$3(SportRecordDetailViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getConfigLiveData().setValue(null);
        Logger.e(TAG, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toastTrack(int msgRes) {
        Looper.prepare();
        ToastUtil.INSTANCE.showToast(msgRes);
        Looper.loop();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final MutableLiveData<Boolean> getAbnormalFlag() {
        return this.abnormalFlag;
    }

    @NotNull
    public final MutableLiveData<List<BasicItemInfo>> getBasicItemInfoLiveData() {
        return this.basicItemInfoLiveData;
    }

    @NotNull
    public final MutableLiveData<List<SportBehaviorModel>> getBehaviorListData() {
        return this.behaviorListData;
    }

    public final void getCompactTraceBasicCardDataList(@Nullable SportBasicReport report) {
        if (report == null) {
            return;
        }
        this.basicItemInfoLiveData.postValue(SportDetailUtil.INSTANCE.initCompactTraceBasicItemList(report, report.getSportType()));
        ScopeExtKt.scopeNetLife(this, Dispatchers.getIO(), new C18771(report, this, null));
    }

    @NotNull
    public final MutableLiveData<SportShareRes> getConfigLiveData() {
        return (MutableLiveData) this.configLiveData.getValue();
    }

    public final void getCourseInfo(@NotNull CourseItem reqItem) {
        Intrinsics.checkNotNullParameter(reqItem, "reqItem");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C18781(reqItem, this, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<CourseInfoItem> getCourseInfoResult() {
        return this.courseInfoResult;
    }

    @NotNull
    public final MutableLiveData<List<Double>> getDivingInGpsValues() {
        return this.divingInGpsValues;
    }

    @NotNull
    public final MutableLiveData<List<Double>> getDivingOutGpsValues() {
        return this.divingOutGpsValues;
    }

    public final void getDivingPointNameFromNet(int pointId) {
        SportRecordDivingPointRequest.INSTANCE.getInstance().getSportReportDivingPointName(pointId, new Function1() { // from class: otn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordDetailViewModel.getDivingPointNameFromNet$lambda$15(this.f29674a, (SportReportDivingInfo) obj);
            }
        }, new Function1() { // from class: ptn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordDetailViewModel.getDivingPointNameFromNet$lambda$16(this.f30761a, (ApiException) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<List<BasicItemInfo>> getExtraBasicItemInfoLiveData() {
        return this.extraBasicItemInfoLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getFeedbackLiveData() {
        return this.feedbackLiveData;
    }

    public final void getGPSAndRecordData(@Nullable SportBasicReport report) {
        if (report == null) {
            return;
        }
        if (!supportGpsSport(report) || TextUtils.isEmpty(report.getSid())) {
            getSportData(report);
        } else {
            ScopeExtKt.scopeNetLife(this, Dispatchers.getIO(), new C18791(report, this, null));
        }
    }

    @NotNull
    public final MutableLiveData<GpsValues> getGpsValuesLiveData() {
        return this.gpsValuesLiveData;
    }

    @NotNull
    public final MutableLiveData<Path> getPathLiveData() {
        return (MutableLiveData) this.pathLiveData.getValue();
    }

    @Nullable
    public final AccountCoreInfo getProfileInfo() {
        return this.profileInfo;
    }

    @NotNull
    public final MutableLiveData<Map<SportRecordKey, List<Object>>> getRecordDetailMaps() {
        return this.recordDetailMaps;
    }

    @NotNull
    public final MutableLiveData<Map<Integer, Map<SportRecordKey, List<Object>>>> getRecordTriathlonDetailMaps() {
        return this.recordTriathlonDetailMaps;
    }

    @NotNull
    public final MutableLiveData<RecoverRateData> getRecoverRateDataLiveData() {
        return this.recoverRateDataLiveData;
    }

    public final void getReportInfoFromNet(@NotNull String sid, @NotNull String key, long start_time, long end_time, @Nullable String course_id, @Nullable Integer source_type) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        SportRecordRouteRequest.INSTANCE.getInstance().getSportsReportOperationalData(sid, key, start_time, end_time, course_id, source_type, new Function1() { // from class: mtn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordDetailViewModel.getReportInfoFromNet$lambda$13(this.f27207a, (SportsReportOperationalInfo) obj);
            }
        }, new Function1() { // from class: ntn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordDetailViewModel.getReportInfoFromNet$lambda$14(this.f28363a, (ApiException) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowExpandViewFlag() {
        return this.showExpandViewFlag;
    }

    public final void getSportData(@Nullable SportBasicReport report) {
        if (report == null) {
            return;
        }
        ScopeExtKt.scopeNetLife(this, Dispatchers.getIO(), new C18801(report, this, null));
    }

    @NotNull
    public final MutableLiveData<SportReportDivingPointItem> getSportsReportDivingPointInfo() {
        return this.sportsReportDivingPointInfo;
    }

    @NotNull
    public final MutableLiveData<SportsReportOperationalCourseData> getSportsReportOperationalCourseInfo() {
        return this.sportsReportOperationalCourseInfo;
    }

    @NotNull
    public final MutableLiveData<SportsReportOperationalRouteInfo> getSportsReportOperationalRouteInfo() {
        return this.sportsReportOperationalRouteInfo;
    }

    public final void getSwitchDanceSongs(long timeStamp) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C18811(timeStamp, this, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<List<SwitchSongItem>> getSwitchJustDanceList() {
        return this.switchJustDanceList;
    }

    @NotNull
    public final MutableLiveData<List<SportBehaviorModel>> getTriathlonRidBehaviorLiveData() {
        return this.triathlonRidBehaviorLiveData;
    }

    @NotNull
    public final MutableLiveData<Map<SportRecordKey, List<Object>>> getTriathlonRidMaps() {
        return this.triathlonRidMaps;
    }

    @NotNull
    public final MutableLiveData<List<SportBehaviorModel>> getTriathlonRunBehaviorLiveData() {
        return this.triathlonRunBehaviorLiveData;
    }

    @NotNull
    public final MutableLiveData<Map<SportRecordKey, List<Object>>> getTriathlonRunMaps() {
        return this.triathlonRunMaps;
    }

    @NotNull
    public final MutableLiveData<List<SportBehaviorModel>> getTriathlonSwimBehaviorLiveData() {
        return this.triathlonSwimBehaviorLiveData;
    }

    @NotNull
    public final MutableLiveData<Map<SportRecordKey, List<Object>>> getTriathlonSwimMaps() {
        return this.triathlonSwimMaps;
    }

    public final void getUploadFileInfo(boolean showLoading, @NotNull final Function1<? super UploadFileModel.UploadFileResult, Unit> success) {
        Intrinsics.checkNotNullParameter(success, "success");
        UploadFileManager.DefaultImpls.getUploadFileInfo$default(UploadFileManagerExtKt.getInstance(UploadFileManager.INSTANCE), null, "feedback", "zip", new Function1() { // from class: utn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordDetailViewModel.getUploadFileInfo$lambda$11(this.f36124a, success, (UploadFileModel.UploadFileResult) obj);
            }
        }, new Function1() { // from class: ktn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordDetailViewModel.getUploadFileInfo$lambda$12((ApiException) obj);
            }
        }, 1, null);
    }

    public final void getUserInfo() {
        UserInfoManager.getAccountCoreInfo$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, new Function1() { // from class: ltn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordDetailViewModel.getUserInfo$lambda$4(this.f25428a, (AccountCoreInfo) obj);
            }
        }, 1, null);
    }

    @NotNull
    public final MutableLiveData<AccountCoreInfo> getUserInfoLiveData() {
        return this.userInfoLiveData;
    }

    public final void reqConfig() {
        new SportRequest().getSportShareConfig(new Function1() { // from class: stn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordDetailViewModel.reqConfig$lambda$2(this.f33980a, (SportShareRes) obj);
            }
        }, new Function1() { // from class: ttn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordDetailViewModel.reqConfig$lambda$3(this.f35033a, (ApiException) obj);
            }
        });
    }

    public final void requestRecoverRateData(@Nullable SportBasicReport report) {
        if ((report != null ? report.getSid() : null) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C18851(report, this, null), 2, null);
    }

    public final void setAbnormalFlag(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.abnormalFlag = mutableLiveData;
    }

    public final void setGpsPath(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        getPathLiveData().setValue(path);
    }

    public final void setProfileInfo(@Nullable AccountCoreInfo accountCoreInfo) {
        this.profileInfo = accountCoreInfo;
    }

    public final void setShowExpandViewFlag(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.showExpandViewFlag = mutableLiveData;
    }

    public final void setUserInfoLiveData(@NotNull MutableLiveData<AccountCoreInfo> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.userInfoLiveData = mutableLiveData;
    }

    public final boolean supportGpsSport(@Nullable SportBasicReport report) {
        if (report == null) {
            return false;
        }
        return FitnessSportTypeUtils.INSTANCE.supportGpsSport(report);
    }

    public final void unRegisterObserver(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.recordDetailMaps.removeObservers(lifecycleOwner);
        this.recordTriathlonDetailMaps.removeObservers(lifecycleOwner);
        this.triathlonSwimMaps.removeObservers(lifecycleOwner);
        this.triathlonRunMaps.removeObservers(lifecycleOwner);
        this.triathlonRidMaps.removeObservers(lifecycleOwner);
    }

    public final void updateBasic(@NotNull SportBasicReport report, int sportType) {
        Intrinsics.checkNotNullParameter(report, "report");
        this.basicItemInfoLiveData.postValue(SportDetailUtil.initBasicList$default(SportDetailUtil.INSTANCE, report, sportType, false, 4, null));
    }

    public final void uploadInfo(boolean isUploadFile, @NotNull FeedBackModelData feedBackModel, @NotNull String logPath, @NotNull File gpsLogFile) {
        Intrinsics.checkNotNullParameter(feedBackModel, "feedBackModel");
        Intrinsics.checkNotNullParameter(logPath, "logPath");
        Intrinsics.checkNotNullParameter(gpsLogFile, "gpsLogFile");
        ScopeExtKt.scopeNetLife$default(this, null, new C18861(feedBackModel, isUploadFile, logPath, gpsLogFile, null), 1, null);
    }

    @Nullable
    public final Object uploadTrack(@NotNull String str, @Nullable Integer num, @NotNull Recorder recorder, @NotNull Bitmap bitmap, @NotNull Continuation<? super Unit> continuation) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C18872(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), recorder, str, this, "", "success", bitmap, num, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void getUserInfo(@NotNull final Function1<? super AccountCoreInfo, Unit> account) {
        Intrinsics.checkNotNullParameter(account, "account");
        UserInfoManager.getAccountCoreInfo$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, new Function1() { // from class: jtn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordDetailViewModel.getUserInfo$lambda$5(this.f23125a, account, (AccountCoreInfo) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: getUserInfoLiveData, reason: collision with other method in class */
    public final void m242getUserInfoLiveData() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C18821(null), 2, null);
    }

    private final void addLocationList(Integer sportNum, GpsValues gpsValues) {
        if (sportNum != null && sportNum.intValue() == 0) {
            List<Location> list = gpsValues.locationList;
            List<Location> swimLocationList = gpsValues.swimLocationList;
            Intrinsics.checkNotNullExpressionValue(swimLocationList, "swimLocationList");
            list.addAll(swimLocationList);
            return;
        }
        if (sportNum != null && sportNum.intValue() == 1) {
            List<Location> list2 = gpsValues.locationList;
            List<Location> cycleLocationList = gpsValues.cycleLocationList;
            Intrinsics.checkNotNullExpressionValue(cycleLocationList, "cycleLocationList");
            list2.addAll(cycleLocationList);
            return;
        }
        if (sportNum != null && sportNum.intValue() == 2) {
            List<Location> list3 = gpsValues.locationList;
            List<Location> runLocationList = gpsValues.runLocationList;
            Intrinsics.checkNotNullExpressionValue(runLocationList, "runLocationList");
            list3.addAll(runLocationList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object createGpsValue(SportBasicReport sportBasicReport, List<SportRecordItem> list, List<byte[]> list2, List<? extends Location> list3, Continuation<? super GpsValues> continuation) {
        AnonymousClass2 anonymousClass2;
        GpsValues gpsValues;
        if (continuation instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) continuation;
            int i = anonymousClass2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new AnonymousClass2(continuation);
            }
        } else {
            anonymousClass2 = new AnonymousClass2(continuation);
        }
        Object obj = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            GpsTrackData.Builder builderLocationList = new GpsTrackData.Builder().sportReport(sportBasicReport).locationList(list3);
            if (!list2.isEmpty()) {
                builderLocationList.tgcData(list2.get(0));
            }
            GpsTrackData gpsTrackDataBuild = builderLocationList.build();
            GpsValues gpsValues2 = new GpsValues(sportBasicReport.getSid(), gpsTrackDataBuild.timeStamp, gpsTrackDataBuild.sportType);
            Intrinsics.checkNotNull(gpsTrackDataBuild);
            anonymousClass2.L$0 = gpsValues2;
            anonymousClass2.label = 1;
            if (GpsValuesExKt.putGpsTrackData(gpsValues2, gpsTrackDataBuild, list, anonymousClass2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            gpsValues = gpsValues2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                GpsValues gpsValues3 = (GpsValues) anonymousClass2.L$0;
                ResultKt.throwOnFailure(obj);
                return gpsValues3;
            }
            gpsValues = (GpsValues) anonymousClass2.L$0;
            ResultKt.throwOnFailure(obj);
        }
        anonymousClass2.L$0 = gpsValues;
        anonymousClass2.label = 2;
        return GpsValuesExKt.smooth(gpsValues, anonymousClass2) == coroutine_suspended ? coroutine_suspended : gpsValues;
    }
}
