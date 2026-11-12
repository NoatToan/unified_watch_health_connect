package com.huawei.health.ecologydevice.ui.measure.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ecologydevice.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import defpackage.eru;
import defpackage.etl;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class RopeDeviceSettingsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f6630a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f6631c;
    private List<etl> d = new ArrayList(10);
    private OnItemClickListener e;

    public interface OnItemClickListener {
        void onItemClick(View view, int i, etl etlVar);
    }

    public RopeDeviceSettingsAdapter(Context context, OnItemClickListener onItemClickListener) {
        this.f6631c = LayoutInflater.from(context);
        this.f6630a = context;
        this.e = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                return new e(this.f6631c.inflate(R.layout.item_divider_layout, viewGroup, false));
            case 2:
            case 3:
            case 4:
            case 5:
                return new a(this.f6631c.inflate(R.layout.item_rope_voice_settings_content, viewGroup, false));
            case 6:
                return new d(this.f6631c.inflate(R.layout.item_rope_settings_intermittent, viewGroup, false));
            case 7:
                return new b(this.f6631c.inflate(R.layout.item_rope_settings_intermittent_training, viewGroup, false));
            default:
                LogUtil.j("RopeDeviceVoiceSettingsAdapter", "onCreateViewHolder error viewType");
                return null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        etl etlVar = i < this.d.size() ? this.d.get(i) : null;
        if (etlVar == null || viewHolder == null) {
            LogUtil.j("RopeDeviceVoiceSettingsAdapter", "onBindViewHolder model or holder is null");
            return;
        }
        switch (etlVar.a()) {
            case 1:
                d(viewHolder, i, etlVar);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                a(viewHolder, i, etlVar);
                break;
            case 6:
                c(viewHolder, i, etlVar);
                break;
            case 7:
                e(viewHolder, i, etlVar);
                break;
            default:
                LogUtil.j("RopeDeviceVoiceSettingsAdapter", "onBindViewHolder error viewType");
                break;
        }
    }

    private void d(RecyclerView.ViewHolder viewHolder, final int i, final etl etlVar) {
        if (viewHolder instanceof e) {
            e eVar = (e) viewHolder;
            if (TextUtils.isEmpty(etlVar.f())) {
                eVar.e.setVisibility(8);
                return;
            }
            eVar.e.setVisibility(0);
            eVar.e.setText(etlVar.f());
            eVar.e.setOnClickListener(new View.OnClickListener() { // from class: epg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.d(i, etlVar, view);
                }
            });
        }
    }

    public /* synthetic */ void d(int i, etl etlVar, View view) {
        this.e.onItemClick(null, i, etlVar);
    }

    private void a(RecyclerView.ViewHolder viewHolder, final int i, final etl etlVar) {
        if (viewHolder instanceof a) {
            final a aVar = (a) viewHolder;
            b(aVar, etlVar);
            aVar.f6633b.setBackgroundResource(etlVar.b());
            aVar.f.setText(etlVar.f());
            if (!TextUtils.isEmpty(etlVar.e())) {
                aVar.f6632a.setVisibility(0);
                aVar.f6632a.setText(etlVar.e());
            } else {
                aVar.f6632a.setVisibility(8);
            }
            if (etlVar.a() == 2) {
                aVar.e.setVisibility(0);
                aVar.f6633b.setOnClickListener(new View.OnClickListener() { // from class: epf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.d.b(i, etlVar, view);
                    }
                });
                aVar.h.setVisibility(8);
                aVar.d.setVisibility(8);
            } else if (etlVar.a() == 4) {
                aVar.e.setVisibility(8);
                aVar.h.setVisibility(0);
                aVar.h.setChecked(etlVar.i());
                aVar.h.setOnClickListener(new View.OnClickListener() { // from class: epe
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f33299b.b(aVar, i, etlVar, view);
                    }
                });
                aVar.d.setVisibility(8);
            } else {
                aVar.e.setVisibility(8);
                aVar.h.setVisibility(8);
                aVar.d.setVisibility(0);
                aVar.d.setChecked(etlVar.i());
                aVar.d.setOnClickListener(new View.OnClickListener() { // from class: epd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.e.a(i, etlVar, view);
                    }
                });
            }
            if (b(etlVar.b())) {
                aVar.f6634c.setVisibility(8);
            } else {
                aVar.f6634c.setVisibility(0);
            }
        }
    }

    public /* synthetic */ void b(int i, etl etlVar, View view) {
        this.e.onItemClick(null, i, etlVar);
    }

    public /* synthetic */ void b(a aVar, int i, etl etlVar, View view) {
        this.e.onItemClick(aVar.h, i, etlVar);
    }

    public /* synthetic */ void a(int i, etl etlVar, View view) {
        this.e.onItemClick(null, i, etlVar);
    }

    private void c(RecyclerView.ViewHolder viewHolder, final int i, final etl etlVar) {
        if (viewHolder instanceof d) {
            final d dVar = (d) viewHolder;
            dVar.e.setBackgroundResource(etlVar.b());
            dVar.f6638a.setText(etlVar.f());
            dVar.f6639b.setText(etlVar.e());
            dVar.f6640c.setBackgroundResource("intermitmode_type".equals(etlVar.d()) ? R.drawable.ic_arrow_lower : R.drawable.common_ui_arrow_right);
            if (b(etlVar.b())) {
                dVar.d.setVisibility(8);
            } else {
                dVar.d.setVisibility(0);
            }
            dVar.e.setOnClickListener(new View.OnClickListener() { // from class: epm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f33316c.d(dVar, i, etlVar, view);
                }
            });
        }
    }

    public /* synthetic */ void d(d dVar, int i, etl etlVar, View view) {
        this.e.onItemClick(dVar.f6639b, i, etlVar);
    }

    private void b(a aVar, etl etlVar) {
        int dimensionPixelOffset;
        if (TextUtils.isEmpty(etlVar.e())) {
            dimensionPixelOffset = this.f6630a.getResources().getDimensionPixelOffset(R.dimen.health_common_56dp);
        } else if (etlVar.a() == 3) {
            int dimensionPixelOffset2 = this.f6630a.getResources().getDimensionPixelOffset(R.dimen.health_common_12dp);
            aVar.f.setPadding(0, dimensionPixelOffset2, 0, 0);
            aVar.f6632a.setPadding(0, 0, 0, dimensionPixelOffset2);
            dimensionPixelOffset = -2;
        } else {
            dimensionPixelOffset = this.f6630a.getResources().getDimensionPixelOffset(R.dimen.health_common_68dp);
            aVar.f6632a.setSingleLine();
            aVar.f6632a.setEllipsize(TextUtils.TruncateAt.END);
        }
        aVar.f6633b.setLayoutParams(new FrameLayout.LayoutParams(-1, dimensionPixelOffset));
    }

    private boolean b(int i) {
        return i == R.drawable.list_item_background_bottom_normal || i == R.drawable.list_item_background_single_normal;
    }

    private void e(RecyclerView.ViewHolder viewHolder, final int i, final etl etlVar) {
        if (viewHolder instanceof b) {
            b bVar = (b) viewHolder;
            if ("intermitmode_custom_type".equals(etlVar.d())) {
                bVar.f6637c.setVisibility(0);
                bVar.f6637c.setText(etlVar.f());
                bVar.e.setVisibility(8);
                bVar.f6636b.setVisibility(8);
                bVar.d.setBackgroundResource(R.color.common_transparent);
                bVar.f6637c.setOnClickListener(new View.OnClickListener() { // from class: epj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f33309b.c(i, etlVar, view);
                    }
                });
                return;
            }
            bVar.f6637c.setVisibility(8);
            bVar.d.setBackgroundResource(etlVar.b());
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(eru.e(etlVar.d()));
            if (bitmapDecodeFile == null) {
                bVar.e.setVisibility(8);
                bVar.f6636b.setVisibility(0);
                bVar.d.setBackgroundResource(R.color.colorSubBackground);
                bVar.h.setTextColor(this.f6630a.getResources().getColor(R.color.textColorPrimary));
                bVar.f6635a.setTextColor(this.f6630a.getResources().getColor(R.color.textColorSecondary));
                bVar.h.setText(etlVar.f());
                bVar.f6635a.setText(etlVar.e());
            } else {
                bVar.e.setVisibility(0);
                bVar.f6636b.setVisibility(8);
                bVar.d.setBackgroundResource(R.color.common_transparent);
                bVar.h.setTextColor(this.f6630a.getResources().getColor(R.color.textColorPrimaryInverse));
                bVar.f6635a.setTextColor(this.f6630a.getResources().getColor(R.color.textColorPrimaryInverse));
                bVar.e.setImageBitmap(bitmapDecodeFile);
            }
            bVar.d.setOnClickListener(new View.OnClickListener() { // from class: epk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f33312c.e(i, etlVar, view);
                }
            });
        }
    }

    public /* synthetic */ void c(int i, etl etlVar, View view) {
        this.e.onItemClick(null, i, etlVar);
    }

    public /* synthetic */ void e(int i, etl etlVar, View view) {
        this.e.onItemClick(null, i, etlVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (njy.e(this.d, i)) {
            return 1;
        }
        return this.d.get(i).a();
    }

    public void e(List<etl> list) {
        if (list == null) {
            return;
        }
        if (njy.b(this.d)) {
            this.d.clear();
        }
        this.d.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<etl> list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    static class e extends RecyclerView.ViewHolder {
        HealthTextView e;

        e(View view) {
            super(view);
            this.e = (HealthTextView) view.findViewById(R.id.divider_content);
        }
    }

    public static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f6632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RelativeLayout f6633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthDivider f6634c;
        HealthRadioButton d;
        HealthImageView e;
        HealthTextView f;
        HealthSwitchButton h;

        a(View view) {
            super(view);
            this.f6633b = (RelativeLayout) view.findViewById(R.id.item_content_rl);
            this.f = (HealthTextView) view.findViewById(R.id.voice_settings_content_title);
            this.f6632a = (HealthTextView) view.findViewById(R.id.voice_settings_content_detail);
            this.e = (HealthImageView) view.findViewById(R.id.voice_settings_content_right);
            this.h = (HealthSwitchButton) view.findViewById(R.id.voice_settings_content_switch);
            this.d = (HealthRadioButton) view.findViewById(R.id.voice_settings_content_radio_image);
            this.f6634c = (HealthDivider) view.findViewById(R.id.list_content_line);
        }
    }

    public static class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f6638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f6639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthImageView f6640c;
        HealthDivider d;
        RelativeLayout e;

        d(View view) {
            super(view);
            this.e = (RelativeLayout) view.findViewById(R.id.item_content_rl);
            this.f6638a = (HealthTextView) view.findViewById(R.id.voice_settings_content_title);
            this.f6639b = (HealthTextView) view.findViewById(R.id.voice_settings_content_detail);
            this.f6640c = (HealthImageView) view.findViewById(R.id.voice_settings_content_right);
            this.d = (HealthDivider) view.findViewById(R.id.list_content_line);
        }
    }

    static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f6635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        LinearLayout f6636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthButton f6637c;
        RelativeLayout d;
        HealthImageView e;
        HealthTextView h;

        b(View view) {
            super(view);
            this.d = (RelativeLayout) view.findViewById(R.id.item_content_rl);
            this.e = (HealthImageView) view.findViewById(R.id.voice_settings_bg_image);
            this.f6636b = (LinearLayout) view.findViewById(R.id.item_content_ll);
            this.h = (HealthTextView) view.findViewById(R.id.voice_settings_content_title);
            this.f6635a = (HealthTextView) view.findViewById(R.id.voice_settings_content_detail);
            this.f6637c = (HealthButton) view.findViewById(R.id.rope_device_btn_custom);
        }
    }
}
