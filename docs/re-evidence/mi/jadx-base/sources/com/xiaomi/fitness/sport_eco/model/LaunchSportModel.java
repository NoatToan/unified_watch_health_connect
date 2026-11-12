package com.xiaomi.fitness.sport_eco.model;

import android.content.res.Resources;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseModel;
import com.xiaomi.fit.data.common.data.sport.SportSummary;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.SportSummaryApi;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerWrapper;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.sport_eco.bean.BaseSportItemBean;
import com.xiaomi.fitness.sport_eco.bean.CourseRecommendBean;
import com.xiaomi.fitness.sport_eco.bean.LaunchViewBean;
import com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt;
import com.xiaomi.fitness.sport_eco.interfaces.ISportDataListener;
import com.xiaomi.fitness.sport_eco.model.LaunchSportModel;
import com.xiaomi.hm.health.bt.sdk.ISportHrCallback;
import defpackage.ayi;
import defpackage.e1j;
import defpackage.u7r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002@AB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u000208H\u0002J\b\u0010:\u001a\u000208H\u0002J\u0006\u0010;\u001a\u000208J\u0006\u0010<\u001a\u000208J\b\u0010=\u001a\u000208H\u0002J\u0006\u0010>\u001a\u000208J\u0006\u0010?\u001a\u000208R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u001a\u0010!\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/model/LaunchSportModel;", "Lcom/xiaomi/fitness/sport_eco/model/SportModel;", "", "Lcom/xiaomi/fitness/sport_eco/bean/BaseSportItemBean;", "<init>", "()V", "sportTitle", "", "getSportTitle", "()Ljava/lang/String;", "setSportTitle", "(Ljava/lang/String;)V", "list", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "deviceData", "Lcom/xiaomi/fitness/sport_eco/model/LaunchSportModel$EcoDataHandlerImpl;", "getDeviceData", "()Lcom/xiaomi/fitness/sport_eco/model/LaunchSportModel$EcoDataHandlerImpl;", "setDeviceData", "(Lcom/xiaomi/fitness/sport_eco/model/LaunchSportModel$EcoDataHandlerImpl;)V", "weatherImg", "", "getWeatherImg", "()Ljava/lang/Integer;", "setWeatherImg", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "weatherStr", "getWeatherStr", "setWeatherStr", "weatherTemperature", "getWeatherTemperature", "setWeatherTemperature", "weatherRefresh", "", "getWeatherRefresh", "()Z", "setWeatherRefresh", "(Z)V", "headData", "Lcom/xiaomi/fitness/sport_eco/bean/LaunchViewBean;", "getHeadData", "()Lcom/xiaomi/fitness/sport_eco/bean/LaunchViewBean;", "setHeadData", "(Lcom/xiaomi/fitness/sport_eco/bean/LaunchViewBean;)V", "heartHr", "getHeartHr", "()I", "setHeartHr", "(I)V", "firstCollect", "courseFlag", "refresh", "", "reqCourseRecommend", "buildHeadData", "registerDeviceHr", "unRegisterDeviceHr", "refreshHr", "init", "destroy", "EcoDataHandlerImpl", "HuamiHrImpl", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LaunchSportModel extends SportModel<List<BaseSportItemBean>> {
    private final boolean courseFlag;
    private int heartHr;

    @Nullable
    private String sportTitle;

    @Nullable
    private Integer weatherImg;
    private boolean weatherRefresh;

    @NotNull
    private List<BaseSportItemBean> list = new ArrayList();

    @NotNull
    private EcoDataHandlerImpl deviceData = new EcoDataHandlerImpl();

    @NotNull
    private String weatherStr = "";

    @NotNull
    private String weatherTemperature = "";

    @NotNull
    private LaunchViewBean headData = new LaunchViewBean();
    private boolean firstCollect = true;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/model/LaunchSportModel$EcoDataHandlerImpl;", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDataHandlerWrapper;", "", "did", "", "type", "Lu7r;", "packet", "", "handleEcoPacket", "(Ljava/lang/String;ILu7r;)Z", "hr", "I", "getHr", "()I", "setHr", "(I)V", "<init>", "(Lcom/xiaomi/fitness/sport_eco/model/LaunchSportModel;)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class EcoDataHandlerImpl extends EcoDataHandlerWrapper {
        private int hr;

        public EcoDataHandlerImpl() {
        }

        public final int getHr() {
            return this.hr;
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerWrapper, com.xiaomi.fitness.eco.device.contact.export.EcoDataHandler
        public boolean handleEcoPacket(@NotNull String did, int type, @Nullable u7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            if (type != 8 || packet == null || packet.r().o() == null) {
                return false;
            }
            int i = packet.r().o().f;
            this.hr = i;
            LaunchSportModel.this.setHeartHr(i);
            LaunchSportModel.this.refreshHr();
            return false;
        }

        public final void setHr(int i) {
            this.hr = i;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/model/LaunchSportModel$HuamiHrImpl;", "Lcom/xiaomi/hm/health/bt/sdk/ISportHrCallback;", "<init>", "(Lcom/xiaomi/fitness/sport_eco/model/LaunchSportModel;)V", "onHeartRateChanged", "", "mHr", "", "onOpen", "bool", "", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class HuamiHrImpl implements ISportHrCallback {
        public HuamiHrImpl() {
        }

        @Override // com.xiaomi.hm.health.bt.sdk.ISportHrCallback
        public void onHeartRateChanged(int mHr) {
            LaunchSportModel.this.setHeartHr(mHr);
            LaunchSportModel.this.refreshHr();
        }

        @Override // com.xiaomi.hm.health.bt.sdk.ISportHrCallback
        public void onOpen(boolean bool) {
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.model.LaunchSportModel$buildHeadData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.model.LaunchSportModel$buildHeadData$1", f = "LaunchSportModel.kt", i = {}, l = {108, 115, 122}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LaunchSportModel.this.new AnonymousClass1(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:50:0x0109  */
        /* JADX WARN: Code duplicated, block: B:51:0x0134  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SportSummary sportSummary;
            SportSummary.SummaryData summaryData;
            int i;
            SportSummary sportSummary2;
            SportSummary.SummaryData summaryData2;
            SportSummary sportSummary3;
            SportSummary.SummaryData summaryData3;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    sportSummary = (SportSummary) obj;
                    if (sportSummary == null && (summaryData = sportSummary.info) != null) {
                        i = summaryData.total_distance;
                    }
                    if (i < 1000) {
                        LaunchSportModel.this.getHeadData().setDistance(i);
                        LaunchSportModel.this.getHeadData().setUnit(ApplicationExtKt.getApplication().getResources().getQuantityString(ayi.o, LaunchSportModel.this.getHeadData().getDistance()));
                    } else {
                        LaunchSportModel.this.getHeadData().setDistance(i / 1000);
                        LaunchSportModel.this.getHeadData().setUnit(ApplicationExtKt.getApplication().getResources().getQuantityString(ayi.n, LaunchSportModel.this.getHeadData().getDistance()));
                    }
                    LaunchSportModel.this.getHeadData().setWeatherTemperature(LaunchSportModel.this.getWeatherTemperature());
                    LaunchSportModel.this.getHeadData().setWeatherRefresh(LaunchSportModel.this.getWeatherRefresh());
                    LaunchSportModel.this.setWeatherRefresh(false);
                    return Unit.INSTANCE;
                }
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    sportSummary2 = (SportSummary) obj;
                    if (sportSummary2 == null && (summaryData2 = sportSummary2.info) != null) {
                        i = summaryData2.total_distance;
                    }
                    if (i < 1000) {
                        LaunchSportModel.this.getHeadData().setDistance(i);
                        LaunchSportModel.this.getHeadData().setUnit(ApplicationExtKt.getApplication().getResources().getQuantityString(ayi.o, LaunchSportModel.this.getHeadData().getDistance()));
                    } else {
                        LaunchSportModel.this.getHeadData().setDistance(i / 1000);
                        LaunchSportModel.this.getHeadData().setUnit(ApplicationExtKt.getApplication().getResources().getQuantityString(ayi.n, LaunchSportModel.this.getHeadData().getDistance()));
                    }
                    LaunchSportModel.this.getHeadData().setWeatherTemperature(LaunchSportModel.this.getWeatherTemperature());
                    LaunchSportModel.this.getHeadData().setWeatherRefresh(LaunchSportModel.this.getWeatherRefresh());
                    LaunchSportModel.this.setWeatherRefresh(false);
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                sportSummary3 = (SportSummary) obj;
                if (sportSummary3 == null && (summaryData3 = sportSummary3.info) != null) {
                    i = summaryData3.total_distance;
                }
                if (i < 1000) {
                    LaunchSportModel.this.getHeadData().setDistance(i);
                    LaunchSportModel.this.getHeadData().setUnit(ApplicationExtKt.getApplication().getResources().getQuantityString(ayi.o, LaunchSportModel.this.getHeadData().getDistance()));
                } else {
                    LaunchSportModel.this.getHeadData().setDistance(i / 1000);
                    LaunchSportModel.this.getHeadData().setUnit(ApplicationExtKt.getApplication().getResources().getQuantityString(ayi.n, LaunchSportModel.this.getHeadData().getDistance()));
                }
                LaunchSportModel.this.getHeadData().setWeatherTemperature(LaunchSportModel.this.getWeatherTemperature());
                LaunchSportModel.this.getHeadData().setWeatherRefresh(LaunchSportModel.this.getWeatherRefresh());
                LaunchSportModel.this.setWeatherRefresh(false);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LaunchSportModel.this.refreshHr();
            LaunchSportModel.this.getHeadData().setWeatherStr(LaunchSportModel.this.getWeatherStr());
            if (LaunchSportModel.this.getWeatherImg() != null) {
                LaunchViewBean headData = LaunchSportModel.this.getHeadData();
                Integer weatherImg = LaunchSportModel.this.getWeatherImg();
                Intrinsics.checkNotNull(weatherImg);
                headData.setWeatherImg(weatherImg.intValue());
            }
            int sportType = LaunchSportModel.this.getSportType();
            if (sportType != 1) {
                if (sportType == 2) {
                    LaunchSportModel.this.getHeadData().setTitle(AppUtil.getApp().getResources().getString(e1j.S4));
                    SportSummaryApi sportSummaryApi = FitnessDataExtKt.getSportSummaryApi();
                    this.label = 3;
                    obj = sportSummaryApi.getTotalSummary("walking", this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportSummary3 = (SportSummary) obj;
                    if (sportSummary3 == null) {
                    }
                    if (i < 1000) {
                        LaunchSportModel.this.getHeadData().setDistance(i);
                        LaunchSportModel.this.getHeadData().setUnit(ApplicationExtKt.getApplication().getResources().getQuantityString(ayi.o, LaunchSportModel.this.getHeadData().getDistance()));
                    } else {
                        LaunchSportModel.this.getHeadData().setDistance(i / 1000);
                        LaunchSportModel.this.getHeadData().setUnit(ApplicationExtKt.getApplication().getResources().getQuantityString(ayi.n, LaunchSportModel.this.getHeadData().getDistance()));
                    }
                    LaunchSportModel.this.getHeadData().setWeatherTemperature(LaunchSportModel.this.getWeatherTemperature());
                    LaunchSportModel.this.getHeadData().setWeatherRefresh(LaunchSportModel.this.getWeatherRefresh());
                    LaunchSportModel.this.setWeatherRefresh(false);
                    return Unit.INSTANCE;
                }
                if (sportType != 3) {
                    if (sportType == 6 || sportType == 7) {
                        LaunchSportModel.this.getHeadData().setTitle(AppUtil.getApp().getResources().getString(e1j.t0));
                        SportSummaryApi sportSummaryApi2 = FitnessDataExtKt.getSportSummaryApi();
                        this.label = 2;
                        obj = sportSummaryApi2.getTotalSummary("outdoor_riding", this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sportSummary2 = (SportSummary) obj;
                        if (sportSummary2 == null) {
                        }
                    }
                    if (i < 1000) {
                        LaunchSportModel.this.getHeadData().setDistance(i);
                        LaunchSportModel.this.getHeadData().setUnit(ApplicationExtKt.getApplication().getResources().getQuantityString(ayi.o, LaunchSportModel.this.getHeadData().getDistance()));
                    } else {
                        LaunchSportModel.this.getHeadData().setDistance(i / 1000);
                        LaunchSportModel.this.getHeadData().setUnit(ApplicationExtKt.getApplication().getResources().getQuantityString(ayi.n, LaunchSportModel.this.getHeadData().getDistance()));
                    }
                    LaunchSportModel.this.getHeadData().setWeatherTemperature(LaunchSportModel.this.getWeatherTemperature());
                    LaunchSportModel.this.getHeadData().setWeatherRefresh(LaunchSportModel.this.getWeatherRefresh());
                    LaunchSportModel.this.setWeatherRefresh(false);
                    return Unit.INSTANCE;
                }
            }
            LaunchSportModel.this.getHeadData().setTitle(AppUtil.getApp().getResources().getString(e1j.W3));
            SportSummaryApi sportSummaryApi3 = FitnessDataExtKt.getSportSummaryApi();
            this.label = 1;
            obj = sportSummaryApi3.getTotalSummary("running", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            sportSummary = (SportSummary) obj;
            if (sportSummary == null) {
            }
            if (i < 1000) {
                LaunchSportModel.this.getHeadData().setDistance(i);
                LaunchSportModel.this.getHeadData().setUnit(ApplicationExtKt.getApplication().getResources().getQuantityString(ayi.o, LaunchSportModel.this.getHeadData().getDistance()));
            } else {
                LaunchSportModel.this.getHeadData().setDistance(i / 1000);
                LaunchSportModel.this.getHeadData().setUnit(ApplicationExtKt.getApplication().getResources().getQuantityString(ayi.n, LaunchSportModel.this.getHeadData().getDistance()));
            }
            LaunchSportModel.this.getHeadData().setWeatherTemperature(LaunchSportModel.this.getWeatherTemperature());
            LaunchSportModel.this.getHeadData().setWeatherRefresh(LaunchSportModel.this.getWeatherRefresh());
            LaunchSportModel.this.setWeatherRefresh(false);
            return Unit.INSTANCE;
            i = 0;
            if (i < 1000) {
                LaunchSportModel.this.getHeadData().setDistance(i);
                LaunchSportModel.this.getHeadData().setUnit(ApplicationExtKt.getApplication().getResources().getQuantityString(ayi.o, LaunchSportModel.this.getHeadData().getDistance()));
            } else {
                LaunchSportModel.this.getHeadData().setDistance(i / 1000);
                LaunchSportModel.this.getHeadData().setUnit(ApplicationExtKt.getApplication().getResources().getQuantityString(ayi.n, LaunchSportModel.this.getHeadData().getDistance()));
            }
            LaunchSportModel.this.getHeadData().setWeatherTemperature(LaunchSportModel.this.getWeatherTemperature());
            LaunchSportModel.this.getHeadData().setWeatherRefresh(LaunchSportModel.this.getWeatherRefresh());
            LaunchSportModel.this.setWeatherRefresh(false);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.model.LaunchSportModel$init$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.model.LaunchSportModel$init$1", f = "LaunchSportModel.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
    public static final class C31181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C31181(Continuation<? super C31181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LaunchSportModel.this.new C31181(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Integer> flowObserverRecentCount = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE).observerRecentCount(CourseApiKt.getCOURSE_TAG_TIME_SEC());
                final LaunchSportModel launchSportModel = LaunchSportModel.this;
                FlowCollector<? super Integer> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.sport_eco.model.LaunchSportModel.init.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(int i2, Continuation<? super Unit> continuation) {
                        Logger.i("CourseRecommend", "Launch report count = " + i2 + " , first = " + launchSportModel.firstCollect);
                        if (launchSportModel.firstCollect) {
                            launchSportModel.firstCollect = false;
                        } else {
                            launchSportModel.reqCourseRecommend();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowObserverRecentCount.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.model.LaunchSportModel$reqCourseRecommend$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.model.LaunchSportModel$reqCourseRecommend$1", f = "LaunchSportModel.kt", i = {1}, l = {67, 75}, m = "invokeSuspend", n = {"page"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nLaunchSportModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchSportModel.kt\ncom/xiaomi/fitness/sport_eco/model/LaunchSportModel$reqCourseRecommend$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n388#2,7:229\n*S KotlinDebug\n*F\n+ 1 LaunchSportModel.kt\ncom/xiaomi/fitness/sport_eco/model/LaunchSportModel$reqCourseRecommend$1\n*L\n81#1:229,7\n*E\n"})
    public static final class C31191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C31191(Continuation<? super C31191> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$1(BaseSportItemBean baseSportItemBean) {
            return baseSportItemBean instanceof CourseRecommendBean;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LaunchSportModel.this.new C31191(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x007d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            List<CourseModel.CourseData> list;
            int iNextIndex;
            ISportDataListener<List<BaseSportItemBean>> iSportDataListener;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                CourseModel.CourseListData courseListData = (CourseModel.CourseListData) obj;
                List<CourseModel.CourseData> list2 = courseListData != null ? courseListData.courseList : null;
                list = list2;
                if (list != null || list.isEmpty()) {
                    return Unit.INSTANCE;
                }
                List<BaseSportItemBean> list3 = LaunchSportModel.this.getList();
                ListIterator<BaseSportItemBean> listIterator = list3.listIterator(list3.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    }
                    if (listIterator.previous() instanceof LaunchViewBean) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                CollectionsKt__MutableCollectionsKt.removeAll((List) LaunchSportModel.this.getList(), new Function1() { // from class: com.xiaomi.fitness.sport_eco.model.a
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return Boolean.valueOf(LaunchSportModel.C31191.invokeSuspend$lambda$1((BaseSportItemBean) obj2));
                    }
                });
                LaunchSportModel.this.getList().add(iNextIndex + 1, new CourseRecommendBean(list2, CourseApiKt.getCourseScene(str2, "more"), LaunchSportModel.this.getSportTitle()));
                WeakReference<ISportDataListener<List<BaseSportItemBean>>> weak = LaunchSportModel.this.getWeak();
                if (weak != null && (iSportDataListener = weak.get()) != null) {
                    iSportDataListener.onSuccess(LaunchSportModel.this.getList());
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            LaunchSportModel$reqCourseRecommend$1$tag$1 launchSportModel$reqCourseRecommend$1$tag$1 = new LaunchSportModel$reqCourseRecommend$1$tag$1(LaunchSportModel.this, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, launchSportModel$reqCourseRecommend$1$tag$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            String str3 = (String) obj;
            int sportType = LaunchSportModel.this.getSportType();
            if (sportType == 1) {
                str = CourseApiKt.COURSE_PAGE_OUTDOOR_RUN;
            } else if (sportType == 3) {
                str = CourseApiKt.COURSE_PAGE_INDOOR_RUN;
            } else if (sportType != 6) {
                str = sportType != 7 ? CourseApiKt.COURSE_PAGE_OUTDOOR_WALK : CourseApiKt.COURSE_PAGE_INDOOR_BIKING;
            } else {
                str = CourseApiKt.COURSE_PAGE_OUTDOOR_BIKING;
            }
            CourseApi courseApi = CourseApiKt.getCourseApi();
            String courseScene = CourseApiKt.getCourseScene(str, str3);
            int i2 = SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand() ? 3 : 2;
            this.L$0 = str;
            this.label = 2;
            obj = courseApi.getCourseRecommend(courseScene, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str;
            CourseModel.CourseListData courseListData2 = (CourseModel.CourseListData) obj;
            if (courseListData2 != null) {
            }
            list = list2;
            if (list != null) {
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public LaunchSportModel() {
        this.courseFlag = !AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE));
    }

    private final void buildHeadData() {
        ScopeExtKt.scope$default(null, new AnonymousClass1(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$2(LaunchSportModel this$0, boolean z) {
        ISportDataListener<List<BaseSportItemBean>> iSportDataListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.reqCourseRecommend();
        } else {
            CollectionsKt__MutableCollectionsKt.removeAll((List) this$0.list, new Function1() { // from class: z3e
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(LaunchSportModel.init$lambda$2$lambda$1((BaseSportItemBean) obj));
                }
            });
            WeakReference<ISportDataListener<List<BaseSportItemBean>>> weak = this$0.getWeak();
            if (weak != null && (iSportDataListener = weak.get()) != null) {
                iSportDataListener.onSuccess(this$0.list);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean init$lambda$2$lambda$1(BaseSportItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof CourseRecommendBean;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshHr() {
        WeakReference<ISportDataListener<List<BaseSportItemBean>>> weak;
        ISportDataListener<List<BaseSportItemBean>> iSportDataListener;
        Resources resources = AppUtil.getApp().getResources();
        int i = ayi.common_unit_heart_rate_desc;
        int i2 = this.heartHr;
        String quantityString = resources.getQuantityString(i, i2, Integer.valueOf(i2));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        LaunchViewBean launchViewBean = this.headData;
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (ecoDeviceModel == null || !ecoDeviceModel.getIsDeviceConnected() || this.heartHr == 0) {
            quantityString = "";
        }
        launchViewBean.setHeartRate(quantityString);
        if (this.list.size() == 0 || (weak = getWeak()) == null || (iSportDataListener = weak.get()) == null) {
            return;
        }
        iSportDataListener.onSuccess(this.list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reqCourseRecommend() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() && !AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            ScopeExtKt.scopeNet$default(null, new C31191(null), 1, null).m503catch(new Function2() { // from class: d4e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LaunchSportModel.reqCourseRecommend$lambda$0((AndroidScope) obj, (Throwable) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqCourseRecommend$lambda$0(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(com.xiaomi.fitness.sport.view.launch.LaunchSportModel.TAG, "reqCourseRecommend: error = " + it.getMessage());
        return Unit.INSTANCE;
    }

    public final void destroy() {
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).removeDataHandler(8, this.deviceData);
        this.list.clear();
    }

    @NotNull
    public final EcoDataHandlerImpl getDeviceData() {
        return this.deviceData;
    }

    @NotNull
    public final LaunchViewBean getHeadData() {
        return this.headData;
    }

    public final int getHeartHr() {
        return this.heartHr;
    }

    @NotNull
    public final List<BaseSportItemBean> getList() {
        return this.list;
    }

    @Nullable
    public final String getSportTitle() {
        return this.sportTitle;
    }

    @Nullable
    public final Integer getWeatherImg() {
        return this.weatherImg;
    }

    public final boolean getWeatherRefresh() {
        return this.weatherRefresh;
    }

    @NotNull
    public final String getWeatherStr() {
        return this.weatherStr;
    }

    @NotNull
    public final String getWeatherTemperature() {
        return this.weatherTemperature;
    }

    public final void init() {
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).addDataHandler(8, this.deviceData);
        this.list.add(this.headData);
        if (this.courseFlag) {
            BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new C31181(null), 3, null);
            AccountManagerExtKt.getInstance(AccountManager.INSTANCE).addAccountListener(new Function1() { // from class: v3e
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LaunchSportModel.init$lambda$2(this.f36437a, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.sport_eco.model.SportModel
    public void refresh() {
        ISportDataListener<List<BaseSportItemBean>> iSportDataListener;
        super.refresh();
        buildHeadData();
        WeakReference<ISportDataListener<List<BaseSportItemBean>>> weak = getWeak();
        if (weak != null && (iSportDataListener = weak.get()) != null) {
            iSportDataListener.onSuccess(this.list);
        }
        reqCourseRecommend();
    }

    public final void registerDeviceHr() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            EcoDeviceModelExtKt.startDeviceHr(wearableDeviceModel, new HuamiHrImpl());
        }
    }

    public final void setDeviceData(@NotNull EcoDataHandlerImpl ecoDataHandlerImpl) {
        Intrinsics.checkNotNullParameter(ecoDataHandlerImpl, "<set-?>");
        this.deviceData = ecoDataHandlerImpl;
    }

    public final void setHeadData(@NotNull LaunchViewBean launchViewBean) {
        Intrinsics.checkNotNullParameter(launchViewBean, "<set-?>");
        this.headData = launchViewBean;
    }

    public final void setHeartHr(int i) {
        this.heartHr = i;
    }

    public final void setList(@NotNull List<BaseSportItemBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.list = list;
    }

    public final void setSportTitle(@Nullable String str) {
        this.sportTitle = str;
    }

    public final void setWeatherImg(@Nullable Integer num) {
        this.weatherImg = num;
    }

    public final void setWeatherRefresh(boolean z) {
        this.weatherRefresh = z;
    }

    public final void setWeatherStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.weatherStr = str;
    }

    public final void setWeatherTemperature(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.weatherTemperature = str;
    }

    public final void unRegisterDeviceHr() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            EcoDeviceModelExtKt.stopDeviceHr(wearableDeviceModel);
        }
    }
}
