package com.mi.fitness.lpamanagement.di;

import android.content.Context;
import com.mi.fitness.lpamanagement.di.LpaManagementModule;
import com.mi.fitness.lpamanagement.export.LpaManagementHelper;
import com.mi.fitness.lpamanagement.ui.LpaManagementFragment;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import defpackage.azi;
import defpackage.dih;
import defpackage.umi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\t"}, d2 = {"Lcom/mi/fitness/lpamanagement/di/LpaManagementModule;", "", "<init>", "()V", "bindLpaManagementHelper", "Lcom/mi/fitness/lpamanagement/export/LpaManagementHelper;", "binder", "Lcom/mi/fitness/lpamanagement/di/LpaManagementHelperImpl;", "Companion", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LpaManagementModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u0007"}, d2 = {"Lcom/mi/fitness/lpamanagement/di/LpaManagementModule$Companion;", "", "<init>", "()V", "provideLpaManagementItem", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "createLpaManagementItem", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final TabContentItem createLpaManagementItem() {
            int i = umi.f35935a;
            String string = ApplicationExtKt.getApplication().getString(azi.g);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return new TabContentItem(11, 210, i, StringExtKt.toLiveData(string), null, false, null, StringExtKt.toLiveData(""), null, new Function1() { // from class: ave
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LpaManagementModule.Companion.createLpaManagementItem$lambda$0((Context) obj);
                }
            }, new Function1() { // from class: bve
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(LpaManagementModule.Companion.createLpaManagementItem$lambda$1((WearableDeviceModel) obj));
                }
            }, null, null, 6512, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createLpaManagementItem$lambda$0(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            dih.a().e(it, new FragmentParams.b().e(LpaManagementFragment.class).b());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean createLpaManagementItem$lambda$1(WearableDeviceModel TabContentItem) {
            Intrinsics.checkNotNullParameter(TabContentItem, "$this$TabContentItem");
            return DeviceModelExtKt.isSupportFeature(TabContentItem, Feature.ESIM);
        }

        @NotNull
        public final TabContentItem provideLpaManagementItem() {
            return createLpaManagementItem();
        }
    }

    @NotNull
    public abstract LpaManagementHelper bindLpaManagementHelper(@NotNull LpaManagementHelperImpl binder);
}
