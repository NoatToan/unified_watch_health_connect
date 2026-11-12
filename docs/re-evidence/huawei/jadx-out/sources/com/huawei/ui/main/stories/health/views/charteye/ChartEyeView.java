package com.huawei.ui.main.stories.health.views.charteye;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.util.CollectionUtils;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.main.R;
import defpackage.ien;
import defpackage.qqp;
import defpackage.qqv;
import defpackage.qrs;
import defpackage.uvz;
import defpackage.wqq;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ChartEyeView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f28206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28208c;
    private DataInfos d;
    private Context e;
    private boolean f;
    private boolean g;
    private MultiViewDataObserverView.OnSelectListener h;
    private boolean i;
    private boolean j;
    private PopupWindow k;
    private int l;
    private MultiViewDataObserverView m;
    private List<ScrollChartParentView> n;
    private PopViewList o;

    public ChartEyeView(Context context) {
        super(context);
        this.j = false;
        this.f = false;
        this.g = false;
        this.i = false;
        this.f28206a = new String[]{getResources().getString(R.string.IDS_bloodsugar_continue), getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_fingertip)};
        this.e = context;
    }

    public ChartEyeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = false;
        this.f = false;
        this.g = false;
        this.i = false;
        this.f28206a = new String[]{getResources().getString(R.string.IDS_bloodsugar_continue), getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_fingertip)};
        this.e = context;
    }

    public void setRefreshViewType(int i) {
        setViewType(i);
        post(new Runnable() { // from class: vfh
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e();
            }
        });
    }

    public /* synthetic */ void e() {
        if (this.e == null) {
            LogUtil.d("ChartEyeView", "notifyCardContent, the context is invalid");
        } else {
            b(this.n.get(1));
        }
    }

    public void setCurrentSelected(String str) {
        if (CollectionUtils.isEmpty(this.n)) {
            LogUtil.d("ChartEyeView", "setCurrentSelected ParentViewList is null");
            return;
        }
        LogUtil.e("ChartEyeView", "setCurrentSelected selectedType is ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("ChartEyeView", "setCurrentSelected selectedType is null");
            this.m.setSelectIndex(this.n.get(0));
        } else {
            for (int i = 0; i < this.n.size(); i++) {
                if (str.equals(this.n.get(i).getType())) {
                    this.m.setSelectIndex(this.n.get(i));
                }
            }
        }
    }

    public void c(String str) {
        this.m = null;
        removeAllViews();
        e(str);
    }

    public void b() {
        removeAllViews();
        h();
    }

    public void a(int i) {
        LogUtil.a("ChartEyeView", "showSwitchLabelGuide() enter");
        boolean z = false;
        boolean zEquals = String.valueOf(false).equals(uvz.d(this.e, "IS_FIRST_IN_WEEK_OR_MONTH"));
        this.i = !zEquals;
        DataInfos dataInfos = this.d;
        if (dataInfos == null) {
            LogUtil.d("ChartEyeView", "showSwitchLabelGuide() failed: mDataInfos is null!");
            return;
        }
        if (!zEquals && ((i == 1 && dataInfos.isWeekData()) || (i == 2 && this.d.isMonthData()))) {
            z = true;
        }
        if (this.g && z) {
            this.n.get(1).post(new Runnable() { // from class: vfd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51025a.d();
                }
            });
        } else {
            LogUtil.a("ChartEyeView", "switchLabelGuide pop hasShown or don't need show");
        }
    }

    public /* synthetic */ void d() {
        j();
        g();
        a();
    }

    public void c() {
        PopupWindow popupWindow = this.k;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.k.dismiss();
    }

    private void j() {
        View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.blood_sugar_label_switching_guide, (ViewGroup) null);
        if (LanguageUtil.ba(this.e)) {
            viewInflate.setBackgroundResource(R.drawable.blood_sugar_label_switching_guide_mirror);
        } else {
            viewInflate.setBackgroundResource(R.drawable.blood_sugar_label_switching_guide);
        }
        PopupWindow popupWindow = new PopupWindow(viewInflate, qrs.d(this.e, 220.0f), -2, false);
        this.k = popupWindow;
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        this.k.setSoftInputMode(16);
        this.k.setOutsideTouchable(false);
        this.k.setClippingEnabled(true);
        viewInflate.findViewById(R.id.blood_sugar_label_switching_guide_content).setOnClickListener(new View.OnClickListener() { // from class: vez
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51015c.e(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        uvz.d(this.e, "IS_FIRST_IN_WEEK_OR_MONTH", String.valueOf(false));
        this.i = false;
        this.k.dismiss();
    }

    public void a() {
        Integer num = (Integer) wqq.a("sub_tab_bottom_index_y", Integer.class);
        Integer num2 = (Integer) wqq.a("tool_bar_top_index_y", Integer.class);
        if (num == null || num2 == null || this.k == null) {
            LogUtil.d("ChartEyeView", "bottomY or topY or pop is null");
            return;
        }
        if (!this.i) {
            LogUtil.a("ChartEyeView", "popGuide dont need update");
            return;
        }
        int[] iArr = new int[2];
        this.n.get(1).getArrowView().getLocationOnScreen(iArr);
        int iD = iArr[1] + qrs.d(this.e, 32.0f);
        boolean z = iD > num.intValue() && iD + qrs.d(this.e, 64.0f) < num2.intValue();
        if (!this.k.isShowing() && z) {
            g();
        } else {
            if (!this.k.isShowing() || z) {
                return;
            }
            this.k.dismiss();
        }
    }

    private void g() {
        int i;
        int iD = qrs.d(this.e, 24.0f);
        int iD2 = qrs.d(this.e, 220.0f);
        if (LanguageUtil.ba(this.e)) {
            i = (-iD) / 2;
        } else {
            i = ((iD * 3) / 2) + (-iD2);
        }
        int iD3 = qrs.d(this.e, 8.0f);
        this.k.showAsDropDown(this.n.get(1).getArrowView(), i, iD3);
    }

    private void h() {
        Utils.init(this.e);
        this.f = qrs.ab(this.e);
        this.j = qrs.af(this.e);
        e("");
    }

    private ArrayList<String> getStringList() {
        ArrayList<String> arrayList = new ArrayList<>(7);
        Resources resources = getResources();
        arrayList.add(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_fingertips_desc));
        arrayList.add(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_limosis));
        arrayList.add(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_meal));
        arrayList.add(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_meal));
        arrayList.add(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_after_meal_difference));
        arrayList.add(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_sleep_blood_glucose));
        arrayList.add(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_night_blood_glucose));
        return arrayList;
    }

    private ArrayList<String> getFingerList() {
        ArrayList<String> arrayList = new ArrayList<>(7);
        Resources resources = getResources();
        arrayList.add(getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_fingertip));
        arrayList.add(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_limosis));
        arrayList.add(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_meal));
        arrayList.add(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_meal));
        arrayList.add(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_after_meal_difference));
        arrayList.add(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_sleep_blood_glucose));
        arrayList.add(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_night_blood_glucose));
        return arrayList;
    }

    private List<ScrollChartParentView> getFingerParentViewList() {
        ScrollChartParentView scrollChartParentView;
        LogUtil.e("ChartEyeView", "getFingerParentViewList init view.");
        this.n = new ArrayList(16);
        for (int i = 0; i < getFingerList().size(); i++) {
            switch (i) {
                case 0:
                    scrollChartParentView = new ScrollChartParentView(this.e, getFingerList().get(i), "BLOOD_SUGAR_FINGER_TIP", getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_fingertips_desc), "BLOOD_SUGAR_FINGER_TIP");
                    break;
                case 1:
                    scrollChartParentView = new ScrollChartParentView(this.e, getFingerList().get(i), "BLOOD_SUGAR_LIMOSIS", "", "BLOOD_SUGAR_FINGER_TIP");
                    break;
                case 2:
                    scrollChartParentView = new ScrollChartParentView(this.e, getFingerList().get(i), "BLOOD_SUGAR_BEFORE_MEAL", "", "BLOOD_SUGAR_FINGER_TIP");
                    break;
                case 3:
                    scrollChartParentView = new ScrollChartParentView(this.e, getFingerList().get(i), "BLOOD_SUGAR_AFTER_MEAL", "", "BLOOD_SUGAR_FINGER_TIP");
                    break;
                case 4:
                    scrollChartParentView = new ScrollChartParentView(this.e, getFingerList().get(i), "BLOOD_SUGAR_BEFORE_AFTER_MEAL_DIFFERENCE", "", "BLOOD_SUGAR_FINGER_TIP");
                    break;
                case 5:
                    scrollChartParentView = new ScrollChartParentView(this.e, getFingerList().get(i), "BLOOD_SUGAR_BEFORE_SLEEP_BlOOD_GLUCOSE", "", "BLOOD_SUGAR_FINGER_TIP");
                    break;
                case 6:
                    scrollChartParentView = new ScrollChartParentView(this.e, getFingerList().get(i), "BLOOD_SUGAR_NIGHT_BLOOD_GLUGLUCOSE", "", "BLOOD_SUGAR_FINGER_TIP");
                    break;
                default:
                    scrollChartParentView = null;
                    break;
            }
            if (scrollChartParentView != null) {
                this.n.add(scrollChartParentView);
            }
        }
        return this.n;
    }

    private List<ScrollChartParentView> getParentViewList() {
        LogUtil.e("ChartEyeView", "getParentViewList init view.");
        this.n = new ArrayList(16);
        ScrollChartParentView scrollChartParentView = new ScrollChartParentView(this.e, this.f28206a[0], "BLOOD_SUGAR_CONTINUE", "", "BLOOD_SUGAR_CONTINUE");
        scrollChartParentView.getArrowView().setVisibility(8);
        ScrollChartParentView scrollChartParentView2 = new ScrollChartParentView(this.e, this.f28206a[1], "BLOOD_SUGAR_FINGER_TIP", getStringList().get(0), "BLOOD_SUGAR_CONTINUE");
        scrollChartParentView2.getDataView().setVisibility(0);
        this.n.add(scrollChartParentView);
        this.n.add(scrollChartParentView2);
        b(scrollChartParentView2);
        return this.n;
    }

    private void b(final ScrollChartParentView scrollChartParentView) {
        LogUtil.e("ChartEyeView", "initPartCard init card ViewType is ", Integer.valueOf(getViewType()));
        scrollChartParentView.getDataView().setVisibility(0);
        if (scrollChartParentView.getArrowView() == null) {
            LogUtil.d("ChartEyeView", "arrowView is null");
        } else if (getViewType() == 0) {
            scrollChartParentView.getArrowView().setVisibility(8);
        } else {
            scrollChartParentView.getArrowView().setVisibility(0);
            scrollChartParentView.getArrowView().setOnClickListener(new View.OnClickListener() { // from class: vfc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.a(scrollChartParentView, view);
                }
            });
        }
    }

    public /* synthetic */ void a(ScrollChartParentView scrollChartParentView, View view) {
        MultiViewDataObserverView multiViewDataObserverView = this.m;
        if (multiViewDataObserverView == null) {
            LogUtil.d("ChartEyeView", "initPartCard mMultiViewDataObserverView is null");
            return;
        }
        LogUtil.e("ChartEyeView", "initPartCard getSelectedType is ", multiViewDataObserverView.getSelectedType());
        if ("BLOOD_SUGAR_CONTINUE".equals(this.m.getSelectedType())) {
            this.m.setSelectIndex(scrollChartParentView);
        }
        PopViewList popViewList = new PopViewList(this.e, scrollChartParentView, getStringList(), 0);
        this.o = popViewList;
        e(popViewList);
    }

    private void e(PopViewList popViewList) {
        popViewList.b(new PopViewList.PopViewClickListener() { // from class: vfa
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public final void setOnClick(int i) {
                this.d.c(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(final int i) {
        List<ScrollChartParentView> list = this.n;
        if (list == null) {
            LogUtil.d("ChartEyeView", "mScrollChartParentViewList is null");
        } else {
            final ScrollChartParentView scrollChartParentView = list.get(1);
            post(new Runnable() { // from class: vfe
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51026a.a(i, scrollChartParentView);
                }
            });
        }
    }

    public /* synthetic */ void a(int i, ScrollChartParentView scrollChartParentView) {
        if (this.e == null) {
            LogUtil.d("ChartEyeView", "notifyCardContent, the context is invalid");
            return;
        }
        switch (i) {
            case 0:
                scrollChartParentView.setType("BLOOD_SUGAR_FINGER_TIP");
                scrollChartParentView.c(getStringList().get(0));
                break;
            case 1:
                scrollChartParentView.setType("BLOOD_SUGAR_LIMOSIS");
                scrollChartParentView.c(getStringList().get(1));
                break;
            case 2:
                scrollChartParentView.setType("BLOOD_SUGAR_BEFORE_MEAL");
                scrollChartParentView.c(getStringList().get(2));
                break;
            case 3:
                scrollChartParentView.setType("BLOOD_SUGAR_AFTER_MEAL");
                scrollChartParentView.c(getStringList().get(3));
                break;
            case 4:
                scrollChartParentView.setType("BLOOD_SUGAR_BEFORE_AFTER_MEAL_DIFFERENCE");
                scrollChartParentView.c(getStringList().get(4));
                break;
            case 5:
                scrollChartParentView.setType("BLOOD_SUGAR_BEFORE_SLEEP_BlOOD_GLUCOSE");
                scrollChartParentView.c(getStringList().get(5));
                break;
            case 6:
                scrollChartParentView.setType("BLOOD_SUGAR_NIGHT_BLOOD_GLUGLUCOSE");
                scrollChartParentView.c(getStringList().get(6));
                break;
        }
        this.m.setSelectIndex(scrollChartParentView);
        b(scrollChartParentView);
    }

    private int getMargin() {
        Context context = this.e;
        if (context == null) {
            LogUtil.d("ChartEyeView", "getMargin() mContext is null.");
            return 0;
        }
        return context.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
    }

    private int getGutter() {
        return qqp.b(this.e);
    }

    private int getNormalWidth() {
        if (this.e == null) {
            LogUtil.d("ChartEyeView", "getNormalWidth() mContext is null.");
            return MachineControlPointResponse.OP_CODE_EXTENSION_SET_DYNAMIC_ENERGY;
        }
        int iIntValue = ((Integer) BaseActivity.getSafeRegionWidth().first).intValue();
        int iD = qqv.d(this.e);
        if (this.f) {
            iD /= 2;
        }
        return qqp.d(this.e, ((iD - ((getMargin() + iIntValue) * 2)) - getGutter()) / 2);
    }

    private int getCardWidth() {
        int margin = getMargin();
        int gutter = getGutter();
        return (!this.j || this.f) ? (int) Utils.convertDpToPixel(this.f28208c) : ((((ien.b(this.e) - (margin * 2)) - (gutter * 7)) / 8) * 2) + gutter;
    }

    private void e(String str) {
        if (!TextUtils.isEmpty(this.f28207b) && "BLOOD_SUGAR_FINGER_TIP".equals(this.f28207b)) {
            this.m = new MultiViewDataObserverView(this.e, true);
            this.f28208c = 154;
            getFingerParentViewList();
        } else {
            this.m = new MultiViewDataObserverView(this.e, false);
            this.f28208c = getNormalWidth();
            getParentViewList();
        }
        LogUtil.e("ChartEyeView", "mScrollChartParentViewList size is ", Integer.valueOf(this.n.size()));
        this.m.setDefaultColor(R.color.textColorSecondary);
        this.m.setDefaultBackground(R.drawable.background_charteye);
        this.m.setSelectColor(R.color.textColorPrimaryInverse);
        this.m.setSelectBackground(R.drawable.bakground_charteye_select);
        this.m.b().setMinimumWidth(getGutter());
        this.m.a().setMinimumWidth(getMargin());
        LogUtil.e("ChartEyeView", "getGutter() ", Integer.valueOf(getGutter()), " getMargin() ", Integer.valueOf(getMargin()), " getHeight() ", Integer.valueOf(this.m.getHeight()));
        this.m.setCardWidth(getCardWidth());
        this.m.a(this.n);
        setCurrentSelected(str);
        MultiViewDataObserverView.OnSelectListener onSelectListener = this.h;
        if (onSelectListener != null) {
            this.m.setListener(onSelectListener);
        }
        addView(this.m, -1, -2);
    }

    public void setListener(MultiViewDataObserverView.OnSelectListener onSelectListener) {
        MultiViewDataObserverView multiViewDataObserverView;
        this.h = onSelectListener;
        if (onSelectListener == null || (multiViewDataObserverView = this.m) == null) {
            return;
        }
        multiViewDataObserverView.setListener(onSelectListener);
    }

    public int getViewType() {
        return this.l;
    }

    public void setViewType(int i) {
        this.l = i;
    }

    public void setDataInfos(DataInfos dataInfos) {
        this.d = dataInfos;
    }

    public void setIsNeedGuide(boolean z) {
        this.g = z;
    }

    public String getCardType() {
        return this.f28207b;
    }

    public void setCardType(String str) {
        this.f28207b = str;
    }
}
