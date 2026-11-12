package com.huami.watch.companion.ecg.util;

import androidx.annotation.StringRes;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.ecg.core.model.constant.EcgTagKeys;
import com.huami.ecg.core.model.constant.MeasureStateValue;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.transdata.transport.DataTransHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SPORT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\n\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, d2 = {"Lcom/huami/watch/companion/ecg/util/EcgTagEnum;", "", "", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "type", "getType", "", "nameRes", LogUtil.I, "getNameRes", "()I", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "Companion", DataTransHelper.TYPE_SPORT, "SMOKING", MeasureStateValue.BEFORE_EXERCISE, MeasureStateValue.AFTER_EXERCISE, MeasureStateValue.POOR_SLEEP, "COLD_FEVER", MeasureStateValue.CHEST_PAIN, MeasureStateValue.CHEST_TIGHTNESS, MeasureStateValue.FLUSTERED, "FEEL_SUFFOCATED", MeasureStateValue.DIZZINESS, MeasureStateValue.HEADACHE, "FATIGUTE", MeasureStateValue.OTHER, MeasureStateValue.ANXIETY, MeasureStateValue.ANGER, MeasureStateValue.FINE, MeasureStateValue.CALM, MeasureStateValue.CHEERFUL, MeasureStateValue.DEPRESSED, MeasureStateValue.EXCITEMENT, "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgTagEnum {
    private static final /* synthetic */ EcgTagEnum[] $VALUES;
    public static final EcgTagEnum AFTER_EXERCISE;
    public static final EcgTagEnum ANGER;
    public static final EcgTagEnum ANXIETY;
    public static final EcgTagEnum BEFORE_EXERCISE;
    public static final EcgTagEnum CALM;
    public static final EcgTagEnum CHEERFUL;
    public static final EcgTagEnum CHEST_PAIN;
    public static final EcgTagEnum CHEST_TIGHTNESS;
    public static final EcgTagEnum COLD_FEVER;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final EcgTagEnum DEPRESSED;
    public static final EcgTagEnum DIZZINESS;
    public static final EcgTagEnum EXCITEMENT;
    public static final EcgTagEnum FATIGUTE;
    public static final EcgTagEnum FEEL_SUFFOCATED;
    public static final EcgTagEnum FINE;
    public static final EcgTagEnum FLUSTERED;
    public static final EcgTagEnum HEADACHE;
    public static final EcgTagEnum OTHER;
    public static final EcgTagEnum POOR_SLEEP;
    public static final EcgTagEnum SMOKING;
    public static final EcgTagEnum SPORT;

    @NotNull
    private static final List<EcgTagEnum> bodyTagList;

    @NotNull
    private static final List<EcgTagEnum> emotionTagList;

    @NotNull
    private static final List<EcgTagEnum> sceneTagList;

    @NotNull
    private final String key;
    private final int nameRes;

    @NotNull
    private final String type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/huami/watch/companion/ecg/util/EcgTagEnum$Companion;", "", "", "key", "Lcom/huami/watch/companion/ecg/util/EcgTagEnum;", "keyOf", "", "sceneTagList", "Ljava/util/List;", "getSceneTagList", "()Ljava/util/List;", "bodyTagList", "getBodyTagList", "emotionTagList", "getEmotionTagList", "<init>", "()V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<EcgTagEnum> getBodyTagList() {
            return EcgTagEnum.bodyTagList;
        }

        @NotNull
        public final List<EcgTagEnum> getEmotionTagList() {
            return EcgTagEnum.emotionTagList;
        }

        @NotNull
        public final List<EcgTagEnum> getSceneTagList() {
            return EcgTagEnum.sceneTagList;
        }

        @Nullable
        public final EcgTagEnum keyOf(@NotNull String key) {
            EcgTagEnum[] ecgTagEnumArrValues = EcgTagEnum.values();
            int length = ecgTagEnumArrValues.length;
            int i = 0;
            while (i < length) {
                EcgTagEnum ecgTagEnum = ecgTagEnumArrValues[i];
                i++;
                if (Intrinsics.areEqual(ecgTagEnum.getKey(), key)) {
                    return ecgTagEnum;
                }
            }
            return null;
        }
    }

    static {
        String key = EcgTagKeys.TAG_SPORT.getKey();
        EcgTagKeys ecgTagKeys = EcgTagKeys.CATEGORY_SCENE;
        SPORT = new EcgTagEnum(DataTransHelper.TYPE_SPORT, 0, key, ecgTagKeys.getKey(), R.string.ecg_tag_sport);
        SMOKING = new EcgTagEnum("SMOKING", 1, EcgTagKeys.TAG_SMOKING.getKey(), ecgTagKeys.getKey(), R.string.ecg_tag_smoking);
        BEFORE_EXERCISE = new EcgTagEnum(MeasureStateValue.BEFORE_EXERCISE, 2, EcgTagKeys.TAG_DRINK.getKey(), ecgTagKeys.getKey(), R.string.ecg_tag_drink);
        AFTER_EXERCISE = new EcgTagEnum(MeasureStateValue.AFTER_EXERCISE, 3, EcgTagKeys.TAG_COFFEE.getKey(), ecgTagKeys.getKey(), R.string.ecg_tag_coffee);
        String key2 = EcgTagKeys.TAG_POOR_SLEEP.getKey();
        EcgTagKeys ecgTagKeys2 = EcgTagKeys.CATEGORY_BODY;
        POOR_SLEEP = new EcgTagEnum(MeasureStateValue.POOR_SLEEP, 4, key2, ecgTagKeys2.getKey(), R.string.ecg_tag_poor_sleep);
        COLD_FEVER = new EcgTagEnum("COLD_FEVER", 5, EcgTagKeys.TAG_COLD_FEVER.getKey(), ecgTagKeys2.getKey(), R.string.ecg_tag_head_cold);
        CHEST_PAIN = new EcgTagEnum(MeasureStateValue.CHEST_PAIN, 6, EcgTagKeys.TAG_CHEST_PAIN.getKey(), ecgTagKeys2.getKey(), R.string.ecg_tag_chest_pain);
        CHEST_TIGHTNESS = new EcgTagEnum(MeasureStateValue.CHEST_TIGHTNESS, 7, EcgTagKeys.TAG_CHEST_TIGHTNESS.getKey(), ecgTagKeys2.getKey(), R.string.ecg_tag_chest_tightness);
        FLUSTERED = new EcgTagEnum(MeasureStateValue.FLUSTERED, 8, EcgTagKeys.TAG_FLUSTERED.getKey(), ecgTagKeys2.getKey(), R.string.ecg_tag_flustered);
        FEEL_SUFFOCATED = new EcgTagEnum("FEEL_SUFFOCATED", 9, EcgTagKeys.TAG_FEEL_SUFFOCATED.getKey(), ecgTagKeys2.getKey(), R.string.ecg_tag_feel_suffocated);
        DIZZINESS = new EcgTagEnum(MeasureStateValue.DIZZINESS, 10, EcgTagKeys.TAG_DIZZINESS.getKey(), ecgTagKeys2.getKey(), R.string.ecg_tag_dizziness);
        HEADACHE = new EcgTagEnum(MeasureStateValue.HEADACHE, 11, EcgTagKeys.TAG_HEADACHE.getKey(), ecgTagKeys2.getKey(), R.string.ecg_tag_headache);
        FATIGUTE = new EcgTagEnum("FATIGUTE", 12, EcgTagKeys.TAG_FATIGUTE.getKey(), ecgTagKeys2.getKey(), R.string.ecg_tag_fatigue);
        OTHER = new EcgTagEnum(MeasureStateValue.OTHER, 13, EcgTagKeys.TAG_OTHER.getKey(), ecgTagKeys2.getKey(), R.string.ecg_tag_other);
        String key3 = EcgTagKeys.TAG_ANXIETY.getKey();
        EcgTagKeys ecgTagKeys3 = EcgTagKeys.CATEGORY_EMOTION;
        ANXIETY = new EcgTagEnum(MeasureStateValue.ANXIETY, 14, key3, ecgTagKeys3.getKey(), R.string.ecg_tag_anxiety);
        ANGER = new EcgTagEnum(MeasureStateValue.ANGER, 15, EcgTagKeys.TAG_ANGER.getKey(), ecgTagKeys3.getKey(), R.string.ecg_tag_anger);
        FINE = new EcgTagEnum(MeasureStateValue.FINE, 16, EcgTagKeys.TAG_FINE.getKey(), ecgTagKeys3.getKey(), R.string.ecg_tag_fine);
        CALM = new EcgTagEnum(MeasureStateValue.CALM, 17, EcgTagKeys.TAG_CALM.getKey(), ecgTagKeys3.getKey(), R.string.ecg_tag_calm);
        CHEERFUL = new EcgTagEnum(MeasureStateValue.CHEERFUL, 18, EcgTagKeys.TAG_CHEERFUL.getKey(), ecgTagKeys3.getKey(), R.string.ecg_tag_cheerful);
        DEPRESSED = new EcgTagEnum(MeasureStateValue.DEPRESSED, 19, EcgTagKeys.TAG_DEPRESSED.getKey(), ecgTagKeys3.getKey(), R.string.ecg_tag_depressed);
        EXCITEMENT = new EcgTagEnum(MeasureStateValue.EXCITEMENT, 20, EcgTagKeys.TAG_EXCITEMENT.getKey(), ecgTagKeys3.getKey(), R.string.ecg_tag_excitement);
        $VALUES = a();
        INSTANCE = new Companion(null);
        EcgTagEnum[] ecgTagEnumArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (EcgTagEnum ecgTagEnum : ecgTagEnumArrValues) {
            if (Intrinsics.areEqual(ecgTagEnum.getType(), EcgTagKeys.CATEGORY_SCENE.getKey())) {
                arrayList.add(ecgTagEnum);
            }
        }
        sceneTagList = arrayList;
        EcgTagEnum[] ecgTagEnumArrValues2 = values();
        ArrayList arrayList2 = new ArrayList();
        for (EcgTagEnum ecgTagEnum2 : ecgTagEnumArrValues2) {
            if (Intrinsics.areEqual(ecgTagEnum2.getType(), EcgTagKeys.CATEGORY_BODY.getKey())) {
                arrayList2.add(ecgTagEnum2);
            }
        }
        bodyTagList = arrayList2;
        EcgTagEnum[] ecgTagEnumArrValues3 = values();
        ArrayList arrayList3 = new ArrayList();
        for (EcgTagEnum ecgTagEnum3 : ecgTagEnumArrValues3) {
            if (Intrinsics.areEqual(ecgTagEnum3.getType(), EcgTagKeys.CATEGORY_EMOTION.getKey())) {
                arrayList3.add(ecgTagEnum3);
            }
        }
        emotionTagList = arrayList3;
    }

    private EcgTagEnum(String str, int i, @StringRes String str2, String str3, int i2) {
        super(str, i);
        this.key = str2;
        this.type = str3;
        this.nameRes = i2;
    }

    private static final /* synthetic */ EcgTagEnum[] a() {
        return new EcgTagEnum[]{SPORT, SMOKING, BEFORE_EXERCISE, AFTER_EXERCISE, POOR_SLEEP, COLD_FEVER, CHEST_PAIN, CHEST_TIGHTNESS, FLUSTERED, FEEL_SUFFOCATED, DIZZINESS, HEADACHE, FATIGUTE, OTHER, ANXIETY, ANGER, FINE, CALM, CHEERFUL, DEPRESSED, EXCITEMENT};
    }

    public static EcgTagEnum valueOf(String str) {
        return (EcgTagEnum) Enum.valueOf(EcgTagEnum.class, str);
    }

    public static EcgTagEnum[] values() {
        return (EcgTagEnum[]) $VALUES.clone();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getNameRes() {
        return this.nameRes;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
