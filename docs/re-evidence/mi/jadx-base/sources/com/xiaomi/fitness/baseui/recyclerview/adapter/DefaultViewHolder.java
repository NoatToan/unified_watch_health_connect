package com.xiaomi.fitness.baseui.recyclerview.adapter;

import android.view.View;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/adapter/DefaultViewHolder;", "T", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "bind", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "(Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultViewHolder<T> extends BaseViewHolder<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder
    public void bind(T t) {
        StringBuilder sb = new StringBuilder();
        sb.append("bind: ");
        sb.append(t);
    }
}
