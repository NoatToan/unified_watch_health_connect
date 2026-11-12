package com.xiaomi.fitness.baseui.recyclerview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeFragment;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.gsi;
import defpackage.mvi;
import defpackage.n1j;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0007J\u0012\u0010\u0011\u001a\u00020\r2\b\b\u0003\u0010\u0012\u001a\u00020\u0007H\u0002J\u0012\u0010\u0013\u001a\u00020\r2\b\b\u0003\u0010\u0012\u001a\u00020\u0007H\u0002J\u0012\u0010\u0014\u001a\u00020\r2\b\b\u0003\u0010\u0012\u001a\u00020\u0007H\u0002J\u0012\u0010\u0015\u001a\u00020\r2\b\b\u0003\u0010\u0012\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/view/FooterView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mStateView", "Landroid/widget/TextView;", "updateState", "", "status", "Lcom/xiaomi/fitness/baseui/recyclerview/view/Status;", "textRes", "noMore", "text", HuamiUpgradeFragment.DONE_TAG, "fail", "loading", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FooterView extends ConstraintLayout {

    @NotNull
    private final TextView mStateView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.MORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Status.DONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FooterView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void done(int text) {
        this.mStateView.setText(text);
    }

    public static /* synthetic */ void done$default(FooterView footerView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = n1j.common_footer_more;
        }
        footerView.done(i);
    }

    private final void fail(int text) {
        this.mStateView.setText(text);
    }

    public static /* synthetic */ void fail$default(FooterView footerView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = n1j.common_load_fail;
        }
        footerView.fail(i);
    }

    private final void loading(int text) {
        this.mStateView.setText(text);
    }

    public static /* synthetic */ void loading$default(FooterView footerView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = n1j.C;
        }
        footerView.loading(i);
    }

    private final void noMore(int text) {
        this.mStateView.setText(text);
    }

    public static /* synthetic */ void noMore$default(FooterView footerView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = n1j.common_no_more;
        }
        footerView.noMore(i);
    }

    public final void updateState(@NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        Logger.d("FooterView", "updateState: " + status);
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            Logger.d("FooterView", "STATE_LOADING: ");
            updateState(status, n1j.C);
        } else if (i == 2) {
            updateState(status, n1j.common_load_fail);
            KotlinVersion.Companion companion = KotlinVersion.Companion;
        } else if (i == 3) {
            updateState(status, n1j.common_footer_more);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            updateState(status, n1j.common_no_more);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FooterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FooterView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(mvi.o, (ViewGroup) this, true);
        this.mStateView = (TextView) findViewById(gsi.f19300r);
        a aVar = new a();
        aVar.s(this);
        aVar.o(gsi.f19300r, 0);
        aVar.p(gsi.f19300r, 0);
        aVar.i(this);
    }

    public final void updateState(@NotNull Status status, int textRes) {
        Intrinsics.checkNotNullParameter(status, "status");
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            loading(textRes);
            return;
        }
        if (i == 2) {
            fail(textRes);
        } else if (i == 3) {
            done$default(this, 0, 1, null);
        } else {
            if (i == 4) {
                noMore$default(this, 0, 1, null);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ FooterView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
