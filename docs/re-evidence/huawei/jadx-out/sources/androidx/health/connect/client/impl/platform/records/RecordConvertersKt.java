package androidx.health.connect.client.impl.platform.records;

import android.health.connect.datatypes.ExerciseCompletionGoal;
import android.health.connect.datatypes.ExerciseLap;
import android.health.connect.datatypes.ExercisePerformanceGoal;
import android.health.connect.datatypes.ExerciseRoute;
import android.health.connect.datatypes.ExerciseSegment;
import android.health.connect.datatypes.Record;
import android.health.connect.datatypes.units.BloodGlucose;
import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Length;
import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Percentage;
import android.health.connect.datatypes.units.Power;
import android.health.connect.datatypes.units.Pressure;
import android.health.connect.datatypes.units.Temperature;
import android.health.connect.datatypes.units.TemperatureDelta;
import android.health.connect.datatypes.units.Velocity;
import android.health.connect.datatypes.units.Volume;
import android.net.Uri;
import androidx.core.view.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import androidx.health.connect.client.records.ActiveCaloriesBurnedRecord;
import androidx.health.connect.client.records.BasalBodyTemperatureRecord;
import androidx.health.connect.client.records.BasalMetabolicRateRecord;
import androidx.health.connect.client.records.BloodGlucoseRecord;
import androidx.health.connect.client.records.BloodPressureRecord;
import androidx.health.connect.client.records.BodyFatRecord;
import androidx.health.connect.client.records.BodyTemperatureRecord;
import androidx.health.connect.client.records.BodyWaterMassRecord;
import androidx.health.connect.client.records.BoneMassRecord;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.health.connect.client.records.CyclingPedalingCadenceRecord;
import androidx.health.connect.client.records.DistanceRecord;
import androidx.health.connect.client.records.ElevationGainedRecord;
import androidx.health.connect.client.records.ExercisePerformanceTarget;
import androidx.health.connect.client.records.ExerciseRouteResult;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import androidx.health.connect.client.records.FhirResource;
import androidx.health.connect.client.records.FhirVersion;
import androidx.health.connect.client.records.FloorsClimbedRecord;
import androidx.health.connect.client.records.HeartRateRecord;
import androidx.health.connect.client.records.HeartRateVariabilityRmssdRecord;
import androidx.health.connect.client.records.HeightRecord;
import androidx.health.connect.client.records.HydrationRecord;
import androidx.health.connect.client.records.IntermenstrualBleedingRecord;
import androidx.health.connect.client.records.LeanBodyMassRecord;
import androidx.health.connect.client.records.MedicalDataSource;
import androidx.health.connect.client.records.MedicalResource;
import androidx.health.connect.client.records.MedicalResourceId;
import androidx.health.connect.client.records.MenstruationFlowRecord;
import androidx.health.connect.client.records.MenstruationPeriodRecord;
import androidx.health.connect.client.records.MindfulnessSessionRecord;
import androidx.health.connect.client.records.NutritionRecord;
import androidx.health.connect.client.records.OvulationTestRecord;
import androidx.health.connect.client.records.OxygenSaturationRecord;
import androidx.health.connect.client.records.PlannedExerciseBlock;
import androidx.health.connect.client.records.PlannedExerciseSessionRecord;
import androidx.health.connect.client.records.PlannedExerciseStep;
import androidx.health.connect.client.records.PowerRecord;
import androidx.health.connect.client.records.RespiratoryRateRecord;
import androidx.health.connect.client.records.RestingHeartRateRecord;
import androidx.health.connect.client.records.SexualActivityRecord;
import androidx.health.connect.client.records.SkinTemperatureRecord;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.SpeedRecord;
import androidx.health.connect.client.records.StepsCadenceRecord;
import androidx.health.connect.client.records.StepsRecord;
import androidx.health.connect.client.records.TotalCaloriesBurnedRecord;
import androidx.health.connect.client.records.UtilsKt;
import androidx.health.connect.client.records.Vo2MaxRecord;
import androidx.health.connect.client.records.WeightRecord;
import androidx.health.connect.client.records.WheelchairPushesRecord;
import defpackage.yzp;
import defpackage.zay;
import defpackage.zcp;
import defpackage.zcz;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0084\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u000e\u0012\n\b\u0001\u0012\u00060\u0002j\u0002`\u00030\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0000\u001a\"\u0010\u0006\u001a\u0010\u0012\n\b\u0001\u0012\u00060\u0002j\u0002`\u0003\u0018\u00010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0003\u001a\"\u0010\u0007\u001a\u0010\u0012\n\b\u0001\u0012\u00060\u0002j\u0002`\u0003\u0018\u00010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0003\u001a\u0010\u0010\b\u001a\u00060\u0002j\u0002`\u0003*\u00020\u0005H\u0007\u001a\u0014\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003*\u00020\u0005H\u0002\u001a\u0014\u0010\n\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003*\u00020\u0005H\u0002\u001a\u000e\u0010\u000b\u001a\u00020\u0005*\u00060\u0002j\u0002`\u0003\u001a\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005*\u00060\u0002j\u0002`\u0003H\u0003\u001a\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005*\u00060\u0002j\u0002`\u0003H\u0003\u001a\u0010\u0010\u000e\u001a\u00020\u000f*\u00060\u0010j\u0002`\u0011H\u0002\u001a\u0010\u0010\u0012\u001a\u00020\u0013*\u00060\u0014j\u0002`\u0015H\u0002\u001a\u0010\u0010\u0016\u001a\u00020\u0017*\u00060\u0018j\u0002`\u0019H\u0002\u001a\u0010\u0010\u001a\u001a\u00020\u001b*\u00060\u001cj\u0002`\u001dH\u0002\u001a\u0010\u0010\u001e\u001a\u00020\u001f*\u00060 j\u0002`!H\u0002\u001a\u0010\u0010\"\u001a\u00020#*\u00060$j\u0002`%H\u0002\u001a\u0010\u0010&\u001a\u00020'*\u00060(j\u0002`)H\u0002\u001a\u0010\u0010*\u001a\u00020+*\u00060,j\u0002`-H\u0002\u001a\u0010\u0010.\u001a\u00020/*\u000600j\u0002`1H\u0002\u001a\u0010\u00102\u001a\u000203*\u000604j\u0002`5H\u0002\u001a\u0010\u00106\u001a\u000207*\u000608j\u0002`9H\u0002\u001a\u0010\u0010:\u001a\u00020;*\u00060<j\u0002`=H\u0002\u001a\u0010\u0010>\u001a\u00020?*\u00060@j\u0002`AH\u0002\u001a\u0010\u0010B\u001a\u00020C*\u00060Dj\u0002`EH\u0003\u001a\u0010\u0010F\u001a\u00020G*\u00060Hj\u0002`IH\u0002\u001a\u0010\u0010J\u001a\u00020K*\u00060Lj\u0002`MH\u0002\u001a\u0010\u0010N\u001a\u00020O*\u00060Pj\u0002`QH\u0002\u001a\u0010\u0010R\u001a\u00020S*\u00060Tj\u0002`UH\u0002\u001a\u0010\u0010V\u001a\u00020W*\u00060Xj\u0002`YH\u0002\u001a\u0010\u0010Z\u001a\u00020[*\u00060\\j\u0002`]H\u0002\u001a\u0010\u0010^\u001a\u00020_*\u00060`j\u0002`aH\u0002\u001a\u0010\u0010b\u001a\u00020c*\u00060dj\u0002`eH\u0002\u001a\u0010\u0010f\u001a\u00020g*\u00060hj\u0002`iH\u0003\u001a\u0010\u0010j\u001a\u00020k*\u00060lj\u0002`mH\u0002\u001a\u0010\u0010n\u001a\u00020o*\u00060pj\u0002`qH\u0002\u001a\u0010\u0010r\u001a\u00020s*\u00060tj\u0002`uH\u0002\u001a\u0010\u0010v\u001a\u00020w*\u00060xj\u0002`yH\u0002\u001a\u0010\u0010z\u001a\u00020{*\u00060|j\u0002`}H\u0002\u001a\u0012\u0010~\u001a\u00020\u007f*\b0\u0080\u0001j\u0003`\u0081\u0001H\u0002\u001a\u0014\u0010\u0082\u0001\u001a\u00030\u0083\u0001*\b0\u0084\u0001j\u0003`\u0085\u0001H\u0002\u001a\u0014\u0010\u0086\u0001\u001a\u00030\u0087\u0001*\b0\u0088\u0001j\u0003`\u0089\u0001H\u0002\u001a\u0014\u0010\u008a\u0001\u001a\u00030\u008b\u0001*\b0\u008c\u0001j\u0003`\u008d\u0001H\u0002\u001a\u0014\u0010\u008e\u0001\u001a\u00030\u008f\u0001*\b0\u0090\u0001j\u0003`\u0091\u0001H\u0003\u001a\u0014\u0010\u0092\u0001\u001a\u00030\u0093\u0001*\b0\u0094\u0001j\u0003`\u0095\u0001H\u0002\u001a\u0014\u0010\u0096\u0001\u001a\u00030\u0097\u0001*\b0\u0098\u0001j\u0003`\u0099\u0001H\u0002\u001a\u0014\u0010\u009a\u0001\u001a\u00030\u009b\u0001*\b0\u009c\u0001j\u0003`\u009d\u0001H\u0002\u001a\u0014\u0010\u009e\u0001\u001a\u00030\u009f\u0001*\b0 \u0001j\u0003`¡\u0001H\u0002\u001a\u0014\u0010¢\u0001\u001a\u00030£\u0001*\b0¤\u0001j\u0003`¥\u0001H\u0002\u001a\u0014\u0010¦\u0001\u001a\u00030§\u0001*\b0¨\u0001j\u0003`©\u0001H\u0002\u001a\u0014\u0010ª\u0001\u001a\u00030«\u0001*\b0¬\u0001j\u0003`\u00ad\u0001H\u0002\u001a\r\u0010®\u0001\u001a\u00020\u0010*\u00020\u000fH\u0002\u001a\r\u0010¯\u0001\u001a\u00020\u0014*\u00020\u0013H\u0002\u001a\r\u0010°\u0001\u001a\u00020\u0018*\u00020\u0017H\u0002\u001a\r\u0010±\u0001\u001a\u00020\u001c*\u00020\u001bH\u0002\u001a\r\u0010²\u0001\u001a\u00020 *\u00020\u001fH\u0002\u001a\r\u0010³\u0001\u001a\u00020$*\u00020#H\u0002\u001a\r\u0010´\u0001\u001a\u00020(*\u00020'H\u0002\u001a\r\u0010µ\u0001\u001a\u00020,*\u00020+H\u0002\u001a\r\u0010¶\u0001\u001a\u000200*\u00020/H\u0002\u001a\r\u0010·\u0001\u001a\u000204*\u000203H\u0002\u001a\r\u0010¸\u0001\u001a\u000208*\u000207H\u0002\u001a\u0014\u0010¹\u0001\u001a\b0º\u0001j\u0003`»\u0001*\u00030¼\u0001H\u0002\u001a\r\u0010½\u0001\u001a\u00020<*\u00020;H\u0002\u001a\r\u0010¾\u0001\u001a\u00020@*\u00020?H\u0002\u001a\r\u0010¿\u0001\u001a\u00020D*\u00020CH\u0003\u001a\u000f\u0010À\u0001\u001a\u00030Á\u0001*\u00030Â\u0001H\u0002\u001a\u0014\u0010Ã\u0001\u001a\b0Ä\u0001j\u0003`Å\u0001*\u00030Æ\u0001H\u0002\u001a\u000f\u0010Ç\u0001\u001a\u00030È\u0001*\u00030É\u0001H\u0002\u001a\r\u0010Ê\u0001\u001a\u00020H*\u00020GH\u0002\u001a\r\u0010Ë\u0001\u001a\u00020L*\u00020KH\u0002\u001a\u0014\u0010Ì\u0001\u001a\b0Í\u0001j\u0003`Î\u0001*\u00030Ï\u0001H\u0002\u001a\r\u0010Ð\u0001\u001a\u00020P*\u00020OH\u0002\u001a\r\u0010Ñ\u0001\u001a\u00020T*\u00020SH\u0002\u001a\r\u0010Ò\u0001\u001a\u00020X*\u00020WH\u0002\u001a\r\u0010Ó\u0001\u001a\u00020\\*\u00020[H\u0002\u001a\r\u0010Ô\u0001\u001a\u00020`*\u00020_H\u0002\u001a\r\u0010Õ\u0001\u001a\u00020d*\u00020cH\u0002\u001a\r\u0010Ö\u0001\u001a\u00020l*\u00020kH\u0002\u001a\r\u0010×\u0001\u001a\u00020h*\u00020gH\u0003\u001a\r\u0010Ø\u0001\u001a\u00020p*\u00020oH\u0002\u001a\r\u0010Ù\u0001\u001a\u00020t*\u00020sH\u0002\u001a\r\u0010Ú\u0001\u001a\u00020x*\u00020wH\u0002\u001a\u000f\u0010Û\u0001\u001a\u00030Ü\u0001*\u00030Ý\u0001H\u0003\u001a\u000f\u0010Þ\u0001\u001a\u00030ß\u0001*\u00030à\u0001H\u0003\u001a\u000f\u0010á\u0001\u001a\u00030â\u0001*\u00030ã\u0001H\u0003\u001a\u000f\u0010ä\u0001\u001a\u00030å\u0001*\u00030æ\u0001H\u0001\u001a\u000f\u0010ç\u0001\u001a\u00030è\u0001*\u00030é\u0001H\u0001\u001a\u0014\u0010ê\u0001\u001a\u00030Ý\u0001*\b0Ü\u0001j\u0003`ë\u0001H\u0001\u001a\u0014\u0010ì\u0001\u001a\u00030à\u0001*\b0ß\u0001j\u0003`í\u0001H\u0003\u001a\u0014\u0010î\u0001\u001a\u00030ã\u0001*\b0â\u0001j\u0003`ï\u0001H\u0003\u001a\u0014\u0010ð\u0001\u001a\u00030æ\u0001*\b0å\u0001j\u0003`ñ\u0001H\u0001\u001a\u0014\u0010ò\u0001\u001a\u00030é\u0001*\b0è\u0001j\u0003`ó\u0001H\u0001\u001a\r\u0010ô\u0001\u001a\u00020|*\u00020{H\u0002\u001a\u0014\u0010õ\u0001\u001a\b0ö\u0001j\u0003`÷\u0001*\u00030ø\u0001H\u0002\u001a\u000e\u0010ù\u0001\u001a\u00030\u0080\u0001*\u00020\u007fH\u0002\u001a\u000f\u0010ú\u0001\u001a\u00030\u0084\u0001*\u00030\u0083\u0001H\u0002\u001a\u000f\u0010û\u0001\u001a\u00030\u0088\u0001*\u00030\u0087\u0001H\u0002\u001a\u000f\u0010ü\u0001\u001a\u00030\u0090\u0001*\u00030\u008f\u0001H\u0003\u001a\u0014\u0010ý\u0001\u001a\b0þ\u0001j\u0003`ÿ\u0001*\u00030\u0080\u0002H\u0003\u001a\u000f\u0010\u0081\u0002\u001a\u00030\u008c\u0001*\u00030\u008b\u0001H\u0002\u001a\u0014\u0010\u0082\u0002\u001a\b0\u0083\u0002j\u0003`\u0084\u0002*\u00030\u0085\u0002H\u0002\u001a\u000f\u0010\u0086\u0002\u001a\u00030\u0094\u0001*\u00030\u0093\u0001H\u0002\u001a\u0014\u0010\u0087\u0002\u001a\b0\u0088\u0002j\u0003`\u0089\u0002*\u00030\u008a\u0002H\u0002\u001a\u000f\u0010\u008b\u0002\u001a\u00030\u009c\u0001*\u00030\u009b\u0001H\u0002\u001a\u000f\u0010\u008c\u0002\u001a\u00030\u0098\u0001*\u00030\u0097\u0001H\u0002\u001a\u0014\u0010\u008d\u0002\u001a\b0\u008e\u0002j\u0003`\u008f\u0002*\u00030\u0090\u0002H\u0002\u001a\u000f\u0010\u0091\u0002\u001a\u00030 \u0001*\u00030\u009f\u0001H\u0002\u001a\u000f\u0010\u0092\u0002\u001a\u00030¤\u0001*\u00030£\u0001H\u0002\u001a\u000f\u0010\u0093\u0002\u001a\u00030¨\u0001*\u00030§\u0001H\u0002\u001a\u000f\u0010\u0094\u0002\u001a\u00030¬\u0001*\u00030«\u0001H\u0002\u001a\u0014\u0010\u0095\u0002\u001a\u00030¼\u0001*\b0º\u0001j\u0003`»\u0001H\u0002\u001a\u0014\u0010\u0096\u0002\u001a\u00030Ï\u0001*\b0Í\u0001j\u0003`Î\u0001H\u0002\u001a\u0014\u0010\u0097\u0002\u001a\u00030ø\u0001*\b0ö\u0001j\u0003`÷\u0001H\u0002\u001a\u0014\u0010\u0098\u0002\u001a\u00030\u0080\u0002*\b0þ\u0001j\u0003`ÿ\u0001H\u0003\u001a\u0014\u0010\u0099\u0002\u001a\u00030\u008a\u0002*\b0\u0088\u0002j\u0003`\u0089\u0002H\u0002\u001a\u0014\u0010\u009a\u0002\u001a\u00030\u0090\u0002*\b0\u008e\u0002j\u0003`\u008f\u0002H\u0002\u001a\u0014\u0010\u009b\u0002\u001a\u00030\u0085\u0002*\b0\u0083\u0002j\u0003`\u0084\u0002H\u0002\u001a\u0014\u0010\u009c\u0002\u001a\u00030Æ\u0001*\b0Ä\u0001j\u0003`Å\u0001H\u0000\u001a\u0014\u0010\u009d\u0002\u001a\u00030Â\u0001*\b0Á\u0001j\u0003`\u009e\u0002H\u0000\u001a\u0014\u0010\u009f\u0002\u001a\u00030É\u0001*\b0È\u0001j\u0003` \u0002H\u0000\u001a\u0014\u0010¡\u0002\u001a\u00030¢\u0002*\b0£\u0002j\u0003`¤\u0002H\u0001\u001a\u0014\u0010¥\u0002\u001a\u00030¦\u0002*\b0§\u0002j\u0003`¨\u0002H\u0001\u001a\u0014\u0010©\u0002\u001a\u00030ª\u0002*\b0«\u0002j\u0003`¬\u0002H\u0001\u001a\u0014\u0010\u00ad\u0002\u001a\u00030®\u0002*\b0¯\u0002j\u0003`°\u0002H\u0001\u001a\u0014\u0010±\u0002\u001a\u00030²\u0002*\b0³\u0002j\u0003`´\u0002H\u0001¨\u0006µ\u0002"}, d2 = {"toPlatformRecordClass", "Ljava/lang/Class;", "Landroid/health/connect/datatypes/Record;", "Landroidx/health/connect/client/impl/platform/records/PlatformRecord;", "Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "toPlatformRecordClassExt13", "toPlatformRecordClassExt15", "toPlatformRecord", "toPlatformRecordExt13", "toPlatformRecordExt15", "toSdkRecord", "toSdkRecordExt13", "toSdkRecordExt15", "toSdkActiveCaloriesBurnedRecord", "Landroidx/health/connect/client/records/ActiveCaloriesBurnedRecord;", "Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformActiveCaloriesBurnedRecord;", "toSdkBasalBodyTemperatureRecord", "Landroidx/health/connect/client/records/BasalBodyTemperatureRecord;", "Landroid/health/connect/datatypes/BasalBodyTemperatureRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformBasalBodyTemperatureRecord;", "toSdkBasalMetabolicRateRecord", "Landroidx/health/connect/client/records/BasalMetabolicRateRecord;", "Landroid/health/connect/datatypes/BasalMetabolicRateRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformBasalMetabolicRateRecord;", "toSdkBloodGlucoseRecord", "Landroidx/health/connect/client/records/BloodGlucoseRecord;", "Landroid/health/connect/datatypes/BloodGlucoseRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformBloodGlucoseRecord;", "toSdkBloodPressureRecord", "Landroidx/health/connect/client/records/BloodPressureRecord;", "Landroid/health/connect/datatypes/BloodPressureRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformBloodPressureRecord;", "toSdkBodyFatRecord", "Landroidx/health/connect/client/records/BodyFatRecord;", "Landroid/health/connect/datatypes/BodyFatRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformBodyFatRecord;", "toSdkBodyTemperatureRecord", "Landroidx/health/connect/client/records/BodyTemperatureRecord;", "Landroid/health/connect/datatypes/BodyTemperatureRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformBodyTemperatureRecord;", "toSdkBodyWaterMassRecord", "Landroidx/health/connect/client/records/BodyWaterMassRecord;", "Landroid/health/connect/datatypes/BodyWaterMassRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformBodyWaterMassRecord;", "toSdkBoneMassRecord", "Landroidx/health/connect/client/records/BoneMassRecord;", "Landroid/health/connect/datatypes/BoneMassRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformBoneMassRecord;", "toSdkCervicalMucusRecord", "Landroidx/health/connect/client/records/CervicalMucusRecord;", "Landroid/health/connect/datatypes/CervicalMucusRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformCervicalMucusRecord;", "toSdkCyclingPedalingCadenceRecord", "Landroidx/health/connect/client/records/CyclingPedalingCadenceRecord;", "Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformCyclingPedalingCadenceRecord;", "toSdkDistanceRecord", "Landroidx/health/connect/client/records/DistanceRecord;", "Landroid/health/connect/datatypes/DistanceRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformDistanceRecord;", "toSdkElevationGainedRecord", "Landroidx/health/connect/client/records/ElevationGainedRecord;", "Landroid/health/connect/datatypes/ElevationGainedRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformElevationGainedRecord;", "toSdkExerciseSessionRecord", "Landroidx/health/connect/client/records/ExerciseSessionRecord;", "Landroid/health/connect/datatypes/ExerciseSessionRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformExerciseSessionRecord;", "toSdkFloorsClimbedRecord", "Landroidx/health/connect/client/records/FloorsClimbedRecord;", "Landroid/health/connect/datatypes/FloorsClimbedRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformFloorsClimbedRecord;", "toSdkHeartRateRecord", "Landroidx/health/connect/client/records/HeartRateRecord;", "Landroid/health/connect/datatypes/HeartRateRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformHeartRateRecord;", "toSdkHeartRateVariabilityRmssdRecord", "Landroidx/health/connect/client/records/HeartRateVariabilityRmssdRecord;", "Landroid/health/connect/datatypes/HeartRateVariabilityRmssdRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformHeartRateVariabilityRmssdRecord;", "toSdkHeightRecord", "Landroidx/health/connect/client/records/HeightRecord;", "Landroid/health/connect/datatypes/HeightRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformHeightRecord;", "toSdkHydrationRecord", "Landroidx/health/connect/client/records/HydrationRecord;", "Landroid/health/connect/datatypes/HydrationRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformHydrationRecord;", "toSdkIntermenstrualBleedingRecord", "Landroidx/health/connect/client/records/IntermenstrualBleedingRecord;", "Landroid/health/connect/datatypes/IntermenstrualBleedingRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformIntermenstrualBleedingRecord;", "toSdkLeanBodyMassRecord", "Landroidx/health/connect/client/records/LeanBodyMassRecord;", "Landroid/health/connect/datatypes/LeanBodyMassRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformLeanBodyMassRecord;", "toSdkMenstruationFlowRecord", "Landroidx/health/connect/client/records/MenstruationFlowRecord;", "Landroid/health/connect/datatypes/MenstruationFlowRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformMenstruationFlowRecord;", "toSdkMindfulnessSessionRecord", "Landroidx/health/connect/client/records/MindfulnessSessionRecord;", "Landroid/health/connect/datatypes/MindfulnessSessionRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformMindfulnessSessionRecord;", "toSdkMenstruationPeriodRecord", "Landroidx/health/connect/client/records/MenstruationPeriodRecord;", "Landroid/health/connect/datatypes/MenstruationPeriodRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformMenstruationPeriodRecord;", "toSdkNutritionRecord", "Landroidx/health/connect/client/records/NutritionRecord;", "Landroid/health/connect/datatypes/NutritionRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformNutritionRecord;", "toSdkOvulationTestRecord", "Landroidx/health/connect/client/records/OvulationTestRecord;", "Landroid/health/connect/datatypes/OvulationTestRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformOvulationTestRecord;", "toSdkOxygenSaturationRecord", "Landroidx/health/connect/client/records/OxygenSaturationRecord;", "Landroid/health/connect/datatypes/OxygenSaturationRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformOxygenSaturationRecord;", "toSdkPowerRecord", "Landroidx/health/connect/client/records/PowerRecord;", "Landroid/health/connect/datatypes/PowerRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformPowerRecord;", "toSdkRespiratoryRateRecord", "Landroidx/health/connect/client/records/RespiratoryRateRecord;", "Landroid/health/connect/datatypes/RespiratoryRateRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformRespiratoryRateRecord;", "toSdkRestingHeartRateRecord", "Landroidx/health/connect/client/records/RestingHeartRateRecord;", "Landroid/health/connect/datatypes/RestingHeartRateRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformRestingHeartRateRecord;", "toSdkSexualActivityRecord", "Landroidx/health/connect/client/records/SexualActivityRecord;", "Landroid/health/connect/datatypes/SexualActivityRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformSexualActivityRecord;", "toSdkSleepSessionRecord", "Landroidx/health/connect/client/records/SleepSessionRecord;", "Landroid/health/connect/datatypes/SleepSessionRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformSleepSessionRecord;", "toSdkSkinTemperatureRecord", "Landroidx/health/connect/client/records/SkinTemperatureRecord;", "Landroid/health/connect/datatypes/SkinTemperatureRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformSkinTemperatureRecord;", "toSdkSpeedRecord", "Landroidx/health/connect/client/records/SpeedRecord;", "Landroid/health/connect/datatypes/SpeedRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformSpeedRecord;", "toSdkStepsCadenceRecord", "Landroidx/health/connect/client/records/StepsCadenceRecord;", "Landroid/health/connect/datatypes/StepsCadenceRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformStepsCadenceRecord;", "toSdkStepsRecord", "Landroidx/health/connect/client/records/StepsRecord;", "Landroid/health/connect/datatypes/StepsRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformStepsRecord;", "toSdkTotalCaloriesBurnedRecord", "Landroidx/health/connect/client/records/TotalCaloriesBurnedRecord;", "Landroid/health/connect/datatypes/TotalCaloriesBurnedRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformTotalCaloriesBurnedRecord;", "toSdkVo2MaxRecord", "Landroidx/health/connect/client/records/Vo2MaxRecord;", "Landroid/health/connect/datatypes/Vo2MaxRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformVo2MaxRecord;", "toSdkWeightRecord", "Landroidx/health/connect/client/records/WeightRecord;", "Landroid/health/connect/datatypes/WeightRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformWeightRecord;", "toWheelchairPushesRecord", "Landroidx/health/connect/client/records/WheelchairPushesRecord;", "Landroid/health/connect/datatypes/WheelchairPushesRecord;", "Landroidx/health/connect/client/impl/platform/records/PlatformWheelchairPushesRecord;", "toPlatformActiveCaloriesBurnedRecord", "toPlatformBasalBodyTemperatureRecord", "toPlatformBasalMetabolicRateRecord", "toPlatformBloodGlucoseRecord", "toPlatformBloodPressureRecord", "toPlatformBodyFatRecord", "toPlatformBodyTemperatureRecord", "toPlatformBodyWaterMassRecord", "toPlatformBoneMassRecord", "toPlatformCervicalMucusRecord", "toPlatformCyclingPedalingCadenceRecord", "toPlatformCyclingPedalingCadenceSample", "Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord$CyclingPedalingCadenceRecordSample;", "Landroidx/health/connect/client/impl/platform/records/PlatformCyclingPedalingCadenceSample;", "Landroidx/health/connect/client/records/CyclingPedalingCadenceRecord$Sample;", "toPlatformDistanceRecord", "toPlatformElevationGainedRecord", "toPlatformExerciseSessionRecord", "toPlatformExerciseLap", "Landroid/health/connect/datatypes/ExerciseLap;", "Landroidx/health/connect/client/records/ExerciseLap;", "toPlatformExerciseRoute", "Landroid/health/connect/datatypes/ExerciseRoute;", "Landroidx/health/connect/client/impl/platform/records/PlatformExerciseRoute;", "Landroidx/health/connect/client/records/ExerciseRoute;", "toPlatformExerciseSegment", "Landroid/health/connect/datatypes/ExerciseSegment;", "Landroidx/health/connect/client/records/ExerciseSegment;", "toPlatformFloorsClimbedRecord", "toPlatformHeartRateRecord", "toPlatformHeartRateSample", "Landroid/health/connect/datatypes/HeartRateRecord$HeartRateSample;", "Landroidx/health/connect/client/impl/platform/records/PlatformHeartRateSample;", "Landroidx/health/connect/client/records/HeartRateRecord$Sample;", "toPlatformHeartRateVariabilityRmssdRecord", "toPlatformHeightRecord", "toPlatformHydrationRecord", "toPlatformIntermenstrualBleedingRecord", "toPlatformLeanBodyMassRecord", "toPlatformMenstruationFlowRecord", "toPlatformMenstruationPeriodRecord", "toPlatformMindfulnessSessionRecord", "toPlatformNutritionRecord", "toPlatformOvulationTestRecord", "toPlatformOxygenSaturationRecord", "toPlatformPlannedExerciseSessionRecord", "Landroid/health/connect/datatypes/PlannedExerciseSessionRecord;", "Landroidx/health/connect/client/records/PlannedExerciseSessionRecord;", "toPlatformPlannedExerciseBlock", "Landroid/health/connect/datatypes/PlannedExerciseBlock;", "Landroidx/health/connect/client/records/PlannedExerciseBlock;", "toPlatformPlannedExerciseStep", "Landroid/health/connect/datatypes/PlannedExerciseStep;", "Landroidx/health/connect/client/records/PlannedExerciseStep;", "toPlatformExerciseCompletionGoal", "Landroid/health/connect/datatypes/ExerciseCompletionGoal;", "Landroidx/health/connect/client/records/ExerciseCompletionGoal;", "toPlatformExercisePerformanceTarget", "Landroid/health/connect/datatypes/ExercisePerformanceGoal;", "Landroidx/health/connect/client/records/ExercisePerformanceTarget;", "toSdkPlannedExerciseSessionRecord", "Landroidx/health/connect/client/impl/platform/records/PlatformPlannedExerciseSessionRecord;", "toSdkPlannedExerciseBlock", "Landroidx/health/connect/client/impl/platform/records/PlatformPlannedExerciseBlock;", "toSdkPlannedExerciseStep", "Landroidx/health/connect/client/impl/platform/records/PlatformPlannedExerciseStep;", "toSdkExerciseCompletionGoal", "Landroidx/health/connect/client/impl/platform/records/PlatformExerciseCompletionGoal;", "toSdkExercisePerformanceTarget", "Landroidx/health/connect/client/impl/platform/records/PlatformExercisePerformanceTarget;", "toPlatformPowerRecord", "toPlatformPowerRecordSample", "Landroid/health/connect/datatypes/PowerRecord$PowerRecordSample;", "Landroidx/health/connect/client/impl/platform/records/PlatformPowerRecordSample;", "Landroidx/health/connect/client/records/PowerRecord$Sample;", "toPlatformRespiratoryRateRecord", "toPlatformRestingHeartRateRecord", "toPlatformSexualActivityRecord", "toPlatformSkinTemperatureRecord", "toPlatformSkinTemperatureRecordDelta", "Landroid/health/connect/datatypes/SkinTemperatureRecord$Delta;", "Landroidx/health/connect/client/impl/platform/records/PlatformSkinTemperatureDelta;", "Landroidx/health/connect/client/records/SkinTemperatureRecord$Delta;", "toPlatformSleepSessionRecord", "toPlatformSleepSessionStage", "Landroid/health/connect/datatypes/SleepSessionRecord$Stage;", "Landroidx/health/connect/client/impl/platform/records/PlatformSleepSessionStage;", "Landroidx/health/connect/client/records/SleepSessionRecord$Stage;", "toPlatformSpeedRecord", "toPlatformSpeedRecordSample", "Landroid/health/connect/datatypes/SpeedRecord$SpeedRecordSample;", "Landroidx/health/connect/client/impl/platform/records/PlatformSpeedSample;", "Landroidx/health/connect/client/records/SpeedRecord$Sample;", "toPlatformStepsRecord", "toPlatformStepsCadenceRecord", "toPlatformStepsCadenceSample", "Landroid/health/connect/datatypes/StepsCadenceRecord$StepsCadenceRecordSample;", "Landroidx/health/connect/client/impl/platform/records/PlatformStepsCadenceSample;", "Landroidx/health/connect/client/records/StepsCadenceRecord$Sample;", "toPlatformTotalCaloriesBurnedRecord", "toPlatformVo2MaxRecord", "toPlatformWeightRecord", "toPlatformWheelchairPushesRecord", "toSdkCyclingPedalingCadenceSample", "toSdkHeartRateSample", "toSdkPowerRecordSample", "toSdkSkinTemperatureDelta", "toSdkSpeedSample", "toSdkStepsCadenceSample", "toSdkSleepSessionStage", "toSdkExerciseRoute", "toSdkExerciseLap", "Landroidx/health/connect/client/impl/platform/records/PlatformExerciseLap;", "toSdkExerciseSegment", "Landroidx/health/connect/client/impl/platform/records/PlatformExerciseSegment;", "toSdkMedicalResourceId", "Landroidx/health/connect/client/records/MedicalResourceId;", "Landroid/health/connect/MedicalResourceId;", "Landroidx/health/connect/client/impl/platform/records/PlatformMedicalResourceId;", "toSdkFhirVersion", "Landroidx/health/connect/client/records/FhirVersion;", "Landroid/health/connect/datatypes/FhirVersion;", "Landroidx/health/connect/client/impl/platform/records/PlatformFhirVersion;", "toSdkMedicalDataSource", "Landroidx/health/connect/client/records/MedicalDataSource;", "Landroid/health/connect/datatypes/MedicalDataSource;", "Landroidx/health/connect/client/impl/platform/records/PlatformMedicalDataSource;", "toSdkFhirResource", "Landroidx/health/connect/client/records/FhirResource;", "Landroid/health/connect/datatypes/FhirResource;", "Landroidx/health/connect/client/impl/platform/records/PlatformFhirResource;", "toSdkMedicalResource", "Landroidx/health/connect/client/records/MedicalResource;", "Landroid/health/connect/datatypes/MedicalResource;", "Landroidx/health/connect/client/impl/platform/records/PlatformMedicalResource;", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RecordConvertersKt {
    public static final Class<? extends Record> toPlatformRecordClass(KClass<? extends androidx.health.connect.client.records.Record> kClass) {
        zcp.c(kClass, "");
        Class<? extends Record> platformRecordClassExt15 = toPlatformRecordClassExt15(kClass);
        if (platformRecordClassExt15 != null || (platformRecordClassExt15 = toPlatformRecordClassExt13(kClass)) != null) {
            return platformRecordClassExt15;
        }
        Class<? extends Record> cls = RecordMappingsKt.getSDK_TO_PLATFORM_RECORD_CLASS().get(kClass);
        if (cls != null) {
            return cls;
        }
        throw new IllegalArgumentException("Unsupported record type " + kClass);
    }

    private static final Class<? extends Record> toPlatformRecordClassExt13(KClass<? extends androidx.health.connect.client.records.Record> kClass) {
        if (UtilsKt.isAtLeastSdkExtension13()) {
            return RecordMappingsKt.getSDK_TO_PLATFORM_RECORD_CLASS_EXT_13().get(kClass);
        }
        return null;
    }

    private static final Class<? extends Record> toPlatformRecordClassExt15(KClass<? extends androidx.health.connect.client.records.Record> kClass) {
        if (UtilsKt.isAtLeastSdkExtension15()) {
            return RecordMappingsKt.getSDK_TO_PLATFORM_RECORD_CLASS_EXT_15().get(kClass);
        }
        return null;
    }

    public static final Record toPlatformRecord(androidx.health.connect.client.records.Record record) {
        zcp.c(record, "");
        Record platformRecordExt15 = toPlatformRecordExt15(record);
        if (platformRecordExt15 != null || (platformRecordExt15 = toPlatformRecordExt13(record)) != null) {
            return platformRecordExt15;
        }
        if (record instanceof ActiveCaloriesBurnedRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformActiveCaloriesBurnedRecord((ActiveCaloriesBurnedRecord) record));
        }
        if (record instanceof BasalBodyTemperatureRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformBasalBodyTemperatureRecord((BasalBodyTemperatureRecord) record));
        }
        if (record instanceof BasalMetabolicRateRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformBasalMetabolicRateRecord((BasalMetabolicRateRecord) record));
        }
        if (record instanceof BloodGlucoseRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformBloodGlucoseRecord((BloodGlucoseRecord) record));
        }
        if (record instanceof BloodPressureRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformBloodPressureRecord((BloodPressureRecord) record));
        }
        if (record instanceof BodyFatRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformBodyFatRecord((BodyFatRecord) record));
        }
        if (record instanceof BodyTemperatureRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformBodyTemperatureRecord((BodyTemperatureRecord) record));
        }
        if (record instanceof BodyWaterMassRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformBodyWaterMassRecord((BodyWaterMassRecord) record));
        }
        if (record instanceof BoneMassRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformBoneMassRecord((BoneMassRecord) record));
        }
        if (record instanceof CervicalMucusRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformCervicalMucusRecord((CervicalMucusRecord) record));
        }
        if (record instanceof CyclingPedalingCadenceRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformCyclingPedalingCadenceRecord((CyclingPedalingCadenceRecord) record));
        }
        if (record instanceof DistanceRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformDistanceRecord((DistanceRecord) record));
        }
        if (record instanceof ElevationGainedRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformElevationGainedRecord((ElevationGainedRecord) record));
        }
        if (record instanceof ExerciseSessionRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformExerciseSessionRecord((ExerciseSessionRecord) record));
        }
        if (record instanceof FloorsClimbedRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformFloorsClimbedRecord((FloorsClimbedRecord) record));
        }
        if (record instanceof HeartRateRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformHeartRateRecord((HeartRateRecord) record));
        }
        if (record instanceof HeartRateVariabilityRmssdRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformHeartRateVariabilityRmssdRecord((HeartRateVariabilityRmssdRecord) record));
        }
        if (record instanceof HeightRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformHeightRecord((HeightRecord) record));
        }
        if (record instanceof HydrationRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformHydrationRecord((HydrationRecord) record));
        }
        if (record instanceof IntermenstrualBleedingRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformIntermenstrualBleedingRecord((IntermenstrualBleedingRecord) record));
        }
        if (record instanceof LeanBodyMassRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformLeanBodyMassRecord((LeanBodyMassRecord) record));
        }
        if (record instanceof MenstruationFlowRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformMenstruationFlowRecord((MenstruationFlowRecord) record));
        }
        if (record instanceof MenstruationPeriodRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformMenstruationPeriodRecord((MenstruationPeriodRecord) record));
        }
        if (record instanceof NutritionRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformNutritionRecord((NutritionRecord) record));
        }
        if (record instanceof OvulationTestRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformOvulationTestRecord((OvulationTestRecord) record));
        }
        if (record instanceof OxygenSaturationRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformOxygenSaturationRecord((OxygenSaturationRecord) record));
        }
        if (record instanceof PowerRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformPowerRecord((PowerRecord) record));
        }
        if (record instanceof RespiratoryRateRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformRespiratoryRateRecord((RespiratoryRateRecord) record));
        }
        if (record instanceof RestingHeartRateRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformRestingHeartRateRecord((RestingHeartRateRecord) record));
        }
        if (record instanceof SexualActivityRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformSexualActivityRecord((SexualActivityRecord) record));
        }
        if (record instanceof SleepSessionRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformSleepSessionRecord((SleepSessionRecord) record));
        }
        if (record instanceof SpeedRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformSpeedRecord((SpeedRecord) record));
        }
        if (record instanceof StepsCadenceRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformStepsCadenceRecord((StepsCadenceRecord) record));
        }
        if (record instanceof StepsRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformStepsRecord((StepsRecord) record));
        }
        if (record instanceof TotalCaloriesBurnedRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformTotalCaloriesBurnedRecord((TotalCaloriesBurnedRecord) record));
        }
        if (record instanceof Vo2MaxRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformVo2MaxRecord((Vo2MaxRecord) record));
        }
        if (record instanceof WeightRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformWeightRecord((WeightRecord) record));
        }
        if (record instanceof WheelchairPushesRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformWheelchairPushesRecord((WheelchairPushesRecord) record));
        }
        throw new IllegalArgumentException("Unsupported record " + record);
    }

    private static final Record toPlatformRecordExt13(androidx.health.connect.client.records.Record record) {
        if (!UtilsKt.isAtLeastSdkExtension13()) {
            return null;
        }
        if (record instanceof PlannedExerciseSessionRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformPlannedExerciseSessionRecord((PlannedExerciseSessionRecord) record));
        }
        if (record instanceof SkinTemperatureRecord) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformSkinTemperatureRecord((SkinTemperatureRecord) record));
        }
        return null;
    }

    private static final Record toPlatformRecordExt15(androidx.health.connect.client.records.Record record) {
        if (UtilsKt.isAtLeastSdkExtension15() && (record instanceof MindfulnessSessionRecord)) {
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m((Object) toPlatformMindfulnessSessionRecord((MindfulnessSessionRecord) record));
        }
        return null;
    }

    public static final androidx.health.connect.client.records.Record toSdkRecord(Record record) {
        zcp.c(record, "");
        androidx.health.connect.client.records.Record sdkRecordExt15 = toSdkRecordExt15(record);
        if (sdkRecordExt15 != null || (sdkRecordExt15 = toSdkRecordExt13(record)) != null) {
            return sdkRecordExt15;
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m207m((Object) record)) {
            return toSdkActiveCaloriesBurnedRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m$11(record)) {
            return toSdkBasalBodyTemperatureRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$9(record)) {
            return toSdkBasalMetabolicRateRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m211m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$20(record)) {
            return toSdkBloodGlucoseRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m212m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$24(record)) {
            return toSdkBloodPressureRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m213m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m$1(record)) {
            return toSdkBodyFatRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m168m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m$2(record)) {
            return toSdkBodyTemperatureRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m169m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m$3(record)) {
            return toSdkBodyWaterMassRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m170m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m$4(record)) {
            return toSdkBoneMassRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m171m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m$5(record)) {
            return toSdkCervicalMucusRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m172m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m$6(record)) {
            return toSdkCyclingPedalingCadenceRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m174m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m$7(record)) {
            return toSdkDistanceRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m175m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m$8(record)) {
            return toSdkElevationGainedRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m176m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m$9(record)) {
            return toSdkExerciseSessionRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m179m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m$10(record)) {
            return toSdkFloorsClimbedRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m180m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m$12(record)) {
            return toSdkHeartRateRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m181m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m249m((Object) record)) {
            return toSdkHeartRateVariabilityRmssdRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m214m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$1(record)) {
            return toSdkHeightRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m215m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$2(record)) {
            return toSdkHydrationRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m216m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$3(record)) {
            return toSdkIntermenstrualBleedingRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m217m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$4(record)) {
            return toSdkLeanBodyMassRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m218m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$5(record)) {
            return toSdkMenstruationFlowRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m219m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$6(record)) {
            return toSdkMenstruationPeriodRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m220m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$7(record)) {
            return toSdkNutritionRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m223m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$8(record)) {
            return toSdkOvulationTestRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m224m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$10(record)) {
            return toSdkOxygenSaturationRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m225m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$11(record)) {
            return toSdkPowerRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m227m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$12(record)) {
            return toSdkRespiratoryRateRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m228m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$13(record)) {
            return toSdkRestingHeartRateRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m229m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$14(record)) {
            return toSdkSexualActivityRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m230m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$15(record)) {
            return toSdkSleepSessionRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m231m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$16(record)) {
            return toSdkSpeedRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m232m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$17(record)) {
            return toSdkStepsCadenceRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m233m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$18(record)) {
            return toSdkStepsRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m234m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$19(record)) {
            return toSdkTotalCaloriesBurnedRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m235m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$21(record)) {
            return toSdkVo2MaxRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m236m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$22(record)) {
            return toSdkWeightRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m237m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$23(record)) {
            return toWheelchairPushesRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m238m((Object) record));
        }
        throw new IllegalArgumentException("Unsupported record " + record);
    }

    private static final androidx.health.connect.client.records.Record toSdkRecordExt13(Record record) {
        if (!UtilsKt.isAtLeastSdkExtension13()) {
            return null;
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m356m((Object) record)) {
            return toSdkPlannedExerciseSessionRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m294m((Object) record));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m326m((Object) record)) {
            return toSdkSkinTemperatureRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m297m((Object) record));
        }
        return null;
    }

    private static final androidx.health.connect.client.records.Record toSdkRecordExt15(Record record) {
        if (UtilsKt.isAtLeastSdkExtension15() && RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m282m((Object) record)) {
            return toSdkMindfulnessSessionRecord(RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m293m((Object) record));
        }
        return null;
    }

    private static final ActiveCaloriesBurnedRecord toSdkActiveCaloriesBurnedRecord(android.health.connect.datatypes.ActiveCaloriesBurnedRecord activeCaloriesBurnedRecord) {
        Instant startTime = activeCaloriesBurnedRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = activeCaloriesBurnedRecord.getStartZoneOffset();
        Instant endTime = activeCaloriesBurnedRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = activeCaloriesBurnedRecord.getEndZoneOffset();
        Energy energy = activeCaloriesBurnedRecord.getEnergy();
        zcp.b((Object) energy, "");
        androidx.health.connect.client.units.Energy sdkEnergy = UnitConvertersKt.toSdkEnergy(energy);
        android.health.connect.datatypes.Metadata metadata = activeCaloriesBurnedRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new ActiveCaloriesBurnedRecord(startTime, startZoneOffset, endTime, endZoneOffset, sdkEnergy, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final BasalBodyTemperatureRecord toSdkBasalBodyTemperatureRecord(android.health.connect.datatypes.BasalBodyTemperatureRecord basalBodyTemperatureRecord) {
        Instant time = basalBodyTemperatureRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = basalBodyTemperatureRecord.getZoneOffset();
        Temperature temperature = basalBodyTemperatureRecord.getTemperature();
        zcp.b((Object) temperature, "");
        androidx.health.connect.client.units.Temperature sdkTemperature = UnitConvertersKt.toSdkTemperature(temperature);
        int measurementLocation = basalBodyTemperatureRecord.getMeasurementLocation();
        android.health.connect.datatypes.Metadata metadata = basalBodyTemperatureRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new BasalBodyTemperatureRecord(time, zoneOffset, MetadataConvertersKt.toSdkMetadata(metadata), sdkTemperature, measurementLocation);
    }

    private static final BasalMetabolicRateRecord toSdkBasalMetabolicRateRecord(android.health.connect.datatypes.BasalMetabolicRateRecord basalMetabolicRateRecord) {
        Instant time = basalMetabolicRateRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = basalMetabolicRateRecord.getZoneOffset();
        Power basalMetabolicRate = basalMetabolicRateRecord.getBasalMetabolicRate();
        zcp.b((Object) basalMetabolicRate, "");
        androidx.health.connect.client.units.Power sdkPower = UnitConvertersKt.toSdkPower(basalMetabolicRate);
        android.health.connect.datatypes.Metadata metadata = basalMetabolicRateRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new BasalMetabolicRateRecord(time, zoneOffset, sdkPower, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final BloodGlucoseRecord toSdkBloodGlucoseRecord(android.health.connect.datatypes.BloodGlucoseRecord bloodGlucoseRecord) {
        Instant time = bloodGlucoseRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = bloodGlucoseRecord.getZoneOffset();
        BloodGlucose level = bloodGlucoseRecord.getLevel();
        zcp.b((Object) level, "");
        androidx.health.connect.client.units.BloodGlucose sdkBloodGlucose = UnitConvertersKt.toSdkBloodGlucose(level);
        int sdkBloodGlucoseSpecimenSource = IntDefMappingsKt.toSdkBloodGlucoseSpecimenSource(bloodGlucoseRecord.getSpecimenSource());
        int sdkMealType = IntDefMappingsKt.toSdkMealType(bloodGlucoseRecord.getMealType());
        int sdkRelationToMeal = IntDefMappingsKt.toSdkRelationToMeal(bloodGlucoseRecord.getRelationToMeal());
        android.health.connect.datatypes.Metadata metadata = bloodGlucoseRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new BloodGlucoseRecord(time, zoneOffset, MetadataConvertersKt.toSdkMetadata(metadata), sdkBloodGlucose, sdkBloodGlucoseSpecimenSource, sdkMealType, sdkRelationToMeal);
    }

    private static final BloodPressureRecord toSdkBloodPressureRecord(android.health.connect.datatypes.BloodPressureRecord bloodPressureRecord) {
        Instant time = bloodPressureRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = bloodPressureRecord.getZoneOffset();
        Pressure systolic = bloodPressureRecord.getSystolic();
        zcp.b((Object) systolic, "");
        androidx.health.connect.client.units.Pressure sdkPressure = UnitConvertersKt.toSdkPressure(systolic);
        Pressure diastolic = bloodPressureRecord.getDiastolic();
        zcp.b((Object) diastolic, "");
        androidx.health.connect.client.units.Pressure sdkPressure2 = UnitConvertersKt.toSdkPressure(diastolic);
        int sdkBloodPressureBodyPosition = IntDefMappingsKt.toSdkBloodPressureBodyPosition(bloodPressureRecord.getBodyPosition());
        int sdkBloodPressureMeasurementLocation = IntDefMappingsKt.toSdkBloodPressureMeasurementLocation(bloodPressureRecord.getMeasurementLocation());
        android.health.connect.datatypes.Metadata metadata = bloodPressureRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new BloodPressureRecord(time, zoneOffset, MetadataConvertersKt.toSdkMetadata(metadata), sdkPressure, sdkPressure2, sdkBloodPressureBodyPosition, sdkBloodPressureMeasurementLocation);
    }

    private static final BodyFatRecord toSdkBodyFatRecord(android.health.connect.datatypes.BodyFatRecord bodyFatRecord) {
        Instant time = bodyFatRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = bodyFatRecord.getZoneOffset();
        Percentage percentage = bodyFatRecord.getPercentage();
        zcp.b((Object) percentage, "");
        androidx.health.connect.client.units.Percentage sdkPercentage = UnitConvertersKt.toSdkPercentage(percentage);
        android.health.connect.datatypes.Metadata metadata = bodyFatRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new BodyFatRecord(time, zoneOffset, sdkPercentage, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final BodyTemperatureRecord toSdkBodyTemperatureRecord(android.health.connect.datatypes.BodyTemperatureRecord bodyTemperatureRecord) {
        Instant time = bodyTemperatureRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = bodyTemperatureRecord.getZoneOffset();
        Temperature temperature = bodyTemperatureRecord.getTemperature();
        zcp.b((Object) temperature, "");
        androidx.health.connect.client.units.Temperature sdkTemperature = UnitConvertersKt.toSdkTemperature(temperature);
        int sdkBodyTemperatureMeasurementLocation = IntDefMappingsKt.toSdkBodyTemperatureMeasurementLocation(bodyTemperatureRecord.getMeasurementLocation());
        android.health.connect.datatypes.Metadata metadata = bodyTemperatureRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new BodyTemperatureRecord(time, zoneOffset, MetadataConvertersKt.toSdkMetadata(metadata), sdkTemperature, sdkBodyTemperatureMeasurementLocation);
    }

    private static final BodyWaterMassRecord toSdkBodyWaterMassRecord(android.health.connect.datatypes.BodyWaterMassRecord bodyWaterMassRecord) {
        Instant time = bodyWaterMassRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = bodyWaterMassRecord.getZoneOffset();
        Mass bodyWaterMass = bodyWaterMassRecord.getBodyWaterMass();
        zcp.b((Object) bodyWaterMass, "");
        androidx.health.connect.client.units.Mass sdkMass = UnitConvertersKt.toSdkMass(bodyWaterMass);
        android.health.connect.datatypes.Metadata metadata = bodyWaterMassRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new BodyWaterMassRecord(time, zoneOffset, sdkMass, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final BoneMassRecord toSdkBoneMassRecord(android.health.connect.datatypes.BoneMassRecord boneMassRecord) {
        Instant time = boneMassRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = boneMassRecord.getZoneOffset();
        Mass mass = boneMassRecord.getMass();
        zcp.b((Object) mass, "");
        androidx.health.connect.client.units.Mass sdkMass = UnitConvertersKt.toSdkMass(mass);
        android.health.connect.datatypes.Metadata metadata = boneMassRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new BoneMassRecord(time, zoneOffset, sdkMass, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final CervicalMucusRecord toSdkCervicalMucusRecord(android.health.connect.datatypes.CervicalMucusRecord cervicalMucusRecord) {
        Instant time = cervicalMucusRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = cervicalMucusRecord.getZoneOffset();
        int sdkCervicalMucusAppearance = IntDefMappingsKt.toSdkCervicalMucusAppearance(cervicalMucusRecord.getAppearance());
        int sdkCervicalMucusSensation = IntDefMappingsKt.toSdkCervicalMucusSensation(cervicalMucusRecord.getSensation());
        android.health.connect.datatypes.Metadata metadata = cervicalMucusRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new CervicalMucusRecord(time, zoneOffset, MetadataConvertersKt.toSdkMetadata(metadata), sdkCervicalMucusAppearance, sdkCervicalMucusSensation);
    }

    private static final CyclingPedalingCadenceRecord toSdkCyclingPedalingCadenceRecord(android.health.connect.datatypes.CyclingPedalingCadenceRecord cyclingPedalingCadenceRecord) {
        Instant startTime = cyclingPedalingCadenceRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = cyclingPedalingCadenceRecord.getStartZoneOffset();
        Instant endTime = cyclingPedalingCadenceRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = cyclingPedalingCadenceRecord.getEndZoneOffset();
        List samples = cyclingPedalingCadenceRecord.getSamples();
        zcp.b((Object) samples, "");
        List list = samples;
        ArrayList arrayList = new ArrayList(yzp.e(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample cyclingPedalingCadenceRecordSampleM173m = RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m173m(it.next());
            zcp.e(cyclingPedalingCadenceRecordSampleM173m);
            arrayList.add(toSdkCyclingPedalingCadenceSample(cyclingPedalingCadenceRecordSampleM173m));
        }
        List listE = yzp.e((Iterable) arrayList, new Comparator() { // from class: androidx.health.connect.client.impl.platform.records.RecordConvertersKt$toSdkCyclingPedalingCadenceRecord$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return zay.d(((CyclingPedalingCadenceRecord.Sample) t).getTime(), ((CyclingPedalingCadenceRecord.Sample) t2).getTime());
            }
        });
        android.health.connect.datatypes.Metadata metadata = cyclingPedalingCadenceRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new CyclingPedalingCadenceRecord(startTime, startZoneOffset, endTime, endZoneOffset, listE, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final DistanceRecord toSdkDistanceRecord(android.health.connect.datatypes.DistanceRecord distanceRecord) {
        Instant startTime = distanceRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = distanceRecord.getStartZoneOffset();
        Instant endTime = distanceRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = distanceRecord.getEndZoneOffset();
        Length distance = distanceRecord.getDistance();
        zcp.b((Object) distance, "");
        androidx.health.connect.client.units.Length sdkLength = UnitConvertersKt.toSdkLength(distance);
        android.health.connect.datatypes.Metadata metadata = distanceRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new DistanceRecord(startTime, startZoneOffset, endTime, endZoneOffset, sdkLength, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final ElevationGainedRecord toSdkElevationGainedRecord(android.health.connect.datatypes.ElevationGainedRecord elevationGainedRecord) {
        Instant startTime = elevationGainedRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = elevationGainedRecord.getStartZoneOffset();
        Instant endTime = elevationGainedRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = elevationGainedRecord.getEndZoneOffset();
        Length elevation = elevationGainedRecord.getElevation();
        zcp.b((Object) elevation, "");
        androidx.health.connect.client.units.Length sdkLength = UnitConvertersKt.toSdkLength(elevation);
        android.health.connect.datatypes.Metadata metadata = elevationGainedRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new ElevationGainedRecord(startTime, startZoneOffset, endTime, endZoneOffset, sdkLength, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final ExerciseSessionRecord toSdkExerciseSessionRecord(android.health.connect.datatypes.ExerciseSessionRecord exerciseSessionRecord) {
        ExerciseRouteResult.Data consentRequired;
        Instant startTime = exerciseSessionRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = exerciseSessionRecord.getStartZoneOffset();
        Instant endTime = exerciseSessionRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = exerciseSessionRecord.getEndZoneOffset();
        int sdkExerciseSessionType = IntDefMappingsKt.toSdkExerciseSessionType(exerciseSessionRecord.getExerciseType());
        CharSequence title = exerciseSessionRecord.getTitle();
        String string = title != null ? title.toString() : null;
        CharSequence notes = exerciseSessionRecord.getNotes();
        String string2 = notes != null ? notes.toString() : null;
        List laps = exerciseSessionRecord.getLaps();
        zcp.b((Object) laps, "");
        List list = laps;
        ArrayList arrayList = new ArrayList(yzp.e(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ExerciseLap exerciseLapM = RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m(it.next());
            zcp.e(exerciseLapM);
            arrayList.add(toSdkExerciseLap(exerciseLapM));
        }
        List listE = yzp.e((Iterable) arrayList, new Comparator() { // from class: androidx.health.connect.client.impl.platform.records.RecordConvertersKt$toSdkExerciseSessionRecord$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return zay.d(((androidx.health.connect.client.records.ExerciseLap) t).getStartTime(), ((androidx.health.connect.client.records.ExerciseLap) t2).getStartTime());
            }
        });
        List segments = exerciseSessionRecord.getSegments();
        zcp.b((Object) segments, "");
        List list2 = segments;
        ArrayList arrayList2 = new ArrayList(yzp.e(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ExerciseSegment exerciseSegmentM252m = RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m252m(it2.next());
            zcp.e(exerciseSegmentM252m);
            arrayList2.add(toSdkExerciseSegment(exerciseSegmentM252m));
        }
        List listE2 = yzp.e((Iterable) arrayList2, new Comparator() { // from class: androidx.health.connect.client.impl.platform.records.RecordConvertersKt$toSdkExerciseSessionRecord$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return zay.d(((androidx.health.connect.client.records.ExerciseSegment) t).getStartTime(), ((androidx.health.connect.client.records.ExerciseSegment) t2).getStartTime());
            }
        });
        android.health.connect.datatypes.Metadata metadata = exerciseSessionRecord.getMetadata();
        zcp.b((Object) metadata, "");
        androidx.health.connect.client.records.metadata.Metadata sdkMetadata = MetadataConvertersKt.toSdkMetadata(metadata);
        ExerciseRoute route = exerciseSessionRecord.getRoute();
        if (route != null) {
            consentRequired = new ExerciseRouteResult.Data(toSdkExerciseRoute(route));
        } else {
            consentRequired = exerciseSessionRecord.hasRoute() ? new ExerciseRouteResult.ConsentRequired() : new ExerciseRouteResult.NoData();
        }
        return new ExerciseSessionRecord(startTime, startZoneOffset, endTime, endZoneOffset, sdkMetadata, sdkExerciseSessionType, string, string2, (List<androidx.health.connect.client.records.ExerciseSegment>) listE2, (List<androidx.health.connect.client.records.ExerciseLap>) listE, consentRequired, UtilsKt.isAtLeastSdkExtension13() ? exerciseSessionRecord.getPlannedExerciseSessionId() : null);
    }

    private static final FloorsClimbedRecord toSdkFloorsClimbedRecord(android.health.connect.datatypes.FloorsClimbedRecord floorsClimbedRecord) {
        Instant startTime = floorsClimbedRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = floorsClimbedRecord.getStartZoneOffset();
        Instant endTime = floorsClimbedRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = floorsClimbedRecord.getEndZoneOffset();
        double floors = floorsClimbedRecord.getFloors();
        android.health.connect.datatypes.Metadata metadata = floorsClimbedRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new FloorsClimbedRecord(startTime, startZoneOffset, endTime, endZoneOffset, floors, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final HeartRateRecord toSdkHeartRateRecord(android.health.connect.datatypes.HeartRateRecord heartRateRecord) {
        Instant startTime = heartRateRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = heartRateRecord.getStartZoneOffset();
        Instant endTime = heartRateRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = heartRateRecord.getEndZoneOffset();
        List samples = heartRateRecord.getSamples();
        zcp.b((Object) samples, "");
        List list = samples;
        ArrayList arrayList = new ArrayList(yzp.e(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.health.connect.datatypes.HeartRateRecord.HeartRateSample heartRateSampleM = RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m(it.next());
            zcp.e(heartRateSampleM);
            arrayList.add(toSdkHeartRateSample(heartRateSampleM));
        }
        List listE = yzp.e((Iterable) arrayList, new Comparator() { // from class: androidx.health.connect.client.impl.platform.records.RecordConvertersKt$toSdkHeartRateRecord$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return zay.d(((HeartRateRecord.Sample) t).getTime(), ((HeartRateRecord.Sample) t2).getTime());
            }
        });
        android.health.connect.datatypes.Metadata metadata = heartRateRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new HeartRateRecord(startTime, startZoneOffset, endTime, endZoneOffset, listE, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final HeartRateVariabilityRmssdRecord toSdkHeartRateVariabilityRmssdRecord(android.health.connect.datatypes.HeartRateVariabilityRmssdRecord heartRateVariabilityRmssdRecord) {
        Instant time = heartRateVariabilityRmssdRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = heartRateVariabilityRmssdRecord.getZoneOffset();
        double heartRateVariabilityMillis = heartRateVariabilityRmssdRecord.getHeartRateVariabilityMillis();
        android.health.connect.datatypes.Metadata metadata = heartRateVariabilityRmssdRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new HeartRateVariabilityRmssdRecord(time, zoneOffset, heartRateVariabilityMillis, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final HeightRecord toSdkHeightRecord(android.health.connect.datatypes.HeightRecord heightRecord) {
        Instant time = heightRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = heightRecord.getZoneOffset();
        Length height = heightRecord.getHeight();
        zcp.b((Object) height, "");
        androidx.health.connect.client.units.Length sdkLength = UnitConvertersKt.toSdkLength(height);
        android.health.connect.datatypes.Metadata metadata = heightRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new HeightRecord(time, zoneOffset, sdkLength, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final HydrationRecord toSdkHydrationRecord(android.health.connect.datatypes.HydrationRecord hydrationRecord) {
        Instant startTime = hydrationRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = hydrationRecord.getStartZoneOffset();
        Instant endTime = hydrationRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = hydrationRecord.getEndZoneOffset();
        Volume volume = hydrationRecord.getVolume();
        zcp.b((Object) volume, "");
        androidx.health.connect.client.units.Volume sdkVolume = UnitConvertersKt.toSdkVolume(volume);
        android.health.connect.datatypes.Metadata metadata = hydrationRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new HydrationRecord(startTime, startZoneOffset, endTime, endZoneOffset, sdkVolume, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final IntermenstrualBleedingRecord toSdkIntermenstrualBleedingRecord(android.health.connect.datatypes.IntermenstrualBleedingRecord intermenstrualBleedingRecord) {
        Instant time = intermenstrualBleedingRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = intermenstrualBleedingRecord.getZoneOffset();
        android.health.connect.datatypes.Metadata metadata = intermenstrualBleedingRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new IntermenstrualBleedingRecord(time, zoneOffset, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final LeanBodyMassRecord toSdkLeanBodyMassRecord(android.health.connect.datatypes.LeanBodyMassRecord leanBodyMassRecord) {
        Instant time = leanBodyMassRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = leanBodyMassRecord.getZoneOffset();
        Mass mass = leanBodyMassRecord.getMass();
        zcp.b((Object) mass, "");
        androidx.health.connect.client.units.Mass sdkMass = UnitConvertersKt.toSdkMass(mass);
        android.health.connect.datatypes.Metadata metadata = leanBodyMassRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new LeanBodyMassRecord(time, zoneOffset, sdkMass, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final MenstruationFlowRecord toSdkMenstruationFlowRecord(android.health.connect.datatypes.MenstruationFlowRecord menstruationFlowRecord) {
        Instant time = menstruationFlowRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = menstruationFlowRecord.getZoneOffset();
        int sdkMenstruationFlow = IntDefMappingsKt.toSdkMenstruationFlow(menstruationFlowRecord.getFlow());
        android.health.connect.datatypes.Metadata metadata = menstruationFlowRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new MenstruationFlowRecord(time, zoneOffset, MetadataConvertersKt.toSdkMetadata(metadata), sdkMenstruationFlow);
    }

    private static final MindfulnessSessionRecord toSdkMindfulnessSessionRecord(android.health.connect.datatypes.MindfulnessSessionRecord mindfulnessSessionRecord) {
        Instant startTime = mindfulnessSessionRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = mindfulnessSessionRecord.getStartZoneOffset();
        Instant endTime = mindfulnessSessionRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = mindfulnessSessionRecord.getEndZoneOffset();
        android.health.connect.datatypes.Metadata metadata = mindfulnessSessionRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new MindfulnessSessionRecord(startTime, startZoneOffset, endTime, endZoneOffset, MetadataConvertersKt.toSdkMetadata(metadata), IntDefMappingsKt.toSdkMindfulnessSessionType(mindfulnessSessionRecord.getMindfulnessSessionType()), String.valueOf(mindfulnessSessionRecord.getTitle()), String.valueOf(mindfulnessSessionRecord.getNotes()));
    }

    private static final MenstruationPeriodRecord toSdkMenstruationPeriodRecord(android.health.connect.datatypes.MenstruationPeriodRecord menstruationPeriodRecord) {
        Instant startTime = menstruationPeriodRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = menstruationPeriodRecord.getStartZoneOffset();
        Instant endTime = menstruationPeriodRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = menstruationPeriodRecord.getEndZoneOffset();
        android.health.connect.datatypes.Metadata metadata = menstruationPeriodRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new MenstruationPeriodRecord(startTime, startZoneOffset, endTime, endZoneOffset, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final NutritionRecord toSdkNutritionRecord(android.health.connect.datatypes.NutritionRecord nutritionRecord) {
        Instant startTime = nutritionRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = nutritionRecord.getStartZoneOffset();
        Instant endTime = nutritionRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = nutritionRecord.getEndZoneOffset();
        String mealName = nutritionRecord.getMealName();
        int sdkMealType = IntDefMappingsKt.toSdkMealType(nutritionRecord.getMealType());
        android.health.connect.datatypes.Metadata metadata = nutritionRecord.getMetadata();
        zcp.b((Object) metadata, "");
        androidx.health.connect.client.records.metadata.Metadata sdkMetadata = MetadataConvertersKt.toSdkMetadata(metadata);
        Mass biotin = nutritionRecord.getBiotin();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass = biotin != null ? UnitConvertersKt.toNonDefaultSdkMass(biotin) : null;
        Mass caffeine = nutritionRecord.getCaffeine();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass2 = caffeine != null ? UnitConvertersKt.toNonDefaultSdkMass(caffeine) : null;
        Mass calcium = nutritionRecord.getCalcium();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass3 = calcium != null ? UnitConvertersKt.toNonDefaultSdkMass(calcium) : null;
        Energy energy = nutritionRecord.getEnergy();
        androidx.health.connect.client.units.Energy nonDefaultSdkEnergy = energy != null ? UnitConvertersKt.toNonDefaultSdkEnergy(energy) : null;
        Energy energyFromFat = nutritionRecord.getEnergyFromFat();
        androidx.health.connect.client.units.Energy nonDefaultSdkEnergy2 = energyFromFat != null ? UnitConvertersKt.toNonDefaultSdkEnergy(energyFromFat) : null;
        Mass chloride = nutritionRecord.getChloride();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass4 = chloride != null ? UnitConvertersKt.toNonDefaultSdkMass(chloride) : null;
        Mass cholesterol = nutritionRecord.getCholesterol();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass5 = cholesterol != null ? UnitConvertersKt.toNonDefaultSdkMass(cholesterol) : null;
        Mass chromium = nutritionRecord.getChromium();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass6 = chromium != null ? UnitConvertersKt.toNonDefaultSdkMass(chromium) : null;
        Mass copper = nutritionRecord.getCopper();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass7 = copper != null ? UnitConvertersKt.toNonDefaultSdkMass(copper) : null;
        Mass dietaryFiber = nutritionRecord.getDietaryFiber();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass8 = dietaryFiber != null ? UnitConvertersKt.toNonDefaultSdkMass(dietaryFiber) : null;
        Mass folate = nutritionRecord.getFolate();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass9 = folate != null ? UnitConvertersKt.toNonDefaultSdkMass(folate) : null;
        Mass folicAcid = nutritionRecord.getFolicAcid();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass10 = folicAcid != null ? UnitConvertersKt.toNonDefaultSdkMass(folicAcid) : null;
        Mass iodine = nutritionRecord.getIodine();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass11 = iodine != null ? UnitConvertersKt.toNonDefaultSdkMass(iodine) : null;
        Mass iron = nutritionRecord.getIron();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass12 = iron != null ? UnitConvertersKt.toNonDefaultSdkMass(iron) : null;
        Mass magnesium = nutritionRecord.getMagnesium();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass13 = magnesium != null ? UnitConvertersKt.toNonDefaultSdkMass(magnesium) : null;
        Mass manganese = nutritionRecord.getManganese();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass14 = manganese != null ? UnitConvertersKt.toNonDefaultSdkMass(manganese) : null;
        Mass molybdenum = nutritionRecord.getMolybdenum();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass15 = molybdenum != null ? UnitConvertersKt.toNonDefaultSdkMass(molybdenum) : null;
        Mass monounsaturatedFat = nutritionRecord.getMonounsaturatedFat();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass16 = monounsaturatedFat != null ? UnitConvertersKt.toNonDefaultSdkMass(monounsaturatedFat) : null;
        Mass niacin = nutritionRecord.getNiacin();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass17 = niacin != null ? UnitConvertersKt.toNonDefaultSdkMass(niacin) : null;
        Mass pantothenicAcid = nutritionRecord.getPantothenicAcid();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass18 = pantothenicAcid != null ? UnitConvertersKt.toNonDefaultSdkMass(pantothenicAcid) : null;
        Mass phosphorus = nutritionRecord.getPhosphorus();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass19 = phosphorus != null ? UnitConvertersKt.toNonDefaultSdkMass(phosphorus) : null;
        Mass polyunsaturatedFat = nutritionRecord.getPolyunsaturatedFat();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass20 = polyunsaturatedFat != null ? UnitConvertersKt.toNonDefaultSdkMass(polyunsaturatedFat) : null;
        Mass potassium = nutritionRecord.getPotassium();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass21 = potassium != null ? UnitConvertersKt.toNonDefaultSdkMass(potassium) : null;
        Mass protein = nutritionRecord.getProtein();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass22 = protein != null ? UnitConvertersKt.toNonDefaultSdkMass(protein) : null;
        Mass riboflavin = nutritionRecord.getRiboflavin();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass23 = riboflavin != null ? UnitConvertersKt.toNonDefaultSdkMass(riboflavin) : null;
        Mass saturatedFat = nutritionRecord.getSaturatedFat();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass24 = saturatedFat != null ? UnitConvertersKt.toNonDefaultSdkMass(saturatedFat) : null;
        Mass selenium = nutritionRecord.getSelenium();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass25 = selenium != null ? UnitConvertersKt.toNonDefaultSdkMass(selenium) : null;
        Mass sodium = nutritionRecord.getSodium();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass26 = sodium != null ? UnitConvertersKt.toNonDefaultSdkMass(sodium) : null;
        Mass sugar = nutritionRecord.getSugar();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass27 = sugar != null ? UnitConvertersKt.toNonDefaultSdkMass(sugar) : null;
        Mass thiamin = nutritionRecord.getThiamin();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass28 = thiamin != null ? UnitConvertersKt.toNonDefaultSdkMass(thiamin) : null;
        Mass totalCarbohydrate = nutritionRecord.getTotalCarbohydrate();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass29 = totalCarbohydrate != null ? UnitConvertersKt.toNonDefaultSdkMass(totalCarbohydrate) : null;
        Mass totalFat = nutritionRecord.getTotalFat();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass30 = totalFat != null ? UnitConvertersKt.toNonDefaultSdkMass(totalFat) : null;
        Mass transFat = nutritionRecord.getTransFat();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass31 = transFat != null ? UnitConvertersKt.toNonDefaultSdkMass(transFat) : null;
        Mass unsaturatedFat = nutritionRecord.getUnsaturatedFat();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass32 = unsaturatedFat != null ? UnitConvertersKt.toNonDefaultSdkMass(unsaturatedFat) : null;
        Mass vitaminA = nutritionRecord.getVitaminA();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass33 = vitaminA != null ? UnitConvertersKt.toNonDefaultSdkMass(vitaminA) : null;
        Mass vitaminB12 = nutritionRecord.getVitaminB12();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass34 = vitaminB12 != null ? UnitConvertersKt.toNonDefaultSdkMass(vitaminB12) : null;
        Mass vitaminB6 = nutritionRecord.getVitaminB6();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass35 = vitaminB6 != null ? UnitConvertersKt.toNonDefaultSdkMass(vitaminB6) : null;
        Mass vitaminC = nutritionRecord.getVitaminC();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass36 = vitaminC != null ? UnitConvertersKt.toNonDefaultSdkMass(vitaminC) : null;
        Mass vitaminD = nutritionRecord.getVitaminD();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass37 = vitaminD != null ? UnitConvertersKt.toNonDefaultSdkMass(vitaminD) : null;
        Mass vitaminE = nutritionRecord.getVitaminE();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass38 = vitaminE != null ? UnitConvertersKt.toNonDefaultSdkMass(vitaminE) : null;
        Mass vitaminK = nutritionRecord.getVitaminK();
        androidx.health.connect.client.units.Mass nonDefaultSdkMass39 = vitaminK != null ? UnitConvertersKt.toNonDefaultSdkMass(vitaminK) : null;
        Mass zinc = nutritionRecord.getZinc();
        return new NutritionRecord(startTime, startZoneOffset, endTime, endZoneOffset, sdkMetadata, nonDefaultSdkMass, nonDefaultSdkMass2, nonDefaultSdkMass3, nonDefaultSdkEnergy, nonDefaultSdkEnergy2, nonDefaultSdkMass4, nonDefaultSdkMass5, nonDefaultSdkMass6, nonDefaultSdkMass7, nonDefaultSdkMass8, nonDefaultSdkMass9, nonDefaultSdkMass10, nonDefaultSdkMass11, nonDefaultSdkMass12, nonDefaultSdkMass13, nonDefaultSdkMass14, nonDefaultSdkMass15, nonDefaultSdkMass16, nonDefaultSdkMass17, nonDefaultSdkMass18, nonDefaultSdkMass19, nonDefaultSdkMass20, nonDefaultSdkMass21, nonDefaultSdkMass22, nonDefaultSdkMass23, nonDefaultSdkMass24, nonDefaultSdkMass25, nonDefaultSdkMass26, nonDefaultSdkMass27, nonDefaultSdkMass28, nonDefaultSdkMass29, nonDefaultSdkMass30, nonDefaultSdkMass31, nonDefaultSdkMass32, nonDefaultSdkMass33, nonDefaultSdkMass34, nonDefaultSdkMass35, nonDefaultSdkMass36, nonDefaultSdkMass37, nonDefaultSdkMass38, nonDefaultSdkMass39, zinc != null ? UnitConvertersKt.toNonDefaultSdkMass(zinc) : null, mealName, sdkMealType);
    }

    private static final OvulationTestRecord toSdkOvulationTestRecord(android.health.connect.datatypes.OvulationTestRecord ovulationTestRecord) {
        Instant time = ovulationTestRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = ovulationTestRecord.getZoneOffset();
        int sdkOvulationTestResult = IntDefMappingsKt.toSdkOvulationTestResult(ovulationTestRecord.getResult());
        android.health.connect.datatypes.Metadata metadata = ovulationTestRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new OvulationTestRecord(time, zoneOffset, sdkOvulationTestResult, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final OxygenSaturationRecord toSdkOxygenSaturationRecord(android.health.connect.datatypes.OxygenSaturationRecord oxygenSaturationRecord) {
        Instant time = oxygenSaturationRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = oxygenSaturationRecord.getZoneOffset();
        Percentage percentage = oxygenSaturationRecord.getPercentage();
        zcp.b((Object) percentage, "");
        androidx.health.connect.client.units.Percentage sdkPercentage = UnitConvertersKt.toSdkPercentage(percentage);
        android.health.connect.datatypes.Metadata metadata = oxygenSaturationRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new OxygenSaturationRecord(time, zoneOffset, sdkPercentage, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final PowerRecord toSdkPowerRecord(android.health.connect.datatypes.PowerRecord powerRecord) {
        Instant startTime = powerRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = powerRecord.getStartZoneOffset();
        Instant endTime = powerRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = powerRecord.getEndZoneOffset();
        List samples = powerRecord.getSamples();
        zcp.b((Object) samples, "");
        List list = samples;
        ArrayList arrayList = new ArrayList(yzp.e(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.health.connect.datatypes.PowerRecord.PowerRecordSample powerRecordSampleM295m = RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m295m(it.next());
            zcp.e(powerRecordSampleM295m);
            arrayList.add(toSdkPowerRecordSample(powerRecordSampleM295m));
        }
        List listE = yzp.e((Iterable) arrayList, new Comparator() { // from class: androidx.health.connect.client.impl.platform.records.RecordConvertersKt$toSdkPowerRecord$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return zay.d(((PowerRecord.Sample) t).getTime(), ((PowerRecord.Sample) t2).getTime());
            }
        });
        android.health.connect.datatypes.Metadata metadata = powerRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new PowerRecord(startTime, startZoneOffset, endTime, endZoneOffset, listE, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final RespiratoryRateRecord toSdkRespiratoryRateRecord(android.health.connect.datatypes.RespiratoryRateRecord respiratoryRateRecord) {
        Instant time = respiratoryRateRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = respiratoryRateRecord.getZoneOffset();
        double rate = respiratoryRateRecord.getRate();
        android.health.connect.datatypes.Metadata metadata = respiratoryRateRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new RespiratoryRateRecord(time, zoneOffset, rate, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final RestingHeartRateRecord toSdkRestingHeartRateRecord(android.health.connect.datatypes.RestingHeartRateRecord restingHeartRateRecord) {
        Instant time = restingHeartRateRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = restingHeartRateRecord.getZoneOffset();
        long beatsPerMinute = restingHeartRateRecord.getBeatsPerMinute();
        android.health.connect.datatypes.Metadata metadata = restingHeartRateRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new RestingHeartRateRecord(time, zoneOffset, beatsPerMinute, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final SexualActivityRecord toSdkSexualActivityRecord(android.health.connect.datatypes.SexualActivityRecord sexualActivityRecord) {
        Instant time = sexualActivityRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = sexualActivityRecord.getZoneOffset();
        int sdkProtectionUsed = IntDefMappingsKt.toSdkProtectionUsed(sexualActivityRecord.getProtectionUsed());
        android.health.connect.datatypes.Metadata metadata = sexualActivityRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new SexualActivityRecord(time, zoneOffset, MetadataConvertersKt.toSdkMetadata(metadata), sdkProtectionUsed);
    }

    private static final SleepSessionRecord toSdkSleepSessionRecord(android.health.connect.datatypes.SleepSessionRecord sleepSessionRecord) {
        Instant startTime = sleepSessionRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = sleepSessionRecord.getStartZoneOffset();
        Instant endTime = sleepSessionRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = sleepSessionRecord.getEndZoneOffset();
        android.health.connect.datatypes.Metadata metadata = sleepSessionRecord.getMetadata();
        zcp.b((Object) metadata, "");
        androidx.health.connect.client.records.metadata.Metadata sdkMetadata = MetadataConvertersKt.toSdkMetadata(metadata);
        CharSequence title = sleepSessionRecord.getTitle();
        String string = title != null ? title.toString() : null;
        CharSequence notes = sleepSessionRecord.getNotes();
        String string2 = notes != null ? notes.toString() : null;
        List stages = sleepSessionRecord.getStages();
        zcp.b((Object) stages, "");
        List list = stages;
        ArrayList arrayList = new ArrayList(yzp.e(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.health.connect.datatypes.SleepSessionRecord.Stage stageM298m = RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m298m(it.next());
            zcp.e(stageM298m);
            arrayList.add(toSdkSleepSessionStage(stageM298m));
        }
        return new SleepSessionRecord(startTime, startZoneOffset, endTime, endZoneOffset, sdkMetadata, string, string2, yzp.e((Iterable) arrayList, new Comparator() { // from class: androidx.health.connect.client.impl.platform.records.RecordConvertersKt$toSdkSleepSessionRecord$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return zay.d(((SleepSessionRecord.Stage) t).getStartTime(), ((SleepSessionRecord.Stage) t2).getStartTime());
            }
        }));
    }

    private static final SkinTemperatureRecord toSdkSkinTemperatureRecord(android.health.connect.datatypes.SkinTemperatureRecord skinTemperatureRecord) {
        Instant startTime = skinTemperatureRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = skinTemperatureRecord.getStartZoneOffset();
        Instant endTime = skinTemperatureRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = skinTemperatureRecord.getEndZoneOffset();
        android.health.connect.datatypes.Metadata metadata = skinTemperatureRecord.getMetadata();
        zcp.b((Object) metadata, "");
        androidx.health.connect.client.records.metadata.Metadata sdkMetadata = MetadataConvertersKt.toSdkMetadata(metadata);
        int sdkSkinTemperatureMeasurementLocation = IntDefMappingsKt.toSdkSkinTemperatureMeasurementLocation(skinTemperatureRecord.getMeasurementLocation());
        List deltas = skinTemperatureRecord.getDeltas();
        zcp.b((Object) deltas, "");
        List list = deltas;
        ArrayList arrayList = new ArrayList(yzp.e(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.health.connect.datatypes.SkinTemperatureRecord.Delta deltaM = RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m(it.next());
            zcp.e(deltaM);
            arrayList.add(toSdkSkinTemperatureDelta(deltaM));
        }
        ArrayList arrayList2 = arrayList;
        Temperature baseline = skinTemperatureRecord.getBaseline();
        return new SkinTemperatureRecord(startTime, startZoneOffset, endTime, endZoneOffset, sdkMetadata, arrayList2, baseline != null ? UnitConvertersKt.toSdkTemperature(baseline) : null, sdkSkinTemperatureMeasurementLocation);
    }

    private static final SpeedRecord toSdkSpeedRecord(android.health.connect.datatypes.SpeedRecord speedRecord) {
        Instant startTime = speedRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = speedRecord.getStartZoneOffset();
        Instant endTime = speedRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = speedRecord.getEndZoneOffset();
        List samples = speedRecord.getSamples();
        zcp.b((Object) samples, "");
        List list = samples;
        ArrayList arrayList = new ArrayList(yzp.e(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.health.connect.datatypes.SpeedRecord.SpeedRecordSample speedRecordSampleM299m = RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m299m(it.next());
            zcp.e(speedRecordSampleM299m);
            arrayList.add(toSdkSpeedSample(speedRecordSampleM299m));
        }
        List listE = yzp.e((Iterable) arrayList, new Comparator() { // from class: androidx.health.connect.client.impl.platform.records.RecordConvertersKt$toSdkSpeedRecord$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return zay.d(((SpeedRecord.Sample) t).getTime(), ((SpeedRecord.Sample) t2).getTime());
            }
        });
        android.health.connect.datatypes.Metadata metadata = speedRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new SpeedRecord(startTime, startZoneOffset, endTime, endZoneOffset, listE, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final StepsCadenceRecord toSdkStepsCadenceRecord(android.health.connect.datatypes.StepsCadenceRecord stepsCadenceRecord) {
        Instant startTime = stepsCadenceRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = stepsCadenceRecord.getStartZoneOffset();
        Instant endTime = stepsCadenceRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = stepsCadenceRecord.getEndZoneOffset();
        List samples = stepsCadenceRecord.getSamples();
        zcp.b((Object) samples, "");
        List list = samples;
        ArrayList arrayList = new ArrayList(yzp.e(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample stepsCadenceRecordSampleM184m = RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m184m(it.next());
            zcp.e(stepsCadenceRecordSampleM184m);
            arrayList.add(toSdkStepsCadenceSample(stepsCadenceRecordSampleM184m));
        }
        List listE = yzp.e((Iterable) arrayList, new Comparator() { // from class: androidx.health.connect.client.impl.platform.records.RecordConvertersKt$toSdkStepsCadenceRecord$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return zay.d(((StepsCadenceRecord.Sample) t).getTime(), ((StepsCadenceRecord.Sample) t2).getTime());
            }
        });
        android.health.connect.datatypes.Metadata metadata = stepsCadenceRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new StepsCadenceRecord(startTime, startZoneOffset, endTime, endZoneOffset, listE, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final StepsRecord toSdkStepsRecord(android.health.connect.datatypes.StepsRecord stepsRecord) {
        Instant startTime = stepsRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = stepsRecord.getStartZoneOffset();
        Instant endTime = stepsRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = stepsRecord.getEndZoneOffset();
        long count = stepsRecord.getCount();
        android.health.connect.datatypes.Metadata metadata = stepsRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new StepsRecord(startTime, startZoneOffset, endTime, endZoneOffset, count, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final TotalCaloriesBurnedRecord toSdkTotalCaloriesBurnedRecord(android.health.connect.datatypes.TotalCaloriesBurnedRecord totalCaloriesBurnedRecord) {
        Instant startTime = totalCaloriesBurnedRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = totalCaloriesBurnedRecord.getStartZoneOffset();
        Instant endTime = totalCaloriesBurnedRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = totalCaloriesBurnedRecord.getEndZoneOffset();
        Energy energy = totalCaloriesBurnedRecord.getEnergy();
        zcp.b((Object) energy, "");
        androidx.health.connect.client.units.Energy sdkEnergy = UnitConvertersKt.toSdkEnergy(energy);
        android.health.connect.datatypes.Metadata metadata = totalCaloriesBurnedRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new TotalCaloriesBurnedRecord(startTime, startZoneOffset, endTime, endZoneOffset, sdkEnergy, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final Vo2MaxRecord toSdkVo2MaxRecord(android.health.connect.datatypes.Vo2MaxRecord vo2MaxRecord) {
        Instant time = vo2MaxRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = vo2MaxRecord.getZoneOffset();
        double vo2MillilitersPerMinuteKilogram = vo2MaxRecord.getVo2MillilitersPerMinuteKilogram();
        int sdkVo2MaxMeasurementMethod = IntDefMappingsKt.toSdkVo2MaxMeasurementMethod(vo2MaxRecord.getMeasurementMethod());
        android.health.connect.datatypes.Metadata metadata = vo2MaxRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new Vo2MaxRecord(time, zoneOffset, MetadataConvertersKt.toSdkMetadata(metadata), vo2MillilitersPerMinuteKilogram, sdkVo2MaxMeasurementMethod);
    }

    private static final WeightRecord toSdkWeightRecord(android.health.connect.datatypes.WeightRecord weightRecord) {
        Instant time = weightRecord.getTime();
        zcp.b((Object) time, "");
        ZoneOffset zoneOffset = weightRecord.getZoneOffset();
        Mass weight = weightRecord.getWeight();
        zcp.b((Object) weight, "");
        androidx.health.connect.client.units.Mass sdkMass = UnitConvertersKt.toSdkMass(weight);
        android.health.connect.datatypes.Metadata metadata = weightRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new WeightRecord(time, zoneOffset, sdkMass, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final WheelchairPushesRecord toWheelchairPushesRecord(android.health.connect.datatypes.WheelchairPushesRecord wheelchairPushesRecord) {
        Instant startTime = wheelchairPushesRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = wheelchairPushesRecord.getStartZoneOffset();
        Instant endTime = wheelchairPushesRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = wheelchairPushesRecord.getEndZoneOffset();
        long count = wheelchairPushesRecord.getCount();
        android.health.connect.datatypes.Metadata metadata = wheelchairPushesRecord.getMetadata();
        zcp.b((Object) metadata, "");
        return new WheelchairPushesRecord(startTime, startZoneOffset, endTime, endZoneOffset, count, MetadataConvertersKt.toSdkMetadata(metadata));
    }

    private static final android.health.connect.datatypes.ActiveCaloriesBurnedRecord toPlatformActiveCaloriesBurnedRecord(ActiveCaloriesBurnedRecord activeCaloriesBurnedRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m$1();
        android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m(MetadataConvertersKt.toPlatformMetadata(activeCaloriesBurnedRecord.getMetadata()), activeCaloriesBurnedRecord.getStartTime(), activeCaloriesBurnedRecord.getEndTime(), UnitConvertersKt.toPlatformEnergy(activeCaloriesBurnedRecord.getEnergy()));
        ZoneOffset startZoneOffset = activeCaloriesBurnedRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = activeCaloriesBurnedRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        android.health.connect.datatypes.ActiveCaloriesBurnedRecord activeCaloriesBurnedRecordBuild = builderM.build();
        zcp.b((Object) activeCaloriesBurnedRecordBuild, "");
        return activeCaloriesBurnedRecordBuild;
    }

    private static final android.health.connect.datatypes.BasalBodyTemperatureRecord toPlatformBasalBodyTemperatureRecord(BasalBodyTemperatureRecord basalBodyTemperatureRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m$4();
        android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m(MetadataConvertersKt.toPlatformMetadata(basalBodyTemperatureRecord.getMetadata()), basalBodyTemperatureRecord.getTime(), IntDefMappingsKt.toPlatformBodyTemperatureMeasurementLocation(basalBodyTemperatureRecord.getMeasurementLocation()), UnitConvertersKt.toPlatformTemperature(basalBodyTemperatureRecord.getTemperature()));
        ZoneOffset zoneOffset = basalBodyTemperatureRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.BasalBodyTemperatureRecord basalBodyTemperatureRecordBuild = builderM.build();
        zcp.b((Object) basalBodyTemperatureRecordBuild, "");
        return basalBodyTemperatureRecordBuild;
    }

    private static final android.health.connect.datatypes.BasalMetabolicRateRecord toPlatformBasalMetabolicRateRecord(BasalMetabolicRateRecord basalMetabolicRateRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m();
        android.health.connect.datatypes.BasalMetabolicRateRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m(MetadataConvertersKt.toPlatformMetadata(basalMetabolicRateRecord.getMetadata()), basalMetabolicRateRecord.getTime(), UnitConvertersKt.toPlatformPower(basalMetabolicRateRecord.getBasalMetabolicRate()));
        ZoneOffset zoneOffset = basalMetabolicRateRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.BasalMetabolicRateRecord basalMetabolicRateRecordBuild = builderM.build();
        zcp.b((Object) basalMetabolicRateRecordBuild, "");
        return basalMetabolicRateRecordBuild;
    }

    private static final android.health.connect.datatypes.BloodGlucoseRecord toPlatformBloodGlucoseRecord(BloodGlucoseRecord bloodGlucoseRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m$5();
        android.health.connect.datatypes.BloodGlucoseRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m(MetadataConvertersKt.toPlatformMetadata(bloodGlucoseRecord.getMetadata()), bloodGlucoseRecord.getTime(), IntDefMappingsKt.toPlatformBloodGlucoseSpecimenSource(bloodGlucoseRecord.getSpecimenSource()), UnitConvertersKt.toPlatformBloodGlucose(bloodGlucoseRecord.getLevel()), IntDefMappingsKt.toPlatformBloodGlucoseRelationToMeal(bloodGlucoseRecord.getRelationToMeal()), IntDefMappingsKt.toPlatformMealType(bloodGlucoseRecord.getMealType()));
        ZoneOffset zoneOffset = bloodGlucoseRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.BloodGlucoseRecord bloodGlucoseRecordBuild = builderM.build();
        zcp.b((Object) bloodGlucoseRecordBuild, "");
        return bloodGlucoseRecordBuild;
    }

    private static final android.health.connect.datatypes.BloodPressureRecord toPlatformBloodPressureRecord(BloodPressureRecord bloodPressureRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m$5();
        android.health.connect.datatypes.BloodPressureRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m(MetadataConvertersKt.toPlatformMetadata(bloodPressureRecord.getMetadata()), bloodPressureRecord.getTime(), IntDefMappingsKt.toPlatformBloodPressureMeasurementLocation(bloodPressureRecord.getMeasurementLocation()), UnitConvertersKt.toPlatformPressure(bloodPressureRecord.getSystolic()), UnitConvertersKt.toPlatformPressure(bloodPressureRecord.getDiastolic()), IntDefMappingsKt.toPlatformBloodPressureBodyPosition(bloodPressureRecord.getBodyPosition()));
        ZoneOffset zoneOffset = bloodPressureRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.BloodPressureRecord bloodPressureRecordBuild = builderM.build();
        zcp.b((Object) bloodPressureRecordBuild, "");
        return bloodPressureRecordBuild;
    }

    private static final android.health.connect.datatypes.BodyFatRecord toPlatformBodyFatRecord(BodyFatRecord bodyFatRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m$5();
        android.health.connect.datatypes.BodyFatRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m(MetadataConvertersKt.toPlatformMetadata(bodyFatRecord.getMetadata()), bodyFatRecord.getTime(), UnitConvertersKt.toPlatformPercentage(bodyFatRecord.getPercentage()));
        ZoneOffset zoneOffset = bodyFatRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.BodyFatRecord bodyFatRecordBuild = builderM.build();
        zcp.b((Object) bodyFatRecordBuild, "");
        return bodyFatRecordBuild;
    }

    private static final android.health.connect.datatypes.BodyTemperatureRecord toPlatformBodyTemperatureRecord(BodyTemperatureRecord bodyTemperatureRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m$11();
        android.health.connect.datatypes.BodyTemperatureRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m(MetadataConvertersKt.toPlatformMetadata(bodyTemperatureRecord.getMetadata()), bodyTemperatureRecord.getTime(), IntDefMappingsKt.toPlatformBodyTemperatureMeasurementLocation(bodyTemperatureRecord.getMeasurementLocation()), UnitConvertersKt.toPlatformTemperature(bodyTemperatureRecord.getTemperature()));
        ZoneOffset zoneOffset = bodyTemperatureRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.BodyTemperatureRecord bodyTemperatureRecordBuild = builderM.build();
        zcp.b((Object) bodyTemperatureRecordBuild, "");
        return bodyTemperatureRecordBuild;
    }

    private static final android.health.connect.datatypes.BodyWaterMassRecord toPlatformBodyWaterMassRecord(BodyWaterMassRecord bodyWaterMassRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m();
        android.health.connect.datatypes.BodyWaterMassRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m(MetadataConvertersKt.toPlatformMetadata(bodyWaterMassRecord.getMetadata()), bodyWaterMassRecord.getTime(), UnitConvertersKt.toPlatformMass(bodyWaterMassRecord.getMass()));
        ZoneOffset zoneOffset = bodyWaterMassRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.BodyWaterMassRecord bodyWaterMassRecordBuild = builderM.build();
        zcp.b((Object) bodyWaterMassRecordBuild, "");
        return bodyWaterMassRecordBuild;
    }

    private static final android.health.connect.datatypes.BoneMassRecord toPlatformBoneMassRecord(BoneMassRecord boneMassRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m$8();
        android.health.connect.datatypes.BoneMassRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m(MetadataConvertersKt.toPlatformMetadata(boneMassRecord.getMetadata()), boneMassRecord.getTime(), UnitConvertersKt.toPlatformMass(boneMassRecord.getMass()));
        ZoneOffset zoneOffset = boneMassRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.BoneMassRecord boneMassRecordBuild = builderM.build();
        zcp.b((Object) boneMassRecordBuild, "");
        return boneMassRecordBuild;
    }

    private static final android.health.connect.datatypes.CervicalMucusRecord toPlatformCervicalMucusRecord(CervicalMucusRecord cervicalMucusRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m$4();
        android.health.connect.datatypes.CervicalMucusRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m(MetadataConvertersKt.toPlatformMetadata(cervicalMucusRecord.getMetadata()), cervicalMucusRecord.getTime(), IntDefMappingsKt.toPlatformCervicalMucusSensation(cervicalMucusRecord.getSensation()), IntDefMappingsKt.toPlatformCervicalMucusAppearance(cervicalMucusRecord.getAppearance()));
        ZoneOffset zoneOffset = cervicalMucusRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.CervicalMucusRecord cervicalMucusRecordBuild = builderM.build();
        zcp.b((Object) cervicalMucusRecordBuild, "");
        return cervicalMucusRecordBuild;
    }

    private static final android.health.connect.datatypes.CyclingPedalingCadenceRecord toPlatformCyclingPedalingCadenceRecord(CyclingPedalingCadenceRecord cyclingPedalingCadenceRecord) {
        android.health.connect.datatypes.Metadata platformMetadata = MetadataConvertersKt.toPlatformMetadata(cyclingPedalingCadenceRecord.getMetadata());
        Instant startTime = cyclingPedalingCadenceRecord.getStartTime();
        Instant endTime = cyclingPedalingCadenceRecord.getEndTime();
        List<CyclingPedalingCadenceRecord.Sample> samples = cyclingPedalingCadenceRecord.getSamples();
        ArrayList arrayList = new ArrayList(yzp.e(samples, 10));
        Iterator<T> it = samples.iterator();
        while (it.hasNext()) {
            arrayList.add(toPlatformCyclingPedalingCadenceSample((CyclingPedalingCadenceRecord.Sample) it.next()));
        }
        android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m(platformMetadata, startTime, endTime, arrayList);
        ZoneOffset startZoneOffset = cyclingPedalingCadenceRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = cyclingPedalingCadenceRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        android.health.connect.datatypes.CyclingPedalingCadenceRecord cyclingPedalingCadenceRecordBuild = builderM.build();
        zcp.b((Object) cyclingPedalingCadenceRecordBuild, "");
        return cyclingPedalingCadenceRecordBuild;
    }

    private static final android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample toPlatformCyclingPedalingCadenceSample(CyclingPedalingCadenceRecord.Sample sample) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m149m$2();
        return RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m(sample.getRevolutionsPerMinute(), sample.getTime());
    }

    private static final android.health.connect.datatypes.DistanceRecord toPlatformDistanceRecord(DistanceRecord distanceRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m$10();
        android.health.connect.datatypes.DistanceRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m(MetadataConvertersKt.toPlatformMetadata(distanceRecord.getMetadata()), distanceRecord.getStartTime(), distanceRecord.getEndTime(), UnitConvertersKt.toPlatformLength(distanceRecord.getDistance()));
        ZoneOffset startZoneOffset = distanceRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = distanceRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        android.health.connect.datatypes.DistanceRecord distanceRecordBuild = builderM.build();
        zcp.b((Object) distanceRecordBuild, "");
        return distanceRecordBuild;
    }

    private static final android.health.connect.datatypes.ElevationGainedRecord toPlatformElevationGainedRecord(ElevationGainedRecord elevationGainedRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m$7();
        android.health.connect.datatypes.ElevationGainedRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m(MetadataConvertersKt.toPlatformMetadata(elevationGainedRecord.getMetadata()), elevationGainedRecord.getStartTime(), elevationGainedRecord.getEndTime(), UnitConvertersKt.toPlatformLength(elevationGainedRecord.getElevation()));
        ZoneOffset startZoneOffset = elevationGainedRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = elevationGainedRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        android.health.connect.datatypes.ElevationGainedRecord elevationGainedRecordBuild = builderM.build();
        zcp.b((Object) elevationGainedRecordBuild, "");
        return elevationGainedRecordBuild;
    }

    private static final android.health.connect.datatypes.ExerciseSessionRecord toPlatformExerciseSessionRecord(ExerciseSessionRecord exerciseSessionRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m$9();
        android.health.connect.datatypes.ExerciseSessionRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m(MetadataConvertersKt.toPlatformMetadata(exerciseSessionRecord.getMetadata()), exerciseSessionRecord.getStartTime(), exerciseSessionRecord.getEndTime(), IntDefMappingsKt.toPlatformExerciseSessionType(exerciseSessionRecord.getExerciseType()));
        ZoneOffset startZoneOffset = exerciseSessionRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = exerciseSessionRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        String notes = exerciseSessionRecord.getNotes();
        if (notes != null) {
            builderM.setNotes(notes);
        }
        String title = exerciseSessionRecord.getTitle();
        if (title != null) {
            builderM.setTitle(title);
        }
        List<androidx.health.connect.client.records.ExerciseLap> laps = exerciseSessionRecord.getLaps();
        ArrayList arrayList = new ArrayList(yzp.e(laps, 10));
        Iterator<T> it = laps.iterator();
        while (it.hasNext()) {
            arrayList.add(toPlatformExerciseLap((androidx.health.connect.client.records.ExerciseLap) it.next()));
        }
        builderM.setLaps(arrayList);
        List<androidx.health.connect.client.records.ExerciseSegment> segments = exerciseSessionRecord.getSegments();
        ArrayList arrayList2 = new ArrayList(yzp.e(segments, 10));
        Iterator<T> it2 = segments.iterator();
        while (it2.hasNext()) {
            arrayList2.add(toPlatformExerciseSegment((androidx.health.connect.client.records.ExerciseSegment) it2.next()));
        }
        builderM.setSegments(arrayList2);
        if (exerciseSessionRecord.getExerciseRouteResult() instanceof ExerciseRouteResult.Data) {
            builderM.setRoute(toPlatformExerciseRoute(((ExerciseRouteResult.Data) exerciseSessionRecord.getExerciseRouteResult()).getExerciseRoute()));
        }
        String plannedExerciseSessionId = exerciseSessionRecord.getPlannedExerciseSessionId();
        if (plannedExerciseSessionId != null) {
            builderM.setPlannedExerciseSessionId(plannedExerciseSessionId);
        }
        android.health.connect.datatypes.ExerciseSessionRecord exerciseSessionRecordBuild = builderM.build();
        zcp.b((Object) exerciseSessionRecordBuild, "");
        return exerciseSessionRecordBuild;
    }

    private static final ExerciseLap toPlatformExerciseLap(androidx.health.connect.client.records.ExerciseLap exerciseLap) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m$8();
        ExerciseLap.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m(exerciseLap.getStartTime(), exerciseLap.getEndTime());
        androidx.health.connect.client.units.Length length = exerciseLap.getLength();
        if (length != null) {
            builderM.setLength(UnitConvertersKt.toPlatformLength(length));
        }
        ExerciseLap exerciseLapBuild = builderM.build();
        zcp.b((Object) exerciseLapBuild, "");
        return exerciseLapBuild;
    }

    private static final ExerciseRoute toPlatformExerciseRoute(androidx.health.connect.client.records.ExerciseRoute exerciseRoute) {
        List<androidx.health.connect.client.records.ExerciseRoute.Location> route = exerciseRoute.getRoute();
        ArrayList arrayList = new ArrayList(yzp.e(route, 10));
        for (androidx.health.connect.client.records.ExerciseRoute.Location location : route) {
            RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$2();
            ExerciseRoute.Location.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m(location.getTime(), location.getLatitude(), location.getLongitude());
            androidx.health.connect.client.units.Length horizontalAccuracy = location.getHorizontalAccuracy();
            if (horizontalAccuracy != null) {
                builderM.setHorizontalAccuracy(UnitConvertersKt.toPlatformLength(horizontalAccuracy));
            }
            androidx.health.connect.client.units.Length verticalAccuracy = location.getVerticalAccuracy();
            if (verticalAccuracy != null) {
                builderM.setVerticalAccuracy(UnitConvertersKt.toPlatformLength(verticalAccuracy));
            }
            androidx.health.connect.client.units.Length altitude = location.getAltitude();
            if (altitude != null) {
                builderM.setAltitude(UnitConvertersKt.toPlatformLength(altitude));
            }
            arrayList.add(builderM.build());
        }
        return RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m((List) arrayList);
    }

    private static final ExerciseSegment toPlatformExerciseSegment(androidx.health.connect.client.records.ExerciseSegment exerciseSegment) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m$7();
        ExerciseSegment exerciseSegmentBuild = RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m(exerciseSegment.getStartTime(), exerciseSegment.getEndTime(), IntDefMappingsKt.toPlatformExerciseSegmentType(exerciseSegment.getSegmentType())).setRepetitionsCount(exerciseSegment.getRepetitions()).build();
        zcp.b((Object) exerciseSegmentBuild, "");
        return exerciseSegmentBuild;
    }

    private static final android.health.connect.datatypes.FloorsClimbedRecord toPlatformFloorsClimbedRecord(FloorsClimbedRecord floorsClimbedRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m146m();
        android.health.connect.datatypes.FloorsClimbedRecord.Builder builderM = RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m(MetadataConvertersKt.toPlatformMetadata(floorsClimbedRecord.getMetadata()), floorsClimbedRecord.getStartTime(), floorsClimbedRecord.getEndTime(), floorsClimbedRecord.getFloors());
        ZoneOffset startZoneOffset = floorsClimbedRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = floorsClimbedRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        android.health.connect.datatypes.FloorsClimbedRecord floorsClimbedRecordBuild = builderM.build();
        zcp.b((Object) floorsClimbedRecordBuild, "");
        return floorsClimbedRecordBuild;
    }

    private static final android.health.connect.datatypes.HeartRateRecord toPlatformHeartRateRecord(HeartRateRecord heartRateRecord) {
        android.health.connect.datatypes.Metadata platformMetadata = MetadataConvertersKt.toPlatformMetadata(heartRateRecord.getMetadata());
        Instant startTime = heartRateRecord.getStartTime();
        Instant endTime = heartRateRecord.getEndTime();
        List<HeartRateRecord.Sample> samples = heartRateRecord.getSamples();
        ArrayList arrayList = new ArrayList(yzp.e(samples, 10));
        Iterator<T> it = samples.iterator();
        while (it.hasNext()) {
            arrayList.add(toPlatformHeartRateSample((HeartRateRecord.Sample) it.next()));
        }
        android.health.connect.datatypes.HeartRateRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m(platformMetadata, startTime, endTime, arrayList);
        ZoneOffset startZoneOffset = heartRateRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = heartRateRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        android.health.connect.datatypes.HeartRateRecord heartRateRecordBuild = builderM.build();
        zcp.b((Object) heartRateRecordBuild, "");
        return heartRateRecordBuild;
    }

    private static final android.health.connect.datatypes.HeartRateRecord.HeartRateSample toPlatformHeartRateSample(HeartRateRecord.Sample sample) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m$1();
        return RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m(sample.getBeatsPerMinute(), sample.getTime());
    }

    private static final android.health.connect.datatypes.HeartRateVariabilityRmssdRecord toPlatformHeartRateVariabilityRmssdRecord(HeartRateVariabilityRmssdRecord heartRateVariabilityRmssdRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m$6();
        android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m(MetadataConvertersKt.toPlatformMetadata(heartRateVariabilityRmssdRecord.getMetadata()), heartRateVariabilityRmssdRecord.getTime(), heartRateVariabilityRmssdRecord.getHeartRateVariabilityMillis());
        ZoneOffset zoneOffset = heartRateVariabilityRmssdRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.HeartRateVariabilityRmssdRecord heartRateVariabilityRmssdRecordBuild = builderM.build();
        zcp.b((Object) heartRateVariabilityRmssdRecordBuild, "");
        return heartRateVariabilityRmssdRecordBuild;
    }

    private static final android.health.connect.datatypes.HeightRecord toPlatformHeightRecord(HeightRecord heightRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m$9();
        android.health.connect.datatypes.HeightRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m(MetadataConvertersKt.toPlatformMetadata(heightRecord.getMetadata()), heightRecord.getTime(), UnitConvertersKt.toPlatformLength(heightRecord.getHeight()));
        ZoneOffset zoneOffset = heightRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.HeightRecord heightRecordBuild = builderM.build();
        zcp.b((Object) heightRecordBuild, "");
        return heightRecordBuild;
    }

    private static final android.health.connect.datatypes.HydrationRecord toPlatformHydrationRecord(HydrationRecord hydrationRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m$3();
        android.health.connect.datatypes.HydrationRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m(MetadataConvertersKt.toPlatformMetadata(hydrationRecord.getMetadata()), hydrationRecord.getStartTime(), hydrationRecord.getEndTime(), UnitConvertersKt.toPlatformVolume(hydrationRecord.getVolume()));
        ZoneOffset startZoneOffset = hydrationRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = hydrationRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        android.health.connect.datatypes.HydrationRecord hydrationRecordBuild = builderM.build();
        zcp.b((Object) hydrationRecordBuild, "");
        return hydrationRecordBuild;
    }

    private static final android.health.connect.datatypes.IntermenstrualBleedingRecord toPlatformIntermenstrualBleedingRecord(IntermenstrualBleedingRecord intermenstrualBleedingRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m150m$3();
        android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m(MetadataConvertersKt.toPlatformMetadata(intermenstrualBleedingRecord.getMetadata()), intermenstrualBleedingRecord.getTime());
        ZoneOffset zoneOffset = intermenstrualBleedingRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.IntermenstrualBleedingRecord intermenstrualBleedingRecordBuild = builderM.build();
        zcp.b((Object) intermenstrualBleedingRecordBuild, "");
        return intermenstrualBleedingRecordBuild;
    }

    private static final android.health.connect.datatypes.LeanBodyMassRecord toPlatformLeanBodyMassRecord(LeanBodyMassRecord leanBodyMassRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m$1();
        android.health.connect.datatypes.LeanBodyMassRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m(MetadataConvertersKt.toPlatformMetadata(leanBodyMassRecord.getMetadata()), leanBodyMassRecord.getTime(), UnitConvertersKt.toPlatformMass(leanBodyMassRecord.getMass()));
        ZoneOffset zoneOffset = leanBodyMassRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.LeanBodyMassRecord leanBodyMassRecordBuild = builderM.build();
        zcp.b((Object) leanBodyMassRecordBuild, "");
        return leanBodyMassRecordBuild;
    }

    private static final android.health.connect.datatypes.MenstruationFlowRecord toPlatformMenstruationFlowRecord(MenstruationFlowRecord menstruationFlowRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m$6();
        android.health.connect.datatypes.MenstruationFlowRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m(MetadataConvertersKt.toPlatformMetadata(menstruationFlowRecord.getMetadata()), menstruationFlowRecord.getTime(), IntDefMappingsKt.toPlatformMenstruationFlow(menstruationFlowRecord.getFlow()));
        ZoneOffset zoneOffset = menstruationFlowRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.MenstruationFlowRecord menstruationFlowRecordBuild = builderM.build();
        zcp.b((Object) menstruationFlowRecordBuild, "");
        return menstruationFlowRecordBuild;
    }

    private static final android.health.connect.datatypes.MenstruationPeriodRecord toPlatformMenstruationPeriodRecord(MenstruationPeriodRecord menstruationPeriodRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m$4();
        android.health.connect.datatypes.MenstruationPeriodRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m(MetadataConvertersKt.toPlatformMetadata(menstruationPeriodRecord.getMetadata()), menstruationPeriodRecord.getStartTime(), menstruationPeriodRecord.getEndTime());
        ZoneOffset startZoneOffset = menstruationPeriodRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = menstruationPeriodRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        android.health.connect.datatypes.MenstruationPeriodRecord menstruationPeriodRecordBuild = builderM.build();
        zcp.b((Object) menstruationPeriodRecordBuild, "");
        return menstruationPeriodRecordBuild;
    }

    private static final android.health.connect.datatypes.MindfulnessSessionRecord toPlatformMindfulnessSessionRecord(MindfulnessSessionRecord mindfulnessSessionRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m$1();
        android.health.connect.datatypes.MindfulnessSessionRecord.Builder builderM183m = RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m183m(MetadataConvertersKt.toPlatformMetadata(mindfulnessSessionRecord.getMetadata()), mindfulnessSessionRecord.getStartTime(), mindfulnessSessionRecord.getEndTime(), IntDefMappingsKt.toPlatformMindfulnessSessionType(mindfulnessSessionRecord.getMindfulnessSessionType()));
        ZoneOffset startZoneOffset = mindfulnessSessionRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM183m.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = mindfulnessSessionRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM183m.setEndZoneOffset(endZoneOffset);
        }
        String title = mindfulnessSessionRecord.getTitle();
        if (title != null) {
            builderM183m.setTitle(title);
        }
        String notes = mindfulnessSessionRecord.getNotes();
        if (notes != null) {
            builderM183m.setNotes(notes);
        }
        android.health.connect.datatypes.MindfulnessSessionRecord mindfulnessSessionRecordBuild = builderM183m.build();
        zcp.b((Object) mindfulnessSessionRecordBuild, "");
        return mindfulnessSessionRecordBuild;
    }

    private static final android.health.connect.datatypes.NutritionRecord toPlatformNutritionRecord(NutritionRecord nutritionRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m$8();
        android.health.connect.datatypes.NutritionRecord.Builder mealType = RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m157m(MetadataConvertersKt.toPlatformMetadata(nutritionRecord.getMetadata()), nutritionRecord.getStartTime(), nutritionRecord.getEndTime()).setMealType(IntDefMappingsKt.toPlatformMealType(nutritionRecord.getMealType()));
        ZoneOffset startZoneOffset = nutritionRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            mealType.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = nutritionRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            mealType.setEndZoneOffset(endZoneOffset);
        }
        androidx.health.connect.client.units.Mass biotin = nutritionRecord.getBiotin();
        if (biotin != null) {
            mealType.setBiotin(UnitConvertersKt.toPlatformMass(biotin));
        }
        androidx.health.connect.client.units.Mass caffeine = nutritionRecord.getCaffeine();
        if (caffeine != null) {
            mealType.setCaffeine(UnitConvertersKt.toPlatformMass(caffeine));
        }
        androidx.health.connect.client.units.Mass calcium = nutritionRecord.getCalcium();
        if (calcium != null) {
            mealType.setCalcium(UnitConvertersKt.toPlatformMass(calcium));
        }
        androidx.health.connect.client.units.Mass chloride = nutritionRecord.getChloride();
        if (chloride != null) {
            mealType.setChloride(UnitConvertersKt.toPlatformMass(chloride));
        }
        androidx.health.connect.client.units.Mass cholesterol = nutritionRecord.getCholesterol();
        if (cholesterol != null) {
            mealType.setCholesterol(UnitConvertersKt.toPlatformMass(cholesterol));
        }
        androidx.health.connect.client.units.Mass chromium = nutritionRecord.getChromium();
        if (chromium != null) {
            mealType.setChromium(UnitConvertersKt.toPlatformMass(chromium));
        }
        androidx.health.connect.client.units.Mass copper = nutritionRecord.getCopper();
        if (copper != null) {
            mealType.setCopper(UnitConvertersKt.toPlatformMass(copper));
        }
        androidx.health.connect.client.units.Mass dietaryFiber = nutritionRecord.getDietaryFiber();
        if (dietaryFiber != null) {
            mealType.setDietaryFiber(UnitConvertersKt.toPlatformMass(dietaryFiber));
        }
        androidx.health.connect.client.units.Energy energy = nutritionRecord.getEnergy();
        if (energy != null) {
            mealType.setEnergy(UnitConvertersKt.toPlatformEnergy(energy));
        }
        androidx.health.connect.client.units.Energy energyFromFat = nutritionRecord.getEnergyFromFat();
        if (energyFromFat != null) {
            mealType.setEnergyFromFat(UnitConvertersKt.toPlatformEnergy(energyFromFat));
        }
        androidx.health.connect.client.units.Mass folate = nutritionRecord.getFolate();
        if (folate != null) {
            mealType.setFolate(UnitConvertersKt.toPlatformMass(folate));
        }
        androidx.health.connect.client.units.Mass folicAcid = nutritionRecord.getFolicAcid();
        if (folicAcid != null) {
            mealType.setFolicAcid(UnitConvertersKt.toPlatformMass(folicAcid));
        }
        androidx.health.connect.client.units.Mass iodine = nutritionRecord.getIodine();
        if (iodine != null) {
            mealType.setIodine(UnitConvertersKt.toPlatformMass(iodine));
        }
        androidx.health.connect.client.units.Mass iron = nutritionRecord.getIron();
        if (iron != null) {
            mealType.setIron(UnitConvertersKt.toPlatformMass(iron));
        }
        androidx.health.connect.client.units.Mass magnesium = nutritionRecord.getMagnesium();
        if (magnesium != null) {
            mealType.setMagnesium(UnitConvertersKt.toPlatformMass(magnesium));
        }
        androidx.health.connect.client.units.Mass manganese = nutritionRecord.getManganese();
        if (manganese != null) {
            mealType.setManganese(UnitConvertersKt.toPlatformMass(manganese));
        }
        androidx.health.connect.client.units.Mass molybdenum = nutritionRecord.getMolybdenum();
        if (molybdenum != null) {
            mealType.setMolybdenum(UnitConvertersKt.toPlatformMass(molybdenum));
        }
        androidx.health.connect.client.units.Mass monounsaturatedFat = nutritionRecord.getMonounsaturatedFat();
        if (monounsaturatedFat != null) {
            mealType.setMonounsaturatedFat(UnitConvertersKt.toPlatformMass(monounsaturatedFat));
        }
        String name = nutritionRecord.getName();
        if (name != null) {
            mealType.setMealName(name);
        }
        androidx.health.connect.client.units.Mass niacin = nutritionRecord.getNiacin();
        if (niacin != null) {
            mealType.setNiacin(UnitConvertersKt.toPlatformMass(niacin));
        }
        androidx.health.connect.client.units.Mass pantothenicAcid = nutritionRecord.getPantothenicAcid();
        if (pantothenicAcid != null) {
            mealType.setPantothenicAcid(UnitConvertersKt.toPlatformMass(pantothenicAcid));
        }
        androidx.health.connect.client.units.Mass phosphorus = nutritionRecord.getPhosphorus();
        if (phosphorus != null) {
            mealType.setPhosphorus(UnitConvertersKt.toPlatformMass(phosphorus));
        }
        androidx.health.connect.client.units.Mass polyunsaturatedFat = nutritionRecord.getPolyunsaturatedFat();
        if (polyunsaturatedFat != null) {
            mealType.setPolyunsaturatedFat(UnitConvertersKt.toPlatformMass(polyunsaturatedFat));
        }
        androidx.health.connect.client.units.Mass potassium = nutritionRecord.getPotassium();
        if (potassium != null) {
            mealType.setPotassium(UnitConvertersKt.toPlatformMass(potassium));
        }
        androidx.health.connect.client.units.Mass protein = nutritionRecord.getProtein();
        if (protein != null) {
            mealType.setProtein(UnitConvertersKt.toPlatformMass(protein));
        }
        androidx.health.connect.client.units.Mass riboflavin = nutritionRecord.getRiboflavin();
        if (riboflavin != null) {
            mealType.setRiboflavin(UnitConvertersKt.toPlatformMass(riboflavin));
        }
        androidx.health.connect.client.units.Mass saturatedFat = nutritionRecord.getSaturatedFat();
        if (saturatedFat != null) {
            mealType.setSaturatedFat(UnitConvertersKt.toPlatformMass(saturatedFat));
        }
        androidx.health.connect.client.units.Mass selenium = nutritionRecord.getSelenium();
        if (selenium != null) {
            mealType.setSelenium(UnitConvertersKt.toPlatformMass(selenium));
        }
        androidx.health.connect.client.units.Mass sodium = nutritionRecord.getSodium();
        if (sodium != null) {
            mealType.setSodium(UnitConvertersKt.toPlatformMass(sodium));
        }
        androidx.health.connect.client.units.Mass sugar = nutritionRecord.getSugar();
        if (sugar != null) {
            mealType.setSugar(UnitConvertersKt.toPlatformMass(sugar));
        }
        androidx.health.connect.client.units.Mass thiamin = nutritionRecord.getThiamin();
        if (thiamin != null) {
            mealType.setThiamin(UnitConvertersKt.toPlatformMass(thiamin));
        }
        androidx.health.connect.client.units.Mass totalCarbohydrate = nutritionRecord.getTotalCarbohydrate();
        if (totalCarbohydrate != null) {
            mealType.setTotalCarbohydrate(UnitConvertersKt.toPlatformMass(totalCarbohydrate));
        }
        androidx.health.connect.client.units.Mass totalFat = nutritionRecord.getTotalFat();
        if (totalFat != null) {
            mealType.setTotalFat(UnitConvertersKt.toPlatformMass(totalFat));
        }
        androidx.health.connect.client.units.Mass transFat = nutritionRecord.getTransFat();
        if (transFat != null) {
            mealType.setTransFat(UnitConvertersKt.toPlatformMass(transFat));
        }
        androidx.health.connect.client.units.Mass unsaturatedFat = nutritionRecord.getUnsaturatedFat();
        if (unsaturatedFat != null) {
            mealType.setUnsaturatedFat(UnitConvertersKt.toPlatformMass(unsaturatedFat));
        }
        androidx.health.connect.client.units.Mass vitaminA = nutritionRecord.getVitaminA();
        if (vitaminA != null) {
            mealType.setVitaminA(UnitConvertersKt.toPlatformMass(vitaminA));
        }
        androidx.health.connect.client.units.Mass vitaminB6 = nutritionRecord.getVitaminB6();
        if (vitaminB6 != null) {
            mealType.setVitaminB6(UnitConvertersKt.toPlatformMass(vitaminB6));
        }
        androidx.health.connect.client.units.Mass vitaminB12 = nutritionRecord.getVitaminB12();
        if (vitaminB12 != null) {
            mealType.setVitaminB12(UnitConvertersKt.toPlatformMass(vitaminB12));
        }
        androidx.health.connect.client.units.Mass vitaminC = nutritionRecord.getVitaminC();
        if (vitaminC != null) {
            mealType.setVitaminC(UnitConvertersKt.toPlatformMass(vitaminC));
        }
        androidx.health.connect.client.units.Mass vitaminD = nutritionRecord.getVitaminD();
        if (vitaminD != null) {
            mealType.setVitaminD(UnitConvertersKt.toPlatformMass(vitaminD));
        }
        androidx.health.connect.client.units.Mass vitaminE = nutritionRecord.getVitaminE();
        if (vitaminE != null) {
            mealType.setVitaminE(UnitConvertersKt.toPlatformMass(vitaminE));
        }
        androidx.health.connect.client.units.Mass vitaminK = nutritionRecord.getVitaminK();
        if (vitaminK != null) {
            mealType.setVitaminK(UnitConvertersKt.toPlatformMass(vitaminK));
        }
        androidx.health.connect.client.units.Mass zinc = nutritionRecord.getZinc();
        if (zinc != null) {
            mealType.setZinc(UnitConvertersKt.toPlatformMass(zinc));
        }
        android.health.connect.datatypes.NutritionRecord nutritionRecordBuild = mealType.build();
        zcp.b((Object) nutritionRecordBuild, "");
        return nutritionRecordBuild;
    }

    private static final android.health.connect.datatypes.OvulationTestRecord toPlatformOvulationTestRecord(OvulationTestRecord ovulationTestRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m$2();
        android.health.connect.datatypes.OvulationTestRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m(MetadataConvertersKt.toPlatformMetadata(ovulationTestRecord.getMetadata()), ovulationTestRecord.getTime(), IntDefMappingsKt.toPlatformOvulationTestResult(ovulationTestRecord.getResult()));
        ZoneOffset zoneOffset = ovulationTestRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.OvulationTestRecord ovulationTestRecordBuild = builderM.build();
        zcp.b((Object) ovulationTestRecordBuild, "");
        return ovulationTestRecordBuild;
    }

    private static final android.health.connect.datatypes.OxygenSaturationRecord toPlatformOxygenSaturationRecord(OxygenSaturationRecord oxygenSaturationRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m$2();
        android.health.connect.datatypes.OxygenSaturationRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m(MetadataConvertersKt.toPlatformMetadata(oxygenSaturationRecord.getMetadata()), oxygenSaturationRecord.getTime(), UnitConvertersKt.toPlatformPercentage(oxygenSaturationRecord.getPercentage()));
        ZoneOffset zoneOffset = oxygenSaturationRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.OxygenSaturationRecord oxygenSaturationRecordBuild = builderM.build();
        zcp.b((Object) oxygenSaturationRecordBuild, "");
        return oxygenSaturationRecordBuild;
    }

    private static final android.health.connect.datatypes.PlannedExerciseSessionRecord toPlatformPlannedExerciseSessionRecord(PlannedExerciseSessionRecord plannedExerciseSessionRecord) {
        android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder builderM;
        if (plannedExerciseSessionRecord.getHasExplicitTime()) {
            RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m$5();
            builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m(MetadataConvertersKt.toPlatformMetadata(plannedExerciseSessionRecord.getMetadata()), IntDefMappingsKt.toPlatformExerciseSessionType(plannedExerciseSessionRecord.getExerciseType()), plannedExerciseSessionRecord.getStartTime(), plannedExerciseSessionRecord.getEndTime());
        } else {
            RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m$5();
            builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m(MetadataConvertersKt.toPlatformMetadata(plannedExerciseSessionRecord.getMetadata()), IntDefMappingsKt.toPlatformExerciseSessionType(plannedExerciseSessionRecord.getExerciseType()), plannedExerciseSessionRecord.getStartTime().atZone(plannedExerciseSessionRecord.getStartZoneOffset()).toLocalDate(), Duration.between(plannedExerciseSessionRecord.getStartTime(), plannedExerciseSessionRecord.getEndTime()));
        }
        ZoneOffset startZoneOffset = plannedExerciseSessionRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = plannedExerciseSessionRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        String title = plannedExerciseSessionRecord.getTitle();
        if (title != null) {
            builderM.setTitle(title);
        }
        String notes = plannedExerciseSessionRecord.getNotes();
        if (notes != null) {
            builderM.setNotes(notes);
        }
        List<PlannedExerciseBlock> blocks = plannedExerciseSessionRecord.getBlocks();
        ArrayList arrayList = new ArrayList(yzp.e(blocks, 10));
        Iterator<T> it = blocks.iterator();
        while (it.hasNext()) {
            arrayList.add(toPlatformPlannedExerciseBlock((PlannedExerciseBlock) it.next()));
        }
        builderM.setBlocks(arrayList);
        android.health.connect.datatypes.PlannedExerciseSessionRecord plannedExerciseSessionRecordBuild = builderM.build();
        zcp.b((Object) plannedExerciseSessionRecordBuild, "");
        return plannedExerciseSessionRecordBuild;
    }

    private static final android.health.connect.datatypes.PlannedExerciseBlock toPlatformPlannedExerciseBlock(PlannedExerciseBlock plannedExerciseBlock) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m();
        android.health.connect.datatypes.PlannedExerciseBlock.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m(plannedExerciseBlock.getRepetitions());
        builderM.setDescription(plannedExerciseBlock.getDescription());
        List<PlannedExerciseStep> steps = plannedExerciseBlock.getSteps();
        ArrayList arrayList = new ArrayList(yzp.e(steps, 10));
        Iterator<T> it = steps.iterator();
        while (it.hasNext()) {
            arrayList.add(toPlatformPlannedExerciseStep((PlannedExerciseStep) it.next()));
        }
        builderM.setSteps(arrayList);
        android.health.connect.datatypes.PlannedExerciseBlock plannedExerciseBlockBuild = builderM.build();
        zcp.b((Object) plannedExerciseBlockBuild, "");
        return plannedExerciseBlockBuild;
    }

    private static final android.health.connect.datatypes.PlannedExerciseStep toPlatformPlannedExerciseStep(PlannedExerciseStep plannedExerciseStep) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m$7();
        android.health.connect.datatypes.PlannedExerciseStep.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m(IntDefMappingsKt.toPlatformExerciseSegmentType(plannedExerciseStep.getExerciseType()), IntDefMappingsKt.toPlatformExerciseCategory(plannedExerciseStep.getExercisePhase()), toPlatformExerciseCompletionGoal(plannedExerciseStep.getCompletionGoal()));
        builderM.setDescription(plannedExerciseStep.getDescription());
        List<ExercisePerformanceTarget> performanceTargets = plannedExerciseStep.getPerformanceTargets();
        ArrayList arrayList = new ArrayList(yzp.e(performanceTargets, 10));
        Iterator<T> it = performanceTargets.iterator();
        while (it.hasNext()) {
            arrayList.add(toPlatformExercisePerformanceTarget((ExercisePerformanceTarget) it.next()));
        }
        builderM.setPerformanceGoals(arrayList);
        android.health.connect.datatypes.PlannedExerciseStep plannedExerciseStepBuild = builderM.build();
        zcp.b((Object) plannedExerciseStepBuild, "");
        return plannedExerciseStepBuild;
    }

    public static final ExerciseCompletionGoal toPlatformExerciseCompletionGoal(androidx.health.connect.client.records.ExerciseCompletionGoal exerciseCompletionGoal) {
        zcp.c(exerciseCompletionGoal, "");
        if (exerciseCompletionGoal instanceof androidx.health.connect.client.records.ExerciseCompletionGoal.DistanceGoal) {
            RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m151m$4();
            return RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m((Object) RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m(UnitConvertersKt.toPlatformLength(((androidx.health.connect.client.records.ExerciseCompletionGoal.DistanceGoal) exerciseCompletionGoal).getDistance())));
        }
        if (exerciseCompletionGoal instanceof androidx.health.connect.client.records.ExerciseCompletionGoal.DistanceAndDurationGoal) {
            RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m152m$5();
            androidx.health.connect.client.records.ExerciseCompletionGoal.DistanceAndDurationGoal distanceAndDurationGoal = (androidx.health.connect.client.records.ExerciseCompletionGoal.DistanceAndDurationGoal) exerciseCompletionGoal;
            return RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m((Object) RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m(UnitConvertersKt.toPlatformLength(distanceAndDurationGoal.getDistance()), distanceAndDurationGoal.getDuration()));
        }
        if (exerciseCompletionGoal instanceof androidx.health.connect.client.records.ExerciseCompletionGoal.StepsGoal) {
            RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m153m$6();
            return RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m((Object) RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m132m(((androidx.health.connect.client.records.ExerciseCompletionGoal.StepsGoal) exerciseCompletionGoal).getSteps()));
        }
        if (exerciseCompletionGoal instanceof androidx.health.connect.client.records.ExerciseCompletionGoal.DurationGoal) {
            RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m167m();
            return RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m((Object) RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m(((androidx.health.connect.client.records.ExerciseCompletionGoal.DurationGoal) exerciseCompletionGoal).getDuration()));
        }
        if (exerciseCompletionGoal instanceof androidx.health.connect.client.records.ExerciseCompletionGoal.RepetitionsGoal) {
            RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m$1();
            return RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m((Object) RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m(((androidx.health.connect.client.records.ExerciseCompletionGoal.RepetitionsGoal) exerciseCompletionGoal).getRepetitions()));
        }
        if (exerciseCompletionGoal instanceof androidx.health.connect.client.records.ExerciseCompletionGoal.TotalCaloriesBurnedGoal) {
            RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m$2();
            return RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m((Object) RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m133m(UnitConvertersKt.toPlatformEnergy(((androidx.health.connect.client.records.ExerciseCompletionGoal.TotalCaloriesBurnedGoal) exerciseCompletionGoal).getTotalCalories())));
        }
        if (exerciseCompletionGoal instanceof androidx.health.connect.client.records.ExerciseCompletionGoal.ActiveCaloriesBurnedGoal) {
            RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m$3();
            return RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m((Object) RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m(UnitConvertersKt.toPlatformEnergy(((androidx.health.connect.client.records.ExerciseCompletionGoal.ActiveCaloriesBurnedGoal) exerciseCompletionGoal).getActiveCalories())));
        }
        if (exerciseCompletionGoal instanceof androidx.health.connect.client.records.ExerciseCompletionGoal.UnknownGoal) {
            ExerciseCompletionGoal.UnknownGoal unknownGoal = ExerciseCompletionGoal.UnknownGoal.INSTANCE;
            zcp.b((Object) unknownGoal, "");
            return RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m((Object) unknownGoal);
        }
        if (exerciseCompletionGoal instanceof androidx.health.connect.client.records.ExerciseCompletionGoal.ManualCompletion) {
            ExerciseCompletionGoal.UnspecifiedGoal unspecifiedGoal = ExerciseCompletionGoal.UnspecifiedGoal.INSTANCE;
            zcp.b((Object) unspecifiedGoal, "");
            return RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m((Object) unspecifiedGoal);
        }
        throw new IllegalArgumentException("Unsupported exercise completion goal " + exerciseCompletionGoal);
    }

    public static final ExercisePerformanceGoal toPlatformExercisePerformanceTarget(ExercisePerformanceTarget exercisePerformanceTarget) {
        zcp.c(exercisePerformanceTarget, "");
        if (exercisePerformanceTarget instanceof ExercisePerformanceTarget.PowerTarget) {
            RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m390m();
            ExercisePerformanceTarget.PowerTarget powerTarget = (ExercisePerformanceTarget.PowerTarget) exercisePerformanceTarget;
            return RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m178m((Object) RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m(UnitConvertersKt.toPlatformPower(powerTarget.getMinPower()), UnitConvertersKt.toPlatformPower(powerTarget.getMaxPower())));
        }
        if (exercisePerformanceTarget instanceof ExercisePerformanceTarget.SpeedTarget) {
            RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m$1();
            ExercisePerformanceTarget.SpeedTarget speedTarget = (ExercisePerformanceTarget.SpeedTarget) exercisePerformanceTarget;
            return RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m178m((Object) RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m(UnitConvertersKt.toPlatformVelocity(speedTarget.getMinSpeed()), UnitConvertersKt.toPlatformVelocity(speedTarget.getMaxSpeed())));
        }
        if (exercisePerformanceTarget instanceof ExercisePerformanceTarget.CadenceTarget) {
            RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m$2();
            ExercisePerformanceTarget.CadenceTarget cadenceTarget = (ExercisePerformanceTarget.CadenceTarget) exercisePerformanceTarget;
            return RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m178m((Object) RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m(cadenceTarget.getMinCadence(), cadenceTarget.getMaxCadence()));
        }
        if (exercisePerformanceTarget instanceof ExercisePerformanceTarget.HeartRateTarget) {
            RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m$3();
            ExercisePerformanceTarget.HeartRateTarget heartRateTarget = (ExercisePerformanceTarget.HeartRateTarget) exercisePerformanceTarget;
            return RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m178m((Object) RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m(zcz.c(heartRateTarget.getMinHeartRate()), zcz.c(heartRateTarget.getMaxHeartRate())));
        }
        if (exercisePerformanceTarget instanceof ExercisePerformanceTarget.WeightTarget) {
            RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m$4();
            return RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m178m((Object) RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m(UnitConvertersKt.toPlatformMass(((ExercisePerformanceTarget.WeightTarget) exercisePerformanceTarget).getMass())));
        }
        if (exercisePerformanceTarget instanceof ExercisePerformanceTarget.RateOfPerceivedExertionTarget) {
            RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m$5();
            return RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m178m((Object) RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m(((ExercisePerformanceTarget.RateOfPerceivedExertionTarget) exercisePerformanceTarget).getRpe()));
        }
        if (exercisePerformanceTarget instanceof ExercisePerformanceTarget.AmrapTarget) {
            ExercisePerformanceGoal.AmrapGoal amrapGoal = ExercisePerformanceGoal.AmrapGoal.INSTANCE;
            zcp.b((Object) amrapGoal, "");
            return RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m178m((Object) amrapGoal);
        }
        if (exercisePerformanceTarget instanceof ExercisePerformanceTarget.UnknownTarget) {
            ExercisePerformanceGoal.UnknownGoal unknownGoal = ExercisePerformanceGoal.UnknownGoal.INSTANCE;
            zcp.b((Object) unknownGoal, "");
            return RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m178m((Object) unknownGoal);
        }
        throw new IllegalArgumentException("Unsupported exercise performance target " + exercisePerformanceTarget);
    }

    public static final PlannedExerciseSessionRecord toSdkPlannedExerciseSessionRecord(android.health.connect.datatypes.PlannedExerciseSessionRecord plannedExerciseSessionRecord) {
        zcp.c(plannedExerciseSessionRecord, "");
        Instant startTime = plannedExerciseSessionRecord.getStartTime();
        zcp.b((Object) startTime, "");
        ZoneOffset startZoneOffset = plannedExerciseSessionRecord.getStartZoneOffset();
        Instant endTime = plannedExerciseSessionRecord.getEndTime();
        zcp.b((Object) endTime, "");
        ZoneOffset endZoneOffset = plannedExerciseSessionRecord.getEndZoneOffset();
        android.health.connect.datatypes.Metadata metadata = plannedExerciseSessionRecord.getMetadata();
        zcp.b((Object) metadata, "");
        androidx.health.connect.client.records.metadata.Metadata sdkMetadata = MetadataConvertersKt.toSdkMetadata(metadata);
        boolean zHasExplicitTime = plannedExerciseSessionRecord.hasExplicitTime();
        int sdkExerciseSessionType = IntDefMappingsKt.toSdkExerciseSessionType(plannedExerciseSessionRecord.getExerciseType());
        String completedExerciseSessionId = plannedExerciseSessionRecord.getCompletedExerciseSessionId();
        List blocks = plannedExerciseSessionRecord.getBlocks();
        zcp.b((Object) blocks, "");
        List list = blocks;
        ArrayList arrayList = new ArrayList(yzp.e(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.health.connect.datatypes.PlannedExerciseBlock plannedExerciseBlockM335m = RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m335m(it.next());
            zcp.e(plannedExerciseBlockM335m);
            arrayList.add(toSdkPlannedExerciseBlock(plannedExerciseBlockM335m));
        }
        ArrayList arrayList2 = arrayList;
        CharSequence title = plannedExerciseSessionRecord.getTitle();
        String string = title != null ? title.toString() : null;
        CharSequence notes = plannedExerciseSessionRecord.getNotes();
        return new PlannedExerciseSessionRecord(startTime, startZoneOffset, endTime, endZoneOffset, sdkMetadata, zHasExplicitTime, sdkExerciseSessionType, completedExerciseSessionId, arrayList2, string, notes != null ? notes.toString() : null);
    }

    private static final PlannedExerciseBlock toSdkPlannedExerciseBlock(android.health.connect.datatypes.PlannedExerciseBlock plannedExerciseBlock) {
        int repetitions = plannedExerciseBlock.getRepetitions();
        CharSequence description = plannedExerciseBlock.getDescription();
        String string = description != null ? description.toString() : null;
        List steps = plannedExerciseBlock.getSteps();
        zcp.b((Object) steps, "");
        List list = steps;
        ArrayList arrayList = new ArrayList(yzp.e(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.health.connect.datatypes.PlannedExerciseStep plannedExerciseStepM226m = RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m226m(it.next());
            zcp.e(plannedExerciseStepM226m);
            arrayList.add(toSdkPlannedExerciseStep(plannedExerciseStepM226m));
        }
        return new PlannedExerciseBlock(repetitions, arrayList, string);
    }

    private static final PlannedExerciseStep toSdkPlannedExerciseStep(android.health.connect.datatypes.PlannedExerciseStep plannedExerciseStep) {
        CharSequence description = plannedExerciseStep.getDescription();
        String string = description != null ? description.toString() : null;
        int sdkExerciseSegmentType = IntDefMappingsKt.toSdkExerciseSegmentType(plannedExerciseStep.getExerciseType());
        int sdkExerciseCategory = IntDefMappingsKt.toSdkExerciseCategory(plannedExerciseStep.getExerciseCategory());
        ExerciseCompletionGoal completionGoal = plannedExerciseStep.getCompletionGoal();
        zcp.b((Object) completionGoal, "");
        androidx.health.connect.client.records.ExerciseCompletionGoal sdkExerciseCompletionGoal = toSdkExerciseCompletionGoal(completionGoal);
        List performanceGoals = plannedExerciseStep.getPerformanceGoals();
        zcp.b((Object) performanceGoals, "");
        List list = performanceGoals;
        ArrayList arrayList = new ArrayList(yzp.e(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ExercisePerformanceGoal exercisePerformanceGoalM178m = RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m178m(it.next());
            zcp.e(exercisePerformanceGoalM178m);
            arrayList.add(toSdkExercisePerformanceTarget(exercisePerformanceGoalM178m));
        }
        return new PlannedExerciseStep(sdkExerciseSegmentType, sdkExerciseCategory, sdkExerciseCompletionGoal, arrayList, string);
    }

    public static final androidx.health.connect.client.records.ExerciseCompletionGoal toSdkExerciseCompletionGoal(ExerciseCompletionGoal exerciseCompletionGoal) {
        zcp.c(exerciseCompletionGoal, "");
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m391m((Object) exerciseCompletionGoal)) {
            Length distance = RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m363m((Object) exerciseCompletionGoal).getDistance();
            zcp.b((Object) distance, "");
            return new androidx.health.connect.client.records.ExerciseCompletionGoal.DistanceGoal(UnitConvertersKt.toSdkLength(distance));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m$7(exerciseCompletionGoal)) {
            Length distance2 = RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m364m((Object) exerciseCompletionGoal).getDistance();
            zcp.b((Object) distance2, "");
            androidx.health.connect.client.units.Length sdkLength = UnitConvertersKt.toSdkLength(distance2);
            Duration duration = RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m364m((Object) exerciseCompletionGoal).getDuration();
            zcp.b((Object) duration, "");
            return new androidx.health.connect.client.records.ExerciseCompletionGoal.DistanceAndDurationGoal(sdkLength, duration);
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m$8(exerciseCompletionGoal)) {
            return new androidx.health.connect.client.records.ExerciseCompletionGoal.StepsGoal(RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m367m((Object) exerciseCompletionGoal).getSteps());
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m$1(exerciseCompletionGoal)) {
            Duration duration2 = RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m365m((Object) exerciseCompletionGoal).getDuration();
            zcp.b((Object) duration2, "");
            return new androidx.health.connect.client.records.ExerciseCompletionGoal.DurationGoal(duration2);
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m$2(exerciseCompletionGoal)) {
            return new androidx.health.connect.client.records.ExerciseCompletionGoal.RepetitionsGoal(RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m366m((Object) exerciseCompletionGoal).getRepetitions());
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m$3(exerciseCompletionGoal)) {
            Energy totalCalories = RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m368m((Object) exerciseCompletionGoal).getTotalCalories();
            zcp.b((Object) totalCalories, "");
            return new androidx.health.connect.client.records.ExerciseCompletionGoal.TotalCaloriesBurnedGoal(UnitConvertersKt.toSdkEnergy(totalCalories));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m$4(exerciseCompletionGoal)) {
            Energy activeCalories = RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m((Object) exerciseCompletionGoal).getActiveCalories();
            zcp.b((Object) activeCalories, "");
            return new androidx.health.connect.client.records.ExerciseCompletionGoal.ActiveCaloriesBurnedGoal(UnitConvertersKt.toSdkEnergy(activeCalories));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m$5(exerciseCompletionGoal)) {
            return androidx.health.connect.client.records.ExerciseCompletionGoal.UnknownGoal.INSTANCE;
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m$6(exerciseCompletionGoal)) {
            return androidx.health.connect.client.records.ExerciseCompletionGoal.ManualCompletion.INSTANCE;
        }
        throw new IllegalArgumentException("Unsupported exercise completion goal " + exerciseCompletionGoal);
    }

    public static final ExercisePerformanceTarget toSdkExercisePerformanceTarget(ExercisePerformanceGoal exercisePerformanceGoal) {
        zcp.c(exercisePerformanceGoal, "");
        if (RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m412m((Object) exercisePerformanceGoal)) {
            Power minPower = RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m396m((Object) exercisePerformanceGoal).getMinPower();
            zcp.b((Object) minPower, "");
            androidx.health.connect.client.units.Power sdkPower = UnitConvertersKt.toSdkPower(minPower);
            Power maxPower = RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m396m((Object) exercisePerformanceGoal).getMaxPower();
            zcp.b((Object) maxPower, "");
            return new ExercisePerformanceTarget.PowerTarget(sdkPower, UnitConvertersKt.toSdkPower(maxPower));
        }
        if (RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m147m((Object) exercisePerformanceGoal)) {
            Velocity minSpeed = RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m134m((Object) exercisePerformanceGoal).getMinSpeed();
            zcp.b((Object) minSpeed, "");
            androidx.health.connect.client.units.Velocity sdkVelocity = UnitConvertersKt.toSdkVelocity(minSpeed);
            Velocity maxSpeed = RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m134m((Object) exercisePerformanceGoal).getMaxSpeed();
            zcp.b((Object) maxSpeed, "");
            return new ExercisePerformanceTarget.SpeedTarget(sdkVelocity, UnitConvertersKt.toSdkVelocity(maxSpeed));
        }
        if (RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$1(exercisePerformanceGoal)) {
            return new ExercisePerformanceTarget.CadenceTarget(RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m((Object) exercisePerformanceGoal).getMinRpm(), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m((Object) exercisePerformanceGoal).getMaxRpm());
        }
        if (RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$2(exercisePerformanceGoal)) {
            return new ExercisePerformanceTarget.HeartRateTarget(RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m395m((Object) exercisePerformanceGoal).getMinBpm(), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m395m((Object) exercisePerformanceGoal).getMaxBpm());
        }
        if (RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$3(exercisePerformanceGoal)) {
            Mass mass = RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m398m((Object) exercisePerformanceGoal).getMass();
            zcp.b((Object) mass, "");
            return new ExercisePerformanceTarget.WeightTarget(UnitConvertersKt.toSdkMass(mass));
        }
        if (RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$4(exercisePerformanceGoal)) {
            return new ExercisePerformanceTarget.RateOfPerceivedExertionTarget(RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m397m((Object) exercisePerformanceGoal).getRpe());
        }
        if (RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$5(exercisePerformanceGoal)) {
            return ExercisePerformanceTarget.AmrapTarget.INSTANCE;
        }
        if (RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$6(exercisePerformanceGoal)) {
            return ExercisePerformanceTarget.UnknownTarget.INSTANCE;
        }
        throw new IllegalArgumentException("Unsupported exercise performance target " + exercisePerformanceGoal);
    }

    private static final android.health.connect.datatypes.PowerRecord toPlatformPowerRecord(PowerRecord powerRecord) {
        android.health.connect.datatypes.Metadata platformMetadata = MetadataConvertersKt.toPlatformMetadata(powerRecord.getMetadata());
        Instant startTime = powerRecord.getStartTime();
        Instant endTime = powerRecord.getEndTime();
        List<PowerRecord.Sample> samples = powerRecord.getSamples();
        ArrayList arrayList = new ArrayList(yzp.e(samples, 10));
        Iterator<T> it = samples.iterator();
        while (it.hasNext()) {
            arrayList.add(toPlatformPowerRecordSample((PowerRecord.Sample) it.next()));
        }
        android.health.connect.datatypes.PowerRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m(platformMetadata, startTime, endTime, arrayList);
        ZoneOffset startZoneOffset = powerRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = powerRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        android.health.connect.datatypes.PowerRecord powerRecordBuild = builderM.build();
        zcp.b((Object) powerRecordBuild, "");
        return powerRecordBuild;
    }

    private static final android.health.connect.datatypes.PowerRecord.PowerRecordSample toPlatformPowerRecordSample(PowerRecord.Sample sample) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m$4();
        return RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m(UnitConvertersKt.toPlatformPower(sample.getPower()), sample.getTime());
    }

    private static final android.health.connect.datatypes.RespiratoryRateRecord toPlatformRespiratoryRateRecord(RespiratoryRateRecord respiratoryRateRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m$3();
        android.health.connect.datatypes.RespiratoryRateRecord.Builder builderM296m = RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m296m(MetadataConvertersKt.toPlatformMetadata(respiratoryRateRecord.getMetadata()), respiratoryRateRecord.getTime(), respiratoryRateRecord.getRate());
        ZoneOffset zoneOffset = respiratoryRateRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM296m.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.RespiratoryRateRecord respiratoryRateRecordBuild = builderM296m.build();
        zcp.b((Object) respiratoryRateRecordBuild, "");
        return respiratoryRateRecordBuild;
    }

    private static final android.health.connect.datatypes.RestingHeartRateRecord toPlatformRestingHeartRateRecord(RestingHeartRateRecord restingHeartRateRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m$7();
        android.health.connect.datatypes.RestingHeartRateRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m(MetadataConvertersKt.toPlatformMetadata(restingHeartRateRecord.getMetadata()), restingHeartRateRecord.getTime(), restingHeartRateRecord.getBeatsPerMinute());
        ZoneOffset zoneOffset = restingHeartRateRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.RestingHeartRateRecord restingHeartRateRecordBuild = builderM.build();
        zcp.b((Object) restingHeartRateRecordBuild, "");
        return restingHeartRateRecordBuild;
    }

    private static final android.health.connect.datatypes.SexualActivityRecord toPlatformSexualActivityRecord(SexualActivityRecord sexualActivityRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m();
        android.health.connect.datatypes.SexualActivityRecord.Builder builderM256m = RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m256m(MetadataConvertersKt.toPlatformMetadata(sexualActivityRecord.getMetadata()), sexualActivityRecord.getTime(), IntDefMappingsKt.toPlatformSexualActivityProtectionUsed(sexualActivityRecord.getProtectionUsed()));
        ZoneOffset zoneOffset = sexualActivityRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM256m.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.SexualActivityRecord sexualActivityRecordBuild = builderM256m.build();
        zcp.b((Object) sexualActivityRecordBuild, "");
        return sexualActivityRecordBuild;
    }

    private static final android.health.connect.datatypes.SkinTemperatureRecord toPlatformSkinTemperatureRecord(SkinTemperatureRecord skinTemperatureRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m$9();
        android.health.connect.datatypes.SkinTemperatureRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m(MetadataConvertersKt.toPlatformMetadata(skinTemperatureRecord.getMetadata()), skinTemperatureRecord.getStartTime(), skinTemperatureRecord.getEndTime());
        ZoneOffset startZoneOffset = skinTemperatureRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = skinTemperatureRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        androidx.health.connect.client.units.Temperature baseline = skinTemperatureRecord.getBaseline();
        if (baseline != null) {
            builderM.setBaseline(UnitConvertersKt.toPlatformTemperature(baseline));
        }
        builderM.setMeasurementLocation(IntDefMappingsKt.toPlatformSkinTemperatureMeasurementLocation(skinTemperatureRecord.getMeasurementLocation()));
        List<SkinTemperatureRecord.Delta> deltas = skinTemperatureRecord.getDeltas();
        ArrayList arrayList = new ArrayList(yzp.e(deltas, 10));
        Iterator<T> it = deltas.iterator();
        while (it.hasNext()) {
            arrayList.add(toPlatformSkinTemperatureRecordDelta((SkinTemperatureRecord.Delta) it.next()));
        }
        builderM.setDeltas(arrayList);
        android.health.connect.datatypes.SkinTemperatureRecord skinTemperatureRecordBuild = builderM.build();
        zcp.b((Object) skinTemperatureRecordBuild, "");
        return skinTemperatureRecordBuild;
    }

    private static final android.health.connect.datatypes.SkinTemperatureRecord.Delta toPlatformSkinTemperatureRecordDelta(SkinTemperatureRecord.Delta delta) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m$2();
        return RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m(UnitConvertersKt.toPlatformTemperatureDelta(delta.getDelta()), delta.getTime());
    }

    private static final android.health.connect.datatypes.SleepSessionRecord toPlatformSleepSessionRecord(SleepSessionRecord sleepSessionRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m148m$1();
        android.health.connect.datatypes.SleepSessionRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m(MetadataConvertersKt.toPlatformMetadata(sleepSessionRecord.getMetadata()), sleepSessionRecord.getStartTime(), sleepSessionRecord.getEndTime());
        ZoneOffset startZoneOffset = sleepSessionRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = sleepSessionRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        String notes = sleepSessionRecord.getNotes();
        if (notes != null) {
            builderM.setNotes(notes);
        }
        String title = sleepSessionRecord.getTitle();
        if (title != null) {
            builderM.setTitle(title);
        }
        List<SleepSessionRecord.Stage> stages = sleepSessionRecord.getStages();
        ArrayList arrayList = new ArrayList(yzp.e(stages, 10));
        Iterator<T> it = stages.iterator();
        while (it.hasNext()) {
            arrayList.add(toPlatformSleepSessionStage((SleepSessionRecord.Stage) it.next()));
        }
        builderM.setStages(arrayList);
        android.health.connect.datatypes.SleepSessionRecord sleepSessionRecordBuild = builderM.build();
        zcp.b((Object) sleepSessionRecordBuild, "");
        return sleepSessionRecordBuild;
    }

    private static final android.health.connect.datatypes.SleepSessionRecord.Stage toPlatformSleepSessionStage(SleepSessionRecord.Stage stage) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m$2();
        return RecordConvertersKt$$ExternalSyntheticApiModelOutline2.m(stage.getStartTime(), stage.getEndTime(), IntDefMappingsKt.toPlatformSleepStageType(stage.getStage()));
    }

    private static final android.health.connect.datatypes.SpeedRecord toPlatformSpeedRecord(SpeedRecord speedRecord) {
        android.health.connect.datatypes.Metadata platformMetadata = MetadataConvertersKt.toPlatformMetadata(speedRecord.getMetadata());
        Instant startTime = speedRecord.getStartTime();
        Instant endTime = speedRecord.getEndTime();
        List<SpeedRecord.Sample> samples = speedRecord.getSamples();
        ArrayList arrayList = new ArrayList(yzp.e(samples, 10));
        Iterator<T> it = samples.iterator();
        while (it.hasNext()) {
            arrayList.add(toPlatformSpeedRecordSample((SpeedRecord.Sample) it.next()));
        }
        android.health.connect.datatypes.SpeedRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m(platformMetadata, startTime, endTime, arrayList);
        ZoneOffset startZoneOffset = speedRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = speedRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        android.health.connect.datatypes.SpeedRecord speedRecordBuild = builderM.build();
        zcp.b((Object) speedRecordBuild, "");
        return speedRecordBuild;
    }

    private static final android.health.connect.datatypes.SpeedRecord.SpeedRecordSample toPlatformSpeedRecordSample(SpeedRecord.Sample sample) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m$3();
        return RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m(UnitConvertersKt.toPlatformVelocity(sample.getSpeed()), sample.getTime());
    }

    private static final android.health.connect.datatypes.StepsRecord toPlatformStepsRecord(StepsRecord stepsRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m$6();
        android.health.connect.datatypes.StepsRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline4.m(MetadataConvertersKt.toPlatformMetadata(stepsRecord.getMetadata()), stepsRecord.getStartTime(), stepsRecord.getEndTime(), stepsRecord.getCount());
        ZoneOffset startZoneOffset = stepsRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = stepsRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        android.health.connect.datatypes.StepsRecord stepsRecordBuild = builderM.build();
        zcp.b((Object) stepsRecordBuild, "");
        return stepsRecordBuild;
    }

    private static final android.health.connect.datatypes.StepsCadenceRecord toPlatformStepsCadenceRecord(StepsCadenceRecord stepsCadenceRecord) {
        android.health.connect.datatypes.Metadata platformMetadata = MetadataConvertersKt.toPlatformMetadata(stepsCadenceRecord.getMetadata());
        Instant startTime = stepsCadenceRecord.getStartTime();
        Instant endTime = stepsCadenceRecord.getEndTime();
        List<StepsCadenceRecord.Sample> samples = stepsCadenceRecord.getSamples();
        ArrayList arrayList = new ArrayList(yzp.e(samples, 10));
        Iterator<T> it = samples.iterator();
        while (it.hasNext()) {
            arrayList.add(toPlatformStepsCadenceSample((StepsCadenceRecord.Sample) it.next()));
        }
        android.health.connect.datatypes.StepsCadenceRecord.Builder builderM = RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m(platformMetadata, startTime, endTime, arrayList);
        ZoneOffset startZoneOffset = stepsCadenceRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = stepsCadenceRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        android.health.connect.datatypes.StepsCadenceRecord stepsCadenceRecordBuild = builderM.build();
        zcp.b((Object) stepsCadenceRecordBuild, "");
        return stepsCadenceRecordBuild;
    }

    private static final android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample toPlatformStepsCadenceSample(StepsCadenceRecord.Sample sample) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m$6();
        return RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m(sample.getRate(), sample.getTime());
    }

    private static final android.health.connect.datatypes.TotalCaloriesBurnedRecord toPlatformTotalCaloriesBurnedRecord(TotalCaloriesBurnedRecord totalCaloriesBurnedRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m$6();
        android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline6.m(MetadataConvertersKt.toPlatformMetadata(totalCaloriesBurnedRecord.getMetadata()), totalCaloriesBurnedRecord.getStartTime(), totalCaloriesBurnedRecord.getEndTime(), UnitConvertersKt.toPlatformEnergy(totalCaloriesBurnedRecord.getEnergy()));
        ZoneOffset startZoneOffset = totalCaloriesBurnedRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = totalCaloriesBurnedRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        android.health.connect.datatypes.TotalCaloriesBurnedRecord totalCaloriesBurnedRecordBuild = builderM.build();
        zcp.b((Object) totalCaloriesBurnedRecordBuild, "");
        return totalCaloriesBurnedRecordBuild;
    }

    private static final android.health.connect.datatypes.Vo2MaxRecord toPlatformVo2MaxRecord(Vo2MaxRecord vo2MaxRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m$1();
        android.health.connect.datatypes.Vo2MaxRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline3.m(MetadataConvertersKt.toPlatformMetadata(vo2MaxRecord.getMetadata()), vo2MaxRecord.getTime(), IntDefMappingsKt.toPlatformVo2MaxMeasurementMethod(vo2MaxRecord.getMeasurementMethod()), vo2MaxRecord.getVo2MillilitersPerMinuteKilogram());
        ZoneOffset zoneOffset = vo2MaxRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.Vo2MaxRecord vo2MaxRecordBuild = builderM.build();
        zcp.b((Object) vo2MaxRecordBuild, "");
        return vo2MaxRecordBuild;
    }

    private static final android.health.connect.datatypes.WeightRecord toPlatformWeightRecord(WeightRecord weightRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m$7();
        android.health.connect.datatypes.WeightRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline1.m(MetadataConvertersKt.toPlatformMetadata(weightRecord.getMetadata()), weightRecord.getTime(), UnitConvertersKt.toPlatformMass(weightRecord.getWeight()));
        ZoneOffset zoneOffset = weightRecord.getZoneOffset();
        if (zoneOffset != null) {
            builderM.setZoneOffset(zoneOffset);
        }
        android.health.connect.datatypes.WeightRecord weightRecordBuild = builderM.build();
        zcp.b((Object) weightRecordBuild, "");
        return weightRecordBuild;
    }

    private static final android.health.connect.datatypes.WheelchairPushesRecord toPlatformWheelchairPushesRecord(WheelchairPushesRecord wheelchairPushesRecord) {
        RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m();
        android.health.connect.datatypes.WheelchairPushesRecord.Builder builderM = RecordConvertersKt$$ExternalSyntheticApiModelOutline5.m(MetadataConvertersKt.toPlatformMetadata(wheelchairPushesRecord.getMetadata()), wheelchairPushesRecord.getStartTime(), wheelchairPushesRecord.getEndTime(), wheelchairPushesRecord.getCount());
        ZoneOffset startZoneOffset = wheelchairPushesRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builderM.setStartZoneOffset(startZoneOffset);
        }
        ZoneOffset endZoneOffset = wheelchairPushesRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builderM.setEndZoneOffset(endZoneOffset);
        }
        android.health.connect.datatypes.WheelchairPushesRecord wheelchairPushesRecordBuild = builderM.build();
        zcp.b((Object) wheelchairPushesRecordBuild, "");
        return wheelchairPushesRecordBuild;
    }

    private static final CyclingPedalingCadenceRecord.Sample toSdkCyclingPedalingCadenceSample(android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample cyclingPedalingCadenceRecordSample) {
        Instant time = cyclingPedalingCadenceRecordSample.getTime();
        zcp.b((Object) time, "");
        return new CyclingPedalingCadenceRecord.Sample(time, cyclingPedalingCadenceRecordSample.getRevolutionsPerMinute());
    }

    private static final HeartRateRecord.Sample toSdkHeartRateSample(android.health.connect.datatypes.HeartRateRecord.HeartRateSample heartRateSample) {
        Instant time = heartRateSample.getTime();
        zcp.b((Object) time, "");
        return new HeartRateRecord.Sample(time, heartRateSample.getBeatsPerMinute());
    }

    private static final PowerRecord.Sample toSdkPowerRecordSample(android.health.connect.datatypes.PowerRecord.PowerRecordSample powerRecordSample) {
        Instant time = powerRecordSample.getTime();
        zcp.b((Object) time, "");
        Power power = powerRecordSample.getPower();
        zcp.b((Object) power, "");
        return new PowerRecord.Sample(time, UnitConvertersKt.toSdkPower(power));
    }

    private static final SkinTemperatureRecord.Delta toSdkSkinTemperatureDelta(android.health.connect.datatypes.SkinTemperatureRecord.Delta delta) {
        Instant time = delta.getTime();
        zcp.b((Object) time, "");
        TemperatureDelta delta2 = delta.getDelta();
        zcp.b((Object) delta2, "");
        return new SkinTemperatureRecord.Delta(time, UnitConvertersKt.toSdkTemperatureDelta(delta2));
    }

    private static final SpeedRecord.Sample toSdkSpeedSample(android.health.connect.datatypes.SpeedRecord.SpeedRecordSample speedRecordSample) {
        Instant time = speedRecordSample.getTime();
        zcp.b((Object) time, "");
        Velocity speed = speedRecordSample.getSpeed();
        zcp.b((Object) speed, "");
        return new SpeedRecord.Sample(time, UnitConvertersKt.toSdkVelocity(speed));
    }

    private static final StepsCadenceRecord.Sample toSdkStepsCadenceSample(android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample stepsCadenceRecordSample) {
        Instant time = stepsCadenceRecordSample.getTime();
        zcp.b((Object) time, "");
        return new StepsCadenceRecord.Sample(time, stepsCadenceRecordSample.getRate());
    }

    private static final SleepSessionRecord.Stage toSdkSleepSessionStage(android.health.connect.datatypes.SleepSessionRecord.Stage stage) {
        Instant startTime = stage.getStartTime();
        zcp.b((Object) startTime, "");
        Instant endTime = stage.getEndTime();
        zcp.b((Object) endTime, "");
        return new SleepSessionRecord.Stage(startTime, endTime, IntDefMappingsKt.toSdkSleepStageType(stage.getType()));
    }

    public static final androidx.health.connect.client.records.ExerciseRoute toSdkExerciseRoute(ExerciseRoute exerciseRoute) {
        zcp.c(exerciseRoute, "");
        List routeLocations = exerciseRoute.getRouteLocations();
        zcp.b((Object) routeLocations, "");
        List list = routeLocations;
        ArrayList arrayList = new ArrayList(yzp.e(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ExerciseRoute.Location locationM = RecordConvertersKt$$ExternalSyntheticApiModelOutline50.m(it.next());
            Instant time = locationM.getTime();
            zcp.b((Object) time, "");
            double latitude = locationM.getLatitude();
            double longitude = locationM.getLongitude();
            Length horizontalAccuracy = locationM.getHorizontalAccuracy();
            androidx.health.connect.client.units.Length sdkLength = horizontalAccuracy != null ? UnitConvertersKt.toSdkLength(horizontalAccuracy) : null;
            Length verticalAccuracy = locationM.getVerticalAccuracy();
            androidx.health.connect.client.units.Length sdkLength2 = verticalAccuracy != null ? UnitConvertersKt.toSdkLength(verticalAccuracy) : null;
            Length altitude = locationM.getAltitude();
            arrayList.add(new androidx.health.connect.client.records.ExerciseRoute.Location(time, latitude, longitude, sdkLength, sdkLength2, altitude != null ? UnitConvertersKt.toSdkLength(altitude) : null));
        }
        return new androidx.health.connect.client.records.ExerciseRoute(arrayList);
    }

    public static final androidx.health.connect.client.records.ExerciseLap toSdkExerciseLap(ExerciseLap exerciseLap) {
        zcp.c(exerciseLap, "");
        Instant startTime = exerciseLap.getStartTime();
        zcp.b((Object) startTime, "");
        Instant endTime = exerciseLap.getEndTime();
        zcp.b((Object) endTime, "");
        Length length = exerciseLap.getLength();
        return new androidx.health.connect.client.records.ExerciseLap(startTime, endTime, length != null ? UnitConvertersKt.toSdkLength(length) : null);
    }

    public static final androidx.health.connect.client.records.ExerciseSegment toSdkExerciseSegment(ExerciseSegment exerciseSegment) {
        zcp.c(exerciseSegment, "");
        Instant startTime = exerciseSegment.getStartTime();
        zcp.b((Object) startTime, "");
        Instant endTime = exerciseSegment.getEndTime();
        zcp.b((Object) endTime, "");
        return new androidx.health.connect.client.records.ExerciseSegment(startTime, endTime, IntDefMappingsKt.toSdkExerciseSegmentType(exerciseSegment.getSegmentType()), exerciseSegment.getRepetitionsCount());
    }

    public static final MedicalResourceId toSdkMedicalResourceId(android.health.connect.MedicalResourceId medicalResourceId) {
        zcp.c(medicalResourceId, "");
        String dataSourceId = medicalResourceId.getDataSourceId();
        zcp.b((Object) dataSourceId, "");
        int sdkFhirResourceType = IntDefMappingsKt.toSdkFhirResourceType(medicalResourceId.getFhirResourceType());
        String fhirResourceId = medicalResourceId.getFhirResourceId();
        zcp.b((Object) fhirResourceId, "");
        return new MedicalResourceId(dataSourceId, sdkFhirResourceType, fhirResourceId);
    }

    public static final FhirVersion toSdkFhirVersion(android.health.connect.datatypes.FhirVersion fhirVersion) {
        zcp.c(fhirVersion, "");
        return new FhirVersion(fhirVersion.getMajor(), fhirVersion.getMinor(), fhirVersion.getPatch());
    }

    public static final MedicalDataSource toSdkMedicalDataSource(android.health.connect.datatypes.MedicalDataSource medicalDataSource) {
        zcp.c(medicalDataSource, "");
        String id = medicalDataSource.getId();
        zcp.b((Object) id, "");
        String packageName = medicalDataSource.getPackageName();
        zcp.b((Object) packageName, "");
        Uri fhirBaseUri = medicalDataSource.getFhirBaseUri();
        zcp.b((Object) fhirBaseUri, "");
        String displayName = medicalDataSource.getDisplayName();
        zcp.b((Object) displayName, "");
        return new MedicalDataSource(id, packageName, fhirBaseUri, displayName, new FhirVersion(medicalDataSource.getFhirVersion().getMajor(), medicalDataSource.getFhirVersion().getMinor(), medicalDataSource.getFhirVersion().getPatch()), medicalDataSource.getLastDataUpdateTime());
    }

    public static final FhirResource toSdkFhirResource(android.health.connect.datatypes.FhirResource fhirResource) {
        zcp.c(fhirResource, "");
        int sdkFhirResourceType = IntDefMappingsKt.toSdkFhirResourceType(fhirResource.getType());
        String id = fhirResource.getId();
        zcp.b((Object) id, "");
        String data = fhirResource.getData();
        zcp.b((Object) data, "");
        return new FhirResource(sdkFhirResourceType, id, data);
    }

    public static final MedicalResource toSdkMedicalResource(android.health.connect.datatypes.MedicalResource medicalResource) {
        zcp.c(medicalResource, "");
        int sdkMedicalResourceType = IntDefMappingsKt.toSdkMedicalResourceType(medicalResource.getType());
        android.health.connect.MedicalResourceId id = medicalResource.getId();
        zcp.b((Object) id, "");
        MedicalResourceId sdkMedicalResourceId = toSdkMedicalResourceId(id);
        String dataSourceId = medicalResource.getDataSourceId();
        zcp.b((Object) dataSourceId, "");
        android.health.connect.datatypes.FhirVersion fhirVersion = medicalResource.getFhirVersion();
        zcp.b((Object) fhirVersion, "");
        FhirVersion sdkFhirVersion = toSdkFhirVersion(fhirVersion);
        android.health.connect.datatypes.FhirResource fhirResource = medicalResource.getFhirResource();
        zcp.b((Object) fhirResource, "");
        return new MedicalResource(sdkMedicalResourceType, sdkMedicalResourceId, dataSourceId, sdkFhirVersion, toSdkFhirResource(fhirResource));
    }
}
