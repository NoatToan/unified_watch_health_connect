package com.xiaomi.fitness.ubox_guide.ui.fragment;

import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.ubox_guide.ui.fragment.DoneFragment;
import defpackage.g6q;
import defpackage.lvi;
import defpackage.n8q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0007¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/ubox_guide/ui/fragment/DoneFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/ubox_guide/ui/fragment/TempViewModel;", "Ln8q;", "", "bindView", "(Ln8q;)V", "onVisible", "()V", "<init>", "Companion", "ubox-guide_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDoneFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoneFragment.kt\ncom/xiaomi/fitness/ubox_guide/ui/fragment/DoneFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class DoneFragment extends BaseBindingFragment<TempViewModel, n8q> {

    @NotNull
    public static final String sBgAnimation = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/oobe/done/bgAnimationV1.json";

    public DoneFragment() {
        super(lvi.f25474b);
    }

    public static final /* synthetic */ n8q access$getMBinding(DoneFragment doneFragment) {
        return doneFragment.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(DoneFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            MainExtKt.showMainActivity(mActivity, null, bundle);
        }
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onVisible$lambda$2(DoneFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), Dispatchers.getIO(), null, new DoneFragment$onVisible$1$1(this$0, null), 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull n8q n8qVar) {
        Intrinsics.checkNotNullParameter(n8qVar, "<this>");
        hideBack();
        setTitle("");
        n8qVar.A.setOnClickListener(new View.OnClickListener() { // from class: i17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DoneFragment.bindView$lambda$1(this.f20660a, view);
            }
        });
        getMBinding().C.setRepeatCount(0);
        getMBinding().C.i(new Animator.AnimatorListener() { // from class: com.xiaomi.fitness.ubox_guide.ui.fragment.DoneFragment.bindView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                g6q.b("DoneFragment onAnimationEnd");
                DoneFragment.access$getMBinding(DoneFragment.this).C.setVisibility(4);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                g6q.b("DoneFragment onAnimationRepeat");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                g6q.b("DoneFragment onAnimationStart");
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        getMBinding().B.getDownloadAllResult().observe(this, new DoneFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: h17
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DoneFragment.onVisible$lambda$2(this.f19566a, (Boolean) obj);
            }
        }));
    }
}
