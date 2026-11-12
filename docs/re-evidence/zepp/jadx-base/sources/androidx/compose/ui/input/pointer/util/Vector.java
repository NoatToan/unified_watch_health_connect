package androidx.compose.ui.input.pointer.util;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\u0011\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002J\u0006\u0010\u000b\u001a\u00020\u0004R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/pointer/util/Vector;", "", "", "i", "", "get", "value", "", WatchFaceArrivingEvent.CMD_SET, "a", "times", "norm", SessionDescription.p, LogUtil.I, "getLength", "()I", "", MessengerShareContentUtility.ELEMENTS, "[Ljava/lang/Float;", "getElements", "()[Ljava/lang/Float;", "<init>", "(I)V", "ui_release"}, k = 1, mv = {1, 5, 1})
final class Vector {

    @NotNull
    private final Float[] elements;
    private final int length;

    public Vector(int i) {
        this.length = i;
        Float[] fArr = new Float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.valueOf(0.0f);
        }
        this.elements = fArr;
    }

    public final float get(int i) {
        return this.elements[i].floatValue();
    }

    @NotNull
    public final Float[] getElements() {
        return this.elements;
    }

    public final int getLength() {
        return this.length;
    }

    public final float norm() {
        return (float) Math.sqrt(times(this));
    }

    public final void set(int i, float value) {
        this.elements[i] = Float.valueOf(value);
    }

    public final float times(@NotNull Vector a) {
        int i = this.length;
        float f = 0.0f;
        if (i > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                f += get(i2) * a.get(i2);
                if (i3 >= i) {
                    break;
                }
                i2 = i3;
            }
        }
        return f;
    }
}
