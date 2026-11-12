package com.huawei.ui.device.adapter;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.wearable.PutDataRequest;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.device.R;
import defpackage.qqf;
import defpackage.rba;
import defpackage.rdp;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class RightListAdapter extends BaseRecyclerAdapter<rba> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f24882b = {R.layout.item_all_device_right_band, R.layout.item_all_device_right_info, R.layout.item_all_device_right_info, R.layout.item_other_device_right_info};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24883a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24884c;
    private LruCache<String, Bitmap> d;

    public RightListAdapter(List<rba> list) {
        super(list, f24882b);
        this.f24883a = BaseApplication.getContext().getResources().getColor(R.color.colorAccent);
        LogUtil.a("RightListAdapter", "RightListAdapter init");
        this.d = new LruCache<String, Bitmap>(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8) { // from class: com.huawei.ui.device.adapter.RightListAdapter.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.util.LruCache
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int sizeOf(String str, Bitmap bitmap) {
                int width = (bitmap.getWidth() * bitmap.getHeight()) / 1024;
                if (width == 0) {
                    return 1;
                }
                return width;
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return super.getItemId(i);
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        rba rbaVar = get(i);
        if (rbaVar == null) {
            return 1;
        }
        int iT = rbaVar.t();
        if (iT == 1 || iT == 2) {
            return 0;
        }
        if (iT == 3) {
            return 1;
        }
        return iT == 5 ? 3 : 2;
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, rba rbaVar) {
        LogUtil.a("RightListAdapter", "start convert position: ", Integer.valueOf(i));
        if (rbaVar != null) {
            if (getItemViewType(i) == 0) {
                LogUtil.a("RightListAdapter", "kind: ", rbaVar.a());
                recyclerHolder.a(R.id.right_kind_name, rbaVar.a());
            } else if (getItemViewType(i) == 1) {
                e(recyclerHolder, i, rbaVar);
            } else if (getItemViewType(i) == 3) {
                recyclerHolder.a(R.id.other_type, rbaVar.g());
            } else {
                c(recyclerHolder, rbaVar, i);
            }
        }
    }

    private void e(RecyclerHolder recyclerHolder, int i, rba rbaVar) {
        LogUtil.a("RightListAdapter", "name: ", rbaVar.g(), " description: ", rbaVar.e(), " icon_path :", rbaVar.f());
        recyclerHolder.a(R.id.select_device_content, rbaVar.g());
        recyclerHolder.a(R.id.select_device_summary, rbaVar.e());
        c(recyclerHolder, i);
        a(recyclerHolder, rbaVar);
    }

    private void c(RecyclerHolder recyclerHolder, int i) {
        int i2 = i + 1;
        if (i2 >= getItemCount()) {
            recyclerHolder.e(R.id.select_device_summary_line, 4);
            recyclerHolder.e(R.id.band_margin, 8);
        } else if (getItemViewType(i2) == 0) {
            recyclerHolder.e(R.id.select_device_summary_line, 4);
            recyclerHolder.e(R.id.band_margin, 0);
        } else {
            recyclerHolder.e(R.id.select_device_summary_line, 0);
        }
    }

    private void c(RecyclerHolder recyclerHolder, rba rbaVar, int i) {
        if (!TextUtils.isEmpty(this.f24884c)) {
            recyclerHolder.a(R.id.select_device_content, rdp.b(this.f24883a, rbaVar.g(), this.f24884c));
            recyclerHolder.a(R.id.select_device_summary, rdp.b(this.f24883a, rbaVar.e(), this.f24884c));
        } else {
            recyclerHolder.a(R.id.select_device_content, rbaVar.g());
            recyclerHolder.a(R.id.select_device_summary, rbaVar.e());
        }
        c(recyclerHolder, i);
        a(recyclerHolder, rbaVar);
    }

    private void a(RecyclerHolder recyclerHolder, rba rbaVar) {
        Resources resources = recyclerHolder.itemView.getResources();
        View viewD = recyclerHolder.d(R.id.select_device_icon);
        if (viewD == null || resources == null || !(viewD instanceof ImageView)) {
            return;
        }
        ImageView imageView = (ImageView) viewD;
        if (rbaVar.d() == 1) {
            if (rbaVar.h().startsWith(PutDataRequest.WEAR_URI_SCHEME)) {
                Bitmap bitmapE = qqf.e(BitmapFactory.decodeResource(resources, rbaVar.k()), imageView);
                int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.emui_card_device_8dp);
                imageView.setPadding(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                recyclerHolder.a(R.id.select_device_icon, bitmapE);
                return;
            }
            imageView.setPadding(0, 0, 0, 0);
            recyclerHolder.c(R.id.select_device_icon, rbaVar.k());
        }
        imageView.setPadding(0, 0, 0, 0);
        if (rbaVar.f() != null) {
            if (this.d.get(rbaVar.f()) != null) {
                LogUtil.a("RightListAdapter", "handleDeviceItem has cache");
                recyclerHolder.a(R.id.select_device_icon, this.d.get(rbaVar.f()));
                return;
            }
            Bitmap bitmapLoadImageByImagePath = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImagePath(rbaVar.f());
            if (bitmapLoadImageByImagePath != null) {
                recyclerHolder.a(R.id.select_device_icon, bitmapLoadImageByImagePath);
                this.d.put(rbaVar.f(), bitmapLoadImageByImagePath);
                LogUtil.a("RightListAdapter", "handleDeviceItem add cache");
            }
        }
    }

    public void c(String str) {
        this.f24884c = str;
    }
}
