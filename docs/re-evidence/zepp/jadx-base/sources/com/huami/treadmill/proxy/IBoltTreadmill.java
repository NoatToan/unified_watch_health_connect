package com.huami.treadmill.proxy;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&JD\u0010\u0010\u001a\u00020\u00042:\u0010\u000f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040\bH&J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\u0011H&J+\u0010\u0017\u001a\u00020\u00042!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00040\u0014H&J+\u0010\u0019\u001a\u00020\u00042!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00040\u0014H&J+\u0010\u001a\u001a\u00020\u00042!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00040\u0014H&J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u00020\u00042!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00040\u0014H&J\b\u0010 \u001a\u00020\u0004H&J\n\u0010\"\u001a\u0004\u0018\u00010!H&J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0002H&J\n\u0010&\u001a\u0004\u0018\u00010%H&J:\u00101\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010.\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H&J\b\u00102\u001a\u00020\u0004H&J\b\u00103\u001a\u00020\u0004H&J\u0011\u00104\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b4\u0010\u001cJ\u0011\u00105\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b5\u0010\u001cJ\u0011\u00106\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b6\u00107J\u0011\u00108\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b8\u0010\u001cJ\u0011\u00109\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b9\u00107J\u0011\u0010:\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b:\u0010\u001cJ\u0010\u0010;\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0002H&J\u0018\u0010>\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0002H&J^\u0010D\u001a\u0004\u0018\u00010\u00112K\u0010\u000f\u001aG\u0012\u0013\u0012\u00110@¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110A¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(B\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u00040?H&¢\u0006\u0004\bD\u0010EJ\u0010\u0010H\u001a\u00020\u00042\u0006\u0010G\u001a\u00020FH&J\b\u0010I\u001a\u00020\u0004H&J\n\u0010K\u001a\u0004\u0018\u00010JH&J\u0010\u0010L\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H&J2\u0010T\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\b\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010S\u001a\u00020\u0002H&J\b\u0010U\u001a\u00020\u0004H&J\b\u0010V\u001a\u00020\u0004H&J\b\u0010W\u001a\u00020\u0004H&J\n\u0010X\u001a\u0004\u0018\u00010\u0018H&J\u0010\u0010Z\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020QH&J\u0010\u0010\\\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u0002H&J&\u0010a\u001a\u00020\u00042\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^0]2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010`\u001a\u00020\u0011H&J\u0012\u0010d\u001a\u00020\u00042\b\u0010c\u001a\u0004\u0018\u00010bH&J\b\u0010e\u001a\u00020\u0004H&J\u0018\u0010i\u001a\u00020\u00042\u0006\u0010g\u001a\u00020f2\u0006\u0010h\u001a\u00020^H&J\u0010\u0010k\u001a\u00020\u00042\u0006\u0010j\u001a\u00020\u0011H&J\u0010\u0010l\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H&J\u0010\u0010m\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H&J\u0010\u0010n\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H&J\u0010\u0010o\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H&J\u001a\u0010q\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'2\b\u0010p\u001a\u0004\u0018\u00010FH&J\b\u0010r\u001a\u00020\u0011H&¨\u0006s"}, d2 = {"Lcom/huami/treadmill/proxy/IBoltTreadmill;", "", "", "speed", "", "adjustSpeed", "resumeTreadmill", "stopTreadmill", "Lkotlin/Function2;", "Lcom/huami/treadmill/data/InTreadmillData;", "Lkotlin/ParameterName;", "name", "treadmillData", "Lcom/huami/treadmill/data/InMachineStatus;", "machineStatus", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setFTMSListener", "", "hasBoundBolt", "isConnectedBolt", "Lkotlin/Function1;", "Lcom/huami/treadmill/data/ConnectStatus;", "status", "setConnectedListener", "Lcom/huami/treadmill/data/ErrorStatus;", "setErrorStatusListener", "setMaintainStatusListener", "getMaintainStatus", "()Ljava/lang/Boolean;", "Lcom/huami/treadmill/data/BoltSportCommand;", "command", "setSportListener", "connectBolt", "Lcom/huami/treadmill/data/BoltRunnerData;", "getRunnerData", Constants.DATA_KEY_HR, "syncHr", "Lcom/huami/treadmill/data/HrTips;", "getHrDeviceStatus", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/app/Activity;", "belongActivity", "isRoutLine", "Lcom/huami/treadmill/data/TdLineDetailRun;", "lineDetail", "index", "", "lineId", "showDetail", "unregisterEventBus", "registerEventBus", "getConfigScreenOnState", "getConfigVoicePlay", "getConfigRemindHeartRate", "()Ljava/lang/Integer;", "getConfigRemindHREnable", "getConfigRemindPace", "getConfigRemindPaceEnable", "vibrateHr", "pace", "remindPace", "vibratePace", "Lkotlin/Function3;", "Lcom/huami/treadmill/data/SyncStatus;", "Lcom/huami/treadmill/data/InProgress;", "progress", "result", "syncBoltGpsData", "(Lkotlin/jvm/functions/Function3;)Ljava/lang/Boolean;", "", "mac", "syncMacAddress", "stopAndDelete", "Lcom/huami/treadmill/data/BoltSportState;", "getSportState", "mapInit", "Landroidx/fragment/app/FragmentManager;", "fragment", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "paramBundle", "mode", "mapInitGPSSolution", "mapPause", "mapResume", "mapDestroy", "getErrorStatus", "outState", "mapSaveInstanceState", "darkColor", "mapSetBackgroundColor", "", "Lcom/huami/mifit/sportlib/model/GPSPoint;", "pointList", "isDot", "mapOnGPSLineInfoChanged", "", "speeds", "mapSetSpeedScope", "mapRemoveAllLineMarker", "Lcom/huami/treadmill/data/MarkerList;", "markers", "pointMe", "mapAddLineMarker", "enable", "setAllGesturesEnabled", "sportStart", "sportStop", "sportPause", "sportResume", "url", "launchWeb", "isOverSea", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public interface IBoltTreadmill {
    void adjustSpeed(int speed);

    void connectBolt();

    @Nullable
    Boolean getConfigRemindHREnable();

    @Nullable
    Integer getConfigRemindHeartRate();

    @Nullable
    Integer getConfigRemindPace();

    @Nullable
    Boolean getConfigRemindPaceEnable();

    @Nullable
    Boolean getConfigScreenOnState();

    @Nullable
    Boolean getConfigVoicePlay();

    @Nullable
    ErrorStatus getErrorStatus();

    @Nullable
    HrTips getHrDeviceStatus();

    @Nullable
    Boolean getMaintainStatus();

    @Nullable
    BoltRunnerData getRunnerData();

    @Nullable
    BoltSportState getSportState();

    boolean hasBoundBolt();

    boolean isConnectedBolt();

    boolean isOverSea();

    void launchWeb(@NotNull Context context, @Nullable String url);

    void mapAddLineMarker(@NotNull MarkerList markers, @NotNull GPSPoint pointMe);

    void mapDestroy();

    void mapInit(@NotNull Context context);

    void mapInitGPSSolution(@NotNull Context context, @NotNull FragmentManager fragment, @NotNull View view, @Nullable Bundle paramBundle, int mode);

    void mapOnGPSLineInfoChanged(@NotNull List<? extends GPSPoint> pointList, int index, boolean isDot);

    void mapPause();

    void mapRemoveAllLineMarker();

    void mapResume();

    void mapSaveInstanceState(@NotNull Bundle outState);

    void mapSetBackgroundColor(int darkColor);

    void mapSetSpeedScope(@Nullable float[] speeds);

    void registerEventBus();

    void resumeTreadmill();

    void setAllGesturesEnabled(boolean enable);

    void setConnectedListener(@NotNull Function1<? super ConnectStatus, Unit> listener);

    void setErrorStatusListener(@NotNull Function1<? super ErrorStatus, Unit> listener);

    void setFTMSListener(@NotNull Function2<? super InTreadmillData, ? super InMachineStatus, Unit> listener);

    void setMaintainStatusListener(@NotNull Function1<? super Boolean, Unit> listener);

    void setSportListener(@NotNull Function1<? super BoltSportCommand, Unit> listener);

    void showDetail(@NotNull Context context, @NotNull Activity belongActivity, boolean isRoutLine, @Nullable TdLineDetailRun lineDetail, int index, long lineId);

    void sportPause(@NotNull Context context);

    void sportResume(@NotNull Context context);

    void sportStart(@NotNull Context context);

    void sportStop(@NotNull Context context);

    void stopAndDelete();

    void stopTreadmill();

    @Nullable
    Boolean syncBoltGpsData(@NotNull Function3<? super SyncStatus, ? super InProgress, ? super Boolean, Unit> listener);

    void syncHr(int hr);

    void syncMacAddress(@NotNull String mac);

    void unregisterEventBus();

    void vibrateHr(int hr);

    void vibratePace(int pace, int remindPace);
}
