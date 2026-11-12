package com.huami.module.homepage.cards.cardui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.R;
import com.huami.module.homepage.databinding.HomepageItemCardTitleBarBinding;
import com.huami.module.homepage.utils.CenterVerticalImageSpan;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.homepage.utils.TimeKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.nfc.bus.NoticesEntity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001>B'\b\u0007\u0012\u0006\u00107\u001a\u000206\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\b\b\u0002\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ*\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J\u0010\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001aJ\u0010\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001aJ\b\u0010\u001e\u001a\u00020\u0002H\u0014J\b\u0010\u001f\u001a\u00020\u0002H\u0014J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0016\u0010'\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010&R\u001d\u0010,\u001a\u00020(8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0016\u0010/\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0016\u00101\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u0006?"}, d2 = {"Lcom/huami/module/homepage/cards/cardui/CardTitleBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "a", "f", "e", GoogleApiAvailabilityLight.a, "", "b", "c", "", "titleTitle", "setTitleText", "Landroid/graphics/drawable/Drawable;", "icon", "Lkotlin/Function0;", "iconClick", "setTitleTextWithIcon", "", "textSize", "setTitleTextSize", "secondTitleText", "setSecondTitleText", "", "getTitleText", "getSecondTitleText", "", "timeMills", "setFirstTime", "setSecondTime", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/huami/module/homepage/cards/cardui/CardTitleBarView$Rules;", "rule", "setTimeWarpRule", "Lcom/huami/module/homepage/databinding/HomepageItemCardTitleBarBinding;", "Lcom/huami/module/homepage/databinding/HomepageItemCardTitleBarBinding;", "binding", "Lcom/huami/module/homepage/cards/cardui/CardTitleBarView$Rules;", "timeWarpRule", "Landroidx/appcompat/widget/AppCompatImageView;", "Lkotlin/Lazy;", "getExpandButton", "()Landroidx/appcompat/widget/AppCompatImageView;", "expandButton", "J", "firstTimeMills", "secondTimeMills", "Z", "isDestroy", "Lcom/huami/module/homepage/cards/cardui/a;", "g", "Lcom/huami/module/homepage/cards/cardui/a;", "timer", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Rules", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class CardTitleBarView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageItemCardTitleBarBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Rules timeWarpRule;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy expandButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long firstTimeMills;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long secondTimeMills;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isDestroy;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private com.huami.module.homepage.cards.cardui.a timer;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/huami/module/homepage/cards/cardui/CardTitleBarView$Rules;", "", "<init>", "(Ljava/lang/String;I)V", NoticesEntity.LOOP_TYPE_NONE, "LANGUAGE", "CALCULATE", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public enum Rules {
        NONE,
        LANGUAGE,
        CALCULATE
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Rules.values().length];
            iArr[Rules.NONE.ordinal()] = 1;
            iArr[Rules.LANGUAGE.ordinal()] = 2;
            iArr[Rules.CALCULATE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: com.huami.module.homepage.cards.cardui.CardTitleBarView$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0487a extends Lambda implements Function0<String> {
            public static final C0487a a = new C0487a();

            public C0487a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "update time.";
            }
        }

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            if (!CardTitleBarView.this.isDestroy) {
                HMLog.debug("CardTitleBarView", C0487a.a);
                if (CardTitleBarView.this.firstTimeMills != 0) {
                    CardTitleBarView.this.binding.lastTime.setText(TimeKt.toDateString(CardTitleBarView.this.firstTimeMills, CardTitleBarView.this.getContext()));
                }
                if (CardTitleBarView.this.secondTimeMills != 0) {
                    CardTitleBarView.this.binding.secondLastTime.setText(TimeKt.toDateString(CardTitleBarView.this.secondTimeMills, CardTitleBarView.this.getContext()));
                }
            }
            return Boolean.valueOf(CardTitleBarView.this.isDestroy);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/appcompat/widget/AppCompatImageView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<AppCompatImageView> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AppCompatImageView invoke() {
            return CardTitleBarView.this.binding.foldButton;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onAttachedToWindow firstTimeMills:" + CardTitleBarView.this.firstTimeMills + ", secondTimeMills:" + CardTitleBarView.this.secondTimeMills;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onDetachedFromWindow";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "launch count timer.";
        }
    }

    @JvmOverloads
    public CardTitleBarView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public CardTitleBarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CardTitleBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void a() {
        com.huami.module.homepage.cards.cardui.a aVar = this.timer;
        if (aVar != null) {
            aVar.cancel();
            this.timer = null;
        }
        com.huami.module.homepage.cards.cardui.a aVar2 = new com.huami.module.homepage.cards.cardui.a(new a());
        aVar2.start();
        Unit unit = Unit.INSTANCE;
        this.timer = aVar2;
    }

    private final boolean b() {
        String string;
        String string2;
        int width = this.binding.getRoot().getWidth();
        Paint paint = new Paint();
        paint.setTextSize(NumberExtKt.getSp(16.0f));
        CharSequence text = this.binding.cardTitle.getText();
        String str = "";
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        float fMeasureText = paint.measureText(string);
        paint.setTextSize(NumberExtKt.getSp(12.0f));
        CharSequence text2 = this.binding.lastTime.getText();
        if (text2 != null && (string2 = text2.toString()) != null) {
            str = string2;
        }
        return (((paint.measureText(str) + fMeasureText) + NumberExtKt.getDp(30.0f)) + NumberExtKt.getDp(15.0f)) + NumberExtKt.getDp(8.0f) > ((float) width);
    }

    private final boolean c() {
        return !HomeUtils.isChineseLanguage();
    }

    private final void d() {
        if (b()) {
            TextView textView = this.binding.lastTime;
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.baselineToBaseline = -1;
            layoutParams2.bottomToBottom = -1;
            layoutParams2.startToEnd = -1;
            int i = R.id.card_title;
            layoutParams2.startToStart = i;
            layoutParams2.topToBottom = i;
            layoutParams2.setMargins(0, NumberExtKt.getDp(1), 0, 0);
            layoutParams2.setMarginStart(0);
            Unit unit = Unit.INSTANCE;
            textView.setLayoutParams(layoutParams2);
        }
    }

    private final void e() {
        if (c()) {
            TextView textView = this.binding.lastTime;
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.baselineToBaseline = -1;
            layoutParams2.bottomToBottom = -1;
            layoutParams2.startToEnd = -1;
            int i = R.id.card_title;
            layoutParams2.startToStart = i;
            layoutParams2.topToBottom = i;
            layoutParams2.setMargins(0, NumberExtKt.getDp(1), 0, 0);
            layoutParams2.setMarginStart(0);
            Unit unit = Unit.INSTANCE;
            textView.setLayoutParams(layoutParams2);
            TextView textView2 = this.binding.secondLastTime;
            ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.baselineToBaseline = -1;
            layoutParams4.bottomToBottom = -1;
            layoutParams4.startToEnd = -1;
            int i2 = R.id.card_second_title;
            layoutParams4.startToStart = i2;
            layoutParams4.topToBottom = i2;
            layoutParams4.setMargins(0, NumberExtKt.getDp(1), 0, 0);
            layoutParams4.setMarginStart(0);
            textView2.setLayoutParams(layoutParams4);
        }
    }

    private final void f() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.timeWarpRule.ordinal()];
        if (i == 2) {
            e();
        } else {
            if (i != 3) {
                return;
            }
            d();
        }
    }

    public static /* synthetic */ CardTitleBarView setFirstTime$default(CardTitleBarView cardTitleBarView, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return cardTitleBarView.setFirstTime(j);
    }

    public static /* synthetic */ CardTitleBarView setSecondTime$default(CardTitleBarView cardTitleBarView, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return cardTitleBarView.setSecondTime(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardTitleBarView setTitleTextWithIcon$default(CardTitleBarView cardTitleBarView, String str, Drawable drawable, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        return cardTitleBarView.setTitleTextWithIcon(str, drawable, function0);
    }

    @NotNull
    public final AppCompatImageView getExpandButton() {
        return (AppCompatImageView) this.expandButton.getValue();
    }

    @NotNull
    public final CharSequence getSecondTitleText() {
        return this.binding.cardSecondTitle.getText();
    }

    @NotNull
    public final CharSequence getTitleText() {
        return this.binding.cardTitle.getText();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isDestroy = false;
        HMLog.debug("CardTitleBarView", new c());
        if (this.firstTimeMills == 0 && this.secondTimeMills == 0) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        HMLog.debug("CardTitleBarView", d.a);
        this.isDestroy = true;
        com.huami.module.homepage.cards.cardui.a aVar = this.timer;
        if (aVar != null) {
            aVar.cancel();
        }
        this.timer = null;
        super.onDetachedFromWindow();
    }

    @NotNull
    public final CardTitleBarView setFirstTime(long timeMills) {
        this.binding.lastTime.setText(TimeKt.toDateString(timeMills, getContext()));
        f();
        if (this.firstTimeMills != timeMills) {
            a();
            this.firstTimeMills = timeMills;
            HMLog.debug("CardTitleBarView", e.a);
        }
        return this;
    }

    @NotNull
    public final CardTitleBarView setSecondTime(long timeMills) {
        this.binding.secondLastTime.setText(TimeKt.toDateString(timeMills, getContext()));
        f();
        if (this.secondTimeMills != timeMills) {
            a();
            this.secondTimeMills = timeMills;
        }
        return this;
    }

    @NotNull
    public final CardTitleBarView setSecondTitleText(@NotNull String secondTitleText) {
        this.binding.cardSecondTitle.setText(secondTitleText);
        return this;
    }

    @NotNull
    public final CardTitleBarView setTimeWarpRule(@NotNull Rules rule) {
        this.timeWarpRule = rule;
        return this;
    }

    @NotNull
    public final CardTitleBarView setTitleText(@NotNull String titleTitle) {
        this.binding.cardTitle.setText(titleTitle);
        return this;
    }

    @NotNull
    public final CardTitleBarView setTitleTextSize(float textSize) {
        HomepageItemCardTitleBarBinding homepageItemCardTitleBarBinding = this.binding;
        homepageItemCardTitleBarBinding.cardTitle.setTextSize(textSize);
        homepageItemCardTitleBarBinding.cardSecondTitle.setTextSize(textSize);
        return this;
    }

    @NotNull
    public final CardTitleBarView setTitleTextWithIcon(@NotNull String titleTitle, @Nullable Drawable icon, @Nullable final Function0<Unit> iconClick) {
        if (icon == null) {
            this.binding.cardTitle.setText(titleTitle);
            return this;
        }
        this.binding.cardTitle.setMovementMethod(LinkMovementMethod.getInstance());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(titleTitle + "  ");
        spannableStringBuilder.setSpan(new CenterVerticalImageSpan(icon), spannableStringBuilder.length() + (-1), spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.huami.module.homepage.cards.cardui.CardTitleBarView$setTitleTextWithIcon$clickSpan$1
            @Override // android.text.style.ClickableSpan
            public void onClick(@NotNull View widget) {
                Function0<Unit> function0 = iconClick;
                if (function0 == null) {
                    return;
                }
                function0.invoke();
            }
        }, spannableStringBuilder.length() + (-1), spannableStringBuilder.length(), 33);
        this.binding.cardTitle.setText(spannableStringBuilder);
        return this;
    }

    @JvmOverloads
    public CardTitleBarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        HomepageItemCardTitleBarBinding homepageItemCardTitleBarBindingInflate = HomepageItemCardTitleBarBinding.inflate(LayoutInflater.from(context), this, true);
        this.binding = homepageItemCardTitleBarBindingInflate;
        Rules rules = Rules.NONE;
        this.timeWarpRule = rules;
        this.expandButton = LazyKt__LazyJVMKt.lazy(new b());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CardTitleBarView);
        homepageItemCardTitleBarBindingInflate.cardTitle.setText(typedArrayObtainStyledAttributes.getString(R.styleable.CardTitleBarView_titleText));
        homepageItemCardTitleBarBindingInflate.cardSecondTitle.setText(typedArrayObtainStyledAttributes.getString(R.styleable.CardTitleBarView_secondTitleText));
        homepageItemCardTitleBarBindingInflate.foldButton.setVisibility(typedArrayObtainStyledAttributes.getBoolean(R.styleable.CardTitleBarView_showExpandButton, false) ? 0 : 8);
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.CardTitleBarView_timeWarpRules, 0);
        if (i2 == 1) {
            rules = Rules.LANGUAGE;
        } else if (i2 == 2) {
            rules = Rules.CALCULATE;
        }
        this.timeWarpRule = rules;
        typedArrayObtainStyledAttributes.recycle();
    }
}
