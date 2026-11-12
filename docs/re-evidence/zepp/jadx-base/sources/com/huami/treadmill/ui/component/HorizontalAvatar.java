package com.huami.treadmill.ui.component;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.R;
import com.huami.treadmill.TdmillConfig;
import com.huami.treadmill.util.DensityUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u000e"}, d2 = {"Lcom/huami/treadmill/ui/component/HorizontalAvatar;", "Landroid/widget/FrameLayout;", "", "", "urls", "", "addAvatas", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class HorizontalAvatar extends FrameLayout {
    public HorizontalAvatar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void addAvatas(@NotNull List<String> urls) {
        if (urls.isEmpty()) {
            return;
        }
        int i = 0;
        for (Object obj : urls) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            DensityUtils densityUtils = DensityUtils.INSTANCE;
            int iDip2px = i * densityUtils.dip2px(getContext(), 24.0f);
            ImageView imageView = new ImageView(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(densityUtils.dip2px(getContext(), 30.0f), densityUtils.dip2px(getContext(), 30.0f));
            layoutParams.setMarginStart(iDip2px);
            Unit unit = Unit.INSTANCE;
            imageView.setLayoutParams(layoutParams);
            Glide.with(this).load((String) obj).apply(TdmillConfig.INSTANCE.getAvatarOptions().transform(new CircleCrop())).into(imageView);
            addView(imageView);
            ImageView imageView2 = new ImageView(getContext());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(densityUtils.dip2px(getContext(), 30.0f), densityUtils.dip2px(getContext(), 30.0f));
            layoutParams2.setMarginStart(iDip2px);
            imageView2.setLayoutParams(layoutParams2);
            imageView2.setBackgroundResource(R.drawable.td_avatar_ring_horizontal);
            addView(imageView2);
            i = i2;
        }
    }

    public HorizontalAvatar(@NotNull Context context) {
        this(context, null);
    }
}
