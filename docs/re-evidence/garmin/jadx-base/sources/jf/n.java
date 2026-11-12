package jf;

import android.content.Context;
import com.google.accompanist.drawablepainter.DrawablePainter;

/* JADX INFO: loaded from: classes7.dex */
public final class n {
    public static final t4.d a(hf.h hVar, Context context, int i14) {
        if (hVar instanceof hf.a) {
            return t4.b.a(new o4.f(((hf.a) hVar).f83537a), i14);
        }
        return hVar instanceof hf.d ? new DrawablePainter(hf.m.a(hVar, context.getResources()).mutate()) : new m(hVar);
    }
}
