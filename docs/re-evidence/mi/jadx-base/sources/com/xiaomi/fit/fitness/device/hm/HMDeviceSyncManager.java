package com.xiaomi.fit.fitness.device.hm;

import android.text.TextUtils;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.bluetooth.profile.channel.module.openapp.entities.ActivityData;
import com.huami.bluetooth.profile.channel.module.sleep.DataFlag;
import com.huami.bluetooth.profile.channel.module.sleep.SleepData;
import com.huami.bluetooth.profile.channel.module.sleep.SleepStage;
import com.mibi.sdk.common.MibiSdkConstants;
import com.miui.tsmclient.model.mitsm.h;
import com.xiaomi.fit.data.common.data.annotation.HuamiSyncType;
import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl;
import com.xiaomi.fit.fitness.device.VitaliyDataSender;
import com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager;
import com.xiaomi.fit.fitness.device.hm.api.HuaMiParseType;
import com.xiaomi.fit.fitness.device.hm.api.IHuamiDataParse;
import com.xiaomi.fit.fitness.device.hm.api.LastSyncTimeItem;
import com.xiaomi.fit.fitness.device.hm.api.ParseResultItem;
import com.xiaomi.fit.fitness.device.hm.data.HMStageData;
import com.xiaomi.fit.fitness.device.hm.data.HMStageItem;
import com.xiaomi.fit.fitness.device.hm.parse.HuaMiDataParseImpl;
import com.xiaomi.fit.fitness.device.hm.parse.utils.HMParseUtilKt;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.DayNightSleepReport;
import com.xiaomi.fit.fitness.export.data.item.MHStrengthItem;
import com.xiaomi.fit.fitness.export.data.item.RestHrItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.request.FitnessSyncRequest;
import com.xiaomi.fit.fitness.request.GetLastSyncItem;
import com.xiaomi.fit.fitness.request.LastSyncItem;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.HighOrLowHr;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.HighOrLowHrNotificationData;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.RestHeartRate;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmAfData;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.LowOsaNotificationData;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.LowOsaValue;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeat;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeatData;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.IHMFirstbeatDataCallback;
import com.xiaomi.hm.health.bt.profile.user.BirthDateExt;
import com.xiaomi.hm.health.bt.profile.user.GenderExt;
import com.xiaomi.hm.health.bt.sdk.AbsActivityTodayCallback;
import com.xiaomi.hm.health.bt.sdk.DailyDataResult;
import com.xiaomi.hm.health.bt.sdk.IAtrialFibCallback;
import com.xiaomi.hm.health.bt.sdk.IDailyDataSyncCallback;
import com.xiaomi.hm.health.bt.sdk.IHMSportDataCallback;
import com.xiaomi.hm.health.bt.sdk.ISpO2Callback;
import com.xiaomi.hm.health.bt.sdk.ISyncPaiCallback;
import com.xiaomi.hm.health.bt.sdk.ISyncPressureDataAllDayCallback;
import com.xiaomi.hm.health.bt.sdk.ISyncPressureDataSingleCallback;
import com.xiaomi.hm.health.bt.sdk.data.FatBurningData;
import com.xiaomi.hm.health.bt.sdk.data.HrDataResult;
import com.xiaomi.hm.health.bt.sdk.data.PaiData;
import com.xiaomi.hm.health.bt.sdk.data.PaiDataResult;
import com.xiaomi.hm.health.bt.sdk.data.RealtimeData;
import com.xiaomi.hm.health.bt.sdk.pai.PaiGoalData;
import com.xiaomi.hm.health.bt.sdk.sport.SportResult;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.wearable.hm.HuamiDataWrapper;
import com.xiaomi.wearable.hm.HuamiDataWrapperKt;
import com.xiaomi.wearable.hm.u;
import defpackage.iw9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u009c\u00012\u00020\u0001:\u0006\u009c\u0001\u009d\u0001\u009e\u0001B\b¢\u0006\u0005\b\u009b\u0001\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\u001f\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b(\u0010\bJ\u001f\u0010)\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b+\u0010*J\u001f\u0010,\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b,\u0010*J\u001f\u0010-\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b-\u0010*J(\u00100\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\rH\u0082@¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b2\u0010*J\u001f\u00103\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b3\u0010*J\u001b\u00107\u001a\u0004\u0018\u0001062\b\b\u0001\u00105\u001a\u000204H\u0002¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020\u00052\b\b\u0001\u00105\u001a\u000204H\u0002¢\u0006\u0004\b9\u0010:J0\u0010<\u001a\u00020\u00022\b\b\u0001\u00105\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0082@¢\u0006\u0004\b<\u0010=J*\u0010?\u001a\u00020\u00022\b\b\u0001\u00105\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\bA\u0010*J\u001f\u0010B\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\bB\u0010*J\u000f\u0010C\u001a\u00020\u001dH\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\bE\u0010*J(\u0010H\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010G\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010\rH\u0082@¢\u0006\u0004\bH\u00101J\u001f\u0010I\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\bI\u0010*J\u001f\u0010J\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\bJ\u0010*J\u001f\u0010K\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\bK\u0010*J,\u0010P\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010M\u001a\u0004\u0018\u00010L2\b\u0010O\u001a\u0004\u0018\u00010NH\u0082@¢\u0006\u0004\bP\u0010QJ\u001f\u0010S\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u00052\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u0002042\u0006\u0010U\u001a\u00020\u0005H\u0002¢\u0006\u0004\bV\u0010WJ1\u0010[\u001a\u0004\u0018\u00010\u00052\u0006\u0010X\u001a\u00020\u001d2\u0006\u0010Y\u001a\u0002042\u0006\u0010Z\u001a\u0002042\u0006\u0010U\u001a\u00020\u0005H\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b]\u0010^J!\u0010_\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b_\u0010*J!\u0010b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010a\u001a\u0004\u0018\u00010`H\u0002¢\u0006\u0004\bb\u0010cJ\"\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u00105\u001a\u000204H\u0082@¢\u0006\u0004\b\u0016\u0010dJ\"\u0010e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u00105\u001a\u000204H\u0082@¢\u0006\u0004\be\u0010dJ\u0019\u0010f\u001a\u00020\u00132\b\b\u0001\u00105\u001a\u000204H\u0002¢\u0006\u0004\bf\u0010gJ*\u0010i\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u00105\u001a\u0002042\u0006\u0010h\u001a\u00020\u0013H\u0082@¢\u0006\u0004\bi\u0010jJ*\u0010k\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u00105\u001a\u0002042\u0006\u0010h\u001a\u00020\u0013H\u0082@¢\u0006\u0004\bk\u0010jJ\u0019\u0010m\u001a\u00020l2\b\b\u0001\u00105\u001a\u000204H\u0002¢\u0006\u0004\bm\u0010nJ\u0019\u0010o\u001a\u00020l2\b\b\u0001\u00105\u001a\u000204H\u0002¢\u0006\u0004\bo\u0010nJ\r\u0010p\u001a\u00020\u0002¢\u0006\u0004\bp\u0010\u0004J\u001f\u0010s\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010h\u001a\u00020\u0013H\u0010¢\u0006\u0004\bq\u0010rJ+\u0010y\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u00052\b\u0010u\u001a\u0004\u0018\u00010t2\b\u0010v\u001a\u0004\u0018\u00010\u0013H\u0010¢\u0006\u0004\bw\u0010xJ\u0017\u0010{\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u0005H\u0010¢\u0006\u0004\bz\u0010\bJ\u001f\u0010\u007f\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u00052\u0006\u0010|\u001a\u00020lH\u0010¢\u0006\u0004\b}\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020\u00058\u0002X\u0082D¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\"\u0010\u0084\u0001\u001a\r \u0083\u0001*\u0005\u0018\u00010\u0082\u00010\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010\u0087\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0081\u0001R&\u0010\u008b\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!0\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R!\u0010\u0095\u0001\u001a\u00030\u0090\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R!\u0010\u009a\u0001\u001a\u00030\u0096\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0092\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001¨\u0006\u009f\u0001"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/HMDeviceSyncManager;", "Lcom/xiaomi/fit/fitness/device/FitnessDataSyncBaseImpl;", "", "cancelDoingTask", "()V", "", "did", "writeSleepData", "(Ljava/lang/String;)V", "startDateStr", "endDateStr", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataFlag;", "dataFlag", "", "Lcom/huami/bluetooth/profile/channel/module/sleep/SleepData;", "getSleepData", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/sleep/DataFlag;Ljava/lang/String;)Ljava/util/List;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "syncHuamiData", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "addDataTypeToSync", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "huamiDevice", "triggerGetLastSyncTimeAndSync", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "key", "", PaiData.LAST_SYNC_TIME, "setTheLastSyncTime", "(Ljava/lang/String;J)V", "Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", "timeItem", "(Ljava/lang/String;Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;)V", "getTheLastSyncTime", "(Ljava/lang/String;)Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", "startSync", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;)V", "postMultySyncTime", "syncAbnormalHrData", "(Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;Ljava/lang/String;)V", "syncLowSpo2Data", "syncActivityData", "syncTrainingLoad", "Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/BleFirstbeat;", "tlSrcList", "parseTLData", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncAFibData", "syncSpo2Data", "", "syncType", "Lcom/xiaomi/fit/fitness/device/hm/api/HuaMiParseType;", "convertHMParseType", "(I)Lcom/xiaomi/fit/fitness/device/hm/api/HuaMiParseType;", "convertHMKey", "(I)Ljava/lang/String;", "dataList", "parseDayDataList", "(ILjava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdkResult", "parseData", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncSingleStressData", "syncAllDayStressData", "getAccountId", "()J", "syncSportData", "Lcom/xiaomi/hm/health/bt/sdk/sport/SportItem;", "sportList", "parseSport", "syncHrData", "syncRestHr", "syncDailyData", "Lcom/xiaomi/hm/health/bt/sdk/DailyDataResult;", "result", "Lcom/xiaomi/hm/health/bt/sdk/data/RealtimeData;", "realtimeData", "parseDailyData", "(Ljava/lang/String;Lcom/xiaomi/hm/health/bt/sdk/DailyDataResult;Lcom/xiaomi/hm/health/bt/sdk/data/RealtimeData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sid", "getMHStrength", "(Ljava/lang/String;Lcom/xiaomi/hm/health/bt/sdk/DailyDataResult;)V", "stageData", "getStepCalories", "(Ljava/lang/String;)I", "time", "lastTimeStamp", OneTrack.Param.TZ, "createServerStageData", "(JIILjava/lang/String;)Ljava/lang/String;", "printRealtimeData", "(Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;)V", "syncPaiData", "Lcom/xiaomi/hm/health/bt/sdk/data/PaiDataResult;", "paiDataResult", "updatePaiGoal", "(Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;Lcom/xiaomi/hm/health/bt/sdk/data/PaiDataResult;)V", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addDataTypeToParse", "checkForceSyncType", "(I)Z", "success", "updateDataTypeSyncedResult", "(Ljava/lang/String;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDataTypeParseResult", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "createSyncDataId", "(I)Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "createParseDataId", CervicalMucusRecord.Appearance.CLEAR, "handleSpecialSyncResult$fitness_sync_release", "(Ljava/lang/String;Z)V", "handleSpecialSyncResult", "Liw9;", "callback", "isBgAutoSync", "startSyncWithDevice$fitness_sync_release", "(Ljava/lang/String;Liw9;Ljava/lang/Boolean;)V", "startSyncWithDevice", "syncLocalData$fitness_sync_release", "syncLocalData", "dataId", "confirmFitnessId$fitness_sync_release", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;)V", "confirmFitnessId", "PATTERN_HM_DATE_STR", "Ljava/lang/String;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "mSingleExecutors", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/Future;", "mFutureTask", "Ljava/util/concurrent/Future;", "lastSyncDid", "Ljava/util/HashMap;", "syncTimeMap", "Ljava/util/HashMap;", "Lcom/xiaomi/fit/fitness/request/FitnessSyncRequest;", "syncRequest", "Lcom/xiaomi/fit/fitness/request/FitnessSyncRequest;", "Lcom/xiaomi/fit/fitness/device/hm/api/IHuamiDataParse;", "hmDataParse$delegate", "Lkotlin/Lazy;", "getHmDataParse", "()Lcom/xiaomi/fit/fitness/device/hm/api/IHuamiDataParse;", "hmDataParse", "Lcom/google/gson/Gson;", "mGson$delegate", "getMGson", "()Lcom/google/gson/Gson;", "mGson", "<init>", "Companion", "AFibData", "Spo2Data", "fitness-sync_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHMDeviceSyncManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HMDeviceSyncManager.kt\ncom/xiaomi/fit/fitness/device/hm/HMDeviceSyncManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1428:1\n1863#2,2:1429\n1863#2:1431\n1863#2,2:1432\n1864#2:1434\n1863#2:1443\n1863#2,2:1444\n1864#2:1446\n1863#2,2:1451\n37#3:1435\n36#3,3:1436\n37#3:1439\n36#3,3:1440\n37#3:1447\n36#3,3:1448\n37#3:1453\n36#3,3:1454\n37#3:1457\n36#3,3:1458\n37#3:1461\n36#3,3:1462\n*S KotlinDebug\n*F\n+ 1 HMDeviceSyncManager.kt\ncom/xiaomi/fit/fitness/device/hm/HMDeviceSyncManager\n*L\n214#1:1429,2\n416#1:1431\n420#1:1432,2\n416#1:1434\n489#1:1443\n491#1:1444,2\n489#1:1446\n1048#1:1451,2\n451#1:1435\n451#1:1436,3\n456#1:1439\n456#1:1440,3\n510#1:1447\n510#1:1448,3\n1059#1:1453\n1059#1:1454,3\n1079#1:1457\n1079#1:1458,3\n1241#1:1461\n1241#1:1462,3\n*E\n"})
public final class HMDeviceSyncManager extends FitnessDataSyncBaseImpl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<HMDeviceSyncManager> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ycb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HMDeviceSyncManager.instance_delegate$lambda$12();
        }
    });

    @Nullable
    private String lastSyncDid;

    @Nullable
    private Future<?> mFutureTask;

    @NotNull
    private final String PATTERN_HM_DATE_STR = "yyyy-MM-dd";
    private final ExecutorService mSingleExecutors = Executors.newSingleThreadExecutor();

    @NotNull
    private HashMap<String, LastSyncTimeItem> syncTimeMap = new HashMap<>();

    @NotNull
    private final FitnessSyncRequest syncRequest = new FitnessSyncRequest();

    /* JADX INFO: renamed from: hmDataParse$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hmDataParse = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zcb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HMDeviceSyncManager.hmDataParse_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: mGson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: adb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HMDeviceSyncManager.mGson_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/HMDeviceSyncManager$AFibData;", "Ljava/io/Serializable;", "<init>", "()V", "generatedTime", "", "", "getGeneratedTime", "()Ljava/util/List;", "setGeneratedTime", "(Ljava/util/List;)V", "timeZone", "", "getTimeZone", "()I", "setTimeZone", "(I)V", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AFibData implements Serializable {

        @Nullable
        private List<Long> generatedTime;
        private int timeZone;

        @Nullable
        public final List<Long> getGeneratedTime() {
            return this.generatedTime;
        }

        public final int getTimeZone() {
            return this.timeZone;
        }

        public final void setGeneratedTime(@Nullable List<Long> list) {
            this.generatedTime = list;
        }

        public final void setTimeZone(int i) {
            this.timeZone = i;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/HMDeviceSyncManager$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/device/hm/HMDeviceSyncManager;", "getInstance", "()Lcom/xiaomi/fit/fitness/device/hm/HMDeviceSyncManager;", "instance$delegate", "Lkotlin/Lazy;", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HMDeviceSyncManager getInstance() {
            return (HMDeviceSyncManager) HMDeviceSyncManager.instance$delegate.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/HMDeviceSyncManager$Spo2Data;", "Ljava/io/Serializable;", "<init>", "()V", "spo2", "", "getSpo2", "()I", "setSpo2", "(I)V", "timestamp", "", "getTimestamp", "()J", "setTimestamp", "(J)V", "timeZone", "getTimeZone", "setTimeZone", PaiData.LAST_SYNC_TIME, "getLastSyncTime", "setLastSyncTime", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Spo2Data implements Serializable {
        private long lastSyncTime;
        private int spo2;
        private int timeZone;
        private long timestamp;

        public final long getLastSyncTime() {
            return this.lastSyncTime;
        }

        public final int getSpo2() {
            return this.spo2;
        }

        public final int getTimeZone() {
            return this.timeZone;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final void setLastSyncTime(long j) {
            this.lastSyncTime = j;
        }

        public final void setSpo2(int i) {
            this.spo2 = i;
        }

        public final void setTimeZone(int i) {
            this.timeZone = i;
        }

        public final void setTimestamp(long j) {
            this.timestamp = j;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$addDataTypeToSync$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager", f = "HMDeviceSyncManager.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11}, l = {267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 278, 279}, m = "addDataTypeToSync", n = {"this", "did", "this", "did", "this", "did", "this", "did", "this", "did", "this", "did", "this", "did", "this", "did", "this", "did", "this", "did", "this", "did", "this", "did"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
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
            return HMDeviceSyncManager.this.addDataTypeToSync(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$parseDailyData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager", f = "HMDeviceSyncManager.kt", i = {0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4}, l = {1114, 1120, h.H, 1141, 1177, 1212}, m = "parseDailyData", n = {"this", "did", "result", "realtimeData", "this", "did", "result", "realtimeData", "dailyData", "dailyStage", "stageData", PaiData.LAST_SYNC_TIME, "timeZone", "syncResult", SportConstants.KEY_TIMESTAMP, "this", "did", "result", "realtimeData", "dailyData", PaiData.LAST_SYNC_TIME, "timeZone", "syncResult", SportConstants.KEY_TIMESTAMP}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$7", "J$0", "I$0", "I$1", "J$1", "L$0", "L$1", "L$2", "L$3", "L$5", "J$0", "I$0", "I$1", "J$1"})
    public static final class C15491 extends ContinuationImpl {
        int I$0;
        int I$1;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C15491(Continuation<? super C15491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMDeviceSyncManager.this.parseDailyData(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$parseData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager", f = "HMDeviceSyncManager.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {802, 806, 821}, m = "parseData", n = {"this", "did", "sdkResult", "syncType", "this", "did", "sdkResult", "huamiKey", "syncType"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"})
    public static final class C15501 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C15501(Continuation<? super C15501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMDeviceSyncManager.this.parseData(0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$parseDayDataList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager", f = "HMDeviceSyncManager.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {769, 778, 798}, m = "parseDayDataList", n = {"this", "did", "dataList", "syncType", "this", "did", "parseType", "huamiKey", "dataStr", "syncType", "syncResult", PaiData.LAST_SYNC_TIME, "timeZone"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "I$1", "J$0", "I$2"})
    public static final class C15511 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C15511(Continuation<? super C15511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMDeviceSyncManager.this.parseDayDataList(0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$parseSport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager", f = "HMDeviceSyncManager.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {931, 934, 963, 1001}, m = "parseSport", n = {"this", "did", "sportList", "reportLastSyncTime", "reportTimeZone", "reportSyncResult", "recordLastSyncTime", "recordTimeZone", "recordSyncResult", "this", "did", "sportItem", "reportLastSyncTime", "reportTimeZone", "reportSyncResult", "recordLastSyncTime", "recordTimeZone", "recordSyncResult", "startTime", "this", "did", "sportReport", "reportLastSyncTime", "reportTimeZone", "reportSyncResult", "recordLastSyncTime", "recordTimeZone", "recordSyncResult", "startTime"}, s = {"L$0", "L$1", "L$2", "J$0", "I$0", "I$1", "J$1", "I$2", "I$3", "L$0", "L$1", "L$3", "J$0", "I$0", "I$1", "J$1", "I$2", "I$3", "J$2", "L$0", "L$1", "L$3", "J$0", "I$0", "I$1", "J$1", "I$2", "I$3", "J$2"})
    public static final class C15521 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        long J$1;
        long J$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C15521(Continuation<? super C15521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMDeviceSyncManager.this.parseSport(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$postMultySyncTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$postMultySyncTime$1", f = "HMDeviceSyncManager.kt", i = {}, l = {387}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHMDeviceSyncManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HMDeviceSyncManager.kt\ncom/xiaomi/fit/fitness/device/hm/HMDeviceSyncManager$postMultySyncTime$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1428:1\n216#2,2:1429\n*S KotlinDebug\n*F\n+ 1 HMDeviceSyncManager.kt\ncom/xiaomi/fit/fitness/device/hm/HMDeviceSyncManager$postMultySyncTime$1\n*L\n378#1:1429,2\n*E\n"})
    public static final class C15531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15531(String str, Continuation<? super C15531> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HMDeviceSyncManager.this.new C15531(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : HMDeviceSyncManager.this.syncTimeMap.entrySet()) {
                    long lastSyncTime = ((LastSyncTimeItem) entry.getValue()).getLastSyncTime();
                    if (lastSyncTime > 0) {
                        arrayList.add(new LastSyncItem("", (String) entry.getKey(), lastSyncTime, ((LastSyncTimeItem) entry.getValue()).getTimeZone()));
                    }
                }
                if (!arrayList.isEmpty()) {
                    FitnessSyncRequest fitnessSyncRequest = HMDeviceSyncManager.this.syncRequest;
                    String str = this.$did;
                    this.label = 1;
                    if (fitnessSyncRequest.postLastSyncTime(str, arrayList, this) == coroutine_suspended) {
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
            return ((C15531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncAbnormalHrData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncAbnormalHrData$1", f = "HMDeviceSyncManager.kt", i = {}, l = {397}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15551(String str, Continuation<? super C15551> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HMDeviceSyncManager.this.new C15551(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMDeviceSyncManager hMDeviceSyncManager = HMDeviceSyncManager.this;
                String str = this.$did;
                this.label = 1;
                if (hMDeviceSyncManager.updateDataTypeSyncedResult(str, 12, true, this) == coroutine_suspended) {
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
            return ((C15551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncAbnormalHrData$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncAbnormalHrData$2", f = "HMDeviceSyncManager.kt", i = {}, l = {409}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HMDeviceSyncManager.this.new AnonymousClass2(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMDeviceSyncManager hMDeviceSyncManager = HMDeviceSyncManager.this;
                String str = this.$did;
                this.label = 1;
                if (hMDeviceSyncManager.updateDataTypeSyncedResult(str, 12, true, this) == coroutine_suspended) {
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
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncAbnormalHrData$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncAbnormalHrData$4", f = "HMDeviceSyncManager.kt", i = {}, l = {462}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HMDeviceSyncManager.this.new AnonymousClass4(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMDeviceSyncManager hMDeviceSyncManager = HMDeviceSyncManager.this;
                String str = this.$did;
                this.label = 1;
                if (hMDeviceSyncManager.updateDataTypeSyncedResult(str, 12, true, this) == coroutine_suspended) {
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
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncActivityData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncActivityData$1", f = "HMDeviceSyncManager.kt", i = {}, l = {525}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15561(String str, Continuation<? super C15561> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HMDeviceSyncManager.this.new C15561(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMDeviceSyncManager hMDeviceSyncManager = HMDeviceSyncManager.this;
                String str = this.$did;
                this.label = 1;
                if (hMDeviceSyncManager.updateDataTypeSyncedResult(str, 9, true, this) == coroutine_suspended) {
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
            return ((C15561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncDailyData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncDailyData$1", f = "HMDeviceSyncManager.kt", i = {}, l = {MibiSdkConstants.RESULT_CHECK_RISK_ERROR, 1105}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ HuamiApiCaller $huamiDevice;
        final /* synthetic */ DailyDataResult $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15591(String str, DailyDataResult dailyDataResult, HuamiApiCaller huamiApiCaller, Continuation<? super C15591> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$result = dailyDataResult;
            this.$huamiDevice = huamiApiCaller;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HMDeviceSyncManager.this.new C15591(this.$did, this.$result, this.$huamiDevice, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
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
            HMDeviceSyncManager hMDeviceSyncManager = HMDeviceSyncManager.this;
            String str = this.$did;
            this.label = 1;
            if (hMDeviceSyncManager.updateDataTypeSyncedResult(str, 0, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            HMDeviceSyncManager hMDeviceSyncManager2 = HMDeviceSyncManager.this;
            String str2 = this.$did;
            DailyDataResult dailyDataResult = this.$result;
            RealtimeData realtimeData = this.$huamiDevice.getRealtimeData();
            this.label = 2;
            if (hMDeviceSyncManager2.parseDailyData(str2, dailyDataResult, realtimeData, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncHrData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncHrData$1", f = "HMDeviceSyncManager.kt", i = {}, l = {1013, 1019}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ HrDataResult $hrDataResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15601(String str, HrDataResult hrDataResult, Continuation<? super C15601> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$hrDataResult = hrDataResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HMDeviceSyncManager.this.new C15601(this.$did, this.$hrDataResult, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
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
            HMDeviceSyncManager hMDeviceSyncManager = HMDeviceSyncManager.this;
            String str = this.$did;
            this.label = 1;
            if (hMDeviceSyncManager.updateDataTypeSyncedResult(str, 1, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            HrDataResult hrDataResult = this.$hrDataResult;
            if (hrDataResult != null && hrDataResult.getResult().size() > 0) {
                HMDeviceSyncManager hMDeviceSyncManager2 = HMDeviceSyncManager.this;
                String str2 = this.$did;
                String hrDataResult2 = this.$hrDataResult.getHrDataResult();
                Intrinsics.checkNotNullExpressionValue(hrDataResult2, "getHrDataResult(...)");
                this.label = 2;
                if (hMDeviceSyncManager2.parseData(1, str2, hrDataResult2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncHuamiData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncHuamiData$1", f = "HMDeviceSyncManager.kt", i = {}, l = {257, SportSummary.VERSION_102}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ HuamiApiCaller $huamiDevice;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15611(String str, HuamiApiCaller huamiApiCaller, Continuation<? super C15611> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$huamiDevice = huamiApiCaller;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HMDeviceSyncManager.this.new C15611(this.$did, this.$huamiDevice, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
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
            HMDeviceSyncManager hMDeviceSyncManager = HMDeviceSyncManager.this;
            String str = this.$did;
            this.label = 1;
            if (hMDeviceSyncManager.addDataTypeToSync(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            HMDeviceSyncManager hMDeviceSyncManager2 = HMDeviceSyncManager.this;
            String str2 = this.$did;
            HuamiApiCaller huamiApiCaller = this.$huamiDevice;
            this.label = 2;
            if (hMDeviceSyncManager2.triggerGetLastSyncTimeAndSync(str2, huamiApiCaller, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncLowSpo2Data$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncLowSpo2Data$1", f = "HMDeviceSyncManager.kt", i = {}, l = {471}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15621(String str, Continuation<? super C15621> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HMDeviceSyncManager.this.new C15621(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMDeviceSyncManager hMDeviceSyncManager = HMDeviceSyncManager.this;
                String str = this.$did;
                this.label = 1;
                if (hMDeviceSyncManager.updateDataTypeSyncedResult(str, 11, true, this) == coroutine_suspended) {
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
            return ((C15621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncLowSpo2Data$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncLowSpo2Data$2", f = "HMDeviceSyncManager.kt", i = {}, l = {483}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15632 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15632(String str, Continuation<? super C15632> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HMDeviceSyncManager.this.new C15632(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMDeviceSyncManager hMDeviceSyncManager = HMDeviceSyncManager.this;
                String str = this.$did;
                this.label = 1;
                if (hMDeviceSyncManager.updateDataTypeSyncedResult(str, 11, true, this) == coroutine_suspended) {
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
            return ((C15632) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncLowSpo2Data$4, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncLowSpo2Data$4", f = "HMDeviceSyncManager.kt", i = {}, l = {SportSummary.VRESION_204}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15644 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15644(String str, Continuation<? super C15644> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HMDeviceSyncManager.this.new C15644(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMDeviceSyncManager hMDeviceSyncManager = HMDeviceSyncManager.this;
                String str = this.$did;
                this.label = 1;
                if (hMDeviceSyncManager.updateDataTypeSyncedResult(str, 11, true, this) == coroutine_suspended) {
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
            return ((C15644) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncRestHr$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncRestHr$1", f = "HMDeviceSyncManager.kt", i = {}, l = {1028}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15661(String str, Continuation<? super C15661> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HMDeviceSyncManager.this.new C15661(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMDeviceSyncManager hMDeviceSyncManager = HMDeviceSyncManager.this;
                String str = this.$did;
                this.label = 1;
                if (hMDeviceSyncManager.updateDataTypeSyncedResult(str, 10, true, this) == coroutine_suspended) {
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
            return ((C15661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncRestHr$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncRestHr$2", f = "HMDeviceSyncManager.kt", i = {}, l = {1038}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15672 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15672(String str, Continuation<? super C15672> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HMDeviceSyncManager.this.new C15672(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMDeviceSyncManager hMDeviceSyncManager = HMDeviceSyncManager.this;
                String str = this.$did;
                this.label = 1;
                if (hMDeviceSyncManager.updateDataTypeSyncedResult(str, 10, true, this) == coroutine_suspended) {
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
            return ((C15672) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncTrainingLoad$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncTrainingLoad$1", f = "HMDeviceSyncManager.kt", i = {}, l = {591}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15701(String str, Continuation<? super C15701> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HMDeviceSyncManager.this.new C15701(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMDeviceSyncManager hMDeviceSyncManager = HMDeviceSyncManager.this;
                String str = this.$did;
                this.label = 1;
                if (hMDeviceSyncManager.updateDataTypeSyncedResult(str, 8, true, this) == coroutine_suspended) {
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
            return ((C15701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$triggerGetLastSyncTimeAndSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager", f = "HMDeviceSyncManager.kt", i = {0, 0, 0}, l = {284}, m = "triggerGetLastSyncTimeAndSync", n = {"this", "did", "huamiDevice"}, s = {"L$0", "L$1", "L$2"})
    public static final class C15721 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C15721(Continuation<? super C15721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMDeviceSyncManager.this.triggerGetLastSyncTimeAndSync(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object addDataTypeToParse(String str, @HuamiSyncType int i, Continuation<? super Unit> continuation) {
        Object objUpdateSyncStatus = updateSyncStatus(str, createParseDataId(i), 0, checkForceSyncType(i), continuation);
        return objUpdateSyncStatus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateSyncStatus : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0103 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x011e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x012b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x0138 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0145 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0152 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x015f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x016c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x0189 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object addDataTypeToSync(String str, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        HMDeviceSyncManager hMDeviceSyncManager;
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
        switch (anonymousClass1.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 1;
                if (addDataTypeToSync(str, 0, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hMDeviceSyncManager = this;
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 2;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 1, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 3;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 3, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 4;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 2, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 5;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 5, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 6;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 4, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 7;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 6, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 8;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 7, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 9;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 8, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 10;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 9, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 11;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 10, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 12;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 11, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 13;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 12, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                str = (String) anonymousClass1.L$1;
                hMDeviceSyncManager = (HMDeviceSyncManager) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 2;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 1, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 3;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 3, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 4;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 2, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 5;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 5, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 6;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 4, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 7;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 6, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 8;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 7, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 9;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 8, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 10;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 9, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 11;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 10, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 12;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 11, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 13;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 12, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 2:
                str = (String) anonymousClass1.L$1;
                hMDeviceSyncManager = (HMDeviceSyncManager) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 3;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 3, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 4;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 2, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 5;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 5, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 6;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 4, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 7;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 6, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 8;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 7, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 9;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 8, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 10;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 9, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 11;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 10, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 12;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 11, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 13;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 12, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 3:
                str = (String) anonymousClass1.L$1;
                hMDeviceSyncManager = (HMDeviceSyncManager) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 4;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 2, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 5;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 5, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 6;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 4, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 7;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 6, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 8;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 7, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 9;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 8, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 10;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 9, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 11;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 10, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 12;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 11, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 13;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 12, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 4:
                str = (String) anonymousClass1.L$1;
                hMDeviceSyncManager = (HMDeviceSyncManager) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 5;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 5, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 6;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 4, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 7;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 6, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 8;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 7, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 9;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 8, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 10;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 9, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 11;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 10, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 12;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 11, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 13;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 12, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 5:
                str = (String) anonymousClass1.L$1;
                hMDeviceSyncManager = (HMDeviceSyncManager) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 6;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 4, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 7;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 6, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 8;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 7, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 9;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 8, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 10;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 9, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 11;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 10, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 12;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 11, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 13;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 12, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 6:
                str = (String) anonymousClass1.L$1;
                hMDeviceSyncManager = (HMDeviceSyncManager) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 7;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 6, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 8;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 7, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 9;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 8, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 10;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 9, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 11;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 10, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 12;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 11, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 13;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 12, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 7:
                str = (String) anonymousClass1.L$1;
                hMDeviceSyncManager = (HMDeviceSyncManager) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 8;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 7, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 9;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 8, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 10;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 9, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 11;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 10, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 12;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 11, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 13;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 12, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 8:
                str = (String) anonymousClass1.L$1;
                hMDeviceSyncManager = (HMDeviceSyncManager) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 9;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 8, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 10;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 9, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 11;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 10, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 12;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 11, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 13;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 12, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 9:
                str = (String) anonymousClass1.L$1;
                hMDeviceSyncManager = (HMDeviceSyncManager) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 10;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 9, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 11;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 10, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 12;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 11, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 13;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 12, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 10:
                str = (String) anonymousClass1.L$1;
                hMDeviceSyncManager = (HMDeviceSyncManager) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 11;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 10, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 12;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 11, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 13;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 12, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 11:
                str = (String) anonymousClass1.L$1;
                hMDeviceSyncManager = (HMDeviceSyncManager) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                anonymousClass1.L$0 = hMDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 12;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 11, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 13;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 12, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 12:
                str = (String) anonymousClass1.L$1;
                hMDeviceSyncManager = (HMDeviceSyncManager) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 13;
                if (hMDeviceSyncManager.addDataTypeToSync(str, 12, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 13:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void cancelDoingTask() {
        Future<?> future = this.mFutureTask;
        if (future != null) {
            Intrinsics.checkNotNull(future);
            if (future.isDone()) {
                return;
            }
            FitnessLogUtils.i(getTAG(), "last sync is doing, and cancel it");
            Future<?> future2 = this.mFutureTask;
            Intrinsics.checkNotNull(future2);
            future2.cancel(true);
        }
    }

    private final boolean checkForceSyncType(@HuamiSyncType int syncType) {
        return syncType == 0 || syncType == 1 || syncType == 9 || syncType == 10;
    }

    private final String convertHMKey(@HuamiSyncType int syncType) {
        switch (syncType) {
            case 1:
                return "huami_manual_heartrate_record";
            case 2:
                return "huami_all_day_stress_record";
            case 3:
                return "huami_single_stress_record";
            case 4:
                return "huami_pai_record";
            case 5:
            case 10:
            default:
                return "";
            case 6:
                return "huami_manual_measure_record";
            case 7:
                return "huami_atrial_fibrillation_record";
            case 8:
                return "huami_training_load_record";
            case 9:
                return "huami_vitality_index";
            case 11:
                return "huami_low_spo2";
            case 12:
                return "huami_hl_heart_rate";
        }
    }

    private final HuaMiParseType convertHMParseType(@HuamiSyncType int syncType) {
        switch (syncType) {
            case 1:
                return HuaMiParseType.ManualHr;
            case 2:
                return HuaMiParseType.AllDayStress;
            case 3:
                return HuaMiParseType.ManualStress;
            case 4:
                return HuaMiParseType.Pai;
            case 5:
            default:
                return null;
            case 6:
                return HuaMiParseType.Spo2;
            case 7:
                return HuaMiParseType.AFib;
            case 8:
                return HuaMiParseType.TrainingLoad;
        }
    }

    private final FitnessDataId createParseDataId(@HuamiSyncType int syncType) {
        return new FitnessDataId.Builder().dailyType(syncType).build();
    }

    private final String createServerStageData(long time, int lastTimeStamp, int tz, String stageData) {
        if (TextUtils.isEmpty(stageData)) {
            FitnessLogUtils.w(getTAG(), "syncStageData: empty stage data: " + time);
            return null;
        }
        Object objFromJson = getMGson().fromJson(stageData, new TypeToken<ArrayList<HMStageItem>>() { // from class: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$createServerStageData$listType$1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        ArrayList arrayList = new ArrayList();
        HMStageItem hMStageItem = new HMStageItem();
        for (HMStageItem hMStageItem2 : (List) objFromJson) {
            if (!hMStageItem2.empty()) {
                arrayList.add(hMStageItem2);
                hMStageItem.setCal(hMStageItem.getCal() + hMStageItem2.getCal());
                hMStageItem.setDis(hMStageItem.getDis() + hMStageItem2.getDis());
                hMStageItem.setStep(hMStageItem.getStep() + hMStageItem2.getStep());
            }
        }
        if (arrayList.size() == 0) {
            FitnessLogUtils.w(getTAG(), "syncStageData: no data " + time);
            return null;
        }
        FitnessLogUtils.i(getTAG(), "StageData: time = " + time + ", " + hMStageItem);
        return getMGson().toJson(new HMStageData(time, lastTimeStamp, tz, arrayList));
    }

    private final FitnessDataId createSyncDataId(@HuamiSyncType int syncType) {
        return new FitnessDataId.Builder().sportType(syncType).build();
    }

    private final long getAccountId() {
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        if (TextUtils.isDigitsOnly(userId)) {
            return Long.parseLong(userId);
        }
        return 0L;
    }

    private final IHuamiDataParse getHmDataParse() {
        return (IHuamiDataParse) this.hmDataParse.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gson getMGson() {
        return (Gson) this.mGson.getValue();
    }

    private final void getMHStrength(String sid, DailyDataResult result) {
        FitnessLogUtils.i(getTAG(), "getMHStrength: start");
        List<FatBurningData> fatBurningDataList = result.getFatBurningDataList();
        List<FatBurningData> list = fatBurningDataList;
        if (list == null || list.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "getMHStrength: empty list");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (FatBurningData fatBurningData : fatBurningDataList) {
            FitnessLogUtils.i(getTAG(), "getMHStrength: result(" + fatBurningData.getStartTime() + " - " + fatBurningData.getEndTime() + ")");
            long j = (long) 1000;
            long j2 = (long) 60;
            long endTime = fatBurningData.getEndTime() / j;
            for (long startTime = ((fatBurningData.getStartTime() / j) / j2) * j2; startTime <= endTime; startTime += j2) {
                arrayList.add(new MHStrengthItem(startTime));
            }
        }
        FitnessDataRecorder fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        MHStrengthItem[] mHStrengthItemArr = (MHStrengthItem[]) arrayList.toArray(new MHStrengthItem[0]);
        fitnessDataExtKt.recordMHStrength(sid, currentTZOffsetInSec, (MHStrengthItem[]) Arrays.copyOf(mHStrengthItemArr, mHStrengthItemArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SleepData> getSleepData(String startDateStr, String endDateStr, DataFlag dataFlag, String did) throws Exception {
        FitnessLogUtils.i(getTAG(), "getSleepData: startDate = " + startDateStr + ", endDate = " + endDateStr);
        FitnessDateUtils fitnessDateUtils = FitnessDateUtils.INSTANCE;
        long jConvertDateStrToZeroTime = fitnessDateUtils.convertDateStrToZeroTime(startDateStr, this.PATTERN_HM_DATE_STR);
        long jConvertDateStrToZeroTime2 = fitnessDateUtils.convertDateStrToZeroTime(endDateStr, this.PATTERN_HM_DATE_STR) + fitnessDateUtils.getSECONDS_ONE_DAY();
        FitnessLogUtils.i(getTAG(), "getSleepData(startTime = " + jConvertDateStrToZeroTime + ", endTime = " + jConvertDateStrToZeroTime2 + ")");
        List<DailyRecordItem> list = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE).getTheDailyItems(did, jConvertDateStrToZeroTime, jConvertDateStrToZeroTime2, FitnessDateUtils.getCurrentTZOffsetInSec(), FitnessPersistKey.NightSleep).get(FitnessPersistKey.NightSleep);
        List<DailyRecordItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String dateYYYYMMdd = TimeDateUtil.getDateYYYYMMdd(System.currentTimeMillis());
        Iterator<DailyRecordItem> it = list.iterator();
        while (it.hasNext()) {
            DailyRecordItem next = it.next();
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.DayNightSleepReport");
            DayNightSleepReport dayNightSleepReport = (DayNightSleepReport) next;
            if (dayNightSleepReport.getSleepDuration() > 0) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long minutes = timeUnit.toMinutes(dayNightSleepReport.getBedTime() - dayNightSleepReport.getTime());
                long minutes2 = timeUnit.toMinutes(dayNightSleepReport.getWakeUpTime() - dayNightSleepReport.getTime());
                String dateYYYYMMdd2 = TimeDateUtil.getDateYYYYMMdd(dayNightSleepReport.getTime() * ((long) 1000));
                long seconds = TextUtils.equals(dateYYYYMMdd, dateYYYYMMdd2) ? TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) : (dayNightSleepReport.getTime() + FitnessDateUtils.INSTANCE.getSECONDS_ONE_DAY()) - 1;
                ArrayList arrayList2 = new ArrayList();
                List<SleepStateItem> sleepItems = dayNightSleepReport.getSleepItems();
                if (sleepItems != null) {
                    for (SleepStateItem sleepStateItem : sleepItems) {
                        TimeUnit timeUnit2 = TimeUnit.SECONDS;
                        arrayList2.add(new SleepStage((int) timeUnit2.toMinutes(sleepStateItem.getStartTime() - dayNightSleepReport.getTime()), ((int) timeUnit2.toMinutes(sleepStateItem.getEndTime() - dayNightSleepReport.getTime())) - 1, HMParseUtilKt.convertMiToHMSleepMode(sleepStateItem.getSleepState())));
                        it = it;
                        arrayList = arrayList;
                    }
                }
                Iterator<DailyRecordItem> it2 = it;
                ArrayList arrayList3 = arrayList;
                TimeZone timeZone = TimeZone.getDefault();
                Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault(...)");
                SleepData sleepData = new SleepData(dateYYYYMMdd2, (int) seconds, timeZone, dataFlag, (int) minutes, (int) minutes2, dayNightSleepReport.getSleepDuration(), dayNightSleepReport.getTotalScore(), 0, arrayList2);
                FitnessLogUtils.i(getTAG(), "getSleepData: date = " + sleepData + ".date, start = " + minutes + ", stop = " + minutes2 + ", duration = " + sleepData + ".sleepDuration, updateTime = " + seconds);
                arrayList3.add(sleepData);
                arrayList = arrayList3;
                it = it2;
            }
        }
        ArrayList arrayList4 = arrayList;
        FitnessLogUtils.i(getTAG(), "getSleepData: result size = " + arrayList4.size());
        return arrayList4;
    }

    private final int getStepCalories(String stageData) {
        int cal = 0;
        if (TextUtils.isEmpty(stageData)) {
            return 0;
        }
        Object objFromJson = getMGson().fromJson(stageData, new TypeToken<ArrayList<HMStageItem>>() { // from class: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$getStepCalories$listType$1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        for (HMStageItem hMStageItem : (List) objFromJson) {
            if (!hMStageItem.empty() && hMStageItem.getStep() > 0) {
                cal += hMStageItem.getCal();
            }
        }
        FitnessLogUtils.w(getTAG(), "getStepCalories: " + cal);
        return cal;
    }

    private final LastSyncTimeItem getTheLastSyncTime(String key) {
        FitnessPreference fitnessPreference = FitnessPreference.INSTANCE;
        LastSyncTimeItem lastSyncTime = fitnessPreference.getLastSyncTime(key);
        long j = 1000;
        long lastSyncTime2 = lastSyncTime.getLastSyncTime() * j;
        FitnessLogUtils.i(getTAG(), "getTheLastSyncTime key=" + key + "**time=" + lastSyncTime2);
        if (lastSyncTime2 > System.currentTimeMillis()) {
            return new LastSyncTimeItem(lastSyncTime.getTimeZone(), FitnessDateUtils.getTodayZeroTimeInSec() * j);
        }
        if (lastSyncTime2 > 0) {
            return new LastSyncTimeItem(lastSyncTime.getTimeZone(), lastSyncTime2);
        }
        long lastBindTime = fitnessPreference.getLastBindTime() * j;
        LocalDate localDateMinusDays = LocalDate.now().minusDays(7);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
        long jChangZeroOfTheDayInner = TimeDateUtil.INSTANCE.changZeroOfTheDayInner(localDateMinusDays);
        return lastBindTime > jChangZeroOfTheDayInner ? new LastSyncTimeItem(FitnessDateUtils.getCurrentTZOffsetIn15min(), lastBindTime) : new LastSyncTimeItem(FitnessDateUtils.getCurrentTZOffsetIn15min(), jChangZeroOfTheDayInner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HuaMiDataParseImpl hmDataParse_delegate$lambda$0() {
        return new HuaMiDataParseImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HMDeviceSyncManager instance_delegate$lambda$12() {
        return new HMDeviceSyncManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mGson_delegate$lambda$1() {
        return new Gson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:40|(2:42|(1:44)(4:45|46|(1:48)|49))(1:50)|217|51|52|185|53|(4:57|219|146|147)(32:58|59|221|60|61|203|62|63|211|64|(2:189|66)|70|71|213|72|73|193|74|75|209|76|77|201|78|79|191|80|81|207|82|83|(1:85)(21:86|187|87|88|195|89|90|215|91|92|223|93|94|205|95|96|199|97|(4:99|100|(1:102)(1:103)|104)(1:109)|38|(12:40|(2:42|(1:44)(4:45|46|(1:48)|49))(1:50)|217|51|52|185|53|(1:55)|57|219|146|147)(10:153|(1:155)(1:156)|157|(1:161)|162|(1:164)(1:165)|166|(1:168)|169|170)))|123|108|18|152|38|(12:40|(2:42|(1:44)(4:45|46|(1:48)|49))(1:50)|217|51|52|185|53|(1:55)|57|219|146|147)(10:153|(1:155)(1:156)|157|(2:159|161)|162|(1:164)(1:165)|166|(1:168)|169|170)) */
    /* JADX WARN: Can't wrap try/catch for region: R(21:86|187|87|88|195|89|90|215|91|92|223|93|94|205|95|96|199|97|(4:99|100|(1:102)(1:103)|104)(1:109)|38|(12:40|(2:42|(1:44)(4:45|46|(1:48)|49))(1:50)|217|51|52|185|53|(1:55)|57|219|146|147)(10:153|(1:155)(1:156)|157|(1:161)|162|(1:164)(1:165)|166|(1:168)|169|170)) */
    /* JADX WARN: Can't wrap try/catch for region: R(2:189|66) */
    /* JADX WARN: Can't wrap try/catch for region: R(32:58|59|221|60|61|203|62|63|211|64|(2:189|66)|70|71|213|72|73|193|74|75|209|76|77|201|78|79|191|80|81|207|82|83|(1:85)(21:86|187|87|88|195|89|90|215|91|92|223|93|94|205|95|96|199|97|(4:99|100|(1:102)(1:103)|104)(1:109)|38|(12:40|(2:42|(1:44)(4:45|46|(1:48)|49))(1:50)|217|51|52|185|53|(1:55)|57|219|146|147)(10:153|(1:155)(1:156)|157|(1:161)|162|(1:164)(1:165)|166|(1:168)|169|170))) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:57|219|146|147) */
    /* JADX WARN: Code duplicated, block: B:102:0x0380  */
    /* JADX WARN: Code duplicated, block: B:103:0x0382  */
    /* JADX WARN: Code duplicated, block: B:109:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:153:0x0460  */
    /* JADX WARN: Code duplicated, block: B:155:0x046e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0470  */
    /* JADX WARN: Code duplicated, block: B:159:0x0493  */
    /* JADX WARN: Code duplicated, block: B:164:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:165:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:168:0x04c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:178:0x0500  */
    /* JADX WARN: Code duplicated, block: B:179:0x0503  */
    /* JADX WARN: Code duplicated, block: B:182:0x053f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0163  */
    /* JADX WARN: Code duplicated, block: B:42:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x01e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0202  */
    /* JADX WARN: Code duplicated, block: B:50:0x021e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0246 A[Catch: Exception -> 0x0430, TryCatch #0 {Exception -> 0x0430, blocks: (B:53:0x0237, B:55:0x0246, B:58:0x025d), top: B:185:0x0237 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0368 A[Catch: Exception -> 0x0396, TRY_LEAVE, TryCatch #7 {Exception -> 0x0396, blocks: (B:97:0x0355, B:99:0x0368), top: B:199:0x0355 }] */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0396, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0397, code lost:
    
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0399, code lost:
    
        r3 = r31;
        r5 = r0;
        r6 = r12;
        r2 = r16;
        r0 = r32;
        r27 = r7;
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03bd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03be, code lost:
    
        r12 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03c1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03c2, code lost:
    
        r12 = r18;
        r10 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03c7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03c8, code lost:
    
        r32 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x03cb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x03cc, code lost:
    
        r31 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x03cf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x03d0, code lost:
    
        r31 = r6;
        r32 = r10;
        r12 = r18;
        r10 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03db, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03de, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03eb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03ec, code lost:
    
        r20 = r6;
        r31 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03f1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03f2, code lost:
    
        r20 = r6;
        r31 = r31;
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03fb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03fc, code lost:
    
        r31 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0406, code lost:
    
        r20 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x040b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x040c, code lost:
    
        r31 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x040e, code lost:
    
        r1 = r16;
        r13 = r17;
        r7 = r19;
        r9 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0419, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x041b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x041c, code lost:
    
        r3 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x041f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0420, code lost:
    
        r31 = r10;
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0424, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0425, code lost:
    
        r31 = r10;
        r9 = r2;
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0430, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0431, code lost:
    
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0436, code lost:
    
        r7 = r19;
        r27 = r11;
        r11 = r9;
        r9 = r2;
        r3 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0444, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0446, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x015d, code lost:
    
        com.xiaomi.fit.data.common.log.FitnessLogUtils.e(r2.getTAG(), r0.toString());
        r5 = r16;
        r8 = r7;
        r7 = r6;
        r6 = r32;
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02ad, code lost:
    
        r2 = r4;
        r14 = r5;
        r4 = r12;
        r10 = r17;
        r7 = r19;
        r11 = r20;
        r12 = r23;
        r6 = r18;
        r0 = r31;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:179:0x0503, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x031b -> B:187:0x0326). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object parseDailyData(java.lang.String r30, com.xiaomi.hm.health.bt.sdk.DailyDataResult r31, com.xiaomi.hm.health.bt.sdk.data.RealtimeData r32, kotlin.coroutines.Continuation<? super kotlin.Unit> r33) {
        /*
            Method dump skipped, instruction units count: 1366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager.parseDailyData(java.lang.String, com.xiaomi.hm.health.bt.sdk.DailyDataResult, com.xiaomi.hm.health.bt.sdk.data.RealtimeData, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:38:0x0116 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object parseData(@HuamiSyncType int i, String str, String str2, Continuation<? super Unit> continuation) {
        C15501 c15501;
        String str3;
        HMDeviceSyncManager hMDeviceSyncManager;
        String str4;
        HMDeviceSyncManager hMDeviceSyncManager2;
        String str5;
        ParseResultItem parseResultItem;
        long lastSyncTime;
        int timeZone;
        boolean zIsSuccess;
        int i2 = i;
        String str6 = str;
        if (continuation instanceof C15501) {
            c15501 = (C15501) continuation;
            int i3 = c15501.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c15501.label = i3 - Integer.MIN_VALUE;
            } else {
                c15501 = new C15501(continuation);
            }
        } else {
            c15501 = new C15501(continuation);
        }
        Object obj = c15501.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c15501.label;
        if (i4 != 0) {
            if (i4 == 1) {
                i2 = c15501.I$0;
                String str7 = (String) c15501.L$2;
                String str8 = (String) c15501.L$1;
                hMDeviceSyncManager = (HMDeviceSyncManager) c15501.L$0;
                ResultKt.throwOnFailure(obj);
                str3 = str7;
                str6 = str8;
            } else if (i4 == 2) {
                i2 = c15501.I$0;
                String str9 = (String) c15501.L$3;
                String str10 = (String) c15501.L$2;
                String str11 = (String) c15501.L$1;
                HMDeviceSyncManager hMDeviceSyncManager3 = (HMDeviceSyncManager) c15501.L$0;
                ResultKt.throwOnFailure(obj);
                str4 = str10;
                hMDeviceSyncManager2 = hMDeviceSyncManager3;
                str5 = str9;
                str6 = str11;
                parseResultItem = (ParseResultItem) obj;
                lastSyncTime = parseResultItem.getLastSyncTime();
                timeZone = parseResultItem.getTimeZone();
                zIsSuccess = parseResultItem.isSuccess();
                FitnessLogUtils.i(hMDeviceSyncManager2.getTAG(), "parseData synctype=" + i2 + " parseResult=" + zIsSuccess + "**lastSyncTime=" + lastSyncTime + "**tz=" + timeZone);
                if (zIsSuccess) {
                    if (lastSyncTime > 0) {
                        hMDeviceSyncManager2.setTheLastSyncTime(str5, new LastSyncTimeItem(parseResultItem.getTimeZone(), lastSyncTime));
                    }
                    HMSyncServerManager.INSTANCE.saveFile(str5, lastSyncTime, str4, timeZone);
                }
                c15501.L$0 = null;
                c15501.L$1 = null;
                c15501.L$2 = null;
                c15501.L$3 = null;
                c15501.label = 3;
                if (hMDeviceSyncManager2.updateDataTypeParseResult(str6, i2, zIsSuccess, c15501) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        c15501.L$0 = this;
        c15501.L$1 = str6;
        str3 = str2;
        c15501.L$2 = str3;
        c15501.I$0 = i2;
        c15501.label = 1;
        if (addDataTypeToParse(str6, i2, c15501) == coroutine_suspended) {
            return coroutine_suspended;
        }
        hMDeviceSyncManager = this;
        HuaMiParseType huaMiParseTypeConvertHMParseType = hMDeviceSyncManager.convertHMParseType(i2);
        if (huaMiParseTypeConvertHMParseType == null) {
            return Unit.INSTANCE;
        }
        String strConvertHMKey = hMDeviceSyncManager.convertHMKey(i2);
        IHuamiDataParse hmDataParse = hMDeviceSyncManager.getHmDataParse();
        c15501.L$0 = hMDeviceSyncManager;
        c15501.L$1 = str6;
        c15501.L$2 = str3;
        c15501.L$3 = strConvertHMKey;
        c15501.I$0 = i2;
        c15501.label = 2;
        Object objDataParse = hmDataParse.dataParse(huaMiParseTypeConvertHMParseType, str6, str3, c15501);
        if (objDataParse == coroutine_suspended) {
            return coroutine_suspended;
        }
        str4 = str3;
        obj = objDataParse;
        hMDeviceSyncManager2 = hMDeviceSyncManager;
        str5 = strConvertHMKey;
        parseResultItem = (ParseResultItem) obj;
        lastSyncTime = parseResultItem.getLastSyncTime();
        timeZone = parseResultItem.getTimeZone();
        zIsSuccess = parseResultItem.isSuccess();
        FitnessLogUtils.i(hMDeviceSyncManager2.getTAG(), "parseData synctype=" + i2 + " parseResult=" + zIsSuccess + "**lastSyncTime=" + lastSyncTime + "**tz=" + timeZone);
        if (zIsSuccess) {
            if (lastSyncTime > 0) {
                hMDeviceSyncManager2.setTheLastSyncTime(str5, new LastSyncTimeItem(parseResultItem.getTimeZone(), lastSyncTime));
            }
            HMSyncServerManager.INSTANCE.saveFile(str5, lastSyncTime, str4, timeZone);
        }
        c15501.L$0 = null;
        c15501.L$1 = null;
        c15501.L$2 = null;
        c15501.L$3 = null;
        c15501.label = 3;
        if (hMDeviceSyncManager2.updateDataTypeParseResult(str6, i2, zIsSuccess, c15501) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00dd -> B:33:0x00df). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object parseDayDataList(@com.xiaomi.fit.data.common.data.annotation.HuamiSyncType int r25, java.lang.String r26, java.util.List<java.lang.String> r27, kotlin.coroutines.Continuation<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager.parseDayDataList(int, java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0162  */
    /* JADX WARN: Code duplicated, block: B:35:0x01ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x0216  */
    /* JADX WARN: Code duplicated, block: B:41:0x022e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0231  */
    /* JADX WARN: Code duplicated, block: B:44:0x0238  */
    /* JADX WARN: Code duplicated, block: B:47:0x0279 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x027a  */
    /* JADX WARN: Code duplicated, block: B:51:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x027a -> B:49:0x0283). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object parseSport(java.lang.String r36, java.util.List<? extends com.xiaomi.hm.health.bt.sdk.sport.SportItem> r37, kotlin.coroutines.Continuation<? super kotlin.Unit> r38) {
        /*
            Method dump skipped, instruction units count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager.parseSport(java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object parseTLData(String str, List<? extends BleFirstbeat> list, Continuation<? super Unit> continuation) {
        List<? extends BleFirstbeat> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "syncTrainingLoad: no data");
            return Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (BleFirstbeat bleFirstbeat : list) {
            if (bleFirstbeat.weeklyTLSum <= 0) {
                FitnessLogUtils.i(getTAG(), "(" + ((int) bleFirstbeat.dayId) + ") wtlSum=0, abort");
            } else {
                String json = getMGson().toJson(bleFirstbeat);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                arrayList.add(json);
            }
        }
        Object dayDataList = parseDayDataList(8, str, arrayList, continuation);
        return dayDataList == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? dayDataList : Unit.INSTANCE;
    }

    private final void postMultySyncTime(String did) {
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new C15531(did, null));
    }

    private final void printRealtimeData(HuamiApiCaller huamiDevice) {
        RealtimeData realtimeData = huamiDevice.getRealtimeData();
        if (realtimeData != null) {
            FitnessLogUtils.i(getTAG(), "realTime calories = " + realtimeData.getTotalCal() + ", steps = " + realtimeData.getTotalStep() + ", distance = " + realtimeData.getTotalDis());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTheLastSyncTime(String key, long lastSyncTime) {
        if (lastSyncTime > 0) {
            setTheLastSyncTime(key, new LastSyncTimeItem(FitnessDateUtils.getCurrentTZOffsetIn15min(), lastSyncTime));
        }
    }

    private final void startSync(final String did, final HuamiApiCaller huamiDevice) {
        cancelDoingTask();
        FitnessDataSyncBaseImpl.checkAllDataToSynced$default(this, did, null, null, false, 14, null);
        this.mFutureTask = this.mSingleExecutors.submit(new Runnable() { // from class: bdb
            @Override // java.lang.Runnable
            public final void run() {
                HMDeviceSyncManager.startSync$lambda$5(this.f4083a, huamiDevice, did);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startSync$lambda$5(HMDeviceSyncManager this$0, HuamiApiCaller huamiDevice, String did) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(huamiDevice, "$huamiDevice");
        Intrinsics.checkNotNullParameter(did, "$did");
        this$0.syncDailyData(huamiDevice, did);
        this$0.syncActivityData(huamiDevice, did);
        this$0.syncHrData(huamiDevice, did);
        this$0.syncRestHr(huamiDevice, did);
        this$0.syncSingleStressData(huamiDevice, did);
        this$0.syncAllDayStressData(huamiDevice, did);
        this$0.syncSportData(huamiDevice, did);
        this$0.syncPaiData(huamiDevice, did);
        this$0.syncSpo2Data(huamiDevice, did);
        this$0.syncAFibData(huamiDevice, did);
        this$0.syncTrainingLoad(huamiDevice, did);
        this$0.syncLowSpo2Data(huamiDevice, did);
        this$0.syncAbnormalHrData(huamiDevice, did);
    }

    private final void syncAFibData(HuamiApiCaller huamiDevice, final String did) {
        long lastSyncTime = getTheLastSyncTime("huami_atrial_fibrillation_record").getLastSyncTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(lastSyncTime);
        FitnessLogUtils.i(getTAG(), "syncAFibData, time = " + lastSyncTime);
        huamiDevice.startSyncAtrialFibData(calendar, new IAtrialFibCallback() { // from class: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager.syncAFibData.1
            @Override // com.xiaomi.hm.health.bt.sdk.IAtrialFibCallback
            public void onResult(boolean b2) {
                ScopeExtKt.scope(Dispatchers.getIO(), new HMDeviceSyncManager$syncAFibData$1$onResult$1(HMDeviceSyncManager.this, b2, did, null));
            }

            @Override // com.xiaomi.hm.health.bt.sdk.IAtrialFibCallback
            public void onResultData(List<? extends HmAfData> list) {
                boolean z = list != null && (list.isEmpty() ^ true);
                FitnessLogUtils.i(HMDeviceSyncManager.this.getTAG(), "syncAFibData hasData = " + z);
                if (z) {
                    int currentTZOffsetIn15min = FitnessDateUtils.getCurrentTZOffsetIn15min();
                    AFibData aFibData = new AFibData();
                    aFibData.setGeneratedTime(new ArrayList());
                    aFibData.setTimeZone(currentTZOffsetIn15min);
                    Intrinsics.checkNotNull(list);
                    for (HmAfData hmAfData : list) {
                        if (hmAfData.getActive() == 1) {
                            long seconds = TimeUnit.MILLISECONDS.toSeconds(hmAfData.getTimestamp());
                            List<Long> generatedTime = aFibData.getGeneratedTime();
                            Intrinsics.checkNotNull(generatedTime, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Long>");
                            ((ArrayList) generatedTime).add(Long.valueOf(seconds));
                        }
                    }
                    ScopeExtKt.scope(Dispatchers.getIO(), new HMDeviceSyncManager$syncAFibData$1$onResultData$1(HMDeviceSyncManager.this, did, aFibData, null));
                }
            }
        });
    }

    private final void syncAbnormalHrData(HuamiApiCaller huamiDevice, String did) {
        String str;
        long j;
        FitnessLogUtils.i(getTAG(), "syncAbnormalHrData: support(" + huamiDevice.supportHrDetectionData() + ")");
        if (!huamiDevice.supportHrDetectionData()) {
            FitnessLogUtils.i(getTAG(), "syncAbnormalHrData: not support");
            ScopeExtKt.scope(Dispatchers.getIO(), new C15551(did, null));
            return;
        }
        String str2 = "huami_hl_heart_rate";
        long lastSyncTime = getTheLastSyncTime("huami_hl_heart_rate").getLastSyncTime();
        FitnessLogUtils.i(getTAG(), "start syncAbnormalHrData： time = " + lastSyncTime);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(lastSyncTime);
        Intrinsics.checkNotNull(calendar);
        List<HighOrLowHrNotificationData> hrDetectionData = huamiDevice.getHrDetectionData(calendar);
        List<HighOrLowHrNotificationData> list = hrDetectionData;
        if (list == null || list.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "syncAbnormalHrData: no data");
            ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass2(did, null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hrDetectionData.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            HighOrLowHrNotificationData highOrLowHrNotificationData = (HighOrLowHrNotificationData) it.next();
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = it;
            long j3 = 0;
            long j4 = 0;
            for (HighOrLowHr highOrLowHr : highOrLowHrNotificationData.getHighOrLowHr()) {
                if (highOrLowHr.getTime() <= 0 || highOrLowHr.getValue() <= 0) {
                    j = j4;
                } else {
                    long time = highOrLowHr.getTime() / ((long) 1000);
                    arrayList3.add(new AbnormalItem(time, highOrLowHr.getValue()));
                    if (j3 == 0 || j3 > time) {
                        j3 = time;
                    }
                    j = j4;
                    if (time > j) {
                        j4 = time;
                    }
                }
                j4 = j;
            }
            long j5 = j4;
            long timestamp = highOrLowHrNotificationData.getTimestamp() / ((long) 1000);
            String tag = getTAG();
            int threshold = highOrLowHrNotificationData.getThreshold();
            StringBuilder sb = new StringBuilder();
            String str3 = str2;
            sb.append("syncAbnormalHrData: abnormal hr (");
            sb.append(j3);
            sb.append(" - ");
            sb.append(j5);
            sb.append("), time(");
            sb.append(timestamp);
            sb.append("), threshold(");
            sb.append(threshold);
            sb.append(")");
            FitnessLogUtils.i(tag, sb.toString());
            if (j3 > 0 && j3 <= timestamp) {
                SegmentItem segmentItem = new SegmentItem(j3, timestamp, arrayList3, 0, 8, null);
                if (highOrLowHrNotificationData.getThreshold() >= 100) {
                    arrayList2.add(segmentItem);
                } else if (highOrLowHrNotificationData.getThreshold() <= 50) {
                    arrayList.add(segmentItem);
                }
                if (timestamp > j2) {
                    j2 = timestamp;
                }
            }
            it = it2;
            str2 = str3;
        }
        String str4 = str2;
        if (!arrayList2.isEmpty()) {
            FitnessDataRecorder fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
            int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
            SegmentItem[] segmentItemArr = (SegmentItem[]) arrayList2.toArray(new SegmentItem[0]);
            str = did;
            fitnessDataExtKt.recordAbnormalHrHigh(str, currentTZOffsetInSec, (SegmentItem[]) Arrays.copyOf(segmentItemArr, segmentItemArr.length));
        } else {
            str = did;
        }
        if (!arrayList.isEmpty()) {
            FitnessDataRecorder fitnessDataExtKt2 = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
            int currentTZOffsetInSec2 = FitnessDateUtils.getCurrentTZOffsetInSec();
            SegmentItem[] segmentItemArr2 = (SegmentItem[]) arrayList.toArray(new SegmentItem[0]);
            fitnessDataExtKt2.recordAbnormalHrLow(str, currentTZOffsetInSec2, (SegmentItem[]) Arrays.copyOf(segmentItemArr2, segmentItemArr2.length));
        }
        setTheLastSyncTime(str4, j2);
        ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass4(str, null));
    }

    private final void syncActivityData(HuamiApiCaller huamiDevice, final String did) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel == null || DeviceModelExtKt.isPanGu(wearableDeviceModel) || DeviceModelExtKt.isKongMing(wearableDeviceModel)) {
            FitnessLogUtils.i(getTAG(), "syncActivityData: no support device");
            ScopeExtKt.scope(Dispatchers.getIO(), new C15561(did, null));
            return;
        }
        long lastSyncTime = getTheLastSyncTime("huami_vitality_index").getLastSyncTime();
        FitnessLogUtils.i(getTAG(), "start syncActivityData-stand： time = " + lastSyncTime);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(lastSyncTime);
        Intrinsics.checkNotNull(calendar);
        huamiDevice.syncActivityDataFromDevice(calendar, new AbsActivityTodayCallback() { // from class: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager.syncActivityData.2
            @Override // com.xiaomi.hm.health.bt.sdk.AbsActivityTodayCallback
            public void onDataPulled(ArrayList<ActivityData> p0) {
                FitnessLogUtils.i(HMDeviceSyncManager.this.getTAG(), "syncActivityData-onDataPulled");
                ScopeExtKt.scope(Dispatchers.getIO(), new HMDeviceSyncManager$syncActivityData$2$onDataPulled$1(p0, HMDeviceSyncManager.this, did, null));
            }
        });
    }

    private final void syncAllDayStressData(HuamiApiCaller huamiDevice, final String did) {
        long lastSyncTime = getTheLastSyncTime("huami_all_day_stress_record").getLastSyncTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(lastSyncTime);
        FitnessLogUtils.i(getTAG(), "syncAllDayStressData, time = " + lastSyncTime);
        huamiDevice.startSyncPressureDataAllDay(getAccountId(), calendar, new ISyncPressureDataAllDayCallback() { // from class: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager.syncAllDayStressData.1
            @Override // com.xiaomi.hm.health.bt.sdk.ISyncPressureDataAllDayCallback
            public void onPressureData(String s) {
                Intrinsics.checkNotNullParameter(s, "s");
                ScopeExtKt.scope(Dispatchers.getIO(), new HMDeviceSyncManager$syncAllDayStressData$1$onPressureData$1(HMDeviceSyncManager.this, did, s, null));
            }

            @Override // com.xiaomi.hm.health.bt.sdk.ISyncPressureDataAllDayCallback
            public void onPressureStart() {
                FitnessLogUtils.i(HMDeviceSyncManager.this.getTAG(), "syncAllDayStressData -- onPressureStart");
            }

            @Override // com.xiaomi.hm.health.bt.sdk.ISyncPressureDataAllDayCallback
            public void onPressureStop(boolean b2) {
                ScopeExtKt.scope(Dispatchers.getIO(), new HMDeviceSyncManager$syncAllDayStressData$1$onPressureStop$1(HMDeviceSyncManager.this, b2, did, null));
            }
        });
    }

    private final void syncDailyData(HuamiApiCaller huamiDevice, String did) {
        GenderExt genderExt;
        List listSplit$default;
        LastSyncTimeItem theLastSyncTime = getTheLastSyncTime("huami_regular_record");
        long lastSyncTime = theLastSyncTime.getLastSyncTime();
        int timeZone = theLastSyncTime.getTimeZone();
        FitnessLogUtils.i(getTAG(), "syncDailyData time = " + lastSyncTime + ", tz = " + timeZone);
        UserInfoExt userInfoExt = new UserInfoExt();
        String[] strArr = null;
        UserProfile userProfile$default = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null);
        userInfoExt.setHeight((short) ((int) userProfile$default.getHeight()));
        userInfoExt.setWeight((short) ((int) userProfile$default.getWeight()));
        if (Intrinsics.areEqual("male", userProfile$default.getSex())) {
            genderExt = GenderExt.MALE;
        } else {
            genderExt = Intrinsics.areEqual("female", userProfile$default.getSex()) ? GenderExt.FEMALE : GenderExt.UNSPECIFIED;
        }
        userInfoExt.setGender(genderExt);
        try {
            String birth = userProfile$default.getBirth();
            if (birth != null && (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) birth, new String[]{"-"}, false, 0, 6, (Object) null)) != null) {
                strArr = (String[]) listSplit$default.toArray(new String[0]);
            }
            if (strArr != null && strArr.length > 2) {
                userInfoExt.setBirthDate(new BirthDateExt(Short.parseShort(strArr[0]), Byte.parseByte(strArr[1]), Byte.parseByte(strArr[2])));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ScopeExtKt.scope(Dispatchers.getIO(), new C15591(did, huamiDevice.getDailyData(lastSyncTime, timeZone, userInfoExt, null, true, new IDailyDataSyncCallback() { // from class: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncDailyData$result$1
            @Override // com.xiaomi.hm.health.bt.sdk.IDailyDataSyncCallback
            public void onActivityDataSyncFinish() {
                FitnessLogUtils.i(this.this$0.getTAG(), "syncDailyData: onActivityDataSyncFinish");
            }

            @Override // com.xiaomi.hm.health.bt.sdk.IDailyDataSyncCallback
            public void onOsaDataSyncFinish() {
                FitnessLogUtils.i(this.this$0.getTAG(), "syncDailyData: onOsaDataSyncFinish");
            }
        }), huamiDevice, null));
        printRealtimeData(huamiDevice);
    }

    private final void syncHrData(HuamiApiCaller huamiDevice, String did) {
        LastSyncTimeItem theLastSyncTime = getTheLastSyncTime("huami_manual_heartrate_record");
        long lastSyncTime = theLastSyncTime.getLastSyncTime();
        int timeZone = theLastSyncTime.getTimeZone();
        FitnessLogUtils.i(getTAG(), "syncHrData time = " + lastSyncTime + ",tz=" + timeZone);
        ScopeExtKt.scope(Dispatchers.getIO(), new C15601(did, huamiDevice.getHrData(lastSyncTime, timeZone), null));
    }

    private final boolean syncHuamiData(WearableDeviceModel deviceModel) {
        String mac = DeviceModelExtKt.getMac(deviceModel);
        final String did = deviceModel.getDid();
        final HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(mac);
        if (huaMiApiCaller == null) {
            FitnessLogUtils.w(getTAG(), "no huamiDevice");
            return false;
        }
        if (!TextUtils.equals(this.lastSyncDid, did)) {
            FitnessLogUtils.i(getTAG(), "first sync when app start, or switch device");
            this.syncTimeMap.clear();
        }
        this.lastSyncDid = did;
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new C15611(did, huaMiApiCaller, null)).m503catch(new Function2() { // from class: xcb
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HMDeviceSyncManager.syncHuamiData$lambda$3(this.f38967a, did, huaMiApiCaller, (AndroidScope) obj, (Throwable) obj2);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncHuamiData$lambda$3(HMDeviceSyncManager this$0, String did, HuamiApiCaller huamiApiCaller, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.startSync(did, huamiApiCaller);
        return Unit.INSTANCE;
    }

    private final void syncLowSpo2Data(HuamiApiCaller huamiDevice, String did) {
        FitnessLogUtils.i(getTAG(), "syncLowSpo2Data: support(" + huamiDevice.supportLowOsaData() + ")");
        if (!huamiDevice.supportLowOsaData()) {
            FitnessLogUtils.i(getTAG(), "syncLowSpo2Data: not support");
            ScopeExtKt.scope(Dispatchers.getIO(), new C15621(did, null));
            return;
        }
        long lastSyncTime = getTheLastSyncTime("huami_low_spo2").getLastSyncTime();
        FitnessLogUtils.i(getTAG(), "start syncLowSpo2Data： time = " + lastSyncTime);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(lastSyncTime);
        Intrinsics.checkNotNull(calendar);
        List<LowOsaNotificationData> lowOsaDetectionData = huamiDevice.getLowOsaDetectionData(calendar);
        List<LowOsaNotificationData> list = lowOsaDetectionData;
        if (list == null || list.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "syncLowSpo2Data: no data");
            ScopeExtKt.scope(Dispatchers.getIO(), new C15632(did, null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        long j = 0;
        long j2 = 0;
        for (LowOsaNotificationData lowOsaNotificationData : lowOsaDetectionData) {
            ArrayList arrayList2 = new ArrayList();
            for (LowOsaValue lowOsaValue : lowOsaNotificationData.getRealTimeOsa()) {
                if (lowOsaValue.getTime() > j && lowOsaValue.getValue() > 0) {
                    arrayList2.add(new AbnormalItem(lowOsaValue.getTime(), lowOsaValue.getValue()));
                }
                j = 0;
            }
            long j3 = 1000;
            long startTime = lowOsaNotificationData.getStartTime() / j3;
            long endTime = lowOsaNotificationData.getEndTime() / j3;
            FitnessLogUtils.i(getTAG(), "syncLowSpo2Data-lowSpo2(" + startTime + "-" + endTime + ")");
            arrayList.add(new SegmentItem(startTime, endTime, arrayList2, 0, 8, null));
            if (endTime > j2) {
                j2 = endTime;
            }
            j = 0;
        }
        if (!arrayList.isEmpty()) {
            FitnessDataRecorder fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
            int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
            SegmentItem[] segmentItemArr = (SegmentItem[]) arrayList.toArray(new SegmentItem[0]);
            fitnessDataExtKt.recordAbnormalSpo2(did, currentTZOffsetInSec, (SegmentItem[]) Arrays.copyOf(segmentItemArr, segmentItemArr.length));
        }
        setTheLastSyncTime("huami_low_spo2", j2);
        ScopeExtKt.scope(Dispatchers.getIO(), new C15644(did, null));
    }

    private final void syncPaiData(final HuamiApiCaller huamiDevice, final String did) {
        if (huamiDevice == null) {
            FitnessLogUtils.d(getTAG(), "startSyncPaiData but huamiDevice is null");
            return;
        }
        long lastSyncTime = getTheLastSyncTime("huami_pai_record").getLastSyncTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(lastSyncTime);
        FitnessLogUtils.i(getTAG(), "syncPaiData lastSyncCalendar time= " + lastSyncTime);
        huamiDevice.startSyncPaiData(calendar, new ISyncPaiCallback() { // from class: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager.syncPaiData.1
            @Override // com.xiaomi.hm.health.bt.sdk.ISyncPaiCallback
            public void onFinish(PaiDataResult paiDataResult) {
                ScopeExtKt.scope(Dispatchers.getIO(), new HMDeviceSyncManager$syncPaiData$1$onFinish$1(HMDeviceSyncManager.this, did, paiDataResult, huamiDevice, null));
            }

            @Override // com.xiaomi.hm.health.bt.sdk.ISyncPaiCallback
            public void onProgress(Progress progress) {
                Intrinsics.checkNotNullParameter(progress, "progress");
                FitnessLogUtils.d(HMDeviceSyncManager.this.getTAG(), "syncPaiData onProgress" + progress);
            }

            @Override // com.xiaomi.hm.health.bt.sdk.ISyncPaiCallback
            public void onStart() {
                FitnessLogUtils.d(HMDeviceSyncManager.this.getTAG(), "syncPaiData onStart");
            }
        });
    }

    private final void syncRestHr(HuamiApiCaller huamiDevice, String did) {
        if (!HMParseUtilKt.isSupportSyncRestHr(did)) {
            FitnessLogUtils.i(getTAG(), "syncRestHr: device not support(" + did + ")");
            ScopeExtKt.scope(Dispatchers.getIO(), new C15661(did, null));
            return;
        }
        LastSyncTimeItem theLastSyncTime = getTheLastSyncTime("huami_rest_heart_rate");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(theLastSyncTime.getLastSyncTime());
        FitnessLogUtils.i(getTAG(), "syncRestHr: time = " + calendar.getTimeInMillis());
        Intrinsics.checkNotNull(calendar);
        List<RestHeartRate> restHeartRate = huamiDevice.getRestHeartRate(calendar);
        ScopeExtKt.scope(Dispatchers.getIO(), new C15672(did, null));
        List<RestHeartRate> list = restHeartRate;
        if (list == null || list.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "syncRestHr: no data");
            return;
        }
        FitnessLogUtils.i(getTAG(), "syncRestHr: data size(" + restHeartRate.size() + ")");
        ArrayList arrayList = new ArrayList();
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        long j = 0;
        for (RestHeartRate restHeartRate2 : restHeartRate) {
            FitnessLogUtils.i(getTAG(), "syncRestHr: time=" + restHeartRate2.getCalendar().getTime() + ", hr=" + restHeartRate2.getHr());
            if (restHeartRate2.getHr() > 0) {
                long timeInMillis = restHeartRate2.getCalendar().getTimeInMillis() / ((long) 1000);
                arrayList.add(new RestHrItem(timeInMillis, restHeartRate2.getHr()));
                if (j < timeInMillis) {
                    j = 1 + timeInMillis;
                }
            }
        }
        FitnessDataRecorder fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
        RestHrItem[] restHrItemArr = (RestHrItem[]) arrayList.toArray(new RestHrItem[0]);
        fitnessDataExtKt.recordRestHr(did, currentTZOffsetInSec, (RestHrItem[]) Arrays.copyOf(restHrItemArr, restHrItemArr.length));
        setTheLastSyncTime("huami_rest_heart_rate", j);
    }

    private final void syncSingleStressData(HuamiApiCaller huamiDevice, final String did) {
        long lastSyncTime = getTheLastSyncTime("huami_single_stress_record").getLastSyncTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(lastSyncTime);
        FitnessLogUtils.i(getTAG(), "syncSingleStressData, time = " + lastSyncTime);
        huamiDevice.startSyncPressureDataSingle(getAccountId(), calendar, new ISyncPressureDataSingleCallback() { // from class: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager.syncSingleStressData.1
            @Override // com.xiaomi.hm.health.bt.sdk.ISyncPressureDataSingleCallback
            public void onPressureData(String s) {
                Intrinsics.checkNotNullParameter(s, "s");
                ScopeExtKt.scope(Dispatchers.getIO(), new HMDeviceSyncManager$syncSingleStressData$1$onPressureData$1(HMDeviceSyncManager.this, did, s, null));
            }

            @Override // com.xiaomi.hm.health.bt.sdk.ISyncPressureDataSingleCallback
            public void onPressureStart() {
                FitnessLogUtils.i(HMDeviceSyncManager.this.getTAG(), "syncSingleStressData -- onPressureStart");
            }

            @Override // com.xiaomi.hm.health.bt.sdk.ISyncPressureDataSingleCallback
            public void onPressureStop(boolean b2) {
                ScopeExtKt.scope(Dispatchers.getIO(), new HMDeviceSyncManager$syncSingleStressData$1$onPressureStop$1(HMDeviceSyncManager.this, b2, did, null));
            }
        });
    }

    private final void syncSpo2Data(HuamiApiCaller huamiDevice, final String did) {
        long lastSyncTime = getTheLastSyncTime("huami_manual_measure_record").getLastSyncTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(lastSyncTime);
        FitnessLogUtils.i(getTAG(), "syncSpo2Data, time = " + lastSyncTime);
        huamiDevice.startSyncSpO2Data(calendar, new ISpO2Callback() { // from class: wcb
            @Override // com.xiaomi.hm.health.bt.sdk.ISpO2Callback
            public final void onResult(List list) {
                HMDeviceSyncManager.syncSpo2Data$lambda$10(this.f37836a, did, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void syncSpo2Data$lambda$10(HMDeviceSyncManager this$0, String did, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        ScopeExtKt.scope(Dispatchers.getIO(), new HMDeviceSyncManager$syncSpo2Data$1$1(this$0, did, list, null));
    }

    private final void syncSportData(HuamiApiCaller huamiDevice, final String did) {
        long lastSyncTime = getTheLastSyncTime("huami_sport_report").getLastSyncTime();
        long lastSyncTime2 = getTheLastSyncTime("huami_sport_record").getLastSyncTime();
        if (lastSyncTime >= lastSyncTime2) {
            lastSyncTime = lastSyncTime2;
        }
        FitnessLogUtils.i(getTAG(), "syncSportData time = " + lastSyncTime);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(lastSyncTime);
        huamiDevice.startSyncGpsData(calendar, new IHMSportDataCallback() { // from class: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager.syncSportData.1
            @Override // com.xiaomi.hm.health.bt.sdk.IHMSportDataCallback
            public void onData(SportResult sportResult) {
                FitnessLogUtils.d(HMDeviceSyncManager.this.getTAG(), "syncSportData ---onData");
                if (sportResult != null) {
                    ScopeExtKt.scope(Dispatchers.getIO(), new HMDeviceSyncManager$syncSportData$1$onData$1(HMDeviceSyncManager.this, did, sportResult, null));
                }
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
            public void onFinish(boolean b2) {
                ScopeExtKt.scope(Dispatchers.getIO(), new HMDeviceSyncManager$syncSportData$1$onFinish$1(HMDeviceSyncManager.this, did, null));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
            public void onProgress(Progress progress) {
                Intrinsics.checkNotNullParameter(progress, "progress");
                FitnessLogUtils.d(HMDeviceSyncManager.this.getTAG(), "syncSportData ---onProgress: " + progress);
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
            public void onStart() {
                FitnessLogUtils.i(HMDeviceSyncManager.this.getTAG(), "syncSportData ---onStart");
            }
        });
    }

    private final void syncTrainingLoad(HuamiApiCaller huamiDevice, final String did) {
        if (!huamiDevice.supportFirstbeat()) {
            FitnessLogUtils.i(getTAG(), "syncTrainingLoad: not support");
            ScopeExtKt.scope(Dispatchers.getIO(), new C15701(did, null));
            return;
        }
        long lastSyncTime = getTheLastSyncTime("huami_training_load_record").getLastSyncTime();
        FitnessLogUtils.i(getTAG(), "start syncTrainingLoad： time = " + lastSyncTime);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(lastSyncTime);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(System.currentTimeMillis());
        Intrinsics.checkNotNull(calendar);
        Intrinsics.checkNotNull(calendar2);
        huamiDevice.startSyncFirstbeatData(calendar, calendar2, new IHMFirstbeatDataCallback() { // from class: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager.syncTrainingLoad.2
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
            public void onData(List<GpsRecord> p0) {
                FitnessLogUtils.i(HMDeviceSyncManager.this.getTAG(), "syncTrainingLoad: onData");
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
            public void onFinish(boolean p0) {
                FitnessLogUtils.i(HMDeviceSyncManager.this.getTAG(), "syncTrainingLoad: onFinish result = " + p0);
                ScopeExtKt.scope(Dispatchers.getIO(), new HMDeviceSyncManager$syncTrainingLoad$2$onFinish$1(HMDeviceSyncManager.this, did, null));
            }

            @Override // com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.IHMFirstbeatDataCallback
            public void onFirstbeatData(BleFirstbeatData p0) {
                FitnessLogUtils.i(HMDeviceSyncManager.this.getTAG(), "syncTrainingLoad: onFirstbeatData");
                ScopeExtKt.scope(Dispatchers.getIO(), new HMDeviceSyncManager$syncTrainingLoad$2$onFirstbeatData$1(HMDeviceSyncManager.this, did, p0, null));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
            public void onProgress(Progress p0) {
                FitnessLogUtils.i(HMDeviceSyncManager.this.getTAG(), "syncTrainingLoad: onProgress");
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
            public void onStart() {
                FitnessLogUtils.i(HMDeviceSyncManager.this.getTAG(), "syncTrainingLoad: onStart");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object triggerGetLastSyncTimeAndSync(String str, HuamiApiCaller huamiApiCaller, Continuation<? super Unit> continuation) {
        C15721 c15721;
        HMDeviceSyncManager hMDeviceSyncManager;
        if (continuation instanceof C15721) {
            c15721 = (C15721) continuation;
            int i = c15721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15721.label = i - Integer.MIN_VALUE;
            } else {
                c15721 = new C15721(continuation);
            }
        } else {
            c15721 = new C15721(continuation);
        }
        Object lastSyncTime = c15721.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c15721.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(lastSyncTime);
            FitnessLogUtils.i(getTAG(), "triggerGetLastSyncTimeAndSync");
            FitnessSyncRequest fitnessSyncRequest = this.syncRequest;
            c15721.L$0 = this;
            c15721.L$1 = str;
            c15721.L$2 = huamiApiCaller;
            c15721.label = 1;
            lastSyncTime = fitnessSyncRequest.getLastSyncTime(str, c15721);
            if (lastSyncTime == coroutine_suspended) {
                return coroutine_suspended;
            }
            hMDeviceSyncManager = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            huamiApiCaller = (HuamiApiCaller) c15721.L$2;
            str = (String) c15721.L$1;
            hMDeviceSyncManager = (HMDeviceSyncManager) c15721.L$0;
            ResultKt.throwOnFailure(lastSyncTime);
        }
        List<LastSyncItem> itemList = ((GetLastSyncItem) lastSyncTime).getItemList();
        if (itemList != null) {
            for (LastSyncItem lastSyncItem : itemList) {
                String tag = lastSyncItem.getTag();
                String key = lastSyncItem.getKey();
                long time = lastSyncItem.getTime();
                int timeZone = lastSyncItem.getTimeZone();
                FitnessLogUtils.i(hMDeviceSyncManager.getTAG(), "triggerGetLastSyncTimeAndSync tag=" + tag + "**key=" + key + "**time=" + time);
                if (Intrinsics.areEqual(tag, "bind")) {
                    FitnessPreference.INSTANCE.setLastBindTime(time);
                } else {
                    hMDeviceSyncManager.setTheLastSyncTime(key, new LastSyncTimeItem(timeZone, time));
                }
            }
        }
        hMDeviceSyncManager.startSync(str, huamiApiCaller);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateDataTypeParseResult(String str, @HuamiSyncType int i, boolean z, Continuation<? super Unit> continuation) {
        FitnessLogUtils.i(getTAG(), "updateDataTypeParseResult type = " + i + "**success=" + z);
        FitnessDataId fitnessDataIdCreateParseDataId = createParseDataId(i);
        if (z) {
            Object objOnSyncSuccess$default = FitnessDataSyncBaseImpl.onSyncSuccess$default(this, str, fitnessDataIdCreateParseDataId, 2, 0, continuation, 8, null);
            return objOnSyncSuccess$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOnSyncSuccess$default : Unit.INSTANCE;
        }
        Object objOnSyncError = onSyncError(str, fitnessDataIdCreateParseDataId, 2, continuation);
        return objOnSyncError == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOnSyncError : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateDataTypeSyncedResult(String str, @HuamiSyncType int i, boolean z, Continuation<? super Unit> continuation) {
        FitnessLogUtils.i(getTAG(), "updateDataTypeSyncedResult type = " + i + "**success=" + z);
        FitnessDataId fitnessDataIdCreateSyncDataId = createSyncDataId(i);
        if (z) {
            Object objOnSyncSuccess$default = FitnessDataSyncBaseImpl.onSyncSuccess$default(this, str, fitnessDataIdCreateSyncDataId, 2, 0, continuation, 8, null);
            return objOnSyncSuccess$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOnSyncSuccess$default : Unit.INSTANCE;
        }
        Object objOnSyncError = onSyncError(str, fitnessDataIdCreateSyncDataId, 2, continuation);
        return objOnSyncError == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOnSyncError : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePaiGoal(HuamiApiCaller huamiDevice, PaiDataResult paiDataResult) {
        if ((paiDataResult != null ? paiDataResult.getList() : null) == null || paiDataResult.getList().isEmpty()) {
            return;
        }
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(System.currentTimeMillis() / 1000);
        Iterator<PaiData> it = paiDataResult.getList().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            PaiData next = it.next();
            if (TimeDateUtil.changZeroOfTheDay(next.getTime() / 1000) == jChangZeroOfTheDay) {
                PaiGoalData paiGoalData = huamiDevice.getPaiGoalData(next.getGender(), MathKt__MathJVMKt.roundToInt(next.getDailyPai()), MathKt__MathJVMKt.roundToInt(next.getTotalPai()), next.getMaxHr(), next.getRestHr());
                FitnessLogUtils.i(getTAG(), "updatePaiGoal targetDisparity = " + (paiGoalData != null ? Integer.valueOf(paiGoalData.getTargetDisparity()) : null) + " suggestedHr = " + (paiGoalData != null ? Integer.valueOf(paiGoalData.getSuggestedHeartRate()) : null) + " suggestedTime = " + (paiGoalData != null ? Integer.valueOf(paiGoalData.getSuggestedTime()) : null));
                FitnessPreference fitnessPreference = FitnessPreference.INSTANCE;
                fitnessPreference.setPaiTargetDisparity(paiGoalData != null ? paiGoalData.getTargetDisparity() : 0);
                fitnessPreference.setPaiSuggestHr(paiGoalData != null ? paiGoalData.getSuggestedHeartRate() : 0);
                fitnessPreference.setPaiSuggestTime(paiGoalData != null ? paiGoalData.getSuggestedTime() : 0);
                return;
            }
        }
    }

    private final void writeSleepData(final String did) {
        FitnessLogUtils.i(getTAG(), "writeSleepData: did = " + did);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
        if (wearableDeviceModel == null) {
            FitnessLogUtils.w(getTAG(), "deviceModel is null(did = did)");
            return;
        }
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
        if (huaMiApiCaller == null) {
            FitnessLogUtils.w(getTAG(), "writeSleepData - no huamiDevice");
        } else {
            huaMiApiCaller.writeSleepBack(new u.a() { // from class: com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager.writeSleepData.1
                @Override // com.xiaomi.wearable.hm.u
                public List<HuamiDataWrapper> getData(String startDateStr, String endDateStr, HuamiDataWrapper dataFlag) {
                    DataFlag dataFlag2;
                    Intrinsics.checkNotNullParameter(startDateStr, "startDateStr");
                    Intrinsics.checkNotNullParameter(endDateStr, "endDateStr");
                    try {
                        HMDeviceSyncManager hMDeviceSyncManager = HMDeviceSyncManager.this;
                        if (dataFlag == null || (dataFlag2 = (DataFlag) HuamiDataWrapperKt.asData(dataFlag)) == null) {
                            dataFlag2 = new DataFlag(0);
                        }
                        return HuamiDataWrapperKt.wrapList(hMDeviceSyncManager.getSleepData(startDateStr, endDateStr, dataFlag2, did));
                    } catch (Exception e) {
                        FitnessLogUtils.INSTANCE.w(HMDeviceSyncManager.this.getTAG(), "getSleepData", e);
                        return CollectionsKt__CollectionsKt.emptyList();
                    }
                }
            });
        }
    }

    public final void clear() {
        cancelDoingTask();
    }

    @Override // com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl
    public void confirmFitnessId$fitness_sync_release(@NotNull String sid, @NotNull FitnessDataId dataId) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
    }

    @Override // com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl
    public void handleSpecialSyncResult$fitness_sync_release(@NotNull String did, boolean success) {
        Intrinsics.checkNotNullParameter(did, "did");
        FitnessLogUtils.w(getTAG(), "handleSyncFinishResult did=" + did + "**success=" + success);
        postMultySyncTime(did);
        writeSleepData(did);
        VitaliyDataSender.INSTANCE.getInstance().registerBroadcast();
        HMSyncServerManager.INSTANCE.syncDataToServer(did);
    }

    @Override // com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl
    public void startSyncWithDevice$fitness_sync_release(@NotNull String sid, @Nullable iw9 callback, @Nullable Boolean isBgAutoSync) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        addSyncResultListener(sid, callback);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(sid);
        if (wearableDeviceModel == null) {
            FitnessLogUtils.w(getTAG(), "startSyncWithDevice: null deviceModel(did = did)");
        } else {
            syncHuamiData(wearableDeviceModel);
        }
    }

    @Override // com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl
    public void syncLocalData$fitness_sync_release(@NotNull String sid) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new HMDeviceSyncManager$syncLocalData$1(this, sid, null), 3, null);
    }

    private final void setTheLastSyncTime(String key, LastSyncTimeItem timeItem) {
        if (timeItem.getLastSyncTime() > TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + ((long) 120)) {
            FitnessLogUtils.e(getTAG(), "setTheLastSyncTime: (" + key + ")after current time(" + timeItem.getLastSyncTime() + ")");
            return;
        }
        LastSyncTimeItem lastSyncTimeItem = this.syncTimeMap.get(key);
        if (lastSyncTimeItem == null || lastSyncTimeItem.getLastSyncTime() < timeItem.getLastSyncTime()) {
            this.syncTimeMap.put(key, timeItem);
            FitnessPreference.INSTANCE.setLastSyncTime(key, timeItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object addDataTypeToSync(String str, @HuamiSyncType int i, Continuation<? super Unit> continuation) {
        Object objUpdateSyncStatus = updateSyncStatus(str, createSyncDataId(i), 0, checkForceSyncType(i), continuation);
        return objUpdateSyncStatus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateSyncStatus : Unit.INSTANCE;
    }
}
