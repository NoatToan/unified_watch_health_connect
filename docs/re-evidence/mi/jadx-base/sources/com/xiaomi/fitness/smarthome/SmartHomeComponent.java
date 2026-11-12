package com.xiaomi.fitness.smarthome;

import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.smarthome.SmartHomeComponent;
import com.xiaomi.fitness.smarthome.mijiasdk.NetUtils;
import com.xiaomi.fitness.smarthome.mijiasdk.bean.GetHomeBean;
import com.xiaomi.fitness.smarthome.mijiasdk.bean.HomeBean;
import com.xiaomi.fitness.smarthome.mijiasdk.bean.RoomBean;
import com.xiaomi.fitness.smarthome.mijiasdk.bean.SceneBean;
import com.xiaomi.fitness.smarthome.utils.DeviceModelsKt;
import com.xiaomi.onetrack.OneTrack;
import defpackage.h4b;
import defpackage.hcp;
import defpackage.jcp;
import defpackage.n2n;
import defpackage.s7r;
import defpackage.wjg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0007R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/smarthome/SmartHomeComponent;", "", "<init>", "()V", "smartHomeHadnler", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "getSmartHomeHadnler", "()Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "smartHomeHadnler$delegate", "Lkotlin/Lazy;", "initDeviceProcess", "", "SmartHomeHadnler", "smarthome_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "米家一键执行")
public final class SmartHomeComponent {

    /* JADX INFO: renamed from: smartHomeHadnler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy smartHomeHadnler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: m2n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SmartHomeComponent.smartHomeHadnler_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/smarthome/SmartHomeComponent$SmartHomeHadnler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "Ls7r;", "packet", "", "handle", "(Ls7r;)Z", "", "execute", "(Ls7r;)V", "requestSceneByHomeId", "requestHomeListAndSync", "()V", "", "did", "", "type", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "<init>", "smarthome_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class SmartHomeHadnler extends DataHandlerWrapper {
        private final void execute(s7r packet) {
            jcp jcpVarF;
            hcp.c.a aVarU;
            if (packet == null || (jcpVarF = packet.F()) == null || (aVarU = jcpVarF.u()) == null) {
                n2n.a("execute request param sceneExcutor is null");
                return;
            }
            n2n.c("execute id:" + aVarU.c + " type:" + aVarU.d);
            NetUtils.sendPostRequest$default(NetUtils.INSTANCE, "/appsceneservice/AppSceneService/NewRunScene", MapsKt__MapsKt.mutableMapOf(TuplesKt.to("scene_id", Long.valueOf(aVarU.c)), TuplesKt.to("scene_type", Integer.valueOf(aVarU.d))), new wjg() { // from class: com.xiaomi.fitness.smarthome.SmartHomeComponent$SmartHomeHadnler$execute$1$1
                @Override // defpackage.wjg
                public void onFailed(String errorInfo) {
                    n2n.a("execute errorInfo:" + errorInfo);
                    DeviceModelsKt.executeResult(false);
                }

                @Override // defpackage.wjg
                public void onSuccess(String json) {
                    n2n.c("execute json:" + json);
                    Object objE = h4b.e(json, new TypeToken<BaseResult<Boolean>>() { // from class: com.xiaomi.fitness.smarthome.SmartHomeComponent$SmartHomeHadnler$execute$1$1$onSuccess$resultBean$1
                    }.getType());
                    Intrinsics.checkNotNullExpressionValue(objE, "toObject(...)");
                    DeviceModelsKt.executeResult(Intrinsics.areEqual(((BaseResult) objE).getResult(), Boolean.TRUE));
                }
            }, null, 8, null);
        }

        private final boolean handle(s7r packet) {
            Integer numValueOf = packet != null ? Integer.valueOf(packet.f) : null;
            if (numValueOf != null && numValueOf.intValue() == 12) {
                requestHomeListAndSync();
                return true;
            }
            if (numValueOf != null && numValueOf.intValue() == 14) {
                requestSceneByHomeId(packet);
                return true;
            }
            if (numValueOf == null || numValueOf.intValue() != 16) {
                return false;
            }
            execute(packet);
            return true;
        }

        private final void requestHomeListAndSync() {
            NetUtils.sendPostRequest$default(NetUtils.INSTANCE, "/homeroom/gethome", MapsKt__MapsKt.mutableMapOf(TuplesKt.to("limit", 10), TuplesKt.to("fetch_share", Boolean.TRUE), TuplesKt.to("fetch_share_dev", Boolean.FALSE), TuplesKt.to(OneTrack.Param.APP_VER, 7)), new wjg() { // from class: com.xiaomi.fitness.smarthome.SmartHomeComponent$SmartHomeHadnler$requestHomeListAndSync$1
                @Override // defpackage.wjg
                public void onFailed(String errorInfo) {
                    n2n.a("requestMyHomes errorInfo:" + errorInfo);
                }

                @Override // defpackage.wjg
                public void onSuccess(String json) {
                    ArrayList<HomeBean> homelist;
                    ArrayList<HomeBean> homelist2;
                    Object objE = h4b.e(json, new TypeToken<BaseResult<GetHomeBean>>() { // from class: com.xiaomi.fitness.smarthome.SmartHomeComponent$SmartHomeHadnler$requestHomeListAndSync$1$onSuccess$resultBean$1
                    }.getType());
                    Intrinsics.checkNotNullExpressionValue(objE, "toObject(...)");
                    BaseResult baseResult = (BaseResult) objE;
                    GetHomeBean getHomeBean = (GetHomeBean) baseResult.getResult();
                    n2n.c("requestMyHomes json:" + json + " size:" + ((getHomeBean == null || (homelist2 = getHomeBean.getHomelist()) == null) ? null : Integer.valueOf(homelist2.size())));
                    GetHomeBean getHomeBean2 = (GetHomeBean) baseResult.getResult();
                    if (getHomeBean2 == null || (homelist = getHomeBean2.getHomelist()) == null) {
                        return;
                    }
                    DeviceModelsKt.syncHomeList(homelist);
                }
            }, null, 8, null);
        }

        private final void requestSceneByHomeId(s7r packet) {
            jcp jcpVarF;
            final hcp.c.C0953c c0953cW;
            if (packet == null || (jcpVarF = packet.F()) == null || (c0953cW = jcpVarF.w()) == null) {
                n2n.a("requestSceneByHomeId request param scene is null");
                return;
            }
            n2n.c("requestSceneByHomeId homeId:" + c0953cW.c + " uid:" + c0953cW.d);
            NetUtils.sendPostRequest$default(NetUtils.INSTANCE, "/appsceneservice/AppSceneService/GetSpeedySceneList", MapsKt__MapsKt.mutableMapOf(TuplesKt.to("home_id", Long.valueOf(c0953cW.c)), TuplesKt.to("terminal_type", 5), TuplesKt.to("need_recommended_template", Boolean.FALSE), TuplesKt.to("owner_uid", Long.valueOf(c0953cW.d))), new wjg() { // from class: com.xiaomi.fitness.smarthome.SmartHomeComponent$SmartHomeHadnler$requestSceneByHomeId$1$1
                @Override // defpackage.wjg
                public void onFailed(String errorInfo) {
                    n2n.a("requestScenesByHomeId errorInfo:" + errorInfo);
                }

                @Override // defpackage.wjg
                public void onSuccess(String json) {
                    n2n.c("requestScenesByHomeId json:" + json);
                    ArrayList arrayList = new ArrayList();
                    Object objE = h4b.e(json, new TypeToken<BaseResult<ArrayList<RoomBean>>>() { // from class: com.xiaomi.fitness.smarthome.SmartHomeComponent$SmartHomeHadnler$requestSceneByHomeId$1$1$onSuccess$resultBean$1
                    }.getType());
                    Intrinsics.checkNotNullExpressionValue(objE, "toObject(...)");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList2 = (ArrayList) ((BaseResult) objE).getResult();
                    if (arrayList2 != null) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            ArrayList<SceneBean> common_use_scene_list = ((RoomBean) it.next()).getCommon_use_scene_list();
                            if (common_use_scene_list != null) {
                                for (SceneBean sceneBean : common_use_scene_list) {
                                    linkedHashMap.put(Long.valueOf(sceneBean.getScene_id()), sceneBean);
                                }
                            }
                        }
                    }
                    Collection collectionValues = linkedHashMap.values();
                    Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                    arrayList.addAll(CollectionsKt___CollectionsKt.take(collectionValues, 15));
                    DeviceModelsKt.syncScene(arrayList, c0953cW.c);
                }
            }, null, 8, null);
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            n2n.c("SmartHomeHadnler handlePacket " + type + " " + (packet != null ? Integer.valueOf(packet.f) : null));
            if (type == 20) {
                return handle(packet);
            }
            return false;
        }
    }

    private final DataHandlerWrapper getSmartHomeHadnler() {
        return (DataHandlerWrapper) this.smartHomeHadnler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SmartHomeHadnler smartHomeHadnler_delegate$lambda$0() {
        return new SmartHomeHadnler();
    }

    @ComponentTask(notEarlierThan = 4, notLaterThan = 4, processName = ":device")
    public final void initDeviceProcess() {
        n2n.c("SmartHomeHadnler initDeviceProcess");
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(20, getSmartHomeHadnler());
    }
}
