package com.xiaomi.hm.health.bodyfat.fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwnerKt;
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
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.WeightGoalsSetActivity;
import com.xiaomi.hm.health.bodyfat.activity.WeightMemberDetailActivity;
import com.xiaomi.hm.health.bodyfat.databinding.FragmentWeightMemberDetailBinding;
import com.xiaomi.hm.health.bodyfat.event.EventWeightChanged;
import com.xiaomi.hm.health.bodyfat.fragment.ChooseAvatarOfScaleDialog;
import com.xiaomi.hm.health.bodyfat.fragment.MemberDetailFragment;
import com.xiaomi.hm.health.bodyfat.model.Birthday;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.Utils;
import com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis;
import com.xiaomi.hm.health.bodyfat.viewmodel.SettingOfScaleViewModel;
import com.xiaomi.hm.health.bodyfat.viewmodel.WeightMemberDetailViewModel;
import com.xiaomi.hm.health.bodyfat.webapi.Resource;
import com.xiaomi.hm.health.bodyfat.webapi.Status;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Typography;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B\u0007¢\u0006\u0004\bM\u0010NJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0002J&\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\"\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010 \u001a\u00020\u0005H\u0016R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010)\u001a\u00020\u000b8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001f\u00102\u001a\u0004\u0018\u00010-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001f\u00107\u001a\u0004\u0018\u0001038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106R\u001d\u0010<\u001a\u0002088B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u0010;R&\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010G\u001a\u00060DR\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010+R\u0016\u0010L\u001a\u00020J8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010K¨\u0006O"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/MemberDetailFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/xiaomi/hm/health/bodyfat/activity/WeightMemberDetailActivity$OnBackPressed;", "", "birth", "", "w", "", hl.k, "initView", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "l", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "y", "C", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "onBackPressed", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentWeightMemberDetailBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentWeightMemberDetailBinding;", "binding", "b", LogUtil.I, "getREQ_SET_GOAL_CODE", "()I", "REQ_SET_GOAL_CODE", "c", "Z", "isShowSyncUserTips", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/WeightMemberDetailViewModel;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "o", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/WeightMemberDetailViewModel;", "viewModel", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "e", GoogleApiAvailabilityLight.b, "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "settingOfScaleViewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "f", "m", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "g", "Ljava/util/ArrayList;", "keys", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "h", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "mUserInfo", "Lcom/xiaomi/hm/health/bodyfat/fragment/MemberDetailFragment$a;", "i", "Lcom/xiaomi/hm/health/bodyfat/fragment/MemberDetailFragment$a;", "mAdapter", z.j, "isBirthModify", "Lcom/xiaomi/hm/health/bodyfat/utils/BFCallback$OnPersonInfoDataChangeListener;", "Lcom/xiaomi/hm/health/bodyfat/utils/BFCallback$OnPersonInfoDataChangeListener;", "onDataChangeListener", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class MemberDetailFragment extends Fragment implements WeightMemberDetailActivity.OnBackPressed {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FragmentWeightMemberDetailBinding binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isShowSyncUserTips;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private UserInfos mUserInfo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isBirthModify;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int REQ_SET_GOAL_CODE = 20;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new e());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingOfScaleViewModel = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingDialog = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Integer> keys = l();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final a mAdapter = new a();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final BFCallback.OnPersonInfoDataChangeListener onDataChangeListener = new BFCallback.OnPersonInfoDataChangeListener() { // from class: qy4
        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.OnPersonInfoDataChangeListener
        public final void onChange() {
            MemberDetailFragment.x(this.a);
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.LOADING.ordinal()] = 1;
            iArr[Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0014"}, d2 = {"com/xiaomi/hm/health/bodyfat/fragment/MemberDetailFragment$a", "Landroid/widget/BaseAdapter;", "", "position", "Lcom/huami/lib/rainbow/ListTile;", "item", "", "a", "getCount", "", "getItem", "", "getItemId", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "<init>", "(Lcom/xiaomi/hm/health/bodyfat/fragment/MemberDetailFragment;)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public final class a extends BaseAdapter {
        public a() {
        }

        private final void a(int position, ListTile item) {
            Float targetWeight;
            Float targetWeight2;
            Integer height;
            String strStringPlus;
            if (position >= MemberDetailFragment.this.keys.size()) {
                return;
            }
            boolean z = false;
            item.setVisibility(0);
            item.setTitle(((Number) MemberDetailFragment.this.keys.get(position)).intValue());
            item.setEnabled(true);
            item.setTrailing(R.drawable.ic_arrow_forward_20_2x);
            Integer num = (Integer) MemberDetailFragment.this.keys.get(position);
            int i = R.string.bodyfat_family_info_key_nickname;
            if (num != null && num.intValue() == i) {
                UserInfos userInfos = MemberDetailFragment.this.mUserInfo;
                String name = userInfos != null ? userInfos.getName() : null;
                if (name == null) {
                    name = MemberDetailFragment.this.getString(R.string.bodyfat_user_add_new_list_enter);
                }
                item.setTips(name);
                return;
            }
            int i2 = R.string.person_info_key_gender;
            if (num != null && num.intValue() == i2) {
                UserInfos userInfos2 = MemberDetailFragment.this.mUserInfo;
                if (userInfos2 != null ? Intrinsics.areEqual((Object) userInfos2.getGender(), (Object) 1) : false) {
                    item.setTips(MemberDetailFragment.this.getString(R.string.person_info_set_gender_male));
                    return;
                } else {
                    item.setTips(MemberDetailFragment.this.getString(R.string.person_info_set_gender_female));
                    return;
                }
            }
            int i3 = R.string.person_info_key_birth;
            if (num != null && num.intValue() == i3) {
                UserInfos userInfos3 = MemberDetailFragment.this.mUserInfo;
                if (TextUtils.isEmpty(userInfos3 == null ? null : userInfos3.getBirthday())) {
                    item.setTips(MemberDetailFragment.this.getString(R.string.bodyfat_user_add_new_list_select));
                    return;
                }
                BFCallback.IBFCallBack bFCallback = BFCallback.getInstance();
                UserInfos userInfos4 = MemberDetailFragment.this.mUserInfo;
                String hMBirthday = bFCallback.getHMBirthday(userInfos4 != null ? userInfos4.getBirthday() : null);
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
                if (HMPersonInfo.getInstance().getMiliConfig().getUnit() == 0) {
                    MemberDetailFragment memberDetailFragment = MemberDetailFragment.this;
                    int i5 = R.string.person_info_key_height_unit_metric;
                    Object[] objArr = new Object[1];
                    StringBuilder sb = new StringBuilder();
                    UserInfos userInfos5 = MemberDetailFragment.this.mUserInfo;
                    sb.append(userInfos5 != null ? userInfos5.getHeight() : null);
                    sb.append("");
                    objArr[0] = sb.toString();
                    strStringPlus = memberDetailFragment.getString(i5, objArr);
                } else {
                    Utils utils = Utils.INSTANCE;
                    UserInfos userInfos6 = MemberDetailFragment.this.mUserInfo;
                    int iCm2inch = utils.cm2inch((userInfos6 == null || (height = userInfos6.getHeight()) == null) ? 0 : height.intValue());
                    int i6 = iCm2inch / 12;
                    int i7 = iCm2inch % 12;
                    strStringPlus = Intrinsics.stringPlus(MemberDetailFragment.this.getResources().getQuantityString(R.plurals.numberFoot, i6, Integer.valueOf(i6)), MemberDetailFragment.this.getResources().getQuantityString(R.plurals.numberInch, i7, Integer.valueOf(i7)));
                }
                item.setTips(strStringPlus);
                return;
            }
            int i8 = R.string.bodyfat_weight_goal;
            if (num != null && num.intValue() == i8) {
                UserInfos userInfos7 = MemberDetailFragment.this.mUserInfo;
                float fFloatValue = 0.0f;
                if (((userInfos7 == null || (targetWeight = userInfos7.getTargetWeight()) == null) ? 0.0f : targetWeight.floatValue()) <= 0.0f) {
                    item.setTips(MemberDetailFragment.this.getString(R.string.bodyfat_user_add_new_list_select));
                    return;
                }
                UserInfos userInfos8 = MemberDetailFragment.this.mUserInfo;
                if (userInfos8 != null && (targetWeight2 = userInfos8.getTargetWeight()) != null) {
                    fFloatValue = targetWeight2.floatValue();
                }
                float fConvertFromKg = HMWeightUtils.convertFromKg(fFloatValue, UnitManager.getInstance().getWeightUnit());
                String unitStr = HMWeightUtils.toUnitStr(MemberDetailFragment.this.getActivity(), UnitManager.getInstance().getWeightUnit());
                float fScaleFloat = HMWeightUtils.scaleFloat(fConvertFromKg, 1);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((int) fScaleFloat);
                sb2.append((Object) unitStr);
                item.setTips(sb2.toString());
                return;
            }
            int i9 = R.string.title_choose_body_measure_mode;
            if (num != null && num.intValue() == i9) {
                UserInfos userInfos9 = MemberDetailFragment.this.mUserInfo;
                if (userInfos9 != null && userInfos9.getMeasureMode() == 0) {
                    z = true;
                }
                item.setTips(z ? MemberDetailFragment.this.getString(R.string.text_normal_mode) : MemberDetailFragment.this.getString(R.string.text_sport_mode));
                return;
            }
            int i10 = R.string.title_choose_avatar_of_scale;
            if (num != null && num.intValue() == i10) {
                item.setTips((CharSequence) null);
                SettingOfScaleViewModel settingOfScaleViewModelN = MemberDetailFragment.this.n();
                if (settingOfScaleViewModelN == null) {
                    return;
                }
                UserInfos userInfos10 = MemberDetailFragment.this.mUserInfo;
                settingOfScaleViewModelN.loadScaleAvatar(item, userInfos10 != null ? Integer.valueOf(userInfos10.getAvatarIdOfScale()) : null);
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return MemberDetailFragment.this.keys.size();
        }

        @Override // android.widget.Adapter
        @NotNull
        public Object getItem(int position) {
            return MemberDetailFragment.this.keys.get(position);
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.Adapter
        @NotNull
        public View getView(int position, @Nullable View convertView, @NotNull ViewGroup parent) {
            if (convertView == null) {
                convertView = new ListTile(MemberDetailFragment.this.getActivity());
            }
            a(position, (ListTile) convertView);
            return convertView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.fragment.MemberDetailFragment$initView$4$1", f = "MemberDetailFragment.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MemberDetailFragment.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FragmentActivity activity = MemberDetailFragment.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
            return Unit.INSTANCE;
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
            LoadingDialog loadingDialog = new LoadingDialog(MemberDetailFragment.this.getActivity());
            loadingDialog.setMessage(MemberDetailFragment.this.getString(R.string.event_remind_deleting));
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
            FragmentActivity activity = MemberDetailFragment.this.getActivity();
            if (activity == null) {
                return null;
            }
            return (SettingOfScaleViewModel) ViewModelProviders.of(activity).get(SettingOfScaleViewModel.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/WeightMemberDetailViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<WeightMemberDetailViewModel> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WeightMemberDetailViewModel getA() {
            FragmentActivity activity = MemberDetailFragment.this.getActivity();
            if (activity == null) {
                return null;
            }
            return (WeightMemberDetailViewModel) ViewModelProviders.of(activity).get(WeightMemberDetailViewModel.class);
        }
    }

    private final void A() {
        if (!NetUtil.isNetworkConnected(getActivity())) {
            IconToast.showError(getActivity(), getString(R.string.no_network_connection));
            return;
        }
        AlertDialogFragment.Builder cancelable = new AlertDialogFragment.Builder(getActivity()).setCancelable(true);
        int i = R.string.bodyfat_del_family_member;
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append(Typography.leftDoubleQuote);
        UserInfos userInfos = this.mUserInfo;
        sb.append((Object) (userInfos == null ? null : userInfos.getName()));
        sb.append(Typography.rightDoubleQuote);
        objArr[0] = sb.toString();
        AlertDialogFragment.Builder positiveButton = cancelable.setMessage(getString(i, objArr)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: iy4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                MemberDetailFragment.B(this.a, dialogInterface, i2);
            }
        });
        FragmentActivity activity = getActivity();
        positiveButton.show(activity != null ? activity.getSupportFragmentManager() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(MemberDetailFragment memberDetailFragment, DialogInterface dialogInterface, int i) {
        Analytics.recordEvent(new CountEventBuilder("Chart_MembersDeleteNum"));
        WeightMemberDetailViewModel weightMemberDetailViewModelO = memberDetailFragment.o();
        if (weightMemberDetailViewModelO == null) {
            return;
        }
        weightMemberDetailViewModelO.deleteMember(memberDetailFragment.mUserInfo);
    }

    private final void C() {
        AlertDialogFragment.Builder cancelable = new AlertDialogFragment.Builder(getActivity()).setMessage(getString(R.string.tips_sync_user_to_scale)).setNeutralButton(getString(R.string.i_know), (DialogInterface.OnClickListener) null).setCancelable(false);
        FragmentActivity activity = getActivity();
        cancelable.show(activity != null ? activity.getSupportFragmentManager() : null);
    }

    private final void initView() {
        MutableLiveData<Resource<Boolean>> deleteMemberResult;
        MutableLiveData<UserInfos> userInfo;
        MutableLiveData<ChooseAvatarOfScaleDialog.AvatarInfo> chooseAvatarId;
        MutableLiveData<Integer> measureMode;
        SettingOfScaleViewModel settingOfScaleViewModelN = n();
        if (settingOfScaleViewModelN != null && (measureMode = settingOfScaleViewModelN.getMeasureMode()) != null) {
            measureMode.observe(getViewLifecycleOwner(), new Observer() { // from class: py4
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    MemberDetailFragment.r(this.a, (Integer) obj);
                }
            });
        }
        SettingOfScaleViewModel settingOfScaleViewModelN2 = n();
        if (settingOfScaleViewModelN2 != null && (chooseAvatarId = settingOfScaleViewModelN2.getChooseAvatarId()) != null) {
            chooseAvatarId.observe(getViewLifecycleOwner(), new Observer() { // from class: my4
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    MemberDetailFragment.s(this.a, (ChooseAvatarOfScaleDialog.AvatarInfo) obj);
                }
            });
        }
        WeightMemberDetailViewModel weightMemberDetailViewModelO = o();
        if (weightMemberDetailViewModelO != null && (userInfo = weightMemberDetailViewModelO.getUserInfo()) != null) {
            userInfo.observe(getViewLifecycleOwner(), new Observer() { // from class: oy4
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    MemberDetailFragment.t(this.a, (UserInfos) obj);
                }
            });
        }
        WeightMemberDetailViewModel weightMemberDetailViewModelO2 = o();
        if (weightMemberDetailViewModelO2 != null && (deleteMemberResult = weightMemberDetailViewModelO2.getDeleteMemberResult()) != null) {
            deleteMemberResult.observe(getViewLifecycleOwner(), new Observer() { // from class: ny4
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    MemberDetailFragment.v(this.a, (Resource) obj);
                }
            });
        }
        FragmentWeightMemberDetailBinding fragmentWeightMemberDetailBinding = this.binding;
        Objects.requireNonNull(fragmentWeightMemberDetailBinding);
        fragmentWeightMemberDetailBinding.personInfoList.setAdapter((ListAdapter) this.mAdapter);
        FragmentWeightMemberDetailBinding fragmentWeightMemberDetailBinding2 = this.binding;
        Objects.requireNonNull(fragmentWeightMemberDetailBinding2);
        fragmentWeightMemberDetailBinding2.personInfoList.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: ly4
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                MemberDetailFragment.p(this.a, adapterView, view, i, j);
            }
        });
        FragmentWeightMemberDetailBinding fragmentWeightMemberDetailBinding3 = this.binding;
        Objects.requireNonNull(fragmentWeightMemberDetailBinding3);
        fragmentWeightMemberDetailBinding3.delLl.setOnClickListener(new View.OnClickListener() { // from class: ky4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberDetailFragment.q(this.a, view);
            }
        });
    }

    private final void k() {
        if (!HMWeightUtils.isAmazfitScale() || HMWeightUtils.isAmazfitScaleConnect() || this.isShowSyncUserTips) {
            return;
        }
        this.isShowSyncUserTips = true;
        C();
    }

    private final ArrayList<Integer> l() {
        int i = R.string.title_choose_avatar_of_scale;
        int i2 = R.string.title_choose_body_measure_mode;
        ArrayList<Integer> arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(R.string.bodyfat_family_info_key_nickname), Integer.valueOf(R.string.person_info_key_gender), Integer.valueOf(i), Integer.valueOf(R.string.person_info_key_birth), Integer.valueOf(R.string.person_info_key_height), Integer.valueOf(R.string.bodyfat_weight_goal), Integer.valueOf(i2));
        if (BFCallback.getHMDeviceManager().getBoundDeviceSource(HMDeviceType.WEIGHT).getValue() != HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue()) {
            arrayListArrayListOf.remove(Integer.valueOf(i));
            arrayListArrayListOf.remove(Integer.valueOf(i2));
        }
        return arrayListArrayListOf;
    }

    private final LoadingDialog m() {
        return (LoadingDialog) this.loadingDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SettingOfScaleViewModel n() {
        return (SettingOfScaleViewModel) this.settingOfScaleViewModel.getValue();
    }

    private final WeightMemberDetailViewModel o() {
        return (WeightMemberDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(MemberDetailFragment memberDetailFragment, AdapterView adapterView, View view, int i, long j) {
        FragmentActivity activity;
        String userId;
        String userId2;
        String userId3;
        String userId4;
        String userId5;
        Integer num = memberDetailFragment.keys.get(i);
        int i2 = R.string.bodyfat_family_info_key_nickname;
        long j2 = 0;
        if (num != null && num.intValue() == i2) {
            BFCallback.IBFCallBack bFCallback = BFCallback.getInstance();
            FragmentActivity activity2 = memberDetailFragment.getActivity();
            BFCallback.PersonInfoEnum personInfoEnum = BFCallback.PersonInfoEnum.NICKNAME;
            BFCallback.OnPersonInfoDataChangeListener onPersonInfoDataChangeListener = memberDetailFragment.onDataChangeListener;
            UserInfos userInfos = memberDetailFragment.mUserInfo;
            if (userInfos != null && (userId5 = userInfos.getUserId()) != null) {
                j2 = Long.parseLong(userId5);
            }
            bFCallback.showPersonInfoEditFragment(activity2, personInfoEnum, onPersonInfoDataChangeListener, j2);
            return;
        }
        int i3 = R.string.person_info_key_gender;
        if (num != null && num.intValue() == i3) {
            BFCallback.IBFCallBack bFCallback2 = BFCallback.getInstance();
            FragmentActivity activity3 = memberDetailFragment.getActivity();
            BFCallback.PersonInfoEnum personInfoEnum2 = BFCallback.PersonInfoEnum.GENDER;
            BFCallback.OnPersonInfoDataChangeListener onPersonInfoDataChangeListener2 = memberDetailFragment.onDataChangeListener;
            UserInfos userInfos2 = memberDetailFragment.mUserInfo;
            if (userInfos2 != null && (userId4 = userInfos2.getUserId()) != null) {
                j2 = Long.parseLong(userId4);
            }
            bFCallback2.showPersonInfoEditFragment(activity3, personInfoEnum2, onPersonInfoDataChangeListener2, j2);
            return;
        }
        int i4 = R.string.person_info_key_birth;
        if (num != null && num.intValue() == i4) {
            BFCallback.IBFCallBack bFCallback3 = BFCallback.getInstance();
            FragmentActivity activity4 = memberDetailFragment.getActivity();
            BFCallback.PersonInfoEnum personInfoEnum3 = BFCallback.PersonInfoEnum.BIRTH;
            BFCallback.OnPersonInfoDataChangeListener onPersonInfoDataChangeListener3 = memberDetailFragment.onDataChangeListener;
            UserInfos userInfos3 = memberDetailFragment.mUserInfo;
            if (userInfos3 != null && (userId3 = userInfos3.getUserId()) != null) {
                j2 = Long.parseLong(userId3);
            }
            bFCallback3.showPersonInfoEditFragment(activity4, personInfoEnum3, onPersonInfoDataChangeListener3, j2);
            return;
        }
        int i5 = R.string.person_info_key_height;
        if (num != null && num.intValue() == i5) {
            BFCallback.IBFCallBack bFCallback4 = BFCallback.getInstance();
            FragmentActivity activity5 = memberDetailFragment.getActivity();
            BFCallback.PersonInfoEnum personInfoEnum4 = BFCallback.PersonInfoEnum.HEIGHT;
            BFCallback.OnPersonInfoDataChangeListener onPersonInfoDataChangeListener4 = memberDetailFragment.onDataChangeListener;
            UserInfos userInfos4 = memberDetailFragment.mUserInfo;
            if (userInfos4 != null && (userId2 = userInfos4.getUserId()) != null) {
                j2 = Long.parseLong(userId2);
            }
            bFCallback4.showPersonInfoEditFragment(activity5, personInfoEnum4, onPersonInfoDataChangeListener4, j2);
            return;
        }
        int i6 = R.string.bodyfat_weight_goal;
        if (num != null && num.intValue() == i6) {
            Intent intent = new Intent(memberDetailFragment.getActivity(), (Class<?>) WeightGoalsSetActivity.class);
            UserInfos userInfos5 = memberDetailFragment.mUserInfo;
            if (userInfos5 != null && (userId = userInfos5.getUserId()) != null) {
                j2 = Long.parseLong(userId);
            }
            intent.putExtra("UID", j2);
            memberDetailFragment.startActivityForResult(intent, memberDetailFragment.getREQ_SET_GOAL_CODE());
            return;
        }
        int i7 = R.string.title_choose_avatar_of_scale;
        if (num != null && num.intValue() == i7) {
            FragmentActivity activity6 = memberDetailFragment.getActivity();
            if (activity6 == null) {
                return;
            }
            new ChooseAvatarOfScaleDialog().show(activity6.getSupportFragmentManager());
            return;
        }
        int i8 = R.string.title_choose_body_measure_mode;
        if (num == null || num.intValue() != i8 || (activity = memberDetailFragment.getActivity()) == null) {
            return;
        }
        activity.getSupportFragmentManager().beginTransaction().setTransition(4097).addToBackStack(null).add(android.R.id.content, new ChooseTypeOfScaleFragment()).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(MemberDetailFragment memberDetailFragment, View view) {
        memberDetailFragment.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(MemberDetailFragment memberDetailFragment, Integer num) {
        UserInfos userInfos = memberDetailFragment.mUserInfo;
        if (userInfos != null) {
            userInfos.setMeasureMode(num.intValue());
        }
        WeightMemberDetailViewModel weightMemberDetailViewModelO = memberDetailFragment.o();
        if (weightMemberDetailViewModelO != null) {
            weightMemberDetailViewModelO.saveUserInfo(memberDetailFragment.mUserInfo);
        }
        memberDetailFragment.mAdapter.notifyDataSetChanged();
        memberDetailFragment.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(MemberDetailFragment memberDetailFragment, ChooseAvatarOfScaleDialog.AvatarInfo avatarInfo) {
        UserInfos userInfos = memberDetailFragment.mUserInfo;
        if (userInfos != null) {
            userInfos.setAvatarIdOfScale(avatarInfo.getValue());
        }
        memberDetailFragment.mAdapter.notifyDataSetChanged();
        WeightMemberDetailViewModel weightMemberDetailViewModelO = memberDetailFragment.o();
        if (weightMemberDetailViewModelO != null) {
            weightMemberDetailViewModelO.saveUserInfo(memberDetailFragment.mUserInfo);
        }
        memberDetailFragment.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final MemberDetailFragment memberDetailFragment, final UserInfos userInfos) {
        if (!memberDetailFragment.w(userInfos.getBirthday())) {
            memberDetailFragment.mUserInfo = userInfos;
            memberDetailFragment.mAdapter.notifyDataSetChanged();
            return;
        }
        FragmentActivity activity = memberDetailFragment.getActivity();
        if (activity == null) {
            return;
        }
        BFCallback.getAppUtils().showGrantWeightDataRequestDialog((AppCompatActivity) activity, userInfos.getUserId(), new WeightGrantRequestDialogLis() { // from class: ry4
            @Override // com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis
            public final void requestResult(boolean z) {
                MemberDetailFragment.u(this.a, userInfos, z);
            }
        });
        Unit unit = Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(MemberDetailFragment memberDetailFragment, UserInfos userInfos, boolean z) {
        MutableLiveData<UserInfos> userInfo;
        if (z) {
            memberDetailFragment.mUserInfo = userInfos;
            memberDetailFragment.isBirthModify = true;
            memberDetailFragment.mAdapter.notifyDataSetChanged();
        } else {
            WeightMemberDetailViewModel weightMemberDetailViewModelO = memberDetailFragment.o();
            UserInfos value = (weightMemberDetailViewModelO == null || (userInfo = weightMemberDetailViewModelO.getUserInfo()) == null) ? null : userInfo.getValue();
            if (value != null) {
                UserInfos userInfos2 = memberDetailFragment.mUserInfo;
                value.setBirthday(userInfos2 != null ? userInfos2.getBirthday() : null);
            }
            memberDetailFragment.isBirthModify = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(MemberDetailFragment memberDetailFragment, Resource resource) {
        String userId;
        int i = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        if (i == 1) {
            memberDetailFragment.m().show();
            return;
        }
        if (i != 2) {
            return;
        }
        memberDetailFragment.m().dismiss();
        EventBus eventBus = EventBus.getDefault();
        UserInfos userInfos = memberDetailFragment.mUserInfo;
        long j = 0;
        if (userInfos != null && (userId = userInfos.getUserId()) != null) {
            j = Long.parseLong(userId);
        }
        eventBus.post(new EventWeightChanged(j, 2));
        CustomToast.makeText(memberDetailFragment.getActivity(), R.string.event_remind_delete_success, 0).show();
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(memberDetailFragment), null, null, memberDetailFragment.new b(null), 3, null);
    }

    private final boolean w(String birth) {
        UserInfos userInfos = this.mUserInfo;
        return (userInfos == null || Intrinsics.areEqual(userInfos.getBirthday(), birth) || TextUtils.isEmpty(birth) || HMLoginManager.isAdult(Birthday.fromStr(birth).getAge())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(MemberDetailFragment memberDetailFragment) {
        memberDetailFragment.k();
    }

    private final void y() {
        AlertDialogFragment.Builder neutralButton = new AlertDialogFragment.Builder(getActivity()).setCancelable(false).setMessage(R.string.bodyfat_body_fat_desc).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: jy4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MemberDetailFragment.z(this.a, dialogInterface, i);
            }
        });
        FragmentActivity activity = getActivity();
        neutralButton.show(activity == null ? null : activity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(MemberDetailFragment memberDetailFragment, DialogInterface dialogInterface, int i) {
        FragmentActivity activity = memberDetailFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final int getREQ_SET_GOAL_CODE() {
        return this.REQ_SET_GOAL_CODE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        WeightMemberDetailViewModel weightMemberDetailViewModelO;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == this.REQ_SET_GOAL_CODE && resultCode == -1 && (weightMemberDetailViewModelO = o()) != null) {
            weightMemberDetailViewModelO.reloadUserInfoFromWeightGoal();
        }
    }

    @Override // com.xiaomi.hm.health.bodyfat.activity.WeightMemberDetailActivity.OnBackPressed
    public boolean onBackPressed() {
        if (!this.isBirthModify) {
            return false;
        }
        UserInfos userInfos = this.mUserInfo;
        int ageByDate = HMUserInfo.getAgeByDate(userInfos == null ? null : userInfos.getBirthday());
        if (ageByDate < 6 || ageByDate >= 18 || !BFCallback.getHMDeviceManager().hasBoundBfs()) {
            return false;
        }
        y();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentWeightMemberDetailBinding fragmentWeightMemberDetailBindingInflate = FragmentWeightMemberDetailBinding.inflate(inflater);
        this.binding = fragmentWeightMemberDetailBindingInflate;
        Objects.requireNonNull(fragmentWeightMemberDetailBindingInflate);
        return fragmentWeightMemberDetailBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }
}
