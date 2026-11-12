package androidx.compose.foundation.text;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0005\"\u001c\u0010\u0001\u001a\u00020\u00008\u0000@\u0000X\u0080D¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "SNAPSHOTS_INTERVAL_MILLIS", LogUtil.I, "getSNAPSHOTS_INTERVAL_MILLIS", "()I", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class UndoManagerKt {
    private static final int SNAPSHOTS_INTERVAL_MILLIS = 5000;

    public static final int getSNAPSHOTS_INTERVAL_MILLIS() {
        return SNAPSHOTS_INTERVAL_MILLIS;
    }
}
