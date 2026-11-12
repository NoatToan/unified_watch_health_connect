package com.huami.sleep.sleepintrodetail.ui;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.entry.TagInfo;
import com.huami.sky.service.SkyPlayFromEvent;
import com.huami.sleep.R;
import com.huami.sleep.databinding.FragmentIntoSleepDetailBinding;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.sleepintrodetail.ui.IntoSleepDetailFragment;
import com.huami.sleep.sleepintrodetail.viewmodel.SleepIntroDetailViewModel;
import com.huami.sleep.sleepintrodetail.vo.SleepIntroDetailVo;
import com.huami.sleep.util.ExteranelKt;
import com.huami.sleep.util.SleepStatusAnalytics;
import com.huami.tools.log.HMLog;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\u00022\u0016\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0002J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/ui/IntoSleepDetailFragment;", "Landroidx/fragment/app/Fragment;", "", GoogleApiAvailabilityLight.b, "initView", "g", "Lkotlin/Pair;", "Lcom/huami/sky/entry/TagInfo;", "tagPairs", com.google.android.exoplayer2.text.ttml.b.r, SOAP.XMLNS, "Landroid/widget/TextView;", "textView", "tagInfo", "o", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/sleep/sleepintrodetail/viewmodel/SleepIntroDetailViewModel;", "a", "Lkotlin/Lazy;", "r", "()Lcom/huami/sleep/sleepintrodetail/viewmodel/SleepIntroDetailViewModel;", "viewModel", "Lcom/huami/sleep/databinding/FragmentIntoSleepDetailBinding;", "b", DTransferConstants.SEARCH_KEY, "()Lcom/huami/sleep/databinding/FragmentIntoSleepDetailBinding;", "fragmentIntoSleepDetailBinding", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class IntoSleepDetailFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String c = "detail";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy fragmentIntoSleepDetailBinding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/ui/IntoSleepDetailFragment$Companion;", "", "Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroDetailVo;", "detail", "Lcom/huami/sleep/sleepintrodetail/ui/IntoSleepDetailFragment;", "getInstance", "", "ARG_DETAIL", "Ljava/lang/String;", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IntoSleepDetailFragment getInstance(@NotNull SleepIntroDetailVo detail) {
            IntoSleepDetailFragment intoSleepDetailFragment = new IntoSleepDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("detail", detail);
            Unit unit = Unit.INSTANCE;
            intoSleepDetailFragment.setArguments(bundle);
            return intoSleepDetailFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fillSkyTagTextAndBg color parse error.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/databinding/FragmentIntoSleepDetailBinding;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<FragmentIntoSleepDetailBinding> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FragmentIntoSleepDetailBinding invoke() {
            return FragmentIntoSleepDetailBinding.inflate(LayoutInflater.from(IntoSleepDetailFragment.this.getContext()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            Context context = IntoSleepDetailFragment.this.getContext();
            if (context == null) {
                return;
            }
            KoinExtKt.getSkyNavigator().launchSkyMainPage(context, SkyPlayFromEvent.FROM_SLEEP);
            SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.SLP_INTO_DETAIL_TONALITY_CLICK);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntoSleepDetailFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.sleepintrodetail.ui.IntoSleepDetailFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SleepIntroDetailViewModel>() { // from class: com.huami.sleep.sleepintrodetail.ui.IntoSleepDetailFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.sleepintrodetail.viewmodel.SleepIntroDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SleepIntroDetailViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SleepIntroDetailViewModel.class), function0, objArr);
            }
        });
        this.fragmentIntoSleepDetailBinding = LazyKt__LazyJVMKt.lazy(new b());
    }

    private final void g() {
        SleepIntroDetailViewModel sleepIntroDetailViewModelR = r();
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("detail");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.huami.sleep.sleepintrodetail.vo.SleepIntroDetailVo");
            SleepIntroDetailVo sleepIntroDetailVo = (SleepIntroDetailVo) serializable;
            sleepIntroDetailViewModelR.setIntroDetail(sleepIntroDetailVo);
            sleepIntroDetailViewModelR.canShowSkyEntry();
            sleepIntroDetailViewModelR.statistics(sleepIntroDetailVo);
        }
        sleepIntroDetailViewModelR.getIntroValue().observe(getViewLifecycleOwner(), new Observer() { // from class: fh4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                IntoSleepDetailFragment.h(this.a, (String[]) obj);
            }
        });
        sleepIntroDetailViewModelR.getIntroValueImgRes().observe(getViewLifecycleOwner(), new Observer() { // from class: bh4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                IntoSleepDetailFragment.i(this.a, (Integer) obj);
            }
        });
        sleepIntroDetailViewModelR.getIntroTrendInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: ch4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                IntoSleepDetailFragment.j(this.a, (String) obj);
            }
        });
        sleepIntroDetailViewModelR.getRefValue().observe(getViewLifecycleOwner(), new Observer() { // from class: dh4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                IntoSleepDetailFragment.k(this.a, (String) obj);
            }
        });
        sleepIntroDetailViewModelR.getShowSky().observe(getViewLifecycleOwner(), new Observer() { // from class: ah4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                IntoSleepDetailFragment.l(this.a, (Boolean) obj);
            }
        });
        sleepIntroDetailViewModelR.getTags().observe(getViewLifecycleOwner(), new Observer() { // from class: eh4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                IntoSleepDetailFragment.m(this.a, (Pair) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(IntoSleepDetailFragment intoSleepDetailFragment, String[] strArr) {
        intoSleepDetailFragment.q().detailIntoSleepValue.setValues((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(IntoSleepDetailFragment intoSleepDetailFragment, Integer num) {
        intoSleepDetailFragment.q().detailIntoSleepChangeImg.setImageResource(num.intValue());
    }

    private final void initView() {
        ViewExKt.smartClick$default(q().detailIntoSleepSkyImg, 0L, new c(), 1, null);
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(IntoSleepDetailFragment intoSleepDetailFragment, String str) {
        ViewExKt.setVisible(intoSleepDetailFragment.q().detailIntoSleepChange, true ^ (str == null || str.length() == 0));
        intoSleepDetailFragment.q().detailIntoSleepChange.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(IntoSleepDetailFragment intoSleepDetailFragment, String str) {
        intoSleepDetailFragment.q().detailIntoSleepRefs.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(IntoSleepDetailFragment intoSleepDetailFragment, Boolean bool) {
        ViewExKt.setVisible(intoSleepDetailFragment.q().detailIntoSleepGroup, bool.booleanValue());
        if (bool.booleanValue()) {
            SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.SLP_INTO_DETAIL_TONALITY_EXPOSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(IntoSleepDetailFragment intoSleepDetailFragment, Pair pair) {
        intoSleepDetailFragment.p(pair);
    }

    private final void n() {
        ViewExKt.setVisible(q().detailIntoSleepForeignTagGroup, !ExteranelKt.isChineseLanguage());
        ViewExKt.setVisible(q().detailIntoSleepChinaTagGroup, ExteranelKt.isChineseLanguage());
    }

    private final void o(TextView textView, TagInfo tagInfo) {
        textView.setText(tagInfo.getContent());
        try {
            ExteranelKt.setViewBackgroundTint(textView, ColorStateList.valueOf(Color.parseColor(tagInfo.getColor())));
        } catch (Exception unused) {
            HMLog.error$default("IntoSleepDetailFragment", null, null, a.a, 6, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    private final void p(Pair<TagInfo, TagInfo> tagPairs) {
        boolean z;
        boolean z2;
        boolean z3;
        TagInfo first = tagPairs.getFirst();
        TagInfo second = tagPairs.getSecond();
        FragmentIntoSleepDetailBinding fragmentIntoSleepDetailBindingQ = q();
        if (ExteranelKt.isChineseLanguage()) {
            TextView textView = fragmentIntoSleepDetailBindingQ.detailIntoSleepSkyImgBeta;
            if (first == null) {
                z3 = false;
            } else {
                if (first.getContent().length() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            ViewExKt.setVisible(textView, z3);
            TextView textView2 = fragmentIntoSleepDetailBindingQ.detailIntoSleepSkyImgFreeSign;
            if (second != null) {
                z2 = second.getContent().length() > 0;
            }
            ViewExKt.setVisible(textView2, z2);
            if (first != null) {
                o(fragmentIntoSleepDetailBindingQ.detailIntoSleepSkyImgBeta, first);
            }
            if (second == null) {
                return;
            }
            o(fragmentIntoSleepDetailBindingQ.detailIntoSleepSkyImgFreeSign, second);
            return;
        }
        TextView textView3 = fragmentIntoSleepDetailBindingQ.detailIntoSleepSkyImgBetaForeign;
        if (first == null) {
            z = false;
        } else {
            if (first.getContent().length() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        ViewExKt.setVisible(textView3, z);
        TextView textView4 = fragmentIntoSleepDetailBindingQ.detailIntoSleepSkyImgFreeSignForeign;
        if (second != null) {
            z2 = second.getContent().length() > 0;
        }
        ViewExKt.setVisible(textView4, z2);
        if (first != null) {
            o(fragmentIntoSleepDetailBindingQ.detailIntoSleepSkyImgBetaForeign, first);
        }
        if (second == null) {
            return;
        }
        o(fragmentIntoSleepDetailBindingQ.detailIntoSleepSkyImgFreeSignForeign, second);
    }

    private final FragmentIntoSleepDetailBinding q() {
        return (FragmentIntoSleepDetailBinding) this.fragmentIntoSleepDetailBinding.getValue();
    }

    private final SleepIntroDetailViewModel r() {
        return (SleepIntroDetailViewModel) this.viewModel.getValue();
    }

    private final void s() {
        final Context context;
        String string = q().detailIntoSleepUpdateOnePlus.getText().toString();
        SpannableString spannableString = new SpannableString(string);
        String str = (String) CollectionsKt.getOrNull(StringsKt__StringsKt.split$default((CharSequence) string, new String[]{"，", ","}, false, 0, 6, (Object) null), 0);
        if (str == null || (context = getContext()) == null) {
            return;
        }
        spannableString.setSpan(new ClickableSpan() { // from class: com.huami.sleep.sleepintrodetail.ui.IntoSleepDetailFragment$handleSkyText$1$1$1
            @Override // android.text.style.ClickableSpan
            public void onClick(@NotNull View widget) {
                KoinExtKt.getSkyNavigator().launchWebIntroPage();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(@NotNull TextPaint ds) {
                ds.setColor(ContextCompat.getColor(context, R.color.s14));
                ds.setUnderlineText(false);
            }
        }, 0, str.length(), 17);
        q().detailIntoSleepUpdateOnePlus.setHighlightColor(0);
        q().detailIntoSleepUpdateOnePlus.setMovementMethod(LinkMovementMethod.getInstance());
        q().detailIntoSleepUpdateOnePlus.setText(spannableString);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return q().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        n();
        initView();
        g();
    }
}
