package androidx.health.connect.client.records;

import android.os.Build;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.impl.platform.records.RecordConvertersKt;
import androidx.health.connect.client.units.Energy;
import androidx.health.connect.client.units.EnergyKt;
import androidx.health.connect.client.units.Mass;
import androidx.health.connect.client.units.MassKt;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import defpackage.zcp;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b=\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 |2\u00020\u0001:\u0001|BÁ\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000107\u0012\b\b\u0002\u00108\u001a\u000209¢\u0006\u0004\b:\u0010;J\u0013\u0010v\u001a\u00020w2\b\u0010x\u001a\u0004\u0018\u00010yH\u0096\u0002J\b\u0010z\u001a\u000209H\u0016J\b\u0010{\u001a\u000207H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010=R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010?R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bF\u0010ER\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bG\u0010ER\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010IR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bK\u0010ER\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bL\u0010ER\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bM\u0010ER\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bN\u0010ER\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bO\u0010ER\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bP\u0010ER\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010ER\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bR\u0010ER\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bS\u0010ER\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bT\u0010ER\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bU\u0010ER\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bV\u0010ER\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bW\u0010ER\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bX\u0010ER\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ER\u0013\u0010 \u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010ER\u0013\u0010!\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b[\u0010ER\u0013\u0010\"\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010ER\u0013\u0010#\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b]\u0010ER\u0013\u0010$\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b^\u0010ER\u0013\u0010%\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b_\u0010ER\u0013\u0010&\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b`\u0010ER\u0013\u0010'\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\ba\u0010ER\u0013\u0010(\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bb\u0010ER\u0013\u0010)\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bc\u0010ER\u0013\u0010*\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bd\u0010ER\u0013\u0010+\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\be\u0010ER\u0013\u0010,\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bf\u0010ER\u0013\u0010-\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bg\u0010ER\u0013\u0010.\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bh\u0010ER\u0013\u0010/\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bi\u0010ER\u0013\u00100\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bj\u0010ER\u0013\u00101\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bk\u0010ER\u0013\u00102\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bl\u0010ER\u0013\u00103\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bm\u0010ER\u0013\u00104\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bn\u0010ER\u0013\u00105\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bo\u0010ER\u0013\u00106\u001a\u0004\u0018\u000107¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0017\u00108\u001a\u000209¢\u0006\u000e\n\u0000\u0012\u0004\br\u0010s\u001a\u0004\bt\u0010u¨\u0006}"}, d2 = {"Landroidx/health/connect/client/records/NutritionRecord;", "Landroidx/health/connect/client/records/IntervalRecord;", "startTime", "Ljava/time/Instant;", "startZoneOffset", "Ljava/time/ZoneOffset;", "endTime", "endZoneOffset", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "biotin", "Landroidx/health/connect/client/units/Mass;", "caffeine", "calcium", "energy", "Landroidx/health/connect/client/units/Energy;", "energyFromFat", "chloride", "cholesterol", "chromium", "copper", "dietaryFiber", "folate", "folicAcid", "iodine", "iron", "magnesium", "manganese", "molybdenum", "monounsaturatedFat", "niacin", "pantothenicAcid", "phosphorus", "polyunsaturatedFat", "potassium", "protein", "riboflavin", "saturatedFat", "selenium", "sodium", "sugar", "thiamin", "totalCarbohydrate", "totalFat", "transFat", "unsaturatedFat", "vitaminA", "vitaminB12", "vitaminB6", "vitaminC", "vitaminD", "vitaminE", "vitaminK", "zinc", "name", "", "mealType", "", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/records/metadata/Metadata;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Energy;Landroidx/health/connect/client/units/Energy;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Landroidx/health/connect/client/units/Mass;Ljava/lang/String;I)V", "getStartTime", "()Ljava/time/Instant;", "getStartZoneOffset", "()Ljava/time/ZoneOffset;", "getEndTime", "getEndZoneOffset", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "getBiotin", "()Landroidx/health/connect/client/units/Mass;", "getCaffeine", "getCalcium", "getEnergy", "()Landroidx/health/connect/client/units/Energy;", "getEnergyFromFat", "getChloride", "getCholesterol", "getChromium", "getCopper", "getDietaryFiber", "getFolate", "getFolicAcid", "getIodine", "getIron", "getMagnesium", "getManganese", "getMolybdenum", "getMonounsaturatedFat", "getNiacin", "getPantothenicAcid", "getPhosphorus", "getPolyunsaturatedFat", "getPotassium", "getProtein", "getRiboflavin", "getSaturatedFat", "getSelenium", "getSodium", "getSugar", "getThiamin", "getTotalCarbohydrate", "getTotalFat", "getTransFat", "getUnsaturatedFat", "getVitaminA", "getVitaminB12", "getVitaminB6", "getVitaminC", "getVitaminD", "getVitaminE", "getVitaminK", "getZinc", "getName", "()Ljava/lang/String;", "getMealType$annotations", "()V", "getMealType", "()I", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "toString", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NutritionRecord implements IntervalRecord {
    private final Mass biotin;
    private final Mass caffeine;
    private final Mass calcium;
    private final Mass chloride;
    private final Mass cholesterol;
    private final Mass chromium;
    private final Mass copper;
    private final Mass dietaryFiber;
    private final Instant endTime;
    private final ZoneOffset endZoneOffset;
    private final Energy energy;
    private final Energy energyFromFat;
    private final Mass folate;
    private final Mass folicAcid;
    private final Mass iodine;
    private final Mass iron;
    private final Mass magnesium;
    private final Mass manganese;
    private final int mealType;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final Mass molybdenum;
    private final Mass monounsaturatedFat;
    private final String name;
    private final Mass niacin;
    private final Mass pantothenicAcid;
    private final Mass phosphorus;
    private final Mass polyunsaturatedFat;
    private final Mass potassium;
    private final Mass protein;
    private final Mass riboflavin;
    private final Mass saturatedFat;
    private final Mass selenium;
    private final Mass sodium;
    private final Instant startTime;
    private final ZoneOffset startZoneOffset;
    private final Mass sugar;
    private final Mass thiamin;
    private final Mass totalCarbohydrate;
    private final Mass totalFat;
    private final Mass transFat;
    private final Mass unsaturatedFat;
    private final Mass vitaminA;
    private final Mass vitaminB12;
    private final Mass vitaminB6;
    private final Mass vitaminC;
    private final Mass vitaminD;
    private final Mass vitaminE;
    private final Mass vitaminK;
    private final Mass zinc;
    private static final Mass MIN_MASS = MassKt.getGrams(0.0d);
    private static final Mass MAX_MASS_100 = MassKt.getGrams(4.94E-322d);
    private static final Mass MAX_MASS_100K = MassKt.getGrams(4.94066E-319d);
    private static final Energy MIN_ENERGY = EnergyKt.getCalories(0.0d);
    private static final Energy MAX_ENERGY = EnergyKt.getCalories(4.94065646E-316d);
    private static final String TYPE_NAME = "Nutrition";
    public static final AggregateMetric<Mass> BIOTIN_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "biotin", new NutritionRecord$Companion$BIOTIN_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> CAFFEINE_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "caffeine", new NutritionRecord$Companion$CAFFEINE_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> CALCIUM_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "calcium", new NutritionRecord$Companion$CALCIUM_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Energy> ENERGY_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "calories", new NutritionRecord$Companion$ENERGY_TOTAL$1(Energy.INSTANCE));
    public static final AggregateMetric<Energy> ENERGY_FROM_FAT_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "caloriesFromFat", new NutritionRecord$Companion$ENERGY_FROM_FAT_TOTAL$1(Energy.INSTANCE));
    public static final AggregateMetric<Mass> CHLORIDE_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "chloride", new NutritionRecord$Companion$CHLORIDE_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> CHOLESTEROL_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "cholesterol", new NutritionRecord$Companion$CHOLESTEROL_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> CHROMIUM_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "chromium", new NutritionRecord$Companion$CHROMIUM_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> COPPER_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "copper", new NutritionRecord$Companion$COPPER_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> DIETARY_FIBER_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "dietaryFiber", new NutritionRecord$Companion$DIETARY_FIBER_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> FOLATE_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "folate", new NutritionRecord$Companion$FOLATE_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> FOLIC_ACID_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "folicAcid", new NutritionRecord$Companion$FOLIC_ACID_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> IODINE_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "iodine", new NutritionRecord$Companion$IODINE_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> IRON_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "iron", new NutritionRecord$Companion$IRON_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> MAGNESIUM_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "magnesium", new NutritionRecord$Companion$MAGNESIUM_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> MANGANESE_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "manganese", new NutritionRecord$Companion$MANGANESE_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> MOLYBDENUM_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "molybdenum", new NutritionRecord$Companion$MOLYBDENUM_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> MONOUNSATURATED_FAT_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "monounsaturatedFat", new NutritionRecord$Companion$MONOUNSATURATED_FAT_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> NIACIN_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "niacin", new NutritionRecord$Companion$NIACIN_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> PANTOTHENIC_ACID_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "pantothenicAcid", new NutritionRecord$Companion$PANTOTHENIC_ACID_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> PHOSPHORUS_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "phosphorus", new NutritionRecord$Companion$PHOSPHORUS_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> POLYUNSATURATED_FAT_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "polyunsaturatedFat", new NutritionRecord$Companion$POLYUNSATURATED_FAT_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> POTASSIUM_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "potassium", new NutritionRecord$Companion$POTASSIUM_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> PROTEIN_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "protein", new NutritionRecord$Companion$PROTEIN_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> RIBOFLAVIN_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "riboflavin", new NutritionRecord$Companion$RIBOFLAVIN_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> SATURATED_FAT_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "saturatedFat", new NutritionRecord$Companion$SATURATED_FAT_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> SELENIUM_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "selenium", new NutritionRecord$Companion$SELENIUM_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> SODIUM_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "sodium", new NutritionRecord$Companion$SODIUM_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> SUGAR_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "sugar", new NutritionRecord$Companion$SUGAR_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> THIAMIN_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "thiamin", new NutritionRecord$Companion$THIAMIN_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> TOTAL_CARBOHYDRATE_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "totalCarbohydrate", new NutritionRecord$Companion$TOTAL_CARBOHYDRATE_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> TOTAL_FAT_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "totalFat", new NutritionRecord$Companion$TOTAL_FAT_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> TRANS_FAT_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "transFat", new NutritionRecord$Companion$TRANS_FAT_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> UNSATURATED_FAT_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "unsaturatedFat", new NutritionRecord$Companion$UNSATURATED_FAT_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> VITAMIN_A_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "vitaminA", new NutritionRecord$Companion$VITAMIN_A_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> VITAMIN_B12_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "vitaminB12", new NutritionRecord$Companion$VITAMIN_B12_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> VITAMIN_B6_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "vitaminB6", new NutritionRecord$Companion$VITAMIN_B6_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> VITAMIN_C_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "vitaminC", new NutritionRecord$Companion$VITAMIN_C_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> VITAMIN_D_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "vitaminD", new NutritionRecord$Companion$VITAMIN_D_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> VITAMIN_E_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "vitaminE", new NutritionRecord$Companion$VITAMIN_E_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> VITAMIN_K_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "vitaminK", new NutritionRecord$Companion$VITAMIN_K_TOTAL$1(Mass.INSTANCE));
    public static final AggregateMetric<Mass> ZINC_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE_NAME, AggregateMetric.AggregationType.TOTAL, "zinc", new NutritionRecord$Companion$ZINC_TOTAL$1(Mass.INSTANCE));

    public static /* synthetic */ void getMealType$annotations() {
    }

    public NutritionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, Mass mass, Mass mass2, Mass mass3, Energy energy, Energy energy2, Mass mass4, Mass mass5, Mass mass6, Mass mass7, Mass mass8, Mass mass9, Mass mass10, Mass mass11, Mass mass12, Mass mass13, Mass mass14, Mass mass15, Mass mass16, Mass mass17, Mass mass18, Mass mass19, Mass mass20, Mass mass21, Mass mass22, Mass mass23, Mass mass24, Mass mass25, Mass mass26, Mass mass27, Mass mass28, Mass mass29, Mass mass30, Mass mass31, Mass mass32, Mass mass33, Mass mass34, Mass mass35, Mass mass36, Mass mass37, Mass mass38, Mass mass39, Mass mass40, String str, int i) {
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
        this.startTime = instant;
        this.startZoneOffset = zoneOffset;
        this.endTime = instant2;
        this.endZoneOffset = zoneOffset2;
        this.metadata = metadata;
        this.biotin = mass;
        this.caffeine = mass2;
        this.calcium = mass3;
        this.energy = energy;
        this.energyFromFat = energy2;
        this.chloride = mass4;
        this.cholesterol = mass5;
        this.chromium = mass6;
        this.copper = mass7;
        this.dietaryFiber = mass8;
        this.folate = mass9;
        this.folicAcid = mass10;
        this.iodine = mass11;
        this.iron = mass12;
        this.magnesium = mass13;
        this.manganese = mass14;
        this.molybdenum = mass15;
        this.monounsaturatedFat = mass16;
        this.niacin = mass17;
        this.pantothenicAcid = mass18;
        this.phosphorus = mass19;
        this.polyunsaturatedFat = mass20;
        this.potassium = mass21;
        this.protein = mass22;
        this.riboflavin = mass23;
        this.saturatedFat = mass24;
        this.selenium = mass25;
        this.sodium = mass26;
        this.sugar = mass27;
        this.thiamin = mass28;
        this.totalCarbohydrate = mass29;
        this.totalFat = mass30;
        this.transFat = mass31;
        this.unsaturatedFat = mass32;
        this.vitaminA = mass33;
        this.vitaminB12 = mass34;
        this.vitaminB6 = mass35;
        this.vitaminC = mass36;
        this.vitaminD = mass37;
        this.vitaminE = mass38;
        this.vitaminK = mass39;
        this.zinc = mass40;
        this.name = str;
        this.mealType = i;
        if (!getStartTime().isBefore(getEndTime())) {
            throw new IllegalArgumentException("startTime must be before endTime.".toString());
        }
        if (Build.VERSION.SDK_INT >= 34) {
            RecordConvertersKt.toPlatformRecord(this);
            return;
        }
        Mass mass41 = this.biotin;
        if (mass41 != null) {
            UtilsKt.requireInRange(mass41, MIN_MASS, MAX_MASS_100, "biotin");
        }
        Mass mass42 = this.caffeine;
        if (mass42 != null) {
            UtilsKt.requireInRange(mass42, MIN_MASS, MAX_MASS_100, "caffeine");
        }
        Mass mass43 = this.calcium;
        if (mass43 != null) {
            UtilsKt.requireInRange(mass43, MIN_MASS, MAX_MASS_100, "calcium");
        }
        Energy energy3 = this.energy;
        if (energy3 != null) {
            UtilsKt.requireInRange(energy3, MIN_ENERGY, MAX_ENERGY, "energy");
        }
        Energy energy4 = this.energyFromFat;
        if (energy4 != null) {
            UtilsKt.requireInRange(energy4, MIN_ENERGY, MAX_ENERGY, "energyFromFat");
        }
        Mass mass44 = this.chloride;
        if (mass44 != null) {
            UtilsKt.requireInRange(mass44, MIN_MASS, MAX_MASS_100, "chloride");
        }
        Mass mass45 = this.cholesterol;
        if (mass45 != null) {
            UtilsKt.requireInRange(mass45, MIN_MASS, MAX_MASS_100, "cholesterol");
        }
        Mass mass46 = this.chromium;
        if (mass46 != null) {
            UtilsKt.requireInRange(mass46, MIN_MASS, MAX_MASS_100, "chromium");
        }
        Mass mass47 = this.copper;
        if (mass47 != null) {
            UtilsKt.requireInRange(mass47, MIN_MASS, MAX_MASS_100, "copper");
        }
        Mass mass48 = this.dietaryFiber;
        if (mass48 != null) {
            UtilsKt.requireInRange(mass48, MIN_MASS, MAX_MASS_100K, "dietaryFiber");
        }
        Mass mass49 = this.folate;
        if (mass49 != null) {
            UtilsKt.requireInRange(mass49, MIN_MASS, MAX_MASS_100, "chloride");
        }
        Mass mass50 = this.folicAcid;
        if (mass50 != null) {
            UtilsKt.requireInRange(mass50, MIN_MASS, MAX_MASS_100, "folicAcid");
        }
        Mass mass51 = this.iodine;
        if (mass51 != null) {
            UtilsKt.requireInRange(mass51, MIN_MASS, MAX_MASS_100, "iodine");
        }
        Mass mass52 = this.iron;
        if (mass52 != null) {
            UtilsKt.requireInRange(mass52, MIN_MASS, MAX_MASS_100, "iron");
        }
        Mass mass53 = this.magnesium;
        if (mass53 != null) {
            UtilsKt.requireInRange(mass53, MIN_MASS, MAX_MASS_100, "magnesium");
        }
        Mass mass54 = this.manganese;
        if (mass54 != null) {
            UtilsKt.requireInRange(mass54, MIN_MASS, MAX_MASS_100, "manganese");
        }
        Mass mass55 = this.molybdenum;
        if (mass55 != null) {
            UtilsKt.requireInRange(mass55, MIN_MASS, MAX_MASS_100, "molybdenum");
        }
        if (mass16 != null) {
            UtilsKt.requireInRange(mass16, MIN_MASS, MAX_MASS_100K, "monounsaturatedFat");
        }
        if (mass17 != null) {
            UtilsKt.requireInRange(mass17, MIN_MASS, MAX_MASS_100, "niacin");
        }
        if (mass18 != null) {
            UtilsKt.requireInRange(mass18, MIN_MASS, MAX_MASS_100, "pantothenicAcid");
        }
        if (mass19 != null) {
            UtilsKt.requireInRange(mass19, MIN_MASS, MAX_MASS_100, "phosphorus");
        }
        if (mass20 != null) {
            UtilsKt.requireInRange(mass20, MIN_MASS, MAX_MASS_100K, "polyunsaturatedFat");
        }
        if (mass21 != null) {
            UtilsKt.requireInRange(mass21, MIN_MASS, MAX_MASS_100, "potassium");
        }
        if (mass22 != null) {
            UtilsKt.requireInRange(mass22, MIN_MASS, MAX_MASS_100K, "protein");
        }
        if (mass23 != null) {
            UtilsKt.requireInRange(mass23, MIN_MASS, MAX_MASS_100, "riboflavin");
        }
        if (mass24 != null) {
            UtilsKt.requireInRange(mass24, MIN_MASS, MAX_MASS_100K, "saturatedFat");
        }
        if (mass25 != null) {
            UtilsKt.requireInRange(mass25, MIN_MASS, MAX_MASS_100, "selenium");
        }
        if (mass26 != null) {
            UtilsKt.requireInRange(mass26, MIN_MASS, MAX_MASS_100, "sodium");
        }
        if (mass27 != null) {
            UtilsKt.requireInRange(mass27, MIN_MASS, MAX_MASS_100K, "sugar");
        }
        if (mass28 != null) {
            UtilsKt.requireInRange(mass28, MIN_MASS, MAX_MASS_100, "thiamin");
        }
        if (mass29 != null) {
            UtilsKt.requireInRange(mass29, MIN_MASS, MAX_MASS_100K, "totalCarbohydrate");
        }
        if (mass30 != null) {
            UtilsKt.requireInRange(mass30, MIN_MASS, MAX_MASS_100K, "totalFat");
        }
        if (mass31 != null) {
            UtilsKt.requireInRange(mass31, MIN_MASS, MAX_MASS_100K, "transFat");
        }
        if (mass32 != null) {
            UtilsKt.requireInRange(mass32, MIN_MASS, MAX_MASS_100K, "unsaturatedFat");
        }
        if (mass33 != null) {
            UtilsKt.requireInRange(mass33, MIN_MASS, MAX_MASS_100, "vitaminA");
        }
        if (mass34 != null) {
            UtilsKt.requireInRange(mass34, MIN_MASS, MAX_MASS_100, "vitaminB12");
        }
        if (mass35 != null) {
            UtilsKt.requireInRange(mass35, MIN_MASS, MAX_MASS_100, "vitaminB6");
        }
        if (mass36 != null) {
            UtilsKt.requireInRange(mass36, MIN_MASS, MAX_MASS_100, "vitaminC");
        }
        if (mass37 != null) {
            UtilsKt.requireInRange(mass37, MIN_MASS, MAX_MASS_100, "vitaminD");
        }
        if (mass38 != null) {
            UtilsKt.requireInRange(mass38, MIN_MASS, MAX_MASS_100, "vitaminE");
        }
        if (mass39 != null) {
            UtilsKt.requireInRange(mass39, MIN_MASS, MAX_MASS_100, "vitaminK");
        }
        if (mass40 != null) {
            UtilsKt.requireInRange(mass40, MIN_MASS, MAX_MASS_100, "zinc");
        }
    }

    public /* synthetic */ NutritionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, Mass mass, Mass mass2, Mass mass3, Energy energy, Energy energy2, Mass mass4, Mass mass5, Mass mass6, Mass mass7, Mass mass8, Mass mass9, Mass mass10, Mass mass11, Mass mass12, Mass mass13, Mass mass14, Mass mass15, Mass mass16, Mass mass17, Mass mass18, Mass mass19, Mass mass20, Mass mass21, Mass mass22, Mass mass23, Mass mass24, Mass mass25, Mass mass26, Mass mass27, Mass mass28, Mass mass29, Mass mass30, Mass mass31, Mass mass32, Mass mass33, Mass mass34, Mass mass35, Mass mass36, Mass mass37, Mass mass38, Mass mass39, Mass mass40, String str, int i, int i2, int i3, zcm zcmVar) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, (i2 & 32) != 0 ? null : mass, (i2 & 64) != 0 ? null : mass2, (i2 & 128) != 0 ? null : mass3, (i2 & 256) != 0 ? null : energy, (i2 & 512) != 0 ? null : energy2, (i2 & 1024) != 0 ? null : mass4, (i2 & 2048) != 0 ? null : mass5, (i2 & 4096) != 0 ? null : mass6, (i2 & 8192) != 0 ? null : mass7, (i2 & 16384) != 0 ? null : mass8, (i2 & 32768) != 0 ? null : mass9, (i2 & 65536) != 0 ? null : mass10, (131072 & i2) != 0 ? null : mass11, (262144 & i2) != 0 ? null : mass12, (524288 & i2) != 0 ? null : mass13, (1048576 & i2) != 0 ? null : mass14, (2097152 & i2) != 0 ? null : mass15, (4194304 & i2) != 0 ? null : mass16, (8388608 & i2) != 0 ? null : mass17, (16777216 & i2) != 0 ? null : mass18, (33554432 & i2) != 0 ? null : mass19, (67108864 & i2) != 0 ? null : mass20, (134217728 & i2) != 0 ? null : mass21, (268435456 & i2) != 0 ? null : mass22, (536870912 & i2) != 0 ? null : mass23, (1073741824 & i2) != 0 ? null : mass24, (i2 & Integer.MIN_VALUE) != 0 ? null : mass25, (i3 & 1) != 0 ? null : mass26, (i3 & 2) != 0 ? null : mass27, (i3 & 4) != 0 ? null : mass28, (i3 & 8) != 0 ? null : mass29, (i3 & 16) != 0 ? null : mass30, (i3 & 32) != 0 ? null : mass31, (i3 & 64) != 0 ? null : mass32, (i3 & 128) != 0 ? null : mass33, (i3 & 256) != 0 ? null : mass34, (i3 & 512) != 0 ? null : mass35, (i3 & 1024) != 0 ? null : mass36, (i3 & 2048) != 0 ? null : mass37, (i3 & 4096) != 0 ? null : mass38, (i3 & 8192) != 0 ? null : mass39, (i3 & 16384) != 0 ? null : mass40, (i3 & 32768) != 0 ? null : str, (i3 & 65536) != 0 ? 0 : i);
    }

    @Override // androidx.health.connect.client.records.IntervalRecord
    public Instant getStartTime() {
        return this.startTime;
    }

    @Override // androidx.health.connect.client.records.IntervalRecord
    public ZoneOffset getStartZoneOffset() {
        return this.startZoneOffset;
    }

    @Override // androidx.health.connect.client.records.IntervalRecord
    public Instant getEndTime() {
        return this.endTime;
    }

    @Override // androidx.health.connect.client.records.IntervalRecord
    public ZoneOffset getEndZoneOffset() {
        return this.endZoneOffset;
    }

    @Override // androidx.health.connect.client.records.Record
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public final Mass getBiotin() {
        return this.biotin;
    }

    public final Mass getCaffeine() {
        return this.caffeine;
    }

    public final Mass getCalcium() {
        return this.calcium;
    }

    public final Energy getEnergy() {
        return this.energy;
    }

    public final Energy getEnergyFromFat() {
        return this.energyFromFat;
    }

    public final Mass getChloride() {
        return this.chloride;
    }

    public final Mass getCholesterol() {
        return this.cholesterol;
    }

    public final Mass getChromium() {
        return this.chromium;
    }

    public final Mass getCopper() {
        return this.copper;
    }

    public final Mass getDietaryFiber() {
        return this.dietaryFiber;
    }

    public final Mass getFolate() {
        return this.folate;
    }

    public final Mass getFolicAcid() {
        return this.folicAcid;
    }

    public final Mass getIodine() {
        return this.iodine;
    }

    public final Mass getIron() {
        return this.iron;
    }

    public final Mass getMagnesium() {
        return this.magnesium;
    }

    public final Mass getManganese() {
        return this.manganese;
    }

    public final Mass getMolybdenum() {
        return this.molybdenum;
    }

    public final Mass getMonounsaturatedFat() {
        return this.monounsaturatedFat;
    }

    public final Mass getNiacin() {
        return this.niacin;
    }

    public final Mass getPantothenicAcid() {
        return this.pantothenicAcid;
    }

    public final Mass getPhosphorus() {
        return this.phosphorus;
    }

    public final Mass getPolyunsaturatedFat() {
        return this.polyunsaturatedFat;
    }

    public final Mass getPotassium() {
        return this.potassium;
    }

    public final Mass getProtein() {
        return this.protein;
    }

    public final Mass getRiboflavin() {
        return this.riboflavin;
    }

    public final Mass getSaturatedFat() {
        return this.saturatedFat;
    }

    public final Mass getSelenium() {
        return this.selenium;
    }

    public final Mass getSodium() {
        return this.sodium;
    }

    public final Mass getSugar() {
        return this.sugar;
    }

    public final Mass getThiamin() {
        return this.thiamin;
    }

    public final Mass getTotalCarbohydrate() {
        return this.totalCarbohydrate;
    }

    public final Mass getTotalFat() {
        return this.totalFat;
    }

    public final Mass getTransFat() {
        return this.transFat;
    }

    public final Mass getUnsaturatedFat() {
        return this.unsaturatedFat;
    }

    public final Mass getVitaminA() {
        return this.vitaminA;
    }

    public final Mass getVitaminB12() {
        return this.vitaminB12;
    }

    public final Mass getVitaminB6() {
        return this.vitaminB6;
    }

    public final Mass getVitaminC() {
        return this.vitaminC;
    }

    public final Mass getVitaminD() {
        return this.vitaminD;
    }

    public final Mass getVitaminE() {
        return this.vitaminE;
    }

    public final Mass getVitaminK() {
        return this.vitaminK;
    }

    public final Mass getZinc() {
        return this.zinc;
    }

    public final String getName() {
        return this.name;
    }

    public final int getMealType() {
        return this.mealType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NutritionRecord)) {
            return false;
        }
        NutritionRecord nutritionRecord = (NutritionRecord) other;
        return zcp.b(this.biotin, nutritionRecord.biotin) && zcp.b(this.caffeine, nutritionRecord.caffeine) && zcp.b(this.calcium, nutritionRecord.calcium) && zcp.b(this.energy, nutritionRecord.energy) && zcp.b(this.energyFromFat, nutritionRecord.energyFromFat) && zcp.b(this.chloride, nutritionRecord.chloride) && zcp.b(this.cholesterol, nutritionRecord.cholesterol) && zcp.b(this.chromium, nutritionRecord.chromium) && zcp.b(this.copper, nutritionRecord.copper) && zcp.b(this.dietaryFiber, nutritionRecord.dietaryFiber) && zcp.b(this.folate, nutritionRecord.folate) && zcp.b(this.folicAcid, nutritionRecord.folicAcid) && zcp.b(this.iodine, nutritionRecord.iodine) && zcp.b(this.iron, nutritionRecord.iron) && zcp.b(this.magnesium, nutritionRecord.magnesium) && zcp.b(this.manganese, nutritionRecord.manganese) && zcp.b(this.molybdenum, nutritionRecord.molybdenum) && zcp.b(this.monounsaturatedFat, nutritionRecord.monounsaturatedFat) && zcp.b(this.niacin, nutritionRecord.niacin) && zcp.b(this.pantothenicAcid, nutritionRecord.pantothenicAcid) && zcp.b(this.phosphorus, nutritionRecord.phosphorus) && zcp.b(this.polyunsaturatedFat, nutritionRecord.polyunsaturatedFat) && zcp.b(this.potassium, nutritionRecord.potassium) && zcp.b(this.protein, nutritionRecord.protein) && zcp.b(this.riboflavin, nutritionRecord.riboflavin) && zcp.b(this.saturatedFat, nutritionRecord.saturatedFat) && zcp.b(this.selenium, nutritionRecord.selenium) && zcp.b(this.sodium, nutritionRecord.sodium) && zcp.b(this.sugar, nutritionRecord.sugar) && zcp.b(this.thiamin, nutritionRecord.thiamin) && zcp.b(this.totalCarbohydrate, nutritionRecord.totalCarbohydrate) && zcp.b(this.totalFat, nutritionRecord.totalFat) && zcp.b(this.transFat, nutritionRecord.transFat) && zcp.b(this.unsaturatedFat, nutritionRecord.unsaturatedFat) && zcp.b(this.vitaminA, nutritionRecord.vitaminA) && zcp.b(this.vitaminB12, nutritionRecord.vitaminB12) && zcp.b(this.vitaminB6, nutritionRecord.vitaminB6) && zcp.b(this.vitaminC, nutritionRecord.vitaminC) && zcp.b(this.vitaminD, nutritionRecord.vitaminD) && zcp.b(this.vitaminE, nutritionRecord.vitaminE) && zcp.b(this.vitaminK, nutritionRecord.vitaminK) && zcp.b(this.zinc, nutritionRecord.zinc) && zcp.b((Object) this.name, (Object) nutritionRecord.name) && this.mealType == nutritionRecord.mealType && zcp.b(getStartTime(), nutritionRecord.getStartTime()) && zcp.b(getStartZoneOffset(), nutritionRecord.getStartZoneOffset()) && zcp.b(getEndTime(), nutritionRecord.getEndTime()) && zcp.b(getEndZoneOffset(), nutritionRecord.getEndZoneOffset()) && zcp.b(getMetadata(), nutritionRecord.getMetadata());
    }

    public int hashCode() {
        Mass mass = this.biotin;
        int iHashCode = mass != null ? mass.hashCode() : 0;
        Mass mass2 = this.caffeine;
        int iHashCode2 = mass2 != null ? mass2.hashCode() : 0;
        Mass mass3 = this.calcium;
        int iHashCode3 = mass3 != null ? mass3.hashCode() : 0;
        Energy energy = this.energy;
        int iHashCode4 = energy != null ? energy.hashCode() : 0;
        Energy energy2 = this.energyFromFat;
        int iHashCode5 = energy2 != null ? energy2.hashCode() : 0;
        Mass mass4 = this.chloride;
        int iHashCode6 = mass4 != null ? mass4.hashCode() : 0;
        Mass mass5 = this.cholesterol;
        int iHashCode7 = mass5 != null ? mass5.hashCode() : 0;
        Mass mass6 = this.chromium;
        int iHashCode8 = mass6 != null ? mass6.hashCode() : 0;
        Mass mass7 = this.copper;
        int iHashCode9 = mass7 != null ? mass7.hashCode() : 0;
        Mass mass8 = this.dietaryFiber;
        int iHashCode10 = mass8 != null ? mass8.hashCode() : 0;
        Mass mass9 = this.folate;
        int iHashCode11 = mass9 != null ? mass9.hashCode() : 0;
        Mass mass10 = this.folicAcid;
        int iHashCode12 = mass10 != null ? mass10.hashCode() : 0;
        Mass mass11 = this.iodine;
        int iHashCode13 = mass11 != null ? mass11.hashCode() : 0;
        Mass mass12 = this.iron;
        int iHashCode14 = mass12 != null ? mass12.hashCode() : 0;
        Mass mass13 = this.magnesium;
        int iHashCode15 = mass13 != null ? mass13.hashCode() : 0;
        Mass mass14 = this.manganese;
        int iHashCode16 = mass14 != null ? mass14.hashCode() : 0;
        Mass mass15 = this.molybdenum;
        int iHashCode17 = mass15 != null ? mass15.hashCode() : 0;
        Mass mass16 = this.monounsaturatedFat;
        int iHashCode18 = mass16 != null ? mass16.hashCode() : 0;
        Mass mass17 = this.niacin;
        int iHashCode19 = mass17 != null ? mass17.hashCode() : 0;
        Mass mass18 = this.pantothenicAcid;
        int iHashCode20 = mass18 != null ? mass18.hashCode() : 0;
        Mass mass19 = this.phosphorus;
        int iHashCode21 = mass19 != null ? mass19.hashCode() : 0;
        Mass mass20 = this.polyunsaturatedFat;
        int iHashCode22 = mass20 != null ? mass20.hashCode() : 0;
        Mass mass21 = this.potassium;
        int iHashCode23 = mass21 != null ? mass21.hashCode() : 0;
        Mass mass22 = this.protein;
        int iHashCode24 = mass22 != null ? mass22.hashCode() : 0;
        Mass mass23 = this.riboflavin;
        int iHashCode25 = mass23 != null ? mass23.hashCode() : 0;
        Mass mass24 = this.saturatedFat;
        int iHashCode26 = mass24 != null ? mass24.hashCode() : 0;
        Mass mass25 = this.selenium;
        int iHashCode27 = mass25 != null ? mass25.hashCode() : 0;
        Mass mass26 = this.sodium;
        int iHashCode28 = mass26 != null ? mass26.hashCode() : 0;
        Mass mass27 = this.sugar;
        int iHashCode29 = mass27 != null ? mass27.hashCode() : 0;
        Mass mass28 = this.thiamin;
        int iHashCode30 = mass28 != null ? mass28.hashCode() : 0;
        Mass mass29 = this.totalCarbohydrate;
        int iHashCode31 = mass29 != null ? mass29.hashCode() : 0;
        Mass mass30 = this.totalFat;
        int iHashCode32 = mass30 != null ? mass30.hashCode() : 0;
        Mass mass31 = this.transFat;
        int iHashCode33 = mass31 != null ? mass31.hashCode() : 0;
        Mass mass32 = this.unsaturatedFat;
        int iHashCode34 = mass32 != null ? mass32.hashCode() : 0;
        Mass mass33 = this.vitaminA;
        int iHashCode35 = mass33 != null ? mass33.hashCode() : 0;
        Mass mass34 = this.vitaminB12;
        int iHashCode36 = mass34 != null ? mass34.hashCode() : 0;
        Mass mass35 = this.vitaminB6;
        int iHashCode37 = mass35 != null ? mass35.hashCode() : 0;
        Mass mass36 = this.vitaminC;
        int iHashCode38 = mass36 != null ? mass36.hashCode() : 0;
        Mass mass37 = this.vitaminD;
        int iHashCode39 = mass37 != null ? mass37.hashCode() : 0;
        Mass mass38 = this.vitaminE;
        int iHashCode40 = mass38 != null ? mass38.hashCode() : 0;
        Mass mass39 = this.vitaminK;
        int iHashCode41 = mass39 != null ? mass39.hashCode() : 0;
        Mass mass40 = this.zinc;
        int iHashCode42 = mass40 != null ? mass40.hashCode() : 0;
        String str = this.name;
        int iHashCode43 = str != null ? str.hashCode() : 0;
        int i = this.mealType;
        int iHashCode44 = getStartTime().hashCode();
        ZoneOffset startZoneOffset = getStartZoneOffset();
        int iHashCode45 = startZoneOffset != null ? startZoneOffset.hashCode() : 0;
        int iHashCode46 = getEndTime().hashCode();
        ZoneOffset endZoneOffset = getEndZoneOffset();
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + i) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + (endZoneOffset != null ? endZoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "NutritionRecord(startTime=" + getStartTime() + ", startZoneOffset=" + getStartZoneOffset() + ", endTime=" + getEndTime() + ", endZoneOffset=" + getEndZoneOffset() + ", biotin=" + this.biotin + ", caffeine=" + this.caffeine + ", calcium=" + this.calcium + ", energy=" + this.energy + ", energyFromFat=" + this.energyFromFat + ", chloride=" + this.chloride + ", cholesterol=" + this.cholesterol + ", chromium=" + this.chromium + ", copper=" + this.copper + ", dietaryFiber=" + this.dietaryFiber + ", folate=" + this.folate + ", folicAcid=" + this.folicAcid + ", iodine=" + this.iodine + ", iron=" + this.iron + ", magnesium=" + this.magnesium + ", manganese=" + this.manganese + ", molybdenum=" + this.molybdenum + ", monounsaturatedFat=" + this.monounsaturatedFat + ", niacin=" + this.niacin + ", pantothenicAcid=" + this.pantothenicAcid + ", phosphorus=" + this.phosphorus + ", polyunsaturatedFat=" + this.polyunsaturatedFat + ", potassium=" + this.potassium + ", protein=" + this.protein + ", riboflavin=" + this.riboflavin + ", saturatedFat=" + this.saturatedFat + ", selenium=" + this.selenium + ", sodium=" + this.sodium + ", sugar=" + this.sugar + ", thiamin=" + this.thiamin + ", totalCarbohydrate=" + this.totalCarbohydrate + ", totalFat=" + this.totalFat + ", transFat=" + this.transFat + ", unsaturatedFat=" + this.unsaturatedFat + ", vitaminA=" + this.vitaminA + ", vitaminB12=" + this.vitaminB12 + ", vitaminB6=" + this.vitaminB6 + ", vitaminC=" + this.vitaminC + ", vitaminD=" + this.vitaminD + ", vitaminE=" + this.vitaminE + ", vitaminK=" + this.vitaminK + ", zinc=" + this.zinc + ", name=" + this.name + ", mealType=" + this.mealType + ", metadata=" + getMetadata() + g4.l;
    }
}
