package com.huawei.ui.homehealth.device.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.sitting.RecommendedItem;
import defpackage.qji;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceRecommendedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<RecommendedItem> f25267a = new ArrayList(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RecommendListener f25268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f25269c;
    private int d;
    private LayoutInflater e;
    private int h;

    public interface RecommendListener {
        void onPersonalEquipment(RecommendedItem recommendedItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    public DeviceRecommendedAdapter(Context context) {
        this.f25269c = context;
        this.e = LayoutInflater.from(context);
    }

    public void d(List<RecommendedItem> list) {
        this.f25267a = new ArrayList(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return (getItemCount() == 1 || getItemCount() == 2 || Utils.o()) ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LogUtil.a("DeviceRecommendedAdapter", "getItemCount() = ", Integer.valueOf(getItemCount()), " isOversea() = ", Boolean.valueOf(Utils.o()));
        if (i == 0) {
            return new RecommendOneViewHolder(this.e.inflate(R.layout.fragment_device_recommend_one_item, viewGroup, false));
        }
        return new RecommendVmallViewHolder(this.e.inflate(R.layout.fragment_device_recommend_vmall_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof RecommendOneViewHolder) {
            e((RecommendOneViewHolder) viewHolder, i);
        } else {
            e((RecommendVmallViewHolder) viewHolder, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.huawei.ui.homehealth.device.adapter.DeviceRecommendedAdapter.5
                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public int getSpanSize(int i) {
                    return 1;
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f25267a.size();
    }

    private void e(RecommendOneViewHolder recommendOneViewHolder, int i) {
        if (i < 0 || i >= this.f25267a.size()) {
            return;
        }
        RecommendedItem recommendedItem = this.f25267a.get(i);
        d(recommendedItem);
        c(recommendOneViewHolder, this.d, this.h, recommendedItem);
    }

    private void e(RecommendVmallViewHolder recommendVmallViewHolder, int i) {
        if (i < 0 || i >= this.f25267a.size()) {
            return;
        }
        RecommendedItem recommendedItem = this.f25267a.get(i);
        d(recommendedItem);
        a(recommendVmallViewHolder, this.d, this.h, recommendedItem);
    }

    private void d(RecommendedItem recommendedItem) {
        int id = recommendedItem.getId();
        if (!Utils.o()) {
            switch (id) {
                case 1:
                    this.d = R.mipmap.img_setup_watchface;
                    int i = R.string.IDS_watchface_watchface;
                    this.h = i;
                    LogUtil.a("DeviceRecommendedAdapter", "ID_DEVICE_SETTING_WATCH_FACE mTitle = ", Integer.valueOf(i));
                    break;
                case 2:
                    this.d = R.mipmap.img_setup_music;
                    int i2 = R.string.IDS_device_music;
                    this.h = i2;
                    LogUtil.a("DeviceRecommendedAdapter", "ID_DEVICE_SETTING_MUSIC mTitle = ", Integer.valueOf(i2));
                    break;
                case 3:
                    this.d = R.mipmap.img_setup_wallet;
                    this.h = R.string.IDS_device_wallet;
                    break;
                case 4:
                    this.d = R.mipmap.img_setup_app_market;
                    this.h = R.string.IDS_device_application;
                    break;
                case 5:
                    this.d = R.mipmap.img_setup_help_guide;
                    this.h = R.string.IDS_main_discovery_tab_service_help;
                    break;
                case 6:
                    this.d = R.mipmap.img_setup_my_watchface;
                    this.h = R.string.IDS_my_watchface;
                    break;
                default:
                    this.d = R.mipmap.img_setup_watchface;
                    this.h = R.string.IDS_device_watch_face;
                    break;
            }
            return;
        }
        e(id);
    }

    private void e(int i) {
        switch (i) {
            case 1:
                this.d = R.mipmap.img_setup_watchface;
                this.h = R.string.IDS_watchface_watchface;
                break;
            case 2:
                this.d = R.mipmap.img_setup_music;
                this.h = R.string.IDS_hwh_motiontrack_music;
                break;
            case 3:
                this.d = R.mipmap.img_setup_oversea_wallet;
                this.h = R.string.IDS_device_wallet;
                break;
            case 4:
                this.d = R.mipmap.img_setup_app_market;
                this.h = R.string.IDS_device_fragment_application_market;
                break;
            case 5:
                this.d = R.mipmap.img_setup_help_guide;
                this.h = R.string.IDS_main_discovery_tab_service_help;
                break;
            case 6:
                this.d = R.mipmap.img_setup_my_watchface;
                this.h = R.string.IDS_my_watchface;
                break;
            default:
                this.d = R.mipmap.img_setup_watchface;
                this.h = R.string.IDS_watchface_watchface;
                break;
        }
    }

    private int e() {
        return (int) (this.f25269c.getResources().getDisplayMetrics().widthPixels / 4.0f);
    }

    private void c(RecommendOneViewHolder recommendOneViewHolder, int i, int i2, RecommendedItem recommendedItem) {
        if (this.f25269c == null) {
            this.f25269c = BaseApplication.getContext();
        }
        recommendOneViewHolder.f25272c.setVisibility(0);
        if (qrs.v()) {
            LogUtil.a("DeviceRecommendedAdapter", "isLargeFontScaleMode");
            recommendOneViewHolder.d.setMaxLines(2);
            recommendOneViewHolder.d.setMaxEms(2);
            if (recommendedItem.getId() == 1 && LanguageUtil.l(BaseApplication.getContext())) {
                recommendOneViewHolder.d.setText(this.f25269c.getResources().getString(i2) + "\n    ");
            } else {
                recommendOneViewHolder.d.setText(this.f25269c.getResources().getString(i2));
            }
        } else {
            LogUtil.a("DeviceRecommendedAdapter", "no isLargeFontScaleMode");
            recommendOneViewHolder.d.setText(this.f25269c.getResources().getString(i2));
        }
        recommendOneViewHolder.f25271b.setImageResource(i);
        if (recommendedItem.getId() == 4 && recommendedItem.isShowRedDot()) {
            recommendOneViewHolder.f25270a.setVisibility(0);
        } else {
            recommendOneViewHolder.f25270a.setVisibility(4);
        }
        b(recommendOneViewHolder.f25272c, recommendedItem);
    }

    private void a(RecommendVmallViewHolder recommendVmallViewHolder, int i, int i2, RecommendedItem recommendedItem) {
        if (this.f25269c == null) {
            this.f25269c = BaseApplication.getContext();
        }
        recommendVmallViewHolder.f25275c.setVisibility(0);
        if (!qrs.af(this.f25269c) && qrs.v() && !Utils.o() && this.f25267a.size() > 3) {
            ViewGroup.LayoutParams layoutParams = recommendVmallViewHolder.f25275c.getLayoutParams();
            layoutParams.width = e();
            layoutParams.height = -2;
            recommendVmallViewHolder.f25275c.setLayoutParams(layoutParams);
        }
        if (qrs.v()) {
            LogUtil.a("DeviceRecommendedAdapter", "vmall isLargeFontScaleMode");
            recommendVmallViewHolder.f25273a.setMaxLines(2);
            recommendVmallViewHolder.f25273a.setMaxEms(2);
            if (recommendedItem.getId() == 1 && LanguageUtil.l(BaseApplication.getContext())) {
                recommendVmallViewHolder.f25273a.setText(this.f25269c.getResources().getString(i2) + "\n    ");
            } else {
                recommendVmallViewHolder.f25273a.setText(this.f25269c.getResources().getString(i2));
            }
        } else {
            LogUtil.a("DeviceRecommendedAdapter", "vmall no isLargeFontScaleMode");
            recommendVmallViewHolder.f25273a.setText(this.f25269c.getResources().getString(i2));
        }
        recommendVmallViewHolder.e.setImageResource(i);
        if (recommendedItem.getId() == 4 && recommendedItem.isShowRedDot()) {
            recommendVmallViewHolder.f25274b.setVisibility(0);
        } else {
            recommendVmallViewHolder.f25274b.setVisibility(4);
        }
        b(recommendVmallViewHolder.f25275c, recommendedItem);
    }

    private void b(LinearLayout linearLayout, final RecommendedItem recommendedItem) {
        if (linearLayout != null) {
            Context context = this.f25269c;
            BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
            if (baseActivity != null) {
                linearLayout.setOnClickListener(qji.b(new View.OnClickListener() { // from class: rok
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.e.d(recommendedItem, view);
                    }
                }, baseActivity, true, ""));
            }
        }
    }

    public /* synthetic */ void d(RecommendedItem recommendedItem, View view) {
        RecommendListener recommendListener = this.f25268b;
        if (recommendListener != null) {
            recommendListener.onPersonalEquipment(recommendedItem);
        }
    }

    public void b(RecommendListener recommendListener) {
        this.f25268b = recommendListener;
    }

    public static class RecommendOneViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f25270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f25271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        LinearLayout f25272c;
        HealthTextView d;

        public RecommendOneViewHolder(View view) {
            super(view);
            if (view == null) {
                LogUtil.j("DeviceRecommendedAdapter", "itemView is null");
                return;
            }
            this.f25272c = (LinearLayout) view.findViewById(R.id.item_layout);
            this.d = (HealthTextView) view.findViewById(R.id.recommend_device_name);
            this.f25271b = (ImageView) view.findViewById(R.id.recommend_device_image);
            this.f25270a = (ImageView) view.findViewById(R.id.device_app_update_red_dot);
        }
    }

    public static class RecommendVmallViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f25273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f25274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        LinearLayout f25275c;
        ImageView e;

        public RecommendVmallViewHolder(View view) {
            super(view);
            if (view == null) {
                LogUtil.j("DeviceRecommendedAdapter", "itemView is null");
                return;
            }
            this.f25275c = (LinearLayout) view.findViewById(R.id.vmall_item_layout);
            this.f25273a = (HealthTextView) view.findViewById(R.id.vmall_recommend_device_name);
            this.e = (ImageView) view.findViewById(R.id.vmall_recommend_device_image);
            this.f25274b = (ImageView) view.findViewById(R.id.vmall_device_app_update_red_dot);
        }
    }
}
