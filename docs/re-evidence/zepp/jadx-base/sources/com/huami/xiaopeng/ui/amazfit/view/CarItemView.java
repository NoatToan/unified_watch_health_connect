package com.huami.xiaopeng.ui.amazfit.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huami.tools.analytics.DbUtils;
import com.huami.xiaopeng.ui.amazfit.R;
import com.huami.xiaopeng.ui.amazfit.view.CarItemView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/huami/xiaopeng/ui/amazfit/view/CarItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "xiaopeng-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class CarItemView extends ConstraintLayout {
    @JvmOverloads
    public CarItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public CarItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CarItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(CarItemView carItemView, View view) {
        carItemView.performClick();
    }

    @JvmOverloads
    public CarItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CarItemView, 0, i);
        LayoutInflater.from(context).inflate(R.layout.car_view_item, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.car_item_title);
        textView.setText(typedArrayObtainStyledAttributes.getString(R.styleable.CarItemView_itemTitle));
        textView.setOnClickListener(new View.OnClickListener() { // from class: pk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CarItemView.b(this.a, view);
            }
        });
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.CarItemView_carItemDivider, 0);
        if (i2 == 0) {
            findViewById(R.id.card_item_divider_bottom).setVisibility(8);
        } else if (i2 == 1) {
            findViewById(R.id.card_item_divider_top).setVisibility(8);
        }
        findViewById(R.id.car_item_arrow_right).setVisibility(typedArrayObtainStyledAttributes.getBoolean(R.styleable.CarItemView_itemEndArrow, true) ? 0 : 8);
        typedArrayObtainStyledAttributes.recycle();
    }
}
