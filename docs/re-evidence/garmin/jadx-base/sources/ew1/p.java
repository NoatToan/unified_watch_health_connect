package ew1;

import android.content.Context;
import android.text.Editable;
import androidx.appcompat.widget.AppCompatButton;
import c22.l3;
import com.garmin.android.apps.connectmobile.events.components.GCMEditTextTrainingInitiative;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew1/p;", "Lag0/b$b;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements ag0.b.InterfaceC0051b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f66649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f66650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f66651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f66652d;

    public p(boolean z14, double d14, boolean z15, n nVar) {
        this.f66649a = z14;
        this.f66650b = d14;
        this.f66651c = z15;
        this.f66652d = nVar;
    }

    @Override // ag0.b.InterfaceC0051b
    public final void a(long j8) {
        String strC;
        boolean z14 = this.f66649a;
        boolean z15 = this.f66651c;
        n nVar = this.f66652d;
        if (z14) {
            double d14 = this.f66650b;
            double d15 = d14 / ((double) 1000);
            double d16 = z15 ? 1.0d : 1.609344d;
            double d17 = d14 / 1609.344d;
            nVar.f66608v = j8;
            double d18 = j8;
            long j14 = (long) ((d15 / d16) * d18);
            nVar.f66605q = j14;
            l3.a aVar = l3.f23124b;
            aVar.getClass();
            if (((int) j14) / DateTimeConstants.SECONDS_PER_HOUR > 48) {
                AppCompatButton appCompatButton = nVar.f66602n;
                if (appCompatButton != null) {
                    appCompatButton.setEnabled(false);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("nextButton");
                    throw null;
                }
            }
            ag0.c.a aVar2 = ag0.c.U0;
            long j15 = nVar.f66605q;
            aVar2.getClass();
            nVar.f66605q = dh.b.S(ag0.c.a.a(j15));
            GCMComplexTwoLineButton gCMComplexTwoLineButton = nVar.f66592d;
            if (gCMComplexTwoLineButton == null) {
                p005kotlin.jvm.internal.s.m("goalTimeView");
                throw null;
            }
            gCMComplexTwoLineButton.setRightIcon(null);
            o13.u uVarA = ag0.c.a.a((long) (240 * d17));
            o13.u uVarA2 = ag0.c.a.a((long) (d17 * 1200));
            long j16 = nVar.f66605q;
            long jS = dh.b.S(uVarA);
            long jS2 = dh.b.S(uVarA2);
            if (j16 > jS2) {
                j16 = jS2;
            } else if (j16 < jS) {
                j16 = jS;
            }
            nVar.f66605q = j16;
            nVar.f66607t = j16;
            og0.a.f131967a.getClass();
            double dA = og0.a.A(d18, 2);
            Context contextRequireContext = nVar.requireContext();
            contextRequireContext.getClass();
            String strR0 = aVar.r0(contextRequireContext, dA, this.f66651c, true, "");
            String strZ6 = nVar.z6((int) dA, z15);
            GCMComplexTwoLineButton gCMComplexTwoLineButton2 = nVar.f66595g;
            if (gCMComplexTwoLineButton2 == null) {
                p005kotlin.jvm.internal.s.m("goalPace");
                throw null;
            }
            gCMComplexTwoLineButton2.b(strR0, strZ6);
            nVar.G6(nVar.f66605q);
            AppCompatButton appCompatButton2 = nVar.f66602n;
            if (appCompatButton2 != null) {
                appCompatButton2.setEnabled(true);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("nextButton");
                throw null;
            }
        }
        double d19 = 1609.344d;
        nVar.f66608v = j8;
        double d24 = j8;
        double d25 = nVar.f66607t / d24;
        bg0.a.f17827a.getClass();
        if (bg0.a.C0255a.e()) {
            l3.f23124b.getClass();
            d19 = 1000.0d;
        } else {
            l3.f23124b.getClass();
        }
        nVar.f66606r = d19 * d25;
        if (!n.C6(d25, bg0.a.C0255a.e())) {
            nVar.I6();
            return;
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = nVar.f66594f;
        if (gCMComplexTwoLineButton3 == null) {
            p005kotlin.jvm.internal.s.m("goalDistance");
            throw null;
        }
        gCMComplexTwoLineButton3.setRightIcon(null);
        if (bg0.a.C0255a.e()) {
            gg0.i iVar = gg0.i.KILOMETER;
            Context contextRequireContext2 = nVar.requireContext();
            contextRequireContext2.getClass();
            strC = iVar.c(contextRequireContext2);
        } else {
            gg0.i iVar2 = gg0.i.MILE;
            Context contextRequireContext3 = nVar.requireContext();
            contextRequireContext3.getClass();
            strC = iVar2.c(contextRequireContext3);
        }
        l3.a aVar3 = l3.f23124b;
        Context contextRequireContext4 = nVar.requireContext();
        contextRequireContext4.getClass();
        aVar3.getClass();
        String strR1 = aVar3.r0(contextRequireContext4, d24, this.f66651c, true, "");
        String strZ7 = nVar.z6((int) j8, z15);
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = nVar.f66595g;
        if (gCMComplexTwoLineButton4 == null) {
            p005kotlin.jvm.internal.s.m("goalPace");
            throw null;
        }
        gCMComplexTwoLineButton4.b(strR1, strZ7);
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = nVar.f66594f;
        if (gCMComplexTwoLineButton5 == null) {
            p005kotlin.jvm.internal.s.m("goalDistance");
            throw null;
        }
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        og0.a.f131967a.getClass();
        gCMComplexTwoLineButton5.setButtonBottomLeftLabel(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(og0.a.A(d25, 2))}, 1)) + StringUtils.SPACE + strC);
        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative = nVar.f66593e;
        if (gCMEditTextTrainingInitiative == null) {
            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
            throw null;
        }
        MultiLineImeEditText f34926b = gCMEditTextTrainingInitiative.getF34926b();
        f34926b.setText(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(og0.a.A(d25, 2))}, 1)));
        Editable text = f34926b.getText();
        f34926b.setSelection(text != null ? text.length() : 0);
        AppCompatButton appCompatButton3 = nVar.f66602n;
        if (appCompatButton3 != null) {
            appCompatButton3.setEnabled(true);
        } else {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw null;
        }
    }
}
