package com.xiaomi.fitness.sport.sporttab.viewholder;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import coil.transform.RoundedCornersTransformation;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.TrackContentBean;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseSeriesData;
import com.mi.health.course.export.data.CourseSeriesRecommend;
import com.miui.circulate.device.api.Column;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fit.fitness.di.FitnessDataSingleModuleKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ItemDecorationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.AppVersionUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel;
import com.xiaomi.fitness.sport.sporttab.recycler.SerialCourseAdapter;
import com.xiaomi.fitness.sport.sporttab.viewholder.SportCourseViewHolder;
import com.xiaomi.fitness.sport.utils.AidongMotionSensingCourseUtilExtKt;
import com.xiaomi.fitness.sport.utils.ExtensionsKt;
import com.xiaomi.fitness.sport.utils.WebViewUtilKt;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import defpackage.c1j;
import defpackage.eoi;
import defpackage.xri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 A2\u00020\u0001:\u0001AB\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b?\u0010@J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u001f\u0010\u000e\u001a\u00020\u00022\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0004R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010%R\u0014\u0010+\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010%R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010%R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00104\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00102R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/viewholder/SportCourseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "showSportGameCard", "()V", "goCourseCatalog", "showSportCourseCard", "showAidongEntranceCard", "scheduleLayoutCheck", "checkViewsPosition", "refreshSportCourseCard", "", "Lcom/mi/health/course/export/data/CourseSeriesData;", "courseDataList", "refreshAdapterDataAndLayoutManager", "(Ljava/util/List;)V", "requestDataFromServer", "bindData", "refreshHolder", "Landroid/view/View;", "itemView", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "mViewModel", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "getMViewModel", "()Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "placeholder", "Landroid/widget/TextView;", "instructionBtn", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "bgImageDefault", "Landroid/widget/ImageView;", "bgImageLarge", Column.SUBTITLE, "sectionTitleTv", "Landroidx/recyclerview/widget/RecyclerView;", "courseCardRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "allRightArrowBtn", "Landroidx/constraintlayout/widget/ConstraintLayout;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "logoGroup", "aidongEntranceCard", "courseInlet", "Lcom/xiaomi/fitness/sport/sporttab/recycler/SerialCourseAdapter;", "recommendAdapter", "Lcom/xiaomi/fitness/sport/sporttab/recycler/SerialCourseAdapter;", "", "courseSeriesNum", "I", "", "courseIdListStr", "Ljava/lang/String;", "<init>", "(Landroid/view/View;Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;)V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportCourseViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportCourseViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/SportCourseViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,298:1\n54#2,3:299\n24#2:302\n59#2,4:303\n63#2,2:318\n54#2,3:320\n24#2:323\n59#2,4:324\n63#2,2:339\n489#3,11:307\n489#3,11:328\n*S KotlinDebug\n*F\n+ 1 SportCourseViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/SportCourseViewHolder\n*L\n156#1:299,3\n156#1:302\n156#1:303,4\n156#1:318,2\n165#1:320,3\n165#1:323\n165#1:324,4\n165#1:339,2\n158#1:307,11\n167#1:328,11\n*E\n"})
public final class SportCourseViewHolder extends RecyclerView.d0 {

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
    private String courseIdListStr;

    @NotNull
    private final ConstraintLayout courseInlet;
    private int courseSeriesNum;

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
    private SerialCourseAdapter recommendAdapter;

    @NotNull
    private final TextView sectionTitleTv;

    @NotNull
    private final TextView subtitle;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.sporttab.viewholder.SportCourseViewHolder$requestDataFromServer$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.sporttab.viewholder.SportCourseViewHolder$requestDataFromServer$1", f = "SportCourseViewHolder.kt", i = {}, l = {264}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportCourseViewHolder.this.new AnonymousClass1(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:42:0x0154  */
        /* JADX WARN: Code duplicated, block: B:43:0x015d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<CourseSeriesData> listEmptyList;
            int size;
            WearableDeviceModel wearableDeviceModel;
            Integer numBoxInt;
            String model;
            String model2;
            Object courseSeriesRecommend;
            ArrayList<CourseSeriesData> album;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            String str = "";
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (AppUtil.INSTANCE.isPlayChannel()) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        linkedHashMap.put("country", lowerCase);
                        linkedHashMap.put("version", AppVersionUtil.INSTANCE.getAppVersionName());
                        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                        if (wearableDeviceModel2 == null || (model2 = DeviceModelExtKt.getModel(wearableDeviceModel2)) == null) {
                            model2 = "";
                        }
                        linkedHashMap.put("device_model", model2);
                        CourseApi courseApi = CourseApiKt.getCourseApi();
                        String json = FitnessDataSingleModuleKt.getGson().toJson(linkedHashMap);
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        this.label = 1;
                        courseSeriesRecommend = courseApi.getCourseSeriesRecommend(json, this);
                        if (courseSeriesRecommend == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    SportCourseViewHolder.this.getMViewModel().getCourseDataListLiveData().postValue(listEmptyList);
                    SportCourseViewHolder.this.courseIdListStr = "";
                    SportCourseViewHolder sportCourseViewHolder = SportCourseViewHolder.this;
                    if (listEmptyList != null) {
                        size = listEmptyList.size();
                    } else {
                        size = 0;
                    }
                    sportCourseViewHolder.courseSeriesNum = size;
                    Pair[] pairArr = new Pair[4];
                    pairArr[0] = TuplesKt.to("name", "ad_lesson_expose");
                    pairArr[1] = TuplesKt.to("tip", "56.108.0.1.40462");
                    wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                    if (wearableDeviceModel != null && (model = DeviceModelExtKt.getModel(wearableDeviceModel)) != null) {
                        str = model;
                    }
                    pairArr[2] = TuplesKt.to("device_model", str);
                    pairArr[3] = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, Boxing.boxInt(SportCourseViewHolder.this.courseSeriesNum));
                    SportCourseViewHolder.this.sectionTitleTv.setTag(new TrackContentBean("sportTabCourse", false, "expose_v3", MapsKt__MapsKt.mapOf(pairArr), 0.0f, 16, null));
                    if (listEmptyList != null) {
                        numBoxInt = Boxing.boxInt(listEmptyList.size());
                    } else {
                        numBoxInt = null;
                    }
                    Logger.d("SportCourseViewHolder", "courseDataListLiveData size=" + numBoxInt + " value=" + listEmptyList);
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                courseSeriesRecommend = obj;
                CourseSeriesRecommend courseSeriesRecommend2 = (CourseSeriesRecommend) courseSeriesRecommend;
                listEmptyList = (courseSeriesRecommend2 == null || (album = courseSeriesRecommend2.getAlbum()) == null) ? CollectionsKt__CollectionsKt.emptyList() : album;
            } catch (Exception e) {
                Logger.i("SportCourseViewHolder", "requestDataFromServer getCourseRecommend failed. error=" + e);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new CourseSeriesData(null, null, null, null, null, null, null, true, 127, null));
                listEmptyList = arrayList;
            }
            SportCourseViewHolder.this.getMViewModel().getCourseDataListLiveData().postValue(listEmptyList);
            SportCourseViewHolder.this.courseIdListStr = "";
            SportCourseViewHolder sportCourseViewHolder2 = SportCourseViewHolder.this;
            if (listEmptyList != null) {
                size = listEmptyList.size();
            } else {
                size = 0;
            }
            sportCourseViewHolder2.courseSeriesNum = size;
            Pair[] pairArr2 = new Pair[4];
            pairArr2[0] = TuplesKt.to("name", "ad_lesson_expose");
            pairArr2[1] = TuplesKt.to("tip", "56.108.0.1.40462");
            wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel != null) {
                str = model;
            }
            pairArr2[2] = TuplesKt.to("device_model", str);
            pairArr2[3] = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, Boxing.boxInt(SportCourseViewHolder.this.courseSeriesNum));
            SportCourseViewHolder.this.sectionTitleTv.setTag(new TrackContentBean("sportTabCourse", false, "expose_v3", MapsKt__MapsKt.mapOf(pairArr2), 0.0f, 16, null));
            if (listEmptyList != null) {
                numBoxInt = Boxing.boxInt(listEmptyList.size());
            } else {
                numBoxInt = null;
            }
            Logger.d("SportCourseViewHolder", "courseDataListLiveData size=" + numBoxInt + " value=" + listEmptyList);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportCourseViewHolder(@NotNull View itemView, @NotNull FragmentActivity fragmentActivity, @NotNull SportTabV4ViewModel mViewModel) {
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
        this.recommendAdapter = new SerialCourseAdapter(new Function0() { // from class: ycn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportCourseViewHolder.recommendAdapter$lambda$0(this.f40045a);
            }
        });
        this.courseIdListStr = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkViewsPosition() {
        String model;
        int bottom = this.subtitle.getBottom();
        int top = this.logoGroup.getTop();
        Logger.d("SportCourseViewHolder", "Layout check: subtitleBottom=" + bottom + " logoTop=" + top);
        this.subtitle.setVisibility(bottom > top ? 4 : 0);
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("name", "ad_interactive_expose");
        pairArr[1] = TuplesKt.to("tip", "56.108.0.1.40463");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        pairArr[2] = TuplesKt.to("device_model", model);
        oneTrackExtKt.reportData("expose_v3", MapsKt__MapsKt.mapOf(pairArr));
    }

    private final void goCourseCatalog() {
        String model;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("name", "ad_lesson_click");
        pairArr[1] = TuplesKt.to("tip", "56.0.0.0.40464");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        pairArr[2] = TuplesKt.to("device_model", model);
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
        CourseApi.DefaultImpls.goCourseCatalog$default(CourseApiKt.getCourseApi(), null, null, null, null, true, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recommendAdapter$lambda$0(SportCourseViewHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.bindData();
        return Unit.INSTANCE;
    }

    private final void refreshAdapterDataAndLayoutManager(List<CourseSeriesData> courseDataList) {
        Logger.d("SportCourseViewHolder", "refreshAdapterDataAndLayoutManager courseDataList size=" + (courseDataList != null ? courseDataList.size() : 0));
        List<CourseSeriesData> list = courseDataList;
        if (list == null || list.isEmpty()) {
            return;
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        if (!uIUtils.isTabletAndLandscape(ApplicationExtKt.getApplication())) {
            uIUtils.isFoldableExpandOrPadPortrait();
        }
        this.courseCardRecycler.setLayoutManager(new LinearLayoutManager(this.itemView.getContext()));
        ItemDecorationExtKt.clearAllItemDecorations(this.courseCardRecycler);
        this.recommendAdapter.bindData(courseDataList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshHolder$lambda$1(TextView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WebViewUtilKt.startWebView$default(AidongMotionSensingCourseUtilExtKt.getAidongEntranceNoticeSupportListUrl(), null, false, false, 14, null);
        return Unit.INSTANCE;
    }

    private final void refreshSportCourseCard() {
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            ViewExtKt.gone(this.container);
            return;
        }
        ViewExtKt.visible(this.container);
        if (CourseApiKt.getCourseApi().getAidongCourseVipInfo() == null) {
            CourseApi.DefaultImpls.refreshCourseVipData$default(CourseApiKt.getCourseApi(), null, null, 3, null);
        }
        showSportCourseCard();
    }

    private final void requestDataFromServer() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() && NetworkUtils.isNetworkConnected(this.itemView.getContext())) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.fragmentActivity), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
        } else {
            ViewExtKt.gone(this.courseCardRecycler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleLayoutCheck() {
        this.aidongEntranceCard.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaomi.fitness.sport.sporttab.viewholder.SportCourseViewHolder.scheduleLayoutCheck.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                SportCourseViewHolder.this.aidongEntranceCard.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                SportCourseViewHolder.this.checkViewsPosition();
            }
        });
    }

    private final void showAidongEntranceCard() {
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            ViewExtKt.gone(this.container);
            return;
        }
        ViewExtKt.visible(this.container);
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
            builderTarget.listener(new ImageRequest.Listener(this) { // from class: com.xiaomi.fitness.sport.sporttab.viewholder.SportCourseViewHolder$showAidongEntranceCard$lambda$7$$inlined$listener$default$1
                @Override // coil.request.ImageRequest.Listener
                public void onCancel(@NotNull ImageRequest request) {
                }

                @Override // coil.request.ImageRequest.Listener
                public void onError(@NotNull ImageRequest request, @NotNull ErrorResult result) {
                    this.this$0.scheduleLayoutCheck();
                }

                @Override // coil.request.ImageRequest.Listener
                public void onStart(@NotNull ImageRequest request) {
                }

                @Override // coil.request.ImageRequest.Listener
                public void onSuccess(@NotNull ImageRequest request, @NotNull SuccessResult result) {
                    this.this$0.scheduleLayoutCheck();
                }
            });
            imageLoader.enqueue(builderTarget.build());
        } else {
            ViewExtKt.visible(this.bgImageDefault);
            ViewExtKt.gone(this.bgImageLarge);
            ImageView imageView2 = this.bgImageDefault;
            Integer numValueOf2 = Integer.valueOf(eoi.N0);
            ImageLoader imageLoader2 = Coil.imageLoader(imageView2.getContext());
            ImageRequest.Builder builderTarget2 = new ImageRequest.Builder(imageView2.getContext()).data(numValueOf2).target(imageView2);
            builderTarget2.transformations(new RoundedCornersTransformation(ExtensionsKt.getDp(16)));
            builderTarget2.listener(new ImageRequest.Listener(this) { // from class: com.xiaomi.fitness.sport.sporttab.viewholder.SportCourseViewHolder$showAidongEntranceCard$lambda$10$$inlined$listener$default$1
                @Override // coil.request.ImageRequest.Listener
                public void onCancel(@NotNull ImageRequest request) {
                }

                @Override // coil.request.ImageRequest.Listener
                public void onError(@NotNull ImageRequest request, @NotNull ErrorResult result) {
                    this.this$0.scheduleLayoutCheck();
                }

                @Override // coil.request.ImageRequest.Listener
                public void onStart(@NotNull ImageRequest request) {
                }

                @Override // coil.request.ImageRequest.Listener
                public void onSuccess(@NotNull ImageRequest request, @NotNull SuccessResult result) {
                    this.this$0.scheduleLayoutCheck();
                }
            });
            imageLoader2.enqueue(builderTarget2.build());
        }
        ViewExtKt.clickWithTrigger$default(this.aidongEntranceCard, 0L, new Function1() { // from class: cdn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportCourseViewHolder.showAidongEntranceCard$lambda$11(this.f5228a, (ConstraintLayout) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAidongEntranceCard$lambda$11(SportCourseViewHolder this$0, ConstraintLayout it) {
        String model;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AidongMotionSensingCourseUtilExtKt.doAllNecessaryCheckAndGoToAidongSdkIfNeed$default(null, this$0.fragmentActivity, null, 5, null);
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("name", "ad_interactive_click");
        pairArr[1] = TuplesKt.to("tip", "56.0.0.0.40465");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        pairArr[2] = TuplesKt.to("device_model", model);
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
        return Unit.INSTANCE;
    }

    private final void showSportCourseCard() {
        this.courseCardRecycler.setNestedScrollingEnabled(false);
        this.courseCardRecycler.setAdapter(this.recommendAdapter);
        this.mViewModel.getCourseDataListLiveData().observe(this.fragmentActivity, new SportCourseViewHolder$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: bdn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportCourseViewHolder.showSportCourseCard$lambda$4(this.f4095a, (List) obj);
            }
        }));
        requestDataFromServer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSportCourseCard$lambda$4(SportCourseViewHolder this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d("SportCourseViewHolder", "courseDataListLiveData：" + list);
        Intrinsics.checkNotNull(list);
        if (!list.isEmpty()) {
            ViewExtKt.visible(this$0.courseCardRecycler);
            this$0.refreshAdapterDataAndLayoutManager(list);
        } else {
            ViewExtKt.gone(this$0.courseCardRecycler);
        }
        return Unit.INSTANCE;
    }

    private final void showSportGameCard() {
        ViewExtKt.clickWithTrigger$default(this.itemView.getRootView(), 0L, new Function1() { // from class: zcn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportCourseViewHolder.showSportGameCard$lambda$2(this.f41128a, (View) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(this.allRightArrowBtn, 0L, new Function1() { // from class: adn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportCourseViewHolder.showSportGameCard$lambda$3(this.f908a, (TextView) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSportGameCard$lambda$2(SportCourseViewHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goCourseCatalog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSportGameCard$lambda$3(SportCourseViewHolder this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.goCourseCatalog();
        return Unit.INSTANCE;
    }

    public final void bindData() {
        refreshHolder();
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
        if (z) {
            this.sectionTitleTv.setText(ResourceExtKt.getString(c1j.x));
            showSportGameCard();
            refreshSportCourseCard();
        } else {
            ViewExtKt.gone(this.courseCardRecycler);
        }
        showAidongEntranceCard();
        ViewExtKt.clickWithTrigger$default(this.instructionBtn, 0L, new Function1() { // from class: xcn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportCourseViewHolder.refreshHolder$lambda$1((TextView) obj);
            }
        }, 1, null);
    }
}
