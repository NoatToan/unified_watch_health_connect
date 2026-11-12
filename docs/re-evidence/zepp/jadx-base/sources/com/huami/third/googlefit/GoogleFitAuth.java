package com.huami.third.googlefit;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huami.watch.notification.TransportUri;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001f\u0010\u000b\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010\f\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tR\u001d\u0010\u0010\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/third/googlefit/GoogleFitAuth;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/huami/third/googlefit/GoogleFitAuthFragment;", "c", "a", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "googleSignIn", "requestFitPermissions", "Lkotlin/Lazy;", "b", "()Lcom/huami/third/googlefit/GoogleFitAuthFragment;", "googleFitAuthFragment", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "Companion", "googlefit_release"}, k = 1, mv = {1, 4, 1})
public final class GoogleFitAuth {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy googleFitAuthFragment;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/third/googlefit/GoogleFitAuth$Companion;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/huami/third/googlefit/GoogleFitAuth;", JsonPOJOBuilder.DEFAULT_WITH_PREFIX, "<init>", "()V", "googlefit_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final GoogleFitAuth with(@NotNull FragmentActivity activity) {
            return new GoogleFitAuth(activity);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/third/googlefit/GoogleFitAuthFragment;", "a", "()Lcom/huami/third/googlefit/GoogleFitAuthFragment;"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<GoogleFitAuthFragment> {
        public final /* synthetic */ FragmentActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FragmentActivity fragmentActivity) {
            super(0);
            this.b = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GoogleFitAuthFragment invoke() {
            return GoogleFitAuth.this.c(this.b);
        }
    }

    public GoogleFitAuth(@NotNull FragmentActivity fragmentActivity) {
        this.googleFitAuthFragment = LazyKt__LazyJVMKt.lazy(new a(fragmentActivity));
    }

    private final GoogleFitAuthFragment a(FragmentActivity activity) {
        Fragment fragmentFindFragmentByTag = activity.getSupportFragmentManager().findFragmentByTag(GoogleFitAuthFragment.class.getName());
        if (fragmentFindFragmentByTag != null) {
            return (GoogleFitAuthFragment) fragmentFindFragmentByTag;
        }
        return null;
    }

    private final GoogleFitAuthFragment b() {
        return (GoogleFitAuthFragment) this.googleFitAuthFragment.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GoogleFitAuthFragment c(FragmentActivity activity) {
        GoogleFitAuthFragment googleFitAuthFragmentA = a(activity);
        if (!(googleFitAuthFragmentA == null)) {
            return googleFitAuthFragmentA;
        }
        GoogleFitAuthFragment googleFitAuthFragment = new GoogleFitAuthFragment();
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        supportFragmentManager.beginTransaction().add(googleFitAuthFragment, GoogleFitAuthFragment.class.getName()).commitAllowingStateLoss();
        supportFragmentManager.executePendingTransactions();
        return googleFitAuthFragment;
    }

    @JvmStatic
    @NotNull
    public static final GoogleFitAuth with(@NotNull FragmentActivity fragmentActivity) {
        return INSTANCE.with(fragmentActivity);
    }

    @NotNull
    public final GoogleFitAuthFragment googleSignIn(@NotNull Function1<? super GoogleFitAuthFragment, Unit> block) {
        GoogleFitAuthFragment googleFitAuthFragmentB = b();
        block.invoke(googleFitAuthFragmentB);
        googleFitAuthFragmentB.signIn();
        return googleFitAuthFragmentB;
    }

    @NotNull
    public final GoogleFitAuthFragment requestFitPermissions(@NotNull Function1<? super GoogleFitAuthFragment, Unit> block) {
        GoogleFitAuthFragment googleFitAuthFragmentB = b();
        block.invoke(googleFitAuthFragmentB);
        googleFitAuthFragmentB.requestFitnessPermission();
        return googleFitAuthFragmentB;
    }
}
