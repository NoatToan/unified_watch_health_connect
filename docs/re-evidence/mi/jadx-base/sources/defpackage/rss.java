package defpackage;

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
import com.mi.health.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class rss extends q2s implements TextWatcher, View.OnTouchListener, AbsListView.OnScrollListener, OfflineMapManager.OfflineLoadedListener, OfflineMapManager.OfflineMapDownloadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f32872b;
    public RelativeLayout c;
    public DownLoadExpandListView d;
    public ListView e;
    public ExpandableListView f;
    public ImageView g;
    public ImageView h;
    public AutoCompleteTextView i;
    public RelativeLayout j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RelativeLayout f32873k;
    public ImageView l;
    public ImageView m;
    public RelativeLayout n;
    public eqs p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public bqs f32874r;
    public pqs s;
    public jss x;
    public List<OfflineMapProvince> o = new ArrayList();
    public OfflineMapManager q = null;
    public boolean t = true;
    public boolean u = true;
    public int v = -1;
    public long w = 0;
    public boolean y = true;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            try {
                rss.this.i.setText("");
                rss.this.l.setVisibility(8);
                rss.this.k(false);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) rss.this.m.getLayoutParams();
                layoutParams.leftMargin = rss.this.a(95.0f);
                rss.this.m.setLayoutParams(layoutParams);
                rss.this.i.setPadding(rss.this.a(105.0f), 0, 0, 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class b implements Comparator<OfflineMapCity> {
        public b() {
        }

        public static int a(OfflineMapCity offlineMapCity, OfflineMapCity offlineMapCity2) {
            char[] charArray = offlineMapCity.getJianpin().toCharArray();
            char[] charArray2 = offlineMapCity2.getJianpin().toCharArray();
            return (charArray[0] >= charArray2[0] && charArray[1] >= charArray2[1]) ? 0 : 1;
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(OfflineMapCity offlineMapCity, OfflineMapCity offlineMapCity2) {
            return a(offlineMapCity, offlineMapCity2);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // defpackage.q2s
    public final void c(View view) {
        try {
            int id = view.getId();
            if (id == R.dimen.abc_button_padding_vertical_material) {
                this.f31030a.closeScr();
                return;
            }
            if (id == R.dimen.abc_action_bar_content_inset_material) {
                if (this.u) {
                    this.d.setVisibility(8);
                    this.g.setBackgroundResource(R.animator.fragment_close_enter);
                    this.u = false;
                    return;
                } else {
                    this.d.setVisibility(0);
                    this.g.setBackgroundResource(R.animator.anim_connecting);
                    this.u = true;
                    return;
                }
            }
            if (id == R.dimen.abc_action_bar_elevation_material) {
                if (this.t) {
                    this.p.c();
                    this.h.setBackgroundResource(R.animator.fragment_close_enter);
                    this.t = false;
                } else {
                    this.p.a();
                    this.h.setBackgroundResource(R.animator.anim_connecting);
                    this.t = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.q2s
    public final void e() {
        View viewD = xss.d(this.f31030a, R.array.ElectronicScaleBMIIndex);
        DownLoadExpandListView downLoadExpandListView = (DownLoadExpandListView) viewD.findViewById(R.dimen.abc_action_bar_default_padding_end_material);
        this.d = downLoadExpandListView;
        downLoadExpandListView.setOnTouchListener(this);
        this.j = (RelativeLayout) viewD.findViewById(R.dimen.abc_action_bar_content_inset_material);
        this.g = (ImageView) viewD.findViewById(R.dimen.abc_action_bar_default_height_material);
        this.j.setOnClickListener(this.f31030a);
        this.f32873k = (RelativeLayout) viewD.findViewById(R.dimen.abc_action_bar_elevation_material);
        this.h = (ImageView) viewD.findViewById(R.dimen.abc_action_bar_icon_vertical_padding_material);
        this.f32873k.setOnClickListener(this.f31030a);
        this.n = (RelativeLayout) viewD.findViewById(R.dimen.abc_action_bar_default_padding_start_material);
        ImageView imageView = (ImageView) this.c.findViewById(R.dimen.abc_button_padding_vertical_material);
        this.f32872b = imageView;
        imageView.setOnClickListener(this.f31030a);
        this.m = (ImageView) this.c.findViewById(R.dimen.abc_config_prefDialogWidth);
        ImageView imageView2 = (ImageView) this.c.findViewById(R.dimen.abc_control_inset_material);
        this.l = imageView2;
        imageView2.setOnClickListener(new a());
        this.c.findViewById(R.dimen.abc_control_padding_material).setOnTouchListener(this);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.c.findViewById(R.dimen.abc_control_corner_material);
        this.i = autoCompleteTextView;
        autoCompleteTextView.addTextChangedListener(this);
        this.i.setOnTouchListener(this);
        this.e = (ListView) this.c.findViewById(R.dimen.abc_dialog_fixed_height_major);
        ExpandableListView expandableListView = (ExpandableListView) this.c.findViewById(R.dimen.abc_dialog_corner_radius_material);
        this.f = expandableListView;
        expandableListView.addHeaderView(viewD);
        this.f.setOnTouchListener(this);
        this.f.setOnScrollListener(this);
        try {
            OfflineMapManager offlineMapManager = new OfflineMapManager(this.f31030a, this);
            this.q = offlineMapManager;
            offlineMapManager.setOnOfflineLoadedListener(this);
        } catch (Exception e) {
            "e=".concat(String.valueOf(e));
        }
        q();
        eqs eqsVar = new eqs(this.o, this.q, this.f31030a);
        this.p = eqsVar;
        this.f.setAdapter(eqsVar);
        this.f.setOnGroupCollapseListener(this.p);
        this.f.setOnGroupExpandListener(this.p);
        this.f.setGroupIndicator(null);
        if (this.t) {
            this.h.setBackgroundResource(R.animator.anim_connecting);
            this.f.setVisibility(0);
        } else {
            this.h.setBackgroundResource(R.animator.fragment_close_enter);
            this.f.setVisibility(8);
        }
        if (this.u) {
            this.g.setBackgroundResource(R.animator.anim_connecting);
            this.d.setVisibility(0);
        } else {
            this.g.setBackgroundResource(R.animator.fragment_close_enter);
            this.d.setVisibility(8);
        }
    }

    @Override // defpackage.q2s
    public final boolean f() {
        try {
            if (this.e.getVisibility() == 0) {
                this.i.setText("");
                this.l.setVisibility(8);
                k(false);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.f();
    }

    @Override // defpackage.q2s
    public final RelativeLayout g() {
        if (this.c == null) {
            this.c = (RelativeLayout) xss.d(this.f31030a, R.array.ElectronicScaleBoneSaltComponent);
        }
        return this.c;
    }

    @Override // defpackage.q2s
    public final void h() {
        this.q.destroy();
    }

    public final void j(OfflineMapCity offlineMapCity) {
        try {
            if (this.x == null) {
                this.x = new jss(this.f31030a, this.q);
            }
            this.x.c(offlineMapCity.getState(), offlineMapCity.getCity());
            this.x.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void k(boolean z) {
        if (z) {
            this.j.setVisibility(8);
            this.f32873k.setVisibility(8);
            this.d.setVisibility(8);
            this.f.setVisibility(8);
            this.n.setVisibility(8);
            this.e.setVisibility(0);
            return;
        }
        this.j.setVisibility(0);
        this.f32873k.setVisibility(0);
        this.n.setVisibility(0);
        this.d.setVisibility(this.u ? 0 : 8);
        this.f.setVisibility(this.t ? 0 : 8);
        this.e.setVisibility(8);
    }

    public final void n() {
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.m.getLayoutParams();
            layoutParams.leftMargin = a(18.0f);
            this.m.setLayoutParams(layoutParams);
            this.i.setPadding(a(30.0f), 0, 0, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void o() {
        q();
        pqs pqsVar = new pqs(this.q, this.f31030a);
        this.s = pqsVar;
        this.e.setAdapter((ListAdapter) pqsVar);
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onCheckUpdate(boolean z, String str) {
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onDownload(int i, int i2, String str) {
        if (i == 101) {
            try {
                Toast.makeText(this.f31030a, "网络异常", 0).show();
                this.q.pause();
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (i == 2) {
            this.f32874r.b();
        }
        if (this.v == i) {
            if (System.currentTimeMillis() - this.w > 1200) {
                if (this.y) {
                    this.f32874r.notifyDataSetChanged();
                }
                this.w = System.currentTimeMillis();
                return;
            }
            return;
        }
        eqs eqsVar = this.p;
        if (eqsVar != null) {
            eqsVar.notifyDataSetChanged();
        }
        bqs bqsVar = this.f32874r;
        if (bqsVar != null) {
            bqsVar.notifyDataSetChanged();
        }
        pqs pqsVar = this.s;
        if (pqsVar != null) {
            pqsVar.notifyDataSetChanged();
        }
        this.v = i;
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onRemove(boolean z, String str, String str2) {
        bqs bqsVar = this.f32874r;
        if (bqsVar != null) {
            bqsVar.c();
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
            k(false);
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
        if (arrayList.size() <= 0) {
            Toast.makeText(this.f31030a, "未找到相关城市", 0).show();
            return;
        }
        k(true);
        Collections.sort(arrayList, new b());
        pqs pqsVar = this.s;
        if (pqsVar != null) {
            pqsVar.b(arrayList);
            this.s.notifyDataSetChanged();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r();
        if (view.getId() != R.dimen.abc_control_corner_material) {
            return false;
        }
        n();
        return false;
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineLoadedListener
    public final void onVerifyComplete() {
        o();
        p();
    }

    public final void p() {
        bqs bqsVar = new bqs(this.f31030a, this, this.q, this.o);
        this.f32874r = bqsVar;
        this.d.setAdapter(bqsVar);
        this.f32874r.notifyDataSetChanged();
    }

    public final void q() {
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

    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.i;
        if (autoCompleteTextView == null || !autoCompleteTextView.isFocused()) {
            return;
        }
        this.i.clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.f31030a.getSystemService("input_method");
        if (inputMethodManager == null || !inputMethodManager.isActive()) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.i.getWindowToken(), 2);
    }
}
