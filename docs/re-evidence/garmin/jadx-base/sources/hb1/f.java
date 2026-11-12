package hb1;

import android.view.View;
import androidx.fragment.app.m;
import o13.p;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f82765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f82766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f82767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f82768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f82769f;

    public /* synthetic */ f(m mVar, String str, String str2, p pVar, p pVar2, int i14) {
        this.f82764a = i14;
        this.f82765b = mVar;
        this.f82766c = str;
        this.f82767d = str2;
        this.f82768e = pVar;
        this.f82769f = pVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f82764a) {
            case 0:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.C0766a c0766a = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.f40578o;
                c22.f.f23050a.getClass();
                c22.f.b(this.f82765b, this.f82766c, this.f82767d, this.f82768e, this.f82769f, null, false).show();
                break;
            default:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.f40906o;
                c22.f.f23050a.getClass();
                c22.f.b(this.f82765b, this.f82766c, this.f82767d, this.f82768e, this.f82769f, null, false).show();
                break;
        }
    }
}
