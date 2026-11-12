package com.xiaomi.fitness.userinfo.information;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ObservableArrayList;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.item.LactateThresholdItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.account.user.UserInfoProfile;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelperExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.user.info.export.UserInformationManager;
import com.xiaomi.fitness.user.info.export.UserInformationManagerExtKt;
import com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack;
import com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository;
import com.xiaomi.fitness.userinfo.bean.UserIndicatorsInfo;
import com.xiaomi.fitness.userinfo.information.UserinfoSelectViewModel;
import com.xiaomi.fitness.userinfo.medicalid.util.BirthdateConverter;
import com.xiaomi.fitness.userinfo.medicalid.util.BloodTypeConverter;
import com.xiaomi.fitness.userinfo.utils.GuidePageUtil;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import defpackage.fyi;
import defpackage.hsi;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.sv1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001bB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u000106J\u0010\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u0016J\u000e\u0010I\u001a\u00020F2\u0006\u0010J\u001a\u00020\u001aJ\u0006\u0010K\u001a\u00020LJ\u0006\u0010M\u001a\u00020FJ\u0006\u0010N\u001a\u00020FJ\u0006\u0010O\u001a\u00020PJ*\u0010Q\u001a\u00020F2\u0006\u0010R\u001a\u0002002\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u001a2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010WJ8\u0010Q\u001a\u00020F2\u0006\u0010R\u001a\u0002002\u0006\u0010S\u001a\u00020T2\b\u0010V\u001a\u0004\u0018\u00010W2\u0006\u0010U\u001a\u00020\u001a2\u0006\u0010X\u001a\u00020\u001e2\u0006\u0010Y\u001a\u00020$J\u0016\u0010Z\u001a\u00020F2\u0006\u0010[\u001a\u00020?2\u0006\u0010\\\u001a\u00020\u001aJ\u0010\u0010]\u001a\u00020F2\u0006\u0010^\u001a\u00020_H\u0002J\u000e\u0010`\u001a\u00020F2\u0006\u0010a\u001a\u00020\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\r08¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\r08¢\u0006\b\n\u0000\u001a\u0004\b<\u0010:R%\u0010=\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010?\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020@0>¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR%\u0010C\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010?\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020@0>¢\u0006\b\n\u0000\u001a\u0004\bD\u0010B¨\u0006c"}, d2 = {"Lcom/xiaomi/fitness/userinfo/information/UserinfoSelectViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/userinfo/information/UserinfoSelectModel;", "<init>", "()V", "adapter", "Lcom/xiaomi/fitness/userinfo/information/UserIndicatorsSelectListAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/userinfo/information/UserIndicatorsSelectListAdapter;", "createAbilityPlanAdapter", "getCreateAbilityPlanAdapter", "userIndicatorsItems", "Landroidx/databinding/ObservableArrayList;", "Lcom/xiaomi/fitness/userinfo/bean/UserIndicatorsInfo;", "getUserIndicatorsItems", "()Landroidx/databinding/ObservableArrayList;", "createAbilityPlanItems", "getCreateAbilityPlanItems", "xiaomiCoreInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getXiaomiCoreInfo", "()Landroidx/lifecycle/MutableLiveData;", "setXiaomiCoreInfo", "(Landroidx/lifecycle/MutableLiveData;)V", "mChangeDatabaseUserProfile", "", "getMChangeDatabaseUserProfile", "setMChangeDatabaseUserProfile", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "mAccountRequest", "Lcom/xiaomi/fitness/account/api/AccountRequest;", "getMAccountRequest", "()Lcom/xiaomi/fitness/account/api/AccountRequest;", "setMAccountRequest", "(Lcom/xiaomi/fitness/account/api/AccountRequest;)V", "repo", "Lcom/xiaomi/fitness/user/info/export/medicalid/IMedicalIdRepository;", "getRepo", "()Lcom/xiaomi/fitness/user/info/export/medicalid/IMedicalIdRepository;", "setRepo", "(Lcom/xiaomi/fitness/user/info/export/medicalid/IMedicalIdRepository;)V", "from", "", "getFrom", "()I", "setFrom", "(I)V", "getFirstInitStatusLiveData", "Landroidx/lifecycle/LiveData;", "userIndicatorsItemBinding", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "getUserIndicatorsItemBinding", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "createAbilityPlanItemBinding", "getCreateAbilityPlanItemBinding", "viewHolderFactory", "Lkotlin/Function2;", "Landroid/view/View;", "Lcom/xiaomi/fitness/userinfo/information/AddUserIndicatorsViewHolder;", "getViewHolderFactory", "()Lkotlin/jvm/functions/Function2;", "createAbilityPlanHolderFactory", "getCreateAbilityPlanHolderFactory", "onCreate", "", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "updateIndicatorList", "cached", "getBirthdayRange", "", "getAccountCoreInfo", "getUserInfoFromWeb", "birthStringToMillis", "", "sendProfile", "type", "value", "", "isRecordHeartAuto", "sValue", "", "userInfoManager", "accountRequest", "updateSubtitleAndRemindText", "view", "isFirstInitStatus", "checkUserInfoFromWeb", "userProfile", "Lcom/xiaomi/fitness/account/user/UserInfoProfile;", "updateInfoStatus", "isSync", "StartFrom", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserinfoSelectViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserinfoSelectViewModel.kt\ncom/xiaomi/fitness/userinfo/information/UserinfoSelectViewModel\n+ 2 ItemBindingExt.kt\ncom/xiaomi/fitness/baseui/extension/ItemBindingExtKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,349:1\n27#2,5:350\n27#2,5:355\n37#3:360\n36#3,3:361\n*S KotlinDebug\n*F\n+ 1 UserinfoSelectViewModel.kt\ncom/xiaomi/fitness/userinfo/information/UserinfoSelectViewModel\n*L\n95#1:350,5\n99#1:355,5\n221#1:360\n221#1:361,3\n*E\n"})
public final class UserinfoSelectViewModel extends BaseViewModel<UserinfoSelectModel> {

    @NotNull
    private final Function2<View, Integer, AddUserIndicatorsViewHolder> createAbilityPlanHolderFactory;

    @NotNull
    private final ItemBinding<UserIndicatorsInfo> createAbilityPlanItemBinding;
    public AccountRequest mAccountRequest;
    public UserInfoManager mUserInfoManager;
    public IMedicalIdRepository repo;

    @NotNull
    private final ItemBinding<UserIndicatorsInfo> userIndicatorsItemBinding;

    @NotNull
    private final Function2<View, Integer, AddUserIndicatorsViewHolder> viewHolderFactory;

    @NotNull
    private final UserIndicatorsSelectListAdapter adapter = new UserIndicatorsSelectListAdapter();

    @NotNull
    private final UserIndicatorsSelectListAdapter createAbilityPlanAdapter = new UserIndicatorsSelectListAdapter();

    @NotNull
    private final ObservableArrayList<UserIndicatorsInfo> userIndicatorsItems = new ObservableArrayList<>();

    @NotNull
    private final ObservableArrayList<UserIndicatorsInfo> createAbilityPlanItems = new ObservableArrayList<>();

    @NotNull
    private MutableLiveData<AccountCoreInfo> xiaomiCoreInfo = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> mChangeDatabaseUserProfile = new MutableLiveData<>();
    private int from = 1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/userinfo/information/UserinfoSelectViewModel$StartFrom;", "", "Companion", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface StartFrom {
        public static final int AbilityPlan_CREATE = 2;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int SET = 1;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/userinfo/information/UserinfoSelectViewModel$StartFrom$Companion;", "", "<init>", "()V", "SET", "", "AbilityPlan_CREATE", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int AbilityPlan_CREATE = 2;
            public static final int SET = 1;

            private Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.userinfo.information.UserinfoSelectViewModel$getAccountCoreInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.userinfo.information.UserinfoSelectViewModel$getAccountCoreInfo$1", f = "UserinfoSelectViewModel.kt", i = {}, l = {SportReportBaseParser.ReportType.algorithmDataSource}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserinfoSelectViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoManager mUserInfoManager = UserinfoSelectViewModel.this.getMUserInfoManager();
                this.label = 1;
                obj = mUserInfoManager.getMiAccountCoreInfo(true, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AccountCoreInfo accountCoreInfo = (AccountCoreInfo) obj;
            Logger.d(UserinfoSelectViewModel.this.getTAG(), "getAccountCoreInfo is " + accountCoreInfo);
            UserinfoSelectViewModel.this.getXiaomiCoreInfo().postValue(accountCoreInfo);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.userinfo.information.UserinfoSelectViewModel$updateIndicatorList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.userinfo.information.UserinfoSelectViewModel$updateIndicatorList$1", f = "UserinfoSelectViewModel.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nUserinfoSelectViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserinfoSelectViewModel.kt\ncom/xiaomi/fitness/userinfo/information/UserinfoSelectViewModel$updateIndicatorList$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,349:1\n13402#2,2:350\n*S KotlinDebug\n*F\n+ 1 UserinfoSelectViewModel.kt\ncom/xiaomi/fitness/userinfo/information/UserinfoSelectViewModel$updateIndicatorList$1\n*L\n138#1:350,2\n*E\n"})
    public static final class C32991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $cached;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.userinfo.information.UserinfoSelectViewModel$updateIndicatorList$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.userinfo.information.UserinfoSelectViewModel$updateIndicatorList$1$2", f = "UserinfoSelectViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<UserIndicatorsInfo> $userIndicatorsInfoList;
            int label;
            final /* synthetic */ UserinfoSelectViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(UserinfoSelectViewModel userinfoSelectViewModel, List<UserIndicatorsInfo> list, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = userinfoSelectViewModel;
                this.$userIndicatorsInfoList = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$userIndicatorsInfoList, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.getUserIndicatorsItems().clear();
                this.this$0.getUserIndicatorsItems().addAll(this.$userIndicatorsInfoList);
                if (this.this$0.getFrom() == 2) {
                    this.this$0.getCreateAbilityPlanItems().clear();
                    this.this$0.getCreateAbilityPlanItems().addAll(this.$userIndicatorsInfoList);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32991(boolean z, Continuation<? super C32991> continuation) {
            super(2, continuation);
            this.$cached = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserinfoSelectViewModel.this.new C32991(this.$cached, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LactateThresholdItem lactateThresholdItem;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                String[] strArr = UserinfoSelectViewModel.this.getFrom() == 2 ? new String[]{ResourceExtKt.getString(o1j.t1), ResourceExtKt.getString(o1j.i0), ResourceExtKt.getString(o1j.E), ResourceExtKt.getString(o1j.L)} : new String[]{ResourceExtKt.getString(o1j.t1), ResourceExtKt.getString(o1j.i0), ResourceExtKt.getString(o1j.E), ResourceExtKt.getString(o1j.l1)};
                UserProfile userProfile = UserinfoSelectViewModel.this.getMUserInfoManager().getUserProfile(this.$cached);
                for (String str : strArr) {
                    arrayList.add(new UserIndicatorsInfo(str, UserInfoConfigUtil.INSTANCE.getUserInfoValue(str, userProfile, 2)));
                }
                if (UserinfoSelectViewModel.this.getFrom() != 2 && (lactateThresholdItem = (LactateThresholdItem) FitnessDataGetter.DefaultImpls.getRecentOneData$default(FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE), "lactate_threshold", 0L, null, 6, null)) != null) {
                    if (lactateThresholdItem.getHeartRate() != null) {
                        Resources resources = AppUtil.getApp().getResources();
                        int i2 = fyi.g;
                        Integer heartRate = lactateThresholdItem.getHeartRate();
                        Intrinsics.checkNotNull(heartRate);
                        int iIntValue = heartRate.intValue();
                        Object[] objArr = new Object[1];
                        Integer heartRate2 = lactateThresholdItem.getHeartRate();
                        objArr[0] = heartRate2 != null ? heartRate2.toString() : null;
                        String quantityString = resources.getQuantityString(i2, iIntValue, objArr);
                        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                        arrayList.add(new UserIndicatorsInfo(ResourceExtKt.getString(o1j.j0), quantityString));
                    }
                    if (lactateThresholdItem.getPace() != null) {
                        Integer pace = lactateThresholdItem.getPace();
                        Intrinsics.checkNotNull(pace);
                        String sportPaceStrWithSecDef = TimeDateUtil.getSportPaceStrWithSecDef(pace.intValue());
                        Resources resources2 = AppUtil.getApp().getResources();
                        int i3 = fyi.h;
                        Integer pace2 = lactateThresholdItem.getPace();
                        Intrinsics.checkNotNull(pace2);
                        String quantityString2 = resources2.getQuantityString(i3, pace2.intValue(), sportPaceStrWithSecDef);
                        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                        arrayList.add(new UserIndicatorsInfo(ResourceExtKt.getString(o1j.k0), quantityString2));
                    }
                }
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(UserinfoSelectViewModel.this, arrayList, null);
                this.label = 1;
                if (BuildersKt.withContext(main, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public UserinfoSelectViewModel() {
        final Function3 function3 = new Function3() { // from class: xkq
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return UserinfoSelectViewModel.userIndicatorsItemBinding$lambda$0((ItemBinding) obj, ((Integer) obj2).intValue(), (UserIndicatorsInfo) obj3);
            }
        };
        ItemBinding.Companion companion = ItemBinding.INSTANCE;
        ItemBinding itemBindingOf = companion.of(new OnItemBind<UserIndicatorsInfo>() { // from class: com.xiaomi.fitness.userinfo.information.UserinfoSelectViewModel$special$$inlined$itemBindingOf$1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<UserIndicatorsInfo> itemBinding, int position, UserIndicatorsInfo item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function3.invoke(itemBinding, Integer.valueOf(position), item);
            }
        });
        int i = sv1.c;
        this.userIndicatorsItemBinding = itemBindingOf.bindExtra(i, this);
        final Function3 function4 = new Function3() { // from class: zkq
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return UserinfoSelectViewModel.createAbilityPlanItemBinding$lambda$1((ItemBinding) obj, ((Integer) obj2).intValue(), (UserIndicatorsInfo) obj3);
            }
        };
        this.createAbilityPlanItemBinding = companion.of(new OnItemBind<UserIndicatorsInfo>() { // from class: com.xiaomi.fitness.userinfo.information.UserinfoSelectViewModel$special$$inlined$itemBindingOf$2
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<UserIndicatorsInfo> itemBinding, int position, UserIndicatorsInfo item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function4.invoke(itemBinding, Integer.valueOf(position), item);
            }
        }).bindExtra(i, this);
        this.viewHolderFactory = new Function2() { // from class: alq
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UserinfoSelectViewModel.viewHolderFactory$lambda$2((View) obj, ((Integer) obj2).intValue());
            }
        };
        this.createAbilityPlanHolderFactory = new Function2() { // from class: blq
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UserinfoSelectViewModel.createAbilityPlanHolderFactory$lambda$3((View) obj, ((Integer) obj2).intValue());
            }
        };
    }

    private final void checkUserInfoFromWeb(UserInfoProfile userProfile) {
        UserProfile userProfile2 = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(false);
        if (TextUtils.isEmpty(userProfile.getBirth())) {
            userProfile.setBirth(userProfile2.getBirth());
        }
        if (userProfile.getHeight() == 0.0f) {
            userProfile.setHeight(userProfile2.getHeight());
        }
        if (userProfile.getWeight() == 0.0f) {
            userProfile.setWeight(userProfile2.getWeight());
        }
        Logger.i(getTAG(), "UserInfoSelectViewModel userProfile.sex is " + userProfile.getSex());
        if (TextUtils.isEmpty(userProfile.getSex())) {
            userProfile.setSex(userProfile2.getSex());
        }
        if (userProfile.getDailySleepGoal() == 0) {
            userProfile.setDailySleepGoal(userProfile2.getDailySleepGoal());
        }
        Logger.d(getTAG(), "UserInfoSelectViewModel checkAndSendDefault getUserProfile userprofile after " + userProfile + ", database is " + userProfile2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddUserIndicatorsViewHolder createAbilityPlanHolderFactory$lambda$3(View view, int i) {
        if (i == nvi.E) {
            Intrinsics.checkNotNull(view);
            return new AddUserIndicatorsViewHolder(view);
        }
        Intrinsics.checkNotNull(view);
        return new AddUserIndicatorsViewHolder(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createAbilityPlanItemBinding$lambda$1(ItemBinding itemBinding, int i, UserIndicatorsInfo item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        itemBinding.set(sv1.f34013b, nvi.E);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserInfoFromWeb$lambda$4(UserinfoSelectViewModel this$0, UserInfoProfile it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "come userinfo second page getUserInfoFromWeb getUserProfile userinfo " + it);
        this$0.checkUserInfoFromWeb(it);
        if (!AccountManagerExtKt.toUserProfile$default(it, null, 1, null).equals(UserInfoManager.getUserProfile$default(this$0.getMUserInfoManager(), false, 1, null))) {
            Logger.i(this$0.getTAG(), "getUserInfoFromWeb getUserProfile userinfo save user info " + it);
            this$0.getMUserInfoManager().saveUserProfile(AccountManagerExtKt.toUserProfile$default(it, null, 1, null));
            this$0.mChangeDatabaseUserProfile.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserInfoFromWeb$lambda$5(UserinfoSelectViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "getUserInfoFromWeb getUserProfile error is " + it);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void sendProfile$default(UserinfoSelectViewModel userinfoSelectViewModel, int i, float f, boolean z, String str, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = null;
        }
        userinfoSelectViewModel.sendProfile(i, f, z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userIndicatorsItemBinding$lambda$0(ItemBinding itemBinding, int i, UserIndicatorsInfo item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        itemBinding.set(sv1.f34013b, nvi.E);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddUserIndicatorsViewHolder viewHolderFactory$lambda$2(View view, int i) {
        if (i == nvi.E) {
            Intrinsics.checkNotNull(view);
            return new AddUserIndicatorsViewHolder(view);
        }
        Intrinsics.checkNotNull(view);
        return new AddUserIndicatorsViewHolder(view);
    }

    public final long birthStringToMillis() {
        long dateInMonth;
        List<String> listSplit;
        String[] strArr = null;
        String birth = UserInfoManager.getUserProfile$default(getMUserInfoManager(), false, 1, null).getBirth();
        if (birth != null && (listSplit = new Regex("-").split(birth, 0)) != null) {
            strArr = (String[]) listSplit.toArray(new String[0]);
        }
        if (strArr != null) {
            dateInMonth = TimeUtils.INSTANCE.getDateInMonth(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
            Logger.d(getTAG(), "year " + strArr[0] + " -" + strArr[1] + " -" + strArr[2] + " time " + dateInMonth);
        } else {
            dateInMonth = 0;
        }
        if (dateInMonth != 0) {
            return dateInMonth;
        }
        return 631123200000L;
    }

    public final void getAccountCoreInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    @NotNull
    public final UserIndicatorsSelectListAdapter getAdapter() {
        return this.adapter;
    }

    @NotNull
    public final long[] getBirthdayRange() {
        return UserInformationManagerExtKt.getInstance(UserInformationManager.INSTANCE).getBirthdaySelectRange();
    }

    @NotNull
    public final UserIndicatorsSelectListAdapter getCreateAbilityPlanAdapter() {
        return this.createAbilityPlanAdapter;
    }

    @NotNull
    public final Function2<View, Integer, AddUserIndicatorsViewHolder> getCreateAbilityPlanHolderFactory() {
        return this.createAbilityPlanHolderFactory;
    }

    @NotNull
    public final ItemBinding<UserIndicatorsInfo> getCreateAbilityPlanItemBinding() {
        return this.createAbilityPlanItemBinding;
    }

    @NotNull
    public final ObservableArrayList<UserIndicatorsInfo> getCreateAbilityPlanItems() {
        return this.createAbilityPlanItems;
    }

    @Nullable
    public final LiveData<Boolean> getFirstInitStatusLiveData() {
        return getRepo().getBooleanLiveDataFromSP(MedicalIdSPContract.PREF_FIRST, true);
    }

    public final int getFrom() {
        return this.from;
    }

    @NotNull
    public final AccountRequest getMAccountRequest() {
        AccountRequest accountRequest = this.mAccountRequest;
        if (accountRequest != null) {
            return accountRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccountRequest");
        return null;
    }

    @NotNull
    public final MutableLiveData<Boolean> getMChangeDatabaseUserProfile() {
        return this.mChangeDatabaseUserProfile;
    }

    @NotNull
    public final UserInfoManager getMUserInfoManager() {
        UserInfoManager userInfoManager = this.mUserInfoManager;
        if (userInfoManager != null) {
            return userInfoManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserInfoManager");
        return null;
    }

    @NotNull
    public final IMedicalIdRepository getRepo() {
        IMedicalIdRepository iMedicalIdRepository = this.repo;
        if (iMedicalIdRepository != null) {
            return iMedicalIdRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("repo");
        return null;
    }

    @NotNull
    public final ItemBinding<UserIndicatorsInfo> getUserIndicatorsItemBinding() {
        return this.userIndicatorsItemBinding;
    }

    @NotNull
    public final ObservableArrayList<UserIndicatorsInfo> getUserIndicatorsItems() {
        return this.userIndicatorsItems;
    }

    public final void getUserInfoFromWeb() {
        getMAccountRequest().getUserProfile(ViewModelKt.getViewModelScope(this), new Function1() { // from class: tkq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserinfoSelectViewModel.getUserInfoFromWeb$lambda$4(this.f34801a, (UserInfoProfile) obj);
            }
        }, new Function1() { // from class: vkq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserinfoSelectViewModel.getUserInfoFromWeb$lambda$5(this.f36988a, (ApiException) obj);
            }
        });
    }

    @NotNull
    public final Function2<View, Integer, AddUserIndicatorsViewHolder> getViewHolderFactory() {
        return this.viewHolderFactory;
    }

    @NotNull
    public final MutableLiveData<AccountCoreInfo> getXiaomiCoreInfo() {
        return this.xiaomiCoreInfo;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        updateIndicatorList(false);
    }

    public final void sendProfile(int type, float value, boolean isRecordHeartAuto, @Nullable String sValue) {
        sendProfile(type, value, sValue, isRecordHeartAuto, getMUserInfoManager(), getMAccountRequest());
    }

    public final void setFrom(int i) {
        this.from = i;
    }

    public final void setMAccountRequest(@NotNull AccountRequest accountRequest) {
        Intrinsics.checkNotNullParameter(accountRequest, "<set-?>");
        this.mAccountRequest = accountRequest;
    }

    public final void setMChangeDatabaseUserProfile(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mChangeDatabaseUserProfile = mutableLiveData;
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    public final void setRepo(@NotNull IMedicalIdRepository iMedicalIdRepository) {
        Intrinsics.checkNotNullParameter(iMedicalIdRepository, "<set-?>");
        this.repo = iMedicalIdRepository;
    }

    public final void setXiaomiCoreInfo(@NotNull MutableLiveData<AccountCoreInfo> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.xiaomiCoreInfo = mutableLiveData;
    }

    public final void updateIndicatorList(boolean cached) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C32991(cached, null), 2, null);
    }

    public final void updateInfoStatus(boolean isSync) {
        ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).syncMainUserInfo(isSync);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0088  */
    public final void updateSubtitleAndRemindText(@NotNull View view, boolean isFirstInitStatus) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        UserProfile userProfile$default = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null);
        TextView textView = (TextView) view.findViewById(hsi.q1);
        int intFromSP = getRepo().getIntFromSP(MedicalIdSPContract.PREF_BLOOD_TYPE, 0);
        int age = userProfile$default.getAge();
        int ageFromMedicalIdSp = BirthdateConverter.INSTANCE.getAgeFromMedicalIdSp();
        String str2 = "";
        if (isFirstInitStatus) {
            str = "" + AppUtil.getApp().getResources().getString(o1j.o0);
        } else {
            if (ageFromMedicalIdSp > 0) {
                str2 = "" + age;
            }
            if (intFromSP != 0) {
                String strConvertBloodTypeToDisplayString = BloodTypeConverter.INSTANCE.convertBloodTypeToDisplayString(intFromSP);
                if (ageFromMedicalIdSp > 0) {
                    str = str2 + " | " + strConvertBloodTypeToDisplayString;
                } else {
                    str = str2;
                }
            } else {
                str = str2;
            }
        }
        textView.setText(str);
    }

    public final void sendProfile(final int type, float value, @Nullable String sValue, boolean isRecordHeartAuto, @NotNull UserInfoManager userInfoManager, @NotNull AccountRequest accountRequest) {
        Intrinsics.checkNotNullParameter(userInfoManager, "userInfoManager");
        Intrinsics.checkNotNullParameter(accountRequest, "accountRequest");
        UserInfoConfigUtil.INSTANCE.sendProfile(type, value, new SendProfileCallBack() { // from class: com.xiaomi.fitness.userinfo.information.UserinfoSelectViewModel.sendProfile.1
            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onProfileToDBSuccess(boolean result) {
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendError() {
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendSuccess(UserProfile profile) {
                UserProfile.RecordMaxHrm recordMaxHrm;
                UserinfoSelectViewModel.this.getMChangeDatabaseUserProfile().setValue(Boolean.TRUE);
                int i = type;
                GuidePageUtil guidePageUtil = GuidePageUtil.INSTANCE;
                if (i == guidePageUtil.getTYPE_BIRTHDAY()) {
                    if (!"auto".equals((profile == null || (recordMaxHrm = profile.getRecordMaxHrm()) == null) ? null : recordMaxHrm.getSource()) || profile == null) {
                        return;
                    }
                    UserinfoSelectViewModel.this.sendProfile(guidePageUtil.getTYPE_RECORD_MAX_HEART(), profile.computeAutoMaxHr(), true, profile.getBirth());
                }
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendError(int i) {
                SendProfileCallBack.DefaultImpls.onSendError(this, i);
            }
        }, userInfoManager, accountRequest, sValue, Boolean.valueOf(isRecordHeartAuto), ViewModelKt.getViewModelScope(this));
    }
}
