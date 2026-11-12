package com.huami.assistant.ui.schedule.fragment;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.assistant.R;
import com.huami.assistant.util.EventUtils;
import com.huami.watch.companion.ui.view.WheelAdapter;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.widget.wheelview.WheelView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ReminderMinutePickerFragment extends Fragment {
    private View a;
    private WheelView b;
    private WheelAdapter c;
    private List<a> d = new ArrayList();
    private a e = null;
    private DialogFragment f;

    public interface MinuteSelectListener {
        void onItemSelect(int minute);
    }

    public static class a implements WheelAdapter.Item {
        private String a;
        private int b;

        public a(int minute, String text) {
            this.b = minute;
            this.a = text;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return super.equals(obj);
            }
            return ((a) obj).b == this.b;
        }

        @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
        public String getKey() {
            return String.valueOf(this.b);
        }

        @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
        public String getValue() {
            return this.a;
        }
    }

    private int b() {
        return this.d.get(this.b.getCurrentItem()).b;
    }

    private void c() {
        this.b = (WheelView) this.a.findViewById(R.id.option_picker);
        WheelAdapter wheelAdapter = new WheelAdapter(getActivity(), 0, 1, this.b, getResources().getColor(R.color.wheel_normal_center), getResources().getColor(R.color.wheel_normal_normal), getResources().getColor(R.color.wheel_normal_lighter), false, 46, 8, 6, 6);
        this.c = wheelAdapter;
        wheelAdapter.setUIStyle("normal");
        this.b.setViewAdapter(this.c).setVisibleItems(5).setCenterDrawable(R.color.transparent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(MinuteSelectListener minuteSelectListener, DialogInterface dialogInterface, int i) {
        if (minuteSelectListener != null) {
            minuteSelectListener.onItemSelect(b());
        }
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        this.a = inflater.inflate(R.layout.fragment_reminder_minute_picker, container, false);
        c();
        return this.a;
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.c.setDataList(this.d);
        this.c.setStartValue(0);
        this.c.setEndValue(this.d.size() - 1);
        WheelView wheelView = this.b;
        a aVar = this.e;
        wheelView.setCurrentItem(aVar != null ? this.d.indexOf(aVar) : 0);
    }

    public void setData(Context context, int currentMinute, long baseTime) {
        this.d.clear();
        for (int i : context.getResources().getIntArray(baseTime > 0 ? R.array.allday_reminder_minute : R.array.reminder_minute)) {
            this.d.add(new a(i, EventUtils.formatReminderMinute(context, i, baseTime)));
        }
        a aVar = new a(currentMinute, "");
        this.e = aVar;
        if (this.d.contains(aVar)) {
            return;
        }
        this.d.add(0, this.e);
    }

    public void show(@NonNull Activity activity, @NonNull String title, final MinuteSelectListener onMinuteSelect, @NonNull String tag) {
        LoadingDialog.dismiss(this.f);
        this.f = AlertDialog.setTitle(title).setContent(this).setPositiveBtn(activity.getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: gb6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.d(onMinuteSelect, dialogInterface, i);
            }
        }).setNegativeBtn(activity.getString(R.string.cancel), null).show(activity, tag);
    }
}
