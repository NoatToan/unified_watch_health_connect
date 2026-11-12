package com.huawei.health.device.ui.dialog;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import defpackage.dru;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceCheckAdapter extends RecyclerView.Adapter<d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6341b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OnItemClickListener f6342c;
    private List<dru> d;
    private final Context e;

    public interface OnItemClickListener {
        void onItemClick(dru druVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    public DeviceCheckAdapter(Context context, List<dru> list, OnItemClickListener onItemClickListener) {
        if (list != null) {
            this.d = list;
        } else {
            this.d = new ArrayList(16);
        }
        if (context == null) {
            this.e = BaseApplication.getContext();
        } else {
            this.e = context;
        }
        this.f6342c = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new d(LayoutInflater.from(this.e).inflate(R.layout.device_custom_select_dialog_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(d dVar, final int i) {
        OnItemClickListener onItemClickListener;
        if (njy.e(this.d, i)) {
            LogUtil.j("DeviceCheckAdapter", "mDeviceGroupInfoList isOutOfBounds");
            return;
        }
        dru druVar = this.d.get(i);
        if (druVar == null) {
            return;
        }
        Object objI = druVar.i();
        if (!(objI instanceof elh)) {
            LogUtil.j("DeviceCheckAdapter", "mDeviceGroupInfoList ProductInfo is null");
            return;
        }
        elh elhVar = (elh) objI;
        dVar.d.setImageBitmap(elo.c(elg.e().d(elhVar.t(), elhVar.l().b())));
        c(druVar, elhVar, dVar);
        boolean z = i == this.f6341b;
        dVar.f6343a.setChecked(z);
        if (z && (onItemClickListener = this.f6342c) != null) {
            onItemClickListener.onItemClick(druVar);
        }
        dVar.f6343a.setOnClickListener(new View.OnClickListener() { // from class: dtc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32343b.e(i, view);
            }
        });
    }

    public /* synthetic */ void e(int i, View view) {
        if (i != this.f6341b) {
            this.f6341b = i;
            notifyDataSetChanged();
        }
    }

    private void c(dru druVar, elh elhVar, d dVar) {
        String asString;
        ContentValues contentValuesD = druVar.d();
        if (contentValuesD == null) {
            asString = "";
        } else if (!TextUtils.isEmpty(contentValuesD.getAsString("sn"))) {
            asString = contentValuesD.getAsString("sn");
        } else {
            asString = contentValuesD.getAsString("uniqueId");
        }
        if (elhVar.d().size() <= 0) {
            LogUtil.a("DeviceCheckAdapter", "item.getDescriptions().size() <= 0");
            dVar.f6344c.setText(d(elhVar.l().d(), asString));
            return;
        }
        LogUtil.a("DeviceCheckAdapter", "item.getDescriptions().size() > 0");
        String str = "9bf158ba-49b0-46aa-9fdf-ed75da1569cf".equals(elhVar.t()) ? "" : asString;
        if (!TextUtils.isEmpty(str)) {
            dVar.f6344c.setText(d(elo.a(elhVar.t(), elhVar.l().d()), str));
        } else {
            dVar.f6344c.setText(elo.a(elhVar.t(), elhVar.l().d()));
        }
    }

    private String d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceCheckAdapter", "name is empty");
            return "";
        }
        if (str.toUpperCase().contains(a(str2).toUpperCase())) {
            return str;
        }
        return str + a(str2).toUpperCase();
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("DeviceCheckAdapter", "getDeviceIdentification identification is null");
            return "";
        }
        if (str.replace(":", "").length() < 3) {
            LogUtil.a("DeviceCheckAdapter", "identification's length less than 3");
            return Constants.LINK + str.replace(":", "");
        }
        return Constants.LINK + str.replace(":", "").substring(str.replace(":", "").length() - 3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.d.size();
    }

    static class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthRadioButton f6343a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f6344c;
        ImageView d;

        d(View view) {
            super(view);
            this.d = (ImageView) view.findViewById(R.id.img_device);
            this.f6344c = (HealthTextView) view.findViewById(R.id.tv_device_name);
            this.f6343a = (HealthRadioButton) view.findViewById(R.id.rb_device_select);
        }
    }
}
