package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class xwr implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f39538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WindowManager f39539b;
    public final List<View> c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public View.OnClickListener j;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final xwr f39540a = new xwr();
    }

    public static xwr c() {
        return b.f39540a;
    }

    public static int d(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public final WindowManager.LayoutParams a(View view, int i, int i2) {
        if (view == null || view.getParent() != null) {
            return null;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f39539b = (WindowManager) this.f39538a.getSystemService("window");
        layoutParams.type = 2038;
        layoutParams.format = 1;
        layoutParams.flags = 8;
        layoutParams.gravity = 8388659;
        layoutParams.width = i;
        layoutParams.height = i2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f39539b.getDefaultDisplay().getMetrics(displayMetrics);
        layoutParams.x = displayMetrics.widthPixels;
        layoutParams.y = (displayMetrics.heightPixels / 2) - d(this.f39538a);
        this.f39539b.addView(view, layoutParams);
        return layoutParams;
    }

    public final boolean b(View view, MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.d = motionEvent.getX();
            this.e = motionEvent.getY();
            this.f = motionEvent.getRawX();
            this.g = motionEvent.getRawY() - d(this.f39538a);
            this.h = motionEvent.getRawX();
            this.i = motionEvent.getRawY() - d(this.f39538a);
        } else if (action != 1) {
            if (action == 2) {
                this.h = motionEvent.getRawX();
                this.i = motionEvent.getRawY() - d(this.f39538a);
                if (view.getTag() instanceof WindowManager.LayoutParams) {
                    WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getTag();
                    layoutParams.x = (int) (this.h - this.d);
                    layoutParams.y = (int) (this.i - this.e);
                    if (f(view)) {
                        this.f39539b.updateViewLayout(view, layoutParams);
                    }
                }
            }
        } else if (this.f == this.h && this.g == this.i && (onClickListener = this.j) != null) {
            onClickListener.onClick(view);
        }
        return true;
    }

    public void e(View view) {
        if (view != null) {
            try {
                if (view.getParent() == null || !this.c.contains(view)) {
                    return;
                }
                this.f39539b.removeView(view);
                this.c.remove(view);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean f(View view) {
        return this.c.contains(view);
    }

    public void g(Context context, View view, int i, int i2) {
        if (context == null || view == null) {
            return;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f39538a = context;
        this.c.add(view);
        view.setOnTouchListener(this);
        view.setTag(a(view, i, i2));
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return b(view, motionEvent);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.j = onClickListener;
    }

    public xwr() {
        this.c = new ArrayList();
    }
}
