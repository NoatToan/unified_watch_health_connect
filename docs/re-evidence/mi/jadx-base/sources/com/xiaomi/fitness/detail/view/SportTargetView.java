package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.fitness.detail.model.SportTargetModel;
import com.xiaomi.fitness.util.DataUtil;
import defpackage.bsi;
import defpackage.dki;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.uz6;
import defpackage.x44;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020#H\u0002J\u000e\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportTargetView;", "Landroid/widget/RelativeLayout;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "txtTitle", "Landroid/widget/TextView;", "getTxtTitle", "()Landroid/widget/TextView;", "setTxtTitle", "(Landroid/widget/TextView;)V", "txtDesc", "getTxtDesc", "setTxtDesc", "processView", "Lcom/xiaomi/fitness/detail/view/DataDistributeView3;", "getProcessView", "()Lcom/xiaomi/fitness/detail/view/DataDistributeView3;", "setProcessView", "(Lcom/xiaomi/fitness/detail/view/DataDistributeView3;)V", "itemViewTarget", "Lcom/xiaomi/fitness/detail/view/SportValueNameUnitView;", "itemViewActual", "onFinishInflate", "", "getTitle", "", "bindData", "sportTargetModel", "Lcom/xiaomi/fitness/detail/model/SportTargetModel;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportTargetView extends RelativeLayout {

    @Nullable
    private SportValueNameUnitView itemViewActual;

    @Nullable
    private SportValueNameUnitView itemViewTarget;

    @NotNull
    private Context mContext;

    @Nullable
    private DataDistributeView3 processView;

    @Nullable
    private TextView txtDesc;

    @Nullable
    private TextView txtTitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportTargetView(@NotNull Context mContext) {
        this(mContext, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    private final String getTitle() {
        String string = this.mContext.getString(j1j.M8);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final void bindData(@NotNull SportTargetModel sportTargetModel) {
        Intrinsics.checkNotNullParameter(sportTargetModel, "sportTargetModel");
        TextView textView = this.txtTitle;
        if (textView != null) {
            textView.setText(getTitle());
        }
        if (sportTargetModel.getType() == 1) {
            TextView textView2 = this.txtDesc;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            DataDistributeView3 dataDistributeView3 = this.processView;
            if (dataDistributeView3 != null) {
                dataDistributeView3.setVisibility(8);
            }
        } else {
            TextView textView3 = this.txtDesc;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            DataDistributeView3 dataDistributeView4 = this.processView;
            if (dataDistributeView4 != null) {
                dataDistributeView4.setVisibility(0);
            }
            TextView textView4 = this.txtDesc;
            if (textView4 != null) {
                textView4.setText(this.mContext.getString(j1j.d9, sportTargetModel.obtainPercentage()));
            }
            uz6 uz6Var = new uz6(x44.a(dki.F0), this.mContext.getString(j1j.M8), 5, sportTargetModel.getType() == 8 ? Math.round(sportTargetModel.getActualValue().floatValue()) : sportTargetModel.getActualValue().intValue(), DataUtil.computePercentage$default(sportTargetModel.getActualValue(), sportTargetModel.getTargetValue(), 0, 4, null));
            DataDistributeView3 dataDistributeView5 = this.processView;
            if (dataDistributeView5 != null) {
                dataDistributeView5.setModel(uz6Var);
            }
        }
        SportValueNameUnitView sportValueNameUnitView = this.itemViewTarget;
        if (sportValueNameUnitView != null) {
            sportValueNameUnitView.bindData(sportTargetModel.getTargetName(), sportTargetModel.getTargetValueStr(), sportTargetModel.getTargetUnit());
        }
        SportValueNameUnitView sportValueNameUnitView2 = this.itemViewActual;
        if (sportValueNameUnitView2 != null) {
            sportValueNameUnitView2.bindData(sportTargetModel.getActualName(), sportTargetModel.getActualValueStr(), sportTargetModel.getActualUnit());
        }
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @Nullable
    public final DataDistributeView3 getProcessView() {
        return this.processView;
    }

    @Nullable
    public final TextView getTxtDesc() {
        return this.txtDesc;
    }

    @Nullable
    public final TextView getTxtTitle() {
        return this.txtTitle;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.txtTitle = (TextView) findViewById(bsi.J9);
        this.txtDesc = (TextView) findViewById(bsi.j9);
        this.processView = (DataDistributeView3) findViewById(bsi.c5);
        this.itemViewTarget = (SportValueNameUnitView) findViewById(bsi.Z2);
        this.itemViewActual = (SportValueNameUnitView) findViewById(bsi.X2);
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void setProcessView(@Nullable DataDistributeView3 dataDistributeView3) {
        this.processView = dataDistributeView3;
    }

    public final void setTxtDesc(@Nullable TextView textView) {
        this.txtDesc = textView;
    }

    public final void setTxtTitle(@Nullable TextView textView) {
        this.txtTitle = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportTargetView(@NotNull Context mContext, @Nullable AttributeSet attributeSet) {
        this(mContext, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    public /* synthetic */ SportTargetView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportTargetView(@NotNull Context mContext, @Nullable AttributeSet attributeSet, int i) {
        super(mContext, attributeSet, i);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        LayoutInflater.from(mContext).inflate(ivi.i1, this);
    }
}
