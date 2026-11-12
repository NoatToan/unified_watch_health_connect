package com.huawei.health.ecologydevice.ui.measure.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ecologydevice.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceSilentGuideAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6620a;
    private Context d;
    private List<elh.c> e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    public DeviceSilentGuideAdapter(Context context, String str, List<elh.c> list) {
        if (list != null) {
            this.e = list;
        } else {
            this.e = new ArrayList(16);
        }
        if (context == null) {
            this.d = BaseApplication.getContext();
        } else {
            this.d = context;
        }
        this.f6620a = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new e(LayoutInflater.from(this.d).inflate(R.layout.device_silent_guid_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) throws Throwable {
        elh.c cVar;
        if (!(viewHolder instanceof e) || (cVar = this.e.get(i)) == null) {
            return;
        }
        e eVar = (e) viewHolder;
        eVar.f6623c.setText(elo.a(this.f6620a, cVar.c()));
        if (TextUtils.isEmpty(cVar.d())) {
            eVar.e.setVisibility(8);
            return;
        }
        c(eVar);
        Bitmap bitmapC = elo.c(elg.e().d(this.f6620a, cVar.d()));
        if (bitmapC != null) {
            eVar.e.setVisibility(0);
            eVar.f6621a.setImageBitmap(bitmapC);
        } else {
            eVar.e.setVisibility(8);
        }
    }

    private void c(e eVar) {
        int iD = qrs.d(this.d, 240.0f);
        eVar.f6621a.setLayoutParams(new LinearLayout.LayoutParams(iD, iD));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.e.size();
    }

    class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f6621a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f6623c;
        LinearLayout e;

        e(View view) {
            super(view);
            this.f6621a = (ImageView) view.findViewById(R.id.hw_device_silent_img);
            this.f6623c = (HealthTextView) view.findViewById(R.id.hw_device_silent_text);
            this.e = (LinearLayout) view.findViewById(R.id.hw_device_auto_read_omron_introduction_step);
        }
    }
}
