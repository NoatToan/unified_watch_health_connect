package androidx.compose.foundation.lazy;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0019\u0010\n\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/lazy/IntervalHolder;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "startIndex", LogUtil.I, "getStartIndex", "()I", "size", "getSize", "content", "Ljava/lang/Object;", "getContent", "()Ljava/lang/Object;", "<init>", "(IILjava/lang/Object;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
public final class IntervalHolder<T> {
    private final T content;
    private final int size;
    private final int startIndex;

    public IntervalHolder(int i, int i2, T t) {
        this.startIndex = i;
        this.size = i2;
        this.content = t;
    }

    public final T getContent() {
        return this.content;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }
}
