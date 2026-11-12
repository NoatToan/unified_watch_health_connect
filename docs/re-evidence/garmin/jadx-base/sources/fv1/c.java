package fv1;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import c22.f1;
import c22.l3;
import c22.q3;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.events.components.GCMEditTextTrainingInitiative;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.apps.connectmobile.z1;
import e23.p;
import en0.n;
import ew1.k;
import f12.l;
import i3.e5;
import java.util.Arrays;
import jv1.m;
import kotlin.w3;
import o13.u;
import o53.b0;
import o53.f0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p005kotlin.jvm.internal.x0;
import p005kotlin.math.MathKt;
import r53.j;
import r53.p2;
import vt1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lfv1/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f73671x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static int f73672y = 1740;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f73673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ComposeView f73674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexTwoLineButton f73675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMEditTextTrainingInitiative f73676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexTwoLineButton f73677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexTwoLineButton f73678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexTwoLineButton f73679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f73680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f73681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f73682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f73683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f73684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AppCompatButton f73685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f73686n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RelativeLayout f73687o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f73688p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f73689q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f73690r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f73691t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public double f73692v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t41.a f73693w;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73694a;

        static {
            int[] iArr = new int[gg0.h.values().length];
            try {
                iArr[gg0.h.DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gg0.h.TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f73694a = iArr;
        }
    }

    /* JADX INFO: renamed from: fv1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"fv1/c$c", "Lag0/b$b;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1492c implements ag0.b.InterfaceC0051b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f73695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ double f73696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f73697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f73698d;

        public C1492c(boolean z14, double d14, boolean z15, c cVar) {
            this.f73695a = z14;
            this.f73696b = d14;
            this.f73697c = z15;
            this.f73698d = cVar;
        }

        @Override // ag0.b.InterfaceC0051b
        public final void a(long j8) {
            double d14;
            boolean z14 = this.f73695a;
            c cVar = this.f73698d;
            if (!z14) {
                cVar.f73691t = j8;
                double d15 = cVar.f73690r / j8;
                bg0.a.f17827a.getClass();
                if (bg0.a.C0255a.e()) {
                    l3.f23124b.getClass();
                    d14 = 1000.0d * d15;
                } else {
                    l3.f23124b.getClass();
                    d14 = d15 * 1609.344d;
                }
                cVar.f73689q = d14;
                if (!c.v6(d15, bg0.a.C0255a.e())) {
                    cVar.z6();
                    return;
                }
                cVar.C6();
                cVar.A6(d15, bg0.a.C0255a.e());
                AppCompatButton appCompatButton = cVar.f73685m;
                if (appCompatButton != null) {
                    appCompatButton.setEnabled(true);
                    return;
                } else {
                    s.m("nextButton");
                    throw null;
                }
            }
            double d16 = this.f73696b;
            double d17 = d16 / ((double) 1000);
            double d18 = this.f73697c ? 1.0d : 1.609344d;
            double d19 = d16 / 1609.344d;
            cVar.f73691t = j8;
            long j14 = (long) (j8 * (d17 / d18));
            cVar.f73688p = j14;
            l3.f23124b.getClass();
            if (((int) j14) / DateTimeConstants.SECONDS_PER_HOUR > 48) {
                AppCompatButton appCompatButton2 = cVar.f73685m;
                if (appCompatButton2 != null) {
                    appCompatButton2.setEnabled(false);
                    return;
                } else {
                    s.m("nextButton");
                    throw null;
                }
            }
            ag0.c.a aVar = ag0.c.U0;
            long j15 = cVar.f73688p;
            aVar.getClass();
            cVar.f73688p = dh.b.S(ag0.c.a.a(j15));
            GCMComplexTwoLineButton gCMComplexTwoLineButton = cVar.f73675c;
            if (gCMComplexTwoLineButton == null) {
                s.m("goalTimeView");
                throw null;
            }
            gCMComplexTwoLineButton.setRightIcon(null);
            u uVarA = ag0.c.a.a((long) (240 * d19));
            u uVarA2 = ag0.c.a.a((long) (d19 * 1200));
            long j16 = cVar.f73688p;
            long jS = dh.b.S(uVarA);
            long jS2 = dh.b.S(uVarA2);
            if (j16 > jS2) {
                j16 = jS2;
            } else if (j16 < jS) {
                j16 = jS;
            }
            cVar.f73688p = j16;
            cVar.f73690r = j16;
            cVar.C6();
            String strE1 = l3.a.e1(cVar.f73688p);
            Context contextRequireContext = cVar.requireContext();
            contextRequireContext.getClass();
            String strK1 = l3.a.k1(new l22.a(contextRequireContext), true, (int) cVar.f73688p);
            GCMComplexTwoLineButton gCMComplexTwoLineButton2 = cVar.f73675c;
            if (gCMComplexTwoLineButton2 == null) {
                s.m("goalTimeView");
                throw null;
            }
            gCMComplexTwoLineButton2.b(strE1, strK1);
            AppCompatButton appCompatButton3 = cVar.f73685m;
            if (appCompatButton3 != null) {
                appCompatButton3.setEnabled(true);
            } else {
                s.m("nextButton");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.editgoal.fragments.FBTEditGoalDataFragment$onViewCreated$1", f = "FBTEditGoalDataFragment.kt", l = {100}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f73699a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f73701a;

            public a(c cVar) {
                this.f73701a = cVar;
            }

            /* JADX WARN: Code duplicated, block: B:115:0x0263  */
            /* JADX WARN: Code duplicated, block: B:188:0x03a0  */
            /* JADX WARN: Code duplicated, block: B:190:0x03aa  */
            /* JADX WARN: Code duplicated, block: B:193:0x03b3  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                String string;
                m mVarY4;
                double dDoubleValue;
                Double d14;
                double dDoubleValue2;
                double d15;
                String strC;
                String strA;
                a aVar = c.f73671x;
                c cVar = this.f73701a;
                o oVar = cVar.u6().I;
                o oVar2 = o.f180175f;
                GCMComplexTwoLineButton gCMComplexTwoLineButton = cVar.f73678f;
                int i14 = 0;
                z = false;
                z = false;
                z = false;
                z = false;
                boolean z14 = false;
                if (oVar == oVar2) {
                    if (gCMComplexTwoLineButton == null) {
                        s.m("goalPace");
                        throw null;
                    }
                    gCMComplexTwoLineButton.setVisibility(0);
                    GCMComplexTwoLineButton gCMComplexTwoLineButton2 = cVar.f73679g;
                    if (gCMComplexTwoLineButton2 == null) {
                        s.m("goalSpeed");
                        throw null;
                    }
                    gCMComplexTwoLineButton2.setVisibility(8);
                    boolean zZ4 = cVar.u6().Z4();
                    TextView textView = cVar.f73684l;
                    if (zZ4) {
                        if (textView == null) {
                            s.m("helperNoteTV");
                            throw null;
                        }
                        textView.setText(cVar.getString(R.string.enter_goal_distance_or_pace));
                        string = cVar.getString(R.string.goal_distance_question);
                        string.getClass();
                    } else {
                        if (textView == null) {
                            s.m("helperNoteTV");
                            throw null;
                        }
                        textView.setText(cVar.getString(R.string.enter_goal_time_or_pace));
                        string = cVar.getString(R.string.goal_finish_time_question);
                        string.getClass();
                    }
                } else {
                    if (gCMComplexTwoLineButton == null) {
                        s.m("goalPace");
                        throw null;
                    }
                    gCMComplexTwoLineButton.setVisibility(8);
                    GCMComplexTwoLineButton gCMComplexTwoLineButton3 = cVar.f73679g;
                    if (gCMComplexTwoLineButton3 == null) {
                        s.m("goalSpeed");
                        throw null;
                    }
                    gCMComplexTwoLineButton3.setVisibility(0);
                    boolean zZ5 = cVar.u6().Z4();
                    TextView textView2 = cVar.f73684l;
                    if (zZ5) {
                        if (textView2 == null) {
                            s.m("helperNoteTV");
                            throw null;
                        }
                        textView2.setText(cVar.getString(R.string.enter_goal_distance_or_speed));
                        string = cVar.getString(R.string.goal_distance_question);
                        string.getClass();
                    } else {
                        if (textView2 == null) {
                            s.m("helperNoteTV");
                            throw null;
                        }
                        textView2.setText(cVar.getString(R.string.enter_goal_time_or_speed));
                        string = cVar.getString(R.string.goal_finish_time_question);
                        string.getClass();
                    }
                }
                ComposeView composeView = cVar.f73674b;
                if (composeView == null) {
                    s.m("wizardHeaderContainer");
                    throw null;
                }
                composeView.setViewCompositionStrategy(w3.d.f91628b);
                composeView.setContent(new z3.e(1440591060, true, new fv1.b(string, i14)));
                m mVarX4 = cVar.u6().X4();
                Double d16 = mVarX4 != null ? mVarX4.f101076a : null;
                m mVarX5 = cVar.u6().X4();
                gg0.i iVar = mVarX5 != null ? mVarX5.f101077b : null;
                if (d16 != null && iVar != null) {
                    m mVarX6 = cVar.u6().X4();
                    gg0.h hVar = mVarX6 != null ? mVarX6.f101078c : null;
                    int i15 = hVar == null ? -1 : b.f73694a[hVar.ordinal()];
                    if (i15 == 1) {
                        double dDoubleValue3 = d16.doubleValue();
                        og0.a aVar2 = og0.a.f131967a;
                        aVar2.getClass();
                        double dG = og0.a.g(dDoubleValue3, iVar);
                        cVar.f73689q = dG;
                        TextView textView3 = cVar.f73682j;
                        if (textView3 == null) {
                            s.m("textViewUnitValue");
                            throw null;
                        }
                        textView3.setText(og0.a.i(aVar2, dG));
                        TextView textView4 = cVar.f73681i;
                        if (textView4 == null) {
                            s.m("textViewUnitType");
                            throw null;
                        }
                        Context contextRequireContext = cVar.requireContext();
                        contextRequireContext.getClass();
                        textView4.setText(og0.a.q(contextRequireContext));
                        TextView textView5 = cVar.f73680h;
                        if (textView5 == null) {
                            s.m("textViewUnit");
                            throw null;
                        }
                        textView5.setText(cVar.getString(R.string.event_distance));
                        Context contextRequireContext2 = cVar.requireContext();
                        contextRequireContext2.getClass();
                        String strR = og0.a.r(contextRequireContext2);
                        LinearLayout linearLayout = cVar.f73683k;
                        if (linearLayout == null) {
                            s.m("unitValueContainer");
                            throw null;
                        }
                        TextView textView6 = cVar.f73680h;
                        if (textView6 == null) {
                            s.m("textViewUnit");
                            throw null;
                        }
                        CharSequence text = textView6.getText();
                        TextView textView7 = cVar.f73682j;
                        if (textView7 == null) {
                            s.m("textViewUnitValue");
                            throw null;
                        }
                        linearLayout.setContentDescription(((Object) text) + StringUtils.SPACE + ((Object) textView7.getText()) + StringUtils.SPACE + strR);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = cVar.f73675c;
                        if (gCMComplexTwoLineButton4 == null) {
                            s.m("goalTimeView");
                            throw null;
                        }
                        gCMComplexTwoLineButton4.setVisibility(0);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = cVar.f73675c;
                        if (gCMComplexTwoLineButton5 == null) {
                            s.m("goalTimeView");
                            throw null;
                        }
                        gCMComplexTwoLineButton5.setButtonTopLabel(cVar.getString(R.string.lbl_goal_time));
                        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = cVar.f73675c;
                        if (gCMComplexTwoLineButton6 == null) {
                            s.m("goalTimeView");
                            throw null;
                        }
                        gCMComplexTwoLineButton6.setButtonBottomLeftLabel(cVar.getString(R.string.enter_goal_time));
                        c.f73672y = (int) (((double) 600) * ((cVar.f73689q / ((double) 1000)) / ((cVar.f73693w == t41.a.KILOMETER ? 1 : 0) != 0 ? 1.0d : 1.609344d)));
                        m mVarY5 = cVar.u6().Y4();
                        if ((mVarY5 != null ? mVarY5.f101076a : null) != null) {
                            mVarY4 = cVar.u6().Y4();
                            if (mVarY4 != null || (d14 = mVarY4.f101076a) == null) {
                                dDoubleValue = 0.0d;
                            } else {
                                dDoubleValue = d14.doubleValue();
                            }
                            cVar.f73690r = dDoubleValue;
                            cVar.F6((long) dDoubleValue);
                            cVar.y6(true);
                        } else {
                            m mVarY6 = cVar.u6().Y4();
                            if ((mVarY6 != null ? mVarY6.f101077b : null) != null) {
                                mVarY4 = cVar.u6().Y4();
                                if (mVarY4 != null) {
                                    dDoubleValue = 0.0d;
                                } else {
                                    dDoubleValue = 0.0d;
                                }
                                cVar.f73690r = dDoubleValue;
                                cVar.F6((long) dDoubleValue);
                                cVar.y6(true);
                            } else {
                                m mVarY7 = cVar.u6().Y4();
                                if ((mVarY7 != null ? mVarY7.f101078c : null) != null) {
                                    mVarY4 = cVar.u6().Y4();
                                    if (mVarY4 != null) {
                                        dDoubleValue = 0.0d;
                                    } else {
                                        dDoubleValue = 0.0d;
                                    }
                                    cVar.f73690r = dDoubleValue;
                                    cVar.F6((long) dDoubleValue);
                                    cVar.y6(true);
                                }
                            }
                        }
                    } else if (i15 == 2) {
                        double dDoubleValue4 = d16.doubleValue();
                        og0.a.f131967a.getClass();
                        double dJ = og0.a.j(dDoubleValue4, iVar);
                        cVar.f73690r = dJ;
                        TextView textView8 = cVar.f73682j;
                        if (textView8 == null) {
                            s.m("textViewUnitValue");
                            throw null;
                        }
                        l3.f23124b.getClass();
                        textView8.setText(l3.a.e1((long) dJ));
                        Context contextRequireContext3 = cVar.requireContext();
                        contextRequireContext3.getClass();
                        String strK1 = l3.a.k1(new l22.a(contextRequireContext3), true, (int) cVar.f73690r);
                        TextView textView9 = cVar.f73680h;
                        if (textView9 == null) {
                            s.m("textViewUnit");
                            throw null;
                        }
                        textView9.setText(cVar.getString(R.string.event_time));
                        LinearLayout linearLayout2 = cVar.f73683k;
                        if (linearLayout2 == null) {
                            s.m("unitValueContainer");
                            throw null;
                        }
                        TextView textView10 = cVar.f73680h;
                        if (textView10 == null) {
                            s.m("textViewUnit");
                            throw null;
                        }
                        linearLayout2.setContentDescription(((Object) textView10.getText()) + StringUtils.SPACE + strK1);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton7 = cVar.f73677e;
                        if (gCMComplexTwoLineButton7 == null) {
                            s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton7.setButtonBottomLeftLabel(cVar.getString(R.string.enter_goal_distance));
                        GCMComplexTwoLineButton gCMComplexTwoLineButton8 = cVar.f73677e;
                        if (gCMComplexTwoLineButton8 == null) {
                            s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton8.setVisibility(0);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton9 = cVar.f73677e;
                        if (gCMComplexTwoLineButton9 == null) {
                            s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton9.setButtonBottomLeftLabel(cVar.getString(R.string.enter_goal_distance));
                        m mVarY8 = cVar.u6().Y4();
                        if (mVarY8 != null) {
                            gg0.i iVar2 = mVarY8.f101077b;
                            Double d17 = mVarY8.f101076a;
                            bg0.a.f17827a.getClass();
                            if (bg0.a.C0255a.e()) {
                                dDoubleValue2 = d17 != null ? d17.doubleValue() : 0.0d;
                                d15 = 1000.0d;
                            } else {
                                dDoubleValue2 = d17 != null ? d17.doubleValue() : 0.0d;
                                d15 = 1609.344d;
                            }
                            double d18 = dDoubleValue2 * d15;
                            cVar.f73689q = d18;
                            if (d18 > 0.0d) {
                                x0 x0Var = x0.f105818a;
                                String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(og0.a.A(d17 != null ? d17.doubleValue() : 0.0d, 2))}, 1));
                                if (iVar2 != null) {
                                    Context contextRequireContext4 = cVar.requireContext();
                                    contextRequireContext4.getClass();
                                    strC = iVar2.c(contextRequireContext4);
                                } else {
                                    strC = null;
                                }
                                String strG = e5.g(str, StringUtils.SPACE, strC);
                                if (iVar2 != null) {
                                    Context contextRequireContext5 = cVar.requireContext();
                                    contextRequireContext5.getClass();
                                    strA = iVar2.a(contextRequireContext5);
                                } else {
                                    strA = null;
                                }
                                String strG2 = e5.g(str, StringUtils.SPACE, strA);
                                GCMComplexTwoLineButton gCMComplexTwoLineButton10 = cVar.f73677e;
                                if (gCMComplexTwoLineButton10 == null) {
                                    s.m("goalDistance");
                                    throw null;
                                }
                                gCMComplexTwoLineButton10.b(strG, strG2);
                                GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative = cVar.f73676d;
                                if (gCMEditTextTrainingInitiative == null) {
                                    s.m("goalDistanceEditText");
                                    throw null;
                                }
                                gCMEditTextTrainingInitiative.getF34926b().setText(str);
                            }
                        }
                        cVar.y6(false);
                        AppCompatButton appCompatButton = cVar.f73685m;
                        if (appCompatButton == null) {
                            s.m("nextButton");
                            throw null;
                        }
                        if (cVar.u6().I != o.f180176g) {
                            m mVarY9 = cVar.u6().Y4();
                            if (mVarY9 != null && cVar.f73689q > 0.0d) {
                                Double d19 = mVarY9.f101076a;
                                if (c.v6(d19 != null ? d19.doubleValue() : 0.0d, mVarY9.f101077b == gg0.i.KILOMETER)) {
                                    z14 = true;
                                }
                            }
                        } else if (cVar.f73690r > 0.0d && cVar.f73689q > 0.0d) {
                            z14 = true;
                        }
                        appCompatButton.setEnabled(z14);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to fv1.c$d for r5v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r5.f73699a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 == r3) goto L10
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r6)
                return r2
            L10:
                o13.r.b(r6)
                goto L31
            L14:
                o13.r.b(r6)
                fv1.c$a r6 = fv1.c.f73671x
                fv1.c r6 = fv1.c.this
                ev1.b r1 = r6.u6()
                r53.b2 r1 = r1.T
                fv1.c$d$a r4 = new fv1.c$d$a
                r4.<init>(r6)
                r5.f73699a = r3
                r53.o2<T> r6 = r1.f150540a
                java.lang.Object r6 = r6.collect(r4, r5)
                if (r6 != r0) goto L31
                return r0
            L31:
                o2.c.f()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: fv1.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f73702a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f73702a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f73702a.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f73703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f73704b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f73703a = aVar;
            this.f73704b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f73703a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f73704b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f73705a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f73705a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f73705a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public c() {
        super(R.layout.fbta_goal_setup_frag);
        this.f73673a = new w1(s0.f105811a.b(ev1.b.class), new e(this), new g(this), new f(null, this));
        this.f73688p = AbstractComponentTracker.LINGERING_TIMEOUT;
        this.f73691t = 600L;
        this.f73693w = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? t41.a.KILOMETER : t41.a.MILE;
    }

    public static boolean v6(double d14, boolean z14) {
        if (z14) {
            return d14 <= 1609.0d;
        }
        return d14 <= 1000.0d;
    }

    public final void A6(double d14, boolean z14) {
        String strC;
        if (z14) {
            gg0.i iVar = gg0.i.KILOMETER;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            strC = iVar.c(contextRequireContext);
        } else {
            gg0.i iVar2 = gg0.i.MILE;
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            strC = iVar2.c(contextRequireContext2);
        }
        String string = z14 ? getString(R.string.lbl_kilometers) : getString(R.string.lbl_miles);
        string.getClass();
        x0 x0Var = x0.f105818a;
        og0.a.f131967a.getClass();
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(og0.a.A(d14, 2))}, 1));
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f73677e;
        if (gCMComplexTwoLineButton == null) {
            s.m("goalDistance");
            throw null;
        }
        gCMComplexTwoLineButton.setRightIcon(null);
        double d15 = this.f73689q;
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f73677e;
        if (d15 > 0.0d) {
            if (gCMComplexTwoLineButton2 == null) {
                s.m("goalDistance");
                throw null;
            }
            gCMComplexTwoLineButton2.b(e5.g(str, StringUtils.SPACE, strC), str + StringUtils.SPACE + string);
        } else {
            if (gCMComplexTwoLineButton2 == null) {
                s.m("goalDistance");
                throw null;
            }
            gCMComplexTwoLineButton2.setButtonBottomLeftLabel(getString(R.string.enter_goal_distance));
        }
        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative = this.f73676d;
        if (gCMEditTextTrainingInitiative == null) {
            s.m("goalDistanceEditText");
            throw null;
        }
        MultiLineImeEditText f34926b = gCMEditTextTrainingInitiative.getF34926b();
        f34926b.setText(str);
        Editable text = f34926b.getText();
        f34926b.setSelection(text != null ? text.length() : 0);
    }

    public final void C6() {
        bg0.a.f17827a.getClass();
        String string = bg0.a.C0255a.e() ? getString(R.string.lbl_pace_unit_km) : getString(R.string.lbl_pace_unit_mi);
        string.getClass();
        String string2 = bg0.a.C0255a.e() ? getString(R.string.lbl_per_kilometer) : getString(R.string.lbl_per_mile);
        string2.getClass();
        og0.a aVar = og0.a.f131967a;
        double d14 = this.f73690r;
        double d15 = this.f73689q;
        aVar.getClass();
        String strB = og0.a.b(d14, d15);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        double d16 = this.f73690r;
        double d17 = this.f73689q;
        l3.a aVar2 = l3.f23124b;
        l22.a aVar3 = new l22.a(contextRequireContext);
        int iD = (int) og0.a.d(d16, d17);
        aVar2.getClass();
        String strK1 = l3.a.k1(aVar3, true, iD);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f73678f;
        if (gCMComplexTwoLineButton == null) {
            s.m("goalPace");
            throw null;
        }
        gCMComplexTwoLineButton.b(e5.g(strB, StringUtils.SPACE, string), strK1 + StringUtils.SPACE + string2);
    }

    public final void E6(double d14, boolean z14) {
        q3 q3Var = z14 ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
        l3.a aVar = l3.f23124b;
        Context context = getContext();
        aVar.getClass();
        String strN0 = l3.a.N0(context, d14, q3Var, l3.f23130h, true, getString(R.string.enter_goal_speed));
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f73679g;
        if (gCMComplexTwoLineButton != null) {
            gCMComplexTwoLineButton.setButtonBottomLeftLabel(strN0);
        } else {
            s.m("goalSpeed");
            throw null;
        }
    }

    public final void F6(long j8) {
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f73675c;
        if (gCMComplexTwoLineButton == null) {
            s.m("goalTimeView");
            throw null;
        }
        gCMComplexTwoLineButton.setRightIcon(null);
        l3.f23124b.getClass();
        String strE1 = l3.a.e1(j8);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String strK1 = l3.a.k1(new l22.a(contextRequireContext), true, (int) j8);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f73675c;
        if (gCMComplexTwoLineButton2 != null) {
            gCMComplexTwoLineButton2.b(strE1, strK1);
        } else {
            s.m("goalTimeView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.wizard_header_container);
        viewFindViewById.getClass();
        this.f73674b = (ComposeView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.event_goal_time);
        viewFindViewById2.getClass();
        this.f73675c = (GCMComplexTwoLineButton) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.event_goal_pace);
        viewFindViewById3.getClass();
        this.f73678f = (GCMComplexTwoLineButton) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.event_goal_distance);
        viewFindViewById4.getClass();
        this.f73677e = (GCMComplexTwoLineButton) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.event_goal_distance_edit_text);
        viewFindViewById5.getClass();
        this.f73676d = (GCMEditTextTrainingInitiative) viewFindViewById5;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f73678f;
        if (gCMComplexTwoLineButton == null) {
            s.m("goalPace");
            throw null;
        }
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(getString(R.string.enter_goal_pace));
        View viewFindViewById6 = view2.findViewById(R.id.event_goal_speed);
        viewFindViewById6.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) viewFindViewById6;
        this.f73679g = gCMComplexTwoLineButton2;
        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(getString(R.string.enter_goal_speed));
        View viewFindViewById7 = view2.findViewById(R.id.text_view_unit);
        viewFindViewById7.getClass();
        this.f73680h = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.text_view_unit_type);
        viewFindViewById8.getClass();
        this.f73681i = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.text_view_unit_value);
        viewFindViewById9.getClass();
        this.f73682j = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.unit_value_container);
        viewFindViewById10.getClass();
        this.f73683k = (LinearLayout) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.next_button);
        viewFindViewById11.getClass();
        this.f73685m = (AppCompatButton) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.helper_note_view);
        viewFindViewById12.getClass();
        this.f73684l = (TextView) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.goal_distance_view);
        viewFindViewById13.getClass();
        this.f73687o = (RelativeLayout) viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.distance_clear_image_view);
        viewFindViewById14.getClass();
        this.f73686n = (ImageView) viewFindViewById14;
        View viewFindViewById15 = view2.findViewById(R.id.bottom_layout);
        viewFindViewById15.getClass();
        AppCompatButton appCompatButton = this.f73685m;
        if (appCompatButton == null) {
            s.m("nextButton");
            throw null;
        }
        Context context = getContext();
        appCompatButton.setText(context != null ? context.getString(R.string.lbl_next) : null);
        AppCompatButton appCompatButton2 = this.f73685m;
        if (appCompatButton2 == null) {
            s.m("nextButton");
            throw null;
        }
        appCompatButton2.setEnabled(false);
        androidx.fragment.app.m activity = getActivity();
        z1 z1Var = activity instanceof z1 ? (z1) activity : null;
        if (z1Var != null) {
            z1Var.updateActionBarNavigation(2);
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f73677e;
        if (gCMComplexTwoLineButton3 == null) {
            s.m("goalDistance");
            throw null;
        }
        final int i14 = 1;
        gCMComplexTwoLineButton3.setOnClickListener(new View.OnClickListener(this) { // from class: fv1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f73668b;

            {
                this.f73668b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Double dValueOf;
                gg0.i iVar;
                gg0.h hVar;
                int i15 = i14;
                c cVar = this.f73668b;
                switch (i15) {
                    case 0:
                        double d14 = cVar.f73690r;
                        f1 f1VarA = f1.a.a(f1.Y0, d14 > 0.0d ? (int) d14 : c.f73672y, 48, 108);
                        f1VarA.T = new n(cVar, 18);
                        String str = f1.Z0;
                        v childFragmentManager = cVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (childFragmentManager.G(str) == null) {
                            f1VarA.show(childFragmentManager, str);
                            return;
                        }
                        return;
                    case 1:
                        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = cVar.f73677e;
                        if (gCMComplexTwoLineButton4 == null) {
                            s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton4.setVisibility(8);
                        RelativeLayout relativeLayout = cVar.f73687o;
                        if (relativeLayout == null) {
                            s.m("goalDistanceContainer");
                            throw null;
                        }
                        relativeLayout.setVisibility(0);
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative != null) {
                            gCMEditTextTrainingInitiative.getF34926b().requestFocus();
                            return;
                        } else {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 2:
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative2 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative2 != null) {
                            gCMEditTextTrainingInitiative2.getF34926b().setText("");
                            return;
                        } else {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 3:
                        c.a aVar = c.f73671x;
                        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
                        Context contextRequireContext = cVar.requireContext();
                        contextRequireContext.getClass();
                        new ag0.f(contextRequireContext, cVar.f73692v, zY, new as2.d(cVar, zY, 7)).show();
                        return;
                    case 4:
                        c.a aVar2 = c.f73671x;
                        Context context2 = cVar.getContext();
                        Object systemService = context2 != null ? context2.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative3 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative3 == null) {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                        inputMethodManager.hideSoftInputFromWindow(gCMEditTextTrainingInitiative3.getWindowToken(), 0);
                        if (cVar.u6().Z4()) {
                            cVar.w6(0.0d, false);
                            return;
                        } else {
                            cVar.w6(cVar.f73689q, true);
                            return;
                        }
                    default:
                        c.a aVar3 = c.f73671x;
                        bg0.a.f17827a.getClass();
                        boolean zE = bg0.a.C0255a.e();
                        if (cVar.u6().Z4()) {
                            if (zE) {
                                og0.a aVar4 = og0.a.f131967a;
                                l3.a aVar5 = l3.f23124b;
                                double d15 = cVar.f73689q;
                                aVar5.getClass();
                                aVar4.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d15 / 1000.0d, 2));
                            } else {
                                og0.a aVar6 = og0.a.f131967a;
                                l3.a aVar7 = l3.f23124b;
                                double d16 = cVar.f73689q;
                                aVar7.getClass();
                                aVar6.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d16 / 1609.344d, 2));
                            }
                            iVar = bg0.a.C0255a.e() ? gg0.i.KILOMETER : gg0.i.MILE;
                            hVar = gg0.h.DISTANCE;
                        } else {
                            dValueOf = Double.valueOf(cVar.f73690r);
                            iVar = gg0.i.SECOND;
                            hVar = gg0.h.TIME;
                        }
                        m mVar = new m(dValueOf, iVar, hVar);
                        p2 p2Var = cVar.u6().P;
                        gv1.a aVar8 = (gv1.a) p2Var.getValue();
                        p2Var.setValue(aVar8 != null ? gv1.a.a(aVar8, null, mVar, 13) : null);
                        cVar.getParentFragmentManager().a0(0, "FBTEditGoalFragment");
                        return;
                }
            }
        });
        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative = this.f73676d;
        if (gCMEditTextTrainingInitiative == null) {
            s.m("goalDistanceEditText");
            throw null;
        }
        gCMEditTextTrainingInitiative.getF34925a().setTextColor(gCMEditTextTrainingInitiative.getResources().getColor(R.color.gcm_text_secondary, null));
        MultiLineImeEditText f34926b = gCMEditTextTrainingInitiative.getF34926b();
        f34926b.setInputType(8194);
        f34926b.setText("");
        f34926b.setTextColor(f34926b.getResources().getColor(R.color.gcm_text_primary, null));
        int i15 = 1;
        f34926b.setOnFocusChangeListener(new ew1.l(i15, f34926b, this));
        f34926b.addTextChangedListener(new fv1.d(this));
        f34926b.setOnEditorActionListener(new ew1.m(this, f34926b, view2, i15));
        ImageView imageView = this.f73686n;
        if (imageView == null) {
            s.m("distanceClearImageView");
            throw null;
        }
        final int i16 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: fv1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f73668b;

            {
                this.f73668b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Double dValueOf;
                gg0.i iVar;
                gg0.h hVar;
                int i17 = i16;
                c cVar = this.f73668b;
                switch (i17) {
                    case 0:
                        double d14 = cVar.f73690r;
                        f1 f1VarA = f1.a.a(f1.Y0, d14 > 0.0d ? (int) d14 : c.f73672y, 48, 108);
                        f1VarA.T = new n(cVar, 18);
                        String str = f1.Z0;
                        v childFragmentManager = cVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (childFragmentManager.G(str) == null) {
                            f1VarA.show(childFragmentManager, str);
                            return;
                        }
                        return;
                    case 1:
                        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = cVar.f73677e;
                        if (gCMComplexTwoLineButton4 == null) {
                            s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton4.setVisibility(8);
                        RelativeLayout relativeLayout = cVar.f73687o;
                        if (relativeLayout == null) {
                            s.m("goalDistanceContainer");
                            throw null;
                        }
                        relativeLayout.setVisibility(0);
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative2 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative2 != null) {
                            gCMEditTextTrainingInitiative2.getF34926b().requestFocus();
                            return;
                        } else {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 2:
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative3 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative3 != null) {
                            gCMEditTextTrainingInitiative3.getF34926b().setText("");
                            return;
                        } else {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 3:
                        c.a aVar = c.f73671x;
                        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
                        Context contextRequireContext = cVar.requireContext();
                        contextRequireContext.getClass();
                        new ag0.f(contextRequireContext, cVar.f73692v, zY, new as2.d(cVar, zY, 7)).show();
                        return;
                    case 4:
                        c.a aVar2 = c.f73671x;
                        Context context2 = cVar.getContext();
                        Object systemService = context2 != null ? context2.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative4 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative4 == null) {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                        inputMethodManager.hideSoftInputFromWindow(gCMEditTextTrainingInitiative4.getWindowToken(), 0);
                        if (cVar.u6().Z4()) {
                            cVar.w6(0.0d, false);
                            return;
                        } else {
                            cVar.w6(cVar.f73689q, true);
                            return;
                        }
                    default:
                        c.a aVar3 = c.f73671x;
                        bg0.a.f17827a.getClass();
                        boolean zE = bg0.a.C0255a.e();
                        if (cVar.u6().Z4()) {
                            if (zE) {
                                og0.a aVar4 = og0.a.f131967a;
                                l3.a aVar5 = l3.f23124b;
                                double d15 = cVar.f73689q;
                                aVar5.getClass();
                                aVar4.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d15 / 1000.0d, 2));
                            } else {
                                og0.a aVar6 = og0.a.f131967a;
                                l3.a aVar7 = l3.f23124b;
                                double d16 = cVar.f73689q;
                                aVar7.getClass();
                                aVar6.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d16 / 1609.344d, 2));
                            }
                            iVar = bg0.a.C0255a.e() ? gg0.i.KILOMETER : gg0.i.MILE;
                            hVar = gg0.h.DISTANCE;
                        } else {
                            dValueOf = Double.valueOf(cVar.f73690r);
                            iVar = gg0.i.SECOND;
                            hVar = gg0.h.TIME;
                        }
                        m mVar = new m(dValueOf, iVar, hVar);
                        p2 p2Var = cVar.u6().P;
                        gv1.a aVar8 = (gv1.a) p2Var.getValue();
                        p2Var.setValue(aVar8 != null ? gv1.a.a(aVar8, null, mVar, 13) : null);
                        cVar.getParentFragmentManager().a0(0, "FBTEditGoalFragment");
                        return;
                }
            }
        });
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.f73679g;
        if (gCMComplexTwoLineButton4 == null) {
            s.m("goalSpeed");
            throw null;
        }
        final int i17 = 3;
        gCMComplexTwoLineButton4.setOnClickListener(new View.OnClickListener(this) { // from class: fv1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f73668b;

            {
                this.f73668b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Double dValueOf;
                gg0.i iVar;
                gg0.h hVar;
                int i18 = i17;
                c cVar = this.f73668b;
                switch (i18) {
                    case 0:
                        double d14 = cVar.f73690r;
                        f1 f1VarA = f1.a.a(f1.Y0, d14 > 0.0d ? (int) d14 : c.f73672y, 48, 108);
                        f1VarA.T = new n(cVar, 18);
                        String str = f1.Z0;
                        v childFragmentManager = cVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (childFragmentManager.G(str) == null) {
                            f1VarA.show(childFragmentManager, str);
                            return;
                        }
                        return;
                    case 1:
                        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = cVar.f73677e;
                        if (gCMComplexTwoLineButton5 == null) {
                            s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton5.setVisibility(8);
                        RelativeLayout relativeLayout = cVar.f73687o;
                        if (relativeLayout == null) {
                            s.m("goalDistanceContainer");
                            throw null;
                        }
                        relativeLayout.setVisibility(0);
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative2 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative2 != null) {
                            gCMEditTextTrainingInitiative2.getF34926b().requestFocus();
                            return;
                        } else {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 2:
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative3 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative3 != null) {
                            gCMEditTextTrainingInitiative3.getF34926b().setText("");
                            return;
                        } else {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 3:
                        c.a aVar = c.f73671x;
                        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
                        Context contextRequireContext = cVar.requireContext();
                        contextRequireContext.getClass();
                        new ag0.f(contextRequireContext, cVar.f73692v, zY, new as2.d(cVar, zY, 7)).show();
                        return;
                    case 4:
                        c.a aVar2 = c.f73671x;
                        Context context2 = cVar.getContext();
                        Object systemService = context2 != null ? context2.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative4 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative4 == null) {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                        inputMethodManager.hideSoftInputFromWindow(gCMEditTextTrainingInitiative4.getWindowToken(), 0);
                        if (cVar.u6().Z4()) {
                            cVar.w6(0.0d, false);
                            return;
                        } else {
                            cVar.w6(cVar.f73689q, true);
                            return;
                        }
                    default:
                        c.a aVar3 = c.f73671x;
                        bg0.a.f17827a.getClass();
                        boolean zE = bg0.a.C0255a.e();
                        if (cVar.u6().Z4()) {
                            if (zE) {
                                og0.a aVar4 = og0.a.f131967a;
                                l3.a aVar5 = l3.f23124b;
                                double d15 = cVar.f73689q;
                                aVar5.getClass();
                                aVar4.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d15 / 1000.0d, 2));
                            } else {
                                og0.a aVar6 = og0.a.f131967a;
                                l3.a aVar7 = l3.f23124b;
                                double d16 = cVar.f73689q;
                                aVar7.getClass();
                                aVar6.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d16 / 1609.344d, 2));
                            }
                            iVar = bg0.a.C0255a.e() ? gg0.i.KILOMETER : gg0.i.MILE;
                            hVar = gg0.h.DISTANCE;
                        } else {
                            dValueOf = Double.valueOf(cVar.f73690r);
                            iVar = gg0.i.SECOND;
                            hVar = gg0.h.TIME;
                        }
                        m mVar = new m(dValueOf, iVar, hVar);
                        p2 p2Var = cVar.u6().P;
                        gv1.a aVar8 = (gv1.a) p2Var.getValue();
                        p2Var.setValue(aVar8 != null ? gv1.a.a(aVar8, null, mVar, 13) : null);
                        cVar.getParentFragmentManager().a0(0, "FBTEditGoalFragment");
                        return;
                }
            }
        });
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = this.f73678f;
        if (gCMComplexTwoLineButton5 == null) {
            s.m("goalPace");
            throw null;
        }
        final int i18 = 4;
        gCMComplexTwoLineButton5.setOnClickListener(new View.OnClickListener(this) { // from class: fv1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f73668b;

            {
                this.f73668b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Double dValueOf;
                gg0.i iVar;
                gg0.h hVar;
                int i19 = i18;
                c cVar = this.f73668b;
                switch (i19) {
                    case 0:
                        double d14 = cVar.f73690r;
                        f1 f1VarA = f1.a.a(f1.Y0, d14 > 0.0d ? (int) d14 : c.f73672y, 48, 108);
                        f1VarA.T = new n(cVar, 18);
                        String str = f1.Z0;
                        v childFragmentManager = cVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (childFragmentManager.G(str) == null) {
                            f1VarA.show(childFragmentManager, str);
                            return;
                        }
                        return;
                    case 1:
                        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = cVar.f73677e;
                        if (gCMComplexTwoLineButton6 == null) {
                            s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton6.setVisibility(8);
                        RelativeLayout relativeLayout = cVar.f73687o;
                        if (relativeLayout == null) {
                            s.m("goalDistanceContainer");
                            throw null;
                        }
                        relativeLayout.setVisibility(0);
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative2 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative2 != null) {
                            gCMEditTextTrainingInitiative2.getF34926b().requestFocus();
                            return;
                        } else {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 2:
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative3 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative3 != null) {
                            gCMEditTextTrainingInitiative3.getF34926b().setText("");
                            return;
                        } else {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 3:
                        c.a aVar = c.f73671x;
                        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
                        Context contextRequireContext = cVar.requireContext();
                        contextRequireContext.getClass();
                        new ag0.f(contextRequireContext, cVar.f73692v, zY, new as2.d(cVar, zY, 7)).show();
                        return;
                    case 4:
                        c.a aVar2 = c.f73671x;
                        Context context2 = cVar.getContext();
                        Object systemService = context2 != null ? context2.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative4 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative4 == null) {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                        inputMethodManager.hideSoftInputFromWindow(gCMEditTextTrainingInitiative4.getWindowToken(), 0);
                        if (cVar.u6().Z4()) {
                            cVar.w6(0.0d, false);
                            return;
                        } else {
                            cVar.w6(cVar.f73689q, true);
                            return;
                        }
                    default:
                        c.a aVar3 = c.f73671x;
                        bg0.a.f17827a.getClass();
                        boolean zE = bg0.a.C0255a.e();
                        if (cVar.u6().Z4()) {
                            if (zE) {
                                og0.a aVar4 = og0.a.f131967a;
                                l3.a aVar5 = l3.f23124b;
                                double d15 = cVar.f73689q;
                                aVar5.getClass();
                                aVar4.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d15 / 1000.0d, 2));
                            } else {
                                og0.a aVar6 = og0.a.f131967a;
                                l3.a aVar7 = l3.f23124b;
                                double d16 = cVar.f73689q;
                                aVar7.getClass();
                                aVar6.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d16 / 1609.344d, 2));
                            }
                            iVar = bg0.a.C0255a.e() ? gg0.i.KILOMETER : gg0.i.MILE;
                            hVar = gg0.h.DISTANCE;
                        } else {
                            dValueOf = Double.valueOf(cVar.f73690r);
                            iVar = gg0.i.SECOND;
                            hVar = gg0.h.TIME;
                        }
                        m mVar = new m(dValueOf, iVar, hVar);
                        p2 p2Var = cVar.u6().P;
                        gv1.a aVar8 = (gv1.a) p2Var.getValue();
                        p2Var.setValue(aVar8 != null ? gv1.a.a(aVar8, null, mVar, 13) : null);
                        cVar.getParentFragmentManager().a0(0, "FBTEditGoalFragment");
                        return;
                }
            }
        });
        AppCompatButton appCompatButton3 = this.f73685m;
        if (appCompatButton3 == null) {
            s.m("nextButton");
            throw null;
        }
        final int i19 = 5;
        appCompatButton3.setOnClickListener(new View.OnClickListener(this) { // from class: fv1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f73668b;

            {
                this.f73668b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Double dValueOf;
                gg0.i iVar;
                gg0.h hVar;
                int i110 = i19;
                c cVar = this.f73668b;
                switch (i110) {
                    case 0:
                        double d14 = cVar.f73690r;
                        f1 f1VarA = f1.a.a(f1.Y0, d14 > 0.0d ? (int) d14 : c.f73672y, 48, 108);
                        f1VarA.T = new n(cVar, 18);
                        String str = f1.Z0;
                        v childFragmentManager = cVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (childFragmentManager.G(str) == null) {
                            f1VarA.show(childFragmentManager, str);
                            return;
                        }
                        return;
                    case 1:
                        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = cVar.f73677e;
                        if (gCMComplexTwoLineButton6 == null) {
                            s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton6.setVisibility(8);
                        RelativeLayout relativeLayout = cVar.f73687o;
                        if (relativeLayout == null) {
                            s.m("goalDistanceContainer");
                            throw null;
                        }
                        relativeLayout.setVisibility(0);
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative2 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative2 != null) {
                            gCMEditTextTrainingInitiative2.getF34926b().requestFocus();
                            return;
                        } else {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 2:
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative3 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative3 != null) {
                            gCMEditTextTrainingInitiative3.getF34926b().setText("");
                            return;
                        } else {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 3:
                        c.a aVar = c.f73671x;
                        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
                        Context contextRequireContext = cVar.requireContext();
                        contextRequireContext.getClass();
                        new ag0.f(contextRequireContext, cVar.f73692v, zY, new as2.d(cVar, zY, 7)).show();
                        return;
                    case 4:
                        c.a aVar2 = c.f73671x;
                        Context context2 = cVar.getContext();
                        Object systemService = context2 != null ? context2.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative4 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative4 == null) {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                        inputMethodManager.hideSoftInputFromWindow(gCMEditTextTrainingInitiative4.getWindowToken(), 0);
                        if (cVar.u6().Z4()) {
                            cVar.w6(0.0d, false);
                            return;
                        } else {
                            cVar.w6(cVar.f73689q, true);
                            return;
                        }
                    default:
                        c.a aVar3 = c.f73671x;
                        bg0.a.f17827a.getClass();
                        boolean zE = bg0.a.C0255a.e();
                        if (cVar.u6().Z4()) {
                            if (zE) {
                                og0.a aVar4 = og0.a.f131967a;
                                l3.a aVar5 = l3.f23124b;
                                double d15 = cVar.f73689q;
                                aVar5.getClass();
                                aVar4.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d15 / 1000.0d, 2));
                            } else {
                                og0.a aVar6 = og0.a.f131967a;
                                l3.a aVar7 = l3.f23124b;
                                double d16 = cVar.f73689q;
                                aVar7.getClass();
                                aVar6.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d16 / 1609.344d, 2));
                            }
                            iVar = bg0.a.C0255a.e() ? gg0.i.KILOMETER : gg0.i.MILE;
                            hVar = gg0.h.DISTANCE;
                        } else {
                            dValueOf = Double.valueOf(cVar.f73690r);
                            iVar = gg0.i.SECOND;
                            hVar = gg0.h.TIME;
                        }
                        m mVar = new m(dValueOf, iVar, hVar);
                        p2 p2Var = cVar.u6().P;
                        gv1.a aVar8 = (gv1.a) p2Var.getValue();
                        p2Var.setValue(aVar8 != null ? gv1.a.a(aVar8, null, mVar, 13) : null);
                        cVar.getParentFragmentManager().a0(0, "FBTEditGoalFragment");
                        return;
                }
            }
        });
        requireActivity().setTitle(R.string.set_goals_title);
        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = this.f73675c;
        if (gCMComplexTwoLineButton6 == null) {
            s.m("goalTimeView");
            throw null;
        }
        final int i24 = 0;
        gCMComplexTwoLineButton6.setOnClickListener(new View.OnClickListener(this) { // from class: fv1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f73668b;

            {
                this.f73668b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Double dValueOf;
                gg0.i iVar;
                gg0.h hVar;
                int i110 = i24;
                c cVar = this.f73668b;
                switch (i110) {
                    case 0:
                        double d14 = cVar.f73690r;
                        f1 f1VarA = f1.a.a(f1.Y0, d14 > 0.0d ? (int) d14 : c.f73672y, 48, 108);
                        f1VarA.T = new n(cVar, 18);
                        String str = f1.Z0;
                        v childFragmentManager = cVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (childFragmentManager.G(str) == null) {
                            f1VarA.show(childFragmentManager, str);
                            return;
                        }
                        return;
                    case 1:
                        GCMComplexTwoLineButton gCMComplexTwoLineButton7 = cVar.f73677e;
                        if (gCMComplexTwoLineButton7 == null) {
                            s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton7.setVisibility(8);
                        RelativeLayout relativeLayout = cVar.f73687o;
                        if (relativeLayout == null) {
                            s.m("goalDistanceContainer");
                            throw null;
                        }
                        relativeLayout.setVisibility(0);
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative2 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative2 != null) {
                            gCMEditTextTrainingInitiative2.getF34926b().requestFocus();
                            return;
                        } else {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 2:
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative3 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative3 != null) {
                            gCMEditTextTrainingInitiative3.getF34926b().setText("");
                            return;
                        } else {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 3:
                        c.a aVar = c.f73671x;
                        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
                        Context contextRequireContext = cVar.requireContext();
                        contextRequireContext.getClass();
                        new ag0.f(contextRequireContext, cVar.f73692v, zY, new as2.d(cVar, zY, 7)).show();
                        return;
                    case 4:
                        c.a aVar2 = c.f73671x;
                        Context context2 = cVar.getContext();
                        Object systemService = context2 != null ? context2.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative4 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative4 == null) {
                            s.m("goalDistanceEditText");
                            throw null;
                        }
                        inputMethodManager.hideSoftInputFromWindow(gCMEditTextTrainingInitiative4.getWindowToken(), 0);
                        if (cVar.u6().Z4()) {
                            cVar.w6(0.0d, false);
                            return;
                        } else {
                            cVar.w6(cVar.f73689q, true);
                            return;
                        }
                    default:
                        c.a aVar3 = c.f73671x;
                        bg0.a.f17827a.getClass();
                        boolean zE = bg0.a.C0255a.e();
                        if (cVar.u6().Z4()) {
                            if (zE) {
                                og0.a aVar4 = og0.a.f131967a;
                                l3.a aVar5 = l3.f23124b;
                                double d15 = cVar.f73689q;
                                aVar5.getClass();
                                aVar4.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d15 / 1000.0d, 2));
                            } else {
                                og0.a aVar6 = og0.a.f131967a;
                                l3.a aVar7 = l3.f23124b;
                                double d16 = cVar.f73689q;
                                aVar7.getClass();
                                aVar6.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d16 / 1609.344d, 2));
                            }
                            iVar = bg0.a.C0255a.e() ? gg0.i.KILOMETER : gg0.i.MILE;
                            hVar = gg0.h.DISTANCE;
                        } else {
                            dValueOf = Double.valueOf(cVar.f73690r);
                            iVar = gg0.i.SECOND;
                            hVar = gg0.h.TIME;
                        }
                        m mVar = new m(dValueOf, iVar, hVar);
                        p2 p2Var = cVar.u6().P;
                        gv1.a aVar8 = (gv1.a) p2Var.getValue();
                        p2Var.setValue(aVar8 != null ? gv1.a.a(aVar8, null, mVar, 13) : null);
                        cVar.getParentFragmentManager().a0(0, "FBTEditGoalFragment");
                        return;
                }
            }
        });
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner), null, null, new d(null), 3);
    }

    public final ev1.b u6() {
        return (ev1.b) this.f73673a.getValue();
    }

    public final void w6(double d14, boolean z14) {
        boolean z15 = this.f73693w == t41.a.KILOMETER;
        ag0.b bVarB = ag0.b.a.b(ag0.b.Z0, this.f73691t, z15 ? 149L : 240L, z15 ? 779L : 1200L, z15);
        String string = getString(R.string.lbl_ok);
        string.getClass();
        bVarB.U6(string, new C1492c(z14, d14, z15, this));
        bVarB.show(getParentFragmentManager(), "GoalPacePicker");
    }

    public final void y6(boolean z14) {
        if (u6().I == o.f180176g) {
            double d14 = this.f73690r;
            if (d14 > 0.0d) {
                this.f73692v = this.f73689q / d14;
                E6(this.f73692v, ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y());
                AppCompatButton appCompatButton = this.f73685m;
                if (appCompatButton != null) {
                    appCompatButton.setEnabled(true);
                    return;
                } else {
                    s.m("nextButton");
                    throw null;
                }
            }
            return;
        }
        if (z14) {
            og0.a aVar = og0.a.f131967a;
            double d15 = this.f73690r;
            double d16 = this.f73689q;
            aVar.getClass();
            this.f73691t = (long) og0.a.d(d15, d16);
            C6();
            AppCompatButton appCompatButton2 = this.f73685m;
            if (appCompatButton2 != null) {
                appCompatButton2.setEnabled(true);
                return;
            } else {
                s.m("nextButton");
                throw null;
            }
        }
        double d17 = this.f73689q;
        if (d17 > 0.0d) {
            double d18 = this.f73690r / d17;
            bg0.a.f17827a.getClass();
            if (bg0.a.C0255a.e()) {
                og0.a.f131967a.getClass();
                long jD = MathKt.d(og0.a.A(d18 * 1000.0d, 2));
                this.f73691t = jD;
                l3.f23124b.getClass();
                String strV = d53.u.v(String.valueOf(l3.a.e1(jD)), ".", ":", false);
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                String strK1 = l3.a.k1(new l22.a(contextRequireContext), true, (int) this.f73691t);
                GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f73678f;
                if (gCMComplexTwoLineButton == null) {
                    s.m("goalPace");
                    throw null;
                }
                gCMComplexTwoLineButton.b(e5.g(strV, StringUtils.SPACE, getString(R.string.lbl_pace_unit_km)), strK1 + StringUtils.SPACE + getString(R.string.lbl_per_kilometer));
            } else {
                og0.a.f131967a.getClass();
                long jD2 = MathKt.d(og0.a.A(d18 * 1609.344d, 2));
                this.f73691t = jD2;
                l3.f23124b.getClass();
                String strV2 = d53.u.v(String.valueOf(l3.a.e1(jD2)), ".", ":", false);
                Context contextRequireContext2 = requireContext();
                contextRequireContext2.getClass();
                String strK2 = l3.a.k1(new l22.a(contextRequireContext2), true, (int) this.f73691t);
                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f73678f;
                if (gCMComplexTwoLineButton2 == null) {
                    s.m("goalPace");
                    throw null;
                }
                gCMComplexTwoLineButton2.b(e5.g(strV2, StringUtils.SPACE, getString(R.string.lbl_pace_unit_mi)), strK2 + StringUtils.SPACE + getString(R.string.lbl_per_mile));
            }
            AppCompatButton appCompatButton3 = this.f73685m;
            if (appCompatButton3 != null) {
                appCompatButton3.setEnabled(true);
            } else {
                s.m("nextButton");
                throw null;
            }
        }
    }

    public final void z6() {
        String strC;
        bg0.a.f17827a.getClass();
        int i14 = bg0.a.C0255a.e() ? 1609 : 1000;
        if (bg0.a.C0255a.e()) {
            gg0.i iVar = gg0.i.KILOMETER;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            strC = iVar.c(contextRequireContext);
        } else {
            gg0.i iVar2 = gg0.i.MILE;
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            strC = iVar2.c(contextRequireContext2);
        }
        x0 x0Var = x0.f105818a;
        String string = getString(R.string.please_enter_distance_between_values, "0", e5.g(String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, 1)), StringUtils.SPACE, strC));
        string.getClass();
        new androidx.appcompat.app.e.a(requireContext()).setTitle(R.string.live_event_sharing_invalid_distance).setMessage(string).setCancelable(false).setPositiveButton(R.string.lbl_ok, new k(this, i14, strC, 1)).show();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lfv1/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "defaultDurationTime", "I", "FORMATTED_DISTANCE_PATTERN", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
