package u40;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSingleLineEditTextView;
import d53.w;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f168586b;

    public /* synthetic */ l(o oVar, int i14) {
        this.f168585a = i14;
        this.f168586b = oVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        String string;
        int i14 = this.f168585a;
        boolean z14 = false;
        o oVar = this.f168586b;
        switch (i14) {
            case 0:
                String str = (String) obj;
                o.a aVar = o.f168590m;
                str.getClass();
                GCMSingleLineEditTextView gCMSingleLineEditTextView = oVar.f168595l;
                if (gCMSingleLineEditTextView == null) {
                    s.m("coursePointNameEditText");
                    throw null;
                }
                gCMSingleLineEditTextView.setPadding(0, 0, 0, 0);
                String string2 = w.i0(str).toString();
                if (string2.length() > 0 && !string2.equals(oVar.getString(R.string.txt_untitle))) {
                    z14 = true;
                }
                GCMSingleLineEditTextView gCMSingleLineEditTextView2 = oVar.f168595l;
                if (gCMSingleLineEditTextView2 == null) {
                    s.m("coursePointNameEditText");
                    throw null;
                }
                gCMSingleLineEditTextView2.setHasError(!z14);
                if (z14) {
                    com.garmin.android.apps.connectmobile.courses.model.g gVar = oVar.f168593j;
                    if (gVar != null) {
                        gVar.name = string2;
                    }
                    oVar.w6();
                }
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.courses.model.f fVar = (com.garmin.android.apps.connectmobile.courses.model.f) obj;
                o.a aVar2 = o.f168590m;
                fVar.getClass();
                String str2 = fVar.f32922a;
                com.garmin.android.apps.connectmobile.courses.model.g gVar2 = oVar.f168593j;
                String strF6 = oVar.F6(gVar2 != null ? gVar2.getCoursePointType() : null, true);
                com.garmin.android.apps.connectmobile.courses.model.g gVar3 = oVar.f168593j;
                String str3 = gVar3 != null ? gVar3.name : null;
                if (str3 == null) {
                    str3 = "";
                }
                if (strF6.equals(str3)) {
                    com.garmin.android.apps.connectmobile.courses.model.g gVar4 = oVar.f168593j;
                    if (gVar4 != null) {
                        gVar4.name = oVar.F6(str2, true);
                    }
                    if (oVar.f168595l != null) {
                        com.garmin.android.apps.connectmobile.courses.model.g gVar5 = oVar.f168593j;
                        if (gVar5 == null || (string = gVar5.name) == null) {
                            string = oVar.getString(R.string.txt_untitle);
                            string.getClass();
                        }
                        GCMSingleLineEditTextView gCMSingleLineEditTextView3 = oVar.f168595l;
                        if (gCMSingleLineEditTextView3 == null) {
                            s.m("coursePointNameEditText");
                            throw null;
                        }
                        gCMSingleLineEditTextView3.f47811h.setText(string);
                    }
                }
                com.garmin.android.apps.connectmobile.courses.model.g gVar6 = oVar.f168593j;
                if (gVar6 != null) {
                    gVar6.m(str2);
                }
                GCMComplexTwoLineButton gCMComplexTwoLineButton = oVar.f168594k;
                if (gCMComplexTwoLineButton != null) {
                    com.garmin.android.apps.connectmobile.courses.model.g gVar7 = oVar.f168593j;
                    gCMComplexTwoLineButton.setButtonBottomLeftLabel(oVar.F6(gVar7 != null ? gVar7.getCoursePointType() : null, false));
                }
                oVar.w6();
                return Unit.INSTANCE;
        }
    }
}
