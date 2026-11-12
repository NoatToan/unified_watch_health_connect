package com.huawei.sim.esim.view.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import defpackage.pve;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class EsimProfileAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LayoutInflater f23077b;
    private ArrayList<pve> d;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    public EsimProfileAdapter(ArrayList<pve> arrayList, Context context) {
        Object objClone = arrayList.clone();
        if (njy.b(objClone, pve.class)) {
            this.d = (ArrayList) objClone;
        } else {
            this.d = new ArrayList<>();
        }
        this.f23076a = context;
        this.f23077b = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.d.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.d.size();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        e eVar;
        View viewInflate;
        if (i < 0 || i >= this.d.size()) {
            LogUtil.j("EsimProfileAdapter", "getView position is invalid");
            return null;
        }
        pve pveVar = this.d.get(i);
        if (pveVar.a() == 0) {
            eVar = new e();
            viewInflate = this.f23077b.inflate(R.layout.profile_item_normal, (ViewGroup) null);
            eVar.d = (HealthTextView) viewInflate.findViewById(R.id.profile_title_tips);
            eVar.f23079b = (HealthTextView) viewInflate.findViewById(R.id.profile_title);
        } else {
            eVar = new e();
            viewInflate = this.f23077b.inflate(R.layout.profile_item_image, (ViewGroup) null);
            eVar.d = (HealthTextView) viewInflate.findViewById(R.id.profile_title_tips);
            eVar.f23079b = (HealthTextView) viewInflate.findViewById(R.id.profile_title);
            eVar.f23078a = (ImageView) viewInflate.findViewById(R.id.profile_image);
        }
        if (pveVar.a() == 0) {
            eVar.d.setText(pveVar.c());
            eVar.f23079b.setText(pveVar.b());
            return viewInflate;
        }
        eVar.d.setText(pveVar.c());
        eVar.f23079b.setText(pveVar.b());
        eVar.f23078a.setImageBitmap(b(pveVar.d()));
        return viewInflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return this.d.get(i).a();
    }

    private Bitmap b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f23078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f23079b;
        HealthTextView d;

        e() {
        }
    }
}
