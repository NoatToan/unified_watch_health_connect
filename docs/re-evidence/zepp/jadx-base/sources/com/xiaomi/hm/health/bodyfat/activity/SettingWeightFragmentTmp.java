package com.xiaomi.hm.health.bodyfat.activity;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.lib.view.dim.DimPanelFragment;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;

/* JADX INFO: loaded from: classes19.dex */
@Deprecated
public class SettingWeightFragmentTmp extends DimPanelFragment {
    public static final int DETAIL_ADD = 1;
    public static final int WEIGHT_ADD = 2;
    private static final String h = SettingWeightFragmentTmp.class.getSimpleName();
    private static float i = 60.0f;
    private static int j;
    private WheelView b;
    private WheelView c;
    private int d;
    private String e;
    private IOnWeightSelectListener f;
    private PickAdapter g;

    public interface IOnWeightSelectListener {
        void onWeightSelect(float f);

        void onWeightSelectCancel();
    }

    public class a implements OnWheelScrollListener {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            HMLog.d(SettingWeightFragmentTmp.h, "item " + wheelView.getCurrentItem(), new Object[0]);
            HMLog.d(SettingWeightFragmentTmp.h, "maxByUnit = " + HMWeightUtils.convertFromKg(632.0f, SettingWeightFragmentTmp.this.d), new Object[0]);
            if (wheelView.getCurrentItem() != ((int) HMWeightUtils.convertFromKg(632.0f, SettingWeightFragmentTmp.this.d))) {
                SettingWeightFragmentTmp.this.c.setViewAdapter(SettingWeightFragmentTmp.this.g).setCenterStyle(SettingWeightFragmentTmp.this.e, R.color.p4, 25.123f);
                return;
            }
            HMLog.d(SettingWeightFragmentTmp.h, " should refresh when max", new Object[0]);
            Context context = this.a;
            WheelView wheelView2 = SettingWeightFragmentTmp.this.c;
            Context context2 = this.a;
            int i = R.color.p4;
            PickAdapter pickAdapter = new PickAdapter(context, 0, 0, wheelView2, ContextCompat.getColor(context2, i), ContextCompat.getColor(this.a, R.color.s2), ContextCompat.getColor(this.a, R.color.s3), false, 46, 20, 18, 16, 1, 0);
            pickAdapter.setMode(19);
            SettingWeightFragmentTmp.this.c.setCenterDrawable(R.drawable.wheel_view_select_bg_end).setCenterStyle(SettingWeightFragmentTmp.this.e, i, 25.123f).setViewAdapter(pickAdapter).setCurrentItem(0);
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        save();
    }

    public static Fragment newInstance(float f, int i2) {
        SettingWeightFragmentTmp settingWeightFragmentTmp = new SettingWeightFragmentTmp();
        i = f;
        j = i2;
        return settingWeightFragmentTmp;
    }

    public void cancel() {
        super.onLeftButtonClicked();
        IOnWeightSelectListener iOnWeightSelectListener = this.f;
        if (iOnWeightSelectListener != null) {
            iOnWeightSelectListener.onWeightSelectCancel();
        }
    }

    @Override // com.huami.lib.view.dim.DimPanelFragment
    public int inflateLayout() {
        return R.layout.fragment_setting_weight_temp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f = (IOnWeightSelectListener) activity;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.huami.lib.view.dim.DimPanelFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.huami.lib.view.dim.DimPanelFragment, android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        Context context2 = layoutInflater.getContext();
        TextView textView = (TextView) viewOnCreateView.findViewById(R.id.titleTv);
        if (j == 2) {
            textView.setText(R.string.choose_weight_manual);
        } else {
            textView.setText(R.string.record_weight);
        }
        this.d = BFCallback.getUnitManager().getWeightUnit();
        this.e = HMWeightUtils.toUnitStr(getActivity().getApplicationContext(), BFCallback.getUnitManager().getWeightUnit());
        int iConvertFromKg = (int) HMWeightUtils.convertFromKg(3.0f, this.d);
        int iConvertFromKg2 = (int) HMWeightUtils.convertFromKg(635.0f, this.d);
        this.b = (WheelView) viewOnCreateView.findViewById(R.id.info_weight_int_wheel);
        this.c = (WheelView) viewOnCreateView.findViewById(R.id.info_weight_decimal_wheel);
        viewOnCreateView.findViewById(R.id.weight_btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: cs6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        });
        viewOnCreateView.findViewById(R.id.weight_btn_save).setOnClickListener(new View.OnClickListener() { // from class: bs6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.i(view);
            }
        });
        int iConvertFromKg3 = ((int) HMWeightUtils.convertFromKg(i, BFCallback.getUnitManager().getWeightUnit())) - ((int) HMWeightUtils.convertFromKg(3.0f, BFCallback.getUnitManager().getWeightUnit()));
        String str = h;
        HMLog.d(str, "currentItem = " + iConvertFromKg3, new Object[0]);
        WheelView centerStyle = this.b.setCenterDrawable(R.drawable.wheel_view_select_bg_start).setCenterStyle("", 25.123f);
        WheelView wheelView = this.b;
        int i2 = R.color.p4;
        int color = ContextCompat.getColor(context2, i2);
        int i3 = R.color.s2;
        int color2 = ContextCompat.getColor(context2, i3);
        int i4 = R.color.s3;
        centerStyle.setViewAdapter(new PickAdapter(context2, iConvertFromKg, iConvertFromKg2, wheelView, color, color2, ContextCompat.getColor(context2, i4), false, 46, 20, 18, 16, 1, 0)).setCurrentItem(((int) HMWeightUtils.convertFromKg(i, BFCallback.getUnitManager().getWeightUnit())) - ((int) HMWeightUtils.convertFromKg(3.0f, BFCallback.getUnitManager().getWeightUnit())));
        PickAdapter pickAdapter = new PickAdapter(context2, 0, this.d == 17 ? 13 : 9, this.c, ContextCompat.getColor(context2, i2), ContextCompat.getColor(context2, i3), ContextCompat.getColor(context2, i4), false, 46, 20, 18, 16, 1, 0);
        this.g = pickAdapter;
        if (this.d == 17) {
            pickAdapter.setMode(25);
        } else {
            pickAdapter.setMode(19);
        }
        if (HMWeightUtils.convertFromKg(i, BFCallback.getUnitManager().getWeightUnit()) < iConvertFromKg2) {
            HMLog.d(str, " < max", new Object[0]);
            HMLog.d(str, " max weight: " + iConvertFromKg2, new Object[0]);
            int iScaleFloat = ((int) (HMWeightUtils.scaleFloat(HMWeightUtils.convertFromKg(i, BFCallback.getUnitManager().getWeightUnit()), 1) * 10.0f)) - (((int) HMWeightUtils.convertFromKg(i, BFCallback.getUnitManager().getWeightUnit())) * 10);
            if (this.d == 17) {
                iScaleFloat = ((int) (HMWeightUtils.convertFromKg(i, 1) + 0.5f)) % 14;
            }
            this.c.setCenterDrawable(R.drawable.wheel_view_select_bg_end).setCenterStyle(this.e, i2, 25.123f).setViewAdapter(this.g).setCurrentItem(iScaleFloat);
            HMLog.d(str, "raw " + i, new Object[0]);
            HMLog.d(str, "to unit " + HMWeightUtils.convertFromKg(i, BFCallback.getUnitManager().getWeightUnit()), new Object[0]);
            context = context2;
        } else {
            HMLog.d(str, " >= max", new Object[0]);
            context = context2;
            PickAdapter pickAdapter2 = new PickAdapter(context2, 0, 0, this.c, ContextCompat.getColor(context2, i2), ContextCompat.getColor(context2, i3), ContextCompat.getColor(context2, i4), false, 46, 20, 18, 16, 1);
            pickAdapter2.setMode(19);
            this.c.setCenterDrawable(R.drawable.wheel_view_select_bg_end).setCenterStyle(this.e, i2, 25.123f).setViewAdapter(pickAdapter2).setCurrentItem(((int) (HMWeightUtils.convertFromKg(i, BFCallback.getUnitManager().getWeightUnit()) * 10.0f)) - (((int) HMWeightUtils.convertFromKg(i, BFCallback.getUnitManager().getWeightUnit())) * 10));
        }
        this.b.addScrollingListener(new a(context));
        return viewOnCreateView;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        IOnWeightSelectListener iOnWeightSelectListener = this.f;
        if (iOnWeightSelectListener != null) {
            iOnWeightSelectListener.onWeightSelectCancel();
        }
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
    }

    public void save() {
        float currentItem;
        float fConvertFromKg;
        if (this.d == 17) {
            currentItem = this.b.getCurrentItem();
            fConvertFromKg = (this.c.getCurrentItem() * 1.0f) / 14.0f;
        } else {
            currentItem = this.b.getCurrentItem() + (this.c.getCurrentItem() / 10.0f);
            fConvertFromKg = (int) HMWeightUtils.convertFromKg(3.0f, BFCallback.getUnitManager().getWeightUnit());
        }
        float fConvertToKg = HMWeightUtils.convertToKg(currentItem + fConvertFromKg, BFCallback.getUnitManager().getWeightUnit());
        IOnWeightSelectListener iOnWeightSelectListener = this.f;
        if (iOnWeightSelectListener != null) {
            iOnWeightSelectListener.onWeightSelect(fConvertToKg);
        }
        dismiss();
    }

    public void setListener(IOnWeightSelectListener iOnWeightSelectListener) {
        this.f = iOnWeightSelectListener;
    }
}
