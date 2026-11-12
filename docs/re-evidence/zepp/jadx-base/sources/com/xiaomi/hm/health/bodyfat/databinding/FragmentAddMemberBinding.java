package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentAddMemberBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ListView personInfoList;

    @NonNull
    public final Button textSave;

    private FragmentAddMemberBinding(@NonNull RelativeLayout relativeLayout, @NonNull ListView listView, @NonNull Button button) {
        this.a = relativeLayout;
        this.personInfoList = listView;
        this.textSave = button;
    }

    @NonNull
    public static FragmentAddMemberBinding bind(@NonNull View view) {
        int i = R.id.person_info_list;
        ListView listView = (ListView) ViewBindings.findChildViewById(view, i);
        if (listView != null) {
            i = R.id.text_save;
            Button button = (Button) ViewBindings.findChildViewById(view, i);
            if (button != null) {
                return new FragmentAddMemberBinding((RelativeLayout) view, listView, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentAddMemberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentAddMemberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_add_member, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
