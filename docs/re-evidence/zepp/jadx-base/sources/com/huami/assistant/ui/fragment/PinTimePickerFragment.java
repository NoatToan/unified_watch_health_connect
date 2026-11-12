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
import com.huami.assistant.R;
import com.huami.watch.companion.ui.view.WheelAdapter;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.Log;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes5.dex */
public class PinTimePickerFragment extends Fragment {
    private static final String d = "PinTimePickerFragment";
    private WheelView a;
    private int b = 3;
    private DialogFragment c = null;

    public interface TimeSelectListener {
        void onSelect(int minute);
    }

    private int b() {
        return getResources().getIntArray(R.array.pin_time)[this.a.getCurrentItem()];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(TimeSelectListener timeSelectListener, DialogInterface dialogInterface, int i) {
        this.b = this.a.getCurrentItem();
        int iB = b();
        Log.d(d, "FixedMinute:" + iB, new Object[0]);
        if (timeSelectListener != null) {
            timeSelectListener.onSelect(iB);
        }
    }

    private void d(WheelView wheelView) {
        WheelAdapter wheelAdapter = new WheelAdapter(getActivity(), 0, getResources().getIntArray(R.array.pin_time).length - 1, wheelView, getResources().getColor(R.color.wheel_center_color), getResources().getColor(R.color.wheel_dark_color), getResources().getColor(R.color.wheel_lighter_color), false, 46, 8, 6, 6);
        wheelAdapter.setMode(22);
        wheelView.setVisibleItems(5).setCenterDrawable(R.color.transparent).setCenterStyle("", R.color.white, 32.0f).setViewAdapter(wheelAdapter).setCurrentItem(this.b);
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.fragment_pin_time, container, false);
        WheelView wheelView = (WheelView) viewInflate.findViewById(R.id.pin_time_picker);
        this.a = wheelView;
        d(wheelView);
        return viewInflate;
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.a.setCurrentItem(this.b);
    }

    public DialogFragment show(Activity activity, final TimeSelectListener listener) {
        LoadingDialog.dismiss(this.c);
        DialogFragment dialogFragmentShow = AlertDialog.setTitle(activity.getString(R.string.pin_select_time_dialog_title)).setContent(this).setNegativeBtn(activity.getString(R.string.cancel)).setPositiveBtn(activity.getString(R.string.dialog_confirm), new DialogInterface.OnClickListener() { // from class: h06
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.c(listener, dialogInterface, i);
            }
        }).show(activity, "Pin Time Picker");
        this.c = dialogFragmentShow;
        return dialogFragmentShow;
    }
}
