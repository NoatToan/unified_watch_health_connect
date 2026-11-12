package com.huami.phone_call.sms.base;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcherKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H$J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0014R\"\u0010\u000b\u001a\u00020\n8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/phone_call/sms/base/BaseNavFragment;", "Landroidx/fragment/app/Fragment;", "", "tag", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "onBackPressed", "Landroidx/activity/OnBackPressedCallback;", "backPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "getBackPressedCallback", "()Landroidx/activity/OnBackPressedCallback;", "setBackPressedCallback", "(Landroidx/activity/OnBackPressedCallback;)V", "Landroid/view/View;", "a", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "contentView", "<init>", "()V", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseNavFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private View contentView;
    public OnBackPressedCallback backPressedCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<OnBackPressedCallback, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull OnBackPressedCallback onBackPressedCallback) {
            if (BaseNavFragment.this.onBackPressed()) {
                return;
            }
            BaseNavFragment.this.getBackPressedCallback().setEnabled(false);
            BaseNavFragment.this.requireActivity().onBackPressed();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
            a(onBackPressedCallback);
            return Unit.INSTANCE;
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final OnBackPressedCallback getBackPressedCallback() {
        OnBackPressedCallback onBackPressedCallback = this.backPressedCallback;
        if (onBackPressedCallback != null) {
            return onBackPressedCallback;
        }
        return null;
    }

    @Nullable
    public final View getContentView() {
        return this.contentView;
    }

    public boolean onBackPressed() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBackPressedCallback(OnBackPressedDispatcherKt.addCallback$default(requireActivity().getOnBackPressedDispatcher(), this, false, new a(), 2, null));
    }

    public final void setBackPressedCallback(@NotNull OnBackPressedCallback onBackPressedCallback) {
        this.backPressedCallback = onBackPressedCallback;
    }

    public final void setContentView(@Nullable View view) {
        this.contentView = view;
    }

    @NotNull
    public abstract String tag();
}
