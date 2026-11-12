package com.huami.sleep.daysleep.quotient.processor;

import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.sleepintrodetail.vo.OdiEntryShowType;
import com.huami.sleep.sleepintrodetail.vo.SleepBreathQualityEntryVo;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\b\u001a\u00020\u00072\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001e\u0010\t\u001a\u00020\u00072\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J$\u0010\n\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005J$\u0010\u000b\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005J-\u0010\f\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/sleep/daysleep/quotient/processor/BreathQualityProcessor;", "", "Lkotlin/Pair;", "", "odiScoreAndCost", "", "isStatistics", "Lcom/huami/sleep/sleepintrodetail/vo/SleepBreathQualityEntryVo;", "b", "a", "needHidden", "needDetection", "getVerifyScore", "(Lkotlin/Pair;Z)Ljava/lang/Integer;", "", "Ljava/lang/String;", "TAG", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityProcessor {

    @NotNull
    public static final BreathQualityProcessor INSTANCE = new BreathQualityProcessor();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "BreathQualityProcessor";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"Lkotlin/Pair;", "", "Lcom/huami/sleep/sleepintrodetail/vo/OdiEntryShowType;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Pair<? extends Integer, ? extends OdiEntryShowType>> {
        public final /* synthetic */ Pair<Integer, Integer> a;

        /* JADX INFO: renamed from: com.huami.sleep.daysleep.quotient.processor.BreathQualityProcessor$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0575a extends Lambda implements Function0<String> {
            public final /* synthetic */ Pair<Integer, Integer> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0575a(Pair<Integer, Integer> pair) {
                super(0);
                this.a = pair;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Day breath quality score is not null : " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Current device not support osa , do not need show.";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public static final c a = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Current device support osa but not enable.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Pair<Integer, Integer> pair) {
            super(0);
            this.a = pair;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<Integer, OdiEntryShowType> invoke() {
            Pair<Integer, Integer> pair = this.a;
            Integer second = null;
            if (!(pair != null && pair.getFirst().intValue() >= 0)) {
                if (!KoinExtKt.getAppFunctions().supportOsa()) {
                    HMLog.info(BreathQualityProcessor.TAG, b.a);
                    return new Pair<>(null, OdiEntryShowType.GONE);
                }
                if (KoinExtKt.getAppFunctions().isOsaEnable()) {
                    return new Pair<>(null, OdiEntryShowType.SHOW_SCORE);
                }
                HMLog.info(BreathQualityProcessor.TAG, c.a);
                return new Pair<>(null, OdiEntryShowType.SHOW_OPEN_SWITCH_TIP);
            }
            HMLog.info(BreathQualityProcessor.TAG, new C0575a(this.a));
            Pair<Integer, Integer> pair2 = this.a;
            if (pair2 != null) {
                if (pair2.getSecond().intValue() == 6) {
                    pair2 = null;
                }
                if (pair2 != null) {
                    second = pair2.getSecond();
                }
            }
            return new Pair<>(second, OdiEntryShowType.SHOW_SCORE);
        }
    }

    private BreathQualityProcessor() {
    }

    private final SleepBreathQualityEntryVo a(Pair<Integer, Integer> odiScoreAndCost) {
        Pair<? extends Integer, ? extends OdiEntryShowType> pairInvoke = new a(odiScoreAndCost).invoke();
        return new SleepBreathQualityEntryVo(pairInvoke.getSecond(), "", pairInvoke.getFirst());
    }

    private final SleepBreathQualityEntryVo b(Pair<Integer, Integer> odiScoreAndCost, boolean isStatistics) {
        return !isStatistics ? a(odiScoreAndCost) : new SleepBreathQualityEntryVo(OdiEntryShowType.SHOW_SCORE, "", null);
    }

    @Nullable
    public final Integer getVerifyScore(@Nullable Pair<Integer, Integer> odiScoreAndCost, boolean isStatistics) {
        if (isStatistics) {
            return null;
        }
        return a(odiScoreAndCost).getOdiScore();
    }

    public final boolean needDetection(@Nullable Pair<Integer, Integer> odiScoreAndCost, boolean isStatistics) {
        return b(odiScoreAndCost, isStatistics).getShowType() == OdiEntryShowType.SHOW_OPEN_SWITCH_TIP;
    }

    public final boolean needHidden(@Nullable Pair<Integer, Integer> odiScoreAndCost, boolean isStatistics) {
        return b(odiScoreAndCost, isStatistics).getShowType() == OdiEntryShowType.GONE;
    }
}
