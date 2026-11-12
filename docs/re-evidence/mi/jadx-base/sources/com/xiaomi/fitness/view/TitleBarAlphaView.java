package com.xiaomi.fitness.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ViewUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import defpackage.eah;
import defpackage.eri;
import defpackage.jui;
import defpackage.pni;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010G\u001a\u0004\u0018\u00010F\u0012\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bJ\u0010KJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0015J!\u0010\u001b\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010\u0015J\u0017\u0010#\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b#\u0010 J\u0015\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0012¢\u0006\u0004\b$\u0010\u0015J\u0015\u0010%\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b%\u0010\u0015J\u0015\u0010&\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b&\u0010\u0015J\u0017\u0010'\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010\u0015R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R$\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u00109\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108R$\u0010<\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00104\u001a\u0004\b=\u00106\"\u0004\b>\u00108R$\u0010?\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010E¨\u0006L"}, d2 = {"Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "Landroid/widget/RelativeLayout;", "", "onFinishInflate", "()V", "", "enable", "setTitleClickable", "(Z)V", "Leah;", "onTitleBarClickListener", "setOnTitleBarClickListener", "(Leah;)V", "Landroid/view/View$OnClickListener;", "onClickListener", "autoShowBtn", "setRealShareBtnClick", "(Landroid/view/View$OnClickListener;Z)V", "", "visibility", "setRealShareBtnVisible", "(I)V", DailyRecordKey.sportType, "setImgShareVisible", "", "title", "descStr", "bindData", "(Ljava/lang/String;Ljava/lang/String;)V", "visible", "showDesc", "updateTitleStr", "(Ljava/lang/String;)V", "resId", "updateTitleRes", "updateSubTitleStr", "updateSubTitleRes", "setShareImgVisible", "setBackImgVisible", "setVisibility", "Landroid/widget/TextView;", "txtTitle", "Landroid/widget/TextView;", "getTxtTitle", "()Landroid/widget/TextView;", "setTxtTitle", "(Landroid/widget/TextView;)V", "txtDesc", "getTxtDesc", "setTxtDesc", "Landroid/widget/ImageView;", "imgBackWhite", "Landroid/widget/ImageView;", "getImgBackWhite", "()Landroid/widget/ImageView;", "setImgBackWhite", "(Landroid/widget/ImageView;)V", "imgShare", "getImgShare", "setImgShare", "shareView", "getShareView", "setShareView", "rlContainer", "Landroid/widget/RelativeLayout;", "getRlContainer", "()Landroid/widget/RelativeLayout;", "setRlContainer", "(Landroid/widget/RelativeLayout;)V", "Leah;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TitleBarAlphaView extends RelativeLayout {

    @Nullable
    private ImageView imgBackWhite;

    @Nullable
    private ImageView imgShare;

    @Nullable
    private eah onTitleBarClickListener;

    @Nullable
    private RelativeLayout rlContainer;

    @Nullable
    private ImageView shareView;

    @Nullable
    private TextView txtDesc;

    @Nullable
    private TextView txtTitle;

    public TitleBarAlphaView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(jui.Y7, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$0(TitleBarAlphaView this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        eah eahVar = this$0.onTitleBarClickListener;
        if (eahVar != null) {
            Intrinsics.checkNotNull(eahVar);
            eahVar.onImgBackClick(this$0.imgBackWhite);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$1(TitleBarAlphaView this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        eah eahVar = this$0.onTitleBarClickListener;
        if (eahVar != null) {
            Intrinsics.checkNotNull(eahVar);
            eahVar.onImgShareClick(this$0.imgShare);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$2(TitleBarAlphaView this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        eah eahVar = this$0.onTitleBarClickListener;
        if (eahVar != null) {
            Intrinsics.checkNotNull(eahVar);
            eahVar.onShowCalendar();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$3(TitleBarAlphaView this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        eah eahVar = this$0.onTitleBarClickListener;
        if (eahVar != null) {
            Intrinsics.checkNotNull(eahVar);
            eahVar.onShowCalendar();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setRealShareBtnClick$default(TitleBarAlphaView titleBarAlphaView, View.OnClickListener onClickListener, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        titleBarAlphaView.setRealShareBtnClick(onClickListener, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTitleClickable$lambda$4(boolean z, TitleBarAlphaView this$0, TextView it) {
        eah eahVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (z && (eahVar = this$0.onTitleBarClickListener) != null) {
            Intrinsics.checkNotNull(eahVar);
            eahVar.onShowCalendar();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTitleClickable$lambda$5(boolean z, TitleBarAlphaView this$0, TextView it) {
        eah eahVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (z && (eahVar = this$0.onTitleBarClickListener) != null) {
            Intrinsics.checkNotNull(eahVar);
            eahVar.onShowCalendar();
        }
        return Unit.INSTANCE;
    }

    public final void bindData(@Nullable String title, @Nullable String descStr) {
        TextView textView = this.txtTitle;
        Intrinsics.checkNotNull(textView);
        textView.setText(title);
        TextView textView2 = this.txtDesc;
        Intrinsics.checkNotNull(textView2);
        textView2.setText(descStr);
    }

    @Nullable
    public final ImageView getImgBackWhite() {
        return this.imgBackWhite;
    }

    @Nullable
    public final ImageView getImgShare() {
        return this.imgShare;
    }

    @Nullable
    public final RelativeLayout getRlContainer() {
        return this.rlContainer;
    }

    @Nullable
    public final ImageView getShareView() {
        return this.shareView;
    }

    @Nullable
    public final TextView getTxtDesc() {
        return this.txtDesc;
    }

    @Nullable
    public final TextView getTxtTitle() {
        return this.txtTitle;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.txtTitle = (TextView) findViewById(eri.eo);
        this.txtDesc = (TextView) findViewById(eri.En);
        this.imgBackWhite = (ImageView) findViewById(eri.v7);
        this.imgShare = (ImageView) findViewById(eri.K7);
        this.shareView = (ImageView) findViewById(eri.af);
        this.rlContainer = (RelativeLayout) findViewById(eri.le);
        ImageView imageView = this.imgBackWhite;
        if (imageView != null) {
            ViewExtKt.clickWithTrigger$default(imageView, 0L, new Function1() { // from class: zfp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TitleBarAlphaView.onFinishInflate$lambda$0(this.f41230a, (ImageView) obj);
                }
            }, 1, null);
        }
        ImageView imageView2 = this.imgShare;
        Intrinsics.checkNotNull(imageView2);
        ViewUtil.setTouchDelegate(imageView2, 20);
        ImageView imageView3 = this.imgShare;
        if (imageView3 != null) {
            ViewExtKt.clickWithTrigger$default(imageView3, 0L, new Function1() { // from class: bgp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TitleBarAlphaView.onFinishInflate$lambda$1(this.f4192a, (ImageView) obj);
                }
            }, 1, null);
        }
        TextView textView = this.txtTitle;
        if (textView != null) {
            ViewExtKt.clickWithTrigger$default(textView, 0L, new Function1() { // from class: dgp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TitleBarAlphaView.onFinishInflate$lambda$2(this.f15520a, (TextView) obj);
                }
            }, 1, null);
        }
        TextView textView2 = this.txtDesc;
        if (textView2 != null) {
            ViewExtKt.clickWithTrigger$default(textView2, 0L, new Function1() { // from class: fgp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TitleBarAlphaView.onFinishInflate$lambda$3(this.f17771a, (TextView) obj);
                }
            }, 1, null);
        }
    }

    public final void setBackImgVisible(int visible) {
        ImageView imageView = this.imgBackWhite;
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(visible);
    }

    public final void setImgBackWhite(@Nullable ImageView imageView) {
        this.imgBackWhite = imageView;
    }

    public final void setImgShare(@Nullable ImageView imageView) {
        this.imgShare = imageView;
    }

    public final void setImgShareVisible(int sportType) {
        switch (sportType) {
            case 11:
            case 12:
            case 13:
            case 14:
                ImageView imageView = this.imgShare;
                Intrinsics.checkNotNull(imageView);
                imageView.setVisibility(8);
                break;
            default:
                ImageView imageView2 = this.imgShare;
                Intrinsics.checkNotNull(imageView2);
                imageView2.setVisibility(0);
                break;
        }
    }

    public final void setOnTitleBarClickListener(@Nullable eah onTitleBarClickListener) {
        this.onTitleBarClickListener = onTitleBarClickListener;
    }

    public final void setRealShareBtnClick(@NotNull View.OnClickListener onClickListener, boolean autoShowBtn) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        if (autoShowBtn) {
            setRealShareBtnVisible(0);
        }
        ImageView imageView = this.shareView;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public final void setRealShareBtnVisible(int visibility) {
        ImageView imageView = this.shareView;
        if (imageView != null) {
            imageView.setVisibility(visibility);
        }
    }

    public final void setRlContainer(@Nullable RelativeLayout relativeLayout) {
        this.rlContainer = relativeLayout;
    }

    public final void setShareImgVisible(int visible) {
        ImageView imageView = this.imgShare;
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(visible);
    }

    public final void setShareView(@Nullable ImageView imageView) {
        this.shareView = imageView;
    }

    public final void setTitleClickable(final boolean enable) {
        TextView textView = this.txtTitle;
        if (textView != null) {
            ViewExtKt.clickWithTrigger$default(textView, 0L, new Function1() { // from class: hgp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TitleBarAlphaView.setTitleClickable$lambda$4(enable, this, (TextView) obj);
                }
            }, 1, null);
        }
        TextView textView2 = this.txtDesc;
        if (textView2 != null) {
            ViewExtKt.clickWithTrigger$default(textView2, 0L, new Function1() { // from class: jgp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TitleBarAlphaView.setTitleClickable$lambda$5(enable, this, (TextView) obj);
                }
            }, 1, null);
        }
        Drawable drawable = getResources().getDrawable(pni.P1);
        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        if (AppUtil.isRTLDirection()) {
            TextView textView3 = this.txtDesc;
            if (textView3 != null) {
                if (!enable) {
                    drawable = null;
                }
                textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        TextView textView4 = this.txtDesc;
        if (textView4 != null) {
            if (!enable) {
                drawable = null;
            }
            textView4.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    public final void setTxtDesc(@Nullable TextView textView) {
        this.txtDesc = textView;
    }

    public final void setTxtTitle(@Nullable TextView textView) {
        this.txtTitle = textView;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        RelativeLayout relativeLayout = this.rlContainer;
        Intrinsics.checkNotNull(relativeLayout);
        relativeLayout.setVisibility(visibility);
    }

    public final void showDesc(boolean visible) {
        TextView textView = this.txtDesc;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(visible ? 0 : 8);
    }

    public final void updateSubTitleRes(int resId) {
        TextView textView = this.txtDesc;
        Intrinsics.checkNotNull(textView);
        textView.setText(resId);
    }

    public final void updateSubTitleStr(@Nullable String title) {
        TextView textView = this.txtDesc;
        Intrinsics.checkNotNull(textView);
        textView.setText(title);
    }

    public final void updateTitleRes(int resId) {
        TextView textView = this.txtTitle;
        Intrinsics.checkNotNull(textView);
        textView.setText(resId);
    }

    public final void updateTitleStr(@Nullable String title) {
        TextView textView = this.txtTitle;
        Intrinsics.checkNotNull(textView);
        textView.setText(title);
    }
}
