package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.huawei.health.suggestion.R;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.ShowLayout;
import com.huawei.ui.commonui.webview.WebViewActivity;
import defpackage.iov;
import defpackage.qpx;
import health.compact.a.CommonUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessNewDetailImageViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f9490b;

    public FitnessNewDetailImageViewHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.new_view_detail_info_picture, viewGroup, false));
        this.f9490b = (ImageView) this.itemView.findViewById(R.id.tv_rvlinear_picture_id);
    }

    public void b(final ShowLayout showLayout) {
        if (showLayout != null) {
            String imageUrl = showLayout.getImageUrl();
            if (this.f9490b == null) {
                return;
            }
            Glide.with(BaseApplication.getContext()).load(imageUrl).diskCacheStrategy(DiskCacheStrategy.ALL).into(this.f9490b);
            LogUtil.j("Suggestion_FitnessNewDetailImageViewHolder", "onBind , Glide.with DiskCacheStrategy.NONE!");
            this.f9490b.setOnClickListener(new View.OnClickListener() { // from class: hnm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.b(showLayout, view);
                }
            });
        }
    }

    public /* synthetic */ void b(ShowLayout showLayout, View view) {
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            qpx.b(BaseApplication.getContext(), R.string.CS_network_connect_error);
        } else {
            e(showLayout);
            LogUtil.a("Suggestion_FitnessNewDetailImageViewHolder", "mImageView.setOnClickListener ok");
        }
    }

    public void e(ShowLayout showLayout) {
        if (showLayout != null) {
            String imageJumpUrl = showLayout.getImageJumpUrl();
            if (TextUtils.isEmpty(imageJumpUrl)) {
                return;
            }
            if (imageJumpUrl.toLowerCase(Locale.ENGLISH).startsWith("http://") || imageJumpUrl.toLowerCase(Locale.ENGLISH).startsWith("https://")) {
                Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) WebViewActivity.class);
                intent.putExtra("WebViewActivity.REQUEST_URL_KEY", imageJumpUrl);
                intent.addFlags(268435456);
                iov.d(BaseApplication.getContext(), intent);
                return;
            }
            try {
                Uri uri = Uri.parse(imageJumpUrl);
                LogUtil.a("Suggestion_FitnessNewDetailImageViewHolder", "onImageJump url deep Link:", uri);
                Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
                intent2.addFlags(268435456);
                BaseApplication.getContext().startActivity(intent2);
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("Suggestion_FitnessNewDetailImageViewHolder", "onImageJump ActivityNotFoundException, url:", imageJumpUrl);
            }
        }
    }
}
