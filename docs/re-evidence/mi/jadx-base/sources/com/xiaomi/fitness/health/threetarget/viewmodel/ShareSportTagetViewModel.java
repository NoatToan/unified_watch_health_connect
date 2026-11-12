package com.xiaomi.fitness.health.threetarget.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fit.fitness.export.api.repository.IRainbowRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.bean.GoalMonthlyStatisticsData;
import com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.request.HealthHttpRequest;
import com.xiaomi.fitness.util.UrlConstants;
import defpackage.c0j;
import defpackage.fxi;
import defpackage.iji;
import defpackage.kfi;
import defpackage.kq2;
import defpackage.lpi;
import defpackage.o3r;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 P2\u00020\u0001:\u0001PB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#J\u0016\u0010$\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010%\u001a\u00020&J6\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020#2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 0*2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020 0*J\u0014\u0010.\u001a\u00020/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cJ\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000202H\u0002J$\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020/2\u0014\u00106\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0004\u0012\u00020 0*J\u001c\u00108\u001a\u00020 2\u0014\u00106\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0004\u0012\u00020 0*J,\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020 0*H\u0002J\u0016\u0010?\u001a\u00020>2\u0006\u0010:\u001a\u00020@2\u0006\u0010A\u001a\u00020>J\u0010\u0010B\u001a\u00020>2\u0006\u0010C\u001a\u00020>H\u0002J,\u0010D\u001a\u00020 2\u0006\u0010E\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010F\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020 0GJ6\u0010H\u001a\u00020 2\u0006\u0010E\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010F\u001a\u00020&2\b\b\u0002\u0010I\u001a\u00020J2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020 0GJ$\u0010K\u001a\u00020 2\u0006\u0010E\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020 0GJ \u0010L\u001a\u00020 2\u0006\u0010M\u001a\u00020-2\u0006\u0010N\u001a\u00020-2\b\b\u0002\u0010O\u001a\u00020-R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001c0\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016¨\u0006Q"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/viewmodel/ShareSportTagetViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "repoProvider", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "getRepoProvider", "()Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "setRepoProvider", "(Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;)V", "xiaomiCoreInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getXiaomiCoreInfo", "()Landroidx/lifecycle/MutableLiveData;", "setXiaomiCoreInfo", "(Landroidx/lifecycle/MutableLiveData;)V", "dayDataLiveData", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "getDayDataLiveData", "setDayDataLiveData", "monthLiveData", "", "getMonthLiveData", "setMonthLiveData", "loadAccountInfo", "", "fetchDayData", "selectDate", "Lorg/joda/time/LocalDate;", "fetchMonthData", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "loadMothStaticsDataFromNet", "currentLocalDate", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/data/bean/GoalMonthlyStatisticsData;", "fail", "", "reachCount", "", "list", "getNextStart", "", "sec", "loadDayBgImg", "position", "callback", "Landroid/graphics/drawable/Drawable;", "loadMothBgImg", "createBitmap", "context", "Landroid/app/Activity;", "view", "Landroid/view/View;", "Landroid/graphics/Bitmap;", "appendLogoQrcode", "Landroid/content/Context;", "contentBitamp", "getRoundedCornerBitmap", "bitmap", "saveSharePic", LifecycleConstantKt.TYPE_ACTIVITY, "lifecycleOwner", "Lkotlin/Function0;", "shareToWX", "isFriend", "", "shareMore", "ontrackClick", "shareType", "pageType", "pictureId", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShareSportTagetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareSportTagetViewModel.kt\ncom/xiaomi/fitness/health/threetarget/viewmodel/ShareSportTagetViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,295:1\n1863#2,2:296\n*S KotlinDebug\n*F\n+ 1 ShareSportTagetViewModel.kt\ncom/xiaomi/fitness/health/threetarget/viewmodel/ShareSportTagetViewModel\n*L\n131#1:296,2\n*E\n"})
public final class ShareSportTagetViewModel extends AbsViewModel {
    public UserInfoManager mUserInfoManager;
    public IRepositoryProvider repoProvider;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String sTypeDownload = "1";

    @NotNull
    private static final String sTypeWX = "2";

    @NotNull
    private static final String sTypeWXFriend = "3";

    @NotNull
    private static final String sTypeMore = "4";

    @NotNull
    private static final String sPageTypeDay = "1";

    @NotNull
    private static final String sPageTypeMonth = "2";

    @NotNull
    private MutableLiveData<AccountCoreInfo> xiaomiCoreInfo = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<DailyGoalReport> dayDataLiveData = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<List<DailyGoalReport>> monthLiveData = new MutableLiveData<>();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/viewmodel/ShareSportTagetViewModel$Companion;", "", "<init>", "()V", "sTypeDownload", "", "getSTypeDownload", "()Ljava/lang/String;", "sTypeWX", "getSTypeWX", "sTypeWXFriend", "getSTypeWXFriend", "sTypeMore", "getSTypeMore", "sPageTypeDay", "getSPageTypeDay", "sPageTypeMonth", "getSPageTypeMonth", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getSPageTypeDay() {
            return ShareSportTagetViewModel.sPageTypeDay;
        }

        @NotNull
        public final String getSPageTypeMonth() {
            return ShareSportTagetViewModel.sPageTypeMonth;
        }

        @NotNull
        public final String getSTypeDownload() {
            return ShareSportTagetViewModel.sTypeDownload;
        }

        @NotNull
        public final String getSTypeMore() {
            return ShareSportTagetViewModel.sTypeMore;
        }

        @NotNull
        public final String getSTypeWX() {
            return ShareSportTagetViewModel.sTypeWX;
        }

        @NotNull
        public final String getSTypeWXFriend() {
            return ShareSportTagetViewModel.sTypeWXFriend;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel$createBitmap$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel$createBitmap$1", f = "ShareSportTagetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $context;
        final /* synthetic */ Function1<Bitmap, Unit> $success;
        final /* synthetic */ View $view;
        int label;
        final /* synthetic */ ShareSportTagetViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel$createBitmap$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel$createBitmap$1$1", f = "ShareSportTagetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Bitmap $bitmap;
            final /* synthetic */ Function1<Bitmap, Unit> $success;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06241(Function1<? super Bitmap, Unit> function1, Bitmap bitmap, Continuation<? super C06241> continuation) {
                super(2, continuation);
                this.$success = function1;
                this.$bitmap = bitmap;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06241(this.$success, this.$bitmap, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$success.invoke2(this.$bitmap);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(View view, ShareSportTagetViewModel shareSportTagetViewModel, Activity activity, Function1<? super Bitmap, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$view = view;
            this.this$0 = shareSportTagetViewModel;
            this.$context = activity;
            this.$success = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$view, this.this$0, this.$context, this.$success, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AnyExtKt.main$default(null, new C06241(this.$success, this.this$0.appendLogoQrcode(this.$context, ShareUtil.loadBitmapFromView$default(this.$view, 0, 0, 6, null)), null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel$loadDayBgImg$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel$loadDayBgImg$1", f = "ShareSportTagetViewModel.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nShareSportTagetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareSportTagetViewModel.kt\ncom/xiaomi/fitness/health/threetarget/viewmodel/ShareSportTagetViewModel$loadDayBgImg$1\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,295:1\n24#2:296\n*S KotlinDebug\n*F\n+ 1 ShareSportTagetViewModel.kt\ncom/xiaomi/fitness/health/threetarget/viewmodel/ShareSportTagetViewModel$loadDayBgImg$1\n*L\n163#1:296\n*E\n"})
    public static final class C25571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Drawable, Unit> $callback;
        final /* synthetic */ int $position;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel$loadDayBgImg$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel$loadDayBgImg$1$1", f = "ShareSportTagetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Drawable, Unit> $callback;
            final /* synthetic */ Drawable $drawable;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06251(Function1<? super Drawable, Unit> function1, Drawable drawable, Continuation<? super C06251> continuation) {
                super(2, continuation);
                this.$callback = function1;
                this.$drawable = drawable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06251(this.$callback, this.$drawable, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$callback.invoke2(this.$drawable);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25571(int i, Function1<? super Drawable, Unit> function1, Continuation<? super C25571> continuation) {
            super(2, continuation);
            this.$position = i;
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25571(this.$position, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ImageRequest imageRequestBuild = new ImageRequest.Builder(ApplicationExtKt.getApplication()).data(UrlConstants.shareFdsUrl$default(UrlConstants.INSTANCE, this.$position, false, 2, null)).allowHardware(false).build();
                ImageLoader imageLoader = Coil.imageLoader(ApplicationExtKt.getApplication());
                this.label = 1;
                obj = imageLoader.execute(imageRequestBuild, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AnyExtKt.main$default(null, new C06251(this.$callback, ((ImageResult) obj).getDrawable(), null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel$loadMothBgImg$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel$loadMothBgImg$1", f = "ShareSportTagetViewModel.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nShareSportTagetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareSportTagetViewModel.kt\ncom/xiaomi/fitness/health/threetarget/viewmodel/ShareSportTagetViewModel$loadMothBgImg$1\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,295:1\n24#2:296\n*S KotlinDebug\n*F\n+ 1 ShareSportTagetViewModel.kt\ncom/xiaomi/fitness/health/threetarget/viewmodel/ShareSportTagetViewModel$loadMothBgImg$1\n*L\n176#1:296\n*E\n"})
    public static final class C25581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Drawable, Unit> $callback;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel$loadMothBgImg$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel$loadMothBgImg$1$1", f = "ShareSportTagetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Drawable, Unit> $callback;
            final /* synthetic */ Drawable $drawable;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06261(Function1<? super Drawable, Unit> function1, Drawable drawable, Continuation<? super C06261> continuation) {
                super(2, continuation);
                this.$callback = function1;
                this.$drawable = drawable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06261(this.$callback, this.$drawable, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$callback.invoke2(this.$drawable);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25581(Function1<? super Drawable, Unit> function1, Continuation<? super C25581> continuation) {
            super(2, continuation);
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25581(this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ImageRequest imageRequestBuild = new ImageRequest.Builder(ApplicationExtKt.getApplication()).data(UrlConstants.INSTANCE.shareMonthBgFdsUrl()).allowHardware(false).build();
                ImageLoader imageLoader = Coil.imageLoader(ApplicationExtKt.getApplication());
                this.label = 1;
                obj = imageLoader.execute(imageRequestBuild, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AnyExtKt.main$default(null, new C06261(this.$callback, ((ImageResult) obj).getDrawable(), null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void createBitmap(Activity context, View view, Function1<? super Bitmap, Unit> success) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(view, this, context, success, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchMonthData$lambda$1(ShareSportTagetViewModel this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.monthLiveData.postValue(list);
        return Unit.INSTANCE;
    }

    private final long getNextStart(long sec) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(sec * 1000);
        calendar.add(5, calendar.getActualMaximum(5));
        return calendar.getTimeInMillis() / 1000;
    }

    private final Bitmap getRoundedCornerBitmap(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float dp = ExtUtilsKt.getDp(16);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAccountInfo$lambda$0(ShareSportTagetViewModel this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.xiaomiCoreInfo.postValue(accountCoreInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadMothStaticsDataFromNet$lambda$2(WeakReference successWeakReference, GoalMonthlyStatisticsData it) {
        Intrinsics.checkNotNullParameter(successWeakReference, "$successWeakReference");
        Intrinsics.checkNotNullParameter(it, "it");
        Function1 function1 = (Function1) successWeakReference.get();
        if (function1 != null) {
            function1.invoke2(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadMothStaticsDataFromNet$lambda$3(WeakReference failWeakReference, String it) {
        Intrinsics.checkNotNullParameter(failWeakReference, "$failWeakReference");
        Intrinsics.checkNotNullParameter(it, "it");
        Function1 function1 = (Function1) failWeakReference.get();
        if (function1 != null) {
            function1.invoke2(it);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void ontrackClick$default(ShareSportTagetViewModel shareSportTagetViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "0";
        }
        shareSportTagetViewModel.ontrackClick(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveSharePic$lambda$5(Activity activity, LifecycleOwner lifecycleOwner, Function0 success, Bitmap it) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "$lifecycleOwner");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        ShareUtil.saveImageToGallery(activity, it, LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), false, false);
        success.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareMore$lambda$7(Function0 success, Activity activity, Bitmap it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke();
        ShareUtil.INSTANCE.shareBitmapViaMore(new WeakReference<>(activity), it);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void shareToWX$default(ShareSportTagetViewModel shareSportTagetViewModel, Activity activity, View view, LifecycleOwner lifecycleOwner, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        shareSportTagetViewModel.shareToWX(activity, view, lifecycleOwner, z, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareToWX$lambda$6(Function0 success, Activity activity, boolean z, Bitmap it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke();
        o3r.i().v(activity, it, activity.getString(c0j.f4794a), "", z ? o3r.k() : o3r.j());
        return Unit.INSTANCE;
    }

    @NotNull
    public final Bitmap appendLogoQrcode(@NotNull Context context, @NotNull Bitmap contentBitamp) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentBitamp, "contentBitamp");
        int dp = ExtUtilsKt.getDp(57);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(contentBitamp.getWidth(), contentBitamp.getHeight() + dp, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(ExtUtilsKt.getColor(iji.I3));
        canvas.drawBitmap(contentBitamp, 0.0f, 0.0f, (Paint) null);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), fxi.f18350a);
        float dp2 = ExtUtilsKt.getDp(25);
        Bitmap bitmapM = kq2.m(bitmapDecodeResource, dp2, dp2);
        int dp3 = ExtUtilsKt.getDp(Double.valueOf(16.7d));
        float f = dp / 2.0f;
        canvas.drawBitmap(bitmapM, dp3, (contentBitamp.getHeight() + f) - (bitmapM.getHeight() / 2.0f), (Paint) null);
        String string = context.getString(c0j.f4794a);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Paint paint = new Paint();
        paint.setColor(ExtUtilsKt.getColor(iji.f21228a));
        paint.setTypeface(DisplayUtil.getTypefaceAsResourceId(context, lpi.f25302a));
        paint.setTextSize(ExtUtilsKt.getDp(12));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = fontMetrics.bottom - fontMetrics.top;
        int height = bitmapM.getHeight() + dp3 + ExtUtilsKt.getDp(7);
        paint.getTextBounds(string, 0, string.length(), new Rect());
        canvas.drawText(string, height, ((contentBitamp.getHeight() + f) - (f2 / 2.0f)) + (f2 - fontMetrics.bottom), paint);
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(context.getResources(), fxi.f18350a);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource2, "decodeResource(...)");
        int dp4 = ExtUtilsKt.getDp(35);
        Bitmap bitmapC = kfi.c(com.xiaomi.fit.data.common.util.UrlConstants.INSTANCE.getQRCodeDownloadHtmlUrl(), dp4, -16777216, bitmapDecodeResource2);
        canvas.drawBitmap(bitmapC, (contentBitamp.getWidth() - dp4) - dp3, (contentBitamp.getHeight() + f) - (bitmapC.getHeight() / 2.0f), (Paint) null);
        return getRoundedCornerBitmap(bitmapCreateBitmap);
    }

    public final void fetchDayData(@NotNull LocalDate selectDate) {
        Intrinsics.checkNotNullParameter(selectDate, "selectDate");
        Logger.i(BaseFragment.TAG, "fetchDayData:" + selectDate);
        this.dayDataLiveData.postValue(getRepoProvider().getRainbowRepository().getDailyReportSync(TimeDateUtil.changZeroOfTheDay(selectDate)));
    }

    public final void fetchMonthData(@NotNull LocalDate selectDate, @NotNull LifecycleOwner viewLifecycleOwner) {
        Intrinsics.checkNotNullParameter(selectDate, "selectDate");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        IRainbowRepository rainbowRepository = getRepoProvider().getRainbowRepository();
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(TimeDateUtil.getFirstDayOfMonth(selectDate));
        rainbowRepository.getDailyReportList(jChangZeroOfTheDay, getNextStart(jChangZeroOfTheDay)).observe(viewLifecycleOwner, new ShareSportTagetViewModel$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: l9m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetViewModel.fetchMonthData$lambda$1(this.f24806a, (List) obj);
            }
        }));
    }

    @NotNull
    public final MutableLiveData<DailyGoalReport> getDayDataLiveData() {
        return this.dayDataLiveData;
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
    public final MutableLiveData<List<DailyGoalReport>> getMonthLiveData() {
        return this.monthLiveData;
    }

    @NotNull
    public final IRepositoryProvider getRepoProvider() {
        IRepositoryProvider iRepositoryProvider = this.repoProvider;
        if (iRepositoryProvider != null) {
            return iRepositoryProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("repoProvider");
        return null;
    }

    @NotNull
    public final MutableLiveData<AccountCoreInfo> getXiaomiCoreInfo() {
        return this.xiaomiCoreInfo;
    }

    public final void loadAccountInfo() {
        getMUserInfoManager().getAccountCoreInfo(false, new Function1() { // from class: o9m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetViewModel.loadAccountInfo$lambda$0(this.f28900a, (AccountCoreInfo) obj);
            }
        });
    }

    public final void loadDayBgImg(int position, @NotNull Function1<? super Drawable, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        AnyExtKt.io$default(null, new C25571(position, callback, null), 1, null);
    }

    public final void loadMothBgImg(@NotNull Function1<? super Drawable, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        AnyExtKt.io$default(null, new C25581(callback, null), 1, null);
    }

    public final void loadMothStaticsDataFromNet(@NotNull LocalDate currentLocalDate, @NotNull Function1<? super GoalMonthlyStatisticsData, Unit> success, @NotNull Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(currentLocalDate, "currentLocalDate");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(TimeDateUtil.getFirstDayOfMonth(currentLocalDate));
        final WeakReference weakReference = new WeakReference(success);
        final WeakReference weakReference2 = new WeakReference(fail);
        new HealthHttpRequest().shareMonthStatisticsData(jChangZeroOfTheDay, new Function1() { // from class: j9m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetViewModel.loadMothStaticsDataFromNet$lambda$2(weakReference, (GoalMonthlyStatisticsData) obj);
            }
        }, new Function1() { // from class: k9m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetViewModel.loadMothStaticsDataFromNet$lambda$3(weakReference2, (String) obj);
            }
        });
    }

    public final void ontrackClick(@NotNull String shareType, @NotNull String pageType, @NotNull String pictureId) {
        Intrinsics.checkNotNullParameter(shareType, "shareType");
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        Intrinsics.checkNotNullParameter(pictureId, "pictureId");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.48.1.1.31240"), "name", "activity_page_share", "btn_id", shareType, "page_fragment", pageType, "picture_id", pictureId);
    }

    public final int reachCount(@NotNull List<DailyGoalReport> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator<T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Iterator<GoalItem> it2 = ((DailyGoalReport) it.next()).goalList().iterator();
            do {
                if (!it2.hasNext()) {
                    i++;
                    break;
                }
            } while (it2.next().isReachGoal());
        }
        return i;
    }

    public final void saveSharePic(@NotNull final Activity activity, @NotNull View view, @NotNull final LifecycleOwner lifecycleOwner, @NotNull final Function0<Unit> success) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(success, "success");
        createBitmap(activity, view, new Function1() { // from class: m9m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetViewModel.saveSharePic$lambda$5(activity, lifecycleOwner, success, (Bitmap) obj);
            }
        });
    }

    public final void setDayDataLiveData(@NotNull MutableLiveData<DailyGoalReport> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.dayDataLiveData = mutableLiveData;
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    public final void setMonthLiveData(@NotNull MutableLiveData<List<DailyGoalReport>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.monthLiveData = mutableLiveData;
    }

    public final void setRepoProvider(@NotNull IRepositoryProvider iRepositoryProvider) {
        Intrinsics.checkNotNullParameter(iRepositoryProvider, "<set-?>");
        this.repoProvider = iRepositoryProvider;
    }

    public final void setXiaomiCoreInfo(@NotNull MutableLiveData<AccountCoreInfo> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.xiaomiCoreInfo = mutableLiveData;
    }

    public final void shareMore(@NotNull final Activity activity, @NotNull View view, @NotNull final Function0<Unit> success) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(success, "success");
        createBitmap(activity, view, new Function1() { // from class: i9m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetViewModel.shareMore$lambda$7(success, activity, (Bitmap) obj);
            }
        });
    }

    public final void shareToWX(@NotNull final Activity activity, @NotNull View view, @NotNull LifecycleOwner lifecycleOwner, final boolean isFriend, @NotNull final Function0<Unit> success) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(success, "success");
        createBitmap(activity, view, new Function1() { // from class: n9m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetViewModel.shareToWX$lambda$6(success, activity, isFriend, (Bitmap) obj);
            }
        });
    }
}
