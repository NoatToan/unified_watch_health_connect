package f62;

import android.content.Context;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.e f69263b;

    public /* synthetic */ k(com.garmin.android.apps.connectmobile.workouts.presentation.edit.e eVar, int i14) {
        this.f69262a = i14;
        this.f69263b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:83:0x010f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        InlineUnitsTextFieldView inlineUnitsTextFieldView;
        InlineUnitsTextFieldView inlineUnitsTextFieldView2;
        InlineUnitsTextFieldView inlineUnitsTextFieldView3;
        InlineUnitsTextFieldView inlineUnitsTextFieldView4;
        boolean z14;
        String string;
        int i14 = this.f69262a;
        boolean z15 = true;
        i iVar = null;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e eVar = this.f69263b;
        switch (i14) {
            case 0:
                i iVar2 = (i) obj;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                l lVarU6 = eVar.u6();
                o13.t tVar = lVarU6.f69273f;
                x52.h hVarX4 = l.x4(iVar2);
                if (hVarX4 != null) {
                    ((androidx.lifecycle.y0) lVarU6.f69271d.getValue()).j(hVarX4);
                    i iVar3 = hVarX4.f189123a;
                    iVar3.getClass();
                    lVarU6.f69268a = iVar3;
                    ((androidx.lifecycle.y0) tVar.getValue()).j(null);
                } else {
                    ((androidx.lifecycle.y0) tVar.getValue()).j(iVar2);
                    if (iVar2 != null && iVar2.a()) {
                        lVarU6.f69268a = iVar2;
                    }
                    iVar = iVar2;
                }
                lVarU6.f69269b = iVar;
                return Unit.INSTANCE;
            case 1:
                x52.h hVar = (x52.h) obj;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                if (hVar != null) {
                    eVar.y6();
                    switch (com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.b.f48968a[hVar.ordinal()]) {
                        case 1:
                            GCMComplexOneLineButton gCMComplexOneLineButton = eVar.f48960c;
                            if (gCMComplexOneLineButton == null) {
                                p005kotlin.jvm.internal.s.m("twentyFiveMeterButton");
                                throw null;
                            }
                            gCMComplexOneLineButton.f(true);
                            break;
                            break;
                        case 2:
                            GCMComplexOneLineButton gCMComplexOneLineButton2 = eVar.f48961d;
                            if (gCMComplexOneLineButton2 == null) {
                                p005kotlin.jvm.internal.s.m("twentyFiveYardButton");
                                throw null;
                            }
                            gCMComplexOneLineButton2.f(true);
                            break;
                            break;
                        case 3:
                            GCMComplexOneLineButton gCMComplexOneLineButton3 = eVar.f48962e;
                            if (gCMComplexOneLineButton3 == null) {
                                p005kotlin.jvm.internal.s.m("fiftyMeterButton");
                                throw null;
                            }
                            gCMComplexOneLineButton3.f(true);
                            break;
                            break;
                        case 4:
                            GCMComplexOneLineButton gCMComplexOneLineButton4 = eVar.f48963f;
                            if (gCMComplexOneLineButton4 == null) {
                                p005kotlin.jvm.internal.s.m("thirtyThreeMeterButton");
                                throw null;
                            }
                            gCMComplexOneLineButton4.f(true);
                            break;
                            break;
                        case 5:
                            GCMComplexOneLineButton gCMComplexOneLineButton5 = eVar.f48964g;
                            if (gCMComplexOneLineButton5 == null) {
                                p005kotlin.jvm.internal.s.m("thirtyThreeYardButton");
                                throw null;
                            }
                            gCMComplexOneLineButton5.f(true);
                            break;
                            break;
                        case 6:
                            GCMComplexOneLineButton gCMComplexOneLineButton6 = eVar.f48967j;
                            if (gCMComplexOneLineButton6 == null) {
                                p005kotlin.jvm.internal.s.m("unspecifiedButton");
                                throw null;
                            }
                            gCMComplexOneLineButton6.f(true);
                            break;
                            break;
                        default:
                            lc.u0.r();
                            return null;
                    }
                }
                return Unit.INSTANCE;
            case 2:
                i iVar4 = (i) obj;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar3 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                eVar.y6();
                if (iVar4 == null) {
                    inlineUnitsTextFieldView = eVar.f48965h;
                    if (inlineUnitsTextFieldView != null) {
                        p005kotlin.jvm.internal.s.m("customPoolSizeView");
                        throw null;
                    }
                    inlineUnitsTextFieldView.setEditTextValue("");
                    inlineUnitsTextFieldView2 = eVar.f48965h;
                    if (inlineUnitsTextFieldView2 != null) {
                        p005kotlin.jvm.internal.s.m("customPoolSizeView");
                        throw null;
                    }
                    inlineUnitsTextFieldView2.setEditHintText(eVar.getString(R.string.lbl_enter_custom_pool_size));
                    inlineUnitsTextFieldView3 = eVar.f48965h;
                    if (inlineUnitsTextFieldView3 != null) {
                        p005kotlin.jvm.internal.s.m("customPoolSizeView");
                        throw null;
                    }
                    inlineUnitsTextFieldView3.setHasError(false);
                    inlineUnitsTextFieldView4 = eVar.f48965h;
                    if (inlineUnitsTextFieldView4 != null) {
                        p005kotlin.jvm.internal.s.m("customPoolSizeView");
                        throw null;
                    }
                    inlineUnitsTextFieldView4.h(false);
                } else {
                    Double d14 = iVar4.f69253a;
                    if ((d14 != null ? Double.compare(d14.doubleValue(), 0.0d) : 0) >= 0) {
                        InlineUnitsTextFieldView inlineUnitsTextFieldView5 = eVar.f48965h;
                        if (inlineUnitsTextFieldView5 == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        inlineUnitsTextFieldView5.setHasError(!iVar4.a());
                        InlineUnitsTextFieldView inlineUnitsTextFieldView6 = eVar.f48965h;
                        if (inlineUnitsTextFieldView6 == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        if (!inlineUnitsTextFieldView6.getHasError()) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView7 = eVar.f48965h;
                            if (inlineUnitsTextFieldView7 == null) {
                                p005kotlin.jvm.internal.s.m("customPoolSizeView");
                                throw null;
                            }
                            Context contextRequireContext = eVar.requireContext();
                            contextRequireContext.getClass();
                            if (zf.b.D(d14)) {
                                d14.getClass();
                                string = v52.f.g(contextRequireContext, d14.doubleValue(), iVar4.f69254b);
                            } else {
                                string = contextRequireContext.getString(R.string.lbl_workout_unspecified);
                                string.getClass();
                            }
                            inlineUnitsTextFieldView7.setEditTextValue(string);
                        }
                        InlineUnitsTextFieldView inlineUnitsTextFieldView8 = eVar.f48965h;
                        if (inlineUnitsTextFieldView8 == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        if (iVar4.a()) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView9 = eVar.f48965h;
                            if (inlineUnitsTextFieldView9 == null) {
                                p005kotlin.jvm.internal.s.m("customPoolSizeView");
                                throw null;
                            }
                            if (inlineUnitsTextFieldView9.isInEditMode()) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                        } else {
                            z14 = false;
                        }
                        inlineUnitsTextFieldView8.h(z14);
                    } else {
                        inlineUnitsTextFieldView = eVar.f48965h;
                        if (inlineUnitsTextFieldView != null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        inlineUnitsTextFieldView.setEditTextValue("");
                        inlineUnitsTextFieldView2 = eVar.f48965h;
                        if (inlineUnitsTextFieldView2 != null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        inlineUnitsTextFieldView2.setEditHintText(eVar.getString(R.string.lbl_enter_custom_pool_size));
                        inlineUnitsTextFieldView3 = eVar.f48965h;
                        if (inlineUnitsTextFieldView3 != null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        inlineUnitsTextFieldView3.setHasError(false);
                        inlineUnitsTextFieldView4 = eVar.f48965h;
                        if (inlineUnitsTextFieldView4 != null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        inlineUnitsTextFieldView4.h(false);
                    }
                }
                TextView textView = eVar.f48966i;
                if (textView == null) {
                    p005kotlin.jvm.internal.s.m("customPoolSizeFooter");
                    throw null;
                }
                InlineUnitsTextFieldView inlineUnitsTextFieldView10 = eVar.f48965h;
                if (inlineUnitsTextFieldView10 == null) {
                    p005kotlin.jvm.internal.s.m("customPoolSizeView");
                    throw null;
                }
                if (!inlineUnitsTextFieldView10.isInEditMode()) {
                    InlineUnitsTextFieldView inlineUnitsTextFieldView11 = eVar.f48965h;
                    if (inlineUnitsTextFieldView11 == null) {
                        p005kotlin.jvm.internal.s.m("customPoolSizeView");
                        throw null;
                    }
                    if (!inlineUnitsTextFieldView11.getHasError()) {
                        z15 = false;
                    }
                }
                v22.e.r(textView, z15);
                l lVarU7 = eVar.u6();
                InlineUnitsTextFieldView inlineUnitsTextFieldView12 = eVar.f48965h;
                if (inlineUnitsTextFieldView12 != null) {
                    lVarU7.f69270c = inlineUnitsTextFieldView12.getHasError();
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("customPoolSizeView");
                throw null;
            default:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar4 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                if (((Boolean) obj).booleanValue()) {
                    eVar.v6();
                }
                return Unit.INSTANCE;
        }
    }
}
