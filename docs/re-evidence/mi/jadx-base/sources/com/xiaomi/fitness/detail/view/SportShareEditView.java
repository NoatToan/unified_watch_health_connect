package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.detail.data.BasicItemInfo;
import com.xiaomi.fitness.detail.model.SportRecordShareModel;
import defpackage.bsi;
import defpackage.dki;
import defpackage.ivi;
import defpackage.j1j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 M2\u00020\u0001:\u0002MNB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020%0$J\u0014\u0010*\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070$J\b\u0010-\u001a\u00020(H\u0014J\u000e\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020\u0007J\u0016\u00100\u001a\u00020(2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007J\u0016\u00103\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007J\u000e\u00106\u001a\u00020(2\u0006\u00107\u001a\u000205J\b\u00108\u001a\u00020(H\u0002JS\u00109\u001a\u00020(2K\u00107\u001aG\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(=\u0012\u0013\u0012\u00110%¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020(0,J\u0006\u0010?\u001a\u00020(J\u0010\u0010@\u001a\u00020(2\u0006\u00102\u001a\u00020\u0007H\u0002JD\u0010A\u001a\u00020(2\u0006\u0010B\u001a\u00020C2\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010\u001c2\u0010\b\u0002\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001c2\u0010\b\u0002\u0010G\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010\u001cJ\u0016\u0010H\u001a\u00020(2\u0006\u0010B\u001a\u00020C2\u0006\u0010I\u001a\u00020\u0007J0\u0010J\u001a\u00020(2\u0006\u0010B\u001a\u00020C2\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010\u001c2\u0006\u0010K\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070$X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010+\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020(\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportShareEditView;", "Landroid/widget/RelativeLayout;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "confirmTextView", "Landroid/widget/TextView;", "getConfirmTextView", "()Landroid/widget/TextView;", "setConfirmTextView", "(Landroid/widget/TextView;)V", "firstRecyclerView", "Landroid/view/View;", "secondRecyclerView", "thirdRecyclerView", "fourRecyclerView", "viewList", "", "editType", "holderBackground", "Lcom/xiaomi/fitness/detail/view/SportShareStyleHolder;", "holderData", "holderEdit", "holderSlogan", "mEditPanelDataTabIsSelected", "Landroidx/lifecycle/MutableLiveData;", "", "mSelectedBgPositionLiveData", "setEditPanelDataTabIsSelectedLiveData", "", "liveData", "setSelectedBgPosition", "viewCallback", "Lkotlin/Function3;", "onFinishInflate", "setChoiceTab", "position", "setEditType", "type", "index", "setDataEditType", "mOnItemClickListener", "Lcom/xiaomi/fitness/detail/view/SportShareEditView$OnTabLayoutClickListener;", "setTabLayoutCallBack", "callback", "initRecycleView", "setOnBackgroundItemClickCallback", "Lkotlin/ParameterName;", "name", "typeId", "choiceId", "isSelected", "setBackgroundViewList", "changeChoiceBgPosition", "setDataViewList", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "dataInfoList", "Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "chartDataList", "choiceDataInfoList", "setWatermarkList", "choiceIndex", "setSloganList", "choiceSloganIndex", "choiceSloganDataIndex", "Companion", "OnTabLayoutClickListener", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportShareEditView extends RelativeLayout {

    @NotNull
    public static final String TAG = "SportShareEditView";

    @Nullable
    private TextView confirmTextView;
    private int editType;

    @Nullable
    private View firstRecyclerView;

    @Nullable
    private View fourRecyclerView;
    private SportShareStyleHolder holderBackground;
    private SportShareStyleHolder holderData;
    private SportShareStyleHolder holderEdit;
    private SportShareStyleHolder holderSlogan;

    @NotNull
    private Context mContext;

    @NotNull
    private MutableLiveData<Boolean> mEditPanelDataTabIsSelected;

    @Nullable
    private OnTabLayoutClickListener mOnItemClickListener;

    @NotNull
    private MutableLiveData<Integer> mSelectedBgPositionLiveData;

    @Nullable
    private View secondRecyclerView;

    @Nullable
    private TabLayout tabLayout;

    @Nullable
    private View thirdRecyclerView;

    @Nullable
    private Function3<? super Integer, ? super Integer, ? super Boolean, Unit> viewCallback;

    @NotNull
    private final List<View> viewList;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportShareEditView$OnTabLayoutClickListener;", "", "onTabLayoutClick", "", "position", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnTabLayoutClickListener {
        void onTabLayoutClick(int position);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportShareEditView(@NotNull Context mContext) {
        this(mContext, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    private final void changeChoiceBgPosition(int index) {
        SportShareStyleHolder sportShareStyleHolder;
        SportShareStyleHolder sportShareStyleHolder2 = this.holderBackground;
        if (sportShareStyleHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderBackground");
            sportShareStyleHolder2 = null;
        }
        SportShareStyleHolder sportShareStyleHolder3 = this.holderBackground;
        if (sportShareStyleHolder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderBackground");
            sportShareStyleHolder3 = null;
        }
        List<SportRecordShareModel> listChangeChoiceBgPosition = sportShareStyleHolder3.changeChoiceBgPosition(Integer.valueOf(index));
        SportShareStyleHolder sportShareStyleHolder4 = this.holderBackground;
        if (sportShareStyleHolder4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderBackground");
            sportShareStyleHolder = null;
        } else {
            sportShareStyleHolder = sportShareStyleHolder4;
        }
        sportShareStyleHolder2.setHolderDataList(listChangeChoiceBgPosition, SportShareStyleHolder.buiLdlViewItemList$default(sportShareStyleHolder, null, null, null, null, null, null, 0, 127, null));
    }

    private final void initRecycleView() {
        Context context = this.mContext;
        View view = this.firstRecyclerView;
        Intrinsics.checkNotNull(view);
        SportShareStyleHolder sportShareStyleHolder = new SportShareStyleHolder(context, view, this.editType);
        this.holderBackground = sportShareStyleHolder;
        sportShareStyleHolder.initHolder();
        View view2 = this.firstRecyclerView;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        Context context2 = this.mContext;
        View view3 = this.secondRecyclerView;
        Intrinsics.checkNotNull(view3);
        SportShareStyleHolder sportShareStyleHolder2 = new SportShareStyleHolder(context2, view3, 3);
        this.holderData = sportShareStyleHolder2;
        sportShareStyleHolder2.initHolder();
        Context context3 = this.mContext;
        View view4 = this.thirdRecyclerView;
        Intrinsics.checkNotNull(view4);
        SportShareStyleHolder sportShareStyleHolder3 = new SportShareStyleHolder(context3, view4, 4);
        this.holderEdit = sportShareStyleHolder3;
        sportShareStyleHolder3.initHolder();
        Context context4 = this.mContext;
        View view5 = this.fourRecyclerView;
        Intrinsics.checkNotNull(view5);
        SportShareStyleHolder sportShareStyleHolder4 = new SportShareStyleHolder(context4, view5, 5);
        this.holderSlogan = sportShareStyleHolder4;
        sportShareStyleHolder4.initHolder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setDataViewList$default(SportShareEditView sportShareEditView, SportBasicReport sportBasicReport, List list, List list2, List list3, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        if ((i & 8) != 0) {
            list3 = null;
        }
        sportShareEditView.setDataViewList(sportBasicReport, list, list2, list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setSloganList$default(SportShareEditView sportShareEditView, SportBasicReport sportBasicReport, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            list = null;
        }
        sportShareEditView.setSloganList(sportBasicReport, list, i, i2);
    }

    @Nullable
    public final TextView getConfirmTextView() {
        return this.confirmTextView;
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.tabLayout = (TabLayout) findViewById(bsi.l7);
        this.confirmTextView = (TextView) findViewById(bsi.L);
        this.firstRecyclerView = findViewById(bsi.a2);
        this.secondRecyclerView = findViewById(bsi.f6);
        this.thirdRecyclerView = findViewById(bsi.u7);
        this.fourRecyclerView = findViewById(bsi.f2);
        ListExtKt.add(this.viewList, this.firstRecyclerView);
        ListExtKt.add(this.viewList, this.secondRecyclerView);
        ListExtKt.add(this.viewList, this.thirdRecyclerView);
        ListExtKt.add(this.viewList, this.fourRecyclerView);
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{this.mContext.getString(j1j.h7), this.mContext.getString(j1j.i7), this.mContext.getString(j1j.k7), this.mContext.getString(j1j.l7)});
        if (this.tabLayout != null) {
            for (int i = 0; i < 4; i++) {
                TabLayout tabLayout = this.tabLayout;
                if (tabLayout != null) {
                    Intrinsics.checkNotNull(tabLayout);
                    tabLayout.c(tabLayout.A());
                }
            }
        }
        for (int i2 = 0; i2 < 4; i2++) {
            TabLayout tabLayout2 = this.tabLayout;
            TabLayout.g gVarX = tabLayout2 != null ? tabLayout2.x(i2) : null;
            View viewInflate = LayoutInflater.from(this.mContext).inflate(ivi.E1, (ViewGroup) null);
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            if (gVarX != null) {
                gVarX.p(linearLayout);
            }
            ((TextView) linearLayout.findViewById(bsi.m7)).setText((CharSequence) listListOf.get(i2));
        }
        initRecycleView();
        TabLayout tabLayout3 = this.tabLayout;
        if (tabLayout3 != null) {
            tabLayout3.addOnTabSelectedListener(new TabLayout.d() { // from class: com.xiaomi.fitness.detail.view.SportShareEditView.onFinishInflate.1
                @Override // com.google.android.material.tabs.TabLayout.c
                public void onTabReselected(TabLayout.g tab) {
                    Intrinsics.checkNotNullParameter(tab, "tab");
                }

                @Override // com.google.android.material.tabs.TabLayout.c
                public void onTabSelected(TabLayout.g tab) {
                    Intrinsics.checkNotNullParameter(tab, "tab");
                    View viewE = tab.e();
                    TextView textView = viewE != null ? (TextView) viewE.findViewById(bsi.m7) : null;
                    if (textView != null) {
                        textView.setTextColor(SportShareEditView.this.getMContext().getColor(dki.f2));
                    }
                    View view = (View) SportShareEditView.this.viewList.get(tab.g());
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    OnTabLayoutClickListener onTabLayoutClickListener = SportShareEditView.this.mOnItemClickListener;
                    if (onTabLayoutClickListener != null) {
                        onTabLayoutClickListener.onTabLayoutClick(tab.g());
                    }
                    SportShareEditView.this.mEditPanelDataTabIsSelected.setValue(Boolean.valueOf(tab.g() == 1));
                }

                @Override // com.google.android.material.tabs.TabLayout.c
                public void onTabUnselected(TabLayout.g tab) {
                    Intrinsics.checkNotNullParameter(tab, "tab");
                    View viewE = tab.e();
                    TextView textView = viewE != null ? (TextView) viewE.findViewById(bsi.m7) : null;
                    if (textView != null) {
                        textView.setTextColor(SportShareEditView.this.getMContext().getColor(dki.g2));
                    }
                    View view = (View) SportShareEditView.this.viewList.get(tab.g());
                    if (view != null) {
                        view.setVisibility(8);
                    }
                }
            });
        }
    }

    public final void setBackgroundViewList() {
        SportShareStyleHolder sportShareStyleHolder;
        SportShareStyleHolder sportShareStyleHolder2;
        SportShareStyleHolder sportShareStyleHolder3 = this.holderBackground;
        if (sportShareStyleHolder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderBackground");
            sportShareStyleHolder3 = null;
        }
        SportShareStyleHolder sportShareStyleHolder4 = this.holderBackground;
        if (sportShareStyleHolder4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderBackground");
            sportShareStyleHolder = null;
        } else {
            sportShareStyleHolder = sportShareStyleHolder4;
        }
        List<SportRecordShareModel> listBuiLdlViewItemList$default = SportShareStyleHolder.buiLdlViewItemList$default(sportShareStyleHolder, null, null, null, this.mSelectedBgPositionLiveData, null, null, 0, 119, null);
        SportShareStyleHolder sportShareStyleHolder5 = this.holderBackground;
        if (sportShareStyleHolder5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderBackground");
            sportShareStyleHolder2 = null;
        } else {
            sportShareStyleHolder2 = sportShareStyleHolder5;
        }
        sportShareStyleHolder3.setHolderDataList(listBuiLdlViewItemList$default, SportShareStyleHolder.buiLdlViewItemList$default(sportShareStyleHolder2, null, null, null, null, null, null, 0, 127, null));
    }

    public final void setChoiceTab(int position) {
        TabLayout.g gVarX;
        View viewE;
        TabLayout tabLayout = this.tabLayout;
        TextView textView = null;
        if (tabLayout != null) {
            tabLayout.F(tabLayout != null ? tabLayout.x(position) : null);
        }
        if (position == 0) {
            TabLayout tabLayout2 = this.tabLayout;
            if (tabLayout2 != null && (gVarX = tabLayout2.x(position)) != null && (viewE = gVarX.e()) != null) {
                textView = (TextView) viewE.findViewById(bsi.m7);
            }
            if (textView != null) {
                textView.setTextColor(this.mContext.getColor(dki.f2));
            }
        }
    }

    public final void setConfirmTextView(@Nullable TextView textView) {
        this.confirmTextView = textView;
    }

    public final void setDataEditType(int editType, int index) {
        SportShareStyleHolder sportShareStyleHolder = this.holderData;
        if (sportShareStyleHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderData");
            sportShareStyleHolder = null;
        }
        sportShareStyleHolder.setHolderDataType(editType, index);
    }

    public final void setDataViewList(@NotNull SportBasicReport sportReport, @Nullable List<BasicItemInfo> dataInfoList, @Nullable List<Integer> chartDataList, @Nullable List<BasicItemInfo> choiceDataInfoList) {
        SportShareStyleHolder sportShareStyleHolder;
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        SportShareStyleHolder sportShareStyleHolder2 = this.holderData;
        SportShareStyleHolder sportShareStyleHolder3 = null;
        if (sportShareStyleHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderData");
            sportShareStyleHolder2 = null;
        }
        SportShareStyleHolder sportShareStyleHolder4 = this.holderData;
        if (sportShareStyleHolder4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderData");
            sportShareStyleHolder = null;
        } else {
            sportShareStyleHolder = sportShareStyleHolder4;
        }
        List<SportRecordShareModel> listBuiLdlViewItemList$default = SportShareStyleHolder.buiLdlViewItemList$default(sportShareStyleHolder, null, null, dataInfoList, null, null, choiceDataInfoList, 0, 91, null);
        SportShareStyleHolder sportShareStyleHolder5 = this.holderData;
        if (sportShareStyleHolder5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderData");
        } else {
            sportShareStyleHolder3 = sportShareStyleHolder5;
        }
        sportShareStyleHolder2.setHolderDataList(listBuiLdlViewItemList$default, SportShareStyleHolder.buiLdlViewItemList$default(sportShareStyleHolder3, sportReport, 6, null, null, chartDataList, null, 0, 108, null));
    }

    public final void setEditPanelDataTabIsSelectedLiveData(@NotNull MutableLiveData<Boolean> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        this.mEditPanelDataTabIsSelected = liveData;
    }

    public final void setEditType(int type, int index) {
        this.editType = type;
        if (this.holderBackground == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderBackground");
        }
        Context context = this.mContext;
        View view = this.firstRecyclerView;
        Intrinsics.checkNotNull(view);
        SportShareStyleHolder sportShareStyleHolder = new SportShareStyleHolder(context, view, this.editType);
        this.holderBackground = sportShareStyleHolder;
        sportShareStyleHolder.initHolder();
        if (this.viewCallback != null) {
            SportShareStyleHolder sportShareStyleHolder2 = this.holderBackground;
            if (sportShareStyleHolder2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("holderBackground");
                sportShareStyleHolder2 = null;
            }
            Function3<? super Integer, ? super Integer, ? super Boolean, Unit> function3 = this.viewCallback;
            Intrinsics.checkNotNull(function3);
            sportShareStyleHolder2.setOnItemClickListener(function3);
        }
        changeChoiceBgPosition(index);
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void setOnBackgroundItemClickCallback(@NotNull Function3<? super Integer, ? super Integer, ? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.viewCallback = callback;
        SportShareStyleHolder sportShareStyleHolder = this.holderBackground;
        SportShareStyleHolder sportShareStyleHolder2 = null;
        if (sportShareStyleHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderBackground");
            sportShareStyleHolder = null;
        }
        sportShareStyleHolder.setOnItemClickListener(callback);
        SportShareStyleHolder sportShareStyleHolder3 = this.holderData;
        if (sportShareStyleHolder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderData");
            sportShareStyleHolder3 = null;
        }
        sportShareStyleHolder3.setOnItemClickListener(callback);
        SportShareStyleHolder sportShareStyleHolder4 = this.holderData;
        if (sportShareStyleHolder4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderData");
            sportShareStyleHolder4 = null;
        }
        sportShareStyleHolder4.setOnItemStringClickListener(callback, 6);
        SportShareStyleHolder sportShareStyleHolder5 = this.holderEdit;
        if (sportShareStyleHolder5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderEdit");
            sportShareStyleHolder5 = null;
        }
        sportShareStyleHolder5.setOnItemClickListener(callback);
        SportShareStyleHolder sportShareStyleHolder6 = this.holderSlogan;
        if (sportShareStyleHolder6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderSlogan");
            sportShareStyleHolder6 = null;
        }
        sportShareStyleHolder6.setOnItemClickListener(callback);
        SportShareStyleHolder sportShareStyleHolder7 = this.holderSlogan;
        if (sportShareStyleHolder7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderSlogan");
        } else {
            sportShareStyleHolder2 = sportShareStyleHolder7;
        }
        sportShareStyleHolder2.setOnItemStringClickListener(callback, 7);
    }

    public final void setSelectedBgPosition(@NotNull MutableLiveData<Integer> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        this.mSelectedBgPositionLiveData = liveData;
    }

    public final void setSloganList(@NotNull SportBasicReport sportReport, @Nullable List<BasicItemInfo> dataInfoList, int choiceSloganIndex, int choiceSloganDataIndex) {
        SportShareStyleHolder sportShareStyleHolder;
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        SportShareStyleHolder sportShareStyleHolder2 = this.holderSlogan;
        SportShareStyleHolder sportShareStyleHolder3 = null;
        if (sportShareStyleHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderSlogan");
            sportShareStyleHolder2 = null;
        }
        SportShareStyleHolder sportShareStyleHolder4 = this.holderSlogan;
        if (sportShareStyleHolder4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderSlogan");
            sportShareStyleHolder = null;
        } else {
            sportShareStyleHolder = sportShareStyleHolder4;
        }
        List<SportRecordShareModel> listBuiLdlViewItemList$default = SportShareStyleHolder.buiLdlViewItemList$default(sportShareStyleHolder, null, null, null, null, null, null, choiceSloganIndex, 63, null);
        SportShareStyleHolder sportShareStyleHolder5 = this.holderSlogan;
        if (sportShareStyleHolder5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderSlogan");
        } else {
            sportShareStyleHolder3 = sportShareStyleHolder5;
        }
        sportShareStyleHolder2.setHolderDataList(listBuiLdlViewItemList$default, SportShareStyleHolder.buiLdlViewItemList$default(sportShareStyleHolder3, sportReport, 3, dataInfoList, null, null, null, choiceSloganDataIndex, 56, null));
    }

    public final void setTabLayoutCallBack(@NotNull OnTabLayoutClickListener callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mOnItemClickListener = callback;
    }

    public final void setWatermarkList(@NotNull SportBasicReport sportReport, int choiceIndex) {
        SportShareStyleHolder sportShareStyleHolder;
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        SportShareStyleHolder sportShareStyleHolder2 = this.holderEdit;
        if (sportShareStyleHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderEdit");
            sportShareStyleHolder2 = null;
        }
        SportShareStyleHolder sportShareStyleHolder3 = this.holderEdit;
        if (sportShareStyleHolder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderEdit");
            sportShareStyleHolder3 = null;
        }
        List<SportRecordShareModel> listBuiLdlViewItemList$default = SportShareStyleHolder.buiLdlViewItemList$default(sportShareStyleHolder3, sportReport, null, null, null, null, null, choiceIndex, 62, null);
        SportShareStyleHolder sportShareStyleHolder4 = this.holderEdit;
        if (sportShareStyleHolder4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderEdit");
            sportShareStyleHolder = null;
        } else {
            sportShareStyleHolder = sportShareStyleHolder4;
        }
        sportShareStyleHolder2.setHolderDataList(listBuiLdlViewItemList$default, SportShareStyleHolder.buiLdlViewItemList$default(sportShareStyleHolder, null, null, null, null, null, null, 0, 127, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportShareEditView(@NotNull Context mContext, @Nullable AttributeSet attributeSet) {
        this(mContext, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    public /* synthetic */ SportShareEditView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportShareEditView(@NotNull Context mContext, @Nullable AttributeSet attributeSet, int i) {
        super(mContext, attributeSet, i);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.viewList = new ArrayList();
        this.editType = 1;
        this.mEditPanelDataTabIsSelected = new MutableLiveData<>();
        this.mSelectedBgPositionLiveData = new MutableLiveData<>();
        LayoutInflater.from(this.mContext).inflate(ivi.F1, this);
    }
}
