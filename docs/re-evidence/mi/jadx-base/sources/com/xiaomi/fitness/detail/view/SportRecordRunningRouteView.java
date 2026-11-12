package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.target.Target;
import coil.transform.RoundedCornersTransformation;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.detail.model.RouteInfo;
import com.xiaomi.fitness.detail.model.SportsReportOperationalRouteInfo;
import com.xiaomi.fitness.detail.view.SportRecordRunningRouteView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.byi;
import defpackage.dki;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.nqp;
import defpackage.nuf;
import defpackage.xr5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010\n\u001a\u00020\t*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportRecordRunningRouteView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/ImageView;", "", "url", "", "iconWidth", "", "roundedCorner", "", "loadImageWithUrl", "(Landroid/widget/ImageView;Ljava/lang/String;IZ)V", "Lcom/xiaomi/fitness/detail/model/SportsReportOperationalRouteInfo;", "routeDetail", "refreshRoute", "(Lcom/xiaomi/fitness/detail/model/SportsReportOperationalRouteInfo;)V", "Lkotlin/Function0;", "click", "onJoinPunchingInBtnClick", "(Lkotlin/jvm/functions/Function0;)V", "Lnqp;", "binding", "Lnqp;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportRecordRunningRouteView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordRunningRouteView.kt\ncom/xiaomi/fitness/detail/view/SportRecordRunningRouteView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,106:1\n54#2,3:107\n24#2:110\n59#2,4:111\n63#2,2:124\n844#3,9:115\n*S KotlinDebug\n*F\n+ 1 SportRecordRunningRouteView.kt\ncom/xiaomi/fitness/detail/view/SportRecordRunningRouteView\n*L\n90#1:107,3\n90#1:110\n90#1:111,4\n90#1:124,2\n96#1:115,9\n*E\n"})
public final class SportRecordRunningRouteView extends ConstraintLayout {

    @NotNull
    private final nqp binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportRecordRunningRouteView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void loadImageWithUrl(final ImageView imageView, String str, int i, boolean z) {
        if (str == null || TextUtils.isEmpty(str)) {
            imageView.setImageResource(hoi.p);
            return;
        }
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(str).target(imageView);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        builderTarget.size(i, i);
        if (z) {
            builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(Float.valueOf(16.0f))));
        }
        builderTarget.target(new Target() { // from class: com.xiaomi.fitness.detail.view.SportRecordRunningRouteView$loadImageWithUrl$lambda$3$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
                imageView.setImageResource(hoi.p);
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable placeholder) {
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable result) {
                Intrinsics.checkNotNull(result, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                imageView.setImageBitmap(((BitmapDrawable) result).getBitmap());
            }
        });
        builderTarget.placeholder(hoi.p);
        imageLoader.enqueue(builderTarget.build());
    }

    public static /* synthetic */ void loadImageWithUrl$default(SportRecordRunningRouteView sportRecordRunningRouteView, ImageView imageView, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = ExtUtilsKt.getDp(46);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        sportRecordRunningRouteView.loadImageWithUrl(imageView, str, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onJoinPunchingInBtnClick$lambda$0(Function0 click, TextView it) {
        Intrinsics.checkNotNullParameter(click, "$click");
        Intrinsics.checkNotNullParameter(it, "it");
        click.invoke();
        return Unit.INSTANCE;
    }

    public final void onJoinPunchingInBtnClick(@NotNull final Function0<Unit> click) {
        Intrinsics.checkNotNullParameter(click, "click");
        ViewExtKt.clickWithTrigger$default(this.binding.A, 0L, new Function1() { // from class: dun
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordRunningRouteView.onJoinPunchingInBtnClick$lambda$0(click, (TextView) obj);
            }
        }, 1, null);
    }

    public final void refreshRoute(@NotNull SportsReportOperationalRouteInfo routeDetail) {
        Intrinsics.checkNotNullParameter(routeDetail, "routeDetail");
        RouteInfo routeInfo = routeDetail.getRouteInfo();
        ImageView routeIcon = this.binding.D;
        Intrinsics.checkNotNullExpressionValue(routeIcon, "routeIcon");
        loadImageWithUrl(routeIcon, routeInfo.getIcon(), ExtUtilsKt.getDp(72), true);
        this.binding.E.setText(routeInfo.getName());
        this.binding.C.setText(getContext().getResources().getQuantityString(byi.o, (int) xr5.d(2, routeInfo.getLength()).doubleValue(), xr5.d(3, routeInfo.getLength())));
        int bindStatus = routeDetail.getBindStatus();
        if (bindStatus == 1) {
            TextView routeStatusCardTv = this.binding.F;
            Intrinsics.checkNotNullExpressionValue(routeStatusCardTv, "routeStatusCardTv");
            ViewExtKt.visible(routeStatusCardTv);
            this.binding.F.setText(ResourceExtKt.getString(j1j.F9));
            this.binding.F.setBackground(ViewExtKt.getDrawable(this, hoi.O0));
            this.binding.F.setTextColor(ViewExtKt.getColor(this, dki.U1));
            ImageView rightArrow = this.binding.B;
            Intrinsics.checkNotNullExpressionValue(rightArrow, "rightArrow");
            ViewExtKt.visible(rightArrow);
            TextView joinPunchingInBtn = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(joinPunchingInBtn, "joinPunchingInBtn");
            ViewExtKt.gone(joinPunchingInBtn);
        } else if (bindStatus == 2) {
            TextView routeStatusCardTv2 = this.binding.F;
            Intrinsics.checkNotNullExpressionValue(routeStatusCardTv2, "routeStatusCardTv");
            ViewExtKt.visible(routeStatusCardTv2);
            this.binding.F.setText(ResourceExtKt.getString(j1j.E9));
            this.binding.F.setBackground(ViewExtKt.getDrawable(this, hoi.N0));
            this.binding.F.setTextColor(ViewExtKt.getColor(this, dki.J0));
            TextView joinPunchingInBtn2 = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(joinPunchingInBtn2, "joinPunchingInBtn");
            ViewExtKt.gone(joinPunchingInBtn2);
            ImageView rightArrow2 = this.binding.B;
            Intrinsics.checkNotNullExpressionValue(rightArrow2, "rightArrow");
            ViewExtKt.visible(rightArrow2);
        } else if (bindStatus == 3) {
            TextView joinPunchingInBtn3 = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(joinPunchingInBtn3, "joinPunchingInBtn");
            ViewExtKt.visible(joinPunchingInBtn3);
            ImageView rightArrow3 = this.binding.B;
            Intrinsics.checkNotNullExpressionValue(rightArrow3, "rightArrow");
            ViewExtKt.gone(rightArrow3);
            TextView routeStatusCardTv3 = this.binding.F;
            Intrinsics.checkNotNullExpressionValue(routeStatusCardTv3, "routeStatusCardTv");
            ViewExtKt.visible(routeStatusCardTv3);
            this.binding.F.setText(ResourceExtKt.getString(j1j.E9));
            this.binding.F.setBackground(ViewExtKt.getDrawable(this, hoi.N0));
            this.binding.F.setTextColor(ViewExtKt.getColor(this, dki.J0));
        }
        nuf.f(this.binding.A);
        nuf.f(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportRecordRunningRouteView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SportRecordRunningRouteView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportRecordRunningRouteView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = nqp.A0(LayoutInflater.from(context), this, true);
    }
}
