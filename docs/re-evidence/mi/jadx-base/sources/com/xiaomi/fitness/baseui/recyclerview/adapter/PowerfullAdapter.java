package com.xiaomi.fitness.baseui.recyclerview.adapter;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/adapter/PowerfullAdapter;", "T", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseBindingAdapter;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PowerfullAdapter<T> extends BaseBindingAdapter<T> {
    /* JADX WARN: Multi-variable type inference failed */
    public PowerfullAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public PowerfullAdapter(@Nullable Lifecycle lifecycle) {
        super(lifecycle);
    }

    public /* synthetic */ PowerfullAdapter(Lifecycle lifecycle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lifecycle);
    }
}
