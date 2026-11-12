package com.xiaomi.fitness.baseui.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import com.xiaomi.fitness.baseui.view.ActionBarStateProvider;
import com.xiaomi.fitness.component.StandardComponentEvent;
import defpackage.lti;
import defpackage.wc0;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B#\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/baseui/view/ActionBarStateProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "initActionBar", "()V", "Landroid/os/Bundle;", "saveState", "()Landroid/os/Bundle;", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "Landroidx/savedstate/SavedStateRegistryOwner;", "mRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "Lwc0;", "actionBar", "Lwc0;", "getActionBar", "()Lwc0;", "setActionBar", "(Lwc0;)V", "", "mOriginResizeable", "Ljava/lang/Boolean;", "", "mOriginExpandState", "Ljava/lang/Integer;", "<init>", "(Landroid/content/Context;Landroidx/savedstate/SavedStateRegistryOwner;Lwc0;)V", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0})
public final class ActionBarStateProvider implements SavedStateRegistry.SavedStateProvider {

    @NotNull
    private static final String ORIGIN_EXPAND_STATE = "origin_expand_state";

    @NotNull
    private static final String ORIGIN_RESIZEABLE = "origin_resizeable";

    @NotNull
    private static final String PROVIDER = "actionbar_state_provider";

    @Nullable
    private wc0 actionBar;

    @NotNull
    private final Context mContext;

    @Nullable
    private Integer mOriginExpandState;

    @Nullable
    private Boolean mOriginResizeable;

    @NotNull
    private final SavedStateRegistryOwner mRegistryOwner;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ActionBarStateProvider(@NotNull Context mContext, @NotNull SavedStateRegistryOwner mRegistryOwner, @Nullable wc0 wc0Var) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mRegistryOwner, "mRegistryOwner");
        this.mContext = mContext;
        this.mRegistryOwner = mRegistryOwner;
        this.actionBar = wc0Var;
        mRegistryOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: pd0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ActionBarStateProvider._init_$lambda$0(this.f30277a, lifecycleOwner, event);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    public static final void _init_$lambda$0(ActionBarStateProvider this$0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Boolean boolValueOf;
        boolean zIsResizable;
        wc0 wc0Var;
        int expandState;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            this$0.mRegistryOwner.getSavedStateRegistry().registerSavedStateProvider(PROVIDER, this$0);
            return;
        }
        if (i != 2) {
            return;
        }
        Bundle bundleConsumeRestoredStateForKey = this$0.mRegistryOwner.getSavedStateRegistry().consumeRestoredStateForKey(PROVIDER);
        Integer numValueOf = null;
        if (bundleConsumeRestoredStateForKey == null) {
            wc0 wc0Var2 = this$0.actionBar;
            if (wc0Var2 != null) {
                zIsResizable = wc0Var2.isResizable();
            } else {
                boolValueOf = null;
            }
            this$0.mOriginResizeable = boolValueOf;
            if (bundleConsumeRestoredStateForKey != null) {
                wc0Var = this$0.actionBar;
                if (wc0Var != null) {
                    expandState = wc0Var.getExpandState();
                }
                this$0.mOriginExpandState = numValueOf;
                this$0.initActionBar();
            }
            expandState = bundleConsumeRestoredStateForKey.getInt(ORIGIN_EXPAND_STATE);
            numValueOf = Integer.valueOf(expandState);
            this$0.mOriginExpandState = numValueOf;
            this$0.initActionBar();
        }
        zIsResizable = bundleConsumeRestoredStateForKey.getBoolean(ORIGIN_RESIZEABLE);
        boolValueOf = Boolean.valueOf(zIsResizable);
        this$0.mOriginResizeable = boolValueOf;
        if (bundleConsumeRestoredStateForKey != null) {
            wc0Var = this$0.actionBar;
            if (wc0Var != null) {
                expandState = wc0Var.getExpandState();
            }
            this$0.mOriginExpandState = numValueOf;
            this$0.initActionBar();
        }
        expandState = bundleConsumeRestoredStateForKey.getInt(ORIGIN_EXPAND_STATE);
        numValueOf = Integer.valueOf(expandState);
        this$0.mOriginExpandState = numValueOf;
        this$0.initActionBar();
    }

    private final void initActionBar() {
        wc0 wc0Var = this.actionBar;
        if (wc0Var != null) {
            Intrinsics.checkNotNull(wc0Var);
            if (wc0Var.isShowing()) {
                wc0 wc0Var2 = this.actionBar;
                Intrinsics.checkNotNull(wc0Var2);
                Resources resources = this.mContext.getResources();
                int integer = resources.getInteger(lti.f25423a);
                wc0Var2.setResizable(true);
                if (integer > -1) {
                    wc0Var2.setExpandState(integer);
                } else {
                    Integer num = this.mOriginExpandState;
                    if (num != null) {
                        Intrinsics.checkNotNull(num);
                        wc0Var2.setExpandState(num.intValue());
                    }
                }
                int integer2 = resources.getInteger(lti.f25424b);
                if (integer2 == 0) {
                    wc0Var2.setResizable(false);
                    return;
                }
                if (integer2 == 1) {
                    wc0Var2.setResizable(true);
                    return;
                }
                Boolean bool = this.mOriginResizeable;
                if (bool != null) {
                    Intrinsics.checkNotNull(bool);
                    wc0Var2.setResizable(bool.booleanValue());
                }
            }
        }
    }

    @Nullable
    public final wc0 getActionBar() {
        return this.actionBar;
    }

    public final void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        initActionBar();
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    @NotNull
    public Bundle saveState() {
        return BundleKt.bundleOf(TuplesKt.to(ORIGIN_RESIZEABLE, this.mOriginResizeable), TuplesKt.to(ORIGIN_EXPAND_STATE, this.mOriginExpandState));
    }

    public final void setActionBar(@Nullable wc0 wc0Var) {
        this.actionBar = wc0Var;
    }

    public /* synthetic */ ActionBarStateProvider(Context context, SavedStateRegistryOwner savedStateRegistryOwner, wc0 wc0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, savedStateRegistryOwner, (i & 4) != 0 ? null : wc0Var);
    }
}
