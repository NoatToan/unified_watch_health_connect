package com.huami.thirdparty.webauth;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002Jm\u0010\u0012\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2Q\b\u0002\u0010\u0011\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bH\u0002Jk\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2Q\b\u0002\u0010\u0011\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bR\u001d\u0010\u0017\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/huami/thirdparty/webauth/ActivityResult;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/huami/thirdparty/webauth/ActivityResultFragment;", "c", "a", "Landroid/content/Intent;", "intent", "", "requestCode", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "resultCode", "data", "", "poster", GoogleApiAvailabilityLight.a, "start", "Lkotlin/Lazy;", "b", "()Lcom/huami/thirdparty/webauth/ActivityResultFragment;", "activityResultFragment", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "Companion", "webauth_release"}, k = 1, mv = {1, 4, 1})
public final class ActivityResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy activityResultFragment;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/thirdparty/webauth/ActivityResult$Companion;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/huami/thirdparty/webauth/ActivityResult;", JsonPOJOBuilder.DEFAULT_WITH_PREFIX, "<init>", "()V", "webauth_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final ActivityResult with(@NotNull FragmentActivity activity) {
            return new ActivityResult(activity);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/thirdparty/webauth/ActivityResultFragment;", "a", "()Lcom/huami/thirdparty/webauth/ActivityResultFragment;"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<ActivityResultFragment> {
        public final /* synthetic */ FragmentActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FragmentActivity fragmentActivity) {
            super(0);
            this.b = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ActivityResultFragment invoke() {
            return ActivityResult.this.c(this.b);
        }
    }

    public ActivityResult(@NotNull FragmentActivity fragmentActivity) {
        this.activityResultFragment = LazyKt__LazyJVMKt.lazy(new a(fragmentActivity));
    }

    private final ActivityResultFragment a(FragmentActivity activity) {
        Fragment fragmentFindFragmentByTag = activity.getSupportFragmentManager().findFragmentByTag(ActivityResultFragment.class.getName());
        if (fragmentFindFragmentByTag != null) {
            return (ActivityResultFragment) fragmentFindFragmentByTag;
        }
        return null;
    }

    private final ActivityResultFragment b() {
        return (ActivityResultFragment) this.activityResultFragment.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivityResultFragment c(FragmentActivity activity) {
        ActivityResultFragment activityResultFragmentA = a(activity);
        if (!(activityResultFragmentA == null)) {
            return activityResultFragmentA;
        }
        ActivityResultFragment activityResultFragment = new ActivityResultFragment();
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        supportFragmentManager.beginTransaction().add(activityResultFragment, ActivityResultFragment.class.getName()).commitAllowingStateLoss();
        supportFragmentManager.executePendingTransactions();
        return activityResultFragment;
    }

    private final void d(Intent intent, int requestCode, Function3<? super Integer, ? super Integer, ? super Intent, Unit> poster) {
        b().setPoster(poster);
        b().openForResult(intent, requestCode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(ActivityResult activityResult, Intent intent, int i, Function3 function3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            function3 = null;
        }
        activityResult.d(intent, i, function3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void start$default(ActivityResult activityResult, Intent intent, int i, Function3 function3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            function3 = null;
        }
        activityResult.start(intent, i, function3);
    }

    @JvmStatic
    @NotNull
    public static final ActivityResult with(@NotNull FragmentActivity fragmentActivity) {
        return INSTANCE.with(fragmentActivity);
    }

    public final void start(@NotNull Intent intent, int requestCode, @Nullable Function3<? super Integer, ? super Integer, ? super Intent, Unit> poster) {
        d(intent, requestCode, poster);
    }
}
