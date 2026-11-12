package androidx.compose.foundation.lazy;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.notification.TransportUri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\b\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000e\u001a\u00020\u0006R\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/IntervalList;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "Landroidx/compose/foundation/lazy/IntervalHolder;", "list", "", "value", "findIndexOfHighestValueLesserThan", "size", "content", "", TransportUri.ACTION_ADD, "(ILjava/lang/Object;)V", "index", "intervalForIndex", "", "intervals", "Ljava/util/List;", "<set-?>", "totalSize", LogUtil.I, "getTotalSize$foundation_release", "()I", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 5, 1})
public final class IntervalList<T> {

    @NotNull
    private final List<IntervalHolder<T>> intervals = new ArrayList();
    private int totalSize;

    private final int findIndexOfHighestValueLesserThan(List<IntervalHolder<T>> list, int value) {
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        int i = 0;
        while (i < lastIndex) {
            int i2 = (i + lastIndex) / 2;
            int startIndex = list.get(i2).getStartIndex();
            if (startIndex == value) {
                return i2;
            }
            if (startIndex < value) {
                i = i2 + 1;
                if (value < list.get(i).getStartIndex()) {
                    return i2;
                }
            } else {
                lastIndex = i2 - 1;
            }
        }
        return i;
    }

    public final void add(int size, T content) {
        if (size == 0) {
            return;
        }
        IntervalHolder<T> intervalHolder = new IntervalHolder<>(this.totalSize, size, content);
        this.totalSize += size;
        this.intervals.add(intervalHolder);
    }

    /* JADX INFO: renamed from: getTotalSize$foundation_release, reason: from getter */
    public final int getTotalSize() {
        return this.totalSize;
    }

    @NotNull
    public final IntervalHolder<T> intervalForIndex(int index) {
        if (index >= 0 && index < this.totalSize) {
            List<IntervalHolder<T>> list = this.intervals;
            return list.get(findIndexOfHighestValueLesserThan(list, index));
        }
        throw new IndexOutOfBoundsException("Index " + index + ", size " + this.totalSize);
    }
}
