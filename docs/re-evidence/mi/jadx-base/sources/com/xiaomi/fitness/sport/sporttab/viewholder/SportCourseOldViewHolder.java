package com.xiaomi.fitness.sport.sporttab.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseModel;
import com.miui.circulate.device.api.Column;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ItemDecorationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil;
import com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel;
import com.xiaomi.fitness.sport.sporttab.recycler.HorizontalCardListItemDecoration;
import com.xiaomi.fitness.sport.sporttab.recycler.RecommendationCourseAdapter;
import com.xiaomi.fitness.sport.sporttab.viewholder.SportCourseOldViewHolder;
import com.xiaomi.fitness.sport.utils.AidongMotionSensingCourseUtilExtKt;
import com.xiaomi.fitness.sport.utils.ExtensionsKt;
import com.xiaomi.fitness.sport.utils.WebViewUtilKt;
import defpackage.c1j;
import defpackage.eoi;
import defpackage.xri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 72\u00020\u0001:\u00017B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b5\u00106J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001f\u0010\n\u001a\u00020\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0004J\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0004R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010!R\u0014\u0010'\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010!R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010!R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u0014\u00101\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010.R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/viewholder/SportCourseOldViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "showSportCourseCard", "()V", "showAidongEntranceCard", "refreshSportCourseCard", "", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "courseDataList", "refreshAdapterDataAndLayoutManager", "(Ljava/util/List;)V", "requestDataFromServer", "bindData", "refreshHolder", "Landroid/view/View;", "itemView", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "mViewModel", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "getMViewModel", "()Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "placeholder", "Landroid/widget/TextView;", "instructionBtn", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "bgImageDefault", "Landroid/widget/ImageView;", "bgImageLarge", Column.SUBTITLE, "sectionTitleTv", "Landroidx/recyclerview/widget/RecyclerView;", "courseCardRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "allRightArrowBtn", "Landroidx/constraintlayout/widget/ConstraintLayout;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "logoGroup", "aidongEntranceCard", "courseInlet", "Lcom/xiaomi/fitness/sport/sporttab/recycler/RecommendationCourseAdapter;", "recommendAdapter", "Lcom/xiaomi/fitness/sport/sporttab/recycler/RecommendationCourseAdapter;", "<init>", "(Landroid/view/View;Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;)V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportCourseOldViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportCourseOldViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/SportCourseOldViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,238:1\n54#2,3:239\n24#2:242\n59#2,6:243\n54#2,3:249\n24#2:252\n59#2,6:253\n*S KotlinDebug\n*F\n+ 1 SportCourseOldViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/SportCourseOldViewHolder\n*L\n135#1:239,3\n135#1:242\n135#1:243,6\n141#1:249,3\n141#1:252\n141#1:253,6\n*E\n"})
public final class SportCourseOldViewHolder extends RecyclerView.d0 {

    @NotNull
    public static final String TAG = "SportCourseViewHolder";

    @NotNull
    private final ConstraintLayout aidongEntranceCard;

    @NotNull
    private final TextView allRightArrowBtn;

    @NotNull
    private final ImageView bgImageDefault;

    @NotNull
    private final ImageView bgImageLarge;

    @NotNull
    private final ConstraintLayout container;

    @NotNull
    private final RecyclerView courseCardRecycler;

    @NotNull
    private final ConstraintLayout courseInlet;

    @NotNull
    private final FragmentActivity fragmentActivity;

    @NotNull
    private final TextView instructionBtn;

    @NotNull
    private final View itemView;

    @NotNull
    private final ConstraintLayout logoGroup;

    @NotNull
    private final SportTabV4ViewModel mViewModel;

    @NotNull
    private final View placeholder;

    @NotNull
    private RecommendationCourseAdapter recommendAdapter;

    @NotNull
    private final TextView sectionTitleTv;

    @NotNull
    private final TextView subtitle;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.sporttab.viewholder.SportCourseOldViewHolder$requestDataFromServer$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.sporttab.viewholder.SportCourseOldViewHolder$requestDataFromServer$1", f = "SportCourseOldViewHolder.kt", i = {}, l = {SportReportBaseParser.ReportType.maxFreq}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportCourseOldViewHolder.this.new AnonymousClass1(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x007f  */
        /* JADX WARN: Code duplicated, block: B:27:0x0088  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<CourseModel.CourseData> listEmptyList;
            Integer numBoxInt;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String courseScene = CourseApiKt.getCourseScene(CourseApiKt.COURSE_PAGE_TAB, CommonSportModelUtil.INSTANCE.getCourse30Tag(1, 2, 6, 3, 14, 7, 333));
                    if (AppUtil.INSTANCE.isPlayChannel()) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        CourseApi courseApi = CourseApiKt.getCourseApi();
                        this.label = 1;
                        obj = courseApi.getCourseRecommend(courseScene, 5, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    SportCourseOldViewHolder.this.getMViewModel().getCourseDataListOldLiveData().postValue(listEmptyList);
                    if (listEmptyList != null) {
                        numBoxInt = Boxing.boxInt(listEmptyList.size());
                    } else {
                        numBoxInt = null;
                    }
                    Logger.d("SportCourseViewHolder", "courseDataListOldLiveData size=" + numBoxInt + " value=" + listEmptyList);
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CourseModel.CourseListData courseListData = (CourseModel.CourseListData) obj;
                if (courseListData == null || (listEmptyList = courseListData.courseList) == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
            } catch (Exception e) {
                Logger.i("SportCourseViewHolder", "requestDataFromServer getCourseRecommend failed. error=" + e);
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            SportCourseOldViewHolder.this.getMViewModel().getCourseDataListOldLiveData().postValue(listEmptyList);
            if (listEmptyList != null) {
                numBoxInt = Boxing.boxInt(listEmptyList.size());
            } else {
                numBoxInt = null;
            }
            Logger.d("SportCourseViewHolder", "courseDataListOldLiveData size=" + numBoxInt + " value=" + listEmptyList);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportCourseOldViewHolder(@NotNull View itemView, @NotNull FragmentActivity fragmentActivity, @NotNull SportTabV4ViewModel mViewModel) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        this.itemView = itemView;
        this.fragmentActivity = fragmentActivity;
        this.mViewModel = mViewModel;
        View viewFindViewById = itemView.findViewById(xri.n4);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.placeholder = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(xri.H2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.instructionBtn = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(xri.F);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.bgImageDefault = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(xri.G);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.bgImageLarge = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(xri.X6);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.subtitle = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(xri.V5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.sectionTitleTv = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(xri.course_list_recycler);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.courseCardRecycler = (RecyclerView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(xri.l);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.allRightArrowBtn = (TextView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(xri.o0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.container = (ConstraintLayout) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(xri.o3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.logoGroup = (ConstraintLayout) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(xri.h);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.aidongEntranceCard = (ConstraintLayout) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(xri.w0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.courseInlet = (ConstraintLayout) viewFindViewById12;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.recommendAdapter = new RecommendationCourseAdapter(context);
    }

    private final void refreshAdapterDataAndLayoutManager(List<? extends CourseModel.CourseData> courseDataList) {
        int i;
        Logger.d("SportCourseViewHolder", "refreshAdapterDataAndLayoutManager courseDataList size=" + (courseDataList != null ? courseDataList.size() : 0));
        List<? extends CourseModel.CourseData> list = courseDataList;
        if (list == null || list.isEmpty()) {
            return;
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        uIUtils.getScreenState();
        if (uIUtils.isTabletAndLandscape(ApplicationExtKt.getApplication())) {
            i = 5;
        } else {
            i = uIUtils.isFoldableExpandOrPadPortrait() ? 3 : 2;
        }
        this.courseCardRecycler.setLayoutManager(new GridLayoutManager(this.itemView.getContext(), i, 1, false));
        ItemDecorationExtKt.clearAllItemDecorations(this.courseCardRecycler);
        this.courseCardRecycler.addItemDecoration(new HorizontalCardListItemDecoration(i, ExtensionsKt.getDp(0), ExtensionsKt.getDp(12)));
        ArrayList arrayList = new ArrayList();
        int iMin = Math.min(i, courseDataList.size());
        if (iMin > 0) {
            arrayList.addAll(courseDataList.subList(0, iMin));
        }
        this.recommendAdapter.bindData(arrayList);
    }

    private final void refreshSportCourseCard() {
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            ViewExtKt.gone(this.container);
        } else {
            ViewExtKt.visible(this.container);
            showSportCourseCard();
        }
    }

    private final void requestDataFromServer() {
        AccountManager.Companion companion = AccountManager.INSTANCE;
        Logger.w("SportCourseViewHolder", "login:" + AccountManagerExtKt.getInstance(companion).isLogin() + "," + NetworkUtils.isNetworkConnected(this.itemView.getContext()));
        if (AccountManagerExtKt.getInstance(companion).isLogin() && NetworkUtils.isNetworkConnected(this.itemView.getContext())) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.fragmentActivity), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
        } else {
            ViewExtKt.gone(this.courseCardRecycler);
        }
    }

    private final void showAidongEntranceCard() {
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            ViewExtKt.gone(this.container);
            return;
        }
        ViewExtKt.visible(this.container);
        if (AppUtil.INSTANCE.isPlayChannel()) {
            ViewExtKt.gone(this.instructionBtn);
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        boolean z = uIUtils.isTabletAndLandscape(ApplicationExtKt.getApplication()) || uIUtils.isFoldableExpandOrPadPortrait();
        Logger.d("SportCourseViewHolder", "showAidongEntranceCard isLargeState=" + z);
        if (z) {
            ViewExtKt.gone(this.bgImageDefault);
            ViewExtKt.visible(this.bgImageLarge);
            ImageView imageView = this.bgImageLarge;
            Integer numValueOf = Integer.valueOf(eoi.O0);
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(numValueOf).target(imageView);
            builderTarget.transformations(new RoundedCornersTransformation(ExtensionsKt.getDp(16)));
            imageLoader.enqueue(builderTarget.build());
        } else {
            ViewExtKt.visible(this.bgImageDefault);
            ViewExtKt.gone(this.bgImageLarge);
            ImageView imageView2 = this.bgImageDefault;
            Integer numValueOf2 = Integer.valueOf(eoi.N0);
            ImageLoader imageLoader2 = Coil.imageLoader(imageView2.getContext());
            ImageRequest.Builder builderTarget2 = new ImageRequest.Builder(imageView2.getContext()).data(numValueOf2).target(imageView2);
            builderTarget2.transformations(new RoundedCornersTransformation(ExtensionsKt.getDp(16)));
            imageLoader2.enqueue(builderTarget2.build());
        }
        this.aidongEntranceCard.post(new Runnable() { // from class: vcn
            @Override // java.lang.Runnable
            public final void run() {
                SportCourseOldViewHolder.showAidongEntranceCard$lambda$6(this.f36752a);
            }
        });
        ViewExtKt.clickWithTrigger$default(this.aidongEntranceCard, 0L, new Function1() { // from class: wcn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportCourseOldViewHolder.showAidongEntranceCard$lambda$7(this.f37852a, (ConstraintLayout) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAidongEntranceCard$lambda$6(SportCourseOldViewHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bottom = this$0.subtitle.getBottom();
        int top = this$0.logoGroup.getTop();
        Logger.d("SportCourseViewHolder", "showAidongEntranceCard subtitleBottom=" + bottom + " logoTop=" + top);
        if (bottom > top) {
            ViewExtKt.invisible(this$0.subtitle);
        } else {
            ViewExtKt.visible(this$0.subtitle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAidongEntranceCard$lambda$7(SportCourseOldViewHolder this$0, ConstraintLayout it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AidongMotionSensingCourseUtilExtKt.doAllNecessaryCheckAndGoToAidongSdkIfNeed$default(null, this$0.fragmentActivity, null, 5, null);
        return Unit.INSTANCE;
    }

    private final void showSportCourseCard() {
        this.sectionTitleTv.setText(ResourceExtKt.getString(c1j.x));
        ViewExtKt.clickWithTrigger$default(this.instructionBtn, 0L, new Function1() { // from class: rcn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportCourseOldViewHolder.showSportCourseCard$lambda$0((TextView) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(this.itemView.getRootView(), 0L, new Function1() { // from class: scn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportCourseOldViewHolder.showSportCourseCard$lambda$1((View) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(this.allRightArrowBtn, 0L, new Function1() { // from class: tcn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportCourseOldViewHolder.showSportCourseCard$lambda$2((TextView) obj);
            }
        }, 1, null);
        this.courseCardRecycler.setAdapter(this.recommendAdapter);
        this.mViewModel.getCourseDataListOldLiveData().observe(this.fragmentActivity, new SportCourseOldViewHolder$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ucn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportCourseOldViewHolder.showSportCourseCard$lambda$3(this.f35626a, (List) obj);
            }
        }));
        requestDataFromServer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSportCourseCard$lambda$0(TextView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WebViewUtilKt.startWebView$default(AidongMotionSensingCourseUtilExtKt.getAidongEntranceNoticeSupportListUrl(), null, false, false, 14, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSportCourseCard$lambda$1(View view) {
        CourseApi.DefaultImpls.goCourseCatalog$default(CourseApiKt.getCourseApi(), null, null, null, null, false, 31, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSportCourseCard$lambda$2(TextView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CourseApi.DefaultImpls.goCourseCatalog$default(CourseApiKt.getCourseApi(), null, null, null, null, false, 31, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSportCourseCard$lambda$3(SportCourseOldViewHolder this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        if (!list.isEmpty()) {
            ViewExtKt.visible(this$0.courseCardRecycler);
            this$0.refreshAdapterDataAndLayoutManager(list);
        } else {
            ViewExtKt.gone(this$0.courseCardRecycler);
        }
        return Unit.INSTANCE;
    }

    public final void bindData() {
        refreshHolder();
        Logger.d("SportCourseViewHolder", "old bindData");
    }

    @NotNull
    public final FragmentActivity getFragmentActivity() {
        return this.fragmentActivity;
    }

    @NotNull
    public final View getItemView() {
        return this.itemView;
    }

    @NotNull
    public final SportTabV4ViewModel getMViewModel() {
        return this.mViewModel;
    }

    public final void refreshHolder() {
        boolean z = !AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE));
        ViewExtKt.setVisible(this.container, true);
        ViewExtKt.setVisible(this.placeholder, !z);
        ViewExtKt.setVisible(this.courseInlet, z);
        Logger.d("SportCourseViewHolder", "old showCard:" + z);
        if (z) {
            refreshSportCourseCard();
        } else {
            ViewExtKt.gone(this.courseCardRecycler);
        }
        showAidongEntranceCard();
    }
}
