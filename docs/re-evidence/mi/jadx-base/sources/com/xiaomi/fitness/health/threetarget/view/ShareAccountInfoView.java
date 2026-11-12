package com.xiaomi.fitness.health.threetarget.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0006\u0010\u0017\u001a\u00020\u0011J\u0006\u0010\u0018\u001a\u00020\u0011R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/view/ShareAccountInfoView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "avatarView", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "nameView", "Landroid/widget/TextView;", "timeView", "descTextView", "setTime", "", "time", "", "initAccountInfo", "xiaomiCoreInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "setTextToDarkColor", "setAvatarViewWithStroke", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShareAccountInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareAccountInfoView.kt\ncom/xiaomi/fitness/health/threetarget/view/ShareAccountInfoView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,63:1\n54#2,3:64\n24#2:67\n59#2,6:68\n*S KotlinDebug\n*F\n+ 1 ShareAccountInfoView.kt\ncom/xiaomi/fitness/health/threetarget/view/ShareAccountInfoView\n*L\n43#1:64,3\n43#1:67\n43#1:68,6\n*E\n"})
public final class ShareAccountInfoView extends FrameLayout {

    @NotNull
    private RoundImageView avatarView;

    @NotNull
    private TextView descTextView;

    @NotNull
    private TextView nameView;

    @NotNull
    private TextView timeView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareAccountInfoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void initAccountInfo(@Nullable AccountCoreInfo xiaomiCoreInfo) {
        if (xiaomiCoreInfo != null) {
            RoundImageView roundImageView = this.avatarView;
            String avatarAddress = xiaomiCoreInfo.getAvatarAddress();
            ImageLoader imageLoader = Coil.imageLoader(roundImageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(roundImageView.getContext()).data(avatarAddress).target(roundImageView);
            builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
            imageLoader.enqueue(builderTarget.build());
            TextView textView = this.nameView;
            String userName = xiaomiCoreInfo.getUserName();
            textView.setText((userName == null || userName.length() == 0) ? xiaomiCoreInfo.getUserId() : xiaomiCoreInfo.getUserName());
        }
    }

    public final void setAvatarViewWithStroke() {
        this.avatarView.setInnerStrokeWidth(ExtUtilsKt.getDp(2));
        this.avatarView.setMInnerStrokeColor(-1);
    }

    public final void setTextToDarkColor() {
        this.nameView.setTextColor(getContext().getResources().getColor(iji.f21228a, null));
        int color = getContext().getResources().getColor(iji.c, null);
        this.timeView.setTextColor(color);
        this.descTextView.setTextColor(color);
    }

    public final void setTime(@Nullable String time) {
        this.timeView.setText(time);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareAccountInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ShareAccountInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareAccountInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(jui.W5, this);
        this.avatarView = (RoundImageView) findViewById(eri.P);
        this.nameView = (TextView) findViewById(eri.dc);
        this.timeView = (TextView) findViewById(eri.Ui);
        this.descTextView = (TextView) findViewById(eri.f3);
    }
}
