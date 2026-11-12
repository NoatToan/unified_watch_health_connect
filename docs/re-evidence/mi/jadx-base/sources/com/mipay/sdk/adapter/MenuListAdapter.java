package com.mipay.sdk.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.mipay.sdk.app.MenuData;
import com.mipay.sdk.web.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MenuListAdapter extends BaseAdapter {
    private Context mContext;
    private List<MenuData> mList;

    public class ViewHolder {
        TextView mTitleView;

        public ViewHolder(View view) {
            this.mTitleView = (TextView) view.findViewById(R.id.tv_title_immersion_menu_item);
        }
    }

    public MenuListAdapter(Context context) {
        this.mContext = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<MenuData> list = this.mList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        List<MenuData> list = this.mList;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return this.mList.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        if (this.mList != null) {
            return i;
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        MenuData menuData = this.mList.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.mipay_sdk_web_immersion_menu_item, (ViewGroup) null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.mTitleView.setText(menuData.mTitle);
        return view;
    }

    public void setData(List<MenuData> list) {
        this.mList = list;
    }
}
