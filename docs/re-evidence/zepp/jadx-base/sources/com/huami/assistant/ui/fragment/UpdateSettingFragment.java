package com.huami.assistant.ui.fragment;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.assistant.R;
import com.huami.assistant.ui.activity.UpdatesSettingActivity;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.Analytics;

/* JADX INFO: loaded from: classes5.dex */
public class UpdateSettingFragment extends Fragment implements View.OnClickListener {
    private DialogFragment a;

    private void a(View view) {
        view.findViewById(R.id.setting).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        LoadingDialog.dismiss(this.a);
        if (v.getId() == R.id.setting) {
            startActivity(new Intent(getActivity(), (Class<?>) UpdatesSettingActivity.class));
            Analytics.event(getActivity(), AnalyticsEvents.EVENT_CLICK_SMART_SET_CLICK);
        }
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.fragment_update_setting, container, false);
        a(viewInflate);
        return viewInflate;
    }

    public DialogFragment show(@NonNull Activity activity) {
        LoadingDialog.dismiss(this.a);
        DialogFragment dialogFragmentShow = AlertDialog.setTitle("").setContent(this).setNeutralBtn(activity.getString(R.string.cancel)).show(activity, "update setting");
        this.a = dialogFragmentShow;
        return dialogFragmentShow;
    }
}
