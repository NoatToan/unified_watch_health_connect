package com.xiaomi.hm.health.bt.profile.sport.coaching;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.dataflow.model.sport.bean.SportDetail;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0013\u0010\u000e\u001a\u00020\u000b8F@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/HMCoachingSequence;", "", "", "a", LogUtil.I, "repeat", "", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/HMCoachingSegment;", "b", "Ljava/util/List;", "segments", "", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(ILjava/util/List;)V", SportDetail.COLUMN_SEGMENT, "(Lcom/xiaomi/hm/health/bt/profile/sport/coaching/HMCoachingSegment;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMCoachingSequence {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int repeat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<HMCoachingSegment> segments;

    public HMCoachingSequence(int i, @NotNull List<HMCoachingSegment> list) {
        this.repeat = i;
        this.segments = list;
    }

    @NotNull
    public final byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.segments.size());
        byteArrayOutputStream.write(this.repeat);
        Iterator<T> it2 = this.segments.iterator();
        while (it2.hasNext()) {
            byteArrayOutputStream.write(((HMCoachingSegment) it2.next()).getBytes());
        }
        return byteArrayOutputStream.toByteArray();
    }

    public HMCoachingSequence(@NotNull HMCoachingSegment hMCoachingSegment) {
        this(0, e.listOf(hMCoachingSegment));
    }
}
