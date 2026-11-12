package com.huami.watch.companion.unlock;

import android.app.Fragment;
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
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class UnlockDistanceSettingFragment extends Fragment {
    private View a;
    private ListView b;
    private int c;
    private onDistanceItemClickListener d;

    public class UnlockDistanceAdapter extends BaseAdapter {
        private String[] a;

        public UnlockDistanceAdapter(String[] strArr) {
            this.a = null;
            this.a = strArr;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.a.length;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View viewInflate = View.inflate(viewGroup.getContext(), R.layout.item_unlock_distance_setting, null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.unlock_distance_text);
            textView.setText(this.a[i]);
            if (UnlockDistanceSettingFragment.this.c == i) {
                textView.setSelected(true);
            }
            return viewInflate;
        }

        @Override // android.widget.Adapter
        public String getItem(int i) {
            return this.a[i];
        }
    }

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (UnlockDistanceSettingFragment.this.d != null) {
                UnlockDistanceSettingFragment.this.d.onDistanceItemClick(adapterView, view, i, j);
            }
        }
    }

    public interface onDistanceItemClickListener {
        void onDistanceItemClick(AdapterView<?> adapterView, View view, int i, long j);
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_unlock_distance_setting, viewGroup, false);
        this.a = viewInflate;
        this.b = (ListView) viewInflate.findViewById(R.id.unlock_distance_setting_list);
        this.b.setAdapter((ListAdapter) new UnlockDistanceAdapter(getResources().getStringArray(R.array.lock_screen_type)));
        this.b.setOnItemClickListener(new a());
        return this.a;
    }

    public void setOnItemClickListener(@Nullable onDistanceItemClickListener ondistanceitemclicklistener) {
        this.d = ondistanceitemclicklistener;
    }

    public void setSelectedPos(int i) {
        this.c = i;
    }
}
