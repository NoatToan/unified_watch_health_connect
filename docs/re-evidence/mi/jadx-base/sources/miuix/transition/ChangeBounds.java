package miuix.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.miui.tsmclient.net.TSMAuthContants;
import defpackage.dyq;
import defpackage.u5j;
import java.lang.ref.WeakReference;
import java.util.Map;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.IIntValueProperty;
import miuix.animation.property.ViewProperty;

/* JADX INFO: loaded from: classes3.dex */
public class ChangeBounds extends a {
    public static Map<String, ViewProperty> G;
    public static final String[] H;
    public boolean A;
    public int[] B;
    public final LeftProperty C;
    public final TopProperty D;
    public final RightProperty E;
    public final BottomProperty F;

    /* JADX INFO: renamed from: miuix.transition.ChangeBounds$1, reason: invalid class name */
    class AnonymousClass1 extends TransitionListener {
        final /* synthetic */ AnimConfig val$listener;

        public AnonymousClass1(AnimConfig animConfig) {
            this.val$listener = animConfig;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj) {
            if (obj == "changebounds_end") {
                ChangeBounds changeBounds = ChangeBounds.this;
                if (changeBounds.v == 0) {
                    changeBounds.c();
                }
                ChangeBounds.this.v++;
            }
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            if (obj == "changebounds_end") {
                ChangeBounds changeBounds = ChangeBounds.this;
                int i = changeBounds.v - 1;
                changeBounds.v = i;
                if (i == 0) {
                    this.val$listener.removeListeners(this);
                    ChangeBounds.this.b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: miuix.transition.ChangeBounds$2, reason: invalid class name */
    class AnonymousClass2 extends TransitionListener {
        final /* synthetic */ AnimConfig val$listener;
        final /* synthetic */ ViewGroup val$parent;

        public AnonymousClass2(AnimConfig animConfig, ViewGroup viewGroup) {
            this.val$listener = animConfig;
            this.val$parent = viewGroup;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            if (obj == "changebounds_end") {
                this.val$listener.removeListeners(this);
                this.val$parent.suppressLayout(false);
            }
        }
    }

    /* JADX INFO: renamed from: miuix.transition.ChangeBounds$3, reason: invalid class name */
    class AnonymousClass3 extends TransitionListener {
        final /* synthetic */ float val$alpha;
        final /* synthetic */ View val$copy;
        final /* synthetic */ AnimConfig val$listener;
        final /* synthetic */ ViewGroup val$sceneRoot;
        final /* synthetic */ View val$view;

        public AnonymousClass3(AnimConfig animConfig, ViewGroup viewGroup, View view, View view2, float f) {
            this.val$listener = animConfig;
            this.val$sceneRoot = viewGroup;
            this.val$copy = view;
            this.val$view = view2;
            this.val$alpha = f;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            if (obj == "changebounds_end") {
                this.val$listener.removeListeners(this);
                this.val$sceneRoot.getOverlay().remove(this.val$copy);
                this.val$view.setAlpha(this.val$alpha);
            }
        }
    }

    public static class BottomProperty extends ViewProperty implements IIntValueProperty<ViewBounds> {
        public BottomProperty() {
            super("bottom");
        }

        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return 0.0f;
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f) {
        }

        @Override // miuix.animation.property.IIntValueProperty
        public int getIntValue(ViewBounds viewBounds) {
            return viewBounds.getBottom();
        }

        @Override // miuix.animation.property.IIntValueProperty
        public void setIntValue(ViewBounds viewBounds, int i) {
            viewBounds.setBottom(i);
        }
    }

    public static class LeftProperty extends ViewProperty implements IIntValueProperty<ViewBounds> {
        public LeftProperty() {
            super("left");
        }

        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return 0.0f;
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f) {
        }

        @Override // miuix.animation.property.IIntValueProperty
        public int getIntValue(ViewBounds viewBounds) {
            return viewBounds.getLeft();
        }

        @Override // miuix.animation.property.IIntValueProperty
        public void setIntValue(ViewBounds viewBounds, int i) {
            viewBounds.setLeft(i);
        }
    }

    public static class RightProperty extends ViewProperty implements IIntValueProperty<ViewBounds> {
        public RightProperty() {
            super(TSMAuthContants.PARAM_KEY_RIGHT);
        }

        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return 0.0f;
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f) {
        }

        @Override // miuix.animation.property.IIntValueProperty
        public int getIntValue(ViewBounds viewBounds) {
            return viewBounds.getRight();
        }

        @Override // miuix.animation.property.IIntValueProperty
        public void setIntValue(ViewBounds viewBounds, int i) {
            viewBounds.setRight(i);
        }
    }

    public static class TopProperty extends ViewProperty implements IIntValueProperty<ViewBounds> {
        public TopProperty() {
            super("top");
        }

        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return 0.0f;
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f) {
        }

        @Override // miuix.animation.property.IIntValueProperty
        public int getIntValue(ViewBounds viewBounds) {
            return viewBounds.getTop();
        }

        @Override // miuix.animation.property.IIntValueProperty
        public void setIntValue(ViewBounds viewBounds, int i) {
            viewBounds.setTop(i);
        }
    }

    public static class ViewBounds {
        private WeakReference<View> mView;
        int left = -1;
        int top = -1;
        int right = -1;
        int bottom = -1;

        public ViewBounds(View view) {
            this.mView = new WeakReference<>(view);
        }

        private void setLeftTopRightBottom() {
            View view = this.mView.get();
            if (view != null) {
                if (!(view instanceof TextView)) {
                    dyq.j(view, this.left, this.top, this.right, this.bottom);
                } else {
                    view.measure(View.MeasureSpec.makeMeasureSpec(this.right - this.left, 1073741824), View.MeasureSpec.makeMeasureSpec(this.bottom - this.top, 1073741824));
                    view.layout(this.left, this.top, this.right, this.bottom);
                }
            }
        }

        public int getBottom() {
            return this.bottom;
        }

        public int getLeft() {
            return this.left;
        }

        public int getRight() {
            return this.right;
        }

        public int getTop() {
            return this.top;
        }

        public void setBottom(int i) {
            if (this.bottom != i) {
                this.bottom = i;
                setLeftTopRightBottom();
            }
        }

        public void setLeft(int i) {
            if (this.left != i) {
                this.left = i;
                setLeftTopRightBottom();
            }
        }

        public void setRight(int i) {
            if (this.right != i) {
                this.right = i;
                setLeftTopRightBottom();
            }
        }

        public void setTop(int i) {
            if (this.top != i) {
                this.top = i;
                setLeftTopRightBottom();
            }
        }
    }

    static {
        ArrayMap arrayMap = new ArrayMap();
        G = arrayMap;
        H = new String[]{"android:transition:bounds", "android:transition:parent", "android:transition:windowX", "android:transition:windowY"};
        arrayMap.put("android:transition:x", ViewProperty.X);
        G.put("android:transition:y", ViewProperty.Y);
        G.put("android:transition:width", ViewProperty.WIDTH);
        G.put("android:transition:height", ViewProperty.HEIGHT);
    }

    public ChangeBounds() {
        this.A = false;
        this.B = new int[2];
        this.C = new LeftProperty();
        this.D = new TopProperty();
        this.E = new RightProperty();
        this.F = new BottomProperty();
    }

    public ChangeBounds e(boolean z) {
        this.A = z;
        return this;
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = false;
        this.B = new int[2];
        this.C = new LeftProperty();
        this.D = new TopProperty();
        this.E = new RightProperty();
        this.F = new BottomProperty();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u5j.f35428b);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(u5j.c, false);
        typedArrayObtainStyledAttributes.recycle();
        e(z);
    }
}
