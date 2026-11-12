package com.huawei.basichealthmodel.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.basichealthmodel.R;
import com.huawei.basichealthmodel.callback.WeekCloverItemClickListener;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ucd.cloveranimation.CloverView;
import com.huawei.ui.commonui.view.Clover;
import defpackage.byu;
import defpackage.caq;
import defpackage.cbg;
import defpackage.njy;
import defpackage.qre;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class HealthWeekCloverView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SparseArray<Clover> f5376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeekCloverItemClickListener f5377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5378c;
    private SparseIntArray e;

    public HealthWeekCloverView(Context context) {
        this(context, null);
    }

    public HealthWeekCloverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public HealthWeekCloverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new SparseIntArray();
        this.f5376a = new SparseArray<>();
        c();
    }

    public void setWeekCloverItemClickListener(WeekCloverItemClickListener weekCloverItemClickListener) {
        this.f5377b = weekCloverItemClickListener;
    }

    public void setPageNumber(int i) {
        this.e.clear();
        this.e = cbg.c(i);
    }

    private void c() {
        View viewA = qre.a(BaseApplication.b(), R.layout.item_week_calendar_clover_view, this);
        if (viewA == null) {
            LogUtil.j("HL_HealthWeekCloverView", "initView view is null");
            return;
        }
        b(viewA);
        this.e = cbg.c(0);
        this.f5378c = byu.c().a(DateFormatUtil.a(System.currentTimeMillis()));
    }

    private void b(View view) {
        Clover clover = (Clover) view.findViewById(R.id.item_week_clover_monday);
        Clover clover2 = (Clover) view.findViewById(R.id.item_week_clover_thuesday);
        Clover clover3 = (Clover) view.findViewById(R.id.item_week_clover_wedesday);
        Clover clover4 = (Clover) view.findViewById(R.id.item_week_clover_thursday);
        Clover clover5 = (Clover) view.findViewById(R.id.item_week_clover_friday);
        Clover clover6 = (Clover) view.findViewById(R.id.item_week_clover_saturday);
        Clover clover7 = (Clover) view.findViewById(R.id.item_week_clover_sunday);
        clover.setPetalClickListener(new a(2));
        clover2.setPetalClickListener(new a(3));
        clover3.setPetalClickListener(new a(4));
        clover4.setPetalClickListener(new a(5));
        clover5.setPetalClickListener(new a(6));
        clover6.setPetalClickListener(new a(7));
        clover7.setPetalClickListener(new a(1));
        this.f5376a.put(2, clover);
        this.f5376a.put(3, clover2);
        this.f5376a.put(4, clover3);
        this.f5376a.put(5, clover4);
        this.f5376a.put(6, clover5);
        this.f5376a.put(7, clover6);
        this.f5376a.put(1, clover7);
    }

    public void setCloverToDateData(SparseIntArray sparseIntArray) {
        this.e = sparseIntArray;
    }

    public void setCloverMapData(Map<Integer, List<caq>> map) {
        b(map);
    }

    private void e(Clover clover, List<caq> list) {
        if (clover == null || njy.e(list)) {
            LogUtil.j("HL_HealthWeekCloverView", "notifyItemView clover = null or list is empty");
            return;
        }
        float fE = 0.0f;
        float fE2 = 0.0f;
        float fE3 = 0.0f;
        int iA = 0;
        for (int i = 0; i < list.size(); i++) {
            caq caqVar = list.get(i);
            if (caqVar != null) {
                iA = caqVar.a();
                int iC = caqVar.c();
                if (iC == 1) {
                    fE3 = caqVar.e();
                } else if (iC == 2) {
                    fE2 = caqVar.e();
                } else if (iC != 3) {
                    LogUtil.j("HL_HealthWeekCloverView", "notifyItemView error dayTaskStatus");
                } else {
                    fE = caqVar.e();
                }
            }
        }
        if (iA > 0) {
            clover.b(iA == 4);
            clover.setAllFull(true);
        } else {
            clover.setAllFull(false);
        }
        clover.setClover(fE3, fE, fE2);
    }

    public void b(List<caq> list) {
        int iA = byu.c().a(DateFormatUtil.a(System.currentTimeMillis()));
        LogUtil.a("HL_HealthWeekCloverView", "notifyItemView nowDay = ", Integer.valueOf(iA));
        if (this.e.get(iA) <= 0) {
            LogUtil.j("HL_HealthWeekCloverView", "notifyItemView mCloverToDate not contains nowDay");
            return;
        }
        int i = this.e.get(iA);
        Clover clover = this.f5376a.get(i);
        LogUtil.a("HL_HealthWeekCloverView", "notifyItemView notify nowDay index = ", Integer.valueOf(i));
        e(clover, list);
    }

    private void b(Map<Integer, List<caq>> map) {
        if (this.e == null || map == null || map.size() == 0) {
            LogUtil.a("HL_HealthWeekCloverView", "notifyMapDataChange map data is null resetEmptyClover");
            d();
            return;
        }
        LogUtil.a("HL_HealthWeekCloverView", "notifyMapDataChange cloverDataMap ", map, " mCloverToDate ", this.e);
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.e.keyAt(i);
            Clover clover = this.f5376a.get(this.e.get(iKeyAt));
            if (clover != null) {
                if (e(iKeyAt)) {
                    if (map.containsKey(Integer.valueOf(iKeyAt))) {
                        List<caq> list = map.get(Integer.valueOf(iKeyAt));
                        LogUtil.a("HL_HealthWeekCloverView", "notifyMapDataChange the date is effective date and begin notifyItemView = ", Integer.valueOf(iKeyAt));
                        e(clover, list);
                    } else {
                        clover.setClover(0.0f, 0.0f, 0.0f);
                    }
                } else {
                    clover.setInvalid(true);
                }
            }
        }
    }

    private void d() {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray == null) {
            return;
        }
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.e.keyAt(i);
            Clover clover = this.f5376a.get(this.e.get(iKeyAt));
            if (clover != null) {
                if (e(iKeyAt)) {
                    clover.setClover(0.0f, 0.0f, 0.0f);
                } else {
                    clover.setInvalid(true);
                }
            }
        }
    }

    public void e() {
        SparseArray<Clover> sparseArray = this.f5376a;
        if (sparseArray == null) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            SparseArray<Clover> sparseArray2 = this.f5376a;
            Clover clover = sparseArray2.get(sparseArray2.keyAt(i));
            if (clover != null) {
                clover.setClover(0.0f, 0.0f, 0.0f);
            }
        }
    }

    private boolean e(int i) {
        int iA = this.f5378c;
        if (iA == 0) {
            iA = DateFormatUtil.a(System.currentTimeMillis());
        }
        int iR = cbg.r();
        if (iR == 0) {
            iR = iA;
        }
        return i >= iR && i <= iA;
    }

    static class a implements CloverView.OnPetalClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<HealthWeekCloverView> f5379b;
        private final int d;

        private a(HealthWeekCloverView healthWeekCloverView, int i) {
            this.f5379b = new WeakReference<>(healthWeekCloverView);
            this.d = i;
        }

        private void b() {
            HealthWeekCloverView healthWeekCloverView = this.f5379b.get();
            if (healthWeekCloverView != null) {
                WeekCloverItemClickListener weekCloverItemClickListener = healthWeekCloverView.f5377b;
                if (weekCloverItemClickListener == null) {
                    LogUtil.j("HL_HealthWeekCloverView", "onCloverItemClick listener is null");
                    return;
                } else {
                    weekCloverItemClickListener.onCloverItemClick(this.d);
                    return;
                }
            }
            LogUtil.j("HL_HealthWeekCloverView", "onCloverItemClick weekCloverView is null");
        }

        @Override // com.huawei.ucd.cloveranimation.CloverView.OnPetalClickListener
        public void onTopClick() {
            b();
        }

        @Override // com.huawei.ucd.cloveranimation.CloverView.OnPetalClickListener
        public void onLeftClick() {
            b();
        }

        @Override // com.huawei.ucd.cloveranimation.CloverView.OnPetalClickListener
        public void onRightClick() {
            b();
        }
    }
}
