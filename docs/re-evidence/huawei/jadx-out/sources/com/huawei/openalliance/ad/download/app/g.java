package com.huawei.openalliance.ad.download.app;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.PermissionEntity;
import com.huawei.openalliance.ad.utils.bm;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
class g extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f18544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<PermissionEntity> f18545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f18546c;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069 A[PHI: r0 r7 r8
      0x0069: PHI (r0v8 java.lang.String) = (r0v4 java.lang.String), (r0v10 java.lang.String) binds: [B:23:0x0066, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0069: PHI (r7v6 android.view.View) = (r7v1 android.view.View), (r7v7 android.view.View) binds: [B:23:0x0066, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0069: PHI (r8v9 android.widget.TextView) = (r8v4 android.widget.TextView), (r8v13 android.widget.TextView) binds: [B:23:0x0066, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        b bVar;
        String name;
        TextView textView;
        a aVar;
        PermissionEntity permissionEntity = this.f18545b.get(i);
        int itemViewType = getItemViewType(i);
        String str = "";
        if (itemViewType == 0) {
            if (view == null) {
                view = this.f18546c.inflate(R.layout.hiad_permission_dialog_parent_item, viewGroup, false);
                bVar = new b(view);
                view.setTag(bVar);
            } else {
                bVar = (b) view.getTag();
            }
            name = permissionEntity != null ? permissionEntity.getName() : "";
            textView = bVar.f18548a;
            if (!TextUtils.isEmpty(name)) {
                str = name;
            }
            textView.setText(str);
        } else if (itemViewType == 1) {
            if (view == null) {
                view = this.f18546c.inflate(R.layout.hiad_permission_dialog_child_item, viewGroup, false);
                aVar = new a(view);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            name = permissionEntity != null ? permissionEntity.getName() : "";
            textView = aVar.f18547a;
            if (!TextUtils.isEmpty(name)) {
                str = name;
            }
            textView.setText(str);
        }
        hw.a("AppPermissionsDialog", "getView, time:%d, position:%d", Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i));
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (bm.a(this.f18545b) || this.f18545b.get(i) == null) {
            return 0;
        }
        return this.f18545b.get(i).getType();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        if (bm.a(this.f18545b)) {
            return 0L;
        }
        return i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (bm.a(this.f18545b)) {
            return null;
        }
        return this.f18545b.get(i);
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        TextView f18547a;

        public a(View view) {
            this.f18547a = (TextView) view.findViewById(R.id.hiad_permissions_dialog_child_tv);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        TextView f18548a;

        public b(View view) {
            this.f18548a = (TextView) view.findViewById(R.id.hiad_permissions_dialog_parent_tv);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (bm.a(this.f18545b)) {
            return 0;
        }
        return this.f18545b.size();
    }

    public g(Context context, List<PermissionEntity> list) {
        this.f18544a = context;
        this.f18545b = list;
        this.f18546c = LayoutInflater.from(context);
    }
}
