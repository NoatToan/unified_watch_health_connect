package com.huami.sleep.sleepstatefeel.repo;

import com.huami.sleep.R;
import com.huami.sleep.model.DataConstant;
import com.huami.sleep.sleepstatefeel.vo.SleepStateFeelVo;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004J\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007R%\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R%\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/repo/SleepStateFeelProvider;", "", "Ljava/util/ArrayList;", "Lcom/huami/sleep/sleepstatefeel/vo/SleepStateFeelVo;", "Lkotlin/collections/ArrayList;", "getDefaultStates", "getDefaultFeels", "", "id", "type", "", "getDesc", "", "a", "Ljava/util/Map;", "getMStateSort", "()Ljava/util/Map;", "mStateSort", "b", "getMFeelSort", "mFeelSort", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepStateFeelProvider {

    @NotNull
    public static final SleepStateFeelProvider INSTANCE = new SleepStateFeelProvider();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Map<String, Integer> mStateSort = r.mapOf(TuplesKt.to("8", Integer.valueOf(R.drawable.ic__sleep_state_phone)), TuplesKt.to("9", Integer.valueOf(R.drawable.ic_sleep_state_game)), TuplesKt.to("10", Integer.valueOf(R.drawable.ic__sleep_state_room)), TuplesKt.to("11", Integer.valueOf(R.drawable.ic__sleep_state_bath)), TuplesKt.to("1", Integer.valueOf(R.drawable.ic__sleep_state_drink)), TuplesKt.to("2", Integer.valueOf(R.drawable.ic__sleep_state_book)), TuplesKt.to("3", Integer.valueOf(R.drawable.ic__sleep_state_music)), TuplesKt.to("4", Integer.valueOf(R.drawable.ic__sleep_state_sport)), TuplesKt.to("5", Integer.valueOf(R.drawable.ic__sleep_state_meat)), TuplesKt.to("6", Integer.valueOf(R.drawable.ic__sleep_state_work)), TuplesKt.to("7", Integer.valueOf(R.drawable.ic__sleep_state_other)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Map<String, Integer> mFeelSort = r.mapOf(TuplesKt.to("4", Integer.valueOf(R.drawable.ic_sleep_feel_great)), TuplesKt.to("2", Integer.valueOf(R.drawable.ic_sleep_feel_sleepy)), TuplesKt.to("3", Integer.valueOf(R.drawable.ic_sleep_feel_calm)), TuplesKt.to("5", Integer.valueOf(R.drawable.ic_sleep_feel_sad)), TuplesKt.to("1", Integer.valueOf(R.drawable.ic_sleep_feel_no_spirit)));

    private SleepStateFeelProvider() {
    }

    @NotNull
    public final ArrayList<SleepStateFeelVo> getDefaultFeels() {
        ArrayList<SleepStateFeelVo> arrayList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : INSTANCE.getMFeelSort().entrySet()) {
            arrayList.add(new SleepStateFeelVo(entry.getValue().intValue(), INSTANCE.getDesc(entry.getKey(), DataConstant.TYPE_SLEEP_FEEL), DataConstant.TYPE_SLEEP_FEEL, entry.getKey(), false));
        }
        return arrayList;
    }

    @NotNull
    public final ArrayList<SleepStateFeelVo> getDefaultStates() {
        ArrayList<SleepStateFeelVo> arrayList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : INSTANCE.getMStateSort().entrySet()) {
            arrayList.add(new SleepStateFeelVo(entry.getValue().intValue(), INSTANCE.getDesc(entry.getKey(), DataConstant.TYPE_SLEEP_STATE), DataConstant.TYPE_SLEEP_STATE, entry.getKey(), false));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int getDesc(@NotNull String id, @NotNull String type) {
        if (!Intrinsics.areEqual(type, DataConstant.TYPE_SLEEP_STATE)) {
            if (!Intrinsics.areEqual(type, DataConstant.TYPE_SLEEP_FEEL)) {
                return R.string.sleep_feel_no_spirit;
            }
            switch (id.hashCode()) {
                case 49:
                    if (id.equals("1")) {
                        return R.string.sleep_feel_no_spirit;
                    }
                    break;
                case 50:
                    if (id.equals("2")) {
                        return R.string.sleep_feel_sleepy;
                    }
                    break;
                case 51:
                    if (id.equals("3")) {
                        return R.string.sleep_feel_calm;
                    }
                    break;
                case 52:
                    if (id.equals("4")) {
                        return R.string.sleep_feel_great;
                    }
                    break;
                case 53:
                    if (id.equals("5")) {
                        return R.string.sleep_feel_sad;
                    }
                    break;
            }
            return R.string.sleep_feel_no_spirit;
        }
        int iHashCode = id.hashCode();
        if (iHashCode != 1567) {
            if (iHashCode != 1568) {
                switch (iHashCode) {
                    case 49:
                        if (id.equals("1")) {
                            return R.string.sleep_behaviour_drink;
                        }
                        break;
                    case 50:
                        if (id.equals("2")) {
                            return R.string.sleep_behaviour_book;
                        }
                        break;
                    case 51:
                        if (id.equals("3")) {
                            return R.string.sleep_behaviour_music;
                        }
                        break;
                    case 52:
                        if (id.equals("4")) {
                            return R.string.sleep_behaviour_sport;
                        }
                        break;
                    case 53:
                        if (id.equals("5")) {
                            return R.string.sleep_behaviour_meal;
                        }
                        break;
                    case 54:
                        if (id.equals("6")) {
                            return R.string.sleep_behaviour_work;
                        }
                        break;
                    case 55:
                        if (id.equals("7")) {
                            return R.string.sleep_behaviour_other;
                        }
                        break;
                    case 56:
                        if (id.equals("8")) {
                            return R.string.sleep_behaviour_watch_mobile_phone;
                        }
                        break;
                    case 57:
                        if (id.equals("9")) {
                            return R.string.sleep_behaviour_paly_game;
                        }
                        break;
                }
            } else if (id.equals("11")) {
                return R.string.sleep_behaviour_bathe;
            }
        } else if (id.equals("10")) {
            return R.string.sleep_behaviour_tidy_room;
        }
        return R.string.sleep_behaviour_other;
    }

    @NotNull
    public final Map<String, Integer> getMFeelSort() {
        return mFeelSort;
    }

    @NotNull
    public final Map<String, Integer> getMStateSort() {
        return mStateSort;
    }
}
