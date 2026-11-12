package com.huami.watch.companion.ximalaya;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huami.watch.companion.R;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.ui.view.PagerSlidingTabStrip;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DeviceCompatibility;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.model.metadata.Attributes;
import com.ximalaya.ting.android.opensdk.model.metadata.ChildMetadata;
import com.ximalaya.ting.android.opensdk.model.metadata.MetaData;
import com.ximalaya.ting.android.opensdk.model.metadata.MetaDataList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class XimaCategoryDetailActivity extends FragmentActivity {
    private static final String k = "XimaCategoryDetail";
    private String a;
    private long b;
    private ViewPager c;
    private PagerSlidingTabStrip d;
    private d e;
    private TextView f;
    private boolean g = false;
    private MetaDataList h = null;
    private List<XimaCategoryDetailFragment> i = new ArrayList();
    private String j = "";

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            XimaCategoryDetailActivity.this.onBackPressed();
        }
    }

    public class b implements ViewPager.OnPageChangeListener {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            XimaCategoryDetailActivity ximaCategoryDetailActivity = XimaCategoryDetailActivity.this;
            Analytics.event(ximaCategoryDetailActivity, AnalyticsEvents.EVENT_CLICK_SECONDARY_CATEGORY, ((XimaCategoryDetailFragment) ximaCategoryDetailActivity.i.get(i)).getTitle());
        }
    }

    public class c implements IDataCallBack<MetaDataList> {
        public c() {
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(MetaDataList metaDataList) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSuccess ");
            sb.append(metaDataList != null);
            Log.e(XimaCategoryDetailActivity.k, sb.toString());
            if (metaDataList == null || metaDataList.getMetaDatas() == null || metaDataList.getMetaDatas().size() == 0) {
                XimaCategoryDetailActivity.this.f.setVisibility(0);
                XimaCategoryDetailActivity.this.c.setVisibility(8);
            } else {
                XimaCategoryDetailActivity.this.i.clear();
                if (XimaCategoryDetailActivity.this.h == null) {
                    XimaCategoryDetailActivity.this.h = metaDataList;
                } else {
                    XimaCategoryDetailActivity.this.h.getMetaDatas().addAll(metaDataList.getMetaDatas());
                }
                List<MetaData> metaDatas = metaDataList.getMetaDatas();
                for (MetaData metaData : metaDatas) {
                    Log.d(XimaCategoryDetailActivity.k, "categorydetail MetaData is " + metaData.getDisplayName() + "---" + metaData.getKind() + "---" + metaDatas.size());
                    if (metaData.getAttributes() != null && metaData.getAttributes().size() != 0) {
                        List<Attributes> attributes = metaData.getAttributes();
                        Log.d(XimaCategoryDetailActivity.k, "categorydetail MetaData is " + metaData.getDisplayName() + "---" + metaData.getKind() + "---" + metaData.getAttributes().size());
                        for (int i = 0; i < attributes.size(); i++) {
                            Attributes attributes2 = attributes.get(i);
                            XimaCategoryDetailFragment ximaCategoryDetailFragment = new XimaCategoryDetailFragment();
                            ximaCategoryDetailFragment.setResource(XimaCategoryDetailActivity.this.b, attributes2);
                            ximaCategoryDetailFragment.setTitle(attributes2.getAttrValue());
                            XimaCategoryDetailActivity.this.i.add(ximaCategoryDetailFragment);
                            Log.d(XimaCategoryDetailActivity.k, "fragmentsList  size is " + XimaCategoryDetailActivity.this.i.size());
                            Log.d(XimaCategoryDetailActivity.k, "categorydetail Attributes size is " + attributes.size());
                            if (attributes2.getChildMetadatas() != null && attributes2.getChildMetadatas().size() != 0) {
                                for (ChildMetadata childMetadata : attributes2.getChildMetadatas()) {
                                    Log.d(XimaCategoryDetailActivity.k, "categorydetail ChildMetadata is " + childMetadata.getDisplayName() + "---" + childMetadata.getKind());
                                    if (childMetadata.getAttributes() != null && childMetadata.getAttributes().size() != 0) {
                                        for (Attributes attributes3 : childMetadata.getAttributes()) {
                                            Log.d(XimaCategoryDetailActivity.k, "categorydetail ChildAttributes is " + attributes3.getDisplayName() + "---" + attributes3.getAttrKey() + "---" + attributes3.getAttrValue());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                XimaCategoryDetailActivity.this.e.notifyDataSetChanged();
            }
            XimaCategoryDetailActivity.this.g = false;
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        public void onError(int i, String str) {
            Log.d(XimaCategoryDetailActivity.k, "categories detail request error , reason is " + str);
            XimaCategoryDetailActivity.this.g = false;
        }
    }

    public class d extends FragmentPagerAdapter {
        public d(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            if (XimaCategoryDetailActivity.this.h == null || XimaCategoryDetailActivity.this.h.getMetaDatas() == null) {
                return 0;
            }
            Log.d(XimaCategoryDetailActivity.k, "size is " + XimaCategoryDetailActivity.this.h.getMetaDatas().get(0).getAttributes().size());
            return XimaCategoryDetailActivity.this.i.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            if (XimaCategoryDetailActivity.this.h == null || XimaCategoryDetailActivity.this.h.getMetaDatas() == null || XimaCategoryDetailActivity.this.i.size() <= i) {
                return null;
            }
            return (XimaCategoryDetailFragment) XimaCategoryDetailActivity.this.i.get(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i) {
            return (XimaCategoryDetailActivity.this.h == null || XimaCategoryDetailActivity.this.h.getMetaDatas() == null) ? XimaCategoryDetailActivity.this.getString(R.string.xima_notitle) : ((XimaCategoryDetailFragment) XimaCategoryDetailActivity.this.i.get(i)).getTitle();
        }
    }

    private void initView() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar_detail);
        actionbarLayout.setTitleText(this.a);
        actionbarLayout.setBackArrowClickListener(new a());
        this.c = (ViewPager) findViewById(R.id.pager);
        this.d = (PagerSlidingTabStrip) findViewById(R.id.indicator);
        this.f = (TextView) findViewById(R.id.nodata);
        this.c.setOffscreenPageLimit(7);
        d dVar = new d(getSupportFragmentManager());
        this.e = dVar;
        this.c.setAdapter(dVar);
        this.d.setViewPager(this.c);
        this.c.addOnPageChangeListener(new b());
        this.c.setCurrentItem(0);
    }

    private void k() {
        this.a = getIntent().getStringExtra("catory_name");
        this.b = getIntent().getLongExtra("catory_id", 0L);
    }

    private void l() {
        if (this.g) {
            return;
        }
        this.g = true;
        HashMap map = new HashMap();
        map.put(DTransferConstants.CATEGORY_ID, "" + this.b);
        CommonRequest.getMetadataList(map, new c());
    }

    public long getCatoryId() {
        return this.b;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.xima_category_detail);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        k();
        initView();
        l();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
