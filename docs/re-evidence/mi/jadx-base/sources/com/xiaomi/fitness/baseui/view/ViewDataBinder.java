package com.xiaomi.fitness.baseui.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.AbsViewModel;
import defpackage.sk5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J)\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\rJ\u0015\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\u0012*\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/baseui/view/ViewDataBinder;", "VM", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "VDB", "Landroidx/databinding/ViewDataBinding;", "", "binding", "inflater", "Landroid/view/LayoutInflater;", "layoutId", "", "container", "Landroid/view/ViewGroup;", "(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;)Landroidx/databinding/ViewDataBinding;", "view", "Landroid/view/View;", "(Landroid/view/View;)Landroidx/databinding/ViewDataBinding;", "bindView", "", "(Landroidx/databinding/ViewDataBinding;)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ViewDataBinder<VM extends AbsViewModel, VDB extends ViewDataBinding> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <VM extends AbsViewModel, VDB extends ViewDataBinding> void bindView(@NotNull ViewDataBinder<VM, VDB> viewDataBinder, @NotNull VDB receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
        }

        @NotNull
        public static <VM extends AbsViewModel, VDB extends ViewDataBinding> VDB binding(@NotNull ViewDataBinder<VM, VDB> viewDataBinder, @NotNull LayoutInflater inflater, int i, @Nullable ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            VDB vdb = (VDB) sk5.j(inflater, i, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(vdb, "inflate(...)");
            return vdb;
        }

        @NotNull
        public static <VM extends AbsViewModel, VDB extends ViewDataBinding> VDB binding(@NotNull ViewDataBinder<VM, VDB> viewDataBinder, @NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            VDB vdb = (VDB) sk5.c(view);
            Intrinsics.checkNotNull(vdb);
            return vdb;
        }
    }

    void bindView(@NotNull VDB vdb);

    @NotNull
    VDB binding(@NotNull LayoutInflater inflater, int layoutId, @Nullable ViewGroup container);

    @NotNull
    VDB binding(@NotNull View view);
}
