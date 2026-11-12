package com.xiaomi.hm.health.ui.keekalive;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import cn.com.smartdevices.bracelet.rom.ROM;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.lib.view.SystemBarTintSupport;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes22.dex */
public class KeepAliveChangeSystemDialog extends BaseDialogFragment {
    private static final String f = "KeepAliveChangeSystemDialog";
    private b e;

    public class a extends BaseAdapter {
        public a() {
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public KeepAliveActivity.b getItem(int position) {
            return KeepAliveChangeSystemDialog.this.g(position);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return KeepAliveChangeSystemDialog.this.e.getItems().length + 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(KeepAliveChangeSystemDialog.this.getContext()).inflate(R.layout.item_keep_alive, parent, false);
            }
            ((TextView) convertView.findViewById(R.id.item_keep_alive_tv)).setText(getItem(position).b);
            TextView textView = (TextView) convertView.findViewById(R.id.item_keep_alive_tv);
            textView.setText(getItem(position).b);
            if (KeepAliveChangeSystemDialog.this.e.c() == getItem(position).a) {
                convertView.findViewById(R.id.item_keep_alive_arrow).setVisibility(0);
                textView.setTextColor(KeepAliveChangeSystemDialog.this.getResources().getColor(R.color.s15));
            } else {
                convertView.findViewById(R.id.item_keep_alive_arrow).setVisibility(4);
                textView.setTextColor(KeepAliveChangeSystemDialog.this.getResources().getColor(R.color.s1));
            }
            return convertView;
        }
    }

    public interface b {
        void a(ROM select);

        KeepAliveActivity.b b();

        ROM c();

        KeepAliveActivity.b[] getItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public KeepAliveActivity.b g(int position) {
        return position == this.e.getItems().length ? this.e.b() : this.e.getItems()[position];
    }

    private void h(View view) {
        ListView listView = (ListView) view.findViewById(R.id.keep_alive_fragment_list);
        listView.setAdapter((ListAdapter) new a());
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: xk4
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                this.a.i(adapterView, view2, i, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(AdapterView adapterView, View view, int i, long j) {
        KeepAliveActivity.b bVarG = g(i);
        if (bVarG.a != this.e.c()) {
            this.e.a(bVarG.a);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        dismiss();
    }

    public static void k(FragmentActivity activity, b callback) {
        KeepAliveChangeSystemDialog keepAliveChangeSystemDialog = new KeepAliveChangeSystemDialog();
        keepAliveChangeSystemDialog.setCallback(callback);
        keepAliveChangeSystemDialog.show(activity.getSupportFragmentManager(), f);
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_keep_alive_change_system, (ViewGroup) null);
        viewInflate.findViewById(R.id.keep_alive_fragment_cancel).setOnClickListener(new View.OnClickListener() { // from class: wk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j(view);
            }
        });
        h(viewInflate);
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, SystemBarTintSupport.isSupport(getActivity()) ? R.style.DimPanelTint : R.style.DimPanel);
    }

    public void setCallback(b callback) {
        this.e = callback;
    }
}
