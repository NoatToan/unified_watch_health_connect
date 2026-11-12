package com.xiaomi.hm.health.bodyfat.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.lib.view.ViewUtils;
import com.huami.nfc.base.PayResponse;
import com.huami.util.net.NetUtil;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.WeightMemberDetailActivity;
import com.xiaomi.hm.health.bodyfat.adapter.BaseRecyclerAdapter;
import com.xiaomi.hm.health.bodyfat.adapter.MyViewHolder;
import com.xiaomi.hm.health.bodyfat.databinding.FragmentChooseUserBinding;
import com.xiaomi.hm.health.bodyfat.fragment.ChooseUserFragment;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis;
import com.xiaomi.hm.health.databases.model.UserInfos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 %2\u00020\u0001:\u0006&'%()*B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001f\u0010\"\u001a\u0004\u0018\u00010\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0013\u0010!¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment;", "Landroidx/fragment/app/DialogFragment;", "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentChooseUserBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentChooseUserBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$ChooseUserListener;", "b", "Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$ChooseUserListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$DismissListener;", "c", "Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$DismissListener;", "dismissListener", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "mAddUserId", "Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$WeightData;", "e", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$WeightData;", "weightAdvData", "<init>", "()V", "Companion", "ChooseUserAdapter", "ChooseUserListener", "DismissListener", "SortedByWeight", "WeightData", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class ChooseUserFragment extends DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FragmentChooseUserBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ChooseUserListener listener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private DismissListener dismissListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String mAddUserId = PayResponse.CODE_SE_RESPONSE_ERROR;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy weightAdvData = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J \u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0014R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$ChooseUserAdapter;", "Lcom/xiaomi/hm/health/bodyfat/adapter/BaseRecyclerAdapter;", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "Lcom/xiaomi/hm/health/bodyfat/adapter/MyViewHolder;", "holder", "item", "", "position", "", "onBindViewHolder", "Landroid/view/View;", "itemView", "onItemClicked", "", "c", "Ljava/util/List;", "colorList", GoogleApiAvailabilityLight.a, LogUtil.I, "itemWidth", "resId", "<init>", "(Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment;ILjava/util/List;)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public final class ChooseUserAdapter extends BaseRecyclerAdapter<UserInfos> {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final List<Integer> colorList;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int itemWidth;

        public ChooseUserAdapter(@NotNull int i, List<Integer> list) {
            super(i);
            this.colorList = list;
            this.itemWidth = (int) ViewUtils.dp2px(ChooseUserFragment.this.requireActivity(), 55.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(final ChooseUserFragment chooseUserFragment, UserInfos userInfos, AppCompatActivity appCompatActivity, boolean z) {
            if (!z) {
                BFCallback.getAppUtils().showDeleteAllMemberDataRequestDialog(appCompatActivity, new WeightGrantRequestDialogLis() { // from class: ro0
                    @Override // com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis
                    public final void requestResult(boolean z2) {
                        ChooseUserFragment.ChooseUserAdapter.d(chooseUserFragment, z2);
                    }
                });
                return;
            }
            ChooseUserListener chooseUserListener = chooseUserFragment.listener;
            if (chooseUserListener == null) {
                return;
            }
            chooseUserListener.chooseUser(userInfos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(ChooseUserFragment chooseUserFragment, boolean z) {
            FragmentActivity activity;
            if (!z || (activity = chooseUserFragment.getActivity()) == null) {
                return;
            }
            activity.finish();
        }

        @Override // com.xiaomi.hm.health.bodyfat.adapter.BaseRecyclerAdapter
        public void onBindViewHolder(@NotNull MyViewHolder holder, @NotNull UserInfos item, int position) {
            ImageView imageView = (ImageView) holder.getView(R.id.user_icon);
            TextView textView = (TextView) holder.getView(R.id.user_list_item_name);
            if (!Intrinsics.areEqual(item.getUserId(), ChooseUserFragment.this.mAddUserId)) {
                String name = item.getName();
                textView.setText(TextUtils.ellipsize(name, textView.getPaint(), this.itemWidth, TextUtils.TruncateAt.END));
                imageView.setTag(item.getUserId());
                BFCallback.getInstance().updateAvatarUI(imageView, item.getAvatarPath(), item.getAvatarUrl(), name, this.colorList.get(position));
                return;
            }
            textView.setText(item.getName());
            int i = this.itemWidth;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
            layoutParams.addRule(1);
            layoutParams.topMargin = (int) (42 * ViewUtils.getDensityValue(ChooseUserFragment.this.requireActivity()));
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.btn_add_new_user);
        }

        @Override // com.xiaomi.hm.health.bodyfat.adapter.BaseRecyclerAdapter
        public void onItemClicked(@NotNull View itemView, int position, @NotNull final UserInfos item) {
            super.onItemClicked(itemView, position, item);
            if (!Intrinsics.areEqual(item.getUserId(), ChooseUserFragment.this.mAddUserId)) {
                WeightData weightDataB = ChooseUserFragment.this.b();
                if (weightDataB != null) {
                    final ChooseUserFragment chooseUserFragment = ChooseUserFragment.this;
                    if (BFCallback.getHMLoginManager().isAdult(BodyParamsUtils.getWeightAge(weightDataB.getCreateTime(), item.getBirthday())) || Long.parseLong(item.getUserId()) == BFCallback.getHMLoginManager().getValidUid()) {
                        ChooseUserListener chooseUserListener = chooseUserFragment.listener;
                        if (chooseUserListener != null) {
                            chooseUserListener.chooseUser(item);
                        }
                    } else if (!BFCallback.getHMLoginManager().isInNonContinental()) {
                        ChooseUserListener chooseUserListener2 = chooseUserFragment.listener;
                        if (chooseUserListener2 != null) {
                            chooseUserListener2.chooseUser(item);
                        }
                    } else if (BFCallback.getHMLoginManager().isAdult()) {
                        final AppCompatActivity appCompatActivity = (AppCompatActivity) chooseUserFragment.getActivity();
                        BFCallback.getAppUtils().showGrantWeightDataRequestDialog(appCompatActivity, item.getUserId(), new WeightGrantRequestDialogLis() { // from class: so0
                            @Override // com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis
                            public final void requestResult(boolean z) {
                                ChooseUserFragment.ChooseUserAdapter.c(chooseUserFragment, item, appCompatActivity, z);
                            }
                        });
                    } else {
                        ChooseUserListener chooseUserListener3 = chooseUserFragment.listener;
                        if (chooseUserListener3 != null) {
                            chooseUserListener3.chooseUser(item);
                        }
                    }
                }
            } else if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
                CustomToast.makeText(ChooseUserFragment.this.getActivity(), ChooseUserFragment.this.getString(R.string.please_connect_internet), 0).show();
            } else if (BFCallback.getInstance().enableMiDongFlavor() && getA() >= 12) {
                CustomToast.makeText(ChooseUserFragment.this.getActivity(), ChooseUserFragment.this.getString(R.string.over_the_max_famliy_count), 0).show();
            } else if (BFCallback.getInstance().enableMiDongFlavor() || getA() < 17) {
                WeightData weightDataB2 = ChooseUserFragment.this.b();
                if (weightDataB2 != null) {
                    ChooseUserFragment chooseUserFragment2 = ChooseUserFragment.this;
                    Intent intent = new Intent(chooseUserFragment2.getActivity(), (Class<?>) WeightMemberDetailActivity.class);
                    intent.putExtra(BFConstant.KET_ADD_NEW, true);
                    intent.putExtra(BFConstant.KET_ADD_NEW_DATA, weightDataB2);
                    if (weightDataB2.getBalanceScore() != 0) {
                        intent.putExtra(BFConstant.KET_ADD_NEW_FROM_BALANCE, true);
                    }
                    chooseUserFragment2.startActivity(intent);
                    chooseUserFragment2.dismiss();
                    FragmentActivity activity = chooseUserFragment2.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
            } else {
                CustomToast.makeText(ChooseUserFragment.this.getActivity(), ChooseUserFragment.this.getString(R.string.over_the_max_user_count), 0).show();
            }
            ChooseUserFragment.this.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$ChooseUserListener;", "", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "userInfos", "", "chooseUser", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public interface ChooseUserListener {
        void chooseUser(@NotNull UserInfos userInfos);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$DismissListener;", "", "", "dismissFragment", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public interface DismissListener {
        void dismissFragment();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$SortedByWeight;", "Ljava/util/Comparator;", "", "o1", "o2", "", "compare", "", "a", "F", "getWeight", "()F", "setWeight", "(F)V", "weight", "<init>", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class SortedByWeight implements Comparator<Object> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private float weight;

        public SortedByWeight(float f) {
            this.weight = f;
        }

        @Override // java.util.Comparator
        public int compare(@Nullable Object o1, @Nullable Object o2) {
            Objects.requireNonNull(o1, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.UserInfos");
            Objects.requireNonNull(o2, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.UserInfos");
            return Float.compare(Math.abs(((UserInfos) o1).getWeight().floatValue() - this.weight), Math.abs(((UserInfos) o2).getWeight().floatValue() - this.weight));
        }

        public final float getWeight() {
            return this.weight;
        }

        public final void setWeight(float f) {
            this.weight = f;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$WeightData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<WeightData> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WeightData getA() {
            Bundle arguments = ChooseUserFragment.this.getArguments();
            if (arguments == null) {
                return null;
            }
            return (WeightData) arguments.getParcelable(BFConstant.KET_ADD_NEW_DATA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WeightData b() {
        return (WeightData) this.weightAdvData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ChooseUserFragment chooseUserFragment, View view) {
        chooseUserFragment.dismiss();
        DismissListener dismissListener = chooseUserFragment.dismissListener;
        if (dismissListener == null || dismissListener == null) {
            return;
        }
        dismissListener.dismissFragment();
    }

    private final void initView() {
        FragmentChooseUserBinding fragmentChooseUserBinding = this.binding;
        Objects.requireNonNull(fragmentChooseUserBinding);
        fragmentChooseUserBinding.textCancel.setOnClickListener(new View.OnClickListener() { // from class: qo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseUserFragment.c(this.a, view);
            }
        });
        FragmentChooseUserBinding fragmentChooseUserBinding2 = this.binding;
        Objects.requireNonNull(fragmentChooseUserBinding2);
        fragmentChooseUserBinding2.usersList.setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
        List<UserInfos> allInfos = UserInfoManager.getManager().getAllInfos();
        WeightData weightDataB = b();
        if (weightDataB != null) {
            if (weightDataB.isAdult()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : allInfos) {
                    if (BodyParamsUtils.getWeightAge(System.currentTimeMillis(), ((UserInfos) obj).getBirthday()) > 6) {
                        arrayList.add(obj);
                    }
                }
                allInfos.clear();
                allInfos.addAll(arrayList);
            }
            Collections.sort(allInfos, new SortedByWeight(weightDataB.getWeight()));
        }
        ChooseUserAdapter chooseUserAdapter = new ChooseUserAdapter(R.layout.userlist_item, HMWeightUtils.getFamilyBgColor(allInfos));
        FragmentChooseUserBinding fragmentChooseUserBinding3 = this.binding;
        Objects.requireNonNull(fragmentChooseUserBinding3);
        fragmentChooseUserBinding3.usersList.setAdapter(chooseUserAdapter);
        UserInfos userInfos = new UserInfos();
        userInfos.setName(getString(R.string.new_user));
        userInfos.setUserId(this.mAddUserId);
        allInfos.add(userInfos);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getActivity(), 0);
        dividerItemDecoration.setDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.horizonal_empty_space));
        FragmentChooseUserBinding fragmentChooseUserBinding4 = this.binding;
        Objects.requireNonNull(fragmentChooseUserBinding4);
        fragmentChooseUserBinding4.usersList.addItemDecoration(dividerItemDecoration);
        chooseUserAdapter.update(allInfos);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentChooseUserBinding fragmentChooseUserBindingInflate = FragmentChooseUserBinding.inflate(inflater);
        this.binding = fragmentChooseUserBindingInflate;
        Objects.requireNonNull(fragmentChooseUserBindingInflate);
        return fragmentChooseUserBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$Companion;", "", "Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$WeightData;", "data", "Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$ChooseUserListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment;", "newInstance", "Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$DismissListener;", "dismissListener", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ChooseUserFragment newInstance(@NotNull WeightData data, @NotNull ChooseUserListener listener) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(BFConstant.KET_ADD_NEW_DATA, data);
            ChooseUserFragment chooseUserFragment = new ChooseUserFragment();
            chooseUserFragment.setArguments(bundle);
            chooseUserFragment.listener = listener;
            return chooseUserFragment;
        }

        @NotNull
        public final ChooseUserFragment newInstance(@NotNull WeightData data, @NotNull ChooseUserListener listener, @NotNull DismissListener dismissListener) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(BFConstant.KET_ADD_NEW_DATA, data);
            ChooseUserFragment chooseUserFragment = new ChooseUserFragment();
            chooseUserFragment.setArguments(bundle);
            chooseUserFragment.listener = listener;
            chooseUserFragment.dismissListener = dismissListener;
            return chooseUserFragment;
        }
    }

    @Parcelize
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b2\u00103J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003JE\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\nHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"R\u0019\u0010\u0010\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u0019\u0010\u0011\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u0011\u00101¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$WeightData;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "", "component3", "component4", "component5", "", "component6", "weight", ParamKey.createTime, ParamKey.impedance, "oneFootValue", "balanceScore", "isAdult", "copy", "", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "F", "getWeight", "()F", "b", "J", "getCreateTime", "()J", "c", LogUtil.I, "getImpedance", "()I", GoogleApiAvailabilityLight.a, "getOneFootValue", "e", "getBalanceScore", "f", "Z", "()Z", "<init>", "(FJIFIZ)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class WeightData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<WeightData> CREATOR = new Creator();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final float weight;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final long createTime;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final int impedance;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        private final float oneFootValue;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        private final int balanceScore;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        private final boolean isAdult;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class Creator implements Parcelable.Creator<WeightData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final WeightData createFromParcel(@NotNull Parcel parcel) {
                return new WeightData(parcel.readFloat(), parcel.readLong(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final WeightData[] newArray(int i) {
                return new WeightData[i];
            }
        }

        public WeightData(float f, long j, int i, float f2, int i2, boolean z) {
            this.weight = f;
            this.createTime = j;
            this.impedance = i;
            this.oneFootValue = f2;
            this.balanceScore = i2;
            this.isAdult = z;
        }

        public static /* synthetic */ WeightData copy$default(WeightData weightData, float f, long j, int i, float f2, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                f = weightData.weight;
            }
            if ((i3 & 2) != 0) {
                j = weightData.createTime;
            }
            long j2 = j;
            if ((i3 & 4) != 0) {
                i = weightData.impedance;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                f2 = weightData.oneFootValue;
            }
            float f3 = f2;
            if ((i3 & 16) != 0) {
                i2 = weightData.balanceScore;
            }
            int i5 = i2;
            if ((i3 & 32) != 0) {
                z = weightData.isAdult;
            }
            return weightData.copy(f, j2, i4, f3, i5, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getWeight() {
            return this.weight;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getCreateTime() {
            return this.createTime;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getImpedance() {
            return this.impedance;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getOneFootValue() {
            return this.oneFootValue;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getBalanceScore() {
            return this.balanceScore;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsAdult() {
            return this.isAdult;
        }

        @NotNull
        public final WeightData copy(float weight, long createTime, int impedance, float oneFootValue, int balanceScore, boolean isAdult) {
            return new WeightData(weight, createTime, impedance, oneFootValue, balanceScore, isAdult);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeightData)) {
                return false;
            }
            WeightData weightData = (WeightData) other;
            return Intrinsics.areEqual((Object) Float.valueOf(this.weight), (Object) Float.valueOf(weightData.weight)) && this.createTime == weightData.createTime && this.impedance == weightData.impedance && Intrinsics.areEqual((Object) Float.valueOf(this.oneFootValue), (Object) Float.valueOf(weightData.oneFootValue)) && this.balanceScore == weightData.balanceScore && this.isAdult == weightData.isAdult;
        }

        public final int getBalanceScore() {
            return this.balanceScore;
        }

        public final long getCreateTime() {
            return this.createTime;
        }

        public final int getImpedance() {
            return this.impedance;
        }

        public final float getOneFootValue() {
            return this.oneFootValue;
        }

        public final float getWeight() {
            return this.weight;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        public int hashCode() {
            int iFloatToIntBits = ((((((((Float.floatToIntBits(this.weight) * 31) + defpackage.b.a(this.createTime)) * 31) + this.impedance) * 31) + Float.floatToIntBits(this.oneFootValue)) * 31) + this.balanceScore) * 31;
            boolean z = this.isAdult;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return iFloatToIntBits + r1;
        }

        public final boolean isAdult() {
            return this.isAdult;
        }

        @NotNull
        public String toString() {
            return "WeightData(weight=" + this.weight + ", createTime=" + this.createTime + ", impedance=" + this.impedance + ", oneFootValue=" + this.oneFootValue + ", balanceScore=" + this.balanceScore + ", isAdult=" + this.isAdult + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            parcel.writeFloat(this.weight);
            parcel.writeLong(this.createTime);
            parcel.writeInt(this.impedance);
            parcel.writeFloat(this.oneFootValue);
            parcel.writeInt(this.balanceScore);
            parcel.writeInt(this.isAdult ? 1 : 0);
        }

        public /* synthetic */ WeightData(float f, long j, int i, float f2, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, j, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0.0f : f2, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? false : z);
        }
    }
}
