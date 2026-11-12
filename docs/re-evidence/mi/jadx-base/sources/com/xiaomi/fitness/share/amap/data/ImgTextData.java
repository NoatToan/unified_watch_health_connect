package com.xiaomi.fitness.share.amap.data;

import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.lifecycle.MutableLiveData;
import com.amap.api.maps.model.Marker;
import com.miui.tsmclient.util.ServiceUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.share.amap.data.ImgTextBean;
import com.xiaomi.fitness.share.amap.data.ImgTextData;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0013J\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u0015\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/share/amap/data/ImgTextData;", "", "<init>", "()V", "TAG", "", "imgTextList", "Ljava/util/PriorityQueue;", "Lcom/xiaomi/fitness/share/amap/data/ImgTextBean;", "kotlin.jvm.PlatformType", "add", "", "imgTextBean", "getImgTextBean", ServiceUtils.EXTRA_PROCESS, "", "remove", "Landroidx/lifecycle/MutableLiveData;", "getImgTextList", "", "reset", CervicalMucusRecord.Appearance.CLEAR, "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImgTextData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImgTextData.kt\ncom/xiaomi/fitness/share/amap/data/ImgTextData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1#2:74\n1053#3:75\n1863#3,2:76\n*S KotlinDebug\n*F\n+ 1 ImgTextData.kt\ncom/xiaomi/fitness/share/amap/data/ImgTextData\n*L\n50#1:75\n53#1:76,2\n*E\n"})
public final class ImgTextData {

    @NotNull
    public static final String TAG = "ImgTextData";

    @NotNull
    public static final ImgTextData INSTANCE = new ImgTextData();

    @NotNull
    private static final PriorityQueue<ImgTextBean> imgTextList = new PriorityQueue<>(5, new Comparator() { // from class: j6d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ImgTextData.imgTextList$lambda$0((ImgTextBean) obj, (ImgTextBean) obj2);
        }
    });

    private ImgTextData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int imgTextList$lambda$0(ImgTextBean imgTextBean, ImgTextBean imgTextBean2) {
        return Intrinsics.compare(imgTextBean.getIndex(), imgTextBean2.getIndex());
    }

    public final void add(@NotNull ImgTextBean imgTextBean) {
        Object next;
        Intrinsics.checkNotNullParameter(imgTextBean, "imgTextBean");
        Iterator<T> it = imgTextList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ImgTextBean) next).getIndex() != imgTextBean.getIndex());
        ImgTextBean imgTextBean2 = (ImgTextBean) next;
        if (imgTextBean2 != null) {
            imgTextBean2.setFeelings(imgTextBean.getFeelings());
            imgTextBean2.setImgUriList(imgTextBean.getImgUriList());
            imgTextBean2.setBgResource(imgTextBean.getBgResource());
            imgTextBean2.setMarker(imgTextBean.getMarker());
            return;
        }
        Logger.d(TAG, "imgTextBean:" + imgTextBean);
        imgTextList.offer(imgTextBean);
    }

    public final void clear() {
        imgTextList.clear();
    }

    @Nullable
    public final ImgTextBean getImgTextBean(float process) {
        Object next;
        Iterator<T> it = getImgTextList().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((ImgTextBean) next).getProgress() == process) {
                return (ImgTextBean) next;
            }
        }
        next = null;
        return (ImgTextBean) next;
    }

    @NotNull
    public final List<ImgTextBean> getImgTextList() {
        return CollectionsKt___CollectionsKt.sortedWith(imgTextList, new Comparator() { // from class: com.xiaomi.fitness.share.amap.data.ImgTextData$getImgTextList$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((ImgTextBean) t).getIndex()), Integer.valueOf(((ImgTextBean) t2).getIndex()));
            }
        });
    }

    public final void remove(@NotNull MutableLiveData<Float> process) {
        Object next;
        Intrinsics.checkNotNullParameter(process, "process");
        Logger.d(TAG, "process:" + process + " , size:" + getImgTextList().size());
        Iterator<T> it = getImgTextList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((ImgTextBean) next).getProgress(), process.getValue()));
        ImgTextBean imgTextBean = (ImgTextBean) next;
        if (imgTextBean != null) {
            Marker marker = imgTextBean.getMarker();
            if (marker != null) {
                marker.remove();
            }
            imgTextBean.setMarker(null);
            imgTextList.remove(imgTextBean);
            ImgTextData imgTextData = INSTANCE;
            Logger.d(TAG, "process:" + process + " , size:" + imgTextData.getImgTextList().size() + " , list:" + imgTextData.getImgTextList());
        }
    }

    public final void reset() {
        Iterator<T> it = imgTextList.iterator();
        while (it.hasNext()) {
            ((ImgTextBean) it.next()).setShowImgTextMarker(true);
        }
    }
}
