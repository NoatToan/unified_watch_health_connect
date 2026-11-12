package com.xiaomi.fitness.sport_eco.view.launch.gym;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import com.google.gson.Gson;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseModel;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.sport_eco.course.CourseMoreData;
import com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt;
import com.xiaomi.fitness.sport_eco.ftp.request.FtpModel;
import com.xiaomi.fitness.sport_eco.ftp.request.FtpRequest;
import com.xiaomi.fitness.sport_eco.request.EnvironmentalRequest;
import com.xiaomi.fitness.sport_eco.view.environmental.model.EnvironmentalVO;
import com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM;
import com.xiaomi.fitness.sport_eco.view.launch.gym.data.CourseFirstPageData;
import com.xiaomi.fitness.sport_eco.viewmodel.EcoEnvironmentalViewModel;
import com.xiaomi.fitness.sport_eco_manager_export.SportConstants;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.bt7;
import defpackage.eu6;
import defpackage.fs9;
import defpackage.xpd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0007\u0018\u0000 \u009b\u00012\u00020\u00012\u00020\u0002:\u0004\u009b\u0001\u009c\u0001B\u0013\b\u0007\u0012\u0006\u0010P\u001a\u00020O¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\nJ\u001b\u0010\u0016\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001a¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\b¢\u0006\u0004\b(\u0010\rJ\r\u0010)\u001a\u00020\u001a¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\rJ'\u0010-\u001a\u00020\b2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0,¢\u0006\u0004\b-\u0010.J!\u00101\u001a\u0004\u0018\u000100*\b\u0012\u0004\u0012\u0002000/2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b1\u00102J7\u00103\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0,¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\b2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J/\u0010A\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020\u001aH\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\bH\u0016¢\u0006\u0004\bC\u0010\rJ\u000f\u0010D\u001a\u00020\bH\u0016¢\u0006\u0004\bD\u0010\rJ!\u0010H\u001a\u00020\b2\u0006\u0010E\u001a\u00020\u00032\b\u0010G\u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010\nJ)\u0010K\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u001d¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020\b¢\u0006\u0004\bM\u0010\rJ\r\u0010N\u001a\u00020\b¢\u0006\u0004\bN\u0010\rR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010R\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u001d\u0010Y\u001a\u0004\u0018\u00010T8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\"\u0010[\u001a\u00020Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010a\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR(\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00030g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bh\u0010j\"\u0004\bk\u0010lR\u0017\u0010n\u001a\u00020m8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR(\u0010s\u001a\b\u0012\u0004\u0012\u00020r0g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010i\u001a\u0004\bt\u0010j\"\u0004\bu\u0010lR(\u0010v\u001a\b\u0012\u0004\u0012\u00020\u001a0g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010i\u001a\u0004\bw\u0010j\"\u0004\bx\u0010lR\"\u0010z\u001a\u00020y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0019\u0010\u0080\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0082\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0081\u0001R#\u0010\u0085\u0001\u001a\f\u0012\u0005\u0012\u00030\u0084\u0001\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R!\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010g8\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010i\u001a\u0005\b\u008d\u0001\u0010jR!\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010g8\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010i\u001a\u0005\b\u0090\u0001\u0010jR\u0019\u0010\u0091\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0081\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0081\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008a\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u008a\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u008a\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001¨\u0006\u009d\u0001"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/LaunchSportVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;", "", "isLocalLaunchSport", "()Z", "", "localSportType", "", "reqRecent", "(Ljava/lang/String;)V", "reqVideoFirst", "setFirstPage", "()V", "Lcom/mi/health/course/export/data/CourseModel$PracticedCourseList;", "data", "setRecentData", "(Lcom/mi/health/course/export/data/CourseModel$PracticedCourseList;)V", "Lcom/mi/health/course/export/data/CourseModel$CourseListData;", "setVideoFirst", "(Lcom/mi/health/course/export/data/CourseModel$CourseListData;)V", "reqVideoMore", "setVideoMore", "Lcom/xiaomi/fitness/baseui/recyclerview/view/Status;", "status", "(Lcom/mi/health/course/export/data/CourseModel$CourseListData;)Lcom/xiaomi/fitness/baseui/recyclerview/view/Status;", "", "key", "value", "Lkotlin/Function1;", "callback", "setSettingItem", "(IILkotlin/jvm/functions/Function1;)V", "ftpResult", "uploadFtpValue", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "abnormalChangeSportStateToFinish", "getSportState", "()I", "syncDeviceDynamicModeData", "Lkotlin/Function2;", "readEcoSettingConfig", "(Lkotlin/jvm/functions/Function2;)V", "", "Lfs9;", "findEco", "([Lfs9;I)Lfs9;", "setEcoSettingItem", "(IILkotlin/jvm/functions/Function2;)V", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/LaunchSportVM$GymSportStartListener;", StatConstants.PARAM_START, "addGymSportStartListener", "(Lcom/xiaomi/fitness/sport_eco/view/launch/gym/LaunchSportVM$GymSportStartListener;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "startTime", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "onSportStarted", "(IIII)V", "onSportRestarted", "onSportPaused", "validSport", "", "ids", "onSportFinished", "(Z[B)V", "reqData", "setFtpResult", "(ILkotlin/jvm/functions/Function1;)V", "fetchEnvironmental", "getFtpHistoryList", "Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpRequest;", "request", "Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpRequest;", "gymSportStart", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/LaunchSportVM$GymSportStartListener;", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "getMDeviceModel", "()Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "mDeviceModel", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "mSportStateCaller", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "getMSportStateCaller", "()Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "setMSportStateCaller", "(Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;)V", "mEcoSettingList", "[Lfs9;", "getMEcoSettingList", "()[Lfs9;", "setMEcoSettingList", "([Lfs9;)V", "Landroidx/lifecycle/MutableLiveData;", "isDynamicModel", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "setDynamicModel", "(Landroidx/lifecycle/MutableLiveData;)V", "Lcom/xiaomi/fitness/sport_eco/request/EnvironmentalRequest;", "ecoEnvironmentalRequest", "Lcom/xiaomi/fitness/sport_eco/request/EnvironmentalRequest;", "getEcoEnvironmentalRequest", "()Lcom/xiaomi/fitness/sport_eco/request/EnvironmentalRequest;", "Lcom/xiaomi/fitness/sport_eco/view/environmental/model/EnvironmentalVO;", "environmentalValue", "getEnvironmentalValue", "setEnvironmentalValue", "ftpValue", "getFtpValue", "setFtpValue", "Lcom/mi/health/course/export/CourseApi;", "courseApi", "Lcom/mi/health/course/export/CourseApi;", "getCourseApi", "()Lcom/mi/health/course/export/CourseApi;", "setCourseApi", "(Lcom/mi/health/course/export/CourseApi;)V", "recentEnd", "Z", "videoEnd", "", "Lcom/mi/health/course/export/data/CourseModel$PracticedCourse;", "recent", "Ljava/util/List;", "videoFirst", "Lcom/mi/health/course/export/data/CourseModel$CourseListData;", "nextKey", "Ljava/lang/String;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/data/CourseFirstPageData;", "firstEmitter", "getFirstEmitter", "Lcom/xiaomi/fitness/sport_eco/course/CourseMoreData;", "moreEmitter", "getMoreEmitter", "firstVideoRet", "firstRecentRet", "courseTag", "coursePage", "scene", "", "type", "[I", "<init>", "(Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpRequest;)V", "Companion", "GymSportStartListener", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLaunchSportVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchSportVM.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/LaunchSportVM\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,502:1\n13402#2,2:503\n1#3:505\n*S KotlinDebug\n*F\n+ 1 LaunchSportVM.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/LaunchSportVM\n*L\n177#1:503,2\n*E\n"})
public final class LaunchSportVM extends AbsViewModel implements ISportStateChangedListener {
    public static final int SWITCH_OFF = 0;
    public static final int SWITCH_ON = 1;
    public CourseApi courseApi;

    @NotNull
    private String coursePage;

    @NotNull
    private String courseTag;

    @NotNull
    private final EnvironmentalRequest ecoEnvironmentalRequest;

    @NotNull
    private MutableLiveData<EnvironmentalVO> environmentalValue;

    @NotNull
    private final MutableLiveData<CourseFirstPageData> firstEmitter;
    private boolean firstRecentRet;
    private boolean firstVideoRet;

    @NotNull
    private MutableLiveData<Integer> ftpValue;

    @Nullable
    private GymSportStartListener gymSportStart;

    @NotNull
    private MutableLiveData<Boolean> isDynamicModel;

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel;

    @Nullable
    private fs9[] mEcoSettingList;

    @NotNull
    private IEcoSportRemoteState mSportStateCaller;

    @NotNull
    private final MutableLiveData<CourseMoreData> moreEmitter;

    @Nullable
    private String nextKey;

    @Nullable
    private List<? extends CourseModel.PracticedCourse> recent;
    private boolean recentEnd;

    @NotNull
    private final FtpRequest request;

    @NotNull
    private String scene;

    @NotNull
    private final int[] type;
    private boolean videoEnd;

    @Nullable
    private CourseModel.CourseListData videoFirst;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/LaunchSportVM$GymSportStartListener;", "", LifecycleConstantKt.ON_START, "", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface GymSportStartListener {
        void onStart();
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM$fetchEnvironmental$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM$fetchEnvironmental$1", f = "LaunchSportVM.kt", i = {}, l = {412}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LaunchSportVM.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    EnvironmentalRequest ecoEnvironmentalRequest = LaunchSportVM.this.getEcoEnvironmentalRequest();
                    this.label = 1;
                    obj = ecoEnvironmentalRequest.fetchEnvironmentalValue(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                FtpModel.RespData respData = (FtpModel.RespData) obj;
                Logger.i(EcoEnvironmentalViewModel.TAG, "query resp = " + new Gson().toJson(respData));
                JSONObject jSONObject = new JSONObject(respData.getResp());
                int iOptInt = jSONObject.optInt("code");
                String strOptString = jSONObject.optString("msg");
                new ArrayList();
                if (iOptInt == 0 || iOptInt == 200) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                    if (jSONObjectOptJSONObject != null) {
                        LaunchSportVM.this.getEnvironmentalValue().setValue(new EcoEnvironmentalViewModel().dealData(new EnvironmentalVO(Boxing.boxInt(jSONObjectOptJSONObject.optInt(SportDataTypeKt.DIMEN_TOTAL)))));
                    } else {
                        LaunchSportVM.this.getEnvironmentalValue().setValue(new EcoEnvironmentalViewModel().dealData(new EnvironmentalVO(Boxing.boxInt(0))));
                    }
                } else {
                    Logger.e(EcoEnvironmentalViewModel.TAG, "error msg = " + strOptString);
                    LaunchSportVM.this.getEnvironmentalValue().setValue(new EcoEnvironmentalViewModel().dealData(new EnvironmentalVO(Boxing.boxInt(0))));
                }
            } catch (Exception e) {
                e.printStackTrace();
                Logger.e(EcoEnvironmentalViewModel.TAG, "msg = " + e.getMessage());
                LaunchSportVM.this.getEnvironmentalValue().setValue(new EcoEnvironmentalViewModel().dealData(new EnvironmentalVO(Boxing.boxInt(0))));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM$getFtpHistoryList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM$getFtpHistoryList$1", f = "LaunchSportVM.kt", i = {}, l = {454}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLaunchSportVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchSportVM.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/LaunchSportVM$getFtpHistoryList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,502:1\n1019#2,2:503\n*S KotlinDebug\n*F\n+ 1 LaunchSportVM.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/LaunchSportVM$getFtpHistoryList$1\n*L\n470#1:503,2\n*E\n"})
    public static final class C31471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C31471(Continuation<? super C31471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LaunchSportVM.this.new C31471(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("uid", AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
                    FtpRequest ftpRequest = LaunchSportVM.this.request;
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    this.label = 1;
                    obj = ftpRequest.requestEcoApi("eco/general-equipment/exercise_bike/ftp/query", string, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                JSONObject jSONObject2 = new JSONObject(((FtpModel.RespData) obj).getResp());
                int iOptInt = jSONObject2.optInt("code");
                FitnessLogUtils.i("LaunchSportVM", "getFtpHistoryList code is " + iOptInt);
                if (iOptInt == 0 || iOptInt == 200) {
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("result");
                    FitnessLogUtils.i("LaunchSportVM", "resp = " + new Gson().toJson(jSONObject2));
                    FitnessLogUtils.i("LaunchSportVM", "data length = " + (jSONArrayOptJSONArray != null ? Boxing.boxInt(jSONArrayOptJSONArray.length()) : null));
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                        FitnessLogUtils.i("LaunchSportVM", "getFtpHistoryList no response");
                        LaunchSportVM.this.getFtpValue().setValue(Boxing.boxInt(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_LAST_FTP_RESULT()));
                    } else {
                        FitnessLogUtils.i("LaunchSportVM", "getFtpHistoryList has response");
                        List listG = xpd.g(jSONArrayOptJSONArray.toString(), FtpModel.FtpData.class);
                        Intrinsics.checkNotNull(listG, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fitness.sport_eco.ftp.request.FtpModel.FtpData>");
                        ArrayList arrayList = (ArrayList) listG;
                        if (arrayList.size() > 1) {
                            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM$getFtpHistoryList$1$invokeSuspend$$inlined$sortByDescending$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((FtpModel.FtpData) t2).getCreateTime()), Long.valueOf(((FtpModel.FtpData) t).getCreateTime()));
                                }
                            });
                        }
                        if (arrayList.size() > 0) {
                            FitnessLogUtils.i("LaunchSportVM", "getFtpHistoryList last is " + ((FtpModel.FtpData) arrayList.get(0)).getFtp());
                            LaunchSportVM.this.getFtpValue().setValue(Boxing.boxInt(((FtpModel.FtpData) arrayList.get(0)).getFtp()));
                            SportManagerExportPreference.INSTANCE.setKEY_GYM_LOCAL_LAST_FTP_RESULT(((FtpModel.FtpData) arrayList.get(0)).getFtp());
                        }
                    }
                } else {
                    LaunchSportVM.this.getFtpValue().setValue(Boxing.boxInt(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_LAST_FTP_RESULT()));
                }
            } catch (Exception e) {
                FitnessLogUtils.i("LaunchSportVM", "getFtpHistoryList exception is " + e.getMessage());
                LaunchSportVM.this.getFtpValue().setValue(Boxing.boxInt(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_LAST_FTP_RESULT()));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM$reqRecent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM$reqRecent$1", f = "LaunchSportVM.kt", i = {}, l = {287}, m = "invokeSuspend", n = {}, s = {})
    public static final class C31491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<String> $tag;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31491(Ref.ObjectRef<String> objectRef, Continuation<? super C31491> continuation) {
            super(2, continuation);
            this.$tag = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LaunchSportVM.this.new C31491(this.$tag, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseApi courseApi = LaunchSportVM.this.getCourseApi();
                String str = this.$tag.element;
                this.label = 1;
                obj = courseApi.getPracticedCourseList(0, str, null, 3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CourseModel.PracticedCourseList practicedCourseList = (CourseModel.PracticedCourseList) new WeakReference(obj).get();
            if (practicedCourseList != null) {
                LaunchSportVM.this.setRecentData(practicedCourseList);
            } else {
                Logger.i("LaunchSportVM", "reqRecent: data is null");
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM$reqVideoFirst$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM$reqVideoFirst$1", f = "LaunchSportVM.kt", i = {}, l = {303}, m = "invokeSuspend", n = {}, s = {})
    public static final class C31501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C31501(Continuation<? super C31501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LaunchSportVM.this.new C31501(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseApi courseApi = LaunchSportVM.this.getCourseApi();
                String str = LaunchSportVM.this.scene;
                int[] iArr = LaunchSportVM.this.type;
                this.label = 1;
                obj = courseApi.getCourseList(str, iArr, null, null, 25, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CourseModel.CourseListData courseListData = (CourseModel.CourseListData) new WeakReference(obj).get();
            if (courseListData != null) {
                LaunchSportVM.this.setVideoFirst(courseListData);
            } else {
                Logger.i("LaunchSportVM", "reqVideoFirst: data is null");
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM$reqVideoMore$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM$reqVideoMore$1", f = "LaunchSportVM.kt", i = {}, l = {345}, m = "invokeSuspend", n = {}, s = {})
    public static final class C31511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C31511(Continuation<? super C31511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LaunchSportVM.this.new C31511(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseApi courseApi = LaunchSportVM.this.getCourseApi();
                String str = LaunchSportVM.this.scene;
                int[] iArr = LaunchSportVM.this.type;
                String str2 = LaunchSportVM.this.nextKey;
                this.label = 1;
                obj = courseApi.getCourseList(str, iArr, null, str2, 25, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CourseModel.CourseListData courseListData = (CourseModel.CourseListData) new WeakReference(obj).get();
            if (courseListData != null) {
                LaunchSportVM.this.setVideoMore(courseListData);
            } else {
                Logger.i("LaunchSportVM", "reqVideoMore: data is null");
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM$uploadFtpValue$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM$uploadFtpValue$1", f = "LaunchSportVM.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    public static final class C31551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $ftpResult;
        int label;
        final /* synthetic */ LaunchSportVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31551(int i, LaunchSportVM launchSportVM, Continuation<? super C31551> continuation) {
            super(2, continuation);
            this.$ftpResult = i;
            this.this$0 = launchSportVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31551(this.$ftpResult, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SportManagerExportPreference sportManagerExportPreference = SportManagerExportPreference.INSTANCE;
                    sportManagerExportPreference.setKEY_GYM_LOCAL_LAST_FTP_RESULT(this.$ftpResult);
                    sportManagerExportPreference.setKEY_GYM_LOCAL_FTP_RESULT(this.$ftpResult);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("uid", AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
                    jSONObject.put("createTime", System.currentTimeMillis());
                    jSONObject.put("ftp", this.$ftpResult);
                    FtpRequest ftpRequest = this.this$0.request;
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    this.label = 1;
                    obj = ftpRequest.requestEcoApi("eco/general-equipment/exercise_bike/ftp/add", string, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                int iOptInt = new JSONObject(((FtpModel.RespData) obj).getResp()).optInt("code");
                if (iOptInt == 0 || iOptInt == 200) {
                    FitnessLogUtils.i("LaunchSportVM", "uploadFtpValue code is " + iOptInt);
                    SportManagerExportPreference.INSTANCE.setKEY_GYM_LOCAL_FTP_RESULT(-1);
                }
            } catch (Exception e) {
                FitnessLogUtils.i("LaunchSportVM", "uploadFtpValue Exception is " + e.getMessage());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:6:0x006c  */
    public LaunchSportVM(@NotNull FtpRequest request) {
        String str;
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
        this.mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: z4e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LaunchSportVM.mDeviceModel_delegate$lambda$0();
            }
        });
        this.mSportStateCaller = SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE);
        this.mEcoSettingList = new fs9[0];
        this.isDynamicModel = new MutableLiveData<>();
        this.ecoEnvironmentalRequest = new EnvironmentalRequest();
        this.environmentalValue = new MutableLiveData<>();
        this.ftpValue = new MutableLiveData<>();
        this.firstEmitter = new MutableLiveData<>();
        this.moreEmitter = new MutableLiveData<>();
        SportManagerExportPreference sportManagerExportPreference = SportManagerExportPreference.INSTANCE;
        String key_gym_local_sport_type = sportManagerExportPreference.getKEY_GYM_LOCAL_SPORT_TYPE();
        int iHashCode = key_gym_local_sport_type.hashCode();
        String str2 = CourseApiKt.COURSE_TAG_COURSE_LIST;
        switch (iHashCode) {
            case -1798122615:
                if (!key_gym_local_sport_type.equals("yesoul.exbike.jsc01y")) {
                    str2 = "default";
                }
                break;
            case -1454035281:
                if (!key_gym_local_sport_type.equals("runmi.exbike.jscrm1")) {
                    str2 = "default";
                }
                break;
            case 405899618:
                if (!key_gym_local_sport_type.equals("yunmai.jmprope.sr803")) {
                    str2 = "default";
                }
                break;
            case 405899620:
                if (!key_gym_local_sport_type.equals(SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED)) {
                    str2 = "default";
                }
                break;
            case 1396900280:
                key_gym_local_sport_type.equals("ksmb.treadmill.m1v1");
                str2 = "default";
                break;
            default:
                str2 = "default";
                break;
        }
        this.courseTag = str2;
        switch (sportManagerExportPreference.getKEY_GYM_LOCAL_SPORT_TYPE()) {
            case "yesoul.exbike.jsc01y":
            case "runmi.exbike.jscrm1":
                str = "exercise_bike";
                break;
            case "yunmai.jmprope.sr803":
            case "yunmai.jmprope.sr805":
                str = "skipping_rope";
                break;
            case "ksmb.treadmill.m1v1":
                str = CourseApiKt.COURSE_PAGE_TREADMILL;
                break;
            default:
                str = "";
                break;
        }
        this.coursePage = str;
        this.scene = CourseApiKt.getCourseScene(str, this.courseTag);
        this.type = new int[]{1};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFtpHistoryList$lambda$10(LaunchSportVM this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        FitnessLogUtils.i("LaunchSportVM", "getFtpHistoryList exception is " + it.getMessage());
        this$0.ftpValue.setValue(Integer.valueOf(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_LAST_FTP_RESULT()));
        return Unit.INSTANCE;
    }

    private final boolean isLocalLaunchSport() {
        int appLaunchType = SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).getAppLaunchType();
        return (appLaunchType == 4 || appLaunchType == 5) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoDeviceModel mDeviceModel_delegate$lambda$0() {
        return EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void reqRecent(String localSportType) {
        T t;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        switch (localSportType) {
            case "yesoul.exbike.jsc01y":
            case "runmi.exbike.jscrm1":
                t = "exercise_bike";
                break;
            case "yunmai.jmprope.sr803":
            case "yunmai.jmprope.sr805":
                t = "skipping_rope";
                break;
            case "ksmb.treadmill.m1v1":
                t = "treadmill";
                break;
            default:
                t = CourseApiKt.COURSE_TAG_INTELLIGENT_INSTRUMENT;
                break;
        }
        objectRef.element = t;
        ScopeExtKt.scopeNetLife$default(this, null, new C31491(objectRef, null), 1, null).m503catch(new Function2() { // from class: d5e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LaunchSportVM.reqRecent$lambda$4(this.f15103a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqRecent$lambda$4(LaunchSportVM this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("LaunchSportVM", "reqRecent: " + it.getMessage());
        this$0.setRecentData(null);
        return Unit.INSTANCE;
    }

    private final void reqVideoFirst(String localSportType) {
        ScopeExtKt.scopeNetLife$default(this, null, new C31501(null), 1, null).m503catch(new Function2() { // from class: h5e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LaunchSportVM.reqVideoFirst$lambda$5(this.f19713a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqVideoFirst$lambda$5(LaunchSportVM this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("LaunchSportVM", "reqVideoFirst: " + it.getMessage());
        this$0.setVideoFirst(null);
        return Unit.INSTANCE;
    }

    private final void reqVideoMore(String localSportType) {
        ScopeExtKt.scopeNetLife$default(this, null, new C31511(null), 1, null).m503catch(new Function2() { // from class: g5e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LaunchSportVM.reqVideoMore$lambda$6(this.f18616a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqVideoMore$lambda$6(LaunchSportVM this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("LaunchSportVM", "reqVideoMore: " + it.getMessage());
        this$0.setVideoMore(null);
        return Unit.INSTANCE;
    }

    private final void setFirstPage() {
        if (this.recentEnd && this.videoEnd) {
            Status status = (this.firstVideoRet && this.firstRecentRet) ? status(this.videoFirst) : Status.FAIL;
            MutableLiveData<CourseFirstPageData> mutableLiveData = this.firstEmitter;
            CourseModel.CourseListData courseListData = this.videoFirst;
            mutableLiveData.setValue(new CourseFirstPageData(courseListData != null ? courseListData.courseList : null, null, this.recent, status, 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFtpResult$lambda$8(int i, LaunchSportVM this$0, Function1 callback, boolean z) {
        fs9[] fs9VarArr;
        fs9 fs9VarFindEco;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Logger.d("GymDeviceModel", "setFtpResult " + i + " result:" + z);
        if (z && (fs9VarArr = this$0.mEcoSettingList) != null && (fs9VarFindEco = this$0.findEco(fs9VarArr, 7)) != null) {
            fs9VarFindEco.d = i;
        }
        if (!z) {
            i = -1;
        }
        callback.invoke2(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRecentData(CourseModel.PracticedCourseList data) {
        List<? extends CourseModel.PracticedCourse> arrayList;
        if (data == null || (arrayList = data.data) == null) {
            arrayList = new ArrayList<>();
        }
        this.recent = arrayList;
        this.recentEnd = true;
        this.firstRecentRet = data != null;
        setFirstPage();
    }

    private final void setSettingItem(final int key, final int value, final Function1<? super Boolean, Unit> callback) {
        EcoDeviceModel mDeviceModel;
        fs9 fs9Var = new fs9();
        fs9Var.c = key;
        fs9Var.d = value;
        Unit unit = Unit.INSTANCE;
        fs9[] fs9VarArr = {fs9Var};
        EcoDeviceModel mDeviceModel2 = getMDeviceModel();
        if (mDeviceModel2 == null || !mDeviceModel2.getIsDeviceConnected() || (mDeviceModel = getMDeviceModel()) == null) {
            return;
        }
        EcoDeviceModelExtKt.setGYMSettings(mDeviceModel, fs9VarArr, new eu6<Boolean>() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM.setSettingItem.1
            @Override // defpackage.eu6
            public void onError(int errorCode) {
                com.xiaomi.fitness.net.extensions.ScopeExtKt.scope(Dispatchers.getMain(), new LaunchSportVM$setSettingItem$1$onError$1(key, value, errorCode, callback, null));
            }

            @Override // defpackage.eu6
            public void onResult(Boolean result) {
                com.xiaomi.fitness.net.extensions.ScopeExtKt.scope(Dispatchers.getMain(), new LaunchSportVM$setSettingItem$1$onResult$1(key, value, callback, null));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVideoFirst(CourseModel.CourseListData data) {
        this.videoFirst = data;
        this.videoEnd = true;
        this.firstVideoRet = data != null;
        this.nextKey = data != null ? data.nextKey : null;
        setFirstPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVideoMore(CourseModel.CourseListData data) {
        if (data != null) {
            this.nextKey = data.nextKey;
        }
        this.moreEmitter.setValue(new CourseMoreData(data != null ? data.courseList : null, status(data)));
    }

    public static /* synthetic */ void setVideoMore$default(LaunchSportVM launchSportVM, CourseModel.CourseListData courseListData, int i, Object obj) {
        if ((i & 1) != 0) {
            courseListData = null;
        }
        launchSportVM.setVideoMore(courseListData);
    }

    private final Status status(CourseModel.CourseListData data) {
        String str;
        if (data == null) {
            return Status.FAIL;
        }
        List<CourseModel.CourseData> list = data.courseList;
        if (list != null) {
            Status status = (list.size() < 25 || (str = this.nextKey) == null || str.length() == 0) ? Status.DONE : Status.MORE;
            if (status != null) {
                return status;
            }
        }
        return Status.DONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadFtpValue$lambda$1(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        FitnessLogUtils.i("LaunchSportVM", "uploadFtpValue Exception is " + it.getMessage());
        return Unit.INSTANCE;
    }

    public final void abnormalChangeSportStateToFinish() {
        this.mSportStateCaller.abnormalChangeSportStateToFinish();
    }

    public final void addGymSportStartListener(@NotNull GymSportStartListener start) {
        Intrinsics.checkNotNullParameter(start, "start");
        this.gymSportStart = start;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).addSportStateChangedListener(LaunchSportVM.class, this);
    }

    public final void fetchEnvironmental() {
        ScopeExtKt.scopeNetLife$default(this, null, new AnonymousClass1(null), 1, null);
    }

    @Nullable
    public final fs9 findEco(@NotNull fs9[] fs9VarArr, int i) {
        Intrinsics.checkNotNullParameter(fs9VarArr, "<this>");
        for (fs9 fs9Var : fs9VarArr) {
            if (fs9Var.c == i) {
                return fs9Var;
            }
        }
        return null;
    }

    @NotNull
    public final CourseApi getCourseApi() {
        CourseApi courseApi = this.courseApi;
        if (courseApi != null) {
            return courseApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("courseApi");
        return null;
    }

    @NotNull
    public final EnvironmentalRequest getEcoEnvironmentalRequest() {
        return this.ecoEnvironmentalRequest;
    }

    @NotNull
    public final MutableLiveData<EnvironmentalVO> getEnvironmentalValue() {
        return this.environmentalValue;
    }

    @NotNull
    public final MutableLiveData<CourseFirstPageData> getFirstEmitter() {
        return this.firstEmitter;
    }

    public final void getFtpHistoryList() {
        ScopeExtKt.scopeNetLife$default(this, null, new C31471(null), 1, null).m503catch(new Function2() { // from class: b5e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LaunchSportVM.getFtpHistoryList$lambda$10(this.f3818a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Integer> getFtpValue() {
        return this.ftpValue;
    }

    @Nullable
    public final EcoDeviceModel getMDeviceModel() {
        return (EcoDeviceModel) this.mDeviceModel.getValue();
    }

    @Nullable
    public final fs9[] getMEcoSettingList() {
        return this.mEcoSettingList;
    }

    @NotNull
    public final IEcoSportRemoteState getMSportStateCaller() {
        return this.mSportStateCaller;
    }

    @NotNull
    public final MutableLiveData<CourseMoreData> getMoreEmitter() {
        return this.moreEmitter;
    }

    public final int getSportState() {
        return this.mSportStateCaller.getSportState();
    }

    @NotNull
    public final MutableLiveData<Boolean> isDynamicModel() {
        return this.isDynamicModel;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        FitnessLogUtils.i("LaunchSportVM", LifecycleConstantKt.ON_DESTROY);
        this.gymSportStart = null;
        SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).removeSportStateChangedListener(LaunchSportVM.class);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean validSport, @Nullable byte[] ids) {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRested() {
        ISportStateChangedListener.DefaultImpls.onSportRested(this);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportShutdown() {
        ISportStateChangedListener.DefaultImpls.onSportShutdown(this);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int startTime, int timeZone, int sportType, int sportLaunchType) {
        GymSportStartListener gymSportStartListener;
        if (sportLaunchType == 1 && isLocalLaunchSport() && (gymSportStartListener = this.gymSportStart) != null) {
            gymSportStartListener.onStart();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void preSport() {
        ISportStateChangedListener.DefaultImpls.preSport(this);
    }

    public final void readEcoSettingConfig(@NotNull final Function2<? super Boolean, ? super Boolean, Unit> callback) {
        EcoDeviceModel mDeviceModel;
        Intrinsics.checkNotNullParameter(callback, "callback");
        EcoDeviceModel mDeviceModel2 = getMDeviceModel();
        if (mDeviceModel2 == null || !mDeviceModel2.getIsDeviceConnected() || (mDeviceModel = getMDeviceModel()) == null) {
            return;
        }
        EcoDeviceModelExtKt.getEcoGYMSettings(mDeviceModel, new bt7<fs9[]>() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM.readEcoSettingConfig.1
            @Override // defpackage.bt7
            public void onError(int errorCode) {
                com.xiaomi.fitness.net.extensions.ScopeExtKt.scope(Dispatchers.getMain(), new LaunchSportVM$readEcoSettingConfig$1$onError$1(callback, null));
            }

            @Override // defpackage.bt7
            public void onResult(fs9[] result) {
                com.xiaomi.fitness.net.extensions.ScopeExtKt.scope(Dispatchers.getMain(), new LaunchSportVM$readEcoSettingConfig$1$onResult$1(LaunchSportVM.this, result, callback, null));
            }
        });
    }

    public final void reqData(@NotNull String localSportType) {
        Intrinsics.checkNotNullParameter(localSportType, "localSportType");
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            if (this.firstRecentRet && this.firstVideoRet) {
                reqVideoMore(localSportType);
            }
            if (!this.firstRecentRet) {
                reqRecent(localSportType);
            }
            if (this.firstVideoRet) {
                return;
            }
            reqVideoFirst(localSportType);
        }
    }

    public final void setCourseApi(@NotNull CourseApi courseApi) {
        Intrinsics.checkNotNullParameter(courseApi, "<set-?>");
        this.courseApi = courseApi;
    }

    public final void setDynamicModel(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.isDynamicModel = mutableLiveData;
    }

    public final void setEcoSettingItem(final int key, final int value, @NotNull final Function2<? super Boolean, ? super Integer, Unit> callback) {
        EcoDeviceModel mDeviceModel;
        Intrinsics.checkNotNullParameter(callback, "callback");
        fs9 fs9Var = new fs9();
        fs9Var.c = key;
        fs9Var.d = value;
        Unit unit = Unit.INSTANCE;
        fs9[] fs9VarArr = {fs9Var};
        EcoDeviceModel mDeviceModel2 = getMDeviceModel();
        if (mDeviceModel2 == null || !mDeviceModel2.getIsDeviceConnected() || (mDeviceModel = getMDeviceModel()) == null) {
            return;
        }
        EcoDeviceModelExtKt.setEcoGYMSettings(mDeviceModel, fs9VarArr, new bt7<Boolean>() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM.setEcoSettingItem.1
            @Override // defpackage.bt7
            public void onError(int errorCode) {
                com.xiaomi.fitness.net.extensions.ScopeExtKt.scope(Dispatchers.getMain(), new LaunchSportVM$setEcoSettingItem$1$onError$1(key, value, errorCode, callback, null));
            }

            @Override // defpackage.bt7
            public void onResult(Boolean result) {
                com.xiaomi.fitness.net.extensions.ScopeExtKt.scope(Dispatchers.getMain(), new LaunchSportVM$setEcoSettingItem$1$onResult$1(key, value, this, callback, null));
            }
        });
    }

    public final void setEnvironmentalValue(@NotNull MutableLiveData<EnvironmentalVO> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.environmentalValue = mutableLiveData;
    }

    public final void setFtpResult(final int ftpResult, @NotNull final Function1<? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        setSettingItem(7, ftpResult, new Function1() { // from class: f5e
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LaunchSportVM.setFtpResult$lambda$8(ftpResult, this, callback, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void setFtpValue(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.ftpValue = mutableLiveData;
    }

    public final void setMEcoSettingList(@Nullable fs9[] fs9VarArr) {
        this.mEcoSettingList = fs9VarArr;
    }

    public final void setMSportStateCaller(@NotNull IEcoSportRemoteState iEcoSportRemoteState) {
        Intrinsics.checkNotNullParameter(iEcoSportRemoteState, "<set-?>");
        this.mSportStateCaller = iEcoSportRemoteState;
    }

    public final void syncDeviceDynamicModeData() {
        EcoDeviceModel mDeviceModel;
        EcoDeviceModel mDeviceModel2 = getMDeviceModel();
        if (mDeviceModel2 == null || !mDeviceModel2.getIsDeviceConnected() || (mDeviceModel = getMDeviceModel()) == null) {
            return;
        }
        EcoDeviceModelExtKt.getEcoGYMSettings(mDeviceModel, new bt7<fs9[]>() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM.syncDeviceDynamicModeData.1
            @Override // defpackage.bt7
            public void onError(int errorCode) {
                com.xiaomi.fitness.net.extensions.ScopeExtKt.scope(Dispatchers.getMain(), new LaunchSportVM$syncDeviceDynamicModeData$1$onError$1(null));
            }

            @Override // defpackage.bt7
            public void onResult(fs9[] result) {
                com.xiaomi.fitness.net.extensions.ScopeExtKt.scope(Dispatchers.getMain(), new LaunchSportVM$syncDeviceDynamicModeData$1$onResult$1(LaunchSportVM.this, result, null));
            }
        });
    }

    public final void uploadFtpValue(int ftpResult) {
        ScopeExtKt.scopeNetLife$default(this, null, new C31551(ftpResult, this, null), 1, null).m503catch(new Function2() { // from class: i5e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LaunchSportVM.uploadFtpValue$lambda$1((AndroidScope) obj, (Throwable) obj2);
            }
        });
    }
}
