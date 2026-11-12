package com.xiaomi.fitness.summary.recycler;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.detail.view.SportValueNameUnitView;
import defpackage.bsi;
import defpackage.byi;
import defpackage.dki;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.k47;
import defpackage.xr5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003=><B\u001d\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\"¢\u0006\u0004\b:\u0010;J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&\"\u0004\b-\u0010(R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00105\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010\t¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/summary/recycler/SportBehaviorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "initLevelData", "()V", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "setActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;", "getItemAsPosition", "(I)Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "", "mDataList", "Ljava/util/List;", "getMDataList", "()Ljava/util/List;", "setMDataList", "(Ljava/util/List;)V", "", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "mLevelItems", "getMLevelItems", "setMLevelItems", "Landroid/view/LayoutInflater;", "mLayoutInflater", "Landroid/view/LayoutInflater;", "getMLayoutInflater", "()Landroid/view/LayoutInflater;", "setMLayoutInflater", "(Landroid/view/LayoutInflater;)V", "mActivity", "Landroidx/fragment/app/FragmentActivity;", "getMActivity", "()Landroidx/fragment/app/FragmentActivity;", "setMActivity", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Companion", "LevelViewHolder", "ContentViewHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportBehaviorAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int ITEM_TYPE_COMMON = 0;
    public static final int ITEM_TYPE_HEAD = 2;
    public static final int ITEM_TYPE_LEVEL = 1;
    public static final int SPAN_COUNT_THREE = 3;
    public static final int SPAN_COUNT_TWO = 2;

    @NotNull
    private static final String TAG = "SportBehaviorAdapter";

    @Nullable
    private FragmentActivity mActivity;

    @NotNull
    private Context mContext;

    @NotNull
    private List<? extends SportBehaviorModel> mDataList;

    @NotNull
    private LayoutInflater mLayoutInflater;

    @Nullable
    private List<LevelBarView.LevelItem> mLevelItems;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/summary/recycler/SportBehaviorAdapter$ContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;", "model", "", "bindData", "(Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;)V", "Lcom/xiaomi/fitness/detail/view/SportValueNameUnitView;", "valueUnitView", "Lcom/xiaomi/fitness/detail/view/SportValueNameUnitView;", "getValueUnitView", "()Lcom/xiaomi/fitness/detail/view/SportValueNameUnitView;", "setValueUnitView", "(Lcom/xiaomi/fitness/detail/view/SportValueNameUnitView;)V", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/summary/recycler/SportBehaviorAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ContentViewHolder extends RecyclerView.d0 {
        final /* synthetic */ SportBehaviorAdapter this$0;

        @NotNull
        private SportValueNameUnitView valueUnitView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentViewHolder(@NotNull SportBehaviorAdapter sportBehaviorAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sportBehaviorAdapter;
            this.valueUnitView = (SportValueNameUnitView) itemView.findViewById(bsi.W9);
        }

        public final void bindData(@Nullable SportBehaviorModel model) {
            SportValueNameUnitView sportValueNameUnitView = this.valueUnitView;
            Intrinsics.checkNotNull(model);
            sportValueNameUnitView.bindData(model, this.this$0.getMActivity());
        }

        @NotNull
        public final SportValueNameUnitView getValueUnitView() {
            return this.valueUnitView;
        }

        public final void setValueUnitView(@NotNull SportValueNameUnitView sportValueNameUnitView) {
            Intrinsics.checkNotNullParameter(sportValueNameUnitView, "<set-?>");
            this.valueUnitView = sportValueNameUnitView;
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/summary/recycler/SportBehaviorAdapter$LevelViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "computeFraction", "()I", "Landroid/widget/TextView;", "textView", "row", "column", "Landroidx/constraintlayout/widget/a;", "createItemConstraintSet", "(Landroid/widget/TextView;II)Landroidx/constraintlayout/widget/a;", "createItemConstraintSet2", "Landroid/content/Context;", "context", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "levelBean", "createItemView", "(Landroid/content/Context;Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;)Landroid/widget/TextView;", "createItemViewInner", "(Landroid/content/Context;)Landroid/widget/TextView;", "Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;", "model", "", "bindData", "(Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;)V", "txtTitle", "Landroid/widget/TextView;", "getTxtTitle", "()Landroid/widget/TextView;", "setTxtTitle", "(Landroid/widget/TextView;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "constraintContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getConstraintContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setConstraintContainer", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "levelBarView", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "getLevelBarView", "()Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "setLevelBarView", "(Lcom/xiaomi/fitness/baseui/widget/LevelBarView;)V", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/summary/recycler/SportBehaviorAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class LevelViewHolder extends RecyclerView.d0 {

        @NotNull
        private ConstraintLayout constraintContainer;

        @NotNull
        private LevelBarView levelBarView;
        final /* synthetic */ SportBehaviorAdapter this$0;

        @NotNull
        private TextView txtTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LevelViewHolder(@NotNull SportBehaviorAdapter sportBehaviorAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sportBehaviorAdapter;
            this.txtTitle = (TextView) itemView.findViewById(bsi.h9);
            this.constraintContainer = (ConstraintLayout) itemView.findViewById(bsi.M);
            LevelBarView levelBarView = (LevelBarView) itemView.findViewById(bsi.G3);
            this.levelBarView = levelBarView;
            levelBarView.setLevels(sportBehaviorAdapter.getMLevelItems());
        }

        private final int computeFraction() {
            List<LevelBarView.LevelItem> mLevelItems = this.this$0.getMLevelItems();
            Intrinsics.checkNotNull(mLevelItems);
            int size = mLevelItems.size();
            String str = "";
            for (int i = 0; i < size; i++) {
                List<LevelBarView.LevelItem> mLevelItems2 = this.this$0.getMLevelItems();
                Intrinsics.checkNotNull(mLevelItems2);
                String string = this.this$0.getMContext().getString(mLevelItems2.get(i).c);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                if (string.length() > str.length()) {
                    str = string;
                }
            }
            return createItemViewInner(this.this$0.getMContext()).getPaint().measureText(str) > ((float) (((DisplayUtil.getScreenWidth() - (DisplayUtil.dip2px(25.0f) * 2)) - (DisplayUtil.dip2px(12.0f) * 2)) / 3)) ? 2 : 3;
        }

        private final a createItemConstraintSet(TextView textView, int row, int column) {
            a aVar = new a();
            aVar.s(this.constraintContainer);
            int iDip2px = row * DisplayUtil.dip2px(25.0f);
            if (column == 0) {
                aVar.v(textView.getId(), 6, 0, 6);
            } else if (column != 1) {
                aVar.v(textView.getId(), 7, 0, 7);
            } else {
                aVar.o(textView.getId(), 0);
            }
            aVar.w(textView.getId(), 3, 0, 3, iDip2px);
            aVar.i(this.constraintContainer);
            return aVar;
        }

        private final a createItemConstraintSet2(TextView textView, int row, int column) {
            a aVar = new a();
            aVar.s(this.constraintContainer);
            int iDip2px = row * DisplayUtil.dip2px(25.0f);
            if (column == 0) {
                aVar.v(textView.getId(), 6, 0, 6);
            } else {
                aVar.v(textView.getId(), 7, 0, 7);
            }
            aVar.w(textView.getId(), 3, 0, 3, iDip2px);
            aVar.i(this.constraintContainer);
            return aVar;
        }

        private final TextView createItemView(Context context, LevelBarView.LevelItem levelBean) {
            TextView textView = new TextView(context);
            textView.setId(View.generateViewId());
            textView.setText(levelBean.c);
            textView.setTextSize(11.0f);
            textView.setTextColor(this.this$0.getMContext().getResources().getColor(dki.c1));
            Drawable drawable = this.this$0.getMContext().getResources().getDrawable(hoi.f20294b);
            k47.n(drawable, this.this$0.getMContext().getResources().getColor(levelBean.f11683a));
            textView.setGravity(4);
            textView.setIncludeFontPadding(false);
            textView.setCompoundDrawablePadding(DisplayUtil.dip2px(3.0f));
            if (AppUtil.isRTLDirection()) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.constraintContainer.addView(textView);
            return textView;
        }

        private final TextView createItemViewInner(Context context) {
            TextView textView = new TextView(context);
            textView.setId(View.generateViewId());
            textView.setTextSize(11.0f);
            textView.setTextColor(this.this$0.getMContext().getResources().getColor(dki.c1));
            return textView;
        }

        public final void bindData(@Nullable SportBehaviorModel model) {
            Intrinsics.checkNotNull(model);
            float f = model.f13233b;
            int i = model.c;
            String quantityString = this.this$0.getMContext().getResources().getQuantityString(byi.Y, xr5.j(f), xr5.f(model.f13233b));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            if (model.d == 0) {
                this.txtTitle.setText(this.this$0.getMContext().getString(j1j.t9, quantityString));
            } else {
                this.txtTitle.setText(this.this$0.getMContext().getString(j1j.u9, quantityString));
            }
            List<LevelBarView.LevelItem> mLevelItems = this.this$0.getMLevelItems();
            Intrinsics.checkNotNull(mLevelItems);
            int size = mLevelItems.size();
            int iComputeFraction = computeFraction();
            for (int i2 = 0; i2 < size; i2++) {
                List<LevelBarView.LevelItem> mLevelItems2 = this.this$0.getMLevelItems();
                Intrinsics.checkNotNull(mLevelItems2);
                TextView textViewCreateItemView = createItemView(this.this$0.getMContext(), mLevelItems2.get(i2));
                int i3 = i2 / iComputeFraction;
                int i4 = i2 % iComputeFraction;
                if (iComputeFraction == 3) {
                    createItemConstraintSet(textViewCreateItemView, i3, i4);
                } else {
                    createItemConstraintSet2(textViewCreateItemView, i3, i4);
                }
            }
            this.levelBarView.setLevel(i - 1);
        }

        @NotNull
        public final ConstraintLayout getConstraintContainer() {
            return this.constraintContainer;
        }

        @NotNull
        public final LevelBarView getLevelBarView() {
            return this.levelBarView;
        }

        @NotNull
        public final TextView getTxtTitle() {
            return this.txtTitle;
        }

        public final void setConstraintContainer(@NotNull ConstraintLayout constraintLayout) {
            Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
            this.constraintContainer = constraintLayout;
        }

        public final void setLevelBarView(@NotNull LevelBarView levelBarView) {
            Intrinsics.checkNotNullParameter(levelBarView, "<set-?>");
            this.levelBarView = levelBarView;
        }

        public final void setTxtTitle(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.txtTitle = textView;
        }
    }

    public SportBehaviorAdapter(@NotNull Context mContext, @NotNull List<? extends SportBehaviorModel> mDataList) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mDataList, "mDataList");
        this.mContext = mContext;
        this.mDataList = mDataList;
        this.mLayoutInflater = LayoutInflater.from(mContext);
        initLevelData();
    }

    private final void initLevelData() {
        ArrayList arrayList = new ArrayList();
        this.mLevelItems = arrayList;
        arrayList.add(new LevelBarView.LevelItem(dki.s1, j1j.r9));
        List<LevelBarView.LevelItem> list = this.mLevelItems;
        if (list != null) {
            list.add(new LevelBarView.LevelItem(dki.t1, j1j.s9));
        }
        List<LevelBarView.LevelItem> list2 = this.mLevelItems;
        if (list2 != null) {
            list2.add(new LevelBarView.LevelItem(dki.u1, j1j.q9));
        }
        List<LevelBarView.LevelItem> list3 = this.mLevelItems;
        if (list3 != null) {
            list3.add(new LevelBarView.LevelItem(dki.v1, j1j.o9));
        }
        List<LevelBarView.LevelItem> list4 = this.mLevelItems;
        if (list4 != null) {
            list4.add(new LevelBarView.LevelItem(dki.w1, j1j.p9));
        }
        List<LevelBarView.LevelItem> list5 = this.mLevelItems;
        if (list5 != null) {
            list5.add(new LevelBarView.LevelItem(dki.x1, j1j.n9));
        }
    }

    @NotNull
    public final SportBehaviorModel getItemAsPosition(int position) {
        return this.mDataList.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mDataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.mDataList.get(position).f13232a;
    }

    @Nullable
    public final FragmentActivity getMActivity() {
        return this.mActivity;
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @NotNull
    public final List<SportBehaviorModel> getMDataList() {
        return this.mDataList;
    }

    @NotNull
    public final LayoutInflater getMLayoutInflater() {
        return this.mLayoutInflater;
    }

    @Nullable
    public final List<LevelBarView.LevelItem> getMLevelItems() {
        return this.mLevelItems;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 viewHolder, int position) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        SportBehaviorModel itemAsPosition = getItemAsPosition(position);
        if (viewHolder instanceof LevelViewHolder) {
            ((LevelViewHolder) viewHolder).bindData(itemAsPosition);
        } else {
            if (!(viewHolder instanceof ContentViewHolder) || itemAsPosition == null) {
                return;
            }
            ((ContentViewHolder) viewHolder).bindData(itemAsPosition);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            View viewInflate = this.mLayoutInflater.inflate(ivi.c1, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new LevelViewHolder(this, viewInflate);
        }
        View viewInflate2 = this.mLayoutInflater.inflate(ivi.m2, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new ContentViewHolder(this, viewInflate2);
    }

    public final void setActivity(@Nullable FragmentActivity activity) {
        this.mActivity = activity;
    }

    public final void setMActivity(@Nullable FragmentActivity fragmentActivity) {
        this.mActivity = fragmentActivity;
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void setMDataList(@NotNull List<? extends SportBehaviorModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mDataList = list;
    }

    public final void setMLayoutInflater(@NotNull LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<set-?>");
        this.mLayoutInflater = layoutInflater;
    }

    public final void setMLevelItems(@Nullable List<LevelBarView.LevelItem> list) {
        this.mLevelItems = list;
    }
}
