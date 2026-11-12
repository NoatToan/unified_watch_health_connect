package com.mi.health.course.data;

import com.mi.health.course.data.ResolutionKt;
import com.mi.health.course.util.CoursePreference;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u000e\u001a\u00020\u0007\u001a\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0002\u001a#\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0013j\b\u0012\u0004\u0012\u00020\u0007`\u00122\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0002\u0010\u0015\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"'\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\"\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"RESOLUTION_RANGE_720", "Lkotlin/Pair;", "", "RESOLUTION_RANGE_1080", "RESOLUTION_RANGE_4K", "RESOLUTION_LIST", "Ljava/util/LinkedHashMap;", "Lcom/mi/health/course/data/Resolution;", "getRESOLUTION_LIST", "()Ljava/util/LinkedHashMap;", "RESOLUTION_LIST$delegate", "Lkotlin/Lazy;", "PREFER_RESOLUTION", "", "getSavedResolution", "getAndSaveResolution", "resolution", "getUnselectedResolutionList", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "selectedResolution", "(I)Ljava/util/ArrayList;", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nResolution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Resolution.kt\ncom/mi/health/course/data/ResolutionKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,42:1\n535#2:43\n520#2,6:44\n*S KotlinDebug\n*F\n+ 1 Resolution.kt\ncom/mi/health/course/data/ResolutionKt\n*L\n28#1:43\n28#1:44,6\n*E\n"})
public final class ResolutionKt {

    @NotNull
    private static final String PREFER_RESOLUTION = "course_video_resolution";

    @NotNull
    private static final Pair<Integer, Integer> RESOLUTION_RANGE_720 = new Pair<>(Integer.valueOf(HMSedentaryConfig.INGORE_START_INDEX), 1280);

    @NotNull
    private static final Pair<Integer, Integer> RESOLUTION_RANGE_1080 = new Pair<>(Integer.valueOf(Constants.FHD_WIDTH), 1920);

    @NotNull
    private static final Pair<Integer, Integer> RESOLUTION_RANGE_4K = new Pair<>(2160, 3840);

    @NotNull
    private static final Lazy RESOLUTION_LIST$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: aqk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ResolutionKt.RESOLUTION_LIST_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkedHashMap RESOLUTION_LIST_delegate$lambda$0() {
        return MapsKt__MapsKt.linkedMapOf(TuplesKt.to(RESOLUTION_RANGE_4K.getFirst(), Resolution4K.INSTANCE), TuplesKt.to(RESOLUTION_RANGE_1080.getFirst(), Resolution1080.INSTANCE), TuplesKt.to(RESOLUTION_RANGE_720.getFirst(), Resolution720.INSTANCE));
    }

    @NotNull
    public static final Resolution getAndSaveResolution(int i) {
        CoursePreference.INSTANCE.setVIDEO_RESOLUTION(i);
        Resolution resolution = getRESOLUTION_LIST().get(Integer.valueOf(i));
        return resolution == null ? Resolution720.INSTANCE : resolution;
    }

    private static final LinkedHashMap<Integer, Resolution> getRESOLUTION_LIST() {
        return (LinkedHashMap) RESOLUTION_LIST$delegate.getValue();
    }

    @NotNull
    public static final Resolution getSavedResolution() {
        Resolution resolution = getRESOLUTION_LIST().get(Integer.valueOf(CoursePreference.INSTANCE.getVIDEO_RESOLUTION()));
        return resolution == null ? Resolution720.INSTANCE : resolution;
    }

    @NotNull
    public static final ArrayList<Resolution> getUnselectedResolutionList(int i) {
        LinkedHashMap<Integer, Resolution> resolution_list = getRESOLUTION_LIST();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, Resolution> entry : resolution_list.entrySet()) {
            if (entry.getKey().intValue() != i) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new ArrayList<>(linkedHashMap.values());
    }
}
