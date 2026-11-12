package com.huami.module.homepage.cards.business.aid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.module.homepage.R;
import com.huami.module.homepage.databinding.HomepageLayoutToolSleepAssistantBinding;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001d\u0010\u0019\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/huami/module/homepage/cards/business/aid/SleepMusicCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "resetToolsBtnStatus", "setInitUI", "", "musicTitle", "setPlayingUI", "setStopPlayingUI", "Lcom/huami/module/homepage/databinding/HomepageLayoutToolSleepAssistantBinding;", "a", "Lcom/huami/module/homepage/databinding/HomepageLayoutToolSleepAssistantBinding;", "binding", "b", "Lkotlin/Lazy;", "getMListenText", "()Ljava/lang/String;", "mListenText", "c", "getMPlayingText", "mPlayingText", GoogleApiAvailabilityLight.a, "getMPauseText", "mPauseText", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "e", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class SleepMusicCardView extends ConstraintLayout {

    @Deprecated
    public static final double SLEEP_ASSISTANT_ALPHA = 0.3d;

    @NotNull
    private static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageLayoutToolSleepAssistantBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mListenText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPlayingText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPauseText;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/module/homepage/cards/business/aid/SleepMusicCardView$a", "", "", "SLEEP_ASSISTANT_ALPHA", LogUtil.D, "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return this.a.getResources().getString(R.string.homepage_play_tool_sleep_assistant_listen);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return this.a.getResources().getString(R.string.homepage_play_tool_sleep_assistant_pause);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return this.a.getResources().getString(R.string.homepage_play_tool_sleep_assistant_playing);
        }
    }

    public SleepMusicCardView(@NotNull Context context) {
        super(context);
        this.binding = HomepageLayoutToolSleepAssistantBinding.inflate(LayoutInflater.from(context), this, true);
        this.mListenText = LazyKt__LazyJVMKt.lazy(new b(context));
        this.mPlayingText = LazyKt__LazyJVMKt.lazy(new d(context));
        this.mPauseText = LazyKt__LazyJVMKt.lazy(new c(context));
    }

    private final String getMListenText() {
        return (String) this.mListenText.getValue();
    }

    private final String getMPauseText() {
        return (String) this.mPauseText.getValue();
    }

    private final String getMPlayingText() {
        return (String) this.mPlayingText.getValue();
    }

    public final void resetToolsBtnStatus(@NotNull View.OnClickListener listener) {
        this.binding.toolSleepAssistantPlay.setBackgroundColor(NumberExtKt.addAlpha(ViewExtKt.loadColor(this, R.color.s5), 0.3d));
        this.binding.toolSleepAssistantPlay.setOnClickListener(listener);
    }

    public final void setInitUI() {
        HomepageLayoutToolSleepAssistantBinding homepageLayoutToolSleepAssistantBinding = this.binding;
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantPrompt.setVisibility(0);
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantTitle.setVisibility(8);
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantStatus.setVisibility(8);
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantImage.setVisibility(8);
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantPlay.setText(getMListenText());
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantAnim.setVisibility(8);
    }

    public final void setPlayingUI(@NotNull String musicTitle) {
        HomepageLayoutToolSleepAssistantBinding homepageLayoutToolSleepAssistantBinding = this.binding;
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantPrompt.setVisibility(8);
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantTitle.setVisibility(0);
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantStatus.setVisibility(0);
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantImage.setVisibility(0);
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantPlay.setText("");
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantTitle.setText(musicTitle);
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantImage.setImageResource(R.drawable.ic_tool_sleep_assistant_play);
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantStatus.setText(getMPlayingText());
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantAnim.setVisibility(0);
    }

    public final void setStopPlayingUI(@NotNull String musicTitle) {
        HomepageLayoutToolSleepAssistantBinding homepageLayoutToolSleepAssistantBinding = this.binding;
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantPrompt.setVisibility(8);
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantTitle.setVisibility(0);
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantStatus.setVisibility(0);
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantImage.setVisibility(0);
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantPlay.setText("");
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantTitle.setText(musicTitle);
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantImage.setImageResource(R.drawable.ic_tool_sleep_assistant_pause);
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantStatus.setText(getMPauseText());
        homepageLayoutToolSleepAssistantBinding.toolSleepAssistantAnim.setVisibility(8);
    }
}
