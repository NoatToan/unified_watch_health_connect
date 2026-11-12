package com.garmin.android.apps.connectmobile.social.share.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c53.c0;
import c53.m;
import c53.n;
import c53.q;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.bumptech.glide.j;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j23.k;
import j23.l;
import j23.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import nj.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.p0;
import ro1.k0;
import ro1.l0;
import tn2.n0;
import v22.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0014)*B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011R.\u0010 \u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/ui/StickerEditorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/garmin/android/apps/connectmobile/social/share/ui/a$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getNextZValue", "()F", "", "Lcom/garmin/android/apps/connectmobile/social/share/ui/b$b;", "getStickerImageInfos", "()Ljava/util/List;", "", "Lcom/garmin/android/apps/connectmobile/social/share/ui/b;", "a", "Ljava/util/List;", "getStickers", "stickers", "Landroid/view/ViewGroup;", "value", "h", "Landroid/view/ViewGroup;", "getDeleteView", "()Landroid/view/ViewGroup;", "setDeleteView", "(Landroid/view/ViewGroup;)V", "deleteView", "Lcom/garmin/android/apps/connectmobile/social/share/ui/StickerEditorView$b;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/garmin/android/apps/connectmobile/social/share/ui/StickerEditorView$b;", "getOnStickerEditListener", "()Lcom/garmin/android/apps/connectmobile/social/share/ui/StickerEditorView$b;", "setOnStickerEditListener", "(Lcom/garmin/android/apps/connectmobile/social/share/ui/StickerEditorView$b;)V", "onStickerEditListener", "c", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StickerEditorView extends ConstraintLayout implements com.garmin.android.apps.connectmobile.social.share.ui.a.InterfaceC0848a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f44707l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f44708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator<Float> f44709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.social.share.ui.a f44710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.social.share.ui.b f44711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f44712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f44713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public to1.b f44714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public ViewGroup deleteView;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public b onStickerEditListener;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final GestureDetector f44717j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ScaleGestureDetector f44718k;

    public interface b {
        void a(com.garmin.android.apps.connectmobile.social.share.ui.b bVar);

        void b(com.garmin.android.apps.connectmobile.social.share.ui.b bVar);

        void c(com.garmin.android.apps.connectmobile.social.share.ui.b bVar);
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/social/share/ui/StickerEditorView$d", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends GestureDetector.SimpleOnGestureListener {
        public d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onShowPress(MotionEvent motionEvent) {
            motionEvent.getClass();
            StickerEditorView stickerEditorView = StickerEditorView.this;
            com.garmin.android.apps.connectmobile.social.share.ui.b bVar = stickerEditorView.f44711d;
            if (bVar != null) {
                stickerEditorView.m(bVar);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            l0 l0Var;
            List<k0> list;
            motionEvent.getClass();
            StickerEditorView stickerEditorView = StickerEditorView.this;
            com.garmin.android.apps.connectmobile.social.share.ui.b bVar = stickerEditorView.f44711d;
            if (bVar != null) {
                ArrayList arrayList = stickerEditorView.f44708a;
                arrayList.remove(bVar);
                arrayList.add(bVar);
                bVar.setZ(stickerEditorView.getNextZValue());
                l0 l0Var2 = bVar.f44728a;
                if (l0Var2 != null && l0Var2.a() && (l0Var = bVar.f44728a) != null) {
                    int iIntValue = 0;
                    if (l0Var.a()) {
                        l0 l0Var3 = bVar.f44728a;
                        Integer numValueOf = (l0Var3 == null || (list = l0Var3.f153988c) == null) ? null : Integer.valueOf(list.size());
                        if (numValueOf != null) {
                            iIntValue = (bVar.f44729b + 1) % numValueOf.intValue();
                            bVar.f44729b = iIntValue;
                        }
                    }
                    String str = l0Var.f153988c.get(iIntValue).f153983b;
                    if (str != null) {
                        j jVarJ = com.bumptech.glide.b.e(bVar.getContext()).d(Drawable.class).J(str);
                        h hVar = bVar.f44730c;
                        jVarJ.getClass();
                        jVarJ.F(hVar, null, jVarJ, qj.e.f144968a);
                    }
                }
                b onStickerEditListener = stickerEditorView.getOnStickerEditListener();
                if (onStickerEditListener != null) {
                    onStickerEditListener.c(bVar);
                }
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/social/share/ui/StickerEditorView$e", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public e() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            scaleGestureDetector.getClass();
            com.garmin.android.apps.connectmobile.social.share.ui.b bVar = StickerEditorView.this.f44711d;
            if (bVar == null) {
                return true;
            }
            float fMax = Math.max(0.25f, Math.min(scaleGestureDetector.getScaleFactor() * bVar.getScaleX(), 10.0f));
            bVar.setScaleX(fMax);
            bVar.setScaleY(fMax);
            return true;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerEditorView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f44708a = new ArrayList();
        this.f44709b = q.e(new n0(6), Float.valueOf(0.0f)).iterator();
        this.f44710c = new com.garmin.android.apps.connectmobile.social.share.ui.a(this);
        this.f44714g = to1.b.None;
        this.f44717j = new GestureDetector(context, new d());
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new e());
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.f44718k = scaleGestureDetector;
    }

    public static c i(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 0) {
            return new c(0.0f, 0.0f);
        }
        int pointerCount = motionEvent.getActionMasked() == 6 ? motionEvent.getPointerCount() - 1 : motionEvent.getPointerCount();
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        l lVarO = t.o(0, motionEvent.getPointerCount());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = lVarO.iterator();
        while (((k) it).f96801c) {
            Object next = ((p0) it).next();
            if (((Number) next).intValue() != actionIndex) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        double y14 = 0.0d;
        double x14 = 0.0d;
        while (it3.hasNext()) {
            x14 += (double) motionEvent.getX(((Number) it3.next()).intValue());
        }
        double d14 = pointerCount;
        double d15 = x14 / d14;
        l lVarO2 = t.o(0, motionEvent.getPointerCount());
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it4 = lVarO2.iterator();
        while (((k) it4).f96801c) {
            Object next2 = ((p0) it4).next();
            if (((Number) next2).intValue() != actionIndex) {
                arrayList2.add(next2);
            }
        }
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            y14 += (double) motionEvent.getY(((Number) it5.next()).intValue());
        }
        return new c((float) d15, (float) (y14 / d14));
    }

    @Override // com.garmin.android.apps.connectmobile.social.share.ui.a.InterfaceC0848a
    public final void g(com.garmin.android.apps.connectmobile.social.share.ui.a aVar) {
        aVar.getClass();
        com.garmin.android.apps.connectmobile.social.share.ui.b bVar = this.f44711d;
        if (bVar != null) {
            bVar.setRotation(bVar.getRotation() + aVar.f44727d);
        }
    }

    public final ViewGroup getDeleteView() {
        return this.deleteView;
    }

    public final float getNextZValue() {
        return this.f44709b.next().floatValue();
    }

    public final b getOnStickerEditListener() {
        return this.onStickerEditListener;
    }

    public final List<com.garmin.android.apps.connectmobile.social.share.ui.b.C0849b> getStickerImageInfos() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f44708a.iterator();
        while (it.hasNext()) {
            com.garmin.android.apps.connectmobile.social.share.ui.b.C0849b stickerMetaInfo = ((com.garmin.android.apps.connectmobile.social.share.ui.b) it.next()).getStickerMetaInfo();
            if (stickerMetaInfo != null) {
                arrayList.add(stickerMetaInfo);
            }
        }
        return arrayList;
    }

    public final List<com.garmin.android.apps.connectmobile.social.share.ui.b> getStickers() {
        return this.f44708a;
    }

    public final to1.b j(View view2) {
        ViewGroup viewGroup = this.deleteView;
        if (viewGroup != null) {
            float x14 = view2.getX() + view2.getPivotX();
            float y14 = view2.getY() + view2.getPivotY();
            to1.b bVar = (x14 <= ((float) viewGroup.getLeft()) || x14 >= ((float) viewGroup.getRight()) || y14 <= ((float) viewGroup.getTop()) || y14 >= ((float) viewGroup.getBottom())) ? to1.b.Regular : to1.b.Open;
            if (bVar != null) {
                return bVar;
            }
        }
        return to1.b.None;
    }

    public final void k() {
        ViewGroup viewGroup = this.deleteView;
        if (viewGroup != null) {
            c53.k kVarA = n.a(new m(new g(viewGroup, null)).f24571a);
            while (kVarA.hasNext()) {
                ((View) kVarA.next()).setAlpha(1.0f);
            }
        }
        ImageView imageView = this.f44713f;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        this.f44714g = to1.b.None;
    }

    public final boolean l(com.garmin.android.apps.connectmobile.social.share.ui.b bVar, c cVar) {
        Bitmap bitmap;
        Drawable drawable = bVar.getDrawable();
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
            return false;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(bVar.getRotation());
        float width = (getWidth() * 0.4f) / bitmap.getWidth();
        matrix.postScale(bVar.getScaleX() * width, bVar.getScaleY() * width);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmapCreateBitmap.getClass();
        float pivotX = cVar.f44720a - (bVar.getPivotX() + bVar.getX());
        float pivotY = cVar.f44721b - (bVar.getPivotY() + bVar.getY());
        float width2 = pivotX + (bitmapCreateBitmap.getWidth() / 2);
        float height = pivotY + (bitmapCreateBitmap.getHeight() / 2);
        return 0.0f <= width2 && width2 < ((float) bitmapCreateBitmap.getWidth()) && 0.0f <= height && height < ((float) bitmapCreateBitmap.getHeight()) && Color.alpha(bitmapCreateBitmap.getPixel((int) width2, (int) height)) > 0;
    }

    public final void m(com.garmin.android.apps.connectmobile.social.share.ui.b bVar) {
        to1.b bVarJ = j(bVar);
        to1.b bVar2 = this.f44714g;
        if (bVarJ == bVar2) {
            return;
        }
        if (bVar2 == to1.b.None) {
            ViewGroup viewGroup = this.deleteView;
            if (viewGroup != null) {
                ImageView imageView = this.f44713f;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                c53.g.a aVar = new c53.g.a(c0.h(new m(new g(viewGroup, null)), new tn2.t(this, 3)));
                while (aVar.hasNext()) {
                    ((View) aVar.next()).setAlpha(0.2f);
                }
            }
            ArrayList arrayList = this.f44708a;
            arrayList.remove(bVar);
            arrayList.add(bVar);
            bVar.setZ(getNextZValue());
            b bVar3 = this.onStickerEditListener;
            if (bVar3 != null) {
                bVar3.a(bVar);
            }
        }
        ImageView imageView2 = this.f44713f;
        if (imageView2 != null) {
            imageView2.setImageResource(bVarJ.f165844a);
        }
        this.f44714g = bVarJ;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object objPrevious;
        motionEvent.getClass();
        this.f44717j.onTouchEvent(motionEvent);
        this.f44710c.b(motionEvent);
        this.f44718k.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f44708a;
        com.garmin.android.apps.connectmobile.social.share.ui.b bVar = null;
        Object obj = null;
        if (actionMasked == 0) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                Object objPrevious2 = listIterator.previous();
                com.garmin.android.apps.connectmobile.social.share.ui.b bVar2 = (com.garmin.android.apps.connectmobile.social.share.ui.b) objPrevious2;
                c.f44719c.getClass();
                c cVar = new c(motionEvent.getX(), motionEvent.getY());
                ViewGroup viewGroup = this.deleteView;
                if (viewGroup != null) {
                    Rect rect = new Rect();
                    viewGroup.getHitRect(rect);
                    if (rect.contains((int) cVar.f44720a, (int) cVar.f44721b)) {
                        continue;
                    }
                }
                if (l(bVar2, cVar)) {
                    obj = objPrevious2;
                    break;
                }
            }
            com.garmin.android.apps.connectmobile.social.share.ui.b bVar3 = (com.garmin.android.apps.connectmobile.social.share.ui.b) obj;
            this.f44711d = bVar3;
            if (bVar3 == null) {
                return false;
            }
        } else {
            if (motionEvent.getActionMasked() != 5) {
                return false;
            }
            if (this.f44711d == null) {
                c cVarI = i(motionEvent);
                ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!l((com.garmin.android.apps.connectmobile.social.share.ui.b) objPrevious, cVarI));
                com.garmin.android.apps.connectmobile.social.share.ui.b bVar4 = (com.garmin.android.apps.connectmobile.social.share.ui.b) objPrevious;
                if (bVar4 != null) {
                    this.f44712e = cVarI;
                    m(bVar4);
                    bVar = bVar4;
                }
                this.f44711d = bVar;
            }
            if (this.f44711d == null) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        this.f44717j.onTouchEvent(motionEvent);
        this.f44710c.b(motionEvent);
        this.f44718k.onTouchEvent(motionEvent);
        com.garmin.android.apps.connectmobile.social.share.ui.b bVar = this.f44711d;
        if (bVar == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c.f44719c.getClass();
            this.f44712e = new c(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        if (actionMasked == 1) {
            if (j(bVar) == to1.b.Open) {
                removeView(bVar);
                this.f44708a.remove(bVar);
                ImageView imageView = this.f44713f;
                if (imageView != null) {
                    imageView.setImageResource(2131233181);
                }
                postDelayed(new po.g(this, 25), 100L);
            } else {
                k();
            }
            ViewGroup viewGroup = this.deleteView;
            if (viewGroup != null) {
                viewGroup.setZ(getNextZValue());
            }
            b bVar2 = this.onStickerEditListener;
            if (bVar2 != null) {
                bVar2.b(bVar);
            }
            this.f44711d = null;
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.f44712e = i(motionEvent);
                return true;
            }
            if (actionMasked != 6) {
                return false;
            }
            this.f44712e = i(motionEvent);
            return true;
        }
        c cVarI = i(motionEvent);
        float f14 = cVarI.f44721b;
        float f15 = cVarI.f44720a;
        c cVar = this.f44712e;
        if (cVar == null) {
            s.m("lastTouchPoint");
            throw null;
        }
        if (f15 != cVar.f44720a || f14 != cVar.f44721b) {
            m(bVar);
        }
        float x14 = bVar.getX();
        c cVar2 = this.f44712e;
        if (cVar2 == null) {
            s.m("lastTouchPoint");
            throw null;
        }
        bVar.setX((f15 - cVar2.f44720a) + x14);
        float y14 = bVar.getY();
        c cVar3 = this.f44712e;
        if (cVar3 == null) {
            s.m("lastTouchPoint");
            throw null;
        }
        bVar.setY((f14 - cVar3.f44721b) + y14);
        this.f44712e = cVarI;
        return true;
    }

    public final void setDeleteView(ViewGroup viewGroup) {
        this.f44713f = viewGroup != null ? (ImageView) viewGroup.findViewById(R.id.trash_bin_icon) : null;
        this.deleteView = viewGroup;
    }

    public final void setOnStickerEditListener(b bVar) {
        this.onStickerEditListener = bVar;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/ui/StickerEditorView$c;", "", "", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "<init>", "(FF)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44719c = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f44720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f44721b;

        public c(float f14, float f15) {
            this.f44720a = f14;
            this.f44721b = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f44720a, cVar.f44720a) == 0 && Float.compare(this.f44721b, cVar.f44721b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f44721b) + (Float.hashCode(this.f44720a) * 31);
        }

        public final String toString() {
            return am.j.l("Point(x=", this.f44720a, ", y=", this.f44721b, ")");
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/ui/StickerEditorView$c$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/ui/StickerEditorView$a;", "", "<init>", "()V", "", "MAXIMUM_STICKER_SCALE_FACTOR", "F", "MINIMUM_STICKER_SCALE_FACTOR", "STICKER_DEFAULT_WIDTH_PERCENTAGE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StickerEditorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StickerEditorView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ StickerEditorView(Context context, AttributeSet attributeSet, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
