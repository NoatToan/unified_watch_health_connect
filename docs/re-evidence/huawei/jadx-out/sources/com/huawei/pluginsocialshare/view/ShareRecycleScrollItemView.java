package com.huawei.pluginsocialshare.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.pkm;
import defpackage.plg;
import defpackage.pmu;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes15.dex */
public class ShareRecycleScrollItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f22624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f22625c;
    private RelativeLayout d;
    private ImageView e;
    private TextView h;
    private CustomViewDialog i;
    private ShareDataInfo j;

    public ShareRecycleScrollItemView(Context context) {
        super(context);
        e(context);
    }

    public ShareRecycleScrollItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public ShareRecycleScrollItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }

    private void e(Context context) {
        View viewInflate = View.inflate(context, R.layout.hw_health_edit_share_gridview_item, null);
        this.f22625c = (ImageView) viewInflate.findViewById(R.id.hw_health_edit_share_download);
        this.d = (RelativeLayout) viewInflate.findViewById(R.id.hw_health_edit_share_downloading);
        this.h = (TextView) viewInflate.findViewById(R.id.hw_health_edit_share_new);
        this.e = (ImageView) viewInflate.findViewById(R.id.hw_health_edit_share_gridview_img);
        this.f22624b = (ImageView) viewInflate.findViewById(R.id.hw_health_edit_share_select);
        qqf.d(R.mipmap.hw_health_edit_share_select_img, this.f22624b);
        addView(viewInflate);
    }

    public void setShowSelected(boolean z) {
        if (z) {
            this.f22624b.setVisibility(0);
            this.f22623a = true;
        } else {
            this.f22624b.setVisibility(8);
            this.f22623a = false;
        }
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f22623a;
    }

    public void setShowNew(boolean z) {
        if (z) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
    }

    public void setShowDown(boolean z) {
        if (z) {
            this.f22625c.setVisibility(0);
        } else {
            this.f22625c.setVisibility(8);
        }
    }

    public void setDownloading(Activity activity, boolean z) {
        if (z && activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: ppi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45766c.d();
                }
            });
        } else {
            this.d.setVisibility(8);
        }
    }

    public /* synthetic */ void d() {
        this.d.setVisibility(0);
        this.h.setVisibility(8);
        this.f22625c.setVisibility(8);
    }

    public void setContentViewImage(ShareDataInfo shareDataInfo) {
        this.j = shareDataInfo;
        this.h.setVisibility(8);
        if (this.f22623a) {
            this.f22624b.setVisibility(0);
        } else {
            this.f22624b.setVisibility(8);
        }
        if (shareDataInfo instanceof pmu) {
            pmu pmuVar = (pmu) shareDataInfo;
            this.f22625c.setVisibility(8);
            this.h.setVisibility(8);
            if (pmuVar.getId() != -1) {
                this.e.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            }
            qqf.d(pmuVar.e(), this.e);
            return;
        }
        a(this.e, shareDataInfo);
    }

    public ShareDataInfo getShareDataInfo() {
        return this.j;
    }

    private void a(ImageView imageView, ShareDataInfo shareDataInfo) {
        if (shareDataInfo == null || TextUtils.isEmpty(shareDataInfo.getPath())) {
            LogUtil.a("Share_ShareRecycleScrollItemView", "loadItemImageViewByPath params null");
            return;
        }
        File file = new File(CommonUtil.c(shareDataInfo.getPath()));
        if (shareDataInfo instanceof plg) {
            if (!file.exists()) {
                this.f22625c.setVisibility(0);
                this.h.setVisibility(0);
            } else {
                this.f22625c.setVisibility(8);
                this.h.setVisibility(8);
            }
            qqf.e(shareDataInfo.getUrl(), new RequestOptions().centerCrop(), imageView);
            return;
        }
        if (file.exists()) {
            LogUtil.a("Share_ShareRecycleScrollItemView", "path file size:", Long.valueOf(file.length()), " cloudSize:", Integer.valueOf(shareDataInfo.getImageSize()));
            if (file.length() >= shareDataInfo.getImageSize()) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                RequestOptions requestOptionsCenterInside = new RequestOptions().centerInside();
                LogUtil.a("Share_ShareRecycleScrollItemView", "file exit");
                this.f22625c.setVisibility(8);
                this.h.setVisibility(8);
                qqf.c(file, requestOptionsCenterInside, imageView);
            }
        }
    }

    public void c(final Activity activity) {
        Object systemService = activity.getSystemService("layout_inflater");
        if (!(systemService instanceof LayoutInflater)) {
            LogUtil.e("Share_ShareRecycleScrollItemView", "object is not instanceof Inflater");
            return;
        }
        View viewInflate = ((LayoutInflater) systemService).inflate(com.huawei.health.servicesui.R.layout.hw_health_edit_share_camera_dialog, (ViewGroup) null);
        if (this.i == null) {
            this.i = new CustomViewDialog.Builder(activity).d(viewInflate).d();
        }
        this.i.show();
        ((HealthTextView) viewInflate.findViewById(R.id.hw_health_edit_share_caerma)).setOnClickListener(new View.OnClickListener() { // from class: ppb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45756b.b(activity, view);
            }
        });
        ((HealthTextView) viewInflate.findViewById(R.id.hw_health_edit_share_gallery)).setOnClickListener(new View.OnClickListener() { // from class: ppe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(activity, view);
            }
        });
    }

    public /* synthetic */ void b(Activity activity, View view) {
        PermissionUtil.d(activity, PermissionUtil.PermissionType.CAMERA, new b(activity));
        CustomViewDialog customViewDialog = this.i;
        if (customViewDialog != null) {
            customViewDialog.dismiss();
        }
    }

    public /* synthetic */ void a(Activity activity, View view) {
        qrs.c(activity, 2);
        CustomViewDialog customViewDialog = this.i;
        if (customViewDialog != null) {
            customViewDialog.dismiss();
        }
    }

    static class b extends CustomPermissionAction {
        private final WeakReference<Activity> e;

        private b(Activity activity) {
            super(activity);
            this.e = new WeakReference<>(activity);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            Activity activity = this.e.get();
            if (activity == null) {
                ReleaseLogUtil.e("Share_ShareRecycleScrollItemView", "activity is null in WeakReferenceCustomPermissionAction");
            } else {
                pkm.d(activity);
            }
        }
    }
}
