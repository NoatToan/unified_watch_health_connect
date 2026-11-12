package com.huami.sleep.daysleep.model;

import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.daydetail.repo.IHeartRateRepo;
import com.huami.sleep.daysleep.model.SleepPosInfo;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.koin.ScopesKt;
import com.huami.sleep.view.SleepPosCircleView;
import com.loc.z;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b0\u0018\u0000 72\u00020\u0001:\u000278B\u0007¢\u0006\u0004\b5\u00106R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\"\u0010\u001c\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\"\u0010 \u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\"\u0010$\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u000b\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010\u000fR\"\u0010(\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u000b\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u000fR\"\u0010,\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u000b\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010\u000fR\"\u00100\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u000b\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010\u000fR\"\u00104\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u000b\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010\u000f¨\u00069"}, d2 = {"Lcom/huami/sleep/daysleep/model/SleepPosInfo;", "", "", "Lcom/huami/sleep/view/SleepPosCircleView$Item;", "a", "Ljava/util/List;", "getChartItems", "()Ljava/util/List;", "chartItems", "", "b", LogUtil.I, "getIcon", "()I", "setIcon", "(I)V", "icon", "c", "getMostPosName", "setMostPosName", "mostPosName", GoogleApiAvailabilityLight.a, "getMostPosTitle", "setMostPosTitle", "mostPosTitle", "e", "getMostPosTip", "setMostPosTip", "mostPosTip", "f", "getMostPosPercent", "setMostPosPercent", "mostPosPercent", "g", "getAvgHr", "setAvgHr", "avgHr", "h", "getLeftPercent", "setLeftPercent", "leftPercent", "i", "getRightPercent", "setRightPercent", "rightPercent", z.j, "getBackPercent", "setBackPercent", "backPercent", hl.k, "getStomachPercent", "setStomachPercent", "stomachPercent", "<init>", "()V", "Companion", "PosItem", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepPosInfo {
    private static final int l = 0;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<SleepPosCircleView.Item> chartItems = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mostPosName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mostPosTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mostPosTip;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int mostPosPercent;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int avgHr;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int leftPercent;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int rightPercent;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int backPercent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int stomachPercent;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final IHeartRateRepo p = ScopesKt.heartRateRepo(GlobalContext.INSTANCE.get());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J(\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0010H\u0002J&\u0010\u0013\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bR\u0019\u0010\u0015\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a¨\u0006 "}, d2 = {"Lcom/huami/sleep/daysleep/model/SleepPosInfo$Companion;", "", "Lcom/huami/sleep/daysleep/model/SleepPosInfo;", "result", "", "maxIndex", "", "e", "", "userId", "", "isBand", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "date", "c", "Ljava/util/Date;", GoogleApiAvailabilityLight.a, "isMili", "from", "Lcom/huami/sleep/daysleep/daydetail/repo/IHeartRateRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/sleep/daysleep/daydetail/repo/IHeartRateRepo;", "getRepo", "()Lcom/huami/sleep/daysleep/daydetail/repo/IHeartRateRepo;", "BACK_INDEX", LogUtil.I, "LEFT_INDEX", "RIGHT_INDEX", "STOMACH_INDEX", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int b(PosItem posItem, PosItem posItem2) {
            return posItem.getValue() == posItem2.getValue() ? posItem2.getIndex() - posItem.getIndex() : posItem.getValue() - posItem2.getValue();
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00df  */
        private final int c(String userId, boolean isBand, SleepInfo sleepInfo, String date) {
            boolean z;
            Collection list;
            if (!sleepInfo.getHasSleep()) {
                return 0;
            }
            ArrayList arrayList = new ArrayList();
            SportDay sportDayFromString = SportDay.fromString(date);
            for (SportDay sportDay : CollectionsKt__CollectionsKt.listOf((Object[]) new SportDay[]{sportDayFromString.addDay(-1), sportDayFromString})) {
                IHeartRateRepo repo = SleepPosInfo.INSTANCE.getRepo();
                String key = sportDay.getKey();
                if (isBand) {
                    List<Byte> list2 = ArraysKt___ArraysKt.toList(repo.queryMiliDateHr(userId, key));
                    list = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        list.add(Integer.valueOf((byte) (((Number) it2.next()).byteValue() & (-1))));
                    }
                } else {
                    list = CollectionsKt___CollectionsKt.toList(repo.queryEarbudDateHr(userId, key));
                }
                arrayList.addAll(list);
            }
            int iD = d(sleepInfo.getStartDate());
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(sleepInfo.getStartDate());
            if (new SportDay(calendar).offsetDay(sportDayFromString) == 0) {
                iD += 1440;
            }
            int iD2 = d(sleepInfo.getStopDate()) + 1440;
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                int iIntValue = ((Number) obj).intValue();
                if (!(iD <= i && i <= iD2)) {
                    z = false;
                } else if (30 <= iIntValue && iIntValue <= 240) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2.add(obj);
                }
                i = i2;
            }
            return (int) CollectionsKt___CollectionsKt.averageOfInt(arrayList2);
        }

        private final int d(Date date) {
            Calendar calendar = Calendar.getInstance();
            calendar.clear();
            calendar.setTime(date);
            return (calendar.get(11) * 60) + calendar.get(12);
        }

        private final void e(SleepPosInfo result, int maxIndex) {
            int gender = KoinExtKt.getAccountInfo().getGender();
            if (maxIndex == 0) {
                result.setMostPosName(R.string.sleep_pos_back);
                result.setMostPosTitle(R.string.sleep_pos_back_most);
                result.setMostPosTip(R.string.sleep_pos_back_tip);
                result.setIcon(gender == 0 ? R.drawable.icon_sleep_pos_back_woman : R.drawable.icon_sleep_pos_back_man);
                return;
            }
            if (maxIndex == 1) {
                result.setMostPosName(R.string.sleep_pos_stomach);
                result.setMostPosTitle(R.string.sleep_pos_stomach_most);
                result.setMostPosTip(R.string.sleep_pos_stomach_tip);
                result.setIcon(gender == 0 ? R.drawable.icon_sleep_pos_stomach_woman : R.drawable.icon_sleep_pos_stomach_man);
                return;
            }
            if (maxIndex == 2) {
                result.setMostPosName(R.string.sleep_pos_left);
                result.setMostPosTitle(R.string.sleep_pos_left_most);
                result.setMostPosTip(R.string.sleep_pos_left_tip);
                result.setIcon(gender == 0 ? R.drawable.icon_sleep_pos_left_woman : R.drawable.icon_sleep_pos_left_man);
                return;
            }
            if (maxIndex != 3) {
                return;
            }
            result.setMostPosName(R.string.sleep_pos_right);
            result.setMostPosTitle(R.string.sleep_pos_right_most);
            result.setMostPosTip(R.string.sleep_pos_right_tip);
            result.setIcon(gender == 0 ? R.drawable.icon_sleep_pos_right_woman : R.drawable.icon_sleep_pos_right_man);
        }

        @NotNull
        public final SleepPosInfo from(@NotNull String userId, boolean isMili, @NotNull SleepInfo sleepInfo, @NotNull String date) {
            SleepPosInfo sleepPosInfo = new SleepPosInfo();
            sleepPosInfo.setAvgHr(c(userId, isMili, sleepInfo, date));
            sleepPosInfo.getChartItems().clear();
            sleepPosInfo.getChartItems().add(new SleepPosCircleView.Item(ContextCompat.getColor(KoinExtKt.getAppContext(), R.color.s34), sleepInfo.getSleepPosOnBack()));
            sleepPosInfo.getChartItems().add(new SleepPosCircleView.Item(ContextCompat.getColor(KoinExtKt.getAppContext(), R.color.p5), sleepInfo.getSleepPosOnStomach()));
            sleepPosInfo.getChartItems().add(new SleepPosCircleView.Item(ContextCompat.getColor(KoinExtKt.getAppContext(), R.color.s21), sleepInfo.getSleepPosOnLeft()));
            sleepPosInfo.getChartItems().add(new SleepPosCircleView.Item(ContextCompat.getColor(KoinExtKt.getAppContext(), R.color.s16), sleepInfo.getSleepPosOnRight()));
            final int value = 0;
            List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(CollectionsKt__CollectionsKt.mutableListOf(new PosItem(0, sleepInfo.getSleepPosOnBack()), new PosItem(1, sleepInfo.getSleepPosOnStomach()), new PosItem(2, sleepInfo.getSleepPosOnLeft()), new PosItem(3, sleepInfo.getSleepPosOnRight())), new Comparator() { // from class: b17
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return SleepPosInfo.Companion.b((SleepPosInfo.PosItem) obj, (SleepPosInfo.PosItem) obj2);
                }
            });
            Iterator it2 = listSortedWith.iterator();
            while (it2.hasNext()) {
                value += ((PosItem) it2.next()).getValue();
            }
            if (sleepInfo.hasSleepPos() && value != 0) {
                e(sleepPosInfo, ((PosItem) listSortedWith.get(3)).getIndex());
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
                Iterator it3 = listSortedWith.iterator();
                while (it3.hasNext()) {
                    arrayList.add(Integer.valueOf((int) Math.floor(((double) (((PosItem) it3.next()).getValue() * 100)) / ((double) value))));
                }
                int iSumOfInt = 100 - CollectionsKt___CollectionsKt.sumOfInt(arrayList);
                List<PosItem> listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(listSortedWith, new Comparator() { // from class: com.huami.sleep.daysleep.model.SleepPosInfo$Companion$from$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        double value2 = ((double) (((SleepPosInfo.PosItem) t).getValue() * 100)) / ((double) value);
                        Double dValueOf = Double.valueOf(Math.floor(value2) - value2);
                        double value3 = ((double) (((SleepPosInfo.PosItem) t2).getValue() * 100)) / ((double) value);
                        return ComparisonsKt__ComparisonsKt.compareValues(dValueOf, Double.valueOf(Math.floor(value3) - value3));
                    }
                });
                ArrayList<Pair> arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith2, 10));
                for (PosItem posItem : listSortedWith2) {
                    int iFloor = (int) Math.floor(((double) (posItem.getValue() * 100)) / ((double) value));
                    if (iSumOfInt > 0) {
                        iFloor++;
                        iSumOfInt--;
                    }
                    arrayList2.add(new Pair(posItem, Integer.valueOf(iFloor)));
                }
                for (Pair pair : arrayList2) {
                    int index = ((PosItem) pair.getFirst()).getIndex();
                    if (index == 0) {
                        sleepPosInfo.setBackPercent(((Number) pair.getSecond()).intValue());
                    } else if (index == 1) {
                        sleepPosInfo.setStomachPercent(((Number) pair.getSecond()).intValue());
                    } else if (index == 2) {
                        sleepPosInfo.setLeftPercent(((Number) pair.getSecond()).intValue());
                    } else if (index == 3) {
                        sleepPosInfo.setRightPercent(((Number) pair.getSecond()).intValue());
                    }
                }
                sleepPosInfo.setMostPosPercent(e.coerceAtLeast(e.coerceAtLeast(sleepPosInfo.getBackPercent(), sleepPosInfo.getLeftPercent()), sleepPosInfo.getRightPercent()));
            }
            return sleepPosInfo;
        }

        @NotNull
        public final IHeartRateRepo getRepo() {
            return SleepPosInfo.p;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/sleep/daysleep/model/SleepPosInfo$PosItem;", "", "", "component1", "component2", "index", "value", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getIndex", "()I", "b", "getValue", "<init>", "(II)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class PosItem {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int index;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int value;

        public PosItem(int i, int i2) {
            this.index = i;
            this.value = i2;
        }

        public static /* synthetic */ PosItem copy$default(PosItem posItem, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = posItem.index;
            }
            if ((i3 & 2) != 0) {
                i2 = posItem.value;
            }
            return posItem.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @NotNull
        public final PosItem copy(int index, int value) {
            return new PosItem(index, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PosItem)) {
                return false;
            }
            PosItem posItem = (PosItem) other;
            return this.index == posItem.index && this.value == posItem.value;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.index * 31) + this.value;
        }

        @NotNull
        public String toString() {
            return "PosItem(index=" + this.index + ", value=" + this.value + ")";
        }
    }

    public final int getAvgHr() {
        return this.avgHr;
    }

    public final int getBackPercent() {
        return this.backPercent;
    }

    @NotNull
    public final List<SleepPosCircleView.Item> getChartItems() {
        return this.chartItems;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getLeftPercent() {
        return this.leftPercent;
    }

    public final int getMostPosName() {
        return this.mostPosName;
    }

    public final int getMostPosPercent() {
        return this.mostPosPercent;
    }

    public final int getMostPosTip() {
        return this.mostPosTip;
    }

    public final int getMostPosTitle() {
        return this.mostPosTitle;
    }

    public final int getRightPercent() {
        return this.rightPercent;
    }

    public final int getStomachPercent() {
        return this.stomachPercent;
    }

    public final void setAvgHr(int i) {
        this.avgHr = i;
    }

    public final void setBackPercent(int i) {
        this.backPercent = i;
    }

    public final void setIcon(int i) {
        this.icon = i;
    }

    public final void setLeftPercent(int i) {
        this.leftPercent = i;
    }

    public final void setMostPosName(int i) {
        this.mostPosName = i;
    }

    public final void setMostPosPercent(int i) {
        this.mostPosPercent = i;
    }

    public final void setMostPosTip(int i) {
        this.mostPosTip = i;
    }

    public final void setMostPosTitle(int i) {
        this.mostPosTitle = i;
    }

    public final void setRightPercent(int i) {
        this.rightPercent = i;
    }

    public final void setStomachPercent(int i) {
        this.stomachPercent = i;
    }
}
