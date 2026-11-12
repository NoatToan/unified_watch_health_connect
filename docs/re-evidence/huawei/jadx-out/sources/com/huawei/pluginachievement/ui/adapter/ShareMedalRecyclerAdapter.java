package com.huawei.pluginachievement.ui.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.MedalAllShareInfoDesc;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.out;
import defpackage.pax;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class ShareMedalRecyclerAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Integer> f22197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22198c;
    private ArrayList<MedalAllShareInfoDesc> e;

    public ShareMedalRecyclerAdapter(Context context, ArrayList<MedalAllShareInfoDesc> arrayList) {
        HashMap map = new HashMap(0);
        this.f22197b = map;
        this.f22198c = context;
        this.e = arrayList;
        pax.c(map);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(this.f22198c).inflate(R.layout.share_medal_list_item, (ViewGroup) null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        int i2;
        ArrayList<MedalAllShareInfoDesc> arrayList = this.e;
        if (arrayList == null || aVar == null) {
            return;
        }
        if (i < 0 || i >= arrayList.size()) {
            LogUtil.a("PLGACHIEVE_ShareMedalRecyclerAdapter", "IndexOutOfBoundsException");
            return;
        }
        aVar.setIsRecyclable(true);
        MedalAllShareInfoDesc medalAllShareInfoDesc = this.e.get(i);
        String strAcquireMedalId = medalAllShareInfoDesc.acquireMedalId();
        aVar.e.setText(medalAllShareInfoDesc.acquireMedalText());
        Bitmap bitmapA = pax.a(strAcquireMedalId, true, true);
        if (bitmapA != null) {
            aVar.f22199a.setVisibility(0);
            aVar.f22199a.setImageBitmap(bitmapA);
            return;
        }
        try {
            i2 = Integer.parseInt(strAcquireMedalId);
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_ShareMedalRecyclerAdapter", "NumberFormatException");
            i2 = 0;
        }
        if (i2 > 0 && i2 <= 19) {
            int iIntValue = this.f22197b.get(strAcquireMedalId).intValue();
            aVar.f22199a.setVisibility(0);
            aVar.f22199a.setImageResource(iIntValue);
        } else {
            aVar.d.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
            aVar.d.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList<MedalAllShareInfoDesc> arrayList = this.e;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f22199a;
        LinearLayout d;
        HealthTextView e;

        a(View view) {
            super(view);
            this.d = (LinearLayout) out.b(view, R.id.share_medal_list_item_ll);
            this.f22199a = (ImageView) out.b(view, R.id.share_medal_list_item_iv);
            this.e = (HealthTextView) out.b(view, R.id.share_medal_list_item_tv);
        }
    }
}
