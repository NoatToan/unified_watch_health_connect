package com.xiaomi.fitness.sport.view.tab.adapter;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductManager;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.sport.bean.LocalSportBean;
import com.xiaomi.fitness.sport.view.tab.adapter.Test;
import defpackage.c1j;
import defpackage.eoi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0007j\b\u0012\u0004\u0012\u00020\u0006`\u0005¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport/view/tab/adapter/Test;", "", "<init>", "()V", "buildEcoLocalSportList", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/sport/bean/LocalSportBean;", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Test {

    @NotNull
    public static final Test INSTANCE = new Test();

    private Test() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean buildEcoLocalSportList$lambda$0(EcoProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getModel(), "yesoul.exbike.jsc01y");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ArrayList<LocalSportBean> buildEcoLocalSportList() {
        ArrayList<LocalSportBean> arrayList = new ArrayList<>();
        LocalSportBean localSportBean = new LocalSportBean();
        localSportBean.setBackResource(eoi.d2);
        localSportBean.setLocalTitle(ApplicationExtKt.getApplication().getString(c1j.L1));
        localSportBean.setLocalSource("TREADMILL");
        localSportBean.setModel("ksmb.treadmill.m1v1");
        localSportBean.setEco(true);
        arrayList.add(localSportBean);
        EcoProduct ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: g5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(Test.buildEcoLocalSportList$lambda$0((EcoProduct) obj));
            }
        });
        LocalSportBean localSportBean2 = new LocalSportBean();
        localSportBean2.setBackResource(eoi.e2);
        localSportBean2.setLocalTitle(ApplicationExtKt.getApplication().getString(c1j.m1));
        localSportBean2.setLocalSource("SPINNING BIKE");
        localSportBean2.setModel("yesoul.exbike.jsc01y");
        localSportBean.setEco(true);
        if (ecoProduct != null) {
            arrayList.add(localSportBean2);
        }
        LocalSportBean localSportBean3 = new LocalSportBean();
        localSportBean3.setBackResource(eoi.P);
        localSportBean3.setLocalTitle(ApplicationExtKt.getApplication().getString(c1j.m2));
        localSportBean3.setLocalSource("JUMP ROPE");
        localSportBean3.setModel("yunmai.jmprope.sr803");
        localSportBean.setEco(true);
        arrayList.add(localSportBean3);
        return arrayList;
    }
}
