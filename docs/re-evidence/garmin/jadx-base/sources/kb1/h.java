package kb1;

import android.view.View;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancyTwoLineButton;
import o13.p;
import p005kotlin.jvm.internal.s;
import xg1.o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103834a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b f103835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f103836c;

    public /* synthetic */ h(m mVar, com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b bVar) {
        this.f103836c = mVar;
        this.f103835b = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f103834a;
        m mVar = this.f103836c;
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b bVar = this.f103835b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.f40906o;
                p pVar = new p(mVar.getString(R.string.lbl_common_continue), new g(bVar, 0));
                p pVar2 = new p(mVar.getString(R.string.lbl_cancel), new kb0.f(10));
                c22.f.f23050a.getClass();
                androidx.appcompat.app.e eVarA = c22.f.a(mVar, R.string.pregnancy_delete_record_question, R.string.pregnancy_delete_record_message_short, pVar, pVar2);
                eVarA.setOnShowListener(new hb1.d(mVar, 1));
                eVarA.show();
                return;
            default:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.f40906o;
                v fragmentManager = bVar.getFragmentManager();
                if (fragmentManager != null) {
                    String string = mVar.getString(R.string.lbl_name);
                    string.getClass();
                    GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = bVar.f40909b;
                    if (gCMPregnancyTwoLineButton == null) {
                        s.m("mPregnancyNameButton");
                        throw null;
                    }
                    String buttonValueLabel = gCMPregnancyTwoLineButton.getButtonValueLabel();
                    o.a aVar3 = o.f190914b;
                    String str = buttonValueLabel == null ? "" : buttonValueLabel;
                    if (buttonValueLabel == null) {
                        buttonValueLabel = "";
                    }
                    aVar3.getClass();
                    o oVarA = o.a.a(string, str, buttonValueLabel);
                    oVarA.f190915a = new i(bVar, mVar);
                    oVarA.show(fragmentManager, bVar.getTag());
                    return;
                }
                return;
        }
    }

    public /* synthetic */ h(com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b bVar, m mVar) {
        this.f103835b = bVar;
        this.f103836c = mVar;
    }
}
