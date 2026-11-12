package s40;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import u4.l;
import u4.n;
import u4.q;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static final void a(l lVar, Canvas canvas, Paint paint) {
        canvas.save();
        Matrix matrix = new Matrix();
        float f14 = lVar.f168509b;
        float f15 = lVar.f168515h;
        float f16 = lVar.f168513f;
        float f17 = lVar.f168511d;
        float f18 = lVar.f168510c;
        if (f14 != 0.0f) {
            matrix.postRotate(f14, f18, f17);
        }
        float f19 = lVar.f168512e;
        if (f19 != 1.0f || f16 != 1.0f) {
            matrix.postScale(f19, f16, f18, f17);
        }
        float f22 = lVar.f168514g;
        if (f22 != 0.0f || f15 != 0.0f) {
            matrix.postTranslate(f22, f15);
        }
        if (!matrix.isIdentity()) {
            canvas.concat(matrix);
        }
        l.a aVar = new l.a(lVar);
        while (aVar.f168518a.hasNext()) {
            n nVar = (n) aVar.next();
            if (nVar instanceof q) {
                u4.h hVar = new u4.h();
                List<u4.g> list = ((q) nVar).f168528b;
                ArrayList<u4.g> arrayList = hVar.f168490a;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    hVar.f168490a = arrayList;
                }
                arrayList.addAll(list);
                canvas.drawPath(((o4.j) u4.h.b(hVar)).f128869b, paint);
            } else {
                if (!(nVar instanceof l)) {
                    u0.r();
                    return;
                }
                a((l) nVar, canvas, paint);
            }
        }
        canvas.restore();
    }

    public static final BitmapDrawable b(u4.d dVar, Context context, int i14, int i15) {
        dVar.getClass();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i14, i14, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setColor(i15);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        float f14 = i14;
        canvas.scale(f14 / dVar.f168379d, f14 / dVar.f168380e);
        a(dVar.f168381f, canvas, paint);
        canvas.restore();
        return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
    }
}
