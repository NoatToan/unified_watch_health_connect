package com.huawei.ui.device.activity.autoscandevice;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.wearable.PutDataRequest;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import defpackage.edl;
import defpackage.edn;
import defpackage.eds;
import defpackage.eep;
import defpackage.lvi;
import defpackage.qum;
import defpackage.qun;
import defpackage.rcv;
import defpackage.xjt;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class GalleryAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnItemClickListener f24253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<BluetoothDevice> f24254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f24255c;
    private LayoutInflater d;
    private List<Boolean> e = new ArrayList(16);

    public interface OnItemClickListener {
        void onClick(int i);
    }

    public GalleryAdapter(Context context, ArrayList<BluetoothDevice> arrayList) {
        this.f24255c = new ArrayList(16);
        this.d = LayoutInflater.from(context);
        this.f24255c = lvi.b();
        this.f24254b = arrayList;
        if (this.f24254b == null) {
            LogUtil.j(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "GalleryAdapter", "GalleryAdapter mDataList is null");
            return;
        }
        for (int i = 0; i < this.f24254b.size(); i++) {
            if (i == 0) {
                this.e.add(true);
            } else {
                this.e.add(false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(this.d.inflate(R.layout.device_auto_scan_recycler_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (this.e.get(i).booleanValue()) {
            viewHolder.e.setChecked(true);
        } else {
            viewHolder.e.setChecked(false);
        }
        if (i == this.f24254b.size() - 1) {
            viewHolder.h.setVisibility(0);
            viewHolder.g.setVisibility(8);
        } else {
            viewHolder.h.setVisibility(8);
            viewHolder.g.setVisibility(0);
        }
        if (i == 0) {
            viewHolder.f24258c.setVisibility(0);
        } else {
            viewHolder.f24258c.setVisibility(8);
        }
        if (this.f24254b.size() > 1) {
            viewHolder.f24258c.setVisibility(8);
            viewHolder.g.setVisibility(0);
            viewHolder.h.setVisibility(8);
        }
        if (this.f24254b.size() == 1) {
            viewHolder.e.setVisibility(8);
            viewHolder.d.setGravity(17);
        } else {
            viewHolder.e.setVisibility(0);
            viewHolder.d.setGravity(16);
        }
        try {
            if (c(this.f24254b.get(i).getName()) || e(this.f24254b.get(i).getName())) {
                viewHolder.d.setText(this.f24254b.get(i).getName());
                int iB = rcv.b(this.f24254b.get(i).getName());
                if (lvi.n(iB)) {
                    c(viewHolder, iB, this.f24254b.get(i).getName());
                } else {
                    viewHolder.f24257b.setImageResource(a(this.f24254b.get(i).getName()));
                }
            } else {
                viewHolder.d.setText(this.f24254b.get(i).getAddress());
            }
            b(viewHolder, i);
        } catch (SecurityException e) {
            LogUtil.e("GalleryAdapter", "onBindViewHolder SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void b(ViewHolder viewHolder, final int i) {
        viewHolder.f24256a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.autoscandevice.GalleryAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                for (int i2 = 0; i2 < GalleryAdapter.this.e.size(); i2++) {
                    GalleryAdapter.this.e.set(i2, false);
                }
                GalleryAdapter.this.e.set(i, true);
                GalleryAdapter.this.notifyDataSetChanged();
                if (GalleryAdapter.this.f24253a != null) {
                    GalleryAdapter.this.f24253a.onClick(i);
                }
            }
        });
    }

    private void c(ViewHolder viewHolder, int i, String str) {
        edl pluginInfoByUuid;
        Bitmap bitmapLoadImageByImageName;
        if (!((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(lvi.j(i)) || (pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(i))) == null || pluginInfoByUuid.i() == null) {
            return;
        }
        String strE = qum.b().e(str);
        if (TextUtils.isEmpty(strE)) {
            bitmapLoadImageByImageName = null;
        } else {
            String strA = a(strE, i, pluginInfoByUuid);
            LogUtil.a("GalleryAdapter", "handlerIsPluginDownload productId:", strE, "imageName:", strA);
            if (!TextUtils.isEmpty(strA)) {
                bitmapLoadImageByImageName = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(pluginInfoByUuid, strA);
            } else {
                LogUtil.j("GalleryAdapter", "handlerIsPluginDownload imageName not contains productId");
                bitmapLoadImageByImageName = null;
            }
        }
        if (bitmapLoadImageByImageName == null) {
            if (pluginInfoByUuid.i().ad() == null || pluginInfoByUuid.i().ad().isEmpty()) {
                viewHolder.f24257b.setImageResource(a(str));
                return;
            } else {
                LogUtil.a("GalleryAdapter", "bitmap is null get default bitmap");
                bitmapLoadImageByImageName = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(pluginInfoByUuid, pluginInfoByUuid.i().ad().get(0));
            }
        }
        if (bitmapLoadImageByImageName != null) {
            LogUtil.a("GalleryAdapter", "bitmap is not null");
            viewHolder.f24257b.setImageBitmap(bitmapLoadImageByImageName);
        } else {
            viewHolder.f24257b.setImageResource(a(str));
            LogUtil.j("GalleryAdapter", "bitmap is null");
        }
    }

    private String a(String str, int i, edl edlVar) {
        DeviceInfo deviceInfo = new DeviceInfo();
        if (str.contains(Constants.LINK)) {
            String string = i == 72 ? new StringBuilder(str).insert(2, Constants.LINK).toString() : str;
            deviceInfo.setDeviceModel(string);
            String strE = eep.e(edlVar, 1, deviceInfo);
            if (!TextUtils.isEmpty(strE) && strE.contains(string)) {
                return strE;
            }
            str = str.split(Constants.LINK)[0];
        }
        deviceInfo.setHiLinkDeviceId(str);
        deviceInfo.setDeviceModel(null);
        String strE2 = eep.e(edlVar, 1, deviceInfo);
        if (!TextUtils.isEmpty(strE2) && strE2.contains(str)) {
            return strE2;
        }
        xjt.g("auto scan get product id image is error");
        LogUtil.j("GalleryAdapter", "handlerIsPluginDownload imageName not contains productId");
        return strE2;
    }

    private int a(String str) {
        edn ednVarA = lvi.a(rcv.b(str));
        if (ednVarA != null && ednVarA.n().size() > 0) {
            return ednVarA.n().get(0).intValue();
        }
        return R.drawable.ic_spinner_scan_band;
    }

    private boolean c(String str) {
        return qun.d(str, this.f24255c);
    }

    private boolean e(String str) {
        try {
            List<eds> deviceList = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceList();
            ArrayList arrayList = new ArrayList(16);
            for (eds edsVar : deviceList) {
                if (edsVar.c() == 0 && edsVar.s() != null && edsVar.s().startsWith(PutDataRequest.WEAR_URI_SCHEME)) {
                    arrayList.addAll(edsVar.d());
                }
            }
            return qun.d(str, arrayList);
        } catch (ConcurrentModificationException unused) {
            LogUtil.e("GalleryAdapter", "filterToNamesByCloud, is error");
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList<BluetoothDevice> arrayList = this.f24254b;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public void b(OnItemClickListener onItemClickListener) {
        this.f24253a = onItemClickListener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        LinearLayout f24256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f24257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        View f24258c;
        HealthTextView d;
        HealthCheckBox e;
        View g;
        View h;

        public ViewHolder(View view) {
            super(view);
            this.f24257b = (ImageView) view.findViewById(R.id.equipment_image);
            this.d = (HealthTextView) view.findViewById(R.id.equipment_name);
            this.f24256a = (LinearLayout) view.findViewById(R.id.equipment_layout);
            this.e = (HealthCheckBox) view.findViewById(R.id.equipment_cb);
            this.f24258c = view.findViewById(R.id.left_layout);
            this.g = view.findViewById(R.id.right_layout);
            this.h = view.findViewById(R.id.right_layout_24);
        }
    }
}
