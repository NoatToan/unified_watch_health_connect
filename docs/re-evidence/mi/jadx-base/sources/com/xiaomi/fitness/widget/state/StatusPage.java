package com.xiaomi.fitness.widget.state;

import android.R;
import android.app.Activity;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.state.adapter.NoNetworkAdapter;
import com.xiaomi.fitness.widget.state.adapter.NothingAdapter;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 62\u00020\u0001:\t6789:;<=>B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0012\u0010\u001c\u001a\u00020\u00192\n\u0010\u001d\u001a\u00020\u001e\"\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0012\u0010!\u001a\u00020\u00192\n\u0010\"\u001a\u00020\u001e\"\u00020\u001fJ\f\u0010#\u001a\u00020\u0003*\u00020\u001bH\u0002J\u001a\u0010$\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001f2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0016J\u000e\u0010&\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010'\u001a\u00020\u00192\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)H\u0007J\u0014\u0010*\u001a\u00020\u00192\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)H\u0007J\u0014\u0010+\u001a\u00020\u00192\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)H\u0007J\u0014\u0010,\u001a\u00020\u00192\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)H\u0007J\u0014\u0010-\u001a\u00020\u00192\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)H\u0007J\u001c\u0010.\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)H\u0007J\u0010\u0010/\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001fH\u0002J\u0016\u00100\u001a\u00020\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0002J\u0010\u00101\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001fH\u0002J%\u00102\u001a\u0002H3\"\u0010\b\u0000\u00103*\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00162\u0006\u0010\u001d\u001a\u00020\u001f¢\u0006\u0002\u00104J\u0010\u00105\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/widget/state/StatusPage;", "", "contentView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "value", "decorView", "getDecorView", "()Landroid/view/View;", "contentParent", "Landroid/view/ViewGroup;", "parent", "currentViewHolder", "Lcom/xiaomi/fitness/widget/state/StatusPage$ViewHolder;", "onReloadListener", "Lcom/xiaomi/fitness/widget/state/StatusPage$OnReloadListener;", "adapters", "Landroid/util/SparseArray;", "Lcom/xiaomi/fitness/widget/state/StatusPage$Adapter;", "viewHolders", "setDecorAdapter", "", "decorAdapter", "Lcom/xiaomi/fitness/widget/state/StatusPage$DecorAdapter;", "setDecorHeader", "viewType", "", "", "addChildDecorAdapter", "addChildDecorHeader", "viewTypes", "createDecorView", LoginPreferenceConfig.TYPE_REGISTER, "adapter", "setOnReloadListener", "showLoadingView", "animation", "Lcom/xiaomi/fitness/widget/state/StatusPage$Animation;", "showContentView", "showErrorView", "showEmptyView", "showNoNetworkView", "showView", "addView", "notifyDataSetChanged", "getViewHolder", "getAdapter", "T", "(I)Lcom/xiaomi/fitness/widget/state/StatusPage$Adapter;", "addViewHolder", "Companion", "Adapter", "ContentAdapter", "ViewHolder", "DecorAdapter", "LinearDecorAdapter", "OnReloadListener", "Animation", "AdapterPool", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStatusPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusPage.kt\ncom/xiaomi/fitness/widget/state/StatusPage\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n1#1,341:1\n310#2:342\n326#2,4:343\n311#2:347\n76#3,4:348\n*S KotlinDebug\n*F\n+ 1 StatusPage.kt\ncom/xiaomi/fitness/widget/state/StatusPage\n*L\n232#1:342\n232#1:343,4\n232#1:347\n242#1:348,4\n*E\n"})
public final class StatusPage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int STATUS_EMPTY_DATA = 4;
    public static final int STATUS_LOADING = 1;
    public static final int STATUS_LOAD_FAILED = 3;
    public static final int STATUS_LOAD_SUCCESS = 2;
    public static final int STATUS_NO_NETWORK = 5;

    @Nullable
    private static Function1<? super AdapterPool, Unit> adapterPool;

    @NotNull
    private SparseArray<Adapter<?>> adapters;
    private ViewGroup contentParent;

    @NotNull
    private final View contentView;

    @Nullable
    private ViewHolder currentViewHolder;
    private View decorView;

    @Nullable
    private OnReloadListener onReloadListener;

    @Nullable
    private final ViewGroup parent;

    @NotNull
    private final SparseArray<ViewHolder> viewHolders;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u000bR;\u0010\u0006\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/widget/state/StatusPage$Adapter;", "VH", "Lcom/xiaomi/fitness/widget/state/StatusPage$ViewHolder;", "", "<init>", "()V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "adapter", "", "getListener$widget_release", "()Lkotlin/jvm/functions/Function1;", "setListener$widget_release", "(Lkotlin/jvm/functions/Function1;)V", "onCreateViewHolder", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/xiaomi/fitness/widget/state/StatusPage$ViewHolder;", "onBindViewHolder", "holder", "(Lcom/xiaomi/fitness/widget/state/StatusPage$ViewHolder;)V", "notifyDataSetChanged", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Adapter<VH extends ViewHolder> {
        public Function1<? super Adapter<ViewHolder>, Unit> listener;

        @NotNull
        public final Function1<Adapter<ViewHolder>, Unit> getListener$widget_release() {
            Function1 function1 = this.listener;
            if (function1 != null) {
                return function1;
            }
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            return null;
        }

        public final void notifyDataSetChanged() {
            Function1<Adapter<ViewHolder>, Unit> listener$widget_release = getListener$widget_release();
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.xiaomi.fitness.widget.state.StatusPage.Adapter<com.xiaomi.fitness.widget.state.StatusPage.ViewHolder>");
            listener$widget_release.invoke2(this);
        }

        public abstract void onBindViewHolder(@NotNull VH holder);

        @NotNull
        public abstract VH onCreateViewHolder(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent);

        public final void setListener$widget_release(@NotNull Function1<? super Adapter<ViewHolder>, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.listener = function1;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/widget/state/StatusPage$AdapterPool;", "", "statusPage", "Lcom/xiaomi/fitness/widget/state/StatusPage;", "<init>", "(Lcom/xiaomi/fitness/widget/state/StatusPage;)V", LoginPreferenceConfig.TYPE_REGISTER, "", "viewType", "", "adapter", "Lcom/xiaomi/fitness/widget/state/StatusPage$Adapter;", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AdapterPool {

        @NotNull
        private final StatusPage statusPage;

        public AdapterPool(@NotNull StatusPage statusPage) {
            Intrinsics.checkNotNullParameter(statusPage, "statusPage");
            this.statusPage = statusPage;
        }

        public final void register(int viewType, @NotNull Adapter<?> adapter) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.statusPage.register(viewType, adapter);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/widget/state/StatusPage$Animation;", "", "onStartShowAnimation", "", "view", "Landroid/view/View;", "viewType", "onStartHideAnimation", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Animation {
        void onStartHideAnimation(@NotNull View view, @NotNull Object viewType);

        void onStartShowAnimation(@NotNull View view, @NotNull Object viewType);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u000f\u001a\u00020\r2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R!\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/widget/state/StatusPage$Companion;", "", "<init>", "()V", "STATUS_LOADING", "", "STATUS_LOAD_SUCCESS", "STATUS_LOAD_FAILED", "STATUS_EMPTY_DATA", "STATUS_NO_NETWORK", "adapterPool", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/widget/state/StatusPage$AdapterPool;", "", "Lkotlin/ExtensionFunctionType;", "setDefaultAdapterPool", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void setDefaultAdapterPool(@NotNull Function1<? super AdapterPool, Unit> adapterPool) {
            Intrinsics.checkNotNullParameter(adapterPool, "adapterPool");
            Logger.i("StatusPage", "setDefaultAdapterPool: ");
            StatusPage.adapterPool = adapterPool;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/widget/state/StatusPage$ContentAdapter;", "Lcom/xiaomi/fitness/widget/state/StatusPage$Adapter;", "Lcom/xiaomi/fitness/widget/state/StatusPage$ViewHolder;", "<init>", "(Lcom/xiaomi/fitness/widget/state/StatusPage;)V", "onCreateViewHolder", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "", "holder", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ContentAdapter extends Adapter<ViewHolder> {
        public ContentAdapter() {
        }

        @Override // com.xiaomi.fitness.widget.state.StatusPage.Adapter
        public void onBindViewHolder(@NotNull ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
        }

        @Override // com.xiaomi.fitness.widget.state.StatusPage.Adapter
        @NotNull
        public ViewHolder onCreateViewHolder(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new ViewHolder(StatusPage.this.contentView);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/widget/state/StatusPage$DecorAdapter;", "", "<init>", "()V", "onCreateDecorView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "getContentParent", "Landroid/view/ViewGroup;", "decorView", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class DecorAdapter {
        @NotNull
        public abstract ViewGroup getContentParent(@NotNull View decorView);

        @NotNull
        public abstract View onCreateDecorView(@NotNull LayoutInflater inflater);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/widget/state/StatusPage$LinearDecorAdapter;", "Lcom/xiaomi/fitness/widget/state/StatusPage$DecorAdapter;", "views", "", "Landroid/view/View;", "<init>", "(Ljava/util/List;)V", "contentParent", "Landroid/widget/FrameLayout;", "onCreateDecorView", "Landroid/widget/LinearLayout;", "inflater", "Landroid/view/LayoutInflater;", "getContentParent", "decorView", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nStatusPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusPage.kt\ncom/xiaomi/fitness/widget/state/StatusPage$LinearDecorAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,341:1\n1863#2,2:342\n*S KotlinDebug\n*F\n+ 1 StatusPage.kt\ncom/xiaomi/fitness/widget/state/StatusPage$LinearDecorAdapter\n*L\n317#1:342,2\n*E\n"})
    public static final class LinearDecorAdapter extends DecorAdapter {
        private FrameLayout contentParent;

        @NotNull
        private final List<View> views;

        /* JADX WARN: Multi-variable type inference failed */
        public LinearDecorAdapter(@NotNull List<? extends View> views) {
            Intrinsics.checkNotNullParameter(views, "views");
            this.views = views;
        }

        @Override // com.xiaomi.fitness.widget.state.StatusPage.DecorAdapter
        @NotNull
        public FrameLayout getContentParent(@NotNull View decorView) {
            Intrinsics.checkNotNullParameter(decorView, "decorView");
            FrameLayout frameLayout = this.contentParent;
            if (frameLayout != null) {
                return frameLayout;
            }
            Intrinsics.throwUninitializedPropertyAccessException("contentParent");
            return null;
        }

        @Override // com.xiaomi.fitness.widget.state.StatusPage.DecorAdapter
        @NotNull
        public LinearLayout onCreateDecorView(@NotNull LayoutInflater inflater) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            LinearLayout linearLayout = new LinearLayout(inflater.getContext());
            linearLayout.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(inflater.getContext());
            this.contentParent = frameLayout;
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Iterator<T> it = this.views.iterator();
            while (it.hasNext()) {
                linearLayout.addView((View) it.next());
            }
            FrameLayout frameLayout2 = this.contentParent;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentParent");
                frameLayout2 = null;
            }
            linearLayout.addView(frameLayout2);
            return linearLayout;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/widget/state/StatusPage$OnReloadListener;", "", "onReload", "", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnReloadListener {
        void onReload();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/widget/state/StatusPage$ViewHolder;", "", "rootView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getRootView", "()Landroid/view/View;", "viewType", "", "getViewType$widget_release", "()Ljava/lang/Integer;", "setViewType$widget_release", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "value", "Lcom/xiaomi/fitness/widget/state/StatusPage$OnReloadListener;", "onReloadListener", "getOnReloadListener", "()Lcom/xiaomi/fitness/widget/state/StatusPage$OnReloadListener;", "setOnReloadListener$widget_release", "(Lcom/xiaomi/fitness/widget/state/StatusPage$OnReloadListener;)V", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class ViewHolder {

        @Nullable
        private OnReloadListener onReloadListener;

        @NotNull
        private final View rootView;

        @Nullable
        private Integer viewType;

        public ViewHolder(@NotNull View rootView) {
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            this.rootView = rootView;
        }

        @Nullable
        public final OnReloadListener getOnReloadListener() {
            return this.onReloadListener;
        }

        @NotNull
        public final View getRootView() {
            return this.rootView;
        }

        @Nullable
        /* JADX INFO: renamed from: getViewType$widget_release, reason: from getter */
        public final Integer getViewType() {
            return this.viewType;
        }

        public final void setOnReloadListener$widget_release(@Nullable OnReloadListener onReloadListener) {
            this.onReloadListener = onReloadListener;
        }

        public final void setViewType$widget_release(@Nullable Integer num) {
            this.viewType = num;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.widget.state.StatusPage$addViewHolder$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Adapter<ViewHolder>, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, StatusPage.class, "notifyDataSetChanged", "notifyDataSetChanged(Lcom/xiaomi/fitness/widget/state/StatusPage$Adapter;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Adapter<ViewHolder> adapter) {
            invoke2(adapter);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Adapter<ViewHolder> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((StatusPage) this.receiver).notifyDataSetChanged(p0);
        }
    }

    public StatusPage(@NotNull View contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
        this.parent = (ViewGroup) contentView.getParent();
        this.adapters = new SparseArray<>();
        this.viewHolders = new SparseArray<>();
        Function1<? super AdapterPool, Unit> function1 = adapterPool;
        if (function1 != null) {
            function1.invoke2(new AdapterPool(this));
            Logger.i("StatusPage", "adapterPool: ");
        }
        register(2, new ContentAdapter());
        register(4, new NothingAdapter());
        register(5, new NoNetworkAdapter());
        setDecorAdapter(new LinearDecorAdapter(CollectionsKt__CollectionsKt.emptyList()));
    }

    private final void addView(int viewType) {
        ViewHolder viewHolder = getViewHolder(viewType);
        View rootView = viewHolder.getRootView();
        if (rootView.getParent() != null) {
            ViewParent parent = rootView.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(rootView);
        }
        if ((this.parent instanceof ConstraintLayout) && viewType == 2) {
            ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            if (rootView.getMeasuredWidth() == 0) {
                layoutParams.width = -1;
            }
            if (rootView.getMeasuredHeight() == 0) {
                layoutParams.height = -1;
            }
            rootView.setLayoutParams(layoutParams);
        }
        ViewGroup viewGroup = this.contentParent;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentParent");
            viewGroup = null;
        }
        viewGroup.addView(rootView);
        this.currentViewHolder = viewHolder;
    }

    private final void addViewHolder(int viewType) {
        Adapter adapter = getAdapter(viewType);
        ViewGroup viewGroup = this.contentParent;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentParent");
            viewGroup = null;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        ViewGroup viewGroup3 = this.contentParent;
        if (viewGroup3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentParent");
        } else {
            viewGroup2 = viewGroup3;
        }
        ViewHolder viewHolderOnCreateViewHolder = adapter.onCreateViewHolder(layoutInflaterFrom, viewGroup2);
        viewHolderOnCreateViewHolder.setViewType$widget_release(Integer.valueOf(viewType));
        viewHolderOnCreateViewHolder.setOnReloadListener$widget_release(this.onReloadListener);
        this.viewHolders.put(viewType, viewHolderOnCreateViewHolder);
        adapter.onBindViewHolder(viewHolderOnCreateViewHolder);
        adapter.setListener$widget_release(new AnonymousClass1(this));
    }

    private final View createDecorView(DecorAdapter decorAdapter) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.contentView.getContext());
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        View viewOnCreateDecorView = decorAdapter.onCreateDecorView(layoutInflaterFrom);
        if (this.contentView.getLayoutParams() != null) {
            viewOnCreateDecorView.setLayoutParams(this.contentView.getLayoutParams());
        }
        return viewOnCreateDecorView;
    }

    private final ViewHolder getViewHolder(int viewType) {
        if (this.viewHolders.get(viewType) == null) {
            addViewHolder(viewType);
        }
        ViewHolder viewHolder = this.viewHolders.get(viewType);
        Intrinsics.checkNotNull(viewHolder, "null cannot be cast to non-null type com.xiaomi.fitness.widget.state.StatusPage.ViewHolder");
        return viewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyDataSetChanged(Adapter<ViewHolder> adapter) {
        SparseArray<Adapter<?>> sparseArray = this.adapters;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            if (Intrinsics.areEqual(sparseArray.valueAt(i), adapter)) {
                adapter.onBindViewHolder(getViewHolder(iKeyAt));
            }
        }
    }

    @JvmStatic
    public static final void setDefaultAdapterPool(@NotNull Function1<? super AdapterPool, Unit> function1) {
        INSTANCE.setDefaultAdapterPool(function1);
    }

    public static /* synthetic */ void showContentView$default(StatusPage statusPage, Animation animation, int i, Object obj) {
        if ((i & 1) != 0) {
            animation = null;
        }
        statusPage.showContentView(animation);
    }

    public static /* synthetic */ void showEmptyView$default(StatusPage statusPage, Animation animation, int i, Object obj) {
        if ((i & 1) != 0) {
            animation = null;
        }
        statusPage.showEmptyView(animation);
    }

    public static /* synthetic */ void showErrorView$default(StatusPage statusPage, Animation animation, int i, Object obj) {
        if ((i & 1) != 0) {
            animation = null;
        }
        statusPage.showErrorView(animation);
    }

    public static /* synthetic */ void showLoadingView$default(StatusPage statusPage, Animation animation, int i, Object obj) {
        if ((i & 1) != 0) {
            animation = null;
        }
        statusPage.showLoadingView(animation);
    }

    public static /* synthetic */ void showNoNetworkView$default(StatusPage statusPage, Animation animation, int i, Object obj) {
        if ((i & 1) != 0) {
            animation = null;
        }
        statusPage.showNoNetworkView(animation);
    }

    public static /* synthetic */ void showView$default(StatusPage statusPage, int i, Animation animation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animation = null;
        }
        statusPage.showView(i, animation);
    }

    public final void addChildDecorAdapter(@NotNull DecorAdapter decorAdapter) {
        Intrinsics.checkNotNullParameter(decorAdapter, "decorAdapter");
        ViewGroup viewGroup = this.contentParent;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentParent");
            viewGroup = null;
        }
        ViewHolder viewHolder = this.currentViewHolder;
        viewGroup.removeView(viewHolder != null ? viewHolder.getRootView() : null);
        this.currentViewHolder = null;
        View viewCreateDecorView = createDecorView(decorAdapter);
        ViewGroup viewGroup2 = this.contentParent;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentParent");
            viewGroup2 = null;
        }
        viewGroup2.addView(viewCreateDecorView);
        this.contentParent = decorAdapter.getContentParent(viewCreateDecorView);
        showView$default(this, 2, null, 2, null);
    }

    public final void addChildDecorHeader(@NotNull int... viewTypes) {
        Intrinsics.checkNotNullParameter(viewTypes, "viewTypes");
        ArrayList arrayList = new ArrayList();
        for (int i : viewTypes) {
            arrayList.add(getViewHolder(i).getRootView());
        }
        addChildDecorAdapter(new LinearDecorAdapter(arrayList));
    }

    @NotNull
    public final <T extends Adapter<? extends ViewHolder>> T getAdapter(int viewType) {
        Adapter<?> adapter = this.adapters.get(viewType);
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type T of com.xiaomi.fitness.widget.state.StatusPage.getAdapter");
        return (T) adapter;
    }

    @NotNull
    public final View getDecorView() {
        View view = this.decorView;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("decorView");
        return null;
    }

    public final void register(int viewType, @NotNull Adapter<?> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Logger.i("register status(" + viewType + ") adapter", new Object[0]);
        this.adapters.put(viewType, adapter);
    }

    public final void setDecorAdapter(@NotNull DecorAdapter decorAdapter) {
        Intrinsics.checkNotNullParameter(decorAdapter, "decorAdapter");
        this.currentViewHolder = null;
        ViewGroup viewGroup = this.parent;
        if (viewGroup != null) {
            int iIndexOfChild = viewGroup.indexOfChild(this.contentView);
            if (iIndexOfChild >= 0) {
                this.parent.removeView(this.contentView);
            } else {
                this.parent.removeView(getDecorView());
                ViewParent parent = this.contentView.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(this.contentView);
            }
            this.decorView = createDecorView(decorAdapter);
            this.parent.addView(getDecorView(), iIndexOfChild);
        } else {
            this.decorView = createDecorView(decorAdapter);
        }
        this.contentParent = decorAdapter.getContentParent(getDecorView());
        showView$default(this, 2, null, 2, null);
    }

    public final void setDecorHeader(@NotNull int... viewType) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        ArrayList arrayList = new ArrayList();
        for (int i : viewType) {
            arrayList.add(getViewHolder(i).getRootView());
        }
        setDecorAdapter(new LinearDecorAdapter(arrayList));
    }

    public final void setOnReloadListener(@NotNull OnReloadListener onReloadListener) {
        Intrinsics.checkNotNullParameter(onReloadListener, "onReloadListener");
        this.onReloadListener = onReloadListener;
    }

    @JvmOverloads
    public final void showContentView() {
        showContentView$default(this, null, 1, null);
    }

    @JvmOverloads
    public final void showEmptyView() {
        showEmptyView$default(this, null, 1, null);
    }

    @JvmOverloads
    public final void showErrorView() {
        showErrorView$default(this, null, 1, null);
    }

    @JvmOverloads
    public final void showLoadingView() {
        showLoadingView$default(this, null, 1, null);
    }

    @JvmOverloads
    public final void showNoNetworkView() {
        showNoNetworkView$default(this, null, 1, null);
    }

    @JvmOverloads
    public final void showView(int i) {
        showView$default(this, i, null, 2, null);
    }

    @JvmOverloads
    public final void showContentView(@Nullable Animation animation) {
        showView(2, animation);
    }

    @JvmOverloads
    public final void showEmptyView(@Nullable Animation animation) {
        showView(4, animation);
    }

    @JvmOverloads
    public final void showErrorView(@Nullable Animation animation) {
        showEmptyView(animation);
    }

    @JvmOverloads
    public final void showLoadingView(@Nullable Animation animation) {
        showView(1, animation);
    }

    @JvmOverloads
    public final void showNoNetworkView(@Nullable Animation animation) {
        showView(5, animation);
    }

    @JvmOverloads
    public final void showView(int viewType, @Nullable Animation animation) {
        ViewHolder viewHolder = this.currentViewHolder;
        if (viewHolder == null) {
            addView(viewType);
            return;
        }
        if (this.viewHolders.get(viewType) == null) {
            addView(viewType);
        }
        Integer viewType2 = viewHolder.getViewType();
        if (viewType2 != null && viewType == viewType2.intValue()) {
            return;
        }
        ViewHolder viewHolder2 = getViewHolder(viewType);
        ViewExtKt.visible(viewHolder2.getRootView());
        if (animation != null) {
            View rootView = viewHolder.getRootView();
            Integer viewType3 = viewHolder.getViewType();
            Intrinsics.checkNotNull(viewType3);
            animation.onStartHideAnimation(rootView, viewType3);
            View rootView2 = viewHolder2.getRootView();
            Integer viewType4 = viewHolder2.getViewType();
            Intrinsics.checkNotNull(viewType4);
            animation.onStartShowAnimation(rootView2, viewType4);
        } else {
            ViewExtKt.gone(viewHolder.getRootView());
        }
        this.currentViewHolder = viewHolder2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StatusPage(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View childAt = ((ViewGroup) activity.findViewById(R.id.content)).getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
        this(childAt);
    }
}
