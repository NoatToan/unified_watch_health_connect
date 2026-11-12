package com.huawei.health.airsharing.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.hauwei.health.distributedservice.R;
import com.huawei.android.airsharing.api.ProjectionDevice;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class DeviceListAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<ProjectionDevice> f6189c = new ArrayList(10);
    private LayoutInflater d;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public DeviceListAdapter() {
    }

    public DeviceListAdapter(Context context) {
        if (context != null) {
            this.d = LayoutInflater.from(context);
        }
    }

    public void c(ProjectionDevice projectionDevice) {
        LogUtil.a("Distribute_DeviceListAdapter", "addDevice...");
        if (projectionDevice == null || b(projectionDevice)) {
            return;
        }
        this.f6189c.add(projectionDevice);
        notifyDataSetChanged();
    }

    public void d() {
        List<ProjectionDevice> list = this.f6189c;
        if (list != null) {
            list.clear();
            notifyDataSetChanged();
        }
    }

    public void a(ProjectionDevice projectionDevice) {
        LogUtil.a("Distribute_DeviceListAdapter", "removeDevice...");
        if (projectionDevice == null) {
            return;
        }
        Iterator<ProjectionDevice> it = this.f6189c.iterator();
        while (it.hasNext()) {
            ProjectionDevice next = it.next();
            if (next != null && TextUtils.equals(next.getDeviceName(), projectionDevice.getDeviceName()) && TextUtils.equals(next.getIndication(), projectionDevice.getIndication())) {
                it.remove();
                notifyDataSetChanged();
                return;
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f6189c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i >= getCount() || i < 0) {
            return null;
        }
        return this.f6189c.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        b bVar;
        if (viewGroup == null) {
            LogUtil.e("Distribute_DeviceListAdapter", "container is null");
        }
        if (view == null) {
            view = this.d.inflate(R.layout.projection_device_item_layout, (ViewGroup) null);
            bVar = new b();
            bVar.f6190b = (HealthTextView) view.findViewById(R.id.item_miracast_device_name);
            bVar.e = view.findViewById(R.id.item_miracast_device_line);
            view.setTag(bVar);
        } else {
            if (!(view.getTag() instanceof b)) {
                return null;
            }
            bVar = (b) view.getTag();
        }
        if (i == this.f6189c.size() - 1) {
            bVar.e.setVisibility(8);
        } else {
            bVar.e.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.f6189c.get(i).getDeviceName())) {
            bVar.f6190b.setText(this.f6189c.get(i).getDeviceName());
        }
        return view;
    }

    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f6190b;
        private View e;
    }

    private boolean b(ProjectionDevice projectionDevice) {
        if (projectionDevice == null) {
            return false;
        }
        for (ProjectionDevice projectionDevice2 : this.f6189c) {
            if (projectionDevice2 != null && TextUtils.equals(projectionDevice2.getDeviceName(), projectionDevice.getDeviceName()) && TextUtils.equals(projectionDevice2.getIndication(), projectionDevice.getIndication())) {
                return true;
            }
        }
        return false;
    }
}
