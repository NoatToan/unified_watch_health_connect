package com.xiaomi.fitness.active.pk.ui.recyclerview.holder;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.util.CoilUtils;
import com.xiaomi.fitness.active.pk.util.ImageUtils;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.fni;
import defpackage.wqi;
import defpackage.zii;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J7\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ)\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0003\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/holder/TitleSubTitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "titleStr", "subTitleStr", "", "isHideSubTitle", "isHideTitle", "", "setTitleAndSubTitle", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "applyGrayStyleAction", "()V", "applyPrimaryStyleAction", "actionStr", "enabled", "", "colorRes", "setActionText", "(Ljava/lang/String;ZI)V", "url", "loadAvatar", "(Ljava/lang/String;)V", "Landroid/view/View$OnClickListener;", "onClickListener", "setActionClickListener", "(Landroid/view/View$OnClickListener;)V", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "ivAvatar", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "Landroid/widget/TextView;", "tvTitle", "Landroid/widget/TextView;", "tvSubTitle", "tvAction", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTitleSubTitleViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TitleSubTitleViewHolder.kt\ncom/xiaomi/fitness/active/pk/ui/recyclerview/holder/TitleSubTitleViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,68:1\n71#2,2:69\n*S KotlinDebug\n*F\n+ 1 TitleSubTitleViewHolder.kt\ncom/xiaomi/fitness/active/pk/ui/recyclerview/holder/TitleSubTitleViewHolder\n*L\n58#1:69,2\n*E\n"})
public final class TitleSubTitleViewHolder extends RecyclerView.d0 {

    @NotNull
    private final RoundImageView ivAvatar;

    @NotNull
    private final TextView tvAction;

    @NotNull
    private final TextView tvSubTitle;

    @NotNull
    private final TextView tvTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleSubTitleViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(wqi.G);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.ivAvatar = (RoundImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(wqi.y1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.tvTitle = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(wqi.x1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.tvSubTitle = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(wqi.R0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.tvAction = (TextView) viewFindViewById4;
    }

    public static /* synthetic */ void setActionText$default(TitleSubTitleViewHolder titleSubTitleViewHolder, String str, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        titleSubTitleViewHolder.setActionText(str, z, i);
    }

    public static /* synthetic */ void setTitleAndSubTitle$default(TitleSubTitleViewHolder titleSubTitleViewHolder, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        titleSubTitleViewHolder.setTitleAndSubTitle(str, str2, z, z2);
    }

    public final void applyGrayStyleAction() {
        this.tvAction.setBackgroundResource(fni.x);
        this.tvAction.setTextColor(ExtUtilsKt.getColor(zii.f));
    }

    public final void applyPrimaryStyleAction() {
        this.tvAction.setBackgroundResource(fni.y);
        this.tvAction.setTextColor(ExtUtilsKt.getColor(zii.g));
    }

    public final void loadAvatar(@Nullable String url) {
        if (TextUtils.isEmpty(url)) {
            CoilUtils.dispose(this.ivAvatar);
            this.ivAvatar.setImageResource(fni.i);
        } else {
            ImageUtils imageUtils = ImageUtils.INSTANCE;
            RoundImageView roundImageView = this.ivAvatar;
            Intrinsics.checkNotNull(url);
            imageUtils.loadAvatar(roundImageView, url);
        }
    }

    public final void setActionClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.tvAction.setOnClickListener(onClickListener);
    }

    public final void setActionText(@NotNull String actionStr, boolean enabled, int colorRes) {
        Intrinsics.checkNotNullParameter(actionStr, "actionStr");
        this.tvAction.setText(actionStr);
        this.tvAction.setEnabled(enabled);
        if (colorRes != 0) {
            this.tvAction.setTextColor(ExtUtilsKt.getColor(colorRes));
        }
    }

    public final void setTitleAndSubTitle(@Nullable String titleStr, @Nullable String subTitleStr, boolean isHideSubTitle, boolean isHideTitle) {
        TextView textView = this.tvTitle;
        if (titleStr == null) {
            titleStr = "";
        }
        textView.setText(titleStr);
        TextView textView2 = this.tvSubTitle;
        if (subTitleStr == null) {
            subTitleStr = "";
        }
        textView2.setText(subTitleStr);
        ViewExtKt.setVisible(this.tvTitle, !isHideTitle);
        ViewExtKt.setVisible(this.tvSubTitle, !isHideSubTitle);
    }
}
