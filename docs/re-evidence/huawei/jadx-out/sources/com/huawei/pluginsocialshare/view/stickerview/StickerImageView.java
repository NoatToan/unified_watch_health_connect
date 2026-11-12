package com.huawei.pluginsocialshare.view.stickerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ppf;
import defpackage.ppg;
import defpackage.pph;
import defpackage.ppm;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes42.dex */
public class StickerImageView extends View implements MultiTouchObjectCanvas<MultiTouchObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static float f22708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static float f22709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static float f22710c;
    public static float e;
    private final ppf d;
    private int f;
    private StickerImageViewListener g;
    private ArrayList<MultiTouchObject> h;
    private pph<MultiTouchObject> i;
    private boolean j;

    @Override // com.huawei.pluginsocialshare.view.stickerview.MultiTouchObjectCanvas
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean pointInObjectGrabArea(ppf ppfVar, MultiTouchObject multiTouchObject) {
        return false;
    }

    public StickerImageView(Context context) {
        this(context, null);
    }

    public StickerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StickerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new ArrayList<>();
        this.i = new pph<>(this);
        this.d = new ppf();
        this.f = -1;
        this.j = true;
        c();
    }

    private void c() {
        setBackgroundColor(0);
    }

    public void c(Context context, int i) {
        c(context, new ppg(context, i, context.getResources()));
    }

    public void d(Context context, Drawable drawable) {
        c(context, new ppg(context, drawable, context.getResources()));
    }

    private void c(Context context, ppg ppgVar) {
        deselectAll();
        ppgVar.setSelected(this.j);
        ppgVar.setBorderColor(this.f);
        this.h.add(ppgVar);
        float x = getX();
        float width = getWidth() / 2.0f;
        float y = getY();
        float height = getHeight() / 2.0f;
        ArrayList<MultiTouchObject> arrayList = this.h;
        arrayList.get(arrayList.size() - 1).init(context, x + width, y + height);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator<MultiTouchObject> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().draw(canvas);
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Iterator<MultiTouchObject> it = this.h.iterator();
        while (it.hasNext()) {
            if (it.next().isSelected()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                break;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.i.e(this, motionEvent);
    }

    public ArrayList<MultiTouchObject> getImages() {
        return this.h;
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.MultiTouchObjectCanvas
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public MultiTouchObject getDraggableObjectAtPoint(ppf ppfVar) {
        float fJ = ppfVar.j();
        float fG = ppfVar.g();
        for (int size = this.h.size() - 1; size >= 0; size--) {
            ppg ppgVar = (ppg) this.h.get(size);
            if (ppgVar.containsPoint(fG, fJ)) {
                return ppgVar;
            }
        }
        return null;
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.MultiTouchObjectCanvas
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void selectObject(MultiTouchObject multiTouchObject, ppf ppfVar) {
        this.d.a(ppfVar);
        if (multiTouchObject != null) {
            this.h.remove(multiTouchObject);
            this.h.add(multiTouchObject);
            if (this.g != null) {
                if (multiTouchObject.containsDeletePoint(multiTouchObject, ppfVar.g(), ppfVar.j())) {
                    this.g.onImageObjectDeleteSelected();
                } else {
                    this.g.onImageObjectSelected(multiTouchObject);
                }
            }
        } else if (this.g != null && ppfVar.h() == 1) {
            this.g.onImageObjectDropped();
        }
        invalidate();
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.MultiTouchObjectCanvas
    public void canvasTouched(ppf ppfVar) {
        if (this.g == null) {
            return;
        }
        if (MultiTouchObject.containsDeletePoint(ppfVar.g(), ppfVar.j())) {
            LogUtil.a("Share_StickerImageView", "canvasTouched containsDeletePoint true x:", Float.valueOf(ppfVar.g()), " Y:", Float.valueOf(ppfVar.j()));
            this.g.onImageObjectDeleteSelected();
            return;
        }
        this.g.onCanvasTouched(ppfVar);
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.MultiTouchObjectCanvas
    public void deselectAll() {
        Iterator<MultiTouchObject> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().setSelected(false);
        }
        invalidate();
    }

    public void e(float f, IBaseResponseCallback iBaseResponseCallback) {
        MultiTouchObject next;
        Iterator<MultiTouchObject> it = this.h.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.isSelected());
        if (next == null) {
            return;
        }
        if (next.getCenterX() < 0.0f || next.getCenterX() > next.getDisplayWidth() || next.getCenterY() < 0.0f || next.getCenterY() > c(next.getDisplayWidth(), f)) {
            iBaseResponseCallback.a(0, null);
        }
        if (next.getCenterX() < (-next.getWidth()) || next.getCenterX() > next.getDisplayWidth() + next.getWidth() || next.getCenterY() < (-next.getWidth()) || next.getCenterY() > next.getDisplayHeight()) {
            iBaseResponseCallback.a(0, null);
        }
    }

    private int c(int i, float f) {
        return f <= 0.0f ? (i * 16) / 9 : (int) (i / f);
    }

    public boolean b() {
        Iterator<MultiTouchObject> it = this.h.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().isSelected()) {
                it.remove();
                z = true;
            }
        }
        invalidate();
        return z;
    }

    public void d() {
        this.h.clear();
        invalidate();
    }

    public void setListener(StickerImageViewListener stickerImageViewListener) {
        this.g = stickerImageViewListener;
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.MultiTouchObjectCanvas
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void getPositionAndScale(MultiTouchObject multiTouchObject, ppm ppmVar) {
        ppmVar.e(multiTouchObject.getCenterX(), multiTouchObject.getCenterY(), true, (multiTouchObject.getScaleX() + multiTouchObject.getScaleY()) / 2.0f, false, multiTouchObject.getScaleX(), multiTouchObject.getScaleY(), true, multiTouchObject.getAngle());
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.MultiTouchObjectCanvas
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean setPositionAndScale(MultiTouchObject multiTouchObject, ppm ppmVar, ppf ppfVar) {
        this.d.a(ppfVar);
        boolean pos = multiTouchObject.setPos(ppmVar);
        if (pos) {
            invalidate();
        }
        return pos;
    }
}
