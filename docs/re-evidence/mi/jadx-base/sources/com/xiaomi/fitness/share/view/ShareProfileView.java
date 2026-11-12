package com.xiaomi.fitness.share.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.detail.view.RingView;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.ColorSchemeHelper;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.tli;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/share/view/ShareProfileView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "setIcon", "(Landroid/widget/ImageView;)V", "nickView", "Landroid/widget/TextView;", "getNickView", "()Landroid/widget/TextView;", "setNickView", "(Landroid/widget/TextView;)V", "dateView", "getDateView", "setDateView", "logoView", "Lcom/xiaomi/fitness/detail/view/RingView;", "getLogoView", "()Lcom/xiaomi/fitness/detail/view/RingView;", "setLogoView", "(Lcom/xiaomi/fitness/detail/view/RingView;)V", "bindData", "", "userInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", DialWidgetType.DATE, "", ColorSchemeHelper.SCHEME_DARK, "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShareProfileView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareProfileView.kt\ncom/xiaomi/fitness/share/view/ShareProfileView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,63:1\n54#2,3:64\n24#2:67\n59#2,6:68\n*S KotlinDebug\n*F\n+ 1 ShareProfileView.kt\ncom/xiaomi/fitness/share/view/ShareProfileView\n*L\n40#1:64,3\n40#1:67\n40#1:68,6\n*E\n"})
public final class ShareProfileView extends ConstraintLayout {

    @NotNull
    private TextView dateView;

    @NotNull
    private ImageView icon;

    @NotNull
    private RingView logoView;

    @NotNull
    private TextView nickView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareProfileView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void bindData$default(ShareProfileView shareProfileView, AccountCoreInfo accountCoreInfo, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        shareProfileView.bindData(accountCoreInfo, str, z);
    }

    public final void bindData(@Nullable AccountCoreInfo userInfo, @Nullable String date, boolean dark) {
        String nickName;
        if (userInfo != null) {
            ImageView imageView = this.icon;
            String avatarAddress = userInfo.getAvatarAddress();
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(avatarAddress).target(imageView);
            builderTarget.allowHardware(false);
            builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
            builderTarget.placeholder(hoi.o);
            builderTarget.error(hoi.o);
            imageLoader.enqueue(builderTarget.build());
            TextView textView = this.nickView;
            String userName = userInfo.getUserName();
            if (userName == null || userName.length() == 0) {
                String nickName2 = userInfo.getNickName();
                if (nickName2 == null || nickName2.length() == 0) {
                    nickName = "";
                } else {
                    nickName = userInfo.getNickName();
                    Intrinsics.checkNotNull(nickName);
                }
            } else {
                nickName = userInfo.getUserName();
                Intrinsics.checkNotNull(nickName);
            }
            textView.setText(nickName);
        }
        this.dateView.setText(date);
        if (dark) {
            this.nickView.setTextColor(-16777216);
            this.dateView.setTextColor(-16777216);
            this.logoView.setColor(-16777216);
        }
    }

    @NotNull
    public final TextView getDateView() {
        return this.dateView;
    }

    @NotNull
    public final ImageView getIcon() {
        return this.icon;
    }

    @NotNull
    public final RingView getLogoView() {
        return this.logoView;
    }

    @NotNull
    public final TextView getNickView() {
        return this.nickView;
    }

    public final void setDateView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dateView = textView;
    }

    public final void setIcon(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.icon = imageView;
    }

    public final void setLogoView(@NotNull RingView ringView) {
        Intrinsics.checkNotNullParameter(ringView, "<set-?>");
        this.logoView = ringView;
    }

    public final void setNickView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.nickView = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareProfileView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareProfileView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(ivi.a1, (ViewGroup) this, true);
        this.icon = (ImageView) viewInflate.findViewById(bsi.p2);
        this.nickView = (TextView) viewInflate.findViewById(bsi.K4);
        this.dateView = (TextView) viewInflate.findViewById(bsi.e1);
        this.logoView = (RingView) viewInflate.findViewById(bsi.Q3);
        int dimensionPixelSize = getResources().getDimensionPixelSize(tli.g);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public /* synthetic */ ShareProfileView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
