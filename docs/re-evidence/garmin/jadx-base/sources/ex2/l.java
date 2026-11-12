package ex2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;
import o4.f1;
import o4.u1;
import o4.v1;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lex2/l;", "Landroid/graphics/drawable/Drawable;", "Lu4/d;", "imageVector", "", "tint", "<init>", "(Lu4/d;I)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4.d f66987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f66988b;

    public l(u4.d dVar, int i14) {
        dVar.getClass();
        this.f66987a = dVar;
        this.f66988b = i14;
    }

    public final void a(Canvas canvas, u4.l lVar) {
        float f14 = lVar.f168510c;
        List<u4.g> list = lVar.f168516i;
        float f15 = lVar.f168511d;
        int iSave = canvas.save();
        canvas.translate(f14, f15);
        try {
            canvas.rotate(lVar.f168509b);
            canvas.scale(lVar.f168512e, lVar.f168513f);
            canvas.translate((-lVar.f168510c) + lVar.f168514g, (-f15) + lVar.f168515h);
            if (!list.isEmpty()) {
                u4.h hVar = new u4.h();
                ArrayList<u4.g> arrayList = hVar.f168490a;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    hVar.f168490a = arrayList;
                }
                arrayList.addAll(list);
                canvas.clipPath(((o4.j) u4.h.b(hVar)).f128869b);
            }
            u4.l.a aVar = new u4.l.a(lVar);
            while (aVar.f168518a.hasNext()) {
                u4.n nVar = (u4.n) aVar.next();
                if (nVar instanceof u4.l) {
                    a(canvas, (u4.l) nVar);
                } else {
                    if (!(nVar instanceof u4.q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b(canvas, (u4.q) nVar);
                }
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th3) {
            canvas.restoreToCount(iSave);
            throw th3;
        }
    }

    public final void b(Canvas canvas, u4.q qVar) {
        Paint.Cap cap;
        Paint.Join join;
        u4.h hVar = new u4.h();
        List<u4.g> list = qVar.f168528b;
        ArrayList<u4.g> arrayList = hVar.f168490a;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            hVar.f168490a = arrayList;
        }
        arrayList.addAll(list);
        f1 f1VarB = u4.h.b(hVar);
        ((o4.j) f1VarB).j(qVar.f168529c);
        Path path = ((o4.j) f1VarB).f128869b;
        o4.w wVar = qVar.f168530d;
        int i14 = this.f66988b;
        if (wVar != null) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setAlpha((int) (qVar.f168531e * 255));
            paint.setColor(i14);
            Unit unit = Unit.INSTANCE;
            canvas.drawPath(path, paint);
        }
        if (qVar.f168532f != null) {
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setAlpha((int) (qVar.f168533g * 255));
            paint2.setColor(i14);
            paint2.setStrokeWidth(qVar.f168534h);
            int i15 = qVar.f168535i;
            u1.f129010b.getClass();
            if (i15 == u1.f129011c) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i15 == u1.f129012d ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            paint2.setStrokeCap(cap);
            int i16 = qVar.f168536j;
            v1.f129019b.getClass();
            if (i16 == v1.f129020c) {
                join = Paint.Join.ROUND;
            } else {
                join = i16 == v1.f129021d ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            paint2.setStrokeJoin(join);
            paint2.setStrokeMiter(qVar.f168537k);
            Unit unit2 = Unit.INSTANCE;
            canvas.drawPath(path, paint2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        u4.d dVar = this.f66987a;
        canvas.getClass();
        float fWidth = getBounds().width();
        if (fWidth < 1.0f) {
            fWidth = 1.0f;
        }
        float fHeight = getBounds().height();
        float f14 = fHeight >= 1.0f ? fHeight : 1.0f;
        float f15 = getBounds().left;
        float f16 = getBounds().top;
        int iSave = canvas.save();
        canvas.translate(f15, f16);
        try {
            canvas.scale(fWidth / dVar.f168379d, f14 / dVar.f168380e);
            a(canvas, dVar.f168381f);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f66987a.f168378c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.f66987a.f168377b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i14) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
