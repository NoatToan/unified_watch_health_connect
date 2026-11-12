package com.xiaomi.hm.health.ui.smartplay.appnotify;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.CustomToast;

/* JADX INFO: loaded from: classes22.dex */
public class AddNotifyAppFragment extends Fragment implements AddNotifyAppContract.View {
    private AddNotifyAppContract.a a;
    private ListView b;
    private LoadingDialog c;

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            AddNotifyAppFragment.this.a.onChecked(position, (CheckBox) view.findViewById(R.id.check));
        }
    }

    private void initView(View view) {
        ListView listView = (ListView) view.findViewById(R.id.list);
        this.b = listView;
        listView.setOnItemClickListener(new a());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.fragment_add_notify_app, container, false);
        initView(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.a.start();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.appnotify.AddNotifyAppContract.View
    public void setPresenter(AddNotifyAppContract.a presenter) {
        if (presenter != null) {
            this.a = presenter;
        }
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.appnotify.AddNotifyAppContract.View
    public void showAppList(BaseAdapter adapter) {
        this.b.setAdapter((ListAdapter) adapter);
        adapter.notifyDataSetChanged();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.appnotify.AddNotifyAppContract.View
    public void showToast(String msg) {
        CustomToast.makeText(getContext(), msg, 0).show();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.appnotify.AddNotifyAppContract.View
    public void startLoading() {
        this.c = LoadingDialog.showDialog(getActivity(), getString(R.string.loading));
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.appnotify.AddNotifyAppContract.View
    public void stopLoading() {
        LoadingDialog loadingDialog = this.c;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
    }
}
