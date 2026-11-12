package ew1;

import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import c22.l3;
import com.garmin.android.apps.connectmobile.events.components.GCMEditTextTrainingInitiative;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiLineImeEditText f66570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f66571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fragment f66572d;

    public /* synthetic */ m(Fragment fragment, MultiLineImeEditText multiLineImeEditText, View view2, int i14) {
        this.f66569a = i14;
        this.f66572d = fragment;
        this.f66570b = multiLineImeEditText;
        this.f66571c = view2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) throws Throwable {
        Throwable th3;
        String strC;
        double d14;
        String strC2;
        double d15;
        int i15 = this.f66569a;
        View view2 = this.f66571c;
        MultiLineImeEditText multiLineImeEditText = this.f66570b;
        Fragment fragment = this.f66572d;
        switch (i15) {
            case 0:
                n nVar = (n) fragment;
                if (i14 == 6) {
                    GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative = nVar.f66593e;
                    if (gCMEditTextTrainingInitiative == null) {
                        p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                        throw null;
                    }
                    Editable text = gCMEditTextTrainingInitiative.getF34926b().getText();
                    if (text == null || text.length() == 0) {
                        th3 = null;
                    } else {
                        Context context = multiLineImeEditText.getContext();
                        Object systemService = context != null ? context.getSystemService("input_method") : null;
                        systemService.getClass();
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(view2.getWindowToken(), 0);
                        RelativeLayout relativeLayout = nVar.f66604p;
                        if (relativeLayout == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceContainer");
                            throw null;
                        }
                        relativeLayout.setVisibility(8);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton = nVar.f66594f;
                        if (gCMComplexTwoLineButton == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton.setVisibility(0);
                        bg0.a.f17827a.getClass();
                        if (bg0.a.C0255a.e()) {
                            gg0.i iVar = gg0.i.KILOMETER;
                            Context contextRequireContext = nVar.requireContext();
                            contextRequireContext.getClass();
                            strC = iVar.c(contextRequireContext);
                        } else {
                            gg0.i iVar2 = gg0.i.MILE;
                            Context contextRequireContext2 = nVar.requireContext();
                            contextRequireContext2.getClass();
                            strC = iVar2.c(contextRequireContext2);
                        }
                        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                        og0.a aVar = og0.a.f131967a;
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative2 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative2 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                        double dA = c22.b1.a(String.valueOf(gCMEditTextTrainingInitiative2.getF34926b().getText()));
                        aVar.getClass();
                        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(og0.a.A(dA, 2))}, 1));
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative3 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative3 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                        gCMEditTextTrainingInitiative3.getF34926b().setText(str);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = nVar.f66594f;
                        if (gCMComplexTwoLineButton2 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(str + StringUtils.SPACE + strC);
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative4 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative4 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                        if (Double.parseDouble(d53.u.v(String.valueOf(gCMEditTextTrainingInitiative4.getF34926b().getText()), ",", ".", false)) == 0.0d) {
                            GCMComplexTwoLineButton gCMComplexTwoLineButton3 = nVar.f66595g;
                            if (gCMComplexTwoLineButton3 == null) {
                                p005kotlin.jvm.internal.s.m("goalPace");
                                throw null;
                            }
                            gCMComplexTwoLineButton3.setButtonBottomLeftLabel("");
                            AppCompatButton appCompatButton = nVar.f66602n;
                            if (appCompatButton == null) {
                                p005kotlin.jvm.internal.s.m("nextButton");
                                throw null;
                            }
                            appCompatButton.setEnabled(false);
                        } else {
                            GCMComplexTwoLineButton gCMComplexTwoLineButton4 = nVar.f66594f;
                            if (gCMComplexTwoLineButton4 == null) {
                                p005kotlin.jvm.internal.s.m("goalDistance");
                                throw null;
                            }
                            gCMComplexTwoLineButton4.d(false);
                            GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative5 = nVar.f66593e;
                            if (gCMEditTextTrainingInitiative5 == null) {
                                p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                                throw null;
                            }
                            double dA2 = c22.b1.a(String.valueOf(gCMEditTextTrainingInitiative5.getF34926b().getText()));
                            if (n.C6(dA2, bg0.a.C0255a.e())) {
                                GCMComplexTwoLineButton gCMComplexTwoLineButton5 = nVar.f66594f;
                                if (gCMComplexTwoLineButton5 == null) {
                                    p005kotlin.jvm.internal.s.m("goalDistance");
                                    throw null;
                                }
                                gCMComplexTwoLineButton5.setRightIcon(null);
                                if (bg0.a.C0255a.e()) {
                                    l3.f23124b.getClass();
                                    d14 = dA2 * 1000.0d;
                                } else {
                                    l3.f23124b.getClass();
                                    d14 = dA2 * 1609.344d;
                                }
                                nVar.f66606r = d14;
                                nVar.F6(false);
                                AppCompatButton appCompatButton2 = nVar.f66602n;
                                if (appCompatButton2 == null) {
                                    p005kotlin.jvm.internal.s.m("nextButton");
                                    throw null;
                                }
                                appCompatButton2.setEnabled(true);
                            } else {
                                th3 = null;
                                nVar.I6();
                            }
                        }
                        th3 = null;
                    }
                    GCMComplexTwoLineButton gCMComplexTwoLineButton6 = nVar.f66594f;
                    if (gCMComplexTwoLineButton6 == null) {
                        p005kotlin.jvm.internal.s.m("goalDistance");
                        throw th3;
                    }
                    v22.e.a(gCMComplexTwoLineButton6);
                } else {
                    n.a aVar2 = n.C;
                }
                return false;
            default:
                fv1.c cVar = (fv1.c) fragment;
                if (i14 == 6) {
                    GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative6 = cVar.f73676d;
                    if (gCMEditTextTrainingInitiative6 == null) {
                        p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                        throw null;
                    }
                    Editable text2 = gCMEditTextTrainingInitiative6.getF34926b().getText();
                    if (text2 != null && text2.length() != 0) {
                        Context context2 = multiLineImeEditText.getContext();
                        Object systemService2 = context2 != null ? context2.getSystemService("input_method") : null;
                        systemService2.getClass();
                        ((InputMethodManager) systemService2).hideSoftInputFromWindow(view2.getWindowToken(), 0);
                        RelativeLayout relativeLayout2 = cVar.f73687o;
                        if (relativeLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceContainer");
                            throw null;
                        }
                        relativeLayout2.setVisibility(8);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton7 = cVar.f73677e;
                        if (gCMComplexTwoLineButton7 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton7.setVisibility(0);
                        bg0.a.f17827a.getClass();
                        if (bg0.a.C0255a.e()) {
                            gg0.i iVar3 = gg0.i.KILOMETER;
                            Context contextRequireContext3 = cVar.requireContext();
                            contextRequireContext3.getClass();
                            strC2 = iVar3.c(contextRequireContext3);
                        } else {
                            gg0.i iVar4 = gg0.i.MILE;
                            Context contextRequireContext4 = cVar.requireContext();
                            contextRequireContext4.getClass();
                            strC2 = iVar4.c(contextRequireContext4);
                        }
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative7 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative7 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                        MultiLineImeEditText f34926b = gCMEditTextTrainingInitiative7.getF34926b();
                        p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
                        og0.a aVar3 = og0.a.f131967a;
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative8 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative8 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                        double dA3 = c22.b1.a(String.valueOf(gCMEditTextTrainingInitiative8.getF34926b().getText()));
                        aVar3.getClass();
                        f34926b.setText(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(og0.a.A(dA3, 2))}, 1)));
                        GCMComplexTwoLineButton gCMComplexTwoLineButton8 = cVar.f73677e;
                        if (gCMComplexTwoLineButton8 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative9 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative9 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                        gCMComplexTwoLineButton8.setButtonBottomLeftLabel(((Object) gCMEditTextTrainingInitiative9.getF34926b().getText()) + StringUtils.SPACE + strC2);
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative10 = cVar.f73676d;
                        if (gCMEditTextTrainingInitiative10 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                        if (Double.parseDouble(d53.u.v(String.valueOf(gCMEditTextTrainingInitiative10.getF34926b().getText()), ",", ".", false)) == 0.0d) {
                            GCMComplexTwoLineButton gCMComplexTwoLineButton9 = cVar.f73678f;
                            if (gCMComplexTwoLineButton9 == null) {
                                p005kotlin.jvm.internal.s.m("goalPace");
                                throw null;
                            }
                            gCMComplexTwoLineButton9.setButtonBottomLeftLabel("");
                            AppCompatButton appCompatButton3 = cVar.f73685m;
                            if (appCompatButton3 == null) {
                                p005kotlin.jvm.internal.s.m("nextButton");
                                throw null;
                            }
                            appCompatButton3.setEnabled(false);
                        } else {
                            GCMComplexTwoLineButton gCMComplexTwoLineButton10 = cVar.f73677e;
                            if (gCMComplexTwoLineButton10 == null) {
                                p005kotlin.jvm.internal.s.m("goalDistance");
                                throw null;
                            }
                            gCMComplexTwoLineButton10.d(false);
                            GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative11 = cVar.f73676d;
                            if (gCMEditTextTrainingInitiative11 == null) {
                                p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                                throw null;
                            }
                            double dA4 = c22.b1.a(String.valueOf(gCMEditTextTrainingInitiative11.getF34926b().getText()));
                            if (fv1.c.v6(dA4, bg0.a.C0255a.e())) {
                                GCMComplexTwoLineButton gCMComplexTwoLineButton11 = cVar.f73677e;
                                if (gCMComplexTwoLineButton11 == null) {
                                    p005kotlin.jvm.internal.s.m("goalDistance");
                                    throw null;
                                }
                                gCMComplexTwoLineButton11.setRightIcon(null);
                                if (bg0.a.C0255a.e()) {
                                    l3.f23124b.getClass();
                                    d15 = dA4 * 1000.0d;
                                } else {
                                    l3.f23124b.getClass();
                                    d15 = dA4 * 1609.344d;
                                }
                                cVar.f73689q = d15;
                                cVar.y6(false);
                                AppCompatButton appCompatButton4 = cVar.f73685m;
                                if (appCompatButton4 == null) {
                                    p005kotlin.jvm.internal.s.m("nextButton");
                                    throw null;
                                }
                                appCompatButton4.setEnabled(true);
                            } else {
                                cVar.z6();
                            }
                        }
                    }
                } else {
                    fv1.c.a aVar4 = fv1.c.f73671x;
                }
                return false;
        }
    }
}
