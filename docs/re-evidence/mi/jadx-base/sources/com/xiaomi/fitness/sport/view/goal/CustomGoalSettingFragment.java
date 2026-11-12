package com.xiaomi.fitness.sport.view.goal;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport.utils.SportPreference;
import com.xiaomi.fitness.sport.utils.WebViewUtilKt;
import com.xiaomi.fitness.sport.view.goal.CustomGoalSettingFragment;
import com.xiaomi.fitness.sport.view.launch.LaunchSportModel;
import com.xiaomi.fitness.sport.view.launch.gym.setting.GuideWebViewActivity;
import com.xiaomi.fitness.sport.view.widget.CustomGoalView;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.e5a;
import defpackage.of4;
import defpackage.xri;
import defpackage.zxi;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0003+,-B\u0007¢\u0006\u0004\b*\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0014\u0010\u0007J!\u0010\u0019\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/sport/view/goal/CustomGoalSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/sport/view/goal/GoalVM;", "Le5a;", "Lcom/xiaomi/fitness/sport/view/goal/OnGoalItemClickListener;", "", "launchGym", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initView", "(Landroid/view/View;)V", "", "goalValue", "onGoalClick", "(F)V", "setListener", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "", "isDeviceLaunch", "preLaunchGym", "(Landroidx/fragment/app/FragmentActivity;Z)V", "", DailyRecordKey.sportType, "I", "sportGoal", "sportGoalValue", "F", "Lcom/xiaomi/fitness/sport/view/launch/LaunchSportModel;", "launchSportModel$delegate", "Lkotlin/Lazy;", "getLaunchSportModel", "()Lcom/xiaomi/fitness/sport/view/launch/LaunchSportModel;", "launchSportModel", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "GoalAdapter", "GoalViewHolder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CustomGoalSettingFragment extends BaseBindingFragment<GoalVM, e5a> implements OnGoalItemClickListener {

    @NotNull
    public static final String TAG = "CustomGoalSettingFragment";

    /* JADX INFO: renamed from: launchSportModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy launchSportModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: td5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CustomGoalSettingFragment.launchSportModel_delegate$lambda$0();
        }
    });
    private int sportGoal;
    private float sportGoalValue;
    private int sportType;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/sport/view/goal/CustomGoalSettingFragment$GoalAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/sport/view/goal/CustomGoalSettingFragment$GoalViewHolder;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/sport/view/goal/OnGoalItemClickListener;", "<init>", "(Landroid/content/Context;Lcom/xiaomi/fitness/sport/view/goal/OnGoalItemClickListener;)V", "getContext", "()Landroid/content/Context;", "getListener", "()Lcom/xiaomi/fitness/sport/view/goal/OnGoalItemClickListener;", "list", "Ljava/util/ArrayList;", "", "getList", "()Ljava/util/ArrayList;", "unit", "", "getUnit", "()Ljava/lang/String;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "onClick", "v", "Landroid/view/View;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoalAdapter extends RecyclerView.Adapter<GoalViewHolder> implements View.OnClickListener {

        @NotNull
        private final Context context;

        @NotNull
        private final ArrayList<Float> list;

        @NotNull
        private final OnGoalItemClickListener listener;

        @NotNull
        private final String unit;

        public GoalAdapter(@NotNull Context context, @NotNull OnGoalItemClickListener listener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.context = context;
            this.listener = listener;
            this.list = CollectionsKt__CollectionsKt.arrayListOf(Float.valueOf(0.8f), Float.valueOf(2.33f), Float.valueOf(6.66f), Float.valueOf(11.11f), Float.valueOf(21.1f), Float.valueOf(42.2f));
            CharSequence quantityText = context.getResources().getQuantityText(zxi.common_unit_kilometer, 0);
            Intrinsics.checkNotNull(quantityText, "null cannot be cast to non-null type kotlin.String");
            this.unit = (String) quantityText;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            return this.list.size();
        }

        @NotNull
        public final ArrayList<Float> getList() {
            return this.list;
        }

        @NotNull
        public final OnGoalItemClickListener getListener() {
            return this.listener;
        }

        @NotNull
        public final String getUnit() {
            return this.unit;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@Nullable View v) {
            float fFloatValue;
            OnGoalItemClickListener onGoalItemClickListener = this.listener;
            if (v == null) {
                fFloatValue = 0.0f;
            } else {
                Object tag = v.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Float");
                fFloatValue = ((Float) tag).floatValue();
            }
            onGoalItemClickListener.onGoalClick(fFloatValue);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull GoalViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Float f = this.list.get(position);
            Intrinsics.checkNotNullExpressionValue(f, "get(...)");
            float fFloatValue = f.floatValue();
            holder.getItemGoalCustom().setText(fFloatValue + " " + this.unit);
            holder.itemView.setTag(Float.valueOf(fFloatValue));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public GoalViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(dvi.t, parent, false);
            viewInflate.setOnClickListener(this);
            Intrinsics.checkNotNull(viewInflate);
            return new GoalViewHolder(viewInflate);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR*\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport/view/goal/CustomGoalSettingFragment$GoalViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "itemGoalCustom", "Landroid/widget/TextView;", "getItemGoalCustom", "()Landroid/widget/TextView;", "setItemGoalCustom", "(Landroid/widget/TextView;)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class GoalViewHolder extends RecyclerView.d0 {
        private TextView itemGoalCustom;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoalViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.itemGoalCustom = (TextView) itemView.findViewById(xri.J2);
        }

        public final TextView getItemGoalCustom() {
            return this.itemGoalCustom;
        }

        public final void setItemGoalCustom(TextView textView) {
            this.itemGoalCustom = textView;
        }
    }

    private final void launchGym() {
        CustomGoalView customGoalView;
        EditText goalEditText;
        CustomGoalView customGoalView2;
        EditText goalEditText2;
        CustomGoalView customGoalView3;
        EditText goalEditText3;
        CustomGoalView customGoalView4;
        EditText goalEditText4;
        e5a mBinding = getMBinding();
        Editable text = null;
        if (!StringsKt__StringsKt.isBlank(String.valueOf((mBinding == null || (customGoalView4 = mBinding.A) == null || (goalEditText4 = customGoalView4.getGoalEditText()) == null) ? null : goalEditText4.getText()))) {
            e5a mBinding2 = getMBinding();
            if (Float.parseFloat(String.valueOf((mBinding2 == null || (customGoalView3 = mBinding2.A) == null || (goalEditText3 = customGoalView3.getGoalEditText()) == null) ? null : goalEditText3.getText())) != 0.0f) {
                e5a mBinding3 = getMBinding();
                if (Float.parseFloat(String.valueOf((mBinding3 == null || (customGoalView2 = mBinding3.A) == null || (goalEditText2 = customGoalView2.getGoalEditText()) == null) ? null : goalEditText2.getText())) >= 0.1d) {
                    e5a mBinding4 = getMBinding();
                    if (mBinding4 != null && (customGoalView = mBinding4.A) != null && (goalEditText = customGoalView.getGoalEditText()) != null) {
                        text = goalEditText.getText();
                    }
                    if (Float.parseFloat(String.valueOf(text)) <= 999.0f) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("KEY_SPORT_TYPE", 3);
                        bundle.putBoolean("LOCAL_DEVICE_LAUNCH", false);
                        preLaunchGym(getActivity(), false);
                        return;
                    }
                }
            }
        }
        ToastUtil.showShortToast(getResources().getString(c1j.l));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LaunchSportModel launchSportModel_delegate$lambda$0() {
        return new LaunchSportModel();
    }

    public static /* synthetic */ void preLaunchGym$default(CustomGoalSettingFragment customGoalSettingFragment, FragmentActivity fragmentActivity, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        customGoalSettingFragment.preLaunchGym(fragmentActivity, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit preLaunchGym$lambda$3(CustomGoalSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(CustomGoalSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.launchGym();
    }

    @NotNull
    public final LaunchSportModel getLaunchSportModel() {
        return (LaunchSportModel) this.launchSportModel.getValue();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dvi.q;
    }

    public final void initView(@Nullable View view) {
        e5a mBinding;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        setTitle(c1j.a1);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.sportType = arguments.getInt("KEY_SPORT_TYPE", 1);
            this.sportGoal = arguments.getInt("GOAL_TYPE", 0);
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        int iDip2px = uIUtils.dip2px(ApplicationExtKt.getApplication(), 8.0f);
        int iDip2px2 = uIUtils.dip2px(ApplicationExtKt.getApplication(), 10.0f);
        int i = this.sportGoal;
        if (i != 0) {
            if (i != 2 || (mBinding = getMBinding()) == null || (recyclerView = mBinding.B) == null) {
                return;
            }
            recyclerView.setVisibility(8);
            return;
        }
        e5a mBinding2 = getMBinding();
        if (mBinding2 != null && (recyclerView4 = mBinding2.B) != null) {
            recyclerView4.setLayoutManager(new GridLayoutManager(getContext(), 3));
        }
        e5a mBinding3 = getMBinding();
        if (mBinding3 != null && (recyclerView3 = mBinding3.B) != null) {
            recyclerView3.addItemDecoration(new SpaceItemDecoration(3, iDip2px, iDip2px2));
        }
        e5a mBinding4 = getMBinding();
        if (mBinding4 == null || (recyclerView2 = mBinding4.B) == null) {
            return;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        recyclerView2.setAdapter(new GoalAdapter(contextRequireContext, this));
    }

    @Override // com.xiaomi.fitness.sport.view.goal.OnGoalItemClickListener
    public void onGoalClick(float goalValue) {
        CustomGoalView customGoalView;
        EditText goalEditText;
        this.sportGoalValue = goalValue;
        e5a mBinding = getMBinding();
        if (mBinding == null || (customGoalView = mBinding.A) == null || (goalEditText = customGoalView.getGoalEditText()) == null) {
            return;
        }
        goalEditText.setText(String.valueOf(goalValue));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    public final void preLaunchGym(@Nullable FragmentActivity activity, boolean isDeviceLaunch) {
        String model;
        CustomGoalView customGoalView;
        EditText goalEditText;
        FitnessLogUtils.i("GymDeviceModel", "preLaunchGym");
        SportPreference sportPreference = SportPreference.INSTANCE;
        if (!sportPreference.getUSE_TREADMILL_BEFORE()) {
            String currentLocale = LocaleUtil.getCurrentLocale();
            WearableDeviceModel localDeviceModel = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getLocalDeviceModel("ksmb.treadmill.m1v1");
            if (localDeviceModel == null || (model = DeviceModelExtKt.getModel(localDeviceModel)) == null) {
                model = "";
            }
            String strE = of4.e(currentLocale, model, "");
            Intrinsics.checkNotNullExpressionValue(strE, "getUserGuideUrl(...)");
            WebViewUtilKt.startWebView$default(strE, null, false, false, 10, null);
            sportPreference.setUSE_TREADMILL_BEFORE(true);
            return;
        }
        if (GuideWebViewActivity.INSTANCE.isWelcome() || activity == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_SPORT_TYPE", this.sportType);
        e5a mBinding = getMBinding();
        float f = Float.parseFloat(String.valueOf((mBinding == null || (customGoalView = mBinding.A) == null || (goalEditText = customGoalView.getGoalEditText()) == null) ? null : goalEditText.getText()));
        this.sportGoalValue = f;
        bundle.putFloat("GOAL_VALUE", f);
        bundle.putInt("GOAL_TYPE", this.sportGoal);
        bundle.putInt("DEVICE_TYPE", 1);
        FitnessLogUtils.d(TAG, "sportType : " + this.sportType + " , sportGoal : " + this.sportGoal + " , sportGoalValue : " + this.sportGoalValue);
        LaunchSportModel.launchSport$default(getLaunchSportModel(), activity, bundle, null, new Function0() { // from class: sd5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CustomGoalSettingFragment.preLaunchGym$lambda$3(this.f33524a);
            }
        }, 4, null);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        TextView textView;
        e5a mBinding = getMBinding();
        if (mBinding == null || (textView = mBinding.C) == null) {
            return;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: ud5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomGoalSettingFragment.setListener$lambda$2(this.f35650a, view);
            }
        });
    }
}
