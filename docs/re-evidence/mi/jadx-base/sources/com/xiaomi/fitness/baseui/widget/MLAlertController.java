package com.xiaomi.fitness.baseui.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.gki;
import defpackage.gsi;
import defpackage.loi;
import defpackage.mvi;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class MLAlertController {
    public CharSequence A;
    public Message B;
    public ScrollView C;
    public boolean D;
    public Drawable F;
    public TextView G;
    public TextView H;
    public TextView I;
    public LinearLayout J;
    public TextView K;
    public View L;
    public boolean M;
    public ListAdapter N;
    public Handler U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DialogInterface f11686b;
    public final Window c;
    public View d;
    public int e;
    public int g;
    public CharSequence h;
    public CharSequence i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f11687k;
    public CharSequence l;
    public ListView m;
    public View n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11688r;
    public TextView t;
    public CharSequence u;
    public Message v;
    public TextView w;
    public CharSequence x;
    public Message y;
    public TextView z;
    public int f = 80;
    public boolean s = false;
    public int E = -1;
    public int O = -1;
    public boolean V = true;
    public boolean W = false;
    public View.OnClickListener X = new a();
    public int P = mvi.x;
    public int Q = mvi.v;
    public int R = mvi.u;
    public int S = mvi.w;
    public int T = mvi.t;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            if (view == MLAlertController.this.t && MLAlertController.this.v != null) {
                messageObtain = Message.obtain(MLAlertController.this.v);
            } else if (view != MLAlertController.this.w || MLAlertController.this.y == null) {
                messageObtain = (view != MLAlertController.this.z || MLAlertController.this.B == null) ? null : Message.obtain(MLAlertController.this.B);
            } else {
                messageObtain = Message.obtain(MLAlertController.this.y);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            if (MLAlertController.this.V) {
                MLAlertController.this.U.obtainMessage(1, MLAlertController.this.f11686b).sendToTarget();
            }
        }
    }

    public static class b {
        public DialogInterface.OnClickListener A;
        public View B;
        public int C;
        public int D;
        public int E;
        public int F;
        public boolean[] H;
        public boolean I;
        public boolean J;
        public DialogInterface.OnMultiChoiceClickListener L;
        public Cursor M;
        public String N;
        public String O;
        public boolean P;
        public AdapterView.OnItemSelectedListener Q;
        public com.xiaomi.fitness.baseui.widget.a.b T;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f11691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f11692b;
        public Drawable f;
        public CharSequence g;
        public boolean h;
        public boolean i;
        public View j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f11693k;
        public boolean l;
        public CharSequence m;
        public CharSequence n;
        public CharSequence o;
        public DialogInterface.OnClickListener p;
        public CharSequence q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public DialogInterface.OnClickListener f11694r;
        public CharSequence s;
        public DialogInterface.OnClickListener t;
        public DialogInterface.OnCancelListener v;
        public DialogInterface.OnKeyListener w;
        public CharSequence[] x;
        public float[] y;
        public ListAdapter z;
        public int c = 80;
        public int d = 8388611;
        public int e = 0;
        public boolean G = false;
        public int K = -1;
        public boolean R = true;
        public boolean S = true;
        public int U = loi.common_popup_bottom_bg;
        public boolean u = true;

        public class a extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f11695a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f11695a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                if (b.this.y != null) {
                    TextView textView = (TextView) view2.findViewById(gsi.G);
                    float[] fArr = b.this.y;
                    if (i < fArr.length) {
                        textView.setTextSize(0, fArr[i]);
                    } else {
                        textView.setTextSize(0, fArr[fArr.length - 1]);
                    }
                }
                boolean[] zArr = b.this.H;
                if (zArr != null && zArr[i]) {
                    this.f11695a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.baseui.widget.MLAlertController$b$b, reason: collision with other inner class name */
        public class C0383b extends CursorAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f11697a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f11698b;
            public final /* synthetic */ RecycleListView c;
            public final /* synthetic */ MLAlertController d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0383b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, MLAlertController mLAlertController) {
                super(context, cursor, z);
                this.c = recycleListView;
                this.d = mLAlertController;
                Cursor cursor2 = getCursor();
                this.f11697a = cursor2.getColumnIndexOrThrow(b.this.N);
                this.f11698b = cursor2.getColumnIndexOrThrow(b.this.O);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                CheckedTextView checkedTextView = (CheckedTextView) view.findViewById(gsi.G);
                checkedTextView.setText(cursor.getString(this.f11697a));
                if (b.this.y != null) {
                    int position = cursor.getPosition();
                    float[] fArr = b.this.y;
                    if (position < fArr.length) {
                        checkedTextView.setTextSize(0, fArr[position]);
                    } else {
                        checkedTextView.setTextSize(0, fArr[fArr.length - 1]);
                    }
                }
                this.c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f11698b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f11692b.inflate(this.d.R, viewGroup, false);
            }
        }

        public class c extends ArrayAdapter<CharSequence> {
            public c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
                super(context, i, i2, charSequenceArr);
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                TextView textView = (TextView) view2.findViewById(gsi.G);
                float[] fArr = b.this.y;
                if (fArr != null) {
                    if (i < fArr.length) {
                        textView.setTextSize(0, fArr[i]);
                    } else {
                        textView.setTextSize(0, fArr[fArr.length - 1]);
                    }
                }
                return view2;
            }
        }

        public class d extends SimpleCursorAdapter {
            public d(Context context, int i, Cursor cursor, String[] strArr, int[] iArr) {
                super(context, i, cursor, strArr, iArr);
            }

            @Override // android.widget.SimpleCursorAdapter, android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                super.bindView(view, context, cursor);
                CheckedTextView checkedTextView = (CheckedTextView) view.findViewById(gsi.G);
                if (b.this.y != null) {
                    int position = cursor.getPosition();
                    float[] fArr = b.this.y;
                    if (position < fArr.length) {
                        checkedTextView.setTextSize(0, fArr[position]);
                    } else {
                        checkedTextView.setTextSize(0, fArr[fArr.length - 1]);
                    }
                }
            }
        }

        public class e implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MLAlertController f11701a;

            public e(MLAlertController mLAlertController) {
                this.f11701a = mLAlertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                b.this.A.onClick(this.f11701a.f11686b, i);
                if (b.this.J) {
                    return;
                }
                this.f11701a.f11686b.dismiss();
            }
        }

        public class f implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f11703a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MLAlertController f11704b;

            public f(RecycleListView recycleListView, MLAlertController mLAlertController) {
                this.f11703a = recycleListView;
                this.f11704b = mLAlertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                boolean[] zArr = b.this.H;
                if (zArr != null) {
                    zArr[i] = this.f11703a.isItemChecked(i);
                }
                b.this.L.onClick(this.f11704b.f11686b, i, this.f11703a.isItemChecked(i));
            }
        }

        public b(Context context) {
            this.f11691a = context;
            this.f11692b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(MLAlertController mLAlertController) {
            mLAlertController.G(this.h);
            mLAlertController.H(this.c);
            int i = this.U;
            if (i != 0) {
                mLAlertController.D(i);
            }
            View view = this.j;
            if (view != null) {
                mLAlertController.F(view);
            } else {
                CharSequence charSequence = this.g;
                if (charSequence != null) {
                    mLAlertController.Q(charSequence, this.i);
                }
                CharSequence charSequence2 = this.n;
                if (charSequence2 != null) {
                    mLAlertController.N(charSequence2, this.i);
                }
                Drawable drawable = this.f;
                if (drawable != null) {
                    mLAlertController.J(drawable);
                }
                int i2 = this.e;
                if (i2 >= 0) {
                    mLAlertController.I(i2);
                }
            }
            if (!TextUtils.isEmpty(this.m)) {
                int i3 = this.d;
                if (i3 != 8388627) {
                    mLAlertController.M(i3);
                }
                mLAlertController.O(this.m);
            }
            if (!TextUtils.isEmpty(this.f11693k)) {
                int i4 = this.d;
                if (i4 != 8388627) {
                    mLAlertController.M(i4);
                }
                mLAlertController.L(this.f11693k, this.l);
            }
            CharSequence charSequence3 = this.o;
            if (charSequence3 != null) {
                mLAlertController.E(-1, charSequence3, this.p, null);
            }
            CharSequence charSequence4 = this.q;
            if (charSequence4 != null) {
                mLAlertController.E(-2, charSequence4, this.f11694r, null);
            }
            CharSequence charSequence5 = this.s;
            if (charSequence5 != null) {
                mLAlertController.E(-3, charSequence5, this.t, null);
            }
            if (this.P) {
                mLAlertController.K(true);
            }
            if (this.x != null || this.M != null || this.z != null) {
                b(mLAlertController);
            }
            mLAlertController.D = this.h;
            View view2 = this.B;
            if (view2 != null) {
                if (this.G) {
                    mLAlertController.S(view2, this.C, this.D, this.E, this.F);
                } else {
                    mLAlertController.R(view2);
                }
            }
            mLAlertController.B(this.S);
        }

        public final void b(MLAlertController mLAlertController) {
            ListAdapter dVar;
            ListAdapter aVar;
            RecycleListView recycleListView = (RecycleListView) this.f11692b.inflate(mLAlertController.Q, (ViewGroup) null);
            if (this.I) {
                aVar = this.M == null ? new a(this.f11691a, mLAlertController.R, gsi.G, this.x, recycleListView) : new C0383b(this.f11691a, this.M, false, recycleListView, mLAlertController);
            } else {
                int i = this.J ? mLAlertController.S : mLAlertController.T;
                if (this.M == null) {
                    dVar = this.z;
                    if (dVar == null) {
                        dVar = new c(this.f11691a, i, gsi.G, this.x);
                    }
                } else {
                    dVar = new d(this.f11691a, i, this.M, new String[]{this.N}, new int[]{gsi.G});
                }
                aVar = dVar;
            }
            mLAlertController.N = aVar;
            mLAlertController.O = this.K;
            if (this.A != null) {
                recycleListView.setOnItemClickListener(new e(mLAlertController));
            } else if (this.L != null) {
                recycleListView.setOnItemClickListener(new f(recycleListView, mLAlertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.Q;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.J) {
                recycleListView.setChoiceMode(1);
            } else if (this.I) {
                recycleListView.setChoiceMode(2);
            }
            recycleListView.f11689a = this.R;
            mLAlertController.m = recycleListView;
        }
    }

    public static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<DialogInterface> f11705a;

        public c(DialogInterface dialogInterface) {
            this.f11705a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f11705a.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public MLAlertController(Context context, DialogInterface dialogInterface, Window window) {
        this.f11685a = context;
        this.f11686b = dialogInterface;
        this.c = window;
        this.U = new c(dialogInterface);
    }

    public static boolean X(int i) {
        return i == 1 || i == 2 || i == 4;
    }

    public static boolean u(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (u(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public boolean A(int i, KeyEvent keyEvent) {
        ScrollView scrollView = this.C;
        return scrollView != null && scrollView.executeKeyEvent(keyEvent);
    }

    public void B(boolean z) {
        this.V = z;
    }

    public final void C(LinearLayout linearLayout, LinearLayout linearLayout2, View view, boolean z, boolean z2, View view2) {
        int i;
        int color = this.f11685a.getResources().getColor(R.color.transparent);
        int color2 = this.f11685a.getResources().getColor(R.color.transparent);
        int color3 = this.f11685a.getResources().getColor(R.color.transparent);
        int color4 = this.f11685a.getResources().getColor(R.color.transparent);
        int color5 = this.f11685a.getResources().getColor(R.color.transparent);
        int color6 = this.f11685a.getResources().getColor(R.color.transparent);
        int color7 = this.f11685a.getResources().getColor(R.color.transparent);
        int color8 = this.f11685a.getResources().getColor(R.color.transparent);
        int color9 = this.f11685a.getResources().getColor(R.color.transparent);
        View[] viewArr = new View[4];
        boolean[] zArr = new boolean[4];
        if (z2) {
            viewArr[0] = linearLayout;
            zArr[0] = false;
            i = 1;
        } else {
            i = 0;
        }
        viewArr[i] = linearLayout2.getVisibility() == 8 ? null : linearLayout2;
        zArr[i] = this.m != null;
        int i2 = i + 1;
        if (view != null) {
            viewArr[i2] = view;
            zArr[i2] = this.M;
            i2 = i + 2;
        }
        if (z) {
            viewArr[i2] = view2;
            zArr[i2] = true;
        }
        View view3 = null;
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        for (int i4 = 4; i3 < i4; i4 = 4) {
            View view4 = viewArr[i3];
            if (view4 != null) {
                if (view3 != null) {
                    if (z3) {
                        view3.setBackgroundColor(z4 ? color7 : color3);
                    } else {
                        view3.setBackgroundColor(z4 ? color6 : color2);
                    }
                    z3 = true;
                }
                z4 = zArr[i3];
                view3 = view4;
            }
            i3++;
        }
        if (view3 != null) {
            if (z3) {
                if (z4) {
                    color4 = z ? color9 : color8;
                }
                view3.setBackgroundColor(color4);
            } else {
                if (z4) {
                    color = color5;
                }
                view3.setBackgroundColor(color);
            }
        }
        ListView listView = this.m;
        if (listView == null || this.N == null) {
            return;
        }
        listView.setFooterDividersEnabled(false);
        this.m.setHeaderDividersEnabled(false);
        this.m.setAdapter(this.N);
        int i5 = this.O;
        if (i5 > -1) {
            this.m.setItemChecked(i5, true);
            this.m.setSelection(this.O);
        }
    }

    public final void D(int i) {
        this.e = i;
        View view = this.d;
        if (view != null) {
            view.setBackgroundResource(i);
        }
    }

    public void E(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (message == null && onClickListener != null) {
            message = this.U.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.A = charSequence;
            this.B = message;
        } else if (i == -2) {
            this.x = charSequence;
            this.y = message;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.u = charSequence;
            this.v = message;
        }
    }

    public void F(View view) {
        this.L = view;
    }

    public void G(boolean z) {
        this.D = z;
    }

    public final void H(int i) {
        this.f = i;
        Window window = this.c;
        if (window != null) {
            window.setGravity(i);
        }
    }

    public void I(int i) {
        this.E = i;
    }

    public void J(Drawable drawable) {
        this.F = drawable;
    }

    public void K(boolean z) {
        this.M = z;
    }

    public void L(CharSequence charSequence, boolean z) {
        this.f11687k = charSequence;
        this.W = z;
        TextView textView = this.K;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void M(int i) {
        this.g = i;
    }

    public void N(CharSequence charSequence, boolean z) {
        this.i = charSequence;
        this.j = z;
        if (this.H != null) {
            if (TextUtils.isEmpty(charSequence)) {
                this.H.setVisibility(8);
            } else {
                this.H.setVisibility(0);
                this.H.setText(this.i);
            }
        }
    }

    public void O(CharSequence charSequence) {
        this.l = charSequence;
        TextView textView = this.I;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void P(CharSequence charSequence) {
        this.h = charSequence;
        TextView textView = this.G;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void Q(CharSequence charSequence, boolean z) {
        this.h = charSequence;
        this.j = z;
        TextView textView = this.G;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void R(View view) {
        this.n = view;
        this.s = false;
    }

    public void S(View view, int i, int i2, int i3, int i4) {
        this.n = view;
        this.s = true;
        this.o = i;
        this.p = i2;
        this.q = i3;
        this.f11688r = i4;
    }

    public final boolean T() {
        int i;
        View viewFindViewById = this.c.findViewById(gsi.u);
        TextView textView = (TextView) this.c.findViewById(gsi.t);
        this.t = textView;
        textView.setOnClickListener(this.X);
        if (TextUtils.isEmpty(this.u)) {
            this.t.setVisibility(8);
            viewFindViewById.setVisibility(8);
            i = 0;
        } else {
            this.t.setText(this.u);
            this.t.setVisibility(0);
            if (this.D) {
                this.t.setBackgroundResource(loi.m);
                this.t.setTextColor(this.f11685a.getResources().getColor(gki.w));
            }
            i = 1;
        }
        TextView textView2 = (TextView) this.c.findViewById(gsi.v);
        this.w = textView2;
        textView2.setOnClickListener(this.X);
        if (TextUtils.isEmpty(this.x)) {
            this.w.setVisibility(8);
        } else {
            this.w.setText(this.x);
            this.w.setVisibility(0);
            i |= 2;
        }
        View viewFindViewById2 = this.c.findViewById(gsi.x);
        TextView textView3 = (TextView) this.c.findViewById(gsi.w);
        this.z = textView3;
        textView3.setOnClickListener(this.X);
        if (TextUtils.isEmpty(this.A)) {
            this.z.setVisibility(8);
            viewFindViewById2.setVisibility(8);
        } else {
            this.z.setText(this.A);
            this.z.setVisibility(0);
            i |= 4;
        }
        if (X(i)) {
            if (i == 1) {
                v(this.t);
            } else if (i == 2) {
                v(this.w);
            } else if (i == 4) {
                v(this.z);
            }
        }
        return i != 0;
    }

    public final void U(LinearLayout linearLayout) {
        TextView textView;
        ScrollView scrollView = (ScrollView) this.c.findViewById(gsi.E);
        this.C = scrollView;
        scrollView.setFocusable(false);
        this.K = (TextView) this.c.findViewById(gsi.C);
        this.I = (TextView) this.c.findViewById(gsi.H);
        this.J = (LinearLayout) this.c.findViewById(gsi.D);
        if (this.K == null) {
            return;
        }
        CharSequence charSequence = this.l;
        if (charSequence != null && (textView = this.I) != null) {
            textView.setText(charSequence);
            this.I.setGravity(this.g);
            if (TextUtils.isEmpty(this.l)) {
                this.I.setVisibility(8);
            } else {
                this.I.setVisibility(0);
            }
        }
        CharSequence charSequence2 = this.f11687k;
        if (charSequence2 != null) {
            this.K.setText(charSequence2);
            if (this.W) {
                this.K.setAutoLinkMask(15);
                this.K.setMovementMethod(LinkMovementMethod.getInstance());
                this.K.setHighlightColor(0);
            }
            this.K.setGravity(this.g);
            if (TextUtils.isEmpty(this.h) && TextUtils.isEmpty(this.l)) {
                this.K.setGravity(17);
                ((LinearLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = 0;
            } else if (TextUtils.isEmpty(this.h)) {
                ((LinearLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = DisplayUtil.dip2px(20.0f);
            }
        } else {
            this.J.setVisibility(8);
            this.C.removeView(this.J);
        }
        ListView listView = this.m;
        if (listView != null) {
            linearLayout.addView(listView, new LinearLayout.LayoutParams(-1, -1));
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    public final boolean V(LinearLayout linearLayout) {
        if (this.L != null) {
            linearLayout.addView(this.L, 0, new LinearLayout.LayoutParams(-1, -2));
            this.c.findViewById(gsi.J).setVisibility(8);
        } else {
            if (!(!TextUtils.isEmpty(this.h))) {
                this.c.findViewById(gsi.J).setVisibility(8);
                linearLayout.setVisibility(8);
                return false;
            }
            this.G = (TextView) this.c.findViewById(gsi.I);
            this.H = (TextView) this.c.findViewById(gsi.F);
            this.G.setText(this.h);
            if (TextUtils.isEmpty(this.i)) {
                this.H.setVisibility(8);
            } else {
                this.H.setText(this.i);
                this.H.setVisibility(0);
            }
        }
        return true;
    }

    public final void W() {
        FrameLayout frameLayout;
        LinearLayout linearLayout = (LinearLayout) this.c.findViewById(gsi.z);
        U(linearLayout);
        boolean zT = T();
        LinearLayout linearLayout2 = (LinearLayout) this.c.findViewById(gsi.K);
        boolean zV = V(linearLayout2);
        View viewFindViewById = this.c.findViewById(gsi.y);
        if (!zT) {
            viewFindViewById.setVisibility(8);
        }
        if (this.n != null) {
            linearLayout.setVisibility(8);
            frameLayout = (FrameLayout) this.c.findViewById(gsi.B);
            ViewGroup viewGroup = (ViewGroup) this.c.findViewById(gsi.A);
            ViewGroup.LayoutParams layoutParams = this.n.getLayoutParams();
            View view = this.n;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            viewGroup.addView(view, layoutParams);
            if (this.s) {
                viewGroup.setPadding(this.o, this.p, this.q, this.f11688r);
            }
            if (this.m != null) {
                ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).weight = 0.0f;
            }
        } else {
            this.c.findViewById(gsi.B).setVisibility(8);
            frameLayout = null;
        }
        FrameLayout frameLayout2 = frameLayout;
        if (!zV) {
            CharSequence charSequence = this.f11687k;
        }
        C(linearLayout2, linearLayout, frameLayout2, zT, zV, viewFindViewById);
    }

    public final void v(TextView textView) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        textView.setLayoutParams(layoutParams);
    }

    public void w() {
        Handler handler = this.U;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public View x() {
        return this.n;
    }

    public void y() {
        this.c.requestFeature(1);
        View view = this.n;
        if (view == null || !u(view)) {
            this.c.setFlags(131072, 131072);
        }
        View viewInflate = LayoutInflater.from(this.c.getContext()).inflate(this.P, (ViewGroup) null, false);
        this.d = viewInflate;
        viewInflate.setBackgroundResource(this.e);
        this.c.setGravity(this.f);
        this.c.setContentView(this.d, new FrameLayout.LayoutParams(-1, -2));
        W();
    }

    public boolean z(int i, KeyEvent keyEvent) {
        if (i == 82) {
            this.f11686b.dismiss();
        }
        ScrollView scrollView = this.C;
        return scrollView != null && scrollView.executeKeyEvent(keyEvent);
    }

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f11689a;

        public RecycleListView(Context context) {
            super(context);
            this.f11689a = true;
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11689a = true;
        }

        public RecycleListView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f11689a = true;
        }
    }
}
