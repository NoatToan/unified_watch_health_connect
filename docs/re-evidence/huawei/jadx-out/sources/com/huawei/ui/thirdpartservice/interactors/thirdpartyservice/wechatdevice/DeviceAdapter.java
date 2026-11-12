package com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.wechatdevice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.thirdpartservice.R;
import defpackage.njy;
import defpackage.qqf;
import defpackage.xcp;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class DeviceAdapter extends RecyclerView.Adapter<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29149a;
    private RecyclerView d;
    private CallBack e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<xcp> f29150b = new ArrayList();
    private int i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29151c = 0;

    public interface CallBack {
        void onItemClicked(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e eVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        a((e) viewHolder, i, (List<Object>) list);
    }

    public DeviceAdapter(Context context, RecyclerView recyclerView) {
        this.f29149a = context;
        this.d = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(this.f29149a).inflate(R.layout.item_wechat_device, viewGroup, false);
        if (this.f29151c == 0) {
            viewInflate.setBackground(this.f29149a.getDrawable(R.drawable.card_device_item_gradient_bg));
        } else {
            viewInflate.setBackgroundColor(this.f29149a.getColor(R.color.health_chart_extend_background_color));
        }
        return new e(viewInflate);
    }

    public void a(final e eVar, int i, List<Object> list) {
        if (njy.e(this.f29150b) || i >= this.f29150b.size()) {
            return;
        }
        xcp xcpVar = this.f29150b.get(i);
        if (this.f29151c == 0) {
            a(eVar.f29152a, xcpVar);
            eVar.e.setText(xcpVar.getDeviceName());
            eVar.f29153b.setText(R.string.IDS_wx_device_local_unbound);
            eVar.f29153b.setVisibility(xcpVar.isLocalBound() ? 8 : 0);
            eVar.f29154c.setVisibility(8);
            eVar.d.setVisibility(0);
            if (LanguageUtil.ba(this.f29149a)) {
                eVar.d.setBackgroundResource(R.drawable.common_ui_arrow_left);
            }
            eVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: wzy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.a(eVar, view);
                }
            });
        }
        if (this.f29151c == 1) {
            if (list.isEmpty()) {
                eVar.f29152a.setImageBitmap(xcpVar.getIcon());
                eVar.e.setText(xcpVar.getDeviceName());
            }
            eVar.f29153b.setText(R.string.IDS_wx_device_connected_hint);
            eVar.f29153b.setVisibility(xcpVar.isConnected() ? 0 : 8);
            eVar.d.setVisibility(8);
            eVar.f29154c.setVisibility(0);
            eVar.f29154c.setChecked(i == this.i);
            eVar.f29154c.setOnClickListener(new View.OnClickListener() { // from class: wzx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.e(eVar, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e eVar, View view) {
        int bindingAdapterPosition = eVar.getBindingAdapterPosition();
        this.i = bindingAdapterPosition;
        CallBack callBack = this.e;
        if (callBack != null) {
            callBack.onItemClicked(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(e eVar, View view) {
        int bindingAdapterPosition = eVar.getBindingAdapterPosition();
        if (this.i == bindingAdapterPosition) {
            return;
        }
        eVar.f29154c.setChecked(true);
        int i = this.i;
        if (i != -1) {
            notifyItemChanged(i, 0);
        }
        this.i = bindingAdapterPosition;
    }

    private void a(ImageView imageView, xcp xcpVar) {
        if (xcpVar.isLocalBound() && xcpVar.getIcon() != null) {
            imageView.setImageBitmap(xcpVar.getIcon());
        } else {
            qqf.e(xcpVar.getDeviceIconUrl(), RequestOptions.bitmapTransform(new RoundedCorners((int) this.f29149a.getResources().getDimension(com.huawei.ui.main.R.dimen.defaultCornerRadiusM))), imageView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.f29150b)) {
            return 0;
        }
        return this.f29150b.size();
    }

    public void d(int i) {
        this.f29151c = i;
    }

    public void e(CallBack callBack) {
        this.e = callBack;
    }

    public void e(List<xcp> list) {
        this.f29150b = list;
    }

    public int e() {
        return this.i;
    }

    public void c(int i) {
        this.i = i;
    }

    public static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f29152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f29153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthCheckBox f29154c;
        ImageView d;
        HealthTextView e;

        public e(View view) {
            super(view);
            this.f29152a = (ImageView) view.findViewById(R.id.device_img);
            this.e = (HealthTextView) view.findViewById(R.id.device_name);
            this.f29153b = (HealthTextView) view.findViewById(R.id.device_bind_status);
            this.f29154c = (HealthCheckBox) view.findViewById(R.id.device_item_check);
            this.d = (ImageView) view.findViewById(R.id.device_item_arrow);
        }
    }
}
