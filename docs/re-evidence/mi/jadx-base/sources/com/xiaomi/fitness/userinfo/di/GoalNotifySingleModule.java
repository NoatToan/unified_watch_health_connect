package com.xiaomi.fitness.userinfo.di;

import android.content.Context;
import android.content.Intent;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.userinfo.di.GoalNotifySingleModule;
import com.xiaomi.fitness.userinfo.goal.GoalManagerActivity;
import defpackage.moi;
import defpackage.o1j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u008a\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\u001b\b\u0002\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012¢\u0006\u0002\b\u0017H\u0002¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/userinfo/di/GoalNotifySingleModule;", "", "<init>", "()V", "provideAlarmItem", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "createFeatureItem", "type", "", "icon", "title", Column.SUBTITLE, "more", "", "remind", "remindText", "", "onClickListener", "Lkotlin/Function1;", "Landroid/content/Context;", "", "itemVisible", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lkotlin/ExtensionFunctionType;", "(IIILjava/lang/Integer;ZZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GoalNotifySingleModule {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final TabContentItem createFeatureItem(int type, int icon, int title, Integer subtitle, boolean more, boolean remind, String remindText, Function1<? super Context, Unit> onClickListener, Function1<? super WearableDeviceModel, Boolean> itemVisible) {
        MutableLiveData<String> liveData;
        if (subtitle != null) {
            String string = ApplicationExtKt.getApplication().getString(subtitle.intValue());
            if (string != null) {
                liveData = StringExtKt.toLiveData(string);
            } else {
                liveData = null;
            }
        } else {
            liveData = null;
        }
        String string2 = ApplicationExtKt.getApplication().getString(title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new TabContentItem(11, type, icon, StringExtKt.toLiveData(string2), liveData, more, new ObservableBoolean(remind), remindText != null ? StringExtKt.toLiveData(remindText) : null, null, onClickListener, itemVisible, null, null, 6400, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabContentItem createFeatureItem$default(GoalNotifySingleModule goalNotifySingleModule, int i, int i2, int i3, Integer num, boolean z, boolean z2, String str, Function1 function1, Function1 function2, int i4, Object obj) {
        return goalNotifySingleModule.createFeatureItem(i, i2, i3, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? false : z2, (i4 & 64) != 0 ? null : str, (i4 & 128) != 0 ? null : function1, (i4 & 256) != 0 ? null : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideAlarmItem$lambda$1(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intent = new Intent(it, (Class<?>) GoalManagerActivity.class);
        intent.addFlags(268435456);
        it.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideAlarmItem$lambda$2(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(createFeatureItem.getDid()) & 8192) != 0;
    }

    @NotNull
    public final TabContentItem provideAlarmItem() {
        return createFeatureItem$default(this, 171, moi.j, o1j.a1, null, false, false, null, new Function1() { // from class: y1b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GoalNotifySingleModule.provideAlarmItem$lambda$1((Context) obj);
            }
        }, new Function1() { // from class: z1b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(GoalNotifySingleModule.provideAlarmItem$lambda$2((WearableDeviceModel) obj));
            }
        }, 120, null);
    }
}
