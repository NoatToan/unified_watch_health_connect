package com.huami.watch.companion.ximalaya;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huami.watch.companion.R;
import com.huami.watch.companion.ui.view.PagerSlidingTabStrip;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DeviceCompatibility;
import com.ximalaya.ting.android.opensdk.model.album.SearchAlbumList;
import com.ximalaya.ting.android.opensdk.player.XmPlayerManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class XimalayaSearchingActivity extends FragmentActivity {
    private static final String s = "XimalayaSearching";
    private TextView a;
    private EditText b;
    private XmPlayerManager c;
    private RelativeLayout h;
    private TextView i;
    private RadiogroupCL j;
    private ImageView k;
    private ImageView l;
    private TextView m;
    private ViewPager n;
    private c o;
    private PagerSlidingTabStrip p;
    private RelativeLayout q;
    private SearchAlbumList d = null;
    private boolean e = false;
    public List<String> f = null;
    public Transporter g = null;
    private List<Fragment> r = new ArrayList();

    public class a implements TextView.OnEditorActionListener {
        public a() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 3) {
                Analytics.event(XimalayaSearchingActivity.this, AnalyticsEvents.EVENT_CLICK_SEARCH);
                if (XimalayaSearchingActivity.this.getSeachString().equals("")) {
                    Toast.makeText(XimalayaSearchingActivity.this, "搜索内容不能为空", 0).show();
                } else {
                    XimalayaSearchingActivity ximalayaSearchingActivity = XimalayaSearchingActivity.this;
                    ximalayaSearchingActivity.n(ximalayaSearchingActivity.getSeachString());
                    XimalayaSearchingActivity.this.showSearchResult();
                    XimalayaSearchingActivity.this.o(textView.getWindowToken());
                }
            }
            return false;
        }
    }

    public class b implements View.OnClickListener {
        public final /* synthetic */ String[] a;
        public final /* synthetic */ int b;

        public b(String[] strArr, int i) {
            this.a = strArr;
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Analytics.event(XimalayaSearchingActivity.this, AnalyticsEvents.EVENT_CLICK_SEARCH_HISTORY);
            XimalayaSearchingActivity.this.b.setText(this.a[this.b]);
            XimalayaSearchingActivity.this.showSearchResult();
            XimalayaSearchingActivity.this.o(view.getWindowToken());
        }
    }

    public class c extends FragmentPagerAdapter {
        private String[] a;

        public c(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.a = new String[]{XimalayaSearchingActivity.this.getString(R.string.xima_all), XimalayaSearchingActivity.this.getString(R.string.xima_album), XimalayaSearchingActivity.this.getString(R.string.xima_sound)};
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            return XimalayaSearchingActivity.this.r.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            if (XimalayaSearchingActivity.this.r.size() > i) {
                return (Fragment) XimalayaSearchingActivity.this.r.get(i);
            }
            return null;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i) {
            return this.a[i];
        }
    }

    public class d implements View.OnClickListener {
        private d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.back) {
                XimalayaSearchingActivity.this.onBackPressed();
                return;
            }
            if (id == R.id.searching_history_clear) {
                XimalayaSearchingActivity.this.k();
                view.setVisibility(8);
                return;
            }
            if (id == R.id.search_btn) {
                Analytics.event(XimalayaSearchingActivity.this, AnalyticsEvents.EVENT_CLICK_SEARCH);
                if (XimalayaSearchingActivity.this.getSeachString().equals("")) {
                    return;
                }
                XimalayaSearchingActivity ximalayaSearchingActivity = XimalayaSearchingActivity.this;
                ximalayaSearchingActivity.n(ximalayaSearchingActivity.getSeachString());
                XimalayaSearchingActivity.this.showSearchResult();
                XimalayaSearchingActivity.this.o(view.getWindowToken());
                return;
            }
            if (id == R.id.clear_btn) {
                Analytics.event(XimalayaSearchingActivity.this, AnalyticsEvents.EVENT_CLICK_CLEAN_SEARCH_HISTORY);
                XimalayaSearchingActivity.this.b.setText("");
                XimalayaSearchingActivity.this.h.setVisibility(0);
                XimalayaSearchingActivity.this.j.clearCheck();
                XimalayaSearchingActivity.this.q.setVisibility(8);
            }
        }
    }

    private void initView() {
        this.c = XmPlayerManager.getInstance(getApplicationContext());
        this.a = (TextView) findViewById(R.id.back);
        this.b = (EditText) findViewById(R.id.searching_program);
        this.m = (TextView) findViewById(R.id.nodata);
        this.b.setSingleLine(true);
        this.b.setFocusable(true);
        this.b.setFocusableInTouchMode(true);
        this.b.requestFocus();
        d dVar = new d();
        this.a.setOnClickListener(dVar);
        this.b.setOnEditorActionListener(new a());
        this.k = (ImageView) findViewById(R.id.clear_btn);
        this.l = (ImageView) findViewById(R.id.search_btn);
        this.k.setOnClickListener(dVar);
        this.l.setOnClickListener(dVar);
        this.h = (RelativeLayout) findViewById(R.id.searching_history);
        TextView textView = (TextView) findViewById(R.id.searching_history_clear);
        this.i = textView;
        textView.setOnClickListener(dVar);
        RadiogroupCL radiogroupCL = (RadiogroupCL) findViewById(R.id.searching_history_rg);
        this.j = radiogroupCL;
        radiogroupCL.removeAllViews();
        this.j.setDatas(m());
        String[] datas = this.j.getDatas();
        if (datas == null || datas.length <= 0) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            for (int i = 0; i < datas.length; i++) {
                SelectRadioButton selectRadioButton = new SelectRadioButton(this);
                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-2, -2);
                layoutParams.setMargins(15, 15, 15, 15);
                selectRadioButton.setBackgroundResource(R.drawable.bg_radiobutton_normal);
                selectRadioButton.setButtonDrawable((Drawable) null);
                selectRadioButton.setOnClickListener(new b(datas, i));
                selectRadioButton.setText(datas[i]);
                selectRadioButton.setTextSize(12.0f);
                this.j.addView(selectRadioButton, layoutParams);
            }
        }
        l();
        this.q = (RelativeLayout) findViewById(R.id.fragments_par);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        this.n = viewPager;
        viewPager.setOffscreenPageLimit(3);
        this.p = (PagerSlidingTabStrip) findViewById(R.id.indicator);
        c cVar = new c(getSupportFragmentManager());
        this.o = cVar;
        this.n.setAdapter(cVar);
        this.p.setViewPager(this.n);
        this.n.setCurrentItem(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        SharedPreferences.Editor editorEdit = getSharedPreferences(XimalayaUtils.EDIT_SEARCH, 0).edit();
        editorEdit.clear();
        editorEdit.commit();
        this.j.removeAllViews();
    }

    private void l() {
        XimaSearchAllFragment ximaSearchAllFragment = new XimaSearchAllFragment();
        ximaSearchAllFragment.setResource(getSeachString());
        XimaSearchAlbumFragment ximaSearchAlbumFragment = new XimaSearchAlbumFragment();
        ximaSearchAlbumFragment.setResource(getSeachString());
        XimaSearchSoundFragment ximaSearchSoundFragment = new XimaSearchSoundFragment();
        ximaSearchSoundFragment.setResource(getSeachString());
        this.r.add(ximaSearchAllFragment);
        this.r.add(ximaSearchAlbumFragment);
        this.r.add(ximaSearchSoundFragment);
    }

    private String[] m() {
        String string = getSharedPreferences(XimalayaUtils.EDIT_SEARCH, 0).getString(XimalayaUtils.EDIT_SEARCH_KEY, "");
        if ("".equals(string)) {
            return null;
        }
        return string.split(",");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str) {
        SharedPreferences sharedPreferences = getSharedPreferences(XimalayaUtils.EDIT_SEARCH, 0);
        String string = sharedPreferences.getString(XimalayaUtils.EDIT_SEARCH_KEY, "");
        StringBuilder sb = new StringBuilder(str);
        sb.append("," + string);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (string.contains(str + ",")) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(XimalayaUtils.EDIT_SEARCH_KEY, sb.toString());
        editorEdit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(IBinder iBinder) {
        ((XimaSearchAllFragment) this.r.get(0)).loadData(getSeachString(), true);
        XimaSearchAlbumFragment ximaSearchAlbumFragment = (XimaSearchAlbumFragment) this.r.get(1);
        ximaSearchAlbumFragment.deleteFootView();
        ximaSearchAlbumFragment.loadData(getSeachString(), true);
        ximaSearchAlbumFragment.addFootView();
        XimaSearchSoundFragment ximaSearchSoundFragment = (XimaSearchSoundFragment) this.r.get(2);
        ximaSearchSoundFragment.deleteFootView();
        ximaSearchSoundFragment.loadData(getSeachString(), true);
        ximaSearchSoundFragment.addFootView();
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(iBinder, 0);
    }

    public String getSeachString() {
        Log.d(s, "edittext is " + this.b.getText().toString());
        return this.b.getText().toString();
    }

    public void notifyChange() {
        c cVar = this.o;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ximalaya);
        DeviceCompatibility.setStatusBarDarkMode(this, true, R.color.theme_window_bg);
        initView();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Transporter transporter = this.g;
        if (transporter == null || !transporter.isTransportServiceConnected()) {
            return;
        }
        this.g.disconnectTransportService();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    public void showNoSearchResult(boolean z, boolean z2) {
        if (z && z2) {
            this.m.setVisibility(0);
            this.h.setVisibility(8);
            this.q.setVisibility(8);
        }
    }

    public void showSearchResult() {
        this.m.setVisibility(8);
        this.h.setVisibility(8);
        this.q.setVisibility(0);
    }

    public void slidingSelectFragment(int i) {
        if (i <= this.n.getChildCount()) {
            this.n.setCurrentItem(i);
        }
    }
}
