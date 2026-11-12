package com.huami.assistant.ui.fragment;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.huami.assistant.R;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;

/* JADX INFO: loaded from: classes5.dex */
public class RepeatTypePickerFragment extends Fragment implements View.OnClickListener {
    private View a;
    private View b;
    private View c;
    private View d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private int i = 0;
    private RepeatTypeListener j;
    private DialogFragment k;

    public interface RepeatTypeListener {
        void onRepeatTypeSelect(int type);
    }

    private void a(View mainView) {
        mainView.findViewById(R.id.repeat_type_day).setOnClickListener(this);
        mainView.findViewById(R.id.repeat_type_week).setOnClickListener(this);
        mainView.findViewById(R.id.repeat_type_month).setOnClickListener(this);
        mainView.findViewById(R.id.repeat_type_year).setOnClickListener(this);
        this.a = mainView.findViewById(R.id.repeat_type_day_arrow);
        this.b = mainView.findViewById(R.id.repeat_type_week_arrow);
        this.c = mainView.findViewById(R.id.repeat_type_month_arrow);
        this.d = mainView.findViewById(R.id.repeat_type_year_arrow);
        this.e = (TextView) mainView.findViewById(R.id.repeat_type_day_text);
        this.f = (TextView) mainView.findViewById(R.id.repeat_type_week_text);
        this.g = (TextView) mainView.findViewById(R.id.repeat_type_month_text);
        this.h = (TextView) mainView.findViewById(R.id.repeat_type_year_text);
    }

    private void b() {
        this.a.setVisibility(this.i == 0 ? 0 : 4);
        this.b.setVisibility(this.i == 1 ? 0 : 4);
        this.c.setVisibility(this.i == 2 ? 0 : 4);
        this.d.setVisibility(this.i != 3 ? 4 : 0);
        this.e.setTextColor(Color.parseColor(this.i == 0 ? "#dc2b0b" : "#e6000000"));
        this.f.setTextColor(Color.parseColor(this.i == 1 ? "#dc2b0b" : "#e6000000"));
        this.g.setTextColor(Color.parseColor(this.i == 2 ? "#dc2b0b" : "#e6000000"));
        this.h.setTextColor(Color.parseColor(this.i != 3 ? "#e6000000" : "#dc2b0b"));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.repeat_type_day) {
            this.i = 0;
        } else if (id == R.id.repeat_type_week) {
            this.i = 1;
        } else if (id == R.id.repeat_type_month) {
            this.i = 2;
        } else {
            this.i = 3;
        }
        b();
        RepeatTypeListener repeatTypeListener = this.j;
        if (repeatTypeListener != null) {
            repeatTypeListener.onRepeatTypeSelect(this.i);
        }
        LoadingDialog.dismiss(this.k);
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.fragment_repeat_type_picker, container, false);
        a(viewInflate);
        return viewInflate;
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b();
    }

    public void show(Activity activity, int currentType, RepeatTypeListener repeatTypeListener) {
        LoadingDialog.dismiss(this.k);
        this.i = currentType;
        this.j = repeatTypeListener;
        this.k = AlertDialog.setTitle("").setContent(this).setNeutralBtn(activity.getString(R.string.cancel), null).show(activity, "select repeat type");
    }
}
