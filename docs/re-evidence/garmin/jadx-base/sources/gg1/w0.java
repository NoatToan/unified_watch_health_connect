package gg1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgg1/w0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w0 extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f77361a = new LinkedHashMap();

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm_theme_settings, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        c22.l lVar = c22.l.LIGHT;
        View viewFindViewById = view2.findViewById(R.id.themeLightItemView);
        viewFindViewById.getClass();
        LinkedHashMap linkedHashMap = this.f77361a;
        linkedHashMap.put(lVar, viewFindViewById);
        c22.l lVar2 = c22.l.DARK;
        View viewFindViewById2 = view2.findViewById(R.id.themeDarkItemView);
        viewFindViewById2.getClass();
        linkedHashMap.put(lVar2, viewFindViewById2);
        c22.l lVar3 = c22.l.SYSTEM;
        View viewFindViewById3 = view2.findViewById(R.id.themeSystemItemView);
        viewFindViewById3.getClass();
        linkedHashMap.put(lVar3, viewFindViewById3);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((GCMCheckableRow) entry.getValue()).setChecked(false);
            ((GCMCheckableRow) entry.getValue()).setOnClickListener(new cw2.b(20, this, entry));
        }
        f12.l.f68084a.getClass();
        GCMCheckableRow gCMCheckableRow = (GCMCheckableRow) linkedHashMap.get(f12.l.a.a().E2());
        if (gCMCheckableRow != null) {
            gCMCheckableRow.setChecked(true);
        }
    }
}
