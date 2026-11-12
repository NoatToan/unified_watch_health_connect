package com.facebook.react.views.slider;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import defpackage.cbe;
import defpackage.e4f;
import defpackage.g9p;
import defpackage.iej;
import defpackage.k0s;
import defpackage.l0s;
import defpackage.rej;
import defpackage.vej;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ReactSliderManager extends SimpleViewManager<ReactSlider> {
    private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new a();
    public static final String REACT_CLASS = "RCTSlider";
    private static final int STYLE = 16842875;

    public class a implements SeekBar.OnSeekBarChangeListener {
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new rej(seekBar.getId(), ((ReactSlider) seekBar).b(i), z));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new vej(seekBar.getId(), ((ReactSlider) seekBar).b(seekBar.getProgress())));
        }
    }

    public static class b extends cbe implements YogaMeasureFunction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7555b;
        public boolean c;

        public /* synthetic */ b(a aVar) {
            this();
        }

        private void a() {
            setMeasureFunction(this);
        }

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(l0s l0sVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            if (!this.c) {
                ReactSlider reactSlider = new ReactSlider(getThemedContext(), null, 16842875);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
                reactSlider.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                this.f7554a = reactSlider.getMeasuredWidth();
                this.f7555b = reactSlider.getMeasuredHeight();
                this.c = true;
            }
            return k0s.b(this.f7554a, this.f7555b);
        }

        public b() {
            a();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return e4f.d("topSlidingComplete", e4f.d("registrationName", "onSlidingComplete"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return b.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        ReactSlider reactSlider = new ReactSlider(context, null, 16842875);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
        reactSlider.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        return k0s.b(reactSlider.getMeasuredWidth(), reactSlider.getMeasuredHeight());
    }

    @iej(defaultBoolean = true, name = "enabled")
    public void setEnabled(ReactSlider reactSlider, boolean z) {
        reactSlider.setEnabled(z);
    }

    @iej(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(ReactSlider reactSlider, Integer num) {
        Drawable drawableFindDrawableByLayerId = ((LayerDrawable) reactSlider.getProgressDrawable().getCurrent()).findDrawableByLayerId(R.id.background);
        if (num == null) {
            drawableFindDrawableByLayerId.clearColorFilter();
        } else {
            drawableFindDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @iej(defaultDouble = 1.0d, name = "maximumValue")
    public void setMaximumValue(ReactSlider reactSlider, double d) {
        reactSlider.setMaxValue(d);
    }

    @iej(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(ReactSlider reactSlider, Integer num) {
        Drawable drawableFindDrawableByLayerId = ((LayerDrawable) reactSlider.getProgressDrawable().getCurrent()).findDrawableByLayerId(R.id.progress);
        if (num == null) {
            drawableFindDrawableByLayerId.clearColorFilter();
        } else {
            drawableFindDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @iej(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(ReactSlider reactSlider, double d) {
        reactSlider.setMinValue(d);
    }

    @iej(defaultDouble = 0.0d, name = "step")
    public void setStep(ReactSlider reactSlider, double d) {
        reactSlider.setStep(d);
    }

    @iej(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(ReactSlider reactSlider, Integer num) {
        if (num == null) {
            reactSlider.getThumb().clearColorFilter();
        } else {
            reactSlider.getThumb().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @iej(defaultDouble = 0.0d, name = "value")
    public void setValue(ReactSlider reactSlider, double d) {
        reactSlider.setOnSeekBarChangeListener(null);
        reactSlider.setValue(d);
        reactSlider.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(g9p g9pVar, ReactSlider reactSlider) {
        reactSlider.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public cbe createShadowNodeInstance() {
        return new b(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactSlider createViewInstance(g9p g9pVar) {
        return new ReactSlider(g9pVar, null, 16842875);
    }
}
