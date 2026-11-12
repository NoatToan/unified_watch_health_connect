package com.xiaomi.fitness.baseui.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.AbsViewModel;
import defpackage.gsi;
import defpackage.mvi;
import defpackage.rv1;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\fJ(\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/baseui/view/BaseSpringBackBindingFragment;", "VM", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "VDB", "Landroidx/databinding/ViewDataBinding;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "contentLayoutId", "", "viewModelId", "<init>", "(II)V", "()V", "(I)V", "onInflateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseSpringBackBindingFragment<VM extends AbsViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {
    public BaseSpringBackBindingFragment(int i, int i2) {
        super(i, i2);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewInflate;
        if (getLayoutId() == -1) {
            throw new IllegalArgumentException("The layoutId must be passed in the constructor or override layoutId");
        }
        if (inflater == null || (viewInflate = inflater.inflate(mvi.d, container, false)) == null) {
            return null;
        }
        setRootView(viewInflate);
        setMBinding(binding(inflater, getLayoutId(), container));
        ((ViewGroup) viewInflate.findViewById(gsi.Z)).addView(getMBinding().getRoot());
        return viewInflate;
    }

    public BaseSpringBackBindingFragment() {
        this(-1);
    }

    public BaseSpringBackBindingFragment(int i) {
        this(i, rv1.f32936a);
    }
}
