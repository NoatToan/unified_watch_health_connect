package com.huawei.ui.device.adapter;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import defpackage.edn;
import defpackage.lvi;
import defpackage.njy;
import defpackage.rbd;
import defpackage.rdp;
import health.compact.a.Services;
import health.compact.a.util.LogUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class PairGuideAdapter extends RecyclerView.Adapter<a> {
    private List<rbd> e;

    public PairGuideAdapter(List<rbd> list) {
        this.e = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_devic_pairing_guide, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        edn ednVarA;
        List<rbd> list = this.e;
        if (list == null || list.isEmpty()) {
            LogUtil.d("PairGuideAdapter", "mPairGuideInfos is empty");
            return;
        }
        if (i < 0 || i >= this.e.size()) {
            LogUtil.d("PairGuideAdapter", "mPairGuideInfos, array out of bounds");
            return;
        }
        rbd rbdVar = this.e.get(i);
        if (rbdVar == null) {
            LogUtil.d("PairGuideAdapter", "PairGuideInfo is empty");
            return;
        }
        String strB = rbdVar.b();
        if (TextUtils.isEmpty(strB) && (ednVarA = lvi.a(rbdVar.h())) != null) {
            strB = ednVarA.i();
        }
        aVar.f24881b.setText(strB);
        if (TextUtils.isEmpty(rbdVar.c())) {
            SpannableStringBuilder spannableStringBuilderA = rdp.a(rbdVar.h(), BaseApplication.getContext());
            if (spannableStringBuilderA != null) {
                aVar.f24880a.setText(spannableStringBuilderA);
            } else {
                aVar.f24880a.setText(R.string.IDS_device_paring_type_le_des_info_21);
            }
        } else {
            aVar.f24880a.setText(rbdVar.c());
        }
        b(aVar, rbdVar);
    }

    private void b(a aVar, rbd rbdVar) {
        if (!rbdVar.f()) {
            c(aVar, rbdVar);
        } else {
            a(aVar, rbdVar);
        }
    }

    private void c(a aVar, rbd rbdVar) {
        aVar.e.setImageResource(rbdVar.i());
        if (rbdVar.e() == 0) {
            aVar.d.setVisibility(8);
            return;
        }
        aVar.d.setVisibility(0);
        aVar.d.setImageResource(rbdVar.e());
        if (aVar.d.getDrawable() instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) aVar.d.getDrawable();
            if (animationDrawable != null) {
                animationDrawable.start();
            } else {
                LogUtil.d("PairGuideAdapter", "mB3PairGuideAnim is null!");
            }
        }
    }

    private void a(a aVar, rbd rbdVar) {
        if (rbdVar.d() != null) {
            aVar.e.setImageBitmap(rbdVar.d());
            LogUtil.a("PairGuideAdapter", "PairGuide img is setted");
        } else {
            aVar.e.setVisibility(4);
        }
        Bitmap bitmapLoadImageByImagePath = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImagePath(rbdVar.a());
        if (bitmapLoadImageByImagePath == null) {
            return;
        }
        aVar.e.setVisibility(0);
        aVar.e.setImageBitmap(bitmapLoadImageByImagePath);
        if (njy.e(rbdVar.g())) {
            aVar.d.setVisibility(8);
            return;
        }
        aVar.d.setVisibility(0);
        aVar.d.setImageResource(R.drawable.janus_pair_guide_animation);
        if (aVar.d.getDrawable() instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) aVar.d.getDrawable();
            Iterator<String> it = rbdVar.g().iterator();
            while (it.hasNext()) {
                animationDrawable.addFrame(new BitmapDrawable(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImagePath(it.next())), 100);
            }
            animationDrawable.start();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.e.size();
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f24880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f24881b;
        private ImageView d;
        private ImageView e;

        public a(View view) {
            super(view);
            this.f24880a = (HealthTextView) view.findViewById(R.id.pair_guide_text);
            this.f24881b = (HealthTextView) view.findViewById(R.id.device_name);
            this.e = (ImageView) view.findViewById(R.id.device_image);
            this.d = (ImageView) view.findViewById(R.id.device_image_anim);
        }
    }
}
