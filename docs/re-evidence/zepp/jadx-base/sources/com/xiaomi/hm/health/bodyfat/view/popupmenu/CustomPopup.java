package com.xiaomi.hm.health.bodyfat.view.popupmenu;

import android.content.Context;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0013\u0014B\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u000fB\u0013\b\u0016\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u001c\u0010\u0007\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0014J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/view/popupmenu/CustomPopup;", "Lcom/xiaomi/hm/health/bodyfat/view/popupmenu/BasePopup;", "", "initAttributes", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "popup", "initViews", "Lcom/xiaomi/hm/health/bodyfat/view/popupmenu/CustomPopup$OnViewListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnViewListener", "E", "Lcom/xiaomi/hm/health/bodyfat/view/popupmenu/CustomPopup$OnViewListener;", "mOnViewListener", "<init>", "()V", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "(Landroid/content/Context;)V", "Companion", "OnViewListener", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class CustomPopup extends BasePopup<CustomPopup> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    private OnViewListener mOnViewListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/view/popupmenu/CustomPopup$Companion;", "", "Lcom/xiaomi/hm/health/bodyfat/view/popupmenu/CustomPopup;", "create", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CustomPopup create() {
            return new CustomPopup();
        }

        @NotNull
        public final CustomPopup create(@Nullable Context context) {
            return new CustomPopup(context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/view/popupmenu/CustomPopup$OnViewListener;", "", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Lcom/xiaomi/hm/health/bodyfat/view/popupmenu/CustomPopup;", "popup", "", "initViews", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public interface OnViewListener {
        void initViews(@Nullable View view, @Nullable CustomPopup popup);
    }

    public CustomPopup() {
    }

    @Override // com.xiaomi.hm.health.bodyfat.view.popupmenu.BasePopup
    public void initAttributes() {
    }

    @NotNull
    public final CustomPopup setOnViewListener(@Nullable OnViewListener listener) {
        this.mOnViewListener = listener;
        return this;
    }

    public CustomPopup(@Nullable Context context) {
        setContext(context);
    }

    @Override // com.xiaomi.hm.health.bodyfat.view.popupmenu.BasePopup
    public void initViews(@Nullable View view, @Nullable CustomPopup popup) {
        OnViewListener onViewListener = this.mOnViewListener;
        if (onViewListener != null) {
            onViewListener.initViews(view, popup);
        }
    }
}
