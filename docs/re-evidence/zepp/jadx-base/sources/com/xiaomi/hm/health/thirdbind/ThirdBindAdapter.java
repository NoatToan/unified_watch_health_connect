package com.xiaomi.hm.health.thirdbind;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import com.xiaomi.hm.health.thirdbind.tencent.QQLogin;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ThirdBindAdapter extends BaseAdapter {
    private List<ThirdAppItem> a;
    private Context b;
    private LayoutInflater c;

    public class a extends HMLoadTarget<Drawable> {
        public final /* synthetic */ b a;
        public final /* synthetic */ String b;

        public a(final b val$holder, final String val$icon) {
            this.a = val$holder;
            this.b = val$icon;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Drawable resource) {
            if (this.a.a.getTag() == this.b) {
                this.a.a.setImageDrawable(resource);
            }
        }
    }

    public static class b {
        public ImageView a;
        public TextView b;
        public TextView c;
        public View d;
    }

    public ThirdBindAdapter(Context mContext) {
        this.b = mContext;
        this.c = LayoutInflater.from(mContext);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<ThirdAppItem> list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int position) {
        List<ThirdAppItem> list = this.a;
        if (list == null) {
            return null;
        }
        return list.get(position);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return getItem(position).hashCode();
    }

    public List<ThirdAppItem> getItems() {
        return this.a;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"InflateParams"})
    public View getView(int position, View convertView, ViewGroup parent) {
        b bVar;
        if (convertView == null) {
            convertView = this.c.inflate(R.layout.layout_bind_item, parent, false);
            bVar = new b();
            bVar.a = (ImageView) convertView.findViewById(R.id.bind_app_icon);
            bVar.b = (TextView) convertView.findViewById(R.id.bind_app_text);
            bVar.c = (TextView) convertView.findViewById(R.id.thirdbind_status);
            bVar.d = convertView.findViewById(R.id.divider);
            convertView.setTag(bVar);
        } else {
            bVar = (b) convertView.getTag();
        }
        ThirdAppItem thirdAppItem = this.a.get(position);
        if (thirdAppItem == null) {
            return convertView;
        }
        bVar.b.setText(thirdAppItem.getTitle());
        if (position == this.a.size() - 1) {
            bVar.d.setVisibility(8);
        } else {
            bVar.d.setVisibility(0);
        }
        if (thirdAppItem instanceof ThirdAuthItem) {
            bVar.a.setImageDrawable(null);
            String icon = ((ThirdAuthItem) thirdAppItem).getIcon();
            bVar.a.setTag(icon);
            HMImageLoader.with(this.b).asDrawable().load(icon).into(new a(bVar, icon));
            return convertView;
        }
        bVar.a.setTag(null);
        String id = thirdAppItem.getId();
        id.hashCode();
        if (id.equals("weixin")) {
            bVar.c.setText(R.string.bind_status_disconnect);
        } else if (id.equals("qq") && QQLogin.getInstance(this.b).isLoginValid()) {
            bVar.c.setText(R.string.bind_status_connect);
        }
        bVar.a.setImageDrawable(ContextCompat.getDrawable(this.b, thirdAppItem.getIconResId()));
        return convertView;
    }

    public void updateData(List<ThirdAppItem> list) {
        this.a = list;
        notifyDataSetChanged();
    }
}
