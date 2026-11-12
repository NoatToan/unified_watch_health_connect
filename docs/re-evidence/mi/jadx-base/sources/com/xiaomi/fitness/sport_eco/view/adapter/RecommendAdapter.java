package com.xiaomi.fitness.sport_eco.view.adapter;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.sport_eco.bean.RecommendSportBean;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.ctq;
import defpackage.fgl;
import defpackage.nuf;
import defpackage.sli;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\b\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u001c\u0010\u0011\u001a\u00020\t2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/adapter/RecommendAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/sport_eco/view/adapter/RecommendAdapter$Holder;", "<init>", "()V", "list", "", "Lcom/xiaomi/fitness/sport_eco/bean/RecommendSportBean;", "setData", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "Holder", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecommendAdapter extends RecyclerView.Adapter<Holder> {

    @NotNull
    private List<RecommendSportBean> list = new ArrayList();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/adapter/RecommendAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/sport_eco/bean/RecommendSportBean;", "bean", "bindData", "(Lcom/xiaomi/fitness/sport_eco/bean/RecommendSportBean;)V", "Lctq;", "view", "Lctq;", "getView", "()Lctq;", "<init>", "(Lcom/xiaomi/fitness/sport_eco/view/adapter/RecommendAdapter;Lctq;)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nRecommendAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendAdapter.kt\ncom/xiaomi/fitness/sport_eco/view/adapter/RecommendAdapter$Holder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,73:1\n54#2,3:74\n24#2:77\n59#2,6:78\n*S KotlinDebug\n*F\n+ 1 RecommendAdapter.kt\ncom/xiaomi/fitness/sport_eco/view/adapter/RecommendAdapter$Holder\n*L\n68#1:74,3\n68#1:77\n68#1:78,6\n*E\n"})
    public final class Holder extends RecyclerView.d0 implements View.OnClickListener {
        final /* synthetic */ RecommendAdapter this$0;

        @NotNull
        private final ctq view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull RecommendAdapter recommendAdapter, ctq view) {
            super(view.getRoot());
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = recommendAdapter;
            this.view = view;
            view.getRoot().setOnClickListener(this);
            nuf.f(view.getRoot());
        }

        public final void bindData(@NotNull RecommendSportBean bean) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            this.view.C0(bean);
            this.view.getRoot().setTag(bean);
            this.view.getRoot().setContentDescription(bean.getMainTitle());
            ImageView image = this.view.A;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            String img = bean.getImg();
            ImageLoader imageLoader = Coil.imageLoader(image.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(image.getContext()).data(img).target(image);
            builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDimension(sli.c)));
            imageLoader.enqueue(builderTarget.build());
        }

        @NotNull
        public final ctq getView() {
            return this.view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@Nullable View v) {
            Object tag = v != null ? v.getTag() : null;
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.sport_eco.bean.RecommendSportBean");
            RecommendSportBean recommendSportBean = (RecommendSportBean) tag;
            Uri uri = Uri.parse(StringsKt__StringsJVMKt.replace$default(recommendSportBean.getUrl(), "miwear://", "mihealth://", false, 4, (Object) null));
            String scheme = uri.getScheme();
            if (!Intrinsics.areEqual("http", scheme) && !Intrinsics.areEqual(Constants.URI_SCHEME, scheme)) {
                fgl.a(ApplicationExtKt.getApplication(), uri);
                return;
            }
            String url = recommendSportBean.getUrl();
            if (url == null) {
                url = "";
            }
            WebViewUtilKt.startWebView$default(url, null, recommendSportBean.getMainTitle(), false, false, 24, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.list.size();
    }

    public final void setData(@NotNull List<RecommendSportBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.list.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ctq ctqVarA0 = ctq.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(ctqVarA0, "inflate(...)");
        return new Holder(this, ctqVarA0);
    }
}
