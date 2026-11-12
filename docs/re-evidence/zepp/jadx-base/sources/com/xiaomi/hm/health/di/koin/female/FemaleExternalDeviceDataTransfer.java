package com.xiaomi.hm.health.di.koin.female;

import com.amazon.identity.auth.map.device.AccountManagerConstants;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.MenstruationModule;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.device.DeviceCallback;
import com.huami.femalehealth.logiclib.device.DeviceDataTransfer;
import com.huami.femalehealth.logiclib.dto.MenstruationConfigDto;
import com.huami.femalehealth.logiclib.dto.MenstruationDto;
import com.huami.femalehealth.logiclib.dto.MenstruationTotalDto;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateHelperKt;
import com.huami.femalehealth.logiclib.helper.ext.NumberExtKt;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstrualPeriodData;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationConfig;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationRecord;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationState;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationTotalRecord;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\u000e\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/female/FemaleExternalDeviceDataTransfer;", "Lcom/huami/femalehealth/logiclib/device/DeviceDataTransfer;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/bluetooth/profile/channel/module/MenstruationModule;", "b", "Lcom/huami/femalehealth/logiclib/dto/MenstruationConfigDto;", "config", "Lcom/huami/femalehealth/logiclib/device/DeviceCallback;", "writeCallback", "", "writeConfigToDevice", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "data", "writeRecentToDevice", "Lcom/huami/femalehealth/logiclib/dto/MenstruationTotalDto;", "writeToDevice", "readConfigFromDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFromDevice", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FemaleExternalDeviceDataTransfer implements DeviceDataTransfer, KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "FemaleExternalDeviceDataTransfer";
    private static final int b = 1000;
    private static final long c = 4294967295L;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002J\u0019\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0006J\f\u0010\t\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\n\u001a\u00020\u0002*\u00020\u0002H\u0002J\u001d\u0010\r\u001a\u00020\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002J\f\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/female/FemaleExternalDeviceDataTransfer$Companion;", "", "", "a", "millis", GoogleApiAvailabilityLight.a, "(Ljava/lang/Long;)J", "sec", "f", "h", "b", "", "begin", "i", "(Ljava/lang/Long;Z)J", "c", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;", "", "e", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationConfig;", "Lcom/huami/femalehealth/logiclib/dto/MenstruationConfigDto;", "g", "Lcom/huami/femalehealth/logiclib/dto/MenstruationTotalDto;", "data", "convertTotalDtoForDevice", "record", "convertTotalDtoForApp", "FW_DEFAULT", "J", "", "MILLIS_TO_SEC", LogUtil.I, "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MenstruationState.values().length];
                iArr[MenstruationState.IN_PERIOD.ordinal()] = 1;
                iArr[MenstruationState.NO_RECORD.ordinal()] = 2;
                iArr[MenstruationState.NOT_IN_PERIOD.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ MenstruationTotalRecord a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MenstruationTotalRecord menstruationTotalRecord) {
                super(0);
                this.a = menstruationTotalRecord;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "getMenstruationTotalRecord=" + FemaleExternalDeviceDataTransfer.INSTANCE.e(this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ MenstruationRecord a;
            public final /* synthetic */ long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MenstruationRecord menstruationRecord, long j) {
                super(0);
                this.a = menstruationRecord;
                this.b = j;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                DateHelper dateHelper = DateHelper.INSTANCE;
                return "dev.time, from " + DateHelper.convertUTCDate$default(dateHelper, this.a.getCalendar().getTimeInMillis(), false, 2, null) + " to " + DateHelper.convertUTCDate$default(dateHelper, this.b, false, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ MenstruationTotalDto a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(MenstruationTotalDto menstruationTotalDto) {
                super(0);
                this.a = menstruationTotalDto;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "convertTotalDtoForApp dto=" + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationRecord;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function1<MenstruationRecord, CharSequence> {
            public static final d a = new d();

            public d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@NotNull MenstruationRecord menstruationRecord) {
                String strDateFormat = NumberExtKt.dateFormat(menstruationRecord.getCalendar().getTimeInMillis());
                MenstruationState menstruationState = menstruationRecord.getMenstruationState();
                DateHelper dateHelper = DateHelper.INSTANCE;
                Companion companion = FemaleExternalDeviceDataTransfer.INSTANCE;
                return strDateFormat + "," + menstruationState + ",up:" + DateHelper.convertUTCDate$default(dateHelper, companion.b(companion.c(Long.valueOf(companion.f(Long.valueOf(menstruationRecord.getModifyTimeStamp()))), false)), false, 2, null) + "\n";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final long a(long j) {
            if (j == 4294967295L) {
                return 0L;
            }
            return j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long b(long j) {
            if (j == 0) {
                return 0L;
            }
            return j - ((long) Calendar.getInstance().get(16));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long c(Long l, boolean z) {
            if (l == null || l.longValue() == 0) {
                return 0L;
            }
            int i = Calendar.getInstance().get(15);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeZone(TimeZone.getDefault());
            calendar.setTimeInMillis(l.longValue());
            if (z) {
                DateHelperKt.setStartOfDay(calendar);
            }
            return calendar.getTimeInMillis() - ((long) Math.abs(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long d(Long millis) {
            if (millis == null) {
                return 0L;
            }
            return millis.longValue() / ((long) 1000);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String e(MenstruationTotalRecord menstruationTotalRecord) {
            byte version = menstruationTotalRecord.getVersion();
            byte cyclePeriodDays = menstruationTotalRecord.getCyclePeriodDays();
            byte menstruationPeriodDays = menstruationTotalRecord.getMenstruationPeriodDays();
            return "version: " + ((int) version) + ", cycle: " + ((int) cyclePeriodDays) + "\n, period: " + ((int) menstruationPeriodDays) + "\n, lastBegin: " + menstruationTotalRecord.getLastPeriodBeginDay() + "\n, lastEnd: " + menstruationTotalRecord.getLastPeriodEndDay() + "\n, recBegin: " + menstruationTotalRecord.getRecordBeginDay() + "\n, recCnt: " + menstruationTotalRecord.getRecordCount() + "\n, records:\n  " + CollectionsKt___CollectionsKt.joinToString$default(menstruationTotalRecord.getRecords(), null, null, null, 0, null, d.a, 31, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long f(Long sec) {
            if (sec == null) {
                return 0L;
            }
            return sec.longValue() * ((long) 1000);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final MenstruationConfigDto g(MenstruationConfig menstruationConfig) {
            return new MenstruationConfigDto(menstruationConfig.getDeviceNotify(), menstruationConfig.getMenstruationNotify(), menstruationConfig.getMenstruationNotifyDays(), menstruationConfig.getOvulationNotify(), menstruationConfig.getOvulationDays(), menstruationConfig.getSmartPredict());
        }

        private final long h(long j) {
            if (j == 0) {
                return 0L;
            }
            return j + ((long) Calendar.getInstance().get(16));
        }

        private final long i(Long l, boolean z) {
            if (l == null || l.longValue() == 0) {
                return 0L;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeZone(TimeZone.getDefault());
            calendar.setTimeInMillis(l.longValue());
            if (z) {
                DateHelperKt.setStartOfDay(calendar);
            }
            return calendar.getTimeInMillis() + ((long) Calendar.getInstance().get(15));
        }

        @Nullable
        public final MenstruationTotalDto convertTotalDtoForApp(@Nullable MenstruationTotalRecord record) {
            Object next;
            if (record == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            HMLog.info(FemaleExternalDeviceDataTransfer.TAG, new a(record));
            int i = 0;
            boolean z = false;
            for (Object obj : record.getRecords()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                MenstruationRecord menstruationRecord = (MenstruationRecord) obj;
                Companion companion = FemaleExternalDeviceDataTransfer.INSTANCE;
                long jB = companion.b(companion.c(Long.valueOf(menstruationRecord.getCalendar().getTimeInMillis()), false));
                HMLog.verbose(FemaleExternalDeviceDataTransfer.TAG, new b(menstruationRecord, jB));
                boolean z2 = i == record.getRecords().size() - 1;
                int i3 = WhenMappings.$EnumSwitchMapping$0[menstruationRecord.getMenstruationState().ordinal()];
                if (i3 == 1) {
                    Iterator<T> it2 = record.getRecords().subList(i, record.getRecords().size()).iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!(((MenstruationRecord) next).getMenstruationState() != MenstruationState.IN_PERIOD));
                    MenstruationRecord menstruationRecord2 = (MenstruationRecord) next;
                    boolean z3 = (menstruationRecord2 == null ? null : menstruationRecord2.getMenstruationState()) == MenstruationState.NOT_IN_PERIOD;
                    MenstruationDto menstruationDto = new MenstruationDto(jB, true, Long.valueOf(FemaleExternalDeviceDataTransfer.INSTANCE.f(Long.valueOf(menstruationRecord.getModifyTimeStamp()))));
                    menstruationDto.setEnd(Boolean.valueOf(z3));
                    arrayList.add(menstruationDto);
                } else if (i3 == 2 && (!z || !z2)) {
                    arrayList.add(new MenstruationDto(jB, false, Long.valueOf(companion.f(Long.valueOf(menstruationRecord.getModifyTimeStamp())))));
                }
                z = menstruationRecord.getMenstruationState() == MenstruationState.IN_PERIOD;
                i = i2;
            }
            MenstruationTotalDto menstruationTotalDto = new MenstruationTotalDto(record.getVersion(), record.getCyclePeriodDays(), record.getMenstruationPeriodDays(), Long.valueOf(a(c(Long.valueOf(f(Long.valueOf(record.getLastPeriodBeginDay()))), false))), Long.valueOf(a(c(Long.valueOf(f(Long.valueOf(record.getLastPeriodEndDay()))), false))), a(c(Long.valueOf(f(Long.valueOf(record.getRecordBeginDay()))), false)), arrayList.size(), arrayList);
            HMLog.debug(FemaleExternalDeviceDataTransfer.TAG, new c(menstruationTotalDto));
            return menstruationTotalDto;
        }

        @NotNull
        public final MenstruationTotalRecord convertTotalDtoForDevice(@NotNull MenstruationTotalDto data) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            boolean zM3360isEnd = false;
            for (Object obj : CollectionsKt___CollectionsKt.sortedWith(data.getRecords(), new Comparator() { // from class: com.xiaomi.hm.health.di.koin.female.FemaleExternalDeviceDataTransfer$Companion$convertTotalDtoForDevice$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MenstruationDto) t).getTime()), Long.valueOf(((MenstruationDto) t2).getTime()));
                }
            })) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                MenstruationDto menstruationDto = (MenstruationDto) obj;
                Calendar calendar = Calendar.getInstance();
                Companion companion = FemaleExternalDeviceDataTransfer.INSTANCE;
                calendar.setTimeInMillis(companion.h(AidKt.toUTC0(Long.valueOf(menstruationDto.getTime()), false)));
                long jD = companion.d(menstruationDto.getUpdateTime());
                if (menstruationDto.getInPeriod()) {
                    zM3360isEnd = menstruationDto.m3360isEnd();
                    arrayList.add(new MenstruationRecord(calendar, MenstruationState.IN_PERIOD, jD));
                } else {
                    if (zM3360isEnd) {
                        arrayList.add(new MenstruationRecord(calendar, MenstruationState.NOT_IN_PERIOD, jD));
                    } else {
                        arrayList.add(new MenstruationRecord(calendar, MenstruationState.NO_RECORD, jD));
                    }
                    zM3360isEnd = false;
                }
                if (i == data.getRecords().size() - 1 && menstruationDto.getInPeriod()) {
                    MenstruationState menstruationState = menstruationDto.m3360isEnd() ? MenstruationState.NOT_IN_PERIOD : MenstruationState.NO_RECORD;
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(calendar.getTimeInMillis());
                    calendar2.add(5, 1);
                    arrayList.add(new MenstruationRecord(calendar2, menstruationState, jD));
                }
                i = i2;
            }
            return new MenstruationTotalRecord(data.getVersion(), data.getCyclePeriodDays(), data.getMenstruationPeriodDays(), d(Long.valueOf(h(AidKt.toUTC0(data.getLastPeriodBeginDay(), false)))), d(Long.valueOf(h(AidKt.toUTC0(data.getLastPeriodEndDay(), false)))), d(Long.valueOf(h(AidKt.toUTC0(Long.valueOf(data.getRecordBeginDay()), false)))), arrayList.size(), arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.di.koin.female.FemaleExternalDeviceDataTransfer", f = "FemaleExternalDeviceDataTransfer.kt", i = {}, l = {411}, m = "readFromDevice", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return FemaleExternalDeviceDataTransfer.this.readFromDevice(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ MenstruationConfigDto a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MenstruationConfigDto menstruationConfigDto) {
            super(0);
            this.a = menstruationConfigDto;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "writeConfigToDevice, conf=" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ MenstrualPeriodData[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MenstrualPeriodData[] menstrualPeriodDataArr) {
            super(0);
            this.a = menstrualPeriodDataArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            MenstrualPeriodData[] menstrualPeriodDataArr = this.a;
            int length = menstrualPeriodDataArr.length;
            ArrayList arrayList = new ArrayList(menstrualPeriodDataArr.length);
            for (MenstrualPeriodData menstrualPeriodData : menstrualPeriodDataArr) {
                DateHelper dateHelper = DateHelper.INSTANCE;
                Companion companion = FemaleExternalDeviceDataTransfer.INSTANCE;
                arrayList.add("\n" + dateHelper.convertUTCDate(companion.f(Long.valueOf(menstrualPeriodData.getStartTime())), true) + " -> " + dateHelper.convertUTCDate(companion.f(Long.valueOf(menstrualPeriodData.getStopTime())), true) + " " + menstrualPeriodData.getStopped());
            }
            return "writeRecentToDevice, array= size:" + length + " -> " + arrayList + " ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return AccountManagerConstants.CLIENT_ID_PREFIX + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "success", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ DeviceCallback a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Boolean bool) {
                super(0);
                this.a = bool;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "writeRecentToDevice, success=" + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(DeviceCallback deviceCallback) {
            super(1);
            this.a = deviceCallback;
        }

        public final void a(Boolean bool) {
            HMLog.info(FemaleExternalDeviceDataTransfer.TAG, new a(bool));
            DeviceCallback deviceCallback = this.a;
            if (deviceCallback == null) {
                return;
            }
            deviceCallback.onFinish(bool.booleanValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ List<MenstruationVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<MenstruationVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "writeRecentToDevice, array= size:" + DateHelper.convertUTCDate$default(DateHelper.INSTANCE, ((MenstruationVo) CollectionsKt.first((List) this.a)).getDate().getTime(), false, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ MenstruationTotalDto a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MenstruationTotalDto menstruationTotalDto) {
            super(0);
            this.a = menstruationTotalDto;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "writeToDevice, dto=" + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FemaleExternalDeviceDataTransfer() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.di.koin.female.FemaleExternalDeviceDataTransfer$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final MenstruationModule b() {
        HMBaseDevice device = a().getDevice(HMDeviceType.MILI);
        if (device != null && device.isConnected() && (device instanceof HMMiLiProDevice)) {
            return (MenstruationModule) ((HMMiLiProDevice) device).getChannelModule(MenstruationModule.class);
        }
        return null;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.femalehealth.logiclib.device.DeviceDataTransfer
    @Nullable
    public Object readConfigFromDevice(@NotNull Continuation<? super MenstruationConfigDto> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        HMBaseDevice device = a().getDevice(HMDeviceType.MILI);
        if (device == null || !device.isConnected()) {
            Result.Companion companion = Result.Companion;
            safeContinuation.resumeWith(Result.m3845constructorimpl(null));
        }
        if (device instanceof HMMiLiProDevice) {
            ((HMMiLiProDevice) device).getMenstruationConfig(new HMCallback<MenstruationConfig>() { // from class: com.xiaomi.hm.health.di.koin.female.FemaleExternalDeviceDataTransfer$readConfigFromDevice$2$1

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ MenstruationConfig a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(MenstruationConfig menstruationConfig) {
                        super(0);
                        this.a = menstruationConfig;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "readConfigFromDevice, result=" + this.a;
                    }
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(@NotNull MenstruationConfig result) {
                    HMLog.info(FemaleExternalDeviceDataTransfer.TAG, new a(result));
                    Continuation<MenstruationConfigDto> continuation2 = safeContinuation;
                    MenstruationConfigDto menstruationConfigDtoG = FemaleExternalDeviceDataTransfer.INSTANCE.g(result);
                    Result.Companion companion2 = Result.Companion;
                    continuation2.resumeWith(Result.m3845constructorimpl(menstruationConfigDtoG));
                }
            });
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.femalehealth.logiclib.device.DeviceDataTransfer
    @Nullable
    public Object readFromDevice(@NotNull Continuation<? super MenstruationTotalDto> continuation) {
        a aVar;
        Companion companion;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object menstruationTotalRecord = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(menstruationTotalRecord);
            MenstruationModule menstruationModuleB = b();
            if (menstruationModuleB == null) {
                return null;
            }
            Companion companion2 = INSTANCE;
            aVar.a = companion2;
            aVar.d = 1;
            menstruationTotalRecord = menstruationModuleB.getMenstruationTotalRecord(aVar);
            if (menstruationTotalRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
            companion = companion2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = (Companion) aVar.a;
            ResultKt.throwOnFailure(menstruationTotalRecord);
        }
        return companion.convertTotalDtoForApp((MenstruationTotalRecord) menstruationTotalRecord);
    }

    @Override // com.huami.femalehealth.logiclib.device.DeviceDataTransfer
    public void writeConfigToDevice(@NotNull final MenstruationConfigDto config, @Nullable final DeviceCallback writeCallback) {
        HMLog.info(TAG, new b(config));
        HMBaseDevice device = a().getDevice(HMDeviceType.MILI);
        if (device != null && device.isConnected() && (device instanceof HMMiLiProDevice)) {
            if (config.getMenstruationNotify() != null && config.getMenstruationNotifyDays() != null) {
                final boolean zBooleanValue = config.getMenstruationNotify().booleanValue();
                final byte bByteValue = config.getMenstruationNotifyDays().byteValue();
                ((HMMiLiProDevice) device).setMenstruationNotify(zBooleanValue, bByteValue, new HMCallback<Object>() { // from class: com.xiaomi.hm.health.di.koin.female.FemaleExternalDeviceDataTransfer.writeConfigToDevice.2

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.female.FemaleExternalDeviceDataTransfer$writeConfigToDevice$2$a */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ boolean a;
                        public final /* synthetic */ int b;
                        public final /* synthetic */ boolean c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(boolean z, int i, boolean z2) {
                            super(0);
                            this.a = z;
                            this.b = i;
                            this.c = z2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "setMenstruationNotify, set menstruationNotify:" + this.a + ", set menstruationNotifyDays:" + this.b + ", result:" + this.c;
                        }
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(boolean result) {
                        DeviceCallback deviceCallback = writeCallback;
                        if (deviceCallback != null) {
                            deviceCallback.onFinish(result);
                        }
                        HMLog.info(FemaleExternalDeviceDataTransfer.TAG, new a(zBooleanValue, bByteValue, result));
                    }
                });
            }
            if (config.getOvulationNotify() != null && config.getOvulationDays() != null) {
                final boolean zBooleanValue2 = config.getOvulationNotify().booleanValue();
                final byte bByteValue2 = config.getOvulationDays().byteValue();
                ((HMMiLiProDevice) device).setMenstruationOvulation(zBooleanValue2, bByteValue2, new HMCallback<Object>() { // from class: com.xiaomi.hm.health.di.koin.female.FemaleExternalDeviceDataTransfer.writeConfigToDevice.3

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.female.FemaleExternalDeviceDataTransfer$writeConfigToDevice$3$a */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ boolean a;
                        public final /* synthetic */ int b;
                        public final /* synthetic */ boolean c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(boolean z, int i, boolean z2) {
                            super(0);
                            this.a = z;
                            this.b = i;
                            this.c = z2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "setMenstruationOvulation, set ovulationNotify:" + this.a + ", set ovulationDays:" + this.b + ", result:" + this.c;
                        }
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(boolean result) {
                        DeviceCallback deviceCallback = writeCallback;
                        if (deviceCallback != null) {
                            deviceCallback.onFinish(result);
                        }
                        HMLog.info(FemaleExternalDeviceDataTransfer.TAG, new a(zBooleanValue2, bByteValue2, result));
                    }
                });
            }
            if (config.getDeviceNotify() != null) {
                ((HMMiLiProDevice) device).switchMenstruationDeviceNotify(config.getDeviceNotify().booleanValue(), new HMCallback<Object>() { // from class: com.xiaomi.hm.health.di.koin.female.FemaleExternalDeviceDataTransfer.writeConfigToDevice.4

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.female.FemaleExternalDeviceDataTransfer$writeConfigToDevice$4$a */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ MenstruationConfigDto a;
                        public final /* synthetic */ boolean b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(MenstruationConfigDto menstruationConfigDto, boolean z) {
                            super(0);
                            this.a = menstruationConfigDto;
                            this.b = z;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "switchMenstruationDeviceNotify, set deviceNotify:" + this.a.getDeviceNotify() + ", result:" + this.b;
                        }
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(boolean result) {
                        DeviceCallback deviceCallback = writeCallback;
                        if (deviceCallback != null) {
                            deviceCallback.onFinish(result);
                        }
                        HMLog.info(FemaleExternalDeviceDataTransfer.TAG, new a(config, result));
                    }
                });
            }
            if (config.getSmartPredict() != null) {
                ((HMMiLiProDevice) device).switchSmartPredict(config.getSmartPredict().booleanValue(), new HMCallback<Object>() { // from class: com.xiaomi.hm.health.di.koin.female.FemaleExternalDeviceDataTransfer.writeConfigToDevice.5

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.female.FemaleExternalDeviceDataTransfer$writeConfigToDevice$5$a */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ MenstruationConfigDto a;
                        public final /* synthetic */ boolean b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(MenstruationConfigDto menstruationConfigDto, boolean z) {
                            super(0);
                            this.a = menstruationConfigDto;
                            this.b = z;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "switchSmartPredict, set smartPredict:" + this.a.getSmartPredict() + ", result:" + this.b;
                        }
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(boolean result) {
                        DeviceCallback deviceCallback = writeCallback;
                        if (deviceCallback != null) {
                            deviceCallback.onFinish(result);
                        }
                        HMLog.info(FemaleExternalDeviceDataTransfer.TAG, new a(config, result));
                    }
                });
            }
        }
    }

    @Override // com.huami.femalehealth.logiclib.device.DeviceDataTransfer
    public void writeRecentToDevice(@NotNull List<? extends List<MenstruationVo>> data, @Nullable DeviceCallback writeCallback) {
        int size = data.size();
        MenstrualPeriodData[] menstrualPeriodDataArr = new MenstrualPeriodData[size];
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            List<MenstruationVo> list = data.get(i);
            HMLog.warn$default(TAG, null, new f(list), 2, null);
            Companion companion = INSTANCE;
            menstrualPeriodDataArr[i] = new MenstrualPeriodData(companion.d(Long.valueOf(AidKt.toUTC0(Long.valueOf(((MenstruationVo) CollectionsKt.first((List) list)).getDate().getTime()), false))), companion.d(Long.valueOf(AidKt.toUTC0(Long.valueOf(AidKt.toDate(DateHelper.INSTANCE.offsetDay(1, ((MenstruationVo) CollectionsKt.last((List) list)).getDate().getTime())).getTime()), false))), ((MenstruationVo) CollectionsKt.first((List) list)).isEnd());
            i++;
        }
        ArraysKt___ArraysKt.reverse(menstrualPeriodDataArr);
        HMLog.info("xys_FemaleExternalDeviceDataTransfer", new c(menstrualPeriodDataArr));
        HMBaseDevice device = a().getDevice(HMDeviceType.MILI);
        HMLog.info("xys_FemaleExternalDeviceDataTransfer", new d(device));
        HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        if (hMMiLiProDevice == null) {
            return;
        }
        hMMiLiProDevice.setPeriodData(menstrualPeriodDataArr, new e(writeCallback));
    }

    @Override // com.huami.femalehealth.logiclib.device.DeviceDataTransfer
    public void writeToDevice(@NotNull MenstruationTotalDto data, @Nullable DeviceCallback writeCallback) {
        HMLog.debug(TAG, new g(data));
        MenstruationModule menstruationModuleB = b();
        if (menstruationModuleB == null) {
            return;
        }
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new FemaleExternalDeviceDataTransfer$writeToDevice$2$1(data, menstruationModuleB, writeCallback, null), 2, null);
    }
}
