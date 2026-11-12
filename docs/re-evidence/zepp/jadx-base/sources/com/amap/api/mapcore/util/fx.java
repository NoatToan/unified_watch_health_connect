package com.amap.api.mapcore.util;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
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
import com.huami.watch.hmwatchmanager.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fx extends com.amap.api.offlineservice.a implements TextWatcher, View.OnTouchListener, AbsListView.OnScrollListener, OfflineMapManager.OfflineLoadedListener, OfflineMapManager.OfflineMapDownloadListener {
    private ImageView b;
    private RelativeLayout c;
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
    private fr p;
    private fq r;
    private fs s;
    private ft x;
    private List<OfflineMapProvince> o = new ArrayList();
    private OfflineMapManager q = null;
    private boolean t = true;
    private boolean u = true;
    private int v = -1;
    private long w = 0;
    private boolean y = true;

    private void f() {
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
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.amap.api.offlineservice.a
    public final RelativeLayout d() {
        if (this.c == null) {
            this.c = (RelativeLayout) fz.a(this.a, R.array.avatar_of_scale_res_id);
        }
        return this.c;
    }

    @Override // com.amap.api.offlineservice.a
    public final void e() {
        this.q.destroy();
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onCheckUpdate(boolean z, String str) {
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onDownload(int i, int i2, String str) {
        if (i == 101) {
            try {
                Toast.makeText(this.a, "网络异常", 0).show();
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
        fr frVar = this.p;
        if (frVar != null) {
            frVar.notifyDataSetChanged();
        }
        fq fqVar = this.r;
        if (fqVar != null) {
            fqVar.notifyDataSetChanged();
        }
        fs fsVar = this.s;
        if (fsVar != null) {
            fsVar.notifyDataSetChanged();
        }
        this.v = i;
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onRemove(boolean z, String str, String str2) {
        fq fqVar = this.r;
        if (fqVar != null) {
            fqVar.b();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 2) {
            this.y = false;
        } else {
            this.y = true;
        }
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
            Iterator<OfflineMapProvince> it2 = this.o.iterator();
            while (it2.hasNext()) {
                arrayList2.addAll(it2.next().getCityList());
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
        if (arrayList.size() <= 0) {
            Toast.makeText(this.a, "未找到相关城市", 0).show();
            return;
        }
        a(true);
        Collections.sort(arrayList, new Comparator<OfflineMapCity>() { // from class: com.amap.api.mapcore.util.fx.2
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(OfflineMapCity offlineMapCity2, OfflineMapCity offlineMapCity3) {
                char[] charArray = offlineMapCity2.getJianpin().toCharArray();
                char[] charArray2 = offlineMapCity3.getJianpin().toCharArray();
                return (charArray[0] >= charArray2[0] && charArray[1] >= charArray2[1]) ? 0 : 1;
            }
        });
        fs fsVar = this.s;
        if (fsVar != null) {
            fsVar.a(arrayList);
            this.s.notifyDataSetChanged();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AutoCompleteTextView autoCompleteTextView = this.i;
        if (autoCompleteTextView != null && autoCompleteTextView.isFocused()) {
            this.i.clearFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService("input_method");
            if (inputMethodManager != null ? inputMethodManager.isActive() : false) {
                inputMethodManager.hideSoftInputFromWindow(this.i.getWindowToken(), 2);
            }
        }
        if (view.getId() == R.dimen.abc_config_prefDialogWidth) {
            try {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.m.getLayoutParams();
                layoutParams.leftMargin = a(18.0f);
                this.m.setLayoutParams(layoutParams);
                this.i.setPadding(a(30.0f), 0, 0, 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineLoadedListener
    public final void onVerifyComplete() {
        f();
        fs fsVar = new fs(this.q, this.a);
        this.s = fsVar;
        this.e.setAdapter((ListAdapter) fsVar);
        fq fqVar = new fq(this.a, this, this.q, this.o);
        this.r = fqVar;
        this.d.setAdapter(fqVar);
        this.r.notifyDataSetChanged();
    }

    @Override // com.amap.api.offlineservice.a
    public final void a(View view) {
        try {
            int id = view.getId();
            if (id == R.dimen.abc_button_padding_horizontal_material) {
                this.a.closeScr();
                return;
            }
            if (id == R.dimen.DetailInfoUnitTextSize) {
                if (this.u) {
                    this.d.setVisibility(8);
                    this.g.setBackgroundResource(R.animator.fragment_close_enter);
                    this.u = false;
                    return;
                } else {
                    this.d.setVisibility(0);
                    this.g.setBackgroundResource(R.animator.anim_headset_bind_searching);
                    this.u = true;
                    return;
                }
            }
            if (id == R.dimen.abc_action_bar_default_padding_start_material) {
                if (this.t) {
                    this.p.b();
                    this.h.setBackgroundResource(R.animator.fragment_close_enter);
                    this.t = false;
                } else {
                    this.p.a();
                    this.h.setBackgroundResource(R.animator.anim_headset_bind_searching);
                    this.t = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.amap.api.offlineservice.a
    public final void b() {
        View viewA = fz.a(this.a, R.array.alarm_repeat_titles);
        DownLoadExpandListView downLoadExpandListView = (DownLoadExpandListView) viewA.findViewById(R.dimen.abc_action_bar_default_height_material);
        this.d = downLoadExpandListView;
        downLoadExpandListView.setOnTouchListener(this);
        this.j = (RelativeLayout) viewA.findViewById(R.dimen.DetailInfoUnitTextSize);
        this.g = (ImageView) viewA.findViewById(R.dimen.abc_action_bar_content_inset_with_nav);
        this.j.setOnClickListener(this.a);
        this.k = (RelativeLayout) viewA.findViewById(R.dimen.abc_action_bar_default_padding_start_material);
        this.h = (ImageView) viewA.findViewById(R.dimen.abc_action_bar_elevation_material);
        this.k.setOnClickListener(this.a);
        this.n = (RelativeLayout) viewA.findViewById(R.dimen.abc_action_bar_default_padding_end_material);
        ImageView imageView = (ImageView) this.c.findViewById(R.dimen.abc_button_padding_horizontal_material);
        this.b = imageView;
        imageView.setOnClickListener(this.a);
        this.m = (ImageView) this.c.findViewById(R.dimen.abc_cascading_menus_min_smallest_width);
        ImageView imageView2 = (ImageView) this.c.findViewById(R.dimen.abc_control_corner_material);
        this.l = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.amap.api.mapcore.util.fx.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    fx.this.i.setText("");
                    fx.this.l.setVisibility(8);
                    fx.this.a(false);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) fx.this.m.getLayoutParams();
                    layoutParams.leftMargin = fx.this.a(95.0f);
                    fx.this.m.setLayoutParams(layoutParams);
                    fx.this.i.setPadding(fx.this.a(105.0f), 0, 0, 0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.c.findViewById(R.dimen.abc_control_inset_material).setOnTouchListener(this);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.c.findViewById(R.dimen.abc_config_prefDialogWidth);
        this.i = autoCompleteTextView;
        autoCompleteTextView.addTextChangedListener(this);
        this.i.setOnTouchListener(this);
        this.e = (ListView) this.c.findViewById(R.dimen.abc_dialog_corner_radius_material);
        ExpandableListView expandableListView = (ExpandableListView) this.c.findViewById(R.dimen.abc_control_padding_material);
        this.f = expandableListView;
        expandableListView.addHeaderView(viewA);
        this.f.setOnTouchListener(this);
        this.f.setOnScrollListener(this);
        OfflineMapManager offlineMapManager = new OfflineMapManager(this.a, this);
        this.q = offlineMapManager;
        offlineMapManager.setOnOfflineLoadedListener(this);
        f();
        fr frVar = new fr(this.o, this.q, this.a);
        this.p = frVar;
        this.f.setAdapter(frVar);
        this.f.setOnGroupCollapseListener(this.p);
        this.f.setOnGroupExpandListener(this.p);
        this.f.setGroupIndicator(null);
        if (this.t) {
            this.h.setBackgroundResource(R.animator.anim_headset_bind_searching);
            this.f.setVisibility(0);
        } else {
            this.h.setBackgroundResource(R.animator.fragment_close_enter);
            this.f.setVisibility(8);
        }
        if (this.u) {
            this.g.setBackgroundResource(R.animator.anim_headset_bind_searching);
            this.d.setVisibility(0);
        } else {
            this.g.setBackgroundResource(R.animator.fragment_close_enter);
            this.d.setVisibility(8);
        }
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

    public final void a(OfflineMapCity offlineMapCity) {
        try {
            if (this.x == null) {
                this.x = new ft(this.a, this.q);
            }
            this.x.a(offlineMapCity.getState(), offlineMapCity.getCity());
            this.x.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
}
