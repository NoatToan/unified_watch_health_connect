package com.xiaomi.hm.health.play.card.health;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.amap.api.mapcore.util.hl;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.femalehealth.uilib.helper.ExtKt;
import com.huami.sleepassistant.lib.service.SleepServiceKt;
import com.huami.sleepassistant.lib.ui.base.Navigator;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.loc.z;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.databinding.LayoutToolSleepAssistantBinding;
import com.xiaomi.hm.health.play.card.AbstractCardRender;
import com.xiaomi.hm.health.play.card.CardUiData;
import com.xiaomi.hm.health.play.card.health.SleepMusicRender;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u001c\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b$\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/play/card/health/SleepMusicRender;", "Lcom/xiaomi/hm/health/play/card/AbstractCardRender;", "Lcom/xiaomi/hm/health/databinding/LayoutToolSleepAssistantBinding;", "", "g", "onClear", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "onCardClick", "setUiData", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "", "h", "Ljava/lang/String;", "mListenText", "i", "mPlayingText", z.j, "mPauseText", "com/xiaomi/hm/health/play/card/health/SleepMusicRender$mMusicPlayStatusChange$1", hl.k, "Lcom/xiaomi/hm/health/play/card/health/SleepMusicRender$mMusicPlayStatusChange$1;", "mMusicPlayStatusChange", "Landroidx/lifecycle/LifecycleObserver;", "l", "Landroidx/lifecycle/LifecycleObserver;", "mLifeCycleObserver", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepMusicRender extends AbstractCardRender<LayoutToolSleepAssistantBinding> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private String mListenText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private String mPlayingText;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private String mPauseText;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final SleepMusicRender$mMusicPlayStatusChange$1 mMusicPlayStatusChange;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final LifecycleObserver mLifeCycleObserver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.hm.health.play.card.health.SleepMusicRender$mMusicPlayStatusChange$1, kotlin.jvm.functions.Function0] */
    public SleepMusicRender(@NotNull LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
        this.mListenText = "";
        this.mPlayingText = "";
        this.mPauseText = "";
        ?? r0 = new Function0<Unit>() { // from class: com.xiaomi.hm.health.play.card.health.SleepMusicRender$mMusicPlayStatusChange$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Unit> {
                public final /* synthetic */ SleepMusicRender a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(SleepMusicRender sleepMusicRender) {
                    super(0);
                    this.a = sleepMusicRender;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.a.updateUi();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2() {
                ExtKt.runOnUiThread(new a(this.a));
            }
        };
        this.mMusicPlayStatusChange = r0;
        LifecycleObserver lifecycleObserver = new LifecycleObserver() { // from class: com.xiaomi.hm.health.play.card.health.SleepMusicRender$mLifeCycleObserver$1
            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                SleepServiceKt.getSleepService().removePlayStatusChange(this.a.mMusicPlayStatusChange);
            }
        };
        this.mLifeCycleObserver = lifecycleObserver;
        SleepServiceKt.getSleepService().addPlayStatusChange(r0);
        this.mListenText = BraceletApp.getContext().getResources().getString(R.string.play_tool_sleep_assistant_listen);
        this.mPlayingText = BraceletApp.getContext().getResources().getString(R.string.play_tool_sleep_assistant_playing);
        this.mPauseText = BraceletApp.getContext().getResources().getString(R.string.play_tool_sleep_assistant_pause);
        lifecycleOwner.getLifecycle().addObserver(lifecycleObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Context context, SleepMusicRender sleepMusicRender, View view) {
        if (PolicyTipUtil.anonymousPolicyApi().showLoginIfNeeded()) {
            return;
        }
        if (TextUtils.isEmpty(SleepServiceKt.getSleepService().getMusicTitle())) {
            Navigator.INSTANCE.startMusicPlayer(context);
        } else {
            SleepServiceKt.getSleepService().playOrPauseMusic();
        }
        sleepMusicRender.recordClickEvent();
    }

    private final void g() {
        String musicTitle = SleepServiceKt.getSleepService().getMusicTitle();
        getBinding().toolSleepAssistantAnim.setVisibility(8);
        if (TextUtils.isEmpty(musicTitle)) {
            getBinding().toolSleepAssistantPrompt.setVisibility(0);
            getBinding().toolSleepAssistantTitle.setVisibility(8);
            getBinding().toolSleepAssistantStatus.setVisibility(8);
            getBinding().toolSleepAssistantImage.setVisibility(8);
            getBinding().toolSleepAssistantPlay.setText(this.mListenText);
            return;
        }
        getBinding().toolSleepAssistantPrompt.setVisibility(8);
        getBinding().toolSleepAssistantTitle.setVisibility(0);
        getBinding().toolSleepAssistantStatus.setVisibility(0);
        getBinding().toolSleepAssistantImage.setVisibility(0);
        getBinding().toolSleepAssistantPlay.setText("");
        getBinding().toolSleepAssistantTitle.setText(musicTitle);
        if (!SleepServiceKt.getSleepService().isMusicPlaying()) {
            getBinding().toolSleepAssistantImage.setImageResource(R.drawable.ic_tool_sleep_assistant_pause);
            getBinding().toolSleepAssistantStatus.setText(this.mPauseText);
        } else {
            getBinding().toolSleepAssistantImage.setImageResource(R.drawable.ic_tool_sleep_assistant_play);
            getBinding().toolSleepAssistantStatus.setText(this.mPlayingText);
            getBinding().toolSleepAssistantAnim.setVisibility(0);
        }
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void onCardClick(@NotNull Context context, @NotNull CardUiData uiParams) {
        if (PolicyTipUtil.anonymousPolicyApi().showLoginIfNeeded()) {
            return;
        }
        super.onCardClick(context, uiParams);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender, com.xiaomi.hm.health.play.card.ICardRender
    public void onClear() {
        super.onClear();
        SleepServiceKt.getSleepService().removePlayStatusChange(this.mMusicPlayStatusChange);
        this.lifecycleOwner.getLifecycle().removeObserver(this.mLifeCycleObserver);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void setUiData(@NotNull final Context context, @NotNull CardUiData uiParams) {
        g();
        getBinding().toolSleepAssistantPlay.setBackgroundColor(Color.parseColor("#4DFFFFFF"));
        getBinding().toolSleepAssistantPlay.setOnClickListener(new View.OnClickListener() { // from class: u07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepMusicRender.f(context, this, view);
            }
        });
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public LayoutToolSleepAssistantBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return LayoutToolSleepAssistantBinding.inflate(inflater, rootView, true);
    }
}
