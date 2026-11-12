package com.huami.training.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huami.tools.analytics.DbUtils;
import com.huami.training.ext.ImageViewExKt;
import com.huami.training.ext.ViewExKt;
import com.huami.training.ui.R;
import com.huami.training.vo.EntranceKingVo;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR8\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/huami/training/ui/widget/KingView;", "Lcom/huami/training/ui/widget/CourseCardView;", "", "Lcom/huami/training/vo/EntranceKingVo;", "data", "", "setData", "Landroid/widget/LinearLayout;", "a", "Landroid/widget/LinearLayout;", "linearLayout", "Lkotlin/Function2;", "", "", "b", "Lkotlin/jvm/functions/Function2;", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function2;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function2;)V", "onItemClickListener", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class KingView extends CourseCardView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LinearLayout linearLayout;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function2<? super String, ? super Integer, Unit> onItemClickListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ EntranceKingVo b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EntranceKingVo entranceKingVo, int i) {
            super(1);
            this.b = entranceKingVo;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            Function2<String, Integer, Unit> onItemClickListener = KingView.this.getOnItemClickListener();
            if (onItemClickListener == null) {
                return;
            }
            onItemClickListener.invoke(this.b.getJumpType(), Integer.valueOf(this.c));
        }
    }

    public KingView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        setCardBackgroundColor(ContextCompat.getColor(context, R.color.s38));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        addView(linearLayout);
    }

    @Override // com.huami.training.ui.widget.CourseCardView
    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final Function2<String, Integer, Unit> getOnItemClickListener() {
        return this.onItemClickListener;
    }

    public final void setData(@NotNull List<EntranceKingVo> data) {
        LinearLayout linearLayout = this.linearLayout;
        linearLayout.setWeightSum(data.size());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
        int i = 0;
        for (Object obj : data) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            EntranceKingVo entranceKingVo = (EntranceKingVo) obj;
            View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.tr_text_with_img, (ViewGroup) linearLayout, false);
            ImageViewExKt.loadUrl((ImageView) viewInflate.findViewById(R.id.king_icon), entranceKingVo.getIconUrl(), R.drawable.tr_ic_king_placeholder);
            ((TypefaceTextView) viewInflate.findViewById(R.id.king_name)).setText(entranceKingVo.getName());
            ViewExKt.smartClick$default(viewInflate, 0L, new a(entranceKingVo, i), 1, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = 1.0f;
            linearLayout.addView(viewInflate, layoutParams);
            arrayList.add(viewInflate);
            i = i2;
        }
        requestLayout();
    }

    public final void setOnItemClickListener(@Nullable Function2<? super String, ? super Integer, Unit> function2) {
        this.onItemClickListener = function2;
    }
}
