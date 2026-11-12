package bl0;

import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import c22.b1;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.liveeventsharing.ui.d;
import com.garmin.android.apps.connectmobile.segments.presentation.ExploreSegmentsActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSingleLineEditTextView;
import com.google.android.material.textfield.TextInputEditText;
import cu0.i;
import d53.w;
import fw.m;
import g2.m1;
import g42.q;
import h32.h;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.jvm.internal.s;
import v22.e;
import xk1.j;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18577b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f18576a = i14;
        this.f18577b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:335:0x0499 A[PHI: r5
      0x0499: PHI (r5v12 double) = (r5v3 double), (r5v4 double) binds: [B:334:0x0497, B:337:0x04a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:443:0x060b  */
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
        String string;
        EditText editText;
        EditText editText2;
        EditText editText3;
        EditText editText4;
        EditText editText5;
        EditText editText6;
        EditText editText7;
        TextView textView2;
        ArrayList<EditText> arrayList;
        EditText editText8;
        EditText editText9;
        EditText editText10;
        EditText editText11;
        EditText editText12;
        EditText editText13;
        TextView textView3;
        EditText editText14;
        EditText editText15;
        EditText editText16;
        EditText editText17;
        EditText editText18;
        EditText editText19;
        TextView textView4;
        int i15 = this.f18576a;
        int i16 = 3;
        Object obj = this.f18577b;
        switch (i15) {
            case 0:
                c cVar = (c) obj;
                if (i14 == 6) {
                    EditText editText20 = cVar.f18583b;
                    if (editText20 == null) {
                        s.m("goalEditText");
                        throw null;
                    }
                    if (cVar.fa(editText20.getText().toString())) {
                        EditText editText21 = cVar.f18583b;
                        if (editText21 == null) {
                            s.m("goalEditText");
                            throw null;
                        }
                        int i17 = Integer.parseInt(editText21.getText().toString());
                        GCMComplexOneLineButton gCMComplexOneLineButton = cVar.f18586e;
                        if (gCMComplexOneLineButton == null) {
                            s.m("goalSwitch");
                            throw null;
                        }
                        cVar.ga(i17, gCMComplexOneLineButton.f47771k.isChecked());
                    }
                } else {
                    int i18 = c.f18581h;
                }
                return false;
            case 1:
                com.garmin.android.apps.connectmobile.view.reusablecomponents.b bVar = (com.garmin.android.apps.connectmobile.view.reusablecomponents.b) obj;
                int i19 = com.garmin.android.apps.connectmobile.view.reusablecomponents.b.T;
                if (i14 == 6) {
                    EditText editText22 = bVar.editText;
                    editText22.clearFocus();
                    e.c(editText22, bVar);
                }
                return true;
            case 2:
                ExploreSegmentsActivity exploreSegmentsActivity = (ExploreSegmentsActivity) obj;
                ExploreSegmentsActivity.a aVar = ExploreSegmentsActivity.C;
                if (i14 == 3) {
                    Object systemService = exploreSegmentsActivity.getSystemService("input_method");
                    systemService.getClass();
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                    ViewGroup viewGroup = exploreSegmentsActivity.f41350x;
                    viewGroup.getClass();
                    viewGroup.requestFocus();
                }
                return true;
            case 3:
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c cVar2 = (com.garmin.android.apps.connectmobile.weather.defaultlocation.c) obj;
                g42.c cVar3 = cVar2.f47942c;
                if (cVar3 == null) {
                    s.m("preferenceListener");
                    throw null;
                }
                if (cVar3.R0()) {
                    if (i14 == 2) {
                        cVar2.w6().debug("User pressed go to search for a zip code");
                        Object systemService2 = cVar2.requireActivity().getSystemService("input_method");
                        systemService2.getClass();
                        ((InputMethodManager) systemService2).hideSoftInputFromWindow(textView != null ? textView.getWindowToken() : null, 0);
                        TextInputEditText textInputEditText = cVar2.f47944e;
                        if (textInputEditText == null) {
                            s.m("postalCodeEditText");
                            throw null;
                        }
                        Editable text = textInputEditText.getText();
                        if (text == null || (string = text.toString()) == null) {
                            cVar2.w6().debug("postalCodeEditTextListener: null or empty string in EditText");
                        } else {
                            if (string.length() <= 0) {
                                string = null;
                            }
                            if (string != null) {
                                StringBuilder sb3 = new StringBuilder();
                                String str = cVar2.f47956q;
                                if (str != null) {
                                    sb3.append(str);
                                    sb3.append(StringUtils.SPACE);
                                }
                                sb3.append(string);
                                if (cVar2.f47941b == null) {
                                    s.m("viewModel");
                                    throw null;
                                }
                                q.A4(sb3.toString()).f(cVar2.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.weather.defaultlocation.c.b(new m1(i16, cVar2, sb3)));
                            } else {
                                cVar2.w6().debug("postalCodeEditTextListener: null or empty string in EditText");
                            }
                        }
                    }
                    cVar2.y6();
                }
                return true;
            case 4:
                h32.e eVar = (h32.e) obj;
                int i24 = h32.e.f81301w;
                if (i14 == 6 || i14 == 5 || ((keyEvent != null && keyEvent.getAction() == 0) || ((keyEvent != null && keyEvent.getAction() == 66) || (keyEvent != null && keyEvent.getAction() == 4)))) {
                    eVar.k();
                }
                return true;
            case 5:
                h hVar = (h) obj;
                int i25 = h.A;
                if (i14 == 6) {
                    EditText editText23 = hVar.editText;
                    editText23.clearFocus();
                    e.c(editText23, hVar);
                }
                return true;
            case 6:
                GCMSingleLineEditTextView gCMSingleLineEditTextView = (GCMSingleLineEditTextView) obj;
                int i26 = GCMSingleLineEditTextView.f47803y;
                if (i14 == 6 || i14 == 5 || ((keyEvent != null && keyEvent.getAction() == 0) || ((keyEvent != null && keyEvent.getAction() == 66) || (keyEvent != null && keyEvent.getAction() == 4)))) {
                    gCMSingleLineEditTextView.k();
                }
                return true;
            case 7:
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.a aVar2 = (com.garmin.android.apps.connectmobile.liveeventsharing.ui.a) obj;
                if (i14 == 6) {
                    TextInputEditText textInputEditText2 = aVar2.f38542k;
                    if (textInputEditText2 == null) {
                        s.m("editTextBox");
                        throw null;
                    }
                    double dB = b1.b(String.valueOf(textInputEditText2.getText()));
                    if (dB > 0.0d) {
                        l3.a aVar3 = l3.f23124b;
                        m3 m3Var = aVar2.f38544m;
                        if (m3Var == null) {
                            s.m("unitOfMeasure");
                            throw null;
                        }
                        aVar3.getClass();
                        aVar2.u6().H4(l3.a.g(dB, m3Var, m3.METER));
                    }
                } else {
                    com.garmin.android.apps.connectmobile.liveeventsharing.ui.a.C0679a c0679a = com.garmin.android.apps.connectmobile.liveeventsharing.ui.a.f38531q;
                }
                return false;
            case 8:
                d dVar = (d) obj;
                if (i14 == 6) {
                    TextInputEditText textInputEditText3 = dVar.f38591k;
                    if (textInputEditText3 == null) {
                        s.m("editTextBox");
                        throw null;
                    }
                    double dB2 = b1.b(String.valueOf(textInputEditText3.getText()));
                    if (dB2 > 0.0d) {
                        i iVarV6 = dVar.v6();
                        iVarV6.getClass();
                        i2.f36769a.getClass();
                        i2.a.b(a2.LIVE_EVENT_SHARING, "LiveEventViewModel", "updateTriggerDistance() distance: " + dB2);
                        l3.a aVar4 = l3.f23124b;
                        m3 m3Var2 = (m3) iVarV6.f55596n.getValue();
                        m3 m3Var3 = m3.CENTIMETER;
                        aVar4.getClass();
                        double dG = l3.a.g(dB2, m3Var2, m3Var3);
                        double d14 = 80467.2d;
                        if (dG < 80467.2d) {
                            dG = d14;
                        } else {
                            d14 = 3218688.0d;
                            if (dG > 3218688.0d) {
                                dG = d14;
                            }
                        }
                        m<ju0.q> mVarD = iVarV6.A4().d();
                        ju0.q qVar = mVarD != null ? mVarD.f73770c : null;
                        if (qVar != null) {
                            qVar.l((int) dG);
                        }
                        iVarV6.A4().m(m.a.g(m.f73767e, qVar, 1));
                        TextView textView5 = dVar.f38585e;
                        if (textView5 == null) {
                            s.m("footerLabel");
                            throw null;
                        }
                        textView5.setVisibility(0);
                    } else {
                        TextView textView6 = dVar.f38585e;
                        if (textView6 == null) {
                            s.m("footerLabel");
                            throw null;
                        }
                        textView6.setVisibility(8);
                    }
                }
                TextInputEditText textInputEditText4 = dVar.f38591k;
                if (textInputEditText4 != null) {
                    textInputEditText4.clearFocus();
                    return false;
                }
                s.m("editTextBox");
                throw null;
            case 9:
                pv2.d dVar2 = (pv2.d) obj;
                if (i14 == 6) {
                    EditText editText24 = dVar2.editText;
                    String string2 = w.i0(editText24.getText().toString()).toString();
                    if (dVar2.f141653f != 1 && Double.parseDouble(string2) < dVar2.f141650c) {
                        dVar2.setHasError(true);
                    }
                    if (!dVar2.hasError) {
                        editText24.clearFocus();
                        Object systemService3 = editText24.getContext().getSystemService("input_method");
                        systemService3.getClass();
                        ((InputMethodManager) systemService3).hideSoftInputFromWindow(editText24.getWindowToken(), 0);
                    }
                } else {
                    int i27 = pv2.d.f141647y;
                }
                return true;
            case 10:
                return MultiLineImeEditText.a((MultiLineImeEditText) obj, textView, i14);
            case 11:
                CourseSearchActivity courseSearchActivity = (CourseSearchActivity) obj;
                CourseSearchActivity.a aVar5 = CourseSearchActivity.f33091e;
                if (i14 == 3) {
                    courseSearchActivity.da();
                }
                return true;
            case 12:
                vy1.e eVar2 = (vy1.e) obj;
                if (i14 == 3) {
                    TextView textView7 = eVar2.f180816o;
                    if (textView7 == null) {
                        s.m("createAnEventView");
                        throw null;
                    }
                    textView7.setEnabled(true);
                    eVar2.F = true;
                    Context context = eVar2.getContext();
                    Object systemService4 = context != null ? context.getSystemService("input_method") : null;
                    systemService4.getClass();
                    InputMethodManager inputMethodManager = (InputMethodManager) systemService4;
                    View view2 = eVar2.getView();
                    inputMethodManager.hideSoftInputFromWindow(view2 != null ? view2.getWindowToken() : null, 0);
                    TextView textView8 = eVar2.f180817p;
                    if (textView8 == null) {
                        s.m("searchEventTextView");
                        throw null;
                    }
                    textView8.setVisibility(0);
                    LinearLayout linearLayout = eVar2.f180819r;
                    if (linearLayout == null) {
                        s.m("searchKeywordLayout");
                        throw null;
                    }
                    linearLayout.setVisibility(8);
                    EditText editText25 = eVar2.f180820t;
                    if (editText25 == null) {
                        s.m("searchKeywordEditText");
                        throw null;
                    }
                    String string3 = editText25.getText().toString();
                    int length = string3.length();
                    TextView textView9 = eVar2.f180817p;
                    if (length == 0) {
                        if (textView9 == null) {
                            s.m("searchEventTextView");
                            throw null;
                        }
                        textView9.setText(eVar2.getString(R.string.event_name_keyword));
                    } else {
                        if (textView9 == null) {
                            s.m("searchEventTextView");
                            throw null;
                        }
                        textView9.setText(string3);
                        AddTIEventViewModel addTIEventViewModelC6 = eVar2.C6();
                        xy1.a aVarD = addTIEventViewModelC6.z5().d();
                        if (!s.g(aVarD != null ? aVarD.f192695b : null, string3)) {
                            addTIEventViewModelC6.z5().m(aVarD != null ? xy1.a.a(aVarD, null, string3, null, null, null, 29) : null);
                        }
                    }
                } else {
                    vy1.e.a aVar6 = vy1.e.T;
                }
                return true;
            case 13:
                j jVar = (j) obj;
                if (i14 == 6) {
                    EditText editText26 = jVar.f191247q;
                    if ((editText26 == null || textView.getId() != editText26.getId()) && ((editText = jVar.A) == null || textView.getId() != editText.getId())) {
                        EditText editText27 = jVar.f191246p;
                        if ((editText27 == null || textView.getId() != editText27.getId()) && ((editText2 = jVar.f191254z) == null || textView.getId() != editText2.getId())) {
                            EditText editText28 = jVar.f191245o;
                            if ((editText28 == null || textView.getId() != editText28.getId()) && ((editText3 = jVar.f191253y) == null || textView.getId() != editText3.getId())) {
                                EditText editText29 = jVar.f191244n;
                                if ((editText29 == null || textView.getId() != editText29.getId()) && ((editText4 = jVar.f191252x) == null || textView.getId() != editText4.getId())) {
                                    EditText editText30 = jVar.f191243m;
                                    if ((editText30 == null || textView.getId() != editText30.getId()) && ((editText5 = jVar.f191251w) == null || textView.getId() != editText5.getId())) {
                                        EditText editText31 = jVar.f191242l;
                                        if ((editText31 == null || textView.getId() != editText31.getId()) && ((editText6 = jVar.f191250v) == null || textView.getId() != editText6.getId())) {
                                            EditText editText32 = jVar.f191240k;
                                            if ((editText32 == null || textView.getId() != editText32.getId()) && ((editText7 = jVar.f191249t) == null || textView.getId() != editText7.getId())) {
                                                EditText editText33 = jVar.f191239j;
                                                if (editText33 != null && textView.getId() == editText33.getId() && (textView2 = jVar.X) != null) {
                                                    textView2.requestFocus();
                                                }
                                            } else {
                                                TextView textView10 = jVar.C;
                                                if (textView10 != null) {
                                                    textView10.requestFocus();
                                                }
                                            }
                                        } else {
                                            TextView textView11 = jVar.C;
                                            if (textView11 != null) {
                                                textView11.requestFocus();
                                            }
                                        }
                                    } else {
                                        TextView textView12 = jVar.D;
                                        if (textView12 != null) {
                                            textView12.requestFocus();
                                        }
                                    }
                                } else {
                                    TextView textView13 = jVar.E;
                                    if (textView13 != null) {
                                        textView13.requestFocus();
                                    }
                                }
                            } else {
                                TextView textView14 = jVar.F;
                                if (textView14 != null) {
                                    textView14.requestFocus();
                                }
                            }
                        } else {
                            TextView textView15 = jVar.I;
                            if (textView15 != null) {
                                textView15.requestFocus();
                            }
                        }
                    } else {
                        TextView textView16 = jVar.P;
                        if (textView16 != null) {
                            textView16.requestFocus();
                        }
                    }
                } else {
                    j.a aVar7 = j.M0;
                }
                return false;
            case 14:
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b bVar2 = (com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b) obj;
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b.a aVar8 = com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b.J0;
                if (i14 == 6 && (arrayList = bVar2.f44119w) != null) {
                    for (EditText editText34 : arrayList) {
                        if (editText34 != null) {
                            editText34.clearFocus();
                        }
                    }
                }
                return false;
            case 15:
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c cVar4 = (com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c) obj;
                if (i14 == 6) {
                    EditText editText35 = cVar4.f44142l;
                    if ((editText35 == null || textView.getId() != editText35.getId()) && (((editText8 = cVar4.f44141k) == null || textView.getId() != editText8.getId()) && ((editText9 = cVar4.f44147q) == null || textView.getId() != editText9.getId()))) {
                        EditText editText36 = cVar4.f44140j;
                        if ((editText36 == null || textView.getId() != editText36.getId()) && ((editText10 = cVar4.f44146p) == null || textView.getId() != editText10.getId())) {
                            EditText editText37 = cVar4.f44139i;
                            if ((editText37 == null || textView.getId() != editText37.getId()) && ((editText11 = cVar4.f44145o) == null || textView.getId() != editText11.getId())) {
                                EditText editText38 = cVar4.f44138h;
                                if ((editText38 == null || textView.getId() != editText38.getId()) && ((editText12 = cVar4.f44144n) == null || textView.getId() != editText12.getId())) {
                                    EditText editText39 = cVar4.f44137g;
                                    if (((editText39 != null && textView.getId() == editText39.getId()) || ((editText13 = cVar4.f44143m) != null && textView.getId() == editText13.getId())) && (textView3 = cVar4.f44149t) != null) {
                                        textView3.requestFocus();
                                    }
                                } else {
                                    TextView textView17 = cVar4.f44150v;
                                    if (textView17 != null) {
                                        textView17.requestFocus();
                                    }
                                }
                            } else {
                                TextView textView18 = cVar4.f44151w;
                                if (textView18 != null) {
                                    textView18.requestFocus();
                                }
                            }
                        } else {
                            TextView textView19 = cVar4.f44152x;
                            if (textView19 != null) {
                                textView19.requestFocus();
                            }
                        }
                    } else {
                        TextView textView20 = cVar4.f44153y;
                        if (textView20 != null) {
                            textView20.requestFocus();
                        }
                    }
                } else {
                    com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c.a aVar9 = com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c.I;
                }
                return false;
            default:
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d dVar3 = (com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d) obj;
                if (i14 == 6) {
                    EditText editText40 = dVar3.f44180r;
                    if ((editText40 == null || textView.getId() != editText40.getId()) && (((editText14 = dVar3.f44179q) == null || textView.getId() != editText14.getId()) && ((editText15 = dVar3.f44185y) == null || textView.getId() != editText15.getId()))) {
                        EditText editText41 = dVar3.f44178p;
                        if ((editText41 == null || textView.getId() != editText41.getId()) && ((editText16 = dVar3.f44184x) == null || textView.getId() != editText16.getId())) {
                            EditText editText42 = dVar3.f44177o;
                            if ((editText42 == null || textView.getId() != editText42.getId()) && ((editText17 = dVar3.f44183w) == null || textView.getId() != editText17.getId())) {
                                EditText editText43 = dVar3.f44176n;
                                if ((editText43 == null || textView.getId() != editText43.getId()) && ((editText18 = dVar3.f44182v) == null || textView.getId() != editText18.getId())) {
                                    EditText editText44 = dVar3.f44175m;
                                    if ((editText44 == null || textView.getId() != editText44.getId()) && ((editText19 = dVar3.f44181t) == null || textView.getId() != editText19.getId())) {
                                        EditText editText45 = dVar3.f44174l;
                                        if (editText45 == null || textView.getId() != editText45.getId()) {
                                            EditText editText46 = dVar3.f44172k;
                                            if (editText46 != null && textView.getId() == editText46.getId() && (textView4 = dVar3.T) != null) {
                                                textView4.requestFocus();
                                            }
                                        } else {
                                            TextView textView21 = dVar3.P;
                                            if (textView21 != null) {
                                                textView21.requestFocus();
                                            }
                                        }
                                    } else {
                                        TextView textView22 = dVar3.A;
                                        if (textView22 != null) {
                                            textView22.requestFocus();
                                        }
                                    }
                                } else {
                                    TextView textView23 = dVar3.B;
                                    if (textView23 != null) {
                                        textView23.requestFocus();
                                    }
                                }
                            } else {
                                TextView textView24 = dVar3.C;
                                if (textView24 != null) {
                                    textView24.requestFocus();
                                }
                            }
                        } else {
                            TextView textView25 = dVar3.D;
                            if (textView25 != null) {
                                textView25.requestFocus();
                            }
                        }
                    } else {
                        TextView textView26 = dVar3.E;
                        if (textView26 != null) {
                            textView26.requestFocus();
                        }
                    }
                } else {
                    com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d.a aVar10 = com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d.N0;
                }
                return false;
        }
    }
}
