package com.amap.api.col.p0003sl;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AutoCompleteTextView;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.amap.api.maps.offlinemap.DownLoadExpandListView;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.amap.api.offlineservice.a;
import com.huawei.health.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class fe extends a implements TextWatcher, View.OnTouchListener, AbsListView.OnScrollListener, OfflineMapManager.OfflineLoadedListener, OfflineMapManager.OfflineMapDownloadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f2518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f2519c;
    private DownLoadExpandListView d;
    private ListView e;
    private ExpandableListView f;
    private ImageView g;
    private ImageView h;
    private AutoCompleteTextView i;
    private RelativeLayout j;
    private RelativeLayout k;
    private ImageView l;
    private ImageView m;
    private RelativeLayout n;
    private ey p;
    private ex r;
    private ez s;
    private fa x;
    private List<OfflineMapProvince> o = new ArrayList();
    private OfflineMapManager q = null;
    private boolean t = true;
    private boolean u = true;
    private int v = -1;
    private long w = 0;
    private boolean y = true;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onCheckUpdate(boolean z, String str) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // com.amap.api.offlineservice.a
    public final void b() {
        View viewA = fg.a(this.f3487a, R.plurals._2130903040_res_0x7f030000);
        DownLoadExpandListView downLoadExpandListView = (DownLoadExpandListView) viewA.findViewById(R.layout.abc_action_menu_layout);
        this.d = downLoadExpandListView;
        downLoadExpandListView.setOnTouchListener(this);
        this.j = (RelativeLayout) viewA.findViewById(R.layout.abc_action_bar_title_item);
        this.g = (ImageView) viewA.findViewById(R.layout.abc_action_menu_item_layout);
        this.j.setOnClickListener(this.f3487a);
        this.k = (RelativeLayout) viewA.findViewById(R.layout.abc_action_mode_close_item_material);
        this.h = (ImageView) viewA.findViewById(R.layout.abc_activity_chooser_view);
        this.k.setOnClickListener(this.f3487a);
        this.n = (RelativeLayout) viewA.findViewById(R.layout.abc_action_mode_bar);
        ImageView imageView = (ImageView) this.f2519c.findViewById(R.layout.abc_screen_simple);
        this.f2518b = imageView;
        imageView.setOnClickListener(this.f3487a);
        this.m = (ImageView) this.f2519c.findViewById(R.layout.abc_screen_toolbar);
        ImageView imageView2 = (ImageView) this.f2519c.findViewById(R.layout.abc_search_view);
        this.l = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.amap.api.col.3sl.fe.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    fe.this.i.setText("");
                    fe.this.l.setVisibility(8);
                    fe.this.a(false);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) fe.this.m.getLayoutParams();
                    layoutParams.leftMargin = fe.this.a(95.0f);
                    fe.this.m.setLayoutParams(layoutParams);
                    fe.this.i.setPadding(fe.this.a(105.0f), 0, 0, 0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.f2519c.findViewById(R.layout.abc_select_dialog_material).setOnTouchListener(this);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.f2519c.findViewById(R.layout.abc_search_dropdown_item_icons_2line);
        this.i = autoCompleteTextView;
        autoCompleteTextView.addTextChangedListener(this);
        this.i.setOnTouchListener(this);
        this.e = (ListView) this.f2519c.findViewById(R.layout.achieve_historical_report_expandable_child_item);
        ExpandableListView expandableListView = (ExpandableListView) this.f2519c.findViewById(R.layout.abc_tooltip);
        this.f = expandableListView;
        expandableListView.addHeaderView(viewA);
        this.f.setOnTouchListener(this);
        this.f.setOnScrollListener(this);
        try {
            OfflineMapManager offlineMapManager = new OfflineMapManager(this.f3487a, this);
            this.q = offlineMapManager;
            offlineMapManager.setOnOfflineLoadedListener(this);
        } catch (Exception e) {
            Log.e("OfflineMapPage", "e=".concat(String.valueOf(e)));
        }
        i();
        ey eyVar = new ey(this.o, this.q, this.f3487a);
        this.p = eyVar;
        this.f.setAdapter(eyVar);
        this.f.setOnGroupCollapseListener(this.p);
        this.f.setOnGroupExpandListener(this.p);
        this.f.setGroupIndicator(null);
        if (this.t) {
            this.h.setBackgroundResource(R.string.IDS_hw_app_name);
            this.f.setVisibility(0);
        } else {
            this.h.setBackgroundResource(R.string.ie_scan_miracast_devices_hint);
            this.f.setVisibility(8);
        }
        if (this.u) {
            this.g.setBackgroundResource(R.string.IDS_hw_app_name);
            this.d.setVisibility(0);
        } else {
            this.g.setBackgroundResource(R.string.ie_scan_miracast_devices_hint);
            this.d.setVisibility(8);
        }
    }

    private void f() {
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.m.getLayoutParams();
            layoutParams.leftMargin = a(18.0f);
            this.m.setLayoutParams(layoutParams);
            this.i.setPadding(a(30.0f), 0, 0, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.amap.api.offlineservice.a
    public final void a(View view) {
        try {
            int id = view.getId();
            if (id == R.layout.abc_screen_simple) {
                this.f3487a.closeScr();
                return;
            }
            if (id == R.layout.abc_action_bar_title_item) {
                if (this.u) {
                    this.d.setVisibility(8);
                    this.g.setBackgroundResource(R.string.ie_scan_miracast_devices_hint);
                    this.u = false;
                    return;
                } else {
                    this.d.setVisibility(0);
                    this.g.setBackgroundResource(R.string.IDS_hw_app_name);
                    this.u = true;
                    return;
                }
            }
            if (id == R.layout.abc_action_mode_close_item_material) {
                if (this.t) {
                    this.p.b();
                    this.h.setBackgroundResource(R.string.ie_scan_miracast_devices_hint);
                    this.t = false;
                } else {
                    this.p.a();
                    this.h.setBackgroundResource(R.string.IDS_hw_app_name);
                    this.t = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.amap.api.offlineservice.a
    public final RelativeLayout d() {
        if (this.f2519c == null) {
            this.f2519c = (RelativeLayout) fg.a(this.f3487a, R.plurals._2130903044_res_0x7f030004);
        }
        return this.f2519c;
    }

    @Override // com.amap.api.offlineservice.a
    public final void e() {
        this.q.destroy();
    }

    private void g() {
        i();
        ez ezVar = new ez(this.q, this.f3487a);
        this.s = ezVar;
        this.e.setAdapter((ListAdapter) ezVar);
    }

    private void h() {
        ex exVar = new ex(this.f3487a, this, this.q, this.o);
        this.r = exVar;
        this.d.setAdapter(exVar);
        this.r.notifyDataSetChanged();
    }

    public final void a(OfflineMapCity offlineMapCity) {
        try {
            if (this.x == null) {
                this.x = new fa(this.f3487a, this.q);
            }
            this.x.a(offlineMapCity.getState(), offlineMapCity.getCity());
            this.x.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void i() {
        ArrayList<OfflineMapProvince> offlineMapProvinceList = this.q.getOfflineMapProvinceList();
        this.o.clear();
        this.o.add(null);
        ArrayList<OfflineMapCity> arrayList = new ArrayList<>();
        ArrayList<OfflineMapCity> arrayList2 = new ArrayList<>();
        ArrayList<OfflineMapCity> arrayList3 = new ArrayList<>();
        for (int i = 0; i < offlineMapProvinceList.size(); i++) {
            OfflineMapProvince offlineMapProvince = offlineMapProvinceList.get(i);
            if (offlineMapProvince.getCityList().size() != 1) {
                this.o.add(i + 1, offlineMapProvince);
            } else {
                String provinceName = offlineMapProvince.getProvinceName();
                if (provinceName.contains("香港")) {
                    arrayList2.addAll(offlineMapProvince.getCityList());
                } else if (provinceName.contains("澳门")) {
                    arrayList2.addAll(offlineMapProvince.getCityList());
                } else if (provinceName.contains("全国概要图")) {
                    arrayList3.addAll(0, offlineMapProvince.getCityList());
                } else {
                    arrayList3.addAll(offlineMapProvince.getCityList());
                }
            }
        }
        OfflineMapProvince offlineMapProvince2 = new OfflineMapProvince();
        offlineMapProvince2.setProvinceName("基本功能包+直辖市");
        offlineMapProvince2.setCityList(arrayList3);
        this.o.set(0, offlineMapProvince2);
        OfflineMapProvince offlineMapProvince3 = new OfflineMapProvince();
        offlineMapProvince3.setProvinceName("直辖市");
        offlineMapProvince3.setCityList(arrayList);
        OfflineMapProvince offlineMapProvince4 = new OfflineMapProvince();
        offlineMapProvince4.setProvinceName("港澳");
        offlineMapProvince4.setCityList(arrayList2);
        this.o.add(offlineMapProvince4);
        OfflineMapProvince offlineMapProvince5 = new OfflineMapProvince();
        offlineMapProvince5.setProvinceName("台湾省");
        ArrayList<OfflineMapCity> arrayList4 = new ArrayList<>();
        OfflineMapCity offlineMapCity = new OfflineMapCity();
        offlineMapCity.setCity("暂不支持下载");
        arrayList4.add(offlineMapCity);
        offlineMapProvince5.setCityList(arrayList4);
        this.o.add(offlineMapProvince5);
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onDownload(int i, int i2, String str) {
        if (i == 101) {
            try {
                Toast.makeText(this.f3487a, "网络异常", 0).show();
                this.q.pause();
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (i == 2) {
            this.r.a();
        }
        if (this.v == i) {
            if (System.currentTimeMillis() - this.w > 1200) {
                if (this.y) {
                    this.r.notifyDataSetChanged();
                }
                this.w = System.currentTimeMillis();
                return;
            }
            return;
        }
        ey eyVar = this.p;
        if (eyVar != null) {
            eyVar.notifyDataSetChanged();
        }
        ex exVar = this.r;
        if (exVar != null) {
            exVar.notifyDataSetChanged();
        }
        ez ezVar = this.s;
        if (ezVar != null) {
            ezVar.notifyDataSetChanged();
        }
        this.v = i;
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onRemove(boolean z, String str, String str2) {
        ex exVar = this.r;
        if (exVar != null) {
            exVar.b();
        }
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineLoadedListener
    public final void onVerifyComplete() {
        g();
        h();
    }

    @Override // com.amap.api.offlineservice.a
    public final boolean c() {
        try {
            if (this.e.getVisibility() == 0) {
                this.i.setText("");
                this.l.setVisibility(8);
                a(false);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.c();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        j();
        if (view.getId() != R.layout.abc_search_dropdown_item_icons_2line) {
            return false;
        }
        f();
        return false;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (TextUtils.isEmpty(charSequence)) {
            a(false);
            this.l.setVisibility(8);
            return;
        }
        this.l.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        List<OfflineMapProvince> list = this.o;
        if (list != null && list.size() > 0) {
            ArrayList<OfflineMapCity> arrayList2 = new ArrayList();
            Iterator<OfflineMapProvince> it = this.o.iterator();
            while (it.hasNext()) {
                arrayList2.addAll(it.next().getCityList());
            }
            for (OfflineMapCity offlineMapCity : arrayList2) {
                String city = offlineMapCity.getCity();
                String pinyin = offlineMapCity.getPinyin();
                String jianpin = offlineMapCity.getJianpin();
                if (charSequence.length() == 1) {
                    if (jianpin.startsWith(String.valueOf(charSequence))) {
                        arrayList.add(offlineMapCity);
                    }
                } else if (jianpin.startsWith(String.valueOf(charSequence)) || pinyin.startsWith(String.valueOf(charSequence)) || city.startsWith(String.valueOf(charSequence))) {
                    arrayList.add(offlineMapCity);
                }
            }
        }
        if (arrayList.size() > 0) {
            a(true);
            Collections.sort(arrayList, new Comparator<OfflineMapCity>() { // from class: com.amap.api.col.3sl.fe.2
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(OfflineMapCity offlineMapCity2, OfflineMapCity offlineMapCity3) {
                    return a(offlineMapCity2, offlineMapCity3);
                }

                private static int a(OfflineMapCity offlineMapCity2, OfflineMapCity offlineMapCity3) {
                    char[] charArray = offlineMapCity2.getJianpin().toCharArray();
                    char[] charArray2 = offlineMapCity3.getJianpin().toCharArray();
                    return (charArray[0] >= charArray2[0] && charArray[1] >= charArray2[1]) ? 0 : 1;
                }
            });
            ez ezVar = this.s;
            if (ezVar != null) {
                ezVar.a(arrayList);
                this.s.notifyDataSetChanged();
                return;
            }
            return;
        }
        Toast.makeText(this.f3487a, "未找到相关城市", 0).show();
    }

    public final void a(boolean z) {
        if (z) {
            this.j.setVisibility(8);
            this.k.setVisibility(8);
            this.d.setVisibility(8);
            this.f.setVisibility(8);
            this.n.setVisibility(8);
            this.e.setVisibility(0);
            return;
        }
        this.j.setVisibility(0);
        this.k.setVisibility(0);
        this.n.setVisibility(0);
        this.d.setVisibility(this.u ? 0 : 8);
        this.f.setVisibility(this.t ? 0 : 8);
        this.e.setVisibility(8);
    }

    private void j() {
        AutoCompleteTextView autoCompleteTextView = this.i;
        if (autoCompleteTextView == null || !autoCompleteTextView.isFocused()) {
            return;
        }
        this.i.clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.f3487a.getSystemService("input_method");
        if (inputMethodManager == null || !inputMethodManager.isActive()) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.i.getWindowToken(), 2);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 2) {
            this.y = false;
        } else {
            this.y = true;
        }
    }
}
