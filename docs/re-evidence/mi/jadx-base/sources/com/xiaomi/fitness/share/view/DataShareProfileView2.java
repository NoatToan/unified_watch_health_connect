package com.xiaomi.fitness.share.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.target.Target;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.ivi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010$\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010&\u001a\u00020%H\u0014J\u0018\u0010'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/share/view/DataShareProfileView2;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imgAvatar", "Landroid/widget/ImageView;", "getImgAvatar", "()Landroid/widget/ImageView;", "setImgAvatar", "(Landroid/widget/ImageView;)V", "txtName", "Landroid/widget/TextView;", "getTxtName", "()Landroid/widget/TextView;", "setTxtName", "(Landroid/widget/TextView;)V", "txtDesc", "getTxtDesc", "setTxtDesc", "txtDesc2", "getTxtDesc2", "setTxtDesc2", "rlProfile", "getRlProfile", "()Landroid/widget/RelativeLayout;", "setRlProfile", "(Landroid/widget/RelativeLayout;)V", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "init", "", "onFinishInflate", "bindData", "xiaomiCoreInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "timestamp", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataShareProfileView2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataShareProfileView2.kt\ncom/xiaomi/fitness/share/view/DataShareProfileView2\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,62:1\n54#2,3:63\n24#2:66\n59#2,4:67\n63#2,2:80\n844#3,9:71\n*S KotlinDebug\n*F\n+ 1 DataShareProfileView2.kt\ncom/xiaomi/fitness/share/view/DataShareProfileView2\n*L\n47#1:63,3\n47#1:66\n47#1:67,4\n47#1:80,2\n50#1:71,9\n*E\n"})
public final class DataShareProfileView2 extends RelativeLayout {

    @Nullable
    private ImageView imgAvatar;

    @Nullable
    private Context mContext;

    @Nullable
    private RelativeLayout rlProfile;

    @Nullable
    private TextView txtDesc;

    @Nullable
    private TextView txtDesc2;

    @Nullable
    private TextView txtName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataShareProfileView2(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        init(context, attrs);
    }

    private final void init(Context context, AttributeSet attrs) {
        this.mContext = context;
        LayoutInflater.from(context).inflate(ivi.r1, this);
    }

    public final void bindData(@Nullable AccountCoreInfo xiaomiCoreInfo, long timestamp) {
        ImageView imageView;
        if (xiaomiCoreInfo != null && (imageView = this.imgAvatar) != null) {
            String avatarAddress = xiaomiCoreInfo.getAvatarAddress();
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(avatarAddress).target(imageView);
            builderTarget.placeholder(hoi.o);
            builderTarget.target(new Target() { // from class: com.xiaomi.fitness.share.view.DataShareProfileView2$bindData$lambda$1$$inlined$target$default$1
                @Override // coil.target.Target
                public void onError(@Nullable Drawable error) {
                }

                @Override // coil.target.Target
                public void onStart(@Nullable Drawable placeholder) {
                }

                @Override // coil.target.Target
                public void onSuccess(@NotNull Drawable result) {
                }
            });
            imageLoader.enqueue(builderTarget.build());
        }
        TextView textView = this.txtName;
        Intrinsics.checkNotNull(textView);
        Intrinsics.checkNotNull(xiaomiCoreInfo);
        textView.setText(xiaomiCoreInfo.getNickName());
        TextView textView2 = this.txtDesc;
        Intrinsics.checkNotNull(textView2);
        textView2.setText(TimeDateUtil.getDateSimpleLocalFormat(timestamp));
        TextView textView3 = this.txtDesc2;
        Intrinsics.checkNotNull(textView3);
        textView3.setText(TimeDateUtil.getDateStr(timestamp, TimeUtils.FORMAT_H_M));
    }

    @Nullable
    public final ImageView getImgAvatar() {
        return this.imgAvatar;
    }

    @Nullable
    public final Context getMContext() {
        return this.mContext;
    }

    @Nullable
    public final RelativeLayout getRlProfile() {
        return this.rlProfile;
    }

    @Nullable
    public final TextView getTxtDesc() {
        return this.txtDesc;
    }

    @Nullable
    public final TextView getTxtDesc2() {
        return this.txtDesc2;
    }

    @Nullable
    public final TextView getTxtName() {
        return this.txtName;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.imgAvatar = (ImageView) findViewById(bsi.A2);
        this.txtName = (TextView) findViewById(bsi.A9);
        this.txtDesc = (TextView) findViewById(bsi.j9);
        this.txtDesc2 = (TextView) findViewById(bsi.k9);
        this.rlProfile = (RelativeLayout) findViewById(bsi.Q5);
    }

    public final void setImgAvatar(@Nullable ImageView imageView) {
        this.imgAvatar = imageView;
    }

    public final void setMContext(@Nullable Context context) {
        this.mContext = context;
    }

    public final void setRlProfile(@Nullable RelativeLayout relativeLayout) {
        this.rlProfile = relativeLayout;
    }

    public final void setTxtDesc(@Nullable TextView textView) {
        this.txtDesc = textView;
    }

    public final void setTxtDesc2(@Nullable TextView textView) {
        this.txtDesc2 = textView;
    }

    public final void setTxtName(@Nullable TextView textView) {
        this.txtName = textView;
    }
}
