package com.huawei.ui.commonui.popupview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.njy;
import defpackage.qop;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class PopViewList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f23791a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f23792c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f23793b;
    private ArrayList<String> d = new ArrayList<>();
    private Context e;
    private int f;
    private PopViewClickListener g;
    private c h;
    private qop i;
    private ListView j;

    public interface PopViewClickListener {
        void setOnClick(int i);
    }

    public PopViewList(Context context, View view, ArrayList<String> arrayList) {
        a(context, arrayList, view, 17);
    }

    public PopViewList(Context context, View view, ArrayList<String> arrayList, Drawable drawable, int i) {
        this.f23793b = drawable;
        this.f = i;
        a(context, arrayList, view, 17);
    }

    public PopViewList(Context context, View view, ArrayList<String> arrayList, int i) {
        a(context, arrayList, view, i);
    }

    public PopViewList(Context context, View view, ArrayList<String> arrayList, boolean z, boolean z2) {
        a(context, arrayList, view, 17);
        d(z);
        b(z2);
    }

    private void a(Context context, ArrayList<String> arrayList, View view, int i) {
        this.e = context;
        this.d.addAll(arrayList);
        e();
        b();
        qop qopVar = this.i;
        if (qopVar == null) {
            ReleaseLogUtil.d("SPORT_ENTRANCE_POP_VIEW", "init mPopView is null");
        } else {
            qopVar.e(view, i);
        }
    }

    private static void d(boolean z) {
        f23791a = z;
    }

    private static void b(boolean z) {
        f23792c = z;
    }

    private void e() {
        LogUtil.a("SPORT_ENTRANCE_POP_VIEW", "initSportEntrancePopView");
        View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.list_pop_window, (ViewGroup) null);
        ListView listView = (ListView) qsp.a(viewInflate, R.id.list_pop_window_tab);
        this.j = listView;
        listView.setOverScrollMode(2);
        this.i = new qop(this.e, viewInflate);
    }

    private int b(ListView listView) {
        if (listView == null || listView.getAdapter() == null) {
            return 0;
        }
        int count = listView.getAdapter().getCount();
        int iB = 0;
        for (int i = 0; i < count; i++) {
            View view = listView.getAdapter().getView(i, null, listView);
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                if (view.getMeasuredWidth() > iB) {
                    iB = view.getMeasuredWidth();
                }
            }
        }
        if (this.f23793b == null) {
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            if (((Integer) safeRegionWidth.first).intValue() > 0 || ((Integer) safeRegionWidth.second).intValue() > 0) {
                iB += qre.b(R.dimen.health_common_16dp);
            }
        }
        return d(iB);
    }

    private void b() {
        c cVar = new c(this.e, this.d, this.f23793b, this.f);
        this.h = cVar;
        this.j.setAdapter((ListAdapter) cVar);
        this.j.setLayoutParams(new LinearLayout.LayoutParams(b(this.j), -2));
        this.j.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.ui.commonui.popupview.PopViewList.4
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (i >= 0) {
                    if (!PopViewList.a(i, PopViewList.this.d, PopViewList.this.e)) {
                        if (PopViewList.this.g != null) {
                            PopViewList.this.g.setOnClick(i);
                        }
                        PopViewList.this.i.e();
                        return;
                    }
                    LogUtil.a("SPORT_ENTRANCE_POP_VIEW", "isIgnoreByLegal: legal ");
                    return;
                }
                LogUtil.j("SPORT_ENTRANCE_POP_VIEW", "position is error");
            }
        });
    }

    int d(int i) {
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.e, 10);
        Point pointL = qrs.l();
        healthColumnSystem.d(this.e, pointL.x, pointL.y, qrs.j(this.e));
        int iE = healthColumnSystem.e();
        return i > iE ? iE : Math.max(i, healthColumnSystem.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a(int i, ArrayList<String> arrayList, Context context) {
        if (i < arrayList.size() && arrayList.get(i).equals(context.getString(R.string.IDS_setting_wearhome_legal_information))) {
            return !a();
        }
        return false;
    }

    public void b(String str, int i) {
        c cVar = this.h;
        if (cVar != null) {
            cVar.e(str, i);
        }
    }

    public void d() {
        this.i.e();
    }

    public boolean c() {
        return this.i.a();
    }

    private static boolean a() {
        return f23792c && f23791a;
    }

    static class c extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ArrayList<String> f23795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList<String> f23796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Drawable f23797c;
        private Context d;
        private int e;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        c(Context context, ArrayList<String> arrayList, Drawable drawable, int i) {
            this.d = context;
            this.f23797c = drawable;
            this.e = i;
            int iIndexOf = arrayList != null ? arrayList.indexOf(File.separator) : -1;
            if (iIndexOf == -1) {
                this.f23795a = arrayList == null ? new ArrayList<>(10) : arrayList;
                return;
            }
            this.f23795a = new ArrayList<>(10);
            this.f23796b = new ArrayList<>(10);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 < iIndexOf) {
                    this.f23795a.add(arrayList.get(i2));
                } else if (i2 > iIndexOf) {
                    this.f23796b.add(arrayList.get(i2));
                } else {
                    LogUtil.d("SPORT_ENTRANCE_POP_VIEW", "PopWindowItemAdapter no deal branch.");
                }
            }
        }

        void e(String str, int i) {
            ArrayList<String> arrayList;
            if (i == 1) {
                ArrayList<String> arrayList2 = this.f23796b;
                if (arrayList2 != null && !arrayList2.contains(str)) {
                    this.f23796b.add(str);
                }
            } else if (i == 2 && (arrayList = this.f23796b) != null && arrayList.contains(str)) {
                this.f23796b.remove(str);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f23795a.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (njy.c(this.f23795a, i)) {
                return null;
            }
            return this.f23795a.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.list_pop_window_item, (ViewGroup) null);
            qsp.a(viewInflate, R.id.list_popup_window_item).setBackground(qre.d(this.d, R.drawable.pop_item_bg));
            HealthTextView healthTextView = (HealthTextView) qsp.a(viewInflate, R.id.list_popup_window_item_text);
            if (njy.c(this.f23795a, i)) {
                String str = this.f23795a.get(i);
                healthTextView.setText(str);
                b(i, healthTextView);
                HealthImageView healthImageView = (HealthImageView) qsp.a(viewInflate, R.id.img_sport_setting_red_point);
                ArrayList<String> arrayList = this.f23796b;
                int i2 = 8;
                healthImageView.setVisibility((arrayList == null || !arrayList.contains(str)) ? 8 : 0);
                HealthImageView healthImageView2 = (HealthImageView) qsp.a(viewInflate, R.id.list_popup_window_item_image);
                healthImageView2.setImageDrawable(this.f23797c);
                if (this.f23797c != null && i == this.e) {
                    i2 = 0;
                }
                healthImageView2.setVisibility(i2);
            }
            return viewInflate;
        }

        private void b(int i, HealthTextView healthTextView) {
            if (PopViewList.a(i, this.f23795a, this.d)) {
                healthTextView.setTextColor(qre.e(this.d, R.color.legal_un_clickable_color));
            } else {
                healthTextView.setTextColor(qre.e(this.d, R.color.textColorPrimary));
            }
        }
    }

    public void b(PopViewClickListener popViewClickListener) {
        this.g = popViewClickListener;
    }
}
