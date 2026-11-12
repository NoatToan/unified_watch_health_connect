package com.huawei.healthcloud.plugintrack.offlinemap.ui.view;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.offlinemap.adapter.OfflineMapSomeCitiesAdapter;
import com.huawei.healthcloud.plugintrack.offlinemap.ui.activity.OfflineMapTabActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.jcc;
import defpackage.njy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class OfflineDownManagerFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<OfflineMapCity> f10542a = new ArrayList<>(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<OfflineMapCity> f10543b = new ArrayList<>(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OfflineMapSomeCitiesAdapter f10544c;
    private OfflineListView d;
    private LinearLayout e;
    private LinearLayout g;
    private LinearLayout h;
    private OfflineListView i;
    private OfflineMapSomeCitiesAdapter j;

    enum EnableShowType {
        DOWNLOADING_CITY_LIST,
        COMPLETE_CITY_LIST,
        ALL_CITY_LIST,
        NO_LIST,
        NULL_DATA
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("OfflineDownManagerFragment", "onCreateView()");
        if (layoutInflater == null) {
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.track_offlinemap_down_fragment, viewGroup, false);
        this.d = (OfflineListView) viewInflate.findViewById(R.id.list_load_ok);
        this.i = (OfflineListView) viewInflate.findViewById(R.id.list_loading);
        this.e = (LinearLayout) viewInflate.findViewById(R.id.ll_load_ok);
        this.g = (LinearLayout) viewInflate.findViewById(R.id.ll_loading);
        this.h = (LinearLayout) viewInflate.findViewById(R.id.ll_warn);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        LogUtil.a("OfflineDownManagerFragment", "onViewCreated()");
        super.onViewCreated(view, bundle);
        b();
    }

    private void b() {
        LogUtil.a("OfflineDownManagerFragment", "initView()");
        OfflineMapSomeCitiesAdapter offlineMapSomeCitiesAdapter = new OfflineMapSomeCitiesAdapter(getActivity(), this.f10542a);
        this.j = offlineMapSomeCitiesAdapter;
        this.i.setAdapter((ListAdapter) offlineMapSomeCitiesAdapter);
        OfflineMapSomeCitiesAdapter offlineMapSomeCitiesAdapter2 = new OfflineMapSomeCitiesAdapter(getActivity(), this.f10543b);
        this.f10544c = offlineMapSomeCitiesAdapter2;
        this.d.setAdapter((ListAdapter) offlineMapSomeCitiesAdapter2);
        BaseActivity.cancelLayoutById(this.i, this.d);
        BaseActivity.setViewSafeRegion(false, this.i, this.d);
        this.d.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: com.huawei.healthcloud.plugintrack.offlinemap.ui.view.OfflineDownManagerFragment.5
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                OfflineDownManagerFragment.this.e(i);
                return true;
            }
        });
        this.i.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: com.huawei.healthcloud.plugintrack.offlinemap.ui.view.OfflineDownManagerFragment.2
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                OfflineDownManagerFragment.this.d(i);
                return true;
            }
        });
        a(EnableShowType.NULL_DATA);
    }

    private void c(ArrayList<OfflineMapCity> arrayList, ArrayList<OfflineMapCity> arrayList2) {
        LogUtil.a("OfflineDownManagerFragment", "processShowListEnable");
        if (arrayList == null || arrayList2 == null) {
            LogUtil.a("OfflineDownManagerFragment", "processShowListEnable loadingCityList or downCityList is null");
            return;
        }
        if (arrayList.size() <= 0) {
            if (arrayList2.size() <= 0) {
                a(EnableShowType.NO_LIST);
                return;
            } else {
                a(EnableShowType.COMPLETE_CITY_LIST);
                return;
            }
        }
        if (arrayList2.size() <= 0) {
            a(EnableShowType.DOWNLOADING_CITY_LIST);
        } else {
            a(EnableShowType.ALL_CITY_LIST);
        }
    }

    private void a(EnableShowType enableShowType) {
        LogUtil.a("OfflineDownManagerFragment", "enableShowList type : ", enableShowType);
        if (this.g == null || this.e == null || this.h == null) {
            LogUtil.e("OfflineDownManagerFragment", "mLoadingLayout == null || mDownLayout == null || mWarnTextView == null");
            return;
        }
        int iOrdinal = enableShowType.ordinal();
        if (iOrdinal == 0) {
            this.g.setVisibility(0);
            this.e.setVisibility(8);
            this.h.setVisibility(8);
            return;
        }
        if (iOrdinal == 1) {
            this.g.setVisibility(8);
            this.e.setVisibility(0);
            this.h.setVisibility(8);
            return;
        }
        if (iOrdinal == 2) {
            this.g.setVisibility(0);
            this.e.setVisibility(0);
            this.h.setVisibility(8);
        } else if (iOrdinal == 3) {
            this.g.setVisibility(8);
            this.e.setVisibility(8);
            this.h.setVisibility(0);
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.h.setVisibility(8);
            this.e.setVisibility(8);
            this.g.setVisibility(8);
        }
    }

    public void b(ArrayList<OfflineMapCity> arrayList, ArrayList<OfflineMapCity> arrayList2) {
        LogUtil.a("OfflineDownManagerFragment", "mDownCityList size", Integer.valueOf(this.f10543b.size()), "mLoadingCityList size", Integer.valueOf(this.f10542a.size()));
        this.f10542a = arrayList;
        this.f10543b = arrayList2;
        d(arrayList);
        e(arrayList2);
        c(arrayList, arrayList2);
    }

    private void d(ArrayList<OfflineMapCity> arrayList) {
        OfflineMapSomeCitiesAdapter offlineMapSomeCitiesAdapter = this.j;
        if (offlineMapSomeCitiesAdapter == null) {
            LogUtil.e("OfflineDownManagerFragment", "mLoadingListAdapter  == null");
        } else {
            offlineMapSomeCitiesAdapter.c(arrayList);
            this.j.notifyDataSetChanged();
        }
    }

    private void e(ArrayList<OfflineMapCity> arrayList) {
        OfflineMapSomeCitiesAdapter offlineMapSomeCitiesAdapter = this.f10544c;
        if (offlineMapSomeCitiesAdapter == null) {
            LogUtil.e("OfflineDownManagerFragment", "mDownListAdapter == null");
        } else {
            offlineMapSomeCitiesAdapter.c(arrayList);
            this.f10544c.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        LogUtil.a("OfflineDownManagerFragment", "showDeleteConfirmDialog() position:", Integer.valueOf(i));
        if (njy.e(this.f10543b, i)) {
            return;
        }
        e(this.f10543b.get(i).getCity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        LogUtil.a("OfflineDownManagerFragment", "showDeleteLoadingConfirmDialog() position:", Integer.valueOf(i));
        if (njy.e(this.f10542a, i)) {
            return;
        }
        OfflineMapCity offlineMapCity = this.f10542a.get(i);
        String city = offlineMapCity.getCity();
        int state = offlineMapCity.getState();
        LogUtil.a("OfflineDownManagerFragment", "showDeleteLoadingConfirmDialog state:", Integer.valueOf(state));
        if (state == 0) {
            a(city, "", 100);
            return;
        }
        if (state != 1) {
            if (state == 2) {
                a(city, getString(R.string.IDS_motiontrack_offlinemap_download_start), 102);
                return;
            }
            if (state == 3 || state == 5 || state == 6 || state == 101) {
                a(city, getString(R.string.IDS_motiontrack_offlinemap_download_start), 101);
            } else {
                e(city);
            }
        }
    }

    private void e(final String str) {
        LogUtil.a("OfflineDownManagerFragment", "showDeleteCityDialog()");
        String str2 = String.format(getString(R.string.IDS_motiontrack_offlinemap_confirm_delete_map), str);
        final FragmentActivity activity = getActivity();
        if (!(activity instanceof OfflineMapTabActivity)) {
            LogUtil.a("OfflineDownManagerFragment", "showDeleteCityDialog factivity != OfflineMapTabActivity");
        } else {
            new CustomAlertDialog.Builder(activity).d(R.string.IDS_motiontrack_show_remind).e(str2).a(R.string.IDS_motiontrack_show_cancel, new DialogInterface.OnClickListener(this) { // from class: com.huawei.healthcloud.plugintrack.offlinemap.ui.view.OfflineDownManagerFragment.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                }
            }).d(R.string.IDS_contact_delete, new DialogInterface.OnClickListener(this) { // from class: com.huawei.healthcloud.plugintrack.offlinemap.ui.view.OfflineDownManagerFragment.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    jcc.e(activity).e(str, false);
                }
            }).b().show();
        }
    }

    private void a(String str, String str2, int i) {
        String[] strArr;
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(getActivity()).d();
        if (TextUtils.isEmpty(str2)) {
            strArr = new String[]{getString(R.string.IDS_contact_delete)};
        } else {
            strArr = new String[]{str2, getString(R.string.IDS_contact_delete)};
        }
        c cVar = new c(strArr, getActivity());
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.track_offlinemap_common_ui_dialog_listview, (ViewGroup) null, false);
        ListView listView = (ListView) viewInflate.findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) cVar);
        d(listView);
        a(str, i, customViewDialogD, listView);
        customViewDialogD.setContentView(viewInflate);
        customViewDialogD.show();
    }

    private void a(final String str, final int i, final CustomViewDialog customViewDialog, ListView listView) {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.healthcloud.plugintrack.offlinemap.ui.view.OfflineDownManagerFragment.3
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                FragmentActivity activity = OfflineDownManagerFragment.this.getActivity();
                if (activity instanceof OfflineMapTabActivity) {
                    LogUtil.a("OfflineDownManagerFragment", "showDoubleDeleteDialog onItemClick() position:", Integer.valueOf(i2));
                    jcc jccVarE = jcc.e(activity);
                    if (i2 != 0) {
                        if (i2 != 1) {
                            return;
                        }
                        if (i == 100) {
                            jccVarE.e(str, true);
                        } else {
                            jccVarE.e(str, false);
                        }
                        OfflineDownManagerFragment.this.e(customViewDialog);
                        return;
                    }
                    int i3 = i;
                    if (i3 == 100) {
                        jccVarE.e(str, false);
                    } else if (i3 == 101) {
                        jccVarE.d(str, false);
                    } else if (i3 == 102) {
                        jccVarE.b(str);
                    }
                    OfflineDownManagerFragment.this.e(customViewDialog);
                }
            }
        });
    }

    private void d(ListView listView) {
        listView.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.huawei.healthcloud.plugintrack.offlinemap.ui.view.OfflineDownManagerFragment.6
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent != null) {
                    return motionEvent.getAction() == 2;
                }
                LogUtil.j("OfflineDownManagerFragment", "setListViewOnTouchListener onTouch event is equals null");
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(CustomViewDialog customViewDialog) {
        if (customViewDialog != null) {
            customViewDialog.dismiss();
        }
    }

    static class c extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f10550a;
        private String[] e;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public c(String[] strArr, Context context) {
            if (strArr != null) {
                this.e = (String[]) strArr.clone();
            }
            this.f10550a = context;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            String[] strArr = this.e;
            if (strArr == null) {
                LogUtil.j("OfflineDownManagerFragment", "mType is null");
                return 0;
            }
            return strArr.length;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            String[] strArr = this.e;
            if (strArr == null) {
                LogUtil.j("OfflineDownManagerFragment", "mItemList is null");
                return null;
            }
            if (i < 0 || i >= strArr.length) {
                return null;
            }
            return strArr[i];
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            d dVar;
            if (view == null) {
                view = View.inflate(this.f10550a, R.layout.offline_map_list_item_single_choice, null);
                dVar = new d();
                dVar.f10551c = (HealthTextView) view.findViewById(R.id.text1);
                dVar.e = (HealthDivider) view.findViewById(R.id.divide_line);
                view.setTag(dVar);
            } else {
                if (!(view.getTag() instanceof d)) {
                    LogUtil.a("OfflineDownManagerFragment", "!view.getTag() instanceof ViewHolder");
                    return view;
                }
                dVar = (d) view.getTag();
            }
            String[] strArr = this.e;
            if (strArr == null) {
                LogUtil.j("OfflineDownManagerFragment", "mType is null");
                return view;
            }
            if (i >= 0 && i < strArr.length) {
                if (i == strArr.length - 1 && dVar.e != null) {
                    dVar.e.setVisibility(8);
                }
                if (dVar.f10551c != null) {
                    dVar.f10551c.setText(this.e[i]);
                }
            }
            return view;
        }
    }

    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f10551c;
        HealthDivider e;

        d() {
        }
    }
}
