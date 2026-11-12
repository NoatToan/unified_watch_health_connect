package com.huami.watch.companion.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.watch.companion.R;
import com.huami.watch.companion.ui.bean.AppInfo;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class AppSettingAdapter extends RecyclerView.Adapter<a> {
    private List<AppInfo> a;
    private Context b;
    private OnItemClickListener c;
    private boolean d;

    public interface OnItemClickListener {
        void onItemClick(int i, AppInfo appInfo);

        void onItemDelete(int i, AppInfo appInfo);
    }

    public class a extends RecyclerView.ViewHolder {
        private TextView a;
        private ImageView b;
        private View c;
        private ImageView d;

        public a(View view) {
            super(view);
            this.c = view;
            this.a = (TextView) view.findViewById(R.id.title);
            this.b = (ImageView) view.findViewById(R.id.icon);
            this.d = (ImageView) view.findViewById(R.id.iv_delete);
        }
    }

    public AppSettingAdapter(Context context, List<AppInfo> list) {
        this.b = context;
        this.a = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i, AppInfo appInfo, View view) {
        this.c.onItemClick(i, appInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i, AppInfo appInfo, View view) {
        this.c.onItemDelete(i, appInfo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.a.size();
    }

    public boolean isEdit() {
        return this.d;
    }

    public void setEdit(boolean z) {
        this.d = z;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.c = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @RequiresApi(api = 23)
    public void onBindViewHolder(a aVar, final int i) {
        final AppInfo appInfo = this.a.get(i);
        if (appInfo != null) {
            int status = appInfo.getStatus();
            aVar.a.setText(appInfo.getTitle());
            aVar.b.setImageResource(appInfo.getIconRes());
            if (status == 1) {
                aVar.b.setAlpha(1.0f);
            } else if (status == 0) {
                aVar.b.setAlpha(0.3f);
            }
            if (isEdit() && appInfo.getCore() == 0 && status == 1) {
                aVar.d.setVisibility(0);
            } else {
                aVar.d.setVisibility(4);
            }
            if (this.c != null) {
                aVar.c.setOnClickListener(new View.OnClickListener() { // from class: ci
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.c(i, appInfo, view);
                    }
                });
                aVar.d.setOnClickListener(new View.OnClickListener() { // from class: di
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.d(i, appInfo, view);
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(this.b).inflate(R.layout.app_setting_list_item, viewGroup, false));
    }
}
