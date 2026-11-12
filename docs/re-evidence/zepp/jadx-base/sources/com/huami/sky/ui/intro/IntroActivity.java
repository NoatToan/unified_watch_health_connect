package com.huami.sky.ui.intro;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.ui.analytic.SkyPlayEventKt;
import com.huami.sky.ui.databinding.ActivitySkyIntroBinding;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.intro.IntroActivity;
import com.huami.sky.ui.intro.preference.SkyMusicPreferenceActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\u001d\u0010\r\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/sky/ui/intro/IntroActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "initViews", "g", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/sky/ui/databinding/ActivitySkyIntroBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "f", "()Lcom/huami/sky/ui/databinding/ActivitySkyIntroBinding;", "viewBinding", "<init>", "()V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class IntroActivity extends AppCompatActivity {
    public static final int INTRO_ENTER = 0;
    public static final long LAZY_ANIM_TIME = 2000;
    public static final int SCIENCE = 1;

    @NotNull
    private static final String c = "pageType";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding = ActivityViewBindingsKt.viewBinding(new IntroActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivitySkyIntroBinding.class)));
    public static final /* synthetic */ KProperty<Object>[] b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(IntroActivity.class), "viewBinding", "getViewBinding()Lcom/huami/sky/ui/databinding/ActivitySkyIntroBinding;"))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/sky/ui/intro/IntroActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", IntroActivity.c, "", WebConstant.QueryParam.LAUNCH, "INTRO_ENTER", LogUtil.I, "", "LAZY_ANIM_TIME", "J", "SCIENCE", "", "pageTypeKey", "Ljava/lang/String;", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, int pageType) {
            context.startActivity(new Intent(context, (Class<?>) IntroActivity.class).putExtra(IntroActivity.c, pageType));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivitySkyIntroBinding f() {
        return (ActivitySkyIntroBinding) this.viewBinding.getValue(this, b[0]);
    }

    private final void g() {
        ActivitySkyIntroBinding activitySkyIntroBindingF = f();
        f().headAnimationView.playAnimation();
        activitySkyIntroBindingF.introContent.setVisibility(0);
        f().titleBar.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(IntroActivity introActivity, View view) {
        introActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(IntroActivity introActivity) {
        introActivity.f().headAnimationView.playAnimation();
    }

    private final void initViews() {
        Integer numValueOf;
        Intent intent = getIntent();
        if (intent == null) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(intent.getIntExtra(c, 0));
            SkyPlayEventKt.recordEvent$default(SkyPlayEventKt.AIMUSIC_INTRO_V, String.valueOf(numValueOf.intValue()), null, null, null, 28, null);
        }
        f().titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: gh4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntroActivity.h(this.a, view);
            }
        });
        if (numValueOf != null && numValueOf.intValue() == 1) {
            g();
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: ih4
            @Override // java.lang.Runnable
            public final void run() {
                IntroActivity.i(this.a);
            }
        }, 2000L);
        f().headAnimationView.addAnimatorListener(new Animator.AnimatorListener() { // from class: com.huami.sky.ui.intro.IntroActivity.initViews.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@Nullable Animator animation) {
                IntroActivity.this.f().introContent.setVisibility(0);
                IntroActivity.this.f().enter.setVisibility(0);
                IntroActivity.this.f().titleBar.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@Nullable Animator animation) {
            }
        });
        f().enter.setOnClickListener(new View.OnClickListener() { // from class: hh4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntroActivity.j(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(IntroActivity introActivity, View view) {
        SkyPlayEventKt.recordEvent(SkyPlayEventKt.AIMUSIC_INTRO_C);
        introActivity.startActivity(new Intent(introActivity, (Class<?>) SkyMusicPreferenceActivity.class));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SkyExtKt.setLayoutFullScreen(getWindow());
        setContentView(f().getRoot());
        getLifecycle().addObserver(new SkyInitActivityObserver(this));
        initViews();
    }
}
