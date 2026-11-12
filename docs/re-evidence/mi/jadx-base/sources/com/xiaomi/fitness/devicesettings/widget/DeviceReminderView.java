package com.xiaomi.fitness.devicesettings.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.al6;
import defpackage.eui;
import defpackage.jni;
import defpackage.sk5;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/widget/DeviceReminderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "type", "", "setType", "(I)V", "Lal6;", "dataBinding", "Lal6;", "getDataBinding", "()Lal6;", "setDataBinding", "(Lal6;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceReminderView extends ConstraintLayout {

    @NotNull
    private al6 dataBinding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public DeviceReminderView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final al6 getDataBinding() {
        return this.dataBinding;
    }

    public final void setDataBinding(@NotNull al6 al6Var) {
        Intrinsics.checkNotNullParameter(al6Var, "<set-?>");
        this.dataBinding = al6Var;
    }

    public final void setType(int type) {
        if (type == 2) {
            this.dataBinding.A.setText(ResourceExtKt.getString(wzi.o3));
        } else if (type != 3) {
            this.dataBinding.A.setText(ResourceExtKt.getString(wzi.m3));
        } else {
            this.dataBinding.A.setText(ResourceExtKt.getString(wzi.n3));
        }
    }

    public /* synthetic */ DeviceReminderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceReminderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dataBinding = (al6) sk5.j(LayoutInflater.from(context), eui.s1, this, true);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Product product = wearableDeviceModel != null ? wearableDeviceModel.getProduct() : null;
        Integer numValueOf = product != null ? Integer.valueOf(DeviceModelExtKt.getDeviceScreenShapeType(product)) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            i = jni.V0;
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            i = jni.U0;
        } else {
            i = (numValueOf != null && numValueOf.intValue() == 3) ? jni.W0 : jni.V0;
        }
        this.dataBinding.E.setImageResource(i);
    }
}
