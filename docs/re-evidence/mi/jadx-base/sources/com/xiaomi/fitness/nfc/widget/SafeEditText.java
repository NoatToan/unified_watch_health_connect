package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import defpackage.f9l;
import defpackage.r4j;
import defpackage.rji;
import defpackage.u70;

/* JADX INFO: loaded from: classes9.dex */
public class SafeEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View.OnTouchListener f12656a;

    public class a implements ActionMode.Callback {
        public a() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    public SafeEditText(Context context) {
        this(context, null, 0);
    }

    private void a() {
        setCustomSelectionActionModeCallback(new a());
        setLongClickable(false);
    }

    public void b(int i, boolean z) {
        f9l.p(this, z);
        setFocusableInTouchMode(true);
        setTextIsSelectable(true);
        setExtendedInputType(i);
        setShowSoftInputOnFocus(false);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f12656a != null && u70.a().b(getContext())) {
            MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
            this.f12656a.onTouch(this, motionEventObtain);
            motionEventObtain.recycle();
            MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
            this.f12656a.onTouch(this, motionEventObtain2);
            motionEventObtain2.recycle();
        }
        return super.performClick();
    }

    public void setExtendedInputType(int i) {
        Bundle inputExtras = getInputExtras(true);
        if (inputExtras == null) {
            return;
        }
        inputExtras.putInt("com.tsmclient.input_extra.extended_input_type", i);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        super.setOnTouchListener(onTouchListener);
        this.f12656a = onTouchListener;
    }

    public SafeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SafeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r4j.g5);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(r4j.j5, true);
        int i2 = typedArrayObtainStyledAttributes.getInt(r4j.h5, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(r4j.i5, true);
        typedArrayObtainStyledAttributes.recycle();
        setHintTextColor(getResources().getColor(rji.l));
        if (z) {
            b(i2, z2);
        }
        a();
    }
}
