package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.b4s;
import defpackage.f9l;
import defpackage.mri;
import defpackage.o0j;
import defpackage.r4j;
import defpackage.u70;
import defpackage.w8q;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class SafeKeyboardView extends LinearLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f12658r = {mri.g2, mri.h2, mri.i2, mri.j2, mri.k2, mri.l2, mri.m2, mri.n2, mri.o2, mri.p2, mri.r2};
    public static final List<Pair<String, String>> s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageButton f12660b;
    public ImageView c;
    public boolean d;
    public Drawable e;
    public boolean f;
    public View g;
    public InputConnection h;
    public com.xiaomi.fitness.nfc.widget.c i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12661k;
    public Handler l;
    public Runnable m;
    public View.OnTouchListener n;
    public View.OnClickListener o;
    public View.OnClickListener p;
    public com.xiaomi.fitness.nfc.widget.c.b q;

    public class a implements View.OnLongClickListener {
        public a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SafeKeyboardView.this.l != null) {
                return true;
            }
            SafeKeyboardView.this.l = new Handler();
            SafeKeyboardView.this.l.post(SafeKeyboardView.this.m);
            return true;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            KeyEvent keyEvent = new KeyEvent(0, SafeKeyboardView.this.m(view));
            KeyEvent keyEvent2 = new KeyEvent(1, SafeKeyboardView.this.m(view));
            SafeKeyboardView.this.h.sendKeyEvent(keyEvent);
            SafeKeyboardView.this.h.sendKeyEvent(keyEvent2);
        }
    }

    public class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                SafeKeyboardView.this.h.sendKeyEvent(new KeyEvent(0, SafeKeyboardView.this.m(view)));
            } else if (action == 1 || action == 3) {
                SafeKeyboardView.this.h.sendKeyEvent(new KeyEvent(1, SafeKeyboardView.this.m(view)));
                if (SafeKeyboardView.this.l != null) {
                    SafeKeyboardView.this.l.removeCallbacks(SafeKeyboardView.this.m);
                    SafeKeyboardView.this.l = null;
                }
            }
            return false;
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SafeKeyboardView safeKeyboardView = SafeKeyboardView.this;
            SafeKeyboardView.this.h.sendKeyEvent(new KeyEvent(0, safeKeyboardView.m(safeKeyboardView.f12660b)));
            SafeKeyboardView safeKeyboardView2 = SafeKeyboardView.this;
            SafeKeyboardView.this.h.sendKeyEvent(new KeyEvent(1, safeKeyboardView2.m(safeKeyboardView2.f12660b)));
            SafeKeyboardView.this.l.postDelayed(this, ViewConfiguration.getKeyRepeatDelay());
        }
    }

    public class e implements View.OnTouchListener {
        public e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            KeyEvent keyEvent;
            if (motionEvent.getAction() == 0) {
                keyEvent = new KeyEvent(0, SafeKeyboardView.this.m(view));
            } else {
                keyEvent = motionEvent.getAction() == 1 ? new KeyEvent(1, SafeKeyboardView.this.m(view)) : null;
            }
            if (keyEvent != null && SafeKeyboardView.this.h != null) {
                SafeKeyboardView.this.h.sendKeyEvent(keyEvent);
            }
            return false;
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            KeyEvent keyEvent = new KeyEvent(0, SafeKeyboardView.this.m(view));
            KeyEvent keyEvent2 = new KeyEvent(1, SafeKeyboardView.this.m(view));
            if (SafeKeyboardView.this.h != null) {
                SafeKeyboardView.this.h.sendKeyEvent(keyEvent);
                SafeKeyboardView.this.h.sendKeyEvent(keyEvent2);
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SafeKeyboardView.this.n();
        }
    }

    public class h implements com.xiaomi.fitness.nfc.widget.c.b {
        public h() {
        }

        @Override // com.xiaomi.fitness.nfc.widget.c.b
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z) {
                f9l.n(true);
                SafeKeyboardView.this.f12661k = true;
                return;
            }
            SafeKeyboardView.this.f12661k = false;
            if (!SafeKeyboardView.this.j) {
                f9l.n(false);
            } else {
                SafeKeyboardView.this.s();
                SafeKeyboardView.this.j = false;
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        s = arrayList;
        arrayList.add(new Pair("1", UserConfig.KEY_MI_BRAIN_SETTING));
        arrayList.add(new Pair("2", UserConfig.KEY_LITE_SCENE_ORDER));
        arrayList.add(new Pair("3", b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD));
        arrayList.add(new Pair("4", b4s.APPLY_CHANNEL_TOKEN2_QUICK_BIND_CARD));
        arrayList.add(new Pair(UserConfig.KEY_DEVICE_LITE_SORT_GROUP, "12"));
        arrayList.add(new Pair("6", "13"));
        arrayList.add(new Pair(UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP, "14"));
        arrayList.add(new Pair(UserConfig.KEY_MI_BRAIN_SETTING, "15"));
        arrayList.add(new Pair(UserConfig.KEY_LITE_SCENE_ORDER, "16"));
        arrayList.add(new Pair("0", UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP));
    }

    public SafeKeyboardView(Context context) {
        super(context);
        this.d = false;
        this.m = new d();
        this.n = new e();
        this.o = new f();
        this.p = new g();
        this.q = new h();
    }

    public void k(View view) {
        this.g = view;
        EditorInfo editorInfo = new EditorInfo();
        this.h = view.onCreateInputConnection(editorInfo);
        Bundle bundle = editorInfo.extras;
        t(bundle != null ? bundle.getInt("com.tsmclient.input_extra.extended_input_type") : 0);
    }

    public void l() {
        this.g = null;
    }

    public final int m(View view) {
        return Integer.parseInt((String) view.getTag());
    }

    public void n() {
        setVisibility(8);
        setEnabled(false);
        f9l.n(false);
    }

    public final void o() {
        int i = 0;
        while (true) {
            int[] iArr = f12658r;
            if (i >= iArr.length) {
                break;
            }
            View viewFindViewById = findViewById(iArr[i]);
            if (u70.a().b(getContext())) {
                viewFindViewById.setOnClickListener(this.o);
            } else {
                viewFindViewById.setOnTouchListener(this.n);
                viewFindViewById.setOnClickListener(null);
            }
            i++;
        }
        View viewFindViewById2 = findViewById(mri.t2);
        this.f12659a = (TextView) findViewById(mri.r2);
        this.f12660b = (ImageButton) findViewById(mri.q2);
        this.c = (ImageView) findViewById(mri.P1);
        Drawable drawable = this.e;
        if (drawable != null) {
            viewFindViewById2.setBackground(drawable);
        }
        if (q()) {
            viewFindViewById2.setOnClickListener(this.p);
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(4);
        }
        this.f12660b.setOnLongClickListener(new a());
        if (u70.a().b(getContext())) {
            this.f12660b.setOnClickListener(new b());
        } else {
            this.f12660b.setOnTouchListener(new c());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.i.d();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        o();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        View view;
        if (i == 0 && (view = this.g) != null) {
            f9l.f(view, this.d);
            if (isShown()) {
                f9l.n(true);
            }
        }
        super.onWindowVisibilityChanged(i);
    }

    public boolean p(View view) {
        View view2 = this.g;
        return view2 != null && view2 == view;
    }

    public boolean q() {
        return this.f;
    }

    public void r(View view) {
        k(view);
        if (!this.f12661k) {
            s();
        } else {
            this.j = true;
            w8q.d(view.getContext(), view, false);
        }
    }

    public final void s() {
        ArrayList arrayList = new ArrayList(s);
        int i = 0;
        while (true) {
            int[] iArr = f12658r;
            if (i >= iArr.length) {
                break;
            }
            TextView textView = (TextView) findViewById(iArr[i]);
            int iRandom = (int) (Math.random() * ((double) arrayList.size()));
            if (arrayList.size() == 0) {
                break;
            }
            Pair pair = (Pair) arrayList.remove(iRandom);
            textView.setText((CharSequence) pair.first);
            textView.setTag(pair.second);
            i++;
        }
        if (this.g != null) {
            setVisibility(0);
            setTranslationY(0.0f);
            setEnabled(true);
            this.g.requestFocus();
            f9l.n(true);
        }
    }

    public void setNeedReorder(boolean z) {
        this.d = z;
    }

    public final void t(int i) {
        if (i == 0) {
            this.f12659a.setEnabled(false);
            this.f12659a.setText("");
        } else if (i == 1) {
            this.f12659a.setEnabled(true);
            this.f12659a.setText(getContext().getString(o0j.Y3));
            this.f12659a.setTag(String.valueOf(52));
        } else {
            if (i != 2) {
                return;
            }
            this.f12659a.setEnabled(true);
            this.f12659a.setText(getContext().getString(o0j.g3));
            this.f12659a.setTag(String.valueOf(158));
        }
    }

    public SafeKeyboardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SafeKeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
        this.m = new d();
        this.n = new e();
        this.o = new f();
        this.p = new g();
        this.q = new h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r4j.k5);
        this.e = typedArrayObtainStyledAttributes.getDrawable(r4j.l5);
        this.f = typedArrayObtainStyledAttributes.getBoolean(r4j.m5, true);
        typedArrayObtainStyledAttributes.recycle();
        com.xiaomi.fitness.nfc.widget.c cVar = new com.xiaomi.fitness.nfc.widget.c(this);
        this.i = cVar;
        cVar.e(this.q);
    }
}
