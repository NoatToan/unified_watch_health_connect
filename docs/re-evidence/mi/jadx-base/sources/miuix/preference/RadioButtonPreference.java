package miuix.preference;

import android.R;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.view.c;
import defpackage.alb;
import defpackage.daj;
import defpackage.eii;
import defpackage.g7i;
import defpackage.gwi;
import defpackage.k9h;
import defpackage.m80;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class RadioButtonPreference extends BaseCheckBoxPreference implements Checkable, MessageQueue.IdleHandler {
    public boolean f;
    public View g;
    public boolean h;
    public k9h i;
    public View j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Runnable f26840k;
    public CompoundButton l;

    public class a extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f26841a;

        public a(View view) {
            this.f26841a = view;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.g0(true);
            m80Var.h0(RadioButtonPreference.this.isChecked());
            StringBuilder sb = new StringBuilder();
            if (RadioButtonPreference.this.g instanceof TextView) {
                RadioButtonPreference.this.g.setImportantForAccessibility(2);
                sb.append(((TextView) RadioButtonPreference.this.g).getText());
            }
            View view2 = this.f26841a;
            if (view2 instanceof TextView) {
                view2.setImportantForAccessibility(2);
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(((TextView) this.f26841a).getText());
            }
            if (sb.length() > 0) {
                m80Var.m0(sb.toString());
            }
            m80Var.i0(RadioButton.class.getName());
            m80Var.j0(true ^ RadioButtonPreference.this.isChecked());
            if (RadioButtonPreference.this.isChecked()) {
                m80Var.a0(m80.a.i);
            }
        }
    }

    public RadioButtonPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = true;
        Looper.myQueue().addIdleHandler(this);
    }

    private void k(View view, View view2) {
        c.r0(view, new a(view2));
    }

    private void l(CompoundButton compoundButton, boolean z) {
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable instanceof StateListDrawable) {
            Drawable current = buttonDrawable.getCurrent();
            if (current instanceof AnimatedVectorDrawable) {
                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) current;
                if (z) {
                    if (animatedVectorDrawable.isRunning()) {
                        animatedVectorDrawable.stop();
                        animatedVectorDrawable.reset();
                    }
                    animatedVectorDrawable.start();
                    return;
                }
                if (animatedVectorDrawable.isRunning()) {
                    return;
                }
                animatedVectorDrawable.start();
                daj dajVar = new daj(animatedVectorDrawable);
                this.f26840k = dajVar;
                compoundButton.post(dajVar);
            }
        }
    }

    @Override // androidx.preference.Preference
    public boolean callChangeListener(Object obj) {
        k9h k9hVar = this.i;
        boolean z = (k9hVar == null || k9hVar.b(this, obj)) && super.callChangeListener(obj);
        if (!z && this.f) {
            this.f = false;
        }
        return z;
    }

    @Override // androidx.preference.Preference
    public void notifyChanged() {
        super.notifyChanged();
        k9h k9hVar = this.i;
        if (k9hVar != null) {
            k9hVar.a(this);
        }
    }

    @Override // androidx.preference.Preference
    public void onAttached() {
        super.onAttached();
        if (getParent() instanceof RadioSetPreferenceCategory) {
            setLayoutResource(gwi.d);
        } else {
            setLayoutResource(gwi.f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.preference.BaseCheckBoxPreference, androidx.preference.CheckBoxPreference, androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        super.onBindViewHolder(g7iVar);
        View view = g7iVar.itemView;
        this.j = view;
        View viewFindViewById = view.findViewById(R.id.title);
        this.g = viewFindViewById;
        if ((viewFindViewById instanceof TextView) && Build.VERSION.SDK_INT >= 28) {
            ((TextView) viewFindViewById).setFallbackLineSpacing(this.h);
        }
        KeyEvent.Callback callback = this.g;
        if (callback instanceof Checkable) {
            ((Checkable) callback).setChecked(isChecked());
        }
        View viewFindViewById2 = view.findViewById(R.id.summary);
        if (viewFindViewById2 instanceof Checkable) {
            ((Checkable) viewFindViewById2).setChecked(isChecked());
        }
        View viewFindViewById3 = view.findViewById(R.id.checkbox);
        if (viewFindViewById3 != null && (viewFindViewById3 instanceof CompoundButton) && isChecked()) {
            CompoundButton compoundButton = (CompoundButton) viewFindViewById3;
            this.l = compoundButton;
            l(compoundButton, this.f);
            this.f = false;
        }
        if (b()) {
            if (viewFindViewById3 != null) {
                viewFindViewById3.setImportantForAccessibility(2);
            }
            k(view, viewFindViewById2);
        }
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    public void onClick() {
        View view;
        this.f = true;
        super.onClick();
        if (!this.f || (view = this.j) == null) {
            return;
        }
        HapticCompat.performHapticFeedbackAsync(view, alb.A, alb.f);
    }

    @Override // androidx.preference.Preference
    public void onDetached() {
        super.onDetached();
        Looper.myQueue().removeIdleHandler(this);
        getSharedPreferences().edit().remove(getKey()).apply();
        CompoundButton compoundButton = this.l;
        if (compoundButton != null) {
            compoundButton.removeCallbacks(this.f26840k);
            this.l = null;
        }
        this.f26840k = null;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        return false;
    }

    public void setOnPreferenceChangeInternalListener(k9h k9hVar) {
        this.i = k9hVar;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public RadioButtonPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eii.y);
    }

    public RadioButtonPreference(Context context) {
        this(context, null);
    }
}
