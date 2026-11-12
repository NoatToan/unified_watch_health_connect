package com.huami.module.homepage.cards.business.sky;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.business.sky.StarSkyCardView;
import com.huami.module.homepage.cards.service.CardAssistService;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.databinding.HomepageItemCardStarSkyBinding;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.sky.entry.TagInfo;
import com.huami.sky.service.PlayState;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.notification.TransportUri;
import com.huami.widget.toast.IconToast;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001*\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001$B'\b\u0007\u0012\u0006\u0010.\u001a\u00020-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0014J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tJ\u0016\u0010\u0018\u001a\u00020\u00062\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\tJ\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\tJ\u0014\u0010\u001e\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\fJ\u0014\u0010\u001f\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\fJ\u0014\u0010 \u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\fJ\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0003R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+¨\u00065"}, d2 = {"Lcom/huami/module/homepage/cards/business/sky/StarSkyCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/TextView;", "", "content", "colorString", "", "f", "e", "", PointCategory.INIT, GoogleApiAvailabilityLight.a, "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "c", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/huami/sky/service/PlayState;", "playState", "likeState", "initView", "", "Lcom/huami/sky/entry/TagInfo;", "tagInfos", "setTagsText", "state", "setLoadingState", "setPlayState", "setMusicLikeState", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnUnlikeClickListener", "setOnLikeClickListener", "setOnPlayClickListener", "message", "showPayDialogView", "Lcom/huami/module/homepage/databinding/HomepageItemCardStarSkyBinding;", "a", "Lcom/huami/module/homepage/databinding/HomepageItemCardStarSkyBinding;", "binding", "b", "Z", "show", "com/huami/module/homepage/cards/business/sky/StarSkyCardView$lifecycleObserver$1", "Lcom/huami/module/homepage/cards/business/sky/StarSkyCardView$lifecycleObserver$1;", "lifecycleObserver", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class StarSkyCardView extends ConstraintLayout {

    @Deprecated
    public static final float LOTTIE_SPEED = 0.5f;

    @NotNull
    private static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageItemCardStarSkyBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean show;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final StarSkyCardView$lifecycleObserver$1 lifecycleObserver;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayState.values().length];
            iArr[PlayState.IDLE.ordinal()] = 1;
            iArr[PlayState.PAUSE.ordinal()] = 2;
            iArr[PlayState.ERROR.ordinal()] = 3;
            iArr[PlayState.PLAYING.ordinal()] = 4;
            iArr[PlayState.PLAY.ordinal()] = 5;
            iArr[PlayState.PROGRESSING.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/module/homepage/cards/business/sky/StarSkyCardView$a", "", "", "LOTTIE_SPEED", "F", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0<Unit> function0) {
            super(0);
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StarSkyCardView.this.c(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> function0) {
            super(0);
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StarSkyCardView.this.c(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ HomepageItemCardStarSkyBinding a;
        public final /* synthetic */ StarSkyCardView b;
        public final /* synthetic */ Function0<Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HomepageItemCardStarSkyBinding homepageItemCardStarSkyBinding, StarSkyCardView starSkyCardView, Function0<Unit> function0) {
            super(0);
            this.a = homepageItemCardStarSkyBinding;
            this.b = starSkyCardView;
            this.c = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.homepageLike.setImageResource(R.drawable.ic_like_30_s5);
            this.b.c(this.c);
        }
    }

    @JvmOverloads
    public StarSkyCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public StarSkyCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ StarSkyCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Function0<Unit> block) {
        if (this.binding.homepageLoading.isAnimating()) {
            return;
        }
        block.getA();
    }

    private final void d(boolean init) {
        if (this.show && !init) {
            IconToast.showError(getContext().getApplicationContext(), R.string.homepage_item_card_network_error);
        }
        HomepageItemCardStarSkyBinding homepageItemCardStarSkyBinding = this.binding;
        homepageItemCardStarSkyBinding.homepagePlayState.setImageResource(R.drawable.ic_play_30_s5);
        homepageItemCardStarSkyBinding.homepageLottieMain.setSpeed(0.5f);
    }

    private final void e() {
        HomepageItemCardStarSkyBinding homepageItemCardStarSkyBinding = this.binding;
        homepageItemCardStarSkyBinding.homepagePlayState.setImageResource(R.drawable.ic_playing_30_s5);
        homepageItemCardStarSkyBinding.homepageLottieMain.setSpeed(1.0f);
        if (homepageItemCardStarSkyBinding.homepageLottieMain.isAnimating()) {
            return;
        }
        homepageItemCardStarSkyBinding.homepageLottieMain.resumeAnimation();
    }

    private final void f(TextView textView, String str, String str2) {
        textView.setVisibility(str.length() > 0 ? 0 : 8);
        textView.setText(str);
        try {
            ViewExtKt.setViewBackgroundTint(textView, ColorStateList.valueOf(Color.parseColor(str2)));
        } catch (Exception unused) {
            textView.setBackgroundResource(R.drawable.homepage_tag_background_stroke);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(StarSkyCardView starSkyCardView, DialogInterface dialogInterface, int i) {
        CardAssistService assistService = ServiceManager.INSTANCE.getAssistService();
        Context context = starSkyCardView.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        assistService.checkAppUpdate((FragmentActivity) context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(DialogInterface dialogInterface, int i) {
    }

    public static /* synthetic */ void setPlayState$default(StarSkyCardView starSkyCardView, PlayState playState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        starSkyCardView.setPlayState(playState, z);
    }

    public final void initView(@NotNull PlayState playState, boolean likeState) {
        setPlayState(playState, true);
        setMusicLikeState(likeState);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AppCompatActivity appCompatActivity = (AppCompatActivity) getContext();
        if (appCompatActivity == null) {
            return;
        }
        appCompatActivity.getLifecycle().addObserver(this.lifecycleObserver);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.binding.homepageLottieMain.cancelAnimation();
        AppCompatActivity appCompatActivity = (AppCompatActivity) getContext();
        if (appCompatActivity != null) {
            appCompatActivity.getLifecycle().removeObserver(this.lifecycleObserver);
        }
        super.onDetachedFromWindow();
    }

    public final void setLoadingState(@NotNull PlayState state) {
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
            case 2:
            case 3:
                LottieAnimationView lottieAnimationView = this.binding.homepageLoading;
                lottieAnimationView.cancelAnimation();
                lottieAnimationView.setVisibility(8);
                this.binding.homepagePlayState.setVisibility(0);
                break;
            case 4:
                LottieAnimationView lottieAnimationView2 = this.binding.homepageLoading;
                lottieAnimationView2.cancelAnimation();
                lottieAnimationView2.setVisibility(8);
                this.binding.homepagePlayState.setVisibility(0);
                break;
            case 5:
            case 6:
                LottieAnimationView lottieAnimationView3 = this.binding.homepageLoading;
                lottieAnimationView3.setVisibility(0);
                this.binding.homepagePlayState.setVisibility(8);
                if (!lottieAnimationView3.isAnimating()) {
                    lottieAnimationView3.playAnimation();
                }
                break;
        }
    }

    public final void setMusicLikeState(boolean state) {
        this.binding.homepageLike.setImageResource(state ? R.drawable.ic_liked_30_s5 : R.drawable.ic_like_30_s5);
    }

    @NotNull
    public final StarSkyCardView setOnLikeClickListener(@NotNull Function0<Unit> listener) {
        ExteranelKt.setOnClickWithPolicyListener(this.binding.homepageLike, new b(listener));
        return this;
    }

    @NotNull
    public final StarSkyCardView setOnPlayClickListener(@NotNull Function0<Unit> listener) {
        ExteranelKt.setOnClickWithPolicyListener(this.binding.homepagePlayState, new c(listener));
        return this;
    }

    @NotNull
    public final StarSkyCardView setOnUnlikeClickListener(@NotNull Function0<Unit> listener) {
        HomepageItemCardStarSkyBinding homepageItemCardStarSkyBinding = this.binding;
        ExteranelKt.setOnClickWithPolicyListener(homepageItemCardStarSkyBinding.homepageUnlike, new d(homepageItemCardStarSkyBinding, this, listener));
        return this;
    }

    public final void setPlayState(@NotNull PlayState state, boolean init) {
        setLoadingState(state);
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 3) {
            d(init);
        } else {
            if (i == 4) {
                e();
                return;
            }
            HomepageItemCardStarSkyBinding homepageItemCardStarSkyBinding = this.binding;
            homepageItemCardStarSkyBinding.homepagePlayState.setImageResource(R.drawable.ic_play_30_s5);
            homepageItemCardStarSkyBinding.homepageLottieMain.setSpeed(0.5f);
        }
    }

    public final void setTagsText(@Nullable List<TagInfo> tagInfos) {
        int i = 0;
        if (tagInfos == null || tagInfos.isEmpty()) {
            f(this.binding.homepageBeta, "", "");
            f(this.binding.homepageFree, "", "");
            return;
        }
        for (Object obj : tagInfos) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TagInfo tagInfo = (TagInfo) obj;
            if (i == 0) {
                f(this.binding.homepageBeta, tagInfo.getContent(), tagInfo.getColor());
            } else if (i == 1) {
                f(this.binding.homepageFree, tagInfo.getContent(), tagInfo.getColor());
            }
            i = i2;
        }
    }

    public final void showPayDialogView(@NotNull String message) {
        if (getContext() instanceof FragmentActivity) {
            AlertDialogFragment.Builder message2 = new AlertDialogFragment.Builder(getContext()).setPositiveButton(R.string.homepage_item_card_star_sky_update, new DialogInterface.OnClickListener() { // from class: oe7
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    StarSkyCardView.g(this.a, dialogInterface, i);
                }
            }).setNegativeButton(R.string.homepage_item_card_star_sky_cancel, new DialogInterface.OnClickListener() { // from class: pe7
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    StarSkyCardView.h(dialogInterface, i);
                }
            }).setMessage(message);
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            message2.show(((FragmentActivity) context).getSupportFragmentManager()).setGravity(17);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.huami.module.homepage.cards.business.sky.StarSkyCardView$lifecycleObserver$1] */
    @JvmOverloads
    public StarSkyCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        HomepageItemCardStarSkyBinding homepageItemCardStarSkyBindingInflate = HomepageItemCardStarSkyBinding.inflate(LayoutInflater.from(context), this, true);
        this.binding = homepageItemCardStarSkyBindingInflate;
        this.show = true;
        this.lifecycleObserver = new LifecycleObserver() { // from class: com.huami.module.homepage.cards.business.sky.StarSkyCardView$lifecycleObserver$1
            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            public final void onPause() {
                this.a.show = false;
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                this.a.show = true;
            }
        };
        if (HomeUtils.isChineseLanguage()) {
            return;
        }
        TextView textView = homepageItemCardStarSkyBindingInflate.homepageBeta;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.bottomToBottom = -1;
        layoutParams2.startToEnd = -1;
        layoutParams2.baselineToBaseline = -1;
        int i2 = R.id.homepage_title;
        layoutParams2.startToStart = i2;
        layoutParams2.topToBottom = i2;
        layoutParams2.setMarginStart(0);
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = NumberExtKt.getDp(2);
        Unit unit = Unit.INSTANCE;
        textView.setLayoutParams(layoutParams2);
    }
}
