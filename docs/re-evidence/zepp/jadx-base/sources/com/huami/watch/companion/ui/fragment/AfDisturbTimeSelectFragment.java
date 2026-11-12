package com.huami.watch.companion.ui.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.watch.companion.R;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes16.dex */
public class AfDisturbTimeSelectFragment extends Fragment {
    private int[] a = new int[4];
    private WheelView b;
    private WheelView c;
    private WheelView d;
    private WheelView e;

    private void a() {
        int[] iArr = this.a;
        iArr[0] = 9;
        iArr[1] = 30;
        iArr[2] = 7;
        iArr[3] = 0;
    }

    private void b(int i, WheelView wheelView) {
        Activity activity = getActivity();
        Resources resources = getResources();
        int i2 = R.color.wheel_normal_center;
        PickAdapter pickAdapter = new PickAdapter(activity, 0, i, wheelView, resources.getColor(i2), getResources().getColor(R.color.wheel_normal_normal), getResources().getColor(R.color.wheel_normal_lighter), true, 46, 20, 20, 14, 1, 0);
        wheelView.setStyle(WheelView.Style.LINE);
        wheelView.setCenterStyle("", i2, 0.0f);
        wheelView.setVisibleItems(5);
        wheelView.setViewAdapter(pickAdapter);
    }

    private void c() {
        b(23, this.b);
        b(59, this.c);
        b(23, this.d);
        b(59, this.e);
    }

    public String getTime() {
        StringBuilder sb = new StringBuilder();
        int currentItem = this.b.getCurrentItem();
        if (currentItem < 10) {
            sb.append("0");
        }
        sb.append(currentItem);
        sb.append(":");
        int currentItem2 = this.c.getCurrentItem();
        if (currentItem2 < 10) {
            sb.append("0");
        }
        sb.append(currentItem2);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        int currentItem3 = this.d.getCurrentItem();
        if (currentItem3 < 10) {
            sb.append("0");
        }
        sb.append(currentItem3);
        sb.append(":");
        int currentItem4 = this.e.getCurrentItem();
        if (currentItem4 < 10) {
            sb.append("0");
        }
        sb.append(currentItem4);
        return sb.toString();
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_af_disturb_time_select, viewGroup, false);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.b.setCurrentItem(this.a[0]);
        this.c.setCurrentItem(this.a[1]);
        this.d.setCurrentItem(this.a[2]);
        this.e.setCurrentItem(this.a[3]);
    }

    @Override // android.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.b = (WheelView) view.findViewById(R.id.start_hour);
        this.c = (WheelView) view.findViewById(R.id.start_minute);
        this.d = (WheelView) view.findViewById(R.id.end_hour);
        this.e = (WheelView) view.findViewById(R.id.end_minute);
        c();
    }

    public void setDefaultTime(String str) {
        if (TextUtils.isEmpty(str)) {
            a();
            return;
        }
        String[] strArrSplit = str.split("\\D");
        if (strArrSplit.length != 4) {
            a();
            return;
        }
        try {
            this.a[0] = Integer.parseInt(strArrSplit[0]);
            this.a[1] = Integer.parseInt(strArrSplit[1]);
            this.a[2] = Integer.parseInt(strArrSplit[2]);
            this.a[3] = Integer.parseInt(strArrSplit[3]);
        } catch (Exception unused) {
            a();
        }
    }
}
