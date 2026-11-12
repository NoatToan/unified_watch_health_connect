package com.huami.femalehealth.uilib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.femalehealth.uilib.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u00010B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010-\u001a\u00020\"¢\u0006\u0004\b.\u0010/J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u00061"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/StatusChooseItemView;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "", "a", "Lcom/huami/femalehealth/uilib/widget/StatusChooseItemView$OnSelectChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSelectChangeListener", "", "select", "getSelect", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onClick", "Landroid/content/Context;", "Landroid/content/Context;", "mContext", "b", "Landroid/view/View;", "mFrameLayout", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "mImageView", GoogleApiAvailabilityLight.a, "mSelectView", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "mTitleTv", "", "f", "Ljava/lang/String;", "mTitleText", "", "g", LogUtil.I, "mImageSrc", "h", "Z", "mSelect", "i", "Lcom/huami/femalehealth/uilib/widget/StatusChooseItemView$OnSelectChangeListener;", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OnSelectChangeListener", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class StatusChooseItemView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context mContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private View mFrameLayout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ImageView mImageView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private ImageView mSelectView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private TextView mTitleTv;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final String mTitleText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int mImageSrc;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean mSelect;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private OnSelectChangeListener listener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/StatusChooseItemView$OnSelectChangeListener;", "", "", "select", "", "selectChange", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public interface OnSelectChangeListener {
        void selectChange(boolean select);
    }

    @JvmOverloads
    public StatusChooseItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public StatusChooseItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ StatusChooseItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void a() {
        View viewInflate = View.inflate(this.mContext, R.layout.fh_view_period_item, this);
        this.mFrameLayout = viewInflate;
        this.mImageView = (ImageView) viewInflate.findViewById(R.id.iv_status_img);
        this.mTitleTv = (TextView) this.mFrameLayout.findViewById(R.id.tv_item_title);
        this.mSelectView = (ImageView) this.mFrameLayout.findViewById(R.id.iv_status_select);
        this.mImageView.setImageDrawable(ContextCompat.getDrawable(getContext(), this.mImageSrc));
        this.mTitleTv.setText(this.mTitleText);
        this.mSelectView.setVisibility(this.mSelect ? 0 : 8);
        this.mFrameLayout.setOnClickListener(this);
    }

    public void _$_clearFindViewByIdCache() {
    }

    /* JADX INFO: renamed from: getSelect, reason: from getter */
    public final boolean getMSelect() {
        return this.mSelect;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        if (this.listener != null) {
            boolean z = !this.mSelect;
            this.mSelect = z;
            select(z);
            this.listener.selectChange(this.mSelect);
        }
    }

    public final void select(boolean select) {
        this.mSelect = select;
        ImageView imageView = this.mSelectView;
        if (imageView != null) {
            imageView.setVisibility(select ? 0 : 8);
        }
    }

    public final void setOnSelectChangeListener(@NotNull OnSelectChangeListener listener) {
        this.listener = listener;
    }

    @JvmOverloads
    public StatusChooseItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        this.mImageSrc = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FHStatusChooseItemView, 0, i);
        this.mTitleText = typedArrayObtainStyledAttributes.getString(R.styleable.FHStatusChooseItemView_fh_statusItemTitle);
        this.mImageSrc = typedArrayObtainStyledAttributes.getResourceId(R.styleable.FHStatusChooseItemView_fh_statusItemImage, -1);
        this.mSelect = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FHStatusChooseItemView_fh_statusItemSelect, false);
        a();
    }
}
