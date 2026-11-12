package com.huawei.ui.device.views.adddevice;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmgr.filedownload.PullListener;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import defpackage.lvi;
import defpackage.rfk;
import health.compact.a.EzPluginManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class SelectDeviceListAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<rfk> f24980a;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }

    public SelectDeviceListAdapter(List<rfk> list) {
        ArrayList arrayList = new ArrayList();
        this.f24980a = arrayList;
        arrayList.clear();
        this.f24980a.addAll(list);
    }

    public void a(List<rfk> list) {
        this.f24980a.clear();
        this.f24980a.addAll(list);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f24980a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f24980a.get(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return this.f24980a.get(i).e();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            rfk rfkVar = this.f24980a.get(i);
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                return d(view, viewGroup, rfkVar);
            }
            if (itemViewType == 1) {
                return d(i, view, viewGroup, rfkVar);
            }
            if (itemViewType == 2) {
                return e(view, viewGroup, rfkVar);
            }
            LogUtil.j("SelectDeviceListAdapter", " getView default warning ");
            return d(i, view, viewGroup, rfkVar);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    private View d(View view, ViewGroup viewGroup, rfk rfkVar) {
        b bVarC;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_select_device_list_item_title, viewGroup, false);
            bVarC = c(view);
            view.setClickable(false);
            view.setTag(bVarC);
        } else {
            bVarC = (b) view.getTag();
        }
        e(bVarC, rfkVar);
        return view;
    }

    private void e(b bVar, rfk rfkVar) {
        bVar.f24982c.setText(rfkVar.h());
        if (rfkVar.k()) {
            bVar.f24981a.setVisibility(0);
        } else {
            bVar.f24981a.setVisibility(4);
        }
    }

    private View d(int i, View view, ViewGroup viewGroup, rfk rfkVar) {
        e eVarE;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_select_device_list_item_info, viewGroup, false);
            BaseActivity.setViewSafeRegion(false, view);
            eVarE = e(view);
            view.setTag(eVarE);
        } else {
            eVarE = view.getTag() instanceof e ? (e) view.getTag() : null;
        }
        if (eVarE != null) {
            a(viewGroup.getContext(), eVarE, rfkVar, i);
        }
        if (rfkVar.i() != null) {
            view.setOnClickListener(rfkVar.i());
        }
        return view;
    }

    private View e(View view, ViewGroup viewGroup, rfk rfkVar) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_select_device_list_item_more, viewGroup, false);
            BaseActivity.setViewSafeRegion(false, view);
        }
        if (rfkVar.i() != null) {
            view.setOnClickListener(rfkVar.i());
        }
        return view;
    }

    private b c(View view) {
        b bVar = new b();
        bVar.f24981a = view.findViewById(R.id.subheader_splitter);
        bVar.f24982c = (HealthTextView) view.findViewById(R.id.item_title);
        return bVar;
    }

    private e e(View view) {
        e eVar = new e();
        eVar.d = (HealthTextView) view.findViewById(R.id.select_device_content);
        eVar.e = (HealthTextView) view.findViewById(R.id.select_device_summary);
        eVar.f24985c = (ImageView) view.findViewById(R.id.select_device_icon);
        eVar.f24983a = view.findViewById(R.id.select_device_summary_line);
        eVar.f24984b = (ImageView) view.findViewById(R.id.rightarrow_icon);
        return eVar;
    }

    private void a(Context context, e eVar, rfk rfkVar, int i) {
        if (LanguageUtil.ba(context)) {
            eVar.d.setGravity(5);
            eVar.e.setGravity(5);
            eVar.f24984b.setImageDrawable(context.getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            eVar.d.setGravity(3);
            eVar.e.setGravity(3);
            eVar.f24984b.setImageDrawable(context.getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
        if (!a(i, eVar.f24983a)) {
            if (this.f24980a.size() > 1 && i == this.f24980a.size() - 1) {
                eVar.f24983a.setVisibility(4);
            } else {
                eVar.f24983a.setVisibility(0);
            }
        }
        d(rfkVar, eVar.d);
        if (rfkVar.f() != null) {
            eVar.e.setText(rfkVar.f());
            eVar.e.setVisibility(0);
        } else {
            eVar.e.setVisibility(8);
        }
        if (rfkVar.j()) {
            eVar.f24985c.setBackgroundResource(0);
            Bitmap bitmapLoadImageByImagePath = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImagePath(rfkVar.d());
            if (bitmapLoadImageByImagePath != null) {
                eVar.f24985c.setImageBitmap(bitmapLoadImageByImagePath);
            } else {
                LogUtil.j("SelectDeviceListAdapter", "setItemStyle() item.isFromPlugin() bitmap is null");
                EzPluginManager.b().b(lvi.d(rfkVar.a()), (PullListener) null);
            }
            eVar.f24985c.setVisibility(0);
            return;
        }
        if (rfkVar.g() != -1) {
            eVar.f24985c.setBackgroundResource(rfkVar.g());
            eVar.f24985c.setImageBitmap(null);
            eVar.f24985c.setVisibility(0);
            return;
        }
        eVar.f24985c.setVisibility(8);
    }

    private void d(rfk rfkVar, HealthTextView healthTextView) {
        if (rfkVar.c() != null) {
            healthTextView.setText(rfkVar.c());
            healthTextView.setVisibility(0);
        } else {
            healthTextView.setVisibility(8);
        }
    }

    private boolean a(int i, View view) {
        if (view == null) {
            return false;
        }
        int i2 = i + 1;
        if (i2 >= getCount()) {
            view.setVisibility(4);
            return true;
        }
        if (getItemViewType(i2) != 0) {
            return false;
        }
        view.setVisibility(4);
        return true;
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f24983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f24984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f24985c;
        HealthTextView d;
        HealthTextView e;

        private e() {
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f24981a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f24982c;

        private b() {
        }
    }
}
