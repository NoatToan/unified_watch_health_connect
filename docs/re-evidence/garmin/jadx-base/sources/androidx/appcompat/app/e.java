package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.g1;
import androidx.core.view.s0;
import androidx.core.widget.NestedScrollView;
import com.garmin.android.apps.connectmobile.R;
import i.l;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class e extends l implements DialogInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AlertController f4658a;

    public e(Context context, int i14) {
        super(context, f(i14, context));
        this.f4658a = new AlertController(getContext(), this, getWindow());
    }

    public static int f(int i14, Context context) {
        if (((i14 >>> 24) & 255) >= 1) {
            return i14;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button e(int i14) {
        AlertController alertController = this.f4658a;
        if (i14 == -3) {
            return alertController.f4612w;
        }
        if (i14 == -2) {
            return alertController.f4608s;
        }
        if (i14 == -1) {
            return alertController.f4604o;
        }
        alertController.getClass();
        return null;
    }

    public final void g(int i14, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f4658a.c(i14, charSequence, onClickListener, null);
    }

    public final void h(CharSequence charSequence) {
        AlertController alertController = this.f4658a;
        alertController.f4595f = charSequence;
        TextView textView = alertController.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void i(View view2) {
        AlertController alertController = this.f4658a;
        alertController.f4597h = view2;
        alertController.f4598i = 0;
        alertController.f4603n = false;
    }

    @Override // i.l, b.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i14;
        View view2;
        int i15;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f4658a;
        alertController.f4591b.setContentView(alertController.J);
        Context context = alertController.f4590a;
        Window window = alertController.f4592c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View viewInflate = alertController.f4597h;
        if (viewInflate == null) {
            viewInflate = alertController.f4598i != 0 ? LayoutInflater.from(context).inflate(alertController.f4598i, viewGroup, false) : null;
        }
        boolean z14 = viewInflate != null;
        if (!z14 || !AlertController.a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z14) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f4603n) {
                frameLayout.setPadding(alertController.f4599j, alertController.f4600k, alertController.f4601l, alertController.f4602m);
            }
            if (alertController.f4596g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = AlertController.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = AlertController.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = AlertController.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        alertController.F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f4595f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.f4596g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.f4596g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        int i16 = alertController.f4593d;
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        alertController.f4604o = button;
        AlertController.a aVar = alertController.Q;
        button.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.f4605p) && alertController.f4607r == null) {
            alertController.f4604o.setVisibility(8);
            i14 = 0;
        } else {
            alertController.f4604o.setText(alertController.f4605p);
            Drawable drawable = alertController.f4607r;
            if (drawable != null) {
                drawable.setBounds(0, 0, i16, i16);
                alertController.f4604o.setCompoundDrawables(alertController.f4607r, null, null, null);
            }
            alertController.f4604o.setVisibility(0);
            i14 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        alertController.f4608s = button2;
        button2.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.f4609t) && alertController.f4611v == null) {
            alertController.f4608s.setVisibility(8);
        } else {
            alertController.f4608s.setText(alertController.f4609t);
            Drawable drawable2 = alertController.f4611v;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i16, i16);
                alertController.f4608s.setCompoundDrawables(alertController.f4611v, null, null, null);
            }
            alertController.f4608s.setVisibility(0);
            i14 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        alertController.f4612w = button3;
        button3.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.f4613x) && alertController.f4615z == null) {
            alertController.f4612w.setVisibility(8);
            view2 = null;
        } else {
            alertController.f4612w.setText(alertController.f4613x);
            Drawable drawable3 = alertController.f4615z;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i16, i16);
                view2 = null;
                alertController.f4612w.setCompoundDrawables(alertController.f4615z, null, null, null);
            } else {
                view2 = null;
            }
            alertController.f4612w.setVisibility(0);
            i14 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i14 == 1) {
                Button button4 = alertController.f4604o;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i14 == 2) {
                Button button5 = alertController.f4608s;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i14 == 4) {
                Button button6 = alertController.f4612w;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i14 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (alertController.G != null) {
            viewGroupB.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(alertController.f4594e) || !alertController.O) {
                window.findViewById(R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.f4594e);
                int i17 = alertController.B;
                if (i17 != 0) {
                    alertController.D.setImageResource(i17);
                } else {
                    Drawable drawable4 = alertController.C;
                    if (drawable4 != null) {
                        alertController.D.setImageDrawable(drawable4);
                    } else {
                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                        alertController.D.setVisibility(8);
                    }
                }
            }
        }
        boolean z15 = viewGroup.getVisibility() != 8;
        int i18 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z16 = viewGroupB3.getVisibility() != 8;
        if (!z16 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i18 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (alertController.f4595f == null && alertController.f4596g == null) ? view2 : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            i15 = 0;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            i15 = 0;
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f4596g;
        if (recycleListView != null && (!z16 || i18 == 0)) {
            recycleListView.setPadding(recycleListView.getPaddingLeft(), i18 != 0 ? recycleListView.getPaddingTop() : recycleListView.f4616a, recycleListView.getPaddingRight(), z16 ? recycleListView.getPaddingBottom() : recycleListView.f4617b);
        }
        if (!z15) {
            View view3 = alertController.f4596g;
            if (view3 == null) {
                view3 = alertController.A;
            }
            if (view3 != null) {
                int i19 = z16 ? 2 : i15;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                view3.setScrollIndicators(i18 | i19, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f4596g;
        if (recycleListView2 == null || (listAdapter = alertController.H) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i24 = alertController.I;
        if (i24 > -1) {
            recycleListView2.setItemChecked(i24, true);
            recycleListView2.setSelection(i24);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i14, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4658a.A;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyDown(i14, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i14, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4658a.A;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyUp(i14, keyEvent);
        }
        return true;
    }

    @Override // i.l, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f4658a;
        alertController.f4594e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public static class a {
        private final AlertController.b P;
        private final int mTheme;

        public a(Context context, int i14) {
            this.P = new AlertController.b(new ContextThemeWrapper(context, e.f(i14, context)));
            this.mTheme = i14;
        }

        public e create() {
            AlertController alertController;
            AlertController.RecycleListView recycleListView;
            ListAdapter simpleCursorAdapter;
            e eVar = new e(this.P.f4619a, this.mTheme);
            AlertController.b bVar = this.P;
            View view2 = bVar.f4624f;
            AlertController alertController2 = eVar.f4658a;
            if (view2 != null) {
                alertController2.G = view2;
            } else {
                CharSequence charSequence = bVar.f4623e;
                if (charSequence != null) {
                    alertController2.f4594e = charSequence;
                    TextView textView = alertController2.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.f4622d;
                if (drawable != null) {
                    alertController2.C = drawable;
                    alertController2.B = 0;
                    ImageView imageView = alertController2.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController2.D.setImageDrawable(drawable);
                    }
                }
                int i14 = bVar.f4621c;
                if (i14 != 0) {
                    alertController2.d(i14);
                }
            }
            CharSequence charSequence2 = bVar.f4625g;
            if (charSequence2 != null) {
                alertController2.f4595f = charSequence2;
                TextView textView2 = alertController2.F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.f4626h;
            if (charSequence3 != null || bVar.f4627i != null) {
                alertController2.c(-1, charSequence3, bVar.f4628j, bVar.f4627i);
            }
            CharSequence charSequence4 = bVar.f4629k;
            if (charSequence4 != null || bVar.f4630l != null) {
                alertController2.c(-2, charSequence4, bVar.f4631m, bVar.f4630l);
            }
            CharSequence charSequence5 = bVar.f4632n;
            if (charSequence5 != null || bVar.f4633o != null) {
                alertController2.c(-3, charSequence5, bVar.f4634p, bVar.f4633o);
            }
            if (bVar.f4639u == null && bVar.J == null && bVar.f4640v == null) {
                alertController = alertController2;
            } else {
                AlertController.RecycleListView recycleListView2 = (AlertController.RecycleListView) bVar.f4620b.inflate(alertController2.K, (ViewGroup) null);
                if (!bVar.F) {
                    alertController = alertController2;
                    recycleListView = recycleListView2;
                    int i15 = bVar.G ? alertController.M : alertController.N;
                    if (bVar.J != null) {
                        simpleCursorAdapter = new SimpleCursorAdapter(bVar.f4619a, i15, bVar.J, new String[]{bVar.K}, new int[]{android.R.id.text1});
                    } else {
                        ListAdapter dVar = bVar.f4640v;
                        if (dVar == null) {
                            dVar = new AlertController.d(bVar.f4619a, i15, android.R.id.text1, bVar.f4639u);
                        }
                        simpleCursorAdapter = dVar;
                    }
                } else if (bVar.J == null) {
                    recycleListView = recycleListView2;
                    simpleCursorAdapter = new androidx.appcompat.app.a(bVar, bVar.f4619a, alertController2.L, android.R.id.text1, bVar.f4639u, recycleListView);
                    alertController = alertController2;
                } else {
                    simpleCursorAdapter = new b(bVar, bVar.f4619a, bVar.J, false, recycleListView2, alertController2);
                    alertController = alertController2;
                    recycleListView = recycleListView2;
                }
                alertController.H = simpleCursorAdapter;
                alertController.I = bVar.H;
                if (bVar.f4641w != null) {
                    recycleListView.setOnItemClickListener(new c(bVar, alertController));
                } else if (bVar.I != null) {
                    recycleListView.setOnItemClickListener(new d(bVar, recycleListView, alertController));
                }
                AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.M;
                if (onItemSelectedListener != null) {
                    recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (bVar.G) {
                    recycleListView.setChoiceMode(1);
                } else if (bVar.F) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f4596g = recycleListView;
            }
            View view3 = bVar.f4643y;
            if (view3 == null) {
                int i16 = bVar.f4642x;
                if (i16 != 0) {
                    alertController.f4597h = null;
                    alertController.f4598i = i16;
                    alertController.f4603n = false;
                }
            } else if (bVar.D) {
                int i17 = bVar.f4644z;
                int i18 = bVar.A;
                int i19 = bVar.B;
                int i24 = bVar.C;
                alertController.f4597h = view3;
                alertController.f4598i = 0;
                alertController.f4603n = true;
                alertController.f4599j = i17;
                alertController.f4600k = i18;
                alertController.f4601l = i19;
                alertController.f4602m = i24;
            } else {
                alertController.f4597h = view3;
                alertController.f4598i = 0;
                alertController.f4603n = false;
            }
            eVar.setCancelable(this.P.f4635q);
            if (this.P.f4635q) {
                eVar.setCanceledOnTouchOutside(true);
            }
            eVar.setOnCancelListener(this.P.f4636r);
            eVar.setOnDismissListener(this.P.f4637s);
            DialogInterface.OnKeyListener onKeyListener = this.P.f4638t;
            if (onKeyListener != null) {
                eVar.setOnKeyListener(onKeyListener);
            }
            return eVar;
        }

        public Context getContext() {
            return this.P.f4619a;
        }

        public a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f4640v = listAdapter;
            bVar.f4641w = onClickListener;
            return this;
        }

        public a setCancelable(boolean z14) {
            this.P.f4635q = z14;
            return this;
        }

        public a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.b bVar = this.P;
            bVar.J = cursor;
            bVar.K = str;
            bVar.f4641w = onClickListener;
            return this;
        }

        public a setCustomTitle(View view2) {
            this.P.f4624f = view2;
            return this;
        }

        public a setIcon(int i14) {
            this.P.f4621c = i14;
            return this;
        }

        public a setIconAttribute(int i14) {
            TypedValue typedValue = new TypedValue();
            this.P.f4619a.getTheme().resolveAttribute(i14, typedValue, true);
            this.P.f4621c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a setInverseBackgroundForced(boolean z14) {
            this.P.getClass();
            return this;
        }

        public a setItems(int i14, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f4639u = bVar.f4619a.getResources().getTextArray(i14);
            this.P.f4641w = onClickListener;
            return this;
        }

        public a setMessage(int i14) {
            AlertController.b bVar = this.P;
            bVar.f4625g = bVar.f4619a.getText(i14);
            return this;
        }

        public a setMultiChoiceItems(int i14, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.P;
            bVar.f4639u = bVar.f4619a.getResources().getTextArray(i14);
            AlertController.b bVar2 = this.P;
            bVar2.I = onMultiChoiceClickListener;
            bVar2.E = zArr;
            bVar2.F = true;
            return this;
        }

        public a setNegativeButton(int i14, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f4629k = bVar.f4619a.getText(i14);
            this.P.f4631m = onClickListener;
            return this;
        }

        public a setNegativeButtonIcon(Drawable drawable) {
            this.P.f4630l = drawable;
            return this;
        }

        public a setNeutralButton(int i14, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f4632n = bVar.f4619a.getText(i14);
            this.P.f4634p = onClickListener;
            return this;
        }

        public a setNeutralButtonIcon(Drawable drawable) {
            this.P.f4633o = drawable;
            return this;
        }

        public a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.P.f4636r = onCancelListener;
            return this;
        }

        public a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.P.f4637s = onDismissListener;
            return this;
        }

        public a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.P.M = onItemSelectedListener;
            return this;
        }

        public a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.P.f4638t = onKeyListener;
            return this;
        }

        public a setPositiveButton(int i14, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f4626h = bVar.f4619a.getText(i14);
            this.P.f4628j = onClickListener;
            return this;
        }

        public a setPositiveButtonIcon(Drawable drawable) {
            this.P.f4627i = drawable;
            return this;
        }

        public a setRecycleOnMeasureEnabled(boolean z14) {
            this.P.getClass();
            return this;
        }

        public a setSingleChoiceItems(int i14, int i15, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f4639u = bVar.f4619a.getResources().getTextArray(i14);
            AlertController.b bVar2 = this.P;
            bVar2.f4641w = onClickListener;
            bVar2.H = i15;
            bVar2.G = true;
            return this;
        }

        public a setTitle(int i14) {
            AlertController.b bVar = this.P;
            bVar.f4623e = bVar.f4619a.getText(i14);
            return this;
        }

        @Deprecated
        public a setView(View view2, int i14, int i15, int i16, int i17) {
            AlertController.b bVar = this.P;
            bVar.f4643y = view2;
            bVar.f4642x = 0;
            bVar.D = true;
            bVar.f4644z = i14;
            bVar.A = i15;
            bVar.B = i16;
            bVar.C = i17;
            return this;
        }

        public e show() {
            e eVarCreate = create();
            eVarCreate.show();
            return eVarCreate;
        }

        public a setIcon(Drawable drawable) {
            this.P.f4622d = drawable;
            return this;
        }

        public a setMessage(CharSequence charSequence) {
            this.P.f4625g = charSequence;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.P.f4623e = charSequence;
            return this;
        }

        public a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f4629k = charSequence;
            bVar.f4631m = onClickListener;
            return this;
        }

        public a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f4632n = charSequence;
            bVar.f4634p = onClickListener;
            return this;
        }

        public a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f4626h = charSequence;
            bVar.f4628j = onClickListener;
            return this;
        }

        public a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f4639u = charSequenceArr;
            bVar.f4641w = onClickListener;
            return this;
        }

        public a setView(View view2) {
            AlertController.b bVar = this.P;
            bVar.f4643y = view2;
            bVar.f4642x = 0;
            bVar.D = false;
            return this;
        }

        public a(Context context) {
            this(context, e.f(0, context));
        }

        public a setView(int i14) {
            AlertController.b bVar = this.P;
            bVar.f4643y = null;
            bVar.f4642x = i14;
            bVar.D = false;
            return this;
        }

        public a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.P;
            bVar.f4639u = charSequenceArr;
            bVar.I = onMultiChoiceClickListener;
            bVar.E = zArr;
            bVar.F = true;
            return this;
        }

        public a setSingleChoiceItems(Cursor cursor, int i14, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.J = cursor;
            bVar.f4641w = onClickListener;
            bVar.H = i14;
            bVar.K = str;
            bVar.G = true;
            return this;
        }

        public a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.P;
            bVar.J = cursor;
            bVar.I = onMultiChoiceClickListener;
            bVar.L = str;
            bVar.K = str2;
            bVar.F = true;
            return this;
        }

        public a setSingleChoiceItems(CharSequence[] charSequenceArr, int i14, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f4639u = charSequenceArr;
            bVar.f4641w = onClickListener;
            bVar.H = i14;
            bVar.G = true;
            return this;
        }

        public a setSingleChoiceItems(ListAdapter listAdapter, int i14, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f4640v = listAdapter;
            bVar.f4641w = onClickListener;
            bVar.H = i14;
            bVar.G = true;
            return this;
        }
    }

    public e(Context context) {
        this(context, 0);
    }

    public e(Context context, boolean z14, DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z14);
        setOnCancelListener(onCancelListener);
    }
}
