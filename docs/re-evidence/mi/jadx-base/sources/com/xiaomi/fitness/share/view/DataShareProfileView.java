package com.xiaomi.fitness.share.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import defpackage.bsi;
import defpackage.dki;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.w4j;
import defpackage.x44;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010*\u001a\u00020+2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010,\u001a\u00020+H\u0014J\u001a\u0010-\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001c\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/share/view/DataShareProfileView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imgAvatar", "Landroid/widget/ImageView;", "getImgAvatar", "()Landroid/widget/ImageView;", "setImgAvatar", "(Landroid/widget/ImageView;)V", "txtName", "Landroid/widget/TextView;", "getTxtName", "()Landroid/widget/TextView;", "setTxtName", "(Landroid/widget/TextView;)V", "txtDesc", "getTxtDesc", "setTxtDesc", "rlProfile", "getRlProfile", "()Landroid/widget/RelativeLayout;", "setRlProfile", "(Landroid/widget/RelativeLayout;)V", "titleTxtColor", "", "getTitleTxtColor", "()I", "setTitleTxtColor", "(I)V", "descTxtColor", "getDescTxtColor", "setDescTxtColor", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "init", "", "onFinishInflate", "bindData", "coreInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "descInfo", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataShareProfileView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataShareProfileView.kt\ncom/xiaomi/fitness/share/view/DataShareProfileView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,78:1\n54#2,3:79\n24#2:82\n59#2,6:83\n*S KotlinDebug\n*F\n+ 1 DataShareProfileView.kt\ncom/xiaomi/fitness/share/view/DataShareProfileView\n*L\n60#1:79,3\n60#1:82\n60#1:83,6\n*E\n"})
public final class DataShareProfileView extends RelativeLayout {
    private int descTxtColor;

    @Nullable
    private ImageView imgAvatar;

    @Nullable
    private Context mContext;

    @Nullable
    private RelativeLayout rlProfile;
    private int titleTxtColor;

    @Nullable
    private TextView txtDesc;

    @Nullable
    private TextView txtName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataShareProfileView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        init(context, attributeSet);
    }

    private final void init(Context context, AttributeSet attrs) {
        this.mContext = context;
        LayoutInflater.from(context).inflate(ivi.q1, this);
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, w4j.x0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.titleTxtColor = typedArrayObtainStyledAttributes.getColor(w4j.z0, x44.a(dki.j));
            this.descTxtColor = typedArrayObtainStyledAttributes.getColor(w4j.y0, x44.a(dki.i));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void bindData(@Nullable AccountCoreInfo coreInfo, @Nullable String descInfo) {
        String userName;
        ImageView imageView;
        if (coreInfo != null && (imageView = this.imgAvatar) != null) {
            String avatarAddress = coreInfo.getAvatarAddress();
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(avatarAddress).target(imageView);
            builderTarget.allowHardware(false);
            builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
            builderTarget.placeholder(hoi.o);
            builderTarget.error(hoi.o);
            imageLoader.enqueue(builderTarget.build());
        }
        TextView textView = this.txtName;
        if (textView != null) {
            String str = "";
            if (!TextUtils.isEmpty(coreInfo != null ? coreInfo.getUserName() : null) ? !(coreInfo == null || (userName = coreInfo.getUserName()) == null) : !(coreInfo == null || (userName = coreInfo.getNickName()) == null)) {
                str = userName;
            }
            textView.setText(str);
        }
        TextView textView2 = this.txtDesc;
        Intrinsics.checkNotNull(textView2);
        textView2.setText(descInfo);
    }

    public final int getDescTxtColor() {
        return this.descTxtColor;
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

    public final int getTitleTxtColor() {
        return this.titleTxtColor;
    }

    @Nullable
    public final TextView getTxtDesc() {
        return this.txtDesc;
    }

    @Nullable
    public final TextView getTxtName() {
        return this.txtName;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.imgAvatar = (ImageView) findViewById(bsi.A2);
        TextView textView = (TextView) findViewById(bsi.A9);
        this.txtName = textView;
        if (textView != null) {
            textView.setTextColor(this.titleTxtColor);
        }
        TextView textView2 = (TextView) findViewById(bsi.j9);
        this.txtDesc = textView2;
        if (textView2 != null) {
            textView2.setTextColor(this.descTxtColor);
        }
        this.rlProfile = (RelativeLayout) findViewById(bsi.Q5);
    }

    public final void setDescTxtColor(int i) {
        this.descTxtColor = i;
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

    public final void setTitleTxtColor(int i) {
        this.titleTxtColor = i;
    }

    public final void setTxtDesc(@Nullable TextView textView) {
        this.txtDesc = textView;
    }

    public final void setTxtName(@Nullable TextView textView) {
        this.txtName = textView;
    }
}
