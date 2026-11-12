package com.xiaomi.hm.health.bodyfat.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.FamilyListActivity;
import com.xiaomi.hm.health.bodyfat.databinding.ActivityFamilyListBinding;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\n\u001a\u00020\u0004H\u0014R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/FamilyListActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "uid", "", "r", SOAP.XMLNS, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityFamilyListBinding;", "x", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityFamilyListBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/activity/FamilyListActivity$FamilyMemberViewModel;", "y", "Lcom/xiaomi/hm/health/bodyfat/activity/FamilyListActivity$FamilyMemberViewModel;", "familyMemberViewModel", "<init>", "()V", "FamilyMemberAdapter", "FamilyMemberViewModel", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class FamilyListActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private ActivityFamilyListBinding binding;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private FamilyMemberViewModel familyMemberViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\"\u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/FamilyListActivity$FamilyMemberAdapter;", "Landroid/widget/BaseAdapter;", "", "getCount", "position", "", "getItem", "", "getItemId", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/ViewGroup;", "parent", "getView", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "b", "Ljava/util/List;", "userList", "<init>", "(Lcom/xiaomi/hm/health/bodyfat/activity/FamilyListActivity;Landroid/content/Context;Ljava/util/List;)V", "ViewHolder", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public final class FamilyMemberAdapter extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final List<UserInfos> userList;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/FamilyListActivity$FamilyMemberAdapter$ViewHolder;", "", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "getAvatar", "()Landroid/widget/ImageView;", "setAvatar", "(Landroid/widget/ImageView;)V", WebAPI.PARAM_SHARE_INVITE_AVATAR, "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getMemberName", "()Landroid/widget/TextView;", "setMemberName", "(Landroid/widget/TextView;)V", "memberName", "c", "getContentTextView", "setContentTextView", "contentTextView", "<init>", "(Lcom/xiaomi/hm/health/bodyfat/activity/FamilyListActivity$FamilyMemberAdapter;)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
        public final class ViewHolder {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @Nullable
            private ImageView avatar;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @Nullable
            private TextView memberName;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @Nullable
            private TextView contentTextView;

            public ViewHolder() {
            }

            @Nullable
            public final ImageView getAvatar() {
                return this.avatar;
            }

            @Nullable
            public final TextView getContentTextView() {
                return this.contentTextView;
            }

            @Nullable
            public final TextView getMemberName() {
                return this.memberName;
            }

            public final void setAvatar(@Nullable ImageView imageView) {
                this.avatar = imageView;
            }

            public final void setContentTextView(@Nullable TextView textView) {
                this.contentTextView = textView;
            }

            public final void setMemberName(@Nullable TextView textView) {
                this.memberName = textView;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FamilyMemberAdapter(@NotNull Context context, List<? extends UserInfos> list) {
            this.context = context;
            this.userList = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.userList.size();
        }

        @Override // android.widget.Adapter
        @NotNull
        public Object getItem(int position) {
            return this.userList.get(position);
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.Adapter
        @NotNull
        public View getView(int position, @Nullable View view, @NotNull ViewGroup parent) {
            ViewHolder viewHolder;
            TextView memberName;
            if (view == null) {
                view = View.inflate(this.context, R.layout.family_member_item, null);
                viewHolder = new ViewHolder();
                viewHolder.setAvatar((ImageView) view.findViewById(R.id.member_icon));
                viewHolder.setMemberName((TextView) view.findViewById(R.id.member_name));
                viewHolder.setContentTextView((TextView) view.findViewById(R.id.member_content));
                view.setTag(viewHolder);
            } else {
                Object tag = view.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type com.xiaomi.hm.health.bodyfat.activity.FamilyListActivity.FamilyMemberAdapter.ViewHolder");
                viewHolder = (ViewHolder) tag;
            }
            UserInfos userInfos = this.userList.get(position);
            ImageView avatar = viewHolder.getAvatar();
            if (avatar != null) {
                avatar.setTag(userInfos.getAvatarPath());
            }
            BFCallback.getInstance().updateAvatarUI(viewHolder.getAvatar(), userInfos.getAvatarPath(), userInfos.getAvatarUrl(), userInfos.getName());
            if ((userInfos.getName().length() > 0) && (memberName = viewHolder.getMemberName()) != null) {
                memberName.setText(userInfos.getName());
            }
            return view;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/FamilyListActivity$FamilyMemberViewModel;", "Landroidx/lifecycle/ViewModel;", "", "loadFamilyList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "a", "Landroidx/lifecycle/MutableLiveData;", "getFamilyList", "()Landroidx/lifecycle/MutableLiveData;", "familyList", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class FamilyMemberViewModel extends ViewModel {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final MutableLiveData<List<UserInfos>> familyList = new MutableLiveData<>();

        public FamilyMemberViewModel() {
            loadFamilyList();
        }

        @NotNull
        public final MutableLiveData<List<UserInfos>> getFamilyList() {
            return this.familyList;
        }

        public final void loadFamilyList() {
            if (BFCallback.getInstance().enableMiDongFlavor()) {
                this.familyList.setValue(CollectionsKt___CollectionsKt.sortedWith(UserInfoManager.getManager().getAllInfos(), new Comparator() { // from class: com.xiaomi.hm.health.bodyfat.activity.FamilyListActivity$FamilyMemberViewModel$loadFamilyList$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(Long.parseLong(((UserInfos) t).getUserId())), Long.valueOf(Long.parseLong(((UserInfos) t2).getUserId())));
                    }
                }));
            } else {
                this.familyList.setValue(CollectionsKt___CollectionsKt.sortedWith(UserInfoManager.getManager().getAllInfosNotWithSelf(), new Comparator() { // from class: com.xiaomi.hm.health.bodyfat.activity.FamilyListActivity$FamilyMemberViewModel$loadFamilyList$$inlined$sortedBy$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(Long.parseLong(((UserInfos) t).getUserId())), Long.valueOf(Long.parseLong(((UserInfos) t2).getUserId())));
                    }
                }));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(FamilyListActivity familyListActivity, View view) {
        familyListActivity.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(final FamilyListActivity familyListActivity, final List list) {
        if (list == null) {
            return;
        }
        ActivityFamilyListBinding activityFamilyListBinding = familyListActivity.binding;
        Objects.requireNonNull(activityFamilyListBinding);
        activityFamilyListBinding.familyMembersDymanticList.setAdapter((ListAdapter) familyListActivity.new FamilyMemberAdapter(familyListActivity, list));
        ActivityFamilyListBinding activityFamilyListBinding2 = familyListActivity.binding;
        Objects.requireNonNull(activityFamilyListBinding2);
        activityFamilyListBinding2.familyMembersDymanticList.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: qz1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                FamilyListActivity.q(list, familyListActivity, adapterView, view, i, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(List list, FamilyListActivity familyListActivity, AdapterView adapterView, View view, int i, long j) {
        long j2 = Long.parseLong(((UserInfos) list.get(i)).getUserId());
        if (HMWeightUtils.isSelf(String.valueOf(j2))) {
            familyListActivity.startActivity(BFCallback.getInstance().startPersonInfo(familyListActivity));
        } else {
            familyListActivity.r(j2);
        }
    }

    private final void r(long uid) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.WEIGHT_FAMILY_OUT).setValue(StatEvent.WEIGHT_FAMILY_OUT_PARAMS_ITEM_DETAIL));
        Intent intent = new Intent(this, (Class<?>) WeightMemberDetailActivity.class);
        intent.putExtra("uid", uid);
        startActivity(intent);
    }

    private final void s() {
        if (!NetUtil.isNetworkConnected(this)) {
            IconToast.showError(this, getString(R.string.not_connect_network));
            return;
        }
        if (BFCallback.getInstance().enableMiDongFlavor() && UserInfoManager.getManager().getAllInfosCount() >= 12) {
            Toast.makeText(this, getString(R.string.over_the_max_famliy_count), 0).show();
            return;
        }
        if (!BFCallback.getInstance().enableMiDongFlavor() && UserInfoManager.getManager().getAllInfosCount() >= 17) {
            Toast.makeText(this, getString(R.string.over_the_max_user_count), 0).show();
            return;
        }
        Intent intent = new Intent(this, (Class<?>) WeightMemberDetailActivity.class);
        intent.putExtra(BFConstant.KET_ADD_NEW, true);
        intent.putExtra(BFConstant.KET_ADD_NEW_FROM_LIST, true);
        startActivity(intent);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(savedInstanceState);
        ActivityFamilyListBinding activityFamilyListBindingInflate = ActivityFamilyListBinding.inflate(getLayoutInflater());
        this.binding = activityFamilyListBindingInflate;
        Objects.requireNonNull(activityFamilyListBindingInflate);
        setContentView(activityFamilyListBindingInflate.getRoot());
        BFTitleStyleKt.setUnifyTitleStyle$default(this, getResources().getString(R.string.family_member), null, 2, null);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.WEIGHT_FAMILY_VIEW_NUM));
        ActivityFamilyListBinding activityFamilyListBinding = this.binding;
        Objects.requireNonNull(activityFamilyListBinding);
        activityFamilyListBinding.addNewMemberLayout.setVisibility(0);
        ActivityFamilyListBinding activityFamilyListBinding2 = this.binding;
        Objects.requireNonNull(activityFamilyListBinding2);
        activityFamilyListBinding2.addMemberLl.setOnClickListener(new View.OnClickListener() { // from class: pz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FamilyListActivity.o(this.a, view);
            }
        });
        this.familyMemberViewModel = (FamilyMemberViewModel) new ViewModelProvider(this).get(FamilyMemberViewModel.class);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        FamilyMemberViewModel familyMemberViewModel = this.familyMemberViewModel;
        Objects.requireNonNull(familyMemberViewModel);
        familyMemberViewModel.loadFamilyList();
        FamilyMemberViewModel familyMemberViewModel2 = this.familyMemberViewModel;
        Objects.requireNonNull(familyMemberViewModel2);
        familyMemberViewModel2.getFamilyList().observe(this, new Observer() { // from class: rz1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FamilyListActivity.p(this.a, (List) obj);
            }
        });
    }
}
