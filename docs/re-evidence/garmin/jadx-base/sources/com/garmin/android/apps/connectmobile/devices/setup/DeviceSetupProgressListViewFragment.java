package com.garmin.android.apps.connectmobile.devices.setup;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.n0;
import b7.g;
import bd0.a0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class DeviceSetupProgressListViewFragment extends n0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a0 f34439j;

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        i2.a(a2.DEVICES, "DeviceSetupProgressListViewFragment", ".onActivityCreated()");
        u6();
        ListView listView = this.f7311e;
        a0 a0Var = new a0(getActivity(), new ArrayList(0));
        this.f34439j = a0Var;
        listView.setAdapter((ListAdapter) a0Var);
        listView.setFooterDividersEnabled(false);
        Resources resources = getResources();
        ThreadLocal<TypedValue> threadLocal = g.f16255a;
        listView.setSelector(resources.getDrawable(R.drawable.gcm_surface_1_selector_background, null));
        listView.setDivider(getResources().getDrawable(android.R.color.transparent, null));
        listView.setDividerHeight(0);
        listView.setCacheColorHint(getResources().getColor(R.color.gcm_list_item_background));
        listView.setTranscriptMode(2);
        listView.setFastScrollEnabled(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i2.a(a2.DEVICES, "DeviceSetupProgressListViewFragment", ".onCreate()");
    }

    @Override // androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i2.a(a2.DEVICES, "DeviceSetupProgressListViewFragment", ".onCreateView()");
        return layoutInflater.inflate(R.layout.gcm_list_view_with_empty_text, (ViewGroup) null);
    }
}
