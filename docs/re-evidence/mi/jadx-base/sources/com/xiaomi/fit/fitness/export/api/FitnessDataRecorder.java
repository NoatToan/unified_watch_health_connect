package com.xiaomi.fit.fitness.export.api;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalHrItem;
import com.xiaomi.fit.fitness.export.data.item.ActiveStageItem;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.data.item.CaloriesItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.DayNightSleepReport;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fit.fitness.export.data.item.EnergyItem;
import com.xiaomi.fit.fitness.export.data.item.GradePredictionItem;
import com.xiaomi.fit.fitness.export.data.item.HeadsetItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.LactateThresholdItem;
import com.xiaomi.fit.fitness.export.data.item.LightValueItem;
import com.xiaomi.fit.fitness.export.data.item.MHStrengthItem;
import com.xiaomi.fit.fitness.export.data.item.NoiseItem;
import com.xiaomi.fit.fitness.export.data.item.OneDayPaiReport;
import com.xiaomi.fit.fitness.export.data.item.PhysicalStatusItem;
import com.xiaomi.fit.fitness.export.data.item.ReportHrItem;
import com.xiaomi.fit.fitness.export.data.item.ReportSpo2Item;
import com.xiaomi.fit.fitness.export.data.item.RestHrItem;
import com.xiaomi.fit.fitness.export.data.item.RunningIndicatorItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fit.fitness.export.data.item.StepItem;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureCharacterItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureTrendItem;
import com.xiaomi.fit.fitness.export.data.item.TrainingLoadItem;
import com.xiaomi.fit.fitness.export.data.item.ValidStandItem;
import com.xiaomi.fit.fitness.export.data.item.VitalityItem;
import com.xiaomi.fit.fitness.export.data.item.Vo2MaxItem;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthStatus;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import com.xiaomi.fit.fitness.export.data.item.body;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000ú\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\bf\u0018\u0000 Ï\u00012\u00020\u0001:\u0002Ï\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J \u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J1\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H&¢\u0006\u0002\u0010\u0016J1\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H&¢\u0006\u0002\u0010\u0016J1\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0014\"\u00020\u001aH&¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH&J9\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\f2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0014\"\u00020\u001aH&¢\u0006\u0002\u0010\u001eJ1\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020!0\u0014\"\u00020!H&¢\u0006\u0002\u0010\"J1\u0010#\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020!0\u0014\"\u00020!H&¢\u0006\u0002\u0010\"J1\u0010$\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0\u0014\"\u00020&H&¢\u0006\u0002\u0010'J1\u0010(\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020*0\u0014\"\u00020*H&¢\u0006\u0002\u0010+J1\u0010,\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020*0\u0014\"\u00020*H&¢\u0006\u0002\u0010+J1\u0010-\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020.0\u0014\"\u00020.H&¢\u0006\u0002\u0010/J1\u00100\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020.0\u0014\"\u00020.H&¢\u0006\u0002\u0010/J1\u00101\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u0002030\u0014\"\u000203H&¢\u0006\u0002\u00104J1\u00105\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u0002070\u0014\"\u000207H&¢\u0006\u0002\u00108J1\u00109\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010:\u001a\n\u0012\u0006\b\u0001\u0012\u00020;0\u0014\"\u00020;H&¢\u0006\u0002\u0010<J1\u0010=\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010:\u001a\n\u0012\u0006\b\u0001\u0012\u00020;0\u0014\"\u00020;H&¢\u0006\u0002\u0010<J1\u0010>\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010?\u001a\n\u0012\u0006\b\u0001\u0012\u00020@0\u0014\"\u00020@H&¢\u0006\u0002\u0010AJ1\u0010B\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010C\u001a\n\u0012\u0006\b\u0001\u0012\u00020D0\u0014\"\u00020DH&¢\u0006\u0002\u0010EJ1\u0010F\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010C\u001a\n\u0012\u0006\b\u0001\u0012\u00020D0\u0014\"\u00020DH&¢\u0006\u0002\u0010EJ1\u0010G\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010H\u001a\n\u0012\u0006\b\u0001\u0012\u00020I0\u0014\"\u00020IH&¢\u0006\u0002\u0010JJ1\u0010K\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010L\u001a\n\u0012\u0006\b\u0001\u0012\u00020M0\u0014\"\u00020MH&¢\u0006\u0002\u0010NJ1\u0010O\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00020;0\u0014\"\u00020;H&¢\u0006\u0002\u0010<J1\u0010Q\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010R\u001a\n\u0012\u0006\b\u0001\u0012\u00020S0\u0014\"\u00020SH&¢\u0006\u0002\u0010TJ1\u0010U\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010V\u001a\n\u0012\u0006\b\u0001\u0012\u00020W0\u0014\"\u00020WH&¢\u0006\u0002\u0010XJ1\u0010Y\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010Z\u001a\n\u0012\u0006\b\u0001\u0012\u00020[0\u0014\"\u00020[H&¢\u0006\u0002\u0010\\J1\u0010]\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010^\u001a\n\u0012\u0006\b\u0001\u0012\u00020_0\u0014\"\u00020_H&¢\u0006\u0002\u0010`J1\u0010a\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010b\u001a\n\u0012\u0006\b\u0001\u0012\u00020c0\u0014\"\u00020cH&¢\u0006\u0002\u0010dJ1\u0010e\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010b\u001a\n\u0012\u0006\b\u0001\u0012\u00020c0\u0014\"\u00020cH&¢\u0006\u0002\u0010dJ1\u0010f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010g\u001a\n\u0012\u0006\b\u0001\u0012\u00020;0\u0014\"\u00020;H&¢\u0006\u0002\u0010<J1\u0010h\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010i\u001a\n\u0012\u0006\b\u0001\u0012\u00020j0\u0014\"\u00020jH&¢\u0006\u0002\u0010kJ&\u0010l\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020o0nH&J&\u0010p\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020o0nH&J1\u0010q\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010r\u001a\n\u0012\u0006\b\u0001\u0012\u00020s0\u0014\"\u00020sH&¢\u0006\u0002\u0010tJ1\u0010u\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010v\u001a\n\u0012\u0006\b\u0001\u0012\u00020w0\u0014\"\u00020wH&¢\u0006\u0002\u0010xJ1\u0010y\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010z\u001a\n\u0012\u0006\b\u0001\u0012\u00020{0\u0014\"\u00020{H&¢\u0006\u0002\u0010|J2\u0010}\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010~\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u007f0\u0014\"\u00020\u007fH&¢\u0006\u0003\u0010\u0080\u0001J6\u0010\u0081\u0001\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0015\u0010\u0082\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u0083\u00010\u0014\"\u00030\u0083\u0001H&¢\u0006\u0003\u0010\u0084\u0001J6\u0010\u0085\u0001\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0015\u0010\u0086\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u0087\u00010\u0014\"\u00030\u0087\u0001H&¢\u0006\u0003\u0010\u0088\u0001J6\u0010\u0089\u0001\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0015\u0010\u008a\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u008b\u00010\u0014\"\u00030\u008b\u0001H&¢\u0006\u0003\u0010\u008c\u0001J6\u0010\u008d\u0001\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0015\u0010\u008e\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u008f\u00010\u0014\"\u00030\u008f\u0001H&¢\u0006\u0003\u0010\u0090\u0001J6\u0010\u0091\u0001\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0015\u0010\u0092\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u0093\u00010\u0014\"\u00030\u0093\u0001H&¢\u0006\u0003\u0010\u0094\u0001J6\u0010\u0095\u0001\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0015\u0010\u0096\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u0097\u00010\u0014\"\u00030\u0097\u0001H&¢\u0006\u0003\u0010\u0098\u0001J6\u0010\u0099\u0001\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0015\u0010\u009a\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u009b\u00010\u0014\"\u00030\u009b\u0001H&¢\u0006\u0003\u0010\u009c\u0001J6\u0010\u009d\u0001\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0015\u0010\u009e\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u009f\u00010\u0014\"\u00030\u009f\u0001H&¢\u0006\u0003\u0010 \u0001J6\u0010¡\u0001\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0015\u0010¢\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030£\u00010\u0014\"\u00030£\u0001H&¢\u0006\u0003\u0010¤\u0001J6\u0010¥\u0001\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0015\u0010¦\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030§\u00010\u0014\"\u00030§\u0001H&¢\u0006\u0003\u0010¨\u0001J6\u0010©\u0001\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0015\u0010ª\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030«\u00010\u0014\"\u00030«\u0001H&¢\u0006\u0003\u0010¬\u0001J6\u0010\u00ad\u0001\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0015\u0010®\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030¯\u00010\u0014\"\u00030¯\u0001H&¢\u0006\u0003\u0010°\u0001J6\u0010±\u0001\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0015\u0010²\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030³\u00010\u0014\"\u00030³\u0001H&¢\u0006\u0003\u0010´\u0001J)\u0010±\u0001\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010²\u0001\u001a\t\u0012\u0005\u0012\u00030³\u00010nH&J6\u0010µ\u0001\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0015\u0010¶\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030·\u00010\u0014\"\u00030·\u0001H&¢\u0006\u0003\u0010¸\u0001J/\u0010¹\u0001\u001a\u00020\f2\u0007\u0010º\u0001\u001a\u00020\u00052\u0015\u0010»\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030¼\u00010\u0014\"\u00030¼\u0001H&¢\u0006\u0003\u0010½\u0001J#\u0010¾\u0001\u001a\u00020\f2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0014\"\u00020\u0011H&¢\u0006\u0003\u0010¿\u0001J&\u0010À\u0001\u001a\u00020\f2\u0015\u0010»\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030¼\u00010\u0014\"\u00030¼\u0001H&¢\u0006\u0003\u0010Á\u0001J&\u0010Â\u0001\u001a\u00020\f2\u0015\u0010»\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030¼\u00010\u0014\"\u00030¼\u0001H&¢\u0006\u0003\u0010Á\u0001J&\u0010Ã\u0001\u001a\u00020\f2\u0015\u0010»\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030¼\u00010\u0014\"\u00030¼\u0001H&¢\u0006\u0003\u0010Á\u0001J&\u0010Ä\u0001\u001a\u00020\f2\u0015\u0010»\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030¼\u00010\u0014\"\u00030¼\u0001H&¢\u0006\u0003\u0010Á\u0001J&\u0010Å\u0001\u001a\u00020\f2\u0015\u0010»\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030¼\u00010\u0014\"\u00030¼\u0001H&¢\u0006\u0003\u0010Á\u0001J&\u0010Æ\u0001\u001a\u00020\f2\u0015\u0010»\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030¼\u00010\u0014\"\u00030¼\u0001H&¢\u0006\u0003\u0010Á\u0001J&\u0010Ç\u0001\u001a\u00020\f2\u0015\u0010»\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030¼\u00010\u0014\"\u00030¼\u0001H&¢\u0006\u0003\u0010Á\u0001J&\u0010È\u0001\u001a\u00020\f2\u0015\u0010»\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030¼\u00010\u0014\"\u00030¼\u0001H&¢\u0006\u0003\u0010Á\u0001J&\u0010É\u0001\u001a\u00020\f2\u0015\u0010»\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030¼\u00010\u0014\"\u00030¼\u0001H&¢\u0006\u0003\u0010Á\u0001J&\u0010Ê\u0001\u001a\u00020\f2\u0015\u0010»\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030¼\u00010\u0014\"\u00030¼\u0001H&¢\u0006\u0003\u0010Á\u0001J&\u0010Ë\u0001\u001a\u00020\f2\u0015\u0010»\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030¼\u00010\u0014\"\u00030¼\u0001H&¢\u0006\u0003\u0010Á\u0001J\u0019\u0010Ì\u0001\u001a\u00020\f2\u000e\u0010Í\u0001\u001a\t\u0012\u0005\u0012\u00030¼\u00010nH&J\u0019\u0010Î\u0001\u001a\u00020\f2\u000e\u0010Í\u0001\u001a\t\u0012\u0005\u0012\u00030¼\u00010nH&¨\u0006Ð\u0001"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "", "uploadSleepSrcData", "", "sid", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "fileName", "data", "", "recordFDSData", "", "recordSportReport", "zoneOffsetInSec", "", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "recordDaytimeSleep", "sleepReport", "", "Lcom/xiaomi/fit/fitness/export/data/item/DayNightSleepReport;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/DayNightSleepReport;)Z", "recordNightSleep", "recordSleepSegment", "sleepSegment", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;)Z", "updateSleepSegment", "isCompleteSleep", "(Ljava/lang/String;IZ[Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;)Z", "recordManualHr", "hrItem", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/HrItem;)Z", "recordDailyHr", "recordRestHr", "restHrItem", "Lcom/xiaomi/fit/fitness/export/data/item/RestHrItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/RestHrItem;)Z", "recordReportMaxHr", "items", "Lcom/xiaomi/fit/fitness/export/data/item/ReportHrItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/ReportHrItem;)Z", "recordReportMinHr", "recordReportMaxSpo2", "Lcom/xiaomi/fit/fitness/export/data/item/ReportSpo2Item;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/ReportSpo2Item;)Z", "recordReportMinSpo2", "recordAbnormalFib", "abFibItem", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalFibItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/AbnormalFibItem;)Z", "recordAbnormalHr", "abHrItem", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalHrItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/AbnormalHrItem;)Z", "recordAbnormalHrHigh", "abHrItems", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;)Z", "recordAbnormalHrLow", "recordPai", "paiReport", "Lcom/xiaomi/fit/fitness/export/data/item/OneDayPaiReport;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/OneDayPaiReport;)Z", "recordManualSpo2", "spo2Item", "Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;)Z", "recordDailySpo2", "recordDailyLightValue", "lightValueItem", "Lcom/xiaomi/fit/fitness/export/data/item/LightValueItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/LightValueItem;)Z", "recordDailyBodyMomentum", "bodyMomentumItem", "Lcom/xiaomi/fit/fitness/export/data/item/BodyMomentumItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/BodyMomentumItem;)Z", "recordAbnormalSpo2", "spo2Items", "recordStep", "stepItem", "Lcom/xiaomi/fit/fitness/export/data/item/StepItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/StepItem;)Z", "recordActiveStage", "activeStageItem", "Lcom/xiaomi/fit/fitness/export/data/item/ActiveStageItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/ActiveStageItem;)Z", "recordCalorie", "caloriesItem", "Lcom/xiaomi/fit/fitness/export/data/item/CaloriesItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/CaloriesItem;)Z", "recordDailyEnergy", "energyItem", "Lcom/xiaomi/fit/fitness/export/data/item/EnergyItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/EnergyItem;)Z", "recordManualStress", "stressItem", "Lcom/xiaomi/fit/fitness/export/data/item/StressItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/StressItem;)Z", "recordDailyStress", "recordAbnormalStress", "stressItems", "recordBloodPressure", "bloodPressureItem", "Lcom/xiaomi/fit/fitness/export/data/item/BloodPressureItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/BloodPressureItem;)Z", "recordBloodSugar", "itemList", "", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "recordManualBloodSugar", "recordValidStand", "standItem", "Lcom/xiaomi/fit/fitness/export/data/item/ValidStandItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/ValidStandItem;)Z", "recordMHStrength", "mhStrengthItem", "Lcom/xiaomi/fit/fitness/export/data/item/MHStrengthItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/MHStrengthItem;)Z", "recordWeight", "weightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;)Z", "recordHeadset", "headsetItem", "Lcom/xiaomi/fit/fitness/export/data/item/HeadsetItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/HeadsetItem;)Z", "recordHeadsetNoise", "noiseItem", "Lcom/xiaomi/fit/fitness/export/data/item/NoiseItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/NoiseItem;)Z", "recordV02max", "vo2MaxItem", "Lcom/xiaomi/fit/fitness/export/data/item/Vo2MaxItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/Vo2MaxItem;)Z", "recordRunningIndicator", "runningIndexItem", "Lcom/xiaomi/fit/fitness/export/data/item/RunningIndicatorItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/RunningIndicatorItem;)Z", "recordGradePrediction", "gradePredictionItem", "Lcom/xiaomi/fit/fitness/export/data/item/GradePredictionItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/GradePredictionItem;)Z", "recordWomenHealthStatus", "status", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthStatus;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthStatus;)Z", "recordWomenHealthSymptoms", "symptoms", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;)Z", "recordTrainingLoad", "tlItem", "Lcom/xiaomi/fit/fitness/export/data/item/TrainingLoadItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/TrainingLoadItem;)Z", "recordTemperatureItem", "temperatureItem", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;)Z", "recordTemperatureTrendItem", "temperatureTrendItem", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureTrendItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/TemperatureTrendItem;)Z", "recordTemperatureCharacteristic", "item", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureCharacterItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/TemperatureCharacterItem;)Z", "recordVitalityItem", "vitalityItem", "Lcom/xiaomi/fit/fitness/export/data/item/VitalityItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/VitalityItem;)Z", "recordEcgItemReport", "ecgItem", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;)Z", "recordPhysicalStatus", "physicalStatusItem", "Lcom/xiaomi/fit/fitness/export/data/item/PhysicalStatusItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/PhysicalStatusItem;)Z", "recordLactateThreshold", "LactateThresholdItem", "Lcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;)Z", "deleteDailyItems", "key", "recordItem", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "(Ljava/lang/String;[Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)Z", "deleteSportReport", "([Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)Z", "deleteManualHr", "([Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)Z", "deleteManualStress", "deleteManualSpo2", "deleteWeight", "deleteValidStand", "deleteBloodPressure", "deleteSleepSegment", "deleteMenstruation", "deleteMenstruationSymptoms", "deleteTemperature", "deleteEcg", "deleteBloodSugar", "recordList", "deleteLactateThreshold", "Companion", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FitnessDataRecorder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder$Companion;", "", "<init>", "()V", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    boolean deleteBloodPressure(@NotNull DailyRecordItem... recordItem);

    boolean deleteBloodSugar(@NotNull List<? extends DailyRecordItem> recordList);

    boolean deleteDailyItems(@NotNull String key, @NotNull DailyRecordItem... recordItem);

    boolean deleteEcg(@NotNull DailyRecordItem... recordItem);

    boolean deleteLactateThreshold(@NotNull List<? extends DailyRecordItem> recordList);

    boolean deleteManualHr(@NotNull DailyRecordItem... recordItem);

    boolean deleteManualSpo2(@NotNull DailyRecordItem... recordItem);

    boolean deleteManualStress(@NotNull DailyRecordItem... recordItem);

    boolean deleteMenstruation(@NotNull DailyRecordItem... recordItem);

    boolean deleteMenstruationSymptoms(@NotNull DailyRecordItem... recordItem);

    boolean deleteSleepSegment(@NotNull DailyRecordItem... recordItem);

    boolean deleteSportReport(@NotNull SportBasicReport... sportReport);

    boolean deleteTemperature(@NotNull DailyRecordItem... recordItem);

    boolean deleteValidStand(@NotNull DailyRecordItem... recordItem);

    boolean deleteWeight(@NotNull DailyRecordItem... recordItem);

    boolean recordAbnormalFib(@NotNull String sid, int zoneOffsetInSec, @NotNull AbnormalFibItem... abFibItem);

    boolean recordAbnormalHr(@NotNull String sid, int zoneOffsetInSec, @NotNull AbnormalHrItem... abHrItem);

    boolean recordAbnormalHrHigh(@NotNull String sid, int zoneOffsetInSec, @NotNull SegmentItem... abHrItems);

    boolean recordAbnormalHrLow(@NotNull String sid, int zoneOffsetInSec, @NotNull SegmentItem... abHrItems);

    boolean recordAbnormalSpo2(@NotNull String sid, int zoneOffsetInSec, @NotNull SegmentItem... spo2Items);

    boolean recordAbnormalStress(@NotNull String sid, int zoneOffsetInSec, @NotNull SegmentItem... stressItems);

    boolean recordActiveStage(@NotNull String sid, int zoneOffsetInSec, @NotNull ActiveStageItem... activeStageItem);

    boolean recordBloodPressure(@NotNull String sid, int zoneOffsetInSec, @NotNull BloodPressureItem... bloodPressureItem);

    boolean recordBloodSugar(@NotNull String sid, int zoneOffsetInSec, @NotNull List<BloodSugarItem> itemList);

    boolean recordCalorie(@NotNull String sid, int zoneOffsetInSec, @NotNull CaloriesItem... caloriesItem);

    boolean recordDailyBodyMomentum(@NotNull String sid, int zoneOffsetInSec, @NotNull body... bodyMomentumItem);

    boolean recordDailyEnergy(@NotNull String sid, int zoneOffsetInSec, @NotNull EnergyItem... energyItem);

    boolean recordDailyHr(@NotNull String sid, int zoneOffsetInSec, @NotNull HrItem... hrItem);

    boolean recordDailyLightValue(@NotNull String sid, int zoneOffsetInSec, @NotNull LightValueItem... lightValueItem);

    boolean recordDailySpo2(@NotNull String sid, int zoneOffsetInSec, @NotNull Spo2Item... spo2Item);

    boolean recordDailyStress(@NotNull String sid, int zoneOffsetInSec, @NotNull StressItem... stressItem);

    boolean recordDaytimeSleep(@NotNull String sid, int zoneOffsetInSec, @NotNull DayNightSleepReport... sleepReport);

    boolean recordEcgItemReport(@NotNull String sid, int zoneOffsetInSec, @NotNull EcgMedicalItemReport... ecgItem);

    boolean recordFDSData(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull byte[] data);

    boolean recordGradePrediction(@NotNull String sid, int zoneOffsetInSec, @NotNull GradePredictionItem... gradePredictionItem);

    boolean recordHeadset(@NotNull String sid, int zoneOffsetInSec, @NotNull HeadsetItem... headsetItem);

    boolean recordHeadsetNoise(@NotNull String sid, int zoneOffsetInSec, @NotNull NoiseItem... noiseItem);

    boolean recordLactateThreshold(@NotNull String sid, int zoneOffsetInSec, @NotNull LactateThresholdItem... LactateThresholdItem);

    boolean recordMHStrength(@NotNull String sid, int zoneOffsetInSec, @NotNull MHStrengthItem... mhStrengthItem);

    boolean recordManualBloodSugar(@NotNull String sid, int zoneOffsetInSec, @NotNull List<BloodSugarItem> itemList);

    boolean recordManualHr(@NotNull String sid, int zoneOffsetInSec, @NotNull HrItem... hrItem);

    boolean recordManualSpo2(@NotNull String sid, int zoneOffsetInSec, @NotNull Spo2Item... spo2Item);

    boolean recordManualStress(@NotNull String sid, int zoneOffsetInSec, @NotNull StressItem... stressItem);

    boolean recordNightSleep(@NotNull String sid, int zoneOffsetInSec, @NotNull DayNightSleepReport... sleepReport);

    boolean recordPai(@NotNull String sid, int zoneOffsetInSec, @NotNull OneDayPaiReport... paiReport);

    boolean recordPhysicalStatus(@NotNull String sid, int zoneOffsetInSec, @NotNull List<PhysicalStatusItem> physicalStatusItem);

    boolean recordPhysicalStatus(@NotNull String sid, int zoneOffsetInSec, @NotNull PhysicalStatusItem... physicalStatusItem);

    boolean recordReportMaxHr(@NotNull String sid, int zoneOffsetInSec, @NotNull ReportHrItem... items);

    boolean recordReportMaxSpo2(@NotNull String sid, int zoneOffsetInSec, @NotNull ReportSpo2Item... items);

    boolean recordReportMinHr(@NotNull String sid, int zoneOffsetInSec, @NotNull ReportHrItem... items);

    boolean recordReportMinSpo2(@NotNull String sid, int zoneOffsetInSec, @NotNull ReportSpo2Item... items);

    boolean recordRestHr(@NotNull String sid, int zoneOffsetInSec, @NotNull RestHrItem... restHrItem);

    boolean recordRunningIndicator(@NotNull String sid, int zoneOffsetInSec, @NotNull RunningIndicatorItem... runningIndexItem);

    boolean recordSleepSegment(@NotNull String sid, int zoneOffsetInSec, boolean isCompleteSleep, @NotNull SleepSegmentReport... sleepSegment);

    boolean recordSleepSegment(@NotNull String sid, int zoneOffsetInSec, @NotNull SleepSegmentReport... sleepSegment);

    boolean recordSportReport(@NotNull String sid, int zoneOffsetInSec, @NotNull SportBasicReport sportReport);

    boolean recordStep(@NotNull String sid, int zoneOffsetInSec, @NotNull StepItem... stepItem);

    boolean recordTemperatureCharacteristic(@NotNull String sid, int zoneOffsetInSec, @NotNull TemperatureCharacterItem... item);

    boolean recordTemperatureItem(@NotNull String sid, int zoneOffsetInSec, @NotNull TemperatureItem... temperatureItem);

    boolean recordTemperatureTrendItem(@NotNull String sid, int zoneOffsetInSec, @NotNull TemperatureTrendItem... temperatureTrendItem);

    boolean recordTrainingLoad(@NotNull String sid, int zoneOffsetInSec, @NotNull TrainingLoadItem... tlItem);

    boolean recordV02max(@NotNull String sid, int zoneOffsetInSec, @NotNull Vo2MaxItem... vo2MaxItem);

    boolean recordValidStand(@NotNull String sid, int zoneOffsetInSec, @NotNull ValidStandItem... standItem);

    boolean recordVitalityItem(@NotNull String sid, int zoneOffsetInSec, @NotNull VitalityItem... vitalityItem);

    boolean recordWeight(@NotNull String sid, int zoneOffsetInSec, @NotNull WeightItem... weightItem);

    boolean recordWomenHealthStatus(@NotNull String sid, int zoneOffsetInSec, @NotNull WomenHealthStatus... status);

    boolean recordWomenHealthSymptoms(@NotNull String sid, int zoneOffsetInSec, @NotNull WomenHealthSymptoms... symptoms);

    boolean updateSleepSegment(@NotNull SleepSegmentReport sleepSegment);

    void uploadSleepSrcData(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull String fileName, @NotNull byte[] data);
}
