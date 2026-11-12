package com.xiaomi.fitness.eco.device.manager.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.eco.device.manager.ui.ResetGuideView;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.export.bean.RNProduct;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import com.xiaomi.fitness.webview.CustomWebView;
import defpackage.ari;
import defpackage.fui;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/ResetGuideView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "product", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;Landroid/util/AttributeSet;)V", "onActionListener", "Lcom/xiaomi/fitness/eco/device/manager/ui/ResetGuideView$OnActionListener;", "rootView", "Landroid/view/View;", "rootContainer", "Landroid/widget/RelativeLayout;", "btnClose", "Landroid/widget/Button;", "back", "Landroidx/appcompat/widget/AppCompatImageButton;", "setOnActionListener", "", "Companion", "OnActionListener", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResetGuideView extends LinearLayout {

    @NotNull
    public static final String TAG = "ResetGuideView";

    @NotNull
    private AppCompatImageButton back;

    @NotNull
    private Button btnClose;

    @Nullable
    private OnActionListener onActionListener;

    @NotNull
    private RelativeLayout rootContainer;

    @NotNull
    private View rootView;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/ResetGuideView$OnActionListener;", "", "onKnown", "", "onBack", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnActionListener {
        void onBack();

        void onKnown();
    }

    public /* synthetic */ ResetGuideView(Context context, EcoProduct ecoProduct, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, ecoProduct, (i & 4) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ResetGuideView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnActionListener onActionListener = this$0.onActionListener;
        if (onActionListener != null) {
            onActionListener.onKnown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ResetGuideView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnActionListener onActionListener = this$0.onActionListener;
        if (onActionListener != null) {
            onActionListener.onBack();
        }
    }

    public final void setOnActionListener(@NotNull OnActionListener onActionListener) {
        Intrinsics.checkNotNullParameter(onActionListener, "onActionListener");
        this.onActionListener = onActionListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetGuideView(@NotNull Context context, @NotNull EcoProduct product, @Nullable AttributeSet attributeSet) {
        RNProduct productByModel;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(product, "product");
        this.rootView = LayoutInflater.from(context).inflate(fui.n, this);
        this.rootContainer = (RelativeLayout) findViewById(ari.q);
        try {
            productByModel = ProductExtKt.getInstance(RNProductManager.INSTANCE).getProductByModel(product.getModel());
        } catch (Exception e) {
            e.printStackTrace();
            productByModel = null;
        }
        View viewFindViewById = findViewById(ari.v);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        CustomWebView customWebView = (CustomWebView) viewFindViewById;
        TextView textView = (TextView) findViewById(ari.t);
        TextView textView2 = (TextView) findViewById(ari.f3384r);
        if (EcoDeviceModelExtKt.isEightScale(product.getModel())) {
            customWebView.setVisibility(8);
            textView.setVisibility(0);
            textView2.setVisibility(0);
            ElectronicScaleManager electronicScaleManagerExtKt = ElectronicScaleManagerExtKt.getInstance(ElectronicScaleManager.INSTANCE);
            View viewFindViewById2 = findViewById(ari.n);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            electronicScaleManagerExtKt.loadImageFromNet((ImageView) viewFindViewById2, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_RESET, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_RESET_NIGHT);
        } else if (productByModel != null) {
            customWebView.setVisibility(0);
            textView.setVisibility(8);
            textView2.setVisibility(8);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(ElectronicScaleManagerExtKt.MI_JIA_RESET_GUIDE, Arrays.copyOf(new Object[]{product.getModel(), LocaleUtil.getCurrentLocale()}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            customWebView.loadUrl(str);
        }
        this.rootContainer.setOnClickListener(new View.OnClickListener() { // from class: rpk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResetGuideView._init_$lambda$0(view);
            }
        });
        Button button = (Button) findViewById(ari.p);
        this.btnClose = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: spk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResetGuideView._init_$lambda$1(this.f33865a, view);
            }
        });
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) findViewById(ari.f3382b);
        this.back = appCompatImageButton;
        appCompatImageButton.setOnClickListener(new View.OnClickListener() { // from class: tpk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResetGuideView._init_$lambda$2(this.f34916a, view);
            }
        });
    }
}
