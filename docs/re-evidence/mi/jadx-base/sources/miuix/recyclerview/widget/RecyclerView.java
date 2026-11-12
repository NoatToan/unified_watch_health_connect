package miuix.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.SpringRecyclerView;
import defpackage.aza;
import defpackage.nii;
import defpackage.o5g;

/* JADX INFO: loaded from: classes3.dex */
public class RecyclerView extends SpringRecyclerView {
    public final aza s;

    public RecyclerView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        aza azaVar = this.s;
        if (azaVar != null && Build.VERSION.SDK_INT >= 30) {
            azaVar.i(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        if (Math.abs(i) < 300) {
            i = 0;
        }
        if (Math.abs(i2) < 300) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        return super.fling(i, i2);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        aza azaVar = this.s;
        if (azaVar == null || Build.VERSION.SDK_INT < 30) {
            return;
        }
        azaVar.f(z);
    }

    @Override // androidx.recyclerview.widget.SpringRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        aza azaVar = this.s;
        if (azaVar == null || Build.VERSION.SDK_INT < 30) {
            return;
        }
        azaVar.g(this, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        aza azaVar = this.s;
        if (azaVar != null && Build.VERSION.SDK_INT >= 30) {
            azaVar.b(i, i2, getDragFlingVelocityX(), getDragFlingVelocityY());
        }
        super.onScrolled(i, i2);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nii.f27963a);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setItemAnimator(new o5g());
        if (Build.VERSION.SDK_INT > 30) {
            this.s = new aza(this);
        } else {
            this.s = null;
        }
    }
}
