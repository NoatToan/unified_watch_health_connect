package ey;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.a0;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ley/v;", "Landroidx/fragment/app/a0;", "Landroidx/fragment/app/v;", "fm", "<init>", "(Landroidx/fragment/app/v;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<com.garmin.android.apps.connectmobile.calendar.presentation.c> f67121a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.fragment.app.v vVar) {
        super(vVar);
        vVar.getClass();
    }

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public final int getF149591t() {
        return 4;
    }

    public final ArrayList<com.garmin.android.apps.connectmobile.calendar.presentation.c> getFragments() {
        if (this.f67121a == null) {
            this.f67121a = new ArrayList<>();
            for (int i14 = 0; i14 < 4; i14++) {
                ArrayList<com.garmin.android.apps.connectmobile.calendar.presentation.c> arrayList = this.f67121a;
                if (arrayList != null) {
                    arrayList.add(new com.garmin.android.apps.connectmobile.calendar.presentation.c());
                }
            }
        }
        ArrayList<com.garmin.android.apps.connectmobile.calendar.presentation.c> arrayList2 = this.f67121a;
        return arrayList2 == null ? new ArrayList<>() : arrayList2;
    }

    @Override // androidx.fragment.app.a0
    public final Fragment getItem(int i14) {
        com.garmin.android.apps.connectmobile.calendar.presentation.c cVar = getFragments().get(i14);
        cVar.getClass();
        return cVar;
    }
}
