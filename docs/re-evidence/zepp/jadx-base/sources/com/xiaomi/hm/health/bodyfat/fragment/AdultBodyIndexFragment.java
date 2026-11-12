package com.xiaomi.hm.health.bodyfat.fragment;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.view.ViewUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.view.weightfigure.WeightFigureView;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.adapter.BodyFatAdapter;
import com.xiaomi.hm.health.bodyfat.body_params.ShapeParamsActivity;
import com.xiaomi.hm.health.bodyfat.databinding.LayoutBodyParamsDetailBinding;
import com.xiaomi.hm.health.bodyfat.fragment.AdultBodyIndexFragment;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.model.FigureSource;
import com.xiaomi.hm.health.bodyfat.model.ScoreParamsObject;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.bodyfat.view.FillRecyclerView;
import com.xiaomi.hm.health.bodyfat.viewmodel.BodyFatDetailsViewModel;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bJ\u0010KJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002JF\u0010\u0018\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0016\u0010\u0019\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J(\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J5\u0010'\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J \u0010,\u001a\u00020%2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007H\u0002J\u001e\u0010.\u001a\u00020-2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u0010\u0010/\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u00100\u001a\u00020\u0002H\u0002J\u0010\u00103\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0002J$\u0010;\u001a\u00020:2\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u0001062\b\u00109\u001a\u0004\u0018\u000108H\u0016J\u001a\u0010=\u001a\u00020\u00022\u0006\u0010<\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108H\u0016J\u0006\u0010>\u001a\u00020\u0013R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u00078\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u001d\u0010I\u001a\u00020E8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010F\u001a\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/AdultBodyIndexFragment;", "Landroidx/fragment/app/Fragment;", "", "b", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "weightInfos", hl.k, "", "colorResId", GoogleApiAvailabilityLight.a, "", "Lcom/xiaomi/hm/health/bodyfat/model/ScoreParamsObject;", "list", "Landroidx/recyclerview/widget/RecyclerView;", "listView", "Landroid/widget/RelativeLayout;", "layout", "Landroid/widget/TextView;", "titleTv", "", "title", "color", "", "isNeedExpand", "c", "l", "gender", "age", "height", "", "weight", GoogleApiAvailabilityLight.b, "initWeight", "", "values", "", "labels", "", "colors", "i", "(F[F[Ljava/lang/String;[I)V", "index", "size", "focusColor", "f", "Lcom/xiaomi/hm/health/bodyfat/adapter/BodyFatAdapter;", "e", "h", "m", "Landroid/widget/ImageView;", "imageView", z.j, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "getShareShapeStr", "Lcom/xiaomi/hm/health/bodyfat/databinding/LayoutBodyParamsDetailBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/LayoutBodyParamsDetailBinding;", "binding", LogUtil.I, "MAX_HEALTH_NUM", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/BodyFatDetailsViewModel;", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/BodyFatDetailsViewModel;", "viewModel", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class AdultBodyIndexFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private LayoutBodyParamsDetailBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int MAX_HEALTH_NUM = 8;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new c());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.fragment.AdultBodyIndexFragment$setBodyType$1", f = "AdultBodyIndexFragment.kt", i = {}, l = {322}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ WeightInfos b;
        public final /* synthetic */ AdultBodyIndexFragment c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.fragment.AdultBodyIndexFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.fragment.AdultBodyIndexFragment$setBodyType$1$1", f = "AdultBodyIndexFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0781a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ AdultBodyIndexFragment b;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0781a(AdultBodyIndexFragment adultBodyIndexFragment, String str, Continuation<? super C0781a> continuation) {
                super(2, continuation);
                this.b = adultBodyIndexFragment;
                this.c = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(AdultBodyIndexFragment adultBodyIndexFragment, View view) {
                adultBodyIndexFragment.m();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0781a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0781a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding = this.b.binding;
                Objects.requireNonNull(layoutBodyParamsDetailBinding);
                layoutBodyParamsDetailBinding.shapeIv.setText(this.c);
                LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding2 = this.b.binding;
                Objects.requireNonNull(layoutBodyParamsDetailBinding2);
                RelativeLayout relativeLayout = layoutBodyParamsDetailBinding2.shapeParamRl;
                final AdultBodyIndexFragment adultBodyIndexFragment = this.b;
                relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.bodyfat.fragment.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AdultBodyIndexFragment.a.C0781a.b(adultBodyIndexFragment, view);
                    }
                });
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WeightInfos weightInfos, AdultBodyIndexFragment adultBodyIndexFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = weightInfos;
            this.c = adultBodyIndexFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Integer height;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfos info = UserInfoManager.getManager().getInfo(this.b.getUserId().longValue());
                Integer height2 = (this.b.getHeight() == null || ((height = this.b.getHeight()) != null && height.intValue() == 0)) ? info.getHeight() : this.b.getHeight();
                if (info != null) {
                    String bodyShapeTypeLevelStr = BodyParamsUtils.getBodyShapeTypeLevelStr(this.c.getContext(), ((this.b.getBody_fat() == null || this.b.getMuscle() == null) ? this.b.getBody_shape_type() : Boxing.boxInt(BodyParamsUtils.calBodyShape(BodyParamsUtils.getWeightAge(this.b.getTimestamp().longValue(), info.getBirthday()), info.getGender().intValue(), height2.intValue(), this.b.getBody_fat().floatValue(), this.b.getMuscle().floatValue()))).intValue());
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    C0781a c0781a = new C0781a(this.c, bodyShapeTypeLevelStr, null);
                    this.a = 1;
                    if (BuildersKt.withContext(main, c0781a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "aFloat", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Float, String> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@Nullable Float f) {
            int weightUnit = BFCallback.getUnitManager().getWeightUnit();
            return HMWeightUtils.getWeightValueStringForDisplay(HMWeightUtils.convertToKg(f.floatValue(), weightUnit), weightUnit);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/BodyFatDetailsViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<BodyFatDetailsViewModel> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BodyFatDetailsViewModel getA() {
            return (BodyFatDetailsViewModel) new ViewModelProvider(AdultBodyIndexFragment.this.requireActivity()).get(BodyFatDetailsViewModel.class);
        }
    }

    private final void b() {
        if (!BFCallback.getInstance().enableMiDongFlavor()) {
            Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.bf3_figure);
            LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding = this.binding;
            Objects.requireNonNull(layoutBodyParamsDetailBinding);
            layoutBodyParamsDetailBinding.shapeIvPre.setImageDrawable(TintUtils.tintDrawable(drawable, ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.bf3_list_health))));
            return;
        }
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding2 = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding2);
        j(layoutBodyParamsDetailBinding2.shapeIvPre);
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding3 = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding3);
        j(layoutBodyParamsDetailBinding3.bodyAgeIconIv);
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding4 = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding4);
        j(layoutBodyParamsDetailBinding4.bodyIdealWeightIconIv);
    }

    private final void c(List<? extends ScoreParamsObject> list, RecyclerView listView, RelativeLayout layout, TextView titleTv, String title, int color, boolean isNeedExpand) {
        listView.setNestedScrollingEnabled(false);
        if (list.isEmpty()) {
            layout.setVisibility(8);
            return;
        }
        layout.setVisibility(0);
        BodyFatAdapter bodyFatAdapterE = e(list, color);
        bodyFatAdapterE.setDefaultExpand(isNeedExpand);
        titleTv.setText(title);
        listView.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        listView.setAdapter(bodyFatAdapterE);
    }

    private final int d(int colorResId) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return 0;
        }
        return ContextCompat.getColor(activity, colorResId);
    }

    private final BodyFatAdapter e(List<? extends ScoreParamsObject> list, int color) {
        return new BodyFatAdapter(requireContext(), list, color, ViewUtils.getScreenWidth(requireActivity()));
    }

    private final int[] f(int index, int size, int focusColor) {
        int[] iArr = new int[size];
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i == index) {
                    iArr[i] = focusColor;
                } else {
                    iArr[i] = ContextCompat.getColor(requireContext(), R.color.s1);
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(AdultBodyIndexFragment adultBodyIndexFragment, WeightInfos weightInfos) {
        if (weightInfos == null) {
            return;
        }
        adultBodyIndexFragment.k(weightInfos);
        adultBodyIndexFragment.h(weightInfos);
        adultBodyIndexFragment.b();
    }

    private final void h(WeightInfos weightInfos) {
        Integer body_shape_type = weightInfos.getBody_shape_type();
        if ((body_shape_type != null && body_shape_type.intValue() == 0) || !BFCallback.getHMPropertyUtil().getSmartAnalysis("body")) {
            LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding = this.binding;
            Objects.requireNonNull(layoutBodyParamsDetailBinding);
            layoutBodyParamsDetailBinding.shapeParamRl.setVisibility(8);
        } else {
            LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding2 = this.binding;
            Objects.requireNonNull(layoutBodyParamsDetailBinding2);
            layoutBodyParamsDetailBinding2.shapeParamRl.setVisibility(0);
            e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new a(weightInfos, this, null), 2, null);
        }
    }

    private final void i(float initWeight, float[] values, String[] labels, int[] colors) {
        int length = values.length - 1;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i + 1;
                if (i != values.length - 1) {
                    if (initWeight >= values[i] && initWeight < values[i3]) {
                        break;
                    }
                } else {
                    i2 = i;
                }
                if (i3 > length) {
                    i = i2;
                    break;
                }
                i = i3;
            }
        }
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding);
        WeightFigureView.setValues$default(layoutBodyParamsDetailBinding.idealWeightFigureView, values, colors, labels, f(i, values.length, BFCallback.getInstance().enableMiDongFlavor() ? ContextCompat.getColor(requireContext(), R.color.bf3_list_health) : colors[i]), false, 16, null);
        if (initWeight >= values[values.length - 2]) {
            initWeight = HMWeightUtils.elasticValue(initWeight, values[values.length - 2], values[values.length - 1]);
        }
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding2 = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding2);
        layoutBodyParamsDetailBinding2.idealWeightFigureView.setInitValue(initWeight);
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding3 = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding3);
        layoutBodyParamsDetailBinding3.idealWeightFigureView.setListener(b.a);
    }

    private final void j(ImageView imageView) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ContextCompat.getColor(requireContext(), R.color.body_fat_icon_bg));
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
    }

    private final void k(WeightInfos weightInfos) {
        List<List<ScoreParamsObject>> scoreShowInfos = BodyParamsUtils.getScoreShowInfos(requireContext(), getViewModel().getUserInfos(), weightInfos);
        List<ScoreParamsObject> list = scoreShowInfos.get(0);
        List<ScoreParamsObject> list2 = scoreShowInfos.get(1);
        List<ScoreParamsObject> list3 = scoreShowInfos.get(2);
        List<ScoreParamsObject> list4 = scoreShowInfos.get(3);
        String quantityString = getResources().getQuantityString(R.plurals.bodyfat_3_not_up_to_standard, list.size(), Integer.valueOf(list.size()));
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding);
        FillRecyclerView fillRecyclerView = layoutBodyParamsDetailBinding.notToStandardListview;
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding2 = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding2);
        RelativeLayout relativeLayout = layoutBodyParamsDetailBinding2.notStandardRl;
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding3 = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding3);
        c(list, fillRecyclerView, relativeLayout, layoutBodyParamsDetailBinding3.notToStandardTv, quantityString, d(R.color.bf3_list_not_stand), true);
        String quantityString2 = getResources().getQuantityString(R.plurals.bodyfat_3_need_attention, list2.size(), Integer.valueOf(list2.size()));
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding4 = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding4);
        FillRecyclerView fillRecyclerView2 = layoutBodyParamsDetailBinding4.needAttentionListview;
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding5 = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding5);
        RelativeLayout relativeLayout2 = layoutBodyParamsDetailBinding5.needAttentionRl;
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding6 = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding6);
        c(list2, fillRecyclerView2, relativeLayout2, layoutBodyParamsDetailBinding6.attentionTv, quantityString2, d(R.color.bf3_list_attention), true);
        String string = list3.size() == this.MAX_HEALTH_NUM ? getResources().getString(R.string.bf3_all_standard) : getResources().getQuantityString(R.plurals.bodyfat_3_health, list3.size(), Integer.valueOf(list3.size()));
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding7 = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding7);
        FillRecyclerView fillRecyclerView3 = layoutBodyParamsDetailBinding7.healthListview;
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding8 = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding8);
        RelativeLayout relativeLayout3 = layoutBodyParamsDetailBinding8.healthRl;
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding9 = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding9);
        c(list3, fillRecyclerView3, relativeLayout3, layoutBodyParamsDetailBinding9.healthTv, string, d(R.color.bf3_list_health), false);
        l(list4);
    }

    private final void l(List<? extends ScoreParamsObject> list) {
        if (list.isEmpty()) {
            LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding = this.binding;
            Objects.requireNonNull(layoutBodyParamsDetailBinding);
            layoutBodyParamsDetailBinding.otherIndicatorsTv.setVisibility(8);
        } else {
            LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding2 = this.binding;
            Objects.requireNonNull(layoutBodyParamsDetailBinding2);
            layoutBodyParamsDetailBinding2.otherIndicatorsTv.setVisibility(0);
        }
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (Intrinsics.areEqual(list.get(i).getParamsName(), getResources().getString(R.string.body_age))) {
                ScoreParamsObject scoreParamsObject = list.get(i);
                LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding3 = this.binding;
                Objects.requireNonNull(layoutBodyParamsDetailBinding3);
                layoutBodyParamsDetailBinding3.bodyAgeLayout.setVisibility(0);
                Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.bf3_body_age_icon);
                LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding4 = this.binding;
                Objects.requireNonNull(layoutBodyParamsDetailBinding4);
                layoutBodyParamsDetailBinding4.bodyAgeIconIv.setImageDrawable(TintUtils.tintDrawable(drawable, ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.bf3_list_health))));
                LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding5 = this.binding;
                Objects.requireNonNull(layoutBodyParamsDetailBinding5);
                layoutBodyParamsDetailBinding5.paramsIdealAge.setValue(scoreParamsObject.getParamsValue());
                LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding6 = this.binding;
                Objects.requireNonNull(layoutBodyParamsDetailBinding6);
                layoutBodyParamsDetailBinding6.paramsIdealAge.setUnit(scoreParamsObject.getUnitValue());
                LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding7 = this.binding;
                Objects.requireNonNull(layoutBodyParamsDetailBinding7);
                layoutBodyParamsDetailBinding7.bodyAgeInfoTv.setText(scoreParamsObject.getHintInfo());
            } else if (Intrinsics.areEqual(list.get(i).getParamsName(), getResources().getString(R.string.ideal_body_weight))) {
                LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding8 = this.binding;
                Objects.requireNonNull(layoutBodyParamsDetailBinding8);
                layoutBodyParamsDetailBinding8.bodyIdealWeightLayout.setVisibility(0);
                ScoreParamsObject scoreParamsObject2 = list.get(i);
                Drawable drawable2 = ContextCompat.getDrawable(requireContext(), R.drawable.bf3_weight_icon);
                LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding9 = this.binding;
                Objects.requireNonNull(layoutBodyParamsDetailBinding9);
                layoutBodyParamsDetailBinding9.bodyIdealWeightIconIv.setImageDrawable(TintUtils.tintDrawable(drawable2, ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.bf3_list_health))));
                LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding10 = this.binding;
                Objects.requireNonNull(layoutBodyParamsDetailBinding10);
                layoutBodyParamsDetailBinding10.paramsIdealWeight.setValue(scoreParamsObject2.getParamsValue());
                LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding11 = this.binding;
                Objects.requireNonNull(layoutBodyParamsDetailBinding11);
                layoutBodyParamsDetailBinding11.paramsIdealWeight.setUnit(scoreParamsObject2.getUnitValue());
                n(scoreParamsObject2.getSex(), scoreParamsObject2.getAge(), scoreParamsObject2.getHeight(), scoreParamsObject2.getWeight());
            }
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.BF_OPERATION).setValue(StatEvent.BF_OPERATION_BODY_SHAPE_TYPE));
        Intent intent = new Intent(getActivity(), (Class<?>) ShapeParamsActivity.class);
        intent.putExtra("UID", -1);
        String string = getString(R.string.empty_value);
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding);
        if (layoutBodyParamsDetailBinding.shapeIv.getVisibility() == 0) {
            LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding2 = this.binding;
            Objects.requireNonNull(layoutBodyParamsDetailBinding2);
            string = layoutBodyParamsDetailBinding2.shapeIv.getText().toString();
        }
        int bodyShapeTypeByLevel = BodyParamsUtils.getBodyShapeTypeByLevel(getActivity(), string);
        BFCallback.IBFCallBack bFCallback = BFCallback.getInstance();
        UserInfos userInfos = getViewModel().getUserInfos();
        if (bFCallback.getAgeByDate(userInfos == null ? null : userInfos.getBirthday()) < -1) {
            return;
        }
        if (bodyShapeTypeByLevel <= 0) {
            bodyShapeTypeByLevel = 1;
        }
        intent.putExtra("body_params", bodyShapeTypeByLevel);
        UserInfos userInfos2 = getViewModel().getUserInfos();
        intent.putExtra("height", userInfos2 == null ? null : userInfos2.getHeight());
        BFCallback.IBFCallBack bFCallback2 = BFCallback.getInstance();
        UserInfos userInfos3 = getViewModel().getUserInfos();
        intent.putExtra("weight_age", bFCallback2.getAgeByDate(userInfos3 != null ? userInfos3.getBirthday() : null));
        startActivity(intent);
    }

    private final void n(int gender, int age, int height, float weight) {
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        FigureSource weightFigureSource = HMWeightUtils.getWeightFigureSource(getActivity(), Language.isChinese(), gender, age, height, weightUnit);
        if (weightFigureSource != null) {
            i(HMWeightUtils.convertFromKg(weight, weightUnit), weightFigureSource.getValues(), weightFigureSource.getLabels(), weightFigureSource.getColors());
            return;
        }
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding);
        layoutBodyParamsDetailBinding.bodyIdealWeightLayout.setVisibility(8);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final String getShareShapeStr() {
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding);
        if (layoutBodyParamsDetailBinding.shapeParamRl.getVisibility() != 0) {
            return "";
        }
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBinding2 = this.binding;
        Objects.requireNonNull(layoutBodyParamsDetailBinding2);
        return layoutBodyParamsDetailBinding2.shapeIv.getText().toString();
    }

    @NotNull
    public final BodyFatDetailsViewModel getViewModel() {
        return (BodyFatDetailsViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LayoutBodyParamsDetailBinding layoutBodyParamsDetailBindingInflate = LayoutBodyParamsDetailBinding.inflate(inflater);
        this.binding = layoutBodyParamsDetailBindingInflate;
        Objects.requireNonNull(layoutBodyParamsDetailBindingInflate);
        return layoutBodyParamsDetailBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getViewModel().getSelectWeightInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: ha
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AdultBodyIndexFragment.g(this.a, (WeightInfos) obj);
            }
        });
    }
}
