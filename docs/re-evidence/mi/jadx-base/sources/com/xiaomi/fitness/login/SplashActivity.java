package com.xiaomi.fitness.login;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.core.splashscreen.SplashScreen;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.BannerRequestParamV2;
import com.fitness.banner.export.IBanner;
import com.fitness.banner.export.compare.ICompare;
import com.fitness.banner.export.compare.ICompareKt;
import com.fitness.banner.export.v2.BannerItemDetail;
import com.fitness.banner.export.v2.BannerItemV2;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.config.preference.ChooseAppPreference;
import com.xiaomi.fitness.login.SplashActivity;
import com.xiaomi.fitness.login.banner.SplashBannerActivity;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.login.export.PrivacyEasyModePreference;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.login.mode.GuidePersonalizeActivity;
import com.xiaomi.fitness.login.preference.IntentStartActivityPreference;
import com.xiaomi.fitness.login.preference.ModePreference;
import com.xiaomi.fitness.login.preference.RegionSelectPreference;
import com.xiaomi.fitness.login.privacy.PrivacyActivity;
import com.xiaomi.fitness.login.region.RegionSelectActivity;
import com.xiaomi.fitness.login.welcome.WelcomeActivity;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.wearos.export.FastPairManager;
import com.xiaomi.fitness.wearos.export.WearOsExtKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0014J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\u000e\u0010\u0010\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/login/SplashActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "mKeepOnScreen", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onConfigurationChanged", StandardComponentEvent.KEY_NEW_CONFIG, "Landroid/content/res/Configuration;", "setOrientation", LifecycleConstantKt.ON_START, "startNextActivity", "jumpSplashBannerIfNeed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onNewIntent", "intent", "Landroid/content/Intent;", "handleStartActivityIntentFromOtherApp", "Companion", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSplashActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashActivity.kt\ncom/xiaomi/fitness/login/SplashActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,208:1\n1485#2:209\n1510#2,3:210\n1513#2,3:220\n1246#2,4:225\n381#3,7:213\n462#3:223\n412#3:224\n*S KotlinDebug\n*F\n+ 1 SplashActivity.kt\ncom/xiaomi/fitness/login/SplashActivity\n*L\n165#1:209\n165#1:210,3\n165#1:220,3\n166#1:225,4\n165#1:213,7\n166#1:223\n166#1:224\n*E\n"})
public final class SplashActivity extends FragmentActivity {

    @NotNull
    private static final String ACTION_CHOOSE_APP = "choose_app";

    @NotNull
    private static final String ACTION_CHOOSE_APP_TIME = "choose_app_time";

    @NotNull
    private static final String TAG = "SplashActivity";
    private boolean mKeepOnScreen = true;

    /* JADX INFO: renamed from: com.xiaomi.fitness.login.SplashActivity$handleStartActivityIntentFromOtherApp$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.login.SplashActivity$handleStartActivityIntentFromOtherApp$1", f = "SplashActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Intent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Intent intent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$intent = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$intent, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Bundle bundleExtra;
            Bundle bundleExtra2;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Intent intent = this.$intent;
            boolean z = false;
            MainExtKt.setShowLoginDialog((intent == null || (bundleExtra2 = intent.getBundleExtra("flag")) == null) ? false : bundleExtra2.getBoolean("showLoginDialog", false));
            Intent intent2 = this.$intent;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("flag")) != null) {
                z = bundleExtra.getBoolean("bindNew", false);
            }
            MainExtKt.setBindNew(z);
            if (!ConfigPreference.INSTANCE.getIS_APP_CHOSEN_OPEN() || !AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() || AppUtil.INSTANCE.isPlayChannel()) {
                return Unit.INSTANCE;
            }
            Intent intent3 = this.$intent;
            if (intent3 != null) {
                int intExtra = intent3.getIntExtra(SplashActivity.ACTION_CHOOSE_APP, -1);
                long longExtra = this.$intent.getLongExtra(SplashActivity.ACTION_CHOOSE_APP_TIME, 0L);
                Logger.i(SplashActivity.TAG, "commonApp is " + intExtra + " commonAPPTime is " + longExtra);
                if (intExtra != -1 && longExtra != 0) {
                    ChooseAppPreference chooseAppPreference = ChooseAppPreference.INSTANCE;
                    chooseAppPreference.setChooseApp(intExtra);
                    chooseAppPreference.setChooseAppLastTime(longExtra);
                    IntentStartActivityPreference.INSTANCE.setIntentStartApp(true);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.login.SplashActivity$jumpSplashBannerIfNeed$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.login.SplashActivity", f = "SplashActivity.kt", i = {0}, l = {157}, m = "jumpSplashBannerIfNeed", n = {"this"}, s = {"L$0"})
    public static final class C25831 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C25831(Continuation<? super C25831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SplashActivity.this.jumpSplashBannerIfNeed(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.login.SplashActivity$startNextActivity$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.login.SplashActivity$startNextActivity$1", f = "SplashActivity.kt", i = {0, 0, 0, 0}, l = {103}, m = "invokeSuspend", n = {"welcomeFinish", "privacyAgree", "privacyEasyMode", "noRegion"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class C25841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.login.SplashActivity$startNextActivity$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.login.SplashActivity$startNextActivity$1$1", f = "SplashActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.BooleanRef $noRegion;
            final /* synthetic */ Ref.BooleanRef $privacyAgree;
            final /* synthetic */ Ref.BooleanRef $privacyEasyMode;
            final /* synthetic */ Ref.BooleanRef $welcomeFinish;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06401(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Ref.BooleanRef booleanRef3, Ref.BooleanRef booleanRef4, Continuation<? super C06401> continuation) {
                super(2, continuation);
                this.$welcomeFinish = booleanRef;
                this.$privacyAgree = booleanRef2;
                this.$privacyEasyMode = booleanRef3;
                this.$noRegion = booleanRef4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06401(this.$welcomeFinish, this.$privacyAgree, this.$privacyEasyMode, this.$noRegion, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$welcomeFinish.element = ModePreference.INSTANCE.getWelcomeFinish();
                this.$privacyAgree.element = RegionPreference.INSTANCE.getPRIVACY_AGREE();
                this.$privacyEasyMode.element = PrivacyEasyModePreference.INSTANCE.isEasyMode();
                this.$noRegion.element = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().length() == 0;
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C25841(Continuation<? super C25841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SplashActivity.this.new C25841(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0133  */
        /* JADX WARN: Code duplicated, block: B:35:0x0139  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.BooleanRef booleanRef;
            Ref.BooleanRef booleanRef2;
            Ref.BooleanRef booleanRef3;
            Ref.BooleanRef booleanRef4;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.BooleanRef booleanRef5 = new Ref.BooleanRef();
                Ref.BooleanRef booleanRef6 = new Ref.BooleanRef();
                Ref.BooleanRef booleanRef7 = new Ref.BooleanRef();
                Ref.BooleanRef booleanRef8 = new Ref.BooleanRef();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06401 c06401 = new C06401(booleanRef5, booleanRef6, booleanRef7, booleanRef8, null);
                this.L$0 = booleanRef5;
                this.L$1 = booleanRef6;
                this.L$2 = booleanRef7;
                this.L$3 = booleanRef8;
                this.label = 1;
                if (BuildersKt.withContext(io2, c06401, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef5;
                booleanRef2 = booleanRef6;
                booleanRef3 = booleanRef7;
                booleanRef4 = booleanRef8;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef4 = (Ref.BooleanRef) this.L$3;
                booleanRef3 = (Ref.BooleanRef) this.L$2;
                booleanRef2 = (Ref.BooleanRef) this.L$1;
                booleanRef = (Ref.BooleanRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Logger.i(SplashActivity.TAG, "privacyAgree " + booleanRef2.element + "; noRegion " + booleanRef4.element + "; welcomeFinish " + booleanRef.element + ";easyMode " + booleanRef3.element);
            if (!booleanRef.element) {
                SplashActivity splashActivity = SplashActivity.this;
                Intent intent = new Intent(SplashActivity.this, (Class<?>) WelcomeActivity.class);
                intent.addFlags(603979776);
                splashActivity.startActivity(intent);
            } else if (!booleanRef2.element && !booleanRef3.element) {
                SplashActivity splashActivity2 = SplashActivity.this;
                Intent intent2 = new Intent(SplashActivity.this, (Class<?>) PrivacyActivity.class);
                intent2.addFlags(603979776);
                splashActivity2.startActivity(intent2);
            } else if (booleanRef3.element) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_SPORT());
                MainExtKt.showMainActivity(SplashActivity.this, null, bundle);
            } else if (booleanRef4.element) {
                SplashActivity splashActivity3 = SplashActivity.this;
                Intent intent3 = new Intent(SplashActivity.this, (Class<?>) RegionSelectActivity.class);
                intent3.addFlags(603979776);
                splashActivity3.startActivity(intent3);
            } else if (AppUtil.INSTANCE.isPlayChannel() || ICompareKt.getINSTANCE(ICompare.INSTANCE).showAppV4Enable()) {
                if (MainExtKt.getBindNew()) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
                    MainExtKt.showMainActivity$default(SplashActivity.this, null, bundle2, 2, null);
                }
                MainExtKt.showMainActivity$default(SplashActivity.this, null, null, 6, null);
            } else {
                CheckerUserSettingManager.Companion companion = CheckerUserSettingManager.INSTANCE;
                if (CheckerUserSettingManagerExtKt.getInstance(companion).getSelectMode() == companion.getUNKOWN_MODE()) {
                    SplashActivity splashActivity4 = SplashActivity.this;
                    Intent intent4 = new Intent(SplashActivity.this, (Class<?>) GuidePersonalizeActivity.class);
                    intent4.addFlags(603979776);
                    splashActivity4.startActivity(intent4);
                } else {
                    if (MainExtKt.getBindNew()) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
                        MainExtKt.showMainActivity$default(SplashActivity.this, null, bundle3, 2, null);
                    }
                    MainExtKt.showMainActivity$default(SplashActivity.this, null, null, 6, null);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void handleStartActivityIntentFromOtherApp(Intent intent) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new AnonymousClass1(intent, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object jumpSplashBannerIfNeed(Continuation<? super Unit> continuation) {
        C25831 c25831;
        SplashActivity splashActivity;
        if (continuation instanceof C25831) {
            c25831 = (C25831) continuation;
            int i = c25831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c25831.label = i - Integer.MIN_VALUE;
            } else {
                c25831 = new C25831(continuation);
            }
        } else {
            c25831 = new C25831(continuation);
        }
        Object bannerListV2 = c25831.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c25831.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(bannerListV2);
            Logger.i(TAG, "requestSplashBannerLiveData start.. ");
            IBanner instance = BannerExtKt.getINSTANCE(IBanner.INSTANCE);
            List listListOf = CollectionsKt__CollectionsJVMKt.listOf(Boxing.boxInt(15));
            String lowerCase = RegionSelectPreference.INSTANCE.getLocalCountry().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            BannerRequestParamV2 bannerRequestParamV2 = new BannerRequestParamV2(listListOf, lowerCase, null, Boxing.boxInt(1));
            c25831.L$0 = this;
            c25831.label = 1;
            bannerListV2 = instance.getBannerListV2(bannerRequestParamV2, c25831);
            if (bannerListV2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            splashActivity = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            splashActivity = (SplashActivity) c25831.L$0;
            ResultKt.throwOnFailure(bannerListV2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : (List) bannerListV2) {
            Integer numBoxInt = Boxing.boxInt(((BannerItemV2) obj).getResourceId());
            Object arrayList = linkedHashMap.get(numBoxInt);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numBoxInt, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List<BannerItemDetail> bannerInfoList = ((BannerItemV2) CollectionsKt___CollectionsKt.first((List) entry.getValue())).getBannerInfoList();
            if (bannerInfoList == null) {
                bannerInfoList = CollectionsKt__CollectionsKt.emptyList();
            }
            linkedHashMap2.put(key, bannerInfoList);
        }
        List list = (List) linkedHashMap2.get(Boxing.boxInt(15));
        List list2 = list;
        BannerItemDetail bannerItemDetail = (list2 == null || list2.isEmpty()) ? null : (BannerItemDetail) CollectionsKt___CollectionsKt.first(list);
        Logger.i(TAG, "requestSplashBannerLiveData result " + list);
        if (bannerItemDetail != null) {
            Intent intent = new Intent(splashActivity, (Class<?>) SplashBannerActivity.class);
            intent.putExtra("banner", bannerItemDetail);
            intent.addFlags(603979776);
            splashActivity.startActivity(intent);
        } else {
            MainExtKt.showMainActivity$default(splashActivity, null, null, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$0(SplashActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "setKeepOnScreenCondition: mKeepOnScreen=" + this$0.mKeepOnScreen);
        return this$0.mKeepOnScreen;
    }

    private final void setOrientation() {
        setRequestedOrientation(UIUtils.INSTANCE.isTabletOrLandscape(this) ? -1 : 1);
    }

    private final void startNextActivity() {
        ScopeExtKt.scopeLife$default(this, (Lifecycle.Event) null, (CoroutineDispatcher) null, new C25841(null), 3, (Object) null).m503catch(new Function2() { // from class: h6n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SplashActivity.startNextActivity$lambda$1((AndroidScope) obj, (Throwable) obj2);
            }
        }).m505finally(new Function2() { // from class: i6n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SplashActivity.startNextActivity$lambda$2(this.f20838a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startNextActivity$lambda$1(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "start next activity exception, e=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startNextActivity$lambda$2(SplashActivity this$0, AndroidScope androidScope, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$finally");
        Logger.i(TAG, "startNextActivity: finally");
        this$0.mKeepOnScreen = false;
        this$0.finish();
        this$0.overridePendingTransition(0, 0);
        return Unit.INSTANCE;
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        setOrientation();
        super.onConfigurationChanged(newConfig);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        SplashScreen splashScreenInstallSplashScreen = SplashScreen.INSTANCE.installSplashScreen(this);
        super.onCreate(savedInstanceState);
        Logger.i(TAG, "onCreate..");
        splashScreenInstallSplashScreen.setKeepOnScreenCondition(new SplashScreen.KeepOnScreenCondition() { // from class: j6n
            @Override // androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition
            public final boolean shouldKeepOnScreen() {
                return SplashActivity.onCreate$lambda$0(this.f22467a);
            }
        });
        handleStartActivityIntentFromOtherApp(getIntent());
        FastPairManager wearOsExtKt = WearOsExtKt.getInstance(FastPairManager.INSTANCE);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        wearOsExtKt.saveFastPairingExtra(intent);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Logger.i(TAG, "checkCommonApplication SplashActivity onNewIntent come");
        handleStartActivityIntentFromOtherApp(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        startNextActivity();
    }
}
