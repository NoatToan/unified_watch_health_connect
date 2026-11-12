package com.huami.assistant.ui.fragment;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.huami.assistant.R;
import com.huami.watch.companion.ui.view.WheelAdapter;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes5.dex */
public class RepeatIntervalPickerFragment extends Fragment {
    private WheelView a;

    @StringRes
    private int b;
    private int c;
    private DialogFragment d;

    public interface IntervalSelectListener {
        void onIntervalSelect(int interval);
    }

    private void b(View view) {
        this.a = (WheelView) view.findViewById(R.id.interval_picker);
        this.a.setVisibleItems(5).setCenterDrawable(R.color.transparent).setViewAdapter(new WheelAdapter(getActivity(), 1, 99, this.a, getResources().getColor(R.color.wheel_center_color), getResources().getColor(R.color.wheel_dark_color), getResources().getColor(R.color.wheel_lighter_color), false, 46, 8, 6, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(IntervalSelectListener intervalSelectListener, DialogInterface dialogInterface, int i) {
        if (intervalSelectListener != null) {
            intervalSelectListener.onIntervalSelect(this.a.getCurrentItem() + 1);
        }
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.fragment_repeat_interval_picker, container, false);
        b(viewInflate);
        return viewInflate;
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.a.setCenterStyle(getString(this.b), R.color.dark_red_text, 22.0f);
        this.a.setCurrentItem(this.c - 1);
    }

    public void show(Activity activity, int currentInterval, @StringRes int unit, final IntervalSelectListener intervalSelectListener) {
        LoadingDialog.dismiss(this.d);
        this.c = currentInterval;
        this.b = unit;
        this.d = AlertDialog.setTitle(activity.getString(R.string.every)).setContent(this).setCancelable(false).setNegativeBtn(activity.getString(R.string.cancel), null).setPositiveBtn(activity.getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: rb6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.c(intervalSelectListener, dialogInterface, i);
            }
        }).show(activity, "select interval");
    }
}
