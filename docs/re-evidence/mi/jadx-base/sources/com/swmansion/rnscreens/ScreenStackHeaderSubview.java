package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.ReactViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public class ScreenStackHeaderSubview extends ReactViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10681b;
    public final UIManagerModule c;
    public Type d;

    public enum Type {
        LEFT,
        CENTER,
        TITLE,
        RIGHT
    }

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10683b;

        public a() {
        }
    }

    public ScreenStackHeaderSubview(ReactContext reactContext) {
        super(reactContext);
        this.d = Type.RIGHT;
        this.c = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
    }

    public Type getType() {
        return this.d;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Type type;
        Type type2;
        if (z && ((type = this.d) == (type2 = Type.CENTER) || type == Type.TITLE)) {
            a aVar = new a();
            aVar.f10682a = i3 - i;
            if (this.d == type2) {
                int width = ((View) getParent()).getWidth();
                aVar.f10682a = Math.max(0, width - (Math.max(width - i3, i) * 2));
            }
            aVar.f10683b = i4 - i2;
            this.c.setViewLocalData(getId(), aVar);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            this.f10680a = View.MeasureSpec.getSize(i);
            this.f10681b = View.MeasureSpec.getSize(i2);
            Object parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.f10680a, this.f10681b);
    }

    public void setType(Type type) {
        this.d = type;
    }
}
