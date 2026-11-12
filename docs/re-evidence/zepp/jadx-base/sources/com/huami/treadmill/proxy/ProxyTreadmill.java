package com.huami.treadmill.proxy;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.data.BoltRunnerData;
import com.huami.treadmill.data.BoltSportCommand;
import com.huami.treadmill.data.BoltSportState;
import com.huami.treadmill.data.ConnectStatus;
import com.huami.treadmill.data.ErrorStatus;
import com.huami.treadmill.data.HrTips;
import com.huami.treadmill.data.InMachineStatus;
import com.huami.treadmill.data.InProgress;
import com.huami.treadmill.data.InTreadmillData;
import com.huami.treadmill.data.MarkerList;
import com.huami.treadmill.data.SyncStatus;
import com.huami.treadmill.data.TdLineDetailRun;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 z2\u00020\u0001:\u0001zB\t\b\u0002¢\u0006\u0004\bx\u0010yJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016JD\u0010\u0013\u001a\u00020\u00032:\u0010\u0012\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J+\u0010\u0017\u001a\u00020\u00032!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00030\u0014H\u0016J+\u0010\u0019\u001a\u00020\u00032!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00030\u0014H\u0016J+\u0010\u001b\u001a\u00020\u00032!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00030\u0014H\u0016J\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u001aH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0016J+\u0010\"\u001a\u00020\u00032!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110 ¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00030\u0014H\u0016J\b\u0010#\u001a\u00020\u0003H\u0016J\n\u0010%\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0006H\u0016J\n\u0010)\u001a\u0004\u0018\u00010(H\u0016J:\u00104\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001a2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u00020\u00062\u0006\u00103\u001a\u000202H\u0016J\b\u00105\u001a\u00020\u0003H\u0016J\b\u00106\u001a\u00020\u0003H\u0016J\u0011\u00107\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b7\u0010\u001dJ\u0011\u00108\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b8\u0010\u001dJ\u0011\u00109\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b9\u0010\u001dJ\u0011\u0010:\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b:\u0010;J\u0011\u0010<\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b<\u0010\u001dJ\u0011\u0010=\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b=\u0010;J\u0010\u0010>\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0006H\u0016J\u0018\u0010A\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0006H\u0016J^\u0010G\u001a\u0004\u0018\u00010\u001a2K\u0010\u0012\u001aG\u0012\u0013\u0012\u00110C¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110D¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(F\u0012\u0004\u0012\u00020\u00030BH\u0016¢\u0006\u0004\bG\u0010HJ\u0010\u0010K\u001a\u00020\u00032\u0006\u0010J\u001a\u00020IH\u0016J\b\u0010L\u001a\u00020\u0003H\u0016J\n\u0010N\u001a\u0004\u0018\u00010MH\u0016J\u0010\u0010O\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0016J2\u0010W\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020R2\b\u0010U\u001a\u0004\u0018\u00010T2\u0006\u0010V\u001a\u00020\u0006H\u0016J\b\u0010X\u001a\u00020\u0003H\u0016J\b\u0010Y\u001a\u00020\u0003H\u0016J\b\u0010Z\u001a\u00020\u0003H\u0016J\u0010\u0010\\\u001a\u00020\u00032\u0006\u0010[\u001a\u00020TH\u0016J\u0010\u0010^\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u001aH\u0016J\n\u0010_\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010a\u001a\u00020\u00032\u0006\u0010`\u001a\u00020\u0006H\u0016J&\u0010f\u001a\u00020\u00032\f\u0010d\u001a\b\u0012\u0004\u0012\u00020c0b2\u0006\u00101\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u001aH\u0016J\u0012\u0010i\u001a\u00020\u00032\b\u0010h\u001a\u0004\u0018\u00010gH\u0016J\b\u0010j\u001a\u00020\u0003H\u0016J\u0018\u0010n\u001a\u00020\u00032\u0006\u0010l\u001a\u00020k2\u0006\u0010m\u001a\u00020cH\u0016J\u0010\u0010o\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0016J\u0010\u0010p\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0016J\u0010\u0010q\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0016J\u0010\u0010r\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0016J\u001a\u0010t\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\b\u0010s\u001a\u0004\u0018\u00010IH\u0016J\b\u0010u\u001a\u00020\u001aH\u0016R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010w¨\u0006{"}, d2 = {"Lcom/huami/treadmill/proxy/ProxyTreadmill;", "Lcom/huami/treadmill/proxy/IBoltTreadmill;", "delegate", "", "setDelegate", "getDelegate", "", "speed", "adjustSpeed", "resumeTreadmill", "stopTreadmill", "Lkotlin/Function2;", "Lcom/huami/treadmill/data/InTreadmillData;", "Lkotlin/ParameterName;", "name", "treadmillData", "Lcom/huami/treadmill/data/InMachineStatus;", "machineStatus", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setFTMSListener", "Lkotlin/Function1;", "Lcom/huami/treadmill/data/ConnectStatus;", "status", "setConnectedListener", "Lcom/huami/treadmill/data/ErrorStatus;", "setErrorStatusListener", "", "setMaintainStatusListener", "getMaintainStatus", "()Ljava/lang/Boolean;", "hasBoundBolt", "isConnectedBolt", "Lcom/huami/treadmill/data/BoltSportCommand;", "command", "setSportListener", "connectBolt", "Lcom/huami/treadmill/data/BoltRunnerData;", "getRunnerData", Constants.DATA_KEY_HR, "syncHr", "Lcom/huami/treadmill/data/HrTips;", "getHrDeviceStatus", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/app/Activity;", "belongActivity", "isRoutLine", "Lcom/huami/treadmill/data/TdLineDetailRun;", "lineDetail", "index", "", "lineId", "showDetail", "unregisterEventBus", "registerEventBus", "getConfigScreenOnState", "getConfigVoicePlay", "getConfigRemindHREnable", "getConfigRemindHeartRate", "()Ljava/lang/Integer;", "getConfigRemindPaceEnable", "getConfigRemindPace", "vibrateHr", "pace", "remindPace", "vibratePace", "Lkotlin/Function3;", "Lcom/huami/treadmill/data/SyncStatus;", "Lcom/huami/treadmill/data/InProgress;", "progress", "result", "syncBoltGpsData", "(Lkotlin/jvm/functions/Function3;)Ljava/lang/Boolean;", "", "mac", "syncMacAddress", "stopAndDelete", "Lcom/huami/treadmill/data/BoltSportState;", "getSportState", "mapInit", "Landroidx/fragment/app/FragmentManager;", "fragment", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "paramBundle", "mode", "mapInitGPSSolution", "mapPause", "mapResume", "mapDestroy", "outState", "mapSaveInstanceState", "enable", "setAllGesturesEnabled", "getErrorStatus", "darkColor", "mapSetBackgroundColor", "", "Lcom/huami/mifit/sportlib/model/GPSPoint;", "pointList", "isDot", "mapOnGPSLineInfoChanged", "", "speeds", "mapSetSpeedScope", "mapRemoveAllLineMarker", "Lcom/huami/treadmill/data/MarkerList;", "markers", "pointMe", "mapAddLineMarker", "sportStart", "sportStop", "sportPause", "sportResume", "url", "launchWeb", "isOverSea", "a", "Lcom/huami/treadmill/proxy/IBoltTreadmill;", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class ProxyTreadmill implements IBoltTreadmill {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<ProxyTreadmill> b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) a.a);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private IBoltTreadmill delegate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/treadmill/proxy/ProxyTreadmill$Companion;", "", "Lcom/huami/treadmill/proxy/ProxyTreadmill;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/huami/treadmill/proxy/ProxyTreadmill;", DefaultSettingsSpiCall.n, "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), DefaultSettingsSpiCall.n, "getInstance()Lcom/huami/treadmill/proxy/ProxyTreadmill;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProxyTreadmill getInstance() {
            return (ProxyTreadmill) ProxyTreadmill.b.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/treadmill/proxy/ProxyTreadmill;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ProxyTreadmill> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProxyTreadmill invoke() {
            return new ProxyTreadmill(null);
        }
    }

    private ProxyTreadmill() {
    }

    public /* synthetic */ ProxyTreadmill(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void adjustSpeed(int speed) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.adjustSpeed(speed);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void connectBolt() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.connectBolt();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public Boolean getConfigRemindHREnable() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return null;
        }
        return iBoltTreadmill.getConfigRemindHREnable();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public Integer getConfigRemindHeartRate() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return null;
        }
        return iBoltTreadmill.getConfigRemindHeartRate();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public Integer getConfigRemindPace() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return null;
        }
        return iBoltTreadmill.getConfigRemindPace();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public Boolean getConfigRemindPaceEnable() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return null;
        }
        return iBoltTreadmill.getConfigRemindPaceEnable();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public Boolean getConfigScreenOnState() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return null;
        }
        return iBoltTreadmill.getConfigScreenOnState();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public Boolean getConfigVoicePlay() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return null;
        }
        return iBoltTreadmill.getConfigVoicePlay();
    }

    @Nullable
    public final IBoltTreadmill getDelegate() {
        return this.delegate;
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public ErrorStatus getErrorStatus() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return null;
        }
        return iBoltTreadmill.getErrorStatus();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public HrTips getHrDeviceStatus() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return null;
        }
        return iBoltTreadmill.getHrDeviceStatus();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public Boolean getMaintainStatus() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return null;
        }
        return iBoltTreadmill.getMaintainStatus();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public BoltRunnerData getRunnerData() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return null;
        }
        return iBoltTreadmill.getRunnerData();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public BoltSportState getSportState() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return null;
        }
        return iBoltTreadmill.getSportState();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public boolean hasBoundBolt() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return false;
        }
        return iBoltTreadmill.hasBoundBolt();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public boolean isConnectedBolt() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return false;
        }
        return iBoltTreadmill.isConnectedBolt();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public boolean isOverSea() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return false;
        }
        return iBoltTreadmill.isOverSea();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void launchWeb(@NotNull Context context, @Nullable String url) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.launchWeb(context, url);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapAddLineMarker(@NotNull MarkerList markers, @NotNull GPSPoint pointMe) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.mapAddLineMarker(markers, pointMe);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapDestroy() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.mapDestroy();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapInit(@NotNull Context context) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.mapInit(context);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapInitGPSSolution(@NotNull Context context, @NotNull FragmentManager fragment, @NotNull View view, @Nullable Bundle paramBundle, int mode) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.mapInitGPSSolution(context, fragment, view, paramBundle, mode);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapOnGPSLineInfoChanged(@NotNull List<? extends GPSPoint> pointList, int index, boolean isDot) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.mapOnGPSLineInfoChanged(pointList, index, isDot);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapPause() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.mapPause();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapRemoveAllLineMarker() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.mapRemoveAllLineMarker();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapResume() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.mapResume();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapSaveInstanceState(@NotNull Bundle outState) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.mapSaveInstanceState(outState);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapSetBackgroundColor(int darkColor) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.mapSetBackgroundColor(darkColor);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapSetSpeedScope(@Nullable float[] speeds) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.mapSetSpeedScope(speeds);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void registerEventBus() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.registerEventBus();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void resumeTreadmill() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.resumeTreadmill();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void setAllGesturesEnabled(boolean enable) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.setAllGesturesEnabled(enable);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void setConnectedListener(@NotNull Function1<? super ConnectStatus, Unit> listener) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.setConnectedListener(listener);
    }

    public final void setDelegate(@NotNull IBoltTreadmill delegate) {
        this.delegate = delegate;
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void setErrorStatusListener(@NotNull Function1<? super ErrorStatus, Unit> listener) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.setErrorStatusListener(listener);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void setFTMSListener(@NotNull Function2<? super InTreadmillData, ? super InMachineStatus, Unit> listener) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.setFTMSListener(listener);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void setMaintainStatusListener(@NotNull Function1<? super Boolean, Unit> listener) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.setMaintainStatusListener(listener);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void setSportListener(@NotNull Function1<? super BoltSportCommand, Unit> listener) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.setSportListener(listener);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void showDetail(@NotNull Context context, @NotNull Activity belongActivity, boolean isRoutLine, @Nullable TdLineDetailRun lineDetail, int index, long lineId) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.showDetail(context, belongActivity, isRoutLine, lineDetail, index, lineId);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void sportPause(@NotNull Context context) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.sportPause(context);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void sportResume(@NotNull Context context) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.sportResume(context);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void sportStart(@NotNull Context context) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.sportStart(context);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void sportStop(@NotNull Context context) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.sportStop(context);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void stopAndDelete() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.stopAndDelete();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void stopTreadmill() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.stopTreadmill();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public Boolean syncBoltGpsData(@NotNull Function3<? super SyncStatus, ? super InProgress, ? super Boolean, Unit> listener) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return null;
        }
        return iBoltTreadmill.syncBoltGpsData(listener);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void syncHr(int hr) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.syncHr(hr);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void syncMacAddress(@NotNull String mac) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.syncMacAddress(mac);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void unregisterEventBus() {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.unregisterEventBus();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void vibrateHr(int hr) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.vibrateHr(hr);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void vibratePace(int pace, int remindPace) {
        IBoltTreadmill iBoltTreadmill = this.delegate;
        if (iBoltTreadmill == null) {
            return;
        }
        iBoltTreadmill.vibratePace(pace, remindPace);
    }
}
