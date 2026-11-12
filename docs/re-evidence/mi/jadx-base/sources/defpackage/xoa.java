package defpackage;

import android.content.Context;
import android.graphics.Point;

/* JADX INFO: loaded from: classes3.dex */
public class xoa {
    public static rkr a(rkr rkrVar, Context context, Point point) {
        if (!zlr.m(context.getResources().getConfiguration(), point, rkrVar.c)) {
            rkrVar.g &= -8193;
            return rkrVar;
        }
        Point point2 = rkrVar.c;
        int i = point2.x;
        return c(rkrVar, i != 0 ? (point2.y * 1.0f) / i : 0.0f);
    }

    public static rkr b(rkr rkrVar, Context context, Point point) {
        return a(rkrVar, context, point);
    }

    public static rkr c(rkr rkrVar, float f) {
        if (f <= 0.0f) {
            rkrVar.g = 0;
        } else if (f >= 0.74f && f < 0.76f) {
            rkrVar.g = 8195;
        } else if (f >= 1.32f && f < 1.34f) {
            rkrVar.g = 8194;
        } else if (f < 1.76f || f >= 1.79f) {
            rkrVar.g = 8196;
        } else {
            rkrVar.g = 8193;
        }
        return rkrVar;
    }
}
