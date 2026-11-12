package kb1;

import android.text.TextUtils;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancyTwoLineButton;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import xg1.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkb1/i;", "Lxg1/o$b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements o.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b f103837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f103838b;

    public i(com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b bVar, m mVar) {
        this.f103837a = bVar;
        this.f103838b = mVar;
    }

    @Override // xg1.o.b
    public final void a(String str) {
        str.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b bVar = this.f103837a;
        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = bVar.f40909b;
        if (gCMPregnancyTwoLineButton == null) {
            s.m("mPregnancyNameButton");
            throw null;
        }
        gCMPregnancyTwoLineButton.setButtonValueLabel(str);
        db1.m mVar = bVar.f40916i;
        if (mVar == null) {
            s.m("mPregnancySnapshotDTO");
            throw null;
        }
        mVar.F(str);
        this.f103838b.invalidateOptionsMenu();
    }
}
