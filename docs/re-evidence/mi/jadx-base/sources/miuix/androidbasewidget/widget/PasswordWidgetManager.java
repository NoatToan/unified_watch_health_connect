package miuix.androidbasewidget.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.Switch;
import defpackage.hm1;
import defpackage.m80;
import defpackage.ni4;
import defpackage.xoi;
import defpackage.y1j;
import defpackage.yhi;

/* JADX INFO: loaded from: classes3.dex */
public class PasswordWidgetManager extends StateEditText.WidgetManager {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private Context mContext;
    private boolean mIsChecked;
    private StateEditText mMaster;
    private Drawable mWidgetDrawable;

    public PasswordWidgetManager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        this.mIsChecked = false;
        Drawable drawableH = hm1.h(context, yhi.d);
        this.mWidgetDrawable = drawableH;
        if (drawableH == null) {
            if (hm1.d(context, R.attr.isLightTheme, true)) {
                this.mWidgetDrawable = ni4.e(context, xoi.f39316b);
            } else {
                this.mWidgetDrawable = ni4.e(context, xoi.f39315a);
            }
        }
    }

    @Override // miuix.androidbasewidget.widget.StateEditText.WidgetManager
    public Drawable[] getWidgetDrawables() {
        return new Drawable[]{this.mWidgetDrawable};
    }

    @Override // miuix.androidbasewidget.widget.StateEditText.WidgetManager
    public void onAttached(StateEditText stateEditText) {
        this.mMaster = stateEditText;
        if (stateEditText != null) {
            stateEditText.setTransformationMethod(this.mIsChecked ? HideReturnsTransformationMethod.getInstance() : PasswordTransformationMethod.getInstance());
        }
    }

    @Override // miuix.androidbasewidget.widget.StateEditText.WidgetManager
    public void onDetached() {
        super.onDetached();
        StateEditText stateEditText = this.mMaster;
        if (stateEditText != null) {
            stateEditText.setTransformationMethod(null);
        }
    }

    @Override // miuix.androidbasewidget.widget.StateEditText.WidgetManager
    public void onPopulateNodeForVirtualView(int i, m80 m80Var) {
        m80Var.g0(true);
        m80Var.h0(this.mIsChecked);
        m80Var.i0(Switch.class.getName());
        m80Var.m0(this.mContext.getString(y1j.c));
    }

    @Override // miuix.androidbasewidget.widget.StateEditText.WidgetManager
    public void onWidgetClick(int i) {
        this.mIsChecked = !this.mIsChecked;
        StateEditText stateEditText = this.mMaster;
        if (stateEditText != null) {
            int selectionStart = stateEditText.getSelectionStart();
            int selectionEnd = this.mMaster.getSelectionEnd();
            this.mMaster.setTransformationMethod(this.mIsChecked ? HideReturnsTransformationMethod.getInstance() : PasswordTransformationMethod.getInstance());
            this.mMaster.setTextDirection(2);
            this.mMaster.setSelection(selectionStart, selectionEnd);
        }
        this.mWidgetDrawable.setState(this.mIsChecked ? CHECKED_STATE_SET : new int[0]);
    }
}
