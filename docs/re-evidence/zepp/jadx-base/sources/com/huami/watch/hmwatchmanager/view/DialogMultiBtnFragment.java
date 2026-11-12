package com.huami.watch.hmwatchmanager.view;

import android.app.Fragment;
import android.content.Context;
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
import com.huami.watch.companionlib.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class DialogMultiBtnFragment extends Fragment {
    private ListView a;
    private TextView b;
    private OnButtonClick c;
    private String d;
    private List<String> e = new ArrayList();

    public interface OnButtonClick {
        void onButtonClick(int i);
    }

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (DialogMultiBtnFragment.this.c != null) {
                DialogMultiBtnFragment.this.c.onButtonClick(i);
            }
        }
    }

    public class b extends BaseAdapter {
        private Context a;
        private List<String> b;

        public class a {
            public TextView a;

            public a(View view) {
                this.a = (TextView) view.findViewById(R.id.dialog_multi_button_text);
            }
        }

        public b(Context context, List<String> list) {
            this.b = new ArrayList();
            this.a = context;
            this.b = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.b.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.b.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            a aVar;
            if (view == null) {
                view = LayoutInflater.from(this.a).inflate(R.layout.item_dialog_multi_button, viewGroup, false);
                aVar = new a(view);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            aVar.a.setText(this.b.get(i));
            return view;
        }
    }

    private void b() {
        this.b.setText(this.d);
        b bVar = new b(getActivity(), this.e);
        this.a.setAdapter((ListAdapter) bVar);
        bVar.notifyDataSetChanged();
    }

    public void addButton(List<String> list, OnButtonClick onButtonClick) {
        this.c = onButtonClick;
        this.e = list;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        b();
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_multi_btn, viewGroup, false);
        this.b = (TextView) viewInflate.findViewById(R.id.dialog_msg);
        ListView listView = (ListView) viewInflate.findViewById(R.id.dialog_multi_button_list);
        this.a = listView;
        listView.setOnItemClickListener(new a());
        return viewInflate;
    }

    public void setMessage(String str) {
        this.d = str;
    }
}
