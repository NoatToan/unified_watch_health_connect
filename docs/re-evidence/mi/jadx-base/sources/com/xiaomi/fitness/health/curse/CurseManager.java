package com.xiaomi.fitness.health.curse;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.autonavi.base.amap.mapcore.tools.GLMapStaticValue;
import com.mi.fitness.menstrual.data.MenstrualCycleInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.CurseApi;
import com.xiaomi.fit.fitness.export.api.CurseApiKt;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.aggregation.CurseRecordKt;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fit.fitness.export.data.item.AlgoCurseItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureTrendItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.chart.entrys.CurseEntry;
import com.xiaomi.fitness.common.extension.CurseDeviceSyncExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.TimeExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.curse.data.CurseMixedRecordKt;
import com.xiaomi.fitness.health.curse.data.CurseNotify;
import com.xiaomi.fitness.health.export.MenstrualWidgetEntryList;
import com.xiaomi.fitness.health.export.MenstrualWidgetSampleBrief;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.settingitem.settingitem.CurseSetting;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationRecord;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationTotalRecord;
import com.xiaomi.onetrack.OneTrack;
import defpackage.c0j;
import defpackage.jv9;
import defpackage.ni4;
import defpackage.pni;
import defpackage.qxi;
import defpackage.s7r;
import defpackage.ur9;
import defpackage.v64;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ò\u00012\u00020\u0001:\u0004ò\u0001ó\u0001B\b¢\u0006\u0005\bñ\u0001\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\f\u0010\u0013J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u000f\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0 2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010\u0004J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010'\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010\nJ\u0017\u0010,\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b.\u0010-J'\u00102\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000bH\u0002¢\u0006\u0004\b2\u00103J'\u00106\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u0011H\u0002¢\u0006\u0004\b6\u00107J'\u0010<\u001a\u00020\u00022\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020\bH\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00022\u0006\u0010>\u001a\u00020#H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00022\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00022\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bC\u0010BJ\u0019\u0010F\u001a\u00020E2\b\b\u0002\u0010D\u001a\u00020\bH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000bH\u0002¢\u0006\u0004\bH\u0010\rJ\u000f\u0010I\u001a\u00020EH\u0002¢\u0006\u0004\bI\u0010JJ/\u0010O\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0M0L2\u0006\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\bO\u0010PJ3\u0010S\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0M0 2\b\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\bS\u0010TJ\u0015\u0010V\u001a\u0004\u0018\u00010U*\u000208H\u0002¢\u0006\u0004\bV\u0010WJ'\u0010Y\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\u0006\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\u00022\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b[\u0010BJ'\u0010_\u001a\u00020\u00022\u000e\u0010^\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010\\2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b_\u0010`J\u001f\u0010b\u001a\u00020#2\u000e\u0010a\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010\\H\u0002¢\u0006\u0004\bb\u0010cJ%\u0010d\u001a\b\u0012\u0004\u0012\u00020Q0\\2\u000e\u0010a\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010\\H\u0002¢\u0006\u0004\bd\u0010eJ#\u0010g\u001a\b\u0012\u0004\u0012\u00020]0\\2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020Q0\\H\u0002¢\u0006\u0004\bg\u0010eJ\u0017\u0010h\u001a\u00020\b2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\u0002H\u0002¢\u0006\u0004\bj\u0010\u0004J\u000f\u0010k\u001a\u00020\u0002H\u0002¢\u0006\u0004\bk\u0010\u0004J\r\u0010l\u001a\u00020\b¢\u0006\u0004\bl\u0010mJ\u0015\u0010p\u001a\u00020\u00022\u0006\u0010o\u001a\u00020n¢\u0006\u0004\bp\u0010qJ\u0015\u0010r\u001a\u00020\u00022\u0006\u0010o\u001a\u00020n¢\u0006\u0004\br\u0010qJ\r\u0010s\u001a\u00020\u0002¢\u0006\u0004\bs\u0010\u0004J\r\u0010t\u001a\u00020\b¢\u0006\u0004\bt\u0010mJ\r\u0010u\u001a\u00020\b¢\u0006\u0004\bu\u0010mJ\u0017\u0010w\u001a\u00020\u00002\u0006\u0010v\u001a\u00020#H\u0007¢\u0006\u0004\bw\u0010xJ\u000f\u0010z\u001a\u0004\u0018\u00010y¢\u0006\u0004\bz\u0010{J\u0015\u0010|\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b|\u0010\nJ\u000f\u0010}\u001a\u0004\u0018\u00010y¢\u0006\u0004\b}\u0010{J\r\u0010~\u001a\u00020\u000b¢\u0006\u0004\b~\u0010\rJ\r\u0010\u007f\u001a\u00020\u000b¢\u0006\u0004\b\u007f\u0010\rJ\u0015\u0010~\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b~\u0010\u0013J\u0015\u0010\u007f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u007f\u0010\u0013J+\u0010\u0080\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060L2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0005\b\u0080\u0001\u0010PJ#\u0010\u0082\u0001\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0007\u0010\u0081\u0001\u001a\u00020\u000b¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J#\u0010\u0084\u0001\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0007\u0010\u0081\u0001\u001a\u00020\u000b¢\u0006\u0006\b\u0084\u0001\u0010\u0083\u0001J#\u0010\u0085\u0001\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0007\u0010\u0081\u0001\u001a\u00020\u000b¢\u0006\u0006\b\u0085\u0001\u0010\u0083\u0001J.\u0010\u0088\u0001\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u00062\t\b\u0002\u0010\u0086\u0001\u001a\u00020\u000b2\t\b\u0002\u0010\u0087\u0001\u001a\u00020\u000b¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J#\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020#0 2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0005\b\u008a\u0001\u0010\"J\u0011\u0010\u008c\u0001\u001a\u00030\u008b\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0011\u0010\u008f\u0001\u001a\u00030\u008e\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J!\u0010\u0092\u0001\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0007\u0010\u0091\u0001\u001a\u00020\b¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J+\u0010\u0094\u0001\u001a\u0004\u0018\u00010(2\u0006\u0010\u0012\u001a\u00020\u00112\u0007\u0010\u0091\u0001\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0017\u0010\u0096\u0001\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0005\b\u0096\u0001\u0010\u0013J\u0017\u0010\u0097\u0001\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0005\b\u0097\u0001\u0010\u0013J\u0015\u0010X\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\bX\u0010-J\u0017\u0010\u0098\u0001\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0005\b\u0098\u0001\u0010-J\u0017\u0010\u0099\u0001\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0005\b\u0099\u0001\u0010-J\u0019\u0010\u009a\u0001\u001a\u00020\u00022\u0006\u0010>\u001a\u00020#H\u0007¢\u0006\u0005\b\u009a\u0001\u0010@J\u0017\u0010\u009b\u0001\u001a\u00020\u00022\u0006\u00109\u001a\u000208¢\u0006\u0005\b\u009b\u0001\u0010BJ\u0019\u0010\u009c\u0001\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010#¢\u0006\u0005\b\u009c\u0001\u0010@J\u0012\u0010\u009d\u0001\u001a\u0004\u0018\u00010Q¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J(\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020Q0\\2\u0007\u0010\u009f\u0001\u001a\u00020\u00062\u0007\u0010 \u0001\u001a\u00020\u0006¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0012\u0010£\u0001\u001a\u0004\u0018\u00010Q¢\u0006\u0006\b£\u0001\u0010\u009e\u0001J5\u0010¨\u0001\u001a\t\u0012\u0005\u0012\u00030§\u00010\\2\u0007\u0010¤\u0001\u001a\u00020\u00062\u0007\u0010¥\u0001\u001a\u00020\u00062\u0007\u0010¦\u0001\u001a\u00020\u000bH\u0086@¢\u0006\u0006\b¨\u0001\u0010©\u0001R(\u0010ª\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bª\u0001\u0010«\u0001\u001a\u0005\b¬\u0001\u0010m\"\u0006\b\u00ad\u0001\u0010®\u0001R\u0018\u0010°\u0001\u001a\u00030¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0019\u0010²\u0001\u001a\u00020y8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\"\u0010¶\u0001\u001a\r µ\u0001*\u0005\u0018\u00010´\u00010´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001e\u0010¹\u0001\u001a\t\u0012\u0004\u0012\u00020n0¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010¼\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u001e\u0010¾\u0001\u001a\u0004\u0018\u0001088\u0006¢\u0006\u0010\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001R3\u0010Ã\u0001\u001a\f\u0012\u0005\u0012\u00030§\u0001\u0018\u00010Â\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R(\u0010É\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÉ\u0001\u0010«\u0001\u001a\u0005\bÊ\u0001\u0010m\"\u0006\bË\u0001\u0010®\u0001R(\u0010Ì\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÌ\u0001\u0010«\u0001\u001a\u0005\bÍ\u0001\u0010m\"\u0006\bÎ\u0001\u0010®\u0001R*\u0010Ð\u0001\u001a\u00030Ï\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÐ\u0001\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0006\bÔ\u0001\u0010Õ\u0001R(\u0010Ö\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÖ\u0001\u0010«\u0001\u001a\u0005\b×\u0001\u0010m\"\u0006\bØ\u0001\u0010®\u0001R\u0019\u0010Ù\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R\u0019\u0010Û\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ú\u0001R\u0019\u0010Ü\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010Ú\u0001R\u0019\u0010Ý\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u0019\u0010ß\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010Þ\u0001R\u0019\u0010à\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010Þ\u0001R\u0019\u0010á\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010Þ\u0001R\u0019\u0010â\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u001e\u0010ä\u0001\u001a\t\u0012\u0004\u0012\u00020Q0Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010Ä\u0001R \u0010æ\u0001\u001a\t\u0012\u0004\u0012\u00020Q0å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u001b\u0010è\u0001\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u001c\u0010ë\u0001\u001a\u0005\u0018\u00010ê\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u001c\u0010í\u0001\u001a\u0005\u0018\u00010ê\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010ì\u0001R\u001a\u0010ï\u0001\u001a\u00030î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001¨\u0006ô\u0001"}, d2 = {"Lcom/xiaomi/fitness/health/curse/CurseManager;", "", "", "calculateData", "()V", "initSetting", "", "mills", "", "isLatestPeriod", "(J)Z", "", "getOvumIndex", "()I", "Lkotlin/ranges/IntRange;", "getRiskRange", "()Lkotlin/ranges/IntRange;", "Lorg/joda/time/LocalDate;", DialWidgetType.DATE, "(Lorg/joda/time/LocalDate;)I", "(Lorg/joda/time/LocalDate;)Lkotlin/ranges/IntRange;", "getLatestInEnd", "()J", "initInDays", "initInterval", "initOvumIndex", "initRiskRange", "getIntervalStart", "(Lorg/joda/time/LocalDate;)Lorg/joda/time/LocalDate;", "getCalInternalStart", "getNextInMillis", "(J)J", "Lkotlin/Pair;", "getProtoNextTag", "(J)Lkotlin/Pair;", "", "getTodayWidgetProviderDesc", "()Ljava/lang/String;", "getAlgoCurseData4Widget", "selected", "Landroid/graphics/drawable/Drawable;", "getNormalSelectedDrawable", "(Z)Landroid/graphics/drawable/Drawable;", "isPredict", "isIn", "(Lorg/joda/time/LocalDate;)Z", "isRisk", "x", "y", "z", "getCalcValue", "(III)I", StatConstants.PARAM_START, StatConstants.PARAM_END, "isBetween", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)Z", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "device", "dbHasData", "deviceHasData", "syncConfig", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;ZZ)V", "did", "syncDataAndSet", "(Ljava/lang/String;)V", "testDeviceAppMerge", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "syncHuamiData", "supportPredict", "Ljv9;", "buildCommonWomenHealthConfig", "(Z)Ljv9;", "getWomenHealthInitTimeSecond", "getProtoTotalRecord", "()Ljv9;", "curZeroMills", "Lkotlin/Triple;", "", "Ljv9$a;", "buildPredictOnData", "(J)Lkotlin/Triple;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "latest", "buildPredictOffData", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;J)Lkotlin/Pair;", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;", "getHuamiCurseTotalRecord", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;", "isOvum", "getProtoDayType", "(ZZZ)I", "syncProtoRecordForDeviceSupportPredict", "", "Ljv9$c;", "deviceList", "dealDeviceAndAppMergeRecord", "(Ljava/util/List;Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "sectionList", "formatSectionList", "(Ljava/util/List;)Ljava/lang/String;", "convertSectionToCurseRecord", "(Ljava/util/List;)Ljava/util/List;", "curseRecord", "convertCurseRecordToSection", "isDeviceSupportPredict", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "observerDataReady", "tryObserverData", "supportMenstrualPredict", "()Z", "Lcom/xiaomi/fitness/health/curse/CurseManager$OnConfigChange;", "action", "addDataObserver", "(Lcom/xiaomi/fitness/health/curse/CurseManager$OnConfigChange;)V", "removeObserver", CervicalMucusRecord.Appearance.CLEAR, "isAlgoPredictEnable", "isAlgoPredictOff", "origin", "initData", "(Ljava/lang/String;)Lcom/xiaomi/fitness/health/curse/CurseManager;", "Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;", "readSetting", "()Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;", "isLatestIn", "getSetting", "getInDays", "getInterval", "getNextInDuration", "beforeDays", "getNextInNotifyMillis", "(JI)J", "getNextNotifyOvumMillis", "getNextRiskNotifyMillis", "inIndex", "menDays", "getDesc", "(JII)Ljava/lang/String;", "getTempTrendDesc", "Lcom/xiaomi/fitness/health/export/MenstrualWidgetSampleBrief;", "getTodayWidgetProviderSampleBrief", "()Lcom/xiaomi/fitness/health/export/MenstrualWidgetSampleBrief;", "Lcom/xiaomi/fitness/health/export/MenstrualWidgetEntryList;", "getWidgetProviderEntryList", "()Lcom/xiaomi/fitness/health/export/MenstrualWidgetEntryList;", "isManualIn", "isNormalDay", "(Lorg/joda/time/LocalDate;Z)Z", "getDayBg", "(Lorg/joda/time/LocalDate;ZZ)Landroid/graphics/drawable/Drawable;", "getDayState", "getEntranceDayStatus", "isRiskStart", "isInStart", "syncCurse", "syncProtoTotalRecord", "refreshDeviceSupportAlgoPredict", "getLatestRecord", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "startMills", "endMills", "getPredictRecords", "(JJ)Ljava/util/List;", "getLatestPredictRecord", "startTime", "endTime", OneTrack.Param.TZ, "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureTrendItem;", "getTempTrendData", "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "algoRequesting", "Z", "getAlgoRequesting", "setAlgoRequesting", "(Z)V", "Lcom/xiaomi/fitness/settingitem/DeviceSettingManager;", "settingManager", "Lcom/xiaomi/fitness/settingitem/DeviceSettingManager;", "setting", "Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", TSMAuthContants.PARAM_RESOURCE, "Landroid/content/res/Resources;", "Ljava/util/ArrayList;", "dataObserver", "Ljava/util/ArrayList;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "", "tempTrendList", "Ljava/util/List;", "getTempTrendList", "()Ljava/util/List;", "setTempTrendList", "(Ljava/util/List;)V", "hasIntelligentPredictionCapability", "getHasIntelligentPredictionCapability", "setHasIntelligentPredictionCapability", "supportMenstrualFeature", "getSupportMenstrualFeature", "setSupportMenstrualFeature", "Lcom/xiaomi/fitness/health/curse/AlgoCurseManager;", "algoCurseManager", "Lcom/xiaomi/fitness/health/curse/AlgoCurseManager;", "getAlgoCurseManager", "()Lcom/xiaomi/fitness/health/curse/AlgoCurseManager;", "setAlgoCurseManager", "(Lcom/xiaomi/fitness/health/curse/AlgoCurseManager;)V", "hasTempCharacterRecordHistory", "getHasTempCharacterRecordHistory", "setHasTempCharacterRecordHistory", "latestStart", "J", "latestEnd", "latestInEnd", "latestInDays", "I", "inDays", "interval", "ovumIndex", "riskRange", "Lkotlin/ranges/IntRange;", "recordsLatestEnded", "Ljava/util/concurrent/CopyOnWriteArrayList;", "recordsLatest", "Ljava/util/concurrent/CopyOnWriteArrayList;", "recordLatestItem", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "Lkotlinx/coroutines/CoroutineScope;", "syncScope", "Lkotlinx/coroutines/CoroutineScope;", "observerScope", "Ljava/util/concurrent/atomic/AtomicBoolean;", "ignore", "Ljava/util/concurrent/atomic/AtomicBoolean;", "<init>", "Companion", "OnConfigChange", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCurseManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseManager.kt\ncom/xiaomi/fitness/health/curse/CurseManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,2065:1\n1#2:2066\n774#3:2067\n865#3,2:2068\n1863#3,2:2070\n774#3:2080\n865#3,2:2081\n774#3:2083\n865#3,2:2084\n1971#3,14:2086\n774#3:2104\n865#3,2:2105\n1053#3:2107\n774#3:2108\n865#3,2:2109\n774#3:2111\n865#3,2:2112\n1053#3:2114\n1872#3,3:2115\n1863#3,2:2118\n1863#3,2:2120\n1863#3,2:2122\n1863#3,2:2124\n1863#3,2:2126\n37#4:2072\n36#4,3:2073\n37#4:2076\n36#4,3:2077\n37#4:2100\n36#4,3:2101\n*S KotlinDebug\n*F\n+ 1 CurseManager.kt\ncom/xiaomi/fitness/health/curse/CurseManager\n*L\n1430#1:2067\n1430#1:2068,2\n1433#1:2070,2\n1780#1:2080\n1780#1:2081,2\n1785#1:2083\n1785#1:2084,2\n1786#1:2086,14\n1806#1:2104\n1806#1:2105,2\n1807#1:2107\n1810#1:2108\n1810#1:2109,2\n1813#1:2111\n1813#1:2112,2\n1814#1:2114\n1826#1:2115,3\n1854#1:2118,2\n1874#1:2120,2\n1897#1:2122,2\n1916#1:2124,2\n227#1:2126,2\n1652#1:2072\n1652#1:2073,3\n1691#1:2076\n1691#1:2077,3\n1798#1:2100\n1798#1:2101,3\n*E\n"})
public final class CurseManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<CurseManager> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: o85
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CurseManager.instance_delegate$lambda$37();
        }
    });
    private volatile boolean algoRequesting;
    private volatile boolean hasIntelligentPredictionCapability;
    private boolean hasTempCharacterRecordHistory;

    @NotNull
    private AtomicBoolean ignore;
    private long latestEnd;
    private int latestInDays;
    private long latestInEnd;
    private long latestStart;

    @Nullable
    private CoroutineScope observerScope;

    @Nullable
    private Record recordLatestItem;
    private CurseSetting setting;
    private boolean supportMenstrualFeature;

    @Nullable
    private CoroutineScope syncScope;

    @Nullable
    private List<TemperatureTrendItem> tempTrendList;

    @NotNull
    private final DeviceSettingManager settingManager = DeviceSettingManager.INSTANCE.getInstance();
    private final Resources resource = ApplicationExtKt.getApplication().getResources();

    @NotNull
    private final ArrayList<OnConfigChange> dataObserver = new ArrayList<>();

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Nullable
    private final WearableDeviceModel deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();

    @NotNull
    private AlgoCurseManager algoCurseManager = AlgoCurseManager.INSTANCE.getInstance();
    private int inDays = -1;
    private int interval = -1;
    private int ovumIndex = -1;

    @NotNull
    private IntRange riskRange = IntRange.Companion.getEMPTY();

    @NotNull
    private final List<Record> recordsLatestEnded = new ArrayList();

    @NotNull
    private CopyOnWriteArrayList<Record> recordsLatest = new CopyOnWriteArrayList<>();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/health/curse/CurseManager$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/health/curse/CurseManager;", "getInstance", "()Lcom/xiaomi/fitness/health/curse/CurseManager;", "instance$delegate", "Lkotlin/Lazy;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CurseManager getInstance() {
            return (CurseManager) CurseManager.instance$delegate.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/health/curse/CurseManager$OnConfigChange;", "", "onDataChange", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnConfigChange {
        void onDataChange();
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.CurseManager$getTempTrendData$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.CurseManager", f = "CurseManager.kt", i = {0}, l = {2021}, m = "getTempTrendData", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
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
            return CurseManager.this.getTempTrendData(0L, 0L, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.CurseManager$initData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.CurseManager$initData$1", f = "CurseManager.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCurseManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseManager.kt\ncom/xiaomi/fitness/health/curse/CurseManager$initData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2065:1\n1863#2,2:2066\n*S KotlinDebug\n*F\n+ 1 CurseManager.kt\ncom/xiaomi/fitness/health/curse/CurseManager$initData$1\n*L\n218#1:2066,2\n*E\n"})
    public static final class C24151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C24151(Continuation<? super C24151> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(CurseManager curseManager, MenstrualCycleInfo menstrualCycleInfo) {
            Logger.i("CurseManager", "syncCurse: requestCursePredictionAlgo,menstrual info:" + menstrualCycleInfo);
            CurseSetting curseSetting = curseManager.setting;
            CurseSetting curseSetting2 = null;
            if (curseSetting == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting = null;
            }
            CurseSetting curseSetting3 = curseManager.setting;
            if (curseSetting3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
            } else {
                curseSetting2 = curseSetting3;
            }
            Logger.e("CurseManager", "syncCurse: requestCursePredictionAlgo,algo predict setting:" + curseSetting + ", enable:" + Boolean.valueOf(curseSetting2.isAlgoPredictEnable()) + ",capa:" + curseManager.getHasIntelligentPredictionCapability());
            curseManager.setAlgoRequesting(false);
            if (menstrualCycleInfo != null && menstrualCycleInfo.status == 0) {
                curseManager.getAlgoCurseManager().refreshAlgoCurseData();
                Iterator it = curseManager.dataObserver.iterator();
                while (it.hasNext()) {
                    ((OnConfigChange) it.next()).onDataChange();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseManager.this.new C24151(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!CurseManager.this.getAlgoRequesting()) {
                    CurseManager.this.setAlgoRequesting(true);
                    int inDays = CurseManager.this.getInDays();
                    int interval = CurseManager.this.getInterval();
                    Logger.d("CurseManager", "requestCursePredictionAlgo before mCycle:" + inDays + ",tCycle:" + interval);
                    HealthUtil healthUtil = HealthUtil.INSTANCE;
                    long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                    final CurseManager curseManager = CurseManager.this;
                    Function1<? super MenstrualCycleInfo, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.health.curse.b
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj2) {
                            return CurseManager.C24151.invokeSuspend$lambda$2(curseManager, (MenstrualCycleInfo) obj2);
                        }
                    };
                    this.label = 1;
                    if (healthUtil.requestCursePredictionAlgo(jCurrentTimeMillis, inDays, interval, 0, function1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
            return ((C24151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.CurseManager$syncCurse$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.CurseManager$syncCurse$1", f = "CurseManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24161(String str, Continuation<? super C24161> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseManager.this.new C24161(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurseManager.this.syncDataAndSet(this.$did);
            Logger.i("CurseManager", "syncCurse did:" + this.$did + ", flag: " + CurseManager.this.getAlgoRequesting());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.CurseManager$tryObserverData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.CurseManager$tryObserverData$1", f = "CurseManager.kt", i = {}, l = {GLMapStaticValue.MAP_PARAMETERNAME_POLYGON_FILL_CONTROL}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C24181(Continuation<? super C24181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseManager.this.new C24181(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Integer> flowObserverReportChange = FitnessDataExtKt.getCurseApi().observerReportChange();
                    final CurseManager curseManager = CurseManager.this;
                    FlowCollector<? super Integer> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.curse.CurseManager.tryObserverData.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(int i2, Continuation<? super Unit> continuation) {
                            Logger.i("CurseObserver", "data changed count " + i2 + ", interrupt = " + curseManager.ignore);
                            if (curseManager.ignore.get()) {
                                curseManager.ignore.set(false);
                            } else {
                                curseManager.initData("observerDataChange");
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowObserverReportChange.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                Logger.i("CurseObserver", "tryObserverData err: " + e.getMessage());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public CurseManager() {
        if (ApplicationExtKt.isMainProcess(ApplicationExtKt.getApplication())) {
            observerDataReady();
            tryObserverData();
        }
        this.ignore = new AtomicBoolean(false);
    }

    private final jv9 buildCommonWomenHealthConfig(boolean supportPredict) {
        jv9 jv9Var = new jv9();
        jv9Var.c = true;
        CurseSetting curseSetting = this.setting;
        jv9.b[] bVarArr = null;
        CurseSetting curseSetting2 = null;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        jv9Var.d = curseSetting.isPredictEnable();
        CurseSetting curseSetting3 = this.setting;
        if (curseSetting3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting3 = null;
        }
        if (curseSetting3.isPredictEnable()) {
            jv9Var.f23171k = isAlgoPredictEnable() ? 1 : 0;
        }
        CurseSetting curseSetting4 = this.setting;
        if (curseSetting4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting4 = null;
        }
        boolean zIsPredictEnable = curseSetting4.isPredictEnable();
        CurseSetting curseSetting5 = this.setting;
        if (curseSetting5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting5 = null;
        }
        Logger.i("CurseManager", "buildCommonWomenHealthConfig 预测开关:" + zIsPredictEnable + ", 日历预测:" + (curseSetting5.isPredictEnable() && jv9Var.f23171k == 0) + " 智能预测:" + (jv9Var.f23171k == 1));
        if (supportPredict) {
            CurseSetting curseSetting6 = this.setting;
            if (curseSetting6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting6 = null;
            }
            jv9Var.g = curseSetting6.getEstimatedMenstrualDays();
            CurseSetting curseSetting7 = this.setting;
            if (curseSetting7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting7 = null;
            }
            jv9Var.h = curseSetting7.getMenstrualCycle();
            jv9Var.i = getWomenHealthInitTimeSecond();
        }
        jv9.b.a aVar = new jv9.b.a();
        CurseSetting curseSetting8 = this.setting;
        if (curseSetting8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting8 = null;
        }
        if (curseSetting8.isHardwarePush()) {
            jv9.b bVar = new jv9.b();
            bVar.c = 1;
            CurseSetting curseSetting9 = this.setting;
            if (curseSetting9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting9 = null;
            }
            bVar.d = curseSetting9.getHardwareBeforeMenstruationPush();
            jv9.b bVar2 = new jv9.b();
            bVar2.c = 2;
            CurseSetting curseSetting10 = this.setting;
            if (curseSetting10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting10 = null;
            }
            bVar2.d = curseSetting10.getHardwareBeforeOvulationPush();
            jv9.b bVar3 = new jv9.b();
            bVar3.c = 3;
            CurseSetting curseSetting11 = this.setting;
            if (curseSetting11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
            } else {
                curseSetting2 = curseSetting11;
            }
            bVar3.d = curseSetting2.getHardwareBeforePregnancyPush();
            bVarArr = new jv9.b[]{bVar, bVar2, bVar3};
        }
        aVar.c = bVarArr;
        jv9Var.e = aVar;
        Logger.i("CurseManager", "buildCommonWomenHealthConfig:" + jv9Var + ";" + supportPredict);
        return jv9Var;
    }

    public static /* synthetic */ jv9 buildCommonWomenHealthConfig$default(CurseManager curseManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return curseManager.buildCommonWomenHealthConfig(z);
    }

    private final Pair<Long, jv9.a[]> buildPredictOffData(Record latest, long curZeroMills) {
        Object next;
        if (latest == null) {
            return TuplesKt.to(0L, new jv9.a[0]);
        }
        TimeDateUtil timeDateUtil = TimeDateUtil.INSTANCE;
        long jAtEndOfMonth = timeDateUtil.atEndOfMonth(latest.getEndMills()) - 86400000;
        long jAtStartOfMonth = timeDateUtil.atStartOfMonth(latest.getStartMills());
        long daysOfMonth = TimeDateUtil.isSameMonth(new LocalDate(jAtEndOfMonth), new LocalDate(jAtStartOfMonth)) ? jAtStartOfMonth - (((long) timeDateUtil.getDaysOfMonth(jAtStartOfMonth - 86400000)) * 86400000) : jAtStartOfMonth;
        List<Record> latestRecord = FitnessDataExtKt.getCurseApi().getLatestRecord(daysOfMonth, 20);
        Logger.i("CurseManager", "buildPredictOffData: recordStart = " + jAtStartOfMonth + ", start = " + daysOfMonth + ", end = " + jAtEndOfMonth + ", records = " + latestRecord);
        ArrayList arrayList = new ArrayList();
        long progressionLastElement = ProgressionUtilKt.getProgressionLastElement(daysOfMonth, jAtEndOfMonth, 86400000L);
        if (daysOfMonth <= progressionLastElement) {
            for (long j = daysOfMonth; j <= curZeroMills; j += 86400000) {
                jv9.a aVar = new jv9.a();
                Iterator<T> it = latestRecord.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Record record = (Record) next;
                    long startMills = record.getStartMills();
                    if (j <= record.getEndMills() && startMills <= j) {
                        break;
                    }
                }
                aVar.c = getProtoDayType(false, false, ((Record) next) != null);
                aVar.d = false;
                arrayList.add(aVar);
                if (j != progressionLastElement) {
                }
            }
        }
        return TuplesKt.to(Long.valueOf(daysOfMonth), arrayList.toArray(new jv9.a[0]));
    }

    private final Triple<Long, Long, jv9.a[]> buildPredictOnData(long curZeroMills) {
        long j;
        long jMax;
        Object next;
        LocalDate localDate = new LocalDate(curZeroMills);
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(15) + calendar.get(16);
        TimeDateUtil timeDateUtil = TimeDateUtil.INSTANCE;
        LocalDate localDateMinusMonths = localDate.minusMonths(1);
        Intrinsics.checkNotNullExpressionValue(localDateMinusMonths, "minusMonths(...)");
        long jAtStartOfMonth = timeDateUtil.atStartOfMonth(TimeExtKt.toMillis(localDateMinusMonths));
        calendar.setTimeInMillis(jAtStartOfMonth);
        int i2 = calendar.get(15) + calendar.get(16);
        long j2 = jAtStartOfMonth + ((long) (i2 - i));
        LocalDate localDatePlusMonths = localDate.plusMonths(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "plusMonths(...)");
        long jAtEndOfMonth = timeDateUtil.atEndOfMonth(TimeExtKt.toMillis(localDatePlusMonths)) - 86400000;
        calendar.setTimeInMillis(jAtEndOfMonth);
        int i3 = calendar.get(15) + calendar.get(16);
        long j3 = jAtEndOfMonth + ((long) (i3 - i));
        List<Record> latestRecord = FitnessDataExtKt.getCurseApi().getLatestRecord(j2, 20);
        Record record = (Record) CollectionsKt___CollectionsKt.firstOrNull((List) latestRecord);
        if (record != null) {
            j = j2;
            jMax = record.getEndMills() + 86400000;
        } else if (FitnessDataExtKt.getCurseApi().getFirstAfter(0L) == null) {
            CurseSetting curseSetting = this.setting;
            if (curseSetting == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting = null;
            }
            j = j2;
            jMax = Math.max(curseSetting.getLastMenstrualTime(), j);
        } else {
            j = j2;
            jMax = j;
        }
        Logger.i("CurseManager", "buildPredictDataPair: start = " + j + ", end = " + j3 + ", cur = " + localDate + ", latestRecord = " + latestRecord + ", firstPredict = " + jMax + ";currentTZOffsetMillis = " + i + ";startTZOffsetMillis = " + i2 + ";endTZOffsetMillis = " + i3);
        ArrayList arrayList = new ArrayList();
        LongProgression longProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(j, jMax), 86400000L);
        long first = longProgressionStep.getFirst();
        long last = longProgressionStep.getLast();
        long step = longProgressionStep.getStep();
        long j4 = j;
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                jv9.a aVar = new jv9.a();
                Iterator<T> it = latestRecord.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Record record2 = (Record) next;
                    long startMills = record2.getStartMills();
                    if (first <= record2.getEndMills() && startMills <= first) {
                        break;
                    }
                }
                aVar.c = getProtoDayType(false, false, ((Record) next) != null);
                aVar.d = first > curZeroMills;
                arrayList.add(aVar);
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        long progressionLastElement = ProgressionUtilKt.getProgressionLastElement(jMax, j3, 86400000L);
        if (jMax <= progressionLastElement) {
            while (true) {
                LocalDate localDate2 = new LocalDate(jMax);
                boolean zIsIn = isIn(localDate2);
                boolean zIsOvum = isOvum(localDate2);
                boolean zIsRisk = isRisk(localDate2);
                jv9.a aVar2 = new jv9.a();
                aVar2.c = getProtoDayType(zIsOvum, zIsRisk, zIsIn);
                aVar2.d = true;
                arrayList.add(aVar2);
                if (jMax == progressionLastElement) {
                    break;
                }
                jMax += 86400000;
            }
        }
        return new Triple<>(Long.valueOf(j4), Long.valueOf(j3), arrayList.toArray(new jv9.a[0]));
    }

    private final void calculateData() {
        long jCurrentTimeMillis = System.currentTimeMillis() - CurseExtKt.MAX_DEVICE_MILLS;
        List<Record> latestRecord = FitnessDataExtKt.getCurseApi().getLatestRecord(jCurrentTimeMillis, 4);
        this.recordsLatest.clear();
        List<Record> list = latestRecord;
        this.recordsLatest.addAll(list);
        CurseSetting curseSetting = this.setting;
        CurseSetting curseSetting2 = null;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        if (curseSetting.getLastMenstrualTime() <= 0 && (!list.isEmpty())) {
            CurseSetting curseSetting3 = this.setting;
            if (curseSetting3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting3 = null;
            }
            curseSetting3.setLastMenstrualTime(((Record) CollectionsKt___CollectionsKt.first((List) latestRecord)).getStartMills());
            DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
            CurseSetting curseSetting4 = this.setting;
            if (curseSetting4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
            } else {
                curseSetting2 = curseSetting4;
            }
            companion.saveDeviceSetItem(false, "xiaomiwear_app", "curse", curseSetting2);
        }
        this.recordLatestItem = list.isEmpty() ^ true ? (Record) CollectionsKt___CollectionsKt.firstOrNull((List) latestRecord) : (Record) CollectionsKt___CollectionsKt.firstOrNull((List) FitnessDataExtKt.getCurseApi().getLatestRecord(0L, 1));
        List<Record> latestEndedRecord = FitnessDataExtKt.getCurseApi().getLatestEndedRecord(jCurrentTimeMillis, 4);
        this.recordsLatestEnded.clear();
        this.recordsLatestEnded.addAll(latestEndedRecord);
        Logger.i("CurseManager", "calculateData: recordsLatestEnd(120days) = " + this.recordsLatestEnded + ", recordsLatest(120days) = " + latestRecord + " ,recordLatestItem:" + this.recordLatestItem);
        initInDays();
        initInterval();
        initOvumIndex();
        initRiskRange();
        this.algoCurseManager.setLatestStart(this.latestStart);
        this.algoCurseManager.setLatestInEnd(this.latestInEnd);
        this.algoCurseManager.setLatestInDays(this.latestInDays);
    }

    private final List<jv9.c> convertCurseRecordToSection(List<Record> curseRecord) {
        ArrayList arrayList = new ArrayList();
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        for (Record record : curseRecord) {
            jv9.c cVar = new jv9.c();
            long j = 1000;
            cVar.c = (int) FitnessDateUtils.changeToDestZeroTimeOneDay(record.getStartMills() / j, currentTZOffsetInSec, 0);
            cVar.d = (int) FitnessDateUtils.changeToDestZeroTimeOneDay(record.getEndMills() / j, currentTZOffsetInSec, 0);
            cVar.e = (int) record.getUpdateTime();
            arrayList.add(cVar);
        }
        if (isAlgoPredictEnable()) {
            List<AlgoCurseItem> algoCurseData = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE).getAlgoCurseData();
            if ((!algoCurseData.isEmpty()) && ((AlgoCurseItem) CollectionsKt___CollectionsKt.first((List) algoCurseData)).getStatus() != 0) {
                return arrayList;
            }
            for (AlgoCurseItem algoCurseItem : algoCurseData) {
                jv9.c cVar2 = new jv9.c();
                cVar2.c = (int) FitnessDateUtils.changeToDestZeroTimeOneDay(algoCurseItem.getStartTime(), currentTZOffsetInSec, 0);
                cVar2.d = (int) FitnessDateUtils.changeToDestZeroTimeOneDay(algoCurseItem.getEndTime(), currentTZOffsetInSec, 0);
                cVar2.g = (int) FitnessDateUtils.changeToDestZeroTimeOneDay(algoCurseItem.getOvulationTime(), currentTZOffsetInSec, 0);
                cVar2.e = 0;
                arrayList.add(cVar2);
            }
        }
        return arrayList;
    }

    private final List<Record> convertSectionToCurseRecord(List<jv9.c> sectionList) {
        List<jv9.c> list = sectionList;
        if (list == null || list.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (jv9.c cVar : sectionList) {
            int i = cVar.c;
            FitnessDateUtils fitnessDateUtils = FitnessDateUtils.INSTANCE;
            long jChangeToDestZeroTimeOneDay = FitnessDateUtils.changeToDestZeroTimeOneDay(i, 0, (int) fitnessDateUtils.getTZOffsetInSec(i)) * 1000;
            int i2 = cVar.d;
            arrayList.add(new Record(jChangeToDestZeroTimeOneDay, FitnessDateUtils.changeToDestZeroTimeOneDay(i2, 0, (int) fitnessDateUtils.getTZOffsetInSec(i2)) * 1000, cVar.e, -1, 0, 16, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x011b  */
    public final void dealDeviceAndAppMergeRecord(List<jv9.c> deviceList, WearableDeviceModel device) {
        ArrayList arrayList;
        int i;
        List<jv9.c> listSortedWith;
        Record recordCopy;
        Object next;
        int i2;
        Logger.i("CurseManager", "dealDeviceAndAppMergeRecord get curse section list from device " + deviceList);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - CurseExtKt.MAX_DEVICE_MILLS;
        long j2 = jCurrentTimeMillis - CurseExtKt.MAX_APP_DEVICE_MERGE_MILLS;
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        long j3 = 1000;
        long jChangeToDestZeroTimeOneDay = FitnessDateUtils.changeToDestZeroTimeOneDay(j2 / j3, currentTZOffsetInSec, 0);
        long j4 = jCurrentTimeMillis / j3;
        long jChangeToDestZeroTimeOneDay2 = FitnessDateUtils.changeToDestZeroTimeOneDay(j4, currentTZOffsetInSec, 0);
        List<Record> period = FitnessDataExtKt.getCurseApi().getPeriod(j, jCurrentTimeMillis);
        long lastModifySec = FitnessDataExtKt.getCurseApi().getLastModifySec();
        long curseMaxUpdateTimeSec = FitnessDataExtKt.getCurseApi().getCurseMaxUpdateTimeSec(j2, jCurrentTimeMillis);
        long j5 = (lastModifySec < jChangeToDestZeroTimeOneDay || lastModifySec > j4) ? curseMaxUpdateTimeSec : lastModifySec;
        Logger.i("CurseManager", "cursePrefLastModify " + lastModifySec + ";daoLastModify " + curseMaxUpdateTimeSec + ";final " + j5);
        if (deviceList != null) {
            arrayList = new ArrayList();
            Iterator it = deviceList.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                jv9.c cVar = (jv9.c) next2;
                int i3 = cVar.d;
                Iterator it2 = it;
                if (i3 >= ((int) jChangeToDestZeroTimeOneDay) && (i3 <= (i2 = (int) jChangeToDestZeroTimeOneDay2) || (i3 > i2 && cVar.c <= i2))) {
                    arrayList.add(next2);
                }
                it = it2;
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((jv9.c) obj).e <= j4) {
                    arrayList2.add(obj);
                }
            }
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    int i4 = ((jv9.c) next).e;
                    do {
                        Object next3 = it3.next();
                        int i5 = ((jv9.c) next3).e;
                        if (i4 < i5) {
                            next = next3;
                            i4 = i5;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next = null;
            }
            jv9.c cVar2 = (jv9.c) next;
            if (cVar2 != null) {
                i = cVar2.e;
            } else {
                i = -1;
            }
        } else {
            i = -1;
        }
        Logger.i("CurseManager", "dealDeviceAndAppMergeRecord \ndeviceRecentTwoMonthMaxUpdateTime:" + i + ";\nappRecentTwoMonthMaxUpdateTime:" + j5 + ";\ndeviceRecentTwoMonthData:" + formatSectionList(arrayList) + ";\nappRecentTwoMonthData:" + period + ";");
        if (i <= j5) {
            List<jv9.c> listConvertCurseRecordToSection = convertCurseRecordToSection(period);
            jv9 jv9VarBuildCommonWomenHealthConfig = buildCommonWomenHealthConfig(true);
            jv9.c.a aVar = new jv9.c.a();
            aVar.c = (jv9.c[]) listConvertCurseRecordToSection.toArray(new jv9.c[0]);
            jv9VarBuildCommonWomenHealthConfig.j = aVar;
            Logger.i("CurseManager", "sync curse record data " + listConvertCurseRecordToSection);
            CurseDeviceSyncExtKt.curseSetTotalRecord(device, CurseMixedRecordKt.genProtoRecord(jv9VarBuildCommonWomenHealthConfig));
            return;
        }
        if (arrayList != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!((jv9.c) obj2).f) {
                    arrayList3.add(obj2);
                }
            }
            listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.xiaomi.fitness.health.curse.CurseManager$dealDeviceAndAppMergeRecord$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((jv9.c) t).c), Integer.valueOf(((jv9.c) t2).c));
                }
            });
        } else {
            listSortedWith = null;
        }
        List<Record> listConvertSectionToCurseRecord = convertSectionToCurseRecord(listSortedWith);
        Record record = (Record) CollectionsKt___CollectionsKt.firstOrNull((List) listConvertSectionToCurseRecord);
        List<Record> list = period;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list) {
            if (((Record) obj3).getEndMills() / j3 >= jChangeToDestZeroTimeOneDay) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : list) {
            if (((Record) obj4).getEndMills() / j3 < jChangeToDestZeroTimeOneDay) {
                arrayList5.add(obj4);
            }
        }
        Record record2 = (Record) CollectionsKt___CollectionsKt.lastOrNull(CollectionsKt___CollectionsKt.sortedWith(arrayList5, new Comparator() { // from class: com.xiaomi.fitness.health.curse.CurseManager$dealDeviceAndAppMergeRecord$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((Record) t).getEndMills()), Long.valueOf(((Record) t2).getEndMills()));
            }
        }));
        if (record2 == null || record == null) {
            recordCopy = null;
        } else {
            recordCopy = CurseRecordKt.copy(record2);
            recordCopy.setInterval(TimeDateUtil.getIntervalDay(record2.getStartMills(), record.getStartMills()));
        }
        int i6 = 0;
        for (Object obj5 : listConvertSectionToCurseRecord) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Record record3 = (Record) obj5;
            Record record4 = (i7 < 0 || i7 >= listConvertSectionToCurseRecord.size()) ? null : listConvertSectionToCurseRecord.get(i7);
            if (record4 != null) {
                record3.setInterval(TimeDateUtil.getIntervalDay(record3.getStartMills(), record4.getStartMills()));
            }
            i6 = i7;
        }
        FitnessDataExtKt.getCurseApi().updateLastModify(System.currentTimeMillis() / j3);
        CurseApi.DefaultImpls.batchActionRecord$default(FitnessDataExtKt.getCurseApi(), recordCopy != null ? CollectionsKt__CollectionsJVMKt.listOf(recordCopy) : CollectionsKt__CollectionsKt.emptyList(), arrayList4, listConvertSectionToCurseRecord, null, CurseRecordKt.toDeleteKey(arrayList4), 8, null);
        Logger.i("CurseManager", "dealDeviceAndAppMergeRecord update before " + record2 + ";update after " + recordCopy + ";deleteList " + arrayList4 + ";insertList " + listConvertSectionToCurseRecord);
    }

    private final String formatSectionList(List<jv9.c> sectionList) {
        StringBuffer stringBuffer = new StringBuffer("[");
        List<jv9.c> list = sectionList;
        if (list == null || list.isEmpty()) {
            stringBuffer.append(AbstractJsonLexerKt.NULL);
        } else {
            for (jv9.c cVar : sectionList) {
                int i = cVar.c;
                String dateYYYYMMdd = TimeDateUtil.getDateYYYYMMdd(((long) i) * 1000);
                int i2 = cVar.d;
                String dateYYYYMMdd2 = TimeDateUtil.getDateYYYYMMdd(((long) i2) * 1000);
                int i3 = cVar.e;
                stringBuffer.append("Record(start=" + i + "-" + dateYYYYMMdd + ";end=" + i2 + "-" + dateYYYYMMdd2 + ";updateTime=" + i3 + "-" + TimeDateUtil.getDateYYYYMMDDHHmmLocalFormat$default(i3, false, 2, null) + ";isDelete " + cVar.f + "),");
            }
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final void getAlgoCurseData4Widget() {
        String did;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel != null && (did = wearableDeviceModel.getDid()) != null) {
            this.hasIntelligentPredictionCapability = (DeviceManagerExtKt.getInstance(companion).getDeviceCapabilityV2(did) & 65536) == 65536;
        }
        if (isAlgoPredictEnable()) {
            this.algoCurseManager.refreshAlgoCurseData();
        }
    }

    private final LocalDate getCalInternalStart(LocalDate date) {
        LocalDate localDate = new LocalDate(this.latestStart);
        int intervalDay = TimeDateUtil.getIntervalDay(localDate, date);
        int interval = getInterval();
        int i = (intervalDay < 0 && intervalDay % interval != 0) ? (intervalDay / interval) - 1 : intervalDay / interval;
        LocalDate localDatePlusDays = localDate.plusDays(i * interval);
        Logger.d("CurseManager", "getIntervalStart: date = " + date + "; gapDays = " + intervalDay + "; interval = " + interval + "; intervalNum = " + i + "; intervalStart = " + localDatePlusDays);
        Intrinsics.checkNotNull(localDatePlusDays);
        return localDatePlusDays;
    }

    private final int getCalcValue(int x, int y, int z) {
        if (x == y || x == z) {
            return x;
        }
        return y == z ? y : ((x + y) + z) / 3;
    }

    public static /* synthetic */ String getDesc$default(CurseManager curseManager, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return curseManager.getDesc(j, i, i2);
    }

    private final MenstruationTotalRecord getHuamiCurseTotalRecord(WearableDeviceModel wearableDeviceModel) {
        HuamiApiCaller huamiDevice = CurseDeviceSyncExtKt.getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.getMenstruationTotalRecord();
        }
        return null;
    }

    private final LocalDate getIntervalStart(LocalDate date) {
        return isAlgoPredictEnable() ? this.algoCurseManager.getIntervalStart(date) : getCalInternalStart(date);
    }

    private final long getLatestInEnd() {
        Record record;
        if (isAlgoPredictEnable() && (record = this.recordLatestItem) != null) {
            Intrinsics.checkNotNull(record);
            if (record.getEndMills() >= CurseExtKt.getTodayZeroMills()) {
                return this.algoCurseManager.getFirstPredictionEnd();
            }
            Record record2 = this.recordLatestItem;
            Intrinsics.checkNotNull(record2);
            return record2.getEndMills();
        }
        return this.latestInEnd;
    }

    public static /* synthetic */ Triple getNextInDuration$default(CurseManager curseManager, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return curseManager.getNextInDuration(j);
    }

    private final long getNextInMillis(long mills) {
        if (isAlgoPredictEnable()) {
            return this.algoCurseManager.getNextInMillis(mills);
        }
        LocalDate localDate = new LocalDate(CurseExtKt.getZeroMills(mills));
        int interval = getInterval();
        LocalDate intervalStart = getIntervalStart(localDate);
        Intrinsics.checkNotNull(intervalStart);
        return CurseExtKt.getZeroMills(ExtUtilKt.getMills(intervalStart)) + (((long) interval) * 86400000);
    }

    public static /* synthetic */ long getNextInMillis$default(CurseManager curseManager, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return curseManager.getNextInMillis(j);
    }

    public static /* synthetic */ long getNextInNotifyMillis$default(CurseManager curseManager, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return curseManager.getNextInNotifyMillis(j, i);
    }

    public static /* synthetic */ long getNextNotifyOvumMillis$default(CurseManager curseManager, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return curseManager.getNextNotifyOvumMillis(j, i);
    }

    public static /* synthetic */ long getNextRiskNotifyMillis$default(CurseManager curseManager, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return curseManager.getNextRiskNotifyMillis(j, i);
    }

    private final Drawable getNormalSelectedDrawable(boolean selected) {
        if (selected) {
            return ni4.e(ApplicationExtKt.getApplication(), pni.F);
        }
        return null;
    }

    private final int getOvumIndex() {
        return this.ovumIndex;
    }

    private final int getProtoDayType(boolean isOvum, boolean isRisk, boolean isIn) {
        if (isIn) {
            return 1;
        }
        if (isOvum) {
            return 2;
        }
        return isRisk ? 3 : 0;
    }

    private final Pair<Long, Integer> getProtoNextTag(long mills) {
        if (getRiskRange(TimeDateUtil.timestampToLocalDateInner(mills)).isEmpty()) {
            return new Pair<>(Long.valueOf(getNextInMillis(mills)), 1);
        }
        LocalDate localDatePlusDays = getCalInternalStart(new LocalDate(CurseExtKt.getZeroMills(mills))).plusDays(this.riskRange.getFirst() - 1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long mills2 = ExtUtilKt.getMills(localDatePlusDays);
        return mills < mills2 ? new Pair<>(Long.valueOf(mills2), 3) : new Pair<>(Long.valueOf(getNextInMillis(mills)), 1);
    }

    private final jv9 getProtoTotalRecord() {
        Logger.i("CurseManager", "getProtoTotalRecord.. start");
        jv9 jv9VarBuildCommonWomenHealthConfig = buildCommonWomenHealthConfig(false);
        jv9.a.C0984a c0984a = new jv9.a.C0984a();
        long todayZeroMills = CurseExtKt.getTodayZeroMills();
        Record record = (Record) CollectionsKt___CollectionsKt.firstOrNull((List) FitnessDataExtKt.getCurseApi().getLatestRecord(0L, 1));
        Logger.i("CurseManager", "getProtoTotalRecord: latest = " + record);
        CurseSetting curseSetting = this.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        if (curseSetting.isPredictEnable()) {
            Triple<Long, Long, jv9.a[]> tripleBuildPredictOnData = buildPredictOnData(todayZeroMills);
            c0984a.c = (int) (tripleBuildPredictOnData.getFirst().longValue() / 1000);
            c0984a.e = tripleBuildPredictOnData.getThird();
            Pair<Long, Integer> protoNextTag = getProtoNextTag(tripleBuildPredictOnData.getSecond().longValue());
            Logger.i("CurseManager", "getProtoTotalRecord: nextTag = " + protoNextTag);
            c0984a.h = (int) (protoNextTag.getFirst().longValue() / 1000);
            c0984a.i = protoNextTag.getSecond().intValue();
        } else {
            Pair<Long, jv9.a[]> pairBuildPredictOffData = buildPredictOffData(record, todayZeroMills);
            c0984a.c = (int) (pairBuildPredictOffData.getFirst().longValue() / 1000);
            c0984a.e = pairBuildPredictOffData.getSecond();
        }
        c0984a.g = record != null ? CurseRecordKt.getInDays(record) : 0;
        c0984a.f = (int) ((record != null ? record.getStartMills() : 0L) / 1000);
        Calendar calendar = Calendar.getInstance();
        v64 v64Var = new v64();
        int i = (((calendar.get(15) + calendar.get(16)) / 1000) / 60) / 15;
        v64Var.c = i;
        Logger.i("CurseManager", "getProtoTotalRecord timeStamp:" + c0984a.c + "-offset:" + i + ";ZONE_OFFSET:" + calendar.get(15) + " DST_OFFSET:" + calendar.get(16) + " ");
        c0984a.d = v64Var;
        jv9VarBuildCommonWomenHealthConfig.f = c0984a;
        StringBuilder sb = new StringBuilder();
        sb.append("getProtoTotalRecord result:");
        sb.append(jv9VarBuildCommonWomenHealthConfig);
        Logger.i("CurseManager", sb.toString());
        return jv9VarBuildCommonWomenHealthConfig;
    }

    private final IntRange getRiskRange() {
        return this.riskRange;
    }

    private final String getTodayWidgetProviderDesc() {
        if (this.setting == null) {
            return ResourceExtKt.getString(c0j.B6);
        }
        long zeroMills = CurseExtKt.getZeroMills(System.currentTimeMillis());
        long j = this.latestStart;
        boolean z = false;
        if (zeroMills <= getLatestInEnd() && j <= zeroMills) {
            z = true;
        }
        CurseSetting curseSetting = this.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        if (!curseSetting.isPredictEnable() || (isAlgoPredictEnable() && this.algoCurseManager.isAlgoNoData())) {
            if (!z) {
                return ResourceExtKt.getString(c0j.B6);
            }
            int i = this.latestInDays;
            int intervalDay = TimeDateUtil.getIntervalDay(this.latestStart, zeroMills) + 1;
            if (intervalDay == 0 || i == 0) {
                return ResourceExtKt.getString(c0j.B6);
            }
            String quantityString = this.resource.getQuantityString(qxi.S, intervalDay, Integer.valueOf(intervalDay));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            return quantityString;
        }
        LocalDate localDate = new LocalDate(zeroMills);
        int interval = getInterval(localDate);
        if (interval == -1) {
            return ResourceExtKt.getString(c0j.B6);
        }
        int inDays = isLatestPeriod(zeroMills) ? this.latestInDays : getInDays(localDate);
        LocalDate intervalStart = getIntervalStart(localDate);
        int intervalDay2 = TimeDateUtil.getIntervalDay(intervalStart, localDate) + 1;
        boolean zIsIn = isIn(localDate);
        Logger.d("CurseManager", "getTodayWidgetProviderDesc: date = " + localDate + "; interval = " + interval + "; inDays = " + inDays + "; start = " + intervalStart + "; isIn = " + zIsIn + "; dayIndex = " + intervalDay2);
        if (zIsIn) {
            if (!z) {
                return this.resource.getQuantityString(qxi.R, intervalDay2, Integer.valueOf(intervalDay2));
            }
            int intervalDay3 = TimeDateUtil.getIntervalDay(this.latestStart, zeroMills) + 1;
            return this.resource.getQuantityString(qxi.S, intervalDay3, Integer.valueOf(intervalDay3));
        }
        IntRange riskRange = getRiskRange(localDate);
        if (intervalDay2 > inDays && intervalDay2 < riskRange.getFirst()) {
            int first = riskRange.getFirst() - intervalDay2;
            return this.resource.getQuantityString(qxi.P, first, Integer.valueOf(first));
        }
        int intervalDay4 = TimeDateUtil.getIntervalDay(intervalStart, new LocalDate(getLatestInEnd()));
        int i2 = intervalDay4 + 1;
        long j2 = this.latestStart + 1;
        if (zeroMills <= this.latestEnd && j2 <= zeroMills && riskRange.getFirst() <= i2) {
            riskRange = new IntRange(intervalDay4 + 2, riskRange.getLast());
        }
        int ovumIndex = getOvumIndex();
        int i3 = (interval - intervalDay2) + 1;
        int first2 = (intervalDay2 - riskRange.getFirst()) + 1;
        if (intervalDay2 == ovumIndex) {
            return ResourceExtKt.getString(c0j.g6);
        }
        int first3 = riskRange.getFirst();
        if (intervalDay2 > riskRange.getLast() || first3 > intervalDay2) {
            String quantityString2 = this.resource.getQuantityString(qxi.Q, i3, Integer.valueOf(i3));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            return quantityString2;
        }
        String quantityString3 = this.resource.getQuantityString(qxi.T, first2, Integer.valueOf(first2));
        Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
        return quantityString3;
    }

    private final int getWomenHealthInitTimeSecond() {
        CurseSetting curseSetting = this.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        long lastMenstrualTime = curseSetting.getLastMenstrualTime();
        long j = this.latestStart;
        int iChangeToDestZeroTimeOneDay = (int) FitnessDateUtils.changeToDestZeroTimeOneDay(((j <= 0 || lastMenstrualTime == j) ? lastMenstrualTime : j) / 1000, FitnessDateUtils.getCurrentTZOffsetInSec(), 0);
        Logger.i("CurseManager", "getWomenHealthInitTimeSecond setting: " + lastMenstrualTime + ";latestMillis " + j + ";toDevice " + iChangeToDestZeroTimeOneDay);
        return iChangeToDestZeroTimeOneDay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initData$lambda$0(WearableProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<String> features = it.getFeatures();
        if (features != null) {
            return features.contains(Feature.MENSTRUATION_INTELLIGENT_PREDICT);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$3(CurseManager this$0) {
        String did;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && (did = wearableDeviceModel.getDid()) != null) {
            this$0.syncCurse(did);
        }
        Iterator<T> it = this$0.dataObserver.iterator();
        while (it.hasNext()) {
            ((OnConfigChange) it.next()).onDataChange();
        }
    }

    private final int initInDays() {
        int calcValue;
        if (this.recordsLatestEnded.size() < 3) {
            CurseSetting curseSetting = this.setting;
            if (curseSetting == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting = null;
            }
            calcValue = curseSetting.getEstimatedMenstrualDays();
        } else {
            calcValue = getCalcValue(CurseRecordKt.getInDays(this.recordsLatestEnded.get(0)), CurseRecordKt.getInDays(this.recordsLatestEnded.get(1)), CurseRecordKt.getInDays(this.recordsLatestEnded.get(2)));
        }
        this.inDays = calcValue;
        Logger.i("CurseManager", "initInDays: inDays = " + calcValue);
        return this.inDays;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x01a3  */
    private final void initInterval() {
        int calcValue;
        CurseSetting curseSetting;
        boolean z;
        CurseSetting curseSetting2;
        String str = "; latestEnd = ";
        String str2 = "; latestInEnd = ";
        if (this.recordsLatest.isEmpty()) {
            CurseSetting curseSetting3 = this.setting;
            if (curseSetting3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting3 = null;
            }
            this.interval = curseSetting3.getMenstrualCycle();
            Record record = this.recordLatestItem;
            if (record != null) {
                Intrinsics.checkNotNull(record);
                this.latestStart = record.getStartMills();
                Record record2 = this.recordLatestItem;
                Intrinsics.checkNotNull(record2);
                long endMills = record2.getEndMills();
                this.latestInEnd = endMills;
                long j = this.latestStart;
                this.latestEnd = (((long) (this.interval - 1)) * 86400000) + j;
                this.latestInDays = TimeDateUtil.getIntervalDay(j, endMills) + 1;
            } else {
                CurseSetting curseSetting4 = this.setting;
                if (curseSetting4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("setting");
                    curseSetting2 = null;
                } else {
                    curseSetting2 = curseSetting4;
                }
                this.latestStart = CurseExtKt.getZeroMills(curseSetting2.getLastMenstrualTime());
                this.latestInEnd = 0L;
                this.latestEnd = 0L;
                this.latestInDays = 0;
            }
            Logger.i("CurseManager", "initInterval: interval = " + this.interval + "; latestStart = " + this.latestStart + "; latestInEnd = " + this.latestInEnd + "; latestEnd = " + this.latestEnd);
            return;
        }
        if (this.recordsLatest.size() < 4) {
            CurseSetting curseSetting5 = this.setting;
            if (curseSetting5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting5 = null;
            }
            calcValue = curseSetting5.getMenstrualCycle();
        } else {
            calcValue = getCalcValue(TimeDateUtil.getIntervalDay(this.recordsLatest.get(1).getStartMills(), this.recordsLatest.get(0).getStartMills()), TimeDateUtil.getIntervalDay(this.recordsLatest.get(2).getStartMills(), this.recordsLatest.get(1).getStartMills()), TimeDateUtil.getIntervalDay(this.recordsLatest.get(3).getStartMills(), this.recordsLatest.get(2).getStartMills()));
        }
        this.interval = calcValue;
        Record record3 = (Record) CollectionsKt___CollectionsKt.first((List) this.recordsLatest);
        this.latestStart = record3.getStartMills();
        long endMills2 = record3.getEndMills();
        this.latestInEnd = endMills2;
        int intervalDay = TimeDateUtil.getIntervalDay(this.latestStart, endMills2) + 1;
        Intrinsics.checkNotNull(record3);
        if (CurseRecordKt.isEnd(record3)) {
            str = "; latestEnd = ";
            str2 = "; latestInEnd = ";
        } else {
            Record recordCopy = CurseRecordKt.copy(record3);
            CurseSetting curseSetting6 = this.setting;
            if (curseSetting6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting6 = null;
            }
            if (curseSetting6.isPredictEnable()) {
                int i = this.inDays;
                if (intervalDay != i) {
                    record3.setEndMills(this.latestStart + (((long) (i - 1)) * 86400000));
                } else {
                    z = false;
                }
                if (!z && ApplicationExtKt.isMainProcess(ApplicationExtKt.getApplication())) {
                    this.ignore.set(true);
                    FitnessDataExtKt.getCurseApi().updateRecord(recordCopy, record3, CurseExtKt.genSymptomKeys(record3.getEndMills() + 86400000, recordCopy.getEndMills()));
                    FitnessDataExtKt.getCurseApi().updateLastModify(System.currentTimeMillis() / ((long) 1000));
                    this.latestInEnd = record3.getEndMills();
                }
                Logger.i("CurseManager", "initInterval: latest update = " + z);
            } else {
                record3.setEndMills(CurseExtKt.getTodayZeroMills());
            }
            z = true;
            if (!z) {
            }
            Logger.i("CurseManager", "initInterval: latest update = " + z);
        }
        long j2 = this.latestStart;
        this.latestEnd = (((long) (this.interval - 1)) * 86400000) + j2;
        this.latestInDays = TimeDateUtil.getIntervalDay(j2, this.latestInEnd) + 1;
        if (this.interval <= 0) {
            CurseSetting curseSetting7 = this.setting;
            if (curseSetting7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting = null;
            } else {
                curseSetting = curseSetting7;
            }
            this.interval = curseSetting.getMenstrualCycle();
        }
        Logger.i("CurseManager", "initInterval: interval = " + this.interval + "; latestStart = " + this.latestStart + str2 + this.latestInEnd + str + this.latestEnd);
    }

    private final int initOvumIndex() {
        int i;
        int interval = getInterval();
        if (interval >= 60 || interval < 12) {
            i = -1;
        } else {
            i = (12 > interval || interval >= 20) ? interval - 13 : 6;
        }
        this.ovumIndex = i;
        Logger.i("CurseManager", "initOvumIndex:  " + i);
        return this.ovumIndex;
    }

    private final IntRange initRiskRange() {
        int ovumIndex = getOvumIndex();
        IntRange empty = ovumIndex <= 0 ? IntRange.Companion.getEMPTY() : new IntRange(ovumIndex - 5, ovumIndex + 4);
        this.riskRange = empty;
        Logger.i("CurseManager", "initRiskRange: " + empty);
        return this.riskRange;
    }

    private final void initSetting() {
        clear();
        readSetting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CurseManager instance_delegate$lambda$37() {
        return new CurseManager();
    }

    private final boolean isBetween(LocalDate date, LocalDate start, LocalDate end) {
        return date.isEqual(start) || date.isEqual(end) || (date.isAfter(start) && date.isBefore(end));
    }

    private final boolean isDeviceSupportPredict(WearableDeviceModel device) {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        int deviceCapability = DeviceManagerExtKt.getInstance(companion).getDeviceCapability(device.getDid());
        int deviceCapabilityV2 = DeviceManagerExtKt.getInstance(companion).getDeviceCapabilityV2(device.getDid());
        boolean z = (deviceCapability & 256) == 256;
        this.hasIntelligentPredictionCapability = (deviceCapabilityV2 & 65536) == 65536;
        Logger.i("CurseManager", "isDeviceSupportPredict capability " + deviceCapability + ";result " + z + "，capabilityV2:" + deviceCapabilityV2 + " intelligentCapability: " + this.hasIntelligentPredictionCapability);
        return z;
    }

    private final boolean isIn(LocalDate date) {
        Logger.d("CurseManager", "curseManager: " + this + ", proxy: " + this.algoCurseManager);
        if (isAlgoPredictEnable()) {
            return this.algoCurseManager.isIn(date);
        }
        long zeroMills = CurseExtKt.getZeroMills(ExtUtilKt.getMills(date));
        Logger.d("CurseManager", "isIn: date = " + date + "; date getmills = " + ExtUtilKt.getMills(date) + "; latestart = " + this.latestStart + "; latestend = " + this.latestEnd);
        long j = this.latestStart + 1;
        if (zeroMills <= this.latestEnd && j <= zeroMills) {
            return zeroMills <= getLatestInEnd();
        }
        LocalDate intervalStart = getIntervalStart(date);
        int inDays = getInDays();
        if (intervalStart == null) {
            return false;
        }
        LocalDate localDatePlusDays = intervalStart.plusDays(inDays - 1);
        Intrinsics.checkNotNull(localDatePlusDays);
        boolean zIsBetween = isBetween(date, intervalStart, localDatePlusDays);
        Logger.d("CurseManager", "isIn: date = " + date + "; start = " + intervalStart + "; inDays = " + inDays + "; isIn = " + zIsBetween + "; inEnd = " + localDatePlusDays);
        return zIsBetween;
    }

    private final boolean isLatestPeriod(long mills) {
        return mills <= this.latestEnd && this.latestStart <= mills;
    }

    private final boolean isPredict(long date) {
        return date >= this.latestStart;
    }

    private final boolean isRisk(LocalDate date) {
        LocalDate intervalStart = getIntervalStart(date);
        if (intervalStart == null) {
            return false;
        }
        IntRange riskRange = getRiskRange(date);
        if (riskRange.isEmpty()) {
            return false;
        }
        LocalDate localDatePlusDays = intervalStart.plusDays(riskRange.getFirst() - 1);
        LocalDate localDatePlusDays2 = intervalStart.plusDays(riskRange.getLast() - 1);
        Intrinsics.checkNotNull(localDatePlusDays);
        Intrinsics.checkNotNull(localDatePlusDays2);
        boolean zIsBetween = isBetween(date, localDatePlusDays, localDatePlusDays2);
        Logger.d("CurseManager", "isRisk: " + zIsBetween);
        return zIsBetween;
    }

    private final void observerDataReady() {
        IntentFilter intentFilter = new IntentFilter(CurseApiKt.ACTION_CURSE_INIT);
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.health.curse.CurseManager$observerDataReady$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Logger.i("CurseObserver", "onReceive " + intent);
                this.this$0.tryObserverData();
            }
        };
        if (Build.VERSION.SDK_INT >= 33) {
            AppUtil.getApp().registerReceiver(broadcastReceiver, intentFilter, 2);
        } else {
            AppUtil.getApp().registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    private final void syncConfig(WearableDeviceModel device, boolean dbHasData, boolean deviceHasData) {
        MenstruationTotalRecord deviceSet;
        CurseSetting curseSetting = this.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        Logger.i("CurseManager", "syncConfig: dbHasData = " + dbHasData + "; deviceHasData = " + deviceHasData + "; config = " + curseSetting);
        CurseDeviceSyncExtKt.curseSetPredict(device, curseSetting.isPredictEnable());
        CurseDeviceSyncExtKt.curseNotifyEnable(device, curseSetting.isHardwarePush(), curseSetting.getHardwareBeforeMenstruationPush(), curseSetting.getHardwareBeforeOvulationPush(), curseSetting.getHardwareBeforePregnancyPush());
        if (curseSetting.isFirst()) {
            deviceSet = CurseExtKt.getFirstDeviceSet(curseSetting);
        } else if (dbHasData || deviceHasData) {
            deviceSet = CurseExtKt.getDeviceSet((byte) curseSetting.getEstimatedMenstrualDays(), (byte) curseSetting.getMenstrualCycle());
        } else {
            int estimatedMenstrualDays = curseSetting.getEstimatedMenstrualDays();
            ArrayList<MenstruationRecord> arrayListGenNoRecord = CurseExtKt.genNoRecord(CurseExtKt.getZeroMills(curseSetting.getLastMenstrualTime()), estimatedMenstrualDays, System.currentTimeMillis());
            deviceSet = new MenstruationTotalRecord((byte) 1, (byte) curseSetting.getMenstrualCycle(), (byte) estimatedMenstrualDays, 0L, 0L, arrayListGenNoRecord.get(0).getCalendar().getTimeInMillis() / ((long) 1000), arrayListGenNoRecord.size(), arrayListGenNoRecord);
        }
        CurseDeviceSyncExtKt.curseSetTotalRecord(device, CurseMixedRecordKt.genHuaMiRecord(deviceSet));
        Logger.i("CurseManager", "syncConfig: totalRecord ret = " + deviceSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncDataAndSet(String did) {
        if (getSetting() == null) {
            Logger.w("CurseManager", "syncDataAndSet failed:settings is null");
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel == null) {
            Logger.e("CurseManager", "syncDataAndSet: device null did = " + did);
            return;
        }
        if (!CurseDeviceSyncExtKt.isSupportCurse(wearableDeviceModel)) {
            Logger.e("CurseManager", "syncDataAndSet: not support curse");
            this.hasIntelligentPredictionCapability = false;
            return;
        }
        Logger.i("CurseManager", "syncDataAndSet");
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            syncHuamiData(wearableDeviceModel);
        } else if (isDeviceSupportPredict(wearableDeviceModel)) {
            syncProtoRecordForDeviceSupportPredict(wearableDeviceModel);
        } else {
            syncProtoTotalRecord(wearableDeviceModel);
        }
    }

    private final void syncHuamiData(WearableDeviceModel device) {
        CurseSetting curseSetting;
        long j;
        Logger.i("CurseManager", "syncDataAndSet syncHuamiData");
        CurseSetting curseSetting2 = this.setting;
        if (curseSetting2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        } else {
            curseSetting = curseSetting2;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<Record> period = FitnessDataExtKt.getCurseApi().getPeriod(jCurrentTimeMillis - CurseExtKt.MAX_DEVICE_MILLS, jCurrentTimeMillis);
        boolean z = !period.isEmpty();
        MenstruationTotalRecord huamiCurseTotalRecord = getHuamiCurseTotalRecord(device);
        List<MenstruationRecord> records = huamiCurseTotalRecord != null ? huamiCurseTotalRecord.getRecords() : null;
        List<MenstruationRecord> list = records;
        boolean z2 = !(list == null || list.isEmpty());
        syncConfig(device, z, z2);
        boolean zIsL66 = DeviceModelExtKt.isL66(device);
        Logger.i("CurseManager", "syncHuamiData: dbHasData = " + z + "; deviceHasData = " + z2 + ", l66 = " + zIsL66);
        long j2 = 1000;
        long jZoneOffsetSec = zIsL66 ? 0 : CurseExtKt.zoneOffsetSec();
        long jCurrentTimeMillis2 = (System.currentTimeMillis() / j2) + jZoneOffsetSec;
        long lastModifySec = FitnessDataExtKt.getCurseApi().getLastModifySec() + jZoneOffsetSec;
        if (!z && !z2) {
            Logger.i("CurseManager", "syncHuamiData: no data two sides");
            return;
        }
        if (z && !z2) {
            ArrayList<MenstruationRecord> menstruationRecords = CurseExtKt.toMenstruationRecords(period, lastModifySec);
            Record record = (Record) CollectionsKt___CollectionsKt.last((List) period);
            MenstruationTotalRecord deviceData = CurseExtKt.getDeviceData(curseSetting, menstruationRecords, record.getStartMills(), record.getEndMills());
            CurseDeviceSyncExtKt.curseSetTotalRecord(device, CurseMixedRecordKt.genHuaMiRecord(deviceData));
            Logger.i("CurseManager", "syncHuamiData: totalRecord = " + deviceData + "; ret = " + Unit.INSTANCE);
            return;
        }
        Intrinsics.checkNotNull(records);
        Iterator<T> it = records.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        long modifyTimeStamp = ((MenstruationRecord) it.next()).getModifyTimeStamp();
        loop0: while (true) {
            j = modifyTimeStamp;
            do {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    modifyTimeStamp = ((MenstruationRecord) it.next()).getModifyTimeStamp();
                }
            } while (j >= modifyTimeStamp);
        }
        boolean z3 = lastModifySec > jCurrentTimeMillis2 || j > jCurrentTimeMillis2;
        StringBuilder sb = new StringBuilder();
        List<MenstruationRecord> list2 = records;
        sb.append("syncHuamiData: dbtime = ");
        sb.append(lastModifySec);
        sb.append("; devicetime=");
        sb.append(j);
        sb.append("; overflow = ");
        sb.append(z3);
        sb.append(";");
        Logger.i("CurseManager", sb.toString());
        if (lastModifySec != j || z3) {
            if (z3) {
                FitnessDataExtKt.getCurseApi().updateLastModify(jCurrentTimeMillis2 - jZoneOffsetSec);
                if (!z) {
                    CurseDeviceSyncExtKt.curseSetTotalRecord(device, CurseMixedRecordKt.genHuaMiRecord(CurseExtKt.genClearTotalRecord(curseSetting, lastModifySec * j2, list2)));
                    Logger.i("CurseManager", "syncHuamiData: modifyOverflow db no data ");
                    return;
                }
                List<MenstruationRecord> listGenDeviceList = CurseExtKt.genDeviceList(list2, period, jCurrentTimeMillis2 * j2);
                Record record2 = (Record) CollectionsKt___CollectionsKt.last((List) period);
                MenstruationTotalRecord deviceData2 = CurseExtKt.getDeviceData(curseSetting, listGenDeviceList, record2.getStartMills(), record2.getEndMills());
                CurseDeviceSyncExtKt.curseSetTotalRecord(device, CurseMixedRecordKt.genHuaMiRecord(deviceData2));
                Logger.i("CurseManager", "syncHuamiData: modifyOverflow db has data " + deviceData2);
                return;
            }
            if (j <= lastModifySec) {
                if (!z && z2) {
                    CurseDeviceSyncExtKt.curseSetTotalRecord(device, CurseMixedRecordKt.genHuaMiRecord(CurseExtKt.genClearTotalRecord(curseSetting, lastModifySec * j2, list2)));
                    Logger.i("CurseManager", "!dbHasData && deviceHasData modify>device modify");
                    return;
                }
                List<MenstruationRecord> listGenDeviceList2 = CurseExtKt.genDeviceList(list2, period, lastModifySec * j2);
                Record record3 = (Record) CollectionsKt___CollectionsKt.last((List) period);
                MenstruationTotalRecord deviceData3 = CurseExtKt.getDeviceData(curseSetting, listGenDeviceList2, record3.getStartMills(), record3.getEndMills());
                Logger.i("CurseManager", "syncHuamiData: both has data and db modify>device modify " + deviceData3);
                CurseDeviceSyncExtKt.curseSetTotalRecord(device, CurseMixedRecordKt.genHuaMiRecord(deviceData3));
                return;
            }
            FitnessDataExtKt.getCurseApi().updateLastModify(j - jZoneOffsetSec);
            List<Record> period2 = CurseExtKt.toPeriod(huamiCurseTotalRecord);
            ArrayList<Record> arrayList = new ArrayList();
            for (Object obj : period2) {
                if (((Record) obj).getModifySec() > lastModifySec) {
                    arrayList.add(obj);
                }
            }
            Logger.i("CurseManager", "syncHuamiData: device priority: " + arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Record record4 : arrayList) {
                long zeroMills = CurseExtKt.getZeroMills(record4.getStartMills()) - CurseRecordKt.SPACE_MIN_MILLS;
                long zeroMills2 = CurseExtKt.getZeroMills(record4.getEndMills()) + CurseRecordKt.SPACE_MIN_MILLS;
                Logger.i("CurseManager", "syncHuamiData: device start = " + new LocalDate(zeroMills) + "; end = " + new LocalDate(zeroMills2));
                arrayList2.addAll(FitnessDataExtKt.getCurseApi().getPeriod(zeroMills, zeroMills2));
            }
            CurseApi.DefaultImpls.batchActionRecord$default(FitnessDataExtKt.getCurseApi(), null, arrayList2, arrayList, null, CurseRecordKt.toDeleteKey(arrayList2), 9, null);
        }
    }

    private final void syncProtoRecordForDeviceSupportPredict(final WearableDeviceModel device) {
        Logger.i("CurseManager", "syncProtoRecordForDeviceSupportPredict :" + device.getDid());
        if (getSetting() == null) {
            Logger.i("CurseManager", "syncProtoRecordForDeviceSupportPredict: setting null");
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 20;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.health.curse.CurseManager.syncProtoRecordForDeviceSupportPredict.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("CurseManager", "get women health from ble onError " + code + ";did " + did + ";type " + type);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                List listEmptyList;
                s7r packet;
                ur9 ur9VarU;
                jv9.c.a aVarM;
                jv9.c[] cVarArr = null;
                Logger.i("CurseManager", "get women health from ble isSuccess " + (result != null ? Boolean.valueOf(result.isSuccess()) : null));
                if (result != null && (packet = result.getPacket()) != null && (ur9VarU = packet.u()) != null && (aVarM = ur9VarU.M()) != null) {
                    cVarArr = aVarM.c;
                }
                if (cVarArr != null) {
                    listEmptyList = new ArrayList();
                    for (jv9.c cVar : cVarArr) {
                        if (cVar.e != 0) {
                            listEmptyList.add(cVar);
                        }
                    }
                } else {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                CurseManager.this.dealDeviceAndAppMergeRecord(listEmptyList, device);
            }
        }, 0, 8, null);
    }

    private final void testDeviceAppMerge(WearableDeviceModel device) {
        ArrayList arrayList = new ArrayList();
        jv9.c cVar = new jv9.c();
        cVar.c = 1667260800;
        cVar.d = 1667606400;
        cVar.e = 1667606400;
        cVar.f = false;
        ListExtKt.add(arrayList, cVar);
        jv9.c cVar2 = new jv9.c();
        cVar2.c = 1667433600;
        cVar2.d = 1667865600;
        cVar2.e = 1668821400;
        cVar2.f = true;
        ListExtKt.add(arrayList, cVar2);
        jv9.c cVar3 = new jv9.c();
        cVar3.c = 1665100800;
        cVar3.d = 1665964800;
        cVar3.e = 1665106200;
        cVar3.f = false;
        ListExtKt.add(arrayList, cVar3);
        jv9.c cVar4 = new jv9.c();
        cVar4.c = 1659312000;
        cVar4.d = 1659916800;
        cVar4.e = 1659922200;
        cVar4.f = false;
        ListExtKt.add(arrayList, cVar4);
        jv9.c cVar5 = new jv9.c();
        cVar5.c = 0;
        cVar5.d = 0;
        cVar5.e = 0;
        cVar5.f = false;
        ListExtKt.add(arrayList, cVar5);
        dealDeviceAndAppMergeRecord(arrayList, device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryObserverData() {
        Logger.i("CurseObserver", "tryObserverData: ");
        CoroutineScope coroutineScope = this.observerScope;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.observerScope = ScopeExtKt.scope(Dispatchers.getIO(), new C24181(null));
    }

    public final void addDataObserver(@NotNull OnConfigChange action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.dataObserver.contains(action)) {
            return;
        }
        this.dataObserver.add(action);
    }

    public final void clear() {
        Logger.i("CurseManager", "curseManager clear..");
        this.latestStart = 0L;
        this.latestEnd = 0L;
        this.latestInEnd = 0L;
        this.latestInDays = 0;
        this.inDays = -1;
        this.interval = -1;
        this.ovumIndex = -1;
        this.riskRange = IntRange.Companion.getEMPTY();
        this.recordsLatest.clear();
        this.recordsLatestEnded.clear();
        this.recordLatestItem = null;
    }

    @NotNull
    public final AlgoCurseManager getAlgoCurseManager() {
        return this.algoCurseManager;
    }

    public final boolean getAlgoRequesting() {
        return this.algoRequesting;
    }

    @Nullable
    public final Drawable getDayBg(@NotNull LocalDate date, boolean isManualIn, boolean selected) {
        Intrinsics.checkNotNullParameter(date, "date");
        CurseSetting curseSetting = null;
        if (this.setting == null) {
            Logger.i("CurseManager", "getDayBg: setting null");
            return null;
        }
        long mills = ExtUtilKt.getMills(date);
        boolean zIsIn = isIn(date);
        boolean zIsOvum = isOvum(date);
        Logger.d("CurseManager", "getDayBg: date = " + date + "; isManualIn = " + isManualIn + "; isIn = " + zIsIn + ";  latest = " + this.latestStart);
        boolean z = mills > CurseExtKt.getTodayZeroMills();
        CurseSetting curseSetting2 = this.setting;
        if (curseSetting2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
        } else {
            curseSetting = curseSetting2;
        }
        if (!curseSetting.isPredictEnable()) {
            return (!isManualIn || z) ? getNormalSelectedDrawable(selected) : ni4.e(ApplicationExtKt.getApplication(), pni.m);
        }
        if (isManualIn) {
            return ni4.e(ApplicationExtKt.getApplication(), z ? pni.o0 : pni.m);
        }
        if (!isPredict(mills)) {
            return getNormalSelectedDrawable(selected);
        }
        if (zIsIn) {
            return ni4.e(ApplicationExtKt.getApplication(), pni.o0);
        }
        if (zIsOvum) {
            return ni4.e(ApplicationExtKt.getApplication(), pni.p0);
        }
        return isRisk(date) ? ni4.e(ApplicationExtKt.getApplication(), pni.n0) : getNormalSelectedDrawable(selected);
    }

    public final int getDayState(@NotNull LocalDate date) {
        Object next;
        Intrinsics.checkNotNullParameter(date, "date");
        if (this.setting == null) {
            Logger.i("CurseManager", "getDayState: setting null");
            return -1;
        }
        boolean zIsIn = isIn(date);
        Iterator<T> it = this.recordsLatest.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Record) next).isInPeriod(date));
        boolean z = next != null && ExtUtilKt.getMills(date) < CurseExtKt.getTodayZeroMills() + ((long) 86400000);
        boolean zIsOvum = isOvum(date);
        if (z) {
            return 1;
        }
        if (zIsIn) {
            return 0;
        }
        if (zIsOvum) {
            return 2;
        }
        return isRisk(date) ? 3 : -1;
    }

    @NotNull
    public final String getDesc(long mills, int inIndex, int menDays) {
        CurseSetting curseSetting;
        String quantityString;
        int intervalDay = inIndex;
        int i = menDays;
        if (this.setting == null) {
            initData("curseManagerGetDesc");
        }
        if (this.setting == null) {
            return ResourceExtKt.getString(c0j.O5);
        }
        long zeroMills = CurseExtKt.getZeroMills(mills);
        Logger.i("CurseManager", "getDesc: date = " + new LocalDate(zeroMills) + "; inIndex = " + intervalDay + "; menDays = " + i + "; latestStart = " + new LocalDate(this.latestStart) + "; latestEnd = " + new LocalDate(this.latestEnd) + "; latestInEnd = " + new LocalDate(getLatestInEnd()));
        boolean z = zeroMills <= getLatestInEnd() && this.latestStart <= zeroMills;
        CurseSetting curseSetting2 = this.setting;
        if (curseSetting2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting2 = null;
        }
        if (!curseSetting2.isPredictEnable() || (isAlgoPredictEnable() && this.algoCurseManager.isAlgoNoData())) {
            if (zeroMills > CurseExtKt.getTodayZeroMills() || (intervalDay == 0 && !z)) {
                return ResourceExtKt.getString(c0j.O5);
            }
            if (z) {
                i = this.latestInDays;
                intervalDay = TimeDateUtil.getIntervalDay(this.latestStart, mills) + 1;
            }
            if (intervalDay == 0 || i == 0) {
                String string = this.resource.getString(c0j.O5);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            }
            String quantityString2 = this.resource.getQuantityString(qxi.I, intervalDay, Integer.valueOf(intervalDay));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            return quantityString2;
        }
        if (isPredict(zeroMills) && intervalDay == 0) {
            CurseSetting curseSetting3 = this.setting;
            if (curseSetting3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting3 = null;
            }
            if (curseSetting3.isPredictEnable()) {
                LocalDate localDate = new LocalDate(zeroMills);
                int interval = getInterval(localDate);
                int inDays = isLatestPeriod(zeroMills) ? this.latestInDays : getInDays(localDate);
                if (interval == -1 || inDays == -1) {
                    String string2 = this.resource.getString(c0j.O5);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    return string2;
                }
                LocalDate intervalStart = getIntervalStart(localDate);
                if (intervalStart == null) {
                    String string3 = this.resource.getString(c0j.O5);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    return string3;
                }
                int intervalDay2 = TimeDateUtil.getIntervalDay(intervalStart, localDate);
                int intervalDay3 = TimeDateUtil.getIntervalDay(intervalStart, localDate) + 1;
                boolean zIsIn = isIn(localDate);
                boolean z2 = intervalDay2 < 0;
                Logger.d("CurseManager", "getDesc: date = " + localDate + "; start = " + intervalStart + "; isIn = " + zIsIn);
                Logger.i("CurseManager", "getDesc: interval = " + interval + "; inDays = " + inDays + "; gapDays = " + intervalDay2 + "; dayIndex = " + intervalDay3 + ";");
                CurseSetting curseSetting4 = this.setting;
                if (curseSetting4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("setting");
                    curseSetting = null;
                } else {
                    curseSetting = curseSetting4;
                }
                if (!curseSetting.isPredictEnable()) {
                    String string4 = zIsIn ? this.resource.getString(c0j.P5, Integer.valueOf(intervalDay3)) : this.resource.getString(c0j.O5);
                    Intrinsics.checkNotNull(string4);
                    return string4;
                }
                if (zIsIn) {
                    if (z) {
                        int intervalDay4 = TimeDateUtil.getIntervalDay(this.latestStart, zeroMills) + 1;
                        quantityString = this.resource.getQuantityString(qxi.I, intervalDay4, Integer.valueOf(intervalDay4));
                    } else {
                        quantityString = this.resource.getQuantityString(qxi.H, intervalDay3, Integer.valueOf(intervalDay3));
                    }
                    Intrinsics.checkNotNull(quantityString);
                    return quantityString;
                }
                IntRange riskRange = getRiskRange(localDate);
                Logger.d("CurseManager", "getDesc: riskRange = " + riskRange);
                if (intervalDay3 > inDays && intervalDay3 < riskRange.getFirst()) {
                    int first = riskRange.getFirst() - intervalDay3;
                    String quantityString3 = this.resource.getQuantityString(z2 ? qxi.A : qxi.z, first, Integer.valueOf(first));
                    Intrinsics.checkNotNull(quantityString3);
                    return quantityString3;
                }
                int intervalDay5 = TimeDateUtil.getIntervalDay(intervalStart, intervalStart.plusDays(inDays - 1));
                int i2 = intervalDay5 + 1;
                if (riskRange.getFirst() <= i2) {
                    IntRange intRange = new IntRange(intervalDay5 + 2, riskRange.getLast());
                    Logger.i("CurseManager", "getDesc: new risk " + intRange);
                    riskRange = intRange;
                }
                int ovumIndex = getOvumIndex(localDate);
                int i3 = (interval - intervalDay3) + 1;
                int first2 = (intervalDay3 - riskRange.getFirst()) + 1;
                Logger.d("CurseManager", "getDesc: ovumIndex = " + ovumIndex + "; risked = " + first2 + "; nextLeft = " + i3 + ";endIndex = " + i2);
                if (intervalDay3 == ovumIndex) {
                    String string5 = z2 ? this.resource.getString(c0j.h6, Integer.valueOf(first2)) : this.resource.getString(c0j.T5);
                    Intrinsics.checkNotNull(string5);
                    return string5;
                }
                if (intervalDay3 > ovumIndex) {
                    int first3 = riskRange.getFirst();
                    if (intervalDay3 <= riskRange.getLast() && first3 <= intervalDay3) {
                        return ResourceExtKt.getString(z2 ? c0j.L5 : c0j.i6, Integer.valueOf(first2));
                    }
                }
                int first4 = riskRange.getFirst();
                if (intervalDay3 <= riskRange.getLast() && first4 <= intervalDay3) {
                    return ResourceExtKt.getString(z2 ? c0j.L5 : c0j.i6, Integer.valueOf(first2));
                }
                if (intervalDay3 == riskRange.getLast()) {
                    return ResourceExtKt.getString(z2 ? c0j.K5 : c0j.J5);
                }
                String quantityString4 = this.resource.getQuantityString(z2 ? qxi.J : qxi.K, i3, Integer.valueOf(i3));
                Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
                return quantityString4;
            }
        }
        if (intervalDay == 0 || i == 0) {
            String string6 = this.resource.getString(c0j.O5);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            return string6;
        }
        String quantityString5 = this.resource.getQuantityString(qxi.I, intervalDay, Integer.valueOf(inIndex));
        Intrinsics.checkNotNullExpressionValue(quantityString5, "getQuantityString(...)");
        return quantityString5;
    }

    @Nullable
    public final WearableDeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    public final int getEntranceDayStatus(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Logger.i("CurseManager", "getEntranceDayStatus curseManager: " + this + ", proxy: " + this.algoCurseManager);
        CurseSetting curseSetting = this.setting;
        if (curseSetting == null) {
            Logger.i("CurseManager", "getEntranceDayStatus: not Initialized");
            return 0;
        }
        Object obj = null;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        if (curseSetting.getLastMenstrualTime() > 0) {
            CurseSetting curseSetting2 = this.setting;
            if (curseSetting2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting2 = null;
            }
            if (!curseSetting2.isFirst()) {
                long zeroMills = ExtUtilKt.getZeroMills(date);
                boolean z = zeroMills > CurseExtKt.getTodayZeroMills();
                CurseSetting curseSetting3 = this.setting;
                if (curseSetting3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("setting");
                    curseSetting3 = null;
                }
                if (!curseSetting3.isPredictEnable()) {
                    for (Object obj2 : this.recordsLatest) {
                        Record record = (Record) obj2;
                        long startMills = record.getStartMills();
                        if (zeroMills <= record.getEndMills() && startMills <= zeroMills) {
                            obj = obj2;
                            break;
                        }
                    }
                    return (obj == null || z) ? 0 : 1;
                }
                boolean zIsIn = isIn(date);
                Logger.i("CurseManager", "getEntranceDayStatus: data:" + date + ", isIn = " + zIsIn + "; latest = " + this.latestStart);
                if (zIsIn) {
                    return z ? 2 : 1;
                }
                if (isOvum(date)) {
                    return 4;
                }
                return isRisk(date) ? 3 : 0;
            }
        }
        CurseSetting curseSetting4 = this.setting;
        if (curseSetting4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
        } else {
            obj = curseSetting4;
        }
        Logger.i("CurseManager", "getEntranceDayStatus: " + obj);
        return 0;
    }

    public final boolean getHasIntelligentPredictionCapability() {
        return this.hasIntelligentPredictionCapability;
    }

    public final boolean getHasTempCharacterRecordHistory() {
        return this.hasTempCharacterRecordHistory;
    }

    public final int getInDays() {
        return this.inDays;
    }

    public final int getInterval() {
        return this.interval;
    }

    @Nullable
    public final Record getLatestPredictRecord() {
        CurseSetting curseSetting = null;
        if (getSetting() == null) {
            return null;
        }
        Record record = (Record) CollectionsKt___CollectionsKt.firstOrNull((List) this.recordsLatest);
        if (record != null) {
            if (record.getEndMills() > CurseExtKt.getTodayZeroMills()) {
                return record;
            }
            long startMills = record.getStartMills();
            int i = this.interval;
            long j = startMills + (((long) i) * 86400000);
            return new Record(j, j + (((long) (this.inDays - 1)) * 86400000), 0L, i, 0, 16, null);
        }
        CurseSetting curseSetting2 = this.setting;
        if (curseSetting2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting2 = null;
        }
        long zeroMills = CurseExtKt.getZeroMills(curseSetting2.getLastMenstrualTime());
        CurseSetting curseSetting3 = this.setting;
        if (curseSetting3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
        } else {
            curseSetting = curseSetting3;
        }
        return new Record(zeroMills, CurseExtKt.getZeroMills(CurseExtKt.lastMenstrualEnd(curseSetting)), 0L, this.interval, 0, 16, null);
    }

    @Nullable
    public final Record getLatestRecord() {
        return (Record) CollectionsKt___CollectionsKt.firstOrNull((List) this.recordsLatest);
    }

    @NotNull
    public final Triple<Long, Long, Long> getNextInDuration(long mills) {
        LocalDate localDate = new LocalDate(CurseExtKt.getZeroMills(mills));
        int interval = getInterval();
        LocalDate localDate2 = new LocalDate(this.latestStart);
        int intervalDay = TimeDateUtil.getIntervalDay(localDate2, localDate);
        int i = (intervalDay < 0 && intervalDay % interval != 0) ? (intervalDay / interval) - 1 : intervalDay / interval;
        LocalDate localDatePlusDays = localDate2.plusDays(i * interval);
        Logger.d("CurseManager", "getNextInDuration: date = " + localDate + "; gapDays = " + intervalDay + "; interval = " + interval + "; intervalNum = " + i + "; intervalStart = " + localDatePlusDays);
        Intrinsics.checkNotNull(localDatePlusDays);
        long zeroMills = CurseExtKt.getZeroMills(ExtUtilKt.getMills(localDatePlusDays)) + (((long) interval) * 86400000);
        return new Triple<>(Long.valueOf(zeroMills), Long.valueOf((((long) (getInDays() - 1)) * 86400000) + zeroMills), Long.valueOf((((long) (getOvumIndex() - 1)) * 86400000) + zeroMills));
    }

    public final long getNextInNotifyMillis(long mills, int beforeDays) {
        return getNextInMillis(mills) - (((long) beforeDays) * 86400000);
    }

    public final long getNextNotifyOvumMillis(long mills, int beforeDays) {
        if (isAlgoPredictEnable()) {
            return this.algoCurseManager.getNextNotifyOvumMillis(mills, beforeDays);
        }
        if (this.ovumIndex == -1) {
            return -1L;
        }
        LocalDate intervalStart = getIntervalStart(new LocalDate(CurseExtKt.getZeroMills(mills)));
        Intrinsics.checkNotNull(intervalStart);
        long j = ((long) beforeDays) * 86400000;
        long mills2 = (ExtUtilKt.getMills(intervalStart) + (((long) (this.ovumIndex - 1)) * 86400000)) - j;
        return CurseExtKt.getZeroMills(mills) <= mills2 ? mills2 : (getNextInMillis(mills) + (((long) (this.ovumIndex - 1)) * 86400000)) - j;
    }

    public final long getNextRiskNotifyMillis(long mills, int beforeDays) {
        if (isAlgoPredictEnable()) {
            return this.algoCurseManager.getNextRiskNotifyMillis(mills, beforeDays);
        }
        IntRange riskRange = getRiskRange();
        if (Intrinsics.areEqual(riskRange, IntRange.Companion.getEMPTY())) {
            return -1L;
        }
        LocalDate intervalStart = getIntervalStart(new LocalDate(CurseExtKt.getZeroMills(mills)));
        Intrinsics.checkNotNull(intervalStart);
        long mills2 = ExtUtilKt.getMills(intervalStart);
        long inDays = (((long) (getInDays() - 1)) * 86400000) + mills2;
        long first = mills2 + (((long) (riskRange.getFirst() - 1)) * 86400000);
        if (first <= inDays) {
            first = inDays + 86400000;
        }
        long j = ((long) beforeDays) * 86400000;
        long j2 = first - j;
        if (CurseExtKt.getZeroMills(mills) <= j2) {
            return j2;
        }
        long nextInMillis = getNextInMillis(mills);
        long inDays2 = (((long) (getInDays() - 1)) * 86400000) + nextInMillis;
        long first2 = nextInMillis + (((long) (riskRange.getFirst() - 1)) * 86400000);
        if (first2 <= inDays2) {
            first2 = inDays2 + 86400000;
        }
        return first2 - j;
    }

    @NotNull
    public final List<Record> getPredictRecords(long startMills, long endMills) {
        long zeroMills;
        if (getSetting() == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (isAlgoPredictEnable()) {
            return this.algoCurseManager.getPredictRecords(startMills, endMills);
        }
        if (this.interval == -1) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long zeroMills2 = CurseExtKt.getZeroMills(startMills);
        long zeroMills3 = CurseExtKt.getZeroMills(endMills);
        long jMax = Math.max(Math.min(CurseExtKt.getTodayZeroMills(), this.latestEnd), zeroMills2);
        if (jMax >= zeroMills3) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        if (this.latestEnd == 0) {
            zeroMills = this.latestStart;
        } else {
            LocalDate intervalStart = getIntervalStart(new LocalDate(jMax));
            Intrinsics.checkNotNull(intervalStart);
            zeroMills = CurseExtKt.getZeroMills(TimeExtKt.toMillis(intervalStart));
        }
        long j = zeroMills;
        long j2 = ((long) (this.inDays - 1)) * 86400000;
        long j3 = ((long) this.interval) * 86400000;
        if (j3 <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + j3 + ".");
        }
        long progressionLastElement = ProgressionUtilKt.getProgressionLastElement(j, zeroMills3, j3);
        if (j <= progressionLastElement) {
            while (true) {
                long j4 = j + j2;
                if (j4 >= zeroMills2) {
                    long j5 = this.latestStart;
                    if (j == j5) {
                        int i = this.latestInDays;
                        if (i == 0) {
                            i = this.inDays;
                        }
                        long j6 = j5 + (((long) (i - 1)) * 86400000);
                        if (j6 > CurseExtKt.getTodayZeroMills()) {
                            arrayList.add(new Record(j, j6, 0L, this.interval, 0, 16, null));
                        }
                    } else {
                        arrayList.add(new Record(j, j4, 0L, this.interval, 0, 16, null));
                    }
                }
                if (j == progressionLastElement) {
                    break;
                }
                j += j3;
            }
        }
        return arrayList;
    }

    @Nullable
    public final CurseSetting getSetting() {
        CurseSetting curseSetting = this.setting;
        if (curseSetting != null) {
            if (curseSetting != null) {
                return curseSetting;
            }
            Intrinsics.throwUninitializedPropertyAccessException("setting");
        }
        return null;
    }

    public final boolean getSupportMenstrualFeature() {
        return this.supportMenstrualFeature;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object getTempTrendData(long j, long j2, int i, @NotNull Continuation<? super List<TemperatureTrendItem>> continuation) {
        AnonymousClass1 anonymousClass1;
        CurseManager curseManager;
        List list;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass2.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            List<TemperatureTrendItem> list2 = this.tempTrendList;
            if (list2 != null) {
                Intrinsics.checkNotNull(list2);
                return list2;
            }
            ArrayList arrayList = new ArrayList();
            this.tempTrendList = arrayList;
            Intrinsics.checkNotNull(arrayList);
            FitnessDataGetter fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
            anonymousClass2.L$0 = this;
            anonymousClass2.L$1 = arrayList;
            anonymousClass2.label = 1;
            Object tempTrendData = fitnessDataExtKt.getTempTrendData(j, j2, i, anonymousClass2);
            if (tempTrendData == coroutine_suspended) {
                return coroutine_suspended;
            }
            curseManager = this;
            obj = tempTrendData;
            list = arrayList;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) anonymousClass2.L$1;
            curseManager = (CurseManager) anonymousClass2.L$0;
            ResultKt.throwOnFailure(obj);
        }
        list.addAll((Collection) obj);
        List<TemperatureTrendItem> list3 = curseManager.tempTrendList;
        Intrinsics.checkNotNull(list3);
        return list3;
    }

    @NotNull
    public final Pair<Integer, String> getTempTrendDesc(long mills) {
        LocalDate localDate;
        int interval;
        if (this.setting == null) {
            initData("curseManagerGetDesc");
        }
        if (this.setting != null && (interval = getInterval((localDate = new LocalDate(CurseExtKt.getZeroMills(mills))))) != -1) {
            LocalDate intervalStart = getIntervalStart(localDate);
            if (intervalStart == null) {
                return new Pair<>(-1, this.resource.getString(c0j.O5));
            }
            int intervalDay = TimeDateUtil.getIntervalDay(intervalStart, localDate) + 1;
            boolean zIsIn = isIn(localDate);
            int ovumIndex = getOvumIndex(localDate);
            int i = (interval - intervalDay) + 1;
            int i2 = ovumIndex - intervalDay;
            Logger.i("CurseManager", "getTempTrendDesc: interval = " + interval + "; date = " + localDate + "; start = " + intervalStart + "; isIn = " + zIsIn + " dayIndex = " + intervalDay + "; ovumIndex = " + ovumIndex + "; nextLeft = " + i + "; nextOvum = " + i2 + ";");
            if (zIsIn) {
                return new Pair<>(0, this.resource.getQuantityString(qxi.H, intervalDay, Integer.valueOf(intervalDay)));
            }
            if (intervalDay == ovumIndex) {
                return new Pair<>(0, this.resource.getString(c0j.T5));
            }
            return intervalDay < ovumIndex ? new Pair<>(0, this.resource.getQuantityString(qxi.O, i2, Integer.valueOf(i2))) : new Pair<>(0, this.resource.getQuantityString(qxi.N, i, Integer.valueOf(i)));
        }
        return new Pair<>(-1, ResourceExtKt.getString(c0j.O5));
    }

    @Nullable
    public final List<TemperatureTrendItem> getTempTrendList() {
        return this.tempTrendList;
    }

    @NotNull
    public final MenstrualWidgetSampleBrief getTodayWidgetProviderSampleBrief() {
        String quantityString;
        String string;
        String quantityString2;
        String string2;
        if (this.setting == null) {
            return new MenstrualWidgetSampleBrief(ResourceExtKt.getString(c0j.h7), ResourceExtKt.getString(c0j.O5));
        }
        getAlgoCurseData4Widget();
        long zeroMills = CurseExtKt.getZeroMills(System.currentTimeMillis());
        long j = this.latestStart;
        boolean z = false;
        if (zeroMills <= getLatestInEnd() && j <= zeroMills) {
            z = true;
        }
        CurseSetting curseSetting = this.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        if (!curseSetting.isPredictEnable() || (isAlgoPredictEnable() && this.algoCurseManager.isAlgoNoData())) {
            if (!z) {
                return new MenstrualWidgetSampleBrief(ResourceExtKt.getString(c0j.h7), ResourceExtKt.getString(c0j.B6));
            }
            int i = this.latestInDays;
            int intervalDay = TimeDateUtil.getIntervalDay(this.latestStart, zeroMills) + 1;
            return (intervalDay == 0 || i == 0) ? new MenstrualWidgetSampleBrief(ResourceExtKt.getString(c0j.h7), ResourceExtKt.getString(c0j.B6)) : new MenstrualWidgetSampleBrief(this.resource.getQuantityString(qxi.C, intervalDay, Integer.valueOf(intervalDay)), this.resource.getString(c0j.z5));
        }
        LocalDate localDate = new LocalDate(zeroMills);
        int interval = getInterval(localDate);
        if (interval == -1) {
            return new MenstrualWidgetSampleBrief(ResourceExtKt.getString(c0j.h7), ResourceExtKt.getString(c0j.O5));
        }
        int inDays = isLatestPeriod(zeroMills) ? this.latestInDays : getInDays(localDate);
        LocalDate intervalStart = getIntervalStart(localDate);
        int intervalDay2 = TimeDateUtil.getIntervalDay(intervalStart, localDate) + 1;
        boolean zIsIn = isIn(localDate);
        Logger.d("CurseManager", "getTodayWidgetProviderEntryList: date = " + localDate + "; interval = " + interval + "; inDays = " + inDays + "; start = " + intervalStart + "; isIn = " + zIsIn + "; dayIndex = " + intervalDay2);
        if (zIsIn) {
            if (z) {
                int intervalDay3 = TimeDateUtil.getIntervalDay(this.latestStart, zeroMills) + 1;
                quantityString2 = this.resource.getQuantityString(qxi.C, intervalDay3, Integer.valueOf(intervalDay3));
                string2 = this.resource.getString(c0j.z5);
            } else {
                quantityString2 = this.resource.getQuantityString(qxi.C, intervalDay2, Integer.valueOf(intervalDay2));
                string2 = this.resource.getString(c0j.S5);
            }
            return new MenstrualWidgetSampleBrief(quantityString2, string2);
        }
        IntRange riskRange = getRiskRange(localDate);
        if (intervalDay2 <= inDays || intervalDay2 >= riskRange.getFirst()) {
            int intervalDay4 = TimeDateUtil.getIntervalDay(intervalStart, new LocalDate(getLatestInEnd()));
            int i2 = intervalDay4 + 1;
            long j2 = this.latestStart + 1;
            if (zeroMills <= this.latestEnd && j2 <= zeroMills && riskRange.getFirst() <= i2) {
                riskRange = new IntRange(intervalDay4 + 2, riskRange.getLast());
            }
            int ovumIndex = getOvumIndex(localDate);
            int i3 = (interval - intervalDay2) + 1;
            int first = (intervalDay2 - riskRange.getFirst()) + 1;
            if (intervalDay2 == ovumIndex) {
                String string3 = ResourceExtKt.getString(c0j.g6);
                string = TimeUtils.formatDate(ResourceExtKt.getString(c0j.i), Long.valueOf(zeroMills));
                quantityString = string3;
            } else {
                int first2 = riskRange.getFirst();
                if (intervalDay2 > riskRange.getLast() || first2 > intervalDay2) {
                    quantityString = this.resource.getQuantityString(qxi.D, i3, Integer.valueOf(i3));
                    string = this.resource.getString(c0j.S5);
                } else {
                    quantityString = this.resource.getQuantityString(qxi.C, first, Integer.valueOf(first));
                    string = ResourceExtKt.getString(c0j.I5);
                }
            }
        } else {
            int first3 = riskRange.getFirst() - intervalDay2;
            quantityString = this.resource.getQuantityString(qxi.D, first3, Integer.valueOf(first3));
            string = this.resource.getString(c0j.I5);
        }
        return new MenstrualWidgetSampleBrief(quantityString, string);
    }

    @NotNull
    public final MenstrualWidgetEntryList getWidgetProviderEntryList() {
        long j = 1000;
        long beginOfToday = TimeUtils.getBeginOfToday() / j;
        long seconds = TimeUnit.DAYS.toSeconds(1L);
        long j2 = beginOfToday - (((long) 3) * seconds);
        long j3 = j2 + (((long) 6) * seconds);
        getAlgoCurseData4Widget();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            long j4 = j2 + (((long) i) * seconds);
            LocalDate localDate = new LocalDate(j4 * j);
            CurseEntry curseEntry = new CurseEntry(i, 1.0f, j4, 3, getEntranceDayStatus(localDate));
            curseEntry.localDate = localDate;
            arrayList.add(curseEntry);
        }
        return new MenstrualWidgetEntryList(getTodayWidgetProviderDesc(), j2, j3, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final synchronized CurseManager initData(@NotNull String origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Logger.i("CurseManager", "initData " + origin);
        initSetting();
        if (getSetting() == null) {
            Logger.i("CurseManager", "initData: setting null");
            return this;
        }
        calculateData();
        boolean z = ((WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: m85
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(CurseManager.initData$lambda$0((WearableProduct) obj));
            }
        })) != null;
        this.supportMenstrualFeature = z;
        Logger.i("CurseManager", "initData supportMenstrualFeature:" + z + ",hasIntelligentPredictionCapability:" + this.hasIntelligentPredictionCapability);
        if (!"widget".equals(origin)) {
            ScopeExtKt.scope(Dispatchers.getIO(), new C24151(null));
        }
        if (ApplicationExtKt.isMainProcess(ApplicationExtKt.getApplication())) {
            CurseNotify.setNotify$default(new CurseNotify(), false, 1, null);
            this.handler.post(new Runnable() { // from class: n85
                @Override // java.lang.Runnable
                public final void run() {
                    CurseManager.initData$lambda$3(this.f27643a);
                }
            });
        }
        return this;
    }

    public final boolean isAlgoPredictEnable() {
        CurseSetting curseSetting = this.setting;
        if (curseSetting == null) {
            return false;
        }
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        return curseSetting.isAlgoPredictEnable() && supportMenstrualPredict();
    }

    public final boolean isAlgoPredictOff() {
        CurseSetting curseSetting = this.setting;
        if (curseSetting == null) {
            return false;
        }
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        return !curseSetting.isAlgoPredictEnable() && supportMenstrualPredict();
    }

    public final boolean isInStart(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        long zeroMills = CurseExtKt.getZeroMills(ExtUtilKt.getMills(date));
        long j = this.latestStart + 1;
        if (zeroMills <= this.latestEnd && j <= zeroMills) {
            return zeroMills <= getLatestInEnd();
        }
        LocalDate intervalStart = getIntervalStart(date);
        if (intervalStart == null) {
            return false;
        }
        return date.isEqual(intervalStart);
    }

    public final boolean isLatestIn(long mills) {
        return mills <= getLatestInEnd() && this.latestStart <= mills;
    }

    public final boolean isNormalDay(@NotNull LocalDate date, boolean isManualIn) {
        Intrinsics.checkNotNullParameter(date, "date");
        long mills = ExtUtilKt.getMills(date);
        boolean zIsIn = isIn(date);
        boolean zIsOvum = isOvum(date);
        boolean z = mills > CurseExtKt.getTodayZeroMills();
        CurseSetting curseSetting = this.setting;
        if (curseSetting == null) {
            Logger.e("CurseManager", "isNormalDay " + date + " error:setting has not initialized!");
        } else {
            if (curseSetting == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting = null;
            }
            if (curseSetting.isPredictEnable() || (isManualIn && !z)) {
                if (isManualIn || zIsIn || zIsOvum || isRisk(date)) {
                    return false;
                }
                isPredict(mills);
            }
        }
        return true;
    }

    public final boolean isOvum(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate intervalStart = getIntervalStart(date);
        if (intervalStart == null) {
            return false;
        }
        boolean zIsEqual = date.isEqual(intervalStart.plusDays((isAlgoPredictEnable() ? this.algoCurseManager.getOvumIndex(date) : getOvumIndex()) - 1));
        Logger.d("CurseManager", "isOvum: " + zIsEqual);
        return zIsEqual;
    }

    public final boolean isRiskStart(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate intervalStart = getIntervalStart(date);
        if (intervalStart == null) {
            return false;
        }
        IntRange riskRange = getRiskRange(date);
        if (riskRange.isEmpty()) {
            return false;
        }
        return date.isEqual(intervalStart.plusDays(riskRange.getFirst() - 1));
    }

    @Nullable
    public final CurseSetting readSetting() {
        SettingItemEntity settingItemValue = this.settingManager.readSettingItemValue("xiaomiwear_app", "curse");
        if (settingItemValue == null) {
            Logger.i("CurseManager", "initSetting: null");
            return null;
        }
        Object objValueToObject = settingItemValue.valueToObject(CurseSetting.class);
        Intrinsics.checkNotNull(objValueToObject, "null cannot be cast to non-null type com.xiaomi.fitness.settingitem.settingitem.CurseSetting");
        CurseSetting curseSetting = (CurseSetting) objValueToObject;
        this.setting = curseSetting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        Logger.i("CurseManager", "initSetting: setting = " + curseSetting);
        CurseSetting curseSetting2 = this.setting;
        if (curseSetting2 != null) {
            return curseSetting2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("setting");
        return null;
    }

    public final void refreshDeviceSupportAlgoPredict(@Nullable String did) {
        if (did == null) {
            this.hasIntelligentPredictionCapability = false;
        } else {
            this.hasIntelligentPredictionCapability = (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapabilityV2(did) & 65536) == 65536;
        }
    }

    public final void removeObserver(@NotNull OnConfigChange action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.dataObserver.remove(action);
    }

    public final void setAlgoCurseManager(@NotNull AlgoCurseManager algoCurseManager) {
        Intrinsics.checkNotNullParameter(algoCurseManager, "<set-?>");
        this.algoCurseManager = algoCurseManager;
    }

    public final void setAlgoRequesting(boolean z) {
        this.algoRequesting = z;
    }

    public final void setHasIntelligentPredictionCapability(boolean z) {
        this.hasIntelligentPredictionCapability = z;
    }

    public final void setHasTempCharacterRecordHistory(boolean z) {
        this.hasTempCharacterRecordHistory = z;
    }

    public final void setSupportMenstrualFeature(boolean z) {
        this.supportMenstrualFeature = z;
    }

    public final void setTempTrendList(@Nullable List<TemperatureTrendItem> list) {
        this.tempTrendList = list;
    }

    public final boolean supportMenstrualPredict() {
        return this.hasIntelligentPredictionCapability && this.supportMenstrualFeature;
    }

    public final void syncCurse(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        CoroutineScope coroutineScope = this.syncScope;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.syncScope = ScopeExtKt.scope(Dispatchers.getIO(), new C24161(did, null));
    }

    public final void syncProtoTotalRecord(@NotNull WearableDeviceModel device) {
        Intrinsics.checkNotNullParameter(device, "device");
        if (getSetting() == null) {
            Logger.i("CurseManager", "syncProtoTotalRecord: setting null");
            return;
        }
        Logger.i("CurseManager", "syncProtoTotalRecord " + device.getDid());
        CurseDeviceSyncExtKt.curseSetTotalRecord(device, CurseMixedRecordKt.genProtoRecord(getProtoTotalRecord()));
    }

    private final int getOvumIndex(LocalDate date) {
        return isAlgoPredictEnable() ? this.algoCurseManager.getOvumIndex(date) : this.ovumIndex;
    }

    private final IntRange getRiskRange(LocalDate date) {
        return isAlgoPredictEnable() ? this.algoCurseManager.getRisRange(date) : this.riskRange;
    }

    public final int getInDays(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return isAlgoPredictEnable() ? this.algoCurseManager.getInDays(date) : getInDays();
    }

    public final int getInterval(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return isAlgoPredictEnable() ? this.algoCurseManager.getInterval(date) : getInterval();
    }
}
