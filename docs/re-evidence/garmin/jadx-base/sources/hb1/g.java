package hb1;

import android.text.TextUtils;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancyTwoLineButton;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import xg1.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhb1/g;", "Lxg1/o$b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements o.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a f82770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f82771b;

    public g(com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a aVar, m mVar) {
        this.f82770a = aVar;
        this.f82771b = mVar;
    }

    @Override // xg1.o.b
    public final void a(String str) {
        str.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a aVar = this.f82770a;
        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = aVar.f40581b;
        if (gCMPregnancyTwoLineButton == null) {
            s.m("mPregnancyNameButton");
            throw null;
        }
        gCMPregnancyTwoLineButton.setButtonValueLabel(str);
        db1.m mVar = aVar.f40592m;
        if (mVar == null) {
            s.m("mPregnancySnapshotDTO");
            throw null;
        }
        mVar.F(str);
        this.f82771b.invalidateOptionsMenu();
    }
}
