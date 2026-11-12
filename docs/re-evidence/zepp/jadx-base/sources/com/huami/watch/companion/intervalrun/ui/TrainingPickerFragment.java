package com.huami.watch.companion.intervalrun.ui;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.google.android.material.timepicker.TimeModel;
import com.huami.watch.companion.R;
import com.huami.watch.companion.manager.UnitManager;
import com.huami.watch.companion.util.NumberFormatter;
import com.huami.watch.dataflow.model.sport.SportParams;
import com.huami.widget.wheelview.OnWheelChangedListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;

/* JADX INFO: loaded from: classes16.dex */
public class TrainingPickerFragment extends Fragment {
    private static final int A = 14;
    private static final int B = 0;
    private static final int C = 59;
    public static final float INIT_WHEEL_CENTER_UNIT_TEXT_X_OFF_MID = 15.0f;
    public static final int NORMAL_CENTER_TEXT_SIZE = 20;
    public static final int NORMAL_LIGHTER_TEXT_SIZE = 15;
    public static final int NORMAL_NORMAL_TEXT_SIZE = 20;
    public static final int WHEEL_HEIGHT_LARGE = 64;
    private static final int j = 0;
    private static final int k = 30;
    private static final int l = 0;
    private static final int m = 59;
    private static final int n = 92;
    private static final int o = 180;
    private static final int p = 0;
    private static final int q = 10;
    private static final int r = 0;
    private static final int s = 9;
    private static final int t = 1;
    private static final int u = 99;
    private static final int v = 30;
    private static final int w = 210;
    private static final int x = 30;
    private static final int y = 100;
    private static final int z = 2;
    private WheelView c;
    private WheelView d;
    private WheelView e;
    private WheelView f;
    private OnWheelChangedListener h;
    private int a = -1;
    private int b = -1;
    private int g = 0;
    private boolean i = false;

    public class a {
        public int a;
        public int b;
        public int c;
        public String e;
        public int d = 0;
        public String f = TimeModel.ZERO_LEADING_NUMBER_FORMAT;
        public String g = "";

        public a(int i, int i2, int i3, String str) {
            this.c = 1;
            this.e = "";
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.e = str;
        }

        public void a(String str) {
            this.f = str;
        }

        public void b(int i) {
            this.d = i;
        }

        public void c(String str) {
            this.g = str;
        }
    }

    private void a(Context context, WheelView wheelView, a aVar) {
        Resources resources = context.getResources();
        int i = aVar.a;
        int i2 = aVar.b;
        int color = resources.getColor(R.color.wheel_normal_center);
        int i3 = R.color.s2;
        PickAdapter pickAdapter = new PickAdapter(context, i, i2, wheelView, color, resources.getColor(i3), resources.getColor(i3), true, 64, 20, 20, 15, aVar.c);
        pickAdapter.setFormatStr(aVar.f);
        pickAdapter.setSuffixStr(aVar.g);
        wheelView.setVisibleItems(5).setCenterDrawable(R.color.transparent).setCenterStyle(aVar.e, R.color.black, 15.0f).setViewAdapter(pickAdapter).setTextBold(true);
        wheelView.setUnitTextColor(ContextCompat.getColor(getActivity(), R.color.s1));
        wheelView.setStyle(WheelView.Style.LINE);
        int i4 = aVar.d;
        if (i4 > 0) {
            wheelView.setCurrentItem(i4);
        }
    }

    public double[] getPickerValue() {
        double[] dArr = {-1.0d, 0.0d};
        switch (this.g) {
            case 0:
                if (!this.i) {
                    dArr[1] = NumberFormatter.format((((double) (this.c.getCurrentItem() + 0)) + (((double) this.d.getCurrentItem()) / 10.0d)) * 1609.343994140625d, 4, new int[0]);
                } else {
                    dArr[1] = ((this.c.getCurrentItem() + 0) * 1000) + (this.d.getCurrentItem() * 100);
                }
                break;
            case 1:
                dArr[1] = ((this.c.getCurrentItem() + 0) * 60) + this.d.getCurrentItem();
                break;
            case 2:
                int currentItem = ((this.c.getCurrentItem() + 2) * 60) + this.d.getCurrentItem() + 0;
                int currentItem2 = ((this.e.getCurrentItem() + 2) * 60) + this.f.getCurrentItem() + 0;
                dArr[0] = currentItem;
                dArr[1] = currentItem2;
                break;
            case 3:
                dArr[0] = this.c.getCurrentItem() + 92;
                dArr[1] = this.d.getCurrentItem() + 92;
                break;
            case 4:
                dArr[1] = this.c.getCurrentItem() + 1;
                break;
            case 5:
                dArr[1] = this.c.getCurrentItem() + this.b;
                break;
            case 6:
                dArr[1] = this.c.getCurrentItem() + 30;
                break;
            case 7:
                dArr[1] = this.c.getCurrentItem() + this.b;
                break;
        }
        if (dArr[0] > dArr[1]) {
            double d = dArr[0];
            dArr[0] = dArr[1];
            dArr[1] = d;
        }
        return dArr;
    }

    public void initView(View view) {
        a aVar;
        a aVar2;
        a aVar3;
        a aVar4;
        char c;
        switch (this.g) {
            case 0:
                aVar = new a(0, 10, 1, "");
                aVar2 = this.i ? new a(0, 9, 1, getString(R.string.unit_kilometer)) : new a(0, 9, 1, getString(R.string.unit_mile_space));
                aVar.c(" .");
                aVar2.a("%01d");
                aVar2.b(1);
                aVar3 = null;
                aVar4 = null;
                c = 2;
                break;
            case 1:
                aVar = new a(0, 30, 1, getString(R.string.unit_min_short));
                aVar2 = new a(0, 59, 1, getString(R.string.unit_sec_short));
                aVar2.b(1);
                aVar3 = null;
                aVar4 = null;
                c = 2;
                break;
            case 2:
                c = 4;
                int i = R.string.unit_min_short;
                aVar = new a(2, 14, 1, getString(i));
                int i2 = R.string.unit_sec_short;
                a aVar5 = new a(0, 59, 1, getString(i2));
                aVar4 = new a(2, 14, 1, getString(i));
                aVar3 = new a(0, 59, 1, getString(i2));
                aVar2 = aVar5;
                break;
            case 3:
                aVar = new a(92, 180, 1, getString(R.string.hr_unit_name));
                aVar3 = null;
                aVar4 = null;
                aVar2 = aVar;
                c = 2;
                break;
            case 4:
                aVar = new a(1, 99, 1, getString(R.string.count_unit_name));
                aVar3 = null;
                aVar2 = null;
                aVar4 = aVar2;
                c = 1;
                break;
            case 5:
                aVar = new a(this.b, this.a, 1, getString(R.string.hr_unit_name));
                aVar3 = null;
                aVar2 = null;
                aVar4 = aVar2;
                c = 1;
                break;
            case 6:
                aVar = new a(30, 100, 1, getString(R.string.hr_unit_name));
                aVar3 = null;
                aVar2 = null;
                aVar4 = aVar2;
                c = 1;
                break;
            case 7:
                aVar = new a(this.b, this.a, 1, "%");
                aVar3 = null;
                aVar2 = null;
                aVar4 = aVar2;
                c = 1;
                break;
            default:
                aVar3 = null;
                aVar = null;
                aVar2 = null;
                aVar4 = aVar2;
                c = 1;
                break;
        }
        if (c == 1) {
            ((ViewStub) view.findViewById(R.id.stub_wheel_one)).inflate();
            this.c = (WheelView) view.findViewById(R.id.wheel);
            a(getActivity(), this.c, aVar);
        } else if (c == 2) {
            ((ViewStub) view.findViewById(R.id.stub_wheel_two)).inflate();
            int i3 = this.g;
            if (i3 == 0 || i3 == 1) {
                view.findViewById(R.id.vertical_line).setVisibility(0);
            } else {
                view.findViewById(R.id.center_info).setVisibility(0);
            }
            this.c = (WheelView) view.findViewById(R.id.wheel);
            this.d = (WheelView) view.findViewById(R.id.wheel_2);
            a(getActivity(), this.c, aVar);
            a(getActivity(), this.d, aVar2);
        } else {
            ((ViewStub) view.findViewById(R.id.stub_wheel_four)).inflate();
            this.c = (WheelView) view.findViewById(R.id.wheel);
            this.d = (WheelView) view.findViewById(R.id.wheel_2);
            this.e = (WheelView) view.findViewById(R.id.wheel_3);
            this.f = (WheelView) view.findViewById(R.id.wheel_4);
            a(getActivity(), this.c, aVar);
            a(getActivity(), this.d, aVar2);
            a(getActivity(), this.e, aVar4);
            a(getActivity(), this.f, aVar3);
        }
        setOnWheelChangedListener(this.h);
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.g = arguments.getInt("type", 0);
            this.a = arguments.getInt(SportParams.PARAM_CONFIG_MAX, -1);
            this.b = arguments.getInt(SportParams.PARAM_CONFIG_MIN, -1);
        }
        this.i = UnitManager.isDistanceKM(getActivity());
        View viewInflate = layoutInflater.inflate(R.layout.fragment_training_picker, viewGroup, false);
        initView(viewInflate);
        return viewInflate;
    }

    public void setOnWheelChangedListener(OnWheelChangedListener onWheelChangedListener) {
        this.h = onWheelChangedListener;
        if (onWheelChangedListener != null) {
            WheelView wheelView = this.c;
            if (wheelView != null) {
                wheelView.removeChangingListener(onWheelChangedListener);
                this.c.addChangingListener(this.h);
            }
            WheelView wheelView2 = this.d;
            if (wheelView2 != null) {
                wheelView2.removeChangingListener(this.h);
                this.d.addChangingListener(this.h);
            }
            WheelView wheelView3 = this.e;
            if (wheelView3 != null) {
                wheelView3.removeChangingListener(this.h);
                this.e.addChangingListener(this.h);
            }
            WheelView wheelView4 = this.f;
            if (wheelView4 != null) {
                wheelView4.removeChangingListener(this.h);
                this.f.addChangingListener(this.h);
            }
        }
    }
}
