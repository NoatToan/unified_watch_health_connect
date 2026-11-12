package com.mi.health.course.activity.eco;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import androidx.lifecycle.ViewModelKt;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.mi.health.course.CoursePlayerHolder;
import com.mi.health.course.activity.eco.EcoCourseBasePlayerVM;
import com.mi.health.course.api.CourseRequest;
import com.mi.health.course.data.CourseSportState;
import com.mi.health.course.data.DeviceState;
import com.mi.health.course.export.data.CourseAllInfo;
import com.mi.health.course.export.data.CourseAllInfoKt;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.ext.CourseExtKt;
import com.mi.health.course.util.StopWatch;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
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
import defpackage.oe4;
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
@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 ê\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002ê\u0001B\b¢\u0006\u0005\bé\u0001\u0010\u0016J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u001b\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J/\u0010,\u001a\u00020\r2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0016¢\u0006\u0004\b.\u0010\u0016J\u000f\u0010/\u001a\u00020\rH\u0016¢\u0006\u0004\b/\u0010\u0016J!\u00103\u001a\u00020\r2\u0006\u00100\u001a\u00020\u001b2\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104J\u0019\u00107\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\rH\u0014¢\u0006\u0004\b9\u0010\u0016J\r\u0010:\u001a\u00020\r¢\u0006\u0004\b:\u0010\u0016J\u0015\u0010;\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b=\u0010<J\u001d\u0010>\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b>\u0010?J\u001d\u0010@\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b@\u0010?J\u0015\u0010A\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\bA\u0010BJ\u001d\u0010C\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\bC\u0010?J\u001f\u0010G\u001a\u00020\r2\u0006\u0010D\u001a\u00020\u00062\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u001b\u0010L\u001a\u00020\r2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0I¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\bN\u0010OJ'\u0010S\u001a\u00020\r2\u0006\u0010P\u001a\u00020\u001b2\u0006\u0010Q\u001a\u00020\u001b2\u0006\u0010R\u001a\u00020\bH\u0016¢\u0006\u0004\bS\u0010TJ\r\u0010U\u001a\u00020\r¢\u0006\u0004\bU\u0010\u0016J\r\u0010V\u001a\u00020\u001b¢\u0006\u0004\bV\u0010WJ\u0015\u0010Y\u001a\u00020\r2\u0006\u0010X\u001a\u00020\u001b¢\u0006\u0004\bY\u0010ZJ!\u0010]\u001a\u00020\r2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0[¢\u0006\u0004\b]\u0010^J!\u0010`\u001a\u00020\r2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0[¢\u0006\u0004\b`\u0010^J!\u0010c\u001a\u00020\r2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\r0[¢\u0006\u0004\bc\u0010^J!\u0010e\u001a\u00020\r2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\r0[¢\u0006\u0004\be\u0010^J!\u0010f\u001a\u00020\r2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\r0[¢\u0006\u0004\bf\u0010^J\r\u0010g\u001a\u00020\u001b¢\u0006\u0004\bg\u0010WJ%\u0010k\u001a\u00020\r2\u0006\u0010h\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010j\u001a\u00020i¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bm\u0010nJ!\u0010q\u001a\u00020\r2\b\u0010o\u001a\u0004\u0018\u00010\u00062\u0006\u0010p\u001a\u00020\u0006H\u0016¢\u0006\u0004\bq\u0010rJ1\u0010u\u001a\u00020\r2\b\u0010o\u001a\u0004\u0018\u00010\u00062\u0006\u0010p\u001a\u00020\u00062\u0006\u0010s\u001a\u00020\b2\u0006\u0010t\u001a\u00020\bH\u0016¢\u0006\u0004\bu\u0010vJ\r\u0010w\u001a\u00020\r¢\u0006\u0004\bw\u0010\u0016J!\u0010x\u001a\u00020\r2\b\u0010o\u001a\u0004\u0018\u00010\u00062\u0006\u0010p\u001a\u00020\u0006H\u0016¢\u0006\u0004\bx\u0010rJ!\u0010y\u001a\u00020\r2\b\u0010o\u001a\u0004\u0018\u00010\u00062\u0006\u0010p\u001a\u00020\u0006H\u0016¢\u0006\u0004\by\u0010rR\"\u0010z\u001a\u00020\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010W\"\u0004\b}\u0010ZR\u0017\u0010\u007f\u001a\u00020~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R'\u0010\u0084\u0001\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\r\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R'\u0010\u0086\u0001\u001a\u0010\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\r\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0085\u0001R'\u0010\u0087\u0001\u001a\u0010\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\r\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0085\u0001R \u0010\u008c\u0001\u001a\u00020a8DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010h\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bh\u0010\u008d\u0001R\u0017\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0010\u0010\u008e\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0090\u0001R\u0017\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010\u0090\u0001R\u0018\u0010\u0092\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010{R\u0018\u0010\u0094\u0001\u001a\u00030\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R!\u0010\u009a\u0001\u001a\u00030\u0096\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0089\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R'\u0010\u009f\u0001\u001a\t\u0012\u0004\u0012\u00020\b0\u009b\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u0089\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R(\u0010 \u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b \u0001\u0010\u0090\u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0005\b£\u0001\u0010BR*\u0010¤\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¤\u0001\u0010\u008d\u0001\u001a\u0005\b¥\u0001\u0010n\"\u0006\b¦\u0001\u0010§\u0001R\u0019\u0010¨\u0001\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0019\u0010ª\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u0090\u0001R'\u0010«\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010\u0085\u0001R'\u0010¬\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u0085\u0001R!\u0010±\u0001\u001a\u00030\u00ad\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b®\u0001\u0010\u0089\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R!\u0010´\u0001\u001a\u00030\u00ad\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b²\u0001\u0010\u0089\u0001\u001a\u0006\b³\u0001\u0010°\u0001R3\u0010¶\u0001\u001a\f\u0012\u0005\u0012\u00030µ\u0001\u0018\u00010\u009b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010\u009e\u0001\"\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010¼\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R*\u0010¾\u0001\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0005\bÂ\u0001\u0010(R&\u0010)\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b)\u0010\u008e\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0005\bÅ\u0001\u0010OR\u0019\u0010Æ\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010\u008d\u0001R\u0019\u0010Ç\u0001\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010©\u0001R(\u0010È\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÈ\u0001\u0010\u0090\u0001\u001a\u0006\bÉ\u0001\u0010¢\u0001\"\u0005\bÊ\u0001\u0010BR\u001e\u0010Ì\u0001\u001a\t\u0012\u0004\u0012\u00020J0Ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R$\u0010Ï\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020J0Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R&\u0010Ò\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ñ\u00010\u009b\u00018\u0006¢\u0006\u0010\n\u0006\bÒ\u0001\u0010·\u0001\u001a\u0006\bÓ\u0001\u0010\u009e\u0001R*\u0010Õ\u0001\u001a\u00030Ô\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R*\u0010Ü\u0001\u001a\u00030Û\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÜ\u0001\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R\u001a\u0010å\u0001\u001a\u0005\u0018\u00010â\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bã\u0001\u0010ä\u0001R\u0018\u0010ç\u0001\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bæ\u0001\u0010nR\u0017\u0010o\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bè\u0001\u0010n¨\u0006ë\u0001"}, d2 = {"Lcom/mi/health/course/activity/eco/EcoCourseBasePlayerVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportDataChangedListener;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportSyncDataListener;", "", "ftpRpmValue", "", "getFtpRpm", "(Ljava/lang/String;)I", "", "duration", "", "actionCmd", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "courseId", "time", DailyRecordKey.sportType, "uploadCourseRecord", "(JJI)V", "timerPause", "()V", "timerStart", "timerCancel", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;", "callback", "", "isConnected", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)Z", "Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;", "getTrackSelector", "()Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;", "Ly7r;", "wearSportData", "onReceiveWearData", "(Ly7r;)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "phoneSportData", "onPhoneDataChanged", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;)V", "startTime", "timeZone", "sportLaunchType", "onSportStarted", "(IIII)V", "onSportRestarted", "onSportPaused", "validSport", "", "ids", "onSportFinished", "(Z[B)V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "onCleared", "checkDeviceStatus", "startLocalSport", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)V", "startSport", "pauseSport", "(ILcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)V", "resumeSport", "restartEcoSport", "(I)V", "finishSport", "item", "", "value", "changeProperty", "(Ljava/lang/String;F)V", "", "Lcom/mi/health/course/export/data/CourseConfigModel$DevCmd;", "cmdList", "setCmdSet", "(Ljava/util/List;)V", "cmd", "(J)V", "result", "isAppLaunch", "deviceStartTime", "onSync", "(ZZI)V", "finishSportState", "isDeviceConnect", "()Z", "enable", "setCmdEnable", "(Z)V", "Lkotlin/Function1;", "onSecondTick", "setOnSecondTick", "(Lkotlin/jvm/functions/Function1;)V", "block", "setOnPlayError", "Lcom/mi/health/course/data/DeviceState;", "change", "setOnDeviceStatus", "Lcom/mi/health/course/data/CourseSportState;", "setOnStateChange", "setOnDataChange", "isSportValid", "model", "Lcom/mi/health/course/export/data/CourseAllInfo;", "info", "initData", "(Ljava/lang/String;ILcom/mi/health/course/export/data/CourseAllInfo;)V", "getLocalModelStr", "()Ljava/lang/String;", "did", "mac", "onConnectStart", "(Ljava/lang/String;Ljava/lang/String;)V", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;Ljava/lang/String;II)V", "disconnectOperate", "onConnectSuccess", "onDisconnect", "supportDeviceLink", "Z", "getSupportDeviceLink", "setSupportDeviceLink", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "mSportStateCaller", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData;", "mSportDataCaller", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData;", "mOnDataChange", "Lkotlin/jvm/functions/Function1;", "mOnDeviceStatus", "mOnSportState", "deviceStatusObj$delegate", "Lkotlin/Lazy;", "getDeviceStatusObj", "()Lcom/mi/health/course/data/DeviceState;", "deviceStatusObj", "Ljava/lang/String;", "J", "configCalorie", "I", "configDuration", "cmdEnable", "Lcom/mi/health/course/CoursePlayerHolder;", "playerHolder", "Lcom/mi/health/course/CoursePlayerHolder;", "Lcom/google/android/exoplayer2/q;", "player$delegate", "getPlayer", "()Lcom/google/android/exoplayer2/q;", "player", "Landroidx/lifecycle/MutableLiveData;", "progressEmitter$delegate", "getProgressEmitter", "()Landroidx/lifecycle/MutableLiveData;", "progressEmitter", BroadcastsKt.SILENT_PUSHING_PROGRESS, "getProgress", "()I", "setProgress", "otherDevice", "getOtherDevice", "setOtherDevice", "(Ljava/lang/String;)V", "progressFactor", "F", "bufferReason", "onPlayError", "onTick", "Lcom/mi/health/course/util/StopWatch;", "durationTimer$delegate", "getDurationTimer", "()Lcom/mi/health/course/util/StopWatch;", "durationTimer", "progressTimer$delegate", "getProgressTimer", "progressTimer", "Loe4;", "connectEcoState", "Landroidx/lifecycle/MutableLiveData;", "getConnectEcoState", "setConnectEcoState", "(Landroidx/lifecycle/MutableLiveData;)V", "Lcom/google/android/exoplayer2/q$e;", "playerListener", "Lcom/google/android/exoplayer2/q$e;", "mSportData", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "getMSportData", "()Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "setMSportData", "getStartTime", "()J", "setStartTime", "preItem", "preValue", "cmdCount", "getCmdCount", "setCmdCount", "Ljava/util/TreeSet;", "cmdSet", "Ljava/util/TreeSet;", "", "preCmdMap", "Ljava/util/Map;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "recordEmitter", "getRecordEmitter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "dataGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDataGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "setDataGetter", "(Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;)V", "Lcom/mi/health/course/api/CourseRequest;", "request", "Lcom/mi/health/course/api/CourseRequest;", "getRequest", "()Lcom/mi/health/course/api/CourseRequest;", "setRequest", "(Lcom/mi/health/course/api/CourseRequest;)V", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "getLocalDevice", "()Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "localDevice", "getRecordSid", "recordSid", "getDid", "<init>", "Companion", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoCourseBasePlayerVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoCourseBasePlayerVM.kt\ncom/mi/health/course/activity/eco/EcoCourseBasePlayerVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,532:1\n1863#2,2:533\n*S KotlinDebug\n*F\n+ 1 EcoCourseBasePlayerVM.kt\ncom/mi/health/course/activity/eco/EcoCourseBasePlayerVM\n*L\n345#1:533,2\n*E\n"})
public class EcoCourseBasePlayerVM extends AbsViewModel implements ISportDataChangedListener, ISportStateChangedListener, OnEcoDeviceStatusListener, ISportSyncDataListener {
    private static final int BUFFER_ELSE = 3;
    private static final int BUFFER_SEEK = 2;
    private static final int BUFFER_TRACK = 1;
    private static final int CLOUD_COURSE_TYPE = 255;

    @NotNull
    private static final String TAG = "EcoCourseBasePlayerVM";
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
    private int sportType;
    private long startTime;
    private boolean supportDeviceLink;

    @NotNull
    private IEcoSportRemoteState mSportStateCaller = SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE);

    @NotNull
    private IEcoSportRemoteData mSportDataCaller = SportEcoManagerExtKt.getInstance(IEcoSportRemoteData.INSTANCE);

    /* JADX INFO: renamed from: deviceStatusObj$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceStatusObj = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ul7
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
    private final Lazy player = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wl7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseBasePlayerVM.player_delegate$lambda$1(this.f38087a);
        }
    });

    /* JADX INFO: renamed from: progressEmitter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressEmitter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: yl7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseBasePlayerVM.progressEmitter_delegate$lambda$2();
        }
    });
    private int bufferReason = 3;

    /* JADX INFO: renamed from: durationTimer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy durationTimer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: am7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseBasePlayerVM.durationTimer_delegate$lambda$4(this.f1206a);
        }
    });

    /* JADX INFO: renamed from: progressTimer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressTimer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: cm7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseBasePlayerVM.progressTimer_delegate$lambda$6(this.f5478a);
        }
    });

    @Nullable
    private MutableLiveData<oe4> connectEcoState = new MutableLiveData<>();

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

    /* JADX INFO: renamed from: com.mi.health.course.activity.eco.EcoCourseBasePlayerVM$actionCmd$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.activity.eco.EcoCourseBasePlayerVM$actionCmd$2", f = "EcoCourseBasePlayerVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nEcoCourseBasePlayerVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoCourseBasePlayerVM.kt\ncom/mi/health/course/activity/eco/EcoCourseBasePlayerVM$actionCmd$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,532:1\n1863#2:533\n1864#2:535\n1863#2,2:536\n1#3:534\n*S KotlinDebug\n*F\n+ 1 EcoCourseBasePlayerVM.kt\ncom/mi/health/course/activity/eco/EcoCourseBasePlayerVM$actionCmd$2\n*L\n358#1:533\n358#1:535\n372#1:536,2\n*E\n"})
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
            if (Intrinsics.areEqual(EcoCourseBasePlayerVM.this.model, "yesoul.exbike.jsc01y")) {
                List<String> CMD_ITEM_WARE_FTP = CourseConfigModel.DevCmd.CMD_ITEM_WARE_FTP;
                Intrinsics.checkNotNullExpressionValue(CMD_ITEM_WARE_FTP, "CMD_ITEM_WARE_FTP");
                EcoCourseBasePlayerVM ecoCourseBasePlayerVM = EcoCourseBasePlayerVM.this;
                long j = this.$duration;
                for (String str2 : CMD_ITEM_WARE_FTP) {
                    Logger.i(EcoCourseBasePlayerVM.TAG, "actionCmd: item = " + str2);
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
                        if (devCmd2.valid() && !Intrinsics.areEqual(devCmd3, devCmd2) && (str = devCmd2.triggerValue) != null && str.length() != 0) {
                            String triggerValue = devCmd2.triggerValue;
                            Intrinsics.checkNotNullExpressionValue(triggerValue, "triggerValue");
                            float ftpRpm = ecoCourseBasePlayerVM.getFtpRpm(triggerValue);
                            ecoCourseBasePlayerVM.preCmdMap.put(str2, devCmd2);
                            Logger.i(EcoCourseBasePlayerVM.TAG, "actionCmd: duration = " + j + "; cmd = " + devCmd2);
                            Intrinsics.checkNotNull(str2);
                            ecoCourseBasePlayerVM.changeProperty(str2, ftpRpm);
                        }
                    }
                }
            } else {
                List<String> CMD_ITEM_WARE = CourseConfigModel.DevCmd.CMD_ITEM_WARE;
                Intrinsics.checkNotNullExpressionValue(CMD_ITEM_WARE, "CMD_ITEM_WARE");
                EcoCourseBasePlayerVM ecoCourseBasePlayerVM2 = EcoCourseBasePlayerVM.this;
                long j2 = this.$duration;
                for (String str3 : CMD_ITEM_WARE) {
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
                        if (devCmd5.valid() && !Intrinsics.areEqual(devCmd6, devCmd5)) {
                            String triggerValue2 = devCmd5.triggerValue;
                            Intrinsics.checkNotNullExpressionValue(triggerValue2, "triggerValue");
                            Float floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(triggerValue2);
                            if (floatOrNull != null) {
                                float fFloatValue = floatOrNull.floatValue();
                                ecoCourseBasePlayerVM2.preCmdMap.put(str3, devCmd5);
                                Logger.i(EcoCourseBasePlayerVM.TAG, "actionCmd: duration = " + j2 + "; cmd = " + devCmd5);
                                Intrinsics.checkNotNull(str3);
                                ecoCourseBasePlayerVM2.changeProperty(str3, fFloatValue);
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

    /* JADX INFO: renamed from: com.mi.health.course.activity.eco.EcoCourseBasePlayerVM$cmd$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.activity.eco.EcoCourseBasePlayerVM$cmd$1", f = "EcoCourseBasePlayerVM.kt", i = {}, l = {353}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $duration;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14141(long j, Continuation<? super C14141> continuation) {
            super(2, continuation);
            this.$duration = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoCourseBasePlayerVM.this.new C14141(this.$duration, continuation);
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
            return ((C14141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.activity.eco.EcoCourseBasePlayerVM$onSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.activity.eco.EcoCourseBasePlayerVM$onSync$1", f = "EcoCourseBasePlayerVM.kt", i = {}, l = {398}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14151(String str, Continuation<? super C14151> continuation) {
            super(2, continuation);
            this.$sid = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoCourseBasePlayerVM.this.new C14151(this.$sid, continuation);
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
            Logger.d(EcoCourseBasePlayerVM.TAG, "onSync: start = " + EcoCourseBasePlayerVM.this.getStartTime() + ", " + sportBasicReport);
            EcoCourseBasePlayerVM.this.getRecordEmitter().setValue(sportBasicReport);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.activity.eco.EcoCourseBasePlayerVM$startSport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.activity.eco.EcoCourseBasePlayerVM$startSport$1", f = "EcoCourseBasePlayerVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RequestCallback $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14171(RequestCallback requestCallback, Continuation<? super C14171> continuation) {
            super(2, continuation);
            this.$callback = requestCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoCourseBasePlayerVM.this.new C14171(this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EcoCourseBasePlayerVM.this.startLocalSport(this.$callback);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.activity.eco.EcoCourseBasePlayerVM$uploadCourseRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.activity.eco.EcoCourseBasePlayerVM$uploadCourseRecord$1", f = "EcoCourseBasePlayerVM.kt", i = {}, l = {StdStatuses.UPGRADE_REQUIRED}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $courseId;
        final /* synthetic */ int $sportType;
        final /* synthetic */ long $time;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14181(long j, long j2, int i, Continuation<? super C14181> continuation) {
            super(2, continuation);
            this.$courseId = j;
            this.$time = j2;
            this.$sportType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoCourseBasePlayerVM.this.new C14181(this.$courseId, this.$time, this.$sportType, continuation);
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
            Logger.d(EcoCourseBasePlayerVM.TAG, "uploadCourseRecord: " + ((CourseModel.RequestResult) obj).success + ".");
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String str = "";
        boolean z2 = false;
        if (z) {
            EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
            this$0.getDeviceStatusObj().setWearConnect(ecoDeviceModel != null && ecoDeviceModel.getIsDeviceConnected());
            DeviceState deviceStatusObj = this$0.getDeviceStatusObj();
            if (ecoDeviceModel == null || (name2 = EcoDeviceModelExtKt.getName(ecoDeviceModel)) == null) {
                name2 = "";
            }
            deviceStatusObj.setWearName(name2);
            this$0.getDeviceStatusObj().setWearHas(z && ecoDeviceModel != null);
        }
        this$0.getDeviceStatusObj().setSportHas(true);
        DeviceState deviceStatusObj2 = this$0.getDeviceStatusObj();
        EcoDeviceModel localDevice = this$0.getLocalDevice();
        if (localDevice != null && localDevice.getIsDeviceConnected()) {
            z2 = true;
        }
        deviceStatusObj2.setSportConnect(z2);
        DeviceState deviceStatusObj3 = this$0.getDeviceStatusObj();
        EcoDeviceModel localDevice2 = this$0.getLocalDevice();
        if (localDevice2 != null && (name = EcoDeviceModelExtKt.getName(localDevice2)) != null) {
            str = name;
        }
        deviceStatusObj3.setSportName(str);
        Logger.d(TAG, "checkDeviceStatus: " + this$0.getDeviceStatusObj());
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
        return new StopWatch(0L, new Function1() { // from class: sl7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseBasePlayerVM.durationTimer_delegate$lambda$4$lambda$3(this.f33754a, ((Long) obj).longValue());
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
            Logger.d(TAG, "local device disconnect");
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
        return new StopWatch(100L, new Function1() { // from class: em7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseBasePlayerVM.progressTimer_delegate$lambda$6$lambda$5(this.f16802a, ((Long) obj).longValue());
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
        ScopeExtKt.scopeNetLife$default(this, null, new C14181(courseId, time, sportType, null), 1, null).m503catch(new Function2() { // from class: gm7
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
        Logger.d(TAG, "uploadCourseRecord: " + it.getMessage());
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
                    this.mSportStateCaller.setGymFtpPercentRpm((int) value, new RequestCallback() { // from class: com.mi.health.course.activity.eco.EcoCourseBasePlayerVM.changeProperty.2
                        @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                        public void call(int responseCode) {
                            Logger.d(EcoCourseBasePlayerVM.TAG, "changeProperty cmd: res = " + responseCode);
                        }
                    });
                }
            } else if (iHashCode != 109641799) {
                if (iHashCode != 1863800889) {
                    return;
                }
                item.equals("resistance");
            } else if (item.equals("speed")) {
                this.mSportStateCaller.setGymSpeed(value, new RequestCallback() { // from class: com.mi.health.course.activity.eco.EcoCourseBasePlayerVM.changeProperty.1
                    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                    public void call(int responseCode) {
                        Logger.d(EcoCourseBasePlayerVM.TAG, "changeProperty cmd: res = " + responseCode);
                    }
                });
            }
        }
    }

    public final void checkDeviceStatus() {
        String name;
        if (this.supportDeviceLink) {
            this.mSportStateCaller.isSupportLaunchSport(this.sportType, new j7r() { // from class: ql7
                @Override // defpackage.j7r
                public final void a(Boolean bool) {
                    EcoCourseBasePlayerVM.checkDeviceStatus$lambda$7(this.f31619a, bool.booleanValue());
                }
            });
            return;
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        getDeviceStatusObj().setWearConnect(ecoDeviceModel != null && ecoDeviceModel.getIsDeviceConnected());
        DeviceState deviceStatusObj = getDeviceStatusObj();
        if (ecoDeviceModel == null || (name = EcoDeviceModelExtKt.getName(ecoDeviceModel)) == null) {
            name = "";
        }
        deviceStatusObj.setWearName(name);
        getDeviceStatusObj().setWearHas(ecoDeviceModel != null);
        getDeviceStatusObj().setSportHas(false);
        Logger.d(TAG, "checkDeviceStatus: " + getDeviceStatusObj());
        Function1<? super DeviceState, Unit> function1 = this.mOnDeviceStatus;
        if (function1 != null) {
            function1.invoke2(getDeviceStatusObj());
        }
    }

    public final void cmd(long duration) {
        if (!this.cmdSet.isEmpty() && this.cmdEnable && this.supportDeviceLink) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C14141(duration, null), 3, null);
        }
    }

    public final void disconnectOperate() {
        this.mSportStateCaller.abnormalChangeSportStateToFinish();
    }

    public final void finishSport(int sportType, @NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Logger.d(TAG, "finishSport: sportType = " + sportType + " ");
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

    @Nullable
    public final MutableLiveData<oe4> getConnectEcoState() {
        return this.connectEcoState;
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
        Logger.d(TAG, "initData: model = " + model + "; sportType = " + sportType + "; linkage = " + this.supportDeviceLink + "; calorie = " + this.configCalorie + "; duration = " + this.configDuration + ", courseId = " + courseId);
    }

    public final boolean isDeviceConnect() {
        EcoDeviceModel localDevice = getLocalDevice();
        return localDevice != null && localDevice.getIsDeviceConnected();
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
        Logger.d(TAG, "popTooShort: data = " + phoneSportData);
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
        Logger.d(TAG, "releasePlayer: ");
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectFailure(@Nullable String did, @NotNull String mac, int errorCode, int retryTimes) {
        Intrinsics.checkNotNullParameter(mac, "mac");
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectStart(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX WARN: Code duplicated, block: B:15:0x0050  */
    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectSuccess(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Logger.d(TAG, "onConnectSuccess=" + did);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (this.supportDeviceLink) {
            EcoDeviceModel localDevice = getLocalDevice();
            if (Intrinsics.areEqual(localDevice != null ? localDevice.getDid() : null, did)) {
                this.mSportStateCaller.syncLocalDeviceSportStatus();
            } else {
                if (Intrinsics.areEqual(ecoDeviceModel != null ? ecoDeviceModel.getDid() : null, did)) {
                    restartEcoSport(this.sportType);
                }
            }
        } else {
            if (Intrinsics.areEqual(ecoDeviceModel != null ? ecoDeviceModel.getDid() : null, did)) {
                restartEcoSport(this.sportType);
            }
        }
        checkDeviceStatus();
        oe4 oe4Var = new oe4(did, true);
        MutableLiveData<oe4> mutableLiveData = this.connectEcoState;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(oe4Var);
        }
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onDisconnect(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Logger.d(TAG, "onDisconnect=" + did);
        checkDeviceStatus();
        oe4 oe4Var = new oe4(did, false);
        MutableLiveData<oe4> mutableLiveData = this.connectEcoState;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(oe4Var);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(@Nullable PhoneSportData phoneSportData) {
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
        Logger.d(TAG, "onSync: sid = " + recordSid + ", sportType= " + this.sportType + ", time = " + this.startTime);
        if (recordSid == null || recordSid.length() == 0) {
            this.recordEmitter.setValue(null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C14151(recordSid, null), 3, null);
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

    public final void restartEcoSport(int sportType) {
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        Logger.d(TAG, "restartEcoSport");
        this.mSportStateCaller.restartSport(ecoDeviceModel != null ? ecoDeviceModel.getDid() : null, sportType, new RequestCallback() { // from class: com.mi.health.course.activity.eco.EcoCourseBasePlayerVM.restartEcoSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                Logger.d(EcoCourseBasePlayerVM.TAG, "restartSport: res = " + responseCode);
            }
        });
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
            Logger.d(TAG, "setLinkage: cmdSet = " + this.cmdSet);
        }
    }

    public final void setConnectEcoState(@Nullable MutableLiveData<oe4> mutableLiveData) {
        this.connectEcoState = mutableLiveData;
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

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setSupportDeviceLink(boolean z) {
        this.supportDeviceLink = z;
    }

    public final void startLocalSport(@NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.supportDeviceLink || isConnected(callback)) {
            Logger.d(TAG, "startLocalSport: ");
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

    public final void startSport(@NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C14171(callback, null), 3, null);
    }
}
