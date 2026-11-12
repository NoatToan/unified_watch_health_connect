package com.garmin.android.apps.connectmobile.golf.truswing.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.ToggleButton;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.golf.truswing.f;
import com.garmin.android.apps.connectmobile.golf.truswing.model.h;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.golfswing.GolfSwingViewManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class SwingAnimationControlView extends LinearLayout implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f35999i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SwingSeekBar f36000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ToggleButton f36001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ToggleButton f36002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ToggleButton f36003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f36004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f36005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f36007h;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            int id3 = compoundButton.getId();
            SwingAnimationControlView swingAnimationControlView = SwingAnimationControlView.this;
            if (id3 == R.id.golf_swing_slow_motion_button) {
                ((f) swingAnimationControlView.f36005f).getClass();
                GolfSwingViewManager.getInstance().setSlowMotion(z14);
                return;
            }
            if (id3 != R.id.golf_swing_play_button) {
                a2 a2Var = a2.GOLF;
                int i14 = SwingAnimationControlView.f35999i;
                i2.a(a2Var, "SwingAnimationControlView", "View Id " + compoundButton.getId() + "not recognized");
                return;
            }
            int i15 = swingAnimationControlView.f36006g;
            if (i15 == 0) {
                ((f) swingAnimationControlView.f36005f).getClass();
                GolfSwingViewManager.getInstance().startPlay();
                return;
            }
            if (i15 < 100) {
                b bVar = swingAnimationControlView.f36005f;
                if (z14) {
                    ((f) bVar).getClass();
                    GolfSwingViewManager.getInstance().resumePlay();
                    return;
                } else {
                    ((f) bVar).getClass();
                    GolfSwingViewManager.getInstance().pausePlay();
                    return;
                }
            }
            if (i15 == 100) {
                if (z14) {
                    swingAnimationControlView.f36000a.setProgress(0);
                    ((f) swingAnimationControlView.f36005f).getClass();
                    GolfSwingViewManager.getInstance().startPlay();
                } else {
                    f fVar = (f) swingAnimationControlView.f36005f;
                    fVar.f35838j = true;
                    fVar.f35837i.removeCallbacksAndMessages(fVar.f35839k);
                }
            }
        }
    }

    public interface b {
    }

    public SwingAnimationControlView(Context context) {
        super(context);
        this.f36006g = 0;
        this.f36007h = new a();
        b();
    }

    public static ArrayList a(float[] fArr, int i14) {
        ArrayList arrayList = new ArrayList();
        for (float f14 : fArr) {
            arrayList.add(new h(f14 * 100.0f, i14));
        }
        return arrayList;
    }

    public final void b() {
        LayoutInflater.from(getContext()).inflate(R.layout.gcm_golf_swing_animation_controls_layout, (ViewGroup) this, true);
        SwingSeekBar swingSeekBar = (SwingSeekBar) findViewById(R.id.golf_swing_slider);
        this.f36000a = swingSeekBar;
        swingSeekBar.setMax(100);
        this.f36000a.setOnSeekBarChangeListener(this);
        this.f36000a.setProgressDrawable(getResources().getDrawable(R.drawable.swing_animation_seekbar));
        this.f36001b = (ToggleButton) findViewById(R.id.golf_swing_play_button);
        this.f36002c = (ToggleButton) findViewById(R.id.golf_swing_slow_motion_button);
        this.f36003d = (ToggleButton) findViewById(R.id.golf_swing_loop_button);
        View viewFindViewById = findViewById(R.id.golf_swing_timeline_control_container);
        this.f36004e = viewFindViewById;
        viewFindViewById.setOnClickListener(null);
        this.f36004e.setOnTouchListener(null);
        this.f36004e.setVisibility(0);
        ToggleButton toggleButton = this.f36002c;
        a aVar = this.f36007h;
        toggleButton.setOnCheckedChangeListener(aVar);
        this.f36001b.setOnCheckedChangeListener(aVar);
        this.f36003d.setOnCheckedChangeListener(aVar);
    }

    public final void c(float[] fArr, float[] fArr2) {
        if (fArr != null) {
            this.f36000a.f36009a = a(fArr, fArr2 != null ? R.color.gcm_golf_compare_value1 : R.color.gcm_golf_seekbar_marker);
        }
        if (fArr2 != null) {
            this.f36000a.f36010b = a(fArr2, R.color.gcm_golf_compare_value2);
        }
        if (fArr != null || fArr2 != null) {
            this.f36000a.invalidate();
            return;
        }
        SwingSeekBar swingSeekBar = this.f36000a;
        swingSeekBar.f36009a = null;
        swingSeekBar.f36010b = null;
        swingSeekBar.invalidate();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i14, boolean z14) {
        this.f36006g = i14;
        if (z14) {
            GolfSwingViewManager.getInstance().setSwingProgress(i14 / 100.0f);
            setPlayButtonState(false);
        }
        if (this.f36006g == 100) {
            if (!this.f36003d.isChecked() || !this.f36001b.isChecked()) {
                setPlayButtonState(false);
                return;
            }
            f fVar = (f) this.f36005f;
            fVar.f35838j = false;
            fVar.f35837i.postDelayed(fVar.f35839k, 1000L);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z14) {
        this.f36001b.setEnabled(z14);
        this.f36003d.setEnabled(z14);
        this.f36002c.setEnabled(z14);
        this.f36000a.setEnabled(z14);
        this.f36000a.getThumb().mutate().setAlpha(z14 ? 255 : 0);
    }

    public void setLoopMode(boolean z14) {
        this.f36003d.setChecked(z14);
    }

    public void setPlayButtonState(boolean z14) {
        this.f36001b.setOnCheckedChangeListener(null);
        this.f36001b.setChecked(z14);
        this.f36001b.setOnCheckedChangeListener(this.f36007h);
    }

    public void setSlowMotionMode(boolean z14) {
        this.f36002c.setChecked(z14);
    }

    public void setSwingAnimationControlListener(b bVar) {
        this.f36005f = bVar;
    }

    public SwingAnimationControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36006g = 0;
        this.f36007h = new a();
        b();
    }

    public SwingAnimationControlView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f36006g = 0;
        this.f36007h = new a();
        b();
    }
}
