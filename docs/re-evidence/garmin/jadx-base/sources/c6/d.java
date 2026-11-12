package c6;

import android.graphics.Paint;
import o4.u1;
import o4.v1;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final Paint.Cap a(int i14) {
        u1.a aVar = u1.f129010b;
        aVar.getClass();
        if (i14 == 0) {
            return Paint.Cap.BUTT;
        }
        aVar.getClass();
        if (i14 == u1.f129011c) {
            return Paint.Cap.ROUND;
        }
        aVar.getClass();
        return i14 == u1.f129012d ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    public static final Paint.Join b(int i14) {
        v1.a aVar = v1.f129019b;
        aVar.getClass();
        if (i14 == 0) {
            return Paint.Join.MITER;
        }
        aVar.getClass();
        if (i14 == v1.f129020c) {
            return Paint.Join.ROUND;
        }
        aVar.getClass();
        return i14 == v1.f129021d ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
