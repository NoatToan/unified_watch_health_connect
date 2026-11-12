package com.xiaomi.hm.health.relation.copy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.xiaomi.hm.health.relation.R;

/* JADX INFO: loaded from: classes21.dex */
public class ProgressBarFragment extends DimPanelFragment {
    public static final String REF_PROGRESS_CANCELABLE = "REF_PROGRESS_CANCELABLE";
    public static final String REF_PROGRESS_INFO = "REF_PROGRESS_INFO";

    @Override // com.xiaomi.hm.health.relation.copy.DimPanelFragment
    public int inflateLayout() {
        return R.layout.relatives_fragment_progress_bar;
    }

    @Override // com.xiaomi.hm.health.relation.copy.DimPanelFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.xiaomi.hm.health.relation.copy.DimPanelFragment, android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        Bundle arguments = getArguments();
        TextView textView = (TextView) viewOnCreateView.findViewById(R.id.progress_txt);
        if (arguments != null) {
            String string = arguments.getString("REF_PROGRESS_INFO", "...");
            boolean z = arguments.getBoolean("REF_PROGRESS_CANCELABLE", true);
            textView.setText(string);
            setCancelable(z);
        }
        return viewOnCreateView;
    }
}
