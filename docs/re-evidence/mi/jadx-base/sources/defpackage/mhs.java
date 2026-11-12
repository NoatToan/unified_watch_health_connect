package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.statistics.StatConstants;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes7.dex */
public class mhs extends me5 {
    public static int b0;
    public Context R;
    public View S;
    public ProgressBar T;
    public TextView U;
    public int V;
    public int W;
    public int X;
    public Pair<Integer, Integer> Y;
    public me5.j Z;
    public ze2.b.InterfaceC1167b a0;

    public class a implements me5.j {
        public a() {
        }

        @Override // me5.j
        public void a(ze2.b bVar, int i) {
        }

        @Override // me5.j
        public void b(ze2.b bVar) {
            mhs.this.T.setVisibility(8);
            if (bVar != null) {
                mhs.this.U.setText(bVar.mTriggerTexts[3]);
            }
        }

        @Override // me5.j
        public void c(ze2.b bVar) {
            mhs.this.T.setVisibility(0);
            mhs.this.S.setVisibility(0);
            mhs.this.U.setVisibility(0);
            if (bVar != null) {
                mhs.this.U.setText(bVar.mTriggerTexts[2]);
            }
        }

        @Override // me5.j
        public void d(ze2.b bVar) {
        }
    }

    public class b implements ze2.b.InterfaceC1167b {
        public b() {
        }

        @Override // ze2.b.InterfaceC1167b
        public void a(int i) {
        }

        @Override // ze2.b.InterfaceC1167b
        public void b(int i) {
            mhs.this.S.setVisibility(0);
            mhs.this.U.setVisibility(0);
        }

        @Override // ze2.b.InterfaceC1167b
        public void c(int i) {
            mhs.this.T.setVisibility(0);
            mhs.this.S.setVisibility(0);
            mhs.this.U.setVisibility(0);
            ze2.b bVarF = mhs.this.f();
            if (bVarF != null) {
                mhs.this.U.setText(bVarF.mTriggerTexts[0]);
            }
        }

        @Override // ze2.b.InterfaceC1167b
        public void d(int i) {
        }

        @Override // ze2.b.InterfaceC1167b
        public void e(int i) {
            mhs.this.T.setVisibility(0);
            mhs.this.S.setVisibility(0);
            mhs.this.U.setVisibility(0);
            ze2.b bVarF = mhs.this.f();
            if (bVarF != null) {
                mhs.this.U.setText(bVarF.mTriggerTexts[2]);
            }
            if (mhs.this.T.getVisibility() == 0) {
                mhs.this.T.setAlpha(1.0f);
                mhs.this.T.setScaleX(1.0f);
                mhs.this.T.setScaleY(1.0f);
            }
        }

        @Override // ze2.b.InterfaceC1167b
        public float f() {
            return -1.0f;
        }

        @Override // ze2.b.InterfaceC1167b
        public void g(int i) {
        }

        @Override // ze2.b.InterfaceC1167b
        public void h(int i) {
        }

        @Override // ze2.b.InterfaceC1167b
        public void i(int i) {
        }

        @Override // ze2.b.InterfaceC1167b
        public void j(int i) {
        }
    }

    public mhs(Context context) {
        super(context);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Z = new a();
        this.a0 = new b();
        this.R = context;
        setOnActionDataListener(this.Z);
        b0 = context.getResources().getDimensionPixelSize(lmi.e);
        this.Y = new Pair<>(0, Integer.valueOf(this.R.getResources().getDimensionPixelSize(lmi.f25221a)));
    }

    @Override // defpackage.me5
    public void J0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (a0()) {
            for (int i9 = 0; i9 < e().size(); i9++) {
                ze2.a aVar = e().get(i9);
                if (aVar instanceof ze2.b) {
                    ze2.b bVar = (ze2.b) aVar;
                    if (b0 >= this.S.getTop()) {
                        this.T.offsetTopAndBottom(bVar.mEnterPoint);
                        this.S.offsetTopAndBottom(bVar.mEnterPoint);
                        this.U.offsetTopAndBottom(bVar.mEnterPoint);
                    }
                }
            }
            if (this.S.getVisibility() == 0 && O() != null && (O() instanceof ze2.b)) {
                if (this.V <= 0) {
                    this.V = this.S.getBottom();
                }
                if (this.W <= 0 || this.X <= 0) {
                    this.W = this.U.getTop();
                    this.X = this.U.getBottom();
                }
                if ((this.T.getVisibility() == 8 || this.T.getVisibility() == 4) && P() != this.O && V().getHeight() > O().mTriggerPoint) {
                    this.S.setBottom(this.V + (V().getHeight() - O().mTriggerPoint));
                }
            }
        }
    }

    @Override // defpackage.me5
    public void K0(SpringBackLayout springBackLayout, int i, int i2, int i3) {
        if (a0() && O() != null && (O() instanceof ze2.b)) {
            ze2.b bVar = (ze2.b) O();
            if (this.S.getVisibility() == 0) {
                this.V = this.S.getTop() + this.S.getWidth();
                this.W = this.U.getTop();
                this.X = this.U.getBottom();
                int i4 = bVar.mTriggerPoint;
                float f = i4;
                float fMax = Math.max(0.0f, Math.min(V().getHeight() / f, 1.0f));
                float f2 = 0.5f * f;
                float fMax2 = Math.max(0.0f, ((float) V().getHeight()) < f2 ? 0.0f : Math.min((V().getHeight() - f2) / f2, 1.0f));
                float fMax3 = Math.max(0.0f, ((float) V().getHeight()) < f2 ? 0.0f : Math.min((V().getHeight() - (0.7f * f)) / (f * 0.3f), 1.0f));
                float f3 = (-this.S.getWidth()) * (1.0f - fMax);
                this.S.setAlpha(fMax2);
                this.S.setScaleX(fMax);
                this.S.setScaleY(fMax);
                this.U.setAlpha(fMax3);
                this.U.setTop(this.W);
                this.U.setBottom(this.X);
                Logger.i("HealthCustomTrigger", "mTriggerPoint = " + i4 + " , deltaTranslationY = " + f3 + " , getRootContainer().getHeight() = " + V().getHeight());
                if (this.T.getVisibility() == 0) {
                    this.T.setAlpha(fMax2);
                    this.T.setScaleX(fMax);
                    this.T.setScaleY(fMax);
                    if (V().getHeight() < i4) {
                        if (fMax3 > 0.0f) {
                            this.T.setTranslationY(f3);
                            this.U.setTranslationY(f3);
                            this.S.setTranslationY(f3);
                        }
                    } else if (V().getHeight() >= i4) {
                        if (P() != this.O) {
                            this.T.setTranslationY(V().getHeight() - i4);
                            this.U.setTranslationY(V().getHeight() - i4);
                            this.S.setTranslationY(V().getHeight() - i4);
                        } else {
                            this.T.setTranslationY(0.0f);
                            this.U.setTranslationY(0.0f);
                            this.S.setTranslationY(0.0f);
                        }
                    }
                }
                if (V().getHeight() < i4) {
                    if (P() == this.M) {
                        this.U.setText(bVar.mTriggerTexts[0]);
                    }
                    this.S.setBottom(this.V);
                } else if (V().getHeight() >= i4) {
                    int height = this.V + (V().getHeight() - i4);
                    if (this.T.getVisibility() != 0 && P() != this.O) {
                        this.S.setBottom(height);
                    }
                    if (P() == this.M) {
                        this.U.setText(bVar.mTriggerTexts[1]);
                    }
                }
            }
        }
        if (b0() && O() != null && (O() instanceof ze2.d) && V().getHeight() < O().mEnterPoint) {
            U().setVisibility(8);
        } else if (b0() && O() != null && (O() instanceof ze2.d) && V().getHeight() >= O().mEnterPoint && U().getVisibility() == 8) {
            U().setVisibility(0);
            S0(U());
        }
        if (b0() && O() != null && U().getVisibility() == 0) {
            U().offsetTopAndBottom(-i2);
        }
    }

    public final void Q0() {
        this.S = V().findViewById(eti.c);
        this.U = (TextView) V().findViewById(eti.d);
        this.T = (ProgressBar) V().findViewById(eti.f17053b);
    }

    public final void R0(Context context, int[] iArr, String[] strArr) {
        if (iArr != null) {
            for (int i = 0; i < iArr.length; i++) {
                strArr[i] = context.getResources().getString(iArr[i]);
            }
        }
    }

    public final void S0(View view) {
        if (view != null) {
            view.setVisibility(0);
            AnimState animState = new AnimState(StatConstants.PARAM_START);
            ViewProperty viewProperty = ViewProperty.ALPHA;
            AnimState animStateAdd = animState.add(viewProperty, 0.0d);
            ViewProperty viewProperty2 = ViewProperty.TRANSLATION_Y;
            AnimState animStateAdd2 = animStateAdd.add(viewProperty2, -180.0d);
            AnimState animStateAdd3 = new AnimState("show").add(viewProperty, 1.0d).add(viewProperty2, 25.0d);
            Folme.useAt(view).state().fromTo(animStateAdd2, animStateAdd3, new AnimConfig().setEase(EaseManager.getStyle(4, 120.0f, 0.99f, 0.1f))).then(new AnimState("hide").add(viewProperty, 1.0d).add(viewProperty2, 0.0d), new AnimConfig().setEase(EaseManager.getStyle(4, 40.0f, 0.99f, 0.1f)));
        }
    }

    @Override // defpackage.me5
    public boolean Z() {
        return super.Z();
    }

    @Override // defpackage.me5, defpackage.ze2
    public void d(ze2.a aVar) {
        super.d(aVar);
        if (aVar instanceof ze2.b) {
            Q0();
            ze2.b bVar = (ze2.b) aVar;
            setOnIndeterminateActionViewListener(this.a0);
            R0(this.R, bVar.mTriggerTextIDs, bVar.mTriggerTexts);
        }
    }
}
