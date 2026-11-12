package com.xiaomi.fitness.devicesettings.huami.healthmonitor;

import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
import defpackage.cji;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nJ\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0007J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0007J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/EnduranceHelper;", "", "<init>", "()V", "LEVEL_NORMAL", "", "LEVEL_LIGHT", "LEVEL_MODERATE", "LEVEL_SEVERE", "DEFAULT_LEVEL_LIST", "", "getLevelPair", "Lkotlin/Pair;", "", "hrDetect", "Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;", "defaultEnduranceLevels", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "getEnduranceTitleRes", "level", "getEnduranceDesRes", "getEnduranceColorRes", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEnduranceHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnduranceHelper.kt\ncom/xiaomi/fitness/devicesettings/huami/healthmonitor/EnduranceHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1557#2:72\n1628#2,3:73\n*S KotlinDebug\n*F\n+ 1 EnduranceHelper.kt\ncom/xiaomi/fitness/devicesettings/huami/healthmonitor/EnduranceHelper\n*L\n43#1:72\n43#1:73,3\n*E\n"})
public final class EnduranceHelper {
    private static final int LEVEL_LIGHT = 2;
    private static final int LEVEL_MODERATE = 3;
    private static final int LEVEL_NORMAL = 1;
    private static final int LEVEL_SEVERE = 4;

    @NotNull
    public static final EnduranceHelper INSTANCE = new EnduranceHelper();

    @NotNull
    private static final List<Integer> DEFAULT_LEVEL_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 2, 3, 4});

    private EnduranceHelper() {
    }

    private final int getEnduranceColorRes(int level) {
        if (level == 2) {
            return cji.e;
        }
        if (level != 3) {
            return level != 4 ? cji.g : cji.h;
        }
        return cji.f;
    }

    @NotNull
    public final List<LevelBarView.LevelItem> defaultEnduranceLevels() {
        List<Integer> list = DEFAULT_LEVEL_LIST;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            EnduranceHelper enduranceHelper = INSTANCE;
            arrayList.add(new LevelBarView.LevelItem(enduranceHelper.getEnduranceColorRes(iIntValue), enduranceHelper.getEnduranceTitleRes(iIntValue)));
        }
        return arrayList;
    }

    public final int getEnduranceDesRes(int level) {
        if (level == 2) {
            return wzi.V3;
        }
        if (level != 3) {
            return level != 4 ? wzi.a4 : wzi.c4;
        }
        return wzi.Y3;
    }

    public final int getEnduranceTitleRes(int level) {
        if (level == 2) {
            return wzi.W3;
        }
        if (level != 3) {
            return level != 4 ? wzi.Z3 : wzi.b4;
        }
        return wzi.X3;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    @NotNull
    public final Pair<Integer, String> getLevelPair(@NotNull HRDetect hrDetect) {
        Intrinsics.checkNotNullParameter(hrDetect, "hrDetect");
        int i = 3;
        if (HRDetectExtKt.isSleepAIDSDetectionEnable(hrDetect)) {
            if (hrDetect.isAbnormalHeartbeatEnable()) {
                i = 4;
            }
        } else if (!hrDetect.isAbnormalHeartbeatEnable()) {
            if (hrDetect.isPressureEnable() || hrDetect.isActiveEnable()) {
                i = 2;
            } else {
                boolean z = hrDetect.getType() == 2 || hrDetect.getType() == 3;
                boolean z2 = hrDetect.getFreq() <= 10;
                if (z && z2) {
                    i = 2;
                } else {
                    i = 1;
                }
            }
        }
        Logger.d("getLevelPair: " + i, new Object[0]);
        return TuplesKt.to(Integer.valueOf(RangesKt___RangesKt.coerceAtLeast(DEFAULT_LEVEL_LIST.indexOf(Integer.valueOf(i)), 0)), ResourceExtKt.getString(getEnduranceDesRes(i)));
    }
}
