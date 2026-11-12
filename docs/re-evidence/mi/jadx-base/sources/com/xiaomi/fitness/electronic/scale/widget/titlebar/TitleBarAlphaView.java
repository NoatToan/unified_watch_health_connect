package com.xiaomi.fitness.electronic.scale.widget.titlebar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.ViewUtil;
import com.xiaomi.fitness.electronic.scale.widget.titlebar.TitleBarAlphaView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.bri;
import defpackage.fah;
import defpackage.gui;
import defpackage.lni;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0016R$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R$\u0010/\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00105¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/titlebar/TitleBarAlphaView;", "Landroid/widget/RelativeLayout;", "", "onFinishInflate", "()V", "", "enable", "setTitleClickable", "(Z)V", "Lfah;", "onTitleBarClickListener", "setOnTitleBarClickListener", "(Lfah;)V", "", "title", "descStr", "bindData", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "", "visible", "setDesTxtVisible", "(I)V", "setShareImgVisible", "setBackImgVisible", "visibility", "setVisibility", "Landroid/widget/TextView;", "txtTitle", "Landroid/widget/TextView;", "getTxtTitle", "()Landroid/widget/TextView;", "setTxtTitle", "(Landroid/widget/TextView;)V", "txtDesc", "getTxtDesc", "setTxtDesc", "Landroid/widget/ImageView;", "imgBackWhite", "Landroid/widget/ImageView;", "getImgBackWhite", "()Landroid/widget/ImageView;", "setImgBackWhite", "(Landroid/widget/ImageView;)V", "imgShare", "getImgShare", "setImgShare", "rlContainer", "Landroid/widget/RelativeLayout;", "getRlContainer", "()Landroid/widget/RelativeLayout;", "setRlContainer", "(Landroid/widget/RelativeLayout;)V", "Lfah;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TitleBarAlphaView extends RelativeLayout {

    @Nullable
    private ImageView imgBackWhite;

    @Nullable
    private ImageView imgShare;

    @Nullable
    private fah onTitleBarClickListener;

    @Nullable
    private RelativeLayout rlContainer;

    @Nullable
    private TextView txtDesc;

    @Nullable
    private TextView txtTitle;

    public TitleBarAlphaView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(gui.u0, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$0(TitleBarAlphaView this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        fah fahVar = this$0.onTitleBarClickListener;
        if (fahVar != null) {
            Intrinsics.checkNotNull(fahVar);
            fahVar.onImgBackClick(this$0.imgBackWhite);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$1(TitleBarAlphaView this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        fah fahVar = this$0.onTitleBarClickListener;
        if (fahVar != null) {
            Intrinsics.checkNotNull(fahVar);
            fahVar.onImgShareClick(this$0.imgShare);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$2(TitleBarAlphaView this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        fah fahVar = this$0.onTitleBarClickListener;
        if (fahVar != null) {
            Intrinsics.checkNotNull(fahVar);
            fahVar.onShowCalendar();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$3(TitleBarAlphaView this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        fah fahVar = this$0.onTitleBarClickListener;
        if (fahVar != null) {
            Intrinsics.checkNotNull(fahVar);
            fahVar.onShowCalendar();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTitleClickable$lambda$4(boolean z, TitleBarAlphaView this$0, TextView it) {
        fah fahVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (z && (fahVar = this$0.onTitleBarClickListener) != null) {
            Intrinsics.checkNotNull(fahVar);
            fahVar.onShowCalendar();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTitleClickable$lambda$5(boolean z, TitleBarAlphaView this$0, TextView it) {
        fah fahVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (z && (fahVar = this$0.onTitleBarClickListener) != null) {
            Intrinsics.checkNotNull(fahVar);
            fahVar.onShowCalendar();
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
        this.txtTitle = (TextView) findViewById(bri.c6);
        this.txtDesc = (TextView) findViewById(bri.Z5);
        this.imgBackWhite = (ImageView) findViewById(bri.U0);
        this.imgShare = (ImageView) findViewById(bri.c1);
        this.rlContainer = (RelativeLayout) findViewById(bri.v3);
        ImageView imageView = this.imgBackWhite;
        if (imageView != null) {
            ViewExtKt.clickWithTrigger$default(imageView, 0L, new Function1() { // from class: egp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TitleBarAlphaView.onFinishInflate$lambda$0(this.f16626a, (ImageView) obj);
                }
            }, 1, null);
        }
        ImageView imageView2 = this.imgShare;
        Intrinsics.checkNotNull(imageView2);
        ViewUtil.setTouchDelegate(imageView2, 20);
        ImageView imageView3 = this.imgShare;
        if (imageView3 != null) {
            ViewExtKt.clickWithTrigger$default(imageView3, 0L, new Function1() { // from class: ggp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TitleBarAlphaView.onFinishInflate$lambda$1(this.f18966a, (ImageView) obj);
                }
            }, 1, null);
        }
        TextView textView = this.txtTitle;
        if (textView != null) {
            ViewExtKt.clickWithTrigger$default(textView, 0L, new Function1() { // from class: igp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TitleBarAlphaView.onFinishInflate$lambda$2(this.f21121a, (TextView) obj);
                }
            }, 1, null);
        }
        TextView textView2 = this.txtDesc;
        if (textView2 != null) {
            ViewExtKt.clickWithTrigger$default(textView2, 0L, new Function1() { // from class: kgp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TitleBarAlphaView.onFinishInflate$lambda$3(this.f23832a, (TextView) obj);
                }
            }, 1, null);
        }
    }

    public final void setBackImgVisible(int visible) {
        ImageView imageView = this.imgBackWhite;
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(visible);
    }

    public final void setDesTxtVisible(int visible) {
        TextView textView = this.txtDesc;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(visible);
    }

    public final void setImgBackWhite(@Nullable ImageView imageView) {
        this.imgBackWhite = imageView;
    }

    public final void setImgShare(@Nullable ImageView imageView) {
        this.imgShare = imageView;
    }

    public final void setOnTitleBarClickListener(@Nullable fah onTitleBarClickListener) {
        this.onTitleBarClickListener = onTitleBarClickListener;
    }

    public final void setRlContainer(@Nullable RelativeLayout relativeLayout) {
        this.rlContainer = relativeLayout;
    }

    public final void setShareImgVisible(int visible) {
        ImageView imageView = this.imgShare;
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(visible);
    }

    public final void setTitleClickable(final boolean enable) {
        TextView textView = this.txtTitle;
        if (textView != null) {
            ViewExtKt.clickWithTrigger$default(textView, 0L, new Function1() { // from class: agp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TitleBarAlphaView.setTitleClickable$lambda$4(enable, this, (TextView) obj);
                }
            }, 1, null);
        }
        TextView textView2 = this.txtDesc;
        if (textView2 != null) {
            ViewExtKt.clickWithTrigger$default(textView2, 0L, new Function1() { // from class: cgp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TitleBarAlphaView.setTitleClickable$lambda$5(enable, this, (TextView) obj);
                }
            }, 1, null);
        }
        Drawable drawable = getResources().getDrawable(lni.g);
        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        TextView textView3 = this.txtDesc;
        if (textView3 != null) {
            if (!enable) {
                drawable = null;
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
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

    public final void bindData(@Nullable String title) {
        TextView textView = this.txtTitle;
        Intrinsics.checkNotNull(textView);
        textView.setText(title);
    }
}
