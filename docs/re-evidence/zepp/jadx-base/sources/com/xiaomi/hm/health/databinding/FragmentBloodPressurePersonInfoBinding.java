package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentBloodPressurePersonInfoBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListView personInfoList;

    private FragmentBloodPressurePersonInfoBinding(@NonNull LinearLayout rootView, @NonNull ListView personInfoList) {
        this.a = rootView;
        this.personInfoList = personInfoList;
    }

    @NonNull
    public static FragmentBloodPressurePersonInfoBinding bind(@NonNull View rootView) {
        ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.person_info_list);
        if (listView != null) {
            return new FragmentBloodPressurePersonInfoBinding((LinearLayout) rootView, listView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.person_info_list)));
    }

    @NonNull
    public static FragmentBloodPressurePersonInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentBloodPressurePersonInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_blood_pressure_person_info, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
