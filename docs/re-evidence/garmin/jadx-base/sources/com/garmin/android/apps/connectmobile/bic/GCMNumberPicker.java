package com.garmin.android.apps.connectmobile.bic;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.NumberPicker;
import c22.b;
import com.garmin.android.apps.connectmobile.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class GCMNumberPicker extends NumberPicker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f30712c;

    public GCMNumberPicker(Context context) {
        super(context);
        a();
    }

    public final void a() {
        setDescendantFocusability(393216);
        if (this.f30712c == null) {
            this.f30712c = new ArrayList();
        }
        if (b.a(getContext()) > 1.3f) {
            this.f30710a = R.dimen.andfont_body_2;
        } else {
            this.f30710a = R.dimen.andfont_h_3;
        }
        this.f30711b = R.color.gcm_text_primary;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view2) {
        super.addView(view2);
        b(view2);
    }

    public final void b(View view2) {
        if (this.f30712c == null) {
            a();
        }
        if (view2 instanceof EditText) {
            EditText editText = (EditText) view2;
            this.f30712c.add(editText);
            editText.setTextSize(0, getResources().getDimension(this.f30710a));
            editText.setTextColor(getResources().getColor(this.f30711b, getContext().getTheme()));
        }
    }

    public void setTextColorResId(int i14) {
        this.f30711b = i14;
        int color = a7.b.getColor(getContext(), i14);
        if (Build.VERSION.SDK_INT >= 29) {
            setTextColor(color);
            return;
        }
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof EditText) {
                try {
                    ((EditText) childAt).setTextColor(color);
                    Field declaredField = getClass().getSuperclass().getDeclaredField("mSelectorWheelPaint");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this);
                    obj.getClass();
                    ((Paint) obj).setColor(color);
                    invalidate();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    public void setTextDimenResId(int i14) {
        this.f30710a = i14;
        ArrayList arrayList = this.f30712c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((EditText) it.next()).setTextSize(0, getResources().getDimension(this.f30710a));
            }
        }
    }

    public GCMNumberPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view2, int i14, ViewGroup.LayoutParams layoutParams) {
        super.addView(view2, i14, layoutParams);
        b(view2);
    }

    public GCMNumberPicker(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view2, layoutParams);
        b(view2);
    }

    public GCMNumberPicker(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        a();
    }
}
