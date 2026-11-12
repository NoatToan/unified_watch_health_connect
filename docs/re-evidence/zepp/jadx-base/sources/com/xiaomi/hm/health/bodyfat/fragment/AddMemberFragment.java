package com.xiaomi.hm.health.bodyfat.fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.CustomToast;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.BodyFatDetailActivity;
import com.xiaomi.hm.health.bodyfat.activity.OneFootDetailActivity;
import com.xiaomi.hm.health.bodyfat.activity.WeightDetailActivity;
import com.xiaomi.hm.health.bodyfat.activity.WeightMemberDetailActivity;
import com.xiaomi.hm.health.bodyfat.databinding.FragmentAddMemberBinding;
import com.xiaomi.hm.health.bodyfat.family.MemberInfoSetWeightActivity;
import com.xiaomi.hm.health.bodyfat.fragment.AddMemberFragment;
import com.xiaomi.hm.health.bodyfat.fragment.ChooseAvatarOfScaleDialog;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bodyfat.utils.Utils;
import com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis;
import com.xiaomi.hm.health.bodyfat.viewmodel.SettingOfScaleViewModel;
import com.xiaomi.hm.health.bodyfat.viewmodel.WeightMemberDetailViewModel;
import com.xiaomi.hm.health.bodyfat.webapi.Resource;
import com.xiaomi.hm.health.bodyfat.webapi.Status;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0002^+B\u0007¢\u0006\u0004\b\\\u0010]J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\u0018\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0003H\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0002J&\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\"\u0010(\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u00158\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010/R\u001d\u00105\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001f\u0010:\u001a\u0004\u0018\u0001068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00109R\u001f\u0010?\u001a\u0004\u0018\u00010;8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00102\u001a\u0004\b=\u0010>R\u001f\u0010D\u001a\u0004\u0018\u00010@8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00102\u001a\u0004\bB\u0010CR&\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010O\u001a\u00060LR\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001d\u0010W\u001a\u00020S8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u00102\u001a\u0004\bU\u0010VR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006_"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/AddMemberFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/xiaomi/hm/health/bodyfat/activity/WeightMemberDetailActivity$OnBackPressed;", "", "initView", "", "isEnable", "F", "B", "", "Q", "R", "t", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", GoogleApiAvailabilityLight.b, "K", "M", "O", LogUtil.D, "", "tips", "G", LogUtil.I, "E", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "onBackPressed", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentAddMemberBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentAddMemberBinding;", "binding", "b", "Ljava/lang/String;", "mTag", "c", "Lkotlin/Lazy;", DTransferConstants.SEARCH_KEY, "()I", "type", "Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$WeightData;", GoogleApiAvailabilityLight.a, SOAP.XMLNS, "()Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$WeightData;", ParamKey.weightData, "Lcom/xiaomi/hm/health/bodyfat/viewmodel/WeightMemberDetailViewModel;", "e", "r", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/WeightMemberDetailViewModel;", "viewModel", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "f", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "settingOfScaleViewModel", "g", "Ljava/util/ArrayList;", "keys", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "h", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "mUserInfo", "Lcom/xiaomi/hm/health/bodyfat/fragment/AddMemberFragment$a;", "i", "Lcom/xiaomi/hm/health/bodyfat/fragment/AddMemberFragment$a;", "mAdapter", z.j, "Z", "weightFromScale", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", hl.k, "o", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "Lcom/xiaomi/hm/health/bodyfat/utils/BFCallback$OnNewUserDataChangeListener;", "l", "Lcom/xiaomi/hm/health/bodyfat/utils/BFCallback$OnNewUserDataChangeListener;", "onAddDataChangeListener", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class AddMemberFragment extends Fragment implements WeightMemberDetailActivity.OnBackPressed {
    public static final int TYPE_ADD_BABY = 17;
    public static final int TYPE_ADD_ONE_FOOT_TEST = 18;
    public static final int TYPE_NORMAL = 16;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FragmentAddMemberBinding binding;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private UserInfos mUserInfo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean weightFromScale;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String m = "keyType";

    @NotNull
    private static final String n = "keyValue";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String mTag = "WeightMember";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy type = LazyKt__LazyJVMKt.lazy(new e());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy weightData = LazyKt__LazyJVMKt.lazy(new g());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new f());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingOfScaleViewModel = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Integer> keys = n();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final a mAdapter = new a();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingDialog = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final BFCallback.OnNewUserDataChangeListener onAddDataChangeListener = new BFCallback.OnNewUserDataChangeListener() { // from class: j9
        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.OnNewUserDataChangeListener
        public final void onChange(HMUserInfo hMUserInfo) {
            AddMemberFragment.C(this.a, hMUserInfo);
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u001c\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/AddMemberFragment$Companion;", "", "", "type", "Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$WeightData;", ParamKey.weightData, "Lcom/xiaomi/hm/health/bodyfat/fragment/AddMemberFragment;", "newInstance", "", "keyType", "Ljava/lang/String;", "getKeyType", "()Ljava/lang/String;", "keyValue", "getKeyValue", "TYPE_ADD_BABY", LogUtil.I, "TYPE_ADD_ONE_FOOT_TEST", "TYPE_NORMAL", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AddMemberFragment newInstance$default(Companion companion, int i, ChooseUserFragment.WeightData weightData, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                weightData = null;
            }
            return companion.newInstance(i, weightData);
        }

        @NotNull
        public final String getKeyType() {
            return AddMemberFragment.m;
        }

        @NotNull
        public final String getKeyValue() {
            return AddMemberFragment.n;
        }

        @NotNull
        public final AddMemberFragment newInstance(int type, @Nullable ChooseUserFragment.WeightData weightData) {
            Bundle bundle = new Bundle();
            bundle.putInt(getKeyType(), type);
            if (weightData != null) {
                bundle.putParcelable(AddMemberFragment.INSTANCE.getKeyValue(), weightData);
            }
            AddMemberFragment addMemberFragment = new AddMemberFragment();
            addMemberFragment.setArguments(bundle);
            return addMemberFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.LOADING.ordinal()] = 1;
            iArr[Status.SUCCESS.ordinal()] = 2;
            iArr[Status.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0014"}, d2 = {"com/xiaomi/hm/health/bodyfat/fragment/AddMemberFragment$a", "Landroid/widget/BaseAdapter;", "", "position", "Lcom/huami/lib/rainbow/ListTile;", "item", "", "a", "getCount", "", "getItem", "", "getItemId", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "<init>", "(Lcom/xiaomi/hm/health/bodyfat/fragment/AddMemberFragment;)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public final class a extends BaseAdapter {
        public a() {
        }

        private final void a(int position, ListTile item) {
            Float weight;
            Integer height;
            Integer height2;
            String strStringPlus;
            String birthday;
            if (position >= AddMemberFragment.this.keys.size()) {
                return;
            }
            boolean z = false;
            item.setVisibility(0);
            item.setTitle(((Number) AddMemberFragment.this.keys.get(position)).intValue());
            item.setEnabled(true);
            item.setTrailing(R.drawable.ic_arrow_forward_20_2x);
            Integer num = (Integer) AddMemberFragment.this.keys.get(position);
            int i = R.string.bodyfat_family_info_key_nickname;
            hMBirthday = null;
            String hMBirthday = null;
            if (num != null && num.intValue() == i) {
                UserInfos userInfos = AddMemberFragment.this.mUserInfo;
                String name = userInfos != null ? userInfos.getName() : null;
                if (name == null) {
                    name = AddMemberFragment.this.getString(R.string.bodyfat_user_add_new_list_enter);
                }
                item.setTips(name);
                return;
            }
            int i2 = R.string.person_info_key_gender;
            if (num != null && num.intValue() == i2) {
                UserInfos userInfos2 = AddMemberFragment.this.mUserInfo;
                Integer gender = userInfos2 != null ? userInfos2.getGender() : null;
                if (gender != null && gender.intValue() == 1) {
                    item.setTips(AddMemberFragment.this.getString(R.string.person_info_set_gender_male));
                    return;
                } else if (gender != null && gender.intValue() == 0) {
                    item.setTips(AddMemberFragment.this.getString(R.string.person_info_set_gender_female));
                    return;
                } else {
                    item.setTips(AddMemberFragment.this.getString(R.string.bodyfat_user_add_new_list_select));
                    return;
                }
            }
            int i3 = R.string.person_info_key_birth;
            if (num != null && num.intValue() == i3) {
                UserInfos userInfos3 = AddMemberFragment.this.mUserInfo;
                if (TextUtils.isEmpty(userInfos3 == null ? null : userInfos3.getBirthday())) {
                    item.setTips(AddMemberFragment.this.getString(R.string.bodyfat_user_add_new_list_select));
                    return;
                }
                UserInfos userInfos4 = AddMemberFragment.this.mUserInfo;
                if (userInfos4 != null && (birthday = userInfos4.getBirthday()) != null) {
                    hMBirthday = BFCallback.getInstance().getHMBirthday(birthday);
                }
                if (hMBirthday != null) {
                    if (hMBirthday.length() > 0) {
                        item.setTips(hMBirthday);
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = R.string.person_info_key_height;
            if (num != null && num.intValue() == i4) {
                UserInfos userInfos5 = AddMemberFragment.this.mUserInfo;
                if (((userInfos5 == null || (height = userInfos5.getHeight()) == null) ? 0 : height.intValue()) <= 0) {
                    item.setTips(AddMemberFragment.this.getString(R.string.bodyfat_user_add_new_list_select));
                    return;
                }
                if (HMPersonInfo.getInstance().getMiliConfig().getUnit() == 0) {
                    AddMemberFragment addMemberFragment = AddMemberFragment.this;
                    int i5 = R.string.person_info_key_height_unit_metric;
                    Object[] objArr = new Object[1];
                    StringBuilder sb = new StringBuilder();
                    UserInfos userInfos6 = AddMemberFragment.this.mUserInfo;
                    sb.append(userInfos6 != null ? userInfos6.getHeight() : null);
                    sb.append("");
                    objArr[0] = sb.toString();
                    strStringPlus = addMemberFragment.getString(i5, objArr);
                } else {
                    Utils utils = Utils.INSTANCE;
                    UserInfos userInfos7 = AddMemberFragment.this.mUserInfo;
                    int iCm2inch = utils.cm2inch((userInfos7 == null || (height2 = userInfos7.getHeight()) == null) ? 0 : height2.intValue());
                    int i6 = iCm2inch / 12;
                    int i7 = iCm2inch % 12;
                    strStringPlus = Intrinsics.stringPlus(AddMemberFragment.this.getResources().getQuantityString(R.plurals.numberFoot, i6, Integer.valueOf(i6)), AddMemberFragment.this.getResources().getQuantityString(R.plurals.numberInch, i7, Integer.valueOf(i7)));
                }
                item.setTips(strStringPlus);
                return;
            }
            int i8 = R.string.person_info_key_weight;
            if (num != null && num.intValue() == i8) {
                if (AddMemberFragment.this.weightFromScale) {
                    item.setTrailing((Drawable) null);
                }
                UserInfos userInfos8 = AddMemberFragment.this.mUserInfo;
                float fFloatValue = (userInfos8 == null || (weight = userInfos8.getWeight()) == null) ? 0.0f : weight.floatValue();
                if (fFloatValue <= 0.0f) {
                    item.setTips(AddMemberFragment.this.getString(R.string.bodyfat_user_add_new_list_select));
                    return;
                }
                int weightUnit = UnitManager.getInstance().getWeightUnit();
                item.setTips(Intrinsics.stringPlus(HMWeightUtils.getWeightValueStringForDisplay(fFloatValue, weightUnit), UnitManager.getInstance().getWeightUnitString(weightUnit)));
                if (AddMemberFragment.this.R()) {
                    item.setGrayEnable(false);
                    item.setTrailing((Drawable) null);
                    return;
                }
                return;
            }
            int i9 = R.string.title_choose_body_measure_mode;
            if (num != null && num.intValue() == i9) {
                UserInfos userInfos9 = AddMemberFragment.this.mUserInfo;
                if (userInfos9 != null && userInfos9.getMeasureMode() == 0) {
                    z = true;
                }
                item.setTips(z ? AddMemberFragment.this.getString(R.string.text_normal_mode) : AddMemberFragment.this.getString(R.string.text_sport_mode));
                return;
            }
            int i10 = R.string.title_choose_avatar_of_scale;
            if (num != null && num.intValue() == i10) {
                item.setTips((CharSequence) null);
                SettingOfScaleViewModel settingOfScaleViewModelP = AddMemberFragment.this.p();
                if (settingOfScaleViewModelP == null) {
                    return;
                }
                UserInfos userInfos10 = AddMemberFragment.this.mUserInfo;
                settingOfScaleViewModelP.loadScaleAvatar(item, userInfos10 != null ? Integer.valueOf(userInfos10.getAvatarIdOfScale()) : null);
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return AddMemberFragment.this.keys.size();
        }

        @Override // android.widget.Adapter
        @NotNull
        public Object getItem(int position) {
            return AddMemberFragment.this.keys.get(position);
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.Adapter
        @NotNull
        public View getView(int position, @Nullable View convertView, @NotNull ViewGroup parent) {
            if (convertView == null) {
                convertView = new ListTile(AddMemberFragment.this.getActivity());
            }
            a(position, (ListTile) convertView);
            return convertView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ UserInfos a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UserInfos userInfos) {
            super(0);
            this.a = userInfos;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("observe member ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<LoadingDialog> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog getA() {
            LoadingDialog loadingDialog = new LoadingDialog(AddMemberFragment.this.getActivity());
            loadingDialog.setMessage(AddMemberFragment.this.getString(R.string.saving));
            return loadingDialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<SettingOfScaleViewModel> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SettingOfScaleViewModel getA() {
            FragmentActivity activity = AddMemberFragment.this.getActivity();
            if (activity == null) {
                return null;
            }
            return (SettingOfScaleViewModel) ViewModelProviders.of(activity).get(SettingOfScaleViewModel.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Integer> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            Bundle arguments = AddMemberFragment.this.getArguments();
            if (arguments == null) {
                return 16;
            }
            return arguments.getInt(AddMemberFragment.INSTANCE.getKeyType());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/WeightMemberDetailViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<WeightMemberDetailViewModel> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WeightMemberDetailViewModel getA() {
            FragmentActivity activity = AddMemberFragment.this.getActivity();
            if (activity == null) {
                return null;
            }
            return (WeightMemberDetailViewModel) ViewModelProviders.of(activity).get(WeightMemberDetailViewModel.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseUserFragment$WeightData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<ChooseUserFragment.WeightData> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChooseUserFragment.WeightData getA() {
            Bundle arguments = AddMemberFragment.this.getArguments();
            if (arguments == null) {
                return null;
            }
            return (ChooseUserFragment.WeightData) arguments.getParcelable(AddMemberFragment.INSTANCE.getKeyValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(AddMemberFragment addMemberFragment, View view) {
        UserInfos userInfos = addMemberFragment.mUserInfo;
        int ageByDate = HMUserInfo.getAgeByDate(userInfos == null ? null : userInfos.getBirthday());
        if (!HMLoginManager.isAdultGlobal() && !HMLoginManager.isAdultGlobal(ageByDate)) {
            CustomToast.makeText(addMemberFragment.getActivity(), addMemberFragment.getString(R.string.tips_child_cannot_add_member), 0).show();
            return;
        }
        if (BFCallback.getHMDeviceManager().hasBoundBfs() && ageByDate >= 6 && ageByDate < 18) {
            addMemberFragment.M();
            return;
        }
        if (addMemberFragment.B()) {
            if (HMWeightUtils.isAmazfitScale() && !HMWeightUtils.isAmazfitScaleConnect()) {
                addMemberFragment.O();
                return;
            }
            WeightMemberDetailViewModel weightMemberDetailViewModelR = addMemberFragment.r();
            if (weightMemberDetailViewModelR == null) {
                return;
            }
            weightMemberDetailViewModelR.addNewMember(addMemberFragment.q(), addMemberFragment.mUserInfo, addMemberFragment.s());
        }
    }

    private final boolean B() {
        UserInfos userInfos = this.mUserInfo;
        return userInfos != null && !TextUtils.isEmpty(userInfos.getName()) && !TextUtils.isEmpty(userInfos.getBirthday()) && userInfos.getWeight().floatValue() > 0.0f && userInfos.getGender().intValue() >= 0 && userInfos.getHeight().intValue() >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(AddMemberFragment addMemberFragment, HMUserInfo hMUserInfo) {
        WeightMemberDetailViewModel weightMemberDetailViewModelR = addMemberFragment.r();
        if (weightMemberDetailViewModelR == null) {
            return;
        }
        weightMemberDetailViewModelR.parseUserInfo(hMUserInfo);
    }

    private final void D() {
        switch (q()) {
            case 16:
                if (s() == null) {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        activity.finish();
                        break;
                    }
                } else {
                    ChooseUserFragment.WeightData weightDataS = s();
                    if (!HMWeightUtils.isValidImpedance(weightDataS == null ? 0 : weightDataS.getImpedance())) {
                        Intent intent = new Intent(getActivity(), (Class<?>) WeightDetailActivity.class);
                        UserInfos userInfos = this.mUserInfo;
                        intent.putExtra(BFConstant.KEY_UID, userInfos != null ? userInfos.getUserId() : null);
                        startActivity(intent);
                        FragmentActivity activity2 = getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                            break;
                        }
                    } else {
                        String measureTips = HMWeightUtils.getMeasureTips(this.mUserInfo, getActivity());
                        if (!(measureTips.length() > 0)) {
                            Intent intent2 = new Intent(getActivity(), (Class<?>) BodyFatDetailActivity.class);
                            UserInfos userInfos2 = this.mUserInfo;
                            intent2.putExtra(BFConstant.KEY_UID, userInfos2 != null ? userInfos2.getUserId() : null);
                            startActivity(intent2);
                            FragmentActivity activity3 = getActivity();
                            if (activity3 != null) {
                                activity3.finish();
                                break;
                            }
                        } else {
                            G(measureTips);
                            break;
                        }
                    }
                }
                break;
            case 17:
                Intent intent3 = new Intent(getActivity(), (Class<?>) WeightDetailActivity.class);
                UserInfos userInfos3 = this.mUserInfo;
                intent3.putExtra(BFConstant.KEY_UID, userInfos3 != null ? userInfos3.getUserId() : null);
                startActivity(intent3);
                FragmentActivity activity4 = getActivity();
                if (activity4 != null) {
                    activity4.finish();
                    break;
                }
                break;
            case 18:
                FragmentActivity activity5 = getActivity();
                UserInfos userInfos4 = this.mUserInfo;
                OneFootDetailActivity.startMe(activity5, userInfos4 != null ? userInfos4.getUserId() : null);
                FragmentActivity activity6 = getActivity();
                if (activity6 != null) {
                    activity6.finish();
                    break;
                }
                break;
        }
    }

    private final void E() {
        UserInfos userInfos = this.mUserInfo;
        new SelectWeightFragment((AppCompatActivity) getActivity(), ((userInfos == null || userInfos.getWeight().floatValue() < 0.0f) ? Float.valueOf(60.0f) : this.mUserInfo.getWeight()).floatValue(), new IOnWeightSelectListener() { // from class: com.xiaomi.hm.health.bodyfat.fragment.AddMemberFragment$selectWeight$1
            @Override // com.xiaomi.hm.health.bodyfat.fragment.IOnWeightSelectListener
            public void onWeightSelect(float weight) {
                HMUserInfo hMUserInfo = HMUserInfo.getHMUserInfo(this.a.mUserInfo);
                hMUserInfo.setWeight(weight);
                WeightMemberDetailViewModel weightMemberDetailViewModelR = this.a.r();
                if (weightMemberDetailViewModelR == null) {
                    return;
                }
                weightMemberDetailViewModelR.parseUserInfo(hMUserInfo);
            }

            @Override // com.xiaomi.hm.health.bodyfat.fragment.IOnWeightSelectListener
            public void onWeightSelectCancel() {
            }
        }).showWeightSelectDialog();
    }

    private final void F(boolean isEnable) {
        FragmentAddMemberBinding fragmentAddMemberBinding = this.binding;
        Objects.requireNonNull(fragmentAddMemberBinding);
        fragmentAddMemberBinding.textSave.setEnabled(isEnable);
        if (isEnable) {
            FragmentAddMemberBinding fragmentAddMemberBinding2 = this.binding;
            Objects.requireNonNull(fragmentAddMemberBinding2);
            fragmentAddMemberBinding2.textSave.setTextColor(getResources().getColor(R.color.s1));
        } else {
            FragmentAddMemberBinding fragmentAddMemberBinding3 = this.binding;
            Objects.requireNonNull(fragmentAddMemberBinding3);
            fragmentAddMemberBinding3.textSave.setTextColor(getResources().getColor(R.color.s2));
        }
    }

    private final void G(String tips) {
        new AlertDialogFragment.Builder(getActivity()).setNeutralButton(getString(R.string.got_it), new DialogInterface.OnClickListener() { // from class: n9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AddMemberFragment.H(this.a, dialogInterface, i);
            }
        }).setMessage(tips).setCancelable(false).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(AddMemberFragment addMemberFragment, DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(addMemberFragment.getActivity(), (Class<?>) WeightDetailActivity.class);
        UserInfos userInfos = addMemberFragment.mUserInfo;
        intent.putExtra(BFConstant.KEY_UID, userInfos == null ? null : userInfos.getUserId());
        addMemberFragment.startActivity(intent);
        FragmentActivity activity = addMemberFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    private final void I() {
        AlertDialogFragment.Builder cancelable = new AlertDialogFragment.Builder(getActivity()).setMessage(getString(q() == 18 ? R.string.bodyfat_member_add_aband_one_foot : R.string.bodyfat_member_add_save_cancle)).setPositiveButton(getString(R.string.give_up), new DialogInterface.OnClickListener() { // from class: h9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AddMemberFragment.J(this.a, dialogInterface, i);
            }
        }).setNegativeButton(getString(R.string.cancel), (DialogInterface.OnClickListener) null).setCancelable(false);
        FragmentActivity activity = getActivity();
        cancelable.show(activity != null ? activity.getSupportFragmentManager() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(AddMemberFragment addMemberFragment, DialogInterface dialogInterface, int i) {
        FragmentActivity activity = addMemberFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    private final void K() {
        AlertDialogFragment.Builder neutralButton = new AlertDialogFragment.Builder(getActivity()).setCancelable(true).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(R.array.member_add_weight_items), new DialogInterface.OnClickListener() { // from class: l9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AddMemberFragment.L(this.a, dialogInterface, i);
            }
        }).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        FragmentActivity activity = getActivity();
        neutralButton.show(activity != null ? activity.getSupportFragmentManager() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(AddMemberFragment addMemberFragment, DialogInterface dialogInterface, int i) {
        if (i == 1) {
            addMemberFragment.E();
        } else {
            addMemberFragment.startActivityForResult(new Intent(addMemberFragment.getActivity(), (Class<?>) MemberInfoSetWeightActivity.class), 6);
        }
    }

    private final void M() {
        AlertDialogFragment.Builder neutralButton = new AlertDialogFragment.Builder(getActivity()).setCancelable(false).setMessage(R.string.bodyfat_body_fat_desc).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: m9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AddMemberFragment.N(this.a, dialogInterface, i);
            }
        });
        FragmentActivity activity = getActivity();
        neutralButton.show(activity == null ? null : activity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(AddMemberFragment addMemberFragment, DialogInterface dialogInterface, int i) {
        if (HMWeightUtils.isAmazfitScale() && !HMWeightUtils.isAmazfitScaleConnect()) {
            addMemberFragment.O();
            return;
        }
        WeightMemberDetailViewModel weightMemberDetailViewModelR = addMemberFragment.r();
        if (weightMemberDetailViewModelR == null) {
            return;
        }
        weightMemberDetailViewModelR.addNewMember(addMemberFragment.q(), addMemberFragment.mUserInfo, addMemberFragment.s());
    }

    private final void O() {
        AlertDialogFragment.Builder cancelable = new AlertDialogFragment.Builder(getActivity()).setMessage(getString(R.string.tips_sync_user_to_scale)).setNeutralButton(getString(R.string.i_know), new DialogInterface.OnClickListener() { // from class: o9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AddMemberFragment.P(this.a, dialogInterface, i);
            }
        }).setCancelable(false);
        FragmentActivity activity = getActivity();
        cancelable.show(activity == null ? null : activity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(AddMemberFragment addMemberFragment, DialogInterface dialogInterface, int i) {
        WeightMemberDetailViewModel weightMemberDetailViewModelR = addMemberFragment.r();
        if (weightMemberDetailViewModelR == null) {
            return;
        }
        weightMemberDetailViewModelR.addNewMember(addMemberFragment.q(), addMemberFragment.mUserInfo, addMemberFragment.s());
    }

    private final long Q() {
        return q() == 17 ? BFCallback.getInstance().getPersonInfoSettingBaseFragmentAddNewBabyCode() : BFCallback.getInstance().getPersonInfoSettingBaseFragmentAddNewCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R() {
        ChooseUserFragment.WeightData weightDataS = s();
        return (weightDataS == null ? 0.0f : weightDataS.getWeight()) > 0.0f && q() != 18;
    }

    private final void initView() {
        MutableLiveData<Integer> measureMode;
        MutableLiveData<ChooseAvatarOfScaleDialog.AvatarInfo> chooseAvatarId;
        MutableLiveData<Resource<Boolean>> addMemberResult;
        MutableLiveData<UserInfos> userInfo;
        WeightMemberDetailViewModel weightMemberDetailViewModelR = r();
        if (weightMemberDetailViewModelR != null && (userInfo = weightMemberDetailViewModelR.getUserInfo()) != null) {
            userInfo.observe(getViewLifecycleOwner(), new Observer() { // from class: t9
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    AddMemberFragment.v(this.a, (UserInfos) obj);
                }
            });
        }
        WeightMemberDetailViewModel weightMemberDetailViewModelR2 = r();
        if (weightMemberDetailViewModelR2 != null && (addMemberResult = weightMemberDetailViewModelR2.getAddMemberResult()) != null) {
            addMemberResult.observe(getViewLifecycleOwner(), new Observer() { // from class: s9
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    AddMemberFragment.x(this.a, (Resource) obj);
                }
            });
        }
        SettingOfScaleViewModel settingOfScaleViewModelP = p();
        if (settingOfScaleViewModelP != null && (chooseAvatarId = settingOfScaleViewModelP.getChooseAvatarId()) != null) {
            chooseAvatarId.observe(getViewLifecycleOwner(), new Observer() { // from class: r9
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    AddMemberFragment.y(this.a, (ChooseAvatarOfScaleDialog.AvatarInfo) obj);
                }
            });
        }
        SettingOfScaleViewModel settingOfScaleViewModelP2 = p();
        if (settingOfScaleViewModelP2 != null && (measureMode = settingOfScaleViewModelP2.getMeasureMode()) != null) {
            measureMode.observe(getViewLifecycleOwner(), new Observer() { // from class: i9
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    AddMemberFragment.z(this.a, (Integer) obj);
                }
            });
        }
        t();
        FragmentAddMemberBinding fragmentAddMemberBinding = this.binding;
        Objects.requireNonNull(fragmentAddMemberBinding);
        fragmentAddMemberBinding.textSave.setOnClickListener(new View.OnClickListener() { // from class: p9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddMemberFragment.A(this.a, view);
            }
        });
    }

    private final ArrayList<Integer> n() {
        int i = R.string.title_choose_avatar_of_scale;
        int i2 = R.string.title_choose_body_measure_mode;
        ArrayList<Integer> arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(R.string.bodyfat_family_info_key_nickname), Integer.valueOf(R.string.person_info_key_gender), Integer.valueOf(i), Integer.valueOf(R.string.person_info_key_birth), Integer.valueOf(R.string.person_info_key_height), Integer.valueOf(R.string.person_info_key_weight), Integer.valueOf(i2));
        if (BFCallback.getHMDeviceManager().getBoundDeviceSource(HMDeviceType.WEIGHT).getValue() != HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue()) {
            arrayListArrayListOf.remove(Integer.valueOf(i));
            arrayListArrayListOf.remove(Integer.valueOf(i2));
        }
        return arrayListArrayListOf;
    }

    private final LoadingDialog o() {
        return (LoadingDialog) this.loadingDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SettingOfScaleViewModel p() {
        return (SettingOfScaleViewModel) this.settingOfScaleViewModel.getValue();
    }

    private final int q() {
        return ((Number) this.type.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WeightMemberDetailViewModel r() {
        return (WeightMemberDetailViewModel) this.viewModel.getValue();
    }

    private final ChooseUserFragment.WeightData s() {
        return (ChooseUserFragment.WeightData) this.weightData.getValue();
    }

    private final void t() {
        FragmentAddMemberBinding fragmentAddMemberBinding = this.binding;
        Objects.requireNonNull(fragmentAddMemberBinding);
        fragmentAddMemberBinding.personInfoList.setAdapter((ListAdapter) this.mAdapter);
        FragmentAddMemberBinding fragmentAddMemberBinding2 = this.binding;
        Objects.requireNonNull(fragmentAddMemberBinding2);
        fragmentAddMemberBinding2.personInfoList.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: q9
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                AddMemberFragment.u(this.a, adapterView, view, i, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(AddMemberFragment addMemberFragment, AdapterView adapterView, View view, int i, long j) {
        FragmentActivity activity;
        Integer num = addMemberFragment.keys.get(i);
        int i2 = R.string.bodyfat_family_info_key_nickname;
        if (num != null && num.intValue() == i2) {
            BFCallback.getInstance().showNewMemberPersonInfoEditFragment(addMemberFragment.getActivity(), BFCallback.PersonInfoEnum.NICKNAME, addMemberFragment.onAddDataChangeListener, BFCallback.getInstance().getPersonInfoSettingBaseFragmentAddNewCode());
            return;
        }
        int i3 = R.string.person_info_key_gender;
        if (num != null && num.intValue() == i3) {
            BFCallback.getInstance().showNewMemberPersonInfoEditFragment(addMemberFragment.getActivity(), BFCallback.PersonInfoEnum.GENDER, addMemberFragment.onAddDataChangeListener, BFCallback.getInstance().getPersonInfoSettingBaseFragmentAddNewCode());
            return;
        }
        int i4 = R.string.person_info_key_birth;
        if (num != null && num.intValue() == i4) {
            BFCallback.getInstance().showNewMemberPersonInfoEditFragment(addMemberFragment.getActivity(), BFCallback.PersonInfoEnum.BIRTH, addMemberFragment.onAddDataChangeListener, addMemberFragment.Q());
            return;
        }
        int i5 = R.string.person_info_key_height;
        if (num != null && num.intValue() == i5) {
            BFCallback.getInstance().showNewMemberPersonInfoEditFragment(addMemberFragment.getActivity(), BFCallback.PersonInfoEnum.HEIGHT, addMemberFragment.onAddDataChangeListener, addMemberFragment.Q());
            return;
        }
        int i6 = R.string.person_info_key_weight;
        if (num != null && num.intValue() == i6) {
            if (addMemberFragment.weightFromScale) {
                return;
            }
            BFCallback.IHMDeviceManager hMDeviceManager = BFCallback.getHMDeviceManager();
            HMDeviceType hMDeviceType = HMDeviceType.WEIGHT;
            if (!hMDeviceManager.hasBound(hMDeviceType)) {
                addMemberFragment.E();
                return;
            } else {
                if (addMemberFragment.R()) {
                    return;
                }
                if (BFCallback.getHMDeviceManager().getBoundDeviceSource(hMDeviceType) == HMDeviceSource.WEIGHT_AMAZFIT_SCALE) {
                    addMemberFragment.E();
                    return;
                } else {
                    addMemberFragment.K();
                    return;
                }
            }
        }
        int i7 = R.string.title_choose_avatar_of_scale;
        if (num != null && num.intValue() == i7) {
            FragmentActivity activity2 = addMemberFragment.getActivity();
            if (activity2 == null) {
                return;
            }
            new ChooseAvatarOfScaleDialog().show(activity2.getSupportFragmentManager());
            return;
        }
        int i8 = R.string.title_choose_body_measure_mode;
        if (num == null || num.intValue() != i8 || (activity = addMemberFragment.getActivity()) == null) {
            return;
        }
        activity.getSupportFragmentManager().beginTransaction().setTransition(4097).addToBackStack(null).add(android.R.id.content, new ChooseTypeOfScaleFragment()).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(final AddMemberFragment addMemberFragment, UserInfos userInfos) {
        UserInfos userInfos2;
        FragmentActivity activity;
        HMLog.debug(addMemberFragment.mTag, new b(userInfos));
        UserInfos userInfos3 = addMemberFragment.mUserInfo;
        if (userInfos3 != null) {
            if (!Intrinsics.areEqual(userInfos3 == null ? null : userInfos3.getBirthday(), userInfos.getBirthday()) && !TextUtils.isEmpty(userInfos.getBirthday()) && !BFCallback.getAppUtils().isAdultByMonth(userInfos.getBirthday()) && (activity = addMemberFragment.getActivity()) != null) {
                BFCallback.getAppUtils().showGrantWeightDataRequestDialog((AppCompatActivity) activity, userInfos.getUserId(), new WeightGrantRequestDialogLis() { // from class: k9
                    @Override // com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis
                    public final void requestResult(boolean z) {
                        AddMemberFragment.w(this.a, z);
                    }
                });
            }
        }
        addMemberFragment.mUserInfo = userInfos;
        if (addMemberFragment.R() && (userInfos2 = addMemberFragment.mUserInfo) != null) {
            ChooseUserFragment.WeightData weightDataS = addMemberFragment.s();
            userInfos2.setWeight(weightDataS != null ? Float.valueOf(weightDataS.getWeight()) : null);
        }
        addMemberFragment.mAdapter.notifyDataSetChanged();
        addMemberFragment.F(addMemberFragment.B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(AddMemberFragment addMemberFragment, boolean z) {
        if (z) {
            return;
        }
        UserInfos userInfos = addMemberFragment.mUserInfo;
        if (userInfos != null) {
            userInfos.setBirthday("");
        }
        addMemberFragment.mAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(AddMemberFragment addMemberFragment, Resource resource) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        if (i == 1) {
            addMemberFragment.o().show();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            addMemberFragment.o().dismiss();
            CustomToast.makeText(addMemberFragment.getActivity(), R.string.bodyfat_user_add_new_toast_failed, 0).show();
            return;
        }
        addMemberFragment.o().dismiss();
        if (Intrinsics.areEqual(resource.data, Boolean.TRUE)) {
            addMemberFragment.D();
        } else {
            CustomToast.makeText(addMemberFragment.getActivity(), R.string.bodyfat_user_add_new_toast_failed, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(AddMemberFragment addMemberFragment, ChooseAvatarOfScaleDialog.AvatarInfo avatarInfo) {
        UserInfos userInfos = addMemberFragment.mUserInfo;
        if (userInfos != null) {
            userInfos.setAvatarIdOfScale(avatarInfo.getValue());
        }
        addMemberFragment.mAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(AddMemberFragment addMemberFragment, Integer num) {
        UserInfos userInfos = addMemberFragment.mUserInfo;
        if (userInfos != null) {
            userInfos.setMeasureMode(num.intValue());
        }
        addMemberFragment.mAdapter.notifyDataSetChanged();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        WeightAdvData weightAdvDataFromJsonString;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 6 || resultCode != -1 || data == null || TextUtils.isEmpty(data.getStringExtra(WeightAdvData.WEIGHTADVDATA_KEY)) || (weightAdvDataFromJsonString = WeightAdvData.fromJsonString(data.getStringExtra(WeightAdvData.WEIGHTADVDATA_KEY))) == null) {
            return;
        }
        UserInfos userInfos = this.mUserInfo;
        if (userInfos != null) {
            userInfos.setWeight(Float.valueOf(weightAdvDataFromJsonString.getValueKg()));
        }
        this.weightFromScale = true;
        WeightMemberDetailViewModel weightMemberDetailViewModelR = r();
        MutableLiveData<UserInfos> userInfo = weightMemberDetailViewModelR == null ? null : weightMemberDetailViewModelR.getUserInfo();
        if (userInfo == null) {
            return;
        }
        userInfo.setValue(this.mUserInfo);
    }

    @Override // com.xiaomi.hm.health.bodyfat.activity.WeightMemberDetailActivity.OnBackPressed
    public boolean onBackPressed() {
        if (!this.weightFromScale && !R() && q() != 18) {
            return false;
        }
        I();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentAddMemberBinding fragmentAddMemberBindingInflate = FragmentAddMemberBinding.inflate(inflater);
        this.binding = fragmentAddMemberBindingInflate;
        Objects.requireNonNull(fragmentAddMemberBindingInflate);
        return fragmentAddMemberBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }
}
