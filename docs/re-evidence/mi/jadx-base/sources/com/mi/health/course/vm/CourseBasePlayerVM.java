package com.mi.health.course.vm;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import androidx.lifecycle.ViewModelKt;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.mi.health.course.CoursePlayerHolder;
import com.mi.health.course.api.CourseRequest;
import com.mi.health.course.data.CourseSportState;
import com.mi.health.course.data.DeviceState;
import com.mi.health.course.export.data.CourseAllInfo;
import com.mi.health.course.export.data.CourseAllInfoKt;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.ext.CourseExtKt;
import com.mi.health.course.util.LogUtil;
import com.mi.health.course.util.StopWatch;
import com.mi.health.course.vm.CourseBasePlayerVM;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportCourse;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteData;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportSyncDataListener;
import com.xiaomi.fitness.sport_manager_export.listener.RequestCallback;
import com.xiaomi.fitness.training_plan_export.model.TrainingPlanFinishData;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.bop;
import defpackage.i7r;
import defpackage.x7r;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\b¢\u0006\u0005\bì\u0001\u0010\u0014J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u001b\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J7\u0010/\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0014J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\u0014J+\u00108\u001a\u00020\b2\u0006\u00103\u001a\u00020\u00192\b\u00105\u001a\u0004\u0018\u0001042\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J\u0019\u0010<\u001a\u00020\b2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\bH\u0014¢\u0006\u0004\b>\u0010\u0014J\r\u0010?\u001a\u00020\b¢\u0006\u0004\b?\u0010\u0014J\u0015\u0010@\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b@\u0010AJ\u001d\u0010B\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\bD\u0010CJ'\u0010F\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010E\u001a\u00020\u000b¢\u0006\u0004\bF\u0010GJ\u001f\u0010L\u001a\u00020\b2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u001b\u0010Q\u001a\u00020\b2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020O0N¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\bS\u0010TJ'\u0010X\u001a\u00020\b2\u0006\u0010U\u001a\u00020\u00192\u0006\u0010V\u001a\u00020\u00192\u0006\u0010W\u001a\u00020\u0006H\u0016¢\u0006\u0004\bX\u0010YJ\r\u0010Z\u001a\u00020\b¢\u0006\u0004\bZ\u0010\u0014J\r\u0010[\u001a\u00020\u0019¢\u0006\u0004\b[\u0010\\J\u0015\u0010^\u001a\u00020\b2\u0006\u0010]\u001a\u00020\u0019¢\u0006\u0004\b^\u0010_J!\u0010b\u001a\u00020\b2\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0`¢\u0006\u0004\bb\u0010cJ!\u0010e\u001a\u00020\b2\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0`¢\u0006\u0004\be\u0010cJ!\u0010h\u001a\u00020\b2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020\b0`¢\u0006\u0004\bh\u0010cJ!\u0010j\u001a\u00020\b2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020\b0`¢\u0006\u0004\bj\u0010cJ!\u0010k\u001a\u00020\b2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\b0`¢\u0006\u0004\bk\u0010cJ\r\u0010l\u001a\u00020\u0019¢\u0006\u0004\bl\u0010\\J%\u0010p\u001a\u00020\b2\u0006\u0010m\u001a\u00020H2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010o\u001a\u00020n¢\u0006\u0004\bp\u0010qJ\u0015\u0010s\u001a\u00020\u00192\u0006\u0010r\u001a\u00020\u0006¢\u0006\u0004\bs\u0010tJ\u0019\u0010v\u001a\u00020\b2\b\u0010u\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bv\u0010wJ)\u0010z\u001a\u00020\b2\b\u0010u\u001a\u0004\u0018\u00010H2\u0006\u0010x\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\u0006H\u0016¢\u0006\u0004\bz\u0010{J\u0019\u0010|\u001a\u00020\b2\b\u0010u\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\b|\u0010wJ\u0019\u0010}\u001a\u00020\b2\b\u0010u\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\b}\u0010wJ\u000f\u0010~\u001a\u0004\u0018\u00010H¢\u0006\u0004\b~\u0010\u007fR'\u0010\u0080\u0001\u001a\u00020\u00198\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010\\\"\u0005\b\u0083\u0001\u0010_R\u001a\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R'\u0010\u008a\u0001\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\b\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R'\u0010\u008c\u0001\u001a\u0010\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020\b\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008b\u0001R'\u0010\u008d\u0001\u001a\u0010\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020\b\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008b\u0001R \u0010\u0092\u0001\u001a\u00020f8DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0017\u0010m\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bm\u0010\u0093\u0001R\u0017\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000f\u0010\u0094\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0019\u0010\u0097\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0096\u0001R'\u0010\u0098\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u0098\u0001\u0010\u0081\u0001\u001a\u0005\b\u0099\u0001\u0010\\\"\u0005\b\u009a\u0001\u0010_R\u0017\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0007\u0010\u0096\u0001R\u0019\u0010\u009b\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0081\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R!\u0010£\u0001\u001a\u00030\u009f\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b \u0001\u0010\u008f\u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R'\u0010¨\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060¤\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b¥\u0001\u0010\u008f\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R(\u0010©\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b©\u0001\u0010\u0096\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0005\b¬\u0001\u0010\nR)\u0010\u00ad\u0001\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u00ad\u0001\u0010\u0093\u0001\u001a\u0005\b®\u0001\u0010\u007f\"\u0005\b¯\u0001\u0010wR\u0019\u0010°\u0001\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0019\u0010²\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010\u0096\u0001R'\u0010³\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010\u008b\u0001R'\u0010´\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010\u008b\u0001R!\u0010¹\u0001\u001a\u00030µ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¶\u0001\u0010\u008f\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R!\u0010¼\u0001\u001a\u00030µ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bº\u0001\u0010\u008f\u0001\u001a\u0006\b»\u0001\u0010¸\u0001R\u0018\u0010¾\u0001\u001a\u00030½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R*\u0010À\u0001\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0005\bÄ\u0001\u0010*R&\u0010,\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b,\u0010\u0094\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0005\bÇ\u0001\u0010TR\u0019\u0010È\u0001\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010\u0093\u0001R\u0019\u0010É\u0001\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010±\u0001R(\u0010Ê\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÊ\u0001\u0010\u0096\u0001\u001a\u0006\bË\u0001\u0010«\u0001\"\u0005\bÌ\u0001\u0010\nR\u001e\u0010Î\u0001\u001a\t\u0012\u0004\u0012\u00020O0Í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R$\u0010Ñ\u0001\u001a\u000f\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020O0Ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R&\u0010Ô\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ó\u00010¤\u00018\u0006¢\u0006\u0010\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010§\u0001R*\u0010Ø\u0001\u001a\u00030×\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R*\u0010ß\u0001\u001a\u00030Þ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R\u001a\u0010è\u0001\u001a\u0005\u0018\u00010å\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bæ\u0001\u0010ç\u0001R\u0018\u0010ê\u0001\u001a\u0004\u0018\u00010H8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bé\u0001\u0010\u007fR\u0017\u0010u\u001a\u0004\u0018\u00010H8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bë\u0001\u0010\u007f¨\u0006í\u0001"}, d2 = {"Lcom/mi/health/course/vm/CourseBasePlayerVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportDataChangedListener;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportStateChangedListener;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportSyncDataListener;", "", DailyRecordKey.sportType, "", "restartWearSport", "(I)V", "", "duration", "actionCmd", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "courseId", "time", "uploadCourseRecord", "(JJI)V", "timerPause", "()V", "timerStart", "timerCancel", "Lcom/xiaomi/fitness/sport_manager_export/listener/RequestCallback;", "callback", "", "isConnected", "(Lcom/xiaomi/fitness/sport_manager_export/listener/RequestCallback;)Z", "Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;", "getTrackSelector", "()Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;", "Lx7r;", "wearSportData", "onReceiveWearData", "(Lx7r;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/SportLocationResult;", "location", "onLocationChanged", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportLocationResult;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "phoneSportData", "onPhoneDataChanged", "(Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;)V", "code", "startTime", "timeZone", "sportLaunchType", "onSportStarted", "(IIIII)V", "onSportRestarted", "onSportPaused", "validSport", "", "ids", "Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;", "finishSportData", "onSportFinished", "(Z[BLcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;)V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "onCleared", "checkDeviceStatus", "startLocalSport", "(Lcom/xiaomi/fitness/sport_manager_export/listener/RequestCallback;)V", "pauseSport", "(ILcom/xiaomi/fitness/sport_manager_export/listener/RequestCallback;)V", "resumeSport", "planId", "finishSport", "(ILcom/xiaomi/fitness/sport_manager_export/listener/RequestCallback;J)V", "", "item", "", "value", "changeProperty", "(Ljava/lang/String;F)V", "", "Lcom/mi/health/course/export/data/CourseConfigModel$DevCmd;", "cmdList", "setCmdSet", "(Ljava/util/List;)V", "cmd", "(J)V", "result", "isAppLaunch", "deviceStartTime", "onSync", "(ZZI)V", "finishSportState", "isDeviceConnect", "()Z", "enable", "setCmdEnable", "(Z)V", "Lkotlin/Function1;", "onSecondTick", "setOnSecondTick", "(Lkotlin/jvm/functions/Function1;)V", "block", "setOnPlayError", "Lcom/mi/health/course/data/DeviceState;", "change", "setOnDeviceStatus", "Lcom/mi/health/course/data/CourseSportState;", "setOnStateChange", "setOnDataChange", "isSportValid", "model", "Lcom/mi/health/course/export/data/CourseAllInfo;", "info", "initData", "(Ljava/lang/String;ILcom/mi/health/course/export/data/CourseAllInfo;)V", "courseDuration", "isFinishPlanCourse", "(I)Z", "did", "onConnectStart", "(Ljava/lang/String;)V", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;II)V", "onConnectSuccess", "onDisconnect", "getLocalModelStr", "()Ljava/lang/String;", "supportDeviceLink", "Z", "getSupportDeviceLink", "setSupportDeviceLink", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "mSportStateCaller", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteData;", "mSportDataCaller", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteData;", "mOnDataChange", "Lkotlin/jvm/functions/Function1;", "mOnDeviceStatus", "mOnSportState", "deviceStatusObj$delegate", "Lkotlin/Lazy;", "getDeviceStatusObj", "()Lcom/mi/health/course/data/DeviceState;", "deviceStatusObj", "Ljava/lang/String;", "J", "configCalorie", "I", "configDuration", "sportIsFinished", "getSportIsFinished", "setSportIsFinished", "cmdEnable", "Lcom/mi/health/course/CoursePlayerHolder;", "playerHolder", "Lcom/mi/health/course/CoursePlayerHolder;", "Lcom/google/android/exoplayer2/q;", "player$delegate", "getPlayer", "()Lcom/google/android/exoplayer2/q;", "player", "Landroidx/lifecycle/MutableLiveData;", "progressEmitter$delegate", "getProgressEmitter", "()Landroidx/lifecycle/MutableLiveData;", "progressEmitter", BroadcastsKt.SILENT_PUSHING_PROGRESS, "getProgress", "()I", "setProgress", "otherDevice", "getOtherDevice", "setOtherDevice", "progressFactor", "F", "bufferReason", "onPlayError", "onTick", "Lcom/mi/health/course/util/StopWatch;", "durationTimer$delegate", "getDurationTimer", "()Lcom/mi/health/course/util/StopWatch;", "durationTimer", "progressTimer$delegate", "getProgressTimer", "progressTimer", "Lcom/google/android/exoplayer2/q$e;", "playerListener", "Lcom/google/android/exoplayer2/q$e;", "mSportData", "Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "getMSportData", "()Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "setMSportData", "getStartTime", "()J", "setStartTime", "preItem", "preValue", "cmdCount", "getCmdCount", "setCmdCount", "Ljava/util/TreeSet;", "cmdSet", "Ljava/util/TreeSet;", "", "preCmdMap", "Ljava/util/Map;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "recordEmitter", "Landroidx/lifecycle/MutableLiveData;", "getRecordEmitter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "dataGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDataGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "setDataGetter", "(Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;)V", "Lcom/mi/health/course/api/CourseRequest;", "request", "Lcom/mi/health/course/api/CourseRequest;", "getRequest", "()Lcom/mi/health/course/api/CourseRequest;", "setRequest", "(Lcom/mi/health/course/api/CourseRequest;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getLocalDevice", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "localDevice", "getRecordSid", "recordSid", "getDid", "<init>", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCourseBasePlayerVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseBasePlayerVM.kt\ncom/mi/health/course/vm/CourseBasePlayerVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,505:1\n1863#2,2:506\n*S KotlinDebug\n*F\n+ 1 CourseBasePlayerVM.kt\ncom/mi/health/course/vm/CourseBasePlayerVM\n*L\n346#1:506,2\n*E\n"})
public class CourseBasePlayerVM extends AbsViewModel implements ISportDataChangedListener, ISportStateChangedListener, OnDeviceStatusListener, ISportSyncDataListener {
    private int cmdCount;
    private int configCalorie;
    private int configDuration;
    private long courseId;
    public FitnessDataGetter dataGetter;

    @Nullable
    private Function1<? super PhoneSportData, Unit> mOnDataChange;

    @Nullable
    private Function1<? super DeviceState, Unit> mOnDeviceStatus;

    @Nullable
    private Function1<? super CourseSportState, Unit> mOnSportState;

    @Nullable
    private PhoneSportData mSportData;

    @Nullable
    private Function1<? super Boolean, Unit> onPlayError;

    @Nullable
    private Function1<? super Long, Unit> onTick;

    @Nullable
    private String otherDevice;
    private float preValue;
    private int progress;
    private float progressFactor;
    public CourseRequest request;
    private boolean sportIsFinished;
    private int sportType;
    private long startTime;
    private boolean supportDeviceLink;

    @NotNull
    private ISportRemoteState mSportStateCaller = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);

    @NotNull
    private ISportRemoteData mSportDataCaller = SportManagerExtKt.getInstance(ISportRemoteData.INSTANCE);

    /* JADX INFO: renamed from: deviceStatusObj$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceStatusObj = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: so4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseBasePlayerVM.deviceStatusObj_delegate$lambda$0();
        }
    });

    @NotNull
    private String model = "";
    private boolean cmdEnable = true;

    @NotNull
    private final CoursePlayerHolder playerHolder = new CoursePlayerHolder();

    /* JADX INFO: renamed from: player$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy player = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: to4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseBasePlayerVM.player_delegate$lambda$1(this.f34888a);
        }
    });

    /* JADX INFO: renamed from: progressEmitter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressEmitter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: uo4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseBasePlayerVM.progressEmitter_delegate$lambda$2();
        }
    });
    private int bufferReason = 3;

    /* JADX INFO: renamed from: durationTimer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy durationTimer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: vo4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseBasePlayerVM.durationTimer_delegate$lambda$4(this.f37080a);
        }
    });

    /* JADX INFO: renamed from: progressTimer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressTimer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wo4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseBasePlayerVM.progressTimer_delegate$lambda$6(this.f38189a);
        }
    });

    @NotNull
    private final q.e playerListener = new CourseBasePlayerVM$playerListener$1(this);

    @NotNull
    private String preItem = "";

    @NotNull
    private final TreeSet<CourseConfigModel.DevCmd> cmdSet = new TreeSet<>();

    @NotNull
    private final Map<String, CourseConfigModel.DevCmd> preCmdMap = new LinkedHashMap();

    @NotNull
    private final MutableLiveData<SportBasicReport> recordEmitter = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.mi.health.course.vm.CourseBasePlayerVM$actionCmd$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.vm.CourseBasePlayerVM$actionCmd$2", f = "CourseBasePlayerVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCourseBasePlayerVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseBasePlayerVM.kt\ncom/mi/health/course/vm/CourseBasePlayerVM$actionCmd$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1863#2:506\n1864#2:508\n1#3:507\n*S KotlinDebug\n*F\n+ 1 CourseBasePlayerVM.kt\ncom/mi/health/course/vm/CourseBasePlayerVM$actionCmd$2\n*L\n358#1:506\n358#1:508\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $duration;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$duration = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CourseBasePlayerVM.this.new AnonymousClass2(this.$duration, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<String> CMD_ITEM_WARE = CourseConfigModel.DevCmd.CMD_ITEM_WARE;
            Intrinsics.checkNotNullExpressionValue(CMD_ITEM_WARE, "CMD_ITEM_WARE");
            CourseBasePlayerVM courseBasePlayerVM = CourseBasePlayerVM.this;
            long j = this.$duration;
            for (String str : CMD_ITEM_WARE) {
                Object obj2 = null;
                for (Object obj3 : courseBasePlayerVM.cmdSet) {
                    CourseConfigModel.DevCmd devCmd = (CourseConfigModel.DevCmd) obj3;
                    if (Intrinsics.areEqual(str, devCmd.triggerItem) && devCmd.timeInMills <= j) {
                        obj2 = obj3;
                    }
                }
                CourseConfigModel.DevCmd devCmd2 = (CourseConfigModel.DevCmd) obj2;
                if (devCmd2 != null) {
                    CourseConfigModel.DevCmd devCmd3 = (CourseConfigModel.DevCmd) courseBasePlayerVM.preCmdMap.get(str);
                    if (devCmd2.valid() && !Intrinsics.areEqual(devCmd3, devCmd2)) {
                        String triggerValue = devCmd2.triggerValue;
                        Intrinsics.checkNotNullExpressionValue(triggerValue, "triggerValue");
                        Float floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(triggerValue);
                        if (floatOrNull != null) {
                            float fFloatValue = floatOrNull.floatValue();
                            courseBasePlayerVM.preCmdMap.put(str, devCmd2);
                            Logger.i("CoursePlayerVM", "actionCmd: duration = " + j + "; cmd = " + devCmd2);
                            Intrinsics.checkNotNull(str);
                            courseBasePlayerVM.changeProperty(str, fFloatValue);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.vm.CourseBasePlayerVM$cmd$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.vm.CourseBasePlayerVM$cmd$1", f = "CourseBasePlayerVM.kt", i = {}, l = {354}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $duration;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14651(long j, Continuation<? super C14651> continuation) {
            super(2, continuation);
            this.$duration = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CourseBasePlayerVM.this.new C14651(this.$duration, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseBasePlayerVM courseBasePlayerVM = CourseBasePlayerVM.this;
                long j = this.$duration;
                this.label = 1;
                if (courseBasePlayerVM.actionCmd(j, this) == coroutine_suspended) {
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
            return ((C14651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.vm.CourseBasePlayerVM$onSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.vm.CourseBasePlayerVM$onSync$1", f = "CourseBasePlayerVM.kt", i = {}, l = {382}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14661(String str, Continuation<? super C14661> continuation) {
            super(2, continuation);
            this.$sid = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CourseBasePlayerVM.this.new C14661(this.$sid, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                CourseBasePlayerVM$onSync$1$ret$1 courseBasePlayerVM$onSync$1$ret$1 = new CourseBasePlayerVM$onSync$1$ret$1(CourseBasePlayerVM.this, this.$sid, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, courseBasePlayerVM$onSync$1$ret$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SportBasicReport sportBasicReport = (SportBasicReport) obj;
            Logger.i("CoursePlayerVM", "onSync: start = " + CourseBasePlayerVM.this.getStartTime() + ", " + sportBasicReport);
            CourseBasePlayerVM.this.getRecordEmitter().setValue(sportBasicReport);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.vm.CourseBasePlayerVM$uploadCourseRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.vm.CourseBasePlayerVM$uploadCourseRecord$1", f = "CourseBasePlayerVM.kt", i = {}, l = {408}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $courseId;
        final /* synthetic */ int $sportType;
        final /* synthetic */ long $time;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14681(long j, long j2, int i, Continuation<? super C14681> continuation) {
            super(2, continuation);
            this.$courseId = j;
            this.$time = j2;
            this.$sportType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CourseBasePlayerVM.this.new C14681(this.$courseId, this.$time, this.$sportType, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseRequest request = CourseBasePlayerVM.this.getRequest();
                long j = this.$courseId;
                long j2 = this.$time;
                String recordSid = CourseBasePlayerVM.this.getRecordSid();
                int i2 = this.$sportType;
                this.label = 1;
                obj = request.postCourseTrainRecord(j, j2, recordSid, i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Logger.d("CoursePlayerVM", "uploadCourseRecord: " + ((CourseModel.RequestResult) obj).success + ".");
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object actionCmd(long j, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getDefault(), new AnonymousClass2(j, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkDeviceStatus$lambda$7(CourseBasePlayerVM this$0, boolean z) {
        String name;
        String name2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        boolean z2 = false;
        this$0.getDeviceStatusObj().setWearConnect(wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected());
        DeviceState deviceStatusObj = this$0.getDeviceStatusObj();
        String str = "";
        if (wearableDeviceModel == null || (name = DeviceModelExtKt.getName(wearableDeviceModel)) == null) {
            name = "";
        }
        deviceStatusObj.setWearName(name);
        this$0.getDeviceStatusObj().setWearHas(z && wearableDeviceModel != null);
        this$0.getDeviceStatusObj().setSportHas(true);
        DeviceState deviceStatusObj2 = this$0.getDeviceStatusObj();
        WearableDeviceModel localDevice = this$0.getLocalDevice();
        if (localDevice != null && localDevice.getIsDeviceConnected()) {
            z2 = true;
        }
        deviceStatusObj2.setSportConnect(z2);
        DeviceState deviceStatusObj3 = this$0.getDeviceStatusObj();
        WearableDeviceModel localDevice2 = this$0.getLocalDevice();
        if (localDevice2 != null && (name2 = DeviceModelExtKt.getName(localDevice2)) != null) {
            str = name2;
        }
        deviceStatusObj3.setSportName(str);
        Logger.i("CoursePlayerVM", "checkDeviceStatus: " + this$0.getDeviceStatusObj());
        Function1<? super DeviceState, Unit> function1 = this$0.mOnDeviceStatus;
        if (function1 != null) {
            function1.invoke2(this$0.getDeviceStatusObj());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceState deviceStatusObj_delegate$lambda$0() {
        return new DeviceState(false, false, null, false, false, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StopWatch durationTimer_delegate$lambda$4(final CourseBasePlayerVM this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new StopWatch(0L, new Function1() { // from class: yo4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseBasePlayerVM.durationTimer_delegate$lambda$4$lambda$3(this.f40366a, ((Long) obj).longValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit durationTimer_delegate$lambda$4$lambda$3(CourseBasePlayerVM this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Long, Unit> function1 = this$0.onTick;
        if (function1 != null) {
            function1.invoke2(Long.valueOf(j));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void finishSport$default(CourseBasePlayerVM courseBasePlayerVM, int i, RequestCallback requestCallback, long j, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishSport");
        }
        if ((i2 & 4) != 0) {
            j = 0;
        }
        courseBasePlayerVM.finishSport(i, requestCallback, j);
    }

    private final String getDid() {
        WearableDeviceModel localDevice;
        if (this.supportDeviceLink) {
            localDevice = getLocalDevice();
            if (localDevice == null) {
                return null;
            }
        } else {
            localDevice = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (localDevice == null) {
                return null;
            }
        }
        return localDevice.getDid();
    }

    private final StopWatch getDurationTimer() {
        return (StopWatch) this.durationTimer.getValue();
    }

    private final WearableDeviceModel getLocalDevice() {
        return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getLocalDeviceModel(this.model);
    }

    private final StopWatch getProgressTimer() {
        return (StopWatch) this.progressTimer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getRecordSid() {
        if (!this.supportDeviceLink) {
            return "xiaomiwear_app";
        }
        WearableDeviceModel localDevice = getLocalDevice();
        if (localDevice != null) {
            return localDevice.getDid();
        }
        return null;
    }

    private final boolean isConnected(RequestCallback callback) {
        WearableDeviceModel localDevice = getLocalDevice();
        boolean zIsDeviceConnected = localDevice != null ? localDevice.getIsDeviceConnected() : false;
        if (!zIsDeviceConnected) {
            if (callback != null) {
                callback.call(1);
            }
            Logger.i("CoursePlayerVM", "local device disconnect");
        }
        return zIsDeviceConnected;
    }

    public static /* synthetic */ boolean isConnected$default(CourseBasePlayerVM courseBasePlayerVM, RequestCallback requestCallback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isConnected");
        }
        if ((i & 1) != 0) {
            requestCallback = null;
        }
        return courseBasePlayerVM.isConnected(requestCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q player_delegate$lambda$1(CourseBasePlayerVM this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.playerHolder.getPlayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData progressEmitter_delegate$lambda$2() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StopWatch progressTimer_delegate$lambda$6(final CourseBasePlayerVM this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new StopWatch(100L, new Function1() { // from class: xo4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseBasePlayerVM.progressTimer_delegate$lambda$6$lambda$5(this.f39304a, ((Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit progressTimer_delegate$lambda$6$lambda$5(CourseBasePlayerVM this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.progress = (int) (this$0.progressFactor * this$0.getPlayer().getCurrentPosition());
        this$0.getProgressEmitter().setValue(Integer.valueOf(this$0.progress));
        return Unit.INSTANCE;
    }

    private final void restartWearSport(int sportType) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        FitnessLogUtils.i("CoursePlayerVM", "restartWearSport");
        this.mSportStateCaller.restartSport(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, sportType, new RequestCallback() { // from class: com.mi.health.course.vm.CourseBasePlayerVM.restartWearSport.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                Logger.i("CoursePlayerVM", "restartSport: res = " + responseCode);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void timerCancel() {
        getDurationTimer().cancel();
        getProgressTimer().cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void timerPause() {
        getDurationTimer().pause();
        getProgressTimer().pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void timerStart() {
        getDurationTimer().start();
        getProgressTimer().start();
    }

    private final void uploadCourseRecord(long courseId, long time, int sportType) {
        String recordSid = getRecordSid();
        if (recordSid == null || recordSid.length() == 0) {
            return;
        }
        ScopeExtKt.scopeNetLife$default(this, null, new C14681(courseId, time, sportType, null), 1, null).m503catch(new Function2() { // from class: zo4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CourseBasePlayerVM.uploadCourseRecord$lambda$10((AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadCourseRecord$lambda$10(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e("CoursePlayerVM", "uploadCourseRecord: " + it.getMessage());
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        getPlayer().K(this.playerListener);
        this.mSportStateCaller.setSportSyncDataListener(this);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this);
        this.mSportStateCaller.addSportStateChangedListener(getClass(), this);
        this.mSportDataCaller.addSportDataChangedListener(getClass(), this);
        FitnessLogUtils.i("CoursePlayerVM", "addSportDataChangedListener");
    }

    public void changeProperty(@NotNull String item, float value) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.supportDeviceLink) {
            if (!Intrinsics.areEqual(this.preItem, item) || this.preValue != value) {
                this.cmdCount++;
                this.preItem = item;
                this.preValue = value;
            }
            if (Intrinsics.areEqual(item, "speed")) {
                this.mSportStateCaller.setGymSpeed(value, new RequestCallback() { // from class: com.mi.health.course.vm.CourseBasePlayerVM.changeProperty.1
                    @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
                    public void call(int responseCode) {
                        Logger.i("CoursePlayerVM", "changeProperty cmd: res = " + responseCode);
                    }
                });
            } else {
                Intrinsics.areEqual(item, "resistance");
            }
        }
    }

    public final void checkDeviceStatus() {
        String name;
        if (this.supportDeviceLink) {
            this.mSportStateCaller.isSupportLaunchSport(this.sportType, new i7r() { // from class: ap4
                @Override // defpackage.i7r
                public final void a(Boolean bool) {
                    CourseBasePlayerVM.checkDeviceStatus$lambda$7(this.f3316a, bool.booleanValue());
                }
            });
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        getDeviceStatusObj().setWearConnect(wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected());
        DeviceState deviceStatusObj = getDeviceStatusObj();
        if (wearableDeviceModel == null || (name = DeviceModelExtKt.getName(wearableDeviceModel)) == null) {
            name = "";
        }
        deviceStatusObj.setWearName(name);
        getDeviceStatusObj().setWearHas(wearableDeviceModel != null);
        getDeviceStatusObj().setSportHas(false);
        Logger.i("CoursePlayerVM", "checkDeviceStatus: " + getDeviceStatusObj());
        Function1<? super DeviceState, Unit> function1 = this.mOnDeviceStatus;
        if (function1 != null) {
            function1.invoke2(getDeviceStatusObj());
        }
    }

    public final void cmd(long duration) {
        if (!this.cmdSet.isEmpty() && this.cmdEnable && this.supportDeviceLink) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C14651(duration, null), 3, null);
        }
    }

    public final void finishSport(int sportType, @NotNull RequestCallback callback, long planId) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Logger.i("CoursePlayerVM", "finishSport: sportType = " + sportType + " ");
        if (!this.supportDeviceLink || isConnected(callback)) {
            if (planId == 0) {
                this.mSportStateCaller.finishSport(getDid(), sportType, callback);
                return;
            }
            FinishSportData finishSportData = new FinishSportData();
            finishSportData.setSportType(sportType);
            finishSportData.setTrainingPlanFinishData(new TrainingPlanFinishData(planId, null, null, 6, null));
            this.mSportStateCaller.finishSport(getDid(), finishSportData, callback);
        }
    }

    public final void finishSportState() {
        this.mSportStateCaller.abnormalChangeSportStateToFinish();
    }

    public final int getCmdCount() {
        return this.cmdCount;
    }

    @NotNull
    public final FitnessDataGetter getDataGetter() {
        FitnessDataGetter fitnessDataGetter = this.dataGetter;
        if (fitnessDataGetter != null) {
            return fitnessDataGetter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataGetter");
        return null;
    }

    @NotNull
    public final DeviceState getDeviceStatusObj() {
        return (DeviceState) this.deviceStatusObj.getValue();
    }

    @Nullable
    public final String getLocalModelStr() {
        WearableDeviceModel localDevice = getLocalDevice();
        if (localDevice != null) {
            return DeviceModelExtKt.getModel(localDevice);
        }
        return null;
    }

    @Nullable
    public final PhoneSportData getMSportData() {
        return this.mSportData;
    }

    @Nullable
    public final String getOtherDevice() {
        return this.otherDevice;
    }

    @NotNull
    public final q getPlayer() {
        return (q) this.player.getValue();
    }

    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final MutableLiveData<Integer> getProgressEmitter() {
        return (MutableLiveData) this.progressEmitter.getValue();
    }

    @NotNull
    public final MutableLiveData<SportBasicReport> getRecordEmitter() {
        return this.recordEmitter;
    }

    @NotNull
    public final CourseRequest getRequest() {
        CourseRequest courseRequest = this.request;
        if (courseRequest != null) {
            return courseRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("request");
        return null;
    }

    public final boolean getSportIsFinished() {
        return this.sportIsFinished;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final boolean getSupportDeviceLink() {
        return this.supportDeviceLink;
    }

    @NotNull
    public final DefaultTrackSelector getTrackSelector() {
        bop trackSelector = this.playerHolder.getTrackSelector();
        Intrinsics.checkNotNull(trackSelector, "null cannot be cast to non-null type com.google.android.exoplayer2.trackselection.DefaultTrackSelector");
        return (DefaultTrackSelector) trackSelector;
    }

    public final void initData(@NotNull String model, int sportType, @NotNull CourseAllInfo info) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(info, "info");
        this.model = model;
        this.sportType = sportType;
        this.supportDeviceLink = CourseExtKt.supportLink(info.getDeviceLinkage());
        CourseModel.CourseData basicInfo = info.getBasicInfo();
        this.configCalorie = basicInfo != null ? CourseExtKt.getCalorie(basicInfo) : 0;
        CourseModel.CourseData basicInfo2 = info.getBasicInfo();
        this.configDuration = (basicInfo2 != null ? basicInfo2.duration : 0) * 60;
        long courseId = info.getCourseId();
        this.courseId = courseId;
        Logger.i("CoursePlayerVM", "initData: model = " + model + "; sportType = " + sportType + "; linkage = " + this.supportDeviceLink + "; calorie = " + this.configCalorie + "; duration = " + this.configDuration + ", courseId = " + courseId);
    }

    public final boolean isDeviceConnect() {
        WearableDeviceModel localDevice = getLocalDevice();
        return localDevice != null && localDevice.getIsDeviceConnected();
    }

    public final boolean isFinishPlanCourse(int courseDuration) {
        PhoneSportData phoneSportData = this.mSportData;
        if (phoneSportData == null) {
            phoneSportData = new PhoneSportData();
        }
        return phoneSportData.duration >= 60;
    }

    public final boolean isSportValid() {
        WearableDeviceModel localDevice;
        if (this.supportDeviceLink && ((localDevice = getLocalDevice()) == null || !localDevice.getIsDeviceConnected())) {
            return true;
        }
        PhoneSportData phoneSportData = this.mSportData;
        if (phoneSportData == null) {
            phoneSportData = new PhoneSportData();
        }
        Logger.i("CoursePlayerVM", "popTooShort: data = " + phoneSportData);
        return this.mSportStateCaller.isSportValid(phoneSportData);
    }

    @Override // defpackage.dvq
    public void onCleared() {
        super.onCleared();
        this.mSportStateCaller.setSportSyncDataListener(null);
        timerCancel();
        this.mSportStateCaller.removeSportStateChangedListener(getClass());
        this.mSportDataCaller.removeSportDataChangedListener(getClass(), this);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this);
        getPlayer().f(this.playerListener);
        this.playerHolder.release();
        Logger.d("CoursePlayerVM", "releasePlayer: ");
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(@Nullable String did, int errorCode, int retryTimes) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(@Nullable String did) {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(@Nullable String did) {
        LogUtil.INSTANCE.i("CoursePlayerVM", "onConnectSuccess=" + did);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (this.supportDeviceLink) {
            WearableDeviceModel localDevice = getLocalDevice();
            if (Intrinsics.areEqual(localDevice != null ? localDevice.getDid() : null, did)) {
                this.mSportStateCaller.syncLocalDeviceSportStatus();
            } else {
                if (Intrinsics.areEqual(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, did)) {
                    restartWearSport(this.sportType);
                }
            }
        } else {
            if (Intrinsics.areEqual(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, did)) {
                restartWearSport(this.sportType);
            }
        }
        checkDeviceStatus();
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(@Nullable String did) {
        LogUtil.INSTANCE.i("CoursePlayerVM", "onDisconnect=" + did);
        checkDeviceStatus();
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onLocationChanged(@Nullable SportLocationResult location) {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(@Nullable PhoneSportData phoneSportData) {
        Logger.i("CoursePlayerVM", "onPhoneDataChanged: " + phoneSportData);
        if (phoneSportData == null) {
            return;
        }
        this.mSportData = phoneSportData;
        Function1<? super PhoneSportData, Unit> function1 = this.mOnDataChange;
        if (function1 != null) {
            function1.invoke2(phoneSportData);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(@Nullable x7r wearSportData) {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean validSport, @Nullable byte[] ids, @Nullable FinishSportData finishSportData) {
        Function1<? super CourseSportState, Unit> function1 = this.mOnSportState;
        if (function1 != null) {
            function1.invoke2(new CourseSportState.Finish(validSport));
        }
        Logger.i("CoursePlayerVM", "onSportFinished called.");
        this.sportIsFinished = true;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        Function1<? super CourseSportState, Unit> function1 = this.mOnSportState;
        if (function1 != null) {
            function1.invoke2(CourseSportState.Pause.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        Function1<? super CourseSportState, Unit> function1 = this.mOnSportState;
        if (function1 != null) {
            function1.invoke2(CourseSportState.Restart.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportSegment(int i, int i2) {
        ISportStateChangedListener.DefaultImpls.onSportSegment(this, i, i2);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int code, int startTime, int timeZone, int sportType, int sportLaunchType) {
        Function1<? super CourseSportState, Unit> function1 = this.mOnSportState;
        if (function1 != null) {
            function1.invoke2(new CourseSportState.Start(startTime, sportType));
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportSyncDataListener
    public void onSync(boolean result, boolean isAppLaunch, int deviceStartTime) {
        String recordSid = getRecordSid();
        Logger.i("CoursePlayerVM", "onSync: sid = " + recordSid + ", sportType= " + this.sportType + ", time = " + this.startTime);
        if (recordSid == null || recordSid.length() == 0) {
            this.recordEmitter.setValue(null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C14661(recordSid, null), 3, null);
        }
    }

    public final void pauseSport(int sportType, @NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.supportDeviceLink || isConnected(callback)) {
            this.mSportStateCaller.pauseSport(getDid(), sportType, callback);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void preSport() {
        ISportStateChangedListener.DefaultImpls.preSport(this);
    }

    public final void resumeSport(int sportType, @NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.supportDeviceLink || isConnected(callback)) {
            this.mSportStateCaller.resumeSport(getDid(), sportType, callback);
        }
    }

    public final void setCmdCount(int i) {
        this.cmdCount = i;
    }

    public final void setCmdEnable(boolean enable) {
        this.cmdEnable = enable;
    }

    public final void setCmdSet(@NotNull List<? extends CourseConfigModel.DevCmd> cmdList) {
        Intrinsics.checkNotNullParameter(cmdList, "cmdList");
        if (this.supportDeviceLink) {
            for (CourseConfigModel.DevCmd devCmd : cmdList) {
                String time = devCmd.time;
                Intrinsics.checkNotNullExpressionValue(time, "time");
                devCmd.timeInMills = CourseAllInfoKt.parseTime(time);
            }
            this.cmdSet.addAll(cmdList);
            Logger.i("CoursePlayerVM", "setLinkage: cmdSet = " + this.cmdSet);
        }
    }

    public final void setDataGetter(@NotNull FitnessDataGetter fitnessDataGetter) {
        Intrinsics.checkNotNullParameter(fitnessDataGetter, "<set-?>");
        this.dataGetter = fitnessDataGetter;
    }

    public final void setMSportData(@Nullable PhoneSportData phoneSportData) {
        this.mSportData = phoneSportData;
    }

    public final void setOnDataChange(@NotNull Function1<? super PhoneSportData, Unit> change) {
        Intrinsics.checkNotNullParameter(change, "change");
        this.mOnDataChange = change;
    }

    public final void setOnDeviceStatus(@NotNull Function1<? super DeviceState, Unit> change) {
        Intrinsics.checkNotNullParameter(change, "change");
        this.mOnDeviceStatus = change;
    }

    public final void setOnPlayError(@NotNull Function1<? super Boolean, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.onPlayError = block;
    }

    public final void setOnSecondTick(@NotNull Function1<? super Long, Unit> onSecondTick) {
        Intrinsics.checkNotNullParameter(onSecondTick, "onSecondTick");
        this.onTick = onSecondTick;
    }

    public final void setOnStateChange(@NotNull Function1<? super CourseSportState, Unit> change) {
        Intrinsics.checkNotNullParameter(change, "change");
        this.mOnSportState = change;
    }

    public final void setOtherDevice(@Nullable String str) {
        this.otherDevice = str;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setRequest(@NotNull CourseRequest courseRequest) {
        Intrinsics.checkNotNullParameter(courseRequest, "<set-?>");
        this.request = courseRequest;
    }

    public final void setSportIsFinished(boolean z) {
        this.sportIsFinished = z;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setSupportDeviceLink(boolean z) {
        this.supportDeviceLink = z;
    }

    public final void startLocalSport(@NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.supportDeviceLink || isConnected(callback)) {
            Logger.i("CoursePlayerVM", "startLocalSport: ");
            long jCurrentTimeMillis = System.currentTimeMillis();
            long offset = TimeZone.getDefault().getOffset(jCurrentTimeMillis);
            SportCourse sportCourse = new SportCourse();
            sportCourse.setCloudCourseId(this.courseId);
            sportCourse.setCloudCourseReferenceCal(this.configCalorie);
            sportCourse.setCourseDuration(this.configDuration);
            sportCourse.setType(255);
            SportRequestData.a aVar = new SportRequestData.a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            SportRequestData sportRequestDataO = aVar.B(jCurrentTimeMillis, timeUnit).D(offset, timeUnit).z(this.sportType).p(sportCourse).y(null).x(1).o();
            ISportRemoteState iSportRemoteState = this.mSportStateCaller;
            String did = getDid();
            Intrinsics.checkNotNull(sportRequestDataO);
            iSportRemoteState.startSport(did, sportRequestDataO, callback);
            long seconds = timeUnit.toSeconds(jCurrentTimeMillis);
            this.startTime = seconds;
            uploadCourseRecord(this.courseId, seconds, this.sportType);
        }
    }
}
