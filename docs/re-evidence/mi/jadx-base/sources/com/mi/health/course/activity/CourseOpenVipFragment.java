package com.mi.health.course.activity;

import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mi.health.course.activity.CourseOpenVipFragment;
import com.mi.health.course.adapter.OpenVipAdapter;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.CourseVipExtKt;
import com.mi.health.course.export.data.CourseMembership;
import com.mi.health.course.export.data.CourseVipInfo;
import com.mi.health.course.export.data.OpenVipModel;
import com.mi.health.course.util.WebViewUrlKt;
import com.mi.health.course.vm.CourseVipVM;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.pay.export.PayManagerExtKt;
import com.xiaomi.fitness.pay.export.PaymentManager;
import com.xiaomi.fitness.pay.export.data.request.SkuObject;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.onetrack.OneTrack;
import defpackage.bli;
import defpackage.czi;
import defpackage.gak;
import defpackage.hv4;
import defpackage.l3j;
import defpackage.oqi;
import defpackage.sk5;
import defpackage.sti;
import defpackage.xmi;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 N2\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\bM\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u0004R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u00106R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u001d\u0010?\u001a\u0004\u0018\u00010;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b=\u0010>R\u001d\u0010D\u001a\u0004\u0018\u00010@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010+\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010+\u001a\u0004\bG\u0010HR\u001b\u0010L\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010+\u001a\u0004\bK\u0010H¨\u0006O"}, d2 = {"Lcom/mi/health/course/activity/CourseOpenVipFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "", "initData", "()V", "Lcom/mi/health/course/export/data/CourseMembership;", "data", "onDataOK", "(Lcom/mi/health/course/export/data/CourseMembership;)V", "onError", "onNoNet", "requestPay", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", LifecycleConstantKt.ON_DESTROY, "Lhv4;", "mBinding", "Lhv4;", "Lkotlin/Function0;", "onDismissAction", "Lkotlin/jvm/functions/Function0;", "getOnDismissAction", "()Lkotlin/jvm/functions/Function0;", "setOnDismissAction", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/mi/health/course/vm/CourseVipVM;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/mi/health/course/vm/CourseVipVM;", "viewModel", "Ljava/util/ArrayList;", "Lcom/mi/health/course/export/data/OpenVipModel;", "vipList", "Ljava/util/ArrayList;", "Lcom/mi/health/course/adapter/OpenVipAdapter;", "adapterVip$delegate", "getAdapterVip", "()Lcom/mi/health/course/adapter/OpenVipAdapter;", "adapterVip", "Landroid/widget/TextView;", "stateView", "Landroid/widget/TextView;", "", "courseId$delegate", "getCourseId", "()Ljava/lang/Long;", "courseId", "", "courseName$delegate", "getCourseName", "()Ljava/lang/String;", "courseName", "", "courseSource$delegate", "getCourseSource", "()I", "courseSource", "vipSource$delegate", "getVipSource", "vipSource", "<init>", "Companion", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCourseOpenVipFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseOpenVipFragment.kt\ncom/mi/health/course/activity/CourseOpenVipFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n2653#2:307\n1872#2,3:309\n774#2:312\n865#2,2:313\n1#3:308\n*S KotlinDebug\n*F\n+ 1 CourseOpenVipFragment.kt\ncom/mi/health/course/activity/CourseOpenVipFragment\n*L\n177#1:307\n177#1:309,3\n220#1:312\n220#1:313,2\n177#1:308\n*E\n"})
public final class CourseOpenVipFragment extends Hilt_CourseOpenVipFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "courseOpenVip";
    private hv4 mBinding;
    private TextView stateView;

    @NotNull
    private Function0<Unit> onDismissAction = new Function0() { // from class: jv4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Unit.INSTANCE;
        }
    };

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kv4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseOpenVipFragment.viewModel_delegate$lambda$1(this.f24323a);
        }
    });

    @NotNull
    private final ArrayList<OpenVipModel> vipList = new ArrayList<>();

    /* JADX INFO: renamed from: adapterVip$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapterVip = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lv4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseOpenVipFragment.adapterVip_delegate$lambda$2(this.f25458a);
        }
    });

    /* JADX INFO: renamed from: courseId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy courseId = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mv4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseOpenVipFragment.courseId_delegate$lambda$3(this.f27244a);
        }
    });

    /* JADX INFO: renamed from: courseName$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy courseName = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nv4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseOpenVipFragment.courseName_delegate$lambda$4(this.f28464a);
        }
    });

    /* JADX INFO: renamed from: courseSource$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy courseSource = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ov4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(CourseOpenVipFragment.courseSource_delegate$lambda$5(this.f29716a));
        }
    });

    /* JADX INFO: renamed from: vipSource$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vipSource = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pv4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(CourseOpenVipFragment.vipSource_delegate$lambda$6(this.f30817a));
        }
    });

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/mi/health/course/activity/CourseOpenVipFragment$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "instance", "Lcom/mi/health/course/activity/CourseOpenVipFragment;", "courseId", "", "courseName", "courseSource", "", "vipSource", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getTAG() {
            return CourseOpenVipFragment.TAG;
        }

        @NotNull
        public final CourseOpenVipFragment instance(long courseId, @NotNull String courseName, int courseSource, int vipSource) {
            Intrinsics.checkNotNullParameter(courseName, "courseName");
            CourseOpenVipFragment courseOpenVipFragment = new CourseOpenVipFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("id", courseId);
            bundle.putString("name", courseName);
            bundle.putInt("source", courseSource);
            bundle.putInt("vipSource", vipSource);
            courseOpenVipFragment.setArguments(bundle);
            return courseOpenVipFragment;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StateData.Status.values().length];
            try {
                iArr[StateData.Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StateData.Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StateData.Status.NO_NET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OpenVipAdapter adapterVip_delegate$lambda$2(CourseOpenVipFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new OpenVipAdapter(this$0.vipList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long courseId_delegate$lambda$3(CourseOpenVipFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle arguments = this$0.getArguments();
        if (arguments != null) {
            return Long.valueOf(arguments.getLong("id"));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String courseName_delegate$lambda$4(CourseOpenVipFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle arguments = this$0.getArguments();
        if (arguments != null) {
            return arguments.getString("name");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int courseSource_delegate$lambda$5(CourseOpenVipFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle arguments = this$0.getArguments();
        if (arguments != null) {
            return arguments.getInt("source");
        }
        return 0;
    }

    private final OpenVipAdapter getAdapterVip() {
        return (OpenVipAdapter) this.adapterVip.getValue();
    }

    private final Long getCourseId() {
        return (Long) this.courseId.getValue();
    }

    private final String getCourseName() {
        return (String) this.courseName.getValue();
    }

    private final int getCourseSource() {
        return ((Number) this.courseSource.getValue()).intValue();
    }

    private final CourseVipVM getViewModel() {
        return (CourseVipVM) this.viewModel.getValue();
    }

    private final int getVipSource() {
        return ((Number) this.vipSource.getValue()).intValue();
    }

    private final void initData() {
        getViewModel().getCourseVipInfoData().observe(this, new CourseOpenVipFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qv4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseOpenVipFragment.initData$lambda$14(this.f31873a, (CourseMembership) obj);
            }
        }));
        getViewModel().getCourseVipInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$14(CourseOpenVipFragment this$0, CourseMembership courseMembership) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StateData.Status status = courseMembership != null ? courseMembership.getStatus() : null;
        int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            this$0.onDataOK(courseMembership);
        } else if (i == 2) {
            this$0.onError();
        } else if (i == 3) {
            this$0.onNoNet();
        }
        return Unit.INSTANCE;
    }

    private final void onDataOK(CourseMembership data) {
        ArrayList<OpenVipModel> membership;
        hv4 hv4Var = this.mBinding;
        if (hv4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            hv4Var = null;
        }
        FrameLayout flStatus = hv4Var.B;
        Intrinsics.checkNotNullExpressionValue(flStatus, "flStatus");
        ViewExtKt.gone(flStatus);
        if (data == null || (membership = data.getMembership()) == null || !(!membership.isEmpty())) {
            return;
        }
        this.vipList.clear();
        ArrayList<OpenVipModel> arrayList = this.vipList;
        ArrayList<OpenVipModel> membership2 = data.getMembership();
        Intrinsics.checkNotNull(membership2);
        int i = 0;
        for (Object obj : membership2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ((OpenVipModel) obj).setSelected(Boolean.valueOf(i == 0));
            i = i2;
        }
        arrayList.addAll(membership2);
        getAdapterVip().notifyDataSetChanged();
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "Class_Entrance"), TuplesKt.to("tip", "56.0.0.0.40471"), TuplesKt.to("source", Integer.valueOf(getVipSource())), TuplesKt.to("asset_id", String.valueOf(getCourseId())), TuplesKt.to(OneTrack.Param.ASSET_NAME, getCourseName())));
    }

    private final void onError() {
        hv4 hv4Var = this.mBinding;
        TextView textView = null;
        if (hv4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            hv4Var = null;
        }
        FrameLayout flStatus = hv4Var.B;
        Intrinsics.checkNotNullExpressionValue(flStatus, "flStatus");
        ViewExtKt.visible(flStatus);
        TextView textView2 = this.stateView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView2 = null;
        }
        ViewExtKt.visible(textView2);
        TextView textView3 = this.stateView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView3 = null;
        }
        textView3.setText(getString(czi.common_hint_unkonwn_error));
        TextView textView4 = this.stateView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
        } else {
            textView = textView4;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, xmi.e, 0, 0);
    }

    private final void onNoNet() {
        hv4 hv4Var = this.mBinding;
        TextView textView = null;
        if (hv4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            hv4Var = null;
        }
        FrameLayout flStatus = hv4Var.B;
        Intrinsics.checkNotNullExpressionValue(flStatus, "flStatus");
        ViewExtKt.visible(flStatus);
        TextView textView2 = this.stateView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView2 = null;
        }
        ViewExtKt.visible(textView2);
        TextView textView3 = this.stateView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView3 = null;
        }
        textView3.setText(getString(czi.common_hint_network_unavailable));
        TextView textView4 = this.stateView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
        } else {
            textView = textView4;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, xmi.e, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10$lambda$9(CourseOpenVipFragment this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (NetworkUtils.isNetworkConnected(this$0.requireContext())) {
            this$0.requestPay();
            return Unit.INSTANCE;
        }
        ToastUtil.INSTANCE.showToast(czi.common_hint_network_unavailable);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$13$lambda$12(CourseOpenVipFragment this$0, String str, String url) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "url");
        WebViewUtilKt.startWebView$default(url, this$0.getString(czi.course_vip_agreement), false, false, null, false, null, false, 252, null);
        return Unit.INSTANCE;
    }

    private final void requestPay() {
        ArrayList<OpenVipModel> arrayList = this.vipList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (Intrinsics.areEqual(((OpenVipModel) obj).getSelected(), Boolean.TRUE)) {
                arrayList2.add(obj);
            }
        }
        OpenVipModel openVipModel = (OpenVipModel) CollectionsKt___CollectionsKt.getOrNull(arrayList2, 0);
        if (openVipModel != null) {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "Class_Entrance"), TuplesKt.to("tip", "56.0.0.0.40474"), TuplesKt.to("source", Integer.valueOf(getVipSource())), TuplesKt.to("type_sku", openVipModel.getName()), TuplesKt.to("asset_id", String.valueOf(getCourseId())), TuplesKt.to(OneTrack.Param.ASSET_NAME, getCourseName())));
            PaymentManager.Companion companion = PaymentManager.INSTANCE;
            SkuObject skuObjectBuildSkuObject$default = PaymentManager.DefaultImpls.buildSkuObject$default(PayManagerExtKt.getInstance(companion), openVipModel.getSpuId(), openVipModel.getSpuVer(), openVipModel.getId(), openVipModel.getPrice(), 0L, null, null, 112, null);
            Bundle bundle = new Bundle();
            bundle.putString("name", getCourseName());
            Long courseId = getCourseId();
            bundle.putLong("courseId", courseId != null ? courseId.longValue() : 0L);
            bundle.putInt("courseSource", getCourseSource());
            PaymentManager payManagerExtKt = PayManagerExtKt.getInstance(companion);
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            PaymentManager.DefaultImpls.intentToPay$default(payManagerExtKt, fragmentActivityRequireActivity, CollectionsKt__CollectionsKt.mutableListOf(skuObjectBuildSkuObject$default), 0, false, false, false, false, 2, null, bundle, new CourseOpenVipFragment$requestPay$2$1(this), 380, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CourseVipVM viewModel_delegate$lambda$1(CourseOpenVipFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return (CourseVipVM) new ViewModelProvider(fragmentActivityRequireActivity).get(CourseVipVM.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int vipSource_delegate$lambda$6(CourseOpenVipFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle arguments = this$0.getArguments();
        if (arguments != null) {
            return arguments.getInt("vipSource");
        }
        return 0;
    }

    @NotNull
    public final Function0<Unit> getOnDismissAction() {
        return this.onDismissAction;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, l3j.f24606a);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        hv4 hv4Var = (hv4) sk5.j(inflater, sti.course_open_course_vip_dialog, container, false);
        this.mBinding = hv4Var;
        hv4 hv4Var2 = null;
        if (hv4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            hv4Var = null;
        }
        this.stateView = (TextView) hv4Var.getRoot().findViewById(oqi.o1);
        hv4 hv4Var3 = this.mBinding;
        if (hv4Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            hv4Var2 = hv4Var3;
        }
        return hv4Var2.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        hv4 hv4Var = this.mBinding;
        if (hv4Var != null) {
            if (hv4Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                hv4Var = null;
            }
            hv4Var.u0();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        this.onDismissAction.invoke();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        hv4 hv4Var = this.mBinding;
        hv4 hv4Var2 = null;
        if (hv4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            hv4Var = null;
        }
        ConstraintLayout constraintLayout = hv4Var.A;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ExtUtilsKt.getColor(bli.g));
        float dp = ExtUtilsKt.getDp(12);
        gradientDrawable.setCornerRadii(new float[]{dp, dp, dp, dp, 0.0f, 0.0f, 0.0f, 0.0f});
        constraintLayout.setBackground(gradientDrawable);
        hv4 hv4Var3 = this.mBinding;
        if (hv4Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            hv4Var3 = null;
        }
        TextView textView = hv4Var3.E;
        CourseVipInfo aidongCourseVipInfo = CourseApiKt.getCourseApi().getAidongCourseVipInfo();
        if (aidongCourseVipInfo != null) {
            String expired_at = aidongCourseVipInfo.getExpired_at();
            boolean zHasExpired = expired_at != null ? CourseVipExtKt.hasExpired(expired_at) : false;
            hv4 hv4Var4 = this.mBinding;
            if (hv4Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                hv4Var4 = null;
            }
            hv4Var4.E.setText(zHasExpired ? czi.course_vip_renew : czi.course_vip_open);
        }
        ViewExtKt.clickWithTrigger$default(textView, 0L, new Function1() { // from class: rv4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseOpenVipFragment.onViewCreated$lambda$10$lambda$9(this.f32937a, (TextView) obj);
            }
        }, 1, null);
        hv4 hv4Var5 = this.mBinding;
        if (hv4Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            hv4Var5 = null;
        }
        RecyclerView recyclerView = hv4Var5.C;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        recyclerView.setAdapter(getAdapterVip());
        recyclerView.addItemDecoration(new gak(ExtUtilsKt.getDp(10)));
        hv4 hv4Var6 = this.mBinding;
        if (hv4Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            hv4Var2 = hv4Var6;
        }
        TextView textView2 = hv4Var2.J;
        String string = textView2.getResources().getString(czi.course_vip_agreement_pay_fix, WebViewUrlKt.getCourseVipAgreementUrl(LocaleUtil.getCurrentLocale()));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CharSequence charSequenceClickSpannable$default = StringExtKt.clickSpannable$default(string, null, bli.h, 0, new Function2() { // from class: sv4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CourseOpenVipFragment.onViewCreated$lambda$13$lambda$12(this.f34014a, (String) obj, (String) obj2);
            }
        }, 5, null);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setAutoLinkMask(1);
        textView2.setHighlightColor(0);
        textView2.setText(charSequenceClickSpannable$default);
        initData();
    }

    public final void setOnDismissAction(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onDismissAction = function0;
    }
}
