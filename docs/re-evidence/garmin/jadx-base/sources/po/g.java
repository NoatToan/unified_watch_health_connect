package po;

import am.z0;
import android.app.Dialog;
import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import b0.c1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity;
import com.garmin.android.apps.connectmobile.activities.charts.wrapper.OverlayCombinedChart;
import com.garmin.android.apps.connectmobile.bic.view.CircumferencePickerLayout;
import com.garmin.android.apps.connectmobile.bic.view.GCMDigitsPickerContainer;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.lteconnect.VerizonLteWebViewActivity;
import com.garmin.android.apps.connectmobile.powercurve.view.PowerCurveActivity;
import com.garmin.android.apps.connectmobile.social.share.ui.StickerEditorView;
import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.google.android.material.appbar.AppBarLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.l1;
import r22.p0;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f138839b;

    public /* synthetic */ g(Object obj, int i14) {
        this.f138838a = i14;
        this.f138839b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        h.d dVar;
        Highlight[] highlightArr;
        int xIndex;
        int xIndex2;
        Object value;
        int i14 = 0;
        switch (this.f138838a) {
            case 0:
                h hVar = (h) this.f138839b;
                am.e eVar = hVar.f138868v1;
                if (hVar.R0 || (dVar = hVar.f138859q) == null) {
                    return;
                }
                ArrayList<ie2.j> arrayList = dVar.f138883c;
                if (arrayList != null) {
                    Iterator<ie2.j> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().remove();
                    }
                    hVar.f138859q.f138883c.clear();
                }
                ArrayList<ie2.j> arrayList2 = hVar.f138859q.f138884d;
                if (arrayList2 != null) {
                    Iterator<ie2.j> it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        it3.next().remove();
                    }
                    hVar.f138859q.f138884d.clear();
                }
                hVar.A7();
                com.garmin.android.library.mapsdkadapter.l lVar = hVar.f138859q.f138885e;
                if (lVar != null) {
                    lVar.remove();
                }
                qe2.k kVar = hVar.f138859q.f138887g;
                if (kVar != null) {
                    kVar.remove();
                }
                h.d dVar2 = hVar.f138859q;
                com.garmin.android.library.mapsdkadapter.q qVar = dVar2.f138881a;
                if (qVar != null) {
                    qe2.h hVar2 = hVar.f148294e;
                    hVar2.getClass();
                    dVar2.f138885e = hVar2.h(qVar);
                    i2.a(a2.ACTIVITIES, "ActivityMapFragment", "Added [" + hVar.f138859q.f138881a.f50328a.f93153a.size() + "] polyline points to map.");
                }
                h.d dVar3 = hVar.f138859q;
                ie2.t tVar = dVar3.f138886f;
                if (tVar != null) {
                    dVar3.f138887g = (qe2.k) hVar.f148294e.F(tVar);
                    i2.a(a2.ACTIVITIES, "ActivityMapFragment", "Added a tile overlay to map.");
                }
                boolean z14 = z0.M(hVar.f138857p.C().f4358a) && !hVar.f138854m1;
                ArrayList<com.garmin.android.library.mapsdkadapter.p> arrayList3 = hVar.f138859q.f138882b;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    hVar.f138859q.f138883c = new ArrayList<>();
                    hVar.f138859q.f138884d = new ArrayList<>();
                    for (com.garmin.android.library.mapsdkadapter.p pVar : hVar.f138859q.f138882b) {
                        if (pVar.f50327a.f50312d.startsWith("-")) {
                            hVar.f138859q.f138884d.add(hVar.f148294e.x(pVar));
                        } else if (eVar.e() || z14) {
                            hVar.f138859q.f138883c.add(hVar.f148294e.x(pVar));
                        }
                    }
                    i2.a(a2.ACTIVITIES, "ActivityMapFragment", "Added [" + hVar.f138859q.f138882b.size() + "] markers to map.");
                }
                if (hVar.q7() && hVar.f138860q1) {
                    hVar.F7(false);
                    hVar.X6();
                }
                hVar.F6();
                if (hVar.f138856o1 && eVar.n()) {
                    hVar.S6();
                }
                hVar.Y6();
                k32.n nVar = hVar.f138870w1;
                if (nVar != null) {
                    nVar.run();
                    return;
                }
                return;
            case 1:
                ((com.garmin.android.apps.connectmobile.lteconnect.a.b) this.f138839b).a();
                return;
            case 2:
                VerizonLteWebViewActivity verizonLteWebViewActivity = (VerizonLteWebViewActivity) this.f138839b;
                verizonLteWebViewActivity.f38715g++;
                verizonLteWebViewActivity.fa();
                return;
            case 3:
                ActionMode actionMode = ((q2.d) this.f138839b).f142161h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 4:
                PowerCurveActivity powerCurveActivity = (PowerCurveActivity) this.f138839b;
                PowerCurveActivity.a aVar = PowerCurveActivity.f40339p;
                e32.j jVar = (e32.j) powerCurveActivity.oa();
                if (jVar != null) {
                    jVar.a();
                }
                powerCurveActivity.hideProgressOverlay();
                return;
            case 5:
                ((k7.b) this.f138839b).accept(new oe.l(p13.j0.f134944a));
                return;
            case 6:
                qm.c cVar = (qm.c) this.f138839b;
                MotionEvent motionEvent = cVar.B;
                cVar.f145281q.setDragEnabled(false);
                cVar.f145281q.setHighlightPerDragEnabled(true);
                cVar.f145281q.setScaleEnabled(false);
                if (cVar.f145271h || motionEvent.getPointerCount() <= 1) {
                    cVar.f145270g.setDoubleLongPress(false);
                    Highlight highlightByTouchPoint = cVar.f145281q.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY());
                    if (highlightByTouchPoint != null) {
                        int xIndex3 = highlightByTouchPoint.getXIndex();
                        cVar.f145281q.highlightValues(new Highlight[]{new Highlight(xIndex3, 0), new Highlight(xIndex3, 1)});
                    }
                } else {
                    cVar.f145270g.setDoubleLongPress(true);
                    float x14 = cVar.B.getX(0);
                    float y14 = cVar.B.getY(0);
                    float x15 = cVar.B.getX(1);
                    float y15 = cVar.B.getY(1);
                    Highlight highlightByTouchPoint2 = cVar.f145281q.getHighlightByTouchPoint(x14, y14);
                    Highlight highlightByTouchPoint3 = cVar.f145281q.getHighlightByTouchPoint(x15, y15);
                    switch (cVar.f145279o) {
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                            highlightArr = new Highlight[]{highlightByTouchPoint2, highlightByTouchPoint2 != null ? highlightByTouchPoint2.getDataSetIndex() == 1 ? new Highlight(highlightByTouchPoint2.getXIndex(), 0) : new Highlight(highlightByTouchPoint2.getXIndex(), 1) : null, highlightByTouchPoint3, highlightByTouchPoint3 != null ? highlightByTouchPoint3.getDataSetIndex() == 1 ? new Highlight(highlightByTouchPoint3.getXIndex(), 0) : new Highlight(highlightByTouchPoint3.getXIndex(), 1) : null};
                            break;
                        default:
                            highlightArr = new Highlight[]{highlightByTouchPoint2, highlightByTouchPoint3};
                            break;
                    }
                    int lowestVisibleXIndex = cVar.f145281q.getLowestVisibleXIndex();
                    int highestVisibleXIndex = cVar.f145281q.getHighestVisibleXIndex();
                    OverlayCombinedChart overlayCombinedChart = cVar.f145281q;
                    overlayCombinedChart.getClass();
                    overlayCombinedChart.f28979a = true;
                    overlayCombinedChart.f28982d = (int) ((overlayCombinedChart.getViewPortHandler().getChartHeight() - overlayCombinedChart.getExtraBottomOffset()) - overlayCombinedChart.f28986h);
                    if (x14 < x15) {
                        overlayCombinedChart.a((Highlight[]) p13.u.C(highlightArr).toArray(new Highlight[0]), x14, x15, lowestVisibleXIndex, highestVisibleXIndex);
                    } else {
                        overlayCombinedChart.a((Highlight[]) p13.u.C(highlightArr).toArray(new Highlight[0]), x15, x14, lowestVisibleXIndex, highestVisibleXIndex);
                    }
                    overlayCombinedChart.highlightValues(highlightArr);
                }
                ViewParent parent = cVar.f145281q.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                FullscreenChartActivity fullscreenChartActivity = cVar.f145287y;
                if (fullscreenChartActivity != null) {
                    fullscreenChartActivity.J7();
                    return;
                }
                return;
            case 7:
                qm.m mVar = (qm.m) this.f138839b;
                MotionEvent motionEvent2 = mVar.f145408x;
                mVar.f145398l.setDragEnabled(false);
                mVar.f145398l.setHighlightPerDragEnabled(true);
                mVar.f145398l.setScaleEnabled(false);
                if (mVar.f145433j != null || motionEvent2.getPointerCount() <= 1) {
                    mVar.f145400n.setDoubleLongPress(false);
                    Highlight highlightByTouchPoint4 = mVar.f145398l.getHighlightByTouchPoint(motionEvent2.getX(), motionEvent2.getY());
                    if (highlightByTouchPoint4 != null) {
                        int xIndex4 = highlightByTouchPoint4.getXIndex();
                        mVar.f145398l.highlightValues(new Highlight[]{new Highlight(xIndex4, 0), new Highlight(xIndex4, 1)});
                    }
                } else {
                    mVar.f145400n.setDoubleLongPress(true);
                    float x16 = mVar.f145408x.getX(0);
                    float y16 = mVar.f145408x.getY(0);
                    float x17 = mVar.f145408x.getX(1);
                    float y17 = mVar.f145408x.getY(1);
                    Highlight highlight = mVar.f145398l.getHighlighter().getHighlight(x16, y16);
                    Highlight highlight2 = mVar.f145398l.getHighlighter().getHighlight(x17, y17);
                    int lowestVisibleXIndex2 = mVar.f145398l.getLowestVisibleXIndex();
                    int highestVisibleXIndex2 = mVar.f145398l.getHighestVisibleXIndex();
                    if (highlight == null || highlight2 == null) {
                        xIndex = lowestVisibleXIndex2;
                        xIndex2 = highestVisibleXIndex2;
                    } else {
                        xIndex = highlight.getXIndex();
                        xIndex2 = highlight2.getXIndex();
                    }
                    Highlight[] highlightArr2 = {new Highlight(xIndex, 0), new Highlight(xIndex2, 0)};
                    qm.u uVar = mVar.f145398l;
                    uVar.getClass();
                    uVar.f145452a = true;
                    uVar.f145456e = (int) ((uVar.getViewPortHandler().getChartHeight() - uVar.getExtraBottomOffset()) - uVar.f145460i);
                    if (x16 < x17) {
                        uVar.b(highlightArr2, x16, x17, lowestVisibleXIndex2, highestVisibleXIndex2);
                    } else {
                        uVar.b(highlightArr2, x17, x16, lowestVisibleXIndex2, highestVisibleXIndex2);
                    }
                    uVar.highlightValues(highlightArr2);
                }
                ViewParent parent2 = mVar.f145398l.getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            case 8:
                AppBarLayout appBarLayout = ((qm0.x) this.f138839b).f145579d;
                if (appBarLayout != null) {
                    appBarLayout.setExpanded(true, true);
                    return;
                }
                return;
            case 9:
                p2 p2Var = ((qr.t) this.f138839b).f146532k0;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, Integer.valueOf(((Number) value).intValue() - 1)));
                return;
            case 10:
                ((c1) this.f138839b).close();
                return;
            case 11:
                r0.e eVar2 = (r0.e) this.f138839b;
                eVar2.f148716j = true;
                eVar2.d();
                return;
            case 12:
                r0.r.c cVar2 = ((r0.r) this.f138839b).f148776c;
                if (cVar2 != null) {
                    Iterator<r0.o> it4 = cVar2.values().iterator();
                    while (it4.hasNext()) {
                        it4.next().c();
                    }
                    return;
                }
                return;
            case 13:
                p0 p0Var = (p0) this.f138839b;
                int i15 = p0.c.f149791b;
                Dialog dialog = p0Var.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 14:
                ro1.j0 j0Var = (ro1.j0) this.f138839b;
                ConstraintLayout constraintLayout = j0Var.f153974b;
                if (constraintLayout == null) {
                    p005kotlin.jvm.internal.s.m("stickerListContainer");
                    throw null;
                }
                double width = constraintLayout.getWidth();
                ConstraintLayout constraintLayout2 = j0Var.f153974b;
                if (constraintLayout2 == null) {
                    p005kotlin.jvm.internal.s.m("stickerListContainer");
                    throw null;
                }
                if (width / ((double) constraintLayout2.getHeight()) < 2.5d) {
                    androidx.constraintlayout.widget.d dVar4 = new androidx.constraintlayout.widget.d();
                    ConstraintLayout constraintLayout3 = j0Var.f153974b;
                    if (constraintLayout3 == null) {
                        p005kotlin.jvm.internal.s.m("stickerListContainer");
                        throw null;
                    }
                    dVar4.f(constraintLayout3);
                    dVar4.k(R.id.sticker_recyclerview).f6203e.f6261z = "2.5";
                    ConstraintLayout constraintLayout4 = j0Var.f153974b;
                    if (constraintLayout4 != null) {
                        dVar4.b(constraintLayout4);
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m("stickerListContainer");
                        throw null;
                    }
                }
                return;
            case 15:
                rv2.a aVar2 = (rv2.a) this.f138839b;
                RecyclerView recyclerView = aVar2.f154759h;
                if (recyclerView != null) {
                    List<T> list = aVar2.f10698a.f10426f;
                    list.getClass();
                    Iterator it5 = list.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            i14 = -1;
                        } else if (!((sv2.a) it5.next()).f161032c) {
                            i14++;
                        }
                    }
                    if (i14 != -1) {
                        recyclerView.postDelayed(new rv2.b(aVar2, recyclerView, i14), 300L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a aVar3 = (com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a) this.f138839b;
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.C0493a c0493a = com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.f30916d;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.a aVar4 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40568e;
                Context contextRequireContext = aVar3.requireContext();
                contextRequireContext.getClass();
                aVar4.getClass();
                Object systemService = contextRequireContext.getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).toggleSoftInput(2, 0);
                return;
            case 17:
                rw.g gVar = (rw.g) this.f138839b;
                gVar.f154810x.scrollBy(0, gVar.f154808v.getHeight() + gVar.f154807u.getHeight());
                return;
            case 18:
                s0.e eVar3 = (s0.e) this.f138839b;
                eVar3.f155265f = true;
                eVar3.d();
                return;
            case 19:
                s0.f.c cVar3 = ((s0.f) this.f138839b).f155273d;
                if (cVar3 != null) {
                    Iterator<r0.o> it6 = cVar3.values().iterator();
                    while (it6.hasNext()) {
                        it6.next().c();
                    }
                    return;
                }
                return;
            case 20:
                sm2.k kVar2 = (sm2.k) this.f138839b;
                kVar2.j();
                kVar2.f160340f.debug("Start reconnect...");
                return;
            case 21:
                sm2.t tVar2 = (sm2.t) this.f138839b;
                lm2.f fVar = tVar2.f160344i;
                Context context = tVar2.f160339e;
                yl2.d dVar5 = tVar2.f160338d;
                fVar.g(context, dVar5.getF197655a(), dVar5.f(), null);
                return;
            case 22:
                GCMDigitsPickerContainer gCMDigitsPickerContainer = ((CircumferencePickerLayout) this.f138839b).f30750a;
                if (gCMDigitsPickerContainer != null) {
                    gCMDigitsPickerContainer.setTextColor(R.color.gcm_text_primary);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("valuePicker");
                    throw null;
                }
            case 23:
                tl2.c cVar4 = (tl2.c) this.f138839b;
                if (cVar4.f165293j.get() == 1) {
                    cVar4.f165290g.warn("Timing out transfer id " + cVar4.f165291h);
                    cVar4.f(tl2.c.b.IDLE_TIMEOUT, null);
                    return;
                }
                return;
            case 24:
                EditText editText = (EditText) this.f138839b;
                int i16 = tm0.c.f165349i;
                editText.requestFocus();
                return;
            case 25:
                StickerEditorView stickerEditorView = (StickerEditorView) this.f138839b;
                int i17 = StickerEditorView.f44707l;
                stickerEditorView.k();
                return;
            case 26:
                InlineUnitsTextFieldView inlineUnitsTextFieldView = ((com.garmin.android.apps.connectmobile.traininginitiative.ui.u) this.f138839b).f46276f;
                if (inlineUnitsTextFieldView != null) {
                    inlineUnitsTextFieldView.callOnClick();
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("swimDistanceView");
                    throw null;
                }
            case 27:
                l1 l1Var = (l1) this.f138839b;
                if (l1Var != null) {
                    l1Var.c(null);
                    return;
                }
                return;
            case 28:
                ((CameraDevice) this.f138839b).close();
                return;
            default:
                v.s.h.b bVar = (v.s.h.b) this.f138839b;
                if (bVar.f174065b) {
                    return;
                }
                k7.h.f(v.s.this.f174010e == v.s.g.REOPENING || v.s.this.f174010e == v.s.g.REOPENING_QUIRK, null);
                boolean zC = v.s.h.this.c();
                v.s.h hVar3 = v.s.h.this;
                if (zC) {
                    v.s.this.H(true);
                    return;
                } else {
                    v.s.this.I(true);
                    return;
                }
        }
    }
}
