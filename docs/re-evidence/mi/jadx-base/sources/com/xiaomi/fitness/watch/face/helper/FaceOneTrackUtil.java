package com.xiaomi.fitness.watch.face.helper;

import com.example.statistics.export.TrackContentBean;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fJG\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/watch/face/helper/FaceOneTrackUtil;", "", "<init>", "()V", "buildTrackContent", "Lcom/example/statistics/export/TrackContentBean;", "key", "", i.d, "params", "", "percent", "", "buildTrackMap", "", "data", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "contentSource", "exposeSource", "position", "", "source", "(Lcom/xiaomi/fitness/watch/face/export/data/FaceData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/util/Map;", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceOneTrackUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceOneTrackUtil.kt\ncom/xiaomi/fitness/watch/face/helper/FaceOneTrackUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1557#2:46\n1628#2,3:47\n1557#2:50\n1628#2,3:51\n*S KotlinDebug\n*F\n+ 1 FaceOneTrackUtil.kt\ncom/xiaomi/fitness/watch/face/helper/FaceOneTrackUtil\n*L\n30#1:46\n30#1:47,3\n31#1:50\n31#1:51,3\n*E\n"})
public final class FaceOneTrackUtil {

    @NotNull
    public static final FaceOneTrackUtil INSTANCE = new FaceOneTrackUtil();

    private FaceOneTrackUtil() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrackContentBean buildTrackContent$default(FaceOneTrackUtil faceOneTrackUtil, String str, String str2, Map map, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        if ((i & 8) != 0) {
            f = 0.67f;
        }
        return faceOneTrackUtil.buildTrackContent(str, str2, map, f);
    }

    @NotNull
    public final TrackContentBean buildTrackContent(@Nullable String key, @Nullable String eventName, @NotNull Map<String, ? extends Object> params, float percent) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new TrackContentBean(key, false, eventName, params, percent);
    }

    @NotNull
    public final Map<String, Object> buildTrackMap(@NotNull FaceData data, @NotNull String contentSource, @NotNull String exposeSource, @Nullable Integer position, @Nullable String source) {
        Collection collectionEmptyList;
        Collection collectionEmptyList2;
        String id;
        String name;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(contentSource, "contentSource");
        Intrinsics.checkNotNullParameter(exposeSource, "exposeSource");
        Pair[] pairArr = new Pair[10];
        pairArr[0] = TuplesKt.to("asset_id", data.getId());
        pairArr[1] = TuplesKt.to(OneTrack.Param.ASSET_NAME, data.getDisplay_name());
        pairArr[2] = TuplesKt.to(Constants.KEY_PRICE, Long.valueOf(data.getPrice()));
        pairArr[3] = TuplesKt.to("content_source", contentSource);
        pairArr[4] = TuplesKt.to("expose_source", exposeSource);
        List<FaceData.Tag> tag_list = data.getTag_list();
        if (tag_list != null) {
            List<FaceData.Tag> list = tag_list;
            collectionEmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                collectionEmptyList.add(((FaceData.Tag) it.next()).getTag_id());
            }
        } else {
            collectionEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        pairArr[5] = TuplesKt.to(FeedbackConstants.KEY_TAG_ID, collectionEmptyList);
        List<FaceData.Tag> tag_list2 = data.getTag_list();
        if (tag_list2 != null) {
            List<FaceData.Tag> list2 = tag_list2;
            collectionEmptyList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                collectionEmptyList2.add(((FaceData.Tag) it2.next()).getTag_name());
            }
        } else {
            collectionEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        pairArr[6] = TuplesKt.to("tag_name", collectionEmptyList2);
        FaceData.Category category = data.getCategory();
        String str = "";
        if (category == null || (id = category.getId()) == null) {
            id = "";
        }
        pairArr[7] = TuplesKt.to("category_id", id);
        FaceData.Category category2 = data.getCategory();
        if (category2 != null && (name = category2.getName()) != null) {
            str = name;
        }
        pairArr[8] = TuplesKt.to("category_name", str);
        pairArr[9] = TuplesKt.to("watchface_type", Integer.valueOf(data.isPurchaseFace() ? 1 : 2));
        Map<String, Object> mapMutableMapOf = MapsKt__MapsKt.mutableMapOf(pairArr);
        if (position != null) {
            mapMutableMapOf.put("watchface_position_id", position);
        }
        if (source != null) {
            mapMutableMapOf.put("source", source);
        }
        return mapMutableMapOf;
    }
}
