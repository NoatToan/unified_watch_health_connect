package com.garmin.android.apps.connectmobile.util.simplecropimage;

import am.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class CropImageView extends c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList<b> f47315p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f47316q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f47317r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f47318t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f47319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f47320w;

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47315p = new ArrayList<>();
        this.f47316q = null;
        this.f47320w = context;
    }

    @Override // com.garmin.android.apps.connectmobile.util.simplecropimage.c
    public final void g(float f14, float f15, float f16) {
        super.g(f14, f15, f16);
        for (b bVar : this.f47315p) {
            bVar.f47335h.set(getImageMatrix());
            bVar.f47332e = bVar.a();
        }
    }

    public final void h(b bVar) {
        Rect rect = bVar.f47332e;
        float fMax = Math.max(1.0f, getScale() * Math.min((getWidth() / rect.width()) * 0.6f, (getHeight() / rect.height()) * 0.6f));
        if (Math.abs(fMax - getScale()) / fMax > 0.1d) {
            float[] fArr = {bVar.f47334g.centerX(), bVar.f47334g.centerY()};
            getImageMatrix().mapPoints(fArr);
            this.f47362m.post(new n22.b(this, 300.0f, System.currentTimeMillis(), getScale(), (fMax - getScale()) / 300.0f, fArr[0], fArr[1]));
        }
        i(bVar);
    }

    public final void i(b bVar) {
        Rect rect = bVar.f47332e;
        int iMax = Math.max(0, this.f47358i - rect.left);
        int iMin = Math.min(0, this.f47359j - rect.right);
        int iMax2 = Math.max(0, this.f47360k - rect.top);
        int iMin2 = Math.min(0, this.f47361l - rect.bottom);
        if (iMax == 0) {
            iMax = iMin;
        }
        if (iMax2 == 0) {
            iMax2 = iMin2;
        }
        if (iMax == 0 && iMax2 == 0) {
            return;
        }
        postTranslate(iMax, iMax2);
        setImageMatrix(getImageViewMatrix());
    }

    public final void j(MotionEvent motionEvent) {
        ArrayList<b> arrayList;
        int i14 = 0;
        while (true) {
            arrayList = this.f47315p;
            if (i14 >= arrayList.size()) {
                break;
            }
            b bVar = arrayList.get(i14);
            bVar.f47329b = false;
            bVar.f47332e = bVar.a();
            i14++;
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            b bVar2 = arrayList.get(i15);
            if (bVar2.b(motionEvent.getX(), motionEvent.getY()) != 1) {
                if (!bVar2.f47329b) {
                    bVar2.f47329b = true;
                    bVar2.f47332e = bVar2.a();
                    break;
                }
                break;
            }
        }
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i14 = 0;
        while (true) {
            ArrayList<b> arrayList = this.f47315p;
            if (i14 >= arrayList.size()) {
                return;
            }
            b bVar = arrayList.get(i14);
            Paint paint = bVar.f47343p;
            Paint paint2 = bVar.f47342o;
            Paint paint3 = bVar.f47344q;
            if (!bVar.f47330c) {
                Path path = new Path();
                if (bVar.f47329b) {
                    Rect rect = new Rect();
                    bVar.f47328a.getDrawingRect(rect);
                    if (bVar.f47338k) {
                        canvas.save();
                        float fWidth = bVar.f47332e.width();
                        float fHeight = bVar.f47332e.height();
                        Rect rect2 = bVar.f47332e;
                        float f14 = fWidth / 2.0f;
                        path.addCircle(rect2.left + f14, (fHeight / 2.0f) + rect2.top, f14, Path.Direction.CW);
                        paint3.setColor(-1112874);
                        canvas.clipPath(path, Region.Op.DIFFERENCE);
                        if (bVar.f47329b) {
                            paint = paint2;
                        }
                        canvas.drawRect(rect, paint);
                        canvas.restore();
                    } else {
                        Rect rect3 = new Rect(rect.left, rect.top, rect.right, bVar.f47332e.top);
                        if (rect3.width() > 0 && rect3.height() > 0) {
                            canvas.drawRect(rect3, bVar.f47329b ? paint2 : paint);
                        }
                        Rect rect4 = new Rect(rect.left, bVar.f47332e.bottom, rect.right, rect.bottom);
                        if (rect4.width() > 0 && rect4.height() > 0) {
                            canvas.drawRect(rect4, bVar.f47329b ? paint2 : paint);
                        }
                        Rect rect5 = new Rect(rect.left, rect3.bottom, bVar.f47332e.left, rect4.top);
                        if (rect5.width() > 0 && rect5.height() > 0) {
                            canvas.drawRect(rect5, bVar.f47329b ? paint2 : paint);
                        }
                        Rect rect6 = new Rect(bVar.f47332e.right, rect3.bottom, rect.right, rect4.top);
                        if (rect6.width() > 0 && rect6.height() > 0) {
                            if (bVar.f47329b) {
                                paint = paint2;
                            }
                            canvas.drawRect(rect6, paint);
                        }
                        path.addRect(new RectF(bVar.f47332e), Path.Direction.CW);
                        paint3.setColor(-30208);
                    }
                    canvas.drawPath(path, paint3);
                    if (bVar.f47331d == b.a.Grow) {
                        if (bVar.f47338k) {
                            int intrinsicWidth = bVar.f47341n.getIntrinsicWidth();
                            int intrinsicHeight = bVar.f47341n.getIntrinsicHeight();
                            int iRound = (int) Math.round((((double) bVar.f47332e.width()) / 2.0d) * Math.cos(0.7853981633974483d));
                            Rect rect7 = bVar.f47332e;
                            int iWidth = (((rect7.width() / 2) + rect7.left) + iRound) - (intrinsicWidth / 2);
                            Rect rect8 = bVar.f47332e;
                            int iHeight = (((rect8.height() / 2) + rect8.top) - iRound) - (intrinsicHeight / 2);
                            Drawable drawable = bVar.f47341n;
                            drawable.setBounds(iWidth, iHeight, drawable.getIntrinsicWidth() + iWidth, bVar.f47341n.getIntrinsicHeight() + iHeight);
                            bVar.f47341n.draw(canvas);
                        } else {
                            Rect rect9 = bVar.f47332e;
                            int i15 = rect9.left + 1;
                            int i16 = rect9.right + 1;
                            int i17 = rect9.top + 4;
                            int i18 = rect9.bottom + 3;
                            int intrinsicWidth2 = bVar.f47339l.getIntrinsicWidth() / 2;
                            int intrinsicHeight2 = bVar.f47339l.getIntrinsicHeight() / 2;
                            int intrinsicHeight3 = bVar.f47340m.getIntrinsicHeight() / 2;
                            int intrinsicWidth3 = bVar.f47340m.getIntrinsicWidth() / 2;
                            Rect rect10 = bVar.f47332e;
                            int i19 = rect10.left;
                            int iA = j.a(rect10.right, i19, 2, i19);
                            int i24 = rect10.top;
                            int iA2 = j.a(rect10.bottom, i24, 2, i24);
                            int i25 = iA2 - intrinsicHeight2;
                            int i26 = iA2 + intrinsicHeight2;
                            bVar.f47339l.setBounds(i15 - intrinsicWidth2, i25, i15 + intrinsicWidth2, i26);
                            bVar.f47339l.draw(canvas);
                            bVar.f47339l.setBounds(i16 - intrinsicWidth2, i25, i16 + intrinsicWidth2, i26);
                            bVar.f47339l.draw(canvas);
                            int i27 = iA - intrinsicWidth3;
                            int i28 = iA + intrinsicWidth3;
                            bVar.f47340m.setBounds(i27, i17 - intrinsicHeight3, i28, i17 + intrinsicHeight3);
                            bVar.f47340m.draw(canvas);
                            bVar.f47340m.setBounds(i27, i18 - intrinsicHeight3, i28, i18 + intrinsicHeight3);
                            bVar.f47340m.draw(canvas);
                        }
                    }
                } else {
                    paint3.setColor(-16777216);
                    canvas.drawRect(bVar.f47332e, paint3);
                }
            }
            i14++;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.util.simplecropimage.c, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) throws Exception {
        super.onLayout(z14, i14, i15, i16, i17);
        if (this.f47354e.f122377a != null) {
            for (b bVar : this.f47315p) {
                bVar.f47335h.set(getImageMatrix());
                bVar.f47332e = bVar.a();
                if (bVar.f47329b) {
                    h(bVar);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CropImage cropImage = (CropImage) this.f47320w;
        if (cropImage.f47305p) {
            return false;
        }
        int action = motionEvent.getAction();
        ArrayList<b> arrayList = this.f47315p;
        if (action != 0) {
            if (action == 1) {
                if (cropImage.f47304o) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        b bVar = arrayList.get(i14);
                        if (bVar.f47329b) {
                            cropImage.f47306q = bVar;
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                if (i15 != i14) {
                                    arrayList.get(i15).f47330c = true;
                                }
                            }
                            h(bVar);
                            cropImage.f47304o = false;
                            return true;
                        }
                    }
                } else {
                    b bVar2 = this.f47316q;
                    if (bVar2 != null) {
                        h(bVar2);
                        b bVar3 = this.f47316q;
                        b.a aVar = b.a.None;
                        if (aVar != bVar3.f47331d) {
                            bVar3.f47331d = aVar;
                            bVar3.f47328a.invalidate();
                        }
                    }
                }
                this.f47316q = null;
            } else if (action == 2) {
                if (cropImage.f47304o) {
                    j(motionEvent);
                } else {
                    b bVar4 = this.f47316q;
                    if (bVar4 != null) {
                        int i16 = this.f47319v;
                        float x14 = motionEvent.getX() - this.f47317r;
                        float y14 = motionEvent.getY() - this.f47318t;
                        View view2 = bVar4.f47328a;
                        Rect rectA = bVar4.a();
                        if (i16 != 1) {
                            if (i16 == 32) {
                                float fWidth = (bVar4.f47334g.width() / rectA.width()) * x14;
                                float fHeight = (bVar4.f47334g.height() / rectA.height()) * y14;
                                Rect rect = new Rect(bVar4.f47332e);
                                bVar4.f47334g.offset(fWidth, fHeight);
                                RectF rectF = bVar4.f47334g;
                                rectF.offset(Math.max(0.0f, bVar4.f47333f.left - rectF.left), Math.max(0.0f, bVar4.f47333f.top - bVar4.f47334g.top));
                                RectF rectF2 = bVar4.f47334g;
                                rectF2.offset(Math.min(0.0f, bVar4.f47333f.right - rectF2.right), Math.min(0.0f, bVar4.f47333f.bottom - bVar4.f47334g.bottom));
                                Rect rectA2 = bVar4.a();
                                bVar4.f47332e = rectA2;
                                rect.union(rectA2);
                                rect.inset(-10, -10);
                                view2.invalidate(rect);
                            } else {
                                if ((i16 & 6) == 0) {
                                    x14 = 0.0f;
                                }
                                if ((i16 & 24) == 0) {
                                    y14 = 0.0f;
                                }
                                float fWidth2 = (bVar4.f47334g.width() / rectA.width()) * x14;
                                float fHeight2 = (bVar4.f47334g.height() / rectA.height()) * y14;
                                float fWidth3 = ((i16 & 2) != 0 ? -1 : 1) * fWidth2;
                                float fHeight3 = ((i16 & 8) == 0 ? 1 : -1) * fHeight2;
                                if (bVar4.f47336i) {
                                    if (fWidth3 != 0.0f) {
                                        fHeight3 = fWidth3 / bVar4.f47337j;
                                    } else if (fHeight3 != 0.0f) {
                                        fWidth3 = fHeight3 * bVar4.f47337j;
                                    }
                                }
                                RectF rectF3 = new RectF(bVar4.f47334g);
                                if (fWidth3 > 0.0f) {
                                    if ((fWidth3 * 2.0f) + rectF3.width() > bVar4.f47333f.width()) {
                                        fWidth3 = (bVar4.f47333f.width() - rectF3.width()) / 2.0f;
                                        if (bVar4.f47336i) {
                                            fHeight3 = fWidth3 / bVar4.f47337j;
                                        }
                                    }
                                }
                                if (fHeight3 > 0.0f) {
                                    if ((fHeight3 * 2.0f) + rectF3.height() > bVar4.f47333f.height()) {
                                        fHeight3 = (bVar4.f47333f.height() - rectF3.height()) / 2.0f;
                                        if (bVar4.f47336i) {
                                            fWidth3 = fHeight3 * bVar4.f47337j;
                                        }
                                    }
                                }
                                rectF3.inset(-fWidth3, -fHeight3);
                                if (rectF3.width() < 25.0f) {
                                    rectF3.inset((-(25.0f - rectF3.width())) / 2.0f, 0.0f);
                                }
                                float f14 = bVar4.f47336i ? 25.0f / bVar4.f47337j : 25.0f;
                                if (rectF3.height() < f14) {
                                    rectF3.inset(0.0f, (-(f14 - rectF3.height())) / 2.0f);
                                }
                                float f15 = rectF3.left;
                                RectF rectF4 = bVar4.f47333f;
                                float f16 = rectF4.left;
                                if (f15 < f16) {
                                    rectF3.offset(f16 - f15, 0.0f);
                                } else {
                                    float f17 = rectF3.right;
                                    float f18 = rectF4.right;
                                    if (f17 > f18) {
                                        rectF3.offset(-(f17 - f18), 0.0f);
                                    }
                                }
                                float f19 = rectF3.top;
                                RectF rectF5 = bVar4.f47333f;
                                float f22 = rectF5.top;
                                if (f19 < f22) {
                                    rectF3.offset(0.0f, f22 - f19);
                                } else {
                                    float f24 = rectF3.bottom;
                                    float f25 = rectF5.bottom;
                                    if (f24 > f25) {
                                        rectF3.offset(0.0f, -(f24 - f25));
                                    }
                                }
                                bVar4.f47334g.set(rectF3);
                                bVar4.f47332e = bVar4.a();
                                view2.invalidate();
                            }
                        }
                        this.f47317r = motionEvent.getX();
                        this.f47318t = motionEvent.getY();
                        i(this.f47316q);
                    }
                }
            }
        } else if (cropImage.f47304o) {
            j(motionEvent);
        } else {
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                b bVar5 = arrayList.get(i17);
                int iB = bVar5.b(motionEvent.getX(), motionEvent.getY());
                if (iB != 1) {
                    this.f47319v = iB;
                    this.f47316q = bVar5;
                    this.f47317r = motionEvent.getX();
                    this.f47318t = motionEvent.getY();
                    b bVar6 = this.f47316q;
                    b.a aVar2 = iB == 32 ? b.a.Move : b.a.Grow;
                    if (aVar2 == bVar6.f47331d) {
                        break;
                    }
                    bVar6.f47331d = aVar2;
                    bVar6.f47328a.invalidate();
                    break;
                }
            }
        }
        int action2 = motionEvent.getAction();
        if (action2 == 1) {
            c();
            return true;
        }
        if (action2 == 2 && getScale() == 1.0f) {
            c();
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.util.simplecropimage.c
    public final void postTranslate(float f14, float f15) {
        super.postTranslate(f14, f15);
        int i14 = 0;
        while (true) {
            ArrayList<b> arrayList = this.f47315p;
            if (i14 >= arrayList.size()) {
                return;
            }
            b bVar = arrayList.get(i14);
            bVar.f47335h.postTranslate(f14, f15);
            bVar.f47332e = bVar.a();
            i14++;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.util.simplecropimage.c, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public /* bridge */ /* synthetic */ void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    @Override // com.garmin.android.apps.connectmobile.util.simplecropimage.c
    public /* bridge */ /* synthetic */ void setRecycler(c.a aVar) {
        super.setRecycler(aVar);
    }
}
