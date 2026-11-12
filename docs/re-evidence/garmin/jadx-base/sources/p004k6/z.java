package p004k6;

import android.graphics.Rect;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk6/z;", "Lk6/b0;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class z extends b0 {
    @Override // p004k6.b0, p004k6.y
    public final void d(x xVar, int i14, int i15) {
        xVar.setSystemGestureExclusionRects(x.m(new Rect(0, 0, i14, i15)));
    }
}
