package com.huawei.pluginachievement.ui.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.MedalInfo;
import com.huawei.pluginachievement.manager.model.MedalInfoReport;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import defpackage.pas;
import defpackage.pax;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ReportMedalRecyclerAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LayoutInflater f22191b;
    private List<MedalInfoReport> d;
    private Context e;

    public ReportMedalRecyclerAdapter(Context context, List<MedalInfoReport> list) {
        this.e = context;
        this.f22191b = LayoutInflater.from(context);
        this.d = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this.f22191b.inflate(R.layout.item_single_medal, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        if (njy.e(this.d, i)) {
            LogUtil.j("PLGACHIEVE_ReportMedalRecyclerAdapter", "onBindViewHolder() mMedalList is empty.");
            return;
        }
        MedalInfoReport medalInfoReport = this.d.get(i);
        if (medalInfoReport == null) {
            LogUtil.j("PLGACHIEVE_ReportMedalRecyclerAdapter", "onBindViewHolder() medalInfoDesc is null.");
            return;
        }
        aVar.f22193c.setText(medalInfoReport.getMedalName());
        String strE = pax.e(medalInfoReport.getMedalId(), ParsedFieldTag.LIGHT_LIST_STYLE);
        Bitmap bitmapB = b(pax.d(pax.e(medalInfoReport.getMedalId())) + File.separator + strE + ".png");
        if (bitmapB != null) {
            LogUtil.a("PLGACHIEVE_ReportMedalRecyclerAdapter", "bitmap not null");
            aVar.f22192b.setImageBitmap(bitmapB);
        } else {
            a(medalInfoReport, aVar.f22192b);
        }
    }

    private void a(MedalInfoReport medalInfoReport, ImageView imageView) {
        Bitmap bitmapA = pax.a(medalInfoReport.getMedalId(), true, false);
        if (bitmapA != null) {
            LogUtil.a("PLGACHIEVE_ReportMedalRecyclerAdapter", "bmp not null");
            imageView.setImageBitmap(bitmapA);
            return;
        }
        String medalTypeLevel = medalInfoReport.getMedalTypeLevel();
        LogUtil.a("PLGACHIEVE_ReportMedalRecyclerAdapter", "typeLevel is ", medalTypeLevel);
        MedalInfo medalInfo = pas.d().d(false).get(medalTypeLevel);
        if (medalInfo == null) {
            LogUtil.j("PLGACHIEVE_ReportMedalRecyclerAdapter", "medalInfoReport.getMedalId() medalInfo is null.");
        } else {
            imageView.setImageResource(medalInfo.getEnableResId());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.d)) {
            return 0;
        }
        return Math.min(this.d.size(), 6);
    }

    public void e(List<MedalInfoReport> list) {
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_ReportMedalRecyclerAdapter", "onBindViewHolder() mMedalList is empty.");
        } else if (njy.b(this.d)) {
            this.d.clear();
            this.d.addAll(list);
            notifyDataSetChanged();
        }
    }

    public Bitmap b(String str) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("PLGACHIEVE_ReportMedalRecyclerAdapter", "loadImage: untrusted -> " + str);
            return null;
        }
        if (new File(str).exists()) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            try {
                return BitmapFactory.decodeFile(str, options);
            } catch (OutOfMemoryError unused) {
                LogUtil.e("PLGACHIEVE_ReportMedalRecyclerAdapter", "loadImage:OutOfMemoryError");
            }
        }
        return null;
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f22192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f22193c;

        a(View view) {
            super(view);
            this.f22193c = (HealthTextView) view.findViewById(R.id.medal_title_text);
            this.f22192b = (ImageView) view.findViewById(R.id.imageview_medal);
        }
    }
}
