package com.xiaomi.hm.health.bodyfat.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import androidx.view.result.ActivityResultCaller;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.WeightMemberDetailActivity;
import com.xiaomi.hm.health.bodyfat.databinding.ActivityWeightMemberDetailBinding;
import com.xiaomi.hm.health.bodyfat.event.EventUserInfoUpdate;
import com.xiaomi.hm.health.bodyfat.fragment.AddMemberFragment;
import com.xiaomi.hm.health.bodyfat.fragment.ChooseUserFragment;
import com.xiaomi.hm.health.bodyfat.fragment.IAddMember;
import com.xiaomi.hm.health.bodyfat.fragment.MemberDetailFragment;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.viewmodel.WeightMemberDetailViewModel;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import de.greenrobot.event.EventBus;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b.\u0010/J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\u000b\u001a\u00020\u0003H\u0014J\"\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010(\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010-\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/WeightMemberDetailActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/xiaomi/hm/health/bodyfat/fragment/IAddMember;", "", "initView", "", GoogleApiAvailabilityLight.b, SOAP.XMLNS, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/xiaomi/hm/health/bodyfat/event/EventUserInfoUpdate;", "event", "onEvent", "onLeftClicked", "onBackPressed", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "getAddMemberInfo", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityWeightMemberDetailBinding;", "x", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityWeightMemberDetailBinding;", "binding", "y", "Ljava/lang/String;", "mTAG", "z", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "mUserInfo", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlin/Lazy;", "r", "()Z", "isAddUser", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/WeightMemberDetailViewModel;", "B", "o", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/WeightMemberDetailViewModel;", "viewModel", "<init>", "()V", "OnBackPressed", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightMemberDetailActivity extends BaseTitleActivity implements IAddMember {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private ActivityWeightMemberDetailBinding binding;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private UserInfos mUserInfo;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final String mTAG = "WeightMemberDetail";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy isAddUser = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new f());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/WeightMemberDetailActivity$OnBackPressed;", "", "", "onBackPressed", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public interface OnBackPressed {
        boolean onBackPressed();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ WeightAdvData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WeightAdvData weightAdvData) {
            super(0);
            this.a = weightAdvData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("receive weight adv data ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Boolean> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean getA() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return WeightMemberDetailActivity.this.getIntent().getBooleanExtra(BFConstant.KET_ADD_NEW, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, String str) {
            super(0);
            this.a = i;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onActivityResult requst_code =" + this.a + " , " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("REQ_TAKE_PHOTO iconPath = ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onActivityResult requst_code =" + this.a + " task photo post evnetbus";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/WeightMemberDetailViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<WeightMemberDetailViewModel> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WeightMemberDetailViewModel getA() {
            return (WeightMemberDetailViewModel) ViewModelProviders.of(WeightMemberDetailActivity.this).get(WeightMemberDetailViewModel.class);
        }
    }

    private final void initView() {
        setTitleText(r() ? R.string.bodyfat_member_detail_title_add : R.string.bodyfat_member_detail_title);
        ActivityWeightMemberDetailBinding activityWeightMemberDetailBinding = this.binding;
        Objects.requireNonNull(activityWeightMemberDetailBinding);
        activityWeightMemberDetailBinding.personInfoAvatarRl.setOnClickListener(new View.OnClickListener() { // from class: dt8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeightMemberDetailActivity.p(this.a, view);
            }
        });
        o().getUserInfo().observe(this, new Observer() { // from class: et8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeightMemberDetailActivity.q(this.a, (UserInfos) obj);
            }
        });
        o().getUserInfo(r(), getIntent().getLongExtra("uid", 0L));
        if (!r()) {
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new MemberDetailFragment()).commit();
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra(BFConstant.KET_ADD_NEW_BABY, false);
        boolean booleanExtra2 = getIntent().getBooleanExtra(BFConstant.KET_ADD_NEW_FROM_ONE_FOOT, false);
        String stringExtra = getIntent().getStringExtra(WeightAdvData.WEIGHTADVDATA_KEY);
        ChooseUserFragment.WeightData weightData = null;
        int i = booleanExtra ? 17 : 16;
        if (booleanExtra2) {
            i = 18;
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            WeightAdvData weightAdvDataFromJsonString = WeightAdvData.fromJsonString(stringExtra);
            HMLog.debug(this.mTAG, new a(weightAdvDataFromJsonString));
            if (weightAdvDataFromJsonString != null) {
                weightData = new ChooseUserFragment.WeightData(weightAdvDataFromJsonString.getValueKg(), weightAdvDataFromJsonString.getTimestamp(), weightAdvDataFromJsonString.getImpedance(), weightAdvDataFromJsonString.getValue(), 0, false, 48, null);
            }
        } else if (getIntent().hasExtra(BFConstant.KET_ADD_NEW_DATA)) {
            weightData = (ChooseUserFragment.WeightData) getIntent().getParcelableExtra(BFConstant.KET_ADD_NEW_DATA);
        }
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, AddMemberFragment.INSTANCE.newInstance(i, weightData)).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) BFCallback.getAppUtils().getStoragePath(getApplicationContext()));
        sb.append("/family_icon_");
        UserInfos userInfos = this.mUserInfo;
        sb.append((Object) (userInfos == null ? null : userInfos.getUserId()));
        sb.append('_');
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        return sb.toString();
    }

    private final WeightMemberDetailViewModel o() {
        return (WeightMemberDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(WeightMemberDetailActivity weightMemberDetailActivity, View view) {
        BFCallback.getInstance().showSelectImageFragment(weightMemberDetailActivity.getSupportFragmentManager(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(WeightMemberDetailActivity weightMemberDetailActivity, UserInfos userInfos) {
        weightMemberDetailActivity.mUserInfo = userInfos;
        weightMemberDetailActivity.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r() {
        return ((Boolean) this.isAddUser.getValue()).booleanValue();
    }

    private final void s() {
        UserInfos userInfos = this.mUserInfo;
        String avatarPath = userInfos == null ? null : userInfos.getAvatarPath();
        UserInfos userInfos2 = this.mUserInfo;
        String avatarUrl = userInfos2 == null ? null : userInfos2.getAvatarUrl();
        UserInfos userInfos3 = this.mUserInfo;
        String name = userInfos3 != null ? userInfos3.getName() : null;
        int intExtra = getIntent().getIntExtra("icon_color", ContextCompat.getColor(this, R.color.avatar_color_default));
        BFCallback.IBFCallBack bFCallback = BFCallback.getInstance();
        ActivityWeightMemberDetailBinding activityWeightMemberDetailBinding = this.binding;
        Objects.requireNonNull(activityWeightMemberDetailBinding);
        bFCallback.updateAvatarUI(activityWeightMemberDetailBinding.personInfoAvatar, avatarPath, avatarUrl, name, Integer.valueOf(intExtra));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.bodyfat.fragment.IAddMember
    @Nullable
    /* JADX INFO: renamed from: getAddMemberInfo, reason: from getter */
    public UserInfos getMUserInfo() {
        return this.mUserInfo;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Bitmap bitmap;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == BFCallback.getInstance().getCropImageSelectImgReqCode() && data != null) {
            String stringExtra = data.getStringExtra(BFCallback.getInstance().getCropFilePath());
            if (stringExtra == null) {
                stringExtra = "";
            }
            HMLog.debug(this.mTAG, new c(requestCode, stringExtra));
            HMImageLoader.with((FragmentActivity) this).load(Uri.fromFile(new File(stringExtra))).asBitmap().into(new HMLoadTarget<Bitmap>() { // from class: com.xiaomi.hm.health.bodyfat.activity.WeightMemberDetailActivity.onActivityResult.2

                /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.activity.WeightMemberDetailActivity$onActivityResult$2$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ String a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(String str) {
                        super(0);
                        this.a = str;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return Intrinsics.stringPlus("REQ_SELECT_CROP_IMAGE realIconPath = ", this.a);
                    }
                }

                @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
                public void onLoadFinish(@Nullable Bitmap resource) {
                    if (resource != null) {
                        try {
                            String strN = WeightMemberDetailActivity.this.n();
                            HMLog.debug(WeightMemberDetailActivity.this.mTAG, new a(strN));
                            FileOutputStream fileOutputStream = new FileOutputStream(strN);
                            resource.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                            fileOutputStream.close();
                            UserInfos userInfos = WeightMemberDetailActivity.this.mUserInfo;
                            if (userInfos != null) {
                                userInfos.setAvatarPath(strN);
                            }
                            UserInfos userInfos2 = WeightMemberDetailActivity.this.mUserInfo;
                            if (userInfos2 != null) {
                                userInfos2.setAvatarUrl(null);
                            }
                            ActivityWeightMemberDetailBinding activityWeightMemberDetailBinding = WeightMemberDetailActivity.this.binding;
                            if (activityWeightMemberDetailBinding == null) {
                                throw null;
                            }
                            activityWeightMemberDetailBinding.personInfoAvatar.setImageBitmap(resource);
                            if (WeightMemberDetailActivity.this.r()) {
                                return;
                            }
                            WeightMemberDetailActivity weightMemberDetailActivity = WeightMemberDetailActivity.this;
                            weightMemberDetailActivity.onEvent(new EventUserInfoUpdate(weightMemberDetailActivity.mUserInfo));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            });
            return;
        }
        if (requestCode != BFCallback.getInstance().getCropImageTakePhotoReqCode() || data == null || data.getExtras() == null || (bitmap = (Bitmap) data.getExtras().get("data")) == null) {
            return;
        }
        try {
            String strN = n();
            HMLog.debug(this.mTAG, new d(strN));
            FileOutputStream fileOutputStream = new FileOutputStream(strN);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            UserInfos userInfos = this.mUserInfo;
            if (userInfos != null) {
                userInfos.setAvatarPath(strN);
            }
            UserInfos userInfos2 = this.mUserInfo;
            if (userInfos2 != null) {
                userInfos2.setAvatarUrl(null);
            }
            if (!r()) {
                onEvent(new EventUserInfoUpdate(this.mUserInfo));
            }
            ActivityWeightMemberDetailBinding activityWeightMemberDetailBinding = this.binding;
            if (activityWeightMemberDetailBinding == null) {
                throw null;
            }
            activityWeightMemberDetailBinding.personInfoAvatar.setImageBitmap(bitmap);
            HMLog.debug(this.mTAG, new e(requestCode));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ActivityResultCaller activityResultCallerFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        if ((activityResultCallerFindFragmentById instanceof OnBackPressed) && ((OnBackPressed) activityResultCallerFindFragmentById).onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(savedInstanceState);
        ActivityWeightMemberDetailBinding activityWeightMemberDetailBindingInflate = ActivityWeightMemberDetailBinding.inflate(getLayoutInflater());
        this.binding = activityWeightMemberDetailBindingInflate;
        Objects.requireNonNull(activityWeightMemberDetailBindingInflate);
        setContentView(activityWeightMemberDetailBindingInflate.getRoot());
        BFTitleStyleKt.setTransparentTitleStyle$default(this, null, null, 3, null);
        EventBus.getDefault().register(this);
        initView();
        Analytics.recordEvent(new CountEventBuilder("Chart_MembersDetailViewNum"));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public final void onEvent(@NotNull EventUserInfoUpdate event) {
        o().updateUserInfo(event);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        onBackPressed();
    }
}
