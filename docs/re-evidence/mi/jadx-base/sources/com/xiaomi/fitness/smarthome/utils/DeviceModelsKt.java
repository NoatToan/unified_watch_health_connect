package com.xiaomi.fitness.smarthome.utils;

import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.smarthome.mijiasdk.bean.HomeBean;
import com.xiaomi.fitness.smarthome.mijiasdk.bean.SceneBean;
import defpackage.h4b;
import defpackage.hcp;
import defpackage.jcp;
import defpackage.n2n;
import defpackage.s7r;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"syncHomeList", "", "list", "", "Lcom/xiaomi/fitness/smarthome/mijiasdk/bean/HomeBean;", "syncScene", "Lcom/xiaomi/fitness/smarthome/mijiasdk/bean/SceneBean;", "homeId", "", "executeResult", "isSuccess", "", "smarthome_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceModelsKt {
    public static final void executeResult(boolean z) {
        s7r s7rVar = new s7r();
        s7rVar.e = 20;
        s7rVar.f = 17;
        jcp jcpVar = new jcp();
        hcp.c.d dVar = new hcp.c.d();
        dVar.c = z;
        jcpVar.I(dVar);
        s7rVar.d0(jcpVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 14, null);
    }

    public static final void syncHomeList(@NotNull List<HomeBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        s7r s7rVar = new s7r();
        s7rVar.e = 20;
        s7rVar.f = 13;
        jcp jcpVar = new jcp();
        hcp.a aVar = new hcp.a();
        int size = list.size();
        hcp[] hcpVarArr = new hcp[size];
        for (int i = 0; i < size; i++) {
            hcp hcpVar = new hcp();
            HomeBean homeBean = list.get(i);
            hcpVar.c = homeBean.getId();
            hcpVar.e = homeBean.getName();
            hcpVar.d = homeBean.getUid();
            Unit unit = Unit.INSTANCE;
            hcpVarArr[i] = hcpVar;
        }
        aVar.c = hcpVarArr;
        jcpVar.G(aVar);
        s7rVar.d0(jcpVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 14, null);
    }

    public static final void syncScene(@NotNull List<SceneBean> list, long j) {
        Intrinsics.checkNotNullParameter(list, "list");
        n2n.c("requestScenesByHomeId syncScene list.size:" + list.size());
        s7r s7rVar = new s7r();
        s7rVar.e = 20;
        s7rVar.f = 15;
        jcp jcpVar = new jcp();
        hcp.c.b bVar = new hcp.c.b();
        int size = list.size();
        hcp.c[] cVarArr = new hcp.c[size];
        for (int i = 0; i < size; i++) {
            hcp.c cVar = new hcp.c();
            SceneBean sceneBean = list.get(i);
            cVar.c = sceneBean.getScene_id();
            cVar.d = sceneBean.getScene_name();
            cVar.e = sceneBean.getScene_type();
            cVar.f = sceneBean.getTemplate_id();
            Unit unit = Unit.INSTANCE;
            cVarArr[i] = cVar;
        }
        bVar.d = cVarArr;
        bVar.c = j;
        jcpVar.H(bVar);
        n2n.c("requestScenesByHomeId syncScene sync watch json:" + h4b.c(jcpVar.v()));
        s7rVar.d0(jcpVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 14, null);
    }
}
