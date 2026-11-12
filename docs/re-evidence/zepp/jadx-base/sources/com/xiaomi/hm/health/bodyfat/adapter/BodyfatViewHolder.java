package com.xiaomi.hm.health.bodyfat.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.view.text.UnitTextView;
import com.huami.view.weightfigure.WeightFigureView;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.adapter.BodyfatViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010G\u001a\u00020F\u0012\b\b\u0002\u0010H\u001a\u00020\u0002¢\u0006\u0004\bI\u0010JR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0016\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00102\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010!\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R\"\u00106\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010!\u001a\u0004\b4\u0010#\"\u0004\b5\u0010%R\"\u0010:\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0019\u001a\u0004\b8\u0010\u001b\"\u0004\b9\u0010\u001dR\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0019\u0010E\u001a\u00020\u001f8\u0006@\u0006¢\u0006\f\n\u0004\bC\u0010!\u001a\u0004\bD\u0010#¨\u0006K"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/adapter/BodyfatViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "a", "Z", "isExpand", "()Z", "setExpand", "(Z)V", "Landroid/widget/RelativeLayout;", "b", "Landroid/widget/RelativeLayout;", "getBriefLayout", "()Landroid/widget/RelativeLayout;", "setBriefLayout", "(Landroid/widget/RelativeLayout;)V", "briefLayout", "Landroid/widget/LinearLayout;", "c", "Landroid/widget/LinearLayout;", "getDetailLayout", "()Landroid/widget/LinearLayout;", "detailLayout", "Landroid/widget/ImageView;", GoogleApiAvailabilityLight.a, "Landroid/widget/ImageView;", "getIconImg", "()Landroid/widget/ImageView;", "setIconImg", "(Landroid/widget/ImageView;)V", "iconImg", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getTitleTextView", "()Landroid/widget/TextView;", "setTitleTextView", "(Landroid/widget/TextView;)V", "titleTextView", "Lcom/huami/lib/view/text/UnitTextView;", "f", "Lcom/huami/lib/view/text/UnitTextView;", "getUnitTextView", "()Lcom/huami/lib/view/text/UnitTextView;", "setUnitTextView", "(Lcom/huami/lib/view/text/UnitTextView;)V", "unitTextView", "g", "getSubTitleTextView", "setSubTitleTextView", "subTitleTextView", "h", "getTipsTextView", "setTipsTextView", "tipsTextView", "i", "getArrowImg", "setArrowImg", "arrowImg", "Lcom/huami/view/weightfigure/WeightFigureView;", z.j, "Lcom/huami/view/weightfigure/WeightFigureView;", "getFigureView", "()Lcom/huami/view/weightfigure/WeightFigureView;", "setFigureView", "(Lcom/huami/view/weightfigure/WeightFigureView;)V", "figureView", hl.k, "getTextViewDetails", "textViewDetails", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "isExpandDefault", "<init>", "(Landroid/view/View;Z)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class BodyfatViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isExpand;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private RelativeLayout briefLayout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LinearLayout detailLayout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private ImageView iconImg;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private TextView titleTextView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private UnitTextView unitTextView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private TextView subTitleTextView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private TextView tipsTextView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private ImageView arrowImg;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private WeightFigureView figureView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final TextView textViewDetails;

    public BodyfatViewHolder(@NotNull View view, boolean z) {
        super(view);
        this.isExpand = z;
        this.briefLayout = (RelativeLayout) view.findViewById(R.id.brief_layout);
        this.detailLayout = (LinearLayout) view.findViewById(R.id.detail_layout);
        this.iconImg = (ImageView) view.findViewById(R.id.body_index_icon);
        this.titleTextView = (TextView) view.findViewById(R.id.body_index_name);
        this.unitTextView = (UnitTextView) view.findViewById(R.id.body_index_value);
        this.subTitleTextView = (TextView) view.findViewById(R.id.body_index_desc);
        this.tipsTextView = (TextView) view.findViewById(R.id.info_tv);
        this.arrowImg = (ImageView) view.findViewById(R.id.arrow_iv);
        this.figureView = (WeightFigureView) view.findViewById(R.id.params_figure_view);
        this.textViewDetails = (TextView) view.findViewById(R.id.text_view_details);
        b(this, this.isExpand);
        d(this, this.isExpand);
        this.arrowImg.setOnClickListener(new View.OnClickListener() { // from class: g40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BodyfatViewHolder.c(this.a, view2);
            }
        });
    }

    private static final void b(BodyfatViewHolder bodyfatViewHolder, boolean z) {
        if (z) {
            bodyfatViewHolder.detailLayout.setVisibility(0);
        } else {
            bodyfatViewHolder.detailLayout.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(BodyfatViewHolder bodyfatViewHolder, View view) {
        bodyfatViewHolder.setExpand(!bodyfatViewHolder.getIsExpand());
        b(bodyfatViewHolder, bodyfatViewHolder.getIsExpand());
        d(bodyfatViewHolder, bodyfatViewHolder.getIsExpand());
    }

    private static final void d(BodyfatViewHolder bodyfatViewHolder, boolean z) {
        if (z) {
            bodyfatViewHolder.arrowImg.setImageResource(R.drawable.arrow_up);
        } else {
            bodyfatViewHolder.arrowImg.setImageResource(R.drawable.arrow_down);
        }
    }

    @NotNull
    public final ImageView getArrowImg() {
        return this.arrowImg;
    }

    @NotNull
    public final RelativeLayout getBriefLayout() {
        return this.briefLayout;
    }

    @NotNull
    public final LinearLayout getDetailLayout() {
        return this.detailLayout;
    }

    @NotNull
    public final WeightFigureView getFigureView() {
        return this.figureView;
    }

    @NotNull
    public final ImageView getIconImg() {
        return this.iconImg;
    }

    @NotNull
    public final TextView getSubTitleTextView() {
        return this.subTitleTextView;
    }

    @NotNull
    public final TextView getTextViewDetails() {
        return this.textViewDetails;
    }

    @NotNull
    public final TextView getTipsTextView() {
        return this.tipsTextView;
    }

    @NotNull
    public final TextView getTitleTextView() {
        return this.titleTextView;
    }

    @NotNull
    public final UnitTextView getUnitTextView() {
        return this.unitTextView;
    }

    /* JADX INFO: renamed from: isExpand, reason: from getter */
    public final boolean getIsExpand() {
        return this.isExpand;
    }

    public final void setArrowImg(@NotNull ImageView imageView) {
        this.arrowImg = imageView;
    }

    public final void setBriefLayout(@NotNull RelativeLayout relativeLayout) {
        this.briefLayout = relativeLayout;
    }

    public final void setExpand(boolean z) {
        this.isExpand = z;
    }

    public final void setFigureView(@NotNull WeightFigureView weightFigureView) {
        this.figureView = weightFigureView;
    }

    public final void setIconImg(@NotNull ImageView imageView) {
        this.iconImg = imageView;
    }

    public final void setSubTitleTextView(@NotNull TextView textView) {
        this.subTitleTextView = textView;
    }

    public final void setTipsTextView(@NotNull TextView textView) {
        this.tipsTextView = textView;
    }

    public final void setTitleTextView(@NotNull TextView textView) {
        this.titleTextView = textView;
    }

    public final void setUnitTextView(@NotNull UnitTextView unitTextView) {
        this.unitTextView = unitTextView;
    }

    public /* synthetic */ BodyfatViewHolder(View view, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i & 2) != 0 ? false : z);
    }
}
