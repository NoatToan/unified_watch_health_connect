package com.huami.module.homepage.cards.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.sort.use.CardSortUseCase;
import com.huami.module.homepage.cards.view.EditCardView;
import com.huami.module.homepage.databinding.HomepageItemCardEditBinding;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/huami/module/homepage/cards/view/EditCardView;", "Landroid/widget/FrameLayout;", "Lcom/huami/module/homepage/databinding/HomepageItemCardEditBinding;", "a", "Lcom/huami/module/homepage/databinding/HomepageItemCardEditBinding;", "binding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class EditCardView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageItemCardEditBinding binding;

    @JvmOverloads
    public EditCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public EditCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ EditCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, View view) {
        StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_EDIT_C, new Pair[0]);
        new CardSortUseCase().launchSortPage(context);
    }

    @JvmOverloads
    public EditCardView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        HomepageItemCardEditBinding homepageItemCardEditBindingInflate = HomepageItemCardEditBinding.inflate(LayoutInflater.from(context), this, true);
        this.binding = homepageItemCardEditBindingInflate;
        homepageItemCardEditBindingInflate.getRoot().setOnClickListener(new View.OnClickListener() { // from class: ai1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditCardView.b(context, view);
            }
        });
    }
}
