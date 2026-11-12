package com.huawei.healthcloud.plugintrack.offlinemap.ui.view;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.SearchView;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.offlinemap.adapter.OfflineMapAllCitiesAdapter;
import com.huawei.healthcloud.plugintrack.offlinemap.adapter.OfflineMapSomeCitiesAdapter;
import com.huawei.healthcloud.plugintrack.offlinemap.manager.OfflineMapSearchThreadManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.searchview.HealthSearchView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class OfflineCitiesFragment extends BaseFragment implements OfflineMapSearchThreadManager.OfflineMapSearchCallback {
    private ExpandableListView d;
    private OfflineMapAllCitiesAdapter e;
    private OfflineMapSearchThreadManager f;
    private OfflineMapSomeCitiesAdapter g;
    private HealthSearchView i;
    private ListView j;
    private HealthTextView m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<Integer, CityListBean> f10538a = new HashMap<>(16);
    private List<OfflineMapCity> h = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10539b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f10540c = new e(this);

    enum EnableShowType {
        ALL_CITY_LIST,
        SEARCH_CITY_LIST,
        NULL_DATA
    }

    static class e extends BaseHandler<OfflineCitiesFragment> {
        e(OfflineCitiesFragment offlineCitiesFragment) {
            super(offlineCitiesFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(OfflineCitiesFragment offlineCitiesFragment, Message message) {
            if (offlineCitiesFragment == null || message == null) {
                return;
            }
            LogUtil.a("OfflineCitiesFragment", "handleMessageWhenReferenceNotNull msg.what:", Integer.valueOf(message.what));
            if (message.what == 100) {
                if (offlineCitiesFragment.f10539b != null) {
                    Object obj = message.obj;
                    if (message.obj == null) {
                        return;
                    }
                    if (!(obj instanceof List)) {
                        LogUtil.e("OfflineCitiesFragment", "MyHandler msg.obj is not List or is null");
                        return;
                    }
                    List list = (List) obj;
                    if (list.size() > 0) {
                        offlineCitiesFragment.c(EnableShowType.SEARCH_CITY_LIST);
                        offlineCitiesFragment.a((List<OfflineMapCity>) list);
                        return;
                    } else {
                        offlineCitiesFragment.c(EnableShowType.NULL_DATA);
                        return;
                    }
                }
                offlineCitiesFragment.c(EnableShowType.ALL_CITY_LIST);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("OfflineCitiesFragment", "onCreateView()");
        View viewInflate = layoutInflater.inflate(R.layout.track_offlinemap_citylist_fragment, viewGroup, false);
        this.d = (ExpandableListView) viewInflate.findViewById(R.id.list);
        this.j = (ListView) viewInflate.findViewById(R.id.list_search_city);
        this.m = (HealthTextView) viewInflate.findViewById(R.id.txt_no_city);
        this.i = (HealthSearchView) viewInflate.findViewById(R.id.search_view);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        LogUtil.a("OfflineCitiesFragment", "onViewCreated()");
        super.onViewCreated(view, bundle);
        this.d.setGroupIndicator(null);
        OfflineMapAllCitiesAdapter offlineMapAllCitiesAdapter = new OfflineMapAllCitiesAdapter(getActivity(), new ArrayList(10), this.f10538a);
        this.e = offlineMapAllCitiesAdapter;
        this.d.setAdapter(offlineMapAllCitiesAdapter);
        OfflineMapSomeCitiesAdapter offlineMapSomeCitiesAdapter = new OfflineMapSomeCitiesAdapter(getActivity(), this.h);
        this.g = offlineMapSomeCitiesAdapter;
        this.j.setAdapter((ListAdapter) offlineMapSomeCitiesAdapter);
        OfflineMapSearchThreadManager offlineMapSearchThreadManager = new OfflineMapSearchThreadManager();
        this.f = offlineMapSearchThreadManager;
        offlineMapSearchThreadManager.d(this);
        this.f.c();
        this.i.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.huawei.healthcloud.plugintrack.offlinemap.ui.view.OfflineCitiesFragment.4
            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextSubmit(String str) {
                return false;
            }

            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextChange(String str) {
                if (!TextUtils.isEmpty(str)) {
                    OfflineCitiesFragment.this.f10539b = str;
                    OfflineCitiesFragment.this.f.a(OfflineCitiesFragment.this.f10539b, OfflineCitiesFragment.this.f10538a);
                    return false;
                }
                OfflineCitiesFragment.this.f10539b = null;
                OfflineCitiesFragment.this.c(EnableShowType.ALL_CITY_LIST);
                return false;
            }
        });
    }

    public void e(ArrayList<OfflineMapProvince> arrayList, HashMap<Integer, CityListBean> map) {
        if (arrayList == null || map == null) {
            return;
        }
        LogUtil.a("OfflineCitiesFragment", "updateMap() provinceList:", Integer.valueOf(arrayList.size()), ",cityMap:" + map.size());
        this.f10538a = map;
        b(arrayList, map);
        String str = this.f10539b;
        if (str != null) {
            this.f.a(str, this.f10538a);
        } else {
            c(EnableShowType.ALL_CITY_LIST);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<OfflineMapCity> list) {
        this.g.c(list);
        this.g.notifyDataSetChanged();
    }

    private void b(ArrayList<OfflineMapProvince> arrayList, HashMap<Integer, CityListBean> map) {
        OfflineMapAllCitiesAdapter offlineMapAllCitiesAdapter = this.e;
        if (offlineMapAllCitiesAdapter == null) {
            LogUtil.j("OfflineCitiesFragment", "refreshAllCitiesList mAllCitiesAdapterListAdapter == null");
        } else {
            offlineMapAllCitiesAdapter.b(map, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(EnableShowType enableShowType) {
        LogUtil.a("OfflineCitiesFragment", "enableShowList type : ", enableShowType);
        int iOrdinal = enableShowType.ordinal();
        if (iOrdinal == 0) {
            HealthTextView healthTextView = this.m;
            if (healthTextView != null) {
                healthTextView.setVisibility(8);
            }
            e(this.j, 8);
            e(this.d, 0);
            return;
        }
        if (iOrdinal == 1) {
            HealthTextView healthTextView2 = this.m;
            if (healthTextView2 != null) {
                healthTextView2.setVisibility(8);
            }
            e(this.j, 0);
            e(this.d, 8);
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        HealthTextView healthTextView3 = this.m;
        if (healthTextView3 != null) {
            healthTextView3.setVisibility(0);
        }
        e(this.j, 8);
        e(this.d, 8);
    }

    private void e(ListView listView, int i) {
        if (listView != null) {
            listView.setVisibility(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        LogUtil.a("OfflineCitiesFragment", "onStart()");
        super.onStart();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LogUtil.a("OfflineCitiesFragment", "onResume()");
        super.onResume();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        LogUtil.a("OfflineCitiesFragment", "onPause()");
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        LogUtil.a("OfflineCitiesFragment", "onDestroy()");
        super.onDestroy();
        OfflineMapSearchThreadManager offlineMapSearchThreadManager = this.f;
        if (offlineMapSearchThreadManager != null) {
            offlineMapSearchThreadManager.d();
        }
        HealthSearchView healthSearchView = this.i;
        if (healthSearchView != null) {
            healthSearchView.setOnQueryTextListener(null);
        }
        d();
    }

    @Override // com.huawei.healthcloud.plugintrack.offlinemap.manager.OfflineMapSearchThreadManager.OfflineMapSearchCallback
    public void onSearchResult(List<OfflineMapCity> list) {
        if (list == null) {
            LogUtil.e("OfflineCitiesFragment", "onSearchResult cities is null");
            return;
        }
        LogUtil.a("OfflineCitiesFragment", "onSearchResult() cities size:", Integer.valueOf(list.size()));
        e eVar = this.f10540c;
        if (eVar == null) {
            LogUtil.e("OfflineCitiesFragment", "onSearchResult() mHandler null");
            return;
        }
        Message messageObtainMessage = eVar.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = list;
        this.f10540c.sendMessage(messageObtainMessage);
    }

    public void d() {
        this.i.clearFocus();
        Object systemService = getActivity().getApplicationContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(this.i.getWindowToken(), 0);
        }
    }
}
