package com.mi.health.course.eco.vm;

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
import com.mi.health.course.eco.vm.EcoCourseBasePlayerVM;
import com.mi.health.course.export.data.CourseAllInfo;
import com.mi.health.course.export.data.CourseAllInfoKt;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.ext.CourseExtKt;
import com.mi.health.course.util.LogUtil;
import com.mi.health.course.util.StopWatch;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.sport_eco_manager_export.SportConstants;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportCourse;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteData;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportSyncDataListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.bop;
import defpackage.j7r;
import defpackage.y7r;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NotImplementedError;
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
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\b¢\u0006\u0005\bé\u0001\u0010\u0018J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u001b\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J/\u0010.\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010\u0018J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0018J!\u00105\u001a\u00020\b2\u0006\u00102\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J\u0019\u00109\u001a\u00020\b2\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\bH\u0014¢\u0006\u0004\b;\u0010\u0018J\r\u0010<\u001a\u00020\b¢\u0006\u0004\b<\u0010\u0018J\u0015\u0010=\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\bA\u0010@J\u001d\u0010B\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\bB\u0010@J\u001f\u0010F\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u001b\u0010K\u001a\u00020\b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H¢\u0006\u0004\bK\u0010LJ\u0015\u0010M\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\bM\u0010NJ'\u0010R\u001a\u00020\b2\u0006\u0010O\u001a\u00020\u001d2\u0006\u0010P\u001a\u00020\u001d2\u0006\u0010Q\u001a\u00020\u0006H\u0016¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020\b¢\u0006\u0004\bT\u0010\u0018J\r\u0010U\u001a\u00020\u001d¢\u0006\u0004\bU\u0010VJ\u0015\u0010X\u001a\u00020\b2\u0006\u0010W\u001a\u00020\u001d¢\u0006\u0004\bX\u0010YJ!\u0010\\\u001a\u00020\b2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0Z¢\u0006\u0004\b\\\u0010]J!\u0010_\u001a\u00020\b2\u0012\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b0Z¢\u0006\u0004\b_\u0010]J!\u0010`\u001a\u00020\b2\u0012\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0Z¢\u0006\u0004\b`\u0010]J!\u0010c\u001a\u00020\b2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\b0Z¢\u0006\u0004\bc\u0010]J!\u0010e\u001a\u00020\b2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\b0Z¢\u0006\u0004\be\u0010]J!\u0010f\u001a\u00020\b2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\b0Z¢\u0006\u0004\bf\u0010]J!\u0010g\u001a\u00020\b2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0Z¢\u0006\u0004\bg\u0010]J\r\u0010h\u001a\u00020\u001d¢\u0006\u0004\bh\u0010VJ%\u0010l\u001a\u00020\b2\u0006\u0010i\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010k\u001a\u00020j¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bn\u0010oJ!\u0010r\u001a\u00020\b2\b\u0010p\u001a\u0004\u0018\u00010\u000b2\u0006\u0010q\u001a\u00020\u000bH\u0016¢\u0006\u0004\br\u0010sJ1\u0010v\u001a\u00020\b2\b\u0010p\u001a\u0004\u0018\u00010\u000b2\u0006\u0010q\u001a\u00020\u000b2\u0006\u0010t\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\u0006H\u0016¢\u0006\u0004\bv\u0010wJ!\u0010x\u001a\u00020\b2\b\u0010p\u001a\u0004\u0018\u00010\u000b2\u0006\u0010q\u001a\u00020\u000bH\u0016¢\u0006\u0004\bx\u0010sJ!\u0010y\u001a\u00020\b2\b\u0010p\u001a\u0004\u0018\u00010\u000b2\u0006\u0010q\u001a\u00020\u000bH\u0016¢\u0006\u0004\by\u0010sJ\r\u0010z\u001a\u00020\u001d¢\u0006\u0004\bz\u0010VR\"\u0010{\u001a\u00020\u001d8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b{\u0010|\u001a\u0004\b}\u0010V\"\u0004\b~\u0010YR\u0019\u0010\u0080\u0001\u001a\u00020\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R'\u0010\u0085\u0001\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\b\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R'\u0010\u0087\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0086\u0001R'\u0010\u0088\u0001\u001a\u0010\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\b\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0086\u0001R'\u0010\u0089\u0001\u001a\u0010\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\b\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0086\u0001R \u0010\u008e\u0001\u001a\u00020a8DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R&\u0010i\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bi\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010o\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0017\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0013\u0010\u0093\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0019\u0010\u0096\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0095\u0001R\u0017\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0007\u0010\u0095\u0001R\u0018\u0010\u0097\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010|R\u0018\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R!\u0010\u009f\u0001\u001a\u00030\u009b\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u008b\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R'\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060 \u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u008b\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R(\u0010¥\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¥\u0001\u0010\u0095\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0005\b¨\u0001\u0010\nR*\u0010©\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b©\u0001\u0010\u008f\u0001\u001a\u0005\bª\u0001\u0010o\"\u0006\b«\u0001\u0010\u0092\u0001R\u0019\u0010¬\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0019\u0010®\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010\u0095\u0001R'\u0010¯\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010\u0086\u0001R'\u0010°\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010\u0086\u0001R'\u0010±\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010\u0086\u0001R!\u0010¶\u0001\u001a\u00030²\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b³\u0001\u0010\u008b\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R!\u0010¹\u0001\u001a\u00030²\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b·\u0001\u0010\u008b\u0001\u001a\u0006\b¸\u0001\u0010µ\u0001R\u0018\u0010»\u0001\u001a\u00030º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R*\u0010½\u0001\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0005\bÁ\u0001\u0010*R&\u0010+\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b+\u0010\u0093\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0005\bÄ\u0001\u0010NR\u0019\u0010Å\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010\u008f\u0001R\u0019\u0010Æ\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010\u00ad\u0001R(\u0010Ç\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÇ\u0001\u0010\u0095\u0001\u001a\u0006\bÈ\u0001\u0010§\u0001\"\u0005\bÉ\u0001\u0010\nR\u001e\u0010Ë\u0001\u001a\t\u0012\u0004\u0012\u00020I0Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R$\u0010Î\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020I0Í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R&\u0010Ñ\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ð\u00010 \u00018\u0006¢\u0006\u0010\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010£\u0001R*\u0010Õ\u0001\u001a\u00030Ô\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R*\u0010Ü\u0001\u001a\u00030Û\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÜ\u0001\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R\u001a\u0010å\u0001\u001a\u0005\u0018\u00010â\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bã\u0001\u0010ä\u0001R\u0018\u0010ç\u0001\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bæ\u0001\u0010oR\u0017\u0010p\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bè\u0001\u0010o¨\u0006ê\u0001"}, d2 = {"Lcom/mi/health/course/eco/vm/EcoCourseBasePlayerVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportDataChangedListener;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportSyncDataListener;", "", DailyRecordKey.sportType, "", "restartWearSport", "(I)V", "", "ftpRpmValue", "getFtpRpm", "(Ljava/lang/String;)I", "", "duration", "actionCmd", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "courseId", "time", "uploadCourseRecord", "(JJI)V", "timerPause", "()V", "timerStart", "timerCancel", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;", "callback", "", "isConnected", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)Z", "Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;", "getTrackSelector", "()Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;", "Ly7r;", "wearSportData", "onReceiveWearData", "(Ly7r;)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "phoneSportData", "onPhoneDataChanged", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;)V", "startTime", "timeZone", "sportLaunchType", "onSportStarted", "(IIII)V", "onSportRestarted", "onSportPaused", "validSport", "", "ids", "onSportFinished", "(Z[B)V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "onCleared", "checkDeviceStatus", "startLocalSport", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)V", "pauseSport", "(ILcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)V", "resumeSport", "finishSport", "item", "", "value", "changeProperty", "(Ljava/lang/String;F)V", "", "Lcom/mi/health/course/export/data/CourseConfigModel$DevCmd;", "cmdList", "setCmdSet", "(Ljava/util/List;)V", "cmd", "(J)V", "result", "isAppLaunch", "deviceStartTime", "onSync", "(ZZI)V", "finishSportState", "isDeviceConnect", "()Z", "enable", "setCmdEnable", "(Z)V", "Lkotlin/Function1;", "onSecondTick", "setOnSecondTick", "(Lkotlin/jvm/functions/Function1;)V", "block", "setOnPlayError", "setOnPlaybackStateChanged", "Lcom/mi/health/course/data/DeviceState;", "change", "setOnDeviceStatus", "Lcom/mi/health/course/data/CourseSportState;", "setOnStateChange", "setOnDataChange", "setOnPropertyChange", "isSportValid", "model", "Lcom/mi/health/course/export/data/CourseAllInfo;", "info", "initData", "(Ljava/lang/String;ILcom/mi/health/course/export/data/CourseAllInfo;)V", "getLocalModelStr", "()Ljava/lang/String;", "did", "mac", "onConnectStart", "(Ljava/lang/String;Ljava/lang/String;)V", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;Ljava/lang/String;II)V", "onConnectSuccess", "onDisconnect", "isRopeSkipping", "supportDeviceLink", "Z", "getSupportDeviceLink", "setSupportDeviceLink", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "mSportStateCaller", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData;", "mSportDataCaller", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData;", "mOnDataChange", "Lkotlin/jvm/functions/Function1;", "mOnPropertyChange", "mOnDeviceStatus", "mOnSportState", "deviceStatusObj$delegate", "Lkotlin/Lazy;", "getDeviceStatusObj", "()Lcom/mi/health/course/data/DeviceState;", "deviceStatusObj", "Ljava/lang/String;", "getModel", "setModel", "(Ljava/lang/String;)V", "J", "configCalorie", "I", "configDuration", "cmdEnable", "Lcom/mi/health/course/CoursePlayerHolder;", "playerHolder", "Lcom/mi/health/course/CoursePlayerHolder;", "Lcom/google/android/exoplayer2/q;", "player$delegate", "getPlayer", "()Lcom/google/android/exoplayer2/q;", "player", "Landroidx/lifecycle/MutableLiveData;", "progressEmitter$delegate", "getProgressEmitter", "()Landroidx/lifecycle/MutableLiveData;", "progressEmitter", BroadcastsKt.SILENT_PUSHING_PROGRESS, "getProgress", "()I", "setProgress", "otherDevice", "getOtherDevice", "setOtherDevice", "progressFactor", "F", "bufferReason", "onPlayError", "onPlaybackStateChanged", "onTick", "Lcom/mi/health/course/util/StopWatch;", "durationTimer$delegate", "getDurationTimer", "()Lcom/mi/health/course/util/StopWatch;", "durationTimer", "progressTimer$delegate", "getProgressTimer", "progressTimer", "Lcom/google/android/exoplayer2/q$e;", "playerListener", "Lcom/google/android/exoplayer2/q$e;", "mSportData", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "getMSportData", "()Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "setMSportData", "getStartTime", "()J", "setStartTime", "preItem", "preValue", "cmdCount", "getCmdCount", "setCmdCount", "Ljava/util/TreeSet;", "cmdSet", "Ljava/util/TreeSet;", "", "preCmdMap", "Ljava/util/Map;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "recordEmitter", "Landroidx/lifecycle/MutableLiveData;", "getRecordEmitter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "dataGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDataGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "setDataGetter", "(Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;)V", "Lcom/mi/health/course/api/CourseRequest;", "request", "Lcom/mi/health/course/api/CourseRequest;", "getRequest", "()Lcom/mi/health/course/api/CourseRequest;", "setRequest", "(Lcom/mi/health/course/api/CourseRequest;)V", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "getLocalDevice", "()Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "localDevice", "getRecordSid", "recordSid", "getDid", "<init>", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoCourseBasePlayerVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoCourseBasePlayerVM.kt\ncom/mi/health/course/eco/vm/EcoCourseBasePlayerVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,556:1\n1863#2,2:557\n*S KotlinDebug\n*F\n+ 1 EcoCourseBasePlayerVM.kt\ncom/mi/health/course/eco/vm/EcoCourseBasePlayerVM\n*L\n355#1:557,2\n*E\n"})
public class EcoCourseBasePlayerVM extends AbsViewModel implements ISportDataChangedListener, ISportStateChangedListener, OnEcoDeviceStatusListener, ISportSyncDataListener {
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
    private Function1<? super Integer, Unit> mOnPropertyChange;

    @Nullable
    private Function1<? super CourseSportState, Unit> mOnSportState;

    @Nullable
    private PhoneSportData mSportData;

    @Nullable
    private Function1<? super Boolean, Unit> onPlayError;

    @Nullable
    private Function1<? super Integer, Unit> onPlaybackStateChanged;

    @Nullable
    private Function1<? super Long, Unit> onTick;

    @Nullable
    private String otherDevice;
    private float preValue;
    private int progress;
    private float progressFactor;
    public CourseRequest request;
    private int sportType;
    private long startTime;
    private boolean supportDeviceLink;

    @NotNull
    private IEcoSportRemoteState mSportStateCaller = SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE);

    @NotNull
    private IEcoSportRemoteData mSportDataCaller = SportEcoManagerExtKt.getInstance(IEcoSportRemoteData.INSTANCE);

    /* JADX INFO: renamed from: deviceStatusObj$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceStatusObj = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: vl7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseBasePlayerVM.deviceStatusObj_delegate$lambda$0();
        }
    });

    @NotNull
    private String model = "";
    private boolean cmdEnable = true;

    @NotNull
    private final CoursePlayerHolder playerHolder = new CoursePlayerHolder();

    /* JADX INFO: renamed from: player$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy player = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xl7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseBasePlayerVM.player_delegate$lambda$1(this.f39231a);
        }
    });

    /* JADX INFO: renamed from: progressEmitter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressEmitter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zl7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseBasePlayerVM.progressEmitter_delegate$lambda$2();
        }
    });
    private int bufferReason = 3;

    /* JADX INFO: renamed from: durationTimer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy durationTimer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bm7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseBasePlayerVM.durationTimer_delegate$lambda$4(this.f4361a);
        }
    });

    /* JADX INFO: renamed from: progressTimer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressTimer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dm7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseBasePlayerVM.progressTimer_delegate$lambda$6(this.f15680a);
        }
    });

    @NotNull
    private final q.e playerListener = new EcoCourseBasePlayerVM$playerListener$1(this);

    @NotNull
    private String preItem = "";

    @NotNull
    private final TreeSet<CourseConfigModel.DevCmd> cmdSet = new TreeSet<>();

    @NotNull
    private final Map<String, CourseConfigModel.DevCmd> preCmdMap = new LinkedHashMap();

    @NotNull
    private final MutableLiveData<SportBasicReport> recordEmitter = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.mi.health.course.eco.vm.EcoCourseBasePlayerVM$actionCmd$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.eco.vm.EcoCourseBasePlayerVM$actionCmd$2", f = "EcoCourseBasePlayerVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nEcoCourseBasePlayerVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoCourseBasePlayerVM.kt\ncom/mi/health/course/eco/vm/EcoCourseBasePlayerVM$actionCmd$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,556:1\n1863#2:557\n1864#2:559\n1863#2,2:560\n1863#2,2:562\n1#3:558\n*S KotlinDebug\n*F\n+ 1 EcoCourseBasePlayerVM.kt\ncom/mi/health/course/eco/vm/EcoCourseBasePlayerVM$actionCmd$2\n*L\n368#1:557\n368#1:559\n380#1:560,2\n392#1:562,2\n*E\n"})
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
            return EcoCourseBasePlayerVM.this.new AnonymousClass2(this.$duration, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (EcoCourseBasePlayerVM.this.isRopeSkipping()) {
                List<String> CMD_ITEM_JUMP = CourseConfigModel.DevCmd.CMD_ITEM_JUMP;
                Intrinsics.checkNotNullExpressionValue(CMD_ITEM_JUMP, "CMD_ITEM_JUMP");
                EcoCourseBasePlayerVM ecoCourseBasePlayerVM = EcoCourseBasePlayerVM.this;
                long j = this.$duration;
                for (String str2 : CMD_ITEM_JUMP) {
                    Object obj2 = null;
                    for (Object obj3 : ecoCourseBasePlayerVM.cmdSet) {
                        CourseConfigModel.DevCmd devCmd = (CourseConfigModel.DevCmd) obj3;
                        if (Intrinsics.areEqual(str2, devCmd.triggerItem) && devCmd.timeInMills <= j) {
                            obj2 = obj3;
                        }
                    }
                    CourseConfigModel.DevCmd devCmd2 = (CourseConfigModel.DevCmd) obj2;
                    if (devCmd2 != null) {
                        CourseConfigModel.DevCmd devCmd3 = (CourseConfigModel.DevCmd) ecoCourseBasePlayerVM.preCmdMap.get(str2);
                        if (devCmd2.valid() && !Intrinsics.areEqual(devCmd3, devCmd2)) {
                            String triggerValue = devCmd2.triggerValue;
                            Intrinsics.checkNotNullExpressionValue(triggerValue, "triggerValue");
                            Float floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(triggerValue);
                            if (floatOrNull != null) {
                                float fFloatValue = floatOrNull.floatValue();
                                ecoCourseBasePlayerVM.preCmdMap.put(str2, devCmd2);
                                Logger.i("EcoCourseBasePlayerVM", "actionCmd: duration = " + j + "; cmd = " + devCmd2);
                                Intrinsics.checkNotNull(str2);
                                ecoCourseBasePlayerVM.changeProperty(str2, fFloatValue);
                            }
                        }
                    }
                }
            } else if (Intrinsics.areEqual(EcoCourseBasePlayerVM.this.getModel(), "yesoul.exbike.jsc01y")) {
                List<String> CMD_ITEM_WARE_FTP = CourseConfigModel.DevCmd.CMD_ITEM_WARE_FTP;
                Intrinsics.checkNotNullExpressionValue(CMD_ITEM_WARE_FTP, "CMD_ITEM_WARE_FTP");
                EcoCourseBasePlayerVM ecoCourseBasePlayerVM2 = EcoCourseBasePlayerVM.this;
                long j2 = this.$duration;
                for (String str3 : CMD_ITEM_WARE_FTP) {
                    Object obj4 = null;
                    for (Object obj5 : ecoCourseBasePlayerVM2.cmdSet) {
                        CourseConfigModel.DevCmd devCmd4 = (CourseConfigModel.DevCmd) obj5;
                        if (Intrinsics.areEqual(str3, devCmd4.triggerItem) && devCmd4.timeInMills <= j2) {
                            obj4 = obj5;
                        }
                    }
                    CourseConfigModel.DevCmd devCmd5 = (CourseConfigModel.DevCmd) obj4;
                    if (devCmd5 != null) {
                        CourseConfigModel.DevCmd devCmd6 = (CourseConfigModel.DevCmd) ecoCourseBasePlayerVM2.preCmdMap.get(str3);
                        if (devCmd5.valid() && !Intrinsics.areEqual(devCmd6, devCmd5) && (str = devCmd5.triggerValue) != null && str.length() != 0) {
                            String triggerValue2 = devCmd5.triggerValue;
                            Intrinsics.checkNotNullExpressionValue(triggerValue2, "triggerValue");
                            float ftpRpm = ecoCourseBasePlayerVM2.getFtpRpm(triggerValue2);
                            ecoCourseBasePlayerVM2.preCmdMap.put(str3, devCmd5);
                            Intrinsics.checkNotNull(str3);
                            ecoCourseBasePlayerVM2.changeProperty(str3, ftpRpm);
                        }
                    }
                }
            } else {
                List<String> CMD_ITEM_WARE = CourseConfigModel.DevCmd.CMD_ITEM_WARE;
                Intrinsics.checkNotNullExpressionValue(CMD_ITEM_WARE, "CMD_ITEM_WARE");
                EcoCourseBasePlayerVM ecoCourseBasePlayerVM3 = EcoCourseBasePlayerVM.this;
                long j3 = this.$duration;
                for (String str4 : CMD_ITEM_WARE) {
                    Object obj6 = null;
                    for (Object obj7 : ecoCourseBasePlayerVM3.cmdSet) {
                        CourseConfigModel.DevCmd devCmd7 = (CourseConfigModel.DevCmd) obj7;
                        if (Intrinsics.areEqual(str4, devCmd7.triggerItem) && devCmd7.timeInMills <= j3) {
                            obj6 = obj7;
                        }
                    }
                    CourseConfigModel.DevCmd devCmd8 = (CourseConfigModel.DevCmd) obj6;
                    if (devCmd8 != null) {
                        CourseConfigModel.DevCmd devCmd9 = (CourseConfigModel.DevCmd) ecoCourseBasePlayerVM3.preCmdMap.get(str4);
                        if (devCmd8.valid() && !Intrinsics.areEqual(devCmd9, devCmd8)) {
                            String triggerValue3 = devCmd8.triggerValue;
                            Intrinsics.checkNotNullExpressionValue(triggerValue3, "triggerValue");
                            Float floatOrNull2 = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(triggerValue3);
                            if (floatOrNull2 != null) {
                                float fFloatValue2 = floatOrNull2.floatValue();
                                ecoCourseBasePlayerVM3.preCmdMap.put(str4, devCmd8);
                                Logger.i("EcoCourseBasePlayerVM", "actionCmd: duration = " + j3 + "; cmd = " + devCmd8);
                                Intrinsics.checkNotNull(str4);
                                ecoCourseBasePlayerVM3.changeProperty(str4, fFloatValue2);
                            }
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

    /* JADX INFO: renamed from: com.mi.health.course.eco.vm.EcoCourseBasePlayerVM$cmd$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.eco.vm.EcoCourseBasePlayerVM$cmd$1", f = "EcoCourseBasePlayerVM.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $duration;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14581(long j, Continuation<? super C14581> continuation) {
            super(2, continuation);
            this.$duration = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoCourseBasePlayerVM.this.new C14581(this.$duration, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoCourseBasePlayerVM ecoCourseBasePlayerVM = EcoCourseBasePlayerVM.this;
                long j = this.$duration;
                this.label = 1;
                if (ecoCourseBasePlayerVM.actionCmd(j, this) == coroutine_suspended) {
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
            return ((C14581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.eco.vm.EcoCourseBasePlayerVM$onSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.eco.vm.EcoCourseBasePlayerVM$onSync$1", f = "EcoCourseBasePlayerVM.kt", i = {}, l = {418}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14591(String str, Continuation<? super C14591> continuation) {
            super(2, continuation);
            this.$sid = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoCourseBasePlayerVM.this.new C14591(this.$sid, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                EcoCourseBasePlayerVM$onSync$1$ret$1 ecoCourseBasePlayerVM$onSync$1$ret$1 = new EcoCourseBasePlayerVM$onSync$1$ret$1(EcoCourseBasePlayerVM.this, this.$sid, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, ecoCourseBasePlayerVM$onSync$1$ret$1, this);
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
            Logger.i("EcoCourseBasePlayerVM", "onSync: start = " + EcoCourseBasePlayerVM.this.getStartTime() + ", " + sportBasicReport);
            EcoCourseBasePlayerVM.this.getRecordEmitter().setValue(sportBasicReport);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.eco.vm.EcoCourseBasePlayerVM$uploadCourseRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.eco.vm.EcoCourseBasePlayerVM$uploadCourseRecord$1", f = "EcoCourseBasePlayerVM.kt", i = {}, l = {446}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $courseId;
        final /* synthetic */ int $sportType;
        final /* synthetic */ long $time;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14611(long j, long j2, int i, Continuation<? super C14611> continuation) {
            super(2, continuation);
            this.$courseId = j;
            this.$time = j2;
            this.$sportType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoCourseBasePlayerVM.this.new C14611(this.$courseId, this.$time, this.$sportType, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseRequest request = EcoCourseBasePlayerVM.this.getRequest();
                long j = this.$courseId;
                long j2 = this.$time;
                String recordSid = EcoCourseBasePlayerVM.this.getRecordSid();
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
            Logger.d("EcoCourseBasePlayerVM", "uploadCourseRecord: " + ((CourseModel.RequestResult) obj).success + ".");
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object actionCmd(long j, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getDefault(), new AnonymousClass2(j, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkDeviceStatus$lambda$7(EcoCourseBasePlayerVM this$0, boolean z) {
        String name;
        String name2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        boolean z2 = false;
        this$0.getDeviceStatusObj().setWearConnect(ecoDeviceModel != null && ecoDeviceModel.getIsDeviceConnected());
        DeviceState deviceStatusObj = this$0.getDeviceStatusObj();
        String str = "";
        if (ecoDeviceModel == null || (name = EcoDeviceModelExtKt.getName(ecoDeviceModel)) == null) {
            name = "";
        }
        deviceStatusObj.setWearName(name);
        this$0.getDeviceStatusObj().setWearHas(z && ecoDeviceModel != null);
        this$0.getDeviceStatusObj().setSportHas(true);
        DeviceState deviceStatusObj2 = this$0.getDeviceStatusObj();
        EcoDeviceModel localDevice = this$0.getLocalDevice();
        if (localDevice != null && localDevice.getIsDeviceConnected()) {
            z2 = true;
        }
        deviceStatusObj2.setSportConnect(z2);
        DeviceState deviceStatusObj3 = this$0.getDeviceStatusObj();
        EcoDeviceModel localDevice2 = this$0.getLocalDevice();
        if (localDevice2 != null && (name2 = EcoDeviceModelExtKt.getName(localDevice2)) != null) {
            str = name2;
        }
        deviceStatusObj3.setSportName(str);
        Logger.i("EcoCourseBasePlayerVM", "checkDeviceStatus: " + this$0.getDeviceStatusObj());
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
    public static final StopWatch durationTimer_delegate$lambda$4(final EcoCourseBasePlayerVM this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new StopWatch(0L, new Function1() { // from class: pl7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseBasePlayerVM.durationTimer_delegate$lambda$4$lambda$3(this.f30516a, ((Long) obj).longValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit durationTimer_delegate$lambda$4$lambda$3(EcoCourseBasePlayerVM this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Long, Unit> function1 = this$0.onTick;
        if (function1 != null) {
            function1.invoke2(Long.valueOf(j));
        }
        return Unit.INSTANCE;
    }

    private final String getDid() {
        EcoDeviceModel localDevice;
        if (this.supportDeviceLink) {
            localDevice = getLocalDevice();
            if (localDevice == null) {
                return null;
            }
        } else {
            localDevice = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (localDevice == null) {
                return null;
            }
        }
        return localDevice.getDid();
    }

    private final StopWatch getDurationTimer() {
        return (StopWatch) this.durationTimer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getFtpRpm(String ftpRpmValue) {
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) ftpRpmValue, new String[]{"%_"}, false, 0, 6, (Object) null);
            return (((int) Double.parseDouble((String) listSplit$default.get(0))) << 16) + ((int) Double.parseDouble((String) listSplit$default.get(1)));
        } catch (Exception unused) {
            return 0;
        }
    }

    private final EcoDeviceModel getLocalDevice() {
        return EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(this.model);
    }

    private final StopWatch getProgressTimer() {
        return (StopWatch) this.progressTimer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getRecordSid() {
        if (!this.supportDeviceLink) {
            return "xiaomiwear_app";
        }
        EcoDeviceModel localDevice = getLocalDevice();
        if (localDevice != null) {
            return localDevice.getDid();
        }
        return null;
    }

    private final boolean isConnected(RequestCallback callback) {
        EcoDeviceModel localDevice = getLocalDevice();
        boolean zIsDeviceConnected = localDevice != null ? localDevice.getIsDeviceConnected() : false;
        if (!zIsDeviceConnected) {
            if (callback != null) {
                callback.call(1);
            }
            Logger.i("EcoCourseBasePlayerVM", "local device disconnect");
        }
        return zIsDeviceConnected;
    }

    public static /* synthetic */ boolean isConnected$default(EcoCourseBasePlayerVM ecoCourseBasePlayerVM, RequestCallback requestCallback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isConnected");
        }
        if ((i & 1) != 0) {
            requestCallback = null;
        }
        return ecoCourseBasePlayerVM.isConnected(requestCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q player_delegate$lambda$1(EcoCourseBasePlayerVM this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.playerHolder.getPlayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData progressEmitter_delegate$lambda$2() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StopWatch progressTimer_delegate$lambda$6(final EcoCourseBasePlayerVM this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new StopWatch(100L, new Function1() { // from class: tl7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseBasePlayerVM.progressTimer_delegate$lambda$6$lambda$5(this.f34810a, ((Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit progressTimer_delegate$lambda$6$lambda$5(EcoCourseBasePlayerVM this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.progress = (int) (this$0.progressFactor * this$0.getPlayer().getCurrentPosition());
        this$0.getProgressEmitter().setValue(Integer.valueOf(this$0.progress));
        return Unit.INSTANCE;
    }

    private final void restartWearSport(int sportType) {
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        FitnessLogUtils.i("EcoCourseBasePlayerVM", "restartWearSport");
        this.mSportStateCaller.restartSport(ecoDeviceModel != null ? ecoDeviceModel.getDid() : null, sportType, new RequestCallback() { // from class: com.mi.health.course.eco.vm.EcoCourseBasePlayerVM.restartWearSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                Logger.i("EcoCourseBasePlayerVM", "restartSport: res = " + responseCode);
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
        ScopeExtKt.scopeNetLife$default(this, null, new C14611(courseId, time, sportType, null), 1, null).m503catch(new Function2() { // from class: rl7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EcoCourseBasePlayerVM.uploadCourseRecord$lambda$9((AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadCourseRecord$lambda$9(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e("EcoCourseBasePlayerVM", "uploadCourseRecord: " + it.getMessage());
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        getPlayer().K(this.playerListener);
        this.mSportStateCaller.setSportSyncDataListener(this);
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).addDeviceStatusListener(this);
        this.mSportStateCaller.addSportStateChangedListener(getClass(), this);
        this.mSportDataCaller.addSportDataChangedListener(getClass(), this);
    }

    public void changeProperty(@NotNull String item, float value) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.supportDeviceLink) {
            if (!Intrinsics.areEqual(this.preItem, item) || this.preValue != value) {
                this.cmdCount++;
                this.preItem = item;
                this.preValue = value;
            }
            int iHashCode = item.hashCode();
            if (iHashCode == -536545902) {
                if (item.equals(CourseConfigModel.DevCmd.CMD_ITEM_FTP_RPM)) {
                    this.mSportStateCaller.setGymFtpPercentRpm((int) value, new RequestCallback() { // from class: com.mi.health.course.eco.vm.EcoCourseBasePlayerVM.changeProperty.2
                        @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                        public void call(int responseCode) {
                            Logger.d("EcoCourseBasePlayerVM", "changeProperty cmd: res = " + responseCode);
                        }
                    });
                    return;
                }
                return;
            }
            if (iHashCode == 109641799) {
                if (item.equals("speed")) {
                    this.mSportStateCaller.setGymSpeed(value, new RequestCallback() { // from class: com.mi.health.course.eco.vm.EcoCourseBasePlayerVM.changeProperty.1
                        @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                        public void call(int responseCode) {
                            Logger.i("EcoCourseBasePlayerVM", "changeProperty cmd: res = " + responseCode);
                        }
                    });
                }
            } else if (iHashCode == 485939544 && item.equals("frequency_hopping")) {
                Logger.i("EcoCourseBasePlayerVM", "changeProperty item = " + item + " ; value = " + value);
                Function1<? super Integer, Unit> function1 = this.mOnPropertyChange;
                if (function1 != null) {
                    function1.invoke2(Integer.valueOf((int) value));
                }
            }
        }
    }

    public final void checkDeviceStatus() {
        String name;
        String name2;
        String str = "";
        boolean z = false;
        if (!isRopeSkipping()) {
            if (this.supportDeviceLink) {
                this.mSportStateCaller.isSupportLaunchSport(this.sportType, new j7r() { // from class: fm7
                    @Override // defpackage.j7r
                    public final void a(Boolean bool) {
                        EcoCourseBasePlayerVM.checkDeviceStatus$lambda$7(this.f17927a, bool.booleanValue());
                    }
                });
                return;
            }
            EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
            getDeviceStatusObj().setWearConnect(ecoDeviceModel != null && ecoDeviceModel.getIsDeviceConnected());
            DeviceState deviceStatusObj = getDeviceStatusObj();
            if (ecoDeviceModel != null && (name = EcoDeviceModelExtKt.getName(ecoDeviceModel)) != null) {
                str = name;
            }
            deviceStatusObj.setWearName(str);
            getDeviceStatusObj().setWearHas(ecoDeviceModel != null);
            getDeviceStatusObj().setSportHas(false);
            Logger.i("EcoCourseBasePlayerVM", "checkDeviceStatus: " + getDeviceStatusObj());
            Function1<? super DeviceState, Unit> function1 = this.mOnDeviceStatus;
            if (function1 != null) {
                function1.invoke2(getDeviceStatusObj());
                return;
            }
            return;
        }
        getDeviceStatusObj().setSportHas(true);
        DeviceState deviceStatusObj2 = getDeviceStatusObj();
        EcoDeviceModel localDevice = getLocalDevice();
        if (localDevice != null && localDevice.getIsDeviceConnected()) {
            z = true;
        }
        deviceStatusObj2.setSportConnect(z);
        DeviceState deviceStatusObj3 = getDeviceStatusObj();
        EcoDeviceModel localDevice2 = getLocalDevice();
        if (localDevice2 != null && (name2 = EcoDeviceModelExtKt.getName(localDevice2)) != null) {
            str = name2;
        }
        deviceStatusObj3.setSportName(str);
        Logger.i("EcoCourseBasePlayerVM", "checkDeviceStatus: " + getDeviceStatusObj());
        Function1<? super DeviceState, Unit> function2 = this.mOnDeviceStatus;
        if (function2 != null) {
            function2.invoke2(getDeviceStatusObj());
        }
    }

    public final void cmd(long duration) {
        if (!this.cmdSet.isEmpty() && this.cmdEnable && this.supportDeviceLink) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C14581(duration, null), 3, null);
        }
    }

    public final void finishSport(int sportType, @NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Logger.i("EcoCourseBasePlayerVM", "finishSport: sportType = " + sportType + " ");
        if (!this.supportDeviceLink || isConnected(callback)) {
            this.mSportStateCaller.finishSport(getDid(), sportType, callback);
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
        EcoDeviceModel localDevice = getLocalDevice();
        if (localDevice != null) {
            return EcoDeviceModelExtKt.getModel(localDevice);
        }
        return null;
    }

    @Nullable
    public final PhoneSportData getMSportData() {
        return this.mSportData;
    }

    @NotNull
    public final String getModel() {
        return this.model;
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
        Logger.i("EcoCourseBasePlayerVM", "initData: model = " + model + "; sportType = " + sportType + "; linkage = " + this.supportDeviceLink + "; calorie = " + this.configCalorie + "; duration = " + this.configDuration + ", courseId = " + courseId);
    }

    public final boolean isDeviceConnect() {
        EcoDeviceModel localDevice = getLocalDevice();
        return localDevice != null && localDevice.getIsDeviceConnected();
    }

    public final boolean isRopeSkipping() {
        return Intrinsics.areEqual(this.model, "yunmai.jmprope.sr803") || Intrinsics.areEqual(this.model, SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED);
    }

    public final boolean isSportValid() {
        EcoDeviceModel localDevice;
        if (this.supportDeviceLink && ((localDevice = getLocalDevice()) == null || !localDevice.getIsDeviceConnected())) {
            return true;
        }
        PhoneSportData phoneSportData = this.mSportData;
        if (phoneSportData == null) {
            phoneSportData = new PhoneSportData();
        }
        Logger.i("EcoCourseBasePlayerVM", "popTooShort: data = " + phoneSportData);
        return this.mSportStateCaller.isSportValid(phoneSportData);
    }

    @Override // defpackage.dvq
    public void onCleared() {
        super.onCleared();
        this.mSportStateCaller.setSportSyncDataListener(null);
        timerCancel();
        this.mSportStateCaller.removeSportStateChangedListener(getClass());
        this.mSportDataCaller.removeSportDataChangedListener(getClass(), this);
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).removeDeviceStatusListener(this);
        getPlayer().f(this.playerListener);
        this.playerHolder.release();
        Logger.d("EcoCourseBasePlayerVM", "releasePlayer: ");
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectFailure(@Nullable String did, @NotNull String mac, int errorCode, int retryTimes) {
        Intrinsics.checkNotNullParameter(mac, "mac");
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectStart(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectSuccess(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        LogUtil.INSTANCE.i("EcoCourseBasePlayerVM", "onConnectSuccess=" + did);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (this.supportDeviceLink) {
            EcoDeviceModel localDevice = getLocalDevice();
            if (Intrinsics.areEqual(localDevice != null ? localDevice.getDid() : null, did)) {
                this.mSportStateCaller.syncLocalDeviceSportStatus();
            } else {
                if (Intrinsics.areEqual(ecoDeviceModel != null ? ecoDeviceModel.getDid() : null, did)) {
                    restartWearSport(this.sportType);
                }
            }
        } else {
            if (Intrinsics.areEqual(ecoDeviceModel != null ? ecoDeviceModel.getDid() : null, did)) {
                restartWearSport(this.sportType);
            }
        }
        checkDeviceStatus();
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onDisconnect(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        LogUtil.INSTANCE.i("EcoCourseBasePlayerVM", "onDisconnect=" + did);
        checkDeviceStatus();
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(@Nullable PhoneSportData phoneSportData) {
        Logger.d("EcoCourseBasePlayerVM", "onPhoneDataChanged: " + phoneSportData);
        if (phoneSportData == null) {
            return;
        }
        this.mSportData = phoneSportData;
        Function1<? super PhoneSportData, Unit> function1 = this.mOnDataChange;
        if (function1 != null) {
            function1.invoke2(phoneSportData);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(@Nullable y7r wearSportData) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean validSport, @Nullable byte[] ids) {
        Function1<? super CourseSportState, Unit> function1 = this.mOnSportState;
        if (function1 != null) {
            function1.invoke2(new CourseSportState.Finish(validSport));
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        Function1<? super CourseSportState, Unit> function1 = this.mOnSportState;
        if (function1 != null) {
            function1.invoke2(CourseSportState.Pause.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        Function1<? super CourseSportState, Unit> function1 = this.mOnSportState;
        if (function1 != null) {
            function1.invoke2(CourseSportState.Restart.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRested() {
        ISportStateChangedListener.DefaultImpls.onSportRested(this);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportShutdown() {
        ISportStateChangedListener.DefaultImpls.onSportShutdown(this);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int startTime, int timeZone, int sportType, int sportLaunchType) {
        Function1<? super CourseSportState, Unit> function1 = this.mOnSportState;
        if (function1 != null) {
            function1.invoke2(new CourseSportState.Start(startTime, sportType));
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportSyncDataListener
    public void onSync(boolean result, boolean isAppLaunch, int deviceStartTime) {
        String recordSid = getRecordSid();
        Logger.i("EcoCourseBasePlayerVM", "onSync: sid = " + recordSid + ", sportType= " + this.sportType + ", time = " + this.startTime);
        if (recordSid == null || recordSid.length() == 0) {
            this.recordEmitter.setValue(null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C14591(recordSid, null), 3, null);
        }
    }

    public final void pauseSport(int sportType, @NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.supportDeviceLink || isConnected(callback)) {
            this.mSportStateCaller.pauseSport(getDid(), sportType, callback);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
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
            Logger.i("EcoCourseBasePlayerVM", "setLinkage: cmdSet = " + this.cmdSet);
        }
    }

    public final void setDataGetter(@NotNull FitnessDataGetter fitnessDataGetter) {
        Intrinsics.checkNotNullParameter(fitnessDataGetter, "<set-?>");
        this.dataGetter = fitnessDataGetter;
    }

    public final void setMSportData(@Nullable PhoneSportData phoneSportData) {
        this.mSportData = phoneSportData;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
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

    public final void setOnPlaybackStateChanged(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.onPlaybackStateChanged = block;
    }

    public final void setOnPropertyChange(@NotNull Function1<? super Integer, Unit> change) {
        Intrinsics.checkNotNullParameter(change, "change");
        this.mOnPropertyChange = change;
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

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setSupportDeviceLink(boolean z) {
        this.supportDeviceLink = z;
    }

    public final void startLocalSport(@NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.supportDeviceLink || isConnected(callback)) {
            Logger.i("EcoCourseBasePlayerVM", "startLocalSport: ");
            long jCurrentTimeMillis = System.currentTimeMillis();
            long offset = TimeZone.getDefault().getOffset(jCurrentTimeMillis);
            SportCourse sportCourse = new SportCourse();
            sportCourse.setCloudCourseId(this.courseId);
            sportCourse.setCloudCourseReferenceCal(this.configCalorie);
            sportCourse.setCourseDuration(this.configDuration);
            sportCourse.setType(255);
            SportRequestData.a aVar = new SportRequestData.a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            SportRequestData sportRequestDataJ = aVar.u(jCurrentTimeMillis, timeUnit).w(offset, timeUnit).s(this.sportType).k(sportCourse).q(null).p(1).j();
            IEcoSportRemoteState iEcoSportRemoteState = this.mSportStateCaller;
            String did = getDid();
            Intrinsics.checkNotNull(sportRequestDataJ);
            iEcoSportRemoteState.startSport(did, sportRequestDataJ, callback);
            long seconds = timeUnit.toSeconds(jCurrentTimeMillis);
            this.startTime = seconds;
            uploadCourseRecord(this.courseId, seconds, this.sportType);
        }
    }
}
